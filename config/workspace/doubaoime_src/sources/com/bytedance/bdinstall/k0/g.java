package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4021e;

    g(Context context, Q q, C0641v c0641v) {
        super(false, true);
        this.f4021e = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("channel", this.f4021e.o());
        jSONObject.put("not_request_sender", 1);
        jSONObject.put(WsConstants.KEY_APP_ID, this.f4021e.h());
        String y = this.f4021e.y();
        if (y == null) {
            y = "";
        }
        jSONObject.put("release_build", y);
        e0.h(jSONObject, "user_agent", this.f4021e.F());
        e0.h(jSONObject, "ab_version", this.f4021e.e());
        String j = this.f4021e.j();
        if (TextUtils.isEmpty(j)) {
            j = this.f4021e.A().getString("app_language", null);
        }
        e0.h(jSONObject, "app_language", j);
        String l = this.f4021e.l();
        if (TextUtils.isEmpty(l)) {
            l = this.f4021e.A().getString("app_region", null);
        }
        e0.h(jSONObject, "app_region", l);
        JSONObject m = this.f4021e.m();
        if (m != null) {
            try {
                jSONObject.put("app_track", m);
            } catch (Throwable unused) {
                int i = C0640u.a;
            }
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(MonitorConstants.CUSTOM);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        if (!TextUtils.isEmpty(this.f4021e.J())) {
            optJSONObject.put("real_package_name", this.f4021e.q().getPackageName());
        }
        try {
            Map<String, Object> r = this.f4021e.r();
            if (r != null && r.size() > 0) {
                for (String str : r.keySet()) {
                    optJSONObject.put(str, r.get(str));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        jSONObject.put(MonitorConstants.CUSTOM, optJSONObject);
        return true;
    }

    @Override // com.bytedance.bdinstall.k0.d
    public void b(JSONObject jSONObject) {
        jSONObject.remove("channel");
        jSONObject.remove("not_request_sender");
        jSONObject.remove(WsConstants.KEY_APP_ID);
        jSONObject.remove("release_build");
        jSONObject.remove("user_agent");
        jSONObject.remove("ab_version");
        jSONObject.remove("app_language");
        jSONObject.remove("app_region");
        jSONObject.remove("app_track");
        jSONObject.remove(MonitorConstants.CUSTOM);
    }
}
