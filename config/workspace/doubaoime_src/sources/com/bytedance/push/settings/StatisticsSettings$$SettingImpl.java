package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.storage.k;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class StatisticsSettings$$SettingImpl implements StatisticsSettings {
    private k b;

    public StatisticsSettings$$SettingImpl(k kVar) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.b = kVar;
    }

    @Override // com.bytedance.push.settings.StatisticsSettings
    public long b0() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("stats_fore_interval")) {
            return 300000L;
        }
        return this.b.c("stats_fore_interval");
    }

    @Override // com.bytedance.push.settings.StatisticsSettings
    public long m() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("stats_back_interval")) {
            return 300000L;
        }
        return this.b.c("stats_back_interval");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        k kVar = this.b;
        if (kVar != null) {
            kVar.registerValChanged(context, str, str2, aVar);
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(a aVar) {
        k kVar = this.b;
        if (kVar != null) {
            kVar.unregisterValChanged(aVar);
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        k kVar;
        if (jSONObject == null || (kVar = this.b) == null) {
            return;
        }
        SharedPreferences.Editor edit = kVar.edit();
        if (jSONObject.has("stats_fore_interval")) {
            edit.putLong("stats_fore_interval", jSONObject.optLong("stats_fore_interval"));
        }
        if (jSONObject.has("stats_back_interval")) {
            edit.putLong("stats_back_interval", jSONObject.optLong("stats_back_interval"));
        }
        edit.apply();
    }
}
