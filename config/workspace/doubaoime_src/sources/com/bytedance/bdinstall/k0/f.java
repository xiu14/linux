package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0635o;
import com.bytedance.bdinstall.Q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Q f4020e;

    f(Context context, Q q) {
        super(true, true);
        this.f4020e = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException, SecurityException {
        String c2 = C0635o.c(this.f4020e);
        if (TextUtils.isEmpty(c2)) {
            return false;
        }
        jSONObject.put("cdid", c2);
        return true;
    }

    @Override // com.bytedance.bdinstall.k0.d
    public void b(JSONObject jSONObject) {
        jSONObject.remove("cdid");
    }
}
