package com.bytedance.applog.monitor.v3.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.applog.monitor.v3.EventStage;
import com.bytedance.applog.monitor.v3.StageEventType;
import com.bytedance.applog.monitor.v3.f;
import com.bytedance.applog.monitor.v3.g;
import com.bytedance.applog.w.e;
import com.bytedance.applog.w.k;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.bytedance.applog.monitor.v3.h.b$a>] */
/* loaded from: classes.dex */
public class b implements Handler.Callback {
    private static final List<String> h = Collections.singletonList("SentryMonitor");

    /* renamed from: c, reason: collision with root package name */
    private Handler f3839c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f3840d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.applog.monitor.v3.a f3841e;
    public final Map<String, a> a = Collections.synchronizedMap(new LinkedHashMap());
    private boolean b = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3842f = true;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f3843g = new AtomicBoolean(false);

    public static class a {
        private g a;
        private EventStage b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3844c = false;

        public a(EventStage eventStage, @Nullable g gVar) {
            this.b = eventStage;
            this.a = gVar;
        }

        public static a g(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            String[] split = str2.split(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            if (split.length == 4) {
                return new a(EventStage.valueOf(split[0]), new g(split[1], str, Long.parseLong(split[2]), StageEventType.V3_EVENT));
            }
            if (split.length == 5) {
                return new a(EventStage.valueOf(split[0]), new g(split[1], str, Long.parseLong(split[2]), StageEventType.parse(split[3])));
            }
            return null;
        }

        public String h() {
            return this.b.name() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.a.a + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.a.f3836c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.a.f3837d.name();
        }

        public long i() {
            return this.a.b.length() + (this.a != null ? r0.a.length() : 0) + 10 + 13 + 2 + 16 + 13 + 10;
        }

        public JSONObject j() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("monitor_id", this.a.b);
                StageEventType stageEventType = this.a.f3837d;
                if (stageEventType != null) {
                    jSONObject.put("event_type", stageEventType.getLabel());
                }
                if (!TextUtils.isEmpty(this.a.a)) {
                    jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.a.a);
                }
                long j = this.a.f3836c;
                if (j > 0) {
                    jSONObject.put("local_time_ms", j);
                }
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public b(com.bytedance.applog.monitor.v3.a aVar) {
        this.f3841e = aVar;
    }

    private void a(a aVar) {
        e z = k.z();
        List<String> list = h;
        z.j(8, list, "start handle stage ({})", aVar);
        synchronized (this.a) {
            if (h(aVar.a.a)) {
                a aVar2 = this.a.get(aVar.a.b);
                if (aVar2 == null) {
                    this.a.put(aVar.a.b, aVar);
                } else {
                    if (aVar.b.ordinal() > aVar2.b.ordinal()) {
                        aVar2.b = aVar.b;
                        aVar2.f3844c = false;
                        k.z().j(8, list, "stage ({}) override for stage newly", aVar2);
                    }
                    if (TextUtils.isEmpty(aVar2.a.a) && !TextUtils.isEmpty(aVar.a.a)) {
                        aVar2.a = aVar.a;
                        aVar2.f3844c = false;
                        k.z().j(8, list, "stage ({}) override event, ts and type", aVar2);
                    }
                }
                Handler handler = this.f3839c;
                if (handler != null) {
                    handler.removeMessages(4);
                    this.f3839c.sendEmptyMessageDelayed(4, 500L);
                }
            }
        }
    }

    public void b(Map<String, a> map, JSONArray jSONArray) {
        if (map.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (a aVar : map.values()) {
            JSONArray jSONArray2 = (JSONArray) hashMap.get(aVar.b);
            if (jSONArray2 == null) {
                jSONArray2 = new JSONArray();
                hashMap.put(aVar.b, jSONArray2);
            }
            jSONArray2.put(aVar.j());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, "sdk_stage");
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject2.put(((EventStage) entry.getKey()).toString(), entry.getValue());
            }
            jSONObject.put(com.heytap.mcssdk.constant.b.D, jSONObject2);
            jSONObject.put("local_time_ms", System.currentTimeMillis());
            jSONObject.put("event_id", f.b());
            jSONObject.put("datetime", f.a());
        } catch (Throwable unused) {
        }
        jSONArray.put(jSONObject);
    }

    @Nullable
    public Pair<Map<String, a>, Long> c(long j) {
        if (this.a.isEmpty()) {
            return new Pair<>(null, Long.valueOf(j));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.a) {
            for (Map.Entry<String, a> entry : this.a.entrySet()) {
                a value = entry.getValue();
                linkedHashMap.put(entry.getKey(), value);
                j -= value.i();
                if (j < 0) {
                    break;
                }
            }
        }
        return new Pair<>(linkedHashMap, Long.valueOf(j));
    }

