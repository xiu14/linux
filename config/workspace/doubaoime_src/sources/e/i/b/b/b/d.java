package e.i.b.b.b;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import e.i.b.b.b.b;

/* loaded from: classes2.dex */
public final class d extends b<d> {
    private e t;
    private float u;
    private boolean v;

    public <K> d(K k, c<K> cVar) {
        super(k, cVar);
        this.t = null;
        this.u = Float.MAX_VALUE;
        this.v = false;
    }

    @Override // e.i.b.b.b.b
    boolean m(long j) {
        if (this.v) {
            float f2 = this.u;
            if (f2 != Float.MAX_VALUE) {
                this.t.d(f2);
                this.u = Float.MAX_VALUE;
            }
            this.b = this.t.a();
            this.a = 0.0f;
            this.v = false;
            return true;
        }
        if (this.u != Float.MAX_VALUE) {
            this.t.a();
            long j2 = j / 2;
            b.i g2 = this.t.g(this.b, this.a, j2);
            this.t.d(this.u);
            this.u = Float.MAX_VALUE;
            b.i g3 = this.t.g(g2.a, g2.b, j2);
            this.b = g3.a;
            this.a = g3.b;
        } else {
            b.i g4 = this.t.g(this.b, this.a, j);
            this.b = g4.a;
            this.a = g4.b;
        }
        float max = Math.max(this.b, this.h);
        this.b = max;
        float min = Math.min(max, this.f9993g);
        this.b = min;
        if (!this.t.b(min, this.a)) {
            return false;
        }
        this.b = this.t.a();
        this.a = 0.0f;
        return true;
    }

    public boolean n() {
        return this.t.b > 0.0d;
    }

    public e o() {
        return this.t;
    }

    public d p(e eVar) {
        this.t = eVar;
        return this;
    }

    public void q() {
        if (!(this.t.b > 0.0d)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f9992f) {
            this.v = true;
        }
    }

    public void r() {
        e eVar = this.t;
        if (eVar == null) {
            throw new UnsupportedOperationException("Incomplete com.obric.oui.animation.engine.SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a = eVar.a();
        if (a > this.f9993g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a < this.h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        this.t.f(d());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            long id = Thread.currentThread().getId();
            long id2 = Looper.getMainLooper().getThread().getId();
            StringBuilder Q = e.a.a.a.a.Q("Current Thread Id + ", id, " Main Thread Id + ");
            Q.append(id2);
            Log.e("DynamicAnimation", Q.toString());
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.f9992f;
        if (z || z) {
            return;
        }
        this.f9992f = true;
        if (!this.f9989c) {
            this.b = this.f9991e.a(this.f9990d);
        }
        float f2 = this.b;
        if (f2 > this.f9993g || f2 < this.h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        a.c().a(this, 0L);
    }
}
