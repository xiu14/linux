package com.bytedance.android.input.basic.thread.f;

import android.os.Looper;
import com.bytedance.android.input.basic.thread.ImeThreadPoolType;
import com.prolificinteractive.materialcalendarview.r;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.h;

/* loaded from: classes.dex */
public class i extends ThreadPoolExecutor {
    public static final a b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static volatile Field f2138c;
    private final ImeThreadPoolType a;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }

        public static final Field a(a aVar) {
            Object obj;
            Field field = i.f2138c;
            if (field == null) {
                synchronized (aVar) {
                    field = i.f2138c;
                    if (field == null) {
                        a aVar2 = i.b;
                        try {
                            Field declaredField = Thread.class.getDeclaredField("threadLocals");
                            declaredField.setAccessible(true);
                            obj = declaredField;
                        } catch (Throwable th) {
                            obj = r.J(th);
                        }
                        boolean z = obj instanceof h.a;
                        Object obj2 = obj;
                        if (z) {
                            obj2 = null;
                        }
                        a aVar3 = i.b;
                        i.f2138c = (Field) obj2;
                        field = (Field) obj2;
                    }
                }
            }
            return field;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(com.bytedance.android.input.basic.thread.ImeThreadPoolType r12, int r13, int r14, long r15, java.util.concurrent.TimeUnit r17, java.util.concurrent.BlockingQueue<java.lang.Runnable> r18, java.util.concurrent.ThreadFactory r19, java.util.concurrent.RejectedExecutionHandler r20) {
        /*
            r11 = this;
            r0 = r12
            java.lang.String r1 = "poolType"
            kotlin.s.c.l.f(r12, r1)
            java.lang.String r1 = "unit"
            r7 = r17
            kotlin.s.c.l.f(r7, r1)
            java.lang.String r1 = "workQueue"
            r8 = r18
            kotlin.s.c.l.f(r8, r1)
            if (r19 != 0) goto L21
            java.util.concurrent.ThreadFactory r1 = java.util.concurrent.Executors.defaultThreadFactory()
            java.lang.String r2 = "defaultThreadFactory()"
            kotlin.s.c.l.e(r1, r2)
            r9 = r1
            goto L23
        L21:
            r9 = r19
        L23:
            if (r20 != 0) goto L2c
            java.util.concurrent.ThreadPoolExecutor$AbortPolicy r1 = new java.util.concurrent.ThreadPoolExecutor$AbortPolicy
            r1.<init>()
            r10 = r1
            goto L2e
        L2c:
            r10 = r20
        L2e:
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r8 = r18
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            r1 = r11
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.thread.f.i.<init>(com.bytedance.android.input.basic.thread.ImeThreadPoolType, int, int, long, java.util.concurrent.TimeUnit, java.util.concurrent.BlockingQueue, java.util.concurrent.ThreadFactory, java.util.concurrent.RejectedExecutionHandler):void");
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (Looper.myLooper() != null) {
            try {
                Field a2 = a.a(b);
                if (a2 == null) {
                    return;
                }
                a2.set(Thread.currentThread(), null);
            } catch (Throwable th2) {
                r.J(th2);
            }
        }
    }

    public final ImeThreadPoolType c() {
        return this.a;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        kotlin.s.c.l.f(runnable, com.heytap.mcssdk.constant.b.y);
        if (l.a.f().b().contains(this.a)) {
            super.execute(new j(runnable, this));
        } else {
            super.execute(runnable);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if (l.a.l(this)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        if (l.a.l(this)) {
            return kotlin.collections.l.a;
        }
        List<Runnable> shutdownNow = super.shutdownNow();
        kotlin.s.c.l.e(shutdownNow, "super.shutdownNow()");
        return shutdownNow;
    }
}
