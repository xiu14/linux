package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.j.o;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class A implements g, g.a {
    private final h<?> a;
    private final g.a b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f1582c;

    /* renamed from: d, reason: collision with root package name */
    private volatile d f1583d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f1584e;

    /* renamed from: f, reason: collision with root package name */
    private volatile o.a<?> f1585f;

    /* renamed from: g, reason: collision with root package name */
    private volatile e f1586g;

    A(h<?> hVar, g.a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    private boolean e(Object obj) throws IOException {
        int i = com.bumptech.glide.util.f.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = true;
        try {
            com.bumptech.glide.load.data.e<T> o = this.a.o(obj);
            Object a = o.a();
            com.bumptech.glide.load.a<X> q = this.a.q(a);
            f fVar = new f(q, a, this.a.k());
            e eVar = new e(this.f1585f.a, this.a.p());
            com.bumptech.glide.load.engine.C.a d2 = this.a.d();
            d2.a(eVar, fVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + eVar + ", data: " + obj + ", encoder: " + q + ", duration: " + com.bumptech.glide.util.f.a(elapsedRealtimeNanos));
            }
            if (d2.b(eVar) != null) {
                this.f1586g = eVar;
                this.f1583d = new d(Collections.singletonList(this.f1585f.a), this.a, this);
                this.f1585f.f1715c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f1586g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.d(this.f1585f.a, o.a(), this.f1585f.f1715c, this.f1585f.f1715c.d(), this.f1585f.a);
                return false;
            } catch (Throwable th) {
                th = th;
                if (!z) {
                    this.f1585f.f1715c.b();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public void a(com.bumptech.glide.load.d dVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar2, DataSource dataSource) {
        this.b.a(dVar, exc, dVar2, this.f1585f.f1715c.d());
    }

    @Override // com.bumptech.glide.load.engine.g
    public boolean b() {
        if (this.f1584e != null) {
            Object obj = this.f1584e;
            this.f1584e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e2);
                }
            }
        }
        if (this.f1583d != null && this.f1583d.b()) {
            return true;
        }
        this.f1583d = null;
        this.f1585f = null;
        boolean z = false;
        while (!z) {
            if (!(this.f1582c < this.a.g().size())) {
                break;
            }
            List<o.a<?>> g2 = this.a.g();
            int i = this.f1582c;
            this.f1582c = i + 1;
            this.f1585f = g2.get(i);
            if (this.f1585f != null && (this.a.e().c(this.f1585f.f1715c.d()) || this.a.u(this.f1585f.f1715c.a()))) {
                this.f1585f.f1715c.e(this.a.l(), new z(this, this.f1585f));
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public void c() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.g
    public void cancel() {
        o.a<?> aVar = this.f1585f;
        if (aVar != null) {
            aVar.f1715c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.g.a
    public void d(com.bumptech.glide.load.d dVar, Object obj, com.bumptech.glide.load.data.d<?> dVar2, DataSource dataSource, com.bumptech.glide.load.d dVar3) {
        this.b.d(dVar, obj, dVar2, this.f1585f.f1715c.d(), dVar);
    }

    boolean f(o.a<?> aVar) {
        o.a<?> aVar2 = this.f1585f;
        return aVar2 != null && aVar2 == aVar;
    }

    void g(o.a<?> aVar, Object obj) {
        j e2 = this.a.e();
        if (obj != null && e2.c(aVar.f1715c.d())) {
            this.f1584e = obj;
            this.b.c();
        } else {
            g.a aVar2 = this.b;
            com.bumptech.glide.load.d dVar = aVar.a;
            com.bumptech.glide.load.data.d<?> dVar2 = aVar.f1715c;
            aVar2.d(dVar, obj, dVar2, dVar2.d(), this.f1586g);
        }
    }

    void h(o.a<?> aVar, @NonNull Exception exc) {
        g.a aVar2 = this.b;
        e eVar = this.f1586g;
        com.bumptech.glide.load.data.d<?> dVar = aVar.f1715c;
        aVar2.a(eVar, exc, dVar, dVar.d());
    }
}
