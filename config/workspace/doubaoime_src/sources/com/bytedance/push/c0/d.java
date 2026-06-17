package com.bytedance.push.c0;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.PowerManager;
import android.text.TextUtils;
import com.bytedance.push.g0.k;
import com.bytedance.push.interfaze.r;
import com.bytedance.push.settings.StatisticsSettings;
import com.bytedance.push.settings.h;
import com.huawei.hms.framework.common.BundleUtil;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d implements b {
    private final Context a;
    private final k<String> b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.push.Q.b f5639c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.push.interfaze.e f5640d;

    /* renamed from: e, reason: collision with root package name */
    private long f5641e;

    class a extends k<String> {
        a(d dVar) {
        }

        @Override // com.bytedance.push.g0.k
        protected String e(Object[] objArr) {
            return UUID.randomUUID().toString();
        }
    }

    public d(Context context, com.bytedance.push.Q.b bVar) {
        this.b = new a(this);
        this.a = context;
        this.f5639c = bVar;
        this.f5640d = null;
    }

    static void c(d dVar, com.bytedance.push.c0.a aVar, JSONObject jSONObject) {
        Objects.requireNonNull(dVar);
        try {
            if (!TextUtils.isEmpty(dVar.i())) {
                boolean z = true;
                if ((aVar.f5629c - aVar.b) - aVar.f5633g > TimeUnit.SECONDS.toMillis(5L)) {
                    r rVar = (r) com.ss.android.ug.bus.b.a(r.class);
                    String i = dVar.i();
                    JSONObject jSONObject2 = new JSONObject();
                    boolean z2 = aVar.h;
                    String str = PushClient.DEFAULT_REQUEST_ID;
                    jSONObject2.put("foreground", z2 ? PushClient.DEFAULT_REQUEST_ID : "0");
                    jSONObject2.put("screenOn", aVar.i ? PushClient.DEFAULT_REQUEST_ID : "0");
                    if (!aVar.j) {
                        str = "0";
                    }
                    jSONObject2.put("usbCharging", str);
                    jSONObject2.put("blockTimeStamp", dVar.f5641e + aVar.f5633g);
                    rVar.monitorStatusAndDuration("push_block_stats" + i, 0, jSONObject2, null);
                    dVar.f5641e = 0L;
                } else {
                    if (!com.ss.android.pushmanager.setting.a.a().c()) {
                        try {
                            z = ((PowerManager) dVar.a.getSystemService("power")).isInteractive();
                        } catch (Exception unused) {
                        }
                        if (!z && !dVar.l()) {
                            dVar.f5641e += aVar.f5633g;
                        }
                    }
                    dVar.f5641e = 0L;
                }
            }
        } catch (Exception unused2) {
        }
    }

    private String i() {
        String h = com.ss.android.message.f.a.h(this.a);
        if (h == null || !h.contains(Constants.COLON_SEPARATOR)) {
            return "";
        }
        StringBuilder M = e.a.a.a.a.M(BundleUtil.UNDERLINE_TAG);
        M.append(h.split(Constants.COLON_SEPARATOR)[1]);
        return M.toString();
    }

    private long m(long j) {
        return j < com.heytap.mcssdk.constant.a.f6886d ? com.heytap.mcssdk.constant.a.f6886d : j;
    }

    public long e() {
        return m(com.ss.android.message.f.a.t(this.a) ? ((StatisticsSettings) h.b(this.a, StatisticsSettings.class)).m() : this.a.getSharedPreferences("push_multi_process_config", 4).getLong("stats_back_interval", m(300000L)));
    }

    public long f() {
        return m(300000L);
    }

    public long g() {
        return m(300000L);
    }

    public long h() {
        return m(com.ss.android.message.f.a.t(this.a) ? ((StatisticsSettings) h.b(this.a, StatisticsSettings.class)).b0() : this.a.getSharedPreferences("push_multi_process_config", 4).getLong("stats_fore_interval", m(300000L)));
    }

    public boolean j() {
        return TextUtils.isEmpty(i());
    }

    public boolean k() {
        try {
            return ((PowerManager) this.a.getSystemService("power")).isInteractive();
        } catch (Exception unused) {
            return true;
        }
    }

    public boolean l() {
        try {
            Intent registerReceiver = com.bytedance.common.g.a.c().b().registerReceiver(this.a, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                if (registerReceiver.getIntExtra("plugged", -1) == 2) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public void n(boolean z) {
        Iterator<Map.Entry<String, ?>> it2;
        String str;
        SharedPreferences.Editor editor;
        String key;
        long optLong;
        String str2;
        String str3 = "fg_duration";
        Context context = this.a;
        StringBuilder M = e.a.a.a.a.M("ttpush_statistics_");
        M.append(com.ss.android.message.f.a.h(this.a));
        int i = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(M.toString(), 0);
        r rVar = (r) com.ss.android.ug.bus.b.a(r.class);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all == null) {
            return;
        }
        String i2 = i();
        Iterator<Map.Entry<String, ?>> it3 = all.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<String, ?> next = it3.next();
            try {
                key = next.getKey();
            } catch (Exception e2) {
                e = e2;
                it2 = it3;
                str = str3;
                editor = edit;
            }
            if (key != null && key.startsWith("push_stats_")) {
                Object value = next.getValue();
                if (value instanceof String) {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject((String) value);
                    String optString = jSONObject2.optString("session");
                    if (!TextUtils.isEmpty(optString) && (z || !TextUtils.equals(optString, this.b.f(new Object[i])))) {
                        long optLong2 = jSONObject2.optLong("bg_duration");
                        SharedPreferences.Editor editor2 = edit;
                        try {
                            optLong = jSONObject2.optLong(str3);
                            jSONObject.put("bg_duration", optLong2);
                            jSONObject.put(str3, optLong);
                            it2 = it3;
                        } catch (Exception e3) {
                            e = e3;
                            it2 = it3;
                        }
                        try {
                            str2 = str3;
                            try {
                                this.f5639c.d("push_proc_stat", "save to monitor: " + jSONObject2);
                                i = 0;
                                try {
                                    rVar.monitorStatusAndDuration("push_alive_stats" + i2, 0, jSONObject, jSONObject2);
                                    editor = editor2;
                                } catch (Exception e4) {
                                    e = e4;
                                    editor = editor2;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                editor = editor2;
                                str = str2;
                                i = 0;
                                e.printStackTrace();
                                edit = editor;
                                str3 = str;
                                it3 = it2;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            str = str3;
                            editor = editor2;
                            i = 0;
                            e.printStackTrace();
                            edit = editor;
                            str3 = str;
                            it3 = it2;
                        }
                        try {
                            editor.remove(key);
                            if (this.f5640d != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("process", com.ss.android.message.f.a.h(this.a));
                                jSONObject3.put("session", optString);
                                jSONObject.put("bg_duration", optLong2);
                                str = str2;
                                try {
                                    jSONObject.put(str, optLong);
                                    this.f5640d.onEventV3("pushsdk_alive_stats", jSONObject3);
                                } catch (Exception e7) {
                                    e = e7;
                                    e.printStackTrace();
                                    edit = editor;
                                    str3 = str;
                                    it3 = it2;
                                }
                            } else {
                                str = str2;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            str = str2;
                            e.printStackTrace();
                            edit = editor;
                            str3 = str;
                            it3 = it2;
                        }
                    }
                } else {
                    it2 = it3;
                    str = str3;
                    editor = edit;
                }
                edit = editor;
                str3 = str;
                it3 = it2;
            }
            return;
        }
        edit.apply();
    }

    public d(Context context, com.bytedance.push.Q.b bVar, com.bytedance.push.interfaze.e eVar) {
        this.b = new a(this);
        this.a = context;
        this.f5639c = bVar;
        this.f5640d = eVar;
    }
}
