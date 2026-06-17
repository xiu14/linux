package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC0817m0;

/* loaded from: classes2.dex */
public abstract class Q<T> extends kotlinx.coroutines.scheduling.g {

    /* renamed from: c, reason: collision with root package name */
    public int f10198c;

    public Q(int i) {
        this.f10198c = i;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract kotlin.r.d<T> c();

    public Throwable d(Object obj) {
        C0824u c0824u = obj instanceof C0824u ? (C0824u) obj : null;
        if (c0824u != null) {
            return c0824u.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.s.c.l.c(th);
        com.prolificinteractive.materialcalendarview.r.T(c().getContext(), new H("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    @Override // java.lang.Runnable
    public final void run() {
        Object J2;
        InterfaceC0817m0 interfaceC0817m0;
        kotlinx.coroutines.scheduling.h hVar = this.b;
        try {
            kotlinx.coroutines.N0.h hVar2 = (kotlinx.coroutines.N0.h) c();
            kotlin.r.d<T> dVar = hVar2.f10160e;
            Object obj = hVar2.f10162g;
            kotlin.r.f context = dVar.getContext();
            Object c2 = kotlinx.coroutines.N0.z.c(context, obj);
            K0<?> r = c2 != kotlinx.coroutines.N0.z.a ? C0795d.r(dVar, context, c2) : null;
            try {
                kotlin.r.f context2 = dVar.getContext();
                Object k = k();
                Throwable d2 = d(k);
                if (d2 == null && C0795d.k(this.f10198c)) {
                    InterfaceC0817m0.a aVar = InterfaceC0817m0.H;
                    interfaceC0817m0 = (InterfaceC0817m0) context2.get(InterfaceC0817m0.a.a);
                } else {
                    interfaceC0817m0 = null;
                }
                if (interfaceC0817m0 != null && !interfaceC0817m0.a()) {
                    CancellationException r2 = interfaceC0817m0.r();
                    a(k, r2);
                    dVar.resumeWith(com.prolificinteractive.materialcalendarview.r.J(r2));
                } else if (d2 != null) {
                    dVar.resumeWith(com.prolificinteractive.materialcalendarview.r.J(d2));
                } else {
                    dVar.resumeWith(e(k));
                }
                Object obj2 = kotlin.o.a;
                if (r == null || r.s0()) {
                    kotlinx.coroutines.N0.z.a(context, c2);
                }
                try {
                    hVar.a();
                } catch (Throwable th) {
                    obj2 = com.prolificinteractive.materialcalendarview.r.J(th);
                }
                h(null, kotlin.h.b(obj2));
            } catch (Throwable th2) {
                if (r == null || r.s0()) {
                    kotlinx.coroutines.N0.z.a(context, c2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                hVar.a();
                J2 = kotlin.o.a;
            } catch (Throwable th4) {
                J2 = com.prolificinteractive.materialcalendarview.r.J(th4);
            }
            h(th3, kotlin.h.b(J2));
        }
    }
}
