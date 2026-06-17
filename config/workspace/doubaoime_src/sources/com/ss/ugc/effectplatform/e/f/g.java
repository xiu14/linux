package com.ss.ugc.effectplatform.e.f;

import bytekn.foundation.io.file.ContentEncoding;
import bytekn.foundation.io.file.h;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: f, reason: collision with root package name */
    private static final byte f8481f = (byte) 13;

    /* renamed from: g, reason: collision with root package name */
    private static final byte f8482g = (byte) 10;
    private byte[] a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f8483c;

    /* renamed from: d, reason: collision with root package name */
    private final bytekn.foundation.io.file.b f8484d;

    /* renamed from: e, reason: collision with root package name */
    private final ContentEncoding f8485e;

    public static final class a extends bytekn.foundation.io.file.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ g f8486d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, g gVar) {
            super(i);
            this.f8486d = gVar;
        }

        @Override // bytekn.foundation.io.file.a
        public String toString() {
            try {
                return com.ss.ugc.effectplatform.g.a.b(a(), 0, (b() <= 0 || a()[b() + (-1)] != g.f8481f) ? b() : b() - 1, this.f8486d.f8485e);
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public g(bytekn.foundation.io.file.b bVar, int i, ContentEncoding contentEncoding, int i2) {
        i = (i2 & 2) != 0 ? 8192 : i;
        l.g(bVar, "inputStream");
        l.g(contentEncoding, "contentEncoding");
        this.f8484d = bVar;
        this.f8485e = contentEncoding;
        if (i <= 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (contentEncoding != ContentEncoding.Ascii) {
            throw new IllegalArgumentException("Unsupported encoding!");
        }
        this.a = new byte[i];
    }

    private final boolean c() {
        byte[] bArr = this.a;
        if (bArr == null) {
            throw new Exception("buf is null!");
        }
        if (bArr != null) {
            int a2 = this.f8484d.a(bArr, 0, bArr.length);
            if (a2 <= 0) {
                return false;
            }
            this.b = 0;
            this.f8483c = a2;
        }
        return true;
    }

    @Override // bytekn.foundation.io.file.h
    public void close() {
        this.f8484d.close();
        this.a = null;
    }

    public final boolean d() {
        return this.f8483c == -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if (r0[r3] == com.ss.ugc.effectplatform.e.f.g.f8481f) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r7 = this;
            byte[] r0 = r7.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r0 == 0) goto L7d
            int r2 = r7.b
            int r3 = r7.f8483c
            if (r2 < r3) goto L15
            boolean r2 = r7.c()
            if (r2 != 0) goto L15
            return r1
        L15:
            int r2 = r7.b
            int r3 = r7.f8483c
        L19:
            if (r2 >= r3) goto L3e
            r4 = r0[r2]
            byte r5 = com.ss.ugc.effectplatform.e.f.g.f8482g
            if (r4 != r5) goto L3b
            int r1 = r7.b
            if (r2 == r1) goto L2e
            int r3 = r2 + (-1)
            r4 = r0[r3]
            byte r5 = com.ss.ugc.effectplatform.e.f.g.f8481f
            if (r4 != r5) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            int r3 = r3 - r1
            bytekn.foundation.io.file.ContentEncoding r4 = r7.f8485e
            java.lang.String r0 = com.ss.ugc.effectplatform.g.a.b(r0, r1, r3, r4)
            int r2 = r2 + 1
            r7.b = r2
            return r0
        L3b:
            int r2 = r2 + 1
            goto L19
        L3e:
            com.ss.ugc.effectplatform.e.f.g$a r2 = new com.ss.ugc.effectplatform.e.f.g$a
            int r3 = r7.f8483c
            int r4 = r7.b
            int r3 = r3 - r4
            int r3 = r3 + 80
            r2.<init>(r3, r7)
        L4a:
            int r3 = r7.b
            int r4 = r7.f8483c
            int r4 = r4 - r3
            r2.d(r0, r3, r4)
            r3 = -1
            r7.f8483c = r3
            boolean r3 = r7.c()
            if (r3 != 0) goto L5c
            return r1
        L5c:
            int r3 = r7.b
            int r4 = r7.f8483c
        L60:
            if (r3 >= r4) goto L4a
            r5 = r0[r3]
            byte r6 = com.ss.ugc.effectplatform.e.f.g.f8482g
            if (r5 != r6) goto L7a
            int r1 = r7.b
            if (r3 == r1) goto L71
            int r4 = r3 - r1
            r2.d(r0, r1, r4)
        L71:
            int r3 = r3 + 1
            r7.b = r3
            java.lang.String r0 = r2.toString()
            return r0
        L7a:
            int r3 = r3 + 1
            goto L60
        L7d:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.e.f.g.e():java.lang.String");
    }
}
