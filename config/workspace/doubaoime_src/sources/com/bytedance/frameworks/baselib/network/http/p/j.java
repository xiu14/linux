package com.bytedance.frameworks.baselib.network.http.p;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class j implements ThreadFactory {
    private static final String b = j.class.getSimpleName();
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
                String str = j.b;
                StringBuilder M = e.a.a.a.a.M("WsThreadFactory error when running in thread ");
                M.append(j.this.a);
                Logger.e(str, M.toString(), th);
            }
        }
    }

    public j(String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (Logger.debug()) {
            e.a.a.a.a.I0(e.a.a.a.a.M("creating newThread "), this.a, b);
        }
        return new Thread(new a(runnable), this.a);
    }
}
