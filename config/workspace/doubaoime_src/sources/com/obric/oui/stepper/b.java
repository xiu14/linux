package com.obric.oui.stepper;

import android.text.InputFilter;

/* loaded from: classes2.dex */
public class b implements InputFilter {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private a f8044c;

    interface a {
        void a(int i);
    }

    public b(int i, int i2, a aVar) {
        this.a = i;
        this.b = i2;
        this.f8044c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: NumberFormatException -> 0x0039, TryCatch #0 {NumberFormatException -> 0x0039, blocks: (B:2:0x0000, B:10:0x0032, B:12:0x0036), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030 A[RETURN] */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.CharSequence filter(java.lang.CharSequence r1, int r2, int r3, android.text.Spanned r4, int r5, int r6) {
        /*
            r0 = this;
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L39
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L39
            java.lang.String r3 = r4.toString()     // Catch: java.lang.NumberFormatException -> L39
            r2.append(r3)     // Catch: java.lang.NumberFormatException -> L39
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> L39
            r2.append(r1)     // Catch: java.lang.NumberFormatException -> L39
            java.lang.String r1 = r2.toString()     // Catch: java.lang.NumberFormatException -> L39
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L39
            int r2 = r0.a     // Catch: java.lang.NumberFormatException -> L39
            int r3 = r0.b     // Catch: java.lang.NumberFormatException -> L39
            r4 = 1
            r5 = 0
            if (r3 <= r2) goto L28
            if (r1 < r2) goto L2d
            if (r1 > r3) goto L2d
            goto L2e
        L28:
            if (r1 < r3) goto L2d
            if (r1 > r2) goto L2d
            goto L2e
        L2d:
            r4 = r5
        L2e:
            if (r4 == 0) goto L32
            r1 = 0
            return r1
        L32:
            com.obric.oui.stepper.b$a r2 = r0.f8044c     // Catch: java.lang.NumberFormatException -> L39
            if (r2 == 0) goto L39
            r2.a(r1)     // Catch: java.lang.NumberFormatException -> L39
        L39:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.stepper.b.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
