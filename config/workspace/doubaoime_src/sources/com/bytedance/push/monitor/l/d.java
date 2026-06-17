package com.bytedance.push.monitor.l;

import android.app.Application;
import android.os.Handler;
import android.os.Message;
import com.bytedance.push.g0.f;
import com.bytedance.push.monitor.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d implements Handler.Callback {
    private static volatile d a;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f5751c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f5752d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Application f5753e;

        a(d dVar, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Application application) {
            this.a = str;
            this.b = jSONObject;
            this.f5751c = jSONObject2;
            this.f5752d = jSONObject3;
            this.f5753e = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b bVar = new b(this.a, this.b, this.f5751c, this.f5752d);
                f.c("PushMultiProcessMonitor", String.format("on child process monitor event,insert to db:%s", bVar));
                c d2 = c.d(this.f5753e);
                if (d2 != null) {
                    long e2 = d2.e(bVar);
                    if (e2 < 0) {
                        f.m("PushMultiProcessMonitor", String.format("failed to insert event to monitor db, insert result:%s", Long.valueOf(e2)));
                    } else {
                        f.c("PushMultiProcessMonitor", String.format("success to insert event to monitor db, insert result:%s", Long.valueOf(e2)));
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private d() {
    }

    public static d a() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    public void b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        Application a2 = com.ss.android.message.a.a();
        if (!com.ss.android.message.f.a.t(a2)) {
            com.bytedance.common.utility.h.c.b(new a(this, str, jSONObject, jSONObject2, jSONObject3, a2));
            return;
        }
        f.c("PushMultiProcessMonitor", "on main process monitor event,report now:" + str);
        i.b(str, jSONObject, jSONObject2, jSONObject3);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 4171758) {
            return false;
        }
        com.bytedance.common.utility.h.c.b(new e(this));
        return true;
    }
}
