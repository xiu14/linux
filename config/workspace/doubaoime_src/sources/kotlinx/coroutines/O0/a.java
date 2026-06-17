package kotlinx.coroutines.O0;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.o;
import kotlin.r.d;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlinx.coroutines.N0.i;

/* loaded from: classes2.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        dVar.resumeWith(r.J(th));
        throw th;
    }

    public static final void b(d<? super o> dVar, d<?> dVar2) {
        try {
            i.c(kotlin.coroutines.intrinsics.a.d(dVar), o.a, null, 2);
        } catch (Throwable th) {
            a(dVar2, th);
            throw null;
        }
    }

    public static final <T> void c(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        try {
            i.c(kotlin.coroutines.intrinsics.a.d(kotlin.coroutines.intrinsics.a.a(lVar, dVar)), o.a, null, 2);
        } catch (Throwable th) {
            a(dVar, th);
            throw null;
        }
    }

    public static void d(p pVar, Object obj, d dVar, l lVar, int i) {
        int i2 = i & 4;
        try {
            i.b(kotlin.coroutines.intrinsics.a.d(kotlin.coroutines.intrinsics.a.b(pVar, obj, dVar)), o.a, null);
        } catch (Throwable th) {
            a(dVar, th);
            throw null;
        }
    }
}
