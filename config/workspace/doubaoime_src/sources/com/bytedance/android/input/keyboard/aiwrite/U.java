package com.bytedance.android.input.keyboard.aiwrite;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class U {
    public static final U a = new U();
    private static MutableLiveData<Integer> b = new MutableLiveData<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2614c;

    /* renamed from: d, reason: collision with root package name */
    private static MutableLiveData<String> f2615d;

    /* renamed from: e, reason: collision with root package name */
    private static MutableLiveData<Integer> f2616e;

    /* renamed from: f, reason: collision with root package name */
    private static MutableLiveData<String> f2617f;

    /* renamed from: g, reason: collision with root package name */
    private static MutableLiveData<String> f2618g;
    private static MutableLiveData<Integer> h;
    private static MutableLiveData<Integer> i;
    private static MutableLiveData<Integer> j;
    private static MutableLiveData<Boolean> k;
    private static MutableLiveData<Integer> l;
    private static boolean m;
    private static final ArrayList<String> n;
    private static final ArrayList<String> o;
    private static boolean p;

    static final class a implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        a(kotlin.s.b.l lVar) {
            kotlin.s.c.l.f(lVar, "function");
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.s.c.h)) {
                return kotlin.s.c.l.a(this.a, ((kotlin.s.c.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.s.c.h
        public final kotlin.b<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f2614c = new MutableLiveData<>(bool);
        f2615d = new MutableLiveData<>("");
        f2616e = new MutableLiveData<>(0);
        f2617f = new MutableLiveData<>("");
        f2618g = new MutableLiveData<>("");
        h = new MutableLiveData<>(0);
        i = new MutableLiveData<>(0);
        j = new MutableLiveData<>(0);
        k = new MutableLiveData<>(bool);
        l = new MutableLiveData<>(0);
        n = new ArrayList<>();
        o = new ArrayList<>();
    }

    private U() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int e() {
        Integer value = f2616e.getValue();
        if (value != null && value.intValue() == C0838R.id.ai_btn_check) {
            return -1;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_rewrite) {
            return 9;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_summary) {
            return 10;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_keypoints) {
            return 11;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_list) {
            return 12;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_common_popular) {
            return 1;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_common_circle) {
            return 2;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_common_mail) {
            return 3;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_common_dianping) {
            return 4;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_common_blessing) {
            return 5;
        }
        if (value != null && value.intValue() == C0838R.id.ai_btn_common_invitation) {
            return 6;
        }
        return (value != null && value.intValue() == C0838R.id.ai_btn_common_introduction) ? 7 : 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r4) {
        /*
            r3 = this;
            java.lang.String r0 = "showOriginText origin = "
            java.lang.String r1 = ", commitText "
            java.lang.StringBuilder r0 = e.a.a.a.a.X(r0, r4, r1)
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = com.bytedance.android.input.keyboard.aiwrite.U.f2615d
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = ", html = "
            r0.append(r1)
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = com.bytedance.android.input.keyboard.aiwrite.U.f2617f
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "AIWriting-DetailViewModel"
            e.a.a.a.a.H0(r0, r1, r2)
            r0 = 0
            if (r4 != 0) goto L7b
            androidx.lifecycle.MutableLiveData<java.lang.String> r4 = com.bytedance.android.input.keyboard.aiwrite.U.f2615d
            java.lang.Object r4 = r4.getValue()
            if (r4 == 0) goto L7b
            androidx.lifecycle.MutableLiveData<java.lang.String> r4 = com.bytedance.android.input.keyboard.aiwrite.U.f2615d
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r1 = 1
            if (r4 == 0) goto L48
            int r4 = r4.length()
            if (r4 != 0) goto L43
            r4 = r1
            goto L44
        L43:
            r4 = r0
        L44:
            if (r4 != r1) goto L48
            r4 = r1
            goto L49
        L48:
            r4 = r0
        L49:
            if (r4 == 0) goto L4c
            goto L7b
        L4c:
            r4 = 0
            androidx.lifecycle.MutableLiveData<java.lang.String> r2 = com.bytedance.android.input.keyboard.aiwrite.U.f2617f
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L5f
            boolean r2 = kotlin.text.a.s(r2)
            r2 = r2 ^ r1
            if (r2 != r1) goto L5f
            goto L60
        L5f:
            r1 = r0
        L60:
            if (r1 == 0) goto L6a
            androidx.lifecycle.MutableLiveData<java.lang.String> r4 = com.bytedance.android.input.keyboard.aiwrite.U.f2617f
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
        L6a:
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = com.bytedance.android.input.keyboard.aiwrite.U.f2615d
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            com.bytedance.android.input.keyboard.aiwrite.V.a(r1, r4)
            com.bytedance.android.input.keyboard.aiwrite.v r4 = com.bytedance.android.input.keyboard.aiwrite.C0601v.a
            r4.v(r0)
            goto L80
        L7b:
            com.bytedance.android.input.keyboard.aiwrite.v r4 = com.bytedance.android.input.keyboard.aiwrite.C0601v.a
            r4.s(r0)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.U.A(boolean):void");
    }

    public final void B() {
        Integer value = j.getValue();
        if (value != null) {
            k.setValue(Boolean.TRUE);
            f2615d.setValue(n.get(value.intValue()));
            f2617f.setValue(o.get(value.intValue()));
            Integer value2 = f2616e.getValue();
            if (value2 != null && C0601v.a.c(value2.intValue())) {
                A(false);
            }
        }
    }

    public final void b() {
        k.setValue(Boolean.TRUE);
    }

    public final void c(String str, boolean z) {
        kotlin.s.c.l.f(str, "text");
        if (z) {
            f2617f.setValue(str);
            return;
        }
        MutableLiveData<String> mutableLiveData = f2615d;
        mutableLiveData.setValue(mutableLiveData.getValue() + str);
        p = true;
        i.setValue(Integer.valueOf(n.size() + 1));
    }

    public final void d() {
        n.clear();
        o.clear();
        h.setValue(0);
        j.setValue(0);
        i.setValue(0);
    }

    public final void f() {
        Integer value = j.getValue();
        if (value != null) {
            if (value.intValue() - 1 >= 0) {
                value = Integer.valueOf(value.intValue() - 1);
            }
            j.setValue(value);
            B();
        }
    }

    public final LiveData<Integer> g() {
        return f2616e;
    }

    public final LiveData<Integer> h() {
        return b;
    }

    public final LiveData<Integer> i() {
        return l;
    }

    public final boolean j() {
        return m;
    }

    public final LiveData<Integer> k() {
        return i;
    }

    public final LiveData<Integer> l() {
        return h;
    }

    public final LiveData<Integer> m() {
        return j;
    }

    public final LiveData<Boolean> n() {
        return f2614c;
    }

    public final LiveData<String> o() {
        return f2615d;
    }

    public final LiveData<String> p() {
        return f2617f;
    }

    public final LiveData<String> q() {
        return f2618g;
    }

    public final LiveData<Boolean> r() {
        return k;
    }

    public final void s() {
        Integer value = j.getValue();
        if (value != null) {
            int intValue = value.intValue() + 1;
            Integer value2 = h.getValue();
            kotlin.s.c.l.c(value2);
            if (intValue < value2.intValue()) {
                value = Integer.valueOf(value.intValue() + 1);
            }
            j.setValue(value);
            B();
        }
    }

    public final void t() {
        boolean z;
        if (m) {
            int e2 = e();
            if (e2 != -1) {
                com.bytedance.android.input.q.z.x(e2, false, "", "", "", false);
            }
            Integer value = f2616e.getValue();
            if (value != null && C0601v.a.c(value.intValue())) {
                String value2 = f2615d.getValue();
                if (value2 != null) {
                    if (value2.length() > 0) {
                        z = true;
                        if (z || !kotlin.s.c.l.a(C0601v.a.o().getValue(), Boolean.FALSE)) {
                            A(true);
                        } else {
                            A(false);
                            return;
                        }
                    }
                }
                z = false;
                if (z) {
                }
                A(true);
            }
        }
    }

    public final void u(int i2) {
        f2616e.setValue(Integer.valueOf(i2));
        if (i2 == 0 || i2 == C0838R.id.ai_btn_check) {
            return;
        }
        w();
    }

    public final void v(int i2) {
        b.postValue(Integer.valueOf(i2));
        if (i2 == 1) {
            MutableLiveData<Boolean> mutableLiveData = k;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            f2615d.setValue("");
            f2614c.setValue(bool);
        }
    }

    public final void w() {
        String str;
        Integer value = f2616e.getValue();
        if (value != null) {
            switch (value.intValue()) {
                case C0838R.id.ai_btn_keypoints /* 2131361936 */:
                    str = "正在整理关键点....";
                    break;
                case C0838R.id.ai_btn_list /* 2131361937 */:
                    str = "正在转换为列表...";
                    break;
                case C0838R.id.ai_btn_rewrite /* 2131361950 */:
                    str = "正在重写...";
                    break;
                case C0838R.id.ai_btn_summary /* 2131361957 */:
                    str = "正在总结...";
                    break;
                default:
                    str = "正在生成中...";
                    break;
            }
            f2618g.setValue(str);
        }
    }

    public final void x(boolean z) {
        m = z;
    }

    public final void y(boolean z) {
        f2614c.setValue(Boolean.valueOf(z));
        if (p) {
            String value = f2615d.getValue();
            if (value != null) {
                ArrayList<String> arrayList = n;
                if (arrayList.size() >= 10) {
                    arrayList.remove(0);
                    o.remove(0);
                }
                arrayList.add(value);
                ArrayList<String> arrayList2 = o;
                String value2 = f2617f.getValue();
                if (value2 == null) {
                    value2 = "";
                }
                arrayList2.add(value2);
                h.setValue(Integer.valueOf(arrayList.size()));
                j.setValue(Integer.valueOf(arrayList.size() - 1));
            }
            p = false;
        }
    }

    public final void z() {
        String d2;
        Integer value = f2616e.getValue();
        if (value == null || value.intValue() <= 0) {
            return;
        }
        int intValue = value.intValue();
        if (intValue == C0838R.id.ai_btn_rewrite) {
            d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_rewrite);
        } else if (intValue != C0838R.id.ai_btn_summary) {
            switch (intValue) {
                case C0838R.id.ai_btn_common_blessing /* 2131361927 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_blessing);
                    break;
                case C0838R.id.ai_btn_common_circle /* 2131361928 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_circle);
                    break;
                case C0838R.id.ai_btn_common_dianping /* 2131361929 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_dianping);
                    break;
                case C0838R.id.ai_btn_common_introduction /* 2131361930 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_introduction);
                    break;
                case C0838R.id.ai_btn_common_invitation /* 2131361931 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_invitation);
                    break;
                case C0838R.id.ai_btn_common_mail /* 2131361932 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_mail);
                    break;
                case C0838R.id.ai_btn_common_popular /* 2131361933 */:
                    d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_common_popular);
                    break;
                default:
                    switch (intValue) {
                        case C0838R.id.ai_btn_keypoints /* 2131361936 */:
                            d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_keypoints);
                            break;
                        case C0838R.id.ai_btn_list /* 2131361937 */:
                            d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_list);
                            break;
                        default:
                            d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_rewrite);
                            break;
                    }
            }
        } else {
            d2 = e.a.a.a.a.d(IAppGlobals.a, C0838R.string.ai_btn_summary);
        }
        kotlin.s.c.l.e(d2, "when (it) {\n            …ewrite)\n                }");
        f2618g.setValue(d2);
    }
}
