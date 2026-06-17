package com.ss.android.socialbase.downloader.core;

import android.os.Handler;
import android.os.Process;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.core.module.DownloadBandwidthSamplerModule;
import com.ss.android.socialbase.downloader.core.module.DownloadBeginModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCheckFileExistModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCheckHasAnotherSameTaskModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCheckPathModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCheckTaskCanResumedModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCheckWifiTaskValidModule;
import com.ss.android.socialbase.downloader.core.module.DownloadCommonParams;
import com.ss.android.socialbase.downloader.core.module.DownloadLoadCacheModule;
import com.ss.android.socialbase.downloader.core.module.DownloadMimeTypeInterceptModule;
import com.ss.android.socialbase.downloader.core.module.DownloadMultiSegmentModule;
import com.ss.android.socialbase.downloader.core.module.DownloadRetryModule;
import com.ss.android.socialbase.downloader.core.module.DownloadTaskInterceptModule;
import com.ss.android.socialbase.downloader.core.module.normal.DownloadSingleSegmentModule;
import com.ss.android.socialbase.downloader.core.module.pcdn.DownloadPCDNSegmentModule;
import com.ss.android.socialbase.downloader.depend.IDownloadStatusListener;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.DownloadStatusHandler;
import com.ss.android.socialbase.downloader.downloader.NetworkFailoverStrategy;
import com.ss.android.socialbase.downloader.downloader.NetworkRetryStrategy;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.AbsDownloadEngine;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import e.a.a.a.a;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class DownloadRunnable implements Runnable {
    private static final String TAG = "DownloadRunnable";
    private DownloadCommonParams mCommonParams;
    private DownloadModuleChain mDownloadModuleChain;
    private Future mFuture;

    public DownloadRunnable(DownloadTask downloadTask, Handler handler) {
        DownloadCommonParams downloadCommonParams = new DownloadCommonParams();
        this.mCommonParams = downloadCommonParams;
        this.mDownloadModuleChain = new DownloadModuleChain(downloadCommonParams);
        DownloadCommonParams downloadCommonParams2 = this.mCommonParams;
        downloadCommonParams2.mDownloadTask = downloadTask;
        downloadCommonParams2.mDownloadInfo = downloadTask.getDownloadInfo();
        this.mCommonParams.mStatusHandler = new DownloadStatusHandler(downloadTask, handler);
        DownloadCommonParams downloadCommonParams3 = this.mCommonParams;
        downloadCommonParams3.mSetting = DownloadSetting.obtain(downloadCommonParams3.mDownloadInfo.getId());
        this.mCommonParams.mDownloadCache = DownloadComponentManager.getDownloadCache();
        DownloadCommonParams downloadCommonParams4 = this.mCommonParams;
        downloadCommonParams4.mRetryStrategy = new NetworkRetryStrategy(downloadCommonParams4.mDownloadInfo);
        DownloadCommonParams downloadCommonParams5 = this.mCommonParams;
        downloadCommonParams5.mFailoverStrategy = new NetworkFailoverStrategy(downloadCommonParams5.mDownloadInfo);
    }

    private void resetStats() {
        this.mCommonParams.mDownloadTask.getTimingInfo().reset();
        this.mCommonParams.mDownloadTask.getThreadInfo().reset();
    }

    public void cancel() {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mCommonParams.mDownloadInfo.getId(), "cancel", "Run");
        }
        this.mCommonParams.mRunStatus = RunStatus.RUN_STATUS_CANCELED;
        this.mDownloadModuleChain.cancel();
        if (this.mDownloadModuleChain.isStartDownload()) {
            return;
        }
        this.mCommonParams.mStatusHandler.onCancel();
        resetStats();
    }

    public int getDownloadId() {
        return this.mCommonParams.mDownloadInfo.getId();
    }

    public DownloadTask getDownloadTask() {
        return this.mCommonParams.mDownloadTask;
    }

    public Future getFuture() {
        return this.mFuture;
    }

    public boolean isAlive() {
        return this.mCommonParams.mIsAlive;
    }

    public void pause() {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mCommonParams.mDownloadInfo.getId(), "pause", "Run");
        }
        this.mCommonParams.mRunStatus = RunStatus.RUN_STATUS_PAUSE;
        this.mDownloadModuleChain.pause();
        if (this.mDownloadModuleChain.isStartDownload()) {
            return;
        }
        this.mCommonParams.mStatusHandler.onPause();
        resetStats();
    }

    public void prepareDownload() {
        this.mCommonParams.mStatusHandler.onPrepare();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.mCommonParams.mDownloadTask.getTimingInfo().threadExecuteTime = System.currentTimeMillis();
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mCommonParams.mDownloadInfo.getId(), "run", "Run");
        }
        Process.setThreadPriority(10);
        this.mDownloadModuleChain.addDownloadModule(new DownloadBandwidthSamplerModule()).addDownloadModule(new DownloadBeginModule()).addDownloadModule(new DownloadTaskInterceptModule()).addDownloadModule(new DownloadLoadCacheModule()).addDownloadModule(new DownloadMimeTypeInterceptModule()).addDownloadModule(new DownloadCheckFileExistModule()).addDownloadModule(new DownloadRetryModule(new DownloadModuleChain(this.mCommonParams).addDownloadModule(new DownloadCheckPathModule()).addDownloadModule(new DownloadCheckHasAnotherSameTaskModule()).addDownloadModule(new DownloadCheckWifiTaskValidModule()).addDownloadModule(new DownloadCheckTaskCanResumedModule()).addDownloadModule(new DownloadMultiSegmentModule()).addDownloadModule(new DownloadPCDNSegmentModule()).addDownloadModule(new DownloadSingleSegmentModule())));
        try {
            this.mDownloadModuleChain.proceed();
        } catch (Throwable th) {
            th.printStackTrace();
            this.mCommonParams.mStatusHandler.onError(new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_RUNNABLE_UNKNOWN, th));
        }
        resetStats();
        if (Logger.debug()) {
            int id = this.mCommonParams.mDownloadInfo.getId();
            StringBuilder M = a.M("Run Time:");
            M.append(System.currentTimeMillis() - this.mCommonParams.mDownloadTask.getTimingInfo().threadExecuteTime);
            Logger.taskDebug(TAG, id, "run", M.toString());
        }
        IDownloadStatusListener downloadStatusListener = DownloadComponentManager.getDownloadStatusListener();
        if (downloadStatusListener != null) {
            downloadStatusListener.onFinish(this.mCommonParams.mDownloadInfo.getStatus());
        }
        try {
            Object obj = this.mCommonParams.mDownloadCache;
            if (obj instanceof AbsDownloadEngine) {
                ((AbsDownloadEngine) obj).removeDownloadRunnable(this);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setEnableSegmentDownload(boolean z) {
        this.mCommonParams.mEnableSegmentDownload = z;
    }

    public void setFuture(Future future) {
        this.mFuture = future;
    }

    public void setThrottleNetSpeed(long j, int i) {
        this.mDownloadModuleChain.setThrottleNetSpeed(j);
    }
}
