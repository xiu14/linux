package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class AbstractDataSource<T> implements d<T> {
    private Map<String, Object> a;

    /* renamed from: d, reason: collision with root package name */
    private T f6323d = null;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f6324e = null;

    /* renamed from: f, reason: collision with root package name */
    private float f6325f = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6322c = false;
    private DataSourceStatus b = DataSourceStatus.IN_PROGRESS;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<f<T>, Executor>> f6326g = new ConcurrentLinkedQueue<>();

    private enum DataSourceStatus {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected AbstractDataSource() {
    }

    private void i() {
        boolean g2 = g();
        boolean o = o();
        Iterator<Pair<f<T>, Executor>> it2 = this.f6326g.iterator();
        while (it2.hasNext()) {
            Pair<f<T>, Executor> next = it2.next();
            ((Executor) next.second).execute(new a(this, g2, (f) next.first, o));
        }
    }

    private synchronized boolean o() {
        boolean z;
        if (h()) {
            z = b() ? false : true;
        }
        return z;
    }

    @Override // com.facebook.datasource.d
    public synchronized boolean a() {
        return this.f6323d != null;
    }

    @Override // com.facebook.datasource.d
    public synchronized boolean b() {
        return this.b != DataSourceStatus.IN_PROGRESS;
    }

    @Override // com.facebook.datasource.d
    public synchronized Throwable c() {
        return this.f6324e;
    }

    @Override // com.facebook.datasource.d
    public boolean close() {
        synchronized (this) {
            if (this.f6322c) {
                return false;
            }
            this.f6322c = true;
            T t = this.f6323d;
            this.f6323d = null;
            if (t != null) {
                f(t);
            }
            if (!b()) {
                i();
            }
            synchronized (this) {
                this.f6326g.clear();
            }
            return true;
        }
    }

    @Override // com.facebook.datasource.d
    public boolean d() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.datasource.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(com.facebook.datasource.f<T> r4, java.util.concurrent.Executor r5) {
        /*
            r3 = this;
            java.util.Objects.requireNonNull(r5)
            monitor-enter(r3)
            boolean r0 = r3.f6322c     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto La
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            return
        La:
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r3.b     // Catch: java.lang.Throwable -> L43
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> L43
            if (r0 != r1) goto L19
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.f<T>, java.util.concurrent.Executor>> r0 = r3.f6326g     // Catch: java.lang.Throwable -> L43
            android.util.Pair r1 = android.util.Pair.create(r4, r5)     // Catch: java.lang.Throwable -> L43
            r0.add(r1)     // Catch: java.lang.Throwable -> L43
        L19:
            boolean r0 = r3.a()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L2e
            boolean r0 = r3.b()     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L2e
            boolean r0 = r3.o()     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L42
            boolean r0 = r3.g()
            boolean r1 = r3.o()
            com.facebook.datasource.a r2 = new com.facebook.datasource.a
            r2.<init>(r3, r0, r4, r1)
            r5.execute(r2)
        L42:
            return
        L43:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L43
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.e(com.facebook.datasource.f, java.util.concurrent.Executor):void");
    }

    protected void f(T t) {
    }

    public synchronized boolean g() {
        return this.b == DataSourceStatus.FAILURE;
    }

    @Override // com.facebook.datasource.d
    public Map<String, Object> getExtras() {
        return this.a;
    }

    @Override // com.facebook.datasource.d
    public synchronized float getProgress() {
        return this.f6325f;
    }

    @Override // com.facebook.datasource.d
    public synchronized T getResult() {
        return this.f6323d;
    }

    public synchronized boolean h() {
        return this.f6322c;
    }

    protected void j(Map<String, Object> map) {
        this.a = map;
    }

    protected boolean k(Throwable th) {
        return l(th, null);
    }

    protected boolean l(Throwable th, Map<String, Object> map) {
        boolean z;
        synchronized (this) {
            if (!this.f6322c && this.b == DataSourceStatus.IN_PROGRESS) {
                this.b = DataSourceStatus.FAILURE;
                this.f6324e = th;
                this.a = map;
                z = true;
            }
            z = false;
        }
        if (z) {
            i();
        }
        return z;
    }

    protected boolean m(float f2) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.f6322c && this.b == DataSourceStatus.IN_PROGRESS) {
                if (f2 >= this.f6325f) {
                    this.f6325f = f2;
                    z = true;
                }
            }
        }
        if (z) {
            Iterator<Pair<f<T>, Executor>> it2 = this.f6326g.iterator();
            while (it2.hasNext()) {
                Pair<f<T>, Executor> next = it2.next();
                ((Executor) next.second).execute(new b(this, (f) next.first));
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0026, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0028, code lost:
    
        f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x002e, code lost:
    
        if (r4 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boolean n(T r4, boolean r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r3 = this;
            r3.a = r6
            r6 = 0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L46
            boolean r0 = r3.f6322c     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L2c
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r0 = r3.b     // Catch: java.lang.Throwable -> L3e
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r1 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.IN_PROGRESS     // Catch: java.lang.Throwable -> L3e
            if (r0 == r1) goto Lf
            goto L2c
        Lf:
            if (r5 == 0) goto L19
            com.facebook.datasource.AbstractDataSource$DataSourceStatus r5 = com.facebook.datasource.AbstractDataSource.DataSourceStatus.SUCCESS     // Catch: java.lang.Throwable -> L3e
            r3.b = r5     // Catch: java.lang.Throwable -> L3e
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f6325f = r5     // Catch: java.lang.Throwable -> L3e
        L19:
            T r5 = r3.f6323d     // Catch: java.lang.Throwable -> L3e
            if (r5 == r4) goto L23
            r3.f6323d = r4     // Catch: java.lang.Throwable -> L21
            r4 = r5
            goto L24
        L21:
            r4 = move-exception
            goto L3b
        L23:
            r4 = r6
        L24:
            r5 = 1
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L31
        L28:
            r3.f(r4)
            goto L31
        L2c:
            r5 = 0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L31
            goto L28
        L31:
            if (r5 == 0) goto L36
            r3.i()
        L36:
            return r5
        L37:
            r5 = move-exception
            r2 = r5
            r5 = r4
            r4 = r2
        L3b:
            r6 = r5
        L3c:
            r5 = r3
            goto L40
        L3e:
            r4 = move-exception
            goto L3c
        L40:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L44
            throw r4     // Catch: java.lang.Throwable -> L42
        L42:
            r4 = move-exception
            goto L48
        L44:
            r4 = move-exception
            goto L40
        L46:
            r4 = move-exception
            r5 = r3
        L48:
            if (r6 == 0) goto L4d
            r5.f(r6)
        L4d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.AbstractDataSource.n(java.lang.Object, boolean, java.util.Map):boolean");
    }
}
