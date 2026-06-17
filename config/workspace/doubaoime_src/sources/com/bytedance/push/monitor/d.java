package com.bytedance.push.monitor;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.C0679c;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class d {
    private static Handler b;

    /* renamed from: d, reason: collision with root package name */
    private static long f5735d;
    private static final WeakHandler.IHandler a = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f5734c = new AtomicBoolean(false);

    static class a implements WeakHandler.IHandler {
        a() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
            if (message == null) {
                return;
            }
            e eVar = message.what == 2 ? new e() : null;
            if (eVar != null) {
                com.bytedance.common.push.d.b(eVar);
            }
        }
    }

    private static Handler c() {
        if (b == null) {
            b = new WeakHandler(Looper.getMainLooper(), a);
        }
        return b;
    }

    static void d() {
        if (com.ss.android.message.f.a.t(com.ss.android.message.a.a())) {
            f5735d = com.ss.android.message.f.a.f();
            c().sendEmptyMessageDelayed(2, C0679c.a().y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(int i, long j) {
        String str = i != 201 ? "init success" : "not invoke start() method/not invoke start() when 30s passed";
        if (i == 0) {
            com.bytedance.push.g0.f.g("Monitor", "Push init error:" + str);
        } else {
            com.bytedance.push.g0.f.e("Monitor", "Push init error:" + str);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        i.b("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
    }

    static void f() {
        if (f5734c.compareAndSet(false, true)) {
            if (c().hasMessages(2)) {
                c().removeMessages(2);
            }
            e(0, com.ss.android.message.f.a.f() - f5735d);
        }
    }
}
