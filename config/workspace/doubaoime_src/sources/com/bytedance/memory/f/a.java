package com.bytedance.memory.f;

import android.text.TextUtils;
import com.bytedance.apm.g;
import com.bytedance.apm.util.j;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.memory.b.b;
import com.bytedance.services.apm.api.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    public static List<String> a = new ArrayList();
    public static List<String> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static List<String> f5378c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static String f5379d = "hprof_force_upload";

    /* renamed from: e, reason: collision with root package name */
    public static String f5380e = "upload_when_not_wifi";

    /* renamed from: f, reason: collision with root package name */
    private static volatile boolean f5381f = false;

    /* renamed from: com.bytedance.memory.f.a$a, reason: collision with other inner class name */
    static class RunnableC0272a implements Runnable {
        final /* synthetic */ String a;

        RunnableC0272a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("d_s_t", System.currentTimeMillis());
                jSONObject2.put("event_type", "memory_object_monitor");
                jSONObject2.put("log_id", 464);
                jSONObject2.put("log_type", "memory_object_monitor");
                jSONObject2.put("memory_object", new JSONObject(this.a).optJSONObject("memory_object"));
                jSONObject2.put("network_type", com.bytedance.android.input.k.b.a.O(g.h()).getValue());
                String sessionId = g.j().getSessionId();
                if (!TextUtils.isEmpty(sessionId)) {
                    jSONObject2.put("session_id", sessionId);
                }
                jSONObject2.put(WsConstants.KEY_SESSION_ID, g.z());
                jSONObject2.put("timestamp", System.currentTimeMillis());
                jSONArray.put(jSONObject2);
                jSONObject.put(RemoteMessageConst.DATA, jSONArray);
                jSONObject.put("header", g.k());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            Iterator<String> it2 = a.f5378c.iterator();
            while (it2.hasNext()) {
                try {
                    c d2 = g.d(it2.next(), jSONObject.toString().getBytes(), null);
                    if (d2 != null && new JSONObject(new String(d2.b())).optInt("error_code", -1) == 0) {
                        com.bytedance.memory.b.c.b("client analysis report success", new Object[0]);
                        return;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public static void a(String str) {
        b.a.a(new RunnableC0272a(str), "uploadClientResult-MNA");
    }

    public static void b() {
        synchronized (a.class) {
            if (!f5381f && !TextUtils.isEmpty(com.bytedance.memory.heap.a.e().f())) {
                boolean z = true;
                f5381f = true;
                if (!j.c(com.bytedance.memory.a.a.j().h()) && !com.bytedance.feedbackerlib.a.F(f5380e)) {
                    com.bytedance.feedbackerlib.a.P0("error_not_wifi_in_upload");
                    com.bytedance.memory.b.c.b("not wifi, not upload", new Object[0]);
                    return;
                }
                try {
                    com.bytedance.memory.b.c.b("MemoryNetApi uploadFile begin", new Object[0]);
                    JSONObject k = g.k();
                    k.put("update_version_code", com.bytedance.memory.heap.a.e().h());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", "memory_object_monitor");
                    jSONObject.put("hprof_type", com.bytedance.memory.heap.a.e().g().getInt("hprof_type", 1));
                    jSONObject.put("timestamp", com.bytedance.memory.heap.a.e().d());
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("header", k.toString());
                    hashMap.put(RemoteMessageConst.DATA, jSONObject.toString());
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(new File(com.bytedance.memory.heap.a.e().f()));
                    com.bytedance.feedbackerlib.a.P0("upload_dump");
                    List<String> list = b;
                    if (list == null || list.size() <= 0) {
                        com.bytedance.feedbackerlib.a.P0("error_dumpcollect_url_null");
                    } else {
                        Iterator<String> it2 = b.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            c e0 = g.e0(it2.next(), arrayList, hashMap);
                            if (e0 != null) {
                                String str = new String(e0.b());
                                if (TextUtils.isEmpty(str)) {
                                    com.bytedance.memory.b.c.b("MemoryNetApi uploadFile succeed", new Object[0]);
                                    com.bytedance.memory.heap.a.e().c();
                                    com.bytedance.feedbackerlib.a.P0("upload_dump_success");
                                    com.bytedance.memory.g.a.f().g(false);
                                    break;
                                }
                                com.bytedance.memory.b.c.b("MemoryNetApi uploadFile failed,message:" + str, new Object[0]);
                            } else {
                                com.bytedance.memory.b.c.b("MemoryNetApi uploadFile failed, response is null", new Object[0]);
                            }
                        }
                        if (!z) {
                            com.bytedance.feedbackerlib.a.P0("error_uploadfile_failed");
                        }
                    }
                } catch (Throwable th) {
                    com.bytedance.apm.y.a.a("MemoryNetApi", th.toString());
                    com.bytedance.services.apm.api.a.d(th);
                    com.bytedance.feedbackerlib.a.P0("error_uploadfile_exception");
                }
                f5381f = false;
            }
        }
    }
}
