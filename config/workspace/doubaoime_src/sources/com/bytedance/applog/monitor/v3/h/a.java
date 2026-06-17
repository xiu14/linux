package com.bytedance.applog.monitor.v3.h;

import android.text.TextUtils;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.bytedance.applog.monitor.v3.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<org.json.JSONObject>] */
/* loaded from: classes.dex */
public class a {
    private final List<C0148a> a = new CopyOnWriteArrayList();
    private int b = 10000;

    public a(com.bytedance.applog.monitor.v3.a aVar) {
    }

    public Pair<Map<String, JSONObject>, Long> a(long j) {
        if (this.b <= 0) {
            return new Pair<>(null, Long.valueOf(j));
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        for (C0148a c0148a : this.a) {
            int i2 = i + 1;
            hashMap.put(String.valueOf(i), c0148a.b());
            this.a.remove(c0148a);
            j -= c0148a.a();
            if (j <= 0) {
                break;
            }
            i = i2;
        }
        return new Pair<>(hashMap, Long.valueOf(j));
    }

    public void b() {
        this.b = 0;
    }

    public void c(String str, Throwable th) {
        if (com.bytedance.android.input.k.b.a.A0(this.b, 10000)) {
            if (th != null) {
                List<C0148a> list = this.a;
                String canonicalName = th.getClass().getCanonicalName();
                StringBuilder sb = new StringBuilder();
                while (th != null) {
                    sb.append(th.toString());
                    for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                        sb.append("\n\tat ");
                        sb.append(stackTraceElement);
                    }
                    th = th.getCause();
                }
                list.add(new C0148a(str, canonicalName, sb.toString().replaceAll("[\\s|\\n]", "").substring(0, 200)));
            } else {
                this.a.add(new C0148a(str));
            }
            if (this.a.size() > 100) {
                this.a.remove(0);
            }
        }
    }

    /* renamed from: com.bytedance.applog.monitor.v3.h.a$a, reason: collision with other inner class name */
    private static class C0148a {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f3838c;

        public C0148a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.f3838c = str3;
        }

        public long a() {
            int length;
            if (TextUtils.isEmpty(this.b)) {
                length = this.a.length() + 43;
            } else {
                length = this.f3838c.length() + this.b.length() + this.a.length() + 65;
            }
            return length;
        }

        public JSONObject b() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, "sdk_fatal");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("message", this.a);
                if (!TextUtils.isEmpty(this.b)) {
                    jSONObject2.put("class", this.b);
                    jSONObject2.put("stack", this.f3838c);
                }
                jSONObject.put(com.heytap.mcssdk.constant.b.D, jSONObject2);
                jSONObject.put("local_time_ms", System.currentTimeMillis());
                jSONObject.put("event_id", f.b());
                jSONObject.put("datetime", f.a());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            return jSONObject;
        }

        public C0148a(String str) {
            this.a = str;
        }
    }
}
