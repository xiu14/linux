package com.bytedance.apm6.util.timetask;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class c implements ThreadFactory {
    private final String a;

    class a implements Runnable {
        final /* synthetic */ Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            try {
                this.a.run();
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("SingleThreadFactory error when running in thread ");
                M.append(c.this.a);
                e.b.b.n.g.b.c("APM-AsyncTask", M.toString(), th);
            }
        }
    }

    public c(String str) {
        this.a = e.a.a.a.a.s("APM6-", str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (e.b.b.n.a.b()) {
            StringBuilder M = e.a.a.a.a.M("creating newThread ");
            M.append(this.a);
            e.b.b.n.g.b.a("APM-AsyncTask", M.toString());
        }
        return new Thread(new a(runnable), this.a);
    }
}
