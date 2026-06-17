package com.bytedance.apm.F;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedTransferQueue;

/* loaded from: classes.dex */
public class e {
    private final Thread a;
    private final BlockingQueue<Runnable> b = new LinkedTransferQueue();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ((Runnable) e.this.b.take()).run();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public e(String str) {
        this.a = new Thread(new a(), str);
    }

    public final boolean b(Runnable runnable) {
        return this.b.offer(runnable);
    }

    public void c() {
        this.a.start();
    }
}
