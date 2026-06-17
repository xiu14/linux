package com.bytedance.push.W;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class d extends e implements Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    private static volatile d f5601g;

    /* renamed from: e, reason: collision with root package name */
    private Method f5602e;

    /* renamed from: f, reason: collision with root package name */
    private Object f5603f;

    class a implements Runnable {
        final /* synthetic */ Method a;
        final /* synthetic */ Object b;

        a(Method method, Object obj) {
            this.a = method;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.f5603f = this.a.invoke(null, new Object[0]);
                synchronized (this.b) {
                    this.b.notify();
                }
            } finally {
                Object obj = this.b;
            }
        }
    }

    private d() {
    }

    private synchronized Object e() {
        if (this.f5603f == null) {
            try {
                Method c2 = com.bytedance.push.g0.c.c(Class.forName("android.app.ActivityThread"), "currentActivityThread", new Class[0]);
                c2.setAccessible(true);
                Object invoke = c2.invoke(null, new Object[0]);
                this.f5603f = invoke;
                if (invoke == null && Looper.myLooper() != Looper.getMainLooper()) {
                    Object obj = new Object();
                    new Handler(Looper.getMainLooper()).post(new a(c2, obj));
                    if (this.f5603f == null) {
                        synchronized (obj) {
                            try {
                                obj.wait();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f5603f;
    }

    public static d f() {
        if (f5601g == null) {
            synchronized (d.class) {
                if (f5601g == null) {
                    f5601g = new d();
                }
            }
        }
        return f5601g;
    }

    @Override // com.bytedance.push.W.e
    protected synchronized boolean b() {
        try {
        } finally {
        }
        if (this.f5606d) {
            return true;
        }
        Object e2 = e();
        this.f5603f = e2;
        if (e2 != null) {
            try {
                Field b = com.bytedance.push.g0.c.b(e2.getClass(), "mH");
                b.setAccessible(true);
                Handler handler = (Handler) b.get(this.f5603f);
                Field b2 = com.bytedance.push.g0.c.b(Handler.class, "mCallback");
                b2.setAccessible(true);
                Object obj = b2.get(handler);
                if (obj instanceof d) {
                    com.bytedance.push.g0.f.m(this.a, "not duplicate hook field because originCallback is ActivityThreadHooker");
                    return true;
                }
                this.b = obj;
                this.f5602e = com.bytedance.push.g0.c.c(Handler.Callback.class, "handleMessage", Message.class);
                b2.set(handler, this);
                com.bytedance.push.g0.f.c(this.a, "success replace ActivityThread#H#mCallback");
                return true;
            } catch (Throwable th) {
                com.bytedance.push.g0.f.f(this.a, "error when replace ActivityThread#H#mCallback ", th);
            }
        } else {
            com.bytedance.push.g0.f.e(this.a, "sActivityThread is null!");
        }
        return false;
    }

    @Override // com.bytedance.push.W.e
    protected String c() {
        return "ActivityThreadHooker";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("handleMessage:");
        M.append(message.what);
        com.bytedance.push.g0.f.c(str, M.toString());
        try {
            Object invoke = invoke(this.b, this.f5602e, new Object[]{message});
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
            return false;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
