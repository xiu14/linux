package com.bytedance.bdinstall.k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0629i;
import com.bytedance.bdinstall.C0632l;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class z extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4046e;

    /* renamed from: f, reason: collision with root package name */
    private final Q f4047f;

    z(Context context, Q q) {
        super(true, false);
        this.f4046e = context;
        this.f4047f = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    @SuppressLint({"HardwareIds"})
    protected boolean a(JSONObject jSONObject) throws JSONException {
        String g2;
        JSONArray e2;
        String b;
        boolean z;
        JSONArray c2;
        int length;
        if (!this.f4047f.T()) {
            com.bytedance.bdinstall.o0.a aVar = (com.bytedance.bdinstall.o0.a) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.a.class, String.valueOf(this.f4047f.h()));
            String[] strArr = null;
            if (aVar instanceof com.bytedance.bdinstall.p0.c) {
                com.bytedance.bdinstall.p0.c cVar = (com.bytedance.bdinstall.p0.c) aVar;
                g2 = cVar.f();
                e2 = cVar.i();
                b = cVar.h();
                if (this.f4047f.U()) {
                    strArr = cVar.g();
                }
            } else {
                g2 = com.bytedance.bdinstall.util.o.g(this.f4046e, this.f4047f);
                e2 = com.bytedance.bdinstall.util.o.e(this.f4046e, this.f4047f);
                b = com.bytedance.bdinstall.util.o.b(this.f4046e, this.f4047f);
                if (this.f4047f.U()) {
                    strArr = com.bytedance.bdinstall.util.o.h(this.f4046e, this.f4047f);
                }
            }
            e0.h(jSONObject, "build_serial", g2);
            e0.h(jSONObject, "aliyun_uuid", a.c().a());
            if (e2 != null && (length = e2.length()) > 0) {
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = e2.optJSONObject(i);
                    if (optJSONObject != null && !TextUtils.isEmpty(optJSONObject.optString("id"))) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                jSONObject.put("udid_list", e2);
            }
            String d2 = com.bytedance.bdinstall.util.o.d(this.f4046e, this.f4047f);
            if (!TextUtils.isEmpty(d2)) {
                jSONObject.put("mc", d2);
            }
            if (this.f4047f.M() && (c2 = com.bytedance.bdinstall.util.o.c(this.f4046e, this.f4047f)) != null && c2.length() != 0) {
                jSONObject.put("ipv6_list", c2);
            }
            e0.h(jSONObject, "udid", b);
            e0.h(jSONObject, "serial_number", g2);
            if (this.f4047f.U() && strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(new JSONObject().put("sim_serial_number", str));
                }
                jSONObject.put("sim_serial_number", jSONArray);
            }
            Objects.requireNonNull(C0629i.d());
        }
        com.bytedance.bdinstall.m0.o.n();
        if (this.f4047f.R()) {
            Objects.requireNonNull(C0629i.b());
        } else {
            String valueOf = String.valueOf(this.f4047f.h());
            int i2 = C0629i.f4007c;
            Objects.requireNonNull(C0632l.n(valueOf).e());
        }
        Map<String, String> k = com.bytedance.bdinstall.m0.k.n(this.f4046e).k(100L);
        com.bytedance.bdinstall.m0.o.m();
        String str2 = "getOaid: returned=" + k;
        int i3 = C0640u.a;
        jSONObject.put("oaid_may_support", com.bytedance.bdinstall.m0.k.n(this.f4046e).o());
        if (k != null) {
            jSONObject.put("oaid", new JSONObject(k));
        }
        return true;
    }
}
