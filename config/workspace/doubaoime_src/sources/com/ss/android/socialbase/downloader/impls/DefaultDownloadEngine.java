package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.constants.DownloadStatus;
import com.ss.android.socialbase.downloader.core.DownloadRunnable;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.thread.DownloadThreadPool;
import java.util.List;

/* loaded from: classes2.dex */
public class DefaultDownloadEngine extends AbsDownloadEngine {
    private static final String TAG = "DefaultDownloadEngine";
    private static DownloadThreadPool downloadThreadPool;

    public DefaultDownloadEngine() {
        downloadThreadPool = new DownloadThreadPool();
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    protected DownloadRunnable doCancel(int i) {
        return downloadThreadPool.cancel(i);
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    public void doDownload(int i, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, downloadTask.getDownloadId(), "doDownload", "start doDownload for task");
        }
        downloadTask.getTimingInfo().doDownloadTime = System.currentTimeMillis();
        downloadThreadPool.execute(new DownloadRunnable(downloadTask, this.mainHandler));
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    public void doPause(int i) {
        downloadThreadPool.pause(i);
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    public void doSetThrottleNetSpeed(int i, long j, int i2) {
        downloadThreadPool.setThrottleNetSpeed(i, j, i2);
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    public List<Integer> getAllAliveDownloadIds() {
        return downloadThreadPool.getAllAliveDownloadIds();
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    public boolean isDownloading(int i) {
        DownloadInfo downloadInfo;
        return downloadThreadPool.containsTask(i) && (downloadInfo = getDownloadInfo(i)) != null && DownloadStatus.isDownloading(downloadInfo.getStatus());
    }

    @Override // com.ss.android.socialbase.downloader.impls.AbsDownloadEngine
    public void removeDownloadRunnable(DownloadRunnable downloadRunnable) {
        downloadThreadPool.removeUnAliveDownloadRunnable(downloadRunnable);
    }
}
