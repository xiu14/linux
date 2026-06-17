package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC0789a;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.r0;

/* loaded from: classes2.dex */
public class f<E> extends AbstractC0789a<kotlin.o> implements e<E> {

    /* renamed from: c, reason: collision with root package name */
    private final e<E> f10229c;

    public f(kotlin.r.f fVar, e<E> eVar, boolean z, boolean z2) {
        super(fVar, z, z2);
        this.f10229c = eVar;
    }

    @Override // kotlinx.coroutines.r0
    public void C(Throwable th) {
        CancellationException m0 = r0.m0(this, th, null, 1, null);
        this.f10229c.d(m0);
        B(m0);
    }

    @Override // kotlinx.coroutines.channels.s
    public Object c(kotlin.r.d<? super g<? extends E>> dVar) {
        Object c2 = this.f10229c.c(dVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return c2;
    }

    @Override // kotlinx.coroutines.r0, kotlinx.coroutines.InterfaceC0817m0, kotlinx.coroutines.channels.s
    public final void d(CancellationException cancellationException) {
        String F;
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            F = F();
            cancellationException = new n0(F, null, this);
        }
        C(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.s
    public Object e(kotlin.r.d<? super E> dVar) {
        return this.f10229c.e(dVar);
    }

    @Override // kotlinx.coroutines.channels.w
    public boolean k(Throwable th) {
        return this.f10229c.k(th);
    }

    @Override // kotlinx.coroutines.channels.w
    public void m(kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        this.f10229c.m(lVar);
    }

    @Override // kotlinx.coroutines.channels.w
    public Object o(E e2, kotlin.r.d<? super kotlin.o> dVar) {
        return this.f10229c.o(e2, dVar);
    }

    @Override // kotlinx.coroutines.channels.w
    public boolean q() {
        return this.f10229c.q();
    }

    protected final e<E> s0() {
        return this.f10229c;
    }
}
