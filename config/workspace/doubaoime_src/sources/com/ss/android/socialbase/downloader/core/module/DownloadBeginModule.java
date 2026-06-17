package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadStatusHandler;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.RetryScheduler;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class DownloadBeginModule extends AbsDownloadModule {
    private static final String TAG = "DownloadBeginModule";

    /* renamed from: com.ss.android.socialbase.downloader.core.module.DownloadBeginModule$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus;

        static {
            RunStatus.values();
            int[] iArr = new int[8];
            $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus = iArr;
            try {
                RunStatus runStatus = RunStatus.RUN_STATUS_CANCELED;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus;
                RunStatus runStatus2 = RunStatus.RUN_STATUS_PAUSE;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus;
                RunStatus runStatus3 = RunStatus.RUN_STATUS_INTERCEPT;
                iArr3[7] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus;
                RunStatus runStatus4 = RunStatus.RUN_STATUS_WAITING_ASYNC_HANDLER;
                iArr4[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus;
                RunStatus runStatus5 = RunStatus.RUN_STATUS_END_RIGHT_NOW;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$com$ss$android$socialbase$downloader$constants$RunStatus;
                RunStatus runStatus6 = RunStatus.RUN_STATUS_END_FOR_FILE_EXIST;
                iArr6[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void checkCompleted() {
        if (this.mDownloadInfo.isChunked()) {
            DownloadInfo downloadInfo = this.mDownloadInfo;
            downloadInfo.setTotalBytes(downloadInfo.getCurBytes());
        }
        this.mStatusHandler.onCompleted();
        if (this.mDownloadInfo.getStatus() != -1) {
            RetryScheduler.getInstance().scheduleRetryWhenHasTaskSucceed();
            return;
        }
        this.mDownloadInfo.reset();
        this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
        this.mDownloadCache.removeSegments(this.mDownloadInfo.getId());
        DownloadUtils.deleteAllDownloadFiles(this.mDownloadInfo);
    }

    private void doTaskStatusHandle(BaseException baseException) throws BaseException {
        int ordinal = this.mCommonParams.mRunStatus.ordinal();
        if (ordinal == 1) {
            this.mStatusHandler.onPause();
            return;
        }
        if (ordinal == 2) {
            this.mStatusHandler.onCancel();
            return;
        }
        if (ordinal == 4) {
            this.mStatusHandler.onCompleteForFileExist();
            return;
        }
        if (ordinal != 5) {
            if (ordinal == 6) {
                DownloadStatusHandler downloadStatusHandler = this.mStatusHandler;
                DownloadCommonParams downloadCommonParams = this.mCommonParams;
                downloadStatusHandler.onCompleteForFileExist(downloadCommonParams.mExistTargetFilePath, downloadCommonParams.mExistTargetFileName);
            } else if (ordinal == 7) {
                this.mStatusHandler.onIntercept();
            } else if (baseException != null) {
                this.mStatusHandler.onError(baseException);
            } else {
                checkCompleted();
            }
        }
    }

    private void onDownloadTaskEnd(BaseException baseException) {
        if (Logger.debug()) {
            int id = this.mDownloadInfo.getId();
            StringBuilder M = a.M("RunStatus: ");
            M.append(this.mCommonParams.mRunStatus);
            Logger.taskDebug(TAG, id, "onDownloadTaskEnd", M.toString());
        }
        try {
            this.mCommonParams.mDownloadTask.getTimingInfo().beforeOnEndCallbackTime = System.currentTimeMillis();
            DownloadComponentManager.updateCurrentDownloadThreadInfo(this.mCommonParams.mDownloadTask, false);
            doTaskStatusHandle(baseException);
        } catch (BaseException e2) {
            this.mStatusHandler.onError(e2);
        } catch (Throwable th) {
            this.mStatusHandler.onError(new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_FINALLY_UNKNOWN, th));
        }
        this.mCommonParams.mIsAlive = false;
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        if (checkTaskFinishByUser()) {
            return;
        }
        iDownloadModuleChain.onDownloadStart();
        try {
            try {
                try {
                    this.mStatusHandler.handlePrepare();
                    iDownloadModuleChain.proceed();
                    onDownloadTaskEnd(null);
                } catch (BaseException e2) {
                    e2.printStackTrace();
                    onDownloadTaskEnd(e2);
                }
            } finally {
            }
        } catch (Throwable th) {
            onDownloadTaskEnd(null);
        }
    }
}
