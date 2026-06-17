package com.bytedance.apm.s.k;

import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.s.k.m.b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class c<T extends com.bytedance.apm.s.k.m.b> implements l {
    private final String a;

    /* renamed from: e, reason: collision with root package name */
    ConcurrentHashMap<Integer, T> f3500e = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f3498c = ActivityLifeObserver.getInstance().isForeground();
    volatile long b = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f3499d = com.bytedance.apm.s.l.a.e(com.bytedance.apm.g.h());

    c(String str) {
        this.a = str;
    }

    @Override // com.bytedance.apm.s.k.l
    public void a(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f3500e.size() != 0) {
            i(this.b, currentTimeMillis, z);
        }
        this.b = currentTimeMillis;
    }

    protected abstract void g(T t, long j, long j2);

    public String h() {
        return this.a;
    }

    protected void i(long j, long j2, boolean z) {
        Iterator<Map.Entry<Integer, T>> it2 = this.f3500e.entrySet().iterator();
        while (it2.hasNext()) {
            T value = it2.next().getValue();
            long j3 = value.b;
            if (0 < j3 && j3 < value.a) {
                it2.remove();
            } else if (0 < j3 && j3 < j) {
                it2.remove();
            } else if (j2 >= value.a) {
                g(value, j, j2);
            }
        }
    }
}
