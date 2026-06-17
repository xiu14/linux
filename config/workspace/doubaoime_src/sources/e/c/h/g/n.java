package e.c.h.g;

import android.os.Process;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class n implements ThreadFactory {
    private final int a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f9914c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f9915d = new AtomicInteger(1);

    class a implements Runnable {
        final /* synthetic */ Runnable a;

        a(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(n.this.a);
            } catch (Throwable unused) {
            }
            this.a.run();
        }
    }

    public n(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.f9914c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        a aVar = new a(runnable);
        if (this.f9914c) {
            str = this.b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f9915d.getAndIncrement();
        } else {
            str = this.b;
        }
        return new Thread(aVar, str);
    }
}
