package e.b.i.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class a {
    private static Class a;
    private static Field b;

    /* renamed from: c, reason: collision with root package name */
    private static Object f9562c;

    /* renamed from: d, reason: collision with root package name */
    private static Object f9563d;

    /* renamed from: e, reason: collision with root package name */
    private static Set<Integer> f9564e;

    /* renamed from: f, reason: collision with root package name */
    private static Class f9565f;

    /* renamed from: e.b.i.a.a$a, reason: collision with other inner class name */
    static class RunnableC0436a implements Runnable {
        final /* synthetic */ Object a;

        RunnableC0436a(Object obj) {
            this.a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Object unused = a.f9562c = e.b(a.f9565f, "currentActivityThread", new Object[0]);
                synchronized (this.a) {
                    this.a.notify();
                }
            } catch (Exception unused2) {
                synchronized (this.a) {
                    this.a.notify();
                }
            } catch (Throwable th) {
                synchronized (this.a) {
                    this.a.notify();
                    throw th;
                }
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f9564e = hashSet;
        hashSet.add(113);
        f9564e.add(114);
        f9564e.add(115);
        f9564e.add(116);
        f9564e.add(121);
        f9564e.add(122);
        f9564e.add(100);
        f9564e.add(159);
        f9564e.add(123);
    }

    public static Object c() {
        if (f9562c == null) {
            try {
                synchronized (a.class) {
                    if (f9562c == null) {
                        if (f9565f == null) {
                            f9565f = Class.forName("android.app.ActivityThread");
                        }
                        f9562c = e.b(f9565f, "currentActivityThread", new Object[0]);
                    }
                    if (f9562c == null && Looper.myLooper() != Looper.getMainLooper()) {
                        Object obj = new Object();
                        new Handler(Looper.getMainLooper()).post(new RunnableC0436a(obj));
                        if (f9562c == null) {
                            synchronized (obj) {
                                try {
                                    obj.wait(com.heytap.mcssdk.constant.a.r);
                                } catch (InterruptedException unused) {
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return f9562c;
    }

    public static synchronized Class d() {
        Class cls;
        synchronized (a.class) {
            if (a == null) {
                try {
                    a = Class.forName("android.app.ActivityThread");
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
            }
            cls = a;
        }
        return cls;
    }

    public static synchronized Field e() {
        Field field;
        synchronized (a.class) {
            if (b == null) {
                b = b.a(d(), "mH");
            }
            field = b;
        }
        return field;
    }

    public static synchronized Object f() {
        Object obj;
        synchronized (a.class) {
            if (f9563d == null) {
                try {
                    f9563d = e().get(g());
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
            obj = f9563d;
        }
        return obj;
    }

    public static synchronized Object g() {
        Object obj;
        synchronized (a.class) {
            try {
                if (f9562c == null) {
                    f9562c = e.b(d(), "currentActivityThread", new Object[0]);
                }
                obj = f9562c;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
        return obj;
    }

    public static boolean h(Message message) {
        return f9564e.contains(Integer.valueOf(message.what));
    }
}
