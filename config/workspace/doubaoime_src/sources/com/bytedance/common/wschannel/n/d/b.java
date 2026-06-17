package com.bytedance.common.wschannel.n.d;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import com.bytedance.common.wschannel.n.c;
import com.huawei.hms.framework.common.ContainerUtils;
import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.B;

/* loaded from: classes.dex */
public class b extends com.bytedance.common.wschannel.n.a<com.bytedance.common.wschannel.n.d.a> {
    private c b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f4304c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f4305d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f4306e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f4307f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f4305d.getAndSet(false)) {
                b.h(b.this);
                if (b.this.b != null) {
                    Logger.d("WsChannelSdk_ok", "heartbeat timeout，ready to close connection");
                    b.this.b.a();
                }
            }
        }
    }

    /* renamed from: com.bytedance.common.wschannel.n.d.b$b, reason: collision with other inner class name */
    class RunnableC0188b implements Runnable {
        RunnableC0188b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.b != null) {
                b.this.k();
                b.this.b.b();
            }
        }
    }

    public b(com.bytedance.common.wschannel.n.d.a aVar) {
        super(aVar);
        this.f4305d = new AtomicBoolean(false);
        this.f4306e = new a();
        this.f4307f = new RunnableC0188b();
    }

    static void h(b bVar) {
        bVar.f4304c.removeCallbacks(bVar.f4306e);
        bVar.f4304c.removeCallbacks(bVar.f4307f);
        bVar.f4305d.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        long a2 = ((com.bytedance.common.wschannel.n.d.a) this.a).a();
        StringBuilder Q = e.a.a.a.a.Q("interval :", a2, " ms,the next time to send heartbeat is ");
        Q.append(DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + a2)));
        Logger.d("WsChannelSdk_ok", Q.toString());
        this.f4304c.removeCallbacks(this.f4307f);
        this.f4304c.postDelayed(this.f4307f, a2);
    }

    private void l(B b) {
        long j;
        if (((com.bytedance.common.wschannel.n.d.a) this.a).a() != -1) {
            return;
        }
        if (b == null) {
            ((com.bytedance.common.wschannel.n.d.a) this.a).d(270000L);
            return;
        }
        String p = b.p("Handshake-Options");
        if (p != null) {
            String[] split = p.split(";");
            int length = split.length;
            j = -1;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = split[i];
                if (!TextUtils.isEmpty(str)) {
                    String[] split2 = str.split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if ("ping-interval".equals(split2[0])) {
                        try {
                            j = Long.parseLong(split2[1]) * 1000;
                            break;
                        } catch (NumberFormatException unused) {
                            j = 270000;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
        } else {
            j = -1;
        }
        if (j == -1) {
            ((com.bytedance.common.wschannel.n.d.a) this.a).d(270000L);
        } else {
            ((com.bytedance.common.wschannel.n.d.a) this.a).d(j);
        }
    }

    @Override // com.bytedance.common.wschannel.n.a
    public void a(c cVar, Handler handler) {
        this.b = cVar;
        this.f4304c = handler;
    }

    @Override // com.bytedance.common.wschannel.n.a
    public void b(AppState appState) {
    }

    @Override // com.bytedance.common.wschannel.n.a
    public void c(B b) {
        Logger.d("WsChannelSdk_ok", "connect success，ready to send ping");
        l(b);
        k();
    }

    @Override // com.bytedance.common.wschannel.n.a
    public void d() {
        Logger.d("WsChannelSdk_ok", "disconnected，stop to send ping");
        this.f4304c.removeCallbacks(this.f4306e);
        this.f4304c.removeCallbacks(this.f4307f);
        this.f4305d.set(false);
    }

    @Override // com.bytedance.common.wschannel.n.a
    public void e() {
        Logger.d("WsChannelSdk_ok", "ping sent，waiting for pong");
        this.f4305d.set(true);
        this.f4304c.removeCallbacks(this.f4306e);
        this.f4304c.postDelayed(this.f4306e, ((com.bytedance.common.wschannel.n.d.a) this.a).b());
    }

    @Override // com.bytedance.common.wschannel.n.a
    public void f() {
        Logger.d("WsChannelSdk_ok", "receive pong");
        this.f4305d.set(false);
        this.f4304c.removeCallbacks(this.f4306e);
    }
}
