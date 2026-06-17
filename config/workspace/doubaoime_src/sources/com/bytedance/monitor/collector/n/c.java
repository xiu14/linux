package com.bytedance.monitor.collector.n;

import android.app.Service;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.reflect.Field;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements Handler.Callback {
    private static c b = new c();

    /* renamed from: c, reason: collision with root package name */
    private static b f5475c;

    /* renamed from: d, reason: collision with root package name */
    private static Map<IBinder, Service> f5476d;
    private Handler.Callback a;

    private c() {
    }

    public static void a() {
        f5475c = null;
    }

    public static b b() {
        return f5475c;
    }

    public static c c() {
        return b;
    }

    public synchronized String d(IBinder iBinder) {
        String str;
        if (f5476d == null) {
            try {
                Object c2 = e.b.i.a.a.c();
                f5476d = (Map) com.bytedance.feedbackerlib.a.B(c2.getClass(), "mServices").get(c2);
            } catch (Throwable unused) {
            }
        }
        Map<IBinder, Service> map = f5476d;
        str = null;
        if (map != null && map.get(iBinder) != null) {
            str = f5476d.get(iBinder).getClass().getName();
        }
        return str;
    }

    public void e() {
        try {
            Handler handler = (Handler) e.b.i.a.a.f();
            Field B = com.bytedance.feedbackerlib.a.B(Handler.class, "mCallback");
            this.a = (Handler.Callback) B.get(handler);
            B.set(handler, this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (a.a(message)) {
                f5475c = b.a(message);
            }
        } catch (Throwable unused) {
        }
        Handler.Callback callback = this.a;
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
