package com.bytedance.android.input.q.C;

import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.network.api.IRecommends;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$assistantLoadMore$1$1", f = "ChatRequest.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class l extends kotlin.r.h.a.i implements kotlin.s.b.p<IRecommends.Data, kotlin.r.d<? super kotlin.o>, Object> {
    /* synthetic */ Object a;
    final /* synthetic */ kotlin.s.c.v b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f2965c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(kotlin.s.c.v vVar, long j, kotlin.r.d<? super l> dVar) {
        super(2, dVar);
        this.b = vVar;
        this.f2965c = j;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        l lVar = new l(this.b, this.f2965c, dVar);
        lVar.a = obj;
        return lVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(IRecommends.Data data, kotlin.r.d<? super kotlin.o> dVar) {
        l lVar = new l(this.b, this.f2965c, dVar);
        lVar.a = data;
        kotlin.o oVar = kotlin.o.a;
        lVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        IRecommends.Data data = (IRecommends.Data) this.a;
        if (!this.b.a) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ai_chat_first_reply_time", System.currentTimeMillis() - this.f2965c);
            aVar.t("ai_chat_first_reply_report", jSONObject);
            this.b.a = true;
        }
        if (data.f().ordinal() == 3) {
            IAppLog.a aVar2 = IAppLog.a;
            Objects.requireNonNull(aVar2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ai_chat_finish_reply_time", System.currentTimeMillis() - this.f2965c);
            aVar2.t("ai_chat_finish_reply_report", jSONObject2);
            Objects.requireNonNull(aVar2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("tabname", "smartreply");
            aVar2.t("AI_tabcontentshow", jSONObject3);
        }
        StringBuilder M = e.a.a.a.a.M("assistantLoadMore updateRecommend messageType=");
        M.append(data.f());
        com.bytedance.android.input.r.j.i("ChatRequest", M.toString());
        AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
        boolean a = data.a();
        String d2 = data.d();
        IRecommends.Data.Type f2 = data.f();
        data.c().ordinal();
        aiChatMenuViewModel.g(a, d2, f2);
        return kotlin.o.a;
    }
}
