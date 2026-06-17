package com.huawei.d.a.j;

import com.huawei.d.a.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class e<TResult> extends com.huawei.d.a.f<TResult> {
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f6986c;

    /* renamed from: d, reason: collision with root package name */
    public TResult f6987d;

    /* renamed from: e, reason: collision with root package name */
    public Exception f6988e;
    public final Object a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public List<com.huawei.d.a.b<TResult>> f6989f = new ArrayList();

    @Override // com.huawei.d.a.f
    public com.huawei.d.a.f<TResult> a(com.huawei.d.a.c<TResult> cVar) {
        g(new b(h.f6980c.b, cVar));
        return this;
    }

    @Override // com.huawei.d.a.f
    public com.huawei.d.a.f<TResult> b(com.huawei.d.a.d dVar) {
        g(new c(h.f6980c.b, dVar));
        return this;
    }

    @Override // com.huawei.d.a.f
    public com.huawei.d.a.f<TResult> c(com.huawei.d.a.e<TResult> eVar) {
        g(new d(h.f6980c.b, eVar));
        return this;
    }

    @Override // com.huawei.d.a.f
    public Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f6988e;
        }
        return exc;
    }

    @Override // com.huawei.d.a.f
    public TResult e() {
        TResult tresult;
        synchronized (this.a) {
            if (this.f6988e != null) {
                throw new RuntimeException(this.f6988e);
            }
            tresult = this.f6987d;
        }
        return tresult;
    }

    @Override // com.huawei.d.a.f
    public boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.b && !this.f6986c && this.f6988e == null;
        }
        return z;
    }

    public com.huawei.d.a.f<TResult> g(com.huawei.d.a.b<TResult> bVar) {
        boolean z;
        synchronized (this.a) {
            synchronized (this.a) {
                z = this.b;
            }
            if (!z) {
                this.f6989f.add(bVar);
            }
        }
        if (z) {
            bVar.onComplete(this);
        }
        return this;
    }

    public final void h() {
        synchronized (this.a) {
            Iterator<com.huawei.d.a.b<TResult>> it2 = this.f6989f.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().onComplete(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f6989f = null;
        }
    }
}
