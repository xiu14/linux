package com.bytedance.common.wschannel.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.j;
import com.bytedance.common.wschannel.server.WsChannelService;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
public class k implements j {

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<Context> f4245d;

    /* renamed from: e, reason: collision with root package name */
    Messenger f4246e;
    private final Runnable a = new a();
    private long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f4244c = 0;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedBlockingDeque<j.a> f4247f = new LinkedBlockingDeque<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            if (kVar.f4246e == null) {
                k.e(kVar, 1, SystemClock.uptimeMillis() - k.this.b);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ Context a;

        b(k kVar, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.a.startService(new Intent(this.a, (Class<?>) WsChannelService.class));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        c(k kVar, Context context, int i) {
            this.a = context;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentName componentName = new ComponentName(this.a, (Class<?>) WsChannelService.class);
                Intent intent = new Intent(WsConstants.APP_STATE_ACTION);
                intent.setComponent(componentName);
                intent.putExtra(WsConstants.KEY_APP_STATE, this.b);
                this.a.startService(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (componentName == null || iBinder == null) {
                return;
            }
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("onServiceConnected name = ");
                M.append(componentName.toString());
                M.append(", ");
                M.append(false);
                Logger.d("WsChannelSdk", M.toString());
            }
            try {
                Messenger messenger = new Messenger(iBinder);
                k kVar = k.this;
                kVar.f4246e = messenger;
                k.i(kVar, componentName);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            k.this.f4244c = SystemClock.uptimeMillis();
            k.e(k.this, 0, SystemClock.uptimeMillis() - k.this.b);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (componentName == null) {
                return;
            }
            if (Logger.debug()) {
                StringBuilder M = e.a.a.a.a.M("onServiceDisconnected name = ");
                M.append(componentName.toString());
                Logger.d("WsChannelSdk", M.toString());
            }
            try {
                k kVar = k.this;
                kVar.f4246e = null;
                kVar.f4247f.clear();
                synchronized (k.this) {
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            k.e(k.this, 2, SystemClock.uptimeMillis() - k.this.f4244c);
        }
    }

    static void e(k kVar, int i, long j) {
        Objects.requireNonNull(kVar);
        com.bytedance.common.wschannel.app.a bindWsChannelServiceListener = WsConstants.getBindWsChannelServiceListener();
        if (bindWsChannelServiceListener == null) {
            return;
        }
        bindWsChannelServiceListener.a(i, j);
    }

    static void i(k kVar, ComponentName componentName) {
        synchronized (kVar) {
            if (kVar.f4246e == null) {
                kVar.l(componentName);
            } else {
                kVar.m(componentName);
            }
        }
    }

    private void l(ComponentName componentName) {
        WeakReference<Context> weakReference = this.f4245d;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        Context context = weakReference.get();
        if (Logger.debug()) {
            Logger.d("WsChannelSdk", "doBindService");
        }
        if (componentName == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(componentName);
            context.startService(intent);
        } catch (Throwable unused) {
        }
        try {
            Intent intent2 = new Intent();
            intent2.setComponent(componentName);
            d dVar = new d();
            this.b = SystemClock.uptimeMillis();
            if (WsConstants.getBindWsChannelServiceListener() != null) {
                com.bytedance.common.wschannel.e.b().a().postDelayed(this.a, com.heytap.mcssdk.constant.a.q);
            }
            context.bindService(intent2, dVar, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void m(ComponentName componentName) {
        j.a poll;
        if (componentName == null) {
            return;
        }
        while (this.f4247f.peek() != null && (poll = this.f4247f.poll()) != null) {
            try {
                Message message = new Message();
                message.what = poll.a;
                message.getData().putParcelable(null, null);
                try {
                    try {
                        o(componentName, message);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (DeadObjectException unused) {
                    this.f4246e = null;
                    this.f4247f.offerFirst(poll);
                    long uptimeMillis = SystemClock.uptimeMillis() - this.f4244c;
                    com.bytedance.common.wschannel.app.a bindWsChannelServiceListener = WsConstants.getBindWsChannelServiceListener();
                    if (bindWsChannelServiceListener == null) {
                        return;
                    }
                    bindWsChannelServiceListener.a(3, uptimeMillis);
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    private void n(Context context, int i) {
        if (context == null || i <= 0 || i > 3) {
            return;
        }
        WeakReference<Context> weakReference = this.f4245d;
        if (weakReference == null || weakReference.get() == null) {
            this.f4245d = new WeakReference<>(context.getApplicationContext());
        }
        if (Logger.debug()) {
            Logger.d("WsChannelSdk", "sendAppState appState = " + i);
        }
        if (com.bytedance.common.wschannel.k.e(context).f()) {
            com.bytedance.common.utility.h.c.b(new c(this, context, i));
        }
    }

    private void o(ComponentName componentName, Message message) throws RemoteException {
        if (Logger.debug()) {
            StringBuilder M = e.a.a.a.a.M("sendMsg msg = ");
            M.append(message.toString());
            M.append(" , + what = ");
            e.a.a.a.a.D0(M, message.what, "WsChannelSdk");
        }
        Messenger messenger = this.f4246e;
        if (messenger == null) {
            return;
        }
        messenger.send(message);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public void a(Context context, boolean z, boolean z2) {
        if (z) {
            com.bytedance.common.utility.h.c.b(new l(this, context, z2));
        } else {
            com.bytedance.common.utility.h.c.b(new b(this, context));
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public void b(Context context) {
        n(context, 2);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public void c(Context context) {
        n(context, 1);
    }
}
