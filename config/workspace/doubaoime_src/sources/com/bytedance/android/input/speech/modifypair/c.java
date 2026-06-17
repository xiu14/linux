package com.bytedance.android.input.speech.modifypair;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c {

    public static final class a {
        private final int a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final String f3127c;

        /* renamed from: d, reason: collision with root package name */
        private final String f3128d;

        public a(int i, int i2, String str, String str2) {
            l.f(str, "deleteText");
            l.f(str2, "insertText");
            this.a = i;
            this.b = i2;
            this.f3127c = str;
            this.f3128d = str2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final String c() {
            return this.f3127c;
        }

        public final String d() {
            return this.f3128d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && l.a(this.f3127c, aVar.f3127c) && l.a(this.f3128d, aVar.f3128d);
        }

        public int hashCode() {
            return this.f3128d.hashCode() + e.a.a.a.a.p0(this.f3127c, e.a.a.a.a.I(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("DiffResult(deleteStart=");
            M.append(this.a);
            M.append(", deleteEnd=");
            M.append(this.b);
            M.append(", deleteText=");
            M.append(this.f3127c);
            M.append(", insertText=");
            return e.a.a.a.a.G(M, this.f3128d, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.input.speech.modifypair.c.a a(java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.modifypair.c.a(java.lang.String, java.lang.String, boolean):com.bytedance.android.input.speech.modifypair.c$a");
    }

    private static final boolean b(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        return 'A' <= c2 && c2 < '[';
    }
}
