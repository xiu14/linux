package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class ep {
    private final SharedPreferences a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicLong f382a = new AtomicLong();
    private final AtomicLong b = new AtomicLong();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f9077c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f9078d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicLong f9079e = new AtomicLong();

    private static class a {
        private static final ep a = new ep();
    }

    public ep() {
        Context m841a = t.m841a();
        if (m841a == null) {
            this.a = null;
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] context is null when daily stat init");
        } else if (ev.a().m371a()) {
            this.a = m841a.getSharedPreferences("mipush_mdka_daily_data", 0);
        } else {
            this.a = null;
        }
    }

    private long a(long j, long j2) {
        if (j <= 0 || j2 <= j) {
            return 0L;
        }
        return j2 - j;
    }

    private void o() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        synchronized (sharedPreferences) {
            long c2 = ac.c();
            long j = this.a.getLong("RECORD_DATE", c2);
            if (j == c2) {
                return;
            }
            long j2 = this.a.getLong("RECORD_UTC", 0L);
            long j3 = this.a.getLong("RECORD_ELAPSED_REALTIME", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = currentTimeMillis > j2 && Math.abs((SystemClock.elapsedRealtime() - j3) - (currentTimeMillis - j2)) < com.heytap.mcssdk.constant.a.r;
            long j4 = this.a.getLong("MOBILE_NETWORK_TIME", 0L);
            long j5 = this.a.getLong("SOCKET_CONNECTION_TIME", 0L);
            long j6 = this.a.getLong("MOBILE_SOCKET_CONNECTION_TIME", 0L);
            long j7 = this.a.getLong("PENDING_MODEM_KEEP_ALIVE_TIME", 0L);
            boolean z2 = z;
            long j8 = this.a.getLong("MODEM_KEEP_ALIVE_TIME", 0L);
            long j9 = this.a.getLong("MODEM_KEEP_ALIVE_INTERVAL_COUNT", 0L);
            long b = ac.b();
            if (b > 0) {
                long a2 = a(this.f382a.get(), b);
                if (a2 > 0) {
                    j4 += a2;
                    this.f382a.set(b);
                }
                long a3 = a(this.b.get(), b);
                if (a3 > 0) {
                    j5 += a3;
                    this.b.set(b);
                }
                long a4 = a(this.f9077c.get(), b);
                if (a4 > 0) {
                    j6 += a4;
                    this.f9077c.set(b);
                }
                long a5 = a(this.f9078d.get(), b);
                if (a5 > 0) {
                    j7 += a5;
                    this.f9078d.set(b);
                }
                long a6 = a(this.f9079e.get(), b);
                if (a6 > 0) {
                    j8 += a6;
                    this.f9079e.set(b);
                    long c3 = (a6 - com.heytap.mcssdk.constant.a.f6886d) / ew.c();
                    if (c3 > 0) {
                        j9 += c3;
                    }
                }
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f382a.get() > 0) {
                    this.f382a.set(elapsedRealtime);
                }
                if (this.b.get() > 0) {
                    this.b.set(elapsedRealtime);
                }
                if (this.f9077c.get() > 0) {
                    this.f9077c.set(elapsedRealtime);
                }
                if (this.f9078d.get() > 0) {
                    this.f9078d.set(elapsedRealtime);
                }
                if (this.f9079e.get() > 0) {
                    this.f9079e.set(elapsedRealtime);
                }
            }
            StringBuilder sb = new StringBuilder();
            Map<String, ?> all = this.a.getAll();
            if (all != null && !all.isEmpty()) {
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && key.startsWith("STATE_SWITCH|") && value != null) {
                        String replace = (key + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + value).replace("STATE_SWITCH|", "");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(replace);
                        sb2.append(";");
                        sb.append(sb2.toString());
                    }
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("mobileDuration", Long.valueOf(j4));
            hashMap.put("socketDuration", Long.valueOf(j5));
            hashMap.put("mobileSocketDuration", Long.valueOf(j6));
            hashMap.put("pendingKADuration", Long.valueOf(j7));
            hashMap.put("KADuration", Long.valueOf(j8));
            hashMap.put("KAIntervalCount", Long.valueOf(j9));
            hashMap.put("socketDisCount", Long.valueOf(this.a.getLong("SOCKET_DISCONNECTION_COUNT", 0L)));
            hashMap.put("mobileSocketDisCount", Long.valueOf(this.a.getLong("MOBILE_SOCKET_DISCONNECTION_COUNT", 0L)));
            hashMap.put("mobileKASocketDisCount", Long.valueOf(this.a.getLong("MOBILE_KA_SOCKET_DISCONNECTION_COUNT", 0L)));
            hashMap.put("monitorSuccessCount", Long.valueOf(this.a.getLong("START_TCP_MONITOR_SUCCESS", 0L)));
            hashMap.put("monitorFailedCount", Long.valueOf(this.a.getLong("START_TCP_MONITOR_FAILED", 0L)));
            hashMap.put("KASuccessCount", Long.valueOf(this.a.getLong("START_TCP_KEEP_ALIVE_SUCCESS", 0L)));
            hashMap.put("KAFailedCount", Long.valueOf(this.a.getLong("START_TCP_KEEP_ALIVE_FAILED", 0L)));
            hashMap.put("CBSuccessCount", Long.valueOf(this.a.getLong("MODEM_CALLBACK_SUCCESS", 0L)));
            hashMap.put("CBNetworkDownErrorCount", Long.valueOf(this.a.getLong("MODEM_CALLBACK_NETWORK_DOWN_ERROR", 0L)));
            hashMap.put("CBResultFailCount", Long.valueOf(this.a.getLong("MODEM_CALLBACK_RESULT_FAIL", 0L)));
            hashMap.put("CBResultErrorCount", Long.valueOf(this.a.getLong("MODEM_CALLBACK_RESULT_ERROR", 0L)));
            hashMap.put("CBOtherCount", Long.valueOf(this.a.getLong("MODEM_CALLBACK_OTHER", 0L)));
            hashMap.put("stateSwitch", sb.toString());
            hashMap.put("statDate", Long.valueOf(j));
            hashMap.put("continuousTime", Integer.valueOf(z2 ? 1 : 0));
            hashMap.put("shutdownOccurred", Integer.valueOf(this.a.getBoolean("SHUTDOWN_OCCURRED", false) ? 1 : 0));
            es.a().a(hashMap);
            this.a.edit().clear().apply();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m355a() {
        a("SOCKET_CONNECTION_TIME", this.b, SystemClock.elapsedRealtime());
        if (ax.m116a()) {
            e();
            b();
        }
    }

    public void b() {
        a("MOBILE_SOCKET_CONNECTION_TIME", this.f9077c, SystemClock.elapsedRealtime());
    }

    public void c() {
        a("SOCKET_CONNECTION_TIME", this.b, 0L);
        a("MOBILE_SOCKET_CONNECTION_TIME", this.f9077c, 0L);
        a("SOCKET_DISCONNECTION_COUNT", 1L);
        if (ax.m116a()) {
            a("MOBILE_SOCKET_DISCONNECTION_COUNT", 1L);
        }
    }

    public void d() {
        a("MOBILE_KA_SOCKET_DISCONNECTION_COUNT", 1L);
    }

    public void e() {
        a("MOBILE_NETWORK_TIME", this.f382a, SystemClock.elapsedRealtime());
    }

    public void f() {
        a("MOBILE_NETWORK_TIME", this.f382a, 0L);
    }

    public void g() {
        a("PENDING_MODEM_KEEP_ALIVE_TIME", this.f9078d, SystemClock.elapsedRealtime());
    }

    public void h() {
        a("PENDING_MODEM_KEEP_ALIVE_TIME", this.f9078d, 0L);
    }

    public void i() {
        a("MODEM_KEEP_ALIVE_TIME", this.f9079e, SystemClock.elapsedRealtime());
    }

    public void j() {
        a("MODEM_KEEP_ALIVE_TIME", this.f9079e, 0L);
    }

    public void k() {
        a("START_TCP_MONITOR_SUCCESS", 1L);
    }

    public void l() {
        a("START_TCP_MONITOR_FAILED", 1L);
    }

    public void m() {
        a("START_TCP_KEEP_ALIVE_SUCCESS", 1L);
    }

    public void n() {
        a("START_TCP_KEEP_ALIVE_FAILED", 1L);
    }

    public void a(ay ayVar) {
        if (ax.e(ayVar)) {
            e();
        } else {
            f();
        }
    }

    public void a(String str) {
        if ("KEEP_ALIVE_RESULT_OK".equals(str)) {
            a("MODEM_CALLBACK_SUCCESS", 1L);
            return;
        }
        if ("KEEP_ALIVE_NETWORK_DOWN_ERROR".equals(str)) {
            a("MODEM_CALLBACK_NETWORK_DOWN_ERROR", 1L);
            return;
        }
        if ("KEEP_ALIVE_RESULT_FAIL".equals(str)) {
            a("MODEM_CALLBACK_RESULT_FAIL", 1L);
        } else if ("KEEP_ALIVE_RESULT_ERROR".equals(str)) {
            a("MODEM_CALLBACK_RESULT_ERROR", 1L);
        } else {
            a("MODEM_CALLBACK_OTHER", 1L);
        }
    }

    private void a(String str, AtomicLong atomicLong, long j) {
        if (this.a == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && atomicLong != null) {
            StringBuilder U = e.a.a.a.a.U("[stat] set start time. key:", str, " current:");
            U.append(atomicLong.get());
            U.append(" target:");
            U.append(j);
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", U.toString());
            try {
                o();
                if (atomicLong.get() > 0) {
                    long a2 = a(atomicLong.get(), SystemClock.elapsedRealtime());
                    if (a2 > 0) {
                        a(str, a2);
                        if (TextUtils.equals("MODEM_KEEP_ALIVE_TIME", str)) {
                            long c2 = (a2 - com.heytap.mcssdk.constant.a.f6886d) / ew.c();
                            if (c2 > 0) {
                                a("MODEM_KEEP_ALIVE_INTERVAL_COUNT", c2);
                            }
                        }
                    }
                }
                atomicLong.set(j);
                return;
            } catch (Throwable th) {
                e.a.a.a.a.w0("[stat]  exception occurred when set start time, exception: ", th, "HwKaMgr");
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] key|counter is null when set start time.");
    }

    public void a(ew ewVar, ew ewVar2, String str) {
        if (this.a == null) {
            return;
        }
        if (ewVar != null && ewVar2 != null && !TextUtils.isEmpty(str)) {
            StringBuilder M = e.a.a.a.a.M("STATE_SWITCH|");
            M.append(ewVar.mo373a());
            M.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            M.append(ewVar2.mo373a());
            M.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            M.append(str);
            a(M.toString(), 1L);
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] current|next|event is null when save state switch.");
    }

    public void a(String str, long j) {
        if (this.a == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && j > 0) {
            try {
                synchronized (this.a) {
                    o();
                    SharedPreferences.Editor edit = this.a.edit();
                    if (!this.a.contains("RECORD_DATE")) {
                        edit.putLong("RECORD_DATE", ac.c());
                        edit.putLong("RECORD_UTC", System.currentTimeMillis());
                        edit.putLong("RECORD_ELAPSED_REALTIME", SystemClock.elapsedRealtime());
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = this.a.getLong("LAST_SAVE_ELAPSED_REALTIME", 0L);
                    if (!this.a.contains("SHUTDOWN_OCCURRED") && j2 > elapsedRealtime) {
                        edit.putBoolean("SHUTDOWN_OCCURRED", true);
                    }
                    edit.putLong("LAST_SAVE_ELAPSED_REALTIME", elapsedRealtime);
                    edit.putLong(str, this.a.getLong(str, 0L) + j).apply();
                }
                return;
            } catch (Throwable th) {
                e.a.a.a.a.w0("[stat]  exception occurred when save event, exception: ", th, "HwKaMgr");
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stat] key is null or delta less than 0 when save event.");
    }

    public static ep a() {
        return a.a;
    }
}
