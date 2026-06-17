package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class A0 extends AbstractC0797e {
    private final kotlinx.coroutines.N0.m a;

    public A0(kotlinx.coroutines.N0.m mVar) {
        this.a = mVar;
    }

    @Override // kotlinx.coroutines.AbstractC0810j
    public void a(Throwable th) {
        this.a.v();
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Throwable th) {
        this.a.v();
        return kotlin.o.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RemoveOnCancel[");
        M.append(this.a);
        M.append(']');
        return M.toString();
    }
}
