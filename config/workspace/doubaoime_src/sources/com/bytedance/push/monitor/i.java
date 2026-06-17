package com.bytedance.push.monitor;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.push.C0679c;
import com.bytedance.push.interfaze.r;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {
    private static c a;

    private static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("is_new_user", C0679c.a().F);
            jSONObject.put(Constants.PHONE_BRAND, Build.BRAND);
            jSONObject.put("rom_version", com.bytedance.push.g0.j.c());
            jSONObject.put("os_detail_type", com.bytedance.push.g0.j.h() ? "harmony" : "android");
            String a2 = com.bytedance.push.g0.j.a();
            if (!TextUtils.isEmpty(a2)) {
                jSONObject.put("extra_rom_version", a2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.bytedance.push.g0.f.c("Monitor", "serviceName=" + str + ", category=" + jSONObject + ", metric=" + jSONObject2 + ", extraLog=" + jSONObject3);
        if (a == null) {
            Objects.requireNonNull(C0679c.a());
        }
        c cVar = a;
        if (cVar != null) {
            cVar.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
        } else {
            com.bytedance.push.g0.f.m("Monitor", "host monitor impl is null when send event = " + str + " ,it will be report by sdk monitor");
        }
        ((r) com.ss.android.ug.bus.b.a(r.class)).monitorEvent(str, a(jSONObject), a(jSONObject2), a(jSONObject3));
    }

    static void c(c cVar) {
        a = cVar;
    }
}
