package com.huawei.hianalytics.b;

import android.content.Context;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a implements Thread.UncaughtExceptionHandler {
    private static a k;
    private b a;
    private b b;

    /* renamed from: c, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f7018c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7020e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7021f;

    /* renamed from: g, reason: collision with root package name */
    private Context f7022g;

    /* renamed from: d, reason: collision with root package name */
    private String[] f7019d = new String[0];
    private String h = "";
    private String i = "";
    private Map<String, String> j = new HashMap();

    public static a a() {
        a aVar;
        synchronized (a.class) {
            if (k == null) {
                k = new a();
            }
            aVar = k;
        }
        return aVar;
    }

    private void b(Context context) {
        synchronized (a.class) {
            if (this.f7022g == null) {
                this.f7022g = context;
                this.f7018c = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }
    }

    public void a(Context context, b bVar) {
        this.a = bVar;
        this.f7021f = true;
        b(context);
    }

    public void a(Context context, String[] strArr, b bVar) {
        this.b = bVar;
        this.f7019d = (String[]) strArr.clone();
        this.f7020e = true;
        b(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c8, code lost:
    
        r4 = "An exception occurred";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Throwable r21) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hianalytics.b.a.a(java.lang.Throwable):boolean");
    }

    public void b() {
        com.huawei.hianalytics.g.b.c("CrashHandler", "crash log server unInit!");
        this.f7020e = false;
        this.f7019d = new String[0];
    }

    public void c() {
        this.f7021f = false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.f7018c != null) {
            if (this.f7022g != null) {
                com.huawei.hianalytics.g.b.d("CrashHandler", "uncaughtException.");
                if (a(th)) {
                    com.huawei.hianalytics.g.b.d("CrashHandler", "Throwable is doing.");
                }
            }
            this.f7018c.uncaughtException(thread, th);
        }
    }
}
