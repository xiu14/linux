package com.bytedance.bdinstall;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.bdinstall.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0643x {
    private static Map<String, Executor> a = new ConcurrentHashMap(4);
    private static Map<String, ExecutorService> b = new ConcurrentHashMap(4);

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, Looper> f4120c = new ConcurrentHashMap(4);

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, Handler> f4121d = new ConcurrentHashMap(4);

    /* renamed from: e, reason: collision with root package name */
    private static final com.bytedance.bdinstall.util.p<Executor> f4122e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final com.bytedance.bdinstall.util.p<ExecutorService> f4123f = new b();

    /* renamed from: g, reason: collision with root package name */
    private static final com.bytedance.bdinstall.util.p<Looper> f4124g = new c();
    private static final com.bytedance.bdinstall.util.p<Handler> h = new d();

    /* renamed from: com.bytedance.bdinstall.x$a */
    static class a extends com.bytedance.bdinstall.util.p<Executor> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
        protected Executor a(Object[] objArr) {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    /* renamed from: com.bytedance.bdinstall.x$b */
    static class b extends com.bytedance.bdinstall.util.p<ExecutorService> {
        b() {
        }

        @Override // com.bytedance.bdinstall.util.p
        @SuppressLint({"CI_NotAllowInvokeExecutorsMethods"})
        protected ExecutorService a(Object[] objArr) {
            return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 5L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    /* renamed from: com.bytedance.bdinstall.x$c */
    static class c extends com.bytedance.bdinstall.util.p<Looper> {
        c() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Looper a(Object[] objArr) {
            try {
                HandlerThread handlerThread = new HandlerThread("bd_install");
                handlerThread.start();
                return handlerThread.getLooper();
            } catch (Exception unused) {
                return Looper.getMainLooper();
            }
        }
    }

    /* renamed from: com.bytedance.bdinstall.x$d */
    static class d extends com.bytedance.bdinstall.util.p<Handler> {
        d() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Handler a(Object[] objArr) {
            return new Handler((Looper) C0643x.f4124g.b(new Object[0]));
        }
    }

    public static Handler b() {
        return d(c(f4121d));
    }

    private static String c(Map map) {
        Set keySet;
        if (map == null || map.size() == 0 || (keySet = map.keySet()) == null || keySet.size() <= 0) {
            return null;
        }
        return (String) keySet.iterator().next();
    }

    public static Handler d(String str) {
        if (str == null) {
            return h.b(new Object[0]);
        }
        Handler handler = f4121d.get(str);
        if (handler != null) {
            return handler;
        }
        Looper f2 = f(str);
        if (f2 == null) {
            int i = C0640u.a;
            return handler;
        }
        Handler handler2 = new Handler(f2);
        f4121d.put(str, handler2);
        return handler2;
    }

    private static ExecutorService e(String str) {
        if (str == null) {
            return f4123f.b(new Object[0]);
        }
        ExecutorService executorService = b.get(str);
        return executorService == null ? f4123f.b(new Object[0]) : executorService;
    }

    public static Looper f(String str) {
        if (str == null) {
            return f4124g.b(new Object[0]);
        }
        Looper looper = f4120c.get(str);
        return looper == null ? f4124g.b(new Object[0]) : looper;
    }

    public static void g(Runnable runnable) {
        h(c(f4121d), runnable);
    }

    public static void h(String str, Runnable runnable) {
        if (Looper.myLooper() == f(str)) {
            runnable.run();
            return;
        }
        Handler d2 = d(str);
        if (d2 == null) {
            d2 = h.b(new Object[0]);
        }
        d2.post(runnable);
    }

    public static void i(String str, Runnable runnable) {
        e(str).execute(runnable);
    }

    public static void j(String str, Runnable runnable) {
        Executor executor;
        if (str == null) {
            executor = f4122e.b(new Object[0]);
        } else {
            executor = a.get(str);
            if (executor == null) {
                executor = f4122e.b(new Object[0]);
            }
        }
        executor.execute(runnable);
    }

    static void k(String str, C0642w c0642w) {
        if (c0642w == null) {
            return;
        }
        Executor executor = c0642w.a;
        if (executor != null) {
            a.put(str, executor);
        }
        Looper looper = c0642w.b;
        if (looper != null) {
            f4120c.put(str, looper);
        }
    }

    public static <T> Future<T> l(Callable<T> callable) {
        return e(c(b)).submit(callable);
    }
}
