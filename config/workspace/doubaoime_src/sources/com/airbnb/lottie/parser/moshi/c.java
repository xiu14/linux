package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import f.e;
import f.g;
import f.h;
import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
final class c extends JsonReader {
    private static final h l = h.c("'\\");
    private static final h m = h.c("\"\\");
    private static final h n = h.c("{}[]:, \n\t\r\f/\\;#=");
    private static final h o = h.c("\n\r");
    private static final h p = h.c("*/");

    /* renamed from: f, reason: collision with root package name */
    private final g f1366f;

    /* renamed from: g, reason: collision with root package name */
    private final e f1367g;
    private int h = 0;
    private long i;
    private int j;

    @Nullable
    private String k;

    c(g gVar) {
        Objects.requireNonNull(gVar, "source == null");
        this.f1366f = gVar;
        this.f1367g = gVar.b();
        H(6);
    }

    private void Q() throws IOException {
        P("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d3, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d4, code lost:
    
        if (r5 == r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d6, code lost:
    
        if (r5 == 4) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d9, code lost:
    
        if (r5 != 7) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01db, code lost:
    
        r17.j = r1;
        r14 = 17;
        r17.h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (Y(r2) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ad, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ae, code lost:
    
        if (r5 != r2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b0, code lost:
    
        if (r6 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b6, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
    
        if (r9 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
    
        if (r7 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
    
        if (r9 != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c2, code lost:
    
        if (r9 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c5, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c6, code lost:
    
        r17.i = r7;
        r17.f1367g.skip(r1);
        r14 = 16;
        r17.h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int S() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.c.S():int");
    }

    private int U(String str, JsonReader.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.h = 0;
                this.f1364c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private boolean Y(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        Q();
        throw null;
    }

    private int a0(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!this.f1366f.T(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte l2 = this.f1367g.l(i);
            if (l2 != 10 && l2 != 32 && l2 != 13 && l2 != 9) {
                this.f1367g.skip(i2 - 1);
                if (l2 == 47) {
                    if (!this.f1366f.T(2L)) {
                        return l2;
                    }
                    Q();
                    throw null;
                }
                if (l2 != 35) {
                    return l2;
                }
                Q();
                throw null;
            }
            i = i2;
        }
    }

    private String c0(h hVar) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long B = this.f1366f.B(hVar);
            if (B == -1) {
                P("Unterminated string");
                throw null;
            }
            if (this.f1367g.l(B) != 92) {
                if (sb == null) {
                    String k = this.f1367g.k(B);
                    this.f1367g.readByte();
                    return k;
                }
                sb.append(this.f1367g.k(B));
                this.f1367g.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f1367g.k(B));
            this.f1367g.readByte();
            sb.append(f0());
        }
    }

    private String e0() throws IOException {
        long B = this.f1366f.B(n);
        return B != -1 ? this.f1367g.k(B) : this.f1367g.A();
    }

    private char f0() throws IOException {
        int i;
        int i2;
        if (!this.f1366f.T(1L)) {
            P("Unterminated escape sequence");
            throw null;
        }
        byte readByte = this.f1367g.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            StringBuilder M = e.a.a.a.a.M("Invalid escape sequence: \\");
            M.append((char) readByte);
            P(M.toString());
            throw null;
        }
        if (!this.f1366f.T(4L)) {
            StringBuilder M2 = e.a.a.a.a.M("Unterminated escape sequence at path ");
            M2.append(p());
            throw new EOFException(M2.toString());
        }
        char c2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte l2 = this.f1367g.l(i3);
            char c3 = (char) (c2 << 4);
            if (l2 < 48 || l2 > 57) {
                if (l2 >= 97 && l2 <= 102) {
                    i = l2 - 97;
                } else {
                    if (l2 < 65 || l2 > 70) {
                        StringBuilder M3 = e.a.a.a.a.M("\\u");
                        M3.append(this.f1367g.k(4L));
                        P(M3.toString());
                        throw null;
                    }
                    i = l2 - 65;
                }
                i2 = i + 10;
            } else {
                i2 = l2 - 48;
            }
            c2 = (char) (i2 + c3);
        }
        this.f1367g.skip(4L);
        return c2;
    }

    private void j0(h hVar) throws IOException {
        while (true) {
            long B = this.f1366f.B(hVar);
            if (B == -1) {
                P("Unterminated string");
                throw null;
            }
            if (this.f1367g.l(B) != 92) {
                this.f1367g.skip(B + 1);
                return;
            } else {
                this.f1367g.skip(B + 1);
                f0();
            }
        }
    }

    private void l0() throws IOException {
        long B = this.f1366f.B(n);
        e eVar = this.f1367g;
        if (B == -1) {
            B = eVar.I();
        }
        eVar.skip(B);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String A() throws IOException {
        String k;
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 10) {
            k = e0();
        } else if (i == 9) {
            k = c0(m);
        } else if (i == 8) {
            k = c0(l);
        } else if (i == 11) {
            k = this.k;
            this.k = null;
        } else if (i == 16) {
            k = Long.toString(this.i);
        } else {
            if (i != 17) {
                StringBuilder M = e.a.a.a.a.M("Expected a string but was ");
                M.append(G());
                M.append(" at path ");
                M.append(p());
                throw new a(M.toString());
            }
            k = this.f1367g.k(this.j);
        }
        this.h = 0;
        int[] iArr = this.f1365d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        return k;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token G() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int I(JsonReader.a aVar) throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return U(this.k, aVar);
        }
        int m0 = this.f1366f.m0(aVar.b);
        if (m0 != -1) {
            this.h = 0;
            this.f1364c[this.a - 1] = aVar.a[m0];
            return m0;
        }
        String str = this.f1364c[this.a - 1];
        String z = z();
        int U = U(z, aVar);
        if (U == -1) {
            this.h = 15;
            this.k = z;
            this.f1364c[this.a - 1] = str;
        }
        return U;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void M() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 14) {
            l0();
        } else if (i == 13) {
            j0(m);
        } else if (i == 12) {
            j0(l);
        } else if (i != 15) {
            StringBuilder M = e.a.a.a.a.M("Expected a name but was ");
            M.append(G());
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
        this.h = 0;
        this.f1364c[this.a - 1] = "null";
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void N() throws IOException {
        int i = 0;
        do {
            int i2 = this.h;
            if (i2 == 0) {
                i2 = S();
            }
            if (i2 == 3) {
                H(1);
            } else if (i2 == 1) {
                H(3);
            } else {
                if (i2 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder M = e.a.a.a.a.M("Expected a value but was ");
                        M.append(G());
                        M.append(" at path ");
                        M.append(p());
                        throw new a(M.toString());
                    }
                    this.a--;
                } else if (i2 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder M2 = e.a.a.a.a.M("Expected a value but was ");
                        M2.append(G());
                        M2.append(" at path ");
                        M2.append(p());
                        throw new a(M2.toString());
                    }
                    this.a--;
                } else if (i2 == 14 || i2 == 10) {
                    l0();
                } else if (i2 == 9 || i2 == 13) {
                    j0(m);
                } else if (i2 == 8 || i2 == 12) {
                    j0(l);
                } else if (i2 == 17) {
                    this.f1367g.skip(this.j);
                } else if (i2 == 18) {
                    StringBuilder M3 = e.a.a.a.a.M("Expected a value but was ");
                    M3.append(G());
                    M3.append(" at path ");
                    M3.append(p());
                    throw new a(M3.toString());
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.f1365d;
        int i3 = this.a;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f1364c[i3 - 1] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.f1367g.a();
        this.f1366f.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void d() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 3) {
            H(1);
            this.f1365d[this.a - 1] = 0;
            this.h = 0;
        } else {
            StringBuilder M = e.a.a.a.a.M("Expected BEGIN_ARRAY but was ");
            M.append(G());
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void h() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 1) {
            H(3);
            this.h = 0;
        } else {
            StringBuilder M = e.a.a.a.a.M("Expected BEGIN_OBJECT but was ");
            M.append(G());
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void l() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i != 4) {
            StringBuilder M = e.a.a.a.a.M("Expected END_ARRAY but was ");
            M.append(G());
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
        int i2 = this.a - 1;
        this.a = i2;
        int[] iArr = this.f1365d;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void o() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i != 2) {
            StringBuilder M = e.a.a.a.a.M("Expected END_OBJECT but was ");
            M.append(G());
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
        int i2 = this.a - 1;
        this.a = i2;
        this.f1364c[i2] = null;
        int[] iArr = this.f1365d;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean r() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean s() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 5) {
            this.h = 0;
            int[] iArr = this.f1365d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i == 6) {
            this.h = 0;
            int[] iArr2 = this.f1365d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        StringBuilder M = e.a.a.a.a.M("Expected a boolean but was ");
        M.append(G());
        M.append(" at path ");
        M.append(p());
        throw new a(M.toString());
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("JsonReader(");
        M.append(this.f1366f);
        M.append(")");
        return M.toString();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double w() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 16) {
            this.h = 0;
            int[] iArr = this.f1365d;
            int i2 = this.a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.i;
        }
        if (i == 17) {
            this.k = this.f1367g.k(this.j);
        } else if (i == 9) {
            this.k = c0(m);
        } else if (i == 8) {
            this.k = c0(l);
        } else if (i == 10) {
            this.k = e0();
        } else if (i != 11) {
            StringBuilder M = e.a.a.a.a.M("Expected a double but was ");
            M.append(G());
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + p());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.f1365d;
            int i3 = this.a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            StringBuilder M2 = e.a.a.a.a.M("Expected a double but was ");
            M2.append(this.k);
            M2.append(" at path ");
            M2.append(p());
            throw new a(M2.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int x() throws IOException {
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 16) {
            long j = this.i;
            int i2 = (int) j;
            if (j == i2) {
                this.h = 0;
                int[] iArr = this.f1365d;
                int i3 = this.a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder M = e.a.a.a.a.M("Expected an int but was ");
            M.append(this.i);
            M.append(" at path ");
            M.append(p());
            throw new a(M.toString());
        }
        if (i == 17) {
            this.k = this.f1367g.k(this.j);
        } else if (i == 9 || i == 8) {
            String c0 = i == 9 ? c0(m) : c0(l);
            this.k = c0;
            try {
                int parseInt = Integer.parseInt(c0);
                this.h = 0;
                int[] iArr2 = this.f1365d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder M2 = e.a.a.a.a.M("Expected an int but was ");
            M2.append(G());
            M2.append(" at path ");
            M2.append(p());
            throw new a(M2.toString());
        }
        this.h = 11;
        try {
            double parseDouble = Double.parseDouble(this.k);
            int i5 = (int) parseDouble;
            if (i5 != parseDouble) {
                StringBuilder M3 = e.a.a.a.a.M("Expected an int but was ");
                M3.append(this.k);
                M3.append(" at path ");
                M3.append(p());
                throw new a(M3.toString());
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.f1365d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            StringBuilder M4 = e.a.a.a.a.M("Expected an int but was ");
            M4.append(this.k);
            M4.append(" at path ");
            M4.append(p());
            throw new a(M4.toString());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String z() throws IOException {
        String str;
        int i = this.h;
        if (i == 0) {
            i = S();
        }
        if (i == 14) {
            str = e0();
        } else if (i == 13) {
            str = c0(m);
        } else if (i == 12) {
            str = c0(l);
        } else {
            if (i != 15) {
                StringBuilder M = e.a.a.a.a.M("Expected a name but was ");
                M.append(G());
                M.append(" at path ");
                M.append(p());
                throw new a(M.toString());
            }
            str = this.k;
        }
        this.h = 0;
        this.f1364c[this.a - 1] = str;
        return str;
    }
}
