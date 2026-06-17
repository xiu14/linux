package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class dm {
    private static int a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f263a = true;

    private static int a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static SharedPreferences m249a(Context context) {
        return context.getSharedPreferences("sp_power_stats", 0);
    }

    public static void c(final Context context, final long j, final boolean z) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dm.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dm.i(context, j, z);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("PowerStatsSP onPong exception: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void g(Context context, long j, boolean z) {
        int i;
        synchronized (dm.class) {
            dj.a("recordSendMsg start");
            int a2 = a(z);
            SharedPreferences m249a = m249a(context);
            long j2 = m249a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m249a, j, a2);
            }
            if (a2 == 1) {
                i = m249a.getInt("on_up_count", 0) + 1;
                m249a.edit().putInt("on_up_count", i).apply();
            } else {
                i = m249a.getInt("off_up_count", 0) + 1;
                m249a.edit().putInt("off_up_count", i).apply();
            }
            a(context, j2, j, i, a2);
            dj.a("recordSendMsg complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void h(Context context, long j, boolean z) {
        int i;
        synchronized (dm.class) {
            dj.a("recordReceiveMsg start");
            int a2 = a(z);
            SharedPreferences m249a = m249a(context);
            long j2 = m249a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m249a, j, a2);
            }
            if (a2 == 1) {
                i = m249a.getInt("on_down_count", 0) + 1;
                m249a.edit().putInt("on_down_count", i).apply();
            } else {
                i = m249a.getInt("off_down_count", 0) + 1;
                m249a.edit().putInt("off_down_count", i).apply();
            }
            a(context, j2, j, i, a2);
            dj.a("recordReceiveMsg complete");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i(Context context, long j, boolean z) {
        int i;
        synchronized (dm.class) {
            dj.a("recordPong start");
            int a2 = a(z);
            SharedPreferences m249a = m249a(context);
            long j2 = m249a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m249a, j, a2);
            }
            if (a2 == 1) {
                i = m249a.getInt("on_pong_count", 0) + 1;
                m249a.edit().putInt("on_pong_count", i).apply();
            } else {
                i = m249a.getInt("off_pong_count", 0) + 1;
                m249a.edit().putInt("off_pong_count", i).apply();
            }
            a(context, j2, j, i, a2);
            dj.a("recordPong complete");
        }
    }

    public static void a(final Context context, final long j, final boolean z) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dm.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dm.g(context, j, z);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("PowerStatsSP onSendMsg exception: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }
        });
    }

    public static void b(final Context context, final long j, final boolean z) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dm.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dm.h(context, j, z);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("PowerStatsSP onReceiveMsg exception: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void c(Context context, long j, boolean z, int i) {
        int i2;
        synchronized (dm.class) {
            dj.a("recordPing start");
            int a2 = a(z);
            SharedPreferences m249a = m249a(context);
            long j2 = m249a.getLong("start_time", 0L);
            if (j2 <= 0) {
                a(context, m249a, j, a2);
            }
            if (a2 == 1) {
                i2 = m249a.getInt("on_ping_count", 0) + 1;
                m249a.edit().putInt("on_ping_count", i2).apply();
            } else {
                i2 = m249a.getInt("off_ping_count", 0) + 1;
                m249a.edit().putInt("off_ping_count", i2).apply();
            }
            String a3 = a(i);
            m249a.edit().putInt(a3, m249a.getInt(a3, 0) + 1).apply();
            a(context, j2, j, i2, a2);
            dj.a("recordPing complete");
        }
    }

    public static void a(final Context context, final long j, final boolean z, final int i) {
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.push.dm.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    dm.c(context, j, z, i);
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("PowerStatsSP onPing exception: ");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
            }
        });
    }

    private static void b(Context context, long j, int i) {
        dj.a("reset");
        m249a(context).edit().clear().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("push_bundle_vc", h.a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    private static void a(Context context, SharedPreferences sharedPreferences, long j, int i) {
        dj.a("recordInit");
        sharedPreferences.edit().putLong("start_time", j).putInt("current_screen_state", i).putLong("current_screen_state_start_time", j).putInt("xmsf_vc", a(context)).putInt("push_bundle_vc", h.a(context)).putInt("android_vc", Build.VERSION.SDK_INT).apply();
    }

    private static void a(Context context, long j, long j2, int i, int i2) {
        if (j > 0) {
            if (m251a(context) || i >= 1073741823 || j2 - j >= com.heytap.mcssdk.constant.a.f6888f) {
                m249a(context).edit().putLong("end_time", j2).apply();
                a(context, j2, i2);
            }
        }
    }

    private static void a(Context context, long j, int i) {
        dj.a("upload");
        new dl().a(context, m250a(context));
        b(context, j, i);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static dk m250a(Context context) {
        SharedPreferences m249a = m249a(context);
        dk dkVar = new dk();
        dkVar.a(m249a.getInt("off_up_count", 0));
        dkVar.b(m249a.getInt("off_down_count", 0));
        dkVar.c(m249a.getInt("off_ping_count", 0));
        dkVar.d(m249a.getInt("off_pong_count", 0));
        dkVar.a(m249a.getLong("off_duration", 0L));
        dkVar.e(m249a.getInt("on_up_count", 0));
        dkVar.f(m249a.getInt("on_down_count", 0));
        dkVar.g(m249a.getInt("on_ping_count", 0));
        dkVar.h(m249a.getInt("on_pong_count", 0));
        dkVar.b(m249a.getLong("on_duration", 0L));
        List<Integer> m815a = com.xiaomi.push.service.p.a(context).m815a();
        HashMap hashMap = new HashMap(m815a.size());
        Iterator<Integer> it2 = m815a.iterator();
        while (it2.hasNext()) {
            String a2 = a(it2.next().intValue());
            int i = m249a.getInt(a2, 0);
            if (i > 0) {
                hashMap.put(a2, Integer.valueOf(i));
            }
        }
        dkVar.a(hashMap);
        dkVar.c(m249a.getLong("start_time", 0L));
        dkVar.d(m249a.getLong("end_time", 0L));
        dkVar.i(m249a.getInt("xmsf_vc", 0));
        dkVar.j(m249a.getInt("android_vc", 0));
        dkVar.k(m249a.getInt("push_bundle_vc", 0));
        return dkVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m251a(Context context) {
        boolean z = false;
        if (f263a) {
            f263a = false;
            SharedPreferences m249a = m249a(context);
            int i = m249a.getInt("xmsf_vc", 0);
            int i2 = m249a.getInt("android_vc", 0);
            int i3 = m249a.getInt("push_bundle_vc", 0);
            if (i != a(context) || i2 != Build.VERSION.SDK_INT || i3 != h.a(context)) {
                z = true;
            }
        }
        dj.a(e.a.a.a.a.A("isVcChanged = ", z));
        return z;
    }

    private static int a(Context context) {
        if (a <= 0) {
            a = k.b(context);
        }
        return a;
    }

    private static String a(int i) {
        return i == -1 ? "ping_count_unknown" : e.a.a.a.a.j("ping_count_", i);
    }
}
