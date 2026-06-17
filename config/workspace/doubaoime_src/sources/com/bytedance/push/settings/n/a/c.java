package com.bytedance.push.settings.n.a;

import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c extends com.bytedance.common.push.c {
    public boolean a;
    public int b;

    public c() {
        this.a = false;
        this.b = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
    }

    public c(JSONObject jSONObject) {
        if (jSONObject == null) {
            this.a = false;
            this.b = DownloadSettingValues.SYNC_INTERVAL_MS_FG;
        } else {
            this.a = jSONObject.optBoolean("enable_client_intelligence_local_push", false);
            jSONObject.optInt("max_try_pull_times", 5);
            this.b = jSONObject.optInt("check_client_feature_interval_in_mill", DownloadSettingValues.SYNC_INTERVAL_MS_FG);
        }
    }
}
