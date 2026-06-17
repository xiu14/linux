package com.bytedance.apm6.cpu.exception.f;

import com.bytedance.apm6.cpu.exception.StateType;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;

/* loaded from: classes.dex */
class c extends com.bytedance.apm6.cpu.exception.a {
    private com.bytedance.apm6.util.timetask.a b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3700c;

    class a extends com.bytedance.apm6.util.timetask.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bytedance.apm6.cpu.exception.d f3701d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j, long j2, com.bytedance.apm6.cpu.exception.d dVar) {
            super(j, j2);
            this.f3701d = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            StringBuilder M = e.a.a.a.a.M("cool down task run, is back?: ");
            M.append(c.this.f3700c);
            cVar.a(M.toString());
            this.f3701d.e();
        }
    }

    public c(com.bytedance.apm6.cpu.exception.d dVar) {
        super(dVar);
        this.f3700c = false;
        this.b = new a(this.f3700c ? 1200000L : 120000L, 0L, dVar);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void b(com.bytedance.apm6.cpu.b.c cVar, boolean z) {
        super.b(cVar, z);
        com.bytedance.apm6.util.timetask.a aVar = this.b;
        if (aVar != null) {
            aVar.d(this.f3700c ? 1200000L : 120000L, 0L);
        }
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).c(this.b);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void c(boolean z) {
        super.c(z);
        this.f3700c = z;
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public void d() {
        super.d();
        com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT).b(this.b);
    }

    @Override // com.bytedance.apm6.cpu.exception.a
    public StateType e() {
        return StateType.COOL_DOWN;
    }
}
