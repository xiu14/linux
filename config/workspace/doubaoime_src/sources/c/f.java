package c;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ i a;
    final /* synthetic */ c b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h f1243c;

    f(i iVar, c cVar, h hVar) {
        this.a = iVar;
        this.b = cVar;
        this.f1243c = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.d(this.b.a(this.f1243c));
        } catch (CancellationException unused) {
            this.a.b();
        } catch (Exception e2) {
            this.a.c(e2);
        }
    }
}
