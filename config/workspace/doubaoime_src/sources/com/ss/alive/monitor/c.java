package com.ss.alive.monitor;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f8240f;
    private d a = new d("process.lock");
    private final com.ss.alive.monitor.m.a b;

    /* renamed from: c, reason: collision with root package name */
    private Application f8241c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8242d;

    /* renamed from: e, reason: collision with root package name */
    private a f8243e;

    private c(Context context) {
        new Handler(Looper.getMainLooper());
        if (context instanceof Application) {
            this.f8241c = (Application) context;
        } else {
            this.f8241c = (Application) context.getApplicationContext();
        }
        boolean d2 = this.a.d(this.f8241c);
        this.f8242d = d2;
        com.ss.alive.monitor.m.a aVar = new com.ss.alive.monitor.m.a(this.f8241c, d2);
        this.b = aVar;
        aVar.e();
    }

    public static c c(Context context) {
        if (f8240f == null) {
            synchronized (c.class) {
                if (f8240f == null) {
                    f8240f = new c(context);
                }
            }
        }
        return f8240f;
    }

    public a a() {
        if (this.f8243e == null) {
            this.f8243e = new a(this.f8241c, this.b);
        }
        return this.f8243e;
    }

    public void b() {
        com.ss.alive.monitor.i.a c2 = com.ss.alive.monitor.i.a.c(this.f8241c);
        if (this.f8243e == null) {
            this.f8243e = new a(this.f8241c, this.b);
        }
        c2.b(this.f8243e);
    }

    public boolean d() {
        return this.f8242d;
    }
}
