package com.bytedance.android.input.basic.network.d;

import android.net.Uri;
import com.bytedance.apm.c;
import com.bytedance.common.wschannel.WsConstants;
import java.util.HashMap;
import kotlin.g;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    public static final void a(String str, String str2, com.bytedance.android.input.basic.network.b.b bVar) {
        String str3;
        l.f(str2, "logId");
        l.f(bVar, WsConstants.KEY_CONNECTION_ERROR);
        Uri parse = Uri.parse(str);
        String path = parse != null ? parse.getPath() : null;
        if (path != null) {
            Uri parse2 = Uri.parse(path);
            l.e(parse2, "parse(this)");
            str3 = parse2.getPath();
            if (str3 != null) {
                if (str3.length() > 50) {
                    try {
                        int q = kotlin.text.a.q(str3, "/", str3.length() - 50, false, 4, null);
                        if (q < 0) {
                            q = 0;
                        }
                        str3 = str3.substring(q);
                        l.e(str3, "this as java.lang.String).substring(startIndex)");
                    } catch (Exception unused) {
                        com.bytedance.services.apm.api.a.a();
                    }
                }
                JSONObject a0 = e.a.a.a.a.a0("module", "net", "action", "net_error");
                a0.put("net_error", 0);
                a0.put("err_tips", bVar.getMessage());
                a0.put("err_msg", (Object) null);
                a0.put(str3, 0);
                g[] gVarArr = {new g("log_id", str2)};
                l.f(gVarArr, "pairs");
                HashMap hashMap = new HashMap(kotlin.collections.g.H(1));
                kotlin.collections.g.Q(hashMap, gVarArr);
                l.d(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                c.g("widget", a0, new JSONObject(hashMap), null);
            }
        }
        str3 = "";
        JSONObject a02 = e.a.a.a.a.a0("module", "net", "action", "net_error");
        a02.put("net_error", 0);
        a02.put("err_tips", bVar.getMessage());
        a02.put("err_msg", (Object) null);
        a02.put(str3, 0);
        g[] gVarArr2 = {new g("log_id", str2)};
        l.f(gVarArr2, "pairs");
        HashMap hashMap2 = new HashMap(kotlin.collections.g.H(1));
        kotlin.collections.g.Q(hashMap2, gVarArr2);
        l.d(hashMap2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        c.g("widget", a02, new JSONObject(hashMap2), null);
    }
}
