package com.bytedance.push.monitor;

import android.app.NotificationChannel;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.push.C;
import com.bytedance.push.C0679c;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f extends com.bytedance.common.push.c implements com.bytedance.push.interfaze.h {
    private volatile com.bytedance.push.monitor.m.a a;

    class a implements Runnable {
        final /* synthetic */ long a;

        a(f fVar, long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("time_cost", this.a);
                jSONObject2.put("os_detail_type", com.bytedance.push.g0.j.h() ? "harmony" : "android");
                jSONObject2.put("rom", com.bytedance.push.g0.j.c());
                jSONObject2.put("process", com.ss.android.message.f.a.j(C0679c.a().a));
                jSONObject2.put("opt_init_time_cost", !com.bytedance.common.g.a.c().e().e());
                String a = com.bytedance.push.g0.j.a();
                if (!TextUtils.isEmpty(a)) {
                    jSONObject2.put("extra_rom_version", a);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            i.b("push_init_event", jSONObject2, jSONObject, null);
        }
    }

    class b implements Runnable {
        final /* synthetic */ NotificationChannel a;
        final /* synthetic */ StackTraceElement[] b;

        b(NotificationChannel notificationChannel, StackTraceElement[] stackTraceElementArr) {
            this.a = notificationChannel;
            this.b = stackTraceElementArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(WsConstants.KEY_CHANNEL_ID, this.a.getId());
                jSONObject.put("channel_name", this.a.getName());
                jSONObject.put("importance", this.a.getImportance());
                JSONArray jSONArray = new JSONArray();
                int i = 0;
                for (StackTraceElement stackTraceElement : this.b) {
                    if (i < 5) {
                        i++;
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        f.this.add(jSONObject2, "class_name", stackTraceElement.getClassName());
                        f.this.add(jSONObject2, "file_name", stackTraceElement.getFileName());
                        f.this.add(jSONObject2, "method_name", stackTraceElement.getMethodName());
                        f.this.add(jSONObject2, "line_number", stackTraceElement.getLineNumber());
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put(CrashHianalyticsData.STACK_TRACE, jSONArray);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            ((C) C.a()).k().monitorEvent("create_notification_channel_event", jSONObject, null, null);
        }
    }

    public f() {
        Objects.requireNonNull(C0679c.a());
        i.c(C0679c.a().t);
        this.a = (com.bytedance.push.monitor.m.a) com.ss.android.ug.bus.b.a(com.bytedance.push.monitor.m.a.class);
    }

    private com.bytedance.push.monitor.m.a n() {
        if (this.a == null) {
            Objects.requireNonNull(C0679c.a());
        }
        return this.a;
    }

    @Override // com.bytedance.push.interfaze.h
    public void a(int i, int i2, String str, String str2) {
        k.b(i, i2, str, str2);
        if (n() != null) {
            n().c(false, i, i2, e.a.a.a.a.t(str, ", ", str2));
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void b(boolean z, String str) {
        int i = k.f5743d;
        if (z) {
            com.bytedance.push.g0.f.g("Monitor", "Push Sender Monitor: get sender success");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 107);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("sender", str);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        i.b("push_monitor_register_result", jSONObject, null, jSONObject2);
        com.bytedance.push.g0.f.e("Monitor", "Push Sender Monitor: This device does not support the sender/channel delivered by the server");
    }

    @Override // com.bytedance.push.interfaze.h
    public void c(int i, int i2, String str, String str2) {
        String str3;
        int i3 = k.f5743d;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        switch (i) {
            case 301:
                str3 = "network error";
                break;
            case 302:
                str3 = "server return error";
                break;
            case 303:
                str3 = "server return empty allow_push_list";
                break;
            case 304:
                str3 = "update_sender api return empty";
                break;
            default:
                str3 = "";
                break;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("code", i);
            jSONObject2.put("detailCode", i2);
            jSONObject2.put("msg", str3);
            jSONObject2.put("detailMsg", str);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        try {
            new JSONObject().put("extraMsg", TextUtils.isEmpty(str2) ? "null" : str2);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        i.b("push_monitor_update_sender", jSONObject2, null, jSONObject);
        com.bytedance.push.g0.f.e("Monitor", "Push Sender Monitor: update sender error, reason: " + str2);
        if (n() != null) {
            n().m(false, i, str2);
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void d(int i) {
        k.a(i);
        if (n() != null) {
            n().l(i);
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void e(int i, String str) {
        k.d(i, str);
    }

    @Override // com.bytedance.push.interfaze.h
    public void f(int i) {
        k.c(i);
        if (n() != null) {
            n().c(true, i, 0, null);
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void g() {
        int i = k.f5743d;
        com.bytedance.push.g0.f.g("Monitor", "Push Sender Monitor: update sender success");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", 0);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        i.b("push_monitor_update_sender", jSONObject, null, null);
        if (n() != null) {
            n().m(true, 0, null);
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void h(long j) {
        if (j <= 0 || !com.ss.android.message.f.a.t(C0679c.a().a)) {
            return;
        }
        com.ss.android.message.e.e().f(new a(this, j), 0L);
    }

    @Override // com.bytedance.push.interfaze.h
    public void i(String str, String str2) {
        int i = k.f5743d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventType", str);
            jSONObject.put("eventDesc", str2);
            i.b("push_monitor_common_event", jSONObject, null, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void init() {
        d.d();
        Objects.requireNonNull(C0679c.a());
        if (n() != null) {
            n().u();
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void j() {
        d.f();
    }

    @Override // com.bytedance.push.interfaze.h
    public void k(NotificationChannel notificationChannel) {
        com.ss.android.message.e.e().f(new b(notificationChannel, e.a.a.a.a.U0()), 0L);
    }

    @Override // com.bytedance.push.interfaze.h
    public void l(int i, int i2) {
        int i3 = k.f5743d;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i2);
            jSONObject.put("pushType", i);
            i.b("push_monitor_decrypt_result", jSONObject, null, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.interfaze.h
    public void m() {
        k.e();
    }
}
