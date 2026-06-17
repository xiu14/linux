package com.ss.android.socialbase.downloader.core;

import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.core.module.DownloadCommonParams;
import com.ss.android.socialbase.downloader.downloader.DownloadStatusHandler;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;

/* loaded from: classes2.dex */
public abstract class AbsDownloadModule implements IDownloadModule {
    protected DownloadCommonParams mCommonParams;
    protected IDownloadCache mDownloadCache;
    protected DownloadInfo mDownloadInfo;
    protected DownloadTask mDownloadTask;
    protected DownloadSetting mSetting;
    protected DownloadStatusHandler mStatusHandler;

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void cancel() {
    }

    public boolean checkTaskFinishByUser() {
        if (this.mCommonParams.mDownloadInfo.getStatus() == -2) {
            DownloadCommonParams downloadCommonParams = this.mCommonParams;
            RunStatus runStatus = downloadCommonParams.mRunStatus;
            RunStatus runStatus2 = RunStatus.RUN_STATUS_PAUSE;
            if (runStatus != runStatus2) {
                downloadCommonParams.mRunStatus = runStatus2;
            }
            return true;
        }
        if (this.mCommonParams.mDownloadInfo.getStatus() != -4) {
            RunStatus runStatus3 = this.mCommonParams.mRunStatus;
            return runStatus3 == RunStatus.RUN_STATUS_CANCELED || runStatus3 == RunStatus.RUN_STATUS_PAUSE;
        }
        DownloadCommonParams downloadCommonParams2 = this.mCommonParams;
        RunStatus runStatus4 = downloadCommonParams2.mRunStatus;
        RunStatus runStatus5 = RunStatus.RUN_STATUS_CANCELED;
        if (runStatus4 != runStatus5) {
            downloadCommonParams2.mRunStatus = runStatus5;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public IDownloadModule init(DownloadCommonParams downloadCommonParams) {
        this.mCommonParams = downloadCommonParams;
        this.mDownloadCache = downloadCommonParams.mDownloadCache;
        this.mDownloadTask = downloadCommonParams.mDownloadTask;
        this.mDownloadInfo = downloadCommonParams.mDownloadInfo;
        this.mSetting = downloadCommonParams.mSetting;
        this.mStatusHandler = downloadCommonParams.mStatusHandler;
        return this;
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void pause() {
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void setThrottleNetSpeed(long j) {
    }
}
