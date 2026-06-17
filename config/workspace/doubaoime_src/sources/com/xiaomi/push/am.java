package com.xiaomi.push;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
class am implements al, InvocationHandler {
    private static final String[][] a = {new String[]{"com.bun.supplier.IIdentifierListener", "com.bun.supplier.IdSupplier"}, new String[]{"com.bun.miitmdid.core.IIdentifierListener", "com.bun.miitmdid.supplier.IdSupplier"}};

    /* renamed from: a, reason: collision with other field name */
    private Context f109a;

    /* renamed from: a, reason: collision with other field name */
    private Class f111a = null;
    private Class b = null;

    /* renamed from: a, reason: collision with other field name */
    private Method f113a = null;

    /* renamed from: b, reason: collision with other field name */
    private Method f114b = null;

    /* renamed from: c, reason: collision with root package name */
    private Method f8977c = null;

    /* renamed from: d, reason: collision with root package name */
    private Method f8978d = null;

    /* renamed from: e, reason: collision with root package name */
    private Method f8979e = null;

    /* renamed from: f, reason: collision with root package name */
    private Method f8980f = null;

    /* renamed from: g, reason: collision with root package name */
    private Method f8981g = null;

    /* renamed from: a, reason: collision with other field name */
    private final Object f112a = new Object();

    /* renamed from: a, reason: collision with other field name */
    private volatile int f107a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile long f108a = 0;

    /* renamed from: a, reason: collision with other field name */
    private volatile a f110a = null;

    private class a {

        /* renamed from: a, reason: collision with other field name */
        Boolean f115a;

        /* renamed from: a, reason: collision with other field name */
        String f116a;
        String b;

        /* renamed from: c, reason: collision with root package name */
        String f8982c;

        /* renamed from: d, reason: collision with root package name */
        String f8983d;

        private a() {
            this.f115a = null;
            this.f116a = null;
            this.b = null;
            this.f8982c = null;
            this.f8983d = null;
        }

        boolean a() {
            if (!TextUtils.isEmpty(this.f116a) || !TextUtils.isEmpty(this.b) || !TextUtils.isEmpty(this.f8982c) || !TextUtils.isEmpty(this.f8983d)) {
                this.f115a = Boolean.TRUE;
            }
            return this.f115a != null;
        }
    }

    public am(Context context) {
        this.f109a = context.getApplicationContext();
        a(context);
        b(context);
    }

    private void b(Context context) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = -elapsedRealtime;
        Class cls = this.b;
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = context.getClassLoader();
                }
                a(this.f113a, this.f111a.newInstance(), context, Proxy.newProxyInstance(classLoader, new Class[]{this.b}, this));
            } catch (Throwable th) {
                b(e.a.a.a.a.w("call init sdk error:", th));
            }
            this.f108a = elapsedRealtime;
        }
        elapsedRealtime = j;
        this.f108a = elapsedRealtime;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public boolean mo102a() {
        a("isSupported");
        return this.f110a != null && Boolean.TRUE.equals(this.f110a.f115a);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f108a = SystemClock.elapsedRealtime();
        if (objArr != null) {
            a aVar = new a();
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && !a(obj2)) {
                    aVar.b = (String) a(this.f8977c, obj2, new Object[0]);
                    aVar.f115a = (Boolean) a(this.f8980f, obj2, new Object[0]);
                    a(this.f8981g, obj2, new Object[0]);
                    if (aVar.a()) {
                        StringBuilder M = e.a.a.a.a.M("has get succ, check duplicate:");
                        M.append(this.f110a != null);
                        b(M.toString());
                        synchronized (am.class) {
                            if (this.f110a == null) {
                                this.f110a = aVar;
                            }
                        }
                    }
                }
                i++;
            }
        }
        a();
        return null;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public String mo101a() {
        a("getOAID");
        if (this.f110a == null) {
            return null;
        }
        return this.f110a.b;
    }

    private void a(Context context) {
        Class<?> a2 = a(context, "com.bun.miitmdid.core.MdidSdk");
        Class<?> cls = null;
        Class<?> cls2 = null;
        int i = 0;
        while (true) {
            String[][] strArr = a;
            if (i >= strArr.length) {
                break;
            }
            String[] strArr2 = strArr[i];
            Class<?> a3 = a(context, strArr2[0]);
            Class<?> a4 = a(context, strArr2[1]);
            if (a3 != null && a4 != null) {
                b(e.a.a.a.a.j("found class in index ", i));
                cls2 = a4;
                cls = a3;
                break;
            } else {
                i++;
                cls2 = a4;
                cls = a3;
            }
        }
        this.f111a = a2;
        this.f113a = a(a2, "InitSdk", (Class<?>[]) new Class[]{Context.class, cls});
        this.b = cls;
        this.f8977c = a(cls2, "getOAID", (Class<?>[]) new Class[0]);
        this.f8980f = a(cls2, "isSupported", (Class<?>[]) new Class[0]);
        this.f8981g = a(cls2, "shutDown", (Class<?>[]) new Class[0]);
    }

    private static void b(String str) {
        com.xiaomi.channel.commonutils.logger.c.m15a("mdid:" + str);
    }

    private void a(String str) {
        if (this.f110a != null) {
            return;
        }
        long j = this.f108a;
        long elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
        int i = this.f107a;
        if (elapsedRealtime > WsConstants.EXIT_DELAY_TIME && i < 3) {
            synchronized (this.f112a) {
                if (this.f108a == j && this.f107a == i) {
                    b("retry, current count is " + i);
                    this.f107a = this.f107a + 1;
                    b(this.f109a);
                    j = this.f108a;
                    elapsedRealtime = SystemClock.elapsedRealtime() - Math.abs(j);
                }
            }
        }
        if (this.f110a != null || j < 0 || elapsedRealtime > WsConstants.EXIT_DELAY_TIME || Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        synchronized (this.f112a) {
            if (this.f110a == null) {
                try {
                    b(str + " wait...");
                    this.f112a.wait(WsConstants.EXIT_DELAY_TIME);
                } catch (Exception unused) {
                }
            }
        }
    }

    private void a() {
        synchronized (this.f112a) {
            try {
                this.f112a.notifyAll();
            } catch (Exception unused) {
            }
        }
    }

    private static boolean a(Object obj) {
        return (obj instanceof Boolean) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double);
    }

    private static Class<?> a(Context context, String str) {
        try {
            return t.a(context, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <T> T a(Method method, Object obj, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            T t = (T) method.invoke(obj, objArr);
            if (t != null) {
                return t;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
