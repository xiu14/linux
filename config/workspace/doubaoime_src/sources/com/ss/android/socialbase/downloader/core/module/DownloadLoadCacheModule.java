package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.impls.DefaultDownloadCache;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* loaded from: classes2.dex */
public class DownloadLoadCacheModule extends AbsDownloadModule {
    private static final String TAG = "DownloadLoadCacheModule";

    private void doLoadCache() {
        this.mDownloadInfo.updateStartDownloadTime();
        this.mDownloadInfo.resetRealStartDownloadTime();
        this.mDownloadInfo.setCacheExistsInDownloading(false);
        int id = this.mDownloadInfo.getId();
        boolean ensureDownloadCacheSyncSuccess = this.mDownloadCache.ensureDownloadCacheSyncSuccess();
        DownloadInfo downloadInfo = this.mDownloadCache.getDownloadInfo(id);
        if (downloadInfo == null && !ensureDownloadCacheSyncSuccess) {
            downloadInfo = ((DefaultDownloadCache) this.mDownloadCache).getSqlDownloadCache().getDownloadInfo(id);
        }
        boolean z = true;
        if (downloadInfo == null || downloadInfo.isNewTask() || downloadInfo.isForce() || this.mDownloadInfo.getStartOffset() != downloadInfo.getStartOffset() || this.mDownloadInfo.getEndOffset() != downloadInfo.getEndOffset()) {
            this.mDownloadInfo.reset();
        } else {
            this.mDownloadInfo.copyFromCacheData(downloadInfo, true);
            DownloadInfo downloadInfo2 = this.mDownloadInfo;
            boolean z2 = downloadInfo != downloadInfo2;
            if (downloadInfo2.getSavePath().equals(downloadInfo.getSavePath()) && downloadInfo.isDownloaded()) {
                this.mCommonParams.mExistTargetFileName = downloadInfo.getName();
                this.mCommonParams.mExistTargetFilePath = downloadInfo.getSavePath();
            } else if (DownloadComponentManager.getDownloadId(downloadInfo) != id) {
                this.mDownloadCache.removeDownloadTaskData(id);
            }
            z = z2;
        }
        if (z) {
            this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        doLoadCache();
        if (checkTaskFinishByUser()) {
            return;
        }
        this.mStatusHandler.onStart();
        iDownloadModuleChain.proceed();
    }
}
