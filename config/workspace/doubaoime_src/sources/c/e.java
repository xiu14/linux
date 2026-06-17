package c;

import java.util.concurrent.Executor;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* loaded from: classes.dex */
class e<TResult> implements c<TResult, Void> {
    final /* synthetic */ i a;
    final /* synthetic */ c b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Executor f1242c;

    e(h hVar, i iVar, c cVar, Executor executor) {
        this.a = iVar;
        this.b = cVar;
        this.f1242c = executor;
    }

    @Override // c.c
    public Void a(h hVar) throws Exception {
        i iVar = this.a;
        c cVar = this.b;
        try {
            this.f1242c.execute(new f(iVar, cVar, hVar));
            return null;
        } catch (Exception e2) {
            iVar.c(new d(e2));
            return null;
        }
    }
}
