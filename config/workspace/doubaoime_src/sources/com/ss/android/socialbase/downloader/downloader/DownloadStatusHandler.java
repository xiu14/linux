package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.ss.android.socialbase.downloader.constants.ByteInvalidRetryStatus;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IDownloadCompleteHandler;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadPauseReserveWifiException;
import com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException;
import com.ss.android.socialbase.downloader.impls.AbsDownloadEngine;
import com.ss.android.socialbase.downloader.impls.RetryScheduler;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadListenerUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class DownloadStatusHandler {
    private static final String TAG = "DownloadStatusHandler";
    private final IDownloadCache downloadCache;
    private DownloadInfo downloadInfo;
    private IDownloadMonitorDepend downloadMonitorDepend;
    private DownloadTask downloadTask;
    private final boolean fixAnrProcessHandleMsg;
    private final boolean fixSameTaskMonitorReport;
    private final Handler mainThreadHandler;
    private SparseArray<IDownloadListener> mainThreadListeners;
    private long minByteIntervalForSyncProgress;
    private int minTimeIntervalForSyncProgress;
    private SparseArray<IDownloadListener> notificationListeners;
    private long prepareDownloadTime;
    private SparseArray<IDownloadListener> subThreadListeners;
    private boolean forceRefreshProcess = false;
    private volatile long lastSyncProgressTime = 0;
    private final AtomicLong msgPostDataBuffer = new AtomicLong();
    private boolean hasSyncProgressBefore = false;

    public DownloadStatusHandler(DownloadTask downloadTask, Handler handler) {
        this.downloadTask = downloadTask;
        checkInit();
        this.mainThreadHandler = handler;
        this.downloadCache = DownloadComponentManager.getDownloadCache();
        this.fixAnrProcessHandleMsg = DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.FIX_ANR_PROGRESS_HANDLE_MSG) > 0;
        this.fixSameTaskMonitorReport = DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.FIX_SAME_TASK_MONITOR_REPORT) > 0;
    }

    private void checkInit() {
        DownloadTask downloadTask = this.downloadTask;
        if (downloadTask != null) {
            this.downloadInfo = downloadTask.getDownloadInfo();
            this.mainThreadListeners = this.downloadTask.getDownloadListeners(ListenerType.MAIN);
            this.notificationListeners = this.downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            this.subThreadListeners = this.downloadTask.getDownloadListeners(ListenerType.SUB);
            this.downloadMonitorDepend = this.downloadTask.getMonitorDepend();
        }
    }

    private void downloadCompleteProcess() throws BaseException {
        List<IDownloadCompleteHandler> downloadCompleteHandlers = this.downloadTask.getDownloadCompleteHandlers();
        if (downloadCompleteHandlers.isEmpty()) {
            return;
        }
        DownloadInfo downloadInfo = this.downloadInfo;
        onStatusChanged(11, null);
        this.downloadCache.updateDownloadInfo(downloadInfo);
        for (IDownloadCompleteHandler iDownloadCompleteHandler : downloadCompleteHandlers) {
            try {
                if (iDownloadCompleteHandler.needHandle(downloadInfo)) {
                    iDownloadCompleteHandler.handle(downloadInfo);
                    this.downloadCache.updateDownloadInfo(downloadInfo);
                }
            } catch (BaseException e2) {
                throw e2;
            } catch (Throwable th) {
                throw new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_COMPLETE_HANDLER, th);
            }
        }
    }

    private void handleError(BaseException baseException) {
        String str = TAG;
        Logger.taskError(str, this.downloadInfo.getId(), "handleError", "Exception:" + baseException);
        if (Logger.debug()) {
            int id = this.downloadInfo.getId();
            StringBuilder M = a.M("Exception Trace:");
            M.append(Log.getStackTraceString(new Throwable()));
            Logger.taskError(str, id, "handleError", M.toString());
        }
        if (baseException == null || baseException.getCause() == null || !(baseException.getCause() instanceof SQLiteFullException)) {
            try {
                try {
                    this.downloadCache.OnDownloadTaskError(this.downloadInfo.getId(), this.downloadInfo.getCurBytes());
                } catch (SQLiteException unused) {
                    this.downloadCache.removeDownloadTaskData(this.downloadInfo.getId());
                }
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
        } else {
            try {
                this.downloadCache.removeDownloadTaskData(this.downloadInfo.getId());
            } catch (SQLiteException e3) {
                e3.printStackTrace();
            }
        }
        BaseException reviseFailedException = reviseFailedException(baseException);
        this.downloadInfo.setFailedException(reviseFailedException);
        onStatusChanged(reviseFailedException instanceof DownloadPauseReserveWifiException ? -2 : -1, reviseFailedException);
        if (DownloadSetting.obtain(this.downloadInfo.getId()).optInt(DownloadSettingKeys.RETRY_SCHEDULE, 0) > 0) {
            RetryScheduler.getInstance().tryStartScheduleRetry(this.downloadInfo);
        }
    }

    private boolean handleProgress(long j, boolean z) {
        boolean z2 = false;
        if (this.downloadInfo.getCurBytes() == this.downloadInfo.getTotalBytes()) {
            try {
                this.downloadCache.OnDownloadTaskProgress(this.downloadInfo.getId(), this.downloadInfo.getCurBytes());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return false;
        }
        if (this.forceRefreshProcess) {
            this.forceRefreshProcess = false;
            this.downloadInfo.setStatus(4);
        }
        if (this.downloadInfo.isNeedPostProgress() && z) {
            z2 = true;
        }
        onStatusChanged(4, null, z2);
        return z;
    }

    private void handleRetry(BaseException baseException) {
        this.downloadCache.OnDownloadTaskRetry(this.downloadInfo.getId());
        onStatusChanged(5, baseException);
    }

    private boolean needSyncProgress(long j) {
        boolean z = true;
        if (!this.hasSyncProgressBefore) {
            this.hasSyncProgressBefore = true;
            return true;
        }
        long j2 = j - this.lastSyncProgressTime;
        if (this.msgPostDataBuffer.get() < this.minByteIntervalForSyncProgress && j2 < this.minTimeIntervalForSyncProgress) {
            z = false;
        }
        if (z) {
            this.lastSyncProgressTime = j;
            this.msgPostDataBuffer.set(0L);
        }
        return z;
    }

    private void notifyDownloadTaskStatus(AbsDownloadEngine absDownloadEngine, final int i, final BaseException baseException) {
        final SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> clone;
        final DownloadTask downloadTask = absDownloadEngine.getDownloadTask(this.downloadInfo.getId(), this.downloadTask.getHashCodeForSameTask());
        if (downloadTask == null) {
            Logger.taskError(TAG, this.downloadInfo.getId(), "notifyDownloadTaskStatus", "DownloadTask is null");
            return;
        }
        final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            Logger.taskError(TAG, this.downloadInfo.getId(), "notifyDownloadTaskStatus", "DownloadInfo is null");
            return;
        }
        SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
        SparseArray<IDownloadListener> sparseArray2 = null;
        if (downloadListeners != null) {
            synchronized (downloadListeners) {
                clone = downloadListeners.clone();
            }
            sparseArray = clone;
        } else {
            sparseArray = null;
        }
        SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
        if (downloadListeners2 != null) {
            synchronized (downloadListeners2) {
                sparseArray2 = downloadListeners2.clone();
            }
        }
        final SparseArray<IDownloadListener> sparseArray3 = sparseArray2;
        final boolean z = downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification();
        this.mainThreadHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadStatusHandler.2
            @Override // java.lang.Runnable
            public void run() {
                DownloadListenerUtils.notifyListener(i, sparseArray, true, downloadInfo, baseException, ListenerType.MAIN, downloadTask);
                DownloadListenerUtils.notifyListener(i, sparseArray3, z, downloadInfo, baseException, ListenerType.NOTIFICATION, downloadTask);
            }
        });
        absDownloadEngine.refreshDownloadTaskMap(this.downloadInfo.getId(), this.downloadTask.getHashCodeForSameTask(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSaveTempFileSuccess() {
        try {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "onSaveTempFileSuccess", "Success");
            }
            try {
                downloadCompleteProcess();
                DownloadInfo downloadInfo = this.downloadInfo;
                if (downloadInfo == null) {
                    onError(new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_INFO_NULL, "onSaveTempFileSuccess DownloadInfo is null"));
                    return;
                }
                downloadInfo.setFirstSuccess(false);
                this.downloadInfo.setSuccessByCache(false);
                if (this.downloadInfo.getDownloadFinishTimeStamp() <= 0) {
                    this.downloadInfo.setDownloadFinishTimeStamp(System.currentTimeMillis());
                }
                onStatusChanged(-3, null);
                this.downloadCache.OnDownloadTaskCompleted(this.downloadInfo.getId(), this.downloadInfo.getTotalBytes());
                this.downloadCache.removeSegments(this.downloadInfo.getId());
            } catch (BaseException e2) {
                onError(e2);
            }
        } catch (Throwable th) {
            onError(new BaseException(1008, DownloadUtils.getErrorMsgWithTagPrefix(th, "onCompleted")));
        }
    }

    private void onStatusChanged(int i, BaseException baseException) {
        onStatusChanged(i, baseException, true);
    }

    private BaseException reviseFailedException(BaseException baseException) {
        Context appContext;
        return (DownloadSetting.obtain(this.downloadInfo.getId()).optInt(DownloadSettingKeys.DOWNLOAD_FAILED_CHECK_NET, 1) != 1 || !DownloadUtils.isNetworkError(baseException) || (appContext = DownloadComponentManager.getAppContext()) == null || DownloadUtils.isNetworkConnected(appContext) || DownloadSetting.getGlobalSettings().optBoolean(DownloadSettingKeys.DISABLE_CHECK_NO_NETWORK)) ? baseException : new BaseException(DownloadErrorCode.ERROR_NETWORK_NOT_AVAILABLE, baseException.getErrorMessage());
    }

    public void handlePrepare() {
        this.downloadTask.getTimingInfo().beforeOnPrepareTime = System.currentTimeMillis();
        if (!this.downloadInfo.canSkipStatusHandler()) {
            this.downloadCache.OnDownloadTaskPrepare(this.downloadInfo.getId());
            onStatusChanged(1, null);
        }
        if (this.prepareDownloadTime > 0) {
            try {
                this.downloadInfo.increaseDownloadPrepareTime(System.currentTimeMillis() - this.prepareDownloadTime);
            } catch (Throwable unused) {
            }
        }
        this.downloadTask.getTimingInfo().afterOnPrepareTime = System.currentTimeMillis();
    }

    public void handleWaitingAsyncHandler() {
        this.downloadInfo.setStatus(8);
        this.downloadInfo.setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_WAITING);
        AbsDownloadEngine downloadEngine = DownloadComponentManager.getDownloadEngine();
        if (downloadEngine != null) {
            downloadEngine.refreshDownloadTaskMap(this.downloadInfo.getId(), this.downloadTask.getHashCodeForSameTask(), 8);
        }
    }

    public void onCancel() {
        onStatusChanged(-4, null);
    }

    public void onCompleteForFileExist() throws BaseException {
        if (this.downloadInfo == null) {
            throw new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_INFO_NULL, "onCompleteForFileExist DownloadInfo is null");
        }
        downloadCompleteProcess();
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.downloadInfo.getId(), "onCompleteForFileExist", "Success");
        }
        this.downloadInfo.setSuccessByCache(true);
        onStatusChanged(-3, null);
        this.downloadCache.OnDownloadTaskCompleted(this.downloadInfo.getId(), this.downloadInfo.getTotalBytes());
        this.downloadCache.updateDownloadInfo(this.downloadInfo);
        this.downloadCache.removeSegments(this.downloadInfo.getId());
    }

    public void onCompleted() {
        this.downloadInfo.setFirstDownload(false);
        if (!this.downloadInfo.isIgnoreDataVerify() && this.downloadInfo.getCurBytes() != this.downloadInfo.getTotalBytes()) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "onCompleted", "Error curBytes != totalBytes");
            }
            StringBuilder M = a.M("current bytes is not equals to total bytes, bytes changed with process : ");
            M.append(this.downloadInfo.getByteInvalidRetryStatus());
            onError(new DownloadRetryNeedlessException(DownloadErrorCode.ERROR_CUR_NOT_EQUALS_TOTAL, M.toString()));
            return;
        }
        if (this.downloadInfo.getCurBytes() <= 0) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "onCompleted", "Error curBytes <=0");
            }
            StringBuilder M2 = a.M("curBytes is 0, bytes changed with process : ");
            M2.append(this.downloadInfo.getByteInvalidRetryStatus());
            onError(new DownloadRetryNeedlessException(DownloadErrorCode.ERROR_CUR_BYTES_ZERO, M2.toString()));
            return;
        }
        if (!this.downloadInfo.isIgnoreDataVerify() && this.downloadInfo.getTotalBytes() <= 0) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "onCompleted", "Error totalBytes <=0");
            }
            StringBuilder M3 = a.M("TotalBytes is 0, bytes changed with process : ");
            M3.append(this.downloadInfo.getByteInvalidRetryStatus());
            onError(new DownloadRetryNeedlessException(DownloadErrorCode.ERROR_TOTAL_BYTES_ZERO, M3.toString()));
            return;
        }
        if (Logger.debug()) {
            String str = TAG;
            int id = this.downloadInfo.getId();
            StringBuilder M4 = a.M("Start save file as target name:");
            M4.append(this.downloadInfo.getName());
            Logger.taskDebug(str, id, "onCompleted", M4.toString());
        }
        IDownloadMonitorDepend iDownloadMonitorDepend = this.downloadMonitorDepend;
        DownloadTask downloadTask = this.downloadTask;
        if (downloadTask != null) {
            iDownloadMonitorDepend = downloadTask.getMonitorDepend();
        }
        DownloadHelper.saveFileAsTargetName(this.downloadInfo, iDownloadMonitorDepend, new ITempFileSaveCompleteCallback() { // from class: com.ss.android.socialbase.downloader.downloader.DownloadStatusHandler.1
            @Override // com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback
            public void onFailed(BaseException baseException) {
                String str2 = DownloadStatusHandler.TAG;
                int id2 = DownloadStatusHandler.this.downloadInfo.getId();
                StringBuilder M5 = a.M("Exception: ");
                M5.append(baseException != null ? baseException.getErrorMessage() : "");
                Logger.taskError(str2, id2, "saveFileAsTargetName_onFailed", M5.toString());
                DownloadStatusHandler.this.onError(baseException);
            }

            @Override // com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback
            public void onSuccess() {
                DownloadStatusHandler.this.onSaveTempFileSuccess();
            }
        });
    }

    public void onError(BaseException baseException) {
        this.downloadInfo.setFirstDownload(false);
        handleError(baseException);
    }

    public void onFirstConnectionSuccessed(long j, String str, String str2) {
        this.downloadInfo.setTotalBytes(j);
        this.downloadInfo.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.downloadInfo.getName())) {
            this.downloadInfo.setName(str2);
        }
        try {
            this.downloadCache.OnDownloadTaskConnected(this.downloadInfo.getId(), j, str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        onStatusChanged(3, null);
        this.minByteIntervalForSyncProgress = this.downloadInfo.getMinByteIntervalForPostToMainThread(j);
        this.minTimeIntervalForSyncProgress = this.downloadInfo.getMinProgressTimeMsInterval();
        this.forceRefreshProcess = true;
        RetryScheduler.getInstance().scheduleRetryWhenHasTaskConnected();
    }

    public void onIntercept() {
        this.downloadInfo.setStatus(-7);
        try {
            this.downloadCache.OnDownloadTaskIntercept(this.downloadInfo.getId());
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
        onStatusChanged(-7, null);
    }

    public void onPause() {
        this.downloadInfo.setStatus(-2);
        try {
            this.downloadCache.OnDownloadTaskPause(this.downloadInfo.getId(), this.downloadInfo.getCurBytes());
        } catch (SQLiteException e2) {
            e2.printStackTrace();
        }
        onStatusChanged(-2, null);
    }

    public void onPrepare() {
        this.prepareDownloadTime = System.currentTimeMillis();
        if (this.downloadInfo.canSkipStatusHandler()) {
            return;
        }
        this.downloadInfo.setStatus(1);
    }

    public boolean onProgress(long j) {
        this.msgPostDataBuffer.addAndGet(j);
        this.downloadInfo.increaseCurBytes(j);
        long uptimeMillis = SystemClock.uptimeMillis();
        return handleProgress(uptimeMillis, needSyncProgress(uptimeMillis));
    }

    public void onRetry(BaseException baseException) {
        this.downloadInfo.setFirstDownload(false);
        this.msgPostDataBuffer.set(0L);
        handleRetry(baseException);
    }

    public void onSingleChunkRetry(BaseException baseException, boolean z) {
        this.downloadInfo.setFirstDownload(false);
        this.msgPostDataBuffer.set(0L);
        this.downloadCache.OnDownloadTaskRetry(this.downloadInfo.getId());
        onStatusChanged(z ? 10 : 9, baseException, true);
    }

    public void onStart() {
        this.downloadTask.getTimingInfo().beforeOnStartTime = System.currentTimeMillis();
        if (this.downloadInfo.canSkipStatusHandler()) {
            this.downloadInfo.changeSkipStatus();
        } else {
            if (this.downloadInfo.getDownloadStartTimeStamp() <= 0) {
                this.downloadInfo.setDownloadStartTimeStamp(System.currentTimeMillis());
            }
            this.downloadCache.onDownloadTaskStart(this.downloadInfo.getId());
            if (this.downloadInfo.isFirstDownload()) {
                onStatusChanged(6, null);
            }
            onStatusChanged(2, null);
        }
        this.downloadTask.getTimingInfo().afterOnStartTime = System.currentTimeMillis();
    }

    private void onStatusChanged(int i, BaseException baseException, boolean z) {
        SparseArray<IDownloadListener> sparseArray;
        SparseArray<IDownloadListener> sparseArray2;
        int status = this.downloadInfo.getStatus();
        if (status == -3 && i == 4) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, this.downloadInfo.getId(), "onStatusChanged", a.l("Status = ", status, ", monitorStatus = ", i));
                return;
            }
            return;
        }
        checkInit();
        if (i != 4) {
            if (DownloadStatus.isRealTimeUploadStatus(i)) {
                this.downloadInfo.updateRealDownloadTime(false);
                if (DownloadStatus.isTimeUploadStatus(i)) {
                    this.downloadInfo.updateDownloadTime();
                }
            }
            if (!this.downloadInfo.isAddListenerToSameTask() || this.fixSameTaskMonitorReport) {
                DownloadMonitorHelper.monitorSend(this.downloadTask, baseException, i);
            }
        }
        if (i == 6) {
            this.downloadInfo.setStatus(2);
        } else if (i == -6) {
            this.downloadInfo.setStatus(-3);
        } else {
            this.downloadInfo.setStatus(i);
        }
        if (status == -3 || status == -1) {
            if (this.downloadInfo.getAsyncHandleStatus() == AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADING) {
                this.downloadInfo.setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_DOWNLOADED);
            }
            if (this.downloadInfo.getByteInvalidRetryStatus() == ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                this.downloadInfo.setByteInvalidRetryStatus(ByteInvalidRetryStatus.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
            }
        }
        DownloadListenerUtils.notifyListener(i, this.subThreadListeners, true, this.downloadInfo, baseException, ListenerType.SUB, this.downloadTask);
        if (i == -4) {
            return;
        }
        if (!z || this.mainThreadHandler == null || (((sparseArray = this.mainThreadListeners) == null || sparseArray.size() <= 0) && ((sparseArray2 = this.notificationListeners) == null || sparseArray2.size() <= 0 || !(this.downloadInfo.canShowNotification() || this.downloadInfo.isAutoInstallWithoutNotification())))) {
            AbsDownloadEngine downloadEngine = DownloadComponentManager.getDownloadEngine();
            if (downloadEngine != null) {
                downloadEngine.refreshDownloadTaskMap(this.downloadInfo.getId(), this.downloadTask.getHashCodeForSameTask(), i);
                return;
            }
            return;
        }
        if (this.fixAnrProcessHandleMsg) {
            notifyDownloadTaskStatus(DownloadComponentManager.getDownloadEngine(), i, baseException);
        } else {
            this.mainThreadHandler.obtainMessage(i, this.downloadInfo.getId(), this.downloadTask.getHashCodeForSameTask(), baseException).sendToTarget();
        }
    }

    public void onCompleteForFileExist(String str, String str2) throws BaseException {
        if (Logger.debug()) {
            String str3 = TAG;
            int id = this.downloadInfo.getId();
            StringBuilder U = a.U("ExistTargetFileName:", str2, " but curName is ");
            U.append(this.downloadInfo.getName());
            Logger.taskDebug(str3, id, "onCompleteForFileExist", U.toString());
        }
        DownloadHelper.copyFileFromExistFileWithSameName(this.downloadInfo, str, str2);
        downloadCompleteProcess();
        this.downloadInfo.setSuccessByCache(true);
        onStatusChanged(-3, null);
        this.downloadCache.updateDownloadInfo(this.downloadInfo);
    }
}
