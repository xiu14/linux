package com.ss.android.socialbase.downloader.thread;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;

/* loaded from: classes2.dex */
public interface IDownloadRunnableCallback {
    void checkMaxBytes(long j, int i) throws BaseException;

    void handleFirstConnection(String str, IDownloadHeadHttpConnection iDownloadHeadHttpConnection, long j) throws BaseException;

    boolean onProgress(long j) throws BaseException;
}
