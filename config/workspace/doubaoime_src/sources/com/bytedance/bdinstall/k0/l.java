package com.bytedance.bdinstall.k0;

import com.bytedance.bdinstall.Q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class l extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4028e;

    l(Q q) {
        super(true, true);
        this.f4028e = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException, SecurityException {
        try {
            jSONObject.put("device_category", this.f4028e.s());
            return true;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
