package com.xiaomi.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class eu {
    private Handler a;

    /* renamed from: a, reason: collision with other field name */
    private HandlerThread f390a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicBoolean f391a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicInteger f392a;

    /* renamed from: a, reason: collision with other field name */
    private final AtomicReference<ew> f393a;
    private final AtomicBoolean b;

    /* renamed from: b, reason: collision with other field name */
    private final AtomicInteger f394b;

    /* renamed from: b, reason: collision with other field name */
    private final AtomicReference<String> f395b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9080c;

    /* renamed from: c, reason: collision with other field name */
    private final AtomicReference<String> f396c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9081d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f9082e;

    private static class a {
        private static final eu a = new eu();
    }

    private void b(ew ewVar, ew ewVar2, String str) {
        if (ewVar == null || ewVar2 == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (TextUtils.equals("startModemKeepAliveTimeOut", str)) {
                es.a().m360a();
                es.a().b(ewVar.mo373a(), "startModemKeepAliveTimeOut");
                es.a().e();
            }
            if (ewVar instanceof ey) {
                ep.a().j();
            } else if (ewVar2 instanceof ey) {
                ep.a().i();
            }
            if ((ewVar instanceof fc) && !(ewVar2 instanceof fd)) {
                ep.a().g();
            } else if ((ewVar2 instanceof fc) || (ewVar2 instanceof fd)) {
                ep.a().h();
            }
            ep.a().a(ewVar, ewVar2, str);
        } catch (Throwable th) {
            e.a.a.a.a.w0("[stat] exception occurred when record state change, exception: ", th, "HwKaMgr");
        }
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m369c() {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).mo378c();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when socket receive msg, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void d() {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.12
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).d();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when start ping, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void e() {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.13
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).e();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when stop ping, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void f() {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).f();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when fail too much, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void g() {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).g();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when start modem keep alive time out, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    private eu() {
        this.f393a = new AtomicReference<>(new fd());
        this.f395b = new AtomicReference<>();
        this.f392a = new AtomicInteger();
        this.f396c = new AtomicReference<>();
        this.f394b = new AtomicInteger();
        this.f391a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.f9080c = new AtomicBoolean(et.c());
        this.f9081d = new AtomicBoolean(ax.m116a());
        this.f9082e = new AtomicBoolean(et.a());
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m364a() {
        return this.f393a.get().mo373a();
    }

    public void a(ew ewVar, ew ewVar2, String str) {
        if (ewVar2 == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stateSwitch] state change failed, nextState is empty");
            return;
        }
        if (ewVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stateSwitch] state change failed, expectState is empty");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stateSwitch] state change failed, event is empty");
            return;
        }
        try {
            String mo373a = ewVar.mo373a();
            String mo373a2 = ewVar2.mo373a();
            if (ewVar.getClass() == ewVar2.getClass()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stateSwitch] switch state failed, because same state: " + mo373a + "->" + mo373a2 + " event:" + str);
                return;
            }
            if (this.f393a.compareAndSet(ewVar, ewVar2)) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[stateSwitch] switch state: " + mo373a + "->" + mo373a2 + " event:" + str);
                ewVar.a(ewVar2);
                ewVar2.b(ewVar);
            } else {
                com.xiaomi.channel.commonutils.logger.c.c("HwKaMgr", "[stateSwitch] switch state failed, because expect state: " + mo373a + " current:" + this.f393a.get().mo373a());
            }
            fk.b();
            b(ewVar, ewVar2, str);
        } catch (Throwable th) {
            e.a.a.a.a.w0("[stateSwitch] exception occurred in changing state, exception: ", th, "HwKaMgr");
        }
    }

    public void c(final boolean z) {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).c(z);
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[network]  exception occurred when mobile network changed, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void d(final boolean z) {
        if (this.a == null) {
            return;
        }
        this.f391a.set(z);
        this.a.post(new Runnable() { // from class: com.xiaomi.push.eu.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).d(z);
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when update fall down state, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public String c() {
        return this.f396c.get();
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m368b() {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).mo376b();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when socket send msg, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void b(final boolean z) {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.15
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).b(z);
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when cloud config change, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void b(final String str) {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).b(str);
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when modem keep alive callback error, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m365a() {
        if (this.a == null) {
            HandlerThread handlerThread = new HandlerThread(eu.class.getSimpleName());
            this.f390a = handlerThread;
            handlerThread.start();
            this.a = new Handler(this.f390a.getLooper());
        }
        this.a.post(new Runnable() { // from class: com.xiaomi.push.eu.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).mo374a();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when init, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m367b() {
        return this.f395b.get();
    }

    public int b() {
        return this.f394b.get();
    }

    public void a(final Socket socket) {
        if (this.a == null) {
            return;
        }
        if (socket == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] socket is null when socket connected");
            return;
        }
        InetAddress localAddress = socket.getLocalAddress();
        InetAddress inetAddress = socket.getInetAddress();
        if (localAddress != null && inetAddress != null) {
            this.b.set(true);
            this.f395b.set(localAddress.getHostAddress());
            this.f392a.set(socket.getLocalPort());
            this.f396c.set(inetAddress.getHostAddress());
            this.f394b.set(socket.getPort());
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] update address info, source=" + this.f395b.get() + Constants.COLON_SEPARATOR + this.f392a.get() + ", target=" + this.f396c.get() + Constants.COLON_SEPARATOR + this.f394b.get());
            this.a.post(new Runnable() { // from class: com.xiaomi.push.eu.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ((ew) eu.this.f393a.get()).a(socket);
                        ep.a().m355a();
                    } catch (Throwable th) {
                        e.a.a.a.a.w0("[socket]  exception occurred when socket connected, exception: ", th, "HwKaMgr");
                    }
                }
            });
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[socket] local address or inet address is null when socket connected");
    }

    public void a(final int i, final Exception exc, final boolean z) {
        if (this.a == null) {
            return;
        }
        this.b.set(false);
        this.a.post(new Runnable() { // from class: com.xiaomi.push.eu.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).a(i, exc, z);
                    ep.a().c();
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[socket]  exception occurred when socket closed, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void a(final boolean z) {
        if (this.a == null) {
            return;
        }
        this.f9080c.set(z);
        this.a.post(new Runnable() { // from class: com.xiaomi.push.eu.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).a(z);
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when super power mode change, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    public void a(final String str) {
        Handler handler = this.a;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.xiaomi.push.eu.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((ew) eu.this.f393a.get()).a(str);
                } catch (Throwable th) {
                    e.a.a.a.a.w0("[stateContext]  exception occurred when modem keep alive callback success, exception: ", th, "HwKaMgr");
                }
            }
        });
    }

    void a(ay ayVar) {
        try {
            this.f9082e.set(et.a());
            this.f9081d.set(ax.e(ayVar));
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[network] network is change. isMobileNetworkConnected:" + this.f9081d.get());
            c(this.f9081d.get());
            ep.a().a(ayVar);
        } catch (Throwable th) {
            e.a.a.a.a.w0("[network]  exception occurred when network changed, exception: ", th, "HwKaMgr");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m363a() {
        return this.f392a.get();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m366a() {
        try {
            if (!ev.a().m371a()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: not supported");
                return false;
            }
            if (!this.b.get()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: socket is closed");
                return false;
            }
            if (es.a().m361a()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: fail too much");
                return false;
            }
            if (this.f391a.get()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: fall down");
                return false;
            }
            if (!et.b()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: cloud config is not enable");
                return false;
            }
            if (!this.f9081d.get()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason:mobile network is disconnected");
                return false;
            }
            if (this.f9080c.get()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: super power mode enable");
                return false;
            }
            if (!this.f9082e.get()) {
                com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Unavailable. reason: data card not supported");
                return false;
            }
            com.xiaomi.channel.commonutils.logger.c.m16a("HwKaMgr", "[Available] MdKa is Available.");
            return true;
        } catch (Throwable th) {
            e.a.a.a.a.w0("[Available]  exception occurred when check keep alive function availability, exception: ", th, "HwKaMgr");
            return false;
        }
    }

    public boolean a(Class<? extends ew> cls) {
        if (cls == null) {
            return false;
        }
        return cls.isInstance(this.f393a.get());
    }

    public static eu a() {
        return a.a;
    }
}
