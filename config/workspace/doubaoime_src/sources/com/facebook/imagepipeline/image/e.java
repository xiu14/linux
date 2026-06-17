package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e extends b implements e.c.c.g.c {

    /* renamed from: d, reason: collision with root package name */
    private e.c.c.g.a<Bitmap> f6471d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Bitmap f6472e;

    /* renamed from: f, reason: collision with root package name */
    private final k f6473f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6474g;
    private final int h;
    private final Rect i;
    private final Rect j;
    private final int k;

    public e(Bitmap bitmap, e.c.c.g.d<Bitmap> dVar, k kVar, int i) {
        Objects.requireNonNull(bitmap);
        this.f6472e = bitmap;
        Bitmap bitmap2 = this.f6472e;
        Objects.requireNonNull(dVar);
        this.f6471d = e.c.c.g.a.D(bitmap2, dVar);
        this.f6473f = kVar;
        this.f6474g = i;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.k = -1;
    }

    public int A() {
        return this.f6474g;
    }

    public int D() {
        return this.k;
    }

    public Rect G() {
        return this.j;
    }

    @Override // com.facebook.imagepipeline.image.d, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e.c.c.g.a<Bitmap> aVar;
        synchronized (this) {
            aVar = this.f6471d;
            this.f6471d = null;
            this.f6472e = null;
        }
        if (aVar != null) {
            aVar.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.h
    public int d() {
        return 1;
    }

    @Override // com.facebook.imagepipeline.image.h
    public int getHeight() {
        int i;
        if (this.f6474g % 180 != 0 || (i = this.h) == 5 || i == 7) {
            Bitmap bitmap = this.f6472e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.f6472e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // com.facebook.imagepipeline.image.h
    public int getWidth() {
        int i;
        if (this.f6474g % 180 != 0 || (i = this.h) == 5 || i == 7) {
            Bitmap bitmap = this.f6472e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.f6472e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // com.facebook.imagepipeline.image.d
    public synchronized boolean isClosed() {
        return this.f6471d == null;
    }

    @Override // com.facebook.imagepipeline.image.d
    public k l() {
        return this.f6473f;
    }

    @Override // com.facebook.imagepipeline.image.d
    public int o() {
        return com.facebook.imageutils.b.e(this.f6472e);
    }

    @Override // com.facebook.imagepipeline.image.b
    public Bitmap s() {
        return this.f6472e;
    }

    public synchronized e.c.c.g.a<Bitmap> w() {
        return e.c.c.g.a.h(this.f6471d);
    }

    public int x() {
        return this.h;
    }

    public Rect z() {
        return this.i;
    }

    public e(e.c.c.g.a<Bitmap> aVar, k kVar, int i) {
        this(aVar, kVar, i, 0, null, null, -1);
    }

    public e(e.c.c.g.a<Bitmap> aVar, k kVar, int i, int i2, Rect rect, Rect rect2, int i3) {
        e.c.c.g.a<Bitmap> d2 = aVar.d();
        Objects.requireNonNull(d2);
        this.f6471d = d2;
        this.f6472e = d2.r();
        this.f6473f = kVar;
        this.f6474g = i;
        this.h = i2;
        this.i = rect;
        this.j = rect2;
        this.k = i3;
    }

    public e(e.c.c.g.a<Bitmap> aVar, k kVar, int i, int i2, Rect rect, Rect rect2, int i3, e.c.g.d dVar) {
        e.c.c.g.a<Bitmap> d2 = aVar.d();
        Objects.requireNonNull(d2);
        this.f6471d = d2;
        this.f6472e = d2.r();
        this.f6473f = kVar;
        this.f6474g = i;
        this.h = i2;
        this.i = rect;
        this.j = rect2;
        this.k = i3;
        this.a = dVar;
    }
}
