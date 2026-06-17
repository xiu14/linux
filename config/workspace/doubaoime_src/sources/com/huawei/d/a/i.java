package com.huawei.d.a;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class i {
    public static <TResult> TResult a(f<TResult> fVar) throws ExecutionException, InterruptedException {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        com.huawei.d.a.j.e eVar = (com.huawei.d.a.j.e) fVar;
        synchronized (eVar.a) {
            z = eVar.b;
        }
        if (z) {
            if (fVar.f()) {
                return fVar.e();
            }
            throw new ExecutionException(fVar.d());
        }
        com.huawei.d.a.j.g gVar = new com.huawei.d.a.j.g();
        eVar.g(new com.huawei.d.a.j.d(h.f6980c.b, gVar));
        eVar.b(gVar);
        gVar.a.await();
        if (fVar.f()) {
            return fVar.e();
        }
        throw new ExecutionException(fVar.d());
    }

    public static <TResult> f<TResult> b(Callable<TResult> callable) {
        ExecutorService executorService = h.f6980c.a;
        g gVar = new g();
        try {
            executorService.execute(new com.huawei.d.a.j.f(gVar, callable));
        } catch (Exception e2) {
            gVar.a(e2);
        }
        return gVar.a;
    }
}
