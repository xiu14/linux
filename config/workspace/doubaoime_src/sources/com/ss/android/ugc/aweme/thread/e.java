package com.ss.android.ugc.aweme.thread;

import android.os.Process;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
final class e implements ThreadFactory {
    final /* synthetic */ int a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f8388c;

    class a implements Runnable {
        final /* synthetic */ Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = e.this.a;
            int i2 = d.n;
            try {
                Process.setThreadPriority(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.a.run();
        }
    }

    e(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.f8388c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger;
        Thread thread = new Thread(new a(runnable));
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        atomicInteger = d.b;
        sb.append(atomicInteger.incrementAndGet());
        thread.setName(sb.toString());
        thread.setDaemon(this.f8388c);
        return thread;
    }
}
