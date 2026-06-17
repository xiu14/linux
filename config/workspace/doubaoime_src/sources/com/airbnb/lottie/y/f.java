package com.airbnb.lottie.y;

/* loaded from: classes.dex */
public class f {
    private float a;
    private int b;

    public void a(float f2) {
        float f3 = this.a + f2;
        this.a = f3;
        int i = this.b + 1;
        this.b = i;
        if (i == Integer.MAX_VALUE) {
            this.a = f3 / 2.0f;
            this.b = i / 2;
        }
    }
}
