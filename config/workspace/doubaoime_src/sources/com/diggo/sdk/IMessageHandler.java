package com.diggo.sdk;

/* loaded from: classes2.dex */
public interface IMessageHandler {
    void onError(String str);

    void onMessage(String str);

    void onProgress(String str, int i);
}
