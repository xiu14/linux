package com.bytedance.apm6.cpu.exception;

/* loaded from: classes.dex */
public class c {
    private boolean a;
    private com.bytedance.apm6.cpu.exception.f.d b = new com.bytedance.apm6.cpu.exception.f.d();

    /* renamed from: c, reason: collision with root package name */
    private boolean f3683c;

    private static final class b {
        private static final c a = new c(null);
    }

    c(a aVar) {
    }

    public static c a() {
        return b.a;
    }

    public synchronized boolean b() {
        return this.f3683c;
    }

    public synchronized void c(com.bytedance.apm6.cpu.b.c cVar) {
        if (cVar == null) {
            return;
        }
        if (e.b.b.h.c.a.y() || cVar.i()) {
            if (cVar.m()) {
                this.a = true;
                this.f3683c = cVar.l();
                this.b.b(cVar);
            } else {
                this.a = false;
                this.b.c();
            }
        }
    }
}
