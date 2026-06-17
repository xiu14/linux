package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.Y;
import com.bytedance.crash.general.RomInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    private final Q a;

    j(Q q) {
        this.a = q;
    }

    protected boolean a(JSONObject jSONObject, C0641v c0641v) throws JSONException, SecurityException {
        if (c0641v.d()) {
            jSONObject.put("scene", 2);
        }
        jSONObject.put("device_platform", "android");
        boolean j = com.bytedance.bdinstall.util.n.j();
        try {
            jSONObject.put(RomInfo.KEY_OS_TYPE, j ? "Harmony" : "Android");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        if (j) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(RomInfo.KEY_ROM_OS_API, com.bytedance.bdinstall.util.r.a("hw_sc.build.os.apiversion"));
                jSONObject2.put(RomInfo.KEY_ROM_OS_VERSION, com.bytedance.bdinstall.util.r.a("hw_sc.build.platform.version"));
                jSONObject2.put("release_type", com.bytedance.bdinstall.util.r.a("hw_sc.build.os.releasetype"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                jSONObject.put("harmony", jSONObject2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        jSONObject.put("git_hash", "b416399");
        jSONObject.put("sdk_version_code", C0640u.a);
        jSONObject.put("sdk_target_version", 30);
        jSONObject.put("req_id", com.bytedance.bdinstall.util.m.b());
        jSONObject.put("sdk_version", "4.3.2-rc.13");
        jSONObject.put("guest_mode", this.a.T() ? 1 : 0);
        jSONObject.put("sdk_flavor", "cnInner");
        if (com.bytedance.bdinstall.util.g.d(this.a.q(), this.a).getBoolean("is_migrate", false)) {
            String string = com.bytedance.bdinstall.util.g.d(this.a.q(), this.a).getString("old_did", null);
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            try {
                jSONObject.put("old_did", string);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        Context q = this.a.q();
        Y x = this.a.x();
        if (x != null) {
            jSONObject.put("pre_installed_channel", x.a(q));
        }
        try {
            PackageInfo packageInfo = q.getPackageManager().getPackageInfo(q.getPackageName(), 0);
            if (packageInfo != null) {
                jSONObject.put("apk_first_install_time", packageInfo.firstInstallTime);
                jSONObject.put("is_system_app", (packageInfo.applicationInfo.flags & 1) == 1 ? 1 : 0);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        com.bytedance.bdinstall.o0.c cVar = (com.bytedance.bdinstall.o0.c) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.c.class, String.valueOf(this.a.h()));
        if (cVar != null) {
            cVar.b(jSONObject);
        }
        Q q2 = this.a;
        com.bytedance.bdinstall.h0.c d2 = com.bytedance.bdinstall.util.d.b().d(q2.h());
        com.bytedance.bdinstall.h0.a a = com.bytedance.bdinstall.util.d.b().a(q2.h());
        if (c0641v.d()) {
            d2.k(2);
            a.j(2);
        } else if (q2.T()) {
            d2.k(1);
            a.j(1);
        } else {
            d2.k(0);
            a.j(0);
        }
        if (cVar != null) {
            d2.h(cVar.a() ? 1 : 0);
            a.h(cVar.a() ? 1 : 0);
        }
        return true;
    }
}
