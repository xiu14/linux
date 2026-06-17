package kotlinx.coroutines;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class F {
    private static final List<E> a = kotlin.x.h.h(kotlin.x.h.a(defpackage.a.a()));

    public static final void a(kotlin.r.f fVar, Throwable th) {
        Throwable runtimeException;
        Iterator<E> it2 = a.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().handleException(fVar, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    kotlin.a.a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            kotlin.a.a(th, new O(fVar));
        } catch (Throwable th3) {
            com.prolificinteractive.materialcalendarview.r.J(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
