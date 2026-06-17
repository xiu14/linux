package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ai {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f94a;

    /* renamed from: a, reason: collision with other field name */
    private a f95a;

    /* renamed from: a, reason: collision with other field name */
    private volatile b f96a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f97a;
    private final boolean b;

    public static abstract class b {
        public void a() {
        }

        public abstract void b();

        /* renamed from: c */
        public void mo256c() {
        }
    }

    public ai() {
        this(false);
    }

    private class a extends Thread {

        /* renamed from: a, reason: collision with other field name */
        private final LinkedBlockingQueue<b> f99a;

        public a() {
            super("PackageProcessor");
            this.f99a = new LinkedBlockingQueue<>();
        }

        public void a(b bVar) {
            try {
                this.f99a.add(bVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = ai.this.a > 0 ? ai.this.a : LocationRequestCompat.PASSIVE_INTERVAL;
            while (!ai.this.f97a) {
                try {
                    b poll = this.f99a.poll(j, TimeUnit.SECONDS);
                    ai.this.f96a = poll;
                    if (poll != null) {
                        a(0, poll);
                        poll.b();
                        a(1, poll);
                    } else if (ai.this.a > 0) {
                        ai.this.a();
                    }
                } catch (InterruptedException e2) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                }
            }
        }

        private void a(int i, b bVar) {
            try {
                ai.this.f94a.sendMessage(ai.this.f94a.obtainMessage(i, bVar));
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            }
        }
    }

    public ai(boolean z) {
        this(z, 0);
    }

    public ai(boolean z, int i) {
        this.f94a = null;
        this.f97a = false;
        this.a = 0;
        this.f94a = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.push.ai.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = (b) message.obj;
                int i2 = message.what;
                if (i2 == 0) {
                    bVar.a();
                } else if (i2 == 1) {
                    bVar.mo256c();
                }
                super.handleMessage(message);
            }
        };
        this.b = z;
        this.a = i;
    }

    public synchronized void a(b bVar) {
        if (this.f95a == null) {
            a aVar = new a();
            this.f95a = aVar;
            aVar.setDaemon(this.b);
            this.f97a = false;
            this.f95a.start();
        }
        this.f95a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.f95a = null;
        this.f97a = true;
    }

    public void a(final b bVar, long j) {
        this.f94a.postDelayed(new Runnable() { // from class: com.xiaomi.push.ai.2
            @Override // java.lang.Runnable
            public void run() {
                ai.this.a(bVar);
            }
        }, j);
    }
}
