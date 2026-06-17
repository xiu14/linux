package e.c.f.a.b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import e.c.f.a.a.c;
import e.c.f.a.a.d;

/* loaded from: classes2.dex */
public class a implements e.c.f.a.a.a, c.b {
    private final e.c.h.d.b a;
    private final b b;

    /* renamed from: c, reason: collision with root package name */
    private final d f9808c;

    /* renamed from: d, reason: collision with root package name */
    private final c f9809d;

    /* renamed from: e, reason: collision with root package name */
    private e.c.f.a.b.e.a f9810e;

    /* renamed from: f, reason: collision with root package name */
    private final e.c.f.a.b.e.b f9811f;
    private Rect h;
    private int i;
    private int j;
    private Bitmap.Config k = Bitmap.Config.ARGB_8888;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f9812g = new Paint(6);

    public a(e.c.h.d.b bVar, b bVar2, d dVar, c cVar, e.c.f.a.b.e.a aVar, e.c.f.a.b.e.b bVar3) {
        this.a = bVar;
        this.b = bVar2;
        this.f9808c = dVar;
        this.f9809d = cVar;
        this.f9810e = aVar;
        this.f9811f = bVar3;
        q();
    }

    private boolean l(int i, e.c.c.g.a<Bitmap> aVar, Canvas canvas, int i2) {
        if (!e.c.c.g.a.x(aVar)) {
            return false;
        }
        try {
            if (this.h == null) {
                canvas.drawBitmap(aVar.r(), 0.0f, 0.0f, this.f9812g);
            } else {
                canvas.drawBitmap(aVar.r(), (Rect) null, this.h, this.f9812g);
            }
        } catch (Exception e2) {
            e.c.c.e.a.f(a.class, "canvas draw error: ", e2);
        }
        if (i2 == 3) {
            return true;
        }
        this.b.e(i, aVar, i2);
        return true;
    }

    private boolean m(Canvas canvas, int i, int i2) {
        e.c.c.g.a<Bitmap> d2;
        boolean l;
        boolean z = false;
        int i3 = 1;
        AutoCloseable autoCloseable = null;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    d2 = this.b.a(i, this.i, this.j);
                    if (o(i, d2) && l(i, d2, canvas, 1)) {
                        z = true;
                    }
                    i3 = 2;
                } else if (i2 == 2) {
                    try {
                        d2 = this.a.a(this.i, this.j, this.k);
                        if (o(i, d2) && l(i, d2, canvas, 2)) {
                            z = true;
                        }
                        i3 = 3;
                    } catch (RuntimeException e2) {
                        e.c.c.e.a.u(a.class, "Failed to create frame bitmap", e2);
                        int i4 = e.c.c.g.a.h;
                        return false;
                    }
                } else {
                    if (i2 != 3) {
                        int i5 = e.c.c.g.a.h;
                        return false;
                    }
                    d2 = this.b.f(i);
                    l = l(i, d2, canvas, 3);
                    i3 = -1;
                }
                l = z;
            } else {
                d2 = this.b.d(i);
                l = l(i, d2, canvas, 0);
            }
            int i6 = e.c.c.g.a.h;
            if (d2 != null) {
                d2.close();
            }
            return (l || i3 == -1) ? l : m(canvas, i, i3);
        } catch (Throwable th) {
            int i7 = e.c.c.g.a.h;
            if (0 != 0) {
                autoCloseable.close();
            }
            throw th;
        }
    }

    private boolean o(int i, e.c.c.g.a<Bitmap> aVar) {
        if (!e.c.c.g.a.x(aVar)) {
            return false;
        }
        boolean d2 = ((e.c.f.a.b.f.b) this.f9809d).d(i, aVar.r());
        if (!d2) {
            aVar.close();
        }
        return d2;
    }

    private void q() {
        int c2 = ((e.c.f.a.b.f.b) this.f9809d).c();
        this.i = c2;
        if (c2 == -1) {
            Rect rect = this.h;
            this.i = rect == null ? -1 : rect.width();
        }
        int b = ((e.c.f.a.b.f.b) this.f9809d).b();
        this.j = b;
        if (b == -1) {
            Rect rect2 = this.h;
            this.j = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // e.c.f.a.a.d
    public int a() {
        return this.f9808c.a();
    }

    @Override // e.c.f.a.a.a
    public boolean b(int i) {
        return this.b.c(i);
    }

    @Override // e.c.f.a.a.d
    public int c() {
        return this.f9808c.c();
    }

    @Override // e.c.f.a.a.a
    public void clear() {
        this.b.clear();
    }

    @Override // e.c.f.a.a.c.b
    public void d() {
        this.b.clear();
    }

    @Override // e.c.f.a.a.a
    public void e(ColorFilter colorFilter) {
        this.f9812g.setColorFilter(colorFilter);
    }

    @Override // e.c.f.a.a.d
    public int f(int i) {
        return this.f9808c.f(i);
    }

    @Override // e.c.f.a.a.a
    public void g(@IntRange(from = 0, to = 255) int i) {
        this.f9812g.setAlpha(i);
    }

    @Override // e.c.f.a.a.a
    public int h() {
        return this.j;
    }

    @Override // e.c.f.a.a.a
    public void i(Rect rect) {
        this.h = rect;
        ((e.c.f.a.b.f.b) this.f9809d).e(rect);
        q();
    }

    @Override // e.c.f.a.a.a
    public int j() {
        return this.i;
    }

    @Override // e.c.f.a.a.a
    public boolean k(Drawable drawable, Canvas canvas, int i) {
        e.c.f.a.b.e.b bVar;
        boolean m = m(canvas, i, 0);
        e.c.f.a.b.e.a aVar = this.f9810e;
        if (aVar != null && (bVar = this.f9811f) != null) {
            ((e.c.f.a.b.e.d) aVar).a(bVar, this.b, this, i);
        }
        return m;
    }

    public d n() {
        return this.f9808c;
    }

    public void p(Bitmap.Config config) {
        this.k = config;
    }
}
