package com.ss.ugc.effectplatform.e.f;

/* loaded from: classes2.dex */
public final class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.a.b.b bVar;
        boolean v;
        d.a.b.b bVar2;
        d.a.b.d.e eVar = this.a.f8471g;
        eVar.a();
        try {
            boolean z = !((Boolean) this.a.h.a()).booleanValue();
            bVar = this.a.i;
            if (z || ((Boolean) bVar.a()).booleanValue()) {
                return;
            }
            this.a.E();
            v = this.a.v();
            if (v) {
                this.a.C();
                bVar2 = this.a.f8469e;
                bVar2.b(0);
            }
        } finally {
            eVar.b();
        }
    }
}
