package kotlinx.coroutines;

/* loaded from: classes2.dex */
public abstract class v0 extends D {
    public abstract v0 U();

    protected final String Y() {
        v0 v0Var;
        int i = S.f10199c;
        v0 v0Var2 = kotlinx.coroutines.N0.q.f10173c;
        if (this == v0Var2) {
            return "Dispatchers.Main";
        }
        try {
            v0Var = v0Var2.U();
        } catch (UnsupportedOperationException unused) {
            v0Var = null;
        }
        if (this == v0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.D
    public D limitedParallelism(int i) {
        com.prolificinteractive.materialcalendarview.r.B(i);
        return this;
    }

    @Override // kotlinx.coroutines.D
    public String toString() {
        String Y = Y();
        if (Y != null) {
            return Y;
        }
        return getClass().getSimpleName() + '@' + I.b(this);
    }
}
