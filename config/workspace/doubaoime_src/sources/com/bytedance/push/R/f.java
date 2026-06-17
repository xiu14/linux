package com.bytedance.push.R;

import com.bytedance.push.B;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes2.dex */
public class f {
    private final ConcurrentLinkedQueue<B> a = new ConcurrentLinkedQueue<>();

    public synchronized void a(B b) {
        this.a.add(b);
    }

    public B b() {
        return this.a.peek();
    }

    public synchronized void c(B b) {
        this.a.remove(b);
    }
}
