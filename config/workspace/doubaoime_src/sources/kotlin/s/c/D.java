package kotlin.s.c;

import java.util.Collection;

/* loaded from: classes2.dex */
public class D {
    public static Collection a(Object obj) {
        if ((obj instanceof kotlin.s.c.E.a) && !(obj instanceof kotlin.s.c.E.b)) {
            d(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            l.j(e2, D.class.getName());
            throw e2;
        }
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof kotlin.s.c.E.a) && !(obj instanceof kotlin.s.c.E.b)) {
            d(obj, "kotlin.collections.MutableIterable");
            throw null;
        }
        try {
            return (Iterable) obj;
        } catch (ClassCastException e2) {
            l.j(e2, D.class.getName());
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b9, code lost:
    
        if ((r3 instanceof kotlin.s.c.i ? ((kotlin.s.c.i) r3).getArity() : r3 instanceof kotlin.s.b.a ? 0 : r3 instanceof kotlin.s.b.l ? 1 : r3 instanceof kotlin.s.b.p ? 2 : r3 instanceof kotlin.s.b.q ? 3 : r3 instanceof kotlin.s.b.r ? 4 : r3 instanceof kotlin.s.b.s ? 5 : r3 instanceof kotlin.s.b.t ? 6 : r3 instanceof kotlin.s.b.u ? 7 : r3 instanceof kotlin.s.b.v ? 8 : r3 instanceof kotlin.s.b.w ? 9 : r3 instanceof kotlin.s.b.b ? 10 : r3 instanceof kotlin.s.b.c ? 11 : r3 instanceof kotlin.s.b.d ? 12 : r3 instanceof kotlin.s.b.e ? 13 : r3 instanceof kotlin.s.b.f ? 14 : r3 instanceof kotlin.s.b.g ? 15 : r3 instanceof kotlin.s.b.h ? 16 : r3 instanceof kotlin.s.b.i ? 17 : r3 instanceof kotlin.s.b.j ? 18 : r3 instanceof kotlin.s.b.k ? 19 : r3 instanceof kotlin.s.b.m ? 20 : r3 instanceof kotlin.s.b.n ? 21 : r3 instanceof kotlin.s.b.o ? 22 : -1) == r4) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(java.lang.Object r3, int r4) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.s.c.D.c(java.lang.Object, int):java.lang.Object");
    }

    public static void d(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(e.a.a.a.a.t(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        l.j(classCastException, D.class.getName());
        throw classCastException;
    }
}
