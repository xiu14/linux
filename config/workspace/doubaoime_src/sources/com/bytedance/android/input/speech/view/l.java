package com.bytedance.android.input.speech.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.doubaoime.KeyboardJni;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l {
    private static String b = "";

    /* renamed from: e, reason: collision with root package name */
    private static MutableLiveData<Boolean> f3176e;

    /* renamed from: f, reason: collision with root package name */
    private static MutableLiveData<a> f3177f;

    /* renamed from: g, reason: collision with root package name */
    private static MutableLiveData<Boolean> f3178g;
    private static int h;
    private static String i;
    private static String j;
    private static String k;
    private static a l;
    private static a m;
    private static String n;
    private static String o;
    private static List<kotlin.g<Integer, Integer>> p;
    private static List<kotlin.g<Integer, Integer>> q;
    private static List<ArrayList<String>> r;
    private static boolean s;
    private static boolean t;
    public static final l a = new l();

    /* renamed from: c, reason: collision with root package name */
    private static MutableLiveData<String> f3174c = new MutableLiveData<>("");

    /* renamed from: d, reason: collision with root package name */
    private static MutableLiveData<String> f3175d = new MutableLiveData<>("");

    public static final class a {
        private int a;
        private int b;

        public a() {
            this(0, 0, 3);
        }

        public a(int i, int i2, int i3) {
            i = (i3 & 1) != 0 ? -1 : i;
            i2 = (i3 & 2) != 0 ? -1 : i2;
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final void c(int i) {
            this.b = i;
        }

        public final void d(int i) {
            this.a = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("SelectIndex(start=");
            M.append(this.a);
            M.append(", end=");
            return e.a.a.a.a.C(M, this.b, ')');
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f3176e = new MutableLiveData<>(bool);
        f3177f = new MutableLiveData<>(new a(0, 0, 3));
        f3178g = new MutableLiveData<>(bool);
        i = "";
        j = "";
        k = "";
        l = new a(0, 0, 3);
        m = new a(0, 0, 3);
        n = "";
        o = "";
        p = new ArrayList();
        q = new ArrayList();
        r = new ArrayList();
        s = true;
        t = true;
    }

    private l() {
    }

    private final void B(String str) {
        b = str;
        KeyboardJni.getKeyboardJni().voiceHaveCommit(str.length() > 0);
    }

    private final boolean D(int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        String str = j + b + k;
        String a2 = com.bytedance.android.input.common.g.a();
        StringBuilder M = e.a.a.a.a.M("[correct] onUpdateSelection beforeText = ");
        M.append(j.length());
        M.append(", _textAsr = ");
        M.append(b.length());
        M.append(", afterText = ");
        M.append(k.length());
        M.append(", ");
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", M.toString());
        if (str.length() > 0) {
            if (a2.length() > 0) {
                int length = j.length();
                int length2 = (i3 <= 0 || !s) ? j.length() : j.length() - 1;
                if (length2 >= 0) {
                    if (i2 >= 0 && i2 <= length2) {
                        j = o(0, j.length() + i3, a2);
                        e.a.a.a.a.H0(e.a.a.a.a.M("[correct] onUpdateSelection new beforeText = "), j, "Asr-AsrTextModel");
                    }
                }
                int i6 = length + 0;
                e.a.a.a.a.k0("[correct] onUpdateSelection indexStart = ", i6, "Asr-AsrTextModel");
                if (b.length() > 0) {
                    int length3 = b.length();
                    if (((i3 <= 0 || !s) ? i6 + 1 : i6) <= i2 && i2 <= ((i3 >= 0 && !s) ? (i6 + length3) - 1 : i6 + length3)) {
                        if (!p.isEmpty()) {
                            if (i3 > 0) {
                                int i7 = i2 - h;
                                if (i7 >= 0 && i7 <= p.size()) {
                                    for (int i8 = 0; i8 < i3; i8++) {
                                        p.add(i7, new kotlin.g<>(-1, -1));
                                    }
                                    StringBuilder M2 = e.a.a.a.a.M("[updateSelectEditorTextNBest] nBestIndexList end ");
                                    M2.append(p);
                                    com.bytedance.android.input.r.j.m("Asr-AsrTextModel", M2.toString());
                                }
                            } else {
                                if (i3 < 0) {
                                    int i9 = i2 - h;
                                    int i10 = i3 + i9;
                                    if (i10 >= 0 && i9 < p.size()) {
                                        int i11 = i9 - 1;
                                        if (i10 <= i11) {
                                            while (true) {
                                                p.remove(i10);
                                                if (i11 == i10) {
                                                    break;
                                                }
                                                i11--;
                                            }
                                        }
                                    }
                                }
                                StringBuilder M22 = e.a.a.a.a.M("[updateSelectEditorTextNBest] nBestIndexList end ");
                                M22.append(p);
                                com.bytedance.android.input.r.j.m("Asr-AsrTextModel", M22.toString());
                            }
                        }
                        StringBuilder O = e.a.a.a.a.O("[correct] onUpdateSelection _textAsr indexStart = ", i6, ", oldLength = ", length3, ", change = ");
                        O.append(i3);
                        O.append(", editText.length = ");
                        O.append(a2.length());
                        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", O.toString());
                        B(o(i6, i6 + length3 + i3, a2));
                        f3175d.setValue(b);
                        StringBuilder sb = new StringBuilder();
                        sb.append("[correct] onUpdateSelection new _textAsr = ");
                        e.a.a.a.a.H0(sb, b, "Asr-AsrTextModel");
                        z = true;
                    } else {
                        z = false;
                    }
                    i6 += length3;
                    e.a.a.a.a.k0("[correct] onUpdateSelection indexStart = ", i6, "Asr-AsrTextModel");
                } else {
                    z = false;
                }
                int length4 = k.length();
                if (i6 != 0) {
                    String value = f3175d.getValue();
                    if (!(value != null && value.length() == 0)) {
                        i4 = i6 + 1;
                        if (i2 >= i4 && i2 <= (i5 = length4 + i6)) {
                            k = o(i6, i5 + i3, a2);
                            e.a.a.a.a.H0(e.a.a.a.a.M("[correct] onUpdateSelection new afterText = "), k, "Asr-AsrTextModel");
                        }
                        return z;
                    }
                }
                i4 = i6;
                if (i2 >= i4) {
                    k = o(i6, i5 + i3, a2);
                    e.a.a.a.a.H0(e.a.a.a.a.M("[correct] onUpdateSelection new afterText = "), k, "Asr-AsrTextModel");
                }
                return z;
            }
        }
        if (!(a2.length() == 0)) {
            return false;
        }
        b();
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[correct] onUpdateSelection editText empty");
        return true;
    }

    private final boolean E(int i2, int i3, int i4) {
        int i5;
        boolean z;
        boolean z2;
        int i6;
        String str = j + b + k;
        String a2 = com.bytedance.android.input.common.g.a();
        StringBuilder M = e.a.a.a.a.M("[correct] onUpdateSelection beforeText = ");
        M.append(j.length());
        M.append(", _textAsr = ");
        M.append(b.length());
        M.append(", afterText = ");
        M.append(k.length());
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", M.toString());
        if (str.length() > 0) {
            if (a2.length() > 0) {
                if (j.length() > 0) {
                    int length = j.length();
                    if (i3 <= length) {
                        j = o(0, length - (i3 - i4), a2);
                    } else if (i2 < length) {
                        j = o(0, i2, a2);
                        z = true;
                        StringBuilder M2 = e.a.a.a.a.M("[correct] onUpdateSelection new beforeText = ");
                        M2.append(j);
                        com.bytedance.android.input.r.j.i("Asr-AsrTextModel", M2.toString());
                        i5 = length + 0;
                        e.a.a.a.a.k0("[correct] onUpdateSelection indexStart = ", i5, "Asr-AsrTextModel");
                    }
                    z = false;
                    StringBuilder M22 = e.a.a.a.a.M("[correct] onUpdateSelection new beforeText = ");
                    M22.append(j);
                    com.bytedance.android.input.r.j.i("Asr-AsrTextModel", M22.toString());
                    i5 = length + 0;
                    e.a.a.a.a.k0("[correct] onUpdateSelection indexStart = ", i5, "Asr-AsrTextModel");
                } else {
                    i5 = 0;
                    z = false;
                }
                if (b.length() > 0) {
                    int length2 = b.length();
                    if (z) {
                        if (i3 > i5) {
                            F(i2, i3, i4);
                            B(o(i2, (i4 - i3) + (i5 - i2) + length2 + i2, a2));
                            f3175d.setValue(b);
                            StringBuilder sb = new StringBuilder();
                            sb.append("[correct] onUpdateSelection new _textAsr = ");
                            e.a.a.a.a.H0(sb, b, "Asr-AsrTextModel");
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        if (i2 >= i5 && i2 < (i6 = i5 + length2)) {
                            F(i2, i3, i4);
                            if (i6 < i3) {
                                i6 = i3;
                            }
                            B(o(i5, i6 - (i3 - i4), a2));
                            f3175d.setValue(b);
                            if (i3 > length2) {
                                z = true;
                            }
                            e.a.a.a.a.H0(e.a.a.a.a.M("[correct] onUpdateSelection new _textAsr = "), b, "Asr-AsrTextModel");
                            z2 = true;
                        }
                        z2 = false;
                    }
                    i5 += length2;
                    e.a.a.a.a.k0("[correct] onUpdateSelection indexStart = ", i5, "Asr-AsrTextModel");
                } else {
                    z2 = false;
                }
                if (k.length() > 0) {
                    int length3 = k.length();
                    if (z) {
                        if (i3 > i5) {
                            k = o(i4, (length3 - (i3 - i5)) + i4, a2);
                            e.a.a.a.a.H0(e.a.a.a.a.M("[correct] onUpdateSelection new afterText = "), k, "Asr-AsrTextModel");
                        }
                    } else if (i2 >= i5 && i2 < i5 + length3) {
                        k = o(i5, (length3 - (i3 - i4)) + i5, a2);
                        e.a.a.a.a.H0(e.a.a.a.a.M("[correct] onUpdateSelection new afterText = "), k, "Asr-AsrTextModel");
                    }
                }
                return z2;
            }
        }
        if (!(a2.length() == 0)) {
            return false;
        }
        b();
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[correct] onUpdateSelection editText empty");
        return true;
    }

    private final void F(int i2, int i3, int i4) {
        if (!p.isEmpty() && i2 <= i3) {
            int i5 = h;
            int i6 = i2 - i5;
            int i7 = i3 - i5;
            if (i6 < 0) {
                i6 = 0;
            }
            if (i7 > p.size()) {
                i7 = p.size();
            }
            int i8 = i7 - 1;
            if (i6 <= i8) {
                while (true) {
                    p.remove(i6);
                    if (i8 == i6) {
                        break;
                    } else {
                        i8--;
                    }
                }
            }
            if (i6 > p.size()) {
                for (int size = p.size(); size < i6; size++) {
                    p.add(size, new kotlin.g<>(-1, -1));
                    com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[updateSelectEditorTextNBest] nBestIndexList add " + i6 + " -1, -1");
                }
            }
            int i9 = i4 - i2;
            for (int i10 = 0; i10 < i9; i10++) {
                p.add(i6, new kotlin.g<>(-1, -1));
                com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[updateSelectEditorTextNBest] nBestIndexList add " + i6 + " -1, -1");
            }
            StringBuilder M = e.a.a.a.a.M("[updateSelectEditorTextNBest] nBestIndexList end ");
            M.append(p);
            com.bytedance.android.input.r.j.m("Asr-AsrTextModel", M.toString());
        }
    }

    private final String o(int i2, int i3, String str) {
        int length;
        if (i2 < 0 || i3 < 0) {
            return "";
        }
        if ((str.length() == 0) || i2 >= i3 || i2 >= (length = str.length())) {
            return "";
        }
        if (i3 > length) {
            com.bytedance.android.input.r.j.j("Asr-AsrTextModel", "[correct] onUpdateSelection beforeText end(" + i3 + ") > editTextLength(" + length + ')');
            i3 = length;
        }
        if (i2 >= i3) {
            return "";
        }
        try {
            String substring = str.substring(i2, i3);
            kotlin.s.c.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception e2) {
            e.a.a.a.a.o0("[correct] onUpdateSelection error = ", e2, "Asr-AsrTextModel");
            return "";
        }
    }

    public final void A(String str, boolean z) {
        kotlin.s.c.l.f(str, "text");
        if (z) {
            n = e.a.a.a.a.J(new StringBuilder(), n, str);
            B(n + o);
        } else {
            B(n + str + o);
        }
        f3175d.setValue(b);
        if (t) {
            f3174c.setValue(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (r5 < (r2.length() + (r6 + (r7 != null ? r7.length() : 0)))) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ad, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ab, code lost:
    
        if (r5 <= (r2 + (r6 != null ? r6.length() : 0))) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.l.C():void");
    }

    public final void a() {
        if (n.length() > p.size()) {
            StringBuilder M = e.a.a.a.a.M("[addCurrentNBestIndexToAll] textAsrLastBefore.length = ");
            M.append(n.length());
            M.append(", nBestIndexList.size = ");
            M.append(p.size());
            M.append(", nBestIndexListCurrent = ");
            M.append(q.isEmpty());
            com.bytedance.android.input.r.j.j("Asr-AsrTextModel", M.toString());
            int length = n.length();
            for (int size = p.size(); size < length; size++) {
                p.add(new kotlin.g<>(-1, -1));
            }
        }
        if (q.isEmpty()) {
            com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[addCurrentNBestIndexToAll] nBestIndexListCurrent is empty");
            return;
        }
        p.addAll(n.length(), q);
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[addCurrentNBestIndexToAll] " + n.length() + " = " + p);
        StringBuilder sb = new StringBuilder();
        sb.append("[addCurrentNBestIndexToAll] nBestListAll = ");
        sb.append(r);
        com.bytedance.android.input.r.j.i("Asr-AsrTextModel", sb.toString());
    }

    public final void b() {
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "clear cache");
        B("");
        f3175d.setValue("");
        i = "";
        h = 0;
        j = "";
        k = "";
        n = "";
        o = "";
        a aVar = l;
        aVar.d(-1);
        aVar.c(-1);
        p.clear();
        r.clear();
    }

    public final void c() {
        f3175d.setValue("");
    }

    public final int d(int i2, int i3) {
        if (p.isEmpty() && i2 == i3 && (i3 < -1 || i2 < -1)) {
            return -1;
        }
        int min = Math.min(i2, i3);
        int max = Math.max(i2, i3);
        StringBuilder O = e.a.a.a.a.O("[getNBestList] start = ", min, ", end = ", max, ", nBestIndexList = ");
        O.append(p);
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", O.toString());
        if (min < 0 || max > p.size() || max > b.length()) {
            return -1;
        }
        kotlin.g<Integer, Integer> gVar = p.get(min);
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[getNBestList] start nBestIndex = " + gVar);
        if (gVar.c().intValue() == -1) {
            return -1;
        }
        while (min < max) {
            kotlin.g<Integer, Integer> gVar2 = p.get(min);
            if (gVar2.c().intValue() == -1 || gVar2.c().intValue() != gVar.c().intValue()) {
                com.bytedance.android.input.r.j.m("Asr-AsrTextModel", "[getNBestList] index = " + min + " nBestIndex = " + gVar2);
                return -1;
            }
            min++;
        }
        if (gVar.c().intValue() >= r.size()) {
            return -1;
        }
        return gVar.c().intValue();
    }

    public final void e(String str) {
        kotlin.s.c.l.f(str, "textCommit");
        if (str.length() == 0) {
            return;
        }
        String B = kotlin.text.a.B(str, i);
        if (B.length() > 0) {
            int length = B.length();
            for (int i2 = 0; i2 < length; i2++) {
                q.add(new kotlin.g<>(-1, -1));
            }
        }
        com.bytedance.android.input.r.j.i("Asr-AsrTextModel", "[finishVoiceComposingText] notEndText = " + B);
        a();
    }

    public final String f() {
        return i;
    }

    public final String g() {
        return j;
    }

    public final int h() {
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016f A[LOOP:3: B:40:0x0128->B:46:0x016f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180 A[EDGE_INSN: B:47:0x0180->B:48:0x0180 BREAK  A[LOOP:3: B:40:0x0128->B:46:0x016f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] i(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.l.i(java.lang.String):java.lang.String[]");
    }

    public final LiveData<a> j() {
        return f3177f;
    }

    public final String k() {
        return b;
    }

    public final String l() {
        return o;
    }

    public final String m() {
        return n;
    }

    public final LiveData<String> n() {
        return f3175d;
    }

    public final LiveData<String> p() {
        return f3174c;
    }

    public final boolean q() {
        return b.length() > 0;
    }

    public final LiveData<Boolean> r() {
        return f3176e;
    }

    public final boolean s(int i2, int i3) {
        int i4 = h;
        int min = Math.min(i2 - i4, i3 - i4);
        int i5 = h;
        int max = Math.max(i2 - i5, i3 - i5);
        StringBuilder O = e.a.a.a.a.O("[isInAsrText] start = ", min, ", end = ", max, ", indexInEditor = ");
        O.append(h);
        O.append(", length = ");
        O.append(b.length());
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", O.toString());
        if (min >= 0 && max >= 0) {
            if (min == max) {
                return min != 0 && min <= b.length();
            }
            if (min < b.length() && max <= b.length()) {
                return true;
            }
        }
        return false;
    }

    public final LiveData<Boolean> t() {
        return f3178g;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r10, int r11, int r12, int r13, com.bytedance.android.input.editor.SelectionTracker.ActionType r14) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.l.u(int, int, int, int, com.bytedance.android.input.editor.SelectionTracker$ActionType):void");
    }

    public final boolean v() {
        return s(m.b(), m.a());
    }

    public final void w(boolean z) {
        f3176e.setValue(Boolean.valueOf(z));
    }

    public final void x(boolean z) {
        t = z;
        f3174c.setValue("");
    }

    public final void y(boolean z) {
        f3178g.setValue(Boolean.valueOf(z));
    }

    public final void z(int i2, int i3, boolean z) {
        a aVar = l;
        aVar.d(i2);
        aVar.c(i3);
        if (z && (m.b() != l.b() || m.a() != l.a())) {
            f3178g.setValue(Boolean.TRUE);
            com.bytedance.android.input.editor.a q2 = KeyboardJni.getService().q();
            if (q2 != null) {
                q2.setSelection(i2, i3);
            }
        }
        StringBuilder M = e.a.a.a.a.M("[correct] setSelectedInPanel start = ");
        M.append(l.b());
        M.append(", ic index = ");
        M.append(l.a());
        M.append(", ");
        M.append(m);
        com.bytedance.android.input.r.j.m("Asr-AsrTextModel", M.toString());
    }
}
