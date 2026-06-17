package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.service.manager.alliance.IAllianceService;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.push.settings.storage.k;
import com.bytedance.push.settings.w.l;
import com.ss.android.socialbase.downloader.setting.DownloadSettingValues;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushOnlineSettings$$SettingImpl implements PushOnlineSettings {
    private k b;

    /* renamed from: c, reason: collision with root package name */
    private final c f5804c;

    class a implements c {
        a(PushOnlineSettings$$SettingImpl pushOnlineSettings$$SettingImpl) {
        }

        @Override // com.bytedance.push.settings.c
        public <T> T create(Class<T> cls) {
            if (cls == com.bytedance.push.settings.B.b.class) {
                return (T) new com.bytedance.push.settings.B.b();
            }
            if (cls == com.bytedance.push.settings.n.a.a.class) {
                return (T) new com.bytedance.push.settings.n.a.a();
            }
            if (cls == com.bytedance.push.settings.t.a.a.class) {
                return (T) new com.bytedance.push.settings.t.a.a();
            }
            if (cls == com.bytedance.push.settings.l.a.a.class) {
                return (T) new com.bytedance.push.settings.l.a.a();
            }
            if (cls == com.bytedance.push.settings.p.a.a.class) {
                return (T) new com.bytedance.push.settings.p.a.a();
            }
            if (cls == com.bytedance.push.settings.w.e.class) {
                return (T) new com.bytedance.push.settings.w.e();
            }
            if (cls == com.bytedance.push.settings.w.b.class) {
                return (T) new com.bytedance.push.settings.w.b();
            }
            if (cls == com.bytedance.push.settings.u.c.class) {
                return (T) new com.bytedance.push.settings.u.c();
            }
            if (cls == com.bytedance.push.settings.v.a.a.class) {
                return (T) new com.bytedance.push.settings.v.a.a();
            }
            if (cls == com.bytedance.push.settings.w.i.class) {
                return (T) new com.bytedance.push.settings.w.i();
            }
            if (cls == com.bytedance.push.settings.y.a.class) {
                return (T) new com.bytedance.push.settings.y.a();
            }
            if (cls == com.bytedance.push.settings.x.a.f.class) {
                return (T) new com.bytedance.push.settings.x.a.f();
            }
            if (cls == com.bytedance.push.settings.x.a.e.class) {
                return (T) new com.bytedance.push.settings.x.a.e();
            }
            if (cls == com.bytedance.push.settings.A.a.e.class) {
                return (T) new com.bytedance.push.settings.A.a.e();
            }
            if (cls == com.bytedance.push.settings.q.a.class) {
                return (T) new com.bytedance.push.settings.q.a();
            }
            if (cls == com.bytedance.push.settings.w.k.class) {
                return (T) new com.bytedance.push.settings.w.k();
            }
            if (cls == com.bytedance.push.settings.m.a.a.class) {
                return (T) new com.bytedance.push.settings.m.a.a();
            }
            if (cls == com.bytedance.push.settings.x.a.b.class) {
                return (T) new com.bytedance.push.settings.x.a.b();
            }
            if (cls == com.bytedance.push.settings.z.a.a.class) {
                return (T) new com.bytedance.push.settings.z.a.a();
            }
            if (cls == com.bytedance.push.settings.w.a.class) {
                return (T) new com.bytedance.push.settings.w.a();
            }
            if (cls == com.bytedance.push.settings.x.a.d.class) {
                return (T) new com.bytedance.push.settings.x.a.d();
            }
            if (cls == com.bytedance.push.settings.w.g.class) {
                return (T) new com.bytedance.push.settings.w.g();
            }
            if (cls == com.bytedance.push.settings.C.a.class) {
                return (T) new com.bytedance.push.settings.C.a();
            }
            if (cls == com.bytedance.push.settings.x.a.c.class) {
                return (T) new com.bytedance.push.settings.x.a.c();
            }
            if (cls == com.bytedance.push.settings.x.a.g.class) {
                return (T) new com.bytedance.push.settings.x.a.g();
            }
            if (cls == com.bytedance.push.settings.x.a.i.class) {
                return (T) new com.bytedance.push.settings.x.a.i();
            }
            return null;
        }
    }

    public PushOnlineSettings$$SettingImpl(k kVar) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f5804c = new a(this);
        this.b = kVar;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean A() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("allow_settings_notify_enable")) {
            return true;
        }
        return this.b.b("allow_settings_notify_enable");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean B() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("use_hw_manifest_appid")) {
            return false;
        }
        return this.b.b("use_hw_manifest_appid");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public int D() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("check_sign_v2")) {
            return 0;
        }
        return this.b.d("check_sign_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean E() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_hms_business_notification_dialog")) {
            return true;
        }
        return this.b.b("enable_hms_business_notification_dialog");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public String F() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("ab_tag")) ? "" : this.b.a("ab_tag");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean G() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_pass_through_redbadge_show")) {
            return true;
        }
        return this.b.b("enable_pass_through_redbadge_show");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.w.j H() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("polling_notification_report")) {
            Objects.requireNonNull((com.bytedance.push.settings.w.k) b.a(com.bytedance.push.settings.w.k.class, this.f5804c));
            return new com.bytedance.push.settings.w.j();
        }
        String a2 = this.b.a("polling_notification_report");
        Objects.requireNonNull((com.bytedance.push.settings.w.k) b.a(com.bytedance.push.settings.w.k.class, this.f5804c));
        com.bytedance.push.settings.w.j jVar = (com.bytedance.push.settings.w.j) com.bytedance.push.g0.d.a(a2, com.bytedance.push.settings.w.j.class);
        if (jVar != null) {
            return jVar;
        }
        com.bytedance.push.g0.f.e(com.bytedance.push.settings.w.k.class.getSimpleName(), "PollingNotificationReport is null");
        return new com.bytedance.push.settings.w.j();
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.v.a.b I() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("msg_call_back_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.v.a.a) b.a(com.bytedance.push.settings.v.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.v.a.b();
        }
        String a2 = this.b.a("msg_call_back_settings");
        Objects.requireNonNull((com.bytedance.push.settings.v.a.a) b.a(com.bytedance.push.settings.v.a.a.class, this.f5804c));
        return new com.bytedance.push.settings.v.a.b(a2);
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public int J() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("ping_max_count")) {
            return 20;
        }
        return this.b.d("ping_max_count");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean K() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("need_kill_all_if_main_process_died")) {
            return true;
        }
        return this.b.b("need_kill_all_if_main_process_died");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean L() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_redbadge_auto_dismiss")) {
            return true;
        }
        return this.b.b("enable_redbadge_auto_dismiss");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.z.a.b M() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("opt_push_click_session_id")) {
            Objects.requireNonNull((com.bytedance.push.settings.z.a.a) b.a(com.bytedance.push.settings.z.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.z.a.b();
        }
        String a2 = this.b.a("opt_push_click_session_id");
        Objects.requireNonNull((com.bytedance.push.settings.z.a.a) b.a(com.bytedance.push.settings.z.a.a.class, this.f5804c));
        com.bytedance.push.settings.z.a.b bVar = (com.bytedance.push.settings.z.a.b) com.bytedance.push.g0.d.a(a2, com.bytedance.push.settings.z.a.b.class);
        if (bVar != null) {
            return bVar;
        }
        com.bytedance.push.g0.f.e("PushClickReportOptSettingsConverter", "pushClickReportOptSettingsModel from json is null,return default object");
        return new com.bytedance.push.settings.z.a.b();
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.l.a.b N() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("association_start_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.l.a.a) b.a(com.bytedance.push.settings.l.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.l.a.b();
        }
        String a2 = this.b.a("association_start_settings");
        Objects.requireNonNull((com.bytedance.push.settings.l.a.a) b.a(com.bytedance.push.settings.l.a.a.class, this.f5804c));
        com.bytedance.push.settings.l.a.b bVar = new com.bytedance.push.settings.l.a.b();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            bVar.a = jSONObject.optBoolean("enable_association_hook");
            bVar.b = jSONObject.optBoolean("enable_association_start_monitor");
            bVar.f5808d = jSONObject.optBoolean("enable_association_start_intercept");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("monitor_component_black_list");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add((String) optJSONArray.get(i));
                }
            }
            bVar.f5807c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("intercept_component_white_list");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    arrayList2.add((String) optJSONArray2.get(i2));
                }
            }
            bVar.f5811g = arrayList2;
            ArrayList arrayList3 = new ArrayList();
            JSONArray optJSONArray3 = jSONObject.optJSONArray("intercept_component_black_list");
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    arrayList3.add((String) optJSONArray3.get(i3));
                }
            }
            bVar.f5810f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            JSONArray optJSONArray4 = jSONObject.optJSONArray("isolation_intercept_component_black_list");
            if (optJSONArray4 != null) {
                for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                    arrayList4.add((String) optJSONArray4.get(i4));
                }
            }
            bVar.f5809e = arrayList4;
            HashMap hashMap = new HashMap();
            JSONObject optJSONObject = jSONObject.optJSONObject("isolation_redirect_component_map");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = optJSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString)) {
                        hashMap.put(next, optString);
                    }
                }
            }
            bVar.h = hashMap;
            return bVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bVar;
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.m.a.b O() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("opt_push_channel_registration")) {
            Objects.requireNonNull((com.bytedance.push.settings.m.a.a) b.a(com.bytedance.push.settings.m.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.m.a.b();
        }
        String a2 = this.b.a("opt_push_channel_registration");
        Objects.requireNonNull((com.bytedance.push.settings.m.a.a) b.a(com.bytedance.push.settings.m.a.a.class, this.f5804c));
        com.bytedance.push.settings.m.a.b bVar = (com.bytedance.push.settings.m.a.b) com.bytedance.push.g0.d.a(a2, com.bytedance.push.settings.m.a.b.class);
        return bVar == null ? new com.bytedance.push.settings.m.a.b() : bVar;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public int Q() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("ttpush_forbid_alias")) {
            return 0;
        }
        return this.b.d("ttpush_forbid_alias");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long R() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("ttpush_request_settings_interval")) {
            return 3600000L;
        }
        return this.b.c("ttpush_request_settings_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public int S() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("receiver_message_wakeup_screen_time")) ? DownloadSettingValues.SYNC_INTERVAL_MS_FG : this.b.d("receiver_message_wakeup_screen_time");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public int T() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("wakeup_support_strategy")) {
            return 1;
        }
        return this.b.d("wakeup_support_strategy");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long U() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("ttpush_update_token_interval")) ? com.heytap.mcssdk.constant.a.f6888f : this.b.c("ttpush_update_token_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.A.a.f V() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("signal_report_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.A.a.e) b.a(com.bytedance.push.settings.A.a.e.class, this.f5804c));
            return new com.bytedance.push.settings.A.a.f();
        }
        String a2 = this.b.a("signal_report_settings");
        Objects.requireNonNull((com.bytedance.push.settings.A.a.e) b.a(com.bytedance.push.settings.A.a.e.class, this.f5804c));
        return (com.bytedance.push.settings.A.a.f) com.bytedance.push.g0.d.a(a2, com.bytedance.push.settings.A.a.f.class);
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean W() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_monitor_channel_create")) {
            return false;
        }
        return this.b.b("enable_monitor_channel_create");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public int X() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("pull_api_strategy")) {
            return 0;
        }
        return this.b.d("pull_api_strategy");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean Y() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("kill_smp_after_vv_push")) {
            return false;
        }
        return this.b.b("kill_smp_after_vv_push");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.w.h Z() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("notification_settings")) {
            return ((com.bytedance.push.settings.w.i) b.a(com.bytedance.push.settings.w.i.class, this.f5804c)).a();
        }
        return ((com.bytedance.push.settings.w.i) b.a(com.bytedance.push.settings.w.i.class, this.f5804c)).b(this.b.a("notification_settings"));
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean a0() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("allow_force_send_token")) {
            return true;
        }
        return this.b.b("allow_force_send_token");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean b() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("need_control_miui_flares_v2")) {
            return true;
        }
        return this.b.b("need_control_miui_flares_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long c() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("ttpush_update_sender_interval")) {
            return 10800000L;
        }
        return this.b.c("ttpush_update_sender_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean c0() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("remove_auto_boot_v2")) {
            return false;
        }
        return this.b.b("remove_auto_boot_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.C.b d() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("token_retry_config")) {
            Objects.requireNonNull((com.bytedance.push.settings.C.a) b.a(com.bytedance.push.settings.C.a.class, this.f5804c));
            return new com.bytedance.push.settings.C.b();
        }
        String a2 = this.b.a("token_retry_config");
        Objects.requireNonNull((com.bytedance.push.settings.C.a) b.a(com.bytedance.push.settings.C.a.class, this.f5804c));
        com.bytedance.push.settings.C.b bVar = (com.bytedance.push.settings.C.b) com.bytedance.push.g0.d.a(a2, com.bytedance.push.settings.C.b.class);
        return bVar == null ? new com.bytedance.push.settings.C.b() : bVar;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.t.a.b d0() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("un_duplicate_message_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.t.a.a) b.a(com.bytedance.push.settings.t.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.t.a.b();
        }
        String a2 = this.b.a("un_duplicate_message_settings");
        Objects.requireNonNull((com.bytedance.push.settings.t.a.a) b.a(com.bytedance.push.settings.t.a.a.class, this.f5804c));
        com.bytedance.push.settings.t.a.b bVar = new com.bytedance.push.settings.t.a.b();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            bVar.a = jSONObject.optBoolean("enable_un_duplicate_message");
            bVar.b = jSONObject.optInt("max_cache_message", 200);
            bVar.f5843c = jSONObject.optLong("max_cache_time_in_hour", 24L);
            return bVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bVar;
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.p.a.b e() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("delay_start_child_process_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.p.a.a) b.a(com.bytedance.push.settings.p.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.p.a.b();
        }
        String a2 = this.b.a("delay_start_child_process_settings");
        Objects.requireNonNull((com.bytedance.push.settings.p.a.a) b.a(com.bytedance.push.settings.p.a.a.class, this.f5804c));
        return new com.bytedance.push.settings.p.a.b(a2);
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public String f() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("not_allow_alive_when_no_main_process_list")) ? "push,pushservice,smp" : this.b.a("not_allow_alive_when_no_main_process_list");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.n.a.b getClientIntelligenceSettings() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("client_intelligence_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.n.a.a) b.a(com.bytedance.push.settings.n.a.a.class, this.f5804c));
            return new com.bytedance.push.settings.n.a.b();
        }
        String a2 = this.b.a("client_intelligence_settings");
        Objects.requireNonNull((com.bytedance.push.settings.n.a.a) b.a(com.bytedance.push.settings.n.a.a.class, this.f5804c));
        com.bytedance.push.settings.n.a.b bVar = new com.bytedance.push.settings.n.a.b();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            bVar.a = jSONObject.optBoolean("enable_feature_report");
            bVar.b = jSONObject.optBoolean("allow_collect_client_feature");
            bVar.f5813c = jSONObject.optBoolean("enable_client_intelligence_push_show");
            bVar.f5814d = jSONObject.optLong("feature_collect_time_out_in_mill");
            bVar.f5815e = jSONObject.optLong("check_client_feature_interval_in_mill");
            bVar.f5816f = jSONObject.optLong("max_show_delay_time_in_mill");
            bVar.h = jSONObject.optLong("min_message_show_interval_in_mill");
            bVar.f5817g = jSONObject.optLong("min_interval_from_launch_in_mill");
            bVar.i = jSONObject.optInt("max_number_of_message_show_at_the_same_time");
            bVar.j = jSONObject.optInt("client_intelligence_push_show_mode", 1);
            bVar.k = jSONObject.optInt("client_intelligence_push_show_sub_mode", 0);
            bVar.l = jSONObject.optInt("max_number_of_allow_cache");
            bVar.m = jSONObject.optBoolean("improve_push_arrival_rate");
            JSONArray optJSONArray = jSONObject.optJSONArray("allow_collect_feature_scene");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    bVar.n.add(optJSONArray.getString(i));
                }
            }
            bVar.o = new com.bytedance.push.settings.n.a.c(jSONObject.optJSONObject(IAllianceService.CONTENT_TYPE_LOCAL_PUSH));
            return bVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return bVar;
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean h() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_backup_token_refresh")) {
            return false;
        }
        return this.b.b("enable_backup_token_refresh");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean i() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("allow_cache_msg_to_db")) {
            return true;
        }
        return this.b.b("allow_cache_msg_to_db");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean j() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("ttpush_shut_push_on_stop_service")) {
            return false;
        }
        return this.b.b("ttpush_shut_push_on_stop_service");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long k() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("auto_start_push_delay_in_mill")) ? WsConstants.EXIT_DELAY_TIME : this.b.c("auto_start_push_delay_in_mill");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean l() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_vv_business_notification_dialog")) {
            return true;
        }
        return this.b.b("enable_vv_business_notification_dialog");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long n() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("min_hms_business_notification_dialog_interval")) {
            return 172800000L;
        }
        return this.b.c("min_hms_business_notification_dialog_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long o() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("ping_interval")) ? com.heytap.mcssdk.constant.a.f6886d : this.b.c("ping_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.w.f p() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("notification_show_monitor_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.w.e) b.a(com.bytedance.push.settings.w.e.class, this.f5804c));
            return new com.bytedance.push.settings.w.f();
        }
        String a2 = this.b.a("notification_show_monitor_settings");
        Objects.requireNonNull((com.bytedance.push.settings.w.e) b.a(com.bytedance.push.settings.w.e.class, this.f5804c));
        com.bytedance.push.settings.w.f fVar = new com.bytedance.push.settings.w.f();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            fVar.a = jSONObject.optBoolean("enable_monitor_notification_show");
            fVar.f5860d = jSONObject.optBoolean("allow_intercept_foreground_notification");
            fVar.b = jSONObject.optBoolean("report_valid_notification");
            fVar.f5859c = jSONObject.optBoolean("need_intercept_empty_notification");
            fVar.f5861e = jSONObject.optBoolean("need_intercept_group");
            fVar.f5863g = jSONObject.optBoolean("need_intercept_top");
            fVar.h = jSONObject.optBoolean("need_intercept_stick");
            fVar.i = jSONObject.optBoolean("need_intercept_cancel_error");
            fVar.j = jSONObject.optBoolean("need_intercept_pending_intent_error");
            fVar.o = jSONObject.optLong("min_monitor_interval", com.heytap.mcssdk.constant.a.r);
            JSONArray optJSONArray = jSONObject.optJSONArray("need_intercept_style_list");
            if (optJSONArray != null) {
                fVar.l = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    fVar.l.add(optJSONArray.getString(i));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("black_field_list");
            fVar.m = new ArrayList();
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    fVar.m.add(optJSONArray2.getString(i2));
                }
            }
            JSONArray optJSONArray3 = jSONObject.optJSONArray("white_group_list");
            fVar.f5862f = new ArrayList();
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    fVar.f5862f.add(optJSONArray3.getString(i3));
                }
            }
            JSONArray optJSONArray4 = jSONObject.optJSONArray("group_tag_list");
            fVar.p = new ArrayList();
            if (optJSONArray4 != null) {
                for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                    fVar.p.add(optJSONArray4.getString(i4));
                }
            }
            JSONArray optJSONArray5 = jSONObject.optJSONArray("group_name_list");
            fVar.q = new ArrayList();
            if (optJSONArray5 != null) {
                for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                    fVar.q.add(optJSONArray5.getString(i5));
                }
            }
            JSONArray optJSONArray6 = jSONObject.optJSONArray("intercept_stack");
            if (optJSONArray6 != null) {
                fVar.k = new ArrayList();
                for (int i6 = 0; i6 < optJSONArray6.length(); i6++) {
                    JSONArray jSONArray = (JSONArray) optJSONArray6.get(i6);
                    if (jSONArray != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                            arrayList.add((String) jSONArray.get(i7));
                        }
                        fVar.k.add(arrayList);
                    }
                }
            }
            JSONArray optJSONArray7 = jSONObject.optJSONArray("target_text_reg_list");
            fVar.n = new ArrayList();
            if (optJSONArray7 == null) {
                return fVar;
            }
            for (int i8 = 0; i8 < optJSONArray7.length(); i8++) {
                fVar.n.add(new l(optJSONArray7.getJSONObject(i8)));
            }
            return fVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return fVar;
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean q() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_oppo_business_notification_dialog")) {
            return true;
        }
        return this.b.b("enable_oppo_business_notification_dialog");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.u.d r() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("push_monitor_settings")) {
            Objects.requireNonNull((com.bytedance.push.settings.u.c) b.a(com.bytedance.push.settings.u.c.class, this.f5804c));
            return new com.bytedance.push.settings.u.d();
        }
        String a2 = this.b.a("push_monitor_settings");
        Objects.requireNonNull((com.bytedance.push.settings.u.c) b.a(com.bytedance.push.settings.u.c.class, this.f5804c));
        com.bytedance.push.settings.u.d dVar = (com.bytedance.push.settings.u.d) com.bytedance.push.g0.d.a(a2, com.bytedance.push.settings.u.d.class);
        return dVar == null ? new com.bytedance.push.settings.u.d() : dVar;
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, com.bytedance.push.settings.a aVar) {
        k kVar = this.b;
        if (kVar != null) {
            kVar.registerValChanged(context, str, str2, aVar);
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean s() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("is_receiver_message_wakeup_screen")) {
            return false;
        }
        return this.b.b("is_receiver_message_wakeup_screen");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean t() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("pass_though_new_activity")) {
            return false;
        }
        return this.b.b("pass_though_new_activity");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean u() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("enable_process_stats")) {
            return false;
        }
        return this.b.b("enable_process_stats");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(com.bytedance.push.settings.a aVar) {
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
        if (jSONObject.has("ttpush_allow_settings_notify_enable")) {
            edit.putBoolean("allow_settings_notify_enable", d.a(jSONObject, "ttpush_allow_settings_notify_enable"));
        }
        if (jSONObject.has("ttpush_update_sender_interval")) {
            edit.putLong("ttpush_update_sender_interval", jSONObject.optLong("ttpush_update_sender_interval"));
        }
        if (jSONObject.has("ttpush_update_token_interval")) {
            edit.putLong("ttpush_update_token_interval", jSONObject.optLong("ttpush_update_token_interval"));
        }
        if (jSONObject.has("ttpush_enable_restrict_update_token")) {
            edit.putBoolean("ttpush_enable_restrict_update_token", d.a(jSONObject, "ttpush_enable_restrict_update_token"));
        }
        if (jSONObject.has("ttpush_shut_push_on_stop_service")) {
            edit.putBoolean("ttpush_shut_push_on_stop_service", d.a(jSONObject, "ttpush_shut_push_on_stop_service"));
        }
        if (jSONObject.has("ttpush_is_receiver_message_wakeup_screen")) {
            edit.putBoolean("is_receiver_message_wakeup_screen", d.a(jSONObject, "ttpush_is_receiver_message_wakeup_screen"));
        }
        if (jSONObject.has("ttpush_receiver_message_wakeup_screen_time")) {
            edit.putInt("receiver_message_wakeup_screen_time", jSONObject.optInt("ttpush_receiver_message_wakeup_screen_time"));
        }
        if (jSONObject.has("ttpush_upload_switch_interval")) {
            edit.putLong("ttpush_upload_switch_interval", jSONObject.optLong("ttpush_upload_switch_interval"));
        }
        if (jSONObject.has("ttpush_forbid_alias")) {
            edit.putInt("ttpush_forbid_alias", jSONObject.optInt("ttpush_forbid_alias"));
        }
        if (jSONObject.has("need_control_miui_flares_v2")) {
            edit.putBoolean("need_control_miui_flares_v2", d.a(jSONObject, "need_control_miui_flares_v2"));
        }
        if (jSONObject.has("remove_auto_boot_v2")) {
            edit.putBoolean("remove_auto_boot_v2", d.a(jSONObject, "remove_auto_boot_v2"));
        }
        if (jSONObject.has("remove_umeng_autoboot")) {
            edit.putBoolean("remove_umeng_autoboot", d.a(jSONObject, "remove_umeng_autoboot"));
        }
        if (jSONObject.has("check_sign_v2")) {
            edit.putInt("check_sign_v2", jSONObject.optInt("check_sign_v2"));
        }
        if (jSONObject.has("pass_though_new_activity")) {
            edit.putBoolean("pass_though_new_activity", d.a(jSONObject, "pass_though_new_activity"));
        }
        if (jSONObject.has("frontier_update_setting_interval")) {
            edit.putLong("frontier_update_setting_interval", jSONObject.optLong("frontier_update_setting_interval"));
        }
        if (jSONObject.has("wakeup_support_strategy")) {
            edit.putInt("wakeup_support_strategy", jSONObject.optInt("wakeup_support_strategy"));
        }
        if (jSONObject.has("enable_pass_through_redbadge_show")) {
            edit.putBoolean("enable_pass_through_redbadge_show", d.a(jSONObject, "enable_pass_through_redbadge_show"));
        }
        if (jSONObject.has("enable_redbadge_auto_dismiss")) {
            edit.putBoolean("enable_redbadge_auto_dismiss", d.a(jSONObject, "enable_redbadge_auto_dismiss"));
        }
        if (jSONObject.has("upload_hw_device_info_interval")) {
            edit.putLong("upload_hw_device_info_interval", jSONObject.optLong("upload_hw_device_info_interval"));
        }
        if (jSONObject.has("enable_hw_analytics")) {
            edit.putBoolean("enable_hw_analytics", d.a(jSONObject, "enable_hw_analytics"));
        }
        if (jSONObject.has("enable_start_push_process")) {
            edit.putBoolean("enable_start_push_process", d.a(jSONObject, "enable_start_push_process"));
        }
        if (jSONObject.has("pull_api_strategy")) {
            edit.putInt("pull_api_strategy", jSONObject.optInt("pull_api_strategy"));
        }
        if (jSONObject.has("pull_redbadge_strategy")) {
            edit.putString("pull_redbadge_strategy", jSONObject.optString("pull_redbadge_strategy"));
        }
        if (jSONObject.has("ttpush_request_settings_interval")) {
            edit.putLong("ttpush_request_settings_interval", jSONObject.optLong("ttpush_request_settings_interval"));
        }
        if (jSONObject.has("enable_monitor_association_start")) {
            edit.putBoolean("enable_monitor_association_start", d.a(jSONObject, "enable_monitor_association_start"));
        }
        if (jSONObject.has("enable_report_client_feature")) {
            edit.putBoolean("enable_report_client_feature", d.a(jSONObject, "enable_report_client_feature"));
        }
        if (jSONObject.has("notification_small_icon_style")) {
            edit.putInt("notification_small_icon_style", jSONObject.optInt("notification_small_icon_style"));
        }
        if (jSONObject.has("push_statistics_settings")) {
            edit.putString("push_statistics_settings", jSONObject.optString("push_statistics_settings"));
        }
        if (jSONObject.has("client_intelligence_settings")) {
            edit.putString("client_intelligence_settings", jSONObject.optString("client_intelligence_settings"));
        }
        if (jSONObject.has("un_duplicate_message_settings")) {
            edit.putString("un_duplicate_message_settings", jSONObject.optString("un_duplicate_message_settings"));
        }
        if (jSONObject.has("association_start_settings")) {
            edit.putString("association_start_settings", jSONObject.optString("association_start_settings"));
        }
        if (jSONObject.has("not_allow_alive_when_no_main_process_list")) {
            edit.putString("not_allow_alive_when_no_main_process_list", jSONObject.optString("not_allow_alive_when_no_main_process_list"));
        }
        if (jSONObject.has("need_kill_all_if_main_process_died")) {
            edit.putBoolean("need_kill_all_if_main_process_died", d.a(jSONObject, "need_kill_all_if_main_process_died"));
        }
        if (jSONObject.has("enable_process_stats")) {
            edit.putBoolean("enable_process_stats", d.a(jSONObject, "enable_process_stats"));
        }
        if (jSONObject.has("delay_start_child_process_settings")) {
            edit.putString("delay_start_child_process_settings", jSONObject.optString("delay_start_child_process_settings"));
        }
        if (jSONObject.has("enable_report_umeng_channel")) {
            edit.putBoolean("enable_report_umeng_channel", d.a(jSONObject, "enable_report_umeng_channel"));
        }
        if (jSONObject.has("auto_start_push_delay_in_mill")) {
            edit.putLong("auto_start_push_delay_in_mill", jSONObject.optLong("auto_start_push_delay_in_mill"));
        }
        if (jSONObject.has("ab_tag")) {
            edit.putString("ab_tag", jSONObject.optString("ab_tag"));
        }
        if (jSONObject.has("enable_monitor_channel_create")) {
            edit.putBoolean("enable_monitor_channel_create", d.a(jSONObject, "enable_monitor_channel_create"));
        }
        if (jSONObject.has("enable_cached_android_id")) {
            edit.putBoolean("enable_cached_android_id", d.a(jSONObject, "enable_cached_android_id"));
        }
        if (jSONObject.has("notification_sound_mode")) {
            edit.putInt("notification_sound_mode", jSONObject.optInt("notification_sound_mode"));
        }
        if (jSONObject.has("enable_default_configuration")) {
            edit.putBoolean("enable_default_configuration", d.a(jSONObject, "enable_default_configuration"));
        }
        if (jSONObject.has("use_op_home_badge_v2")) {
            edit.putBoolean("use_op_home_badge_v2", d.a(jSONObject, "use_op_home_badge_v2"));
        }
        if (jSONObject.has("allow_cache_msg_to_db")) {
            edit.putBoolean("allow_cache_msg_to_db", d.a(jSONObject, "allow_cache_msg_to_db"));
        }
        if (jSONObject.has("allow_spread_out_message")) {
            edit.putBoolean("allow_spread_out_message", d.a(jSONObject, "allow_spread_out_message"));
        }
        if (jSONObject.has("notification_show_monitor_settings")) {
            edit.putString("notification_show_monitor_settings", jSONObject.optString("notification_show_monitor_settings"));
        }
        if (jSONObject.has("message_black_time_window")) {
            edit.putString("message_black_time_window", jSONObject.optString("message_black_time_window"));
        }
        if (jSONObject.has("push_monitor_settings")) {
            edit.putString("push_monitor_settings", jSONObject.optString("push_monitor_settings"));
        }
        if (jSONObject.has("use_hw_manifest_appid")) {
            edit.putBoolean("use_hw_manifest_appid", d.a(jSONObject, "use_hw_manifest_appid"));
        }
        if (jSONObject.has("msg_call_back_settings")) {
            edit.putString("msg_call_back_settings", jSONObject.optString("msg_call_back_settings"));
        }
        if (jSONObject.has("allow_force_send_token")) {
            edit.putBoolean("allow_force_send_token", d.a(jSONObject, "allow_force_send_token"));
        }
        if (jSONObject.has("notification_settings")) {
            edit.putString("notification_settings", jSONObject.optString("notification_settings"));
        }
        if (jSONObject.has("pull_config")) {
            edit.putString("pull_config", jSONObject.optString("pull_config"));
        }
        if (jSONObject.has("permission_boot_settings")) {
            edit.putString("permission_boot_settings", jSONObject.optString("permission_boot_settings"));
        }
        if (jSONObject.has("permission_boot_channel_clear_config")) {
            edit.putString("permission_boot_channel_clear_config", jSONObject.optString("permission_boot_channel_clear_config"));
        }
        if (jSONObject.has("opt_sensitive_api_invoke")) {
            edit.putBoolean("opt_sensitive_api_invoke", d.a(jSONObject, "opt_sensitive_api_invoke"));
        }
        if (jSONObject.has("allow_profile_id")) {
            edit.putBoolean("allow_profile_id", d.a(jSONObject, "allow_profile_id"));
        }
        if (jSONObject.has("signal_report_settings")) {
            edit.putString("signal_report_settings", jSONObject.optString("signal_report_settings"));
        }
        if (jSONObject.has("enable_backup_token_refresh")) {
            edit.putBoolean("enable_backup_token_refresh", d.a(jSONObject, "enable_backup_token_refresh"));
        }
        if (jSONObject.has("depths_i18n_config")) {
            edit.putString("depths_i18n_config", jSONObject.optString("depths_i18n_config"));
        }
        if (jSONObject.has("enable_gif_permission_page")) {
            edit.putBoolean("enable_gif_permission_page", d.a(jSONObject, "enable_gif_permission_page"));
        }
        if (jSONObject.has("polling_notification_report")) {
            edit.putString("polling_notification_report", jSONObject.optString("polling_notification_report"));
        }
        if (jSONObject.has("opt_push_channel_registration")) {
            edit.putString("opt_push_channel_registration", jSONObject.optString("opt_push_channel_registration"));
        }
        if (jSONObject.has("ping_interval")) {
            edit.putLong("ping_interval", jSONObject.optLong("ping_interval"));
        }
        if (jSONObject.has("ping_max_count")) {
            edit.putInt("ping_max_count", jSONObject.optInt("ping_max_count"));
        }
        if (jSONObject.has("gif_sys_permission_page_settings")) {
            edit.putString("gif_sys_permission_page_settings", jSONObject.optString("gif_sys_permission_page_settings"));
        }
        if (jSONObject.has("opt_push_click_session_id")) {
            edit.putString("opt_push_click_session_id", jSONObject.optString("opt_push_click_session_id"));
        }
        if (jSONObject.has("clear_notification_config")) {
            edit.putString("clear_notification_config", jSONObject.optString("clear_notification_config"));
        }
        if (jSONObject.has("custom_sys_dialog_config_v2")) {
            edit.putString("custom_sys_dialog_config_v2", jSONObject.optString("custom_sys_dialog_config_v2"));
        }
        if (jSONObject.has("notification_params_config")) {
            edit.putString("notification_params_config", jSONObject.optString("notification_params_config"));
        }
        if (jSONObject.has("token_retry_config")) {
            edit.putString("token_retry_config", jSONObject.optString("token_retry_config"));
        }
        if (jSONObject.has("kill_smp_after_vv_push")) {
            edit.putBoolean("kill_smp_after_vv_push", d.a(jSONObject, "kill_smp_after_vv_push"));
        }
        if (jSONObject.has("google_custom_sys_dialog_config")) {
            edit.putString("google_custom_sys_dialog_config", jSONObject.optString("google_custom_sys_dialog_config"));
        }
        if (jSONObject.has("permission_event_settings_model")) {
            edit.putString("permission_event_settings_model", jSONObject.optString("permission_event_settings_model"));
        }
        if (jSONObject.has("enable_oppo_business_notification_dialog")) {
            edit.putBoolean("enable_oppo_business_notification_dialog", d.a(jSONObject, "enable_oppo_business_notification_dialog"));
        }
        if (jSONObject.has("enable_honor_business_notification_dialog")) {
            edit.putBoolean("enable_honor_business_notification_dialog", d.a(jSONObject, "enable_honor_business_notification_dialog"));
        }
        if (jSONObject.has("enable_hms_business_notification_dialog")) {
            edit.putBoolean("enable_hms_business_notification_dialog", d.a(jSONObject, "enable_hms_business_notification_dialog"));
        }
        if (jSONObject.has("enable_vv_business_notification_dialog")) {
            edit.putBoolean("enable_vv_business_notification_dialog", d.a(jSONObject, "enable_vv_business_notification_dialog"));
        }
        if (jSONObject.has("min_hms_business_notification_dialog_interval")) {
            edit.putLong("min_hms_business_notification_dialog_interval", jSONObject.optLong("min_hms_business_notification_dialog_interval"));
        }
        if (jSONObject.has("sys_settings_page_dialog_config")) {
            edit.putString("sys_settings_page_dialog_config", jSONObject.optString("sys_settings_page_dialog_config"));
        }
        edit.apply();
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public com.bytedance.push.settings.w.c v() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("message_black_time_window")) {
            Objects.requireNonNull((com.bytedance.push.settings.w.b) b.a(com.bytedance.push.settings.w.b.class, this.f5804c));
            return new com.bytedance.push.settings.w.c();
        }
        String a2 = this.b.a("message_black_time_window");
        Objects.requireNonNull((com.bytedance.push.settings.w.b) b.a(com.bytedance.push.settings.w.b.class, this.f5804c));
        com.bytedance.push.settings.w.c cVar = new com.bytedance.push.settings.w.c();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            cVar.a = jSONObject.optBoolean("need_intercept");
            JSONObject optJSONObject = jSONObject.optJSONObject("begin_time");
            if (optJSONObject != null) {
                cVar.b = optJSONObject.optInt("hour", -1);
                cVar.f5855c = optJSONObject.optInt("minute", -1);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("end_time");
            if (optJSONObject2 == null) {
                return cVar;
            }
            cVar.f5856d = optJSONObject2.optInt("day", -1);
            cVar.f5857e = optJSONObject2.optInt("hour", -1);
            cVar.f5858f = optJSONObject2.optInt("minute", -1);
            return cVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return cVar;
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean w() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("ttpush_enable_restrict_update_token")) {
            return false;
        }
        return this.b.b("ttpush_enable_restrict_update_token");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean x() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("allow_profile_id")) {
            return false;
        }
        return this.b.b("allow_profile_id");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public boolean y() {
        k kVar = this.b;
        if (kVar == null || !kVar.contains("allow_spread_out_message")) {
            return false;
        }
        return this.b.b("allow_spread_out_message");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public long z() {
        k kVar = this.b;
        return (kVar == null || !kVar.contains("ttpush_upload_switch_interval")) ? com.heytap.mcssdk.constant.a.f6888f : this.b.c("ttpush_upload_switch_interval");
    }
}
