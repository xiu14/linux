package com.ss.android.socialbase.downloader.depend;

import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public abstract class AbsDownloadExtListener extends AbsDownloadListener implements IDownloadExtListener {
    private static final String TAG = "AbsDownloadExtListener";

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadExtListener
    public void onWaitingDownloadCompleteHandler(DownloadInfo downloadInfo) {
        if (!Logger.debug() || downloadInfo == null) {
            return;
        }
        String str = TAG;
        int id = downloadInfo.getId();
        StringBuilder M = a.M("Name:");
        M.append(downloadInfo.getName());
        Logger.taskDebug(str, id, "onWaitingDownloadCompleteHandler", M.toString());
    }
}
