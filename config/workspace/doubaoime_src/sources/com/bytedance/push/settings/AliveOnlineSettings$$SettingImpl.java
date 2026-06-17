package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.storage.k;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AliveOnlineSettings$$SettingImpl implements AliveOnlineSettings {
    private k b;

    public AliveOnlineSettings$$SettingImpl(k kVar) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.b = kVar;
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public void C(boolean z) {
        k kVar = this.b;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("is_close_alarm_wakeup", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public void P(boolean z) {
        k kVar = this.b;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("allow_push_job_service", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public void a(boolean z) {
        k kVar = this.b;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("allow_push_daemon_monitor", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public void g(boolean z) {
        k kVar = this.b;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("is_notify_service_stick", z);
            edit.apply();
        }
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
        if (jSONObject.has("ttpush_allow_off_alive")) {
            edit.putBoolean("allow_off_alive", d.a(jSONObject, "ttpush_allow_off_alive"));
        }
        if (jSONObject.has("ttpush_uninstall_question_url")) {
            edit.putString("uninstall_question_url", jSONObject.optString("ttpush_uninstall_question_url"));
        }
        if (jSONObject.has("ttpush_allow_push_job_service")) {
            edit.putBoolean("allow_push_job_service", d.a(jSONObject, "ttpush_allow_push_job_service"));
        }
        if (jSONObject.has("ttpush_allow_push_daemon_monitor")) {
            edit.putBoolean("allow_push_daemon_monitor", d.a(jSONObject, "ttpush_allow_push_daemon_monitor"));
        }
        if (jSONObject.has("ttpush_allow_close_boot_receiver")) {
            edit.putBoolean("allow_close_boot_receiver", d.a(jSONObject, "ttpush_allow_close_boot_receiver"));
        }
        if (jSONObject.has("ttpush_is_close_alarm_wakeup")) {
            edit.putBoolean("is_close_alarm_wakeup", d.a(jSONObject, "ttpush_is_close_alarm_wakeup"));
        }
        if (jSONObject.has("ttpush_use_start_foreground_notification")) {
            edit.putBoolean("is_use_start_foreground_notification", d.a(jSONObject, "ttpush_use_start_foreground_notification"));
        }
        if (jSONObject.has("ttpush_job_schedule_wake_up_interval_second")) {
            edit.putInt("job_schedule_wake_up_interval_second", jSONObject.optInt("ttpush_job_schedule_wake_up_interval_second"));
        }
        if (jSONObject.has("ttpush_is_use_c_native_process_keep_alive")) {
            edit.putBoolean("is_use_c_native_process_keep_alive", d.a(jSONObject, "ttpush_is_use_c_native_process_keep_alive"));
        }
        if (jSONObject.has("ttpush_is_notify_service_stick")) {
            edit.putBoolean("is_notify_service_stick", d.a(jSONObject, "ttpush_is_notify_service_stick"));
        }
        if (jSONObject.has("ttpush_key_is_miui_close_daemon")) {
            edit.putBoolean("key_is_miui_close_daemon", d.a(jSONObject, "ttpush_key_is_miui_close_daemon"));
        }
        if (jSONObject.has("ttpush_alv_white_list")) {
            edit.putString("ttpush_alv_white_list", jSONObject.optString("ttpush_alv_white_list"));
        }
        edit.apply();
    }
}
