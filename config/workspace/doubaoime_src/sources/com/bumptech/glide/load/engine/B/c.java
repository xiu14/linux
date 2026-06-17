package com.bumptech.glide.load.engine.B;

import com.bumptech.glide.load.engine.B.l;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
abstract class c<T extends l> {
    private final Queue<T> a;

    c() {
        int i = com.bumptech.glide.util.j.f1862d;
        this.a = new ArrayDeque(20);
    }

    abstract T a();

    T b() {
        T poll = this.a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }
}
