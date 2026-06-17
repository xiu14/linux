package com.bytedance.push.monitor.l;

import com.bytedance.push.g0.f;
import com.bytedance.push.monitor.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class e implements Runnable {
    e(d dVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        f.c("PushMultiProcessMonitor", "reportEvent now");
        c d2 = c.d(com.ss.android.message.a.a());
        List<b> c2 = d2.c(10);
        StringBuilder M = e.a.a.a.a.M("events len is :");
        M.append(((ArrayList) c2).size());
        f.c("PushMultiProcessMonitor", M.toString());
        while (!c2.isEmpty()) {
            Iterator<b> it2 = c2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    b next = it2.next();
                    e.a.a.a.a.J0(e.a.a.a.a.M("report:"), next.b, "PushMultiProcessMonitor");
                    String str = next.b;
                    JSONObject jSONObject3 = null;
                    try {
                        jSONObject = new JSONObject(next.f5744c);
                    } catch (Throwable unused) {
                        jSONObject = null;
                    }
                    try {
                        jSONObject2 = new JSONObject(next.f5745d);
                    } catch (Throwable unused2) {
                        jSONObject2 = null;
                    }
                    try {
                        jSONObject3 = new JSONObject(next.f5746e);
                    } catch (Throwable unused3) {
                    }
                    i.b(str, jSONObject, jSONObject2, jSONObject3);
                    if (!d2.b(next.a)) {
                        f.m("PushMultiProcessMonitor", "error when delete monitor event,break now");
                        break;
                    }
                }
            }
            c2 = d2.c(10);
        }
        com.ss.android.message.e.e().b().sendEmptyMessageDelayed(4171758, com.bytedance.common.push.b.e().j() ? 600000L : com.heytap.mcssdk.constant.a.f6886d);
    }
}
