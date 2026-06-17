package com.bytedance.frameworks.baselib.network.connectionclass;

/* loaded from: classes.dex */
class e {
    private final int a;
    private double b = -1.0d;

    /* renamed from: c, reason: collision with root package name */
    private int f5039c;

    public e(double d2) {
        this.a = d2 == 0.0d ? Integer.MAX_VALUE : (int) Math.ceil(1.0d / d2);
    }

    public void a(double d2) {
        int i = this.f5039c;
        if (i > this.a) {
            this.b = Math.exp((Math.log(d2) * 0.05d) + (Math.log(this.b) * 0.95d));
        } else if (i > 0) {
            double d3 = i;
            double d4 = (0.95d * d3) / (d3 + 1.0d);
            this.b = Math.exp((Math.log(d2) * (1.0d - d4)) + (Math.log(this.b) * d4));
        } else {
            this.b = d2;
        }
        this.f5039c++;
    }

    public double b() {
        return this.b;
    }
}
