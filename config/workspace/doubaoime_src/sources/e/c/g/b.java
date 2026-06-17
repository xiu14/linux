package e.c.g;

import e.c.c.d.h;
import e.c.g.d;

/* loaded from: classes2.dex */
public class b implements d.a {
    private static final byte[] b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f9834c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9835d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f9836e;

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f9837f = com.bytedance.feedbackerlib.a.d("GIF87a");

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f9838g = com.bytedance.feedbackerlib.a.d("GIF89a");
    private static final byte[] h;
    private static final int i;
    private static final byte[] j;
    private static final int k;
    private static final byte[] l;
    private static final byte[][] m;
    private static final byte[] n;
    private static final byte[] o;
    final int a;

    static {
        byte[] bArr = {-1, -40, -1};
        b = bArr;
        f9834c = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f9835d = bArr2;
        f9836e = bArr2.length;
        byte[] d2 = com.bytedance.feedbackerlib.a.d("BM");
        h = d2;
        i = d2.length;
        byte[] bArr3 = {0, 0, 1, 0};
        j = bArr3;
        k = bArr3.length;
        l = com.bytedance.feedbackerlib.a.d("ftyp");
        m = new byte[][]{com.bytedance.feedbackerlib.a.d("heic"), com.bytedance.feedbackerlib.a.d("heix"), com.bytedance.feedbackerlib.a.d("hevc"), com.bytedance.feedbackerlib.a.d("hevx"), com.bytedance.feedbackerlib.a.d("mif1"), com.bytedance.feedbackerlib.a.d("msf1")};
        n = new byte[]{73, 73, 42, 0};
        o = new byte[]{77, 77, 0, 42};
    }

    public b() {
        int[] iArr = {21, 20, f9834c, f9836e, 6, i, k, 12};
        h.a(true);
        int i2 = iArr[0];
        for (int i3 = 1; i3 < 8; i3++) {
            if (iArr[i3] > i2) {
                i2 = iArr[i3];
            }
        }
        this.a = i2;
    }

    @Override // e.c.g.d.a
    public int a() {
        return this.a;
    }

    @Override // e.c.g.d.a
    public final d b(byte[] bArr, int i2) {
        boolean z;
        boolean z2 = false;
        if (e.c.c.i.c.g(bArr, 0, i2)) {
            h.a(e.c.c.i.c.g(bArr, 0, i2));
            return e.c.c.i.c.f(bArr, 0) ? c.f9842f : e.c.c.i.c.e(bArr, 0) ? c.f9843g : e.c.c.i.c.c(bArr, 0, i2) ? e.c.c.i.c.b(bArr, 0) ? c.j : e.c.c.i.c.d(bArr, 0) ? c.i : c.h : d.b;
        }
        byte[] bArr2 = b;
        if (i2 >= bArr2.length && com.bytedance.feedbackerlib.a.O(bArr, bArr2, 0)) {
            return c.a;
        }
        byte[] bArr3 = f9835d;
        if (i2 >= bArr3.length && com.bytedance.feedbackerlib.a.O(bArr, bArr3, 0)) {
            return c.b;
        }
        if (i2 >= 6 && (com.bytedance.feedbackerlib.a.O(bArr, f9837f, 0) || com.bytedance.feedbackerlib.a.O(bArr, f9838g, 0))) {
            return c.f9839c;
        }
        byte[] bArr4 = h;
        if (i2 < bArr4.length ? false : com.bytedance.feedbackerlib.a.O(bArr, bArr4, 0)) {
            return c.f9840d;
        }
        byte[] bArr5 = j;
        if (i2 < bArr5.length ? false : com.bytedance.feedbackerlib.a.O(bArr, bArr5, 0)) {
            return c.f9841e;
        }
        if (i2 >= 12 && bArr[3] >= 8 && com.bytedance.feedbackerlib.a.O(bArr, l, 4)) {
            for (byte[] bArr6 : m) {
                if (com.bytedance.feedbackerlib.a.O(bArr, bArr6, 8)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return c.k;
        }
        byte[] bArr7 = n;
        if ((i2 >= bArr7.length || i2 >= o.length) && (com.bytedance.feedbackerlib.a.O(bArr, bArr7, 0) || com.bytedance.feedbackerlib.a.O(bArr, o, 0))) {
            z2 = true;
        }
        return z2 ? c.m : d.b;
    }
}
