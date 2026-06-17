package com.bytedance.common.wschannel.n;

import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b {
    private AppState a;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.common.wschannel.channel.c.a.i.b f4300c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC0186b f4301d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f4302e;
    private AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private Runnable f4303f = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.b.getAndSet(false)) {
                Logger.d("WsChannelSdk_ok", "Compensate for ping timeout, prepare to reconnect");
                if (b.this.f4301d != null) {
                    b.this.f4301d.a();
                }
            }
        }
    }

    /* renamed from: com.bytedance.common.wschannel.n.b$b, reason: collision with other inner class name */
    public interface InterfaceC0186b {
        void a();
    }

    public b(InterfaceC0186b interfaceC0186b, Handler handler) {
        this.f4301d = interfaceC0186b;
        this.f4302e = handler;
    }

    public boolean c() {
        return this.b.get();
    }

    public void d() {
        Logger.d("WsChannelSdk_ok", "After compensating for ping, received pong");
        this.b.set(false);
        this.f4302e.removeCallbacks(this.f4303f);
    }

    public void e(com.bytedance.common.wschannel.channel.c.a.i.b bVar) {
        this.f4300c = bVar;
    }

    public void f(AppState appState) {
        if (!this.b.get()) {
            boolean z = false;
            if (this.a == AppState.STATE_BACKGROUND && appState == AppState.STATE_FOREGROUND) {
                Logger.d("WsChannelSdk_ok", "Switch the foreground in the background, send compensation ping");
                z = true;
            }
            if (z) {
                try {
                    com.bytedance.common.wschannel.channel.c.a.i.b bVar = this.f4300c;
                    if (bVar != null) {
                        ((com.bytedance.common.wschannel.channel.c.a.i.a) bVar).t();
                        this.b.set(true);
                        this.f4302e.removeCallbacks(this.f4303f);
                        this.f4302e.postDelayed(this.f4303f, com.heytap.mcssdk.constant.a.r);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        this.a = appState;
    }
}
