package com.bytedance.push.monitor;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class k {
    private static WeakHandler.IHandler a = new a();
    private static Handler b = new WeakHandler(Looper.getMainLooper(), a);

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, Boolean> f5742c = new ConcurrentHashMap(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5743d = 0;

    static class a implements WeakHandler.IHandler {
        a() {
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public void handleMsg(Message message) {
            if (message != null && message.what == 1001) {
                String s = e.a.a.a.a.s(com.bytedance.push.third.g.o(com.ss.android.message.a.a()).f(((Integer) message.obj).intValue()), " register timeout");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 108);
                    jSONObject.put("pushType", message.obj);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                com.bytedance.push.g0.f.e("Monitor", "Push Sender Monitor:" + s);
                i.b("push_monitor_register_result", jSONObject, null, null);
            }
        }
    }

    static void a(int i) {
        Map<Integer, Boolean> map = f5742c;
        synchronized (map) {
            if (map.get(Integer.valueOf(i)) != null) {
                return;
            }
            map.put(Integer.valueOf(i), Boolean.TRUE);
            b.sendMessageDelayed(b.obtainMessage(1001, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1L));
        }
    }

    static void b(int i, int i2, String str, String str2) {
        Map<Integer, Boolean> map = f5742c;
        synchronized (map) {
            Boolean bool = map.get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue()) {
                map.put(Integer.valueOf(i), Boolean.FALSE);
                b.removeMessages(1001, Integer.valueOf(i));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("pushType", i);
                    jSONObject.put("status", i2);
                    jSONObject.put("3rd_code", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("msg", str2);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                com.bytedance.push.g0.f.e("Monitor", com.bytedance.push.third.g.o(com.ss.android.message.a.a()).f(i) + " register failed，reason: " + str2);
                i.b("push_monitor_register_result", jSONObject, null, jSONObject2);
            }
        }
    }

    static void c(int i) {
        Map<Integer, Boolean> map = f5742c;
        synchronized (map) {
            Boolean bool = map.get(Integer.valueOf(i));
            if (bool != null && bool.booleanValue()) {
                map.put(Integer.valueOf(i), Boolean.FALSE);
                b.removeMessages(1001, Integer.valueOf(i));
                com.bytedance.push.third.g.o(com.ss.android.message.a.a()).f(i);
                com.bytedance.push.g0.f.g("Monitor", "Push Sender Monitor: " + i + " register success");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", 0);
                    jSONObject.put("pushType", i);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                i.b("push_monitor_register_result", jSONObject, null, null);
            }
        }
    }

    static void d(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        String str2 = i != 301 ? i != 302 ? i != 304 ? "" : "Server return empty response" : "Server return not success" : "network error";
        f(i, jSONObject);
        com.bytedance.push.g0.f.e("Monitor", "Push switcher monitor：upload error，reason: " + str2);
    }

    static void e() {
        com.bytedance.push.g0.f.g("Monitor", "Push switcher monitor：the out-app switcher upload success");
        f(0, null);
    }

    private static void f(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        i.b("outer_switch_upload_result", jSONObject2, null, jSONObject);
    }
}
