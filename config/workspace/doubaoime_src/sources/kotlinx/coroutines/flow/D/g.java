package kotlinx.coroutines.flow.D;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.s.c.D;
import kotlinx.coroutines.N0.z;

/* loaded from: classes2.dex */
public final class g {
    public static final <T, V> Object a(kotlin.r.f fVar, V v, Object obj, kotlin.s.b.p<? super V, ? super kotlin.r.d<? super T>, ? extends Object> pVar, kotlin.r.d<? super T> dVar) {
        Object c2 = z.c(fVar, obj);
        try {
            u uVar = new u(dVar, fVar);
            D.c(pVar, 2);
            Object invoke = pVar.invoke(v, uVar);
            z.a(fVar, c2);
            if (invoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
            }
            return invoke;
        } catch (Throwable th) {
            z.a(fVar, c2);
            throw th;
        }
    }
}
