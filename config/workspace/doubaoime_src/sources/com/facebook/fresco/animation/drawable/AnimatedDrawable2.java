package com.facebook.fresco.animation.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.facebook.drawee.drawable.C0717e;
import e.c.f.a.c.b;
import e.c.f.a.c.c;
import e.c.g.d;
import java.util.Objects;

/* loaded from: classes2.dex */
public class AnimatedDrawable2 extends Drawable implements Animatable, e.c.d.a.a {
    private static final Class<?> p = AnimatedDrawable2.class;
    private static final com.facebook.fresco.animation.drawable.a q = new com.facebook.fresco.animation.drawable.a();
    private static c r;
    private e.c.f.a.a.a a;
    private b b;

    /* renamed from: c, reason: collision with root package name */
    private e.c.f.a.b.b f6422c;

    /* renamed from: d, reason: collision with root package name */
    private d f6423d;

    /* renamed from: e, reason: collision with root package name */
    private Object f6424e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f6425f;

    /* renamed from: g, reason: collision with root package name */
    private long f6426g;
    private long h;
    private long i;
    private int j;
    private long k;
    private int l;
    private volatile com.facebook.fresco.animation.drawable.a m;
    private C0717e n;
    private final Runnable o;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AnimatedDrawable2 animatedDrawable2 = AnimatedDrawable2.this;
            animatedDrawable2.unscheduleSelf(animatedDrawable2.o);
            AnimatedDrawable2.this.invalidateSelf();
        }
    }

    public AnimatedDrawable2() {
        this.f6423d = d.b;
        this.k = 8L;
        this.m = q;
        this.o = new a();
        this.a = null;
        this.b = c(null, null, 0, this.f6423d);
    }

    private static b c(e.c.f.a.a.a aVar, Object obj, int i, d dVar) {
        if (aVar == null) {
            return null;
        }
        if (e.c.g.c.b(dVar)) {
            return new e.c.f.a.c.a(aVar, i);
        }
        c cVar = r;
        if (cVar != null) {
            cVar.a(aVar, obj, dVar, i);
        }
        return new e.c.f.a.c.d(aVar, i);
    }

    public static void f(c cVar) {
        r = cVar;
    }

    @Override // e.c.d.a.a
    public void a() {
        e.c.f.a.a.a aVar = this.a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    public e.c.f.a.a.a d() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a == null || this.b == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long max = this.f6425f ? (uptimeMillis - this.f6426g) + 0 : Math.max(this.h, 0L);
        int c2 = this.b.c(max, this.h);
        if (c2 == -1) {
            c2 = this.a.a() - 1;
            Objects.requireNonNull(this.m);
            this.f6425f = false;
        } else if (c2 == 0 && this.j != -1 && uptimeMillis >= this.i) {
            Objects.requireNonNull(this.m);
        }
        boolean k = this.a.k(this, canvas, c2);
        if (k) {
            Objects.requireNonNull(this.m);
            this.j = c2;
        }
        if (!k) {
            this.l++;
            if (e.c.c.e.a.m(2)) {
                e.c.c.e.a.n(p, "Dropped a frame. Count: %s", Integer.valueOf(this.l));
            }
        }
        long uptimeMillis2 = SystemClock.uptimeMillis();
        if (this.f6425f) {
            this.b.d(this.f6426g);
            long a2 = this.b.a(uptimeMillis2 - this.f6426g);
            if (a2 != -1) {
                long j = this.f6426g + a2 + this.k;
                this.i = j;
                scheduleSelf(this.o, j);
            }
        }
        this.h = max;
    }

    public e.c.f.a.b.b e() {
        return this.f6422c;
    }

    public void g(e.c.f.a.a.a aVar, Object obj, int i) {
        this.a = aVar;
        if (this.b != null) {
            b c2 = c(aVar, obj, i, this.f6423d);
            b b = this.b.b(c2);
            if (b != null) {
                c2 = b;
            }
            this.b = c2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        e.c.f.a.a.a aVar = this.a;
        return aVar == null ? super.getIntrinsicHeight() : aVar.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        e.c.f.a.a.a aVar = this.a;
        return aVar == null ? super.getIntrinsicWidth() : aVar.j();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f6425f;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e.c.f.a.a.a aVar = this.a;
        if (aVar != null) {
            aVar.i(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.f6425f) {
            return false;
        }
        long j = i;
        if (this.h == j) {
            return false;
        }
        this.h = j;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.n == null) {
            this.n = new C0717e();
        }
        this.n.b(i);
        e.c.f.a.a.a aVar = this.a;
        if (aVar != null) {
            aVar.g(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.n == null) {
            this.n = new C0717e();
        }
        this.n.c(colorFilter);
        e.c.f.a.a.a aVar = this.a;
        if (aVar != null) {
            aVar.e(colorFilter);
        }
    }

    @Keep
    public void setPrivateFrameScheduler(b bVar) {
        if (bVar != null) {
            this.b = bVar;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        e.c.f.a.a.a aVar;
        if (this.f6425f || (aVar = this.a) == null || aVar.a() <= 1) {
            return;
        }
        this.f6425f = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f6426g = uptimeMillis;
        this.i = uptimeMillis;
        this.h = -1L;
        this.j = -1;
        invalidateSelf();
        Objects.requireNonNull(this.m);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f6425f) {
            this.f6425f = false;
            this.f6426g = 0L;
            this.i = 0L;
            this.h = -1L;
            this.j = -1;
            unscheduleSelf(this.o);
            Objects.requireNonNull(this.m);
        }
    }

    public AnimatedDrawable2(e.c.f.a.a.a aVar, Object obj, e.c.f.a.b.b bVar, int i, d dVar) {
        this.f6423d = d.b;
        this.k = 8L;
        this.m = q;
        this.o = new a();
        this.a = aVar;
        this.f6423d = dVar;
        this.b = c(aVar, obj, i, dVar);
        this.f6422c = bVar;
        this.f6424e = obj;
    }
}
