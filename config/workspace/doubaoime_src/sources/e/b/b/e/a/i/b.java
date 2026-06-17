package e.b.b.e.a.i;

import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;

/* loaded from: classes.dex */
class b extends com.bytedance.apm6.util.timetask.a {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.bytedance.apm.x.c f9389d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f9390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, com.bytedance.apm.x.c cVar2) {
        super(0L, 0L);
        this.f9390e = cVar;
        this.f9389d = cVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.apm6.util.timetask.a aVar;
        long a = this.f9389d.a();
        if (a != -1) {
            this.f9390e.f9393d = a;
            this.f9390e.f9392c = System.currentTimeMillis() - a;
        }
        synchronized (c.class) {
            com.bytedance.apm6.util.timetask.b a2 = com.bytedance.apm6.util.timetask.b.a(AsyncTaskManagerType.LIGHT_WEIGHT);
            aVar = this.f9390e.f9394e;
            a2.b(aVar);
            c.d(this.f9390e, null);
        }
    }
}
