package com.xiaomi.push;

import android.content.Context;
import android.content.IntentFilter;
import com.xiaomi.push.service.XMJobService;
import com.xiaomi.push.service.receivers.PowerConnectionReceiver;

/* loaded from: classes2.dex */
public final class fk {

    /* renamed from: a, reason: collision with other field name */
    private static a f431a;

    /* renamed from: a, reason: collision with other field name */
    private static final String f432a = XMJobService.class.getCanonicalName();
    private static int a = 0;

    interface a {
        long a();

        /* renamed from: a */
        void mo394a();

        void a(boolean z);

        /* renamed from: a */
        boolean mo395a();

        /* renamed from: b */
        void mo396b();
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if ("com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
            f431a = new fl(applicationContext);
            return;
        }
        if (t.m848d()) {
            b(applicationContext);
            f431a = new fm(applicationContext);
        } else if (t.m847c()) {
            f431a = new fn(applicationContext);
        } else {
            f431a = new fl(applicationContext);
        }
    }

    private static void b(Context context) {
        PowerConnectionReceiver powerConnectionReceiver = new PowerConnectionReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        n.a(context, powerConnectionReceiver, intentFilter, 2);
    }

    public static synchronized void b() {
        synchronized (fk.class) {
            a aVar = f431a;
            if (aVar != null) {
                aVar.mo396b();
            }
        }
    }

    public static synchronized void a(Context context, int i) {
        synchronized (fk.class) {
            if (!t.m847c() && !t.m848d()) {
                int i2 = a;
                if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                    if (i == 2) {
                        a = 2;
                    } else {
                        a = 0;
                    }
                }
                int i3 = a;
                if (i2 != i3 && i3 == 2) {
                    m397a();
                    f431a = new fr(context);
                }
            }
        }
    }

    public static synchronized long a() {
        synchronized (fk.class) {
            a aVar = f431a;
            if (aVar == null) {
                return 0L;
            }
            return aVar.a();
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (fk.class) {
            if (f431a == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("timer is not initialized");
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] register alarm. (" + z + ")");
            f431a.a(z);
            er.a().c();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized void m397a() {
        synchronized (fk.class) {
            if (f431a == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("[Alarm] stop alarm.");
            f431a.mo394a();
            er.a().d();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static synchronized boolean m398a() {
        synchronized (fk.class) {
            a aVar = f431a;
            if (aVar == null) {
                return false;
            }
            return aVar.mo395a();
        }
    }
}
