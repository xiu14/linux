package com.ss.ttuploader;

/* loaded from: classes2.dex */
public interface TTExternNetLoader {
    void cancelTask();

    int sendRequest(TTExternRequestInfo tTExternRequestInfo, TTExternNetLoaderListener tTExternNetLoaderListener);
}
