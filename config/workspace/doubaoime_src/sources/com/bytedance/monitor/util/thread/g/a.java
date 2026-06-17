package com.bytedance.monitor.util.thread.g;

import android.os.Process;
import androidx.annotation.NonNull;
import com.bytedance.monitor.util.thread.f;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class a implements ThreadFactory {
    public final String a = a.class.getSimpleName();
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private f f5483c;

    /* renamed from: d, reason: collision with root package name */
    private b f5484d;

    /* renamed from: com.bytedance.monitor.util.thread.g.a$a, reason: collision with other inner class name */
    class RunnableC0279a implements Runnable {
        final /* synthetic */ Runnable a;

        RunnableC0279a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            if (a.this.f5484d != null) {
                a.this.f5484d.a(Thread.currentThread().getId());
            }
            try {
                Runnable runnable = this.a;
                if (runnable != null) {
                    runnable.run();
                }
            } catch (Throwable th) {
                ((com.bytedance.monitor.util.thread.a) com.bytedance.monitor.util.thread.c.a()).b(th, "APM_INNER_ERROR_async_task");
                if (a.this.f5483c != null) {
                    a.this.f5483c.c(a.this.a, th.getMessage());
                }
            }
        }
    }

    public interface b {
        void a(long j);
    }

    public a(@NonNull String str) {
        this.b = e.a.a.a.a.s("APM_", str);
    }

    public void c(f fVar) {
        this.f5483c = fVar;
    }

    public void d(b bVar) {
        this.f5484d = bVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new RunnableC0279a(runnable), this.b);
    }
}
