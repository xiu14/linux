package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class bj implements ag {
    private static volatile bj a;

    /* renamed from: a, reason: collision with other field name */
    private long f1085a;

    /* renamed from: a, reason: collision with other field name */
    Context f1086a;

    /* renamed from: a, reason: collision with other field name */
    private SharedPreferences f1087a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f1089a = false;

    /* renamed from: a, reason: collision with other field name */
    private ConcurrentHashMap<String, a> f1088a = new ConcurrentHashMap<>();

    public static abstract class a implements Runnable {
        long a;

        /* renamed from: a, reason: collision with other field name */
        String f1090a;

        a(String str, long j) {
            this.f1090a = str;
            this.a = j;
        }

        abstract void a(bj bjVar);

        @Override // java.lang.Runnable
        public void run() {
            if (bj.a != null) {
                Context context = bj.a.f1086a;
                if (com.xiaomi.push.ax.c(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences = bj.a.f1087a;
                    StringBuilder M = e.a.a.a.a.M(":ts-");
                    M.append(this.f1090a);
                    if (currentTimeMillis - sharedPreferences.getLong(M.toString(), 0L) > this.a || com.xiaomi.push.ae.a(context)) {
                        SharedPreferences.Editor edit = bj.a.f1087a.edit();
                        StringBuilder M2 = e.a.a.a.a.M(":ts-");
                        M2.append(this.f1090a);
                        com.xiaomi.push.q.a(edit.putLong(M2.toString(), System.currentTimeMillis()));
                        a(bj.a);
                    }
                }
            }
        }
    }

    private bj(Context context) {
        this.f1086a = context.getApplicationContext();
        this.f1087a = context.getSharedPreferences("sync", 0);
    }

    public static bj a(Context context) {
        if (a == null) {
            synchronized (bj.class) {
                if (a == null) {
                    a = new bj(context);
                }
            }
        }
        return a;
    }

    @Override // com.xiaomi.push.service.ag
    /* renamed from: a, reason: collision with other method in class */
    public void mo787a() {
        if (this.f1089a) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f1085a < 3600000) {
            return;
        }
        this.f1085a = currentTimeMillis;
        this.f1089a = true;
        com.xiaomi.push.ah.a(this.f1086a).a(new Runnable() { // from class: com.xiaomi.push.service.bj.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Iterator it2 = bj.this.f1088a.values().iterator();
                    while (it2.hasNext()) {
                        ((a) it2.next()).run();
                    }
                } catch (Exception e2) {
                    StringBuilder M = e.a.a.a.a.M("Sync job exception :");
                    M.append(e2.getMessage());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                }
                bj.this.f1089a = false;
            }
        }, (int) (Math.random() * 10.0d));
    }

    public String a(String str, String str2) {
        return this.f1087a.getString(str + Constants.COLON_SEPARATOR + str2, "");
    }

    public void a(String str, String str2, String str3) {
        com.xiaomi.push.q.a(a.f1087a.edit().putString(str + Constants.COLON_SEPARATOR + str2, str3));
    }

    public void a(a aVar) {
        if (this.f1088a.putIfAbsent(aVar.f1090a, aVar) == null) {
            com.xiaomi.push.ah.a(this.f1086a).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }
}
