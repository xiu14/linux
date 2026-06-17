package com.bytedance.android.input.basic.image;

import android.content.Context;
import android.widget.ImageView;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;

/* loaded from: classes.dex */
public final class i {
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f2066c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2067d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2068e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2069f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2070g;
    private final int h;
    private final boolean i;
    private final l<g, o> j;
    private final p<Throwable, Long, o> k;

    public i(Context context, String str, ImageView imageView, int i, int i2, int i3, int i4, int i5, boolean z, l lVar, p pVar, int i6) {
        i = (i6 & 8) != 0 ? 0 : i;
        i2 = (i6 & 16) != 0 ? 0 : i2;
        i3 = (i6 & 32) != 0 ? 0 : i3;
        i4 = (i6 & 64) != 0 ? 0 : i4;
        i5 = (i6 & 128) != 0 ? 0 : i5;
        z = (i6 & 256) != 0 ? false : z;
        lVar = (i6 & 512) != 0 ? null : lVar;
        pVar = (i6 & 1024) != 0 ? null : pVar;
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(str, "url");
        kotlin.s.c.l.f(imageView, "imageView");
        this.a = context;
        this.b = str;
        this.f2066c = imageView;
        this.f2067d = i;
        this.f2068e = i2;
        this.f2069f = i3;
        this.f2070g = i4;
        this.h = i5;
        this.i = z;
        this.j = lVar;
        this.k = pVar;
    }

    public final Context a() {
        return this.a;
    }

    public final int b() {
        return this.f2068e;
    }

    public final int c() {
        return this.h;
    }

    public final ImageView d() {
        return this.f2066c;
    }

    public final p<Throwable, Long, o> e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.s.c.l.a(this.a, iVar.a) && kotlin.s.c.l.a(this.b, iVar.b) && kotlin.s.c.l.a(this.f2066c, iVar.f2066c) && this.f2067d == iVar.f2067d && this.f2068e == iVar.f2068e && this.f2069f == iVar.f2069f && this.f2070g == iVar.f2070g && this.h == iVar.h && this.i == iVar.i && kotlin.s.c.l.a(this.j, iVar.j) && kotlin.s.c.l.a(this.k, iVar.k);
    }

    public final l<g, o> f() {
        return this.j;
    }

    public final int g() {
        return this.f2067d;
    }

    public final int h() {
        return this.f2069f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int I = e.a.a.a.a.I(this.h, e.a.a.a.a.I(this.f2070g, e.a.a.a.a.I(this.f2069f, e.a.a.a.a.I(this.f2068e, e.a.a.a.a.I(this.f2067d, (this.f2066c.hashCode() + e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31);
        boolean z = this.i;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (I + i) * 31;
        l<g, o> lVar = this.j;
        int hashCode = (i2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        p<Throwable, Long, o> pVar = this.k;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String i() {
        return this.b;
    }

    public final int j() {
        return this.f2070g;
    }

    public final boolean k() {
        return this.i;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ImageRequest(context=");
        M.append(this.a);
        M.append(", url=");
        M.append(this.b);
        M.append(", imageView=");
        M.append(this.f2066c);
        M.append(", placeholderResId=");
        M.append(this.f2067d);
        M.append(", errorResId=");
        M.append(this.f2068e);
        M.append(", radiusDp=");
        M.append(this.f2069f);
        M.append(", width=");
        M.append(this.f2070g);
        M.append(", height=");
        M.append(this.h);
        M.append(", isCircleCrop=");
        M.append(this.i);
        M.append(", onSuccess=");
        M.append(this.j);
        M.append(", onFailure=");
        M.append(this.k);
        M.append(')');
        return M.toString();
    }
}
