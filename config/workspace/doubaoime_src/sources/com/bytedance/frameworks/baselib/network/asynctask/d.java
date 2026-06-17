package com.bytedance.frameworks.baselib.network.asynctask;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class d implements ThreadFactory {
    private static final String b = d.class.getSimpleName();
    private final String a;

    public d(String str) {
        this.a = e.a.a.a.a.s("ttnet-", str);
    }

    public /* synthetic */ void a(Runnable runnable) {
        Process.setThreadPriority(10);
        try {
            runnable.run();
        } catch (Throwable th) {
            String str = b;
            StringBuilder M = e.a.a.a.a.M("NetworkThreadFactory error when running in thread ");
            M.append(this.a);
            Logger.e(str, M.toString(), th);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        return new Thread(new Runnable() { // from class: com.bytedance.frameworks.baselib.network.asynctask.a
            @Override // java.lang.Runnable
            public final void run() {
                d.this.a(runnable);
            }
        }, this.a);
    }
}
