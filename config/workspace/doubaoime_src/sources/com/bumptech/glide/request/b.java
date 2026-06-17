package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes.dex */
public final class b implements RequestCoordinator, e {
    private final Object a;

    @Nullable
    private final RequestCoordinator b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f1839c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f1840d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f1841e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f1842f;

    public b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f1841e = requestState;
        this.f1842f = requestState;
        this.a = obj;
        this.b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.f1839c.a() || this.f1840d.a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(e eVar) {
        synchronized (this.a) {
            if (eVar.equals(this.f1840d)) {
                this.f1842f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.b;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
                return;
            }
            this.f1841e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f1842f;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f1842f = requestState2;
                this.f1840d.g();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(e eVar) {
        if (!(eVar instanceof b)) {
            return false;
        }
        b bVar = (b) eVar;
        return this.f1839c.c(bVar.f1839c) && this.f1840d.c(bVar.f1840d);
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f1841e = requestState;
            this.f1839c.clear();
            if (this.f1842f != requestState) {
                this.f1842f = requestState;
                this.f1840d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1841e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f1842f == requestState2;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:11:0x0015, B:13:0x001b, B:16:0x0022, B:18:0x002a, B:23:0x0038), top: B:3:0x0003 }] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(com.bumptech.glide.request.e r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            monitor-enter(r0)
            com.bumptech.glide.request.RequestCoordinator r1 = r5.b     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            boolean r1 = r1.e(r5)     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L10
            goto L12
        L10:
            r1 = r2
            goto L13
        L12:
            r1 = r3
        L13:
            if (r1 == 0) goto L38
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = r5.f1841e     // Catch: java.lang.Throwable -> L3a
            com.bumptech.glide.request.RequestCoordinator$RequestState r4 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch: java.lang.Throwable -> L3a
            if (r1 == r4) goto L22
            com.bumptech.glide.request.e r1 = r5.f1839c     // Catch: java.lang.Throwable -> L3a
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L3a
            goto L35
        L22:
            com.bumptech.glide.request.e r1 = r5.f1840d     // Catch: java.lang.Throwable -> L3a
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L34
            com.bumptech.glide.request.RequestCoordinator$RequestState r6 = r5.f1842f     // Catch: java.lang.Throwable -> L3a
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch: java.lang.Throwable -> L3a
            if (r6 == r1) goto L32
            if (r6 != r4) goto L34
        L32:
            r6 = r3
            goto L35
        L34:
            r6 = r2
        L35:
            if (r6 == 0) goto L38
            r2 = r3
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return r2
        L3a:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.b.e(com.bumptech.glide.request.e):boolean");
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean f(e eVar) {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = requestCoordinator == null || requestCoordinator.f(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.e
    public void g() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1841e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f1841e = requestState2;
                this.f1839c.g();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(e eVar) {
        synchronized (this.a) {
            if (eVar.equals(this.f1839c)) {
                this.f1841e = RequestCoordinator.RequestState.SUCCESS;
            } else if (eVar.equals(this.f1840d)) {
                this.f1842f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.b;
            if (requestCoordinator != null) {
                requestCoordinator.h(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(e eVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = false;
            if (requestCoordinator != null && !requestCoordinator.i(this)) {
                z2 = false;
                if (z2 && eVar.equals(this.f1839c)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1841e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.f1842f == requestState2;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1841e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.f1842f == requestState2;
        }
        return z;
    }

    public void j(e eVar, e eVar2) {
        this.f1839c = eVar;
        this.f1840d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1841e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f1841e = RequestCoordinator.RequestState.PAUSED;
                this.f1839c.pause();
            }
            if (this.f1842f == requestState2) {
                this.f1842f = RequestCoordinator.RequestState.PAUSED;
                this.f1840d.pause();
            }
        }
    }
}
