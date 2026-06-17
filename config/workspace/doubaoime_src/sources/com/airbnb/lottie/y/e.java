package com.airbnb.lottie.y;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes.dex */
public class e extends a implements Choreographer.FrameCallback {

    @Nullable
    private com.airbnb.lottie.g j;

    /* renamed from: c, reason: collision with root package name */
    private float f1449c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1450d = false;

    /* renamed from: e, reason: collision with root package name */
    private long f1451e = 0;

    /* renamed from: f, reason: collision with root package name */
    private float f1452f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private int f1453g = 0;
    private float h = -2.14748365E9f;
    private float i = 2.14748365E9f;

    @VisibleForTesting
    protected boolean k = false;

    private boolean l() {
        return this.f1449c < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        a();
        p();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        o();
        com.airbnb.lottie.g gVar = this.j;
        if (gVar == null || !this.k) {
            return;
        }
        float i = (this.f1451e != 0 ? j - r1 : 0L) / ((1.0E9f / gVar.i()) / Math.abs(this.f1449c));
        float f2 = this.f1452f;
        if (l()) {
            i = -i;
        }
        float f3 = f2 + i;
        this.f1452f = f3;
        float j2 = j();
        float i2 = i();
        int i3 = g.b;
        boolean z = !(f3 >= j2 && f3 <= i2);
        this.f1452f = g.b(this.f1452f, j(), i());
        this.f1451e = j;
        e();
        if (z) {
            if (getRepeatCount() == -1 || this.f1453g < getRepeatCount()) {
                c();
                this.f1453g++;
                if (getRepeatMode() == 2) {
                    this.f1450d = !this.f1450d;
                    this.f1449c = -this.f1449c;
                } else {
                    this.f1452f = l() ? i() : j();
                }
                this.f1451e = j;
            } else {
                this.f1452f = this.f1449c < 0.0f ? j() : i();
                p();
                b(l());
            }
        }
        if (this.j != null) {
            float f4 = this.f1452f;
            if (f4 < this.h || f4 > this.i) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.f1452f)));
            }
        }
        com.airbnb.lottie.d.a("LottieValueAnimator#doFrame");
    }

    public void f() {
        this.j = null;
        this.h = -2.14748365E9f;
        this.i = 2.14748365E9f;
    }

    @MainThread
    public void g() {
        p();
        b(l());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float j;
        float i;
        float j2;
        if (this.j == null) {
            return 0.0f;
        }
        if (l()) {
            j = i() - this.f1452f;
            i = i();
            j2 = j();
        } else {
            j = this.f1452f - j();
            i = i();
            j2 = j();
        }
        return j / (i - j2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.g gVar = this.j;
        if (gVar == null) {
            return 0L;
        }
        return (long) gVar.d();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float h() {
        com.airbnb.lottie.g gVar = this.j;
        if (gVar == null) {
            return 0.0f;
        }
        return (this.f1452f - gVar.p()) / (this.j.f() - this.j.p());
    }

    public float i() {
        com.airbnb.lottie.g gVar = this.j;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.i;
        return f2 == 2.14748365E9f ? gVar.f() : f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.k;
    }

    public float j() {
        com.airbnb.lottie.g gVar = this.j;
        if (gVar == null) {
            return 0.0f;
        }
        float f2 = this.h;
        return f2 == -2.14748365E9f ? gVar.p() : f2;
    }

    public float k() {
        return this.f1449c;
    }

    @MainThread
    public void m() {
        p();
    }

    @MainThread
    public void n() {
        this.k = true;
        d(l());
        s((int) (l() ? i() : j()));
        this.f1451e = 0L;
        this.f1453g = 0;
        o();
    }

    protected void o() {
        if (this.k) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    protected void p() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.k = false;
    }

    @MainThread
    public void q() {
        this.k = true;
        o();
        this.f1451e = 0L;
        if (l() && this.f1452f == j()) {
            this.f1452f = i();
        } else {
            if (l() || this.f1452f != i()) {
                return;
            }
            this.f1452f = j();
        }
    }

    public void r(com.airbnb.lottie.g gVar) {
        boolean z = this.j == null;
        this.j = gVar;
        if (z) {
            u((int) Math.max(this.h, gVar.p()), (int) Math.min(this.i, gVar.f()));
        } else {
            u((int) gVar.p(), (int) gVar.f());
        }
        float f2 = this.f1452f;
        this.f1452f = 0.0f;
        s((int) f2);
        e();
    }

    public void s(float f2) {
        if (this.f1452f == f2) {
            return;
        }
        this.f1452f = g.b(f2, j(), i());
        this.f1451e = 0L;
        e();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f1450d) {
            return;
        }
        this.f1450d = false;
        this.f1449c = -this.f1449c;
    }

    public void t(float f2) {
        u(this.h, f2);
    }

    public void u(float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
        }
        com.airbnb.lottie.g gVar = this.j;
        float p = gVar == null ? -3.4028235E38f : gVar.p();
        com.airbnb.lottie.g gVar2 = this.j;
        float f4 = gVar2 == null ? Float.MAX_VALUE : gVar2.f();
        float b = g.b(f2, p, f4);
        float b2 = g.b(f3, p, f4);
        if (b == this.h && b2 == this.i) {
            return;
        }
        this.h = b;
        this.i = b2;
        s((int) g.b(this.f1452f, b, b2));
    }

    public void v(int i) {
        u(i, (int) this.i);
    }

    public void w(float f2) {
        this.f1449c = f2;
    }
}
