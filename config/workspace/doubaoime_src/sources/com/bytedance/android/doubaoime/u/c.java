package com.bytedance.android.doubaoime.u;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.thread.ImeThreadPoolType;
import com.bytedance.android.input.basic.thread.b;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.collections.g;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c {
    public static final void a() {
        Object J2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            IAppGlobals.a aVar = IAppGlobals.a;
            aVar.x("[ime-thread]-init", "inject start");
            b();
            b bVar = b.a;
            int i = com.bytedance.android.input.basic.thread.a.b;
            l.f(bVar, "monitor");
            com.bytedance.android.input.basic.thread.f.l lVar = com.bytedance.android.input.basic.thread.f.l.a;
            lVar.q(bVar);
            a aVar2 = a.a;
            l.f(aVar2, "logger");
            lVar.p(aVar2);
            aVar.x("[ime-thread]-init", "inject end---costTime = " + (System.currentTimeMillis() - currentTimeMillis));
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            e.a.a.a.a.O0(b, e.a.a.a.a.M("inject Failure---"), IAppGlobals.a, "[ime-thread]-init");
        }
    }

    private static final void b() {
        ArrayList c2 = g.c(ImeThreadPoolType.IO, ImeThreadPoolType.CPU, ImeThreadPoolType.BACKGROUND);
        b.a aVar = new b.a();
        aVar.b(false);
        aVar.c(c2);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        aVar.f(timeUnit.toMillis(5L));
        aVar.e(timeUnit.toMillis(5L));
        aVar.d(timeUnit.toMillis(15L));
        com.bytedance.android.input.basic.thread.b a = aVar.a();
        int i = com.bytedance.android.input.basic.thread.a.b;
        l.f(a, "config");
        com.bytedance.android.input.basic.thread.f.l.a.o(a);
    }
}
