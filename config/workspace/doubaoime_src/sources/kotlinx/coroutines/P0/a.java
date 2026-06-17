package kotlinx.coroutines.P0;

import java.util.Objects;
import kotlin.o;
import kotlinx.coroutines.AbstractC0808i;
import kotlinx.coroutines.N0.x;

/* loaded from: classes2.dex */
final class a extends AbstractC0808i {
    private final j a;
    private final int b;

    public a(j jVar, int i) {
        this.a = jVar;
        this.b = i;
    }

    @Override // kotlinx.coroutines.AbstractC0810j
    public void a(Throwable th) {
        x xVar;
        j jVar = this.a;
        int i = this.b;
        Objects.requireNonNull(jVar);
        xVar = i.f10195e;
        jVar.f10197e.set(i, xVar);
        jVar.k();
    }

    @Override // kotlin.s.b.l
    public o invoke(Throwable th) {
        x xVar;
        j jVar = this.a;
        int i = this.b;
        Objects.requireNonNull(jVar);
        xVar = i.f10195e;
        jVar.f10197e.set(i, xVar);
        jVar.k();
        return o.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CancelSemaphoreAcquisitionHandler[");
        M.append(this.a);
        M.append(", ");
        return e.a.a.a.a.C(M, this.b, ']');
    }
}
