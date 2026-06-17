package com.bytedance.lighten.loader;

import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes.dex */
class f<E> extends LinkedBlockingDeque<E> {
    private int a;

    public f(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.LinkedBlockingDeque, java.util.Queue, java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue, java.util.Deque
    public boolean offer(E e2) {
        synchronized (this) {
            if (size() == this.a) {
                removeLast();
            }
        }
        return offerFirst(e2);
    }
}
