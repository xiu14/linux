package okhttp3.internal.http2;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o {
    private int a;
    private final int[] b = new int[10];

    void a() {
        this.a = 0;
        Arrays.fill(this.b, 0);
    }

    int b(int i) {
        return this.b[i];
    }

    int c() {
        if ((this.a & 2) != 0) {
            return this.b[1];
        }
        return -1;
    }

    int d() {
        if ((this.a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    int e(int i) {
        return (this.a & 16) != 0 ? this.b[4] : i;
    }

    int f(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    boolean g(int i) {
        return ((1 << i) & this.a) != 0;
    }

    void h(o oVar) {
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & oVar.a) != 0) {
                i(i, oVar.b[i]);
            }
        }
    }

    o i(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    int j() {
        return Integer.bitCount(this.a);
    }
}
