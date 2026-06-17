package com.bytedance.memory.d;

import java.io.File;

/* loaded from: classes.dex */
class d implements Runnable {
    d(b bVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            File d2 = com.bytedance.memory.c.b.c().d();
            if (d2 != null && d2.exists() && d2.isDirectory()) {
                com.bytedance.memory.c.a.c().b(d2);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
