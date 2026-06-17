package com.bytedance.memory.g;

import androidx.annotation.NonNull;
import com.bytedance.monitor.util.thread.AsyncTaskType;
import com.bytedance.monitor.util.thread.c;
import com.bytedance.monitor.util.thread.d;
import com.bytedance.monitor.util.thread.e;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {
    private static volatile a h;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.memory.b.a f5383d;

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.memory.e.a f5385f;
    private volatile boolean a = false;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f5382c = false;

    /* renamed from: g, reason: collision with root package name */
    private e f5386g = new C0273a();

    /* renamed from: e, reason: collision with root package name */
    private d f5384e = c.a();

    /* renamed from: com.bytedance.memory.g.a$a, reason: collision with other inner class name */
    class C0273a implements e {
        C0273a() {
        }

        @Override // com.bytedance.monitor.util.thread.e
        public AsyncTaskType M() {
            return AsyncTaskType.IO;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.a(a.this)) {
                return;
            }
            a aVar = a.this;
            com.bytedance.memory.e.a aVar2 = aVar.f5385f;
            Objects.requireNonNull(aVar);
            if (com.bytedance.memory.b.d.b() >= ((float) aVar2.l())) {
                a.this.f5382c = true;
                a.this.f5383d.d();
                com.bytedance.memory.b.c.b("begin dumpHeap", new Object[0]);
            }
        }
    }

    private a() {
    }

    static boolean a(a aVar) {
        boolean c2 = aVar.f5383d.c();
        if (c2 && aVar.f5384e != null) {
            com.bytedance.memory.b.c.b("canAnalyse, so cancel check", new Object[0]);
            ((com.bytedance.monitor.util.thread.a) aVar.f5384e).l(aVar.f5386g);
            aVar.a = true;
        }
        return c2 || aVar.f5382c || aVar.b || aVar.f5383d.b();
    }

    public static a f() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    public void e() {
        com.bytedance.memory.b.c.b("finish dumpHeap", new Object[0]);
        this.f5382c = false;
    }

    public void g(boolean z) {
        this.a = z;
    }

    public void h(@NonNull com.bytedance.memory.e.a aVar, @NonNull com.bytedance.memory.b.a aVar2) {
        if (this.a) {
            com.bytedance.memory.b.c.b("startCheck canAnalyse", new Object[0]);
            return;
        }
        this.b = false;
        this.f5385f = aVar;
        if (this.f5384e != null) {
            com.bytedance.memory.b.c.b("enter startCheck", new Object[0]);
            this.f5383d = aVar2;
            long j = (aVar2.a() ? 1 : 30) * 1000;
            ((com.bytedance.monitor.util.thread.a) this.f5384e).m(this.f5386g, j, j);
        }
    }

    public void i() {
        com.bytedance.memory.b.c.b("stopCheck", new Object[0]);
        this.b = true;
        d dVar = this.f5384e;
        if (dVar == null) {
            return;
        }
        ((com.bytedance.monitor.util.thread.a) dVar).l(this.f5386g);
    }
}
