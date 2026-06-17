package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.push.fv;
import com.xiaomi.push.fw;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class be {
    private final ConcurrentHashMap<String, c> a = new ConcurrentHashMap<>();

    public static class a extends XMPushService.j {
        public a() {
            super(17);
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        public String a() {
            return "RecordTimeManager clear";
        }

        @Override // com.xiaomi.push.service.XMPushService.j
        /* renamed from: a */
        public void mo403a() {
            be.a().m779a();
        }
    }

    private static class b {
        private static final be a = new be();
    }

    private static class c {
        long a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        long f9335c;

        /* renamed from: d, reason: collision with root package name */
        long f9336d;

        /* renamed from: e, reason: collision with root package name */
        long f9337e;

        private c() {
        }

        public long a() {
            long j = this.f9335c;
            long j2 = this.b;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }

        public long b() {
            long j = this.f9336d;
            long j2 = this.f9335c;
            if (j > j2) {
                return j - j2;
            }
            return 0L;
        }
    }

    public static be a() {
        return b.a;
    }

    public void b(String str, long j) {
        c remove = this.a.remove(str);
        if (remove != null) {
            remove.f9336d = j;
            a(str, remove);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m779a() {
        if (this.a.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, c>> it2 = this.a.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, c> next = it2.next();
            if (next == null || next.getValue() == null) {
                it2.remove();
            } else {
                c value = next.getValue();
                if (Math.abs(SystemClock.elapsedRealtime() - value.b) > com.heytap.mcssdk.constant.a.q) {
                    a(next.getKey(), value);
                    it2.remove();
                }
            }
        }
    }

    public void a(String str, long j, long j2, long j3) {
        c cVar = new c();
        cVar.a = j2;
        cVar.b = j;
        cVar.f9337e = j3;
        this.a.put(str, cVar);
    }

    public void a(String str, long j) {
        c cVar = this.a.get(str);
        if (cVar != null) {
            cVar.f9335c = j;
        }
    }

    private void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("xmsfVC", Long.valueOf(cVar.a));
        hashMap.put("packetId", str);
        hashMap.put("pTime", Long.valueOf(cVar.a()));
        hashMap.put("bTime", Long.valueOf(cVar.b()));
        hashMap.put("push_bundle_vc", Long.valueOf(cVar.f9337e));
        fw.a().a(new fv("msg_process_time", hashMap));
    }
}
