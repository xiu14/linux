package com.bytedance.crash.Z;

import android.app.ApplicationExitInfo;
import com.bytedance.services.apm.api.IApmAgent;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.vivo.push.PushClient;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private static boolean a = false;
    private static List<ApplicationExitInfo> b = new ArrayList();

    static void a() {
        String[] list;
        File file = new File(g.f4546f, "exit_info");
        if (file.exists() && (list = file.list()) != null) {
            if (list.length > 50) {
                Arrays.sort(list);
                for (int i = 50; i < list.length; i++) {
                    com.bytedance.crash.util.a.b(new File(file, list[i]));
                }
            }
        }
    }

    static List<ApplicationExitInfo> b() {
        List<ApplicationExitInfo> b2;
        if (a) {
            return b;
        }
        a = true;
        if (!c.a()) {
            return null;
        }
        try {
            b2 = c.b();
        } finally {
            try {
                a();
                return b;
            } finally {
            }
        }
        if (b2 == null) {
            return null;
        }
        File file = new File(g.f4546f, "lastReasonTime");
        long j = -1;
        if (file.exists()) {
            try {
                j = Long.decode(com.bytedance.crash.util.a.p(file)).longValue();
            } catch (Throwable unused) {
            }
        }
        for (ApplicationExitInfo applicationExitInfo : b2) {
            if (applicationExitInfo.getTimestamp() < j) {
                break;
            }
            b.add(applicationExitInfo);
            g.d(applicationExitInfo);
        }
        if (b.size() == 0) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                IApmAgent iApmAgent = (IApmAgent) com.bytedance.news.common.service.manager.c.a(IApmAgent.class);
                if (iApmAgent != null) {
                    jSONObject.put("reason", PushClient.DEFAULT_REQUEST_ID);
                    jSONObject2.put(CrashHianalyticsData.TIME, j);
                    iApmAgent.monitorEvent("app_exit", jSONObject, null, null);
                }
            } catch (Throwable unused2) {
            }
        }
        g.c(b);
        try {
            com.bytedance.crash.util.a.x(new File(g.f4546f, "lastReasonTime"), String.valueOf(System.currentTimeMillis()), false);
        } catch (Throwable unused3) {
        }
        a();
        return b;
    }
}
