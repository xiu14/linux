package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class K {
    private static final boolean a;
    private static final N b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        N n;
        boolean g2 = kotlinx.coroutines.N0.r.g("kotlinx.coroutines.main.delay", false);
        a = g2;
        if (g2) {
            int i = S.f10199c;
            v0 v0Var = kotlinx.coroutines.N0.q.f10173c;
            v0Var.U();
            n = !(v0Var instanceof N) ? J.f10154g : (N) v0Var;
        } else {
            n = J.f10154g;
        }
        b = n;
    }

    public static final N a() {
        return b;
    }
}
