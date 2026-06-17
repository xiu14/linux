package com.bytedance.frameworks.baselib.network.dispatcher;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class b implements IRequest, Runnable, Comparable<IRequest> {
    protected final AtomicBoolean a;
    protected int b;

    /* renamed from: c, reason: collision with root package name */
    protected int f5042c;

    public b() {
        new AtomicBoolean(false);
        this.a = new AtomicBoolean(false);
        this.b = 0;
    }

    public boolean c() {
        return this.a.get();
    }

    public b d(int i) {
        this.f5042c = i;
        return this;
    }
}
