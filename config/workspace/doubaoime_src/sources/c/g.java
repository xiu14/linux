package c;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ i a;
    final /* synthetic */ Callable b;

    g(i iVar, Callable callable) {
        this.a = iVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.d(this.b.call());
        } catch (CancellationException unused) {
            this.a.b();
        } catch (Exception e2) {
            this.a.c(e2);
        }
    }
}
