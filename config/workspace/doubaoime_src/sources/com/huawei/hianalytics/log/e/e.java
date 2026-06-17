package com.huawei.hianalytics.log.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e {
    public static String a(Context context) {
        return String.format(Locale.getDefault(), "%s=%s&%s=%s&%s=%s&%s=%s&%s=%s&%s=%s", "shaSN", b(context), "model", Build.MODEL, "romVersion", com.huawei.hianalytics.util.f.a(), "emuiVersion", com.huawei.hianalytics.c.c.b(), "osVersion", Build.VERSION.RELEASE, "countryCode", com.huawei.hianalytics.a.d.h());
    }

    public static String a(Context context, boolean z, boolean z2) {
        String format = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        String c2 = com.huawei.hianalytics.d.a.a().c();
        if (TextUtils.isEmpty(c2)) {
            c2 = com.huawei.hianalytics.a.b.i();
            if (TextUtils.isEmpty(c2)) {
                c2 = c(context);
                com.huawei.hianalytics.a.b.b(c2);
            }
        }
        String a = b.a(c2);
        if (z) {
            return "/Eventid_" + a + BundleUtil.UNDERLINE_TAG + format + "_ALL.zip";
        }
        if (z2) {
            return "/Crash_" + a + BundleUtil.UNDERLINE_TAG + format + ".zip";
        }
        return "/Eventid_" + a + BundleUtil.UNDERLINE_TAG + format + ".zip";
    }

    public static String a(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.b("LogStringUtil", "collectErrorLog() MetaData is not a JSON format!");
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(str, str2);
            } catch (JSONException unused2) {
                com.huawei.hianalytics.g.b.c("LogStringUtil", "checkMetaMsg() An exception occurred in json.put ");
            }
            jSONObject = jSONObject2;
        }
        return jSONObject.toString();
    }

    public static String b(Context context) {
        return b.a(c(context));
    }

    public static String c(Context context) {
        SharedPreferences a = c.a(context, "global_v2");
        if (a == null) {
            return UUID.randomUUID().toString();
        }
        String str = (String) c.b(a, "uuid", "");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        a.edit().putString("uuid", replace).apply();
        return replace;
    }
}
