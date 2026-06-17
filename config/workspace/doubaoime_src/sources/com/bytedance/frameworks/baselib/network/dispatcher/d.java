package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class d implements WeakHandler.IHandler {

    /* renamed from: f, reason: collision with root package name */
    private static AtomicInteger f5043f = new AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    static d f5044g = new d();
    private WeakHandler a = new WeakHandler(Looper.getMainLooper(), this);
    private ThreadPoolExecutor b;

    /* renamed from: c, reason: collision with root package name */
    private ThreadPoolExecutor f5045c;

    /* renamed from: d, reason: collision with root package name */
    private ThreadPoolExecutor f5046d;

    /* renamed from: e, reason: collision with root package name */
    private ThreadPoolExecutor f5047e;

    static class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);
        private String b;

        /* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.d$a$a, reason: collision with other inner class name */
        class C0252a extends Thread {
            C0252a(a aVar, Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        a(String str) {
            this.b = "ApiExecutor";
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C0252a c0252a = new C0252a(this, runnable, this.b + "#" + this.a.getAndIncrement());
            c0252a.setDaemon(false);
            return c0252a;
        }
    }

    private d() {
    }

    private synchronized ExecutorService c() {
        if (this.f5045c == null) {
            Objects.requireNonNull(e.d());
            this.f5045c = null;
            if (0 == 0) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(e.d().b(), e.d().h(), e.d().a(), TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetNormal"));
                this.f5045c = threadPoolExecutor;
                threadPoolExecutor.allowCoreThreadTimeOut(e.d().j());
            }
        }
        return this.f5045c;
    }

    private synchronized ExecutorService d() {
        if (this.b == null) {
            Objects.requireNonNull(e.d());
            this.b = null;
            if (0 == 0) {
                Objects.requireNonNull(e.d());
                this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, e.d().f(), TimeUnit.SECONDS, new SynchronousQueue(), new a("NetImmediate"));
            }
        }
        return this.b;
    }

    private synchronized ExecutorService e() {
        if (this.f5047e == null) {
            Objects.requireNonNull(e.d());
            this.f5047e = null;
            if (0 == 0) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(e.d().d(), e.d().d(), e.d().g(), TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetLowest"));
                this.f5047e = threadPoolExecutor;
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        }
        return this.f5047e;
    }

    private static void f(ThreadPoolExecutor threadPoolExecutor, b bVar) {
        if (threadPoolExecutor == null || !(bVar instanceof com.bytedance.frameworks.baselib.network.dispatcher.a)) {
            return;
        }
        ((com.bytedance.frameworks.baselib.network.dispatcher.a) bVar).e(threadPoolExecutor.getQueue().size());
    }

    void a(b bVar) {
        if (bVar.c()) {
            return;
        }
        bVar.d(f5043f.incrementAndGet());
        com.bytedance.frameworks.baselib.network.dispatcher.a aVar = (com.bytedance.frameworks.baselib.network.dispatcher.a) bVar;
        if (aVar.a() == IRequest.Priority.IMMEDIATE) {
            d().execute(bVar);
            return;
        }
        if (aVar.a() == IRequest.Priority.LOWEST) {
            e().execute(bVar);
            return;
        }
        long j = bVar.b;
        if (j <= 0) {
            f(this.f5045c, bVar);
            c().execute(bVar);
        } else {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = bVar;
            this.a.sendMessageDelayed(obtain, j);
        }
    }

    void b(b bVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (bVar.c()) {
            return;
        }
        bVar.d(f5043f.incrementAndGet());
        com.bytedance.frameworks.baselib.network.dispatcher.a aVar = (com.bytedance.frameworks.baselib.network.dispatcher.a) bVar;
        if (aVar.a() == IRequest.Priority.IMMEDIATE) {
            d().execute(bVar);
            return;
        }
        if (aVar.a() == IRequest.Priority.LOWEST) {
            e().execute(bVar);
            return;
        }
        long j = bVar.b;
        if (j > 0) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            obtain.obj = bVar;
            this.a.sendMessageDelayed(obtain, j);
            return;
        }
        f(this.f5046d, bVar);
        synchronized (this) {
            if (this.f5046d == null) {
                Objects.requireNonNull(e.d());
                this.f5046d = null;
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(e.d().c(), e.d().i(), e.d().e(), TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetDownload"));
                this.f5046d = threadPoolExecutor2;
                threadPoolExecutor2.allowCoreThreadTimeOut(e.d().j());
            }
            threadPoolExecutor = this.f5046d;
        }
        threadPoolExecutor.execute(bVar);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Runnable) {
                try {
                    int i = message.what;
                    if (i == 0) {
                        f(this.f5045c, (b) obj);
                        c().execute((Runnable) message.obj);
                    } else if (i == 1) {
                        f(this.f5046d, (b) obj);
                        d().execute((Runnable) message.obj);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
