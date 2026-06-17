package com.xiaomi.push;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class be extends az {
    private static final AtomicReference<be> a = new AtomicReference<>();

    private be() {
        super(4, 10L, TimeUnit.SECONDS, 10000, "light");
    }

    static be a() {
        AtomicReference<be> atomicReference = a;
        if (atomicReference.get() == null || atomicReference.get().isTerminated()) {
            synchronized (be.class) {
                if (atomicReference.get() == null || atomicReference.get().isTerminated()) {
                    atomicReference.set(new be());
                }
            }
        }
        return atomicReference.get();
    }
}
