package kotlin.x;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class i<T> implements e<T> {
    final /* synthetic */ kotlin.s.b.p a;

    public i(kotlin.s.b.p pVar) {
        this.a = pVar;
    }

    @Override // kotlin.x.e
    public Iterator<T> iterator() {
        kotlin.s.b.p pVar = this.a;
        kotlin.s.c.l.f(pVar, "block");
        f fVar = new f();
        fVar.e(kotlin.coroutines.intrinsics.a.b(pVar, fVar, fVar));
        return fVar;
    }
}
