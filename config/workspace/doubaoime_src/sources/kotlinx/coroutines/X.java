package kotlinx.coroutines;

/* loaded from: classes2.dex */
final class X implements InterfaceC0807h0 {
    private final boolean a;

    public X(boolean z) {
        this.a = z;
    }

    @Override // kotlinx.coroutines.InterfaceC0807h0
    public boolean a() {
        return this.a;
    }

    @Override // kotlinx.coroutines.InterfaceC0807h0
    public w0 g() {
        return null;
    }

    public String toString() {
        return e.a.a.a.a.G(e.a.a.a.a.M("Empty{"), this.a ? "Active" : "New", '}');
    }
}
