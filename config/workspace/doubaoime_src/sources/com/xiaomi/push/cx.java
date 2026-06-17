package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.wschannel.WsConstants;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class cx {
    private SharedPreferences a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicBoolean f211a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicInteger f212a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicLong f213a;

    private static class a {
        private static final cx a = new cx();
    }

    public void c(final Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "on alarm triggered context is null");
        } else {
            ba.b("ConnectStatMonitor", new Runnable() { // from class: com.xiaomi.push.cx.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        cx.this.d(context);
                        cx.this.a(context, System.currentTimeMillis());
                    } catch (Throwable th) {
                        StringBuilder M = e.a.a.a.a.M("on alarm triggered exception: ");
                        M.append(th.getMessage());
                        com.xiaomi.channel.commonutils.logger.c.c("ConnectStatMonitor", M.toString());
                    }
                }
            });
        }
    }

    public void d(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "check networkStatus context is null");
            return;
        }
        if (this.a == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "check networkStatus sp is null");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.a.getLong("last_report_time", 0L) >= 3600000) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_type", 3);
            hashMap.put(WsConstants.KEY_NETWORK_STATE, Integer.valueOf(a(context)));
            hashMap.put("hb_strategy", Integer.valueOf(this.a.getInt("heartbeat_strategy", b(context))));
            hashMap.put("ping_interval", Long.valueOf(m189a()));
            hashMap.put("event_time", Long.valueOf(currentTimeMillis));
            hashMap.put("connect_state", Integer.valueOf(a()));
            fw.a().a("connection_event", hashMap);
            this.a.edit().putLong("last_report_time", currentTimeMillis).apply();
        }
    }

    private cx() {
        this.f212a = new AtomicInteger(-1);
        this.f211a = new AtomicBoolean(true);
        this.f213a = new AtomicLong(0L);
        Context m841a = t.m841a();
        if (m841a != null) {
            this.a = m841a.getSharedPreferences("mipush_connect_stat", 0);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m196b(final Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "on network validated context is null");
        } else {
            ba.b("ConnectStatMonitor", new Runnable() { // from class: com.xiaomi.push.cx.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        cx.this.a(context, System.currentTimeMillis());
                    } catch (Throwable th) {
                        StringBuilder M = e.a.a.a.a.M("on network validated exception: ");
                        M.append(th.getMessage());
                        com.xiaomi.channel.commonutils.logger.c.c("ConnectStatMonitor", M.toString());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(final Context context, final long j, final int i, final int i2, final int i3) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("record disconnection context is null");
            return;
        }
        if (this.a == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "record disconnection sp is null");
            return;
        }
        long c2 = ac.c();
        long j2 = this.a.getLong("disconnect_current_date", 0L);
        if (j2 == 0 || (j2 > 0 && j2 != c2)) {
            this.a.edit().putLong("disconnect_current_date", c2).putInt("disconnect_count_today", 0).apply();
        }
        int i4 = this.a.getInt("disconnect_count_today", 0);
        int a2 = com.xiaomi.push.service.aq.a(context).a(hz.DisconnectStatMaxCount.a(), 200);
        if (i4 >= a2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("disconnection count > " + a2 + " in today, abandon.");
            return;
        }
        final long j3 = j - this.a.getLong("last_connect_time", j);
        this.a.edit().putLong("last_disconnect_time", j).putInt("disconnect_count_today", i4 + 1).putLong("last_report_time", j).apply();
        long min = Math.min(2000L, com.xiaomi.push.service.aq.a(context).a(hz.DisconnectNetworkLostDelay.a(), 500L));
        Runnable runnable = new Runnable() { // from class: com.xiaomi.push.cx.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event_type", 1);
                    int a3 = cx.this.a(context);
                    if (cx.this.f213a.get() > j) {
                        a3 = 0;
                    }
                    hashMap.put(WsConstants.KEY_NETWORK_STATE, Integer.valueOf(a3));
                    hashMap.put("hb_strategy", Integer.valueOf(cx.this.a.getInt("heartbeat_strategy", cx.this.b(context))));
                    hashMap.put("ping_interval", Long.valueOf(cx.this.m189a()));
                    hashMap.put("reason", Integer.valueOf(i));
                    hashMap.put("network_type", Integer.valueOf(i2));
                    hashMap.put("connected_network_type", Integer.valueOf(i3));
                    hashMap.put("event_time", Long.valueOf(j));
                    hashMap.put("online_duration", Long.valueOf(j3));
                    fw.a().a("connection_event", hashMap);
                } catch (Throwable th) {
                    StringBuilder M = e.a.a.a.a.M("upload disconnect exception:");
                    M.append(th.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.c("ConnectStatMonitor", M.toString());
                }
            }
        };
        if (a(context) == 1 && min > 0) {
            ba.a("ConnectStatMonitor", runnable, min, TimeUnit.MILLISECONDS);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static cx m191a() {
        return a.a;
    }

    public void a(final Context context, final long j, final int i, final int i2, final int i3) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "on disconnection context is null");
        } else {
            ba.b("ConnectStatMonitor", new Runnable() { // from class: com.xiaomi.push.cx.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        cx.this.f212a.set(0);
                        cx.this.b(context, j, i, i2, i3);
                        cx.this.a(context, j);
                    } catch (Throwable th) {
                        StringBuilder M = e.a.a.a.a.M("on disconnection exception: ");
                        M.append(th.getMessage());
                        com.xiaomi.channel.commonutils.logger.c.c("ConnectStatMonitor", M.toString());
                    }
                }
            });
        }
    }

    public void a(final Context context, final long j, final int i) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "on reconnection context is null");
        } else {
            ba.b("ConnectStatMonitor", new Runnable() { // from class: com.xiaomi.push.cx.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        cx.this.f212a.set(1);
                        cx.this.b(context, j, i);
                        cx.this.a(context, j);
                    } catch (Throwable th) {
                        StringBuilder M = e.a.a.a.a.M("on reconnection exception: ");
                        M.append(th.getMessage());
                        com.xiaomi.channel.commonutils.logger.c.c("ConnectStatMonitor", M.toString());
                    }
                }
            });
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m195a(final Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "on network lost context is null");
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.f213a.set(currentTimeMillis);
        ba.b("ConnectStatMonitor", new Runnable() { // from class: com.xiaomi.push.cx.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    cx.this.a(context, currentTimeMillis);
                } catch (Throwable th) {
                    StringBuilder M = e.a.a.a.a.M("on network lost exception: ");
                    M.append(th.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.c("ConnectStatMonitor", M.toString());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Context context) {
        return ax.b(context) ? 1 : 0;
    }

    private int a() {
        int i = this.f212a.get();
        return i == -1 ? com.xiaomi.push.service.ax.a().m771a("5") ? 1 : 0 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: collision with other method in class */
    public long m189a() {
        return fk.a();
    }

    private long a(long j) {
        return j - ((28800000 + j) % (b() * 3600000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "updateTimeStats context is null");
            return;
        }
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "updateTimeStats sp is null");
            return;
        }
        long j8 = sharedPreferences.getLong("stat_interval_start", 0L);
        long j9 = this.a.getLong("last_record_time", 0L);
        long j10 = this.a.getLong("stat_network_duration", 0L);
        long j11 = this.a.getLong("stat_connect_duration", 0L);
        int i = this.a.getInt("last_network_state", 0);
        int i2 = this.a.getInt("last_connect_state", 0);
        int a2 = a(context);
        int a3 = a();
        long a4 = a(j);
        long b = b(a4);
        if (j8 != 0 && b == j8) {
            if (i == 1) {
                j10 += j - j9;
            }
            this.a.edit().putLong("last_record_time", j).putLong("stat_network_duration", j10).putLong("stat_connect_duration", i2 == 1 ? (j - j9) + j11 : j11).putInt("last_network_state", a2).putInt("last_connect_state", a3).apply();
        }
        if (j8 > 0) {
            j2 = b;
            long b2 = b() * 3600000;
            long j12 = a4 - j9;
            int i3 = (int) (j12 / b2);
            if (i == 1) {
                j10 += j12 % b2;
                j5 = j - a4;
            } else {
                j5 = 0;
            }
            if (i2 == 1) {
                j7 = j11 + (j12 % b2);
                j6 = j - a4;
            } else {
                j6 = 0;
                j7 = j11;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_type", 4);
            hashMap.put("interval_hour", Integer.valueOf(b()));
            hashMap.put("start_time", Long.valueOf(j8));
            hashMap.put("stat_network_duration", Long.valueOf(j10));
            hashMap.put("stat_connect_duration", Long.valueOf(j7));
            hashMap.put("xmsf_restart_flag", Boolean.valueOf(this.f211a.getAndSet(false)));
            hashMap.put("cross_interval", Integer.valueOf(i3));
            hashMap.put("last_connect_state", Integer.valueOf(i2));
            hashMap.put("last_network_state", Integer.valueOf(i));
            fw.a().a("connection_event", hashMap);
            j4 = j6;
            j3 = j5;
        } else {
            j2 = b;
            j3 = 0;
            j4 = 0;
        }
        this.a.edit().putLong("stat_interval_start", j2).putLong("last_record_time", j).putLong("stat_network_duration", j3).putLong("stat_connect_duration", j4).putInt("last_network_state", a2).putInt("last_connect_state", a3).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(Context context, long j, int i) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("record reconnection context is null");
            return;
        }
        if (this.a == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("ConnectStatMonitor", "record reconnection sp is null");
            return;
        }
        long c2 = ac.c();
        long j2 = this.a.getLong("reconnect_current_date", 0L);
        if (j2 == 0 || (j2 > 0 && j2 != c2)) {
            this.a.edit().putLong("reconnect_current_date", c2).putInt("reconnect_count_today", 0).apply();
        }
        int i2 = this.a.getInt("reconnect_count_today", 0);
        int a2 = com.xiaomi.push.service.aq.a(context).a(hz.DisconnectStatMaxCount.a(), 200);
        if (i2 >= a2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("reconnection count > " + a2 + " in today, abandon.");
            return;
        }
        long j3 = this.a.getLong("last_disconnect_time", 0L);
        boolean z = j3 < this.a.getLong("last_connect_time", 0L);
        int b = b(context);
        this.a.edit().putLong("last_connect_time", j).putInt("reconnect_count_today", i2 + 1).putLong("last_report_time", j).putInt("heartbeat_strategy", b).apply();
        long j4 = j3 > 0 ? j - j3 : 0L;
        HashMap hashMap = new HashMap();
        hashMap.put("event_type", 2);
        hashMap.put(WsConstants.KEY_NETWORK_STATE, Integer.valueOf(a(context)));
        hashMap.put("hb_strategy", Integer.valueOf(b));
        hashMap.put("ping_interval", Long.valueOf(m189a()));
        hashMap.put("network_type", Integer.valueOf(i));
        hashMap.put("offline_duration", Long.valueOf(j4));
        hashMap.put("lost_disconnect_flag", Boolean.valueOf(z));
        hashMap.put("event_time", Long.valueOf(j));
        long j5 = this.f213a.get();
        if (j5 > j3) {
            hashMap.put("network_lost_delay", Long.valueOf(j5 - j3));
        }
        fw.a().a("connection_event", hashMap);
    }

    private int b() {
        int a2 = com.xiaomi.push.service.aq.a(t.m841a()).a(hz.ConnectDurationStatInterval.a(), 24);
        if (a2 <= 0) {
            return 24;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b(Context context) {
        if (context == null) {
            return -1;
        }
        return com.xiaomi.push.service.p.a(context).m813a();
    }

    private long b(long j) {
        LocalDateTime ofInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
        return (ofInstant.getDayOfMonth() * 100) + (ofInstant.getMonthValue() * com.heytap.mcssdk.constant.a.q) + (ofInstant.getYear() * 1000000) + ofInstant.getHour();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m194a() {
        this.f211a.set(true);
    }
}
