package com.bytedance.applog.x;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.o.d;
import com.bytedance.applog.util.h;
import com.bytedance.applog.util.i;
import com.bytedance.applog.util.k;
import com.bytedance.applog.w.j;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.util.r;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.AppInfo;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static final List<String> h = Collections.singletonList("DeviceManager");
    private final d a;
    private volatile boolean b;

    /* renamed from: d, reason: collision with root package name */
    private final b f3917d;

    /* renamed from: f, reason: collision with root package name */
    private final SharedPreferences f3919f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bytedance.applog.c f3920g;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3916c = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile JSONObject f3918e = new JSONObject();

    public c(com.bytedance.applog.c cVar, b bVar, d dVar) {
        this.f3920g = cVar;
        this.f3917d = bVar;
        this.a = dVar;
        this.f3919f = bVar.z();
    }

    private Object d(JSONObject jSONObject, String str) {
        if (!MonitorConstants.CUSTOM.equals(str) || !this.f3920g.Y()) {
            return jSONObject.opt(str);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return jSONObject.opt(str);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!this.f3917d.C(next)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            optJSONObject.remove(str2);
            this.f3920g.I().s(h, "custom header:{} removed by header control ", str2);
            this.f3920g.K().i(StatsCountKeys.REMOVE_CUSTOM_HEADER_COUNT, 1);
        }
        return optJSONObject;
    }

    private Set<String> f(String str) {
        String[] split;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str) && (split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) != null && split.length > 0) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    private void m(JSONObject jSONObject) {
        boolean a = h.a();
        try {
            jSONObject.put(WsConstants.KEY_PLATFORM, a ? "Harmony" : "Android");
        } catch (JSONException e2) {
            this.f3920g.I().t(h, "loadHarmonyInfo failed", e2, new Object[0]);
        }
        if (a) {
            try {
                jSONObject.put("harmony_os_api", r.a("hw_sc.build.os.apiversion"));
                jSONObject.put("harmony_os_version", r.a("hw_sc.build.platform.version"));
                jSONObject.put("harmony_release_type", r.a("hw_sc.build.os.releasetype"));
            } catch (Throwable th) {
                this.f3920g.I().n(h, "loadHarmonyInfo failed", th);
            }
        }
    }

    private void n(String str) {
        boolean z;
        boolean z2 = false;
        if (this.f3920g.n().contains("ab_sdk_version")) {
            this.f3920g.I().f(h, "update header failed for header: {} is blocked!", "ab_sdk_version");
        } else {
            Object opt = this.f3918e.opt("ab_sdk_version");
            if ((str == null || str.equals(opt)) && (str != null || opt == null)) {
                z = false;
            } else {
                synchronized (this) {
                    try {
                        JSONObject jSONObject = this.f3918e;
                        JSONObject jSONObject2 = new JSONObject();
                        k.b(jSONObject2, jSONObject);
                        jSONObject2.put("ab_sdk_version", str);
                        this.f3918e = jSONObject2;
                    } catch (JSONException e2) {
                        this.f3920g.I().t(h, "update header failed", e2, new Object[0]);
                    }
                }
                z = true;
            }
            this.f3920g.I().n(h, "updateHeader -> key:{}, old:{}, new:{}", "ab_sdk_version", opt, str);
            z2 = z;
        }
        if (z2) {
            this.f3917d.M(str);
        }
    }

    protected void a() {
        p(this.f3918e);
    }

    public String b() {
        return this.f3917d.d();
    }

    @NonNull
    public JSONObject c() {
        return k.c(this.f3918e);
    }

    public long e() {
        try {
            return this.f3919f.getLong("version_code", 0L);
        } catch (ClassCastException unused) {
            long j = this.f3919f.getInt("version_code", 0);
            this.f3919f.edit().putLong("version_code", j).apply();
            return j;
        }
    }

    public String g() {
        if (this.b) {
            return this.f3918e.optString("user_unique_id", "");
        }
        b bVar = this.f3917d;
        return bVar != null ? bVar.A() : "";
    }

    public long h() {
        Q p = ((com.bytedance.applog.o.b) this.a).p();
        if (p != null) {
            return p.H();
        }
        return 0L;
    }

    public String i() {
        Q p = ((com.bytedance.applog.o.b) this.a).p();
        return p != null ? p.G() : "";
    }

    public boolean j() {
        return this.b && this.f3916c;
    }

    public boolean k() {
        return this.f3916c;
    }

    public boolean l(JSONObject jSONObject) {
        if (jSONObject != null) {
            return k.a(jSONObject.optString("device_id", "")) && k.a(jSONObject.optString("install_id", ""));
        }
        return false;
    }

    public synchronized void o(String str) {
        Set<String> f2 = f(this.f3917d.q());
        Set<String> f3 = f(this.f3918e.optString("ab_sdk_version"));
        f3.removeAll(f2);
        f3.addAll(f(str));
        this.f3917d.R(str);
        StringBuilder sb = new StringBuilder();
        Iterator it2 = ((HashSet) f3).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        n(sb.toString());
    }

    public void p(JSONObject jSONObject) {
        this.f3920g.I().n(h, "updateHeader: {}", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        String d2 = this.f3920g.d();
        synchronized (this) {
            k.b(jSONObject2, this.f3918e);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        jSONObject2.put(next, d(jSONObject, next));
                    } catch (JSONException e2) {
                        this.f3920g.I().e("updateHeader put header key:{} value failed", next, e2);
                    }
                }
            }
            try {
                jSONObject2.put("sdk_version", 507040290);
                jSONObject2.put("sdk_version_code", i.a);
                jSONObject2.put(AppInfo.KEY_NPTH_VERSION_NAME, "5.7.4-bugfix.2");
                if (!TextUtils.isEmpty(d2)) {
                    jSONObject2.put("ab_sdk_version", d2);
                }
                m(jSONObject2);
            } catch (Throwable th) {
                this.f3920g.I().i("updateHeader put header sdk version or load harmony info failed", th, new Object[0]);
                this.f3920g.K().i(StatsCountKeys.JSON_ERROR_COUNT, 1);
            }
            Iterator<String> it2 = this.f3920g.n().iterator();
            while (it2.hasNext()) {
                jSONObject2.remove(it2.next());
            }
            this.f3918e = jSONObject2;
            this.b = true;
            this.f3916c = l(this.f3918e);
        }
        SharedPreferences.Editor edit = this.f3919f.edit();
        edit.putLong("version_code", this.f3918e.optLong("version_code", 0L));
        edit.putString("channel", this.f3918e.optString("channel", ""));
        edit.apply();
        int i = j.a;
    }
}
