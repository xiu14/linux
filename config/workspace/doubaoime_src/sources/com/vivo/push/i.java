package com.vivo.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.vivo.push.util.ah;
import com.vivo.vms.IPCInvoke;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class i implements ServiceConnection {
    private static final Object a = new Object();
    private static Map<String, i> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8838c;

    /* renamed from: d, reason: collision with root package name */
    private String f8839d;

    /* renamed from: e, reason: collision with root package name */
    private Context f8840e;

    /* renamed from: g, reason: collision with root package name */
    private volatile IPCInvoke f8842g;
    private String i;
    private Handler j;
    private Object h = new Object();

    /* renamed from: f, reason: collision with root package name */
    private AtomicInteger f8841f = new AtomicInteger(1);

    private i(Context context, String str) {
        this.f8839d = null;
        this.j = null;
        this.f8840e = context;
        this.i = str;
        this.j = new Handler(Looper.getMainLooper(), new j(this));
        String a2 = com.vivo.push.util.aa.a(context);
        this.f8839d = a2;
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(this.i)) {
            this.f8838c = ah.a(context, this.f8839d) >= 1260;
            b();
            return;
        }
        com.vivo.push.util.t.c(this.f8840e, "init error : push pkgname is " + this.f8839d + " ; action is " + this.i);
        this.f8838c = false;
    }

    private void d() {
        this.j.removeMessages(1);
        this.j.sendEmptyMessageDelayed(1, WsConstants.EXIT_DELAY_TIME);
    }

    private void e() {
        this.j.removeMessages(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        try {
            this.f8840e.unbindService(this);
        } catch (Exception e2) {
            e.a.a.a.a.h0(e2, new StringBuilder("On unBindServiceException:"), "AidlManager");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.vivo.push.util.t.b("AidlManager", "onBindingDied : ".concat(String.valueOf(componentName)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        e();
        this.f8842g = IPCInvoke.Stub.asInterface(iBinder);
        if (this.f8842g == null) {
            com.vivo.push.util.t.d("AidlManager", "onServiceConnected error : aidl must not be null.");
            f();
            this.f8841f.set(1);
            return;
        }
        if (this.f8841f.get() == 2) {
            a(4);
        } else if (this.f8841f.get() != 4) {
            f();
        }
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8842g = null;
        a(1);
    }

    public static i a(Context context, String str) {
        i iVar;
        i iVar2 = b.get(str);
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (a) {
            iVar = b.get(str);
            if (iVar == null) {
                iVar = new i(context, str);
                b.put(str, iVar);
            }
        }
        return iVar;
    }

    private void b() {
        int i = this.f8841f.get();
        com.vivo.push.util.t.d("AidlManager", "Enter connect, Connection Status: ".concat(String.valueOf(i)));
        if (i == 4 || i == 2 || i == 3 || i == 5 || !this.f8838c) {
            return;
        }
        a(2);
        if (c()) {
            d();
        } else {
            a(1);
            com.vivo.push.util.t.a("AidlManager", "bind core service fail");
        }
    }

    private boolean c() {
        Intent intent = new Intent(this.i);
        intent.setPackage(this.f8839d);
        try {
            return this.f8840e.bindService(intent, this, 1);
        } catch (Exception e2) {
            com.vivo.push.util.t.a("AidlManager", "bind core error", e2);
            return false;
        }
    }

    public final boolean a() {
        String a2 = com.vivo.push.util.aa.a(this.f8840e);
        this.f8839d = a2;
        if (TextUtils.isEmpty(a2)) {
            com.vivo.push.util.t.c(this.f8840e, "push pkgname is null");
            return false;
        }
        boolean z = ah.a(this.f8840e, this.f8839d) >= 1260;
        this.f8838c = z;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.f8841f.set(i);
    }

    public final boolean a(Bundle bundle) {
        b();
        if (this.f8841f.get() == 2) {
            synchronized (this.h) {
                try {
                    this.h.wait(2000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        try {
            int i = this.f8841f.get();
            if (i == 4) {
                this.j.removeMessages(2);
                this.j.sendEmptyMessageDelayed(2, 30000L);
                this.f8842g.asyncCall(bundle, null);
                return true;
            }
            com.vivo.push.util.t.d("AidlManager", "invoke error : connect status = ".concat(String.valueOf(i)));
            return false;
        } catch (Exception e3) {
            com.vivo.push.util.t.a("AidlManager", "invoke error ", e3);
            int i2 = this.f8841f.get();
            com.vivo.push.util.t.d("AidlManager", "Enter disconnect, Connection Status: ".concat(String.valueOf(i2)));
            if (i2 == 2) {
                e();
                a(1);
                return false;
            }
            if (i2 == 3) {
                a(1);
                return false;
            }
            if (i2 != 4) {
                return false;
            }
            a(1);
            f();
            return false;
        }
    }
}
