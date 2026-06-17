package e.b.g.a.a.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    static final com.bytedance.framwork.core.sdklib.util.a<e, Runnable> f9523f = new a();

    /* renamed from: g, reason: collision with root package name */
    static final com.bytedance.framwork.core.sdklib.util.a<Message, Runnable> f9524g = new C0433b();
    private final HandlerThread a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Handler f9526d;
    private final Queue<e> b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f9525c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f9527e = new Object();

    static class a implements com.bytedance.framwork.core.sdklib.util.a<e, Runnable> {
        a() {
        }

        @Override // com.bytedance.framwork.core.sdklib.util.a
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

    /* renamed from: e.b.g.a.a.h.b$b, reason: collision with other inner class name */
    static class C0433b implements com.bytedance.framwork.core.sdklib.util.a<Message, Runnable> {
        C0433b() {
        }

        @Override // com.bytedance.framwork.core.sdklib.util.a
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
            while (!b.this.f9525c.isEmpty()) {
                if (b.this.f9526d != null) {
                    b.this.f9526d.sendMessageAtFrontOfQueue((Message) b.this.f9525c.poll());
                }
            }
            while (!b.this.b.isEmpty()) {
                e eVar = (e) b.this.b.poll();
                if (b.this.f9526d != null) {
                    b.this.f9526d.sendMessageAtTime(eVar.a, eVar.b);
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
            synchronized (b.this.f9527e) {
                b.this.f9526d = new Handler();
            }
            b.this.f9526d.post(b.this.new c());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable unused) {
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

    public b(String str) {
        this.a = new d(str);
    }

    public final boolean f(Runnable runnable) {
        return i(Message.obtain(this.f9526d, runnable), 0L);
    }

    public final boolean g(Runnable runnable, long j) {
        return i(Message.obtain(this.f9526d, runnable), j);
    }

    public final void h(Runnable runnable) {
        if (!this.b.isEmpty() || !this.f9525c.isEmpty()) {
            com.bytedance.feedbackerlib.a.y0(this.b, runnable, f9523f);
            com.bytedance.feedbackerlib.a.y0(this.f9525c, runnable, f9524g);
        }
        if (this.f9526d != null) {
            this.f9526d.removeCallbacks(runnable);
        }
    }

    public final boolean i(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis() + j;
        if (this.f9526d == null) {
            synchronized (this.f9527e) {
                if (this.f9526d == null) {
                    this.b.add(new e(message, uptimeMillis));
                    return true;
                }
            }
        }
        return this.f9526d.sendMessageAtTime(message, uptimeMillis);
    }

    public void j() {
        this.a.start();
    }
}
