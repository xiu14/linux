package com.bytedance.android.doubaoime.activity;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.speech.AsrContext;
import com.obric.oui.button.OButton;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.InterfaceC0817m0;

@kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.activity.FeedbackVoiceDetailsActivity$handleCommitClick$1", f = "FeedbackVoiceDetailsActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class P extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.h<? extends InterfaceC0817m0>>, Object> {
    final /* synthetic */ kotlin.s.c.z<String> a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1930c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f1931d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FeedbackVoiceDetailsActivity f1932e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ OButton f1933f;

    @kotlin.r.h.a.e(c = "com.bytedance.android.doubaoime.activity.FeedbackVoiceDetailsActivity$handleCommitClick$1$1$1", f = "FeedbackVoiceDetailsActivity.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ kotlin.s.c.v a;
        final /* synthetic */ FeedbackVoiceDetailsActivity b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.z<String> f1934c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OButton f1935d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.s.c.v vVar, FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity, kotlin.s.c.z<String> zVar, OButton oButton, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.a = vVar;
            this.b = feedbackVoiceDetailsActivity;
            this.f1934c = zVar;
            this.f1935d = oButton;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return new a(this.a, this.b, this.f1934c, this.f1935d, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = new a(this.a, this.b, this.f1934c, this.f1935d, dVar);
            kotlin.o oVar = kotlin.o.a;
            aVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            int i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            if (this.a.a) {
                com.obric.oui.toast.a.p.a(this.b, this.f1934c.a, 80);
                this.f1935d.setText(this.b.getString(C0838R.string.commit));
                this.f1935d.setEnabled(true);
            } else {
                com.obric.oui.toast.a.p.a(this.b, this.f1934c.a, 80);
                AsrContext asrContext = AsrContext.a;
                AsrContext asrContext2 = AsrContext.a;
                i = this.b.a;
                asrContext2.Y(i);
                Handler handler = new Handler(Looper.getMainLooper());
                final FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity = this.b;
                handler.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        FeedbackVoiceDetailsActivity.this.finish();
                    }
                }, 1500L);
            }
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P(kotlin.s.c.z<String> zVar, String str, String str2, boolean z, FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity, OButton oButton, kotlin.r.d<? super P> dVar) {
        super(2, dVar);
        this.a = zVar;
        this.b = str;
        this.f1930c = str2;
        this.f1931d = z;
        this.f1932e = feedbackVoiceDetailsActivity;
        this.f1933f = oButton;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new P(this.a, this.b, this.f1930c, this.f1931d, this.f1932e, this.f1933f, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.G g2, kotlin.r.d<? super kotlin.h<? extends InterfaceC0817m0>> dVar) {
        return ((P) create(g2, dVar)).invokeSuspend(kotlin.o.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, java.lang.String] */
    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        Object J2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        kotlin.s.c.z<String> zVar = this.a;
        String str = this.b;
        String str2 = this.f1930c;
        boolean z = this.f1931d;
        FeedbackVoiceDetailsActivity feedbackVoiceDetailsActivity = this.f1932e;
        OButton oButton = this.f1933f;
        try {
            com.bytedance.android.input.r.j.f3013f.q("asr_error", 2);
            boolean k = zVar.a.length() > 0 ? LLMRequest.a.k(zVar.a, str) : false;
            boolean e2 = LLMRequest.a.e(str2, str);
            kotlin.s.c.z zVar2 = new kotlin.s.c.z();
            zVar2.a = "";
            kotlin.s.c.v vVar = new kotlin.s.c.v();
            if (z) {
                if (k) {
                    zVar2.a = ((String) zVar2.a) + "录音文件上传成功，";
                } else {
                    vVar.a = true;
                    zVar2.a = ((String) zVar2.a) + "录音文件上传失败，";
                }
            }
            if (e2) {
                zVar2.a = ((String) zVar2.a) + "反馈信息上传成功";
            } else {
                vVar.a = true;
                zVar2.a = ((String) zVar2.a) + "反馈信息上传失败";
            }
            if (vVar.a) {
                zVar2.a = ((String) zVar2.a) + "，请重试!";
            }
            C0800f0 c0800f0 = C0800f0.a;
            int i = kotlinx.coroutines.S.f10199c;
            J2 = C0795d.l(c0800f0, kotlinx.coroutines.N0.q.f10173c, null, new a(vVar, feedbackVoiceDetailsActivity, zVar2, oButton, null), 2, null);
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        return kotlin.h.a(J2);
    }
}
