package com.ss.android.socialbase.downloader.core.module;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.RunStatus;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;

/* loaded from: classes2.dex */
public class DownloadCheckFileExistModule extends AbsDownloadModule {
    private static final String TAG = "DownloadCheckFileExistModule";

    public static void finishWithFileExist(DownloadCommonParams downloadCommonParams) {
        if (downloadCommonParams.mExistTargetFileName.equals(downloadCommonParams.mDownloadInfo.getName())) {
            downloadCommonParams.mRunStatus = RunStatus.RUN_STATUS_END_RIGHT_NOW;
        } else {
            downloadCommonParams.mRunStatus = RunStatus.RUN_STATUS_END_FOR_FILE_EXIST;
        }
        downloadCommonParams.mDownloadInfo.setCacheExistsInDownloading(true);
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        if (!TextUtils.isEmpty(this.mCommonParams.mExistTargetFileName)) {
            if (this.mDownloadInfo.isExpiredRedownload()) {
                DownloadCommonParams downloadCommonParams = this.mCommonParams;
                DownloadInfo downloadInfo = this.mDownloadInfo;
                downloadCommonParams.mNeedCheckIfModified = DownloadUtils.cacheExpiredWithHttp(downloadInfo, downloadInfo.isExpiredHttpCheck());
            }
            DownloadCommonParams downloadCommonParams2 = this.mCommonParams;
            if (!downloadCommonParams2.mNeedCheckIfModified) {
                finishWithFileExist(downloadCommonParams2);
                return;
            }
        }
        if (this.mDownloadInfo.isExpiredRedownload() || !this.mDownloadInfo.isDownloaded()) {
            if (this.mDownloadInfo.getChunkCount() > 1) {
                this.mDownloadInfo.reset();
                DownloadUtils.deleteAllDownloadFiles(this.mDownloadInfo);
                this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
            }
            iDownloadModuleChain.proceed();
            return;
        }
        this.mCommonParams.mExistTargetFileName = this.mDownloadInfo.getName();
        this.mCommonParams.mExistTargetFilePath = this.mDownloadInfo.getSavePath();
        finishWithFileExist(this.mCommonParams);
    }
}
