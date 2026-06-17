package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class es {
    private SharedPreferences a;

    /* renamed from: a, reason: collision with other field name */
    private final a f383a;

    /* renamed from: a, reason: collision with other field name */
    private final CopyOnWriteArrayList<c> f384a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicLong f385a;

    private static class b {
        private static final es a = new es();
    }

    class c {
        long a = SystemClock.elapsedRealtime();

        /* renamed from: a, reason: collision with other field name */
        String f389a;
        String b;

        public c(String str, String str2) {
            this.f389a = str2;
            this.b = str;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("KaBadCaseRecord{time=");
            M.append(this.a);
            M.append(", event='");
            e.a.a.a.a.G0(M, this.f389a, '\'', ", stateName='");
            return e.a.a.a.a.H(M, this.b, '\'', '}');
        }
    }

    private void c(Map<String, Object> map) {
        eu a2 = eu.a();
        if (map == null || a2 == null) {
            return;
        }
        map.put("target_ip", a2.c());
        map.put("target_port", Integer.valueOf(a2.b()));
        map.put("source_ip", a2.m367b());
        map.put("source_port", Integer.valueOf(a2.m363a()));
    }

    private void f() {
        synchronized (this.f384a) {
            g();
            if (this.f384a.size() >= 3) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat]  hasFailTooMuch! records:" + this.f384a);
                this.f384a.clear();
                this.f385a.set(System.currentTimeMillis() + com.heytap.mcssdk.constant.a.f6888f);
                SharedPreferences sharedPreferences = this.a;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong("hwka_restriction_time", this.f385a.get()).apply();
                }
            }
        }
    }

    private void g() {
        synchronized (this.f384a) {
            Iterator<c> it2 = this.f384a.iterator();
            while (it2.hasNext()) {
                c next = it2.next();
                if (next == null) {
                    it2.remove();
                } else if (Math.abs(SystemClock.elapsedRealtime() - next.a) > com.heytap.mcssdk.constant.a.f6888f) {
                    it2.remove();
                }
            }
            while (this.f384a.size() > 3) {
                this.f384a.remove(0);
            }
        }
    }

    public void a(boolean z) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onKaMgrInit, support=" + z);
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "init");
        hashMap.put("state_str", z ? PushClient.DEFAULT_REQUEST_ID : "0");
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    public void b() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onMdKaTimeout");
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "fail_too_much");
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    public void d() {
        this.f383a.a();
    }

    public void e() {
        this.f383a.b();
    }

    private es() {
        this.f383a = new a();
        this.f384a = new CopyOnWriteArrayList<>();
        AtomicLong atomicLong = new AtomicLong(0L);
        this.f385a = atomicLong;
        Context m841a = t.m841a();
        if (m841a == null) {
            return;
        }
        SharedPreferences sharedPreferences = m841a.getSharedPreferences("mipush_extra", 0);
        this.a = sharedPreferences;
        atomicLong.set(sharedPreferences.getLong("hwka_restriction_time", 0L));
    }

    class a {

        /* renamed from: a, reason: collision with other field name */
        public AtomicInteger f386a = new AtomicInteger();
        public AtomicInteger b = new AtomicInteger();

        /* renamed from: a, reason: collision with other field name */
        public AtomicLong f387a = new AtomicLong();

        a() {
        }

        public void a() {
            if (this.f387a.get() <= 0) {
                this.f387a.set(SystemClock.elapsedRealtime());
            }
            this.f386a.incrementAndGet();
        }

        public void b() {
            if (this.f387a.get() <= 0) {
                this.f387a.set(SystemClock.elapsedRealtime());
            }
            this.b.incrementAndGet();
        }

        public void c() {
            this.f386a.set(0);
            this.b.set(0);
            this.f387a.set(0L);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("CachedKaStat{successCnt=");
            M.append(this.f386a);
            M.append(", failCnt=");
            M.append(this.b);
            M.append(", firstCacheTime=");
            M.append(this.f387a);
            M.append('}');
            return M.toString();
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m362a() {
            return (this.f386a.get() > 0 || this.b.get() > 0) && SystemClock.elapsedRealtime() - this.f387a.get() > 300000;
        }
    }

    private void b(Map<String, Object> map) {
        if (map != null) {
            map.put(WsConstants.KEY_NETWORK_STATE, Integer.valueOf(ax.a()));
            map.put("uuid", com.xiaomi.push.service.v.m833a(t.m841a()));
            Integer m370a = ev.a().m370a();
            if (m370a != null) {
                map.put("feature_version", m370a);
            }
            map.put("data_card_index", Integer.valueOf(ax.b()));
        }
    }

    public void c() {
        if (this.f383a.m362a()) {
            int i = this.f383a.f386a.get();
            int i2 = this.f383a.b.get();
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f383a.f387a.get()) / 1000;
            this.f383a.c();
            StringBuilder O = e.a.a.a.a.O("[stat] uploadKaStatData, sCnt=", i, ", fCnt=", i2, "durationInSec=");
            O.append(elapsedRealtime);
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", O.toString());
            a().a(i, i2, elapsedRealtime);
        }
    }

    public void a(String str, String str2) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onMdKaFail,result= " + str + " state=" + str2);
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "md_ka_fail");
        hashMap.put("state_str", str);
        hashMap.put("current_state", str2);
        c(hashMap);
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] recordBadCase, state=" + str + " action=" + str2);
        synchronized (this.f384a) {
            this.f384a.add(new c(str, str2));
        }
        f();
        if (m361a()) {
            er.a().e();
            a().b();
        }
    }

    public void a(String str, int i) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onMdKaCallError, event:" + str);
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "api_fail");
        hashMap.put("state_str", str);
        hashMap.put("api_result_code", Integer.valueOf(i));
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onDailyStat:" + map);
        map.put("type_str", "daily_stat");
        b(map);
        fw.a().a("hwka", map);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m360a() {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onMdKaTimeout");
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "md_ka_timeout");
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    public void a(int i, Exception exc, String str) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] onSocketDownWhileKA, error=" + i + ", exp=" + exc);
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "socket_down_while_ka");
        hashMap.put("error_code", Integer.valueOf(i));
        hashMap.put(PushMessageHelper.ERROR_MESSAGE, com.xiaomi.channel.commonutils.logger.c.a((Throwable) exc));
        hashMap.put(WsConstants.KEY_CONNECTION_STATE, str);
        c(hashMap);
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    public void a(int i, int i2, long j) {
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] uploadMdKaData, successCnt=" + i + ", failCnt=" + i2);
        HashMap hashMap = new HashMap();
        hashMap.put("type_str", "stat_sum");
        hashMap.put("duration", Long.valueOf(j));
        hashMap.put("success_cnt", Integer.valueOf(i));
        hashMap.put("fail_cnt", Integer.valueOf(i2));
        b(hashMap);
        fw.a().a("hwka", hashMap);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m361a() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis < this.f385a.get() && this.f385a.get() - currentTimeMillis < 86460000;
    }

    public static es a() {
        return b.a;
    }
}
