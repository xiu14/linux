package com.bytedance.retrofit2.T;

import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface a {
    boolean a(Request request, Executor executor, Runnable runnable) throws Exception;

    void b(Request request) throws Exception;

    void c(Request request);

    default Request d(Request request) {
        return request;
    }
}
