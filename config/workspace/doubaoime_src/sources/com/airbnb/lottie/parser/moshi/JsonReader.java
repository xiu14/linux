package com.airbnb.lottie.parser.moshi;

import f.e;
import f.g;
import f.h;
import f.p;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f1363e = new String[128];
    int a;
    int[] b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    String[] f1364c = new String[32];

    /* renamed from: d, reason: collision with root package name */
    int[] f1365d = new int[32];

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static final class a {
        final String[] a;
        final p b;

        private a(String[] strArr, p pVar) {
            this.a = strArr;
            this.b = pVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                e eVar = new e();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.a(eVar, strArr[i]);
                    eVar.readByte();
                    hVarArr[i] = eVar.w();
                }
                return new a((String[]) strArr.clone(), p.f10054c.c(hVarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f1363e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f1363e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    JsonReader() {
    }

    public static JsonReader D(g gVar) {
        return new c(gVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void a(f.f r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.f1363e
            f.e r7 = (f.e) r7
            r1 = 34
            r7.U(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L38
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1e
            r5 = r0[r5]
            if (r5 != 0) goto L2b
            goto L35
        L1e:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L25
            java.lang.String r5 = "\\u2028"
            goto L2b
        L25:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L35
            java.lang.String r5 = "\\u2029"
        L2b:
            if (r4 >= r3) goto L30
            r7.l0(r8, r4, r3)
        L30:
            r7.j0(r5)
            int r4 = r3 + 1
        L35:
            int r3 = r3 + 1
            goto Lf
        L38:
            if (r4 >= r2) goto L3d
            r7.l0(r8, r4, r2)
        L3d:
            r7.U(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.JsonReader.a(f.f, java.lang.String):void");
    }

    public abstract String A() throws IOException;

    public abstract Token G() throws IOException;

    final void H(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder M = e.a.a.a.a.M("Nesting too deep at ");
                M.append(p());
                throw new com.airbnb.lottie.parser.moshi.a(M.toString());
            }
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1364c;
            this.f1364c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f1365d;
            this.f1365d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract int I(a aVar) throws IOException;

    public abstract void M() throws IOException;

    public abstract void N() throws IOException;

    final b P(String str) throws b {
        StringBuilder S = e.a.a.a.a.S(str, " at path ");
        S.append(p());
        throw new b(S.toString());
    }

    public abstract void d() throws IOException;

    public abstract void h() throws IOException;

    public abstract void l() throws IOException;

    public abstract void o() throws IOException;

    public final String p() {
        int i = this.a;
        int[] iArr = this.b;
        String[] strArr = this.f1364c;
        int[] iArr2 = this.f1365d;
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean r() throws IOException;

    public abstract boolean s() throws IOException;

    public abstract double w() throws IOException;

    public abstract int x() throws IOException;

    public abstract String z() throws IOException;
}
