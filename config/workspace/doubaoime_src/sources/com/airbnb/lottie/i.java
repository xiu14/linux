package com.airbnb.lottie;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.Layer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends Drawable implements Drawable.Callback, Animatable {
    private final Matrix a = new Matrix();
    private com.airbnb.lottie.g b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.y.e f1270c;

    /* renamed from: d, reason: collision with root package name */
    private float f1271d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1272e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1273f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1274g;
    private final ArrayList<q> h;
    private final ValueAnimator.AnimatorUpdateListener i;

    @Nullable
    private com.airbnb.lottie.w.b j;

    @Nullable
    private String k;

    @Nullable
    private com.airbnb.lottie.b l;

    @Nullable
    private com.airbnb.lottie.w.a m;
    private boolean n;

    @Nullable
    private com.airbnb.lottie.model.layer.c o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;

    class a implements q {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.H(this.a);
        }
    }

    class b implements q {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1275c;

        b(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.f1275c = z;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.I(this.a, this.b, this.f1275c);
        }
    }

    class c implements q {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.G(this.a, this.b);
        }
    }

    class d implements q {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        d(float f2, float f3) {
            this.a = f2;
            this.b = f3;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.J(this.a, this.b);
        }
    }

    class e implements q {
        final /* synthetic */ int a;

        e(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.z(this.a);
        }
    }

    class f implements q {
        final /* synthetic */ float a;

        f(float f2) {
            this.a = f2;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.P(this.a);
        }
    }

    class g implements q {
        final /* synthetic */ com.airbnb.lottie.model.d a;
        final /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.airbnb.lottie.z.c f1279c;

        g(com.airbnb.lottie.model.d dVar, Object obj, com.airbnb.lottie.z.c cVar) {
            this.a = dVar;
            this.b = obj;
            this.f1279c = cVar;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.c(this.a, this.b, this.f1279c);
        }
    }

    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (i.this.o != null) {
                i.this.o.t(i.this.f1270c.h());
            }
        }
    }

    /* renamed from: com.airbnb.lottie.i$i, reason: collision with other inner class name */
    class C0017i implements q {
        C0017i() {
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.u();
        }
    }

    class j implements q {
        j() {
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.v();
        }
    }

    class k implements q {
        final /* synthetic */ int a;

        k(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.K(this.a);
        }
    }

    class l implements q {
        final /* synthetic */ float a;

        l(float f2) {
            this.a = f2;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.M(this.a);
        }
    }

    class m implements q {
        final /* synthetic */ int a;

        m(int i) {
            this.a = i;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.D(this.a);
        }
    }

    class n implements q {
        final /* synthetic */ float a;

        n(float f2) {
            this.a = f2;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.F(this.a);
        }
    }

    class o implements q {
        final /* synthetic */ String a;

        o(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.L(this.a);
        }
    }

    class p implements q {
        final /* synthetic */ String a;

        p(String str) {
            this.a = str;
        }

        @Override // com.airbnb.lottie.i.q
        public void a(com.airbnb.lottie.g gVar) {
            i.this.E(this.a);
        }
    }

    private interface q {
        void a(com.airbnb.lottie.g gVar);
    }

    public i() {
        com.airbnb.lottie.y.e eVar = new com.airbnb.lottie.y.e();
        this.f1270c = eVar;
        this.f1271d = 1.0f;
        this.f1272e = true;
        this.f1273f = false;
        this.f1274g = false;
        this.h = new ArrayList<>();
        h hVar = new h();
        this.i = hVar;
        this.p = 255;
        this.t = true;
        this.u = false;
        eVar.addUpdateListener(hVar);
    }

    private boolean d() {
        return this.f1272e || this.f1273f;
    }

    private void e() {
        com.airbnb.lottie.g gVar = this.b;
        int i = com.airbnb.lottie.x.s.f1446d;
        Rect b2 = gVar.b();
        com.airbnb.lottie.model.layer.c cVar = new com.airbnb.lottie.model.layer.c(this, new Layer(Collections.emptyList(), gVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new com.airbnb.lottie.model.i.l(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, b2.width(), b2.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false), this.b.k(), this.b);
        this.o = cVar;
        if (this.r) {
            cVar.r(true);
        }
    }

    private void h(@NonNull Canvas canvas) {
        float f2;
        float f3;
        com.airbnb.lottie.g gVar = this.b;
        boolean z = true;
        if (gVar != null && !getBounds().isEmpty()) {
            Rect bounds = getBounds();
            float width = bounds.width() / bounds.height();
            Rect b2 = gVar.b();
            if (width != b2.width() / b2.height()) {
                z = false;
            }
        }
        int i = -1;
        if (z) {
            if (this.o == null) {
                return;
            }
            float f4 = this.f1271d;
            float min = Math.min(canvas.getWidth() / this.b.b().width(), canvas.getHeight() / this.b.b().height());
            if (f4 > min) {
                f2 = this.f1271d / min;
            } else {
                min = f4;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                i = canvas.save();
                float width2 = this.b.b().width() / 2.0f;
                float height = this.b.b().height() / 2.0f;
                float f5 = width2 * min;
                float f6 = height * min;
                float f7 = this.f1271d;
                canvas.translate((width2 * f7) - f5, (f7 * height) - f6);
                canvas.scale(f2, f2, f5, f6);
            }
            this.a.reset();
            this.a.preScale(min, min);
            this.o.f(canvas, this.a, this.p);
            if (i > 0) {
                canvas.restoreToCount(i);
                return;
            }
            return;
        }
        if (this.o == null) {
            return;
        }
        Rect bounds2 = getBounds();
        float width3 = bounds2.width() / this.b.b().width();
        float height2 = bounds2.height() / this.b.b().height();
        if (this.t) {
            float min2 = Math.min(width3, height2);
            if (min2 < 1.0f) {
                f3 = 1.0f / min2;
                width3 /= f3;
                height2 /= f3;
            } else {
                f3 = 1.0f;
            }
            if (f3 > 1.0f) {
                i = canvas.save();
                float width4 = bounds2.width() / 2.0f;
                float height3 = bounds2.height() / 2.0f;
                float f8 = width4 * min2;
                float f9 = min2 * height3;
                canvas.translate(width4 - f8, height3 - f9);
                canvas.scale(f3, f3, f8, f9);
            }
        }
        this.a.reset();
        this.a.preScale(width3, height2);
        this.o.f(canvas, this.a, this.p);
        if (i > 0) {
            canvas.restoreToCount(i);
        }
    }

    public void A(boolean z) {
        this.f1273f = z;
    }

    public void B(com.airbnb.lottie.b bVar) {
        this.l = bVar;
        com.airbnb.lottie.w.b bVar2 = this.j;
        if (bVar2 != null) {
            bVar2.d(bVar);
        }
    }

    public void C(@Nullable String str) {
        this.k = str;
    }

    public void D(int i) {
        if (this.b == null) {
            this.h.add(new m(i));
        } else {
            this.f1270c.t(i + 0.99f);
        }
    }

    public void E(String str) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new p(str));
            return;
        }
        com.airbnb.lottie.model.g l2 = gVar.l(str);
        if (l2 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("Cannot find marker with name ", str, "."));
        }
        D((int) (l2.b + l2.f1339c));
    }

    public void F(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new n(f2));
        } else {
            D((int) com.airbnb.lottie.y.g.f(gVar.p(), this.b.f(), f2));
        }
    }

    public void G(int i, int i2) {
        if (this.b == null) {
            this.h.add(new c(i, i2));
        } else {
            this.f1270c.u(i, i2 + 0.99f);
        }
    }

    public void H(String str) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new a(str));
            return;
        }
        com.airbnb.lottie.model.g l2 = gVar.l(str);
        if (l2 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("Cannot find marker with name ", str, "."));
        }
        int i = (int) l2.b;
        G(i, ((int) l2.f1339c) + i);
    }

    public void I(String str, String str2, boolean z) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new b(str, str2, z));
            return;
        }
        com.airbnb.lottie.model.g l2 = gVar.l(str);
        if (l2 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("Cannot find marker with name ", str, "."));
        }
        int i = (int) l2.b;
        com.airbnb.lottie.model.g l3 = this.b.l(str2);
        if (l3 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("Cannot find marker with name ", str2, "."));
        }
        G(i, (int) (l3.b + (z ? 1.0f : 0.0f)));
    }

    public void J(@FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new d(f2, f3));
        } else {
            G((int) com.airbnb.lottie.y.g.f(gVar.p(), this.b.f(), f2), (int) com.airbnb.lottie.y.g.f(this.b.p(), this.b.f(), f3));
        }
    }

    public void K(int i) {
        if (this.b == null) {
            this.h.add(new k(i));
        } else {
            this.f1270c.v(i);
        }
    }

    public void L(String str) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new o(str));
            return;
        }
        com.airbnb.lottie.model.g l2 = gVar.l(str);
        if (l2 == null) {
            throw new IllegalArgumentException(e.a.a.a.a.t("Cannot find marker with name ", str, "."));
        }
        K((int) l2.b);
    }

    public void M(float f2) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new l(f2));
        } else {
            K((int) com.airbnb.lottie.y.g.f(gVar.p(), this.b.f(), f2));
        }
    }

    public void N(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        com.airbnb.lottie.model.layer.c cVar = this.o;
        if (cVar != null) {
            cVar.r(z);
        }
    }

    public void O(boolean z) {
        this.q = z;
        com.airbnb.lottie.g gVar = this.b;
        if (gVar != null) {
            gVar.v(z);
        }
    }

    public void P(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        com.airbnb.lottie.g gVar = this.b;
        if (gVar == null) {
            this.h.add(new f(f2));
        } else {
            this.f1270c.s(gVar.h(f2));
            com.airbnb.lottie.d.a("Drawable#setProgress");
        }
    }

    public void Q(int i) {
        this.f1270c.setRepeatCount(i);
    }

    public void R(int i) {
        this.f1270c.setRepeatMode(i);
    }

    public void S(boolean z) {
        this.f1274g = z;
    }

    public void T(float f2) {
        this.f1271d = f2;
    }

    public void U(float f2) {
        this.f1270c.w(f2);
    }

    void V(Boolean bool) {
        this.f1272e = bool.booleanValue();
    }

    public boolean W() {
        return this.b.c().size() > 0;
    }

    public <T> void c(com.airbnb.lottie.model.d dVar, T t, @Nullable com.airbnb.lottie.z.c<T> cVar) {
        List list;
        com.airbnb.lottie.model.layer.c cVar2 = this.o;
        if (cVar2 == null) {
            this.h.add(new g(dVar, t, cVar));
            return;
        }
        boolean z = true;
        if (dVar == com.airbnb.lottie.model.d.f1338c) {
            cVar2.g(t, cVar);
        } else if (dVar.d() != null) {
            dVar.d().g(t, cVar);
        } else {
            if (this.o == null) {
                com.airbnb.lottie.y.d.c("Cannot resolve KeyPath. Composition is not set yet.");
                list = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList();
                this.o.c(dVar, 0, arrayList, new com.airbnb.lottie.model.d(new String[0]));
                list = arrayList;
            }
            for (int i = 0; i < list.size(); i++) {
                ((com.airbnb.lottie.model.d) list.get(i)).d().g(t, cVar);
            }
            z = true ^ list.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == com.airbnb.lottie.n.C) {
                P(this.f1270c.h());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.u = false;
        if (this.f1274g) {
            try {
                h(canvas);
            } catch (Throwable th) {
                com.airbnb.lottie.y.d.b("Lottie crashed in draw!", th);
            }
        } else {
            h(canvas);
        }
        com.airbnb.lottie.d.a("Drawable#draw");
    }

    public void f() {
        this.h.clear();
        this.f1270c.cancel();
    }

    public void g() {
        if (this.f1270c.isRunning()) {
            this.f1270c.cancel();
        }
        this.b = null;
        this.o = null;
        this.j = null;
        this.f1270c.f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.b == null) {
            return -1;
        }
        return (int) (r0.b().height() * this.f1271d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.b == null) {
            return -1;
        }
        return (int) (r0.b().width() * this.f1271d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void i(boolean z) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (this.b != null) {
            e();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.u) {
            return;
        }
        this.u = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return r();
    }

    public boolean j() {
        return this.n;
    }

    public com.airbnb.lottie.g k() {
        return this.b;
    }

    @Nullable
    public Bitmap l(String str) {
        com.airbnb.lottie.w.b bVar;
        if (getCallback() == null) {
            bVar = null;
        } else {
            com.airbnb.lottie.w.b bVar2 = this.j;
            if (bVar2 != null) {
                Drawable.Callback callback = getCallback();
                if (!bVar2.b((callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null)) {
                    this.j = null;
                }
            }
            if (this.j == null) {
                this.j = new com.airbnb.lottie.w.b(getCallback(), this.k, this.l, this.b.j());
            }
            bVar = this.j;
        }
        if (bVar != null) {
            return bVar.a(str);
        }
        com.airbnb.lottie.g gVar = this.b;
        com.airbnb.lottie.j jVar = gVar == null ? null : gVar.j().get(str);
        if (jVar != null) {
            return jVar.a();
        }
        return null;
    }

    @Nullable
    public String m() {
        return this.k;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float n() {
        return this.f1270c.h();
    }

    public int o() {
        return this.f1270c.getRepeatCount();
    }

    @SuppressLint({"WrongConstant"})
    public int p() {
        return this.f1270c.getRepeatMode();
    }

    @Nullable
    public Typeface q(String str, String str2) {
        com.airbnb.lottie.w.a aVar;
        if (getCallback() == null) {
            aVar = null;
        } else {
            if (this.m == null) {
                this.m = new com.airbnb.lottie.w.a(getCallback());
            }
            aVar = this.m;
        }
        if (aVar != null) {
            return aVar.a(str, str2);
        }
        return null;
    }

    public boolean r() {
        com.airbnb.lottie.y.e eVar = this.f1270c;
        if (eVar == null) {
            return false;
        }
        return eVar.isRunning();
    }

    public boolean s() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        com.airbnb.lottie.y.d.c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        u();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        this.h.clear();
        this.f1270c.g();
    }

    public void t() {
        this.h.clear();
        this.f1270c.m();
    }

    @MainThread
    public void u() {
        if (this.o == null) {
            this.h.add(new C0017i());
            return;
        }
        if (d() || o() == 0) {
            this.f1270c.n();
        }
        if (d()) {
            return;
        }
        z((int) (this.f1270c.k() < 0.0f ? this.f1270c.j() : this.f1270c.i()));
        this.f1270c.g();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @MainThread
    public void v() {
        if (this.o == null) {
            this.h.add(new j());
            return;
        }
        if (d() || o() == 0) {
            this.f1270c.q();
        }
        if (d()) {
            return;
        }
        z((int) (this.f1270c.k() < 0.0f ? this.f1270c.j() : this.f1270c.i()));
        this.f1270c.g();
    }

    public void w(boolean z) {
        this.s = z;
    }

    public boolean x(com.airbnb.lottie.g gVar) {
        if (this.b == gVar) {
            return false;
        }
        this.u = false;
        g();
        this.b = gVar;
        e();
        this.f1270c.r(gVar);
        P(this.f1270c.getAnimatedFraction());
        this.f1271d = this.f1271d;
        Iterator it2 = new ArrayList(this.h).iterator();
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            if (qVar != null) {
                qVar.a(gVar);
            }
            it2.remove();
        }
        this.h.clear();
        gVar.v(this.q);
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    public void y(com.airbnb.lottie.a aVar) {
        com.airbnb.lottie.w.a aVar2 = this.m;
        if (aVar2 != null) {
            Objects.requireNonNull(aVar2);
        }
    }

    public void z(int i) {
        if (this.b == null) {
            this.h.add(new e(i));
        } else {
            this.f1270c.s(i);
        }
    }
}
