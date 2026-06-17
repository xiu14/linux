package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Request;

/* renamed from: com.bytedance.retrofit2.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0701e<T> extends Cloneable {
    void cancel();

    InterfaceC0701e<T> clone();

    void enqueue(InterfaceC0704h<T> interfaceC0704h);

    @Deprecated
    N<T> execute() throws Exception;

    boolean isCanceled();

    Request request();
}
