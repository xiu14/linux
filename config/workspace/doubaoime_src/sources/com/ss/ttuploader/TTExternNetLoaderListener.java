package com.ss.ttuploader;

/* loaded from: classes2.dex */
public interface TTExternNetLoaderListener {
    void onComplete(TTExternResponseInfo tTExternResponseInfo);

    void onFailed(String str, Throwable th);

    int readFileData(byte[] bArr, long j, int i);
}
