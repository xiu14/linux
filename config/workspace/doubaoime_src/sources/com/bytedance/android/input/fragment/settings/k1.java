package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.input.basic.applog.api.IAppLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class k1 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ VoiceInputOfflineDownloadFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k1(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment) {
        super(0);
        this.a = voiceInputOfflineDownloadFragment;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        com.bytedance.android.input.r.j.i(this.a.b, "OfflineModelTips click cancel");
        kotlin.s.c.l.f("setting_offline_model_download", "pageName");
        kotlin.s.c.l.f("delete_offline_model_dialog", "dialogName");
        kotlin.s.c.l.f("btn_1", "buttonName");
        IAppLog.a aVar = IAppLog.a;
        JSONObject a0 = e.a.a.a.a.a0("page_name", "setting_offline_model_download", "dialog_name", "delete_offline_model_dialog");
        a0.put("button_name", "btn_1");
        aVar.t("ime_dialog_click", a0);
        return kotlin.o.a;
    }
}
