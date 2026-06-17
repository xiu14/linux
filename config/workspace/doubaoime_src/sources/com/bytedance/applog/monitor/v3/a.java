package com.bytedance.applog.monitor.v3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static volatile boolean n = true;
    public static volatile boolean o = false;
    public static volatile int p;
    private SharedPreferences a;
    private boolean b = n;

    /* renamed from: c, reason: collision with root package name */
    private int f3804c = 1048576;

    /* renamed from: d, reason: collision with root package name */
    private int f3805d = 10;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3806e = true;

    /* renamed from: f, reason: collision with root package name */
    private long f3807f = 300000;

    /* renamed from: g, reason: collision with root package name */
    private long f3808g = 30000;
    private int h = 7;
    private boolean i = o;
    private int j = p;
    private Map<String, Integer> k = null;
    private JSONObject l = null;
    private volatile boolean m = false;

    private void m(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.k.clear();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            int optInt = jSONObject.optInt(next, 0);
            if (optInt > 0 && optInt <= 10000) {
                this.k.put(next, Integer.valueOf(optInt));
            }
        }
    }

    public long a() {
        return this.f3808g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.f3804c;
    }

    public int d() {
        return this.f3805d;
    }

    public long e() {
        return this.f3807f;
    }

    public int f() {
        return this.j;
    }

    public Map<String, Integer> g() {
        return this.k;
    }

    public void h(Context context, String str) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str + "@applog_monitor_config", 0);
        this.a = sharedPreferences;
        JSONObject jSONObject = this.l;
        if (jSONObject != null && sharedPreferences != null) {
            n(jSONObject);
            return;
        }
        if (sharedPreferences.contains("enabled")) {
            this.b = this.a.getBoolean("enabled", n);
            this.f3804c = this.a.getInt("max_request_body_size_kb", 1048576);
            this.f3805d = this.a.getInt("max_request_count", 10);
            this.f3806e = this.a.getBoolean("error_report_enable", true);
            this.f3807f = this.a.getLong("report_interval_ms", 300000L);
            this.f3808g = this.a.getLong("coldstart_report_delay_ms", 30000L);
            this.h = this.a.getInt("data_keep_alive_days", 7);
            this.i = this.a.getBoolean("sentry_enabled", o);
            this.j = this.a.getInt("sentry_coldstart_sampling_rate", p);
            String string = this.a.getString("sentry_events", null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    m(new JSONObject(string));
                } catch (Throwable unused) {
                }
            }
        } else {
            this.b = n;
            this.f3804c = 1048576;
            this.f3805d = 10;
            this.f3806e = true;
            this.f3807f = 300000L;
            this.f3808g = 30000L;
            this.h = 7;
            this.i = o;
            this.j = p;
            this.k = null;
        }
        if (this.m) {
            o(true);
        }
    }

    public boolean i() {
        return this.m;
    }

    public boolean j() {
        return this.b;
    }

    public boolean k() {
        return this.f3806e;
    }

    public boolean l() {
        return this.i;
    }

    public void n(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        SharedPreferences.Editor editor = null;
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            editor = sharedPreferences.edit();
        } else {
            this.l = jSONObject;
        }
        boolean z = jSONObject.optInt("enabled", n ? 1 : 0) == 1;
        this.b = z;
        if (editor != null) {
            editor.putBoolean("enabled", z);
        }
        if (jSONObject.has("max_request_body_size_kb")) {
            int optInt = jSONObject.optInt("max_request_body_size_kb", 1024) * 1024;
            this.f3804c = optInt;
            if (editor != null) {
                editor.putInt("max_request_body_size_kb", optInt);
            }
        }
        if (jSONObject.has("max_request_count")) {
            int optInt2 = jSONObject.optInt("max_request_count", 10);
            this.f3805d = optInt2;
            if (editor != null) {
                editor.putInt("max_request_count", optInt2);
            }
        }
        if (jSONObject.has("error_report_enable")) {
            boolean z2 = jSONObject.optInt("error_report_enable", 1) == 1;
            this.f3806e = z2;
            if (editor != null) {
                editor.putBoolean("error_report_enable", z2);
            }
        }
        if (jSONObject.has("report_interval_ms")) {
            long optLong = jSONObject.optLong("report_interval_ms", 300000L);
            this.f3807f = optLong;
            if (editor != null) {
                editor.putLong("report_interval_ms", optLong);
            }
        }
        if (jSONObject.has("coldstart_report_delay_ms")) {
            long optLong2 = jSONObject.optLong("coldstart_report_delay_ms", 30000L);
            this.f3808g = optLong2;
            if (editor != null) {
                editor.putLong("coldstart_report_delay_ms", optLong2);
            }
        }
        if (jSONObject.has("data_keep_alive_days")) {
            int optInt3 = jSONObject.optInt("data_keep_alive_days", 7);
            this.h = optInt3;
            if (editor != null) {
                editor.putLong("data_keep_alive_days", optInt3);
            }
        }
        if (jSONObject.has("sentry_enabled")) {
            boolean z3 = jSONObject.optInt("sentry_enabled", o ? 1 : 0) == 1;
            this.i = z3;
            if (editor != null) {
                editor.putBoolean("sentry_enabled", z3);
            }
        }
        if (jSONObject.has("sentry_coldstart_sampling_rate")) {
            int optInt4 = jSONObject.optInt("sentry_coldstart_sampling_rate", p);
            this.j = optInt4;
            if (editor != null) {
                editor.putInt("sentry_coldstart_sampling_rate", optInt4);
            }
        }
        if (jSONObject.has("sentry_events")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("sentry_events");
            m(optJSONObject);
            if (editor != null) {
                editor.putString("sentry_events", optJSONObject.toString());
            }
        }
        if (editor != null) {
            editor.apply();
        }
        if (this.m) {
            o(true);
        }
    }

    public void o(boolean z) {
        if (!z) {
            this.m = false;
            return;
        }
        this.m = true;
        n = true;
        o = true;
        p = 10000;
        this.b = n;
        this.i = o;
        this.j = p;
        this.k = null;
    }
}
