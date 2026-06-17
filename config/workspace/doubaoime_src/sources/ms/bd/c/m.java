package ms.bd.c;

import android.app.Application;
import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public final class m implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (n.f10411g.getAndSet(false)) {
            try {
                HandlerThread handlerThread = n.f10410f;
                handlerThread.start();
                n.h = new Handler(handlerThread.getLooper());
            } catch (Exception unused) {
            }
            Application application = null;
            try {
                application = (Application) Class.forName((String) y2.a(16777217, 0, 0L, "abbb28", new byte[]{113, 110, 21, 4, 2, 38, 102, 13, 50, 34, 96, 46, 48, 21, 25, 38, 116, 74, 39, 43, 68, 104, 3, 19, 12, 43})).getMethod((String) y2.a(16777217, 0, 0L, "6c9a2b", new byte[]{36, 116, 88, 7, 8, 123, 33, 99, 120, 33, 43, 104, 73, 20, 25, 124, 58, 76}), null).invoke(null, null);
            } catch (Throwable unused2) {
            }
            try {
                application.registerActivityLifecycleCallbacks(new l());
            } catch (Throwable unused3) {
            }
        }
    }
}
