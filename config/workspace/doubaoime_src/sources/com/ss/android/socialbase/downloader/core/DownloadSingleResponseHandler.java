package com.ss.android.socialbase.downloader.core;

import com.ss.android.socialbase.downloader.core.module.DownloadCommonParams;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.IDownloadCache;
import com.ss.android.socialbase.downloader.downloader.NetworkRetryStrategy;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.thread.IDownloadRunnableCallback;

/* loaded from: classes2.dex */
public class DownloadSingleResponseHandler {
    private static final int MIN_CACHE_TIME_MS = 1000;
    private static String TAG = "DownloadSingleResponseHandler";
    private IDownloadRunnableCallback mCallback;
    private volatile boolean mCanceled;
    private long mCurOffset;
    private IDownloadCache mDownloadCache;
    private long mDownloadChunkContentLen;
    private DownloadInfo mDownloadInfo;
    private IDownloadHttpConnection mHttpConnection;
    private boolean mIsFirstRead = true;
    private NetworkRetryStrategy mNetworkRetryStrategy;
    private volatile boolean mPaused;

    public DownloadSingleResponseHandler(DownloadCommonParams downloadCommonParams, IDownloadHttpConnection iDownloadHttpConnection, long j, long j2, IDownloadRunnableCallback iDownloadRunnableCallback) {
        this.mDownloadInfo = downloadCommonParams.mDownloadInfo;
        this.mDownloadCache = downloadCommonParams.mDownloadCache;
        this.mNetworkRetryStrategy = downloadCommonParams.mRetryStrategy;
        this.mHttpConnection = iDownloadHttpConnection;
        this.mCurOffset = j;
        this.mDownloadChunkContentLen = j2;
        this.mCallback = iDownloadRunnableCallback;
    }

    private void cancelConnection() {
        if (this.mHttpConnection == null) {
            return;
        }
        DownloadComponentManager.submitIOTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.core.DownloadSingleResponseHandler.1
            @Override // java.lang.Runnable
            public void run() {
                DownloadSingleResponseHandler.this.mHttpConnection.end();
            }
        }, true);
    }

    private boolean isStoppedStatus() {
        return this.mPaused || this.mCanceled;
    }

    private void updateDB() {
        try {
            this.mDownloadInfo.updateRealDownloadTime(true);
            this.mDownloadCache.updateDownloadInfo(this.mDownloadInfo);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void cancel() {
        if (this.mCanceled) {
            return;
        }
        this.mCanceled = true;
        cancelConnection();
    }

    public long getCurOffset() {
        return this.mCurOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0240 A[Catch: all -> 0x0381, TryCatch #15 {all -> 0x0381, blocks: (B:44:0x0324, B:58:0x0377, B:60:0x037d, B:61:0x0380, B:114:0x0212, B:116:0x0240, B:117:0x0243, B:130:0x0270, B:132:0x0276, B:134:0x0279, B:147:0x0317, B:148:0x031c), top: B:7:0x0022, inners: #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0270 A[Catch: all -> 0x0381, TRY_ENTER, TryCatch #15 {all -> 0x0381, blocks: (B:44:0x0324, B:58:0x0377, B:60:0x037d, B:61:0x0380, B:114:0x0212, B:116:0x0240, B:117:0x0243, B:130:0x0270, B:132:0x0276, B:134:0x0279, B:147:0x0317, B:148:0x031c), top: B:7:0x0022, inners: #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0377 A[Catch: all -> 0x0381, TRY_ENTER, TryCatch #15 {all -> 0x0381, blocks: (B:44:0x0324, B:58:0x0377, B:60:0x037d, B:61:0x0380, B:114:0x0212, B:116:0x0240, B:117:0x0243, B:130:0x0270, B:132:0x0276, B:134:0x0279, B:147:0x0317, B:148:0x031c), top: B:7:0x0022, inners: #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.ss.android.socialbase.downloader.model.RandomAccessOutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleResponse() throws com.ss.android.socialbase.downloader.exception.BaseException {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.core.DownloadSingleResponseHandler.handleResponse():void");
    }

    public void pause() {
        if (this.mPaused) {
            return;
        }
        this.mPaused = true;
        cancelConnection();
    }
}
