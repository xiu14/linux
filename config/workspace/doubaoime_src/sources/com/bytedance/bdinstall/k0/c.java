package com.bytedance.bdinstall.k0;

import android.content.Context;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4016e;

    /* renamed from: f, reason: collision with root package name */
    private final Q f4017f;

    c(Context context, Q q) {
        super(true, false);
        this.f4016e = context;
        this.f4017f = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException, SecurityException {
        com.bytedance.bdinstall.j0.b n = this.f4017f.n();
        String str = "IAppTraitCallback = " + n;
        int i = C0640u.a;
        if (n == null) {
            return true;
        }
        jSONObject.put("app_trait", n.a(this.f4016e));
        return true;
    }
}
