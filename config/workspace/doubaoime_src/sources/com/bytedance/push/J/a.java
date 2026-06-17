package com.bytedance.push.J;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.bytedance.common.push.d;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.message.e;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f5557c;
    private final Context a;
    private final WeakHandler b = e.e().b();

    /* renamed from: com.bytedance.push.J.a$a, reason: collision with other inner class name */
    class RunnableC0285a implements Runnable {
        RunnableC0285a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b g2 = a.this.g();
            if (g2 != null) {
                g2.a(a.this.a, a.this.b);
            }
        }
    }

    private a(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized b g() {
        Class<?> cls;
        try {
            cls = Class.forName("com.a.b.AKeeperImpl");
        } catch (Throwable unused) {
            return null;
        }
        return (b) cls.getMethod("inst", new Class[0]).invoke(cls, new Object[0]);
    }

    public static a h(Context context) {
        if (f5557c == null) {
            synchronized (a.class) {
                if (f5557c == null) {
                    f5557c = new a(context);
                }
            }
        }
        return f5557c;
    }

    public boolean d(String str) throws PackageManager.NameNotFoundException {
        b g2 = g();
        if (g2 != null) {
            return g2.c(this.a, str);
        }
        return true;
    }

    public void e() {
        RunnableC0285a runnableC0285a = new RunnableC0285a();
        if (Looper.getMainLooper() == Looper.myLooper()) {
            d.b(runnableC0285a);
        } else {
            runnableC0285a.run();
        }
    }

    public void f(boolean z) {
        b g2 = g();
        if (g2 != null) {
            g2.b(this.a, z);
        }
    }
}
