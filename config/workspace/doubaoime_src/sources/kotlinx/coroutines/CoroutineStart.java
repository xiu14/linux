package kotlinx.coroutines;

import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(kotlin.s.b.l<? super kotlin.r.d<? super T>, ? extends Object> lVar, kotlin.r.d<? super T> dVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            kotlinx.coroutines.O0.a.c(lVar, dVar);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.s.c.l.f(lVar, "<this>");
                kotlin.s.c.l.f(dVar, "completion");
                kotlin.coroutines.intrinsics.a.d(kotlin.coroutines.intrinsics.a.a(lVar, dVar)).resumeWith(kotlin.o.a);
                return;
            }
            if (ordinal != 3) {
                throw new kotlin.f();
            }
            kotlin.s.c.l.f(dVar, "completion");
            try {
                kotlin.r.f context = dVar.getContext();
                Object c2 = kotlinx.coroutines.N0.z.c(context, null);
                try {
                    kotlin.s.c.D.c(lVar, 1);
                    Object invoke = lVar.invoke(dVar);
                    if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        dVar.resumeWith(invoke);
                    }
                } finally {
                    kotlinx.coroutines.N0.z.a(context, c2);
                }
            } catch (Throwable th) {
                dVar.resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
            }
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R, T> void invoke(kotlin.s.b.p<? super R, ? super kotlin.r.d<? super T>, ? extends Object> pVar, R r, kotlin.r.d<? super T> dVar) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            kotlinx.coroutines.O0.a.d(pVar, r, dVar, null, 4);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                kotlin.s.c.l.f(pVar, "<this>");
                kotlin.s.c.l.f(dVar, "completion");
                kotlin.coroutines.intrinsics.a.d(kotlin.coroutines.intrinsics.a.b(pVar, r, dVar)).resumeWith(kotlin.o.a);
                return;
            }
            if (ordinal == 3) {
                kotlin.s.c.l.f(dVar, "completion");
                try {
                    kotlin.r.f context = dVar.getContext();
                    Object c2 = kotlinx.coroutines.N0.z.c(context, null);
                    try {
                        kotlin.s.c.D.c(pVar, 2);
                        Object invoke = pVar.invoke(r, dVar);
                        if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            dVar.resumeWith(invoke);
                            return;
                        }
                        return;
                    } finally {
                        kotlinx.coroutines.N0.z.a(context, c2);
                    }
                } catch (Throwable th) {
                    dVar.resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
                    return;
                }
            }
            throw new kotlin.f();
        }
    }
}