    public void d(Context context, HandlerThread handlerThread, String str) {
        e z = k.z();
        List<String> list = h;
        z.j(8, list, "init with prefix sp: {}.", str);
        if (!this.f3843g.compareAndSet(false, true)) {
            k.z().a(8, list, "init failed for already initialized with sp prefix:{}.", str);
            return;
        }
        if (!this.f3841e.l()) {
            k.z().j(8, list, "init but disabled!!!", new Object[0]);
            this.f3842f = false;
            this.a.clear();
            this.b = false;
            return;
        }
        this.f3842f = com.bytedance.android.input.k.b.a.A0(this.f3841e.f(), 10000);
        k.z().j(8, list, "sentry acceptAllEvents = {}", Boolean.valueOf(this.f3842f));
        this.f3840d = context.getSharedPreferences(str + "@applog_monitor_sentry", 0);
        if (!f() && !this.a.isEmpty()) {
            k.z().j(8, list, "start reset cache map...", new Object[0]);
            if (f() || !(this.f3841e.g() == null || this.f3841e.g().isEmpty())) {
                synchronized (this.a) {
                    for (Map.Entry<String, a> entry : this.a.entrySet()) {
                        if (!h(entry.getValue().a.a)) {
                            this.a.remove(entry.getKey());
                        }
                    }
                }
            } else {
                this.a.clear();
            }
        }
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f3839c = handler;
        handler.removeMessages(4);
        this.f3839c.sendEmptyMessageDelayed(4, 500L);
        this.f3839c.sendEmptyMessageDelayed(12, Math.max(com.heytap.mcssdk.constant.a.q, this.f3841e.a() - com.heytap.mcssdk.constant.a.q) + new SecureRandom().nextInt(9000));
    }

    public void e() {
        k.z().j(8, h, "init with disabled", new Object[0]);
        this.b = false;
        this.a.clear();
        this.f3843g.set(true);
    }

    public boolean f() {
        return this.f3842f || this.f3841e.i();
    }

    public boolean g(String str) {
        Integer num;
        if (f() || !this.f3843g.get()) {
            return true;
        }
        if (h(str) && (num = this.f3841e.g().get(str)) != null && num.intValue() > 0) {
            return com.bytedance.android.input.k.b.a.A0(num.intValue(), 10000);
        }
        return false;
    }

    public boolean h(String str) {
        if (f()) {
            return true;
        }
        if (this.f3841e.g() == null) {
            return false;
        }
        return this.f3841e.g().containsKey(str);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        a g2;
        int i = message.what;
        if (i == 4) {
            k.z().j(8, h, "start flush cache map (size={}) to sp...", Integer.valueOf(this.a.size()));
            SharedPreferences.Editor edit = this.f3840d.edit();
            synchronized (this.a) {
                Iterator<Map.Entry<String, a>> it2 = this.a.entrySet().iterator();
                while (it2.hasNext()) {
                    a value = it2.next().getValue();
                    if (!value.f3844c && h(value.a.a)) {
                        edit.putString(value.a.b, value.h());
                        value.f3844c = true;
                    }
                }
            }
            edit.putLong("uptime", System.currentTimeMillis());
            edit.apply();
        } else if (i == 8) {
            a((a) message.obj);
        } else if (i == 12 && this.f3840d != null) {
            k.z().j(8, h, "start load cache map from sp...", new Object[0]);
            long j = this.f3840d.getLong("uptime", 0L);
            if (j <= 0 || System.currentTimeMillis() - j <= TimeUnit.DAYS.toMillis(this.f3841e.b())) {
                Map<String, ?> all = this.f3840d.getAll();
                if (!all.isEmpty()) {
                    synchronized (this.a) {
                        for (Map.Entry<String, ?> entry : all.entrySet()) {
                            String key = entry.getKey();
                            if (!TextUtils.isEmpty(key) && !"uptime".equals(key) && (g2 = a.g(key, (String) entry.getValue())) != null) {
                                g2.f3844c = true;
                                this.a.put(g2.a.b, g2);
                            }
                        }
                    }
                }
            } else {
                this.f3840d.edit().clear().apply();
            }
        }
        return false;
    }

    public void i(Map<String, a> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        SharedPreferences sharedPreferences = this.f3840d;
        SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
        synchronized (this.a) {
            for (String str : map.keySet()) {
                this.a.remove(str);
                if (edit != null) {
                    edit.remove(str);
                }
            }
        }
        if (edit != null) {
            edit.apply();
        }
    }

    public void j(EventStage eventStage, @Nullable String str, String str2, long j, @Nullable StageEventType stageEventType) {
        if (!this.b || !this.f3841e.l()) {
            k.z().j(8, h, "stage nothing for disabled!!!", new Object[0]);
            return;
        }
        a aVar = new a(eventStage, new g(str, str2, j, stageEventType));
        if (this.f3839c == null || Looper.myLooper() != Looper.getMainLooper()) {
            a(aVar);
        } else {
            Handler handler = this.f3839c;
            handler.sendMessage(handler.obtainMessage(8, aVar));
        }
    }
}
