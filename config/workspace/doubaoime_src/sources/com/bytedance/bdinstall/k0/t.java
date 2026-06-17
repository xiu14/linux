package com.bytedance.bdinstall.k0;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.bdinstall.e0;
import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class t extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4039e;

    t(Context context) {
        super(true, true);
        this.f4039e = context;
    }

    @Override // com.bytedance.bdinstall.k0.d
    @SuppressLint({"MissingPermission"})
    protected boolean a(JSONObject jSONObject) throws JSONException {
        e0.h(jSONObject, "access", NetworkUtils.d(this.f4039e));
        return true;
    }
}
