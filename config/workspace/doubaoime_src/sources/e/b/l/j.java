package e.b.l;

import android.os.Looper;
import e.b.l.f;

/* loaded from: classes2.dex */
class j implements com.bytedance.rpc.transport.b {
    final /* synthetic */ l a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f9625c;

    j(i iVar, l lVar, int i) {
        this.f9625c = iVar;
        this.a = lVar;
        this.b = i;
    }

    @Override // com.bytedance.rpc.transport.b
    public void a(Throwable th) {
        i iVar = this.f9625c;
        f.b o = f.o(th);
        o.f(this.b);
        iVar.d(o.b(), false, true);
    }

    @Override // com.bytedance.rpc.transport.b
    public void b(com.bytedance.rpc.transport.i iVar) {
        e.b.l.q.f fVar;
        e.b.l.q.f fVar2;
        this.a.k();
        this.a.f9635g = System.currentTimeMillis();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            fVar2 = this.f9625c.f9622c;
            fVar2.obtainMessage(4, this.b, 0, iVar).sendToTarget();
            return;
        }
        m f2 = this.a.f();
        try {
            Object e2 = this.f9625c.e(f2, iVar);
            fVar = this.f9625c.b;
            fVar.obtainMessage(5, f2.g(), 0, e2).sendToTarget();
        } catch (Exception e3) {
            i iVar2 = this.f9625c;
            f.b o = f.o(e3);
            o.f(f2.g());
            o.g("deserialize");
            o.h(com.bytedance.rpc.transport.i.class, iVar);
            iVar2.d(o.b(), true, true);
        }
    }
}
