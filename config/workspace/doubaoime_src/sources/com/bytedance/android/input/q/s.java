package com.bytedance.android.input.q;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import com.bytedance.android.input.basic.recognition.api.a;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.keyboard.aichat.AichatDetailViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class s {
    public static final s a = new s();
    private static String b = "";

    /* renamed from: c, reason: collision with root package name */
    private static String f2994c = "";

    /* renamed from: d, reason: collision with root package name */
    private static InterfaceC0817m0 f2995d;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f2996e;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.p<String, IRecognizer.e, kotlin.o> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(String str, IRecognizer.e eVar) {
            String str2 = str;
            IRecognizer.e eVar2 = eVar;
            kotlin.s.c.l.f(str2, "id");
            kotlin.s.c.l.f(eVar2, "result");
            com.bytedance.android.input.r.j.i("ChatIntentWithRequest", "recognize result callback, id=" + str2);
            s.b = str2;
            if (s.f2996e) {
                Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
                Integer value = AiChatMenuViewModel.a.b().getValue();
                AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
                if (value == null || value.intValue() != 1) {
                    com.bytedance.android.input.r.j.j("ChatIntentWithRequest", "current menu page is not baike");
                } else if (eVar2.a() != IRecognizer.Scene.CHAT) {
                    com.bytedance.android.input.r.j.j("ChatIntentWithRequest", "scene is not chat");
                } else if (eVar2 instanceof IRecognizer.f) {
                    com.bytedance.android.input.basic.recognition.api.a b = ((IRecognizer.f) eVar2).b();
                    StringBuilder U = e.a.a.a.a.U("recognize id: ", str2, ", cvsid: ");
                    U.append(b.c());
                    U.append(", lastCvsid: ");
                    U.append(s.f2994c);
                    com.bytedance.android.input.r.j.i("ChatIntentWithRequest", U.toString());
                    if (!kotlin.s.c.l.a(s.f2994c, b.c())) {
                        s.f2994c = b.c();
                    }
                    if (b.f()) {
                        com.bytedance.android.input.r.j.j("ChatIntentWithRequest", "conversation is empty");
                        AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
                        AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_FAILED;
                        aichatDetailViewModel.o(2);
                    } else {
                        List<a.b> d2 = b.d();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : d2) {
                            Objects.requireNonNull((a.b) obj);
                            arrayList.add(obj);
                        }
                        if (arrayList.isEmpty()) {
                            StringBuilder M = e.a.a.a.a.M("cvs messages list is empty, cvsid: ");
                            M.append(b.c());
                            com.bytedance.android.input.r.j.j("ChatIntentWithRequest", M.toString());
                            AichatDetailViewModel aichatDetailViewModel2 = AichatDetailViewModel.a;
                            AichatDetailViewModel.ViewStatus viewStatus2 = AichatDetailViewModel.ViewStatus.VIEW_FAILED;
                            aichatDetailViewModel2.o(2);
                        } else {
                            s.d(s.a, arrayList, r.a);
                        }
                    }
                } else {
                    com.bytedance.android.input.r.j.j("ChatIntentWithRequest", "recognize result not success");
                }
            } else {
                com.bytedance.android.input.r.j.j("ChatIntentWithRequest", "not handle recognize callback");
            }
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            if (bool.booleanValue()) {
                com.bytedance.android.input.r.j.m("ChatIntentWithRequest", "permission apply, start request");
                s sVar = s.a;
                s.f2996e = true;
                sVar.h();
            } else {
                com.bytedance.android.input.r.j.m("ChatIntentWithRequest", "permission not apply");
                AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
                AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_FAILED;
                aichatDetailViewModel.o(2);
            }
            return kotlin.o.a;
        }
    }

    private s() {
    }

    public static final void d(s sVar, List list, kotlin.s.b.l lVar) {
        LifecycleCoroutineScope lifecycleScope;
        ImeService service = KeyboardJni.getService();
        if (service == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(service)) == null) {
            return;
        }
        com.bytedance.android.input.r.j.i("ChatIntentWithRequest", "lifecyclescope alive");
        InterfaceC0817m0 interfaceC0817m0 = f2995d;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f2995d = kotlinx.coroutines.flow.h.l(new t(kotlinx.coroutines.flow.h.k(kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.j(new u(list, null))), S.b()), lVar), lifecycleScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (!kotlin.text.a.s(b)) {
            IRecognizer.a.b(b);
        }
        Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
        z.a.B(a.a);
    }

    public final void i() {
        ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        com.bytedance.android.input.r.j.m("ChatIntentWithRequest", "permission not allow, error");
        z.a.D(b.a);
    }

    public final void j() {
        InterfaceC0817m0 interfaceC0817m0 = f2995d;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        f2995d = null;
        k();
        b = "";
    }

    public final void k() {
        if (!kotlin.text.a.s(b)) {
            e.a.a.a.a.H0(e.a.a.a.a.M("stop recognize id: "), b, "ChatIntentWithRequest");
            IRecognizer.a.b(b);
        }
    }
}
