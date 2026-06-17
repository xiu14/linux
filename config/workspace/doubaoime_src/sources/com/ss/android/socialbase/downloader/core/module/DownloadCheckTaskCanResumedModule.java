package com.ss.android.socialbase.downloader.core.module;

import com.ss.android.socialbase.downloader.core.AbsDownloadModule;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class DownloadCheckTaskCanResumedModule extends AbsDownloadModule {
    private static final String TAG = "DownloadCheckTaskCanResumedModule";

    private void checkTaskCanResume() {
        long curByte = DownloadHelper.getCurByte(this.mDownloadInfo);
        long curBytes = this.mDownloadInfo.getCurBytes();
        if (Logger.debug() && curByte != curBytes) {
            int id = this.mDownloadInfo.getId();
            StringBuilder Q = a.Q("Offset:", curByte, " curBytes: ");
            Q.append(curBytes);
            Logger.taskDebug(TAG, id, "checkTaskCanResume", Q.toString());
        }
        this.mDownloadInfo.setCurBytes(curByte);
        if ((curByte > 0) || this.mCommonParams.mNeedCheckIfModified) {
            return;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "checkTaskCanResume", "deleteAllDownloadFiles");
        }
        this.mDownloadCache.removeSegments(this.mDownloadInfo.getId());
        DownloadUtils.deleteAllDownloadFiles(this.mDownloadInfo);
    }

    @Override // com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        checkTaskCanResume();
        iDownloadModuleChain.proceed();
    }
}
