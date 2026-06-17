package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlinx.coroutines.N0.D;
import kotlinx.coroutines.channels.c;

/* loaded from: classes2.dex */
public class m<E> extends a<E> {
    public m(kotlin.s.b.l<? super E, kotlin.o> lVar) {
        super(lVar);
    }

    @Override // kotlinx.coroutines.channels.a
    protected void A(Object obj, i<?> iVar) {
        D d2 = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                D d3 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    v vVar = (v) arrayList.get(size);
                    if (vVar instanceof c.a) {
                        kotlin.s.b.l<E, kotlin.o> lVar = this.a;
                        d3 = lVar != null ? kotlinx.coroutines.N0.r.b(lVar, ((c.a) vVar).f10223d, d3) : null;
                    } else {
                        vVar.A(iVar);
                    }
                }
                d2 = d3;
            } else {
                v vVar2 = (v) obj;
                if (vVar2 instanceof c.a) {
                    kotlin.s.b.l<E, kotlin.o> lVar2 = this.a;
                    if (lVar2 != null) {
                        d2 = kotlinx.coroutines.N0.r.b(lVar2, ((c.a) vVar2).f10223d, null);
                    }
                } else {
                    vVar2.A(iVar);
                }
            }
        }
        if (d2 != null) {
            throw d2;
        }
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean l() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected final boolean n() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.c
    protected Object p(E e2) {
        t<?> s;
        do {
            Object p = super.p(e2);
            kotlinx.coroutines.N0.x xVar = b.b;
            if (p == xVar) {
                return xVar;
            }
            if (p != b.f10218c) {
                if (p instanceof i) {
                    return p;
                }
                throw new IllegalStateException(e.a.a.a.a.r("Invalid offerInternal result ", p));
            }
            s = s(e2);
            if (s == null) {
                return xVar;
            }
        } while (!(s instanceof i));
        return s;
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean w() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.a
    protected final boolean x() {
        return true;
    }
}
