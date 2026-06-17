package com.google.gson.stream;

import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class b implements Closeable, Flushable {
    private static final Pattern j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] k = new String[128];
    private static final String[] l;
    private final Writer a;
    private int[] b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    private int f6844c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f6845d;

    /* renamed from: e, reason: collision with root package name */
    private String f6846e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6847f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6848g;
    private String h;
    private boolean i;

    static {
        for (int i = 0; i <= 31; i++) {
            k[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = k;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        l = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        H(6);
        this.f6846e = Constants.COLON_SEPARATOR;
        this.i = true;
        Objects.requireNonNull(writer, "out == null");
        this.a = writer;
    }

    private void A() throws IOException {
        if (this.f6845d == null) {
            return;
        }
        this.a.write(10);
        int i = this.f6844c;
        for (int i2 = 1; i2 < i; i2++) {
            this.a.write(this.f6845d);
        }
    }

    private int G() {
        int i = this.f6844c;
        if (i != 0) {
            return this.b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void H(int i) {
        int i2 = this.f6844c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.f6844c;
        this.f6844c = i3 + 1;
        iArr2[i3] = i;
    }

    private void I(int i) {
        this.b[this.f6844c - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void S(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f6848g
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.b.l
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.b.k
        L9:
            java.io.Writer r1 = r8.a
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.a
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.a
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.a
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.a
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.b.S(java.lang.String):void");
    }

    private void a() throws IOException {
        int G = G();
        if (G == 1) {
            I(2);
            A();
            return;
        }
        if (G == 2) {
            this.a.append(',');
            A();
        } else {
            if (G == 4) {
                this.a.append((CharSequence) this.f6846e);
                I(5);
                return;
            }
            if (G != 6) {
                if (G != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f6847f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            I(7);
        }
    }

    private void j0() throws IOException {
        if (this.h != null) {
            int G = G();
            if (G == 5) {
                this.a.write(44);
            } else if (G != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            A();
            I(4);
            S(this.h);
            this.h = null;
        }
    }

    private b l(int i, int i2, char c2) throws IOException {
        int G = G();
        if (G != i2 && G != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.h != null) {
            StringBuilder M = e.a.a.a.a.M("Dangling name: ");
            M.append(this.h);
            throw new IllegalStateException(M.toString());
        }
        this.f6844c--;
        if (G == i2) {
            A();
        }
        this.a.write(c2);
        return this;
    }

    public b D() throws IOException {
        if (this.h != null) {
            if (!this.i) {
                this.h = null;
                return this;
            }
            j0();
        }
        a();
        this.a.write("null");
        return this;
    }

    public final void M(boolean z) {
        this.f6848g = z;
    }

    public final void N(String str) {
        if (str.length() == 0) {
            this.f6845d = null;
            this.f6846e = Constants.COLON_SEPARATOR;
        } else {
            this.f6845d = str;
            this.f6846e = ": ";
        }
    }

    public final void P(boolean z) {
        this.f6847f = z;
    }

    public final void Q(boolean z) {
        this.i = z;
    }

    public b U(double d2) throws IOException {
        j0();
        if (this.f6847f || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            a();
            this.a.append((CharSequence) Double.toString(d2));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
    }

    public b Y(long j2) throws IOException {
        j0();
        a();
        this.a.write(Long.toString(j2));
        return this;
    }

    public b a0(Boolean bool) throws IOException {
        if (bool == null) {
            return D();
        }
        j0();
        a();
        this.a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public b c0(Number number) throws IOException {
        if (number == null) {
            return D();
        }
        j0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (!(cls == Integer.class || cls == Long.class || cls == Double.class || cls == Float.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class) && !j.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f6847f) {
            throw new IllegalArgumentException(e.a.a.a.a.s("Numeric values must be finite, but was ", obj));
        }
        a();
        this.a.append((CharSequence) obj);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i = this.f6844c;
        if (i > 1 || (i == 1 && this.b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f6844c = 0;
    }

    public b d() throws IOException {
        j0();
        a();
        H(1);
        this.a.write(91);
        return this;
    }

    public b e0(String str) throws IOException {
        if (str == null) {
            return D();
        }
        j0();
        a();
        S(str);
        return this;
    }

    public b f0(boolean z) throws IOException {
        j0();
        a();
        this.a.write(z ? "true" : "false");
        return this;
    }

    public void flush() throws IOException {
        if (this.f6844c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public b h() throws IOException {
        j0();
        a();
        H(3);
        this.a.write(123);
        return this;
    }

    public b o() throws IOException {
        l(1, 2, ']');
        return this;
    }

    public b p() throws IOException {
        l(3, 5, '}');
        return this;
    }

    public final boolean r() {
        return this.i;
    }

    public final boolean s() {
        return this.f6848g;
    }

    public boolean w() {
        return this.f6847f;
    }

    public b x(String str) throws IOException {
        if (str == null) {
            return D();
        }
        j0();
        a();
        this.a.append((CharSequence) str);
        return this;
    }

    public b z(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.h != null) {
            throw new IllegalStateException();
        }
        if (this.f6844c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.h = str;
        return this;
    }
}
