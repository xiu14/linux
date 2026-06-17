package com.bytedance.apm6.cpu.exception.f;

import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a extends com.bytedance.apm6.cpu.exception.a {
    public com.bytedance.apm6.cpu.b.c b;

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.apm6.util.timetask.a f3694c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f3695d;

    /* renamed from: com.bytedance.apm6.cpu.exception.f.a$a, reason: collision with other inner class name */
    class C0138a extends com.bytedance.apm6.util.timetask.a {
        C0138a(long j, long j2) {
            super(j, j2);
        }

        @Override // java.lang.Runnable
        public void run() {
            a.f(a.this);
        }
    }

    public a(com.bytedance.apm6.cpu.exception.d dVar) {
        super(dVar);
    }

    static void f(a aVar) {
        boolean d2;
        Objects.requireNonNull(aVar);
        com.bytedance.apm6.cpu.exception.b.c();
        double i = com.bytedance.android.input.k.b.a.i();
        e.b.o.a.a.b b = aVar.a.b();
        if (b != null) {
            d2 = ((e.b.o.a.b.a) b).g((float) i);
            if (d2) {
                d2 = com.bytedance.apm6.cpu.exception.b.d(aVar.b, i, aVar.f3695d);
            }
        } else {
            d2 = com.bytedance.apm6.cpu.exception.b.d(aVar.b, i, aVar.f3695d);
        }
        aVar.a("run judge process cpu usage task, is over max threshold?: " + d2 + " speed: " + i + ", back max speed: " + aVar.b.c() + ", fore max speed: " + aVar.b.d());
        if (aVar.h(d2)) {
            com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).b(aVar.f3694c);
        }
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void b(com.bytedance.apm6.cpu.b.c cVar, boolean z) {
        super.b(cVar, z);
        this.b = cVar;
        this.f3695d = z;
        StringBuilder M = e.a.a.a.a.M("enter : ");
        M.append(e());
        M.append(" provideDetectInterval : ");
        M.append(g());
        M.append(" isBack : ");
        M.append(z);
        e.b.b.n.g.b.d("APM-CPU", M.toString());
        com.bytedance.apm6.util.timetask.a aVar = this.f3694c;
        if (aVar == null) {
            this.f3694c = new C0138a(g(), g());
        } else {
            aVar.d(g(), g());
        }
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).c(this.f3694c);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void c(boolean z) {
        super.c(z);
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).b(this.f3694c);
        this.a.e();
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void d() {
        super.d();
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.CPU).b(this.f3694c);
    }

    protected abstract long g();

    protected abstract boolean h(boolean z);
}
