package com.alibaba.fastjson.parser;

import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class d {
    public static final boolean[] A;
    private static boolean u;
    private static final ThreadLocal<char[]> v;
    protected static final int[] w;
    public static final char[] x;
    static final int[] y;
    public static final boolean[] z;
    protected int a;
    protected int b;

    /* renamed from: c, reason: collision with root package name */
    public int f1486c;

    /* renamed from: d, reason: collision with root package name */
    protected char f1487d;

    /* renamed from: e, reason: collision with root package name */
    protected int f1488e;

    /* renamed from: f, reason: collision with root package name */
    protected char[] f1489f;

    /* renamed from: g, reason: collision with root package name */
    protected int f1490g;
    protected boolean h;
    protected boolean i;
    protected int j;
    protected boolean k;
    public TimeZone l;
    public Locale m;
    public Calendar n;
    public int o;
    protected final String p;
    protected final int q;
    protected String r;
    public boolean s;
    protected long t;

    static {
        int i;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
        } catch (Exception unused) {
            i = -1;
        }
        char c2 = 0;
        u = i >= 23;
        v = new ThreadLocal<>();
        w = new int[103];
        for (int i2 = 48; i2 <= 57; i2++) {
            w[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            w[i3] = (i3 - 97) + 10;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            w[i4] = (i4 - 65) + 10;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        x = charArray;
        int[] iArr = new int[256];
        y = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            y[x[i5]] = i5;
        }
        y[61] = 0;
        z = new boolean[256];
        char c3 = 0;
        while (true) {
            boolean[] zArr = z;
            if (c3 >= zArr.length) {
                break;
            }
            if (c3 >= 'A' && c3 <= 'Z') {
                zArr[c3] = true;
            } else if (c3 >= 'a' && c3 <= 'z') {
                zArr[c3] = true;
            } else if (c3 == '_') {
                zArr[c3] = true;
            }
            c3 = (char) (c3 + 1);
        }
        A = new boolean[256];
        while (true) {
            boolean[] zArr2 = A;
            if (c2 >= zArr2.length) {
                return;
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                zArr2[c2] = true;
            } else if (c2 >= 'a' && c2 <= 'z') {
                zArr2[c2] = true;
            } else if (c2 == '_') {
                zArr2[c2] = true;
            } else if (c2 >= '0' && c2 <= '9') {
                zArr2[c2] = true;
            }
            c2 = (char) (c2 + 1);
        }
    }

    public d(String str) {
        this(str, com.alibaba.fastjson.a.f1464c);
    }

    private void J() {
        this.j = this.f1488e - 1;
        this.k = false;
        do {
            this.f1490g++;
            q();
        } while (Character.isLetterOrDigit(this.f1487d));
        String V = V();
        if (V.equals("null")) {
            this.a = 8;
            return;
        }
        if (V.equals("true")) {
            this.a = 6;
            return;
        }
        if (V.equals("false")) {
            this.a = 7;
            return;
        }
        if (V.equals(SettingsActivityNext.SETTINGS_SOURCE_NEW)) {
            this.a = 9;
            return;
        }
        if (V.equals("undefined")) {
            this.a = 23;
            return;
        }
        if (V.equals("Set")) {
            this.a = 21;
        } else if (V.equals("TreeSet")) {
            this.a = 22;
        } else {
            this.a = 18;
        }
    }

    private void S(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9) {
        Calendar calendar = Calendar.getInstance(this.l, this.m);
        this.n = calendar;
        int i = c5 - '0';
        calendar.set(1, i + ((c4 - '0') * 10) + ((c3 - '0') * 100) + ((c2 - '0') * 1000));
        this.n.set(2, ((c7 - '0') + ((c6 - '0') * 10)) - 1);
        this.n.set(5, (c9 - '0') + ((c8 - '0') * 10));
    }

    private final String W(int i, int i2) {
        char[] cArr = this.f1489f;
        if (i2 < cArr.length) {
            this.p.getChars(i, i + i2, cArr, 0);
            return new String(this.f1489f, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.p.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    static boolean c(char c2, char c3, char c4, char c5, char c6, char c7, int i, int i2) {
        if ((c2 == '1' || c2 == '2') && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            if (c6 == '0') {
                if (c7 < '1' || c7 > '9') {
                    return false;
                }
            } else if (c6 != '1' || (c7 != '0' && c7 != '1' && c7 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001d, code lost:
    
        if (r5 <= '4') goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean d(char r4, char r5, char r6, char r7, char r8, char r9) {
        /*
            r0 = 57
            r1 = 0
            r2 = 48
            if (r4 != r2) goto Lc
            if (r5 < r2) goto Lb
            if (r5 <= r0) goto L20
        Lb:
            return r1
        Lc:
            r3 = 49
            if (r4 != r3) goto L15
            if (r5 < r2) goto L14
            if (r5 <= r0) goto L20
        L14:
            return r1
        L15:
            r3 = 50
            if (r4 != r3) goto L42
            if (r5 < r2) goto L42
            r4 = 52
            if (r5 <= r4) goto L20
            goto L42
        L20:
            r4 = 53
            r5 = 54
            if (r6 < r2) goto L2d
            if (r6 > r4) goto L2d
            if (r7 < r2) goto L2c
            if (r7 <= r0) goto L32
        L2c:
            return r1
        L2d:
            if (r6 != r5) goto L42
            if (r7 == r2) goto L32
            return r1
        L32:
            if (r8 < r2) goto L3b
            if (r8 > r4) goto L3b
            if (r9 < r2) goto L3a
            if (r9 <= r0) goto L40
        L3a:
            return r1
        L3b:
            if (r8 != r5) goto L42
            if (r9 == r2) goto L40
            return r1
        L40:
            r4 = 1
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.d(char, char, char, char, char, char):boolean");
    }

    public static final byte[] h(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        while (i < i5 && y[str.charAt(i)] < 0) {
            i++;
        }
        while (i5 > 0 && y[str.charAt(i5)] < 0) {
            i5--;
        }
        int i6 = str.charAt(i5) == '=' ? str.charAt(i5 + (-1)) == '=' ? 2 : 1 : 0;
        int i7 = (i5 - i) + 1;
        if (i2 > 76) {
            i3 = (str.charAt(76) == '\r' ? i7 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i8 = (((i7 - i3) * 6) >> 3) - i6;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int[] iArr = y;
            int i12 = i + 1;
            int i13 = i12 + 1;
            int i14 = (iArr[str.charAt(i)] << 18) | (iArr[str.charAt(i12)] << 12);
            int i15 = i13 + 1;
            int i16 = i14 | (iArr[str.charAt(i13)] << 6);
            int i17 = i15 + 1;
            int i18 = i16 | iArr[str.charAt(i15)];
            int i19 = i10 + 1;
            bArr[i10] = (byte) (i18 >> 16);
            int i20 = i19 + 1;
            bArr[i19] = (byte) (i18 >> 8);
            int i21 = i20 + 1;
            bArr[i20] = (byte) i18;
            if (i3 > 0 && (i11 = i11 + 1) == 19) {
                i17 += 2;
                i11 = 0;
            }
            i = i17;
            i10 = i21;
        }
        if (i10 < i8) {
            int i22 = 0;
            while (i <= i5 - i6) {
                i4 |= y[str.charAt(i)] << (18 - (i22 * 6));
                i22++;
                i++;
            }
            int i23 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i4 >> i23);
                i23 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    private int p(long j) {
        char c2 = this.f1487d;
        int i = this.f1488e + 1;
        int i2 = 1;
        while (c2 != '\"' && c2 != '\'') {
            if (c2 > ' ' || !(c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\f' || c2 == '\b')) {
                this.t = 0L;
                this.o = -2;
                return 0;
            }
            int i3 = i2 + 1;
            int i4 = this.f1488e + i2;
            c2 = i4 >= this.q ? (char) 26 : this.p.charAt(i4);
            i2 = i3;
        }
        long j2 = -2128831035;
        int i5 = i;
        while (true) {
            if (i5 >= this.q) {
                break;
            }
            char charAt = this.p.charAt(i5);
            if (charAt == c2) {
                i2 += i5 - i;
                break;
            }
            j2 = (j2 ^ charAt) * 16777619;
            i5++;
        }
        if (j2 != j) {
            this.t = j2;
            this.o = -2;
            return 0;
        }
        int i6 = i2 + 1;
        int i7 = this.f1488e + i6;
        char charAt2 = i7 >= this.q ? (char) 26 : this.p.charAt(i7);
        while (charAt2 != ':') {
            if (charAt2 > ' ' || !(charAt2 == ' ' || charAt2 == '\n' || charAt2 == '\r' || charAt2 == '\t' || charAt2 == '\f' || charAt2 == '\b')) {
                throw new com.alibaba.fastjson.d("match feild error expect ':'");
            }
            int i8 = i6 + 1;
            int i9 = this.f1488e + i6;
            charAt2 = i9 >= this.q ? (char) 26 : this.p.charAt(i9);
            i6 = i8;
        }
        return i6 + 1;
    }

    private static String v(char[] cArr, int i) {
        int i2;
        char[] cArr2 = new char[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            char c2 = cArr[i3];
            if (c2 != '\\') {
                cArr2[i4] = c2;
                i4++;
            } else {
                i3++;
                char c3 = cArr[i3];
                if (c3 == '\"') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\"';
                } else if (c3 != '\'') {
                    if (c3 != 'F') {
                        if (c3 == '\\') {
                            i2 = i4 + 1;
                            cArr2[i4] = '\\';
                        } else if (c3 == 'b') {
                            i2 = i4 + 1;
                            cArr2[i4] = '\b';
                        } else if (c3 != 'f') {
                            if (c3 == 'n') {
                                i2 = i4 + 1;
                                cArr2[i4] = '\n';
                            } else if (c3 == 'r') {
                                i2 = i4 + 1;
                                cArr2[i4] = '\r';
                            } else if (c3 != 'x') {
                                switch (c3) {
                                    case '/':
                                        i2 = i4 + 1;
                                        cArr2[i4] = '/';
                                        break;
                                    case '0':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 0;
                                        break;
                                    case '1':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 1;
                                        break;
                                    case '2':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 2;
                                        break;
                                    case '3':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 3;
                                        break;
                                    case '4':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 4;
                                        break;
                                    case '5':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 5;
                                        break;
                                    case '6':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 6;
                                        break;
                                    case '7':
                                        i2 = i4 + 1;
                                        cArr2[i4] = 7;
                                        break;
                                    default:
                                        switch (c3) {
                                            case 't':
                                                i2 = i4 + 1;
                                                cArr2[i4] = '\t';
                                                break;
                                            case 'u':
                                                i2 = i4 + 1;
                                                int i5 = i3 + 1;
                                                int i6 = i5 + 1;
                                                int i7 = i6 + 1;
                                                i3 = i7 + 1;
                                                cArr2[i4] = (char) Integer.parseInt(new String(new char[]{cArr[i5], cArr[i6], cArr[i7], cArr[i3]}), 16);
                                                break;
                                            case 'v':
                                                i2 = i4 + 1;
                                                cArr2[i4] = 11;
                                                break;
                                            default:
                                                throw new com.alibaba.fastjson.d("unclosed.str.lit");
                                        }
                                }
                            } else {
                                i2 = i4 + 1;
                                int[] iArr = w;
                                int i8 = i3 + 1;
                                int i9 = iArr[cArr[i8]] * 16;
                                i3 = i8 + 1;
                                cArr2[i4] = (char) (i9 + iArr[cArr[i3]]);
                            }
                        }
                    }
                    i2 = i4 + 1;
                    cArr2[i4] = '\f';
                } else {
                    i2 = i4 + 1;
                    cArr2[i4] = '\'';
                }
                i4 = i2;
            }
            i3++;
        }
        return new String(cArr2, 0, i4);
    }

    public final float A(long j) {
        int i;
        char b;
        int i2;
        float parseFloat;
        int i3;
        char b2;
        this.o = 0;
        int p = p(j);
        if (p == 0) {
            return 0.0f;
        }
        int i4 = p + 1;
        char b3 = b(this.f1488e + p);
        int i5 = this.f1488e;
        int i6 = (i5 + i4) - 1;
        boolean z2 = b3 == '-';
        if (z2) {
            char b4 = b(i5 + i4);
            i4++;
            b3 = b4;
        }
        if (b3 < '0' || b3 > '9') {
            this.o = -1;
            return 0.0f;
        }
        int i7 = b3 - '0';
        while (true) {
            i = i4 + 1;
            b = b(this.f1488e + i4);
            if (b < '0' || b > '9') {
                break;
            }
            i7 = (i7 * 10) + (b - '0');
            i4 = i;
        }
        if (b == '.') {
            int i8 = i + 1;
            char b5 = b(this.f1488e + i);
            if (b5 < '0' || b5 > '9') {
                this.o = -1;
                return 0.0f;
            }
            i7 = (b5 - '0') + (i7 * 10);
            int i9 = 10;
            while (true) {
                i3 = i8 + 1;
                b2 = b(this.f1488e + i8);
                if (b2 < '0' || b2 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (b2 - '0');
                i9 *= 10;
                i8 = i3;
            }
            i = i3;
            i2 = i9;
            b = b2;
        } else {
            i2 = 1;
        }
        boolean z3 = b == 'e' || b == 'E';
        if (z3) {
            int i10 = i + 1;
            b = b(this.f1488e + i);
            if (b == '+' || b == '-') {
                int i11 = i10 + 1;
                b = b(this.f1488e + i10);
                i = i11;
            } else {
                i = i10;
            }
            while (b >= '0' && b <= '9') {
                int i12 = i + 1;
                b = b(this.f1488e + i);
                i = i12;
            }
        }
        int i13 = ((this.f1488e + i) - i6) - 1;
        if (z3 || i13 >= 10) {
            parseFloat = Float.parseFloat(W(i6, i13));
        } else {
            parseFloat = i7 / i2;
            if (z2) {
                parseFloat = -parseFloat;
            }
        }
        if (b == ',') {
            this.f1488e = (i - 1) + this.f1488e;
            q();
            this.o = 3;
            this.a = 16;
            return parseFloat;
        }
        if (b != '}') {
            this.o = -1;
            return 0.0f;
        }
        int i14 = i + 1;
        char b6 = b(this.f1488e + i);
        if (b6 == ',') {
            this.a = 16;
            this.f1488e = (i14 - 1) + this.f1488e;
            q();
        } else if (b6 == ']') {
            this.a = 15;
            this.f1488e = (i14 - 1) + this.f1488e;
            q();
        } else if (b6 == '}') {
            this.a = 13;
            this.f1488e = (i14 - 1) + this.f1488e;
            q();
        } else {
            if (b6 != 26) {
                this.o = -1;
                return 0.0f;
            }
            this.f1488e = (i14 - 1) + this.f1488e;
            this.a = 20;
            this.f1487d = (char) 26;
        }
        this.o = 4;
        return parseFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d3, code lost:
    
        r19.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00d5, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021a, code lost:
    
        r19.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021c, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0116 -> B:66:0x0119). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] B(long r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.B(long):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x00e6, code lost:
    
        r20.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00e8, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x028d, code lost:
    
        r12 = r3;
        r20.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0290, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[][] C(long r21) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.C(long):float[][]");
    }

    public int D(long j) {
        boolean z2;
        int i;
        char charAt;
        this.o = 0;
        int p = p(j);
        if (p == 0) {
            return 0;
        }
        int i2 = p + 1;
        int i3 = this.f1488e + p;
        char charAt2 = i3 >= this.q ? (char) 26 : this.p.charAt(i3);
        if (charAt2 == '\"') {
            int i4 = i2 + 1;
            int i5 = this.f1488e + i2;
            charAt2 = i5 >= this.q ? (char) 26 : this.p.charAt(i5);
            i2 = i4;
            z2 = true;
        } else {
            z2 = false;
        }
        if (charAt2 < '0' || charAt2 > '9') {
            this.o = -1;
            return 0;
        }
        int i6 = charAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i7 = this.f1488e + i2;
            charAt = i7 >= this.q ? (char) 26 : this.p.charAt(i7);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i6 = (i6 * 10) + (charAt - '0');
            i2 = i;
        }
        if (charAt == '.') {
            this.o = -1;
            return 0;
        }
        if (charAt == '\"') {
            if (!z2) {
                this.o = -1;
                return 0;
            }
            int i8 = i + 1;
            int i9 = this.f1488e + i;
            i = i8;
            charAt = i9 >= this.q ? (char) 26 : this.p.charAt(i9);
        }
        if (i6 < 0) {
            this.o = -1;
            return 0;
        }
        if (charAt == ',') {
            int i10 = (i - 1) + this.f1488e;
            this.f1488e = i10;
            int i11 = i10 + 1;
            this.f1488e = i11;
            this.f1487d = i11 < this.q ? this.p.charAt(i11) : (char) 26;
            this.o = 3;
            this.a = 16;
            return i6;
        }
        if (charAt != '}') {
            this.o = -1;
            return 0;
        }
        int i12 = i + 1;
        char b = b(this.f1488e + i);
        if (b == ',') {
            this.a = 16;
            int i13 = (i12 - 1) + this.f1488e;
            this.f1488e = i13;
            int i14 = i13 + 1;
            this.f1488e = i14;
            this.f1487d = i14 < this.q ? this.p.charAt(i14) : (char) 26;
        } else if (b == ']') {
            this.a = 15;
            int i15 = (i12 - 1) + this.f1488e;
            this.f1488e = i15;
            int i16 = i15 + 1;
            this.f1488e = i16;
            this.f1487d = i16 < this.q ? this.p.charAt(i16) : (char) 26;
        } else if (b == '}') {
            this.a = 13;
            int i17 = (i12 - 1) + this.f1488e;
            this.f1488e = i17;
            int i18 = i17 + 1;
            this.f1488e = i18;
            this.f1487d = i18 < this.q ? this.p.charAt(i18) : (char) 26;
        } else {
            if (b != 26) {
                this.o = -1;
                return 0;
            }
            this.a = 20;
            this.f1488e = (i12 - 1) + this.f1488e;
            this.f1487d = (char) 26;
        }
        this.o = 4;
        return i6;
    }

    public final int[] E(long j) {
        boolean z2;
        int i;
        int[] iArr;
        int i2;
        char charAt;
        int i3;
        int i4;
        char charAt2;
        int i5;
        int[] iArr2;
        this.o = 0;
        int p = p(j);
        int[] iArr3 = null;
        if (p == 0) {
            return null;
        }
        int i6 = p + 1;
        int i7 = this.f1488e + p;
        int i8 = -1;
        if ((i7 >= this.q ? (char) 26 : this.p.charAt(i7)) != '[') {
            this.o = -1;
            return null;
        }
        int i9 = i6 + 1;
        int i10 = this.f1488e + i6;
        char charAt3 = i10 >= this.q ? (char) 26 : this.p.charAt(i10);
        int[] iArr4 = new int[16];
        if (charAt3 != ']') {
            int i11 = 0;
            while (true) {
                if (charAt3 == '-') {
                    int i12 = i9 + 1;
                    int i13 = this.f1488e + i9;
                    charAt3 = i13 >= this.q ? (char) 26 : this.p.charAt(i13);
                    i9 = i12;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (charAt3 < '0') {
                    i = i8;
                    iArr = iArr3;
                    break;
                }
                if (charAt3 > '9') {
                    i = i8;
                    iArr = null;
                    break;
                }
                int i14 = charAt3 - '0';
                while (true) {
                    i2 = i9 + 1;
                    int i15 = this.f1488e + i9;
                    charAt = i15 >= this.q ? (char) 26 : this.p.charAt(i15);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    i14 = (i14 * 10) + (charAt - '0');
                    i9 = i2;
                }
                if (i11 >= iArr4.length) {
                    int[] iArr5 = new int[(iArr4.length * 3) / 2];
                    System.arraycopy(iArr4, 0, iArr5, 0, i11);
                    iArr4 = iArr5;
                }
                i3 = i11 + 1;
                if (z2) {
                    i14 = -i14;
                }
                iArr4[i11] = i14;
                if (charAt == ',') {
                    int i16 = i2 + 1;
                    int i17 = this.f1488e + i2;
                    i2 = i16;
                    iArr2 = null;
                    charAt = i17 >= this.q ? (char) 26 : this.p.charAt(i17);
                    i5 = -1;
                } else if (charAt == ']') {
                    i4 = i2 + 1;
                    int i18 = this.f1488e + i2;
                    charAt2 = i18 >= this.q ? (char) 26 : this.p.charAt(i18);
                } else {
                    i5 = -1;
                    iArr2 = null;
                }
                i11 = i3;
                iArr3 = iArr2;
                i8 = i5;
                charAt3 = charAt;
                i9 = i2;
            }
            this.o = i;
            return iArr;
        }
        i4 = i9 + 1;
        int i19 = this.f1488e + i9;
        charAt2 = i19 >= this.q ? (char) 26 : this.p.charAt(i19);
        i3 = 0;
        if (i3 != iArr4.length) {
            int[] iArr6 = new int[i3];
            System.arraycopy(iArr4, 0, iArr6, 0, i3);
            iArr4 = iArr6;
        }
        if (charAt2 == ',') {
            this.f1488e = (i4 - 1) + this.f1488e;
            q();
            this.o = 3;
            this.a = 16;
            return iArr4;
        }
        if (charAt2 != '}') {
            this.o = -1;
            return null;
        }
        int i20 = i4 + 1;
        char b = b(this.f1488e + i4);
        if (b == ',') {
            this.a = 16;
            this.f1488e = (i20 - 1) + this.f1488e;
            q();
        } else if (b == ']') {
            this.a = 15;
            this.f1488e = (i20 - 1) + this.f1488e;
            q();
        } else if (b == '}') {
            this.a = 13;
            this.f1488e = (i20 - 1) + this.f1488e;
            q();
        } else {
            if (b != 26) {
                this.o = -1;
                return null;
            }
            this.f1488e = (i20 - 1) + this.f1488e;
            this.a = 20;
            this.f1487d = (char) 26;
        }
        this.o = 4;
        return iArr4;
    }

    public long F(long j) {
        int i;
        char charAt;
        boolean z2 = false;
        this.o = 0;
        int p = p(j);
        if (p == 0) {
            return 0L;
        }
        int i2 = p + 1;
        int i3 = this.f1488e + p;
        char charAt2 = i3 >= this.q ? (char) 26 : this.p.charAt(i3);
        if (charAt2 == '\"') {
            int i4 = i2 + 1;
            int i5 = this.f1488e + i2;
            i2 = i4;
            charAt2 = i5 >= this.q ? (char) 26 : this.p.charAt(i5);
            z2 = true;
        }
        if (charAt2 < '0' || charAt2 > '9') {
            this.o = -1;
            return 0L;
        }
        long j2 = charAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i6 = this.f1488e + i2;
            charAt = i6 >= this.q ? (char) 26 : this.p.charAt(i6);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j2 = (j2 * 10) + (charAt - '0');
            i2 = i;
        }
        if (charAt == '.') {
            this.o = -1;
            return 0L;
        }
        if (charAt == '\"') {
            if (!z2) {
                this.o = -1;
                return 0L;
            }
            int i7 = i + 1;
            int i8 = this.f1488e + i;
            i = i7;
            charAt = i8 >= this.q ? (char) 26 : this.p.charAt(i8);
        }
        if (j2 < 0) {
            this.o = -1;
            return 0L;
        }
        if (charAt == ',') {
            int i9 = (i - 1) + this.f1488e;
            this.f1488e = i9;
            int i10 = i9 + 1;
            this.f1488e = i10;
            this.f1487d = i10 >= this.q ? (char) 26 : this.p.charAt(i10);
            this.o = 3;
            this.a = 16;
            return j2;
        }
        if (charAt != '}') {
            this.o = -1;
            return 0L;
        }
        int i11 = i + 1;
        char b = b(this.f1488e + i);
        if (b == ',') {
            this.a = 16;
            int i12 = (i11 - 1) + this.f1488e;
            this.f1488e = i12;
            int i13 = i12 + 1;
            this.f1488e = i13;
            this.f1487d = i13 >= this.q ? (char) 26 : this.p.charAt(i13);
        } else if (b == ']') {
            this.a = 15;
            int i14 = (i11 - 1) + this.f1488e;
            this.f1488e = i14;
            int i15 = i14 + 1;
            this.f1488e = i15;
            this.f1487d = i15 >= this.q ? (char) 26 : this.p.charAt(i15);
        } else if (b == '}') {
            this.a = 13;
            int i16 = (i11 - 1) + this.f1488e;
            this.f1488e = i16;
            int i17 = i16 + 1;
            this.f1488e = i17;
            this.f1487d = i17 >= this.q ? (char) 26 : this.p.charAt(i17);
        } else {
            if (b != 26) {
                this.o = -1;
                return 0L;
            }
            this.a = 20;
            this.f1488e = (i11 - 1) + this.f1488e;
            this.f1487d = (char) 26;
        }
        this.o = 4;
        return j2;
    }

    public String G(long j) {
        String str;
        this.o = 0;
        int p = p(j);
        if (p == 0) {
            return null;
        }
        int i = p + 1;
        int i2 = this.f1488e + p;
        if (i2 >= this.q) {
            StringBuilder M = e.a.a.a.a.M("unclosed str, ");
            M.append(i());
            throw new com.alibaba.fastjson.d(M.toString());
        }
        if (this.p.charAt(i2) != '\"') {
            this.o = -1;
            return this.r;
        }
        int i3 = this.f1488e + i;
        int indexOf = this.p.indexOf(34, i3);
        if (indexOf == -1) {
            StringBuilder M2 = e.a.a.a.a.M("unclosed str, ");
            M2.append(i());
            throw new com.alibaba.fastjson.d(M2.toString());
        }
        if (u) {
            str = this.p.substring(i3, indexOf);
        } else {
            int i4 = indexOf - i3;
            str = new String(X(this.f1488e + i, i4), 0, i4);
        }
        if (str.indexOf(92) != -1) {
            boolean z2 = false;
            while (true) {
                int i5 = indexOf - 1;
                int i6 = 0;
                while (i5 >= 0 && this.p.charAt(i5) == '\\') {
                    i6++;
                    i5--;
                    z2 = true;
                }
                if (i6 % 2 == 0) {
                    break;
                }
                indexOf = this.p.indexOf(34, indexOf + 1);
            }
            int i7 = indexOf - i3;
            char[] X = X(this.f1488e + i, i7);
            if (z2) {
                str = v(X, i7);
            } else {
                str = new String(X, 0, i7);
                if (str.indexOf(92) != -1) {
                    str = v(X, i7);
                }
            }
        }
        int i8 = indexOf + 1;
        char charAt = i8 >= this.q ? (char) 26 : this.p.charAt(i8);
        if (charAt == ',') {
            this.f1488e = i8;
            int i9 = i8 + 1;
            this.f1488e = i9;
            this.f1487d = i9 < this.q ? this.p.charAt(i9) : (char) 26;
            this.o = 3;
            this.a = 16;
            return str;
        }
        if (charAt != '}') {
            this.o = -1;
            return this.r;
        }
        int i10 = i8 + 1;
        char charAt2 = i10 >= this.q ? (char) 26 : this.p.charAt(i10);
        if (charAt2 == ',') {
            this.a = 16;
            this.f1488e = i10;
            q();
        } else if (charAt2 == ']') {
            this.a = 15;
            this.f1488e = i10;
            q();
        } else if (charAt2 == '}') {
            this.a = 13;
            this.f1488e = i10;
            q();
        } else {
            if (charAt2 != 26) {
                this.o = -1;
                return this.r;
            }
            this.a = 20;
            this.f1488e = i10;
            this.f1487d = (char) 26;
        }
        this.o = 4;
        return str;
    }

    public long H(long j) {
        this.o = 0;
        int p = p(j);
        if (p == 0) {
            return 0L;
        }
        int i = p + 1;
        int i2 = this.f1488e + p;
        if ((i2 >= this.q ? (char) 26 : this.p.charAt(i2)) != '\"') {
            this.o = -1;
            return 0L;
        }
        long j2 = -2128831035;
        while (true) {
            int i3 = i + 1;
            int i4 = this.f1488e + i;
            char charAt = i4 >= this.q ? (char) 26 : this.p.charAt(i4);
            if (charAt == '\"') {
                int i5 = i3 + 1;
                int i6 = this.f1488e + i3;
                char charAt2 = i6 >= this.q ? (char) 26 : this.p.charAt(i6);
                if (charAt2 == ',') {
                    int i7 = (i5 - 1) + this.f1488e;
                    this.f1488e = i7;
                    int i8 = i7 + 1;
                    this.f1488e = i8;
                    this.f1487d = i8 < this.q ? this.p.charAt(i8) : (char) 26;
                    this.o = 3;
                    return j2;
                }
                if (charAt2 != '}') {
                    this.o = -1;
                    return 0L;
                }
                int i9 = i5 + 1;
                int i10 = this.f1488e + i5;
                char charAt3 = i10 >= this.q ? (char) 26 : this.p.charAt(i10);
                if (charAt3 == ',') {
                    this.a = 16;
                    this.f1488e = (i9 - 1) + this.f1488e;
                    q();
                } else if (charAt3 == ']') {
                    this.a = 15;
                    this.f1488e = (i9 - 1) + this.f1488e;
                    q();
                } else if (charAt3 == '}') {
                    this.a = 13;
                    this.f1488e = (i9 - 1) + this.f1488e;
                    q();
                } else {
                    if (charAt3 != 26) {
                        this.o = -1;
                        return 0L;
                    }
                    this.a = 20;
                    this.f1488e = (i9 - 1) + this.f1488e;
                    this.f1487d = (char) 26;
                }
                this.o = 4;
                return j2;
            }
            j2 = (j2 ^ charAt) * 16777619;
            if (charAt == '\\') {
                this.o = -1;
                return 0L;
            }
            i = i3;
        }
    }

    public boolean I(boolean z2) {
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        char b;
        int i5;
        char b2;
        int i6;
        int i7;
        char b3;
        char b4;
        int i8 = this.q;
        int i9 = this.f1488e;
        int i10 = i8 - i9;
        if (!z2 && i10 > 13 && this.p.startsWith("/Date(", i9) && b((this.f1488e + i10) - 1) == '/' && b((this.f1488e + i10) - 2) == ')') {
            int i11 = -1;
            for (int i12 = 6; i12 < i10; i12++) {
                char b5 = b(this.f1488e + i12);
                if (b5 != '+') {
                    if (b5 < '0' || b5 > '9') {
                        break;
                    }
                } else {
                    i11 = i12;
                }
            }
            if (i11 == -1) {
                return false;
            }
            int i13 = this.f1488e + 6;
            long parseLong = Long.parseLong(W(i13, i11 - i13), 10);
            Calendar calendar = Calendar.getInstance(this.l, this.m);
            this.n = calendar;
            calendar.setTimeInMillis(parseLong);
            this.a = 5;
            return true;
        }
        if (i10 == 8 || i10 == 14 || i10 == 17) {
            int i14 = 0;
            if (z2) {
                return false;
            }
            char b6 = b(this.f1488e);
            char b7 = b(this.f1488e + 1);
            char b8 = b(this.f1488e + 2);
            char b9 = b(this.f1488e + 3);
            char b10 = b(this.f1488e + 4);
            char b11 = b(this.f1488e + 5);
            char b12 = b(this.f1488e + 6);
            char b13 = b(this.f1488e + 7);
            if (!c(b6, b7, b8, b9, b10, b11, b12, b13)) {
                return false;
            }
            S(b6, b7, b8, b9, b10, b11, b12, b13);
            if (i10 != 8) {
                char b14 = b(this.f1488e + 8);
                char b15 = b(this.f1488e + 9);
                char b16 = b(this.f1488e + 10);
                char b17 = b(this.f1488e + 11);
                char b18 = b(this.f1488e + 12);
                char b19 = b(this.f1488e + 13);
                if (!d(b14, b15, b16, b17, b18, b19)) {
                    return false;
                }
                if (i10 == 17) {
                    char b20 = b(this.f1488e + 14);
                    char b21 = b(this.f1488e + 15);
                    char b22 = b(this.f1488e + 16);
                    c2 = '0';
                    if (b20 < '0' || b20 > '9' || b21 < '0' || b21 > '9' || b22 < '0' || b22 > '9') {
                        return false;
                    }
                    i4 = (b22 - '0') + ((b21 - '0') * 10) + ((b20 - '0') * 100);
                } else {
                    c2 = '0';
                    i4 = 0;
                }
                i2 = (b19 - '0') + ((b18 - '0') * 10);
                i14 = (b17 - c2) + ((b16 - c2) * 10);
                int i15 = i4;
                i3 = ((b14 - c2) * 10) + (b15 - c2);
                i = i15;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            this.n.set(11, i3);
            this.n.set(12, i14);
            this.n.set(13, i2);
            this.n.set(14, i);
            this.a = 5;
            return true;
        }
        if (i10 < 10 || b(this.f1488e + 4) != '-' || b(this.f1488e + 7) != '-') {
            return false;
        }
        char b23 = b(this.f1488e);
        char b24 = b(this.f1488e + 1);
        char b25 = b(this.f1488e + 2);
        char b26 = b(this.f1488e + 3);
        char b27 = b(this.f1488e + 5);
        char b28 = b(this.f1488e + 6);
        char b29 = b(this.f1488e + 8);
        char b30 = b(this.f1488e + 9);
        if (!c(b23, b24, b25, b26, b27, b28, b29, b30)) {
            return false;
        }
        S(b23, b24, b25, b26, b27, b28, b29, b30);
        char b31 = b(this.f1488e + 10);
        if (b31 != 'T' && (b31 != ' ' || z2)) {
            if (b31 != '\"' && b31 != 26) {
                return false;
            }
            this.n.set(11, 0);
            this.n.set(12, 0);
            this.n.set(13, 0);
            this.n.set(14, 0);
            int i16 = this.f1488e + 10;
            this.f1488e = i16;
            this.f1487d = b(i16);
            this.a = 5;
            return true;
        }
        if (i10 < 19 || b(this.f1488e + 13) != ':' || b(this.f1488e + 16) != ':') {
            return false;
        }
        char b32 = b(this.f1488e + 11);
        char b33 = b(this.f1488e + 12);
        char b34 = b(this.f1488e + 14);
        char b35 = b(this.f1488e + 15);
        char b36 = b(this.f1488e + 17);
        char b37 = b(this.f1488e + 18);
        if (!d(b32, b33, b34, b35, b36, b37)) {
            return false;
        }
        this.n.set(11, (b33 - '0') + ((b32 - '0') * 10));
        this.n.set(12, (b35 - '0') + ((b34 - '0') * 10));
        this.n.set(13, (b37 - '0') + ((b36 - '0') * 10));
        char b38 = b(this.f1488e + 19);
        if (b38 != '.') {
            this.n.set(14, 0);
            int i17 = this.f1488e + 19;
            this.f1488e = i17;
            this.f1487d = b(i17);
            this.a = 5;
            if (b38 == 'Z' && this.n.getTimeZone().getRawOffset() != 0) {
                String[] availableIDs = TimeZone.getAvailableIDs(0);
                if (availableIDs.length > 0) {
                    this.n.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
                }
            }
            return true;
        }
        if (i10 >= 21 && (b = b(this.f1488e + 20)) >= '0' && b <= '9') {
            int[] iArr = w;
            int i18 = iArr[b];
            if (i10 <= 21 || (b4 = b(this.f1488e + 21)) < '0' || b4 > '9') {
                i5 = 1;
            } else {
                i18 = (i18 * 10) + iArr[b4];
                i5 = 2;
            }
            if (i5 == 2 && (b3 = b(this.f1488e + 22)) >= '0' && b3 <= '9') {
                i18 = (i18 * 10) + iArr[b3];
                i5 = 3;
            }
            this.n.set(14, i18);
            char b39 = b(this.f1488e + 20 + i5);
            if (b39 == '+' || b39 == '-') {
                char b40 = b(this.f1488e + 20 + i5 + 1);
                if (b40 >= '0' && b40 <= '1' && (b2 = b(this.f1488e + 20 + i5 + 2)) >= '0' && b2 <= '9') {
                    char b41 = b(this.f1488e + 20 + i5 + 3);
                    if (b41 == ':') {
                        if (b(this.f1488e + 20 + i5 + 4) != '0' || b(this.f1488e + 20 + i5 + 5) != '0') {
                            return false;
                        }
                        i6 = 6;
                    } else if (b41 != '0') {
                        i6 = 3;
                    } else {
                        if (b(this.f1488e + 20 + i5 + 4) != '0') {
                            return false;
                        }
                        i6 = 5;
                    }
                    int i19 = ((iArr[b40] * 10) + iArr[b2]) * 3600 * 1000;
                    if (b39 == '-') {
                        i19 = -i19;
                    }
                    if (this.n.getTimeZone().getRawOffset() != i19) {
                        String[] availableIDs2 = TimeZone.getAvailableIDs(i19);
                        if (availableIDs2.length > 0) {
                            this.n.setTimeZone(TimeZone.getTimeZone(availableIDs2[0]));
                        }
                    }
                    i7 = i6;
                }
            } else if (b39 == 'Z') {
                if (this.n.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs3 = TimeZone.getAvailableIDs(0);
                    if (availableIDs3.length > 0) {
                        this.n.setTimeZone(TimeZone.getTimeZone(availableIDs3[0]));
                    }
                }
                i7 = 1;
            } else {
                i7 = 0;
            }
            int i20 = i5 + 20 + i7;
            char b42 = b(this.f1488e + i20);
            if (b42 != 26 && b42 != '\"') {
                return false;
            }
            int i21 = this.f1488e + i20;
            this.f1488e = i21;
            this.f1487d = b(i21);
            this.a = 5;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        return -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long K() {
        /*
            r14 = this;
            r0 = 0
            r14.j = r0
            char r1 = r14.f1487d
            r2 = 1
            r3 = 45
            if (r1 != r3) goto L3b
            r0 = -9223372036854775808
            r3 = 0
            int r3 = r3 + r2
            r14.j = r3
            int r3 = r14.f1488e
            int r3 = r3 + r2
            r14.f1488e = r3
            int r4 = r14.q
            if (r3 >= r4) goto L24
            java.lang.String r4 = r14.p
            char r3 = r4.charAt(r3)
            r14.f1487d = r3
            r3 = r0
            r0 = r2
            goto L40
        L24:
            com.alibaba.fastjson.d r0 = new com.alibaba.fastjson.d
            java.lang.String r1 = "syntax error, "
            java.lang.StringBuilder r1 = e.a.a.a.a.M(r1)
            java.lang.String r2 = r14.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3b:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L40:
            r5 = 0
        L42:
            char r1 = r14.f1487d
            r7 = 48
            if (r1 < r7) goto Laa
            r7 = 57
            if (r1 > r7) goto Laa
            int r1 = r1 + (-48)
            r7 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r8 = ", "
            java.lang.String r9 = "error long value, "
            if (r7 < 0) goto L95
            r10 = 10
            long r5 = r5 * r10
            long r10 = (long) r1
            long r12 = r3 + r10
            int r1 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r1 < 0) goto L80
            long r5 = r5 - r10
            int r1 = r14.j
            int r1 = r1 + r2
            r14.j = r1
            int r1 = r14.f1488e
            int r1 = r1 + r2
            r14.f1488e = r1
            int r7 = r14.q
            if (r1 < r7) goto L77
            r1 = 26
            goto L7d
        L77:
            java.lang.String r7 = r14.p
            char r1 = r7.charAt(r1)
        L7d:
            r14.f1487d = r1
            goto L42
        L80:
            com.alibaba.fastjson.d r0 = new com.alibaba.fastjson.d
            java.lang.StringBuilder r1 = e.a.a.a.a.Q(r9, r5, r8)
            java.lang.String r2 = r14.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L95:
            com.alibaba.fastjson.d r0 = new com.alibaba.fastjson.d
            java.lang.StringBuilder r1 = e.a.a.a.a.Q(r9, r5, r8)
            java.lang.String r2 = r14.i()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Laa:
            if (r0 != 0) goto Lad
            long r5 = -r5
        Lad:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.K():long");
    }

    public final void L() {
        char c2;
        char c3;
        int i = this.f1488e;
        this.j = i;
        this.h = false;
        if (this.f1487d == '-') {
            this.f1490g++;
            int i2 = i + 1;
            this.f1488e = i2;
            this.f1487d = i2 >= this.q ? (char) 26 : this.p.charAt(i2);
        }
        while (true) {
            c2 = this.f1487d;
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.f1490g++;
            int i3 = this.f1488e + 1;
            this.f1488e = i3;
            this.f1487d = i3 >= this.q ? (char) 26 : this.p.charAt(i3);
        }
        this.i = false;
        if (c2 == '.') {
            this.f1490g++;
            int i4 = this.f1488e + 1;
            this.f1488e = i4;
            this.f1487d = i4 >= this.q ? (char) 26 : this.p.charAt(i4);
            this.i = true;
            while (true) {
                char c4 = this.f1487d;
                if (c4 < '0' || c4 > '9') {
                    break;
                }
                this.f1490g++;
                int i5 = this.f1488e + 1;
                this.f1488e = i5;
                this.f1487d = i5 >= this.q ? (char) 26 : this.p.charAt(i5);
            }
        }
        char c5 = this.f1487d;
        if (c5 == 'L') {
            this.f1490g++;
            q();
        } else if (c5 == 'S') {
            this.f1490g++;
            q();
        } else if (c5 == 'B') {
            this.f1490g++;
            q();
        } else if (c5 == 'F') {
            this.f1490g++;
            q();
            this.i = true;
        } else if (c5 == 'D') {
            this.f1490g++;
            q();
            this.i = true;
        } else if (c5 == 'e' || c5 == 'E') {
            this.f1490g++;
            int i6 = this.f1488e + 1;
            this.f1488e = i6;
            char charAt = i6 >= this.q ? (char) 26 : this.p.charAt(i6);
            this.f1487d = charAt;
            if (charAt == '+' || charAt == '-') {
                this.f1490g++;
                int i7 = this.f1488e + 1;
                this.f1488e = i7;
                this.f1487d = i7 >= this.q ? (char) 26 : this.p.charAt(i7);
            }
            while (true) {
                c3 = this.f1487d;
                if (c3 < '0' || c3 > '9') {
                    break;
                }
                this.f1490g++;
                int i8 = this.f1488e + 1;
                this.f1488e = i8;
                this.f1487d = i8 >= this.q ? (char) 26 : this.p.charAt(i8);
            }
            if (c3 == 'D' || c3 == 'F') {
                this.f1490g++;
                q();
            }
            this.h = true;
            this.i = true;
        }
        if (this.i) {
            this.a = 3;
        } else {
            this.a = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0224 A[Catch: NumberFormatException -> 0x0254, TryCatch #0 {NumberFormatException -> 0x0254, blocks: (B:84:0x01fc, B:89:0x0208, B:91:0x020c, B:95:0x021d, B:96:0x0214, B:98:0x021b, B:104:0x0224, B:107:0x022a, B:109:0x022f, B:112:0x0235, B:114:0x0205, B:115:0x023a, B:117:0x0244, B:120:0x024a), top: B:81:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f A[Catch: NumberFormatException -> 0x0254, TryCatch #0 {NumberFormatException -> 0x0254, blocks: (B:84:0x01fc, B:89:0x0208, B:91:0x020c, B:95:0x021d, B:96:0x0214, B:98:0x021b, B:104:0x0224, B:107:0x022a, B:109:0x022f, B:112:0x0235, B:114:0x0205, B:115:0x023a, B:117:0x0244, B:120:0x024a), top: B:81:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0244 A[Catch: NumberFormatException -> 0x0254, TryCatch #0 {NumberFormatException -> 0x0254, blocks: (B:84:0x01fc, B:89:0x0208, B:91:0x020c, B:95:0x021d, B:96:0x0214, B:98:0x021b, B:104:0x0224, B:107:0x022a, B:109:0x022f, B:112:0x0235, B:114:0x0205, B:115:0x023a, B:117:0x0244, B:120:0x024a), top: B:81:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024a A[Catch: NumberFormatException -> 0x0254, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0254, blocks: (B:84:0x01fc, B:89:0x0208, B:91:0x020c, B:95:0x021d, B:96:0x0214, B:98:0x021b, B:104:0x0224, B:107:0x022a, B:109:0x022f, B:112:0x0235, B:114:0x0205, B:115:0x023a, B:117:0x0244, B:120:0x024a), top: B:81:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c A[Catch: NumberFormatException -> 0x0254, TryCatch #0 {NumberFormatException -> 0x0254, blocks: (B:84:0x01fc, B:89:0x0208, B:91:0x020c, B:95:0x021d, B:96:0x0214, B:98:0x021b, B:104:0x0224, B:107:0x022a, B:109:0x022f, B:112:0x0235, B:114:0x0205, B:115:0x023a, B:117:0x0244, B:120:0x024a), top: B:81:0x01f8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number M() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.M():java.lang.Number");
    }

    public final void N() {
        char c2 = this.f1487d;
        int i = this.f1488e + 1;
        int indexOf = this.p.indexOf(c2, i);
        if (indexOf == -1) {
            StringBuilder M = e.a.a.a.a.M("unclosed str, ");
            M.append(i());
            throw new com.alibaba.fastjson.d(M.toString());
        }
        int i2 = indexOf - i;
        char[] X = X(this.f1488e + 1, i2);
        boolean z2 = false;
        while (i2 > 0 && X[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && X[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int indexOf2 = this.p.indexOf(c2, indexOf + 1);
            int i5 = (indexOf2 - indexOf) + i2;
            if (i5 >= X.length) {
                int length = (X.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(X, 0, cArr, 0, X.length);
                X = cArr;
            }
            this.p.getChars(indexOf, indexOf2, X, i2);
            indexOf = indexOf2;
            i2 = i5;
            z2 = true;
        }
        if (!z2) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (X[i6] == '\\') {
                    z2 = true;
                }
            }
        }
        this.f1489f = X;
        this.f1490g = i2;
        this.j = this.f1488e;
        this.k = z2;
        int i7 = indexOf + 1;
        this.f1488e = i7;
        this.f1487d = i7 >= this.q ? (char) 26 : this.p.charAt(i7);
        this.a = 4;
    }

    public String O(char c2) {
        String str;
        int i = this.f1488e + 1;
        int indexOf = this.p.indexOf(c2, i);
        if (indexOf == -1) {
            StringBuilder M = e.a.a.a.a.M("unclosed str, ");
            M.append(i());
            throw new com.alibaba.fastjson.d(M.toString());
        }
        if (u) {
            str = this.p.substring(i, indexOf);
        } else {
            int i2 = indexOf - i;
            str = new String(X(this.f1488e + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = indexOf - 1; i4 >= 0 && this.p.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                indexOf = this.p.indexOf(c2, indexOf + 1);
            }
            int i5 = indexOf - i;
            str = v(X(this.f1488e + 1, i5), i5);
        }
        int i6 = indexOf + 1;
        this.f1488e = i6;
        this.f1487d = i6 >= this.q ? (char) 26 : this.p.charAt(i6);
        return str;
    }

    public final String P(m mVar) {
        char c2;
        while (true) {
            c2 = this.f1487d;
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                break;
            }
            q();
        }
        if (c2 == '\"') {
            return Q(mVar, '\"');
        }
        if (c2 == '\'') {
            return Q(mVar, '\'');
        }
        if (c2 == '}') {
            q();
            this.a = 13;
            return null;
        }
        if (c2 == ',') {
            q();
            this.a = 16;
            return null;
        }
        if (c2 != 26) {
            return R(mVar);
        }
        this.a = 20;
        return null;
    }

    public String Q(m mVar, char c2) {
        String v2;
        int i = this.f1488e + 1;
        int indexOf = this.p.indexOf(c2, i);
        if (indexOf == -1) {
            StringBuilder M = e.a.a.a.a.M("unclosed str, ");
            M.append(i());
            throw new com.alibaba.fastjson.d(M.toString());
        }
        int i2 = indexOf - i;
        char[] X = X(this.f1488e + 1, i2);
        boolean z2 = false;
        while (i2 > 0 && X[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && X[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int indexOf2 = this.p.indexOf(c2, indexOf + 1);
            int i5 = (indexOf2 - indexOf) + i2;
            if (i5 >= X.length) {
                int length = (X.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(X, 0, cArr, 0, X.length);
                X = cArr;
            }
            this.p.getChars(indexOf, indexOf2, X, i2);
            indexOf = indexOf2;
            i2 = i5;
            z2 = true;
        }
        if (z2) {
            v2 = v(X, i2);
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                char c3 = X[i7];
                i6 = (i6 * 31) + c3;
                if (c3 == '\\') {
                    z2 = true;
                }
            }
            v2 = z2 ? v(X, i2) : i2 < 20 ? mVar.b(X, 0, i2, i6) : new String(X, 0, i2);
        }
        int i8 = indexOf + 1;
        this.f1488e = i8;
        this.f1487d = i8 >= this.q ? (char) 26 : this.p.charAt(i8);
        return v2;
    }

    public final String R(m mVar) {
        int i = this.f1487d;
        boolean[] zArr = z;
        if (!(i >= zArr.length || zArr[i])) {
            StringBuilder M = e.a.a.a.a.M("illegal identifier : ");
            M.append(this.f1487d);
            M.append(", ");
            M.append(i());
            throw new com.alibaba.fastjson.d(M.toString());
        }
        this.j = this.f1488e;
        this.f1490g = 1;
        while (true) {
            char q = q();
            boolean[] zArr2 = A;
            if (q < zArr2.length && !zArr2[q]) {
                break;
            }
            i = (i * 31) + q;
            this.f1490g++;
        }
        this.f1487d = b(this.f1488e);
        this.a = 18;
        if (this.f1490g == 4 && this.p.startsWith("null", this.j)) {
            return null;
        }
        return mVar.a(this.p, this.j, this.f1490g, i);
    }

    protected void T() {
        q();
        char c2 = this.f1487d;
        if (c2 == '/') {
            do {
                q();
            } while (this.f1487d != '\n');
            q();
        } else {
            if (c2 != '*') {
                throw new com.alibaba.fastjson.d("invalid comment");
            }
            q();
            while (true) {
                char c3 = this.f1487d;
                if (c3 == 26) {
                    return;
                }
                if (c3 == '*') {
                    q();
                    if (this.f1487d == '/') {
                        q();
                        return;
                    }
                } else {
                    q();
                }
            }
        }
    }

    final void U() {
        while (true) {
            char c2 = this.f1487d;
            if (c2 > '/') {
                return;
            }
            if (c2 == ' ' || c2 == '\r' || c2 == '\n' || c2 == '\t' || c2 == '\f' || c2 == '\b') {
                q();
            } else if (c2 != '/') {
                return;
            } else {
                T();
            }
        }
    }

    public final String V() {
        return this.k ? v(this.f1489f, this.f1490g) : W(this.j + 1, this.f1490g);
    }

    final char[] X(int i, int i2) {
        char[] cArr = this.f1489f;
        if (i2 < cArr.length) {
            this.p.getChars(i, i2 + i, cArr, 0);
            return this.f1489f;
        }
        char[] cArr2 = new char[i2];
        this.f1489f = cArr2;
        this.p.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public final int Y() {
        return this.a;
    }

    public byte[] a() {
        return h(this.p, this.j + 1, this.f1490g);
    }

    protected char b(int i) {
        if (i >= this.q) {
            return (char) 26;
        }
        return this.p.charAt(i);
    }

    public void e() {
        char[] cArr = this.f1489f;
        if (cArr.length <= 8196) {
            v.set(cArr);
        }
        this.f1489f = null;
    }

    public final Number f(boolean z2) {
        char[] cArr;
        boolean z3;
        int i = (this.j + this.f1490g) - 1;
        char charAt = i >= this.q ? (char) 26 : this.p.charAt(i);
        try {
            if (charAt == 'F') {
                return Float.valueOf(Float.parseFloat(u()));
            }
            if (charAt == 'D') {
                return Double.valueOf(Double.parseDouble(u()));
            }
            if (z2) {
                return g();
            }
            char charAt2 = this.p.charAt((this.j + this.f1490g) - 1);
            int i2 = this.f1490g;
            if (charAt2 == 'L' || charAt2 == 'S' || charAt2 == 'B' || charAt2 == 'F' || charAt2 == 'D') {
                i2--;
            }
            int i3 = this.j;
            char[] cArr2 = this.f1489f;
            int i4 = 0;
            if (i2 < cArr2.length) {
                this.p.getChars(i3, i3 + i2, cArr2, 0);
                cArr = this.f1489f;
            } else {
                char[] cArr3 = new char[i2];
                this.p.getChars(i3, i3 + i2, cArr3, 0);
                cArr = cArr3;
            }
            if (i2 > 9 || this.h) {
                return Double.valueOf(Double.parseDouble(new String(cArr, 0, i2)));
            }
            char c2 = cArr[0];
            int i5 = 2;
            if (c2 == '-') {
                c2 = cArr[1];
                z3 = true;
            } else {
                if (c2 == '+') {
                    c2 = cArr[1];
                } else {
                    i5 = 1;
                }
                z3 = false;
            }
            int i6 = c2 - '0';
            while (i5 < i2) {
                char c3 = cArr[i5];
                if (c3 == '.') {
                    i4 = 1;
                } else {
                    i6 = (i6 * 10) + (c3 - '0');
                    if (i4 != 0) {
                        i4 *= 10;
                    }
                }
                i5++;
            }
            double d2 = i6 / i4;
            if (z3) {
                d2 = -d2;
            }
            return Double.valueOf(d2);
        } catch (NumberFormatException e2) {
            throw new com.alibaba.fastjson.d(e2.getMessage() + ", " + i());
        }
    }

    public final BigDecimal g() {
        char charAt = this.p.charAt((this.j + this.f1490g) - 1);
        int i = this.f1490g;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        int i2 = this.j;
        char[] cArr = this.f1489f;
        if (i < cArr.length) {
            this.p.getChars(i2, i2 + i, cArr, 0);
            return new BigDecimal(this.f1489f, 0, i);
        }
        char[] cArr2 = new char[i];
        this.p.getChars(i2, i + i2, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    public String i() {
        StringBuilder M = e.a.a.a.a.M("pos ");
        M.append(this.f1488e);
        M.append(", json : ");
        M.append(this.q < 65536 ? this.p : this.p.substring(0, 65536));
        return M.toString();
    }

    public final int j() {
        int i;
        boolean z2;
        int i2 = this.j;
        int i3 = this.f1490g + i2;
        int i4 = 0;
        if ((i2 >= this.q ? (char) 26 : this.p.charAt(i2)) == '-') {
            i = Integer.MIN_VALUE;
            i2++;
            z2 = true;
        } else {
            i = -2147483647;
            z2 = false;
        }
        if (i2 < i3) {
            i4 = -((i2 >= this.q ? (char) 26 : this.p.charAt(i2)) - '0');
            i2++;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            char charAt = i2 >= this.q ? (char) 26 : this.p.charAt(i2);
            if (charAt == 'L' || charAt == 'S' || charAt == 'B') {
                i2 = i5;
                break;
            }
            int i6 = charAt - '0';
            if (i4 < -214748364) {
                throw new NumberFormatException(u());
            }
            int i7 = i4 * 10;
            if (i7 < i + i6) {
                throw new NumberFormatException(u());
            }
            i4 = i7 - i6;
            i2 = i5;
        }
        if (!z2) {
            return -i4;
        }
        if (i2 > this.j + 1) {
            return i4;
        }
        throw new NumberFormatException(u());
    }

    public final Number k() throws NumberFormatException {
        char c2;
        long j;
        boolean z2;
        long j2;
        int i = this.j;
        int i2 = this.f1490g + i;
        int i3 = i2 - 1;
        char charAt = i3 >= this.q ? (char) 26 : this.p.charAt(i3);
        if (charAt == 'B') {
            i2--;
            c2 = 'B';
        } else if (charAt == 'L') {
            i2--;
            c2 = 'L';
        } else if (charAt != 'S') {
            c2 = ' ';
        } else {
            i2--;
            c2 = 'S';
        }
        int i4 = this.j;
        if ((i4 >= this.q ? (char) 26 : this.p.charAt(i4)) == '-') {
            j = Long.MIN_VALUE;
            i++;
            z2 = true;
        } else {
            j = -9223372036854775807L;
            z2 = false;
        }
        if (i < i2) {
            j2 = -((i >= this.q ? (char) 26 : this.p.charAt(i)) - '0');
            i++;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i5 = i + 1;
            int charAt2 = (i >= this.q ? (char) 26 : this.p.charAt(i)) - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(u());
            }
            long j3 = j2 * 10;
            long j4 = charAt2;
            if (j3 < j + j4) {
                return new BigInteger(u());
            }
            j2 = j3 - j4;
            i = i5;
        }
        if (!z2) {
            long j5 = -j2;
            return (j5 > 2147483647L || c2 == 'L') ? Long.valueOf(j5) : c2 == 'S' ? Short.valueOf((short) j5) : c2 == 'B' ? Byte.valueOf((byte) j5) : Integer.valueOf((int) j5);
        }
        if (i > this.j + 1) {
            return (j2 < -2147483648L || c2 == 'L') ? Long.valueOf(j2) : c2 == 'S' ? Short.valueOf((short) j2) : c2 == 'B' ? Byte.valueOf((byte) j2) : Integer.valueOf((int) j2);
        }
        throw new NumberFormatException(u());
    }

    public final boolean l() {
        int i = 0;
        while (true) {
            char b = b(i);
            boolean z2 = true;
            if (b == 26) {
                return true;
            }
            if (b > ' ' || (b != ' ' && b != '\n' && b != '\r' && b != '\t' && b != '\f' && b != '\b')) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }

    public final boolean m(Feature feature) {
        return (feature.mask & this.f1486c) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005d -> B:6:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() throws java.lang.NumberFormatException {
        /*
            r13 = this;
            int r0 = r13.j
            int r1 = r13.f1490g
            int r1 = r1 + r0
            char r2 = r13.b(r0)
            r3 = 1
            r4 = 45
            if (r2 != r4) goto L14
            r4 = -9223372036854775808
            int r0 = r0 + 1
            r2 = r3
            goto L1a
        L14:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 0
        L1a:
            if (r0 >= r1) goto L28
            int r6 = r0 + 1
            char r0 = r13.b(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r7 = (long) r0
        L26:
            r0 = r6
            goto L2a
        L28:
            r7 = 0
        L2a:
            if (r0 >= r1) goto L74
            int r6 = r0 + 1
            int r9 = r13.q
            if (r0 < r9) goto L35
            r0 = 26
            goto L3b
        L35:
            java.lang.String r9 = r13.p
            char r0 = r9.charAt(r0)
        L3b:
            r9 = 76
            if (r0 == r9) goto L73
            r9 = 83
            if (r0 == r9) goto L73
            r9 = 66
            if (r0 != r9) goto L48
            goto L73
        L48:
            int r0 = r0 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L69
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r4 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L5f
            long r7 = r7 - r9
            goto L26
        L5f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.u()
            r0.<init>(r1)
            throw r0
        L69:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.u()
            r0.<init>(r1)
            throw r0
        L73:
            r0 = r6
        L74:
            if (r2 == 0) goto L86
            int r1 = r13.j
            int r1 = r1 + r3
            if (r0 <= r1) goto L7c
            return r7
        L7c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.u()
            r0.<init>(r1)
            throw r0
        L86:
            long r0 = -r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.n():long");
    }

    public boolean o(long j) {
        char c2 = this.f1487d;
        int i = this.f1488e + 1;
        int i2 = 1;
        while (c2 != '\"' && c2 != '\'') {
            if (c2 > ' ' || !(c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\f' || c2 == '\b')) {
                this.t = 0L;
                this.o = -2;
                return false;
            }
            int i3 = i2 + 1;
            int i4 = this.f1488e + i2;
            c2 = i4 >= this.q ? (char) 26 : this.p.charAt(i4);
            i2 = i3;
        }
        int i5 = i;
        long j2 = -2128831035;
        while (true) {
            if (i5 >= this.q) {
                break;
            }
            char charAt = this.p.charAt(i5);
            if (charAt == c2) {
                i2 += (i5 - i) + 1;
                break;
            }
            j2 = 16777619 * (j2 ^ charAt);
            i5++;
        }
        if (j2 != j) {
            this.o = -2;
            this.t = j2;
            return false;
        }
        int i6 = i2 + 1;
        int i7 = this.f1488e + i2;
        char charAt2 = i7 >= this.q ? (char) 26 : this.p.charAt(i7);
        while (charAt2 != ':') {
            if (charAt2 > ' ' || !(charAt2 == ' ' || charAt2 == '\n' || charAt2 == '\r' || charAt2 == '\t' || charAt2 == '\f' || charAt2 == '\b')) {
                throw new com.alibaba.fastjson.d("match feild error expect ':'");
            }
            int i8 = i6 + 1;
            int i9 = this.f1488e + i6;
            charAt2 = i9 >= this.q ? (char) 26 : this.p.charAt(i9);
            i6 = i8;
        }
        int i10 = this.f1488e + i6;
        char charAt3 = i10 >= this.q ? (char) 26 : this.p.charAt(i10);
        if (charAt3 == '{') {
            int i11 = i10 + 1;
            this.f1488e = i11;
            this.f1487d = i11 >= this.q ? (char) 26 : this.p.charAt(i11);
            this.a = 12;
        } else if (charAt3 == '[') {
            int i12 = i10 + 1;
            this.f1488e = i12;
            this.f1487d = i12 >= this.q ? (char) 26 : this.p.charAt(i12);
            this.a = 14;
        } else {
            this.f1488e = i10;
            this.f1487d = i10 >= this.q ? (char) 26 : this.p.charAt(i10);
            r();
        }
        return true;
    }

    public char q() {
        int i = this.f1488e + 1;
        this.f1488e = i;
        char charAt = i >= this.q ? (char) 26 : this.p.charAt(i);
        this.f1487d = charAt;
        return charAt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        L();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0103, code lost:
    
        J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0106, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.r():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void s(int i) {
        this.f1490g = 0;
        while (true) {
            if (i != 2) {
                if (i == 4) {
                    char c2 = this.f1487d;
                    if (c2 == '\"') {
                        this.b = this.f1488e;
                        N();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.b = this.f1488e;
                        L();
                        return;
                    } else if (c2 == '{') {
                        this.a = 12;
                        int i2 = this.f1488e + 1;
                        this.f1488e = i2;
                        this.f1487d = i2 < this.q ? this.p.charAt(i2) : (char) 26;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.f1487d;
                    if (c3 == '{') {
                        this.a = 12;
                        int i3 = this.f1488e + 1;
                        this.f1488e = i3;
                        this.f1487d = i3 < this.q ? this.p.charAt(i3) : (char) 26;
                        return;
                    }
                    if (c3 == '[') {
                        this.a = 14;
                        int i4 = this.f1488e + 1;
                        this.f1488e = i4;
                        this.f1487d = i4 < this.q ? this.p.charAt(i4) : (char) 26;
                        return;
                    }
                } else if (i != 18) {
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.f1487d;
                                if (c4 != '[') {
                                    if (c4 == '{') {
                                        this.a = 12;
                                        q();
                                        break;
                                    }
                                } else {
                                    this.a = 14;
                                    q();
                                    break;
                                }
                                break;
                            case 15:
                                if (this.f1487d == ']') {
                                    this.a = 15;
                                    q();
                                    break;
                                }
                                break;
                            case 16:
                                char c5 = this.f1487d;
                                if (c5 != ',') {
                                    if (c5 != '}') {
                                        if (c5 != ']') {
                                            if (c5 == 26) {
                                                this.a = 20;
                                                break;
                                            }
                                        } else {
                                            this.a = 15;
                                            int i5 = this.f1488e + 1;
                                            this.f1488e = i5;
                                            this.f1487d = i5 < this.q ? this.p.charAt(i5) : (char) 26;
                                            break;
                                        }
                                    } else {
                                        this.a = 13;
                                        int i6 = this.f1488e + 1;
                                        this.f1488e = i6;
                                        this.f1487d = i6 < this.q ? this.p.charAt(i6) : (char) 26;
                                        break;
                                    }
                                } else {
                                    this.a = 16;
                                    int i7 = this.f1488e + 1;
                                    this.f1488e = i7;
                                    this.f1487d = i7 < this.q ? this.p.charAt(i7) : (char) 26;
                                    break;
                                }
                                break;
                        }
                        return;
                    }
                    if (this.f1487d == 26) {
                        this.a = 20;
                        return;
                    }
                } else {
                    while (true) {
                        char c6 = this.f1487d;
                        if (!(c6 <= ' ' && (c6 == ' ' || c6 == '\n' || c6 == '\r' || c6 == '\t' || c6 == '\f' || c6 == '\b'))) {
                            if (c6 == '_' || Character.isLetter(c6)) {
                                J();
                                return;
                            } else {
                                r();
                                return;
                            }
                        }
                        q();
                    }
                }
            } else {
                char c7 = this.f1487d;
                if (c7 >= '0' && c7 <= '9') {
                    this.b = this.f1488e;
                    L();
                    return;
                }
                if (c7 == '\"') {
                    this.b = this.f1488e;
                    N();
                    return;
                } else if (c7 == '[') {
                    this.a = 14;
                    q();
                    return;
                } else if (c7 == '{') {
                    this.a = 12;
                    q();
                    return;
                }
            }
            char c8 = this.f1487d;
            if (c8 != ' ' && c8 != '\n' && c8 != '\r' && c8 != '\t' && c8 != '\f' && c8 != '\b') {
                r();
                return;
            }
            q();
        }
    }

    public final void t(char c2) {
        this.f1490g = 0;
        while (true) {
            char c3 = this.f1487d;
            if (c3 == c2) {
                int i = this.f1488e + 1;
                this.f1488e = i;
                this.f1487d = i >= this.q ? (char) 26 : this.p.charAt(i);
                r();
                return;
            }
            if (c3 != ' ' && c3 != '\n' && c3 != '\r' && c3 != '\t' && c3 != '\f' && c3 != '\b') {
                throw new com.alibaba.fastjson.d("not match " + c2 + " - " + this.f1487d);
            }
            q();
        }
    }

    public final String u() {
        char charAt = this.p.charAt((this.j + this.f1490g) - 1);
        int i = this.f1490g;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        return W(this.j, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean w(long r11) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.w(long):boolean");
    }

    public final double x(long j) {
        int i;
        char b;
        int i2;
        double parseDouble;
        int i3;
        char b2;
        this.o = 0;
        int p = p(j);
        if (p == 0) {
            return 0.0d;
        }
        int i4 = p + 1;
        char b3 = b(this.f1488e + p);
        int i5 = this.f1488e;
        int i6 = (i5 + i4) - 1;
        boolean z2 = b3 == '-';
        if (z2) {
            char b4 = b(i5 + i4);
            i4++;
            b3 = b4;
        }
        if (b3 < '0' || b3 > '9') {
            this.o = -1;
            return 0.0d;
        }
        int i7 = b3 - '0';
        while (true) {
            i = i4 + 1;
            b = b(this.f1488e + i4);
            if (b < '0' || b > '9') {
                break;
            }
            i7 = (i7 * 10) + (b - '0');
            i4 = i;
        }
        if (b == '.') {
            int i8 = i + 1;
            char b5 = b(this.f1488e + i);
            if (b5 < '0' || b5 > '9') {
                this.o = -1;
                return 0.0d;
            }
            i7 = (b5 - '0') + (i7 * 10);
            int i9 = 10;
            while (true) {
                i3 = i8 + 1;
                b2 = b(this.f1488e + i8);
                if (b2 < '0' || b2 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (b2 - '0');
                i9 *= 10;
                i8 = i3;
            }
            i = i3;
            i2 = i9;
            b = b2;
        } else {
            i2 = 1;
        }
        boolean z3 = b == 'e' || b == 'E';
        if (z3) {
            int i10 = i + 1;
            b = b(this.f1488e + i);
            if (b == '+' || b == '-') {
                int i11 = i10 + 1;
                b = b(this.f1488e + i10);
                i = i11;
            } else {
                i = i10;
            }
            while (b >= '0' && b <= '9') {
                int i12 = i + 1;
                b = b(this.f1488e + i);
                i = i12;
            }
        }
        int i13 = ((this.f1488e + i) - i6) - 1;
        if (z3 || i13 >= 10) {
            parseDouble = Double.parseDouble(W(i6, i13));
        } else {
            parseDouble = i7 / i2;
            if (z2) {
                parseDouble = -parseDouble;
            }
        }
        if (b == ',') {
            this.f1488e = (i - 1) + this.f1488e;
            q();
            this.o = 3;
            this.a = 16;
            return parseDouble;
        }
        if (b != '}') {
            this.o = -1;
            return 0.0d;
        }
        int i14 = i + 1;
        char b6 = b(this.f1488e + i);
        if (b6 == ',') {
            this.a = 16;
            this.f1488e = (i14 - 1) + this.f1488e;
            q();
        } else if (b6 == ']') {
            this.a = 15;
            this.f1488e = (i14 - 1) + this.f1488e;
            q();
        } else if (b6 == '}') {
            this.a = 13;
            this.f1488e = (i14 - 1) + this.f1488e;
            q();
        } else {
            if (b6 != 26) {
                this.o = -1;
                return 0.0d;
            }
            this.f1488e = (i14 - 1) + this.f1488e;
            this.a = 20;
            this.f1487d = (char) 26;
        }
        this.o = 4;
        return parseDouble;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d3, code lost:
    
        r19.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00d5, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021a, code lost:
    
        r19.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x021c, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0116 -> B:66:0x0119). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double[] y(long r20) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.y(long):double[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x00e6, code lost:
    
        r20.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x00e8, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x028d, code lost:
    
        r12 = r3;
        r20.o = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0290, code lost:
    
        return r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double[][] z(long r21) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.d.z(long):double[][]");
    }

    public d(String str, int i) {
        this.f1486c = com.alibaba.fastjson.a.f1464c;
        this.h = false;
        this.i = false;
        this.l = com.alibaba.fastjson.a.a;
        this.m = com.alibaba.fastjson.a.b;
        this.n = null;
        this.o = 0;
        char[] cArr = v.get();
        this.f1489f = cArr;
        if (cArr == null) {
            this.f1489f = new char[512];
        }
        this.f1486c = i;
        this.p = str;
        int length = str.length();
        this.q = length;
        this.f1488e = -1;
        int i2 = (-1) + 1;
        this.f1488e = i2;
        char charAt = i2 >= length ? (char) 26 : str.charAt(i2);
        this.f1487d = charAt;
        if (charAt == 65279) {
            q();
        }
        this.r = (Feature.InitStringFieldAsEmpty.mask & i) != 0 ? "" : null;
        this.s = (Feature.DisableCircularReferenceDetect.mask & i) != 0;
    }
}
