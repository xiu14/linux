package com.bytedance.apm.F;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.n;
import com.bytedance.apm.util.i;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    static final i<e, Runnable> f3293f = new a();

    /* renamed from: g, reason: collision with root package name */
    static final i<Message, Runnable> f3294g = new b();
    private final HandlerThread a;

    /* renamed from: d, reason: collision with root package name */
    public volatile Handler f3296d;
    private final Queue<e> b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f3295c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f3297e = new Object();

    static class a implements i<e, Runnable> {
        a() {
        }

        @Override // com.bytedance.apm.util.i
        public boolean a(e eVar, Runnable runnable) {
            Message message;
            Message message2;
            e eVar2 = eVar;
            Runnable runnable2 = runnable;
            if (runnable2 == null) {
                if (eVar2 == null || (message2 = eVar2.a) == null || message2.getCallback() == null) {
                    return true;
                }
            } else if (eVar2 != null && (message = eVar2.a) != null && runnable2.equals(message.getCallback())) {
                return true;
            }
            return false;
        }
    }

    static class b implements i<Message, Runnable> {
        b() {
        }

        @Override // com.bytedance.apm.util.i
        public boolean a(Message message, Runnable runnable) {
            Message message2 = message;
            Runnable runnable2 = runnable;
            if (runnable2 == null) {
                if (message2 == null || message2.getCallback() == null) {
                    return true;
                }
            } else if (message2 != null && runnable2.equals(message2.getCallback())) {
                return true;
            }
            return false;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!f.this.f3295c.isEmpty()) {
                synchronized (f.this.f3297e) {
                    if (f.this.f3296d != null) {
                        f.this.f3296d.sendMessageAtFrontOfQueue((Message) f.this.f3295c.poll());
                    }
                }
            }
            while (!f.this.b.isEmpty()) {
                synchronized (f.this.f3297e) {
                    e eVar = (e) f.this.b.poll();
                    if (f.this.f3296d != null) {
                        f.this.f3296d.sendMessageAtTime(eVar.a, eVar.b);
                    }
                }
            }
        }
    }

    class d extends HandlerThread {
        d(String str) {
            super(str);
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (f.this.f3297e) {
                f.this.f3296d = new Handler();
            }
            f.this.f3296d.post(f.this.new c());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th) {
                    n.e().b(th, "apm_error");
                }
            }
        }
    }

    static class e {
        Message a;
        long b;

        e(Message message, long j) {
            this.a = message;
            this.b = j;
        }
    }

    public f(String str) {
        this.a = new d(str);
    }

    public boolean d() {
        return this.f3296d != null;
    }

    public final boolean e(Runnable runnable, long j) {
        return g(Message.obtain(this.f3296d, runnable), j);
    }

    public final void f(Runnable runnable) {
        if (!this.b.isEmpty() || !this.f3295c.isEmpty()) {
            com.bytedance.android.input.k.b.a.D0(this.b, runnable, f3293f);
            com.bytedance.android.input.k.b.a.D0(this.f3295c, runnable, f3294g);
        }
        if (this.f3296d != null) {
            this.f3296d.removeCallbacks(runnable);
        }
    }

    public final boolean g(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        if (this.f3296d == null) {
            synchronized (this.f3297e) {
                if (this.f3296d == null) {
                    this.b.add(new e(message, uptimeMillis));
                    return true;
                }
            }
        }
        return this.f3296d.sendMessageAtTime(message, uptimeMillis);
    }

    public void h() {
        this.a.start();
    }
}
