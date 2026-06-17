package com.bytedance.apm.t;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.z.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {
    private static volatile f b;
    private int a = 0;

    class a implements a.InterfaceC0131a {
        a(f fVar) {
        }

        @Override // com.bytedance.apm.z.a.InterfaceC0131a
        public Map<String, String> a() {
            HashMap hashMap = new HashMap();
            JSONObject c2 = com.bytedance.monitor.collector.j.h().c();
            Iterator<String> keys = c2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, c2.optString(next));
            }
            HashMap hashMap2 = new HashMap();
            String x = com.bytedance.apm.t.l.e.y().x(0L, SystemClock.uptimeMillis());
            if (TextUtils.isEmpty(x)) {
                hashMap2.put("with_evil_method", "false");
            } else {
                hashMap.put("evil_method", x);
                hashMap2.put("with_evil_method", "true");
            }
            com.bytedance.monitor.collector.j h = com.bytedance.monitor.collector.j.h();
            SystemClock.uptimeMillis();
            Objects.requireNonNull(h);
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            hashMap2.put("with_stack_trace", "false");
            hashMap2.put("with_apm_trace", String.valueOf(com.bytedance.apm.internal.g.c(2)));
            com.bytedance.apm.z.a.a(hashMap2);
            return hashMap;
        }
    }

    private f() {
    }

    public static f a() {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f();
                }
            }
        }
        return b;
    }

    public void b() {
        com.bytedance.apm.z.a.b(new a(this));
    }

    public void c(int i) {
        this.a = i != 11 ? i != 101 ? i != 1001 ? 1 : 0 : 3 : 2;
        com.bytedance.monitor.collector.j.h().o(this.a);
    }
}
