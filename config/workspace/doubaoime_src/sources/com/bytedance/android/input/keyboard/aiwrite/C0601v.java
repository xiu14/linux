package com.bytedance.android.input.keyboard.aiwrite;

import android.content.ClipData;
import android.view.inputmethod.InputConnectionExt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;

/* renamed from: com.bytedance.android.input.keyboard.aiwrite.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601v {
    public static final C0601v a = new C0601v();
    private static MutableLiveData<Boolean> b;

    /* renamed from: c, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2622c;

    /* renamed from: d, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2623d;

    /* renamed from: e, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2624e;

    /* renamed from: f, reason: collision with root package name */
    private static final kotlinx.coroutines.channels.e<String> f2625f;

    /* renamed from: g, reason: collision with root package name */
    private static int f2626g;
    private static MutableLiveData<Integer> h;
    private static final int i;
    private static final int j;
    private static MutableLiveData<a> k;
    private static final kotlin.s.b.l<Boolean, kotlin.o> l;

    /* renamed from: com.bytedance.android.input.keyboard.aiwrite.v$a */
    public static final class a {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f2627c;

        /* renamed from: d, reason: collision with root package name */
        private String f2628d;

        public a() {
            this(null, null, null, null, 15);
        }

        public a(String str, String str2, String str3, String str4, int i) {
            String str5 = (i & 1) != 0 ? "" : null;
            String str6 = (i & 2) != 0 ? "" : null;
            String str7 = (i & 4) != 0 ? "" : null;
            String str8 = (i & 8) != 0 ? "" : null;
            kotlin.s.c.l.f(str5, "plainTextAll");
            kotlin.s.c.l.f(str6, "htmlTextAll");
            kotlin.s.c.l.f(str7, "plainTextSelected");
            kotlin.s.c.l.f(str8, "htmlTextSelected");
            this.a = str5;
            this.b = str6;
            this.f2627c = str7;
            this.f2628d = str8;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.f2628d;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.f2627c;
        }

        public final void e(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.b = str;
        }

        public final void f(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f2628d = str;
        }

        public final void g(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.a = str;
        }

        public final void h(String str) {
            kotlin.s.c.l.f(str, "<set-?>");
            this.f2627c = str;
        }
    }

    /* renamed from: com.bytedance.android.input.keyboard.aiwrite.v$b */
    private static final class b implements InputConnectionExt.Callback {

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.aiwrite.AiPanelViewModel$InputConnectionExtCallbackImp$onProvideText$2", f = "AiPanelViewModel.kt", l = {310}, m = "invokeSuspend")
        /* renamed from: com.bytedance.android.input.keyboard.aiwrite.v$b$a */
        static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            int a;
            final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, kotlin.r.d<? super a> dVar) {
                super(2, dVar);
                this.b = aVar;
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new a(this.b, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                return new a(this.b, dVar).invokeSuspend(kotlin.o.a);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.a;
                if (i == 0) {
                    com.prolificinteractive.materialcalendarview.r.k0(obj);
                    kotlinx.coroutines.channels.e eVar = C0601v.f2625f;
                    String d2 = this.b.d();
                    this.a = 1;
                    if (eVar.o(d2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.prolificinteractive.materialcalendarview.r.k0(obj);
                }
                return kotlin.o.a;
            }
        }

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.aiwrite.AiPanelViewModel$InputConnectionExtCallbackImp$onProvideText$4", f = "AiPanelViewModel.kt", l = {333}, m = "invokeSuspend")
        /* renamed from: com.bytedance.android.input.keyboard.aiwrite.v$b$b, reason: collision with other inner class name */
        static final class C0078b extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
            int a;

            C0078b(kotlin.r.d<? super C0078b> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.r.h.a.a
            public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
                return new C0078b(dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
                return new C0078b(dVar).invokeSuspend(kotlin.o.a);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.a;
                if (i == 0) {
                    com.prolificinteractive.materialcalendarview.r.k0(obj);
                    kotlinx.coroutines.channels.e eVar = C0601v.f2625f;
                    this.a = 1;
                    if (eVar.o("", this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.prolificinteractive.materialcalendarview.r.k0(obj);
                }
                return kotlin.o.a;
            }
        }

        @Override // android.view.inputmethod.InputConnectionExt.Callback
        public void onErrorResolved(int i) {
            C0601v c0601v = C0601v.a;
            e.a.a.a.a.j0("startAiWriting onErrorResolved callback  ", i, "AIWriting-AiPanelViewModel");
            CheckViewModel.a.t(i);
        }

        @Override // android.view.inputmethod.InputConnectionExt.Callback
        public void onHighlighted(int i) {
            C0601v c0601v = C0601v.a;
            e.a.a.a.a.j0("startAiWriting onHighlighted callback  ", i, "AIWriting-AiPanelViewModel");
            CheckViewModel.a.u(i);
        }

        @Override // android.view.inputmethod.InputConnectionExt.Callback
        public void onProvideText(ClipData clipData) {
            C0601v c0601v = C0601v.a;
            com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "startAiWriting onProvideText callback  " + clipData);
            if (clipData == null || clipData.getItemCount() <= 0) {
                C0601v c0601v2 = C0601v.a;
                Boolean value = c0601v2.h().getValue();
                Boolean bool = Boolean.FALSE;
                if (kotlin.s.c.l.a(value, bool) && kotlin.s.c.l.a(c0601v2.i().getValue(), bool)) {
                    C0795d.l(C0800f0.a, null, null, new C0078b(null), 3, null);
                    return;
                }
                return;
            }
            a aVar = new a(null, null, null, null, 15);
            aVar.h(clipData.getItemAt(0).getText().toString());
            String htmlText = clipData.getItemAt(0).getHtmlText();
            if (htmlText != null) {
                aVar.f(htmlText);
            }
            C0601v c0601v3 = C0601v.a;
            Boolean value2 = c0601v3.h().getValue();
            Boolean bool2 = Boolean.FALSE;
            if (kotlin.s.c.l.a(value2, bool2) && kotlin.s.c.l.a(c0601v3.i().getValue(), bool2)) {
                C0795d.l(C0800f0.a, null, null, new a(aVar, null), 3, null);
            }
            StringBuilder M = e.a.a.a.a.M("plainTextSelected is ");
            M.append(aVar.d());
            M.append(", htmlTextSelected is ");
            M.append(aVar.b());
            com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", M.toString());
            if (clipData.getItemCount() == 2) {
                aVar.g(clipData.getItemAt(1).getText().toString());
                String htmlText2 = clipData.getItemAt(1).getHtmlText();
                if (htmlText2 != null) {
                    aVar.e(htmlText2);
                }
                StringBuilder M2 = e.a.a.a.a.M("plainTextAll is ");
                M2.append(aVar.c());
                M2.append(", htmlTextAll is ");
                M2.append(aVar.a());
                com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", M2.toString());
            }
            c0601v3.x(aVar);
        }
    }

    /* renamed from: com.bytedance.android.input.keyboard.aiwrite.v$c */
    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        public static final c a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            if (bool.booleanValue()) {
                a aVar = new a(null, null, null, null, 15);
                C0601v c0601v = C0601v.a;
                aVar.h(c0601v.k(C0601v.f2626g));
                C0601v c0601v2 = C0601v.a;
                StringBuilder M = e.a.a.a.a.M("getTextFromIc is ");
                M.append(aVar.d());
                com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", M.toString());
                c0601v.x(aVar);
            } else {
                C0601v c0601v3 = C0601v.a;
                com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "not ai scene");
            }
            return kotlin.o.a;
        }
    }

    /* renamed from: com.bytedance.android.input.keyboard.aiwrite.v$d */
    static final class d implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        d(kotlin.s.b.l lVar) {
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
        b = new MutableLiveData<>(bool);
        f2622c = new MutableLiveData<>(bool);
        f2623d = new MutableLiveData<>(bool);
        f2624e = new MutableLiveData<>(Boolean.TRUE);
        f2625f = com.prolificinteractive.materialcalendarview.r.a(1, null, null, 6);
        h = new MutableLiveData<>(0);
        i = 1;
        j = 2;
        k = new MutableLiveData<>(new a(null, null, null, null, 15));
        l = c.a;
    }

    private C0601v() {
    }

    private final boolean n(int i2) {
        return i2 == C0838R.id.ai_btn_check || i2 == C0838R.id.ai_btn_rewrite || i2 == C0838R.id.ai_btn_summary || i2 == C0838R.id.ai_btn_keypoints || i2 == C0838R.id.ai_btn_list;
    }

    public final boolean c(int i2) {
        return kotlin.s.c.l.a(f2623d.getValue(), Boolean.TRUE) && (i2 == C0838R.id.ai_btn_rewrite || i2 == C0838R.id.ai_btn_list);
    }

    public final boolean d(int i2) {
        return kotlin.s.c.l.a(f2623d.getValue(), Boolean.TRUE) && (i2 == C0838R.id.ai_btn_rewrite || i2 == C0838R.id.ai_btn_list || i2 == C0838R.id.ai_btn_check);
    }

    public final void e(int i2, boolean z) {
        int i3;
        f2626g = i2;
        v(true);
        U.a.d();
        if (p(i2)) {
            switch (i2) {
                case C0838R.id.ai_btn_keypoints /* 2131361936 */:
                case C0838R.id.ai_btn_list /* 2131361937 */:
                case C0838R.id.ai_btn_summary /* 2131361957 */:
                    i3 = 10;
                    break;
                default:
                    i3 = 2;
                    break;
            }
            com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "startAiWriting(true), minTextCountNeed = " + i3);
            V.l(true, new b(), i3, d(i2), z ? 2 : 1);
            return;
        }
        com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "not startAiWriting, get text from ic");
        if (kotlin.s.c.l.a(f2622c.getValue(), Boolean.FALSE)) {
            com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "startAiWriting wait onStartInputView callback");
            f2622c.observeForever(new d(l));
            return;
        }
        MutableLiveData<Boolean> mutableLiveData = f2622c;
        kotlin.s.b.l<Boolean, kotlin.o> lVar = l;
        mutableLiveData.removeObserver(new d(lVar));
        com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "startAiWriting call ic direct");
        lVar.invoke(Boolean.TRUE);
    }

    public final int f() {
        return j;
    }

    public final int g() {
        return i;
    }

    public final LiveData<Boolean> h() {
        return b;
    }

    public final LiveData<Boolean> i() {
        return f2623d;
    }

    public final LiveData<Boolean> j() {
        return f2622c;
    }

    public final String k(int i2) {
        if (!n(i2)) {
            return com.bytedance.android.input.common.g.a();
        }
        String obj = com.bytedance.android.input.common.g.c().toString();
        return obj.length() == 0 ? com.bytedance.android.input.common.g.a() : obj;
    }

    public final LiveData<a> l() {
        return k;
    }

    public final LiveData<Integer> m() {
        return h;
    }

    public final LiveData<Boolean> o() {
        return f2624e;
    }

    public final boolean p(int i2) {
        e.a.a.a.a.j0("needStartAiWriting, scene = ", i2, "AIWriting-AiPanelViewModel");
        Boolean value = f2623d.getValue();
        Boolean bool = Boolean.FALSE;
        return (kotlin.s.c.l.a(value, bool) && kotlin.s.c.l.a(b.getValue(), bool)) || (kotlin.s.c.l.a(f2623d.getValue(), Boolean.TRUE) && n(i2));
    }

    public final void q(boolean z) {
        Boolean bool;
        if (!z) {
            com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "onWritingVisibilityChanged finishAiWriting");
            f2622c.removeObserver(new d(l));
            V.c(false);
            return;
        }
        Integer value = U.a.g().getValue();
        if (value != null) {
            bool = Boolean.valueOf(a.p(value.intValue()));
        } else {
            bool = null;
        }
        kotlin.s.c.l.c(bool);
        if (bool.booleanValue() || !n(value.intValue())) {
            return;
        }
        V.l(false, null, 0, true, 0);
        com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", "notify fwk to hide menu");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r7 = this;
            com.bytedance.android.input.keyboard.aiwrite.U r0 = com.bytedance.android.input.keyboard.aiwrite.U.a
            androidx.lifecycle.LiveData r1 = r0.o()
            java.lang.Object r1 = r1.getValue()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            boolean r1 = kotlin.text.a.s(r1)
            if (r1 == 0) goto L17
            goto L19
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = r3
        L1a:
            if (r1 != 0) goto Ld2
            androidx.lifecycle.LiveData r1 = r0.n()
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r1 = kotlin.s.c.l.a(r1, r4)
            if (r1 == 0) goto L2e
            goto Ld2
        L2e:
            androidx.lifecycle.LiveData r1 = r0.g()
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L5b
            com.bytedance.android.input.keyboard.aiwrite.v r4 = com.bytedance.android.input.keyboard.aiwrite.C0601v.a
            int r1 = r1.intValue()
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r5 = com.bytedance.android.input.keyboard.aiwrite.C0601v.f2623d
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.s.c.l.a(r5, r6)
            if (r5 == 0) goto L56
            boolean r1 = r4.n(r1)
            if (r1 == 0) goto L56
            r1 = r3
            goto L57
        L56:
            r1 = r2
        L57:
            if (r1 != r3) goto L5b
            r1 = r3
            goto L5c
        L5b:
            r1 = r2
        L5c:
            r4 = 0
            if (r1 == 0) goto L8e
            androidx.lifecycle.LiveData r1 = r0.p()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L73
            boolean r1 = kotlin.text.a.s(r1)
            r1 = r1 ^ r3
            if (r1 != r3) goto L73
            r2 = r3
        L73:
            if (r2 == 0) goto L80
            androidx.lifecycle.LiveData r1 = r0.p()
            java.lang.Object r1 = r1.getValue()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
        L80:
            androidx.lifecycle.LiveData r0 = r0.o()
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.bytedance.android.input.keyboard.aiwrite.V.b(r0, r4, r3)
            goto Ld2
        L8e:
            androidx.lifecycle.LiveData r1 = r0.g()
            java.lang.Object r1 = r1.getValue()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lc3
            com.bytedance.android.input.keyboard.aiwrite.v r2 = com.bytedance.android.input.keyboard.aiwrite.C0601v.a
            int r1 = r1.intValue()
            boolean r1 = r2.n(r1)
            if (r1 == 0) goto Lb4
            androidx.lifecycle.LiveData r1 = r0.o()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            com.bytedance.android.doubaoime.KeyboardJni.replaceSelectedTextOrAllText(r1)
            goto Lc1
        Lb4:
            androidx.lifecycle.LiveData r1 = r0.o()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            com.bytedance.android.doubaoime.KeyboardJni.ReplaceText(r1)
        Lc1:
            kotlin.o r4 = kotlin.o.a
        Lc3:
            if (r4 != 0) goto Ld2
            androidx.lifecycle.LiveData r0 = r0.o()
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.android.doubaoime.KeyboardJni.ReplaceText(r0)
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.C0601v.r():void");
    }

    public final void s(boolean z) {
        if (kotlin.s.c.l.a(f2624e.getValue(), Boolean.FALSE) || z) {
            a value = k.getValue();
            if (value != null) {
                String str = null;
                if (!kotlin.text.a.s(value.b())) {
                    str = value.b();
                    StringBuilder M = e.a.a.a.a.M("replaceWithOrigin html = ");
                    M.append(value.b());
                    com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", M.toString());
                }
                StringBuilder M2 = e.a.a.a.a.M("replaceWithOrigin commitText ");
                M2.append(value.d());
                M2.append(", html = ");
                M2.append(str);
                com.bytedance.android.input.r.j.i("AIWriting-AiPanelViewModel", M2.toString());
                V.a(value.d(), str);
            }
            v(true);
        }
    }

    public final void t(boolean z) {
        b.setValue(Boolean.valueOf(z));
    }

    public final void u(boolean z) {
        f2623d.setValue(Boolean.valueOf(z));
    }

    public final void v(boolean z) {
        f2624e.setValue(Boolean.valueOf(z));
    }

    public final void w(boolean z) {
        if (z) {
            com.bytedance.android.input.q.z.G();
        } else {
            com.bytedance.android.input.q.z.H();
        }
        f2622c.setValue(Boolean.valueOf(z));
    }

    public final void x(a aVar) {
        kotlin.s.c.l.f(aVar, "text");
        k.postValue(aVar);
    }

    public final void y(int i2) {
        h.setValue(Integer.valueOf(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        if ((kotlin.s.c.l.a(com.bytedance.android.input.keyboard.aiwrite.C0601v.f2623d.getValue(), java.lang.Boolean.TRUE) && (r0 == com.bytedance.android.doubaoime.C0838R.id.ai_btn_rewrite || r0 == com.bytedance.android.doubaoime.C0838R.id.ai_btn_list)) == true) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(boolean r18, java.lang.String r19, com.bytedance.android.input.network.api.IRecommends.Data.Type r20) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.C0601v.z(boolean, java.lang.String, com.bytedance.android.input.network.api.IRecommends$Data$Type):void");
    }
}
