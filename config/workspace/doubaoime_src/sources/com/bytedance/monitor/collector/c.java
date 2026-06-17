package com.bytedance.monitor.collector;

import android.util.Pair;
import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class c {
    protected String a;
    protected int b = 0;

    /* renamed from: c, reason: collision with root package name */
    protected int f5423c;

    /* renamed from: d, reason: collision with root package name */
    protected com.bytedance.monitor.util.thread.d f5424d;

    public c(int i, String str) {
        this.f5423c = 1;
        this.a = str;
        this.f5423c = i;
        j.h().a(this);
        this.f5424d = com.bytedance.monitor.util.thread.c.a();
    }

    Pair<String, ?> a() {
        return null;
    }

    Pair<String, ?> b(long j, long j2) {
        return null;
    }

    @CallSuper
    void c() {
        if (this.b < 0) {
            throw new IllegalStateException("collector has destroyed, can not start.");
        }
        this.b = 2;
    }

    protected abstract void d(int i);
}
