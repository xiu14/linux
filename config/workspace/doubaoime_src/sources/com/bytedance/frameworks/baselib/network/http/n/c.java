package com.bytedance.frameworks.baselib.network.http.n;

import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.frameworks.baselib.network.dispatcher.e;
import com.bytedance.retrofit2.O;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c implements Executor {
    private static volatile com.bytedance.frameworks.baselib.network.dispatcher.c a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IRequest.Priority priority;
        int i;
        if (runnable != null) {
            IRequest.Priority priority2 = IRequest.Priority.NORMAL;
            boolean z = false;
            if (runnable instanceof O) {
                O o = (O) runnable;
                int G = o.G();
                if (G == 0) {
                    priority2 = IRequest.Priority.LOW;
                } else if (1 != G) {
                    if (2 == G) {
                        priority2 = IRequest.Priority.HIGH;
                    } else if (3 == G) {
                        priority2 = IRequest.Priority.IMMEDIATE;
                    } else if (-1 == G) {
                        priority2 = IRequest.Priority.LOWEST;
                    }
                }
                z = o.N();
                priority = priority2;
                i = o.x();
            } else {
                priority = priority2;
                i = 0;
            }
            if (a == null) {
                a = e.c();
            }
            com.bytedance.frameworks.baselib.network.dispatcher.a aVar = new com.bytedance.frameworks.baselib.network.dispatcher.a("NetExecutor", priority, i, runnable, z);
            if (z) {
                ((e) a).b(aVar);
            } else {
                ((e) a).a(aVar);
            }
        }
    }
}
