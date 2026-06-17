package com.xiaomi.push;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ah;

/* loaded from: classes2.dex */
public class ea {
    private static volatile ea a;

    /* renamed from: a, reason: collision with other field name */
    private Context f302a;

    /* renamed from: a, reason: collision with other field name */
    private a f303a;

    public interface a {
        void a();
    }

    private ea(Context context) {
        this.f302a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a aVar;
        ah a2 = ah.a(this.f302a);
        com.xiaomi.push.service.aq a3 = com.xiaomi.push.service.aq.a(this.f302a);
        SharedPreferences sharedPreferences = this.f302a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", currentTimeMillis);
        if (j == currentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", currentTimeMillis).commit();
        }
        if (Math.abs(currentTimeMillis - j) < 172800000) {
            return;
        }
        a(a3, a2, false);
        if (a3.a(hz.StorageCollectionSwitch.a(), true)) {
            int a4 = a(a3.a(hz.StorageCollectionFrequency.a(), RemoteMessageConst.DEFAULT_TTL));
            a2.a(new ec(this.f302a, a4), a4, 0);
        }
        if (k.m655a(this.f302a) && (aVar = this.f303a) != null) {
            aVar.a();
        }
        if (a3.a(hz.ActivityTSSwitch.a(), false)) {
            a();
        }
        a(a3, a2, true);
    }

    public static ea a(Context context) {
        if (a == null) {
            synchronized (ea.class) {
                if (a == null) {
                    a = new ea(context);
                }
            }
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m261a() {
        ah.a(this.f302a).a(new Runnable() { // from class: com.xiaomi.push.ea.1
            @Override // java.lang.Runnable
            public void run() {
                ea.this.b();
            }
        });
    }

    private void a(com.xiaomi.push.service.aq aqVar, ah ahVar, boolean z) {
        if (aqVar.a(hz.UploadSwitch.a(), true)) {
            ed edVar = new ed(this.f302a);
            if (z) {
                ahVar.a((ah.a) edVar, a(aqVar.a(hz.UploadFrequency.a(), RemoteMessageConst.DEFAULT_TTL)));
            } else {
                ahVar.m95a((ah.a) edVar);
            }
        }
    }

    public static int a(int i) {
        return Math.max(60, i);
    }

    private boolean a() {
        Application application;
        try {
            Context context = this.f302a;
            if (context instanceof Application) {
                application = (Application) context;
            } else {
                application = (Application) context.getApplicationContext();
            }
            application.registerActivityLifecycleCallbacks(new du(this.f302a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return false;
        }
    }
}
