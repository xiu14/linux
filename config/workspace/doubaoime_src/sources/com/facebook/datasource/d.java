package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface d<T> {
    boolean a();

    boolean b();

    Throwable c();

    boolean close();

    boolean d();

    void e(f<T> fVar, Executor executor);

    Map<String, Object> getExtras();

    float getProgress();

    T getResult();
}
