package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class d {
    private final b a;
    private e.c.c.g.a<Bitmap> b;

    /* renamed from: c, reason: collision with root package name */
    private List<e.c.c.g.a<Bitmap>> f6441c;

    d(e eVar) {
        b c2 = eVar.c();
        Objects.requireNonNull(c2);
        this.a = c2;
        this.b = eVar.d();
        this.f6441c = eVar.b();
    }

    public static d b(b bVar) {
        return new d(bVar);
    }

    public static e g(b bVar) {
        return new e(bVar);
    }

    public synchronized void a() {
        e.c.c.g.a<Bitmap> aVar = this.b;
        int i = e.c.c.g.a.h;
        if (aVar != null) {
            aVar.close();
        }
        this.b = null;
        e.c.c.g.a.p(this.f6441c);
        this.f6441c = null;
    }

    public synchronized e.c.c.g.a<Bitmap> c(int i) {
        List<e.c.c.g.a<Bitmap>> list = this.f6441c;
        if (list == null) {
            return null;
        }
        return e.c.c.g.a.h(list.get(i));
    }

    public synchronized int d() {
        List<e.c.c.g.a<Bitmap>> list;
        list = this.f6441c;
        return list != null ? list.size() : 0;
    }

    public b e() {
        return this.a;
    }

    public synchronized boolean f(int i) {
        boolean z;
        List<e.c.c.g.a<Bitmap>> list = this.f6441c;
        if (list != null) {
            z = list.get(i) != null;
        }
        return z;
    }

    private d(b bVar) {
        Objects.requireNonNull(bVar);
        this.a = bVar;
    }
}
