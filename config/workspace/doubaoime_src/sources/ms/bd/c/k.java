package ms.bd.c;

/* loaded from: classes2.dex */
public final class k implements Runnable {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.getClass();
        if (n.a() != 0) {
            n.h.postDelayed(new j(this), 1000L);
        } else {
            n.b(0);
            n.f10409e = false;
        }
    }
}
