package kotlinx.coroutines.flow.D;

import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.G;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes2.dex */
public abstract class f<T> implements m<T> {
    public final kotlin.r.f a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final BufferOverflow f10247c;

    public f(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        this.a = fVar;
        this.b = i;
        this.f10247c = bufferOverflow;
    }

    @Override // kotlinx.coroutines.flow.f
    public Object a(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        Object I = com.prolificinteractive.materialcalendarview.r.I(new d(gVar, this, null), dVar);
        return I == CoroutineSingletons.COROUTINE_SUSPENDED ? I : kotlin.o.a;
    }

    @Override // kotlinx.coroutines.flow.D.m
    public kotlinx.coroutines.flow.f<T> b(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow) {
        kotlin.r.f plus = fVar.plus(this.a);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.b;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.f10247c;
        }
        return (kotlin.s.c.l.a(plus, this.a) && i == this.b && bufferOverflow == this.f10247c) ? this : f(plus, i, bufferOverflow);
    }

    protected String d() {
        return null;
    }

    protected abstract Object e(kotlinx.coroutines.channels.q<? super T> qVar, kotlin.r.d<? super kotlin.o> dVar);

    protected abstract f<T> f(kotlin.r.f fVar, int i, BufferOverflow bufferOverflow);

    public kotlinx.coroutines.channels.s<T> g(G g2) {
        kotlin.r.f fVar = this.a;
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        return kotlinx.coroutines.channels.h.c(g2, fVar, i, this.f10247c, CoroutineStart.ATOMIC, null, new e(this, null));
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d2 = d();
        if (d2 != null) {
            arrayList.add(d2);
        }
        if (this.a != kotlin.r.g.a) {
            StringBuilder M = e.a.a.a.a.M("context=");
            M.append(this.a);
            arrayList.add(M.toString());
        }
        if (this.b != -3) {
            StringBuilder M2 = e.a.a.a.a.M("capacity=");
            M2.append(this.b);
            arrayList.add(M2.toString());
        }
        if (this.f10247c != BufferOverflow.SUSPEND) {
            StringBuilder M3 = e.a.a.a.a.M("onBufferOverflow=");
            M3.append(this.f10247c);
            arrayList.add(M3.toString());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return e.a.a.a.a.G(sb, kotlin.collections.g.C(arrayList, ", ", null, null, 0, null, null, 62, null), ']');
    }
}
