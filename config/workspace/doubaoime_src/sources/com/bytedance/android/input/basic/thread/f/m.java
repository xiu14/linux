package com.bytedance.android.input.basic.thread.f;

import com.bytedance.android.input.basic.thread.ImeThreadPoolType;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class m {
    public static final m a = null;
    private static final ConcurrentHashMap<String, WeakReference<ExecutorService>> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap<ImeThreadPoolType, AtomicInteger> f2151c = new ConcurrentHashMap<>();

    public static final ExecutorService a(com.bytedance.android.input.basic.thread.e eVar, boolean z) {
        String str;
        AtomicInteger putIfAbsent;
        kotlin.s.c.l.f(eVar, "options");
        ExecutorService d2 = k.a.d(eVar);
        if (l.a.f().a()) {
            ImeThreadPoolType f2 = eVar.f();
            if (z) {
                str = f2.name();
            } else {
                ConcurrentHashMap<ImeThreadPoolType, AtomicInteger> concurrentHashMap = f2151c;
                AtomicInteger atomicInteger = concurrentHashMap.get(f2);
                if (atomicInteger == null && (putIfAbsent = concurrentHashMap.putIfAbsent(f2, (atomicInteger = new AtomicInteger(0)))) != null) {
                    atomicInteger = putIfAbsent;
                }
                str = f2.name() + '_' + atomicInteger.incrementAndGet();
            }
            b.put(str, new WeakReference<>(d2));
        }
        return d2;
    }
}
