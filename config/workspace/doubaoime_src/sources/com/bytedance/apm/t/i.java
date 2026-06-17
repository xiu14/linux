package com.bytedance.apm.t;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {
    private static volatile boolean a = false;
    public static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Object f3534c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f3535d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f3536e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f3537f;

    /* renamed from: g, reason: collision with root package name */
    public static final Thread f3538g = Looper.getMainLooper().getThread();
    public static a h;

    public static class a {
        final List<h> mObservers = new ArrayList();
        List<h> mRemoveObservers = new ArrayList();
        List<h> mAddObservers = new ArrayList();
        volatile boolean haveRemove = false;
        volatile boolean haveAdd = false;

        public void addMessageObserver(h hVar) {
            synchronized (this.mObservers) {
                if (hVar != null) {
                    if (!this.mAddObservers.contains(hVar)) {
                        this.mAddObservers.add(hVar);
                        this.haveAdd = true;
                    }
                }
            }
        }

        protected void messageDispatchStarting(String str) {
            if (this.haveAdd) {
                synchronized (this.mObservers) {
                    for (h hVar : this.mAddObservers) {
                        if (!this.mObservers.contains(hVar)) {
                            this.mObservers.add(hVar);
                        }
                    }
                    this.mAddObservers.clear();
                    this.haveAdd = false;
                }
            }
            for (h hVar2 : this.mObservers) {
                if (hVar2 != null) {
                    hVar2.a(str);
                }
            }
        }

        public void messageDispatched(String str, Message message) {
            for (h hVar : this.mObservers) {
                if (hVar != null) {
                    hVar.b(str, message);
                }
            }
            if (this.haveRemove) {
                synchronized (this.mObservers) {
                    for (h hVar2 : this.mRemoveObservers) {
                        this.mObservers.remove(hVar2);
                        this.mAddObservers.remove(hVar2);
                    }
                    this.mRemoveObservers.clear();
                    this.haveRemove = false;
                }
            }
        }

        public void removeMessageObserver(h hVar) {
            synchronized (this.mObservers) {
                if (hVar != null) {
                    if (!this.mRemoveObservers.contains(hVar)) {
                        this.mRemoveObservers.add(hVar);
                        this.haveRemove = true;
                    }
                }
            }
        }

        protected void setup(Object obj) {
        }
    }

    public static void a(h hVar) {
        a aVar = h;
        if (aVar != null) {
            aVar.addMessageObserver(hVar);
        }
    }

    public static synchronized boolean b() {
        Object obj;
        synchronized (i.class) {
            if (a) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    try {
                        Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(Looper.class, "sObserver");
                        field.setAccessible(true);
                        obj = field.get(null);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        obj = null;
                    }
                    f3534c = obj;
                    if (obj != null) {
                        f3535d = c(obj.getClass(), "messageDispatchStarting", new Class[0]);
                        f3536e = c(f3534c.getClass(), "messageDispatched", Object.class, Message.class);
                        f3537f = c(f3534c.getClass(), "dispatchingThrewException", Object.class, Message.class, Exception.class);
                    }
                    if (f3535d == null || f3536e == null || f3537f == null) {
                        f3534c = null;
                    }
                    h = (a) Class.forName("com.bytedance.observer.ObserverWrapper").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (f3534c != null) {
                        System.out.println("LooperObserverMonitor.init: " + f3534c);
                        h.setup(f3534c);
                    }
                    c(Looper.class, "setObserver", Class.forName("android.os.Looper$Observer")).invoke(null, h);
                    a = true;
                    return a;
                } catch (Throwable unused) {
                    f3534c = null;
                }
            }
            h = new a();
            f3534c = null;
            b = true;
            a = true;
            return a;
        }
    }

    public static Method c(Class cls, String str, Class<?>... clsArr) {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused) {
            return null;
        }
    }
}
