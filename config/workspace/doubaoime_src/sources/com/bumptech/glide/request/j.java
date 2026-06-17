package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes.dex */
public class j implements RequestCoordinator, e {

    @Nullable
    private final RequestCoordinator a;
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private volatile e f1848c;

    /* renamed from: d, reason: collision with root package name */
    private volatile e f1849d;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f1850e;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState f1851f;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("requestLock")
    private boolean f1852g;

    public j(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f1850e = requestState;
        this.f1851f = requestState;
        this.b = obj;
        this.a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.e
    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.f1849d.a() || this.f1848c.a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(e eVar) {
        synchronized (this.b) {
            if (!eVar.equals(this.f1848c)) {
                this.f1851f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f1850e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.b(this);
            }
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean c(e eVar) {
        if (!(eVar instanceof j)) {
            return false;
        }
        j jVar = (j) eVar;
        if (this.f1848c == null) {
            if (jVar.f1848c != null) {
                return false;
            }
        } else if (!this.f1848c.c(jVar.f1848c)) {
            return false;
        }
        if (this.f1849d == null) {
            if (jVar.f1849d != null) {
                return false;
            }
        } else if (!this.f1849d.c(jVar.f1849d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.e
    public void clear() {
        synchronized (this.b) {
            this.f1852g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f1850e = requestState;
            this.f1851f = requestState;
            this.f1849d.clear();
            this.f1848c.clear();
        }
    }

    @Override // com.bumptech.glide.request.e
    public boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.f1850e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean e(e eVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            z = false;
            if (requestCoordinator != null && !requestCoordinator.e(this)) {
                z2 = false;
                if (z2 && eVar.equals(this.f1848c) && !a()) {
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

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean f(e eVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            z = false;
            if (requestCoordinator != null && !requestCoordinator.f(this)) {
                z2 = false;
                if (z2 && (eVar.equals(this.f1848c) || this.f1850e != RequestCoordinator.RequestState.SUCCESS)) {
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
    public void g() {
        synchronized (this.b) {
            this.f1852g = true;
            try {
                if (this.f1850e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f1851f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f1851f = requestState2;
                        this.f1849d.g();
                    }
                }
                if (this.f1852g) {
                    RequestCoordinator.RequestState requestState3 = this.f1850e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f1850e = requestState4;
                        this.f1848c.g();
                    }
                }
            } finally {
                this.f1852g = false;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(e eVar) {
        synchronized (this.b) {
            if (eVar.equals(this.f1849d)) {
                this.f1851f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f1850e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.h(this);
            }
            if (!this.f1851f.isComplete()) {
                this.f1849d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean i(e eVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            z = false;
            if (requestCoordinator != null && !requestCoordinator.i(this)) {
                z2 = false;
                if (z2 && eVar.equals(this.f1848c) && this.f1850e != RequestCoordinator.RequestState.PAUSED) {
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
        synchronized (this.b) {
            z = this.f1850e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.e
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.f1850e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    public void j(e eVar, e eVar2) {
        this.f1848c = eVar;
        this.f1849d = eVar2;
    }

    @Override // com.bumptech.glide.request.e
    public void pause() {
        synchronized (this.b) {
            if (!this.f1851f.isComplete()) {
                this.f1851f = RequestCoordinator.RequestState.PAUSED;
                this.f1849d.pause();
            }
            if (!this.f1850e.isComplete()) {
                this.f1850e = RequestCoordinator.RequestState.PAUSED;
                this.f1848c.pause();
            }
        }
    }
}
