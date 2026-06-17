package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;

/* loaded from: classes2.dex */
public class DownloadCheckHasAnotherSameTaskModule extends AbsDownloadModule {
    private static final String TAG = "DownloadCheckHasAnotherSameTaskModule";

    private void checkHasAnotherSameTask() throws BaseException {
        int id = this.mDownloadInfo.getId();
        int downloadId = DownloadComponentManager.getDownloadId(this.mDownloadInfo);
        DownloadInfo downloadInfo = this.mDownloadCache.getDownloadInfo(downloadId);
        if (downloadInfo == null || downloadInfo.getId() == id || !downloadInfo.equalsTask(this.mDownloadInfo)) {
            return;
        }
        if (DownloadComponentManager.getDownloadEngine().isDownloading(downloadInfo.getId())) {
            this.mDownloadCache.removeDownloadTaskData(id);
            throw new BaseException(1025, "another same task is downloading");
        }
        DownloadUtils.deleteAllDownloadFiles(this.mDownloadInfo);
        this.mDownloadCache.removeDownloadTaskData(downloadId);
        if (DownloadHelper.isBreakpointAvailable(downloadInfo)) {
            this.mDownloadInfo.copyFromCacheData(downloadInfo, false);
            this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
            throw new BaseException(DownloadErrorCode.ERROR_INNER_RETRY, "retry task because id generator changed");
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        checkHasAnotherSameTask();
        iDownloadModuleChain.proceed();
    }
}
