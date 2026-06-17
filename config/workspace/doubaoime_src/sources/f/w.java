package f;

import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class w extends h {

    /* renamed from: f, reason: collision with root package name */
    private final transient byte[][] f10067f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int[] f10068g;

    public w(byte[][] bArr, int[] iArr, kotlin.s.c.g gVar) {
        super(h.f10045d.d());
        this.f10067f = bArr;
        this.f10068g = iArr;
    }

    private final int v(int i) {
        int binarySearch = Arrays.binarySearch(this.f10068g, 0, this.f10067f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private final h w() {
        return new h(s());
    }

    @Override // f.h
    public String a() {
        return w().a();
    }

    @Override // f.h
    public h b(String str) {
        kotlin.s.c.l.g(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f10067f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f10068g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(this.f10067f[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        kotlin.s.c.l.b(digest, "digest.digest()");
        return new h(digest);
    }

    @Override // f.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f() == f() && m(0, hVar, 0, f())) {
                return true;
            }
        }
        return false;
    }

    @Override // f.h
    public int f() {
        return this.f10068g[this.f10067f.length - 1];
    }

    @Override // f.h
    public String h() {
        return f.B.a.b(w());
    }

    @Override // f.h
    public int hashCode() {
        int e2 = e();
        if (e2 != 0) {
            return e2;
        }
        int length = this.f10067f.length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f10068g;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr = this.f10067f[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        o(i2);
        return i2;
    }

    @Override // f.h
    public byte[] i() {
        return s();
    }

    @Override // f.h
    public byte j(int i) {
        com.prolificinteractive.materialcalendarview.r.A(this.f10068g[this.f10067f.length - 1], i, 1L);
        int v = v(i);
        int i2 = v == 0 ? 0 : this.f10068g[v - 1];
        int[] iArr = this.f10068g;
        byte[][] bArr = this.f10067f;
        return bArr[v][(i - i2) + iArr[bArr.length + v]];
    }

    @Override // f.h
    public boolean m(int i, h hVar, int i2, int i3) {
        kotlin.s.c.l.g(hVar, "other");
        if (i < 0 || i > f() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int v = v(i);
        while (i < i4) {
            int i5 = v == 0 ? 0 : this.f10068g[v - 1];
            int[] iArr = this.f10068g;
            int i6 = iArr[v] - i5;
            int i7 = iArr[this.f10067f.length + v];
            int min = Math.min(i4, i6 + i5) - i;
            if (!hVar.n(i2, this.f10067f[v], (i - i5) + i7, min)) {
                return false;
            }
            i2 += min;
            i += min;
            v++;
        }
        return true;
    }

    @Override // f.h
    public boolean n(int i, byte[] bArr, int i2, int i3) {
        kotlin.s.c.l.g(bArr, "other");
        if (i < 0 || i > f() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int v = v(i);
        while (i < i4) {
            int i5 = v == 0 ? 0 : this.f10068g[v - 1];
            int[] iArr = this.f10068g;
            int i6 = iArr[v] - i5;
            int i7 = iArr[this.f10067f.length + v];
            int min = Math.min(i4, i6 + i5) - i;
            if (!com.prolificinteractive.materialcalendarview.r.v(this.f10067f[v], (i - i5) + i7, bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            v++;
        }
        return true;
    }

    @Override // f.h
    public h r() {
        return w().r();
    }

    @Override // f.h
    public byte[] s() {
        byte[] bArr = new byte[f()];
        int length = this.f10067f.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f10068g;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            com.prolificinteractive.materialcalendarview.r.w(this.f10067f[i], i4, bArr, i3, i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // f.h
    public String toString() {
        return w().toString();
    }

    @Override // f.h
    public void u(e eVar) {
        kotlin.s.c.l.g(eVar, "buffer");
        int length = this.f10067f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f10068g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            u uVar = new u(this.f10067f[i], i3, i3 + (i4 - i2), true, false);
            u uVar2 = eVar.a;
            if (uVar2 == null) {
                uVar.f10065g = uVar;
                uVar.f10064f = uVar;
                eVar.a = uVar;
            } else {
                u uVar3 = uVar2.f10065g;
                if (uVar3 == null) {
                    kotlin.s.c.l.k();
                    throw null;
                }
                uVar3.b(uVar);
            }
            i++;
            i2 = i4;
        }
        eVar.H(eVar.I() + f());
    }
}
