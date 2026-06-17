package com.bytedance.android.input.speech.view;

import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.speech.AsrManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class h extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ AsrLongPressView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(AsrLongPressView asrLongPressView) {
        super(0);
        this.a = asrLongPressView;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        String str;
        str = this.a.a;
        com.bytedance.android.input.r.j.m(str, "rollback btn action up");
        AsrManager.a.u();
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.Q(false);
        }
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actiontype", "rollback");
        if (o.f3179f == null) {
            e.a.a.a.a.b0();
        }
        o oVar = o.f3179f;
        kotlin.s.c.l.d(oVar, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
        jSONObject.put("pagename", oVar.c());
        if (o.f3179f == null) {
            e.a.a.a.a.b0();
        }
        o oVar2 = o.f3179f;
        kotlin.s.c.l.d(oVar2, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
        if (oVar2.f().length() > 0) {
            if (o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            o oVar3 = o.f3179f;
            kotlin.s.c.l.d(oVar3, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("third_package_name", oVar3.h());
            if (o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            o oVar4 = o.f3179f;
            kotlin.s.c.l.d(oVar4, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("third_scene", oVar4.f());
            if (o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            o oVar5 = o.f3179f;
            kotlin.s.c.l.d(oVar5, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("third_extra", oVar5.g());
        }
        aVar.t("voiceinput_space_action", jSONObject);
        return kotlin.o.a;
    }
}
