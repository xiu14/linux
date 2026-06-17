package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.fk;

/* loaded from: classes2.dex */
abstract class fj implements fk.a {

    /* renamed from: a, reason: collision with other field name */
    protected Context f429a;

    /* renamed from: a, reason: collision with other field name */
    protected final fq f430a;

    /* renamed from: a, reason: collision with other field name */
    private PendingIntent f428a = null;
    protected volatile long a = 0;
    private long b = 0;

    protected fj(Context context, fq fqVar) {
        this.f429a = null;
        this.f429a = context;
        this.f430a = fqVar;
    }

    private long b() {
        return this.f430a.a();
    }

    protected void a(boolean z, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.a == 0) {
            this.a = (j - (elapsedRealtime % j)) + elapsedRealtime;
        } else if (this.a <= elapsedRealtime) {
            this.a += j;
            if (this.a < elapsedRealtime) {
                this.a = elapsedRealtime + j;
            }
        }
    }

    @Override // com.xiaomi.push.fk.a
    /* renamed from: b, reason: collision with other method in class */
    public void mo396b() {
        long a = a();
        StringBuilder Q = e.a.a.a.a.Q("refreshPingInterval, newInterval=", a, ", former mHBInterval= ");
        Q.append(this.b);
        com.xiaomi.channel.commonutils.logger.c.e(Q.toString());
        if (this.b != a) {
            StringBuilder M = e.a.a.a.a.M("HB interval change from ");
            M.append(this.b);
            M.append(" to ");
            M.append(a);
            M.append(", force restart");
            com.xiaomi.channel.commonutils.logger.c.e(M.toString());
            a(true);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    protected Intent mo393a() {
        Intent intent = new Intent(com.xiaomi.push.service.ay.t);
        intent.setPackage(this.f429a.getPackageName());
        return intent;
    }

    protected void a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f429a.getSystemService(NotificationCompat.CATEGORY_ALARM);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            this.f428a = PendingIntent.getBroadcast(this.f429a, 0, intent, 33554432);
        } else {
            this.f428a = PendingIntent.getBroadcast(this.f429a, 0, intent, 0);
        }
        if (i >= 31 && !k.m655a(this.f429a)) {
            alarmManager.set(2, j, this.f428a);
        } else {
            bh.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f428a);
        }
        StringBuilder Q = e.a.a.a.a.Q("[Alarm] register timer ", j, ", delta=");
        Q.append(j - SystemClock.elapsedRealtime());
        Q.append("ms");
        com.xiaomi.channel.commonutils.logger.c.c(Q.toString());
    }

    private void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j), pendingIntent);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.d("[Alarm] invoke setExact method meet error. " + e2);
        }
    }

    @Override // com.xiaomi.push.fk.a
    public final long a() {
        return this.f430a.mo801b();
    }

    @Override // com.xiaomi.push.fk.a
    public final void a(boolean z) {
        long b = b();
        if (z || this.a != 0) {
            this.b = b;
            if (z) {
                mo394a();
            }
            a(z, b);
            com.xiaomi.channel.commonutils.logger.c.e("registerPing, firstPing=" + z + ", interval=" + b + ", nextTime=" + this.a);
            a(mo393a(), this.a);
        }
    }

    @Override // com.xiaomi.push.fk.a
    /* renamed from: a, reason: collision with other method in class */
    public final void mo394a() {
        if (this.f428a != null) {
            try {
                ((AlarmManager) this.f429a.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(this.f428a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f428a = null;
                com.xiaomi.channel.commonutils.logger.c.c("[Alarm] unregister timer");
                this.a = 0L;
                throw th;
            }
            this.f428a = null;
            com.xiaomi.channel.commonutils.logger.c.c("[Alarm] unregister timer");
            this.a = 0L;
        }
        this.a = 0L;
    }

    @Override // com.xiaomi.push.fk.a
    /* renamed from: a, reason: collision with other method in class */
    public final boolean mo395a() {
        return this.a != 0;
    }
}
