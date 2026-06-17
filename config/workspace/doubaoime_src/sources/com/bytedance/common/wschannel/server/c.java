package com.bytedance.common.wschannel.server;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.AbsWsClientService;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class c {
    private final InterfaceC0190c a;
    private final Class<? extends AbsWsClientService> b;

    private class b implements InterfaceC0190c {
        private final Context a;

        b(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.common.wschannel.server.c.InterfaceC0190c
        public void a(Intent intent) {
            try {
                intent.setComponent(new ComponentName(this.a, (Class<?>) c.this.b));
                this.a.startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.bytedance.common.wschannel.server.c.InterfaceC0190c
        public void c() {
        }
    }

    /* renamed from: com.bytedance.common.wschannel.server.c$c, reason: collision with other inner class name */
    public interface InterfaceC0190c {
        void a(Intent intent);

        void c();
    }

    private class d implements InterfaceC0190c {
        private final Context a;
        private Messenger b;

        /* renamed from: d, reason: collision with root package name */
        private ServiceConnection f4320d;

        /* renamed from: c, reason: collision with root package name */
        private final LinkedBlockingDeque<Intent> f4319c = new LinkedBlockingDeque<>();

        /* renamed from: e, reason: collision with root package name */
        private boolean f4321e = false;

        /* renamed from: f, reason: collision with root package name */
        private final Object f4322f = new Object();

        /* renamed from: g, reason: collision with root package name */
        private final Runnable f4323g = new a();
        private final Runnable h = new b();
        final AtomicInteger i = new AtomicInteger(0);

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (d.this.f4322f) {
                    Logger.d("WsChannelSdk", "mBindServiceTimeoutRunnable run");
                    if (d.this.f4321e) {
                        d.this.f4321e = false;
                    }
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (d.this.f4322f) {
                    try {
                        if (d.this.f4320d != null) {
                            Context context = d.this.a;
                            Class cls = c.this.b;
                            boolean z = false;
                            if (context != null && cls != null) {
                                try {
                                    Iterator<ActivityManager.RunningServiceInfo> it2 = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        ActivityManager.RunningServiceInfo next = it2.next();
                                        if (next != null && next.service != null && TextUtils.equals(cls.getName(), next.service.getClassName())) {
                                            z = true;
                                            break;
                                        }
                                    }
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            if (z) {
                                d.this.a.unbindService(d.this.f4320d);
                            }
                        }
                    } finally {
                        d.g(d.this, null);
                        d.this.b = null;
                        Logger.d("WsChannelSdk", "mDisconnectRunnable timeout");
                    }
                    d.g(d.this, null);
                    d.this.b = null;
                    Logger.d("WsChannelSdk", "mDisconnectRunnable timeout");
                }
            }
        }

        /* renamed from: com.bytedance.common.wschannel.server.c$d$c, reason: collision with other inner class name */
        private class ServiceConnectionC0191c implements ServiceConnection {
            ServiceConnectionC0191c(a aVar) {
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (Logger.debug()) {
                    StringBuilder M = e.a.a.a.a.M("onServiceConnected name = ");
                    M.append(componentName.toString());
                    Logger.d("WsChannelSdk", M.toString());
                }
                synchronized (d.this.f4322f) {
                    d.this.o();
                    if (componentName == null || iBinder == null) {
                        return;
                    }
                    try {
                        d.this.b = new Messenger(iBinder);
                        Logger.d("WsChannelSdk", "onServiceConnected set service");
                        d.this.n();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    Logger.d("WsChannelSdk", "onServiceConnected, set Unbind = false");
                    d.this.f4321e = false;
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                if (Logger.debug()) {
                    StringBuilder M = e.a.a.a.a.M("onServiceDisconnected name = ");
                    M.append(componentName.toString());
                    Logger.d("WsChannelSdk", M.toString());
                }
                synchronized (d.this.f4322f) {
                    if (componentName == null) {
                        return;
                    }
                    Logger.d("WsChannelSdk", "onServiceDisconnected set service = null");
                    d.this.b = null;
                    d.g(d.this, null);
                    Logger.d("WsChannelSdk", "onServiceDisconnected, set Unbind = false");
                    d.this.f4321e = false;
                    d.this.p();
                    d.this.o();
                }
            }
        }

        d(Context context) {
            this.a = context;
        }

        static /* synthetic */ ServiceConnection g(d dVar, ServiceConnection serviceConnection) {
            dVar.f4320d = null;
            return null;
        }

        private void m() {
            if (Logger.debug()) {
                Logger.d("WsChannelSdk", "doBindService");
            }
            try {
                this.a.startService(new Intent(this.a, (Class<?>) c.this.b));
            } catch (Throwable unused) {
            }
            try {
                this.f4320d = new ServiceConnectionC0191c(null);
                this.a.bindService(new Intent(this.a, (Class<?>) c.this.b), this.f4320d, 1);
                o();
                com.bytedance.common.wschannel.e.b().a().postDelayed(this.f4323g, TimeUnit.SECONDS.toMillis(7L));
                this.f4321e = true;
                Logger.d("WsChannelSdk", "doBindService, set mBinding = true");
            } catch (Throwable th) {
                o();
                this.f4321e = false;
                Logger.d("WsChannelSdk", "doBindService error, set Unbind = false");
                th.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n() {
            while (this.f4319c.peek() != null) {
                try {
                    Intent poll = this.f4319c.poll();
                    if (poll == null) {
                        return;
                    }
                    try {
                        q(poll);
                    } catch (DeadObjectException unused) {
                        Logger.d("WsChannelSdk", "onServiceConnected DeadObjectException");
                        this.b = null;
                        this.f4319c.offerFirst(poll);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return;
                }
            }
            synchronized (this) {
                p();
                com.bytedance.common.wschannel.e.b().a().postDelayed(this.h, TimeUnit.SECONDS.toMillis(10L));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o() {
            com.bytedance.common.wschannel.e.b().a().removeCallbacks(this.f4323g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p() {
            try {
                com.bytedance.common.wschannel.e.b().a().removeCallbacks(this.h);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        private void q(Intent intent) throws RemoteException {
            if (Logger.debug()) {
                Logger.d("WsChannelSdk", "sendMsg msg = " + intent);
            }
            Messenger messenger = this.b;
            Message message = new Message();
            message.what = WsConstants.MSG_INTENT;
            message.getData().putParcelable(WsConstants.DATA_INTENT, intent);
            if (messenger == null) {
                return;
            }
            messenger.send(message);
        }

        @Override // com.bytedance.common.wschannel.server.c.InterfaceC0190c
        public void a(Intent intent) {
            if (intent == null) {
                return;
            }
            if (Logger.debug()) {
                intent.putExtra(WsConstants.MSG_COUNT, this.i.addAndGet(1));
            }
            synchronized (this.f4322f) {
                p();
                this.f4319c.offer(intent);
                if (this.b != null) {
                    n();
                } else if (this.f4321e) {
                } else {
                    m();
                }
            }
        }

        @Override // com.bytedance.common.wschannel.server.c.InterfaceC0190c
        public void c() {
            if (this.f4319c.size() <= 0 || this.b != null) {
                return;
            }
            Logger.d("WsChannelSdk", "tryResendMsg try reconnect");
            synchronized (this.f4322f) {
                if (this.f4319c.size() > 0 && this.b == null) {
                    m();
                }
            }
        }
    }

    public c(Context context, Class<? extends AbsWsClientService> cls) {
        if (context.getApplicationInfo().targetSdkVersion >= 26) {
            this.a = new d(context);
        } else {
            this.a = new b(context);
        }
        this.b = cls;
    }

    public void b(Intent intent) {
        this.a.a(intent);
    }

    public void c() {
        this.a.c();
    }
}
