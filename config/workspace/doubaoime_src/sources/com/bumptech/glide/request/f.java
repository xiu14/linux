package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.q;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class f<R> implements d<R>, g<R> {
    private static final a j = new a();
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1843c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    private R f1844d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    @GuardedBy("this")
    private e f1845e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f1846f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f1847g;

    @GuardedBy("this")
    private boolean h;

    @Nullable
    @GuardedBy("this")
    private q i;

    @VisibleForTesting
    static class a {
        a() {
        }
    }

    public f(int i, int i2) {
        a aVar = j;
        this.a = i;
        this.b = i2;
        this.f1843c = aVar;
    }

    private synchronized R l(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone() && !com.bumptech.glide.util.j.h()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.f1846f) {
            throw new CancellationException();
        }
        if (this.h) {
            throw new ExecutionException(this.i);
        }
        if (this.f1847g) {
            return this.f1844d;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.h) {
            throw new ExecutionException(this.i);
        }
        if (this.f1846f) {
            throw new CancellationException();
        }
        if (!this.f1847g) {
            throw new TimeoutException();
        }
        return this.f1844d;
    }

    @Override // com.bumptech.glide.request.k.h
    public void a(@NonNull com.bumptech.glide.request.k.g gVar) {
    }

    @Override // com.bumptech.glide.request.k.h
    public synchronized void b(@NonNull R r, @Nullable com.bumptech.glide.request.l.b<? super R> bVar) {
    }

    @Override // com.bumptech.glide.request.k.h
    public synchronized void c(@Nullable e eVar) {
        this.f1845e = eVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.f1846f = true;
            Objects.requireNonNull(this.f1843c);
            notifyAll();
            e eVar = null;
            if (z) {
                e eVar2 = this.f1845e;
                this.f1845e = null;
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar.clear();
            }
            return true;
        }
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean d(@Nullable q qVar, Object obj, @NonNull com.bumptech.glide.request.k.h<R> hVar, boolean z) {
        this.h = true;
        this.i = qVar;
        notifyAll();
        return false;
    }

    @Override // com.bumptech.glide.request.k.h
    public synchronized void e(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.k
    public void f() {
    }

    @Override // com.bumptech.glide.request.g
    public synchronized boolean g(@NonNull R r, @NonNull Object obj, com.bumptech.glide.request.k.h<R> hVar, @NonNull DataSource dataSource, boolean z) {
        this.f1847g = true;
        this.f1844d = r;
        Objects.requireNonNull(this.f1843c);
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return l(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.request.k.h
    public void h(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.k.h
    @Nullable
    public synchronized e i() {
        return this.f1845e;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f1846f;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f1846f && !this.f1847g) {
            z = this.h;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.k.h
    public void j(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.k.h
    public void k(@NonNull com.bumptech.glide.request.k.g gVar) {
        ((SingleRequest) gVar).b(this.a, this.b);
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    public String toString() {
        e eVar;
        String str;
        String J2 = e.a.a.a.a.J(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            eVar = null;
            if (this.f1846f) {
                str = "CANCELLED";
            } else if (this.h) {
                str = "FAILURE";
            } else if (this.f1847g) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                eVar = this.f1845e;
            }
        }
        if (eVar == null) {
            return e.a.a.a.a.t(J2, str, "]");
        }
        return J2 + str + ", request=[" + eVar + "]]";
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return l(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
