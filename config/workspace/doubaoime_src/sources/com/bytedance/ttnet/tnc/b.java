package com.bytedance.ttnet.tnc;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.TTDelayStateManager;
import com.bytedance.frameworks.baselib.network.e.e;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.ttnet.config.TTHttpCallThrottleControl;
import com.bytedance.ttnet.config.d;
import com.bytedance.ttnet.f;
import com.bytedance.ttnet.priority.TTHttpCallPriorityControl;
import com.bytedance.ttnet.tnc.TNCManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    private Context a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6261c;

    /* renamed from: d, reason: collision with root package name */
    private String f6262d = "";
    private a b = new a();

    public b(Context context, boolean z) {
        this.a = context;
        this.f6261c = z;
    }

    private String c() {
        if (TextUtils.isEmpty(TNCManager.d())) {
            Logger.d("TNCConfigHandler", "getGetDomainDefaultJson no existed");
            return null;
        }
        try {
            String string = new JSONObject(TNCManager.d()).getString(RemoteMessageConst.DATA);
            if (Logger.debug()) {
                Logger.d("TNCConfigHandler", "use get domain default json.");
            }
            return string;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private void f(JSONObject jSONObject) {
        if (!com.bytedance.ttnet.config.b.q(this.a).f()) {
            c.n().t(jSONObject);
            okhttp3.G.a.j().m(jSONObject);
        }
        d.d(jSONObject);
        TTHttpCallThrottleControl.l().p(jSONObject);
        TTHttpCallPriorityControl.f().j(jSONObject);
        f.a().c(jSONObject);
        com.bytedance.frameworks.baselib.network.http.parser.d.c(jSONObject);
        TTDelayStateManager.e(jSONObject);
        e f2 = e.f();
        Objects.requireNonNull(f2);
        f2.e(jSONObject.optInt("qf_enter_background_time", 30000));
        TTRequestCompressManager.g(jSONObject);
        com.bytedance.frameworks.baselib.network.http.p.c.d(jSONObject);
        com.bytedance.frameworks.baselib.network.c.a.d(jSONObject);
        com.bytedance.frameworks.baselib.network.c.b.h(jSONObject);
        com.bytedance.frameworks.baselib.network.http.ok3.impl.p.c.e(jSONObject);
        com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.l.b.c(jSONObject);
        com.bytedance.frameworks.baselib.network.http.ok3.impl.a.b().c(jSONObject);
        com.bytedance.frameworks.baselib.network.f.d.b(jSONObject);
    }

    private a g(JSONObject jSONObject) {
        try {
            j.k().e().clear();
            JSONObject optJSONObject = jSONObject.optJSONObject("tnc_config");
            a aVar = new a();
            if (optJSONObject == null) {
                return aVar;
            }
            if (optJSONObject.has("local_enable")) {
                aVar.a = optJSONObject.getInt("local_enable") != 0;
            }
            if (optJSONObject.has("probe_enable")) {
                aVar.b = optJSONObject.getInt("probe_enable") != 0;
            }
            if (optJSONObject.has("local_host_filter")) {
                JSONArray jSONArray = optJSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                aVar.f6256c = hashMap;
            } else {
                aVar.f6256c = null;
            }
            if (optJSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = optJSONObject.getJSONObject("host_replace_map");
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            j.k().e().put(next, string2);
                        }
                    }
                }
            }
            aVar.f6257d = optJSONObject.optInt("req_to_cnt", aVar.f6257d);
            aVar.f6258e = optJSONObject.optInt("req_to_api_cnt", aVar.f6258e);
            aVar.f6259f = optJSONObject.optInt("req_to_ip_cnt", aVar.f6259f);
            aVar.f6260g = optJSONObject.optInt("req_err_cnt", aVar.f6260g);
            aVar.h = optJSONObject.optInt("req_err_api_cnt", aVar.h);
            aVar.i = optJSONObject.optInt("req_err_ip_cnt", aVar.i);
            aVar.j = optJSONObject.optInt("update_interval", aVar.j);
            aVar.k = optJSONObject.optInt("update_random_range", aVar.k);
            aVar.l = optJSONObject.optString("http_code_black", aVar.l);
            return aVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public a a() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b5 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.Object r19, com.bytedance.ttnet.tnc.TNCManager.TNCUpdateSource r20, java.lang.String r21, long r22) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.tnc.b.b(java.lang.Object, com.bytedance.ttnet.tnc.TNCManager$TNCUpdateSource, java.lang.String, long):boolean");
    }

    public void d(long j) {
        JSONObject optJSONObject;
        if (Logger.debug()) {
            Logger.d("TNCConfigHandler", "load local config");
        }
        if (this.f6261c) {
            boolean z = false;
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("ttnet_tnc_config", 0);
            boolean z2 = sharedPreferences.getBoolean("is_full_config", false);
            String string = sharedPreferences.getString("tnc_config_str", null);
            String string2 = sharedPreferences.getString("ttnet_tnc_etag", null);
            String string3 = sharedPreferences.getString("ttnet_tnc_abtest", null);
            if (TextUtils.isEmpty(string)) {
                string = c();
                if (TextUtils.isEmpty(string)) {
                    if (Logger.debug()) {
                        Logger.d("TNCConfigHandler", "load local config failed.");
                        return;
                    }
                    return;
                }
            } else {
                z = z2;
            }
            try {
                JSONObject jSONObject = new JSONObject(string);
                if (z && (optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA)) != null) {
                    jSONObject = optJSONObject;
                }
                j.k().n(jSONObject, TNCManager.TNCUpdateSource.TTCACHE.mValue, string2, string3, j);
                f(jSONObject);
                a g2 = g(jSONObject);
                if (g2 != null) {
                    this.b = g2;
                }
                if (Logger.debug()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadLocalConfig: ");
                    sb.append(g2 == null ? "null" : g2.toString());
                    Logger.d("TNCConfigHandler", sb.toString());
                }
            } catch (Throwable th) {
                th.printStackTrace();
                if (Logger.debug()) {
                    StringBuilder M = e.a.a.a.a.M("loadLocalConfig: except: ");
                    M.append(th.getMessage());
                    Logger.d("TNCConfigHandler", M.toString());
                }
            }
        }
    }

    public void e(long j) {
        JSONObject optJSONObject;
        try {
            boolean parseBoolean = Boolean.parseBoolean(com.bytedance.feedbackerlib.a.x(this.a, 7));
            String x = com.bytedance.feedbackerlib.a.x(this.a, 4);
            if (TextUtils.isEmpty(x)) {
                parseBoolean = false;
                x = c();
                if (TextUtils.isEmpty(x)) {
                    if (Logger.debug()) {
                        Logger.d("TNCConfigHandler", "load local config failed.");
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObject = new JSONObject(x);
            JSONObject jSONObject2 = (!parseBoolean || (optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA)) == null) ? jSONObject : optJSONObject;
            a g2 = g(jSONObject2);
            j.k().n(jSONObject2, TNCManager.TNCUpdateSource.TTCACHE.mValue, com.bytedance.feedbackerlib.a.x(this.a, 5), com.bytedance.feedbackerlib.a.x(this.a, 6), j);
            f(jSONObject2);
            if (Logger.debug()) {
                StringBuilder sb = new StringBuilder();
                sb.append("loadLocalConfigForOtherProcess, config: ");
                sb.append(g2 == null ? "null" : g2.toString());
                Logger.d("TNCConfigHandler", sb.toString());
            }
            if (g2 != null) {
                this.b = g2;
            }
        } catch (Throwable th) {
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("loadLocalConfigForOtherProcess, except: ");
                M.append(th.getMessage());
                Logger.d("TNCConfigHandler", M.toString());
            }
        }
    }

    public void h(String str) {
        this.f6262d = str;
        j.k().r(str);
    }
}
