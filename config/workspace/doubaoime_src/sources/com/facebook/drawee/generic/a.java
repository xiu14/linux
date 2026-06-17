package com.facebook.drawee.generic;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.drawee.drawable.InterfaceC0716d;
import com.facebook.drawee.drawable.f;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements e.c.e.e.c {
    private final Drawable a;
    private final Resources b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6398c;

    /* renamed from: d, reason: collision with root package name */
    private RoundingParams f6399d;

    /* renamed from: e, reason: collision with root package name */
    private final d f6400e;

    /* renamed from: f, reason: collision with root package name */
    private final f f6401f;

    /* renamed from: g, reason: collision with root package name */
    private final g f6402g;

    /* renamed from: com.facebook.drawee.generic.a$a, reason: collision with other inner class name */
    class RunnableC0325a implements Runnable {
        final /* synthetic */ Drawable a;
        final /* synthetic */ q b;

        RunnableC0325a(Drawable drawable, q qVar) {
            this.a = drawable;
            this.b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.u(1, this.a);
            a.this.r(1).u(this.b);
        }
    }

    a(b bVar) {
        int i = 0;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.a = colorDrawable;
        e.c.h.m.b.b();
        this.b = bVar.o();
        this.f6398c = bVar.d();
        this.f6399d = bVar.r();
        g gVar = new g(colorDrawable);
        this.f6402g = gVar;
        int i2 = 1;
        int size = bVar.i() != null ? bVar.i().size() : 1;
        int i3 = (size == 0 ? 1 : size) + (bVar.l() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[i3 + 6];
        drawableArr[0] = j(bVar.c(), null);
        drawableArr[1] = j(bVar.j(), bVar.k());
        q b = bVar.b();
        gVar.setColorFilter(null);
        drawableArr[2] = e.e(gVar, b, null);
        drawableArr[3] = j(bVar.m(), bVar.n());
        drawableArr[4] = j(bVar.p(), bVar.q());
        drawableArr[5] = j(bVar.g(), bVar.h());
        if (i3 > 0) {
            if (bVar.i() != null) {
                Iterator<Drawable> it2 = bVar.i().iterator();
                while (it2.hasNext()) {
                    drawableArr[i + 6] = j(it2.next(), null);
                    i++;
                }
                i2 = i;
            }
            if (bVar.l() != null) {
                drawableArr[i2 + 6] = j(bVar.l(), null);
            }
        }
        f fVar = new f(drawableArr);
        this.f6401f = fVar;
        fVar.o(bVar.f());
        d dVar = new d(e.d(fVar, this.f6399d));
        this.f6400e = dVar;
        dVar.mutate();
        s();
        e.c.h.m.b.b();
    }

    private Drawable j(Drawable drawable, q qVar) {
        Context context = this.f6398c;
        return e.e(context == null ? e.c(drawable, this.f6399d, this.b) : e.c(drawable, this.f6399d, context.getResources()), qVar, null);
    }

    private void k(int i) {
        if (i >= 0) {
            this.f6401f.k(i);
        }
    }

    private void l() {
        m(1);
        m(2);
        m(3);
        m(4);
        m(5);
    }

    private void m(int i) {
        if (i >= 0) {
            this.f6401f.l(i);
        }
    }

    private InterfaceC0716d p(int i) {
        InterfaceC0716d c2 = this.f6401f.c(i);
        if (c2.l() instanceof h) {
            c2 = (h) c2.l();
        }
        return c2.l() instanceof o ? (o) c2.l() : c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o r(int i) {
        InterfaceC0716d p = p(i);
        return p instanceof o ? (o) p : e.h(p, q.a);
    }

    private void s() {
        f fVar = this.f6401f;
        if (fVar != null) {
            fVar.g();
            this.f6401f.j();
            l();
            k(1);
            this.f6401f.m();
            this.f6401f.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(int i, Drawable drawable) {
        if (drawable == null) {
            this.f6401f.f(i, null);
        } else {
            Context context = this.f6398c;
            p(i).g(context == null ? e.c(drawable, this.f6399d, this.b) : e.c(drawable, this.f6399d, context.getResources()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void y(float f2) {
        Drawable a = this.f6401f.a(3);
        if (a == 0) {
            return;
        }
        if (f2 >= 0.999f) {
            if (a instanceof Animatable) {
                ((Animatable) a).stop();
            }
            m(3);
        } else {
            if (a instanceof Animatable) {
                ((Animatable) a).start();
            }
            k(3);
        }
        a.setLevel(Math.round(f2 * 10000.0f));
    }

    @Override // e.c.e.e.b
    public Rect a() {
        return this.f6400e.getBounds();
    }

    @Override // e.c.e.e.c
    public void b(Drawable drawable) {
        d dVar = this.f6400e;
        dVar.f6409d = drawable;
        dVar.invalidateSelf();
    }

    @Override // e.c.e.e.c
    public void c(Throwable th) {
        this.f6401f.g();
        l();
        if (this.f6401f.a(4) != null) {
            k(4);
        } else {
            k(1);
        }
        this.f6401f.i();
    }

    @Override // e.c.e.e.c
    public void d(Throwable th) {
        this.f6401f.g();
        l();
        if (this.f6401f.a(5) != null) {
            k(5);
        } else {
            k(1);
        }
        this.f6401f.i();
    }

    @Override // e.c.e.e.c
    public void e(float f2, boolean z) {
        if (this.f6401f.a(3) == null) {
            return;
        }
        this.f6401f.g();
        y(f2);
        if (z) {
            this.f6401f.m();
        }
        this.f6401f.i();
    }

    @Override // e.c.e.e.b
    public Drawable f() {
        return this.f6400e;
    }

    @Override // e.c.e.e.c
    public void g(Drawable drawable, float f2, boolean z) {
        Context context = this.f6398c;
        Drawable c2 = context == null ? e.c(drawable, this.f6399d, this.b) : e.c(drawable, this.f6399d, context.getResources());
        c2.mutate();
        this.f6402g.o(c2);
        this.f6401f.g();
        l();
        k(2);
        y(f2);
        if (z) {
            this.f6401f.m();
        }
        this.f6401f.i();
    }

    public PointF n() {
        if (p(2) instanceof o) {
            return r(2).r();
        }
        return null;
    }

    public q o() {
        if (p(2) instanceof o) {
            return r(2).s();
        }
        return null;
    }

    public RoundingParams q() {
        return this.f6399d;
    }

    @Override // e.c.e.e.c
    public void reset() {
        this.f6402g.o(this.a);
        s();
    }

    public void t(q qVar) {
        Objects.requireNonNull(qVar);
        r(2).u(qVar);
    }

    public void v(int i) {
        Context context = this.f6398c;
        if (context == null) {
            u(1, this.b.getDrawable(i));
        } else {
            u(1, AppCompatResources.getDrawable(context, i));
        }
    }

    public void w(Drawable drawable) {
        u(1, drawable);
    }

    public void x(Drawable drawable, q qVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            u(1, drawable);
            r(1).u(qVar);
        } else {
            Context context = this.f6398c;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new RunnableC0325a(drawable, qVar));
            }
        }
    }

    public void z(RoundingParams roundingParams) {
        this.f6399d = roundingParams;
        e.g(this.f6400e, roundingParams);
        for (int i = 0; i < this.f6401f.e(); i++) {
            if (this.f6398c == null) {
                e.f(p(i), this.f6399d, this.b);
            } else {
                e.f(p(i), this.f6399d, this.f6398c.getResources());
            }
        }
    }
}
