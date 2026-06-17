package com.bytedance.android.input.keyboard.aichat;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.q.z;

/* loaded from: classes.dex */
public final class AichatDetailViewModel {
    public static final AichatDetailViewModel a = new AichatDetailViewModel();
    private static MutableLiveData<Integer> b = new MutableLiveData<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2539c;

    /* renamed from: d, reason: collision with root package name */
    private static MutableLiveData<Boolean> f2540d;

    /* renamed from: e, reason: collision with root package name */
    private static MutableLiveData<String> f2541e;

    /* renamed from: f, reason: collision with root package name */
    private static MutableLiveData<String> f2542f;

    /* renamed from: g, reason: collision with root package name */
    private static MutableLiveData<Integer> f2543g;
    private static MutableLiveData<Boolean> h;
    private static MutableLiveData<Boolean> i;
    private static boolean j;
    private static boolean k;
    private static boolean l;

    public enum ViewStatus {
        VIEW_SUCCESS,
        VIEW_LOADING,
        VIEW_FAILED
    }

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            StringBuilder M = e.a.a.a.a.M("initDetailViewState AiChatMenuViewModel, mIntentWaitingModel=");
            AichatDetailViewModel aichatDetailViewModel2 = AichatDetailViewModel.a;
            M.append(aichatDetailViewModel2.h());
            com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", M.toString());
            if (aichatDetailViewModel2.h() && kotlin.s.c.l.a(aichatDetailViewModel2.l().getValue(), Boolean.TRUE)) {
                Integer value = aichatDetailViewModel2.c().getValue();
                int i = (value != null && value.intValue() == C0838R.id.ai_chat_assistant_view_chat) ? 0 : (value != null && value.intValue() == C0838R.id.ai_chat_assistant_view_baike) ? 13 : -1;
                e.a.a.a.a.j0("initDetailViewState pageId=", i, "AiChat-DetailViewModel");
                if (i != -1) {
                    e.a.a.a.a.j0("initDetailViewState pageId: ", i, "AiChat-DetailViewModel");
                    if (i == 13) {
                        LiveData<String> c2 = AiChatMenuViewModel.a.c();
                        StringBuilder M2 = e.a.a.a.a.M("baike query: ");
                        M2.append(c2.getValue());
                        com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", M2.toString());
                        z.y(i, true, String.valueOf(c2.getValue()), null, null, false, 56);
                    } else {
                        com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", "chat begin");
                        z.y(i, true, null, null, null, false, 60);
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    static final class b implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        b(kotlin.s.b.l lVar) {
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
        f2539c = new MutableLiveData<>(bool);
        f2540d = new MutableLiveData<>(bool);
        f2541e = new MutableLiveData<>("");
        f2542f = new MutableLiveData<>("");
        f2543g = new MutableLiveData<>(0);
        h = new MutableLiveData<>(bool);
        i = new MutableLiveData<>(bool);
    }

    private AichatDetailViewModel() {
    }

    public final void a(String str) {
        kotlin.s.c.l.f(str, "text");
        MutableLiveData<String> mutableLiveData = f2541e;
        mutableLiveData.setValue(mutableLiveData.getValue() + str);
        StringBuilder sb = new StringBuilder();
        sb.append("appendTextDetail textDetail change to=");
        e.a.a.a.a.H0(sb, f2541e.getValue(), "AiChat-DetailViewModel");
    }

    public final void b() {
        com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", "clearTextDetail textDetail change to empty");
        f2541e.setValue("");
    }

    public final LiveData<Integer> c() {
        return f2543g;
    }

    public final LiveData<Integer> d() {
        return b;
    }

    public final LiveData<Boolean> e() {
        return f2539c;
    }

    public final boolean f() {
        return k;
    }

    public final boolean g() {
        return j;
    }

    public final boolean h() {
        return l;
    }

    public final LiveData<Boolean> i() {
        return f2540d;
    }

    public final LiveData<String> j() {
        return f2541e;
    }

    public final boolean k() {
        Boolean value = i.getValue();
        if (value == null) {
            return false;
        }
        return value.booleanValue();
    }

    public final LiveData<Boolean> l() {
        return h;
    }

    public final void m() {
        com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", "initDetailViewState begin");
        h.observeForever(new b(a.a));
    }

    public final void n(int i2) {
        f2543g.setValue(Integer.valueOf(i2));
        com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", "setCurentScene scene: " + i2);
        if (i2 == 0) {
            com.bytedance.android.input.r.j.j("AiChat-DetailViewModel", "setCurrentScene scene invalid");
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        String resourceEntryName = aVar.getContext().getResources().getResourceEntryName(i2);
        com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", "setTitleTabName detailPage= " + resourceEntryName);
        int identifier = aVar.getContext().getResources().getIdentifier(resourceEntryName, TypedValues.Custom.S_STRING, com.bytedance.apm.g.u());
        String d2 = identifier > 0 ? e.a.a.a.a.d(aVar, identifier) : "test";
        kotlin.s.c.l.e(d2, "if (stringResourceId > 0…ngResourceId) else \"test\"");
        f2542f.setValue(d2);
    }

    public final void o(int i2) {
        b.postValue(Integer.valueOf(i2));
        ViewStatus viewStatus = ViewStatus.VIEW_LOADING;
        if (i2 == 1) {
            com.bytedance.android.input.r.j.i("AiChat-DetailViewModel", "setCurrentView textDetail change to empty");
            f2541e.setValue("");
            f2540d.setValue(Boolean.FALSE);
        }
    }

    public final void p(boolean z) {
        f2539c.setValue(Boolean.valueOf(z));
    }

    public final void q(boolean z) {
        k = z;
    }

    public final void r(boolean z) {
        j = z;
    }

    public final void s(boolean z) {
        l = z;
    }

    public final void t(boolean z) {
        f2540d.setValue(Boolean.valueOf(z));
    }

    public final void u(boolean z) {
        i.setValue(Boolean.valueOf(z));
    }

    public final void v(boolean z) {
        h.setValue(Boolean.valueOf(z));
    }
}
