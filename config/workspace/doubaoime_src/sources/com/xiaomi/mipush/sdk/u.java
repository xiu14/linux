package com.xiaomi.mipush.sdk;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.xiaomi.push.ax;
import com.xiaomi.push.bh;
import com.xiaomi.push.bl;
import com.xiaomi.push.di;
import com.xiaomi.push.eo;
import com.xiaomi.push.hu;
import com.xiaomi.push.hv;
import com.xiaomi.push.hy;
import com.xiaomi.push.hz;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.iu;
import com.xiaomi.push.ja;
import com.xiaomi.push.je;
import com.xiaomi.push.jf;
import com.xiaomi.push.service.aq;
import com.xiaomi.push.service.as;
import com.xiaomi.push.service.ay;
import com.xiaomi.push.service.ba;
import com.xiaomi.push.service.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class u {
    private static u a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final ArrayList<a> f73a = new ArrayList<>();
    private static boolean b = false;

    /* renamed from: a, reason: collision with other field name */
    private long f74a;

    /* renamed from: a, reason: collision with other field name */
    private Context f75a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f77a;

    /* renamed from: a, reason: collision with other field name */
    private Messenger f78a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f82a;

    /* renamed from: a, reason: collision with other field name */
    private List<Message> f81a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8972c = false;

    /* renamed from: b, reason: collision with other field name */
    private String f83b = null;

    /* renamed from: a, reason: collision with other field name */
    private Intent f76a = null;

    /* renamed from: a, reason: collision with other field name */
    private Integer f79a = null;

    /* renamed from: a, reason: collision with other field name */
    private String f80a = null;

    /* renamed from: com.xiaomi.mipush.sdk.u$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            v.values();
            int[] iArr = new int[6];
            a = iArr;
            try {
                v vVar = v.DISABLE_PUSH;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                v vVar2 = v.ENABLE_PUSH;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                v vVar3 = v.UPLOAD_HUAWEI_TOKEN;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                v vVar4 = v.UPLOAD_FCM_TOKEN;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = a;
                v vVar5 = v.UPLOAD_COS_TOKEN;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = a;
                v vVar6 = v.UPLOAD_FTOS_TOKEN;
                iArr6[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static class a<T extends jf<T, ?>> {
        hu a;

        /* renamed from: a, reason: collision with other field name */
        T f84a;

        /* renamed from: a, reason: collision with other field name */
        boolean f85a;

        a() {
        }
    }

    private u(Context context) {
        this.f82a = false;
        this.f77a = null;
        this.f75a = context.getApplicationContext();
        this.f82a = m79c();
        b = m80d();
        this.f77a = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.mipush.sdk.u.1
            @Override // android.os.Handler
            public void dispatchMessage(Message message) {
                if (message.what != 19) {
                    return;
                }
                String str = (String) message.obj;
                int i = message.arg1;
                synchronized (p.class) {
                    if (p.a(u.this.f75a).m71a(str)) {
                        if (p.a(u.this.f75a).a(str) < 10) {
                            String string = message.getData() != null ? message.getData().getString("third_sync_reason") : "";
                            v vVar = v.DISABLE_PUSH;
                            if (i == 0 && "syncing".equals(p.a(u.this.f75a).a(vVar))) {
                                u.this.a(str, vVar, true, (HashMap<String, String>) null);
                            } else {
                                v vVar2 = v.ENABLE_PUSH;
                                if (1 == i && "syncing".equals(p.a(u.this.f75a).a(vVar2))) {
                                    u.this.a(str, vVar2, true, (HashMap<String, String>) null);
                                } else {
                                    v vVar3 = v.UPLOAD_HUAWEI_TOKEN;
                                    if (2 == i && "syncing".equals(p.a(u.this.f75a).a(vVar3))) {
                                        HashMap<String, String> m60a = f.m60a(u.this.f75a, d.ASSEMBLE_PUSH_HUAWEI);
                                        m60a.put("third_sync_reason", string);
                                        u.this.a(str, vVar3, false, m60a);
                                    } else {
                                        v vVar4 = v.UPLOAD_FCM_TOKEN;
                                        if (3 == i && "syncing".equals(p.a(u.this.f75a).a(vVar4))) {
                                            u uVar = u.this;
                                            uVar.a(str, vVar4, false, f.m60a(uVar.f75a, d.ASSEMBLE_PUSH_FCM));
                                        } else {
                                            v vVar5 = v.UPLOAD_COS_TOKEN;
                                            if (4 == i && "syncing".equals(p.a(u.this.f75a).a(vVar5))) {
                                                HashMap<String, String> m60a2 = f.m60a(u.this.f75a, d.ASSEMBLE_PUSH_COS);
                                                m60a2.put("third_sync_reason", string);
                                                u.this.a(str, vVar5, false, m60a2);
                                            } else {
                                                v vVar6 = v.UPLOAD_FTOS_TOKEN;
                                                if (5 == i && "syncing".equals(p.a(u.this.f75a).a(vVar6))) {
                                                    HashMap<String, String> m60a3 = f.m60a(u.this.f75a, d.ASSEMBLE_PUSH_FTOS);
                                                    m60a3.put("third_sync_reason", string);
                                                    u.this.a(str, vVar6, false, m60a3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            p.a(u.this.f75a).b(str);
                        } else {
                            p.a(u.this.f75a).c(str);
                        }
                    }
                }
            }
        };
        if (com.xiaomi.push.k.m655a(context)) {
            com.xiaomi.push.service.h.a(new h.b() { // from class: com.xiaomi.mipush.sdk.u.2
                @Override // com.xiaomi.push.service.h.b
                public void a(it itVar, boolean z) {
                    if (TextUtils.isEmpty(itVar.b()) || TextUtils.isEmpty(itVar.d())) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("cpra no fill ainfo, fill it by default.");
                        itVar.b(b.m41a(u.this.f75a).m42a());
                        itVar.d(u.this.f75a.getPackageName());
                    }
                    u.this.a((u) itVar, hu.Notification, z, (ih) null);
                }
            });
        }
        Intent b2 = b();
        if (b2 != null) {
            b(b2);
        }
    }

    private synchronized void c(int i) {
        this.f75a.getSharedPreferences("mipush_extra", 0).edit().putInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, i).commit();
    }

    private Intent d() {
        Intent intent = new Intent();
        String packageName = this.f75a.getPackageName();
        intent.setPackage("com.xiaomi.xmsf");
        intent.setClassName("com.xiaomi.xmsf", m77a());
        intent.putExtra("mipush_app_package", packageName);
        h();
        return intent;
    }

    private Intent e() {
        Intent intent = new Intent();
        String packageName = this.f75a.getPackageName();
        i();
        intent.setComponent(new ComponentName(this.f75a, "com.xiaomi.push.service.XMPushService"));
        intent.putExtra("mipush_app_package", packageName);
        return intent;
    }

    private void g() {
        this.f74a = SystemClock.elapsedRealtime();
    }

    private void h() {
        try {
            PackageManager packageManager = this.f75a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f75a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable unused) {
        }
    }

    private void i() {
        try {
            PackageManager packageManager = this.f75a.getPackageManager();
            ComponentName componentName = new ComponentName(this.f75a, "com.xiaomi.push.service.XMPushService");
            if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public final void m88b() {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.DISABLE_PUSH");
        c(m74a);
    }

    public void f() {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m74a.putExtra(ay.I, this.f75a.getPackageName());
        m74a.putExtra(ay.N, bl.b(this.f75a.getPackageName()));
        c(m74a);
    }

    private Intent b() {
        if (!"com.xiaomi.xmsf".equals(this.f75a.getPackageName())) {
            return c();
        }
        com.xiaomi.channel.commonutils.logger.c.c("pushChannel xmsf create own channel");
        return e();
    }

    /* renamed from: c, reason: collision with other method in class */
    private boolean m79c() {
        try {
            PackageInfo packageInfo = this.f75a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            if (packageInfo == null) {
                return false;
            }
            return packageInfo.versionCode >= 105;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    public void m92e() {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.CLEAR_HEADSUPNOTIFICATION");
        Application application = (Application) bh.a("android.app.ActivityThread", "currentApplication", new Object[0]);
        String packageName = (application == null || application.getApplicationContext() == null) ? null : application.getApplicationContext().getPackageName();
        String packageName2 = this.f75a.getPackageName();
        if (TextUtils.isEmpty(packageName) || packageName.equals(packageName2)) {
            packageName = packageName2;
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("application package name: " + packageName + ", not equals context package name: " + packageName2);
        }
        m74a.putExtra(ay.I, packageName);
        c(m74a);
    }

    private Intent c() {
        if (m86a()) {
            com.xiaomi.channel.commonutils.logger.c.c("pushChannel app start miui china channel");
            return d();
        }
        com.xiaomi.channel.commonutils.logger.c.c("pushChannel app start  own channel");
        return e();
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m91d() {
        ArrayList<a> arrayList = f73a;
        synchronized (arrayList) {
            boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
            Iterator<a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a next = it2.next();
                a(next.f84a, next.a, next.f85a, false, null, true);
                if (!z) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            f73a.clear();
        }
    }

    public void b(int i) {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.SET_NOTIFICATION_TYPE");
        m74a.putExtra(ay.I, this.f75a.getPackageName());
        m74a.putExtra(ay.L, i);
        m74a.putExtra(ay.N, bl.b(this.f75a.getPackageName() + i));
        c(m74a);
    }

    public static synchronized u a(Context context) {
        u uVar;
        synchronized (u.class) {
            if (a == null) {
                a = new u(context);
            }
            uVar = a;
        }
        return uVar;
    }

    private synchronized int a() {
        return this.f75a.getSharedPreferences("mipush_extra", 0).getInt(Constants.EXTRA_KEY_BOOT_SERVICE_MODE, -1);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m90c() {
        if (this.f76a != null) {
            g();
            c(this.f76a);
            this.f76a = null;
        }
    }

    /* renamed from: d, reason: collision with other method in class */
    private boolean m80d() {
        if (m86a()) {
            try {
                return this.f75a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 108;
            } catch (Exception unused) {
            }
        }
        return true;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m89b() {
        if (!m86a() || !m81e()) {
            return true;
        }
        if (this.f79a == null) {
            Integer valueOf = Integer.valueOf(ba.a(this.f75a).a());
            this.f79a = valueOf;
            if (valueOf.intValue() == 0) {
                this.f75a.getContentResolver().registerContentObserver(ba.a(this.f75a).m775a(), false, new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.xiaomi.mipush.sdk.u.3
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z) {
                        u uVar = u.this;
                        uVar.f79a = Integer.valueOf(ba.a(uVar.f75a).a());
                        if (u.this.f79a.intValue() != 0) {
                            u.this.f75a.getContentResolver().unregisterContentObserver(this);
                            if (ax.m117a(u.this.f75a)) {
                                u.this.m90c();
                            }
                        }
                    }
                });
            }
        }
        return this.f79a.intValue() != 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m82a() {
        return this.f74a;
    }

    private void c(Intent intent) {
        aq a2 = aq.a(this.f75a);
        int a3 = hz.ServiceBootMode.a();
        hv hvVar = hv.START;
        int a4 = a2.a(a3, hvVar.a());
        int a5 = a();
        hv hvVar2 = hv.BIND;
        boolean z = a4 == hvVar2.a() && b;
        int a6 = z ? hvVar2.a() : hvVar.a();
        if (a6 != a5) {
            m87a(a6);
        }
        if (z) {
            d(intent);
        } else {
            b(intent);
        }
    }

    /* renamed from: e, reason: collision with other method in class */
    private boolean m81e() {
        String packageName = this.f75a.getPackageName();
        return packageName.contains("miui") || packageName.contains("xiaomi") || (this.f75a.getApplicationInfo().flags & 1) != 0;
    }

    public final void a(iu iuVar, boolean z) {
        eo.a(this.f75a.getApplicationContext()).a(this.f75a.getPackageName(), "E100003", iuVar.a(), AuthCode.StatusCode.WAITING_CONNECT, null);
        this.f76a = null;
        b.m41a(this.f75a).f47a = iuVar.a();
        Intent m74a = m74a();
        byte[] a2 = je.a(r.a(this.f75a, iuVar, hu.Registration));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("register fail, because msgBytes is null.");
            return;
        }
        m74a.setAction("com.xiaomi.mipush.REGISTER_APP");
        m74a.putExtra("mipush_app_id", b.m41a(this.f75a).m42a());
        m74a.putExtra("mipush_payload", a2);
        m74a.putExtra("mipush_session", this.f80a);
        m74a.putExtra("mipush_env_chanage", z);
        m74a.putExtra("mipush_env_type", b.m41a(this.f75a).a());
        if (ax.m117a(this.f75a) && m89b()) {
            g();
            c(m74a);
        } else {
            this.f76a = m74a;
        }
    }

    private synchronized void d(Intent intent) {
        if (this.f8972c) {
            Message a2 = a(intent);
            if (this.f81a.size() >= 50) {
                this.f81a.remove(0);
            }
            this.f81a.add(a2);
            return;
        }
        if (this.f78a == null) {
            this.f75a.bindService(intent, new ServiceConnection() { // from class: com.xiaomi.mipush.sdk.u.4
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    synchronized (u.this) {
                        u.this.f78a = new Messenger(iBinder);
                        u.this.f8972c = false;
                        Iterator it2 = u.this.f81a.iterator();
                        while (it2.hasNext()) {
                            try {
                                u.this.f78a.send((Message) it2.next());
                            } catch (RemoteException e2) {
                                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                            }
                        }
                        u.this.f81a.clear();
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    u.this.f78a = null;
                    u.this.f8972c = false;
                }
            }, 1);
            this.f8972c = true;
            this.f81a.clear();
            this.f81a.add(a(intent));
        } else {
            try {
                this.f78a.send(a(intent));
            } catch (RemoteException unused) {
                this.f78a = null;
                this.f8972c = false;
            }
        }
    }

    private void b(Intent intent) {
        try {
            if (!com.xiaomi.push.k.m654a()) {
                d(intent);
            } else {
                this.f75a.startService(intent);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m83a() {
        b(m74a());
    }

    public final void a(ja jaVar) {
        byte[] a2 = je.a(r.a(this.f75a, jaVar, hu.UnRegistration));
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("unregister fail, because msgBytes is null.");
            return;
        }
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.UNREGISTER_APP");
        m74a.putExtra("mipush_app_id", b.m41a(this.f75a).m42a());
        m74a.putExtra("mipush_payload", a2);
        c(m74a);
    }

    public final void a(boolean z) {
        a(z, (String) null);
    }

    public final void a(boolean z, String str) {
        if (z) {
            p a2 = p.a(this.f75a);
            v vVar = v.DISABLE_PUSH;
            a2.a(vVar, "syncing");
            p.a(this.f75a).a(v.ENABLE_PUSH, "");
            a(str, vVar, true, (HashMap<String, String>) null);
            return;
        }
        p a3 = p.a(this.f75a);
        v vVar2 = v.ENABLE_PUSH;
        a3.a(vVar2, "syncing");
        p.a(this.f75a).a(v.DISABLE_PUSH, "");
        a(str, vVar2, true, (HashMap<String, String>) null);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m84a(Context context) {
        if (com.xiaomi.push.k.m654a()) {
            return;
        }
        q a2 = h.a(context);
        if (q.HUAWEI.equals(a2)) {
            a((String) null, v.UPLOAD_HUAWEI_TOKEN, d.ASSEMBLE_PUSH_HUAWEI, "update");
        }
        if (q.OPPO.equals(a2)) {
            a((String) null, v.UPLOAD_COS_TOKEN, d.ASSEMBLE_PUSH_COS, "update");
        }
        if (q.VIVO.equals(a2)) {
            a((String) null, v.UPLOAD_FTOS_TOKEN, d.ASSEMBLE_PUSH_FTOS, "update");
        }
    }

    public final void a(String str, v vVar, d dVar, String str2) {
        p.a(this.f75a).a(vVar, "syncing");
        HashMap<String, String> m60a = f.m60a(this.f75a, dVar);
        m60a.put("third_sync_reason", str2);
        a(str, vVar, false, m60a);
    }

    void a(int i, String str) {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.thirdparty");
        m74a.putExtra("com.xiaomi.mipush.thirdparty_LEVEL", i);
        m74a.putExtra("com.xiaomi.mipush.thirdparty_DESC", str);
        b(m74a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, v vVar, boolean z, HashMap<String, String> hashMap) {
        it itVar;
        String str2 = str;
        if (b.m41a(this.f75a).m48b() && ax.m117a(this.f75a)) {
            it itVar2 = new it();
            itVar2.a(true);
            Intent m74a = m74a();
            if (TextUtils.isEmpty(str)) {
                str2 = as.a();
                itVar2.a(str2);
                itVar = z ? new it(str2, true) : null;
                synchronized (p.class) {
                    p.a(this.f75a).m70a(str2);
                }
            } else {
                itVar2.a(str2);
                itVar = z ? new it(str2, true) : null;
            }
            switch (AnonymousClass5.a[vVar.ordinal()]) {
                case 1:
                    ie ieVar = ie.DisablePushMessage;
                    itVar2.c(ieVar.f611a);
                    itVar.c(ieVar.f611a);
                    if (hashMap != null) {
                        itVar2.a(hashMap);
                        itVar.a(hashMap);
                    }
                    m74a.setAction("com.xiaomi.mipush.DISABLE_PUSH_MESSAGE");
                    break;
                case 2:
                    ie ieVar2 = ie.EnablePushMessage;
                    itVar2.c(ieVar2.f611a);
                    itVar.c(ieVar2.f611a);
                    if (hashMap != null) {
                        itVar2.a(hashMap);
                        itVar.a(hashMap);
                    }
                    m74a.setAction("com.xiaomi.mipush.ENABLE_PUSH_MESSAGE");
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    itVar2.c(ie.ThirdPartyRegUpdate.f611a);
                    if (hashMap != null) {
                        itVar2.a(hashMap);
                        break;
                    }
                    break;
            }
            com.xiaomi.channel.commonutils.logger.c.e("type:" + vVar + ", " + str2);
            itVar2.b(b.m41a(this.f75a).m42a());
            itVar2.d(this.f75a.getPackageName());
            hu huVar = hu.Notification;
            a((u) itVar2, huVar, false, (ih) null);
            if (z) {
                itVar.b(b.m41a(this.f75a).m42a());
                itVar.d(this.f75a.getPackageName());
                Context context = this.f75a;
                byte[] a2 = je.a(r.a(context, itVar, huVar, false, context.getPackageName(), b.m41a(this.f75a).m42a()));
                if (a2 != null) {
                    di.a(this.f75a.getPackageName(), this.f75a, itVar, huVar, a2.length);
                    m74a.putExtra("mipush_payload", a2);
                    m74a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
                    m74a.putExtra("mipush_app_id", b.m41a(this.f75a).m42a());
                    m74a.putExtra("mipush_app_token", b.m41a(this.f75a).b());
                    c(m74a);
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 19;
            int ordinal = vVar.ordinal();
            obtain.obj = str2;
            obtain.arg1 = ordinal;
            if (hashMap != null && hashMap.get("third_sync_reason") != null) {
                Bundle bundle = new Bundle();
                bundle.putString("third_sync_reason", hashMap.get("third_sync_reason"));
                obtain.setData(bundle);
            }
            this.f77a.sendMessageDelayed(obtain, com.heytap.mcssdk.constant.a.r);
        }
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, ih ihVar) {
        a((u) t, huVar, !huVar.equals(hu.Registration), ihVar);
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, ih ihVar, boolean z2) {
        a(t, huVar, z, true, ihVar, z2);
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, ih ihVar) {
        a(t, huVar, z, true, ihVar, true);
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, boolean z2, ih ihVar, boolean z3) {
        a(t, huVar, z, z2, ihVar, z3, this.f75a.getPackageName(), b.m41a(this.f75a).m42a());
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, boolean z2, ih ihVar, boolean z3, String str, String str2) {
        a(t, huVar, z, z2, ihVar, z3, str, str2, true);
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, boolean z2, ih ihVar, boolean z3, String str, String str2, boolean z4) {
        a(t, huVar, z, z2, ihVar, z3, str, str2, z4, true);
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, boolean z2, ih ihVar, boolean z3, String str, String str2, boolean z4, boolean z5) {
        a(t, huVar, z, z2, ihVar, z3, str, str2, z4, z5, "com.xiaomi.mipush.SEND_MESSAGE");
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, boolean z2, ih ihVar, boolean z3, String str, String str2, boolean z4, boolean z5, String str3) {
        a(t, huVar, z, z2, ihVar, ay.a.DEFAULT_CACHE, z3, str, str2, z4, z5, str3);
    }

    public final <T extends jf<T, ?>> void a(T t, hu huVar, boolean z, boolean z2, ih ihVar, ay.a aVar, boolean z3, String str, String str2, boolean z4, boolean z5, String str3) {
        iq b2;
        if (z5 && !b.m41a(this.f75a).m50c()) {
            if (z2) {
                a((u) t, huVar, z);
                return;
            } else {
                com.xiaomi.channel.commonutils.logger.c.m15a("drop the message before initialization.");
                return;
            }
        }
        if (z4) {
            b2 = r.a(this.f75a, t, huVar, z, str, str2);
        } else {
            b2 = r.b(this.f75a, t, huVar, z, str, str2);
        }
        if (ihVar != null) {
            b2.a(ihVar);
        }
        byte[] a2 = je.a(b2);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send message fail, because msgBytes is null.");
            return;
        }
        di.a(this.f75a.getPackageName(), this.f75a, t, huVar, a2.length);
        Intent m74a = m74a();
        m74a.setAction(str3);
        m74a.putExtra("mipush_payload", a2);
        m74a.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", z3);
        m74a.putExtra("mipush_message_cache_collection", aVar.f1070a);
        c(m74a);
    }

    public final void a(hy hyVar) {
        Intent m74a = m74a();
        byte[] a2 = je.a(hyVar);
        if (a2 == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send TinyData failed, because tinyDataBytes is null.");
            return;
        }
        m74a.setAction("com.xiaomi.mipush.SEND_TINYDATA");
        m74a.putExtra("mipush_payload", a2);
        b(m74a);
    }

    /* renamed from: a, reason: collision with other method in class */
    private Intent m74a() {
        if (m86a() && !"com.xiaomi.xmsf".equals(this.f75a.getPackageName())) {
            return d();
        }
        return e();
    }

    /* renamed from: a, reason: collision with other method in class */
    private String m77a() {
        String str = this.f83b;
        if (str != null) {
            return str;
        }
        try {
            if (this.f75a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106) {
                this.f83b = "com.xiaomi.push.service.XMPushService";
                return "com.xiaomi.push.service.XMPushService";
            }
        } catch (Exception unused) {
        }
        this.f83b = "com.xiaomi.xmsf.push.service.XMPushService";
        return "com.xiaomi.xmsf.push.service.XMPushService";
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m86a() {
        return this.f82a && 1 == b.m41a(this.f75a).a();
    }

    public <T extends jf<T, ?>> void a(T t, hu huVar, boolean z) {
        a aVar = new a();
        aVar.f84a = t;
        aVar.a = huVar;
        aVar.f85a = z;
        ArrayList<a> arrayList = f73a;
        synchronized (arrayList) {
            arrayList.add(aVar);
            if (arrayList.size() > 10) {
                arrayList.remove(0);
            }
        }
    }

    public void a(int i) {
        a(i, 0);
    }

    void a(int i, int i2) {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m74a.putExtra(ay.I, this.f75a.getPackageName());
        m74a.putExtra(ay.f9325J, i);
        m74a.putExtra(ay.K, i2);
        c(m74a);
    }

    public void a(String str, String str2) {
        Intent m74a = m74a();
        m74a.setAction("com.xiaomi.mipush.CLEAR_NOTIFICATION");
        m74a.putExtra(ay.I, this.f75a.getPackageName());
        m74a.putExtra(ay.O, str);
        m74a.putExtra(ay.P, str2);
        c(m74a);
    }

    /* renamed from: a, reason: collision with other method in class */
    void m85a(Intent intent) {
        intent.fillIn(m74a(), 24);
        c(intent);
    }

    private Message a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m87a(int i) {
        if (!b.m41a(this.f75a).m48b()) {
            return false;
        }
        c(i);
        it itVar = new it();
        itVar.a(as.a());
        itVar.b(b.m41a(this.f75a).m42a());
        itVar.d(this.f75a.getPackageName());
        itVar.c(ie.ClientABTest.f611a);
        HashMap hashMap = new HashMap();
        itVar.f750a = hashMap;
        hashMap.put("boot_mode", i + "");
        a(this.f75a).a((u) itVar, hu.Notification, false, (ih) null);
        return true;
    }
}
