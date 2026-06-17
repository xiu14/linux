package com.ss.android.socialbase.downloader.core.module.pcdn;

import android.os.Process;
import com.ss.android.socialbase.downloader.core.DownloadSingleResponseHandler;
import com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule;
import com.ss.android.socialbase.downloader.core.module.pcdn.PCDNBandwidthSampler;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import e.a.a.a.a;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class PCDNChunkRunnableModule extends BaseDownloadNetworkModule implements Runnable, PCDNBandwidthSampler.LowSpeedListener {
    private static final String TAG = "PCDNChunkRunnableModule";
    private int mChunkRetryCount;
    private IDownloadChunkCallback mDownloadChunkCallback;
    private Future mFuture;
    private IDownloadHttpConnection mHttpConnection;
    private boolean mIsStop = false;
    private PCDNChunkUrlPolicy mOuterPcdnChunkUrlPolicy;
    private PCDNBandwidthSampler mPcdnBandwidthSampler;
    private PCDNChunk mPcdnChunk;
    private PCDNChunkAllocater mPcdnChunkAllocater;
    private PCDNChunkProgressManager mPcdnChunkProgressManager;
    private PCDNChunkUrlPolicy mPcdnChunkUrlPolicy;
    private PCDNRetryPolicy mPcdnRetryPolicy;
    private PCDNStats mPcdnStats;
    private DownloadSingleResponseHandler mSingleResponseHandler;

    public interface IDownloadChunkCallback {
        void onError(Throwable th);
    }

    public PCDNChunkRunnableModule(PCDNChunkProgressManager pCDNChunkProgressManager, PCDNChunkAllocater pCDNChunkAllocater, PCDNBandwidthSampler pCDNBandwidthSampler, PCDNStats pCDNStats, PCDNChunkUrlPolicy pCDNChunkUrlPolicy, int i, IDownloadChunkCallback iDownloadChunkCallback) {
        this.mPcdnChunkProgressManager = pCDNChunkProgressManager;
        this.mPcdnChunkAllocater = pCDNChunkAllocater;
        this.mPcdnBandwidthSampler = pCDNBandwidthSampler;
        pCDNBandwidthSampler.register(this);
        this.mPcdnStats = pCDNStats;
        this.mOuterPcdnChunkUrlPolicy = pCDNChunkUrlPolicy;
        this.mChunkRetryCount = i;
        this.mDownloadChunkCallback = iDownloadChunkCallback;
    }

    private void cancelThread() {
        try {
            this.mFuture.cancel(true);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean checkStop() {
        return checkTaskFinishByUser() || this.mIsStop;
    }

    private Throwable doDownload(String str, boolean z) {
        if (Logger.debug()) {
            int id = this.mDownloadInfo.getId();
            StringBuilder sb = new StringBuilder();
            sb.append("Before Url:");
            sb.append(str);
            sb.append(" isPcdn:");
            sb.append(z);
            sb.append(" index:");
            a.E0(sb, this.mPcdnChunk.mIndex, TAG, id, "doDownload");
        }
        this.mPcdnStats.beforeDownload(str, z);
        PCDNChunk pCDNChunk = this.mPcdnChunk;
        List<HttpHeader> buildRequestHeader = buildRequestHeader(pCDNChunk.mStartOffset, pCDNChunk.mEndOffset, true);
        PCDNChunk pCDNChunk2 = this.mPcdnChunk;
        long j = pCDNChunk2.mEndOffset;
        long j2 = pCDNChunk2.mStartOffset;
        long j3 = 1 + (j - j2);
        Throwable th = null;
        try {
            IDownloadHttpConnection sendRequest = sendRequest(str, buildRequestHeader, j2);
            this.mHttpConnection = sendRequest;
            DownloadSingleResponseHandler downloadSingleResponseHandler = new DownloadSingleResponseHandler(this.mCommonParams, sendRequest, this.mPcdnChunk.mStartOffset, j3, this);
            this.mSingleResponseHandler = downloadSingleResponseHandler;
            downloadSingleResponseHandler.handleResponse();
            this.mPcdnChunkProgressManager.onDownloadChunkFinish(this.mPcdnChunk.mIndex);
        } catch (Throwable th2) {
            th = th2;
            th.printStackTrace();
            this.mPcdnChunkUrlPolicy.onError();
            if (Logger.debug()) {
                a.E0(a.M("OnError index:"), this.mPcdnChunk.mIndex, TAG, this.mDownloadInfo.getId(), "doDownload");
            }
        }
        Throwable th3 = th;
        this.mPcdnStats.afterDownload(str, this.mPcdnChunk.mStartOffset, z, checkStop(), this.mHttpConnection, this.mSingleResponseHandler, th3);
        DownloadSingleResponseHandler downloadSingleResponseHandler2 = this.mSingleResponseHandler;
        if (downloadSingleResponseHandler2 != null) {
            this.mPcdnChunk.mStartOffset = downloadSingleResponseHandler2.getCurOffset();
        }
        if (Logger.debug()) {
            int id2 = this.mDownloadInfo.getId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("After Url:");
            sb2.append(str);
            sb2.append(" isPcdn:");
            sb2.append(z);
            sb2.append(" index:");
            a.E0(sb2, this.mPcdnChunk.mIndex, TAG, id2, "doDownload");
        }
        return th3;
    }

    private void downloadChunk() {
        PCDNChunkUrlPolicy pCDNChunkUrlPolicy = this.mOuterPcdnChunkUrlPolicy;
        if (pCDNChunkUrlPolicy == null || pCDNChunkUrlPolicy.isPCDN()) {
            this.mPcdnChunkUrlPolicy = new PCDNChunkUrlPolicy(this.mDownloadInfo.getPcdnUrls(), this.mDownloadInfo.getCdnUrls());
        } else {
            this.mPcdnChunkUrlPolicy = this.mOuterPcdnChunkUrlPolicy.copy();
        }
        this.mPcdnRetryPolicy = new PCDNRetryPolicy(this.mChunkRetryCount);
        do {
            Throwable doDownload = doDownload(this.mPcdnChunkUrlPolicy.obtainUrl(), this.mPcdnChunkUrlPolicy.isPCDN());
            if (doDownload == null) {
                return;
            }
            if (!this.mPcdnRetryPolicy.canRetry(true)) {
                if (checkStop()) {
                    return;
                }
                this.mDownloadChunkCallback.onError(doDownload);
                return;
            }
        } while (!checkStop());
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void cancel() {
        this.mIsStop = true;
        DownloadSingleResponseHandler downloadSingleResponseHandler = this.mSingleResponseHandler;
        if (downloadSingleResponseHandler != null) {
            downloadSingleResponseHandler.cancel();
        } else {
            closeConnection(this.mHttpConnection);
        }
        cancelThread();
    }

    public Future getFuture() {
        return this.mFuture;
    }

    @Override // com.ss.android.socialbase.downloader.core.module.pcdn.PCDNBandwidthSampler.LowSpeedListener
    public void onLowSpeed() {
        PCDNChunkUrlPolicy pCDNChunkUrlPolicy;
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "onLowSpeed", "Run");
        }
        PCDNRetryPolicy pCDNRetryPolicy = this.mPcdnRetryPolicy;
        if (pCDNRetryPolicy == null || !pCDNRetryPolicy.canRetry(false) || (pCDNChunkUrlPolicy = this.mPcdnChunkUrlPolicy) == null || !pCDNChunkUrlPolicy.switchToCdn()) {
            return;
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "onLowSpeed", "Run switch cdn");
        }
        closeConnection(this.mHttpConnection);
    }

    @Override // com.ss.android.socialbase.downloader.core.module.BaseDownloadNetworkModule, com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback
    public boolean onProgress(long j) throws BaseException {
        if (this.mPcdnChunkUrlPolicy.isPCDN()) {
            this.mPcdnBandwidthSampler.addPcdnSample(j);
        }
        return this.mPcdnChunkProgressManager.onProgress(this.mPcdnChunk.mIndex, j);
    }

    @Override // com.ss.android.socialbase.downloader.core.AbsDownloadModule, com.ss.android.socialbase.downloader.core.IDownloadModule
    public void pause() {
        this.mIsStop = true;
        DownloadSingleResponseHandler downloadSingleResponseHandler = this.mSingleResponseHandler;
        if (downloadSingleResponseHandler != null) {
            downloadSingleResponseHandler.pause();
        } else {
            closeConnection(this.mHttpConnection);
        }
        cancelThread();
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "run", "Run");
        }
        this.mPcdnBandwidthSampler.startSampling();
        while (!checkStop()) {
            PCDNChunk obtainPCDNChunk = this.mPcdnChunkAllocater.obtainPCDNChunk();
            this.mPcdnChunk = obtainPCDNChunk;
            if (obtainPCDNChunk == null) {
                return;
            } else {
                downloadChunk();
            }
        }
        if (Logger.debug()) {
            Logger.taskDebug(TAG, this.mDownloadInfo.getId(), "run", "Run End");
        }
    }

    public void setFuture(Future future) {
        this.mFuture = future;
    }
}
