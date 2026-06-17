package e.i.b.b.b;

import e.i.b.b.b.b;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private double f9995d;

    /* renamed from: e, reason: collision with root package name */
    private double f9996e;

    /* renamed from: f, reason: collision with root package name */
    private double f9997f;

    /* renamed from: g, reason: collision with root package name */
    private double f9998g;
    private double h;
    double a = Math.sqrt(1500.0d);
    double b = 0.5d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9994c = false;
    private double i = Double.MAX_VALUE;
    private final b.i j = new b.i();

    public float a() {
        return (float) this.i;
    }

    public boolean b(float f2, float f3) {
        return ((double) Math.abs(f3)) < this.f9996e && ((double) Math.abs(f2 - ((float) this.i))) < this.f9995d;
    }

    public e c(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.b = f2;
        this.f9994c = false;
        return this;
    }

    public e d(float f2) {
        this.i = f2;
        return this;
    }

    public e e(float f2) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.a = Math.sqrt(f2);
        this.f9994c = false;
        return this;
    }

    void f(double d2) {
        double abs = Math.abs(d2);
        this.f9995d = abs;
        this.f9996e = abs * 62.5d;
    }

    b.i g(double d2, double d3, long j) {
        double cos;
        double d4;
        if (!this.f9994c) {
            if (this.i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d5 = this.b;
            if (d5 > 1.0d) {
                double d6 = this.a;
                this.f9997f = (Math.sqrt((d5 * d5) - 1.0d) * d6) + ((-d5) * d6);
                double d7 = this.b;
                double d8 = this.a;
                this.f9998g = ((-d7) * d8) - (Math.sqrt((d7 * d7) - 1.0d) * d8);
            } else if (d5 >= 0.0d && d5 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d5 * d5)) * this.a;
            }
            this.f9994c = true;
        }
        double d9 = j / 1000.0d;
        double d10 = d2 - this.i;
        double d11 = this.b;
        if (d11 > 1.0d) {
            double d12 = this.f9998g;
            double d13 = this.f9997f;
            double d14 = d10 - (((d12 * d10) - d3) / (d12 - d13));
            double d15 = ((d10 * d12) - d3) / (d12 - d13);
            d4 = (Math.pow(2.718281828459045d, this.f9997f * d9) * d15) + (Math.pow(2.718281828459045d, d12 * d9) * d14);
            double d16 = this.f9998g;
            double pow = Math.pow(2.718281828459045d, d16 * d9) * d14 * d16;
            double d17 = this.f9997f;
            cos = (Math.pow(2.718281828459045d, d17 * d9) * d15 * d17) + pow;
        } else if (d11 == 1.0d) {
            double d18 = this.a;
            double d19 = (d18 * d10) + d3;
            double d20 = (d19 * d9) + d10;
            double pow2 = Math.pow(2.718281828459045d, (-d18) * d9) * d20;
            double pow3 = Math.pow(2.718281828459045d, (-this.a) * d9) * d20;
            double d21 = this.a;
            cos = (Math.pow(2.718281828459045d, (-d21) * d9) * d19) + (pow3 * (-d21));
            d4 = pow2;
        } else {
            double d22 = 1.0d / this.h;
            double d23 = this.a;
            double d24 = ((d11 * d23 * d10) + d3) * d22;
            double sin = ((Math.sin(this.h * d9) * d24) + (Math.cos(this.h * d9) * d10)) * Math.pow(2.718281828459045d, (-d11) * d23 * d9);
            double d25 = this.a;
            double d26 = this.b;
            double d27 = (-d25) * sin * d26;
            double pow4 = Math.pow(2.718281828459045d, (-d26) * d25 * d9);
            double d28 = this.h;
            double sin2 = Math.sin(d28 * d9) * (-d28) * d10;
            double d29 = this.h;
            cos = (((Math.cos(d29 * d9) * d24 * d29) + sin2) * pow4) + d27;
            d4 = sin;
        }
        b.i iVar = this.j;
        iVar.a = (float) (d4 + this.i);
        iVar.b = (float) cos;
        return iVar;
    }
}
