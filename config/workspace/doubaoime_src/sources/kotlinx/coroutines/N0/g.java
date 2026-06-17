package kotlinx.coroutines.N0;

import kotlinx.coroutines.G;

/* loaded from: classes2.dex */
public final class g implements G {
    private final kotlin.r.f a;

    public g(kotlin.r.f fVar) {
        this.a = fVar;
    }

    @Override // kotlinx.coroutines.G
    public kotlin.r.f getCoroutineContext() {
        return this.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CoroutineScope(coroutineContext=");
        M.append(this.a);
        M.append(')');
        return M.toString();
    }
}
