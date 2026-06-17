package com.bytedance.android.input.common.t.a.e;

import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    private static String a = "";

    public static final void a() {
        a = "";
    }

    public static final String b() {
        if (a.length() > 0) {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            aVar.j("AsrParamManager", "cacheStrParam: " + a);
            return a;
        }
        String c2 = com.bytedance.applog.a.c();
        String d2 = com.bytedance.applog.a.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uid", 0);
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        linkedHashMap.put(WsConstants.KEY_APP_ID, "401734");
        Objects.requireNonNull(aVar2);
        linkedHashMap.put("app_name", "oime");
        l.e(c2, "did");
        linkedHashMap.put("did", c2);
        l.e(d2, WsConstants.KEY_INSTALL_ID);
        linkedHashMap.put(WsConstants.KEY_INSTALL_ID, d2);
        linkedHashMap.put("install_id", d2);
        linkedHashMap.put("channel", d.a.b.a.c(aVar2));
        String str = Build.VERSION.RELEASE;
        l.e(str, "RELEASE");
        linkedHashMap.put(RomInfo.KEY_ROM_OS_VERSION, str);
        linkedHashMap.put("version_code", "100309006");
        linkedHashMap.put("update_version_code", "100309006");
        linkedHashMap.put("version_name", "1.3.9");
        linkedHashMap.put("device_platform", "android");
        String str2 = Build.MODEL;
        l.e(str2, "MODEL");
        linkedHashMap.put("device_type", str2);
        String str3 = Build.BRAND;
        l.e(str3, "BRAND");
        linkedHashMap.put(HardwareInfo.KEY_HW_VENDOR_BRAND, str3);
        linkedHashMap.put("ip", 0);
        linkedHashMap.put("user_agent", "");
        linkedHashMap.put("forwarded", "");
        linkedHashMap.put(TypedValues.AttributesType.S_TARGET, "");
        linkedHashMap.put("mobile", "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "JSONObject().apply {\n   …   }\n        }.toString()");
        if ((c2.length() > 0) && !l.a(c2, "0")) {
            if ((d2.length() > 0) && !l.a(d2, "0")) {
                a = jSONObject2;
            }
        }
        IAppGlobals.a aVar3 = IAppGlobals.a;
        Objects.requireNonNull(aVar3);
        aVar3.j("AsrParamManager", "strParam: " + a);
        return jSONObject2;
    }
}
