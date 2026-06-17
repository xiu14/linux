package kotlinx.coroutines;

/* loaded from: classes2.dex */
public class p0 extends r0 implements InterfaceC0822s {
    private final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(InterfaceC0817m0 interfaceC0817m0) {
        super(true);
        boolean z = true;
        a0(interfaceC0817m0);
        InterfaceC0820p W = W();
        C0821q c0821q = W instanceof C0821q ? (C0821q) W : null;
        if (c0821q != null) {
            r0 z2 = c0821q.z();
            while (!z2.T()) {
                InterfaceC0820p W2 = z2.W();
                C0821q c0821q2 = W2 instanceof C0821q ? (C0821q) W2 : null;
                if (c0821q2 != null) {
                    z2 = c0821q2.z();
                }
            }
            this.b = z;
        }
        z = false;
        this.b = z;
    }

    @Override // kotlinx.coroutines.r0
    public boolean T() {
        return this.b;
    }

    @Override // kotlinx.coroutines.r0
    public boolean U() {
        return true;
    }
}
