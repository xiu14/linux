package com.ttnet.org.chromium.base.task;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public class PostTask {

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f8582c;

    /* renamed from: e, reason: collision with root package name */
    private static AtomicReferenceArray<Object> f8584e;
    private static final Object a = new Object();
    private static List<e> b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static final Executor f8583d = new c();

    static {
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(5);
        atomicReferenceArray.set(0, new d());
        f8584e = atomicReferenceArray;
    }

    @CalledByNative
    private static void onNativeSchedulerReady() {
        List<e> list;
        f8582c = true;
        synchronized (a) {
            list = b;
            b = null;
        }
        Iterator<e> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
    }

    @CalledByNative
    private static void onNativeSchedulerShutdownForTesting() {
        synchronized (a) {
            b = new ArrayList();
        }
        f8582c = false;
        f8584e.set(0, new d());
        for (int i = 1; i < f8584e.length(); i++) {
            f8584e.set(i, null);
        }
    }
}
