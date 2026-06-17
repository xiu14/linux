package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.file.DownloadFile;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.io.File;

/* loaded from: classes2.dex */
public class DownloadCheckPathModule extends AbsDownloadModule {
    private static final String TAG = "DownloadCheckPathModule";

    private void checkSavePathValid() throws BaseException {
        DownloadFile downloadFile = new DownloadFile(this.mDownloadInfo.getSavePath(), this.mDownloadInfo.getName());
        if (downloadFile.isTypeError()) {
            this.mDownloadCache.removeDownloadTaskData(this.mDownloadInfo.getId());
            StringBuilder M = a.M("download savePath error:");
            M.append(this.mDownloadInfo.getSavePath());
            M.append(" extra:");
            M.append(downloadFile.getExtraMsg());
            throw new BaseException(DownloadErrorCode.ERROR_FILE_TYPE, M.toString());
        }
        if (downloadFile.isTypeMediaStore()) {
            return;
        }
        File file = new File(this.mDownloadInfo.getSavePath());
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            file.delete();
            if (file.mkdirs() || file.exists()) {
                return;
            }
            StringBuilder M2 = a.M("download savePath is not directory:path=");
            M2.append(this.mDownloadInfo.getSavePath());
            throw new BaseException(DownloadErrorCode.ERROR_SAVE_PATH_NOT_DIRECTORY, M2.toString());
        }
        boolean mkdirs = file.mkdirs();
        if (mkdirs || file.exists()) {
            return;
        }
        int i = 0;
        while (!mkdirs) {
            int i2 = i + 1;
            if (i >= 3) {
                break;
            }
            try {
                Thread.sleep(10L);
                mkdirs = file.mkdirs();
                i = i2;
            } catch (InterruptedException unused) {
            }
        }
        if (mkdirs || file.exists()) {
            return;
        }
        if (DownloadUtils.getAvailableSpaceBytes(this.mDownloadInfo.getSavePath()) < DownloadConstants.MK_DIR_MIN_SPACE) {
            StringBuilder M3 = a.M("download savePath directory can not created:");
            M3.append(this.mDownloadInfo.getSavePath());
            throw new BaseException(1006, M3.toString());
        }
        StringBuilder M4 = a.M("download savePath directory can not created:");
        M4.append(this.mDownloadInfo.getSavePath());
        throw new BaseException(DownloadErrorCode.ERROR_SAVE_PATH_CREATE_FAILED, M4.toString());
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        checkSavePathValid();
        iDownloadModuleChain.proceed();
    }
}
