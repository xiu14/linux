package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.G;
import com.bytedance.retrofit2.I;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
abstract class K<T> {
    K() {
    }

    static <T> K<T> b(H h, Method method, RetrofitMetrics retrofitMetrics) {
        retrofitMetrics.E0.f5962c.c();
        retrofitMetrics.t = SystemClock.uptimeMillis();
        try {
            G b = new G.a(h, method, retrofitMetrics).b();
            I.c cVar = retrofitMetrics.E0.f5962c;
            cVar.b = cVar.a();
            Type genericReturnType = method.getGenericReturnType();
            if (P.i(genericReturnType)) {
                throw P.k(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            }
            if (genericReturnType == Void.TYPE) {
                throw P.k(method, "Service methods cannot return void.", new Object[0]);
            }
            retrofitMetrics.E0.f5962c.c();
            retrofitMetrics.u = SystemClock.uptimeMillis();
            try {
                return AbstractC0712p.d(h, method, b);
            } finally {
                I.c cVar2 = retrofitMetrics.E0.f5962c;
                cVar2.f5975c = cVar2.a();
            }
        } catch (Throwable th) {
            I.c cVar3 = retrofitMetrics.E0.f5962c;
            cVar3.b = cVar3.a();
            throw th;
        }
    }

    abstract T a(Object[] objArr);
}
