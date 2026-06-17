package com.google.gson.stream;

import com.google.gson.internal.t;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements Closeable {
    private final Reader a;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private final char[] f6839c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    private int f6840d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f6841e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f6842f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f6843g = 0;
    int h = 0;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private int m;
    private String[] n;
    private int[] o;

    /* renamed from: com.google.gson.stream.a$a, reason: collision with other inner class name */
    class C0338a extends t {
        C0338a() {
        }

        @Override // com.google.gson.internal.t
        public void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).w0();
                return;
            }
            int i = aVar.h;
            if (i == 0) {
                i = aVar.l();
            }
            if (i == 13) {
                aVar.h = 9;
                return;
            }
            if (i == 12) {
                aVar.h = 8;
            } else {
                if (i == 14) {
                    aVar.h = 10;
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Expected a name but was ");
                M.append(aVar.c0());
                M.append(aVar.G());
                throw new IllegalStateException(M.toString());
            }
        }
    }

    static {
        t.a = new C0338a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        this.m = 0;
        this.m = 0 + 1;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.a = reader;
    }

    private boolean D(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    private int Q(boolean z) throws IOException {
        char[] cArr = this.f6839c;
        int i = this.f6840d;
        int i2 = this.f6841e;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                this.f6840d = i;
                if (!r(1)) {
                    if (!z) {
                        return -1;
                    }
                    StringBuilder M = e.a.a.a.a.M("End of input");
                    M.append(G());
                    throw new EOFException(M.toString());
                }
                i = this.f6840d;
                i2 = this.f6841e;
            }
            int i3 = i + 1;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.f6842f++;
                this.f6843g = i3;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f6840d = i3;
                    if (i3 == i2) {
                        this.f6840d = i3 - 1;
                        boolean r = r(2);
                        this.f6840d++;
                        if (!r) {
                            return c2;
                        }
                    }
                    h();
                    int i4 = this.f6840d;
                    char c3 = cArr[i4];
                    if (c3 == '*') {
                        this.f6840d = i4 + 1;
                        while (true) {
                            if (this.f6840d + 2 > this.f6841e && !r(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f6839c;
                            int i5 = this.f6840d;
                            if (cArr2[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (this.f6839c[this.f6840d + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f6842f++;
                            this.f6843g = i5 + 1;
                            this.f6840d++;
                        }
                        if (!z2) {
                            q0("Unterminated comment");
                            throw null;
                        }
                        i = this.f6840d + 2;
                        i2 = this.f6841e;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f6840d = i4 + 1;
                        n0();
                        i = this.f6840d;
                        i2 = this.f6841e;
                    }
                } else {
                    if (c2 != '#') {
                        this.f6840d = i3;
                        return c2;
                    }
                    this.f6840d = i3;
                    h();
                    n0();
                    i = this.f6840d;
                    i2 = this.f6841e;
                }
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r2 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005f, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r2.append(r0, r4, r3 - r4);
        r10.f6840d = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String U(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.f6839c
            r1 = 0
            r2 = r1
        L4:
            int r3 = r10.f6840d
            int r4 = r10.f6841e
        L8:
            r5 = r4
            r4 = r3
        La:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L5d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L29
            r10.f6840d = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L21
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L21:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L29:
            r9 = 92
            if (r3 != r9) goto L50
            r10.f6840d = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L41
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L41:
            r2.append(r0, r4, r8)
            char r3 = r10.f0()
            r2.append(r3)
            int r3 = r10.f6840d
            int r4 = r10.f6841e
            goto L8
        L50:
            r6 = 10
            if (r3 != r6) goto L5b
            int r3 = r10.f6842f
            int r3 = r3 + r7
            r10.f6842f = r3
            r10.f6843g = r8
        L5b:
            r3 = r8
            goto La
        L5d:
            if (r2 != 0) goto L6d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L6d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f6840d = r3
            boolean r3 = r10.r(r7)
            if (r3 == 0) goto L7b
            goto L4
        L7b:
            java.lang.String r11 = "Unterminated string"
            r10.q0(r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.U(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        h();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f6840d
            int r4 = r3 + r2
            int r5 = r6.f6841e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f6839c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.h()
            goto L5c
        L4e:
            char[] r3 = r6.f6839c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.r(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f6839c
            int r4 = r6.f6840d
            r1.append(r3, r4, r2)
            int r3 = r6.f6840d
            int r3 = r3 + r2
            r6.f6840d = r3
            r2 = 1
            boolean r2 = r6.r(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f6839c
            int r3 = r6.f6840d
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f6839c
            int r3 = r6.f6840d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f6840d
            int r2 = r2 + r0
            r6.f6840d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.a0():java.lang.String");
    }

    private void e0(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private char f0() throws IOException {
        int i;
        int i2;
        if (this.f6840d == this.f6841e && !r(1)) {
            q0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f6839c;
        int i3 = this.f6840d;
        int i4 = i3 + 1;
        this.f6840d = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f6842f++;
            this.f6843g = i4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                q0("Invalid escape sequence");
                throw null;
            }
            if (i4 + 4 > this.f6841e && !r(4)) {
                q0("Unterminated escape sequence");
                throw null;
            }
            char c3 = 0;
            int i5 = this.f6840d;
            int i6 = i5 + 4;
            while (i5 < i6) {
                char c4 = this.f6839c[i5];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            StringBuilder M = e.a.a.a.a.M("\\u");
                            M.append(new String(this.f6839c, this.f6840d, 4));
                            throw new NumberFormatException(M.toString());
                        }
                        i = c4 - 'A';
                    }
                    i2 = i + 10;
                } else {
                    i2 = c4 - '0';
                }
                c3 = (char) (i2 + c5);
                i5++;
            }
            this.f6840d += 4;
            return c3;
        }
        return c2;
    }

    private void h() throws IOException {
        if (this.b) {
            return;
        }
        q0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private void l0(char c2) throws IOException {
        char[] cArr = this.f6839c;
        do {
            int i = this.f6840d;
            int i2 = this.f6841e;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = cArr[i];
                if (c3 == c2) {
                    this.f6840d = i3;
                    return;
                }
                if (c3 == '\\') {
                    this.f6840d = i3;
                    f0();
                    i = this.f6840d;
                    i2 = this.f6841e;
                } else {
                    if (c3 == '\n') {
                        this.f6842f++;
                        this.f6843g = i3;
                    }
                    i = i3;
                }
            }
            this.f6840d = i;
        } while (r(1));
        q0("Unterminated string");
        throw null;
    }

    private void n0() throws IOException {
        char c2;
        do {
            if (this.f6840d >= this.f6841e && !r(1)) {
                return;
            }
            char[] cArr = this.f6839c;
            int i = this.f6840d;
            int i2 = i + 1;
            this.f6840d = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.f6842f++;
                this.f6843g = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f6840d
            int r2 = r1 + r0
            int r3 = r4.f6841e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f6839c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.h()
        L4b:
            int r1 = r4.f6840d
            int r1 = r1 + r0
            r4.f6840d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f6840d = r1
            r0 = 1
            boolean r0 = r4.r(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.o0():void");
    }

    private IOException q0(String str) throws IOException {
        StringBuilder M = e.a.a.a.a.M(str);
        M.append(G());
        throw new c(M.toString());
    }

    private boolean r(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f6839c;
        int i4 = this.f6843g;
        int i5 = this.f6840d;
        this.f6843g = i4 - i5;
        int i6 = this.f6841e;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f6841e = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f6841e = 0;
        }
        this.f6840d = 0;
        do {
            Reader reader = this.a;
            int i8 = this.f6841e;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f6841e + read;
            this.f6841e = i2;
            if (this.f6842f == 0 && (i3 = this.f6843g) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f6840d++;
                this.f6843g = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private String w(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.m;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.l[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.o[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.n;
                if (strArr[i] != null) {
                    sb.append(strArr[i]);
                }
            }
            i++;
        }
    }

    public final boolean A() {
        return this.b;
    }

    String G() {
        StringBuilder O = e.a.a.a.a.O(" at line ", this.f6842f + 1, " column ", (this.f6840d - this.f6843g) + 1, " path ");
        O.append(s());
        return O.toString();
    }

    public boolean H() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            StringBuilder M = e.a.a.a.a.M("Expected a boolean but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double I() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.f6839c, this.f6840d, this.j);
            this.f6840d += this.j;
        } else if (i == 8 || i == 9) {
            this.k = U(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.k = a0();
        } else if (i != 11) {
            StringBuilder M = e.a.a.a.a.M("Expected a double but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        if (!this.b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new c("JSON forbids NaN and infinities: " + parseDouble + G());
        }
        this.k = null;
        this.h = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public int M() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 15) {
            long j = this.i;
            int i2 = (int) j;
            if (j != i2) {
                StringBuilder M = e.a.a.a.a.M("Expected an int but was ");
                M.append(this.i);
                M.append(G());
                throw new NumberFormatException(M.toString());
            }
            this.h = 0;
            int[] iArr = this.o;
            int i3 = this.m - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.k = new String(this.f6839c, this.f6840d, this.j);
            this.f6840d += this.j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                StringBuilder M2 = e.a.a.a.a.M("Expected an int but was ");
                M2.append(c0());
                M2.append(G());
                throw new IllegalStateException(M2.toString());
            }
            if (i == 10) {
                this.k = a0();
            } else {
                this.k = U(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            StringBuilder M3 = e.a.a.a.a.M("Expected an int but was ");
            M3.append(this.k);
            M3.append(G());
            throw new NumberFormatException(M3.toString());
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long N() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 15) {
            this.h = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 16) {
            this.k = new String(this.f6839c, this.f6840d, this.j);
            this.f6840d += this.j;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                StringBuilder M = e.a.a.a.a.M("Expected a long but was ");
                M.append(c0());
                M.append(G());
                throw new IllegalStateException(M.toString());
            }
            if (i == 10) {
                this.k = a0();
            } else {
                this.k = U(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.k);
                this.h = 0;
                int[] iArr2 = this.o;
                int i3 = this.m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.k);
        long j = (long) parseDouble;
        if (j != parseDouble) {
            StringBuilder M2 = e.a.a.a.a.M("Expected a long but was ");
            M2.append(this.k);
            M2.append(G());
            throw new NumberFormatException(M2.toString());
        }
        this.k = null;
        this.h = 0;
        int[] iArr3 = this.o;
        int i4 = this.m - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j;
    }

    public String P() throws IOException {
        String U;
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 14) {
            U = a0();
        } else if (i == 12) {
            U = U('\'');
        } else {
            if (i != 13) {
                StringBuilder M = e.a.a.a.a.M("Expected a name but was ");
                M.append(c0());
                M.append(G());
                throw new IllegalStateException(M.toString());
            }
            U = U('\"');
        }
        this.h = 0;
        this.n[this.m - 1] = U;
        return U;
    }

    public void S() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i != 7) {
            StringBuilder M = e.a.a.a.a.M("Expected null but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public String Y() throws IOException {
        String str;
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 10) {
            str = a0();
        } else if (i == 8) {
            str = U('\'');
        } else if (i == 9) {
            str = U('\"');
        } else if (i == 11) {
            str = this.k;
            this.k = null;
        } else if (i == 15) {
            str = Long.toString(this.i);
        } else {
            if (i != 16) {
                StringBuilder M = e.a.a.a.a.M("Expected a string but was ");
                M.append(c0());
                M.append(G());
                throw new IllegalStateException(M.toString());
            }
            str = new String(this.f6839c, this.f6840d, this.j);
            this.f6840d += this.j;
        }
        this.h = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public void a() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 3) {
            e0(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
        } else {
            StringBuilder M = e.a.a.a.a.M("Expected BEGIN_ARRAY but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
    }

    public JsonToken c0() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.a.close();
    }

    public void d() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i == 1) {
            e0(3);
            this.h = 0;
        } else {
            StringBuilder M = e.a.a.a.a.M("Expected BEGIN_OBJECT but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
    }

    public final void j0(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        if (D(r1) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0217, code lost:
    
        if (r9 != 2) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0219, code lost:
    
        if (r10 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x021f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0221, code lost:
    
        if (r16 == 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0225, code lost:
    
        if (r11 != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0227, code lost:
    
        if (r16 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0229, code lost:
    
        if (r16 == 0) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022c, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x022d, code lost:
    
        r20.i = r11;
        r20.f6840d += r8;
        r13 = 15;
        r20.h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0239, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x023a, code lost:
    
        if (r9 == r1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023d, code lost:
    
        if (r9 == 4) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0240, code lost:
    
        if (r9 != 7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0242, code lost:
    
        r20.j = r8;
        r13 = 16;
        r20.h = 16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0181 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0272 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int l() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.a.l():int");
    }

    public void o() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i != 4) {
            StringBuilder M = e.a.a.a.a.M("Expected END_ARRAY but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
        int i2 = this.m - 1;
        this.m = i2;
        int[] iArr = this.o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    public void p() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        if (i != 2) {
            StringBuilder M = e.a.a.a.a.M("Expected END_OBJECT but was ");
            M.append(c0());
            M.append(G());
            throw new IllegalStateException(M.toString());
        }
        int i2 = this.m - 1;
        this.m = i2;
        this.n[i2] = null;
        int[] iArr = this.o;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void p0() throws IOException {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = l();
            }
            switch (i2) {
                case 1:
                    e0(3);
                    i++;
                    this.h = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.n[this.m - 1] = null;
                    }
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 3:
                    e0(1);
                    i++;
                    this.h = 0;
                    break;
                case 4:
                    this.m--;
                    i--;
                    this.h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.h = 0;
                    break;
                case 8:
                    l0('\'');
                    this.h = 0;
                    break;
                case 9:
                    l0('\"');
                    this.h = 0;
                    break;
                case 10:
                    o0();
                    this.h = 0;
                    break;
                case 12:
                    l0('\'');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 13:
                    l0('\"');
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 14:
                    o0();
                    if (i == 0) {
                        this.n[this.m - 1] = "<skipped>";
                    }
                    this.h = 0;
                    break;
                case 16:
                    this.f6840d += this.j;
                    this.h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.o;
        int i3 = this.m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public String s() {
        return w(false);
    }

    public String toString() {
        return getClass().getSimpleName() + G();
    }

    public String x() {
        return w(true);
    }

    public boolean z() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = l();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }
}
