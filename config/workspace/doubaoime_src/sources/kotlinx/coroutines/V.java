package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class V extends AbstractC0808i {
    private final U a;

    public V(U u) {
        this.a = u;
    }

    @Override // kotlinx.coroutines.AbstractC0810j
    public void a(Throwable th) {
        this.a.b();
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Throwable th) {
        this.a.b();
        return kotlin.o.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("DisposeOnCancel[");
        M.append(this.a);
        M.append(']');
        return M.toString();
    }
}
