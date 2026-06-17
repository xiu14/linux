package com.bytedance.bdinstall.k0;

import android.content.Context;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class n extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4034e;

    /* renamed from: f, reason: collision with root package name */
    private final C0641v f4035f;

    n(Context context, Q q, C0641v c0641v) {
        super(false, true);
        this.f4034e = q;
        this.f4035f = c0641v;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException, SecurityException {
        Q q = this.f4034e;
        int i = com.bytedance.bdinstall.util.o.h;
        e0.h(jSONObject, "carrier", q.z().h());
        e0.h(jSONObject, "mcc_mnc", this.f4034e.z().g());
        com.bytedance.bdinstall.o0.a aVar = (com.bytedance.bdinstall.o0.a) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.a.class, String.valueOf(this.f4034e.h()));
        e0.h(jSONObject, "clientudid", aVar.d());
        if (!this.f4035f.d()) {
            e0.h(jSONObject, "openudid", aVar.c(true));
        }
        return true;
    }

    @Override // com.bytedance.bdinstall.k0.d
    public void b(JSONObject jSONObject) {
        jSONObject.remove("carrier");
        jSONObject.remove("mcc_mnc");
        jSONObject.remove("clientudid");
        jSONObject.remove("openudid");
    }
}
