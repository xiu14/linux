package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0811j0 extends AbstractC0808i {
    private final kotlin.s.b.l<Throwable, kotlin.o> a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0811j0(kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        this.a = lVar;
    }

    @Override // kotlinx.coroutines.AbstractC0810j
    public void a(Throwable th) {
        this.a.invoke(th);
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Throwable th) {
        this.a.invoke(th);
        return kotlin.o.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("InvokeOnCancel[");
        M.append(I.a(this.a));
        M.append('@');
        M.append(I.b(this));
        M.append(']');
        return M.toString();
    }
}
