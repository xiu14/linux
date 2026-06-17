package c;

/* loaded from: classes.dex */
public class i<TResult> {
    private final h<TResult> a = new h<>();

    public h<TResult> a() {
        return this.a;
    }

    public void b() {
        if (!this.a.i()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public void c(Exception exc) {
        if (!this.a.j(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public void d(TResult tresult) {
        if (!this.a.k(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
