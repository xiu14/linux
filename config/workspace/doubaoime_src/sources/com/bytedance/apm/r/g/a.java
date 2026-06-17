package com.bytedance.apm.r.g;

import android.text.TextUtils;
import com.bytedance.apm.util.n;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.c;
import com.bytedance.services.apm.api.g;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static String a = "https://mon.zijieapi.com/monitor/collect/c/logcollect";

    /* renamed from: com.bytedance.apm.r.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0120a {
        void a(boolean z, int i, Exception exc, JSONObject jSONObject);
    }

    public static boolean a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, InterfaceC0120a interfaceC0120a) {
        c b;
        try {
            IHttpService iHttpService = (IHttpService) e.b.b.m.c.a(IHttpService.class);
            HashMap hashMap = new HashMap();
            hashMap.put("scene", str4);
            g buildMultipartUpload = iHttpService.buildMultipartUpload(a, "UTF-8", false, hashMap);
            buildMultipartUpload.c(WsConstants.KEY_APP_ID, str);
            buildMultipartUpload.c("verify_info", n.c());
            buildMultipartUpload.c("device_id", str2);
            buildMultipartUpload.c(RomInfo.KEY_OS_TYPE, "Android");
            buildMultipartUpload.c("process_name", str3);
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                File file = new File(it2.next());
                if (file.exists()) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("logtype", "alog");
                    hashMap2.put("scene", str4);
                    hashMap2.put("env", "params.txt");
                    buildMultipartUpload.d(file.getName(), file, null, hashMap2);
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("filetype", "common_params");
            hashMap3.put("logtype", "env");
            String jSONObject2 = jSONObject == null ? null : jSONObject.toString();
            if (TextUtils.isEmpty(jSONObject2)) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("defaultData", "none commonParams");
                } catch (JSONException unused) {
                }
                jSONObject2 = jSONObject3.toString();
            }
            buildMultipartUpload.a("params.txt", jSONObject2, "text/plain", hashMap3);
            b = buildMultipartUpload.b();
            try {
            } catch (JSONException e2) {
                interfaceC0120a.a(false, 7, e2, null);
            }
        } catch (IOException e3) {
            interfaceC0120a.a(false, 8, e3, null);
        } catch (Exception e4) {
            interfaceC0120a.a(false, 10, e4, null);
        }
        if (b.b() == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("ALOG_UPLOAD_RESPONSE", "null");
            jSONObject4.put("ALOG_UPLOAD_STATUS", b.c());
            interfaceC0120a.a(false, 11, null, jSONObject4);
            return false;
        }
        JSONObject jSONObject5 = new JSONObject(new String(b.b()));
        if (jSONObject5.optInt("errno", -1) != 200) {
            interfaceC0120a.a(false, 6, null, jSONObject5);
            return false;
        }
        String optString = jSONObject5.optString("message");
        if (!"long escape".equals(optString) && !"drop data".equals(optString)) {
            interfaceC0120a.a(true, -1, null, jSONObject5);
            return true;
        }
        interfaceC0120a.a(false, 13, null, jSONObject5);
        return false;
    }
}
