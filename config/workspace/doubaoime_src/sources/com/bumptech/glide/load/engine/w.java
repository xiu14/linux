package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.j.o;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
class w implements g, d.a<Object> {
    private final g.a a;
    private final h<?> b;

    /* renamed from: c, reason: collision with root package name */
    private int f1683c;

    /* renamed from: d, reason: collision with root package name */
    private int f1684d = -1;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.d f1685e;

    /* renamed from: f, reason: collision with root package name */
    private List<com.bumptech.glide.load.j.o<File, ?>> f1686f;

    /* renamed from: g, reason: collision with root package name */
    private int f1687g;
    private volatile o.a<?> h;
    private File i;
    private x j;

    w(h<?> hVar, g.a aVar) {
        this.b = hVar;
        this.a = aVar;
    }

    @Override // com.bumptech.glide.load.engine.g
    public boolean b() {
        List<com.bumptech.glide.load.d> c2 = this.b.c();
        if (c2.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.b.m();
        if (m.isEmpty()) {
            if (File.class.equals(this.b.r())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.b.i() + " to " + this.b.r());
        }
        while (true) {
            List<com.bumptech.glide.load.j.o<File, ?>> list = this.f1686f;
            if (list != null) {
                if (this.f1687g < list.size()) {
                    this.h = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.f1687g < this.f1686f.size())) {
                            break;
                        }
                        List<com.bumptech.glide.load.j.o<File, ?>> list2 = this.f1686f;
                        int i = this.f1687g;
                        this.f1687g = i + 1;
                        this.h = list2.get(i).b(this.i, this.b.t(), this.b.f(), this.b.k());
                        if (this.h != null && this.b.u(this.h.f1715c.a())) {
                            this.h.f1715c.e(this.b.l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
            int i2 = this.f1684d + 1;
            this.f1684d = i2;
            if (i2 >= m.size()) {
                int i3 = this.f1683c + 1;
                this.f1683c = i3;
                if (i3 >= c2.size()) {
                    return false;
                }
                this.f1684d = 0;
            }
            com.bumptech.glide.load.d dVar = c2.get(this.f1683c);
            Class<?> cls = m.get(this.f1684d);
            this.j = new x(this.b.b(), dVar, this.b.p(), this.b.t(), this.b.f(), this.b.s(cls), cls, this.b.k());
            File b = this.b.d().b(this.j);
            this.i = b;
            if (b != null) {
                this.f1685e = dVar;
                this.f1686f = this.b.j(b);
                this.f1687g = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@NonNull Exception exc) {
        this.a.a(this.j, exc, this.h.f1715c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.g
    public void cancel() {
        o.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.f1715c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.a.d(this.f1685e, obj, this.h.f1715c, DataSource.RESOURCE_DISK_CACHE, this.j);
    }
}
