package com.bytedance.android.input.j;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class f implements com.bytedance.android.input.j.a {

    private static final class a {
        private final c a;
        private final boolean b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2454c;

        public a(c cVar, boolean z, String str) {
            l.f(cVar, "request");
            l.f(str, "trailingText");
            this.a = cVar;
            this.b = z;
            this.f2454c = str;
        }

        public final boolean a() {
            return this.b;
        }

        public final c b() {
            return this.a;
        }

        public final String c() {
            return this.f2454c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.a, aVar.a) && this.b == aVar.b && l.a(this.f2454c, aVar.f2454c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return this.f2454c.hashCode() + ((hashCode + i) * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SpaceRewrite(request=");
            M.append(this.a);
            M.append(", changed=");
            M.append(this.b);
            M.append(", trailingText=");
            return e.a.a.a.a.G(M, this.f2454c, ')');
        }
    }

    private final boolean b(int i) {
        if (19968 <= i && i < 40960) {
            return true;
        }
        if (13312 <= i && i < 19904) {
            return true;
        }
        if (131072 <= i && i < 173792) {
            return true;
        }
        if (173824 <= i && i < 191472) {
            return true;
        }
        return 63744 <= i && i < 64256;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean c(int r4) {
        /*
            r3 = this;
            r0 = 65
            r1 = 0
            r2 = 1
            if (r0 > r4) goto Lc
            r0 = 91
            if (r4 >= r0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 != 0) goto L1f
            r0 = 97
            if (r0 > r4) goto L19
            r0 = 123(0x7b, float:1.72E-43)
            if (r4 >= r0) goto L19
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r0 != 0) goto L2f
            r0 = 48
            if (r0 > r4) goto L2c
            r0 = 58
            if (r4 >= r0) goto L2c
            r4 = r2
            goto L2d
        L2c:
            r4 = r1
        L2d:
            if (r4 == 0) goto L30
        L2f:
            r1 = r2
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.j.f.c(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011a  */
    @Override // com.bytedance.android.input.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.android.input.j.d a(com.bytedance.android.input.j.a.InterfaceC0077a r15) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.j.f.a(com.bytedance.android.input.j.a$a):com.bytedance.android.input.j.d");
    }
}
