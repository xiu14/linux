package com.bytedance.android.input.speech.modifypair;

import com.bytedance.android.input.basic.IAppGlobals;
import kotlin.s.c.x;
import kotlin.s.c.z;

/* loaded from: classes.dex */
public final class b {

    public static final class a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            kotlin.s.c.l.f(str, "deleteText");
            kotlin.s.c.l.f(str2, "insertText");
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && kotlin.s.c.l.a(this.b, aVar.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("DiffResult(deleteText=");
            M.append(this.a);
            M.append(", insertText=");
            return e.a.a.a.a.G(M, this.b, ')');
        }
    }

    /* renamed from: com.bytedance.android.input.speech.modifypair.b$b, reason: collision with other inner class name */
    private static final class C0096b {
        private final int a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3118c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3119d;

        public C0096b(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.f3118c = i3;
            this.f3119d = i4;
        }

        public final int a() {
            return this.f3119d;
        }

        public final int b() {
            return this.f3118c;
        }

        public final int c() {
            return this.b;
        }

        public final int d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0096b)) {
                return false;
            }
            C0096b c0096b = (C0096b) obj;
            return this.a == c0096b.a && this.b == c0096b.b && this.f3118c == c0096b.f3118c && this.f3119d == c0096b.f3119d;
        }

        public int hashCode() {
            return Integer.hashCode(this.f3119d) + e.a.a.a.a.I(this.f3118c, e.a.a.a.a.I(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("OverlapInfo(oldStart=");
            M.append(this.a);
            M.append(", oldEnd=");
            M.append(this.b);
            M.append(", newStart=");
            M.append(this.f3118c);
            M.append(", newEnd=");
            return e.a.a.a.a.C(M, this.f3119d, ')');
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ z<String> a;
        final /* synthetic */ x b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0096b f3120c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z<String> zVar, x xVar, C0096b c0096b) {
            super(0);
            this.a = zVar;
            this.b = xVar;
            this.f3120c = c0096b;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 10 found overlapA=[");
            M.append(this.a.a);
            M.append("], overlapLen=");
            M.append(this.b.a);
            M.append(", overlap=");
            M.append(this.f3120c);
            return M.toString();
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 11 oldAfterOverlap=[");
            M.append(this.a);
            M.append("], newAfterOverlap=[");
            return e.a.a.a.a.G(M, this.b, ']');
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 12 return null";
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ x a;
        final /* synthetic */ x b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(x xVar, x xVar2) {
            super(0);
            this.a = xVar;
            this.b = xVar2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 13 commonPrefixLen=");
            M.append(this.a.a);
            M.append(", commonSuffixLen=");
            M.append(this.b.a);
            return M.toString();
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ x a;
        final /* synthetic */ x b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f3121c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f3122d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(x xVar, x xVar2, x xVar3, x xVar4) {
            super(0);
            this.a = xVar;
            this.b = xVar2;
            this.f3121c = xVar3;
            this.f3122d = xVar4;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 14 initial deleteStart=");
            M.append(this.a.a);
            M.append(", deleteEnd=");
            M.append(this.b.a);
            M.append(", insertStart=");
            M.append(this.f3121c.a);
            M.append(", insertEnd=");
            M.append(this.f3122d.a);
            return M.toString();
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ x a;
        final /* synthetic */ x b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f3123c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ x f3124d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(x xVar, x xVar2, x xVar3, x xVar4) {
            super(0);
            this.a = xVar;
            this.b = xVar2;
            this.f3123c = xVar3;
            this.f3124d = xVar4;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 15 after word boundary, deleteStart=");
            M.append(this.a.a);
            M.append(", deleteEnd=");
            M.append(this.b.a);
            M.append(", insertStart=");
            M.append(this.f3123c.a);
            M.append(", insertEnd=");
            M.append(this.f3124d.a);
            return M.toString();
        }
    }

    static final class i extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final i a = new i();

        i() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 16 invalid range, return null";
        }
    }

    static final class j extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 17 result, deleteText=[");
            M.append(this.a);
            M.append("], insertText=[");
            return e.a.a.a.a.G(M, this.b, ']');
        }
    }

    static final class k extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3125c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f3126d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, String str3, boolean z) {
            super(0);
            this.a = str;
            this.b = str2;
            this.f3125c = str3;
            this.f3126d = z;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 01 modifyCursorBefore=[");
            M.append(this.a);
            M.append("], modifyCursorAfter=[");
            M.append(this.b);
            M.append("], afterAllText=[");
            M.append(this.f3125c);
            M.append("], extendToWordBoundary=");
            M.append(this.f3126d);
            return M.toString();
        }
    }

    static final class l extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final l a = new l();

        l() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 02 input is empty, return null";
        }
    }

    static final class m extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 03 maxPossibleOverlap=");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class n extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final n a = new n();

        n() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 04 overlap is null";
        }
    }

    static final class o extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final o a = new o();

        o() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 05 bestOverlapAfter is null";
        }
    }

    static final class p extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            return e.a.a.a.a.G(e.a.a.a.a.M("diff: 06 overlapAfterText: ["), this.a, ']');
        }
    }

    static final class q extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("diff: 07 deleteText=[");
            M.append(this.a);
            M.append("], insertText=[");
            return e.a.a.a.a.G(M, this.b, ']');
        }
    }

    static final class r extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final r a = new r();

        r() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 08 isNeedReturn is null";
        }
    }

    static final class s extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final s a = new s();

        s() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "diff: 09 overlap is null";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:
    
        if (r9 > (r16 != null ? r16.c() : 0)) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.android.input.speech.modifypair.b.a a(java.lang.String r23, java.lang.String r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.modifypair.b.a(java.lang.String, java.lang.String, java.lang.String, boolean):com.bytedance.android.input.speech.modifypair.b$a");
    }

    private static final boolean b(char c2) {
        if ('a' <= c2 && c2 < '{') {
            return true;
        }
        return 'A' <= c2 && c2 < '[';
    }

    public static final void c(kotlin.s.b.a<String> aVar) {
        kotlin.s.c.l.f(aVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("DiffUtils", aVar.invoke());
        }
    }
}
