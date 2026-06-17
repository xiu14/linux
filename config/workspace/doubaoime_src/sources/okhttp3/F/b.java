package okhttp3.F;

/* loaded from: classes2.dex */
public abstract class b implements Runnable {
    protected final String a;

    public b(String str, Object... objArr) {
        this.a = c.o(str, objArr);
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
