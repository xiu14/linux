package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ah {
    private static volatile ah a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f88a;

    /* renamed from: a, reason: collision with other field name */
    private ScheduledThreadPoolExecutor f91a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: a, reason: collision with other field name */
    private Map<String, ScheduledFuture> f90a = new HashMap();

    /* renamed from: a, reason: collision with other field name */
    private Object f89a = new Object();

    public static abstract class a implements Runnable {
        /* renamed from: a */
        public abstract String mo139a();
    }

    private static class b implements Runnable {
        a a;

        public b(a aVar) {
            this.a = aVar;
        }

        void a() {
        }

        void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.a.run();
            b();
        }
    }

    private ah(Context context) {
        this.f88a = context.getSharedPreferences("mipush_extra", 0);
    }

    public boolean b(a aVar, int i) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f91a.schedule(new b(aVar) { // from class: com.xiaomi.push.ah.2
            @Override // com.xiaomi.push.ah.b
            void b() {
                synchronized (ah.this.f89a) {
                    ah.this.f90a.remove(super.a.mo139a());
                }
            }
        }, i, TimeUnit.SECONDS);
        synchronized (this.f89a) {
            this.f90a.put(aVar.mo139a(), schedule);
        }
        return true;
    }

    public static ah a(Context context) {
        if (a == null) {
            synchronized (ah.class) {
                if (a == null) {
                    a = new ah(context);
                }
            }
        }
        return a;
    }

    public boolean a(a aVar, int i) {
        return a(aVar, i, 0);
    }

    public boolean a(a aVar, int i, int i2) {
        return a(aVar, i, i2, false);
    }

    public boolean a(a aVar, int i, int i2, final boolean z) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        final String a2 = a(aVar.mo139a());
        b bVar = new b(aVar) { // from class: com.xiaomi.push.ah.1
            @Override // com.xiaomi.push.ah.b
            void a() {
                super.a();
            }

            @Override // com.xiaomi.push.ah.b
            void b() {
                if (z) {
                    return;
                }
                ah.this.f88a.edit().putLong(a2, System.currentTimeMillis()).commit();
            }
        };
        if (!z) {
            long abs = Math.abs(System.currentTimeMillis() - this.f88a.getLong(a2, 0L)) / 1000;
            if (abs < i - i2) {
                i2 = (int) (i - abs);
            }
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f91a.scheduleAtFixedRate(bVar, i2, i, TimeUnit.SECONDS);
            synchronized (this.f89a) {
                this.f90a.put(aVar.mo139a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return true;
        }
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i) {
        this.f91a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m95a(a aVar) {
        return b(aVar, 0);
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f89a) {
            scheduledFuture = this.f90a.get(aVar.mo139a());
        }
        return scheduledFuture;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m96a(String str) {
        synchronized (this.f89a) {
            ScheduledFuture scheduledFuture = this.f90a.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.f90a.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    private static String a(String str) {
        return e.a.a.a.a.s("last_job_time", str);
    }
}
