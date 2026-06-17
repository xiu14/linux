package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.bdinstall.C0640u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends d {

    /* renamed from: e, reason: collision with root package name */
    private Context f4015e;

    b(Context context) {
        super(true, false);
        this.f4015e = context;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException, SecurityException {
        try {
            Bundle bundle = this.f4015e.getPackageManager().getApplicationInfo(this.f4015e.getPackageName(), 128).metaData;
            if (bundle == null) {
                return true;
            }
            jSONObject.put("appkey", bundle.getString("UMENG_APPKEY"));
            return true;
        } catch (Exception unused) {
            int i = C0640u.a;
            return true;
        }
    }
}
