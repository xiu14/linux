package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    private final b a;
    private e.c.c.g.a<Bitmap> b;

    /* renamed from: c, reason: collision with root package name */
    private List<e.c.c.g.a<Bitmap>> f6442c;

    /* renamed from: d, reason: collision with root package name */
    private int f6443d;

    e(b bVar) {
        this.a = bVar;
    }

    public d a() {
        try {
            d dVar = new d(this);
            e.c.c.g.a<Bitmap> aVar = this.b;
            if (aVar != null) {
                aVar.close();
            }
            this.b = null;
            e.c.c.g.a.p(this.f6442c);
            this.f6442c = null;
            return dVar;
        } catch (Throwable th) {
            e.c.c.g.a<Bitmap> aVar2 = this.b;
            int i = e.c.c.g.a.h;
            if (aVar2 != null) {
                aVar2.close();
            }
            this.b = null;
            e.c.c.g.a.p(this.f6442c);
            this.f6442c = null;
            throw th;
        }
    }

    public List<e.c.c.g.a<Bitmap>> b() {
        return e.c.c.g.a.l(this.f6442c);
    }

    public b c() {
        return this.a;
    }

    public e.c.c.g.a<Bitmap> d() {
        return e.c.c.g.a.h(this.b);
    }

    public e e(List<e.c.c.g.a<Bitmap>> list) {
        this.f6442c = e.c.c.g.a.l(list);
        return this;
    }

    public e f(int i) {
        this.f6443d = i;
        return this;
    }

    public e g(e.c.c.g.a<Bitmap> aVar) {
        this.b = e.c.c.g.a.h(aVar);
        return this;
    }
}
