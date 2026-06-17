package com.vivo.push.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class g {
    private static final int a;
    private static final int b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f8918c;

    /* renamed from: d, reason: collision with root package name */
    private static ExecutorService f8919d;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        int max = Math.max(2, Math.min(availableProcessors - 1, 4));
        b = max;
        int i = (availableProcessors * 2) + 1;
        f8918c = i;
        f8919d = new ThreadPoolExecutor(max, i, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new h("COMMON_THREAD"), new ThreadPoolExecutor.DiscardPolicy());
    }

    public static ExecutorService a() {
        return f8919d;
    }
}
