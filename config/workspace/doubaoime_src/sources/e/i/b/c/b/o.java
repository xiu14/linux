package e.i.b.c.b;

import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class o {
    private int a;
    private float b;

    /* renamed from: c, reason: collision with root package name */
    private float f10023c;

    /* renamed from: d, reason: collision with root package name */
    private float f10024d;

    /* renamed from: e, reason: collision with root package name */
    private float f10025e;

    /* renamed from: f, reason: collision with root package name */
    private Paint f10026f;

    /* renamed from: g, reason: collision with root package name */
    private float f10027g;

    public o(int i, float f2, float f3, float f4, float f5) {
        Paint paint = new Paint(1);
        kotlin.s.c.l.f(paint, "paint");
        this.a = i;
        this.b = f2;
        this.f10023c = f3;
        this.f10024d = f4;
        this.f10025e = f5;
        this.f10026f = paint;
        this.f10027g = 0.0f;
    }

    public final int a() {
        return this.a;
    }

    public final float b() {
        return this.f10027g;
    }

    public final float c() {
        return this.f10023c;
    }

    public final float d() {
        return this.f10024d;
    }

    public final Paint e() {
        return this.f10026f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a == oVar.a && Float.compare(this.b, oVar.b) == 0 && Float.compare(this.f10023c, oVar.f10023c) == 0 && Float.compare(this.f10024d, oVar.f10024d) == 0 && Float.compare(this.f10025e, oVar.f10025e) == 0 && kotlin.s.c.l.a(this.f10026f, oVar.f10026f) && Float.compare(this.f10027g, oVar.f10027g) == 0;
    }

    public final float f() {
        return this.b;
    }

    public final float g() {
        return this.f10025e;
    }

    public final void h(int i) {
        this.a = i;
    }

    public int hashCode() {
        int x = e.a.a.a.a.x(this.f10025e, e.a.a.a.a.x(this.f10024d, e.a.a.a.a.x(this.f10023c, e.a.a.a.a.x(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        Paint paint = this.f10026f;
        return Float.hashCode(this.f10027g) + ((x + (paint != null ? paint.hashCode() : 0)) * 31);
    }

    public final void i(float f2) {
        this.f10023c = f2;
    }

    public final void j(float f2) {
        this.f10024d = f2;
    }

    public final void k(float f2) {
        this.b = f2;
    }

    public final void l(float f2) {
        this.f10025e = f2;
    }

    public final boolean m() {
        return (this.f10023c == 0.0f && this.f10024d == 0.0f && this.b == 0.0f && this.f10025e == 0.0f) ? false : true;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Shadow(color=");
        M.append(this.a);
        M.append(", radius=");
        M.append(this.b);
        M.append(", offsetX=");
        M.append(this.f10023c);
        M.append(", offsetY=");
        M.append(this.f10024d);
        M.append(", spread=");
        M.append(this.f10025e);
        M.append(", paint=");
        M.append(this.f10026f);
        M.append(", cornerRadius=");
        M.append(this.f10027g);
        M.append(")");
        return M.toString();
    }
}
