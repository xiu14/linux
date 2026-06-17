package com.bytedance.lego.init;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class t extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    public static final t a = new t();

    t() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        CopyOnWriteArrayList<w> copyOnWriteArrayList;
        Handler handler;
        r rVar = r.p;
        copyOnWriteArrayList = r.n;
        for (w wVar : copyOnWriteArrayList) {
            if (wVar.I().f5312c) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                r rVar2 = r.p;
                handler = r.o;
                handler.post(new s(wVar, countDownLatch));
                countDownLatch.await();
            } else {
                r.p.g(wVar.I());
            }
        }
        return kotlin.o.a;
    }
}
