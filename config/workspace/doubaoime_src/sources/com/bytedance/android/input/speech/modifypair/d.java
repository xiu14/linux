package com.bytedance.android.input.speech.modifypair;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.editor.SelectionTracker;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private static boolean f3130d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3131e;
    private static int n;
    private static boolean o;
    private static boolean p;
    public static final d a = new d();
    private static final List<String> b = kotlin.collections.g.G(".", "。", "?", "？", "!", "！", "......", "……", "⸮", "¡", Constants.WAVE_SEPARATOR, "～", ";", "；", "\n");

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f3129c = kotlin.collections.g.G(".", "。", "?", "？", "!", "！", "......", "……", "⸮", "¡", Constants.WAVE_SEPARATOR, "～", ";", "；", "\n", " ");

    /* renamed from: f, reason: collision with root package name */
    private static String f3132f = "";

    /* renamed from: g, reason: collision with root package name */
    private static String f3133g = "";
    private static String h = "";
    private static String i = "";
    private static String j = "";
    private static ModifySession k = ModifySession.UNKNOWN;
    private static String l = "";
    private static String m = "";

    static final class A extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ kotlin.s.c.v a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(kotlin.s.c.v vVar) {
            super(0);
            this.a = vVar;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair INNER_DELETE modifySession = ");
            M.append(d.k);
            M.append(" isNeedClearDeleteInfo = ");
            M.append(this.a.a);
            return M.toString();
        }
    }

    static final class B extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final B a = new B();

        B() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair INNER_DELETE beforeChangePositon = ");
            M.append(d.n);
            M.append(" beforeAllText = ");
            M.append(d.l);
            return M.toString();
        }
    }

    static final class C extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final C a = new C();

        C() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair INNER_COMMIT";
        }
    }

    static final class D extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final D a = new D();

        D() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair INNER_VOICE_NORMAL";
        }
    }

    static final class E extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        E(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair INNER_PREEDIT modifySession = ");
            M.append(d.k);
            M.append(" preEditText=[");
            M.append(this.a);
            M.append("] deleteText=[");
            return e.a.a.a.a.G(M, this.b, ']');
        }
    }

    /* renamed from: com.bytedance.android.input.speech.modifypair.d$a, reason: case insensitive filesystem */
    static final class C0617a extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ boolean a;
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0617a(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] isEnglishType=");
            M.append(this.a);
            M.append(" associateEnabledConfig=");
            M.append(this.b);
            return M.toString();
        }
    }

    /* renamed from: com.bytedance.android.input.speech.modifypair.d$b, reason: case insensitive filesystem */
    static final class C0618b extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final C0618b a = new C0618b();

        C0618b() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] onImeClear";
        }
    }

    /* renamed from: com.bytedance.android.input.speech.modifypair.d$c, reason: case insensitive filesystem */
    static final class C0619c extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final C0619c a = new C0619c();

        C0619c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] realUploadModifyPair：isEnableUpload = ");
            M.append(d.f3130d);
            M.append(' ');
            return M.toString();
        }
    }

    /* renamed from: com.bytedance.android.input.speech.modifypair.d$d, reason: collision with other inner class name */
    static final class C0097d extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final C0097d a = new C0097d();

        C0097d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] realUploadModifyPair：结束，因条件不符";
        }
    }

    /* renamed from: com.bytedance.android.input.speech.modifypair.d$e, reason: case insensitive filesystem */
    static final class C0620e extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0620e(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] realUploadModifyPair：异常：");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] realUploadModifyPair：\nbeforeAllText = [");
            M.append(d.l);
            M.append("] \nafterAllText = [");
            M.append(d.m);
            M.append("] \nbeforeChangePositon = ");
            M.append(d.n);
            return M.toString();
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final g a = new g();

        g() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] realUploadModifyPair：查找diff失败 for english keyboard";
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final h a = new h();

        h() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] realUploadModifyPair：查找diff失败 for chinese keyboard";
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
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] realUploadModifyPair：\nmodifyCursorBefore = [");
            M.append(d.f3133g);
            M.append("] \nmodifyCursorAfter = [");
            M.append(d.h);
            M.append("] \nmodifyDeleteText = [");
            M.append(d.i);
            M.append("] \nmodifyCommitText = [");
            M.append(d.j);
            M.append("] \nindex = ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class j extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final j a = new j();

        j() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair NOT_INNER 删除范围超过50字符数";
        }
    }

    static final class k extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final k a = new k();

        k() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair NOT_INNER 删除范围超过x终止符";
        }
    }

    static final class l extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] realUploadModifyPair：\nbeforeAllText = [");
            M.append(d.l);
            M.append("]\nsrcPoint = [");
            M.append(this.a);
            M.append("]\nafterAllText = [");
            M.append(d.m);
            M.append("]\ndstPoint = [");
            return e.a.a.a.a.D(M, this.b, "]\n");
        }
    }

    static final class m extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final m a = new m();

        m() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] realUploadModifyPair 符合条件，开始上报接口";
        }
    }

    static final class n extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(int i, int i2) {
            super(0);
            this.a = i;
            this.b = i2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair NOT_INNER 删除绝对值过大 modifyDeleteTextLength=");
            M.append(this.a);
            M.append(" modifyCommitTextLength=");
            M.append(this.b);
            return M.toString();
        }
    }

    static final class o extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3135d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, String str2, String str3, String str4) {
            super(0);
            this.a = str;
            this.b = str2;
            this.f3134c = str3;
            this.f3135d = str4;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] 点击修改对 setCorrectModify commitText = [");
            M.append(this.a);
            M.append("] deleteText = [");
            M.append(this.b);
            M.append("] cursorBefore = [");
            M.append(this.f3134c);
            M.append("] cursorAfter = [");
            return e.a.a.a.a.G(M, this.f3135d, ']');
        }
    }

    static final class p extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3136c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, boolean z, String str2) {
            super(0);
            this.a = str;
            this.b = z;
            this.f3136c = str2;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] 设置打印提交文本 setTypeCommitText = [");
            M.append(this.a);
            M.append("] isAsr = [");
            M.append(this.b);
            M.append("] modifySession = [");
            M.append(d.k);
            M.append("] from = [");
            return e.a.a.a.a.G(M, this.f3136c, ']');
        }
    }

    static final class q extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final q a = new q();

        q() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] 设置打印提交文本 结果:modifyCommitText = [");
            M.append(d.j);
            M.append("] modifySession = [");
            M.append(d.k);
            M.append("] isLastFromPreEdit = [");
            M.append(d.p);
            M.append(']');
            return M.toString();
        }
    }

    static final class r extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final r a = new r();

        r() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair INNER_PREEDIT beforeAllText = ");
            M.append(d.l);
            return M.toString();
        }
    }

    static final class s extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final s a = new s();

        s() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] -----01  modifyDeleteText=");
            M.append(d.i);
            return M.toString();
        }
    }

    static final class t extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final t a = new t();

        t() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] -----02  modifyDeleteText=");
            M.append(d.i);
            return M.toString();
        }
    }

    static final class u extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final u a = new u();

        u() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair INNER_PREEDIT modifySession = ");
            M.append(d.k);
            M.append(" modifyCursorBefore = ");
            M.append(d.f3133g);
            M.append(" modifyCursorAfter = ");
            M.append(d.h);
            M.append(" modifyDeleteText = [");
            M.append(d.i);
            M.append("] modifyCommitText = ");
            M.append(d.j);
            return M.toString();
        }
    }

    static final class v extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ SelectionTracker.ActionType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(SelectionTracker.ActionType actionType) {
            super(0);
            this.a = actionType;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair else type = ");
            M.append(this.a);
            return M.toString();
        }
    }

    static final class w extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        final /* synthetic */ boolean a;
        final /* synthetic */ SelectionTracker.ActionType b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3137c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3138d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3139e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f3140f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f3141g;
        final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(boolean z, SelectionTracker.ActionType actionType, String str, String str2, String str3, boolean z2, boolean z3, String str4) {
            super(0);
            this.a = z;
            this.b = actionType;
            this.f3137c = str;
            this.f3138d = str2;
            this.f3139e = str3;
            this.f3140f = z2;
            this.f3141g = z3;
            this.h = str4;
        }

        @Override // kotlin.s.b.a
        public String invoke() {
            StringBuilder M = e.a.a.a.a.M("[reportPairNew] startUploadModifyPair 是否ASR = ");
            M.append(this.a);
            M.append(" type = ");
            M.append(this.b);
            M.append(" deleteText = [");
            M.append(this.f3137c);
            M.append("] cursorBefore = [");
            M.append(this.f3138d);
            M.append("] cursorAfter = [");
            M.append(this.f3139e);
            M.append("] isSupportModifyV2 = ");
            M.append(this.f3140f);
            M.append(" isFromCorrect = ");
            M.append(d.f3131e);
            M.append(" isFromCorrectModify = ");
            M.append(this.f3141g);
            M.append(" preEditText = [");
            M.append(this.h);
            M.append("] isEnglishType = ");
            M.append(d.a.o());
            return M.toString();
        }
    }

    static final class x extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final x a = new x();

        x() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair INNER_SELECT";
        }
    }

    static final class y extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final y a = new y();

        y() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair NOT_INNER";
        }
    }

    static final class z extends kotlin.s.c.m implements kotlin.s.b.a<String> {
        public static final z a = new z();

        z() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public /* bridge */ /* synthetic */ String invoke() {
            return "[reportPairNew] startUploadModifyPair INNER_NORMAL";
        }
    }

    private d() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[LOOP:1: B:5:0x001c->B:18:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008d A[LOOP:3: B:31:0x0069->B:44:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m(java.lang.String r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r15.length()
            if (r1 >= r3) goto L99
            int r3 = r15.codePointAt(r1)
            int r3 = java.lang.Character.charCount(r3)
            int r3 = r3 + r1
            java.lang.String r1 = r15.substring(r1, r3)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.s.c.l.e(r1, r4)
            r5 = r0
        L1c:
            int r6 = r1.length()
            r7 = 91
            r8 = 65
            r9 = 123(0x7b, float:1.72E-43)
            r10 = 97
            r11 = 1
            if (r5 >= r6) goto L4c
            char r6 = r1.charAt(r5)
            if (r10 > r6) goto L35
            if (r6 >= r9) goto L35
            r12 = r11
            goto L36
        L35:
            r12 = r0
        L36:
            if (r12 != 0) goto L44
            if (r8 > r6) goto L3e
            if (r6 >= r7) goto L3e
            r6 = r11
            goto L3f
        L3e:
            r6 = r0
        L3f:
            if (r6 == 0) goto L42
            goto L44
        L42:
            r6 = r0
            goto L45
        L44:
            r6 = r11
        L45:
            if (r6 != 0) goto L49
            r1 = r0
            goto L4d
        L49:
            int r5 = r5 + 1
            goto L1c
        L4c:
            r1 = r11
        L4d:
            if (r1 == 0) goto L94
            int r2 = r2 + 1
        L51:
            r1 = r3
            int r3 = r15.length()
            if (r1 >= r3) goto L3
            int r3 = r15.codePointAt(r1)
            int r3 = java.lang.Character.charCount(r3)
            int r3 = r3 + r1
            java.lang.String r5 = r15.substring(r1, r3)
            kotlin.s.c.l.e(r5, r4)
            r6 = r0
        L69:
            int r12 = r5.length()
            if (r6 >= r12) goto L90
            char r12 = r5.charAt(r6)
            if (r10 > r12) goto L79
            if (r12 >= r9) goto L79
            r13 = r11
            goto L7a
        L79:
            r13 = r0
        L7a:
            if (r13 != 0) goto L88
            if (r8 > r12) goto L82
            if (r12 >= r7) goto L82
            r12 = r11
            goto L83
        L82:
            r12 = r0
        L83:
            if (r12 == 0) goto L86
            goto L88
        L86:
            r12 = r0
            goto L89
        L88:
            r12 = r11
        L89:
            if (r12 != 0) goto L8d
            r5 = r0
            goto L91
        L8d:
            int r6 = r6 + 1
            goto L69
        L90:
            r5 = r11
        L91:
            if (r5 == 0) goto L3
            goto L51
        L94:
            int r2 = r2 + 1
            r1 = r3
            goto L3
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.modifypair.d.m(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[LOOP:1: B:13:0x002a->B:26:0x0057, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[LOOP:3: B:35:0x0077->B:48:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int n(java.lang.String r17, boolean r18, java.util.List<java.lang.String> r19) {
        /*
            r16 = this;
            r0 = r17
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            int r4 = r17.length()
            if (r2 >= r4) goto La5
            int r4 = r0.codePointAt(r2)
            int r4 = java.lang.Character.charCount(r4)
            int r4 = r4 + r2
            java.lang.String r2 = r0.substring(r2, r4)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.s.c.l.e(r2, r5)
            r6 = r19
            if (r18 == 0) goto L29
            boolean r7 = r6.contains(r2)
            if (r7 == 0) goto L29
        L27:
            r2 = r4
            goto L5
        L29:
            r7 = r1
        L2a:
            int r8 = r2.length()
            r9 = 91
            r10 = 65
            r11 = 123(0x7b, float:1.72E-43)
            r12 = 97
            r13 = 1
            if (r7 >= r8) goto L5a
            char r8 = r2.charAt(r7)
            if (r12 > r8) goto L43
            if (r8 >= r11) goto L43
            r14 = r13
            goto L44
        L43:
            r14 = r1
        L44:
            if (r14 != 0) goto L52
            if (r10 > r8) goto L4c
            if (r8 >= r9) goto L4c
            r8 = r13
            goto L4d
        L4c:
            r8 = r1
        L4d:
            if (r8 == 0) goto L50
            goto L52
        L50:
            r8 = r1
            goto L53
        L52:
            r8 = r13
        L53:
            if (r8 != 0) goto L57
            r2 = r1
            goto L5b
        L57:
            int r7 = r7 + 1
            goto L2a
        L5a:
            r2 = r13
        L5b:
            if (r2 == 0) goto La2
            int r3 = r3 + 1
        L5f:
            r2 = r4
            int r4 = r17.length()
            if (r2 >= r4) goto L5
            int r4 = r0.codePointAt(r2)
            int r4 = java.lang.Character.charCount(r4)
            int r4 = r4 + r2
            java.lang.String r7 = r0.substring(r2, r4)
            kotlin.s.c.l.e(r7, r5)
            r8 = r1
        L77:
            int r14 = r7.length()
            if (r8 >= r14) goto L9e
            char r14 = r7.charAt(r8)
            if (r12 > r14) goto L87
            if (r14 >= r11) goto L87
            r15 = r13
            goto L88
        L87:
            r15 = r1
        L88:
            if (r15 != 0) goto L96
            if (r10 > r14) goto L90
            if (r14 >= r9) goto L90
            r14 = r13
            goto L91
        L90:
            r14 = r1
        L91:
            if (r14 == 0) goto L94
            goto L96
        L94:
            r14 = r1
            goto L97
        L96:
            r14 = r13
        L97:
            if (r14 != 0) goto L9b
            r7 = r1
            goto L9f
        L9b:
            int r8 = r8 + 1
            goto L77
        L9e:
            r7 = r13
        L9f:
            if (r7 == 0) goto L5
            goto L5f
        La2:
            int r3 = r3 + 1
            goto L27
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.modifypair.d.n(java.lang.String, boolean, java.util.List):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean o() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        String string = aVar.getContext().getString(C0838R.string.typing_associate_enabled);
        kotlin.s.c.l.e(string, "getInstance().context.ge…typing_associate_enabled)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) f2).booleanValue();
        boolean a2 = kotlin.s.c.l.a(KeyboardJni.getKeyboardJni().getKeyboardType(), "key_eng");
        q(new C0617a(a2, booleanValue));
        return a2 && booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01e9, code lost:
    
        if (d.a.b.a.h(r0) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0210, code lost:
    
        com.bytedance.android.input.speech.modifypair.d.f3131e = false;
        com.bytedance.android.input.speech.modifypair.d.o = false;
        com.bytedance.android.input.speech.modifypair.d.p = false;
        com.bytedance.android.input.speech.modifypair.d.m = "";
        com.bytedance.android.input.speech.modifypair.d.l = "";
        com.bytedance.android.input.speech.modifypair.d.n = 0;
        com.bytedance.android.input.speech.modifypair.d.f3133g = "";
        com.bytedance.android.input.speech.modifypair.d.h = "";
        com.bytedance.android.input.speech.modifypair.d.i = "";
        com.bytedance.android.input.speech.modifypair.d.j = "";
        com.bytedance.android.input.speech.modifypair.d.k = com.bytedance.android.input.speech.modifypair.ModifySession.UNKNOWN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0228, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x020d, code lost:
    
        java.util.Objects.requireNonNull(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020b, code lost:
    
        if (d.a.b.a.h(r0) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116 A[Catch: all -> 0x01ec, Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:4:0x0007, B:6:0x000b, B:10:0x0019, B:15:0x0039, B:19:0x0046, B:21:0x004a, B:23:0x0072, B:25:0x007c, B:26:0x00e0, B:30:0x0116, B:34:0x0123, B:36:0x013d, B:42:0x0194, B:44:0x019d, B:45:0x01c5, B:47:0x01d5, B:48:0x0152, B:50:0x0158, B:51:0x015e, B:53:0x0164, B:55:0x017a, B:62:0x0181, B:64:0x018e, B:66:0x01d9, B:68:0x00a7, B:69:0x00b5, B:71:0x00c1, B:72:0x00ce, B:74:0x00d8), top: B:3:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0194 A[Catch: all -> 0x01ec, Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:4:0x0007, B:6:0x000b, B:10:0x0019, B:15:0x0039, B:19:0x0046, B:21:0x004a, B:23:0x0072, B:25:0x007c, B:26:0x00e0, B:30:0x0116, B:34:0x0123, B:36:0x013d, B:42:0x0194, B:44:0x019d, B:45:0x01c5, B:47:0x01d5, B:48:0x0152, B:50:0x0158, B:51:0x015e, B:53:0x0164, B:55:0x017a, B:62:0x0181, B:64:0x018e, B:66:0x01d9, B:68:0x00a7, B:69:0x00b5, B:71:0x00c1, B:72:0x00ce, B:74:0x00d8), top: B:3:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p() {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.modifypair.d.p():void");
    }

    public final void q(kotlin.s.b.a<String> aVar) {
        kotlin.s.c.l.f(aVar, "msg");
        IAppGlobals.a aVar2 = IAppGlobals.a;
        if (d.a.b.a.h(aVar2)) {
            Objects.requireNonNull(aVar2);
        }
    }

    public void r() {
        q(C0618b.a);
        f3131e = false;
        o = false;
        p = false;
        m = "";
        l = "";
        n = 0;
        f3133g = "";
        h = "";
        i = "";
        j = "";
        k = ModifySession.UNKNOWN;
    }

    public final void s() {
        q(C0619c.a);
        com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.speech.modifypair.a
            @Override // java.lang.Runnable
            public final void run() {
                d.p();
            }
        });
    }

    public final void t(String str) {
        kotlin.s.c.l.f(str, "jsonString");
        f3132f = str;
    }

    public final void u(String str, String str2, String str3, String str4) {
        kotlin.s.c.l.f(str, "commitText");
        kotlin.s.c.l.f(str2, "deleteText");
        kotlin.s.c.l.f(str3, "cursorBefore");
        kotlin.s.c.l.f(str4, "cursorAfter");
        q(new o(str, str2, str3, str4));
        KeyboardJni.setUpdateSelectType(3);
        r();
        f3131e = true;
        j = "";
        i = str2;
        if (kotlin.text.a.g(str3, str, false, 2, null)) {
            str3 = kotlin.text.a.C(str3, str);
        }
        w(true, SelectionTracker.ActionType.INNER_DELETE, str2, str3, str4, "", true);
        v(str, "correct", true);
    }

    public final void v(String str, String str2, boolean z2) {
        kotlin.s.c.l.f(str, "text");
        kotlin.s.c.l.f(str2, "from");
        q(new p(str, z2, str2));
        KeyboardJni.setUpdateSelectType(3);
        if (!z2 || k == ModifySession.UNKNOWN) {
            j = "";
            return;
        }
        if (p) {
            j = str;
        } else {
            j = e.a.a.a.a.J(new StringBuilder(), j, str);
        }
        k = ModifySession.FINISH;
        q(q.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(boolean r17, com.bytedance.android.input.editor.SelectionTracker.ActionType r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.modifypair.d.w(boolean, com.bytedance.android.input.editor.SelectionTracker$ActionType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }
}
