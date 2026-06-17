package com.huawei.d.a;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f6980c = new h();
    public final ExecutorService a;
    public final Executor b;

    public h() {
        com.huawei.d.a.j.a aVar = com.huawei.d.a.j.a.b;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(com.huawei.d.a.j.a.f6981c, com.huawei.d.a.j.a.f6982d, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = threadPoolExecutor;
        this.b = com.huawei.d.a.j.a.b.a;
    }
}
