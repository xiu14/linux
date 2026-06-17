package com.bytedance.applog.monitor.v3.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.applog.monitor.v3.StatsCountKeys;
import com.bytedance.applog.monitor.v3.f;
import com.bytedance.applog.w.k;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<java.lang.Integer>] */
/* loaded from: classes.dex */
public class c implements Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private static final List<String> f3845f = Collections.singletonList("StatsMonitor");
    private Handler b;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f3847d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.applog.monitor.v3.a f3848e;
    private boolean a = true;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Integer> f3846c = new ConcurrentHashMap();

    static class a {
        private final StatsCountKeys a;
        private final int b;

        public a(StatsCountKeys statsCountKeys, int i) {
            this.a = statsCountKeys;
            this.b = i;
        }
    }

    public c(com.bytedance.applog.monitor.v3.a aVar) {
        this.f3848e = aVar;
    }

    private void d(a aVar) {
        synchronized (this.f3846c) {
            Integer num = this.f3846c.get(aVar.a.name());
            this.f3846c.put(aVar.a.name(), Integer.valueOf((num != null ? num.intValue() : 0) + aVar.b));
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeMessages(8);
            this.b.sendEmptyMessageDelayed(8, 500L);
        }
    }

    public void a(Map<String, Integer> map, JSONArray jSONArray) {
        if (map.isEmpty()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "sdk_stats");
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                Integer value = entry.getValue();
                if (value != null && value.intValue() > 0) {
                    jSONObject2.put(entry.getKey(), value);
                }
            }
            jSONObject.put(com.heytap.mcssdk.constant.b.D, jSONObject2);
            jSONObject.put("local_time_ms", System.currentTimeMillis());
            jSONObject.put("event_id", f.b());
            jSONObject.put("datetime", f.a());
        } catch (Throwable th) {
            k.z().q(8, f3845f, "appendMapToJSONArray failed", th, new Object[0]);
        }
        jSONArray.put(jSONObject);
    }

    @Nullable
    public Pair<Map<String, Integer>, Long> b(long j) {
        return this.f3846c.isEmpty() ? new Pair<>(null, Long.valueOf(j)) : new Pair<>(new HashMap(this.f3846c), Long.valueOf(j - (this.f3846c.size() * 30)));
    }

    public void c(StatsCountKeys statsCountKeys, int i) {
        if (this.a) {
            a aVar = new a(statsCountKeys, i);
            Handler handler = this.b;
            if (handler != null) {
                handler.sendMessageDelayed(handler.obtainMessage(16, aVar), 16L);
            } else {
                d(aVar);
            }
        }
    }

    public void e(Context context, HandlerThread handlerThread, String str) {
        this.f3847d = context.getSharedPreferences(str + "@applog_monitor_stats", 0);
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.b = handler;
        handler.removeMessages(8);
        this.b.sendEmptyMessageDelayed(8, 500L);
        this.b.sendEmptyMessageDelayed(24, Math.max(com.heytap.mcssdk.constant.a.q, this.f3848e.a() - com.heytap.mcssdk.constant.a.q) + new SecureRandom().nextInt(9000));
    }

    public void f() {
        this.a = false;
        this.f3846c.clear();
    }

    public void g(Map<String, Integer> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        synchronized (this.f3846c) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String key = entry.getKey();
                int intValue = entry.getValue() != null ? entry.getValue().intValue() : 0;
                Integer num = this.f3846c.get(key);
                if (num != null) {
                    int max = Math.max(0, num.intValue() - intValue);
                    if (max == 0) {
                        this.f3846c.remove(key);
                    } else {
                        this.f3846c.put(key, Integer.valueOf(max));
                    }
                }
            }
        }
        this.b.removeMessages(8);
        this.b.sendEmptyMessageDelayed(8, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        SharedPreferences sharedPreferences;
        int i = message.what;
        if (i == 8) {
            SharedPreferences.Editor edit = this.f3847d.edit();
            edit.clear();
            synchronized (this.f3846c) {
                for (Map.Entry<String, Integer> entry : this.f3846c.entrySet()) {
                    edit.putInt(entry.getKey(), entry.getValue() != null ? entry.getValue().intValue() : 0);
                }
            }
            edit.putLong("uptime", System.currentTimeMillis());
            edit.apply();
        } else if (i == 16) {
            d((a) message.obj);
        } else if (i == 24 && (sharedPreferences = this.f3847d) != null) {
            long j = sharedPreferences.getLong("uptime", 0L);
            if (j <= 0 || System.currentTimeMillis() - j <= TimeUnit.DAYS.toMillis(this.f3848e.b())) {
                Map<String, ?> all = this.f3847d.getAll();
                if (!all.isEmpty()) {
                    synchronized (this.f3846c) {
                        for (Map.Entry<String, ?> entry2 : all.entrySet()) {
                            String key = entry2.getKey();
                            if (!TextUtils.isEmpty(key) && !"uptime".equals(entry2.getKey())) {
                                int intValue = entry2.getValue() != null ? ((Integer) entry2.getValue()).intValue() : 0;
                                Integer num = this.f3846c.get(key);
                                if (num == null) {
                                    this.f3846c.put(key, Integer.valueOf(intValue));
                                } else {
                                    this.f3846c.put(key, Integer.valueOf(intValue + num.intValue()));
                                }
                            }
                        }
                    }
                    Handler handler = this.b;
                    if (handler != null) {
                        handler.removeMessages(8);
                        this.b.sendEmptyMessageDelayed(8, 500L);
                    }
                }
            } else {
                this.f3847d.edit().clear().apply();
            }
        }
        return false;
    }
}
