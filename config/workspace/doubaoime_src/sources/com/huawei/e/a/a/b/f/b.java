package com.huawei.e.a.a.b.f;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public class b {
    private final String a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private int f6999c;

    /* renamed from: d, reason: collision with root package name */
    private int f7000d;

    /* renamed from: e, reason: collision with root package name */
    private int f7001e;

    /* renamed from: f, reason: collision with root package name */
    private int f7002f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f7003g;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    private int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            StringBuilder M = e.a.a.a.a.M("Malformed DN: ");
            M.append(this.a);
            throw new IllegalStateException(M.toString());
        }
        char[] cArr = this.f7003g;
        char c2 = cArr[i];
        if (c2 >= '0' && c2 <= '9') {
            i2 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i2 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                StringBuilder M2 = e.a.a.a.a.M("Malformed DN: ");
                M2.append(this.a);
                throw new IllegalStateException(M2.toString());
            }
            i2 = c2 - '7';
        }
        char c3 = cArr[i4];
        if (c3 >= '0' && c3 <= '9') {
            i3 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i3 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                StringBuilder M3 = e.a.a.a.a.M("Malformed DN: ");
                M3.append(this.a);
                throw new IllegalStateException(M3.toString());
            }
            i3 = c3 - '7';
        }
        return (i2 << 4) + i3;
    }

    private char b() {
        int i;
        int i2 = this.f6999c + 1;
        this.f6999c = i2;
        if (i2 == this.b) {
            StringBuilder M = e.a.a.a.a.M("Unexpected end of DN: ");
            M.append(this.a);
            throw new IllegalStateException(M.toString());
        }
        char[] cArr = this.f7003g;
        char c2 = cArr[i2];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                case '*':
                case '+':
                case ',':
                    break;
                default:
                    switch (c2) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int a = a(i2);
                            this.f6999c++;
                            if (a >= 128) {
                                if (a < 192 || a > 247) {
                                    return '?';
                                }
                                if (a <= 223) {
                                    a &= 31;
                                    i = 1;
                                } else if (a <= 239) {
                                    i = 2;
                                    a &= 15;
                                } else {
                                    i = 3;
                                    a &= 7;
                                }
                                for (int i3 = 0; i3 < i; i3++) {
                                    int i4 = this.f6999c + 1;
                                    this.f6999c = i4;
                                    if (i4 == this.b || this.f7003g[i4] != '\\') {
                                        return '?';
                                    }
                                    int i5 = i4 + 1;
                                    this.f6999c = i5;
                                    int a2 = a(i5);
                                    this.f6999c++;
                                    if ((a2 & 192) != 128) {
                                        return '?';
                                    }
                                    a = (a << 6) + (a2 & 63);
                                }
                            }
                            return (char) a;
                    }
            }
        }
        return cArr[i2];
    }

    private String d() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        while (true) {
            i = this.f6999c;
            i2 = this.b;
            if (i >= i2 || this.f7003g[i] != ' ') {
                break;
            }
            this.f6999c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f7000d = i;
        this.f6999c = i + 1;
        while (true) {
            i3 = this.f6999c;
            i4 = this.b;
            if (i3 >= i4) {
                break;
            }
            char[] cArr = this.f7003g;
            if (cArr[i3] == '=' || cArr[i3] == ' ') {
                break;
            }
            this.f6999c = i3 + 1;
        }
        if (i3 >= i4) {
            StringBuilder M = e.a.a.a.a.M("Unexpected end of DN: ");
            M.append(this.a);
            throw new IllegalStateException(M.toString());
        }
        this.f7001e = i3;
        if (this.f7003g[i3] == ' ') {
            while (true) {
                i5 = this.f6999c;
                i6 = this.b;
                if (i5 >= i6) {
                    break;
                }
                char[] cArr2 = this.f7003g;
                if (cArr2[i5] == '=' || cArr2[i5] != ' ') {
                    break;
                }
                this.f6999c = i5 + 1;
            }
            if (this.f7003g[i5] != '=' || i5 == i6) {
                StringBuilder M2 = e.a.a.a.a.M("Unexpected end of DN: ");
                M2.append(this.a);
                throw new IllegalStateException(M2.toString());
            }
        }
        this.f6999c++;
        while (true) {
            int i7 = this.f6999c;
            if (i7 >= this.b || this.f7003g[i7] != ' ') {
                break;
            }
            this.f6999c = i7 + 1;
        }
        int i8 = this.f7001e;
        int i9 = this.f7000d;
        if (i8 - i9 > 4) {
            char[] cArr3 = this.f7003g;
            if (cArr3[i9 + 3] == '.' && (cArr3[i9] == 'O' || cArr3[i9] == 'o')) {
                int i10 = i9 + 1;
                if (cArr3[i10] == 'I' || cArr3[i10] == 'i') {
                    int i11 = i9 + 2;
                    if (cArr3[i11] == 'D' || cArr3[i11] == 'd') {
                        this.f7000d = i9 + 4;
                    }
                }
            }
        }
        char[] cArr4 = this.f7003g;
        int i12 = this.f7000d;
        return new String(cArr4, i12, this.f7001e - i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0088, code lost:
    
        r4 = r13.f7003g;
        r5 = r13.f7000d;
        r3 = new java.lang.String(r4, r5, r13.f7001e - r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.String> c(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.e.a.a.b.f.b.c(java.lang.String):java.util.List");
    }
}
