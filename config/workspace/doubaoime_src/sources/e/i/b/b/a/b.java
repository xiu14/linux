package e.i.b.b.a;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b {
    private boolean a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9972d;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9975g;
    private float j;
    private float b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private float f9971c = -3.4028235E38f;

    /* renamed from: e, reason: collision with root package name */
    private float f9973e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    private float f9974f = 0.5f;
    private float h = 1500.0f;
    private float i = 1500.0f;

    public b(float f2) {
        this.j = f2;
    }

    public final void a(e.i.b.b.b.d dVar) {
        l.f(dVar, "animation");
        dVar.j(this.f9971c);
        dVar.i(Float.MAX_VALUE);
        if (this.a) {
            dVar.l(this.b);
        }
        if (dVar.o() == null) {
            dVar.p(new e.i.b.b.b.e());
        }
        e.i.b.b.b.e o = dVar.o();
        l.e(o, "animation.spring");
        o.c(this.f9972d ? this.f9974f : this.f9973e);
        e.i.b.b.b.e o2 = dVar.o();
        l.e(o2, "animation.spring");
        o2.e(this.f9975g ? this.i : this.h);
        e.i.b.b.b.e o3 = dVar.o();
        l.e(o3, "animation.spring");
        o3.d(this.j);
        dVar.e();
        dVar.e();
    }

    public final void b(float f2) {
        this.f9972d = true;
        this.f9974f = f2;
    }

    public final void c(float f2) {
        this.f9973e = f2;
    }

    public final void d(float f2) {
        this.h = f2;
    }

    public final void e(float f2) {
        this.a = true;
        this.b = f2;
    }

    public final void f(float f2) {
        this.f9975g = true;
        this.i = f2;
    }
}
