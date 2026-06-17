package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class q<T> {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f1368e = Executors.newCachedThreadPool();
    private final Set<k<T>> a = new LinkedHashSet(1);
    private final Set<k<Throwable>> b = new LinkedHashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final Handler f1369c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private volatile o<T> f1370d = null;

    private class a extends FutureTask<o<T>> {
        a(Callable<o<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                q.this.i(get());
            } catch (InterruptedException | ExecutionException e2) {
                q.this.i(new o(e2));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    q(Callable<o<T>> callable, boolean z) {
        if (!z) {
            f1368e.execute(new a(callable));
            return;
        }
        try {
            i(callable.call());
        } catch (Throwable th) {
            i(new o<>(th));
        }
    }

    static void b(q qVar, Object obj) {
        synchronized (qVar) {
            Iterator it2 = new ArrayList(qVar.a).iterator();
            while (it2.hasNext()) {
                ((k) it2.next()).onResult(obj);
            }
        }
    }

    static void c(q qVar, Throwable th) {
        synchronized (qVar) {
            ArrayList arrayList = new ArrayList(qVar.b);
            if (arrayList.isEmpty()) {
                com.airbnb.lottie.y.d.d("Lottie encountered an error but no failure listener was added:", th);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((k) it2.next()).onResult(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(@Nullable o<T> oVar) {
        if (this.f1370d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f1370d = oVar;
        this.f1369c.post(new p(this));
    }

    public synchronized q<T> e(k<Throwable> kVar) {
        if (this.f1370d != null && this.f1370d.a() != null) {
            kVar.onResult(this.f1370d.a());
        }
        this.b.add(kVar);
        return this;
    }

    public synchronized q<T> f(k<T> kVar) {
        if (this.f1370d != null && this.f1370d.b() != null) {
            kVar.onResult(this.f1370d.b());
        }
        this.a.add(kVar);
        return this;
    }

    public synchronized q<T> g(k<Throwable> kVar) {
        this.b.remove(kVar);
        return this;
    }

    public synchronized q<T> h(k<T> kVar) {
        this.a.remove(kVar);
        return this;
    }
}
