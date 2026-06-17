package d.a.b.e;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ kotlin.s.b.a a;

    d(kotlin.s.b.a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.invoke();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
