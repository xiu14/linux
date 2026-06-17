package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import e.c.c.d.h;

/* loaded from: classes2.dex */
public class c {
    private static final c q = new c(new d());
    public static final /* synthetic */ int r = 0;
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6452c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6453d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6454e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6455f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6456g;
    public Bitmap.Config h;
    public boolean i;
    public final e.c.h.j.c j;
    public final e.c.h.o.a k;
    public final ColorSpace l;
    public final Object m;
    public boolean n;
    public final boolean o;
    public final Rect p;

    public c(d dVar) {
        this.a = dVar.j();
        this.b = dVar.i();
        this.f6452c = dVar.g();
        this.f6453d = dVar.k();
        this.f6454e = dVar.m();
        this.f6455f = dVar.e();
        this.f6456g = dVar.h();
        this.h = dVar.a();
        this.i = dVar.n();
        this.j = dVar.d();
        this.k = dVar.b();
        this.l = dVar.c();
        this.m = dVar.f();
        this.n = dVar.o();
        this.o = dVar.p();
        this.p = dVar.l();
    }

    public static c a() {
        return q;
    }

    public boolean equals(Object obj) {
        Rect rect;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a || this.b != cVar.b || this.f6452c != cVar.f6452c || this.f6454e != cVar.f6454e || this.f6455f != cVar.f6455f || this.f6456g != cVar.f6456g || this.h != cVar.h || this.j != cVar.j || this.k != cVar.k || this.l != cVar.l || this.m != cVar.m || this.n != cVar.n || this.o != cVar.o) {
            return false;
        }
        Rect rect2 = this.p;
        return (rect2 == null || rect2.equals(cVar.p)) && ((rect = cVar.p) == null || rect.equals(this.p));
    }

    public int hashCode() {
        int ordinal = (this.h.ordinal() + (((((((((((this.a * 31) + this.b) * 31) + (this.f6452c ? 1 : 0)) * 31) + (this.f6454e ? 1 : 0)) * 31) + (this.f6455f ? 1 : 0)) * 31) + (this.f6456g ? 1 : 0)) * 31)) * 31;
        e.c.h.j.c cVar = this.j;
        int hashCode = (ordinal + (cVar != null ? cVar.hashCode() : 0)) * 31;
        e.c.h.o.a aVar = this.k;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.l;
        int hashCode3 = (hashCode2 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31;
        Object obj = this.m;
        int hashCode4 = (((((hashCode3 + (obj != null ? obj.hashCode() : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31;
        Rect rect = this.p;
        return hashCode4 + (rect != null ? rect.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ImageDecodeOptions{");
        h.b k = h.k(this);
        k.a("minDecodeIntervalMs", this.a);
        k.a("maxDimensionPx", this.b);
        k.c("decodePreviewFrame", this.f6452c);
        k.c("useLastFrameForPreview", this.f6454e);
        k.c("decodeAllFrames", this.f6455f);
        k.c("forceStaticImage", this.f6456g);
        k.b("bitmapConfigName", this.h.name());
        k.b("customImageDecoder", this.j);
        k.b("bitmapTransformation", this.k);
        k.b("colorSpace", this.l);
        M.append(k.toString());
        M.append("}");
        return M.toString();
    }
}
