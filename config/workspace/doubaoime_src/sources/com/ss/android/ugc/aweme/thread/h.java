package com.ss.android.ugc.aweme.thread;

import com.ss.android.ugc.aweme.thread.i;
import com.ss.android.ugc.aweme.thread.j;
import com.ss.android.ugc.aweme.thread.k;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public class h {
    private static i a = new i(new i.b(null), null);
    private static c b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static volatile ExecutorService f8391c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile ExecutorService f8392d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile ExecutorService f8393e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile ScheduledExecutorService f8394f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile ExecutorService f8395g;

    static class a implements c {
        a() {
        }
    }

    public static ExecutorService a(j jVar) {
        k kVar;
        ThreadPoolType threadPoolType = jVar.a;
        if (threadPoolType == ThreadPoolType.IO || threadPoolType == ThreadPoolType.DEFAULT || threadPoolType == ThreadPoolType.BACKGROUND) {
            throw new IllegalArgumentException();
        }
        kVar = k.c.a;
        return kVar.a(jVar, false);
    }

    public static i b() {
        return a;
    }

    public static c c() {
        return b;
    }

    public static boolean d(ExecutorService executorService) {
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        k kVar5;
        if (f8391c == null) {
            synchronized (h.class) {
                if (f8391c == null) {
                    kVar5 = k.c.a;
                    f8391c = kVar5.a(j.a(ThreadPoolType.IO).g(), true);
                }
            }
        }
        if (executorService == f8391c) {
            return true;
        }
        if (f8392d == null) {
            synchronized (h.class) {
                if (f8392d == null) {
                    kVar4 = k.c.a;
                    f8392d = kVar4.a(j.a(ThreadPoolType.DEFAULT).g(), true);
                }
            }
        }
        if (executorService == f8392d) {
            return true;
        }
        if (f8393e == null) {
            synchronized (h.class) {
                if (f8393e == null) {
                    kVar3 = k.c.a;
                    f8393e = kVar3.a(j.a(ThreadPoolType.BACKGROUND).g(), true);
                }
            }
        }
        if (executorService == f8393e) {
            return true;
        }
        if (f8394f == null) {
            synchronized (h.class) {
                if (f8394f == null) {
                    kVar2 = k.c.a;
                    j.b a2 = j.a(ThreadPoolType.SCHEDULED);
                    a2.h(1);
                    f8394f = (ScheduledExecutorService) kVar2.a(a2.g(), true);
                }
            }
        }
        if (executorService == f8394f) {
            return true;
        }
        if (f8395g == null) {
            synchronized (h.class) {
                if (f8395g == null) {
                    kVar = k.c.a;
                    f8395g = kVar.a(j.a(ThreadPoolType.SERIAL).g(), true);
                }
            }
        }
        return executorService == f8395g;
    }
}
