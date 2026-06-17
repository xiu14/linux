package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes.dex */
public final class y extends Writer {
    static final byte[] k;
    static final byte[] l;
    public static final char[] n;
    protected char[] a;
    protected int b;

    /* renamed from: c, reason: collision with root package name */
    protected int f1531c;

    /* renamed from: d, reason: collision with root package name */
    protected final Writer f1532d = null;

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<char[]> f1528e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static final int[] f1529f = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* renamed from: g, reason: collision with root package name */
    static final char[] f1530g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final char[] h = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] j = {'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
    static final char[] m = new char[93];

    static {
        byte[] bArr = new byte[161];
        k = bArr;
        byte[] bArr2 = new byte[161];
        l = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i2 = 14; i2 <= 31; i2++) {
            k[i2] = 4;
            l[i2] = 4;
        }
        for (int i3 = 127; i3 < 160; i3++) {
            k[i3] = 4;
            l[i3] = 4;
        }
        char[] cArr = m;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        n = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public y(Writer writer, int i2, SerializerFeature[] serializerFeatureArr) {
        ThreadLocal<char[]> threadLocal = f1528e;
        char[] cArr = threadLocal.get();
        this.a = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        }
        if (this.a == null) {
            this.a = new char[1024];
        }
        for (SerializerFeature serializerFeature : serializerFeatureArr) {
            i2 |= serializerFeature.mask;
        }
        this.f1531c = i2;
    }

    protected static void l(long j2, int i2, char[] cArr) {
        char c2;
        if (j2 < 0) {
            c2 = '-';
            j2 = -j2;
        } else {
            c2 = 0;
        }
        while (j2 > 2147483647L) {
            long j3 = j2 / 100;
            int i3 = (int) (j2 - (((j3 << 6) + (j3 << 5)) + (j3 << 2)));
            int i4 = i2 - 1;
            cArr[i4] = i[i3];
            i2 = i4 - 1;
            cArr[i2] = h[i3];
            j2 = j3;
        }
        int i5 = (int) j2;
        while (i5 >= 65536) {
            int i6 = i5 / 100;
            int i7 = i5 - (((i6 << 6) + (i6 << 5)) + (i6 << 2));
            int i8 = i2 - 1;
            cArr[i8] = i[i7];
            i2 = i8 - 1;
            cArr[i2] = h[i7];
            i5 = i6;
        }
        while (true) {
            int i9 = (52429 * i5) >>> 19;
            i2--;
            cArr[i2] = f1530g[i5 - ((i9 << 3) + (i9 << 1))];
            if (i9 == 0) {
                break;
            } else {
                i5 = i9;
            }
        }
        if (c2 != 0) {
            cArr[i2 - 1] = c2;
        }
    }

    public y a(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "null" : charSequence.toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(CharSequence charSequence) throws IOException {
        a(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f1532d != null && this.b > 0) {
            flush();
        }
        char[] cArr = this.a;
        if (cArr.length <= 8192) {
            f1528e.set(cArr);
        }
        this.a = null;
    }

    public y d(CharSequence charSequence, int i2, int i3) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String charSequence2 = charSequence.subSequence(i2, i3).toString();
        write(charSequence2, 0, charSequence2.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        Writer writer = this.f1532d;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.a, 0, this.b);
            this.f1532d.flush();
            this.b = 0;
        } catch (IOException e2) {
            throw new com.alibaba.fastjson.d(e2.getMessage(), e2);
        }
    }

    protected void h(int i2) {
        char[] cArr = this.a;
        int length = ((cArr.length * 3) / 2) + 1;
        if (length >= i2) {
            i2 = length;
        }
        char[] cArr2 = new char[i2];
        System.arraycopy(cArr, 0, cArr2, 0, this.b);
        this.a = cArr2;
    }

    public void o(String str, boolean z) {
        int i2 = this.f1531c;
        int i3 = 0;
        boolean z2 = true;
        if ((SerializerFeature.UseSingleQuotes.mask & i2) == 0) {
            if ((i2 & SerializerFeature.QuoteFieldNames.mask) != 0) {
                x(str, ':', z);
                return;
            }
            int length = str.length();
            int i4 = this.b + length + 1;
            if (i4 > this.a.length) {
                if (this.f1532d != null) {
                    if (length == 0) {
                        write(34);
                        write(34);
                        write(58);
                        return;
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            z2 = false;
                            break;
                        }
                        char charAt = str.charAt(i5);
                        byte[] bArr = k;
                        if (charAt < bArr.length && bArr[charAt] != 0) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (z2) {
                        write(34);
                    }
                    while (i3 < length) {
                        char charAt2 = str.charAt(i3);
                        byte[] bArr2 = k;
                        if (charAt2 >= bArr2.length || bArr2[charAt2] == 0) {
                            write(charAt2);
                        } else {
                            write(92);
                            write(m[charAt2]);
                        }
                        i3++;
                    }
                    if (z2) {
                        write(34);
                    }
                    write(58);
                    return;
                }
                h(i4);
            }
            if (length == 0) {
                int i6 = this.b + 3;
                if (i6 > this.a.length) {
                    h(i6);
                }
                char[] cArr = this.a;
                int i7 = this.b;
                int i8 = i7 + 1;
                this.b = i8;
                cArr[i7] = '\"';
                int i9 = i8 + 1;
                this.b = i9;
                cArr[i8] = '\"';
                this.b = i9 + 1;
                cArr[i9] = ':';
                return;
            }
            int i10 = this.b;
            int i11 = i10 + length;
            str.getChars(0, length, this.a, i10);
            this.b = i4;
            int i12 = i10;
            boolean z3 = false;
            while (i12 < i11) {
                char[] cArr2 = this.a;
                char c2 = cArr2[i12];
                byte[] bArr3 = k;
                if (c2 < bArr3.length && bArr3[c2] != 0) {
                    if (z3) {
                        i4++;
                        if (i4 > cArr2.length) {
                            h(i4);
                        }
                        this.b = i4;
                        char[] cArr3 = this.a;
                        int i13 = i12 + 1;
                        System.arraycopy(cArr3, i13, cArr3, i12 + 2, i11 - i12);
                        char[] cArr4 = this.a;
                        cArr4[i12] = '\\';
                        cArr4[i13] = m[c2];
                        i11++;
                        i12 = i13;
                    } else {
                        i4 += 3;
                        if (i4 > cArr2.length) {
                            h(i4);
                        }
                        this.b = i4;
                        char[] cArr5 = this.a;
                        int i14 = i12 + 1;
                        System.arraycopy(cArr5, i14, cArr5, i12 + 3, (i11 - i12) - 1);
                        char[] cArr6 = this.a;
                        System.arraycopy(cArr6, 0, cArr6, 1, i12);
                        char[] cArr7 = this.a;
                        cArr7[i10] = '\"';
                        cArr7[i14] = '\\';
                        int i15 = i14 + 1;
                        cArr7[i15] = m[c2];
                        i11 += 2;
                        cArr7[this.b - 2] = '\"';
                        i12 = i15;
                        z3 = true;
                    }
                }
                i12++;
            }
            this.a[this.b - 1] = ':';
            return;
        }
        if ((SerializerFeature.QuoteFieldNames.mask & i2) != 0) {
            z(str);
            write(58);
            return;
        }
        int length2 = str.length();
        int i16 = this.b + length2 + 1;
        if (i16 > this.a.length) {
            if (this.f1532d != null) {
                if (length2 == 0) {
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        z2 = false;
                        break;
                    }
                    char charAt3 = str.charAt(i17);
                    byte[] bArr4 = l;
                    if (charAt3 < bArr4.length && bArr4[charAt3] != 0) {
                        break;
                    } else {
                        i17++;
                    }
                }
                if (z2) {
                    write(39);
                }
                while (i3 < length2) {
                    char charAt4 = str.charAt(i3);
                    byte[] bArr5 = l;
                    if (charAt4 >= bArr5.length || bArr5[charAt4] == 0) {
                        write(charAt4);
                    } else {
                        write(92);
                        write(m[charAt4]);
                    }
                    i3++;
                }
                if (z2) {
                    write(39);
                }
                write(58);
                return;
            }
            h(i16);
        }
        if (length2 == 0) {
            int i18 = this.b + 3;
            if (i18 > this.a.length) {
                h(i18);
            }
            char[] cArr8 = this.a;
            int i19 = this.b;
            int i20 = i19 + 1;
            this.b = i20;
            cArr8[i19] = '\'';
            int i21 = i20 + 1;
            this.b = i21;
            cArr8[i20] = '\'';
            this.b = i21 + 1;
            cArr8[i21] = ':';
            return;
        }
        int i22 = this.b;
        int i23 = i22 + length2;
        str.getChars(0, length2, this.a, i22);
        this.b = i16;
        int i24 = i22;
        boolean z4 = false;
        while (i24 < i23) {
            char[] cArr9 = this.a;
            char c3 = cArr9[i24];
            byte[] bArr6 = l;
            if (c3 < bArr6.length && bArr6[c3] != 0) {
                if (z4) {
                    i16++;
                    if (i16 > cArr9.length) {
                        h(i16);
                    }
                    this.b = i16;
                    char[] cArr10 = this.a;
                    int i25 = i24 + 1;
                    System.arraycopy(cArr10, i25, cArr10, i24 + 2, i23 - i24);
                    char[] cArr11 = this.a;
                    cArr11[i24] = '\\';
                    cArr11[i25] = m[c3];
                    i23++;
                    i24 = i25;
                } else {
                    i16 += 3;
                    if (i16 > cArr9.length) {
                        h(i16);
                    }
                    this.b = i16;
                    char[] cArr12 = this.a;
                    int i26 = i24 + 1;
                    System.arraycopy(cArr12, i26, cArr12, i24 + 3, (i23 - i24) - 1);
                    char[] cArr13 = this.a;
                    System.arraycopy(cArr13, 0, cArr13, 1, i24);
                    char[] cArr14 = this.a;
                    cArr14[i22] = '\'';
                    cArr14[i26] = '\\';
                    int i27 = i26 + 1;
                    cArr14[i27] = m[c3];
                    i23 += 2;
                    cArr14[this.b - 2] = '\'';
                    i24 = i27;
                    z4 = true;
                }
            }
            i24++;
        }
        this.a[i16 - 1] = ':';
    }

    public void p(int i2) {
        if (i2 == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int i3 = 0;
        while ((i2 < 0 ? -i2 : i2) > f1529f[i3]) {
            i3++;
        }
        int i4 = i3 + 1;
        if (i2 < 0) {
            i4++;
        }
        int i5 = this.b + i4;
        if (i5 > this.a.length) {
            if (this.f1532d != null) {
                char[] cArr = new char[i4];
                l(i2, i4, cArr);
                write(cArr, 0, i4);
                return;
            }
            h(i5);
        }
        l(i2, i5, this.a);
        this.b = i5;
    }

    public void r(long j2) {
        if (j2 == Long.MIN_VALUE) {
            write("-9223372036854775808");
            return;
        }
        long j3 = j2 < 0 ? -j2 : j2;
        int i2 = 1;
        long j4 = 10;
        while (true) {
            if (i2 >= 19) {
                i2 = 0;
                break;
            } else {
                if (j3 < j4) {
                    break;
                }
                j4 *= 10;
                i2++;
            }
        }
        int i3 = i2 != 0 ? i2 : 19;
        if (j2 < 0) {
            i3++;
        }
        int i4 = this.b + i3;
        if (i4 > this.a.length) {
            if (this.f1532d != null) {
                char[] cArr = new char[i3];
                l(j2, i3, cArr);
                write(cArr, 0, i3);
                return;
            }
            h(i4);
        }
        l(j2, i4, this.a);
        this.b = i4;
    }

    public void s() {
        write("null");
    }

    public String toString() {
        return new String(this.a, 0, this.b);
    }

    public void w(String str) {
        if ((this.f1531c & SerializerFeature.UseSingleQuotes.mask) != 0) {
            z(str);
        } else {
            x(str, (char) 0, true);
        }
    }

    @Override // java.io.Writer
    public void write(int i2) {
        int i3 = 1;
        int i4 = this.b + 1;
        if (i4 > this.a.length) {
            if (this.f1532d != null) {
                flush();
                this.a[this.b] = (char) i2;
                this.b = i3;
            }
            h(i4);
        }
        i3 = i4;
        this.a[this.b] = (char) i2;
        this.b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x023b, code lost:
    
        if (r8 == (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x023d, code lost:
    
        r8 = r3;
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x028c, code lost:
    
        if (r8 == (-1)) goto L115;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void x(java.lang.String r19, char r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.y.x(java.lang.String, char, boolean):void");
    }

    protected void z(String str) {
        int i2 = 0;
        if (str == null) {
            int i3 = this.b + 4;
            if (i3 > this.a.length) {
                h(i3);
            }
            "null".getChars(0, 4, this.a, this.b);
            this.b = i3;
            return;
        }
        int length = str.length();
        int i4 = this.b + length + 2;
        if (i4 > this.a.length) {
            if (this.f1532d != null) {
                write(39);
                while (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    if (charAt <= '\r' || charAt == '\\' || charAt == '\'' || (charAt == '/' && (this.f1531c & SerializerFeature.WriteSlashAsSpecial.mask) != 0)) {
                        write(92);
                        write(m[charAt]);
                    } else {
                        write(charAt);
                    }
                    i2++;
                }
                write(39);
                return;
            }
            h(i4);
        }
        int i5 = this.b;
        int i6 = i5 + 1;
        int i7 = i6 + length;
        char[] cArr = this.a;
        cArr[i5] = '\'';
        str.getChars(0, length, cArr, i6);
        this.b = i4;
        int i8 = -1;
        char c2 = 0;
        for (int i9 = i6; i9 < i7; i9++) {
            char c3 = this.a[i9];
            if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && (this.f1531c & SerializerFeature.WriteSlashAsSpecial.mask) != 0)) {
                i2++;
                i8 = i9;
                c2 = c3;
            }
        }
        int i10 = i4 + i2;
        if (i10 > this.a.length) {
            h(i10);
        }
        this.b = i10;
        if (i2 == 1) {
            char[] cArr2 = this.a;
            int i11 = i8 + 1;
            System.arraycopy(cArr2, i11, cArr2, i8 + 2, (i7 - i8) - 1);
            char[] cArr3 = this.a;
            cArr3[i8] = '\\';
            cArr3[i11] = m[c2];
        } else if (i2 > 1) {
            char[] cArr4 = this.a;
            int i12 = i8 + 1;
            System.arraycopy(cArr4, i12, cArr4, i8 + 2, (i7 - i8) - 1);
            char[] cArr5 = this.a;
            cArr5[i8] = '\\';
            cArr5[i12] = m[c2];
            int i13 = i7 + 1;
            for (int i14 = i12 - 2; i14 >= i6; i14--) {
                char[] cArr6 = this.a;
                char c4 = cArr6[i14];
                if (c4 <= '\r' || c4 == '\\' || c4 == '\'' || (c4 == '/' && (this.f1531c & SerializerFeature.WriteSlashAsSpecial.mask) != 0)) {
                    int i15 = i14 + 1;
                    System.arraycopy(cArr6, i15, cArr6, i14 + 2, (i13 - i14) - 1);
                    char[] cArr7 = this.a;
                    cArr7[i14] = '\\';
                    cArr7[i15] = m[c4];
                    i13++;
                }
            }
        }
        this.a[this.b - 1] = '\'';
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Writer append(CharSequence charSequence, int i2, int i3) throws IOException {
        d(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        a(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i2, int i3) throws IOException {
        d(charSequence, i2, i3);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        write(c2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(char c2) throws IOException {
        write(c2);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > cArr.length || i3 < 0 || (i4 = i2 + i3) > cArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return;
        }
        int i5 = this.b + i3;
        if (i5 > this.a.length) {
            if (this.f1532d == null) {
                h(i5);
            } else {
                do {
                    char[] cArr2 = this.a;
                    int length = cArr2.length;
                    int i6 = this.b;
                    int i7 = length - i6;
                    System.arraycopy(cArr, i2, cArr2, i6, i7);
                    this.b = this.a.length;
                    flush();
                    i3 -= i7;
                    i2 += i7;
                } while (i3 > this.a.length);
                i5 = i3;
            }
        }
        System.arraycopy(cArr, i2, this.a, this.b, i3);
        this.b = i5;
    }

    @Override // java.io.Writer
    public void write(String str, int i2, int i3) {
        int i4;
        int i5 = this.b + i3;
        if (i5 > this.a.length) {
            if (this.f1532d == null) {
                h(i5);
            } else {
                while (true) {
                    char[] cArr = this.a;
                    int length = cArr.length;
                    int i6 = this.b;
                    int i7 = length - i6;
                    i4 = i2 + i7;
                    str.getChars(i2, i4, cArr, i6);
                    this.b = this.a.length;
                    flush();
                    i3 -= i7;
                    if (i3 <= this.a.length) {
                        break;
                    } else {
                        i2 = i4;
                    }
                }
                i5 = i3;
                i2 = i4;
            }
        }
        str.getChars(i2, i3 + i2, this.a, this.b);
        this.b = i5;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            write("null");
        } else {
            write(str, 0, str.length());
        }
    }
}
