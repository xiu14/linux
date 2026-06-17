package com.bytedance.applog.r;

import android.os.Process;
import java.lang.Thread;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    private static final com.bytedance.applog.util.a<a> f3888c = new C0152a();
    private final CopyOnWriteArraySet<b> a = new CopyOnWriteArraySet<>();
    private final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: com.bytedance.applog.r.a$a, reason: collision with other inner class name */
    static class C0152a extends com.bytedance.applog.util.a<a> {
        C0152a() {
        }

        @Override // com.bytedance.applog.util.a
        protected a a(Object[] objArr) {
            return new a(null);
        }
    }

    private a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static a b() {
        return f3888c.b(new Object[0]);
    }

    public void a(b bVar) {
        this.a.add(bVar);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Iterator<b> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(thread, th);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable unused) {
        }
    }

    a(C0152a c0152a) {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }
}
