package com.bytedance.android.doubaoime.activity;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.common.FeedbackAssociateContentShownInUi;
import com.bytedance.android.input.llm.LLMRequest;
import com.obric.oui.button.OButton;
import com.obric.oui.toast.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.InterfaceC0817m0;

@kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.activity.FeedbackActivity$handleAssociatetGroupCommitClick$1", f = "FeedbackActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class J extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends InterfaceC0817m0>>, Object> {
    final /* synthetic */ String a;
    final /* synthetic */ FeedbackActivity b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FeedbackAssociateContentShownInUi f1922c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ OButton f1923d;

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.activity.FeedbackActivity$handleAssociatetGroupCommitClick$1$1$1", f = "FeedbackActivity.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ boolean a;
        final /* synthetic */ FeedbackActivity b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FeedbackAssociateContentShownInUi f1924c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OButton f1925d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, FeedbackActivity feedbackActivity, FeedbackAssociateContentShownInUi feedbackAssociateContentShownInUi, OButton oButton, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.a = z;
            this.b = feedbackActivity;
            this.f1924c = feedbackAssociateContentShownInUi;
            this.f1925d = oButton;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new a(this.a, this.b, this.f1924c, this.f1925d, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = new a(this.a, this.b, this.f1924c, this.f1925d, dVar);
            kotlin.o oVar = kotlin.o.a;
            aVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            if (this.a) {
                a.C0363a c0363a = com.obric.oui.toast.a.p;
                FeedbackActivity feedbackActivity = this.b;
                String string = feedbackActivity.getString(C0838R.string.commit_success);
                kotlin.s.c.l.e(string, "getString(R.string.commit_success)");
                c0363a.a(feedbackActivity, string, 80);
                KeyboardJni.getKeyboardJni().setAssociateFeedbackItemSubmitted(this.f1924c.feedbackId);
                this.f1925d.setText(this.b.getString(C0838R.string.recommit));
                this.f1925d.setEnabled(true);
            } else {
                a.C0363a c0363a2 = com.obric.oui.toast.a.p;
                FeedbackActivity feedbackActivity2 = this.b;
                String string2 = feedbackActivity2.getString(C0838R.string.commit_failed_retry);
                kotlin.s.c.l.e(string2, "getString(R.string.commit_failed_retry)");
                c0363a2.a(feedbackActivity2, string2, 80);
                this.f1925d.setText(this.b.getString(C0838R.string.commit));
                this.f1925d.setEnabled(true);
            }
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J(String str, FeedbackActivity feedbackActivity, FeedbackAssociateContentShownInUi feedbackAssociateContentShownInUi, OButton oButton, kotlin.r.d<? super J> dVar) {
        super(2, dVar);
        this.a = str;
        this.b = feedbackActivity;
        this.f1922c = feedbackAssociateContentShownInUi;
        this.f1923d = oButton;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new J(this.a, this.b, this.f1922c, this.f1923d, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends InterfaceC0817m0>> dVar) {
        return new J(this.a, this.b, this.f1922c, this.f1923d, dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        Object J2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        String str = this.a;
        FeedbackActivity feedbackActivity = this.b;
        FeedbackAssociateContentShownInUi feedbackAssociateContentShownInUi = this.f1922c;
        OButton oButton = this.f1923d;
        try {
            LLMRequest lLMRequest = LLMRequest.a;
            kotlin.s.c.l.e(str, "bugDesc");
            boolean e2 = lLMRequest.e(str, null);
            C0800f0 c0800f0 = C0800f0.a;
            int i = kotlinx.coroutines.S.f10199c;
            J2 = C0795d.l(c0800f0, kotlinx.coroutines.N0.q.f10173c, null, new a(e2, feedbackActivity, feedbackAssociateContentShownInUi, oButton, null), 2, null);
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        return kotlin.h.a(J2);
    }
}
