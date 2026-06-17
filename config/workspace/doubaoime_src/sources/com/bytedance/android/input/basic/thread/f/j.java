package com.bytedance.android.input.basic.thread.f;

import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class j implements Runnable, Comparable<j> {
    private final Runnable a;
    private final i b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2139c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Thread f2140d;

    public j(Runnable runnable, i iVar) {
        kotlin.s.c.l.f(runnable, TypedValues.AttributesType.S_TARGET);
        kotlin.s.c.l.f(iVar, "executor");
        this.a = runnable;
        this.b = iVar;
        this.f2139c = SystemClock.uptimeMillis();
    }

    public final long a() {
        return this.f2139c;
    }

    public final i b() {
        return this.b;
    }

    public final Runnable c() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public int compareTo(j jVar) {
        j jVar2 = jVar;
        kotlin.s.c.l.f(jVar2, "other");
        Runnable runnable = this.a;
        Comparable comparable = runnable instanceof Comparable ? (Comparable) runnable : null;
        if (comparable == null) {
            return 0;
        }
        return comparable.compareTo(jVar2.a);
    }

    public final Thread d() {
        return this.f2140d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && kotlin.s.c.l.a(this.a, ((j) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f2140d = Thread.currentThread();
            l lVar = l.a;
            com.bytedance.android.input.basic.thread.d i = lVar.i();
            o oVar = o.a;
            Runnable runnable = this.a;
            kotlin.s.c.l.f(runnable, "obj");
            Object a = ((runnable instanceof FutureTask) && (i.e() || i.f())) ? oVar.a(this.a) : null;
            n nVar = n.a;
            nVar.j(this);
            long j = uptimeMillis - this.f2139c;
            if (j >= lVar.f().f() && i.e()) {
                lVar.n("ThreadPool-Delegate", "Task<" + Thread.currentThread().getName() + "> target=" + this.a + " dispatch time cost: " + j + " ms");
                nVar.i(a == null ? this.a : a, this.b, j);
            }
            this.a.run();
            long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 >= lVar.f().e() && i.f()) {
                lVar.n("ThreadPool-Delegate", "Task<" + Thread.currentThread().getName() + "> target=" + this.a + " execute cost " + uptimeMillis2 + " ms !!!");
                if (a == null) {
                    a = this.a;
                }
                nVar.g(a, this.b, uptimeMillis2);
            }
            nVar.k(this);
        } catch (Throwable th) {
            n.a.k(this);
            throw th;
        }
    }
}
