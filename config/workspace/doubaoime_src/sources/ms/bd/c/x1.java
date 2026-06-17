package ms.bd.c;

/* loaded from: classes2.dex */
public final class x1 implements Runnable {
    public final /* synthetic */ y1 a;

    public x1(y1 y1Var) {
        this.a = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.h.await();
        } catch (InterruptedException unused) {
        }
        this.a.f10477g.quitSafely();
    }
}
