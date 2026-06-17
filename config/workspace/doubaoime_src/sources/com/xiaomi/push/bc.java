package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class bc implements ThreadFactory {
    final String a;

    public bc(String str) {
        this.a = e.a.a.a.a.s(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: com.xiaomi.push.bc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    com.xiaomi.channel.commonutils.logger.c.a(Thread.currentThread().getName(), th);
                }
            }
        });
        thread.setName(this.a + thread.getId());
        return thread;
    }
}
