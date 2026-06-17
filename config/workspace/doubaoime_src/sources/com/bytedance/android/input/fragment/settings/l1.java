package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import java.io.File;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class l1 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ VoiceInputOfflineDownloadFragment a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l1(VoiceInputOfflineDownloadFragment voiceInputOfflineDownloadFragment, String str) {
        super(0);
        this.a = voiceInputOfflineDownloadFragment;
        this.b = str;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        com.bytedance.android.input.r.j.i(this.a.b, "OfflineModelTips click confirm");
        kotlin.s.c.l.f("setting_offline_model_download", "pageName");
        kotlin.s.c.l.f("delete_offline_model_dialog", "dialogName");
        kotlin.s.c.l.f("btn_2", "buttonName");
        IAppLog.a aVar = IAppLog.a;
        JSONObject a0 = e.a.a.a.a.a0("page_name", "setting_offline_model_download", "dialog_name", "delete_offline_model_dialog");
        a0.put("button_name", "btn_2");
        aVar.t("ime_dialog_click", a0);
        new File(this.b).delete();
        SettingsConfigNext.k(C0838R.string.asr_offline_download_way, 0);
        SettingsConfigNext.k(C0838R.string.asr_offline_model_path, "");
        SettingsConfigNext.k(C0838R.string.asr_offline_model_download_status, 0);
        this.a.F();
        return kotlin.o.a;
    }
}
