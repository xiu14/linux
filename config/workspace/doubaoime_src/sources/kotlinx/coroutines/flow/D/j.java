package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.r.e;
import kotlinx.coroutines.N0.z;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
public abstract class j<S, T> extends f<T> {

    /* renamed from: d, reason: collision with root package name */
    protected final kotlinx.coroutines.flow.f<S> f10258d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(kotlinx.coroutines.flow.f<? extends S> fVar, kotlin.r.f fVar2, int i, BufferOverflow bufferOverflow) {
        super(fVar2, i, bufferOverflow);
        this.f10258d = fVar;
    }

    @Override // kotlinx.coroutines.flow.D.f, kotlinx.coroutines.flow.f
    public Object a(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        if (this.b == -3) {
            kotlin.r.f context = dVar.getContext();
            kotlin.r.f plus = context.plus(this.a);
            if (kotlin.s.c.l.a(plus, context)) {
                Object h = h(gVar, dVar);
                return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : kotlin.o.a;
            }
            e.a aVar = kotlin.r.e.F;
            if (kotlin.s.c.l.a(plus.get(aVar), context.get(aVar))) {
                kotlin.r.f context2 = dVar.getContext();
                if (!(gVar instanceof t ? true : gVar instanceof o)) {
                    gVar = new v(gVar, context2);
                }
                Object a = g.a(plus, gVar, z.b(plus), new i(this, null), dVar);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (a != coroutineSingletons) {
                    a = kotlin.o.a;
                }
                return a == coroutineSingletons ? a : kotlin.o.a;
            }
        }
        Object a2 = super.a(gVar, dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }

    @Override // kotlinx.coroutines.flow.D.f
    protected Object e(kotlinx.coroutines.channels.q<? super T> qVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object h = h(new t(qVar), dVar);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : kotlin.o.a;
    }

    protected abstract Object h(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar);

    @Override // kotlinx.coroutines.flow.D.f
    public String toString() {
        return this.f10258d + " -> " + super.toString();
    }
}
