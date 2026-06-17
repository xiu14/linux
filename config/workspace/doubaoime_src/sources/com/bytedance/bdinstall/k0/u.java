package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class u extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4040e;

    /* renamed from: f, reason: collision with root package name */
    private final Q f4041f;

    u(Context context, Q q) {
        super(false, false);
        this.f4040e = context;
        this.f4041f = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        int i;
        String packageName = this.f4040e.getPackageName();
        if (TextUtils.isEmpty(this.f4041f.J())) {
            jSONObject.put("package", packageName);
        } else {
            int i2 = C0640u.a;
            jSONObject.put("package", this.f4041f.J());
            jSONObject.put("real_package_name", packageName);
        }
        try {
            jSONObject.put("app_version", this.f4041f.G());
            jSONObject.put("app_version_minor", this.f4041f.I());
            jSONObject.put("version_code", this.f4041f.H());
            jSONObject.put("update_version_code", this.f4041f.E());
            jSONObject.put("manifest_version_code", this.f4041f.v());
            if (!TextUtils.isEmpty(this.f4041f.k())) {
                jSONObject.put("app_name", this.f4041f.k());
            }
            if (!TextUtils.isEmpty(this.f4041f.D())) {
                jSONObject.put("tweaked_channel", this.f4041f.D());
            }
            try {
                ApplicationInfo applicationInfo = this.f4040e.getPackageManager().getPackageInfo(packageName, 0).applicationInfo;
                if (applicationInfo == null || (i = applicationInfo.labelRes) <= 0) {
                    return true;
                }
                jSONObject.put("display_name", this.f4040e.getString(i));
                return true;
            } catch (Throwable unused) {
                int i3 = C0640u.a;
                return true;
            }
        } catch (Throwable unused2) {
            int i4 = C0640u.a;
            return false;
        }
    }
}
