package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class c {
    private final float[] a;
    private final int[] b;

    public c(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(c cVar, c cVar2, float f2) {
        if (cVar.b.length != cVar2.b.length) {
            StringBuilder M = e.a.a.a.a.M("Cannot interpolate between gradients. Lengths vary (");
            M.append(cVar.b.length);
            M.append(" vs ");
            throw new IllegalArgumentException(e.a.a.a.a.D(M, cVar2.b.length, ")"));
        }
        for (int i = 0; i < cVar.b.length; i++) {
            this.a[i] = com.airbnb.lottie.y.g.f(cVar.a[i], cVar2.a[i], f2);
            this.b[i] = com.airbnb.lottie.y.b.c(f2, cVar.b[i], cVar2.b[i]);
        }
    }
}
