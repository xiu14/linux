package com.bytedance.android.input.s;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e extends g {
    public static final e a = new e();

    private e() {
    }

    public static final void a(String str) {
        l.f(str, "content");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("trigger_method", str);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        linkedHashMap.put("target_app_name", aVar.H());
        linkedHashMap.put("keyboard_mode", "key_write");
        l.f("input_linebreak", "eventName");
        com.bytedance.android.input.r.j.i("ImeEventAppLog", "reportEvent input_linebreak ");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        IAppLog.a.t("input_linebreak", jSONObject);
    }
}
