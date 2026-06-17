package kotlinx.coroutines;

/* loaded from: classes2.dex */
public final class I {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(kotlin.r.d<?> dVar) {
        Object J2;
        if (dVar instanceof kotlinx.coroutines.N0.h) {
            return dVar.toString();
        }
        try {
            J2 = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        if (kotlin.h.b(J2) != null) {
            J2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) J2;
    }
}
