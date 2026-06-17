package com.airbnb.lottie.z;

/* loaded from: classes.dex */
public class d {
    private float a;
    private float b;

    public d() {
        this.a = 1.0f;
        this.b = 1.0f;
    }

    public boolean a(float f2, float f3) {
        return this.a == f2 && this.b == f3;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public void d(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    public String toString() {
        return this.a + "x" + this.b;
    }

    public d(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }
}
