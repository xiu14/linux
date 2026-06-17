package com.bytedance.crash.dumper.j;

/* loaded from: classes.dex */
class b extends com.bytedance.crash.dumper.j.a {

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f4602d = {'-', '2', '1', '4', '7', '4', '8', '3', '6', '4', '8'};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f4603e = {'-', '9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f4604f = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* renamed from: g, reason: collision with root package name */
    private static final C0208b f4605g = new C0208b();
    private static final c h = new c();
    private final char[] b;

    /* renamed from: c, reason: collision with root package name */
    private int f4606c;

    static abstract class a<A> {
        a() {
        }

        void a(b bVar, A a) {
            int i;
            int c2 = c(a);
            char[] k = bVar.k();
            int i2 = c2;
            int l = bVar.l();
            int i3 = 0;
            while (true) {
                i = i2 + l;
                if (i < k.length) {
                    break;
                }
                int length = k.length - l;
                b(a, i3, k, l, length);
                bVar.j();
                if (l != 0) {
                    bVar.m(0);
                    l = 0;
                }
                i3 += length;
                i2 -= length;
            }
            if (i2 > 0) {
                b(a, i3, k, l, i2);
                bVar.m(i);
            }
        }

        abstract void b(A a, int i, char[] cArr, int i2, int i3);

        abstract int c(A a);
    }

    /* renamed from: com.bytedance.crash.dumper.j.b$b, reason: collision with other inner class name */
    static class C0208b extends a<char[]> {
        C0208b() {
        }

        @Override // com.bytedance.crash.dumper.j.b.a
        void b(char[] cArr, int i, char[] cArr2, int i2, int i3) {
            System.arraycopy(cArr, i, cArr2, i2, i3);
        }

        @Override // com.bytedance.crash.dumper.j.b.a
        int c(char[] cArr) {
            return cArr.length;
        }
    }

    static class c extends a<String> {
        c() {
        }

        @Override // com.bytedance.crash.dumper.j.b.a
        void b(String str, int i, char[] cArr, int i2, int i3) {
            str.getChars(i, i3 + i, cArr, i2);
        }

        @Override // com.bytedance.crash.dumper.j.b.a
        int c(String str) {
            return str.length();
        }
    }

    b(String str) {
        char[] cArr;
        int i = 1024;
        try {
            cArr = new char[1024];
        } catch (Throwable unused) {
            i = 128;
            cArr = new char[128];
        }
        this.b = cArr;
        this.f4606c = 0;
        this.a = f(str, i);
    }

    private void h(char c2) {
        char[] cArr = this.b;
        int i = this.f4606c;
        cArr[i] = c2;
        int i2 = i + 1;
        this.f4606c = i2;
        if (i2 == cArr.length) {
            this.a.c(cArr, cArr.length);
            this.f4606c = 0;
        }
    }

    private static void i(int i, char[] cArr, int i2) {
        while (i >= 65536) {
            int i3 = i / 100;
            int i4 = i - (((i3 << 6) + (i3 << 5)) + (i3 << 2));
            int i5 = i4 / 10;
            int i6 = i2 - 1;
            cArr[i6] = (char) ((i4 - (i5 * 10)) + 48);
            i2 = i6 - 1;
            cArr[i2] = (char) (i5 + 48);
            i = i3;
        }
        while (i != 0) {
            int i7 = (52429 * i) >>> 19;
            i2--;
            cArr[i2] = (char) ((i - ((i7 << 3) + (i7 << 1))) + 48);
            i = i7;
        }
    }

    @Override // com.bytedance.crash.dumper.j.a
    void a(char c2) {
        h(c2);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void b(int i) {
        if (i == Integer.MIN_VALUE) {
            f4605g.a(this, f4602d);
            return;
        }
        if (i < 0) {
            i = -i;
            h('-');
        }
        if (i < 100) {
            if (i < 10) {
                h((char) (i + 48));
                return;
            }
            int i2 = i / 10;
            h((char) (i2 + 48));
            h((char) ((i - (i2 * 10)) + 48));
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 10) {
                i3 = 11;
                break;
            }
            int i4 = f4604f[i3];
            i3++;
            if (i <= i4) {
                break;
            }
        }
        int i5 = this.f4606c;
        int i6 = i5 + i3;
        char[] cArr = this.b;
        if (i6 >= cArr.length) {
            this.a.c(cArr, i5);
            this.f4606c = 0;
        }
        int i7 = this.f4606c + i3;
        this.f4606c = i7;
        i(i, this.b, i7);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void c(long j) {
        if (j == Long.MIN_VALUE) {
            f4605g.a(this, f4603e);
            return;
        }
        if (j < 0) {
            j = -j;
            h('-');
        }
        if (j < 100) {
            if (j < 10) {
                h((char) (j + 48));
                return;
            }
            long j2 = j / 10;
            h((char) (j2 + 48));
            h((char) ((j - (10 * j2)) + 48));
            return;
        }
        int i = 1;
        long j3 = 10;
        while (true) {
            if (i >= 19) {
                i = 19;
                break;
            } else {
                if (j < j3) {
                    break;
                }
                j3 *= 10;
                i++;
            }
        }
        int i2 = this.f4606c;
        int i3 = i2 + i;
        char[] cArr = this.b;
        if (i3 >= cArr.length) {
            this.a.c(cArr, i2);
            this.f4606c = 0;
        }
        int i4 = this.f4606c + i;
        this.f4606c = i4;
        char[] cArr2 = this.b;
        while (j > 2147483647L) {
            long j4 = j / 100;
            int i5 = (int) (j - (((j4 << 6) + (j4 << 5)) + (j4 << 2)));
            int i6 = i5 / 10;
            int i7 = i4 - 1;
            cArr2[i7] = (char) ((i5 - (i6 * 10)) + 48);
            i4 = i7 - 1;
            cArr2[i4] = (char) (i6 + 48);
            j = j4;
        }
        i((int) j, cArr2, i4);
    }

    @Override // com.bytedance.crash.dumper.j.a
    public void d(String str) {
        h.a(this, str);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void e(char[] cArr) {
        f4605g.a(this, cArr);
    }

    @Override // com.bytedance.crash.dumper.j.a
    void g() {
        int i = this.f4606c;
        if (i > 0) {
            this.a.c(this.b, i);
            this.f4606c = 0;
        }
        this.a.flush();
        this.a.release();
    }

    void j() {
        d dVar = this.a;
        char[] cArr = this.b;
        dVar.c(cArr, cArr.length);
    }

    char[] k() {
        return this.b;
    }

    int l() {
        return this.f4606c;
    }

    void m(int i) {
        this.f4606c = i;
    }
}
