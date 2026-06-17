package e.c.h.h;

import com.facebook.imagepipeline.producers.AbstractC0722b;
import com.facebook.imagepipeline.producers.b0;
import e.c.c.d.h;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class a<T> extends AbstractC0722b<T> {
    final /* synthetic */ b b;

    a(b bVar) {
        this.b = bVar;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void g() {
        b bVar = this.b;
        synchronized (bVar) {
            h.f(bVar.h());
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void h(Throwable th) {
        b.q(this.b, th);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void i(T t, int i) {
        b0 b0Var;
        b bVar = this.b;
        b0Var = bVar.h;
        bVar.s(t, i, b0Var);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC0722b
    protected void j(float f2) {
        this.b.m(f2);
    }
}
