package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.storage.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LocalFrequencySettings$$SettingImpl implements LocalFrequencySettings {
    private k a;
    private final c b = new a(this);

    class a implements c {
        a(LocalFrequencySettings$$SettingImpl localFrequencySettings$$SettingImpl) {
        }

        @Override // com.bytedance.push.settings.c
        public <T> T create(Class<T> cls) {
            if (cls == j.class) {
                return (T) new j();
            }
            if (cls == e.class) {
                return (T) new e();
            }
            return null;
        }
    }

    public LocalFrequencySettings$$SettingImpl(Context context, k kVar) {
        this.a = kVar;
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void A0(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_request_settings_channel", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String B() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_update_sender_did")) ? "" : this.a.a("last_update_sender_did");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public int D0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("sys_switcher_stat")) {
            return -2;
        }
        return this.a.d("sys_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public boolean E() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("last_send_switcher_stat_new")) {
            return false;
        }
        return this.a.b("last_send_switcher_stat_new");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void E0(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_update_sender_gray_vc", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void F(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("notify_channel_stat_new", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void F0(int i) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putInt("inner_switcher_stat", i);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void H(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_update_sender_alias", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void K(List<com.bytedance.push.R.g> list) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            Objects.requireNonNull((j) b.a(j.class, this.b));
            JSONArray jSONArray = new JSONArray();
            for (com.bytedance.push.R.g gVar : list) {
                if (gVar != null) {
                    jSONArray.put(gVar.b());
                }
            }
            edit.putString("token_cache", jSONArray.toString());
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String L() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_update_sender_vc")) ? "" : this.a.a("last_update_sender_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void M(long j) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putLong("last_update_sender_time_mil", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String Q() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("notify_channel_stat")) ? "" : this.a.a("notify_channel_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void R(long j) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putLong("last_request_settings_time_mil", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String S() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_request_settings_vc")) ? "" : this.a.a("last_request_settings_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String T() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_update_sender_gray_vc")) ? "" : this.a.a("last_update_sender_gray_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String W() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_update_sender_supported")) ? "" : this.a.a("last_update_sender_supported");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public List<com.bytedance.push.R.c> Y() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("revoke_rid_list")) {
            Objects.requireNonNull((e) b.a(e.class, this.b));
            return new ArrayList();
        }
        String a2 = this.a.a("revoke_rid_list");
        Objects.requireNonNull((e) b.a(e.class, this.b));
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(a2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    com.bytedance.push.R.c cVar = new com.bytedance.push.R.c();
                    cVar.f5581c = optJSONObject.optLong("ts");
                    cVar.a = optJSONObject.optLong("rid");
                    cVar.b = optJSONObject.optLong("revoke_id");
                    cVar.f5582d = optJSONObject.optInt("sender");
                    arrayList.add(cVar);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            th.printStackTrace();
            return arrayList;
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void Z(long j) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putLong("last_upload_switch_ts_new", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public int a0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("inner_switcher_stat_new")) {
            return -1;
        }
        return this.a.d("inner_switcher_stat_new");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String b() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_request_settings_gray_vc")) ? "" : this.a.a("last_request_settings_gray_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void c(boolean z) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("last_send_switcher_stat", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void c0(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_update_sender_did", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public long d() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("last_update_sender_time_mil")) {
            return 0L;
        }
        return this.a.c("last_update_sender_time_mil");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void e(boolean z) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("last_send_switcher_stat_new", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void e0(int i) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putInt("inner_switcher_stat_new", i);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void f(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_update_sender_vc", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void g(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("notify_channel_stat", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public boolean g0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("last_send_switcher_stat")) {
            return false;
        }
        return this.a.b("last_send_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void h(long j) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putLong("last_upload_switch_ts", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String i0() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_request_settings_channel")) ? "" : this.a.a("last_request_settings_channel");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public int j0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("sys_switcher_stat_new")) {
            return -2;
        }
        return this.a.d("sys_switcher_stat_new");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public List<com.bytedance.push.R.g> l0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("token_cache")) {
            Objects.requireNonNull((j) b.a(j.class, this.b));
            return new ArrayList();
        }
        String a2 = this.a.a("token_cache");
        Objects.requireNonNull((j) b.a(j.class, this.b));
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(a2);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                com.bytedance.push.R.g gVar = null;
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("type");
                    String optString = optJSONObject.optString("token");
                    String optString2 = optJSONObject.optString("did");
                    String optString3 = optJSONObject.optString("vc");
                    long optLong = optJSONObject.optLong("t");
                    String optString4 = optJSONObject.optString("alias", null);
                    if (optInt > 0) {
                        gVar = new com.bytedance.push.R.g(optInt, optString, optString2, optString3, optLong, optString4);
                    }
                }
                if (gVar != null) {
                    arrayList.add(gVar);
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return arrayList;
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void o(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_request_settings_vc", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public int q() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("inner_switcher_stat")) {
            return -1;
        }
        return this.a.d("inner_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String q0() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_update_sender_alias")) ? "" : this.a.a("last_update_sender_alias");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, com.bytedance.push.settings.a aVar) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.registerValChanged(context, str, str2, aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void s(int i) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putInt("sys_switcher_stat_new", i);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void s0(int i) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putInt("sys_switcher_stat", i);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void t(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_update_sender_supported", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public long u() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("last_upload_switch_ts")) {
            return 0L;
        }
        return this.a.c("last_upload_switch_ts");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public long u0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("last_upload_switch_ts_new")) {
            return 0L;
        }
        return this.a.c("last_upload_switch_ts_new");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(com.bytedance.push.settings.a aVar) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.unregisterValChanged(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String v() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("last_update_sender_channel")) ? "" : this.a.a("last_update_sender_channel");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void w0(List<com.bytedance.push.R.c> list) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            Objects.requireNonNull((e) b.a(e.class, this.b));
            JSONArray jSONArray = new JSONArray();
            for (com.bytedance.push.R.c cVar : list) {
                if (cVar != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ts", cVar.f5581c);
                        jSONObject.put("rid", cVar.a);
                        jSONObject.put("revoke_id", cVar.b);
                        jSONObject.put("sender", cVar.f5582d);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            edit.putString("revoke_rid_list", jSONArray.toString());
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public String x() {
        k kVar = this.a;
        return (kVar == null || !kVar.contains("notify_channel_stat_new")) ? "" : this.a.a("notify_channel_stat_new");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void y0(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_request_settings_gray_vc", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public void z(String str) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putString("last_update_sender_channel", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public long z0() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("last_request_settings_time_mil")) {
            return 0L;
        }
        return this.a.c("last_request_settings_time_mil");
    }
}
