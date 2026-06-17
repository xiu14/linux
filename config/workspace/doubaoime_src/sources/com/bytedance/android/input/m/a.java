package com.bytedance.android.input.m;

import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {
    private static String a = "";
    private static String b = "";

    static final class A extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final A a = new A();

        A() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "updateTextBeforeCursor error 02";
        }
    }

    /* renamed from: com.bytedance.android.input.m.a$a, reason: collision with other inner class name */
    public static final class C0084a {
        private final String a;
        private final boolean b;

        public C0084a(String str, boolean z) {
            kotlin.s.c.l.f(str, "text");
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0084a)) {
                return false;
            }
            C0084a c0084a = (C0084a) obj;
            return kotlin.s.c.l.a(this.a, c0084a.a) && this.b == c0084a.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            boolean z = this.b;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("TextWithLimitStatus(text=");
            M.append(this.a);
            M.append(", isAtLimit=");
            return e.a.a.a.a.L(M, this.b, ')');
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final b a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "clearTextCursorInfo";
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "getAllText";
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getAllText ");
            M.append(this.a);
            M.append(", isAtLimit: ");
            M.append(this.b);
            return M.toString();
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "getSmallTextAfterCursor";
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "getSmallTextBeforeCursor";
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getSpecifiedTextAfterCursor, specifiedLen: ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getSpecifiedTextBeforeCursor, specifiedLen: ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class i extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getSpecifiedTextBeforeCursorSafe, specifiedLen: ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class j extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2861c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i, String str, String str2) {
            super(0);
            this.a = i;
            this.b = str;
            this.f2861c = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getSpecifiedTextBeforeCursorSafe specifiedLen=");
            M.append(this.a);
            M.append(" rawText=[");
            M.append(this.b);
            M.append("] result=[");
            return e.a.a.a.a.G(M, this.f2861c, ']');
        }
    }

    static final class k extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final k a = new k();

        k() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "getTextAfterCursor";
        }
    }

    static final class l extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getTextAfterCursor, isFromCache: ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class m extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getTextAfterCursor ");
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
            return "getTextBeforeCursor";
        }
    }

    static final class o extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("getTextBeforeCursor, isFromCache: ");
            M.append(this.a);
            return M.toString();
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
            StringBuilder M = e.a.a.a.a.M("getTextBeforeCursor ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class q extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final q a = new q();

        q() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "getTextBeforeCursorForReplace";
        }
    }

    static final class r extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final r a = new r();

        r() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("isTextBeforeCursorChanged before textBeforeCursor=");
            M.append(a.a);
            return M.toString();
        }
    }

    static final class s extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("newBeforeText=");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class t extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("isTextBeforeCursorChanged isChange:");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class u extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("isTextBeforeCursorChanged both > 120, beforeTextCache.length=");
            M.append(this.a.length());
            M.append(", newBeforeText.length=");
            M.append(this.b.length());
            return M.toString();
        }
    }

    static final class v extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("isTextBeforeCursorChanged suffix1=[");
            M.append(this.a);
            M.append("], suffix2=[");
            return e.a.a.a.a.G(M, this.b, ']');
        }
    }

    static final class w extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("isTextBeforeCursorChanged not both > 120, beforeTextCache.length=");
            M.append(this.a.length());
            M.append(", newBeforeText.length=");
            M.append(this.b.length());
            return M.toString();
        }
    }

    static final class x extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("updateTextBeforeCursor, textBefore: ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class y extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("updateTextBeforeCursor: updated to ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class z extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final z a = new z();

        z() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "updateTextBeforeCursor error 01";
        }
    }

    public static final void b() {
        b bVar = b.a;
        kotlin.s.c.l.f(bVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(bVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "clearTextCursorInfo");
        }
        a = "";
        b = "";
    }

    public static final C0084a c(boolean z2) {
        c cVar = c.a;
        kotlin.s.c.l.f(cVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(cVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "getAllText");
        }
        String m2 = m(z2);
        String k2 = k(z2);
        String s2 = e.a.a.a.a.s(m2, k2);
        boolean z3 = m2.length() >= 128 || k2.length() >= 128;
        d dVar = new d(s2, z3);
        kotlin.s.c.l.f(dVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", dVar.invoke());
        }
        return new C0084a(s2, z3);
    }

    private static final String d(String str, int i2) {
        int charCount;
        if (str.length() == 0) {
            return "";
        }
        int length = str.length();
        Integer num = null;
        int i3 = 0;
        while (length > 0 && i3 < i2) {
            int codePointBefore = str.codePointBefore(length);
            Integer valueOf = Integer.valueOf(codePointBefore);
            length -= Character.charCount(codePointBefore);
            i3++;
            num = valueOf;
        }
        if (num != null) {
            if (new kotlin.w.d(127462, 127487).f(num.intValue())) {
                if (length > 0) {
                    int codePointBefore2 = str.codePointBefore(length);
                    if (127462 <= codePointBefore2 && codePointBefore2 < 127488) {
                        charCount = Character.charCount(codePointBefore2);
                        length -= charCount;
                    }
                }
            } else if ((num.intValue() == 65039 || Character.getType(num.intValue()) == 6) && length > 0) {
                charCount = Character.charCount(str.codePointBefore(length));
                length -= charCount;
            }
        }
        String substring = str.substring(length);
        kotlin.s.c.l.e(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String e() {
        com.bytedance.android.input.editor.a q2;
        e eVar = e.a;
        kotlin.s.c.l.f(eVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(eVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "getSmallTextAfterCursor");
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (q2 = service.q()) == null) {
            return "";
        }
        String d2 = com.bytedance.android.input.common.u.c.d(q2, 10);
        kotlin.s.c.l.e(d2, "getValidTextAfterCursor(…_LENGTH\n                )");
        return d2;
    }

    public static final String f() {
        com.bytedance.android.input.editor.a q2;
        f fVar = f.a;
        kotlin.s.c.l.f(fVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(fVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "getSmallTextBeforeCursor");
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (q2 = service.q()) == null) {
            return "";
        }
        String e2 = com.bytedance.android.input.common.u.c.e(q2, 10);
        kotlin.s.c.l.e(e2, "getValidTextBeforeCursor…_LENGTH\n                )");
        return e2;
    }

    public static final String g(int i2) {
        com.bytedance.android.input.editor.a q2;
        g gVar = new g(i2);
        kotlin.s.c.l.f(gVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", gVar.invoke());
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (q2 = service.q()) == null) {
            return "";
        }
        String d2 = com.bytedance.android.input.common.u.c.d(q2, i2);
        kotlin.s.c.l.e(d2, "getValidTextAfterCursor(…fiedLen\n                )");
        return d2;
    }

    public static final String h(int i2) {
        com.bytedance.android.input.editor.a q2;
        h hVar = new h(i2);
        kotlin.s.c.l.f(hVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", hVar.invoke());
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (q2 = service.q()) == null) {
            return "";
        }
        String e2 = com.bytedance.android.input.common.u.c.e(q2, i2);
        kotlin.s.c.l.e(e2, "getValidTextBeforeCursor…fiedLen\n                )");
        return e2;
    }

    public static final String i(int i2) {
        String str;
        com.bytedance.android.input.editor.a q2;
        String str2;
        p(new i(i2));
        ImeService service = KeyboardJni.getService();
        str = "";
        if (service != null && (q2 = service.q()) != null) {
            CharSequence textBeforeCursor = q2.getTextBeforeCursor(i2 * 6, 0);
            if (textBeforeCursor == null || (str2 = textBeforeCursor.toString()) == null) {
                str2 = "";
            }
            str = str2.length() > 0 ? d(str2, i2) : "";
            p(new j(i2, str2, str));
        }
        return str;
    }

    public static final String j() {
        k kVar = k.a;
        kotlin.s.c.l.f(kVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(kVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "getTextAfterCursor");
        }
        return k(false);
    }

    public static final String k(boolean z2) {
        com.bytedance.android.input.editor.a q2;
        l lVar = new l(z2);
        kotlin.s.c.l.f(lVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", lVar.invoke());
        }
        if (z2) {
            if (b.length() > 0) {
                return b;
            }
        }
        ImeService service = KeyboardJni.getService();
        if (service != null && (q2 = service.q()) != null) {
            String d2 = com.bytedance.android.input.common.u.c.d(q2, 128);
            kotlin.s.c.l.e(d2, "getValidTextAfterCursor(…_LENGTH\n                )");
            b = d2;
        }
        String str = b;
        m mVar = new m(str);
        kotlin.s.c.l.f(mVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", mVar.invoke());
        }
        return str;
    }

    public static final String l() {
        n nVar = n.a;
        kotlin.s.c.l.f(nVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(nVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "getTextBeforeCursor");
        }
        return m(false);
    }

    public static final String m(boolean z2) {
        com.bytedance.android.input.editor.a q2;
        o oVar = new o(z2);
        kotlin.s.c.l.f(oVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", oVar.invoke());
        }
        if (z2) {
            if (a.length() > 0) {
                return a;
            }
        }
        ImeService service = KeyboardJni.getService();
        if (service != null && (q2 = service.q()) != null) {
            String e2 = com.bytedance.android.input.common.u.c.e(q2, 128);
            kotlin.s.c.l.e(e2, "getValidTextBeforeCursor…_LENGTH\n                )");
            a = e2;
        }
        String str = a;
        p pVar = new p(str);
        kotlin.s.c.l.f(pVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", pVar.invoke());
        }
        return str;
    }

    public static final String n() {
        com.bytedance.android.input.editor.a q2;
        q qVar = q.a;
        kotlin.s.c.l.f(qVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            Objects.requireNonNull(qVar);
            com.bytedance.android.input.r.j.i("TextCursorContext", "getTextBeforeCursorForReplace");
        }
        ImeService service = KeyboardJni.getService();
        if (service != null && (q2 = service.q()) != null) {
            q2.requestCursorUpdates(1);
            String e2 = com.bytedance.android.input.common.u.c.e(q2, 128);
            kotlin.s.c.l.e(e2, "getValidTextBeforeCursor…_LENGTH\n                )");
            a = e2;
        }
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (kotlin.s.c.l.a(r0, r1) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0041, code lost:
    
        if (kotlin.s.c.l.a(r0, r1) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean o() {
        /*
            com.bytedance.android.input.m.a$r r0 = com.bytedance.android.input.m.a.r.a
            p(r0)
            java.lang.String r0 = com.bytedance.android.input.m.a.a
            java.lang.String r1 = l()
            com.bytedance.android.input.m.a$s r2 = new com.bytedance.android.input.m.a$s
            r2.<init>(r1)
            p(r2)
            int r2 = r0.length()
            r3 = 1
            r4 = 0
            r5 = 120(0x78, float:1.68E-43)
            if (r2 <= r5) goto L44
            int r2 = r1.length()
            if (r2 <= r5) goto L44
            com.bytedance.android.input.m.a$u r2 = new com.bytedance.android.input.m.a$u
            r2.<init>(r0, r1)
            p(r2)
            r2 = 20
            java.lang.String r0 = d(r0, r2)
            java.lang.String r1 = d(r1, r2)
            com.bytedance.android.input.m.a$v r2 = new com.bytedance.android.input.m.a$v
            r2.<init>(r0, r1)
            p(r2)
            boolean r0 = kotlin.s.c.l.a(r0, r1)
            if (r0 != 0) goto L53
            goto L54
        L44:
            com.bytedance.android.input.m.a$w r2 = new com.bytedance.android.input.m.a$w
            r2.<init>(r0, r1)
            p(r2)
            boolean r0 = kotlin.s.c.l.a(r0, r1)
            if (r0 != 0) goto L53
            goto L54
        L53:
            r3 = r4
        L54:
            com.bytedance.android.input.m.a$t r0 = new com.bytedance.android.input.m.a$t
            r0.<init>(r3)
            p(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.m.a.o():boolean");
    }

    public static final void p(kotlin.s.b.a<String> aVar) {
        kotlin.s.c.l.f(aVar, "msg");
        if (d.a.b.a.h(IAppGlobals.a)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", aVar.invoke());
        }
    }

    public static final void q(String str) {
        kotlin.s.c.l.f(str, "textBefore");
        x xVar = new x(str);
        kotlin.s.c.l.f(xVar, "msg");
        IAppGlobals.a aVar = IAppGlobals.a;
        if (d.a.b.a.h(aVar)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", (String) xVar.invoke());
        }
        if (!(a.length() > 0)) {
            kotlin.s.c.l.f(A.a, "msg");
            if (d.a.b.a.h(aVar)) {
                com.bytedance.android.input.r.j.i("TextCursorContext", "updateTextBeforeCursor error 02");
                return;
            }
            return;
        }
        if (!kotlin.text.a.g(a, str, false, 2, null)) {
            kotlin.s.c.l.f(z.a, "msg");
            if (d.a.b.a.h(aVar)) {
                com.bytedance.android.input.r.j.i("TextCursorContext", "updateTextBeforeCursor error 01");
                return;
            }
            return;
        }
        String str2 = a;
        String substring = str2.substring(0, str2.length() - str.length());
        kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        a = substring;
        y yVar = new y(substring);
        kotlin.s.c.l.f(yVar, "msg");
        if (d.a.b.a.h(aVar)) {
            com.bytedance.android.input.r.j.i("TextCursorContext", (String) yVar.invoke());
        }
    }
}
