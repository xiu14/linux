package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.gb;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ax;
import java.util.Hashtable;

/* loaded from: classes2.dex */
public class ge {
    private static final int a = fx.PING_RTT.a();

    /* renamed from: a, reason: collision with other field name */
    private static long f472a = 0;

    static class a {
        static Hashtable<Integer, Long> a = new Hashtable<>();
    }

    public static void a(String str, Exception exc) {
        try {
            gb.a b = gb.b(exc);
            fy m408a = gd.m406a().m408a();
            m408a.a(b.a.a());
            m408a.c(b.f461a);
            m408a.b(str);
            if (gd.a() != null && gd.a().f464a != null) {
                m408a.c(ax.b(gd.a().f464a) ? 1 : 0);
            }
            gd.m406a().a(m408a);
        } catch (NullPointerException unused) {
        }
    }

    public static void b(String str, Exception exc) {
        try {
            gb.a d2 = gb.d(exc);
            fy m408a = gd.m406a().m408a();
            m408a.a(d2.a.a());
            m408a.c(d2.f461a);
            m408a.b(str);
            if (gd.a() != null && gd.a().f464a != null) {
                m408a.c(ax.b(gd.a().f464a) ? 1 : 0);
            }
            gd.m406a().a(m408a);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(String str, int i, Exception exc) {
        fy m408a = gd.m406a().m408a();
        if (gd.a() != null && gd.a().f464a != null) {
            m408a.c(ax.b(gd.a().f464a) ? 1 : 0);
        }
        if (i > 0) {
            m408a.a(fx.GSLB_REQUEST_SUCCESS.a());
            m408a.b(str);
            m408a.b(i);
            gd.m406a().a(m408a);
            return;
        }
        try {
            gb.a a2 = gb.a(exc);
            m408a.a(a2.a.a());
            m408a.c(a2.f461a);
            m408a.b(str);
            gd.m406a().a(m408a);
        } catch (NullPointerException unused) {
        }
    }

    public static void b() {
        a(0, a, null, -1);
    }

    public static void a(XMPushService xMPushService, ax.b bVar) {
        new ga(xMPushService, bVar).a();
    }

    public static synchronized void a(int i, int i2) {
        synchronized (ge.class) {
            if (i2 < 16777215) {
                a.a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                com.xiaomi.channel.commonutils.logger.c.d("stats key should less than 16777215");
            }
        }
    }

    public static synchronized void a(int i, int i2, String str, int i3) {
        synchronized (ge.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (a.a.containsKey(Integer.valueOf(i4))) {
                fy m408a = gd.m406a().m408a();
                m408a.a(i2);
                m408a.b((int) (currentTimeMillis - a.a.get(Integer.valueOf(i4)).longValue()));
                m408a.b(str);
                if (i3 > -1) {
                    m408a.c(i3);
                }
                gd.m406a().a(m408a);
                a.a.remove(Integer.valueOf(i2));
            } else {
                com.xiaomi.channel.commonutils.logger.c.d("stats key not found");
            }
        }
    }

    public static void a() {
        if (f472a == 0 || SystemClock.elapsedRealtime() - f472a > com.heytap.mcssdk.constant.a.n) {
            f472a = SystemClock.elapsedRealtime();
            a(0, a);
        }
    }

    public static void a(int i, int i2, int i3, String str, int i4) {
        fy m408a = gd.m406a().m408a();
        m408a.a((byte) i);
        m408a.a(i2);
        m408a.b(i3);
        m408a.b(str);
        m408a.c(i4);
        gd.m406a().a(m408a);
    }

    public static void a(int i) {
        fy m408a = gd.m406a().m408a();
        m408a.a(fx.CHANNEL_STATS_COUNTER.a());
        m408a.c(i);
        gd.m406a().a(m408a);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m412a() {
        fz m409a = gd.m406a().m409a();
        if (m409a != null) {
            return je.a(m409a);
        }
        return null;
    }
}
