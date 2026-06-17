package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;

/* loaded from: classes2.dex */
public class DownloadTaskInterceptModule extends AbsDownloadModule {
    private static final String TAG = "DownloadTaskInterceptModule";

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public IDownloadModule init(DownloadCommonParams downloadCommonParams) {
        if (downloadCommonParams.mDownloadTask.getInterceptor() == null || downloadCommonParams.mDownloadInfo.isIgnoreInterceptor()) {
            return null;
        }
        return super.init(downloadCommonParams);
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        try {
            if (this.mDownloadTask.getInterceptor().intercepte()) {
                this.mCommonParams.mRunStatus = RunStatus.RUN_STATUS_INTERCEPT;
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        iDownloadModuleChain.proceed();
    }
}
