package com.ss.android.socialbase.downloader.core.module.normal;

import com.ss.android.socialbase.downloader.core.DownloadSingleResponseHandler;
import com.ss.android.socialbase.downloader.core.IDownloadModuleChain;
import com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.List;

/* loaded from: classes2.dex */
public class DownloadSingleSegmentModule extends BaseDownloadNetworkModule {
    private static final String TAG = "DownloadSingleSegmentModule";
    private DownloadSingleResponseHandler mDownloadResponseHandler;
    private IDownloadHttpConnection mHttpConnection;

    private void doDownload() throws BaseException {
        String connectionUrl = this.mDownloadInfo.getConnectionUrl();
        long firstOffset = DownloadHelper.getFirstOffset(this.mDownloadInfo);
        long startOffset = this.mDownloadInfo.getStartOffset() + firstOffset;
        List<HttpHeader> buildRequestHeader = buildRequestHeader(startOffset, this.mDownloadInfo.getEndOffset(), true);
        this.mCommonParams.mFailoverStrategy.handleHeader(buildRequestHeader);
        this.mHttpConnection = sendRequest(connectionUrl, buildRequestHeader, startOffset);
        if (checkTaskFinishByUser()) {
            return;
        }
        handleResponseHeader(connectionUrl, firstOffset, this.mHttpConnection);
        long totalBytes = this.mDownloadInfo.getTotalBytes();
        checkMaxBytes(totalBytes, this.mDownloadInfo.getMaxBytes());
        if (checkTaskFinishByUser()) {
            return;
        }
        DownloadSingleResponseHandler downloadSingleResponseHandler = new DownloadSingleResponseHandler(this.mCommonParams, this.mHttpConnection, startOffset, totalBytes - firstOffset, this);
        this.mDownloadResponseHandler = downloadSingleResponseHandler;
        downloadSingleResponseHandler.handleResponse();
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void cancel() {
        DownloadSingleResponseHandler downloadSingleResponseHandler = this.mDownloadResponseHandler;
        if (downloadSingleResponseHandler != null) {
            downloadSingleResponseHandler.cancel();
        } else {
            closeConnection(this.mHttpConnection);
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void pause() {
        DownloadSingleResponseHandler downloadSingleResponseHandler = this.mDownloadResponseHandler;
        if (downloadSingleResponseHandler != null) {
            downloadSingleResponseHandler.pause();
        } else {
            closeConnection(this.mHttpConnection);
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void proceed(IDownloadModuleChain iDownloadModuleChain) throws BaseException {
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "proceed", "Run");
        }
        if (checkTaskFinishByUser()) {
            return;
        }
        try {
            doDownload();
        } finally {
            closeConnection(this.mHttpConnection);
        }
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void setThrottleNetSpeed(long j) {
        IDownloadHttpConnection iDownloadHttpConnection = this.mHttpConnection;
        if (iDownloadHttpConnection == null || !(iDownloadHttpConnection instanceof AbsDownloadHttpConnection)) {
            return;
        }
        try {
            ((AbsDownloadHttpConnection) iDownloadHttpConnection).setThrottleNetSpeedWhenRunning(j);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
