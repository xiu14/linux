package com.bytedance.push.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.bytedance.push.C;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class p implements com.bytedance.push.interfaze.n, e, Observer {
    private Context a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5784c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, com.bytedance.push.settings.w.d> f5785d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5787f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5788g;
    private boolean h;
    private boolean j;
    private boolean k;

    /* renamed from: e, reason: collision with root package name */
    private final Object f5786e = new Object();
    private final AtomicBoolean i = new AtomicBoolean(false);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p.a(p.this);
            if (p.this.j) {
                com.bytedance.push.g0.f.c("PushNotificationManager", "start hook NotificationManager");
                p.c(p.this);
                NotificationShowMonitor.inst().init();
            }
        }
    }

    static class b implements InvocationHandler {
        private Object a;
        private e b;

        public b(Object obj, e eVar) {
            this.a = obj;
            this.b = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            return ((p) this.b).g(this.a, method, objArr);
        }
    }

    static void a(p pVar) {
        pVar.f5788g = ((PushOnlineSettings) com.bytedance.push.settings.h.b(pVar.a, PushOnlineSettings.class)).W();
        pVar.k = ((PushOnlineSettings) com.bytedance.push.settings.h.b(pVar.a, PushOnlineSettings.class)).Z().a;
        pVar.f5787f = pVar.e().i();
        boolean z = com.bytedance.push.settings.w.f.a().a;
        pVar.h = z;
        pVar.j = pVar.f5784c || pVar.f5788g || z || pVar.k;
    }

    static void c(p pVar) {
        Objects.requireNonNull(pVar);
        try {
            if (pVar.i.getAndSet(true)) {
                return;
            }
            Class<?> cls = Class.forName("android.app.NotificationManager");
            Field declaredField = cls.getDeclaredField("sService");
            declaredField.setAccessible(true);
            cls.getDeclaredMethod("getService", new Class[0]).invoke(null, new Object[0]);
            Object obj = declaredField.get(null);
            declaredField.set(null, Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Class.forName("android.app.INotificationManager")}, new b(obj, pVar)));
            com.bytedance.push.g0.f.c("PushNotificationManager", "success hook NotificationManager");
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error when hook NotificationManager:");
            M.append(th.getMessage());
            com.bytedance.push.g0.f.e("PushNotificationManager", M.toString());
            com.bytedance.push.helper.b.a(th, "error when hook NotificationManager");
        }
    }

    private boolean d() {
        if (ContextCompat.checkSelfPermission(this.a, "android.permission.POST_NOTIFICATIONS") == 0) {
            com.bytedance.push.g0.f.c("PushNotificationManager", "dynamicRequestNotificationPermission:cur has permission, do nothing");
            return false;
        }
        if (com.bytedance.common.push.b.e().j()) {
            com.bytedance.push.g0.f.c("PushNotificationManager", "dynamicRequestNotificationPermission:cur is in background,do nothing");
            return false;
        }
        Activity h = com.bytedance.common.push.b.e().h();
        if (h == null) {
            com.bytedance.push.g0.f.c("PushNotificationManager", "dynamicRequestNotificationPermission:topActivity is null,do nothing");
            return false;
        }
        com.bytedance.push.g0.f.c("PushNotificationManager", "dynamicRequestNotificationPermission:cur not has permission, start request permission");
        ActivityCompat.requestPermissions(h, new String[]{"android.permission.POST_NOTIFICATIONS"}, 61519);
        return true;
    }

    private LocalSettings e() {
        return (LocalSettings) com.bytedance.push.settings.h.b(this.a, LocalSettings.class);
    }

    public void f(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo().targetSdkVersion >= 33;
        this.f5784c = Build.VERSION.SDK_INT >= 33;
        new ArrayList();
        if (this.f5784c) {
            com.bytedance.push.K.a.d().addObserver(this);
        }
        com.prolificinteractive.materialcalendarview.r.f0(new a());
    }

    public Object g(Object obj, Method method, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        StringBuilder M = e.a.a.a.a.M("proxyMethodInvoke:");
        M.append(method.getName());
        com.bytedance.push.g0.f.c("PushNotificationManager", M.toString());
        if (TextUtils.equals(method.getName(), "createNotificationChannels")) {
            if (this.f5788g) {
                try {
                    Object obj2 = objArr[1];
                    for (NotificationChannel notificationChannel : (List) obj2.getClass().getDeclaredMethod("getList", new Class[0]).invoke(obj2, new Object[0])) {
                        com.bytedance.push.g0.f.c("PushNotificationManager", "create channel:" + notificationChannel.getId() + " " + ((Object) notificationChannel.getName()));
                        ((C) C.a()).i().k(notificationChannel);
                    }
                } catch (Throwable th) {
                    com.bytedance.push.g0.f.f("PushNotificationManager", "error when parse notification channel ", th);
                }
            }
            if (this.f5784c) {
                boolean autoRequestNotificationPermission = com.bytedance.common.g.a.c().e().c().o.autoRequestNotificationPermission();
                if (this.b) {
                    if (autoRequestNotificationPermission && !d()) {
                        e().b0(true);
                    }
                } else if (autoRequestNotificationPermission) {
                    com.bytedance.push.g0.f.c("PushNotificationManager", "app allow request notification permission automatically, do nothing");
                } else if (com.ss.android.message.f.a.d(this.a) != 1) {
                    List<NotificationChannel> notificationChannels = ((NotificationManager) this.a.getSystemService(RemoteMessageConst.NOTIFICATION)).getNotificationChannels();
                    if (!(notificationChannels != null && notificationChannels.size() > 0) && !this.f5787f) {
                        com.bytedance.push.g0.f.c("PushNotificationManager", "app not has popped notification permission popup,so block channel create until app allow popup permission request");
                        try {
                            Object obj3 = objArr[1];
                            List<NotificationChannel> list = (List) obj3.getClass().getDeclaredMethod("getList", new Class[0]).invoke(obj3, new Object[0]);
                            synchronized (this.f5786e) {
                                if (this.f5785d == null) {
                                    this.f5785d = e().U();
                                }
                                for (NotificationChannel notificationChannel2 : list) {
                                    com.bytedance.push.g0.f.c("PushNotificationManager", "add <" + notificationChannel2.getId() + Constants.ACCEPT_TIME_SEPARATOR_SP + ((Object) notificationChannel2.getName()) + "> to cache after app allow pop permission request window");
                                    if (!this.f5785d.containsKey(notificationChannel2.getId())) {
                                        this.f5785d.put(notificationChannel2.getId(), new com.bytedance.push.settings.w.d(notificationChannel2));
                                    }
                                }
                                e().D(this.f5785d);
                            }
                        } catch (Throwable th2) {
                            com.bytedance.push.g0.f.f("PushNotificationManager", "error when parse notification channel ", th2);
                        }
                        return null;
                    }
                }
            }
        } else if (TextUtils.equals(method.getName(), "enqueueNotificationWithTag") && (this.h || this.k)) {
            try {
                if (!NotificationShowMonitor.inst().onNotificationShow((String) objArr[2], ((Integer) objArr[3]).intValue(), (Notification) objArr[4])) {
                    return null;
                }
            } catch (Throwable th3) {
                com.bytedance.push.g0.f.f("PushNotificationManager", "try  call monitor empty method in proxy error: ", th3);
            }
        }
        return method.invoke(obj, objArr);
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (!((Boolean) obj).booleanValue() && this.f5784c && this.b && e().A() && d()) {
            e().b0(false);
        }
    }
}
