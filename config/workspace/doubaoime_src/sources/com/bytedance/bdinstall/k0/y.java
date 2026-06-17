package com.bytedance.bdinstall.k0;

import android.content.Context;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class y extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4045e;

    y(Context context, Q q) {
        super(true, false);
        this.f4045e = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        Q q = this.f4045e;
        int i = com.bytedance.bdinstall.util.o.h;
        e0.h(jSONObject, "sim_region", q.z().j());
        return true;
    }
}
