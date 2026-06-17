package com.obric.oui.shadow;

import android.graphics.Paint;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private int a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private float f8000c;

    /* renamed from: d, reason: collision with root package name */
    private float f8001d;

    /* renamed from: e, reason: collision with root package name */
    private float f8002e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f8003f;

    public a(int i, float f2, float f3, float f4, float f5, Paint paint, int i2) {
        Paint paint2 = (i2 & 32) != 0 ? new Paint(1) : null;
        l.f(paint2, "paint");
        this.a = i;
        this.b = f2;
        this.f8000c = f3;
        this.f8001d = f4;
        this.f8002e = f5;
        this.f8003f = paint2;
    }

    public final int a() {
        return this.a;
    }

    public final float b() {
        return this.f8000c;
    }

    public final float c() {
        return this.f8001d;
    }

    public final Paint d() {
        return this.f8003f;
    }

    public final float e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.f8000c, aVar.f8000c) == 0 && Float.compare(this.f8001d, aVar.f8001d) == 0 && Float.compare(this.f8002e, aVar.f8002e) == 0 && l.a(this.f8003f, aVar.f8003f);
    }

    public final float f() {
        return this.f8002e;
    }

    public final void g(int i) {
        this.a = i;
    }

    public final void h(float f2) {
        this.f8000c = f2;
    }

    public int hashCode() {
        int x = e.a.a.a.a.x(this.f8002e, e.a.a.a.a.x(this.f8001d, e.a.a.a.a.x(this.f8000c, e.a.a.a.a.x(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        Paint paint = this.f8003f;
        return x + (paint != null ? paint.hashCode() : 0);
    }

    public final void i(float f2) {
        this.f8001d = f2;
    }

    public final void j(float f2) {
        this.b = f2;
    }

    public final void k(float f2) {
        this.f8002e = f2;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Shadow(color=");
        M.append(this.a);
        M.append(", radius=");
        M.append(this.b);
        M.append(", offsetX=");
        M.append(this.f8000c);
        M.append(", offsetY=");
        M.append(this.f8001d);
        M.append(", spread=");
        M.append(this.f8002e);
        M.append(", paint=");
        M.append(this.f8003f);
        M.append(")");
        return M.toString();
    }
}
