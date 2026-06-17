package e.i.b.b.a;

import e.i.b.b.a.c;
import kotlin.s.b.l;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class f<T> implements c.a<T> {
    final /* synthetic */ l a;
    final /* synthetic */ l b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f9982c;

    f(l lVar, l lVar2, l lVar3) {
        this.a = lVar;
        this.b = lVar2;
        this.f9982c = lVar3;
    }

    @Override // e.i.b.b.a.c.a
    public void a(c<T> cVar) {
        kotlin.s.c.l.f(cVar, "animator");
        this.f9982c.invoke(cVar);
    }

    @Override // e.i.b.b.a.c.a
    public void b(c<T> cVar) {
        kotlin.s.c.l.f(cVar, "animator");
        this.a.invoke(cVar);
    }
}
