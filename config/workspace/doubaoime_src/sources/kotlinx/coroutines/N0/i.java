package kotlinx.coroutines.N0;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0825v;
import kotlinx.coroutines.F0;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.K0;
import kotlinx.coroutines.Y;

/* loaded from: classes2.dex */
public final class i {
    private static final x a = new x("UNDEFINED");
    public static final x b = new x("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(kotlin.r.d<? super T> dVar, Object obj, kotlin.s.b.l<? super Throwable, kotlin.o> lVar) {
        boolean z;
        if (!(dVar instanceof h)) {
            dVar.resumeWith(obj);
            return;
        }
        h hVar = (h) dVar;
        Object l0 = com.prolificinteractive.materialcalendarview.r.l0(obj, lVar);
        if (hVar.f10159d.isDispatchNeeded(hVar.getContext())) {
            hVar.f10161f = l0;
            hVar.f10198c = 1;
            hVar.f10159d.dispatch(hVar.getContext(), hVar);
            return;
        }
        F0 f0 = F0.a;
        Y a2 = F0.a();
        if (a2.f0()) {
            hVar.f10161f = l0;
            hVar.f10198c = 1;
            a2.a0(hVar);
            return;
        }
        a2.e0(true);
        try {
            InterfaceC0817m0 interfaceC0817m0 = (InterfaceC0817m0) hVar.getContext().get(InterfaceC0817m0.H);
            if (interfaceC0817m0 == null || interfaceC0817m0.a()) {
                z = false;
            } else {
                CancellationException r = interfaceC0817m0.r();
                if (l0 instanceof C0825v) {
                    ((C0825v) l0).b.invoke(r);
                }
                hVar.resumeWith(com.prolificinteractive.materialcalendarview.r.J(r));
                z = true;
            }
            if (!z) {
                kotlin.r.d<T> dVar2 = hVar.f10160e;
                Object obj2 = hVar.f10162g;
                kotlin.r.f context = dVar2.getContext();
                Object c2 = z.c(context, obj2);
                K0<?> r2 = c2 != z.a ? C0795d.r(dVar2, context, c2) : null;
                try {
                    hVar.f10160e.resumeWith(obj);
                    if (r2 == null || r2.s0()) {
                        z.a(context, c2);
                    }
                } catch (Throwable th) {
                    if (r2 == null || r2.s0()) {
                        z.a(context, c2);
                    }
                    throw th;
                }
            }
            while (a2.n0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(kotlin.r.d dVar, Object obj, kotlin.s.b.l lVar, int i) {
        int i2 = i & 2;
        b(dVar, obj, null);
    }
}
