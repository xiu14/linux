package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.AsyncHandleStatus;
import com.ss.android.socialbase.downloader.constants.DbJsonConstants;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.core.DownloadRunnable;
import com.ss.android.socialbase.downloader.depend.IDownloadFileUriProvider;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadNotificationEventListener;
import com.ss.android.socialbase.downloader.depend.INotificationClickCallback;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadStatusHandler;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.downloader.IReserveWifiStatusListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.file.DownloadFile;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.thread.WeakDownloadHandler;
import com.ss.android.socialbase.downloader.utils.DownloadListenerUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import com.ss.android.socialbase.downloader.utils.LruCache;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public abstract class AbsDownloadEngine implements WeakDownloadHandler.IHandler {
    private static final String TAG = "AbsDownloadEngine";
    private boolean fixAnrIsolateEngineAndCache;
    private final SparseArray<DownloadTask> downloadTaskMap = new SparseArray<>();
    private final SparseArray<DownloadTask> successDownloadTaskMap = new SparseArray<>();
    private final SparseArray<DownloadTask> failedDownloadTaskMap = new SparseArray<>();
    private final SparseArray<DownloadTask> waitingAsyncDownloadTaskMap = new SparseArray<>();
    private final SparseArray<SparseArray<DownloadTask>> downloadTaskWithListenerMap = new SparseArray<>();
    private final LruCache<Integer, DownloadTask> pengingTaskCache = new LruCache<>();
    private final LinkedBlockingDeque<DownloadTask> orderedTaskQueue = new LinkedBlockingDeque<>();
    protected final WeakDownloadHandler mainHandler = new WeakDownloadHandler(Looper.getMainLooper(), this);
    private final IDownloadCache downloadCache = DownloadComponentManager.getDownloadCache();

    protected AbsDownloadEngine() {
        this.fixAnrIsolateEngineAndCache = DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.FIX_ANR_ISOLATE_ENGINE_AND_CACHE) > 0;
    }

    private synchronized void addDownloadListenerImpl(int i, int i2, final IDownloadListener iDownloadListener, final ListenerType listenerType, boolean z, boolean z2) {
        final DownloadTask downloadTask = getDownloadTask(i);
        if (downloadTask != null) {
            downloadTask.addDownloadListener(i2, iDownloadListener, listenerType, z);
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (z2 && downloadInfo != null && !isDownloading(i) && (listenerType == ListenerType.MAIN || listenerType == ListenerType.NOTIFICATION)) {
                boolean z3 = true;
                if (listenerType == ListenerType.NOTIFICATION && !downloadInfo.canShowNotification()) {
                    z3 = false;
                }
                if (z3) {
                    this.mainHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.8
                        @Override // java.lang.Runnable
                        public void run() {
                            if (iDownloadListener != null) {
                                if (downloadInfo.getStatus() == -3) {
                                    iDownloadListener.onSuccessed(downloadInfo);
                                    downloadTask.removeCallback(listenerType, iDownloadListener);
                                } else if (downloadInfo.getStatus() == -1) {
                                    iDownloadListener.onFailed(downloadInfo, new BaseException(1000, "try add listener for failed task"));
                                    downloadTask.removeCallback(listenerType, iDownloadListener);
                                }
                            }
                        }
                    });
                }
            }
        } else {
            DownloadInfo downloadInfo2 = this.downloadCache.getDownloadInfo(i);
            if (downloadInfo2 != null && downloadInfo2.getStatus() != -3) {
                DownloadTask downloadTask2 = this.pengingTaskCache.get(Integer.valueOf(i));
                if (downloadTask2 == null) {
                    downloadTask2 = new DownloadTask(downloadInfo2);
                    this.pengingTaskCache.put(Integer.valueOf(i), downloadTask2);
                }
                downloadTask2.addDownloadListener(i2, iDownloadListener, listenerType, z);
            }
        }
    }

    private synchronized boolean cancelImpl(int i, boolean z) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "cancel", "Trace:" + Log.getStackTraceString(new Throwable()));
        }
        final DownloadTask downloadTask = getDownloadTask(i);
        if (downloadTask != null) {
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            this.mainHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.2
                @Override // java.lang.Runnable
                public void run() {
                    SparseArray sparseArray;
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i2));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                    downloadTask.removeCallback(ListenerType.MAIN, iDownloadListener);
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo2 = downloadInfo;
                    if (downloadInfo2 == null || !downloadInfo2.canShowNotification() || (sparseArray = downloadListeners2) == null) {
                        return;
                    }
                    synchronized (sparseArray) {
                        for (int i3 = 0; i3 < downloadListeners2.size(); i3++) {
                            IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i3));
                            if (iDownloadListener2 != null) {
                                iDownloadListener2.onCanceled(downloadInfo);
                                downloadTask.removeCallback(ListenerType.NOTIFICATION, iDownloadListener2);
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo downloadInfo2 = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo2 != null) {
            downloadInfo2.setStatus(-4);
        }
        clearDownloadData(i, z, false);
        return true;
    }

    private synchronized void clearDownloadDataInSubThreadImpl(int i, boolean z, boolean z2) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "clearDownloadDataInSubThread", "DeleteFile:" + z + " deleteFileIgnoreSecurity:" + z2);
        }
        try {
            DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    if (z2) {
                        new DownloadFile(downloadInfo.getSavePath(), downloadInfo.getName(), false, false).delete();
                    }
                    DownloadUtils.deleteAllDownloadFiles(downloadInfo, z);
                } else {
                    DownloadUtils.deleteFile(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.downloadCache.removeDownloadTaskData(i);
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            refreshDownloadTaskMap(i, 0, -4);
            if (this.failedDownloadTaskMap.get(i) != null) {
                this.failedDownloadTaskMap.remove(i);
            }
            if (this.successDownloadTaskMap.get(i) != null) {
                this.successDownloadTaskMap.remove(i);
            }
            this.pengingTaskCache.remove(Integer.valueOf(i));
            DownloadSetting.removeTaskDownloadSetting(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void enqueue(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        try {
            if (this.orderedTaskQueue.isEmpty()) {
                tryDownloadImpl(downloadTask);
                this.orderedTaskQueue.put(downloadTask);
                return;
            }
            if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_TAIL) {
                DownloadTask first = this.orderedTaskQueue.getFirst();
                if (first.getDownloadId() == downloadTask.getDownloadId() && isDownloading(downloadTask.getDownloadId())) {
                    return;
                }
                pause(first.getDownloadId());
                tryDownloadImpl(downloadTask);
                if (first.getDownloadId() != downloadTask.getDownloadId()) {
                    this.orderedTaskQueue.putFirst(downloadTask);
                    return;
                }
                return;
            }
            if (this.orderedTaskQueue.getFirst().getDownloadId() == downloadTask.getDownloadId() && isDownloading(downloadTask.getDownloadId())) {
                return;
            }
            Iterator<DownloadTask> it2 = this.orderedTaskQueue.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DownloadTask next = it2.next();
                if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                    it2.remove();
                    break;
                }
            }
            this.orderedTaskQueue.put(downloadTask);
        } catch (InterruptedException unused) {
        }
    }

    private synchronized DownloadInfo getDownloadInfoImpl(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask;
        downloadInfo = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo == null && (downloadTask = this.downloadTaskMap.get(i)) != null) {
            downloadInfo = downloadTask.getDownloadInfo();
        }
        return downloadInfo;
    }

    private synchronized List<DownloadInfo> getDownloadInfoListImpl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = this.downloadCache.getDownloadInfoList(str);
        if (downloadInfoList != null && !downloadInfoList.isEmpty()) {
            return downloadInfoList;
        }
        ArrayList arrayList = new ArrayList();
        int size = this.downloadTaskMap.size();
        for (int i = 0; i < size; i++) {
            DownloadTask valueAt = this.downloadTaskMap.valueAt(i);
            if (valueAt != null && valueAt.getDownloadInfo() != null && str.equals(valueAt.getDownloadInfo().getUrl())) {
                arrayList.add(valueAt.getDownloadInfo());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadTask getDownloadTask(int i) {
        DownloadTask downloadTask;
        if (!this.fixAnrIsolateEngineAndCache) {
            return getDownloadTaskImpl(i);
        }
        synchronized (this) {
            downloadTask = this.downloadTaskMap.get(i);
            if (downloadTask == null && (downloadTask = this.failedDownloadTaskMap.get(i)) == null && (downloadTask = this.successDownloadTaskMap.get(i)) == null) {
                downloadTask = this.waitingAsyncDownloadTaskMap.get(i);
            }
        }
        return downloadTask;
    }

    private DownloadTask getDownloadTaskImpl(int i) {
        DownloadTask downloadTask = this.downloadTaskMap.get(i);
        if (downloadTask != null) {
            return downloadTask;
        }
        DownloadTask downloadTask2 = this.failedDownloadTaskMap.get(i);
        if (downloadTask2 != null) {
            return downloadTask2;
        }
        DownloadTask downloadTask3 = this.successDownloadTaskMap.get(i);
        return downloadTask3 == null ? this.waitingAsyncDownloadTaskMap.get(i) : downloadTask3;
    }

    private boolean isPauseReserveOnWifi(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.statusInPause()) {
            return downloadInfo.isPauseReserveOnWifi();
        }
        return false;
    }

    private void notifyDownloadTaskStatus(int i, BaseException baseException, DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo == null) {
                Logger.globalError(TAG, "notifyDownloadTaskStatus", "DownloadInfo is null\"");
                return;
            }
            ListenerType listenerType = ListenerType.MAIN;
            SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(listenerType);
            ListenerType listenerType2 = ListenerType.NOTIFICATION;
            SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(listenerType2);
            boolean z = downloadTask.canShowNotification() || downloadInfo.isAutoInstallWithoutNotification();
            DownloadListenerUtils.notifyListener(i, downloadListeners, true, downloadInfo, baseException, listenerType, downloadTask);
            DownloadListenerUtils.notifyListener(i, downloadListeners2, z, downloadInfo, baseException, listenerType2, downloadTask);
        }
    }

    private synchronized boolean pauseImpl(int i) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "pause", "Trace:" + Log.getStackTraceString(new Throwable()));
        }
        DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return false;
        }
        synchronized (this.downloadTaskMap) {
            doPause(i);
        }
        if (downloadInfo == null) {
            DownloadTask downloadTask = this.downloadTaskMap.get(i);
            if (downloadTask != null) {
                new DownloadStatusHandler(downloadTask, this.mainHandler).onPause();
                return true;
            }
        } else if (downloadInfo.getStatus() == 1) {
            DownloadTask downloadTask2 = this.downloadTaskMap.get(i);
            if (downloadTask2 != null) {
                new DownloadStatusHandler(downloadTask2, this.mainHandler).onPause();
                return true;
            }
        } else if (DownloadStatus.isDownloading(downloadInfo.getStatus())) {
            downloadInfo.setStatus(-2);
            return true;
        }
        return false;
    }

    private void removeTask(int i, int i2) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "removeTask", "Listener hashCode: " + i2);
        }
        if (i2 == 0) {
            this.downloadTaskMap.remove(i);
            this.downloadTaskWithListenerMap.remove(i);
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.downloadTaskWithListenerMap.get(i);
        if (sparseArray == null) {
            this.downloadTaskMap.remove(i);
            return;
        }
        sparseArray.remove(i2);
        if (Logger.debug()) {
            StringBuilder M = a.M("After downloadTaskWithListenerMap removeTask taskArray.size: ");
            M.append(sparseArray.size());
            Logger.taskDebug(TAG, i, "removeTask", M.toString());
        }
        if (sparseArray.size() == 0) {
            this.downloadTaskMap.remove(i);
            this.downloadTaskWithListenerMap.remove(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetDownloadDataInSubThread(int i, boolean z) {
        if (!this.fixAnrIsolateEngineAndCache) {
            resetDownloadDataInSubThreadImpl(i, z);
            return;
        }
        try {
            DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
            if (downloadInfo != null) {
                DownloadUtils.deleteAllDownloadFiles(downloadInfo, z);
                downloadInfo.erase();
            }
            try {
                this.downloadCache.updateDownloadInfo(downloadInfo);
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            synchronized (this) {
                if (this.failedDownloadTaskMap.get(i) != null) {
                    this.failedDownloadTaskMap.remove(i);
                }
                if (this.successDownloadTaskMap.get(i) != null) {
                    this.successDownloadTaskMap.remove(i);
                }
                this.pengingTaskCache.remove(Integer.valueOf(i));
                DownloadSetting.removeTaskDownloadSetting(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void resetDownloadDataInSubThreadImpl(int i, boolean z) {
        try {
            DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
            if (downloadInfo != null) {
                DownloadUtils.deleteAllDownloadFiles(downloadInfo, z);
                downloadInfo.erase();
            }
            try {
                this.downloadCache.updateDownloadInfo(downloadInfo);
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            if (this.failedDownloadTaskMap.get(i) != null) {
                this.failedDownloadTaskMap.remove(i);
            }
            if (this.successDownloadTaskMap.get(i) != null) {
                this.successDownloadTaskMap.remove(i);
            }
            this.pengingTaskCache.remove(Integer.valueOf(i));
            DownloadSetting.removeTaskDownloadSetting(i);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void tryCacheSameTaskWithListenerHashCode(DownloadTask downloadTask) {
        int hashCodeForSameTask = downloadTask.getHashCodeForSameTask();
        if (hashCodeForSameTask == 0 && downloadTask.isAutoSetHashCodeForSameTask()) {
            hashCodeForSameTask = downloadTask.autoCalAndGetHashCodeForSameTask();
        }
        if (hashCodeForSameTask == 0) {
            return;
        }
        SparseArray<DownloadTask> sparseArray = this.downloadTaskWithListenerMap.get(downloadTask.getDownloadId());
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.downloadTaskWithListenerMap.put(downloadTask.getDownloadId(), sparseArray);
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, downloadTask.getDownloadId(), "tryCacheSameTaskWithListenerHashCode", "Listener hashCode:" + hashCodeForSameTask);
        }
        sparseArray.put(hashCodeForSameTask, downloadTask);
    }

    private void tryDownloadImpl(DownloadTask downloadTask) {
        DownloadInfo downloadInfo;
        int i;
        DownloadInfo downloadInfo2;
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return;
        }
        if (downloadInfo.isEntityInvalid()) {
            Logger.taskError(TAG, downloadInfo.getId(), "tryDownload", "entity invalid");
            IDownloadMonitorDepend monitorDepend = downloadTask.getMonitorDepend();
            StringBuilder M = a.M("downloadInfo is Invalid, url is ");
            M.append(downloadInfo.getUrl());
            M.append(" name is ");
            M.append(downloadInfo.getName());
            M.append(" savePath is ");
            M.append(downloadInfo.getSavePath());
            DownloadMonitorHelper.monitorSendWithTaskMonitor(monitorDepend, downloadInfo, new BaseException(1003, M.toString()), downloadInfo.getStatus());
            return;
        }
        downloadTask.getTimingInfo().tryDownloadTime = System.currentTimeMillis();
        DownloadComponentManager.updateCurrentDownloadThreadInfo(downloadTask, true);
        boolean z = false;
        if (DownloadSetting.obtain(downloadInfo.getId()).optInt(DownloadSettingKeys.NO_NET_OPT, 0) == 1 && !DownloadUtils.isNetworkConnected(DownloadComponentManager.getAppContext()) && !downloadInfo.isFirstDownload() && !DownloadSetting.getGlobalSettings().optBoolean(DownloadSettingKeys.DISABLE_CHECK_NO_NETWORK)) {
            new DownloadStatusHandler(downloadTask, this.mainHandler).onError(new BaseException(DownloadErrorCode.ERROR_NETWORK_NOT_AVAILABLE, "network_not_available"));
            return;
        }
        int id = downloadInfo.getId();
        if (Logger.debug()) {
            StringBuilder M2 = a.M("Url: ");
            M2.append(downloadInfo.getUrl());
            M2.append(" savePath: ");
            M2.append(downloadInfo.getSavePath());
            M2.append(" saveName: ");
            M2.append(downloadInfo.getName());
            Logger.taskDebug(TAG, id, "tryDownload", M2.toString());
        }
        if (this.failedDownloadTaskMap.get(id) != null) {
            this.failedDownloadTaskMap.remove(id);
        }
        if (this.successDownloadTaskMap.get(id) != null) {
            this.successDownloadTaskMap.remove(id);
        }
        if (this.waitingAsyncDownloadTaskMap.get(id) != null) {
            this.waitingAsyncDownloadTaskMap.remove(id);
        }
        if (isDownloading(id) && !downloadInfo.canReStartAsyncTask()) {
            if (Logger.debug()) {
                Logger.taskDebug(TAG, id, "tryDownload", "Another task with same id is downloading when tryDownload");
            }
            downloadTask.addListenerToDownloadingSameTask();
            DownloadMonitorHelper.monitorSendWithTaskMonitor(downloadTask.getMonitorDepend(), downloadInfo, new BaseException(1003, "downloadInfo is isDownloading and addListenerToSameTask is false"), downloadInfo.getStatus());
            return;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, id, "tryDownload", "No downloading task");
        }
        if (downloadInfo.canReStartAsyncTask()) {
            downloadInfo.setAsyncHandleStatus(AsyncHandleStatus.ASYNC_HANDLE_RESTART);
        }
        DownloadTask remove = this.pengingTaskCache.remove(Integer.valueOf(id));
        if (remove != null) {
            downloadTask.copyListenerFromPendingTask(remove);
        }
        if (DownloadConstants.MIME_PLG.equals(downloadInfo.getMimeType())) {
            downloadTask.getDownloadInfo().safePutToDBJsonData(DbJsonConstants.DBJSON_KEY_EXECUTOR, 3);
        }
        DownloadTask downloadTask2 = this.downloadTaskMap.get(id);
        if (downloadTask2 == null || (downloadInfo2 = downloadTask2.getDownloadInfo()) == null) {
            i = 0;
        } else {
            i = downloadInfo2.getStatus();
            z = DownloadStatus.isDownloading(i);
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, id, "tryDownload", "Can add listener " + z + " , oldTaskStatus is :" + i);
        }
        if (z) {
            downloadTask.addListenerToDownloadingSameTask();
            return;
        }
        tryCacheSameTaskWithListenerHashCode(downloadTask);
        this.downloadTaskMap.put(id, downloadTask);
        doDownload(id, downloadTask);
    }

    private void tryDownloadNextTaskInQueue(int i) {
        DownloadTask first;
        if (this.orderedTaskQueue.isEmpty()) {
            return;
        }
        DownloadTask first2 = this.orderedTaskQueue.getFirst();
        if (first2 != null && first2.getDownloadId() == i) {
            this.orderedTaskQueue.poll();
        }
        if (this.orderedTaskQueue.isEmpty() || (first = this.orderedTaskQueue.getFirst()) == null) {
            return;
        }
        tryDownloadImpl(first);
    }

    public void addDownloadListener(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        addDownloadListener(i, i2, iDownloadListener, listenerType, z, true);
    }

    public boolean cancel(int i, boolean z) {
        if (!this.fixAnrIsolateEngineAndCache) {
            return cancelImpl(i, z);
        }
        if (Logger.debug()) {
            StringBuilder M = a.M("Trace:");
            M.append(Log.getStackTraceString(new Throwable()));
            Logger.taskDebug(TAG, i, "cancel", M.toString());
        }
        final DownloadTask downloadTask = getDownloadTask(i);
        if (downloadTask != null) {
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setStatus(-4);
            }
            final SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(ListenerType.MAIN);
            final SparseArray<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(ListenerType.NOTIFICATION);
            this.mainHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.1
                @Override // java.lang.Runnable
                public void run() {
                    SparseArray sparseArray;
                    SparseArray sparseArray2 = downloadListeners;
                    if (sparseArray2 != null) {
                        synchronized (sparseArray2) {
                            for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                                IDownloadListener iDownloadListener = (IDownloadListener) downloadListeners.get(downloadListeners.keyAt(i2));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                    downloadTask.removeCallback(ListenerType.MAIN, iDownloadListener);
                                }
                            }
                        }
                    }
                    DownloadInfo downloadInfo2 = downloadInfo;
                    if (downloadInfo2 == null || !downloadInfo2.canShowNotification() || (sparseArray = downloadListeners2) == null) {
                        return;
                    }
                    synchronized (sparseArray) {
                        for (int i3 = 0; i3 < downloadListeners2.size(); i3++) {
                            IDownloadListener iDownloadListener2 = (IDownloadListener) downloadListeners2.get(downloadListeners2.keyAt(i3));
                            if (iDownloadListener2 != null) {
                                iDownloadListener2.onCanceled(downloadInfo);
                                downloadTask.removeCallback(ListenerType.NOTIFICATION, iDownloadListener2);
                            }
                        }
                    }
                }
            });
        }
        DownloadInfo downloadInfo2 = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo2 != null) {
            downloadInfo2.setStatus(-4);
        }
        clearDownloadData(i, z, false);
        return true;
    }

    public void clearDownloadData(final int i, final boolean z, final boolean z2) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "clearDownloadData", "DeleteFile:" + z + " deleteFileIgnoreSecurity:" + z2 + "Trace:" + Log.getStackTraceString(new Throwable()));
        }
        this.mainHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.3
            @Override // java.lang.Runnable
            public void run() {
                DownloadNotificationManager.getInstance().cancelNotification(i);
            }
        });
        DownloadComponentManager.submitCPUTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.4
            @Override // java.lang.Runnable
            public void run() {
                DownloadTask downloadTask;
                if (AbsDownloadEngine.this.doCancel(i) == null && (downloadTask = AbsDownloadEngine.this.getDownloadTask(i)) != null) {
                    DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                    SparseArray<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(ListenerType.SUB);
                    if (downloadListeners != null) {
                        synchronized (downloadListeners) {
                            for (int i2 = 0; i2 < downloadListeners.size(); i2++) {
                                IDownloadListener iDownloadListener = downloadListeners.get(downloadListeners.keyAt(i2));
                                if (iDownloadListener != null) {
                                    iDownloadListener.onCanceled(downloadInfo);
                                    downloadTask.removeCallback(ListenerType.SUB, iDownloadListener);
                                }
                            }
                        }
                    }
                }
                AbsDownloadEngine.this.clearDownloadDataInSubThread(i, z, z2);
            }
        }, false);
    }

    public void clearDownloadDataInSubThread(int i, boolean z, boolean z2) {
        if (!this.fixAnrIsolateEngineAndCache) {
            clearDownloadDataInSubThreadImpl(i, z, z2);
            return;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "clearDownloadDataInSubThread", "DeleteFile:" + z + " deleteFileIgnoreSecurity:" + z2);
        }
        try {
            DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
            if (downloadInfo != null) {
                if (z) {
                    if (z2) {
                        new DownloadFile(downloadInfo.getSavePath(), downloadInfo.getName(), false, false).delete();
                    }
                    DownloadUtils.deleteAllDownloadFiles(downloadInfo, z);
                } else {
                    DownloadUtils.deleteFile(downloadInfo.getTempPath(), downloadInfo.getTempName());
                }
                downloadInfo.erase();
            }
            try {
                this.downloadCache.removeDownloadTaskData(i);
            } catch (SQLiteException e2) {
                e2.printStackTrace();
            }
            synchronized (this) {
                refreshDownloadTaskMap(i, 0, -4);
                if (this.failedDownloadTaskMap.get(i) != null) {
                    this.failedDownloadTaskMap.remove(i);
                }
                if (this.successDownloadTaskMap.get(i) != null) {
                    this.successDownloadTaskMap.remove(i);
                }
                this.pengingTaskCache.remove(Integer.valueOf(i));
                DownloadSetting.removeTaskDownloadSetting(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    protected abstract DownloadRunnable doCancel(int i);

    protected abstract void doDownload(int i, DownloadTask downloadTask);

    protected abstract void doPause(int i);

    public abstract void doSetThrottleNetSpeed(int i, long j, int i2);

    protected abstract List<Integer> getAllAliveDownloadIds();

    public synchronized IDownloadFileUriProvider getDownloadFileUriProvider(int i) {
        DownloadTask downloadTask = this.downloadTaskMap.get(i);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.successDownloadTaskMap.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.failedDownloadTaskMap.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.waitingAsyncDownloadTaskMap.get(i);
        if (downloadTask4 == null) {
            return null;
        }
        return downloadTask4.getFileUriProvider();
    }

    public DownloadInfo getDownloadInfo(int i) {
        if (!this.fixAnrIsolateEngineAndCache) {
            return getDownloadInfoImpl(i);
        }
        DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo == null) {
            synchronized (this) {
                DownloadTask downloadTask = this.downloadTaskMap.get(i);
                if (downloadTask != null) {
                    downloadInfo = downloadTask.getDownloadInfo();
                }
            }
        }
        return downloadInfo;
    }

    public List<DownloadInfo> getDownloadInfoList(String str) {
        ArrayList arrayList;
        if (!this.fixAnrIsolateEngineAndCache) {
            return getDownloadInfoListImpl(str);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<DownloadInfo> downloadInfoList = this.downloadCache.getDownloadInfoList(str);
        if (downloadInfoList != null && !downloadInfoList.isEmpty()) {
            return downloadInfoList;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            int size = this.downloadTaskMap.size();
            for (int i = 0; i < size; i++) {
                DownloadTask valueAt = this.downloadTaskMap.valueAt(i);
                if (valueAt != null && valueAt.getDownloadInfo() != null && str.equals(valueAt.getDownloadInfo().getUrl())) {
                    arrayList.add(valueAt.getDownloadInfo());
                }
            }
        }
        return arrayList;
    }

    public synchronized IDownloadNotificationEventListener getDownloadNotificationEventListener(int i) {
        DownloadTask downloadTask = this.downloadTaskMap.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.successDownloadTaskMap.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.failedDownloadTaskMap.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.waitingAsyncDownloadTaskMap.get(i);
        if (downloadTask4 == null) {
            return null;
        }
        return downloadTask4.getNotificationEventListener();
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<Integer> it2 = getAllAliveDownloadIds().iterator();
        ArrayList arrayList = new ArrayList();
        while (it2.hasNext()) {
            DownloadInfo downloadInfo = getDownloadInfo(it2.next().intValue());
            if (downloadInfo != null && str.equals(downloadInfo.getMimeType())) {
                arrayList.add(downloadInfo);
            }
        }
        return arrayList;
    }

    public synchronized INotificationClickCallback getNotificationClickCallback(int i) {
        DownloadTask downloadTask = this.downloadTaskMap.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.successDownloadTaskMap.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.failedDownloadTaskMap.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.waitingAsyncDownloadTaskMap.get(i);
        if (downloadTask4 == null) {
            return null;
        }
        return downloadTask4.getNotificationClickCallback();
    }

    @Override // com.ss.android.socialbase.downloader.thread.WeakDownloadHandler.IHandler
    public void handleMsg(Message message) {
        int i = message.arg1;
        int i2 = message.arg2;
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "handleMsg", "Listener hashCode: " + i2);
        }
        Object obj = message.obj;
        DownloadTask downloadTask = null;
        BaseException baseException = obj instanceof Exception ? (BaseException) obj : null;
        synchronized (this) {
            if (i2 == 0) {
                downloadTask = this.downloadTaskMap.get(i);
            } else {
                SparseArray<DownloadTask> sparseArray = this.downloadTaskWithListenerMap.get(i);
                if (sparseArray != null) {
                    downloadTask = sparseArray.get(i2);
                }
            }
            if (downloadTask == null) {
                return;
            }
            notifyDownloadTaskStatus(message.what, baseException, downloadTask);
            refreshDownloadTaskMap(i, i2, message.what);
        }
    }

    public abstract boolean isDownloading(int i);

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r1.failedDownloadTaskMap.get(r2) != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean isInDownloadTaskPool(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L18
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.downloadTaskMap     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L13
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.failedDownloadTaskMap     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L18
        L13:
            r2 = 1
            goto L19
        L15:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L18:
            r2 = 0
        L19:
            monitor-exit(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.isInDownloadTaskPool(int):boolean");
    }

    public boolean pause(int i) {
        if (!this.fixAnrIsolateEngineAndCache) {
            return pauseImpl(i);
        }
        if (Logger.debug()) {
            StringBuilder M = a.M("Trace:");
            M.append(Log.getStackTraceString(new Throwable()));
            Logger.taskDebug(TAG, i, "pause", M.toString());
        }
        DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo != null && downloadInfo.getStatus() == 11) {
            return false;
        }
        doPause(i);
        synchronized (this) {
            if (downloadInfo == null) {
                DownloadTask downloadTask = this.downloadTaskMap.get(i);
                if (downloadTask != null) {
                    new DownloadStatusHandler(downloadTask, this.mainHandler).onPause();
                    return true;
                }
            } else if (downloadInfo.getStatus() == 1) {
                DownloadTask downloadTask2 = this.downloadTaskMap.get(i);
                if (downloadTask2 != null) {
                    new DownloadStatusHandler(downloadTask2, this.mainHandler).onPause();
                    return true;
                }
            } else if (DownloadStatus.isDownloading(downloadInfo.getStatus())) {
                downloadInfo.setStatus(-2);
                return true;
            }
            return false;
        }
    }

    public synchronized void refreshDownloadTaskMap(int i, int i2, int i3) {
        if (i3 != -7) {
            if (i3 == -6) {
                this.successDownloadTaskMap.put(i, this.downloadTaskMap.get(i));
                removeTask(i, i2);
            } else if (i3 == -4) {
                removeTask(i, i2);
                tryDownloadNextTaskInQueue(i);
            } else if (i3 == -3) {
                this.successDownloadTaskMap.put(i, this.downloadTaskMap.get(i));
                removeTask(i, i2);
                tryDownloadNextTaskInQueue(i);
            } else if (i3 != -1) {
                if (i3 == 8) {
                    DownloadTask downloadTask = this.downloadTaskMap.get(i);
                    if (downloadTask != null && this.waitingAsyncDownloadTaskMap.get(i) == null) {
                        this.waitingAsyncDownloadTaskMap.put(i, downloadTask);
                    }
                    tryDownloadNextTaskInQueue(i);
                }
            }
        }
        DownloadTask downloadTask2 = this.downloadTaskMap.get(i);
        if (downloadTask2 != null) {
            if (this.failedDownloadTaskMap.get(i) == null) {
                this.failedDownloadTaskMap.put(i, downloadTask2);
            }
            removeTask(i, i2);
        }
        tryDownloadNextTaskInQueue(i);
    }

    public synchronized void removeDownloadListener(int i, int i2, IDownloadListener iDownloadListener, ListenerType listenerType, boolean z) {
        DownloadTask downloadTask = getDownloadTask(i);
        if (downloadTask == null) {
            downloadTask = this.pengingTaskCache.get(Integer.valueOf(i));
        }
        if (downloadTask != null) {
            downloadTask.removeDownloadListener(i2, iDownloadListener, listenerType, z);
        }
    }

    public abstract void removeDownloadRunnable(DownloadRunnable downloadRunnable);

    public void resetDownloadData(final int i, final boolean z) {
        if (Logger.debug()) {
            StringBuilder X = a.X("DeleteFile:", z, "Trace:");
            X.append(Log.getStackTraceString(new Throwable()));
            Logger.taskDebug(TAG, i, "resetDownloadData", X.toString());
        }
        this.mainHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.5
            @Override // java.lang.Runnable
            public void run() {
                DownloadNotificationManager.getInstance().cancelNotification(i);
            }
        });
        DownloadComponentManager.submitCPUTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.6
            @Override // java.lang.Runnable
            public void run() {
                AbsDownloadEngine.this.doCancel(i);
                AbsDownloadEngine.this.resetDownloadDataInSubThread(i, z);
            }
        }, false);
    }

    public synchronized boolean restart(int i) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "restart", "Trace:" + Log.getStackTraceString(new Throwable()));
        }
        DownloadTask downloadTask = this.failedDownloadTaskMap.get(i);
        if (downloadTask == null) {
            return false;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo != null) {
            downloadInfo.setDownloadFromReserveWifi(false);
        }
        tryDownload(downloadTask);
        return true;
    }

    public synchronized void restartAllFailedDownloadTasks(List<String> list) {
        DownloadInfo downloadInfo;
        try {
            boolean isWifi = DownloadUtils.isWifi(DownloadComponentManager.getAppContext());
            for (int i = 0; i < this.failedDownloadTaskMap.size(); i++) {
                DownloadTask downloadTask = this.failedDownloadTaskMap.get(this.failedDownloadTaskMap.keyAt(i));
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && (!downloadInfo.isOnlyWifi() || isWifi)) {
                    if ((DownloadSetting.obtain(downloadInfo.getId()).optInt(DownloadSettingKeys.AUTO_RESUME, 0) == 1) || (downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()))) {
                        downloadInfo.setAutoResumed(true);
                        downloadInfo.setShowNotificationForNetworkResumed(true);
                        tryDownload(downloadTask);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public synchronized void restartAllPauseReserveOnWifiDownloadTasks(List<String> list) {
        DownloadInfo downloadInfo;
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (DownloadUtils.isWifi(DownloadComponentManager.getAppContext())) {
            for (int i = 0; i < this.downloadTaskMap.size(); i++) {
                DownloadTask downloadTask = this.downloadTaskMap.get(this.downloadTaskMap.keyAt(i));
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null && downloadInfo.getMimeType() != null && list.contains(downloadInfo.getMimeType()) && isPauseReserveOnWifi(downloadInfo)) {
                    downloadInfo.setAutoResumed(true);
                    downloadInfo.setShowNotificationForNetworkResumed(true);
                    tryDownload(downloadTask);
                    downloadInfo.setDownloadFromReserveWifi(true);
                    IReserveWifiStatusListener reserveWifiStatusListener = Downloader.getInstance(DownloadComponentManager.getAppContext()).getReserveWifiStatusListener();
                    if (reserveWifiStatusListener != null) {
                        reserveWifiStatusListener.onStatusChanged(downloadInfo, 5, 2);
                    }
                }
            }
        }
    }

    public synchronized boolean restartAsyncWaitingTask(int i) {
        DownloadInfo downloadInfo;
        DownloadTask downloadTask = this.waitingAsyncDownloadTaskMap.get(i);
        if (downloadTask == null || (downloadInfo = downloadTask.getDownloadInfo()) == null) {
            return false;
        }
        if (downloadInfo.canReStartAsyncTask()) {
            tryDownload(downloadTask);
        }
        return true;
    }

    public synchronized boolean resume(int i) {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, i, "resume", "Trace:" + Log.getStackTraceString(new Throwable()));
        }
        DownloadTask downloadTask = this.downloadTaskMap.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setDownloadFromReserveWifi(false);
            }
            tryDownload(downloadTask);
        } else {
            restart(i);
        }
        return true;
    }

    public synchronized void setDownloadNotificationEventListener(int i, IDownloadNotificationEventListener iDownloadNotificationEventListener) {
        DownloadTask downloadTask = this.downloadTaskMap.get(i);
        if (downloadTask != null) {
            downloadTask.setNotificationEventListener(iDownloadNotificationEventListener);
        }
    }

    public void setThrottleNetSpeed(int i, long j, int i2) {
        DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
        if (downloadInfo != null) {
            downloadInfo.setThrottleNetSpeed(j, i2);
        }
        doSetThrottleNetSpeed(i, j, i2);
    }

    public void shutDown() {
        List<Integer> allAliveDownloadIds = getAllAliveDownloadIds();
        if (allAliveDownloadIds == null) {
            return;
        }
        Iterator<Integer> it2 = allAliveDownloadIds.iterator();
        while (it2.hasNext()) {
            pause(it2.next().intValue());
        }
    }

    public synchronized void tryDownload(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return;
        }
        downloadInfo.setDownloadFromReserveWifi(false);
        if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_NONE) {
            enqueue(downloadTask);
        } else {
            tryDownloadImpl(downloadTask);
        }
    }

    public void addDownloadListener(int i, int i2, final IDownloadListener iDownloadListener, final ListenerType listenerType, boolean z, boolean z2) {
        if (!this.fixAnrIsolateEngineAndCache) {
            addDownloadListenerImpl(i, i2, iDownloadListener, listenerType, z, z2);
            return;
        }
        synchronized (this) {
            final DownloadTask downloadTask = getDownloadTask(i);
            if (downloadTask == null) {
                DownloadInfo downloadInfo = this.downloadCache.getDownloadInfo(i);
                synchronized (this) {
                    if (downloadInfo != null) {
                        if (downloadInfo.getStatus() != -3) {
                            DownloadTask downloadTask2 = this.pengingTaskCache.get(Integer.valueOf(i));
                            if (downloadTask2 == null) {
                                downloadTask2 = new DownloadTask(downloadInfo);
                                this.pengingTaskCache.put(Integer.valueOf(i), downloadTask2);
                            }
                            downloadTask2.addDownloadListener(i2, iDownloadListener, listenerType, z);
                        }
                    }
                }
                return;
            }
            downloadTask.addDownloadListener(i2, iDownloadListener, listenerType, z);
            final DownloadInfo downloadInfo2 = downloadTask.getDownloadInfo();
            if (z2 && downloadInfo2 != null && !isDownloading(i) && (listenerType == ListenerType.MAIN || listenerType == ListenerType.NOTIFICATION)) {
                boolean z3 = true;
                if (listenerType == ListenerType.NOTIFICATION && !downloadInfo2.canShowNotification()) {
                    z3 = false;
                }
                if (z3) {
                    final int status = downloadInfo2.getStatus();
                    this.mainHandler.post(new Runnable() { // from class: com.ss.android.socialbase.downloader.impls.AbsDownloadEngine.7
                        @Override // java.lang.Runnable
                        public void run() {
                            IDownloadListener iDownloadListener2 = iDownloadListener;
                            if (iDownloadListener2 != null) {
                                int i3 = status;
                                if (i3 == -3) {
                                    iDownloadListener2.onSuccessed(downloadInfo2);
                                    downloadTask.removeCallback(listenerType, iDownloadListener);
                                } else if (i3 == -1) {
                                    iDownloadListener2.onFailed(downloadInfo2, new BaseException(1000, "try add listener for failed task"));
                                    downloadTask.removeCallback(listenerType, iDownloadListener);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public DownloadTask getDownloadTask(int i, int i2) {
        DownloadTask downloadTask;
        synchronized (this) {
            if (i2 == 0) {
                downloadTask = this.downloadTaskMap.get(i);
            } else {
                SparseArray<DownloadTask> sparseArray = this.downloadTaskWithListenerMap.get(i);
                downloadTask = sparseArray != null ? sparseArray.get(i2) : null;
            }
        }
        return downloadTask;
    }
}
