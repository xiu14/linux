package kotlin.coroutines.intrinsics;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.b.l;
import kotlin.s.c.D;

/* loaded from: classes2.dex */
public final class c extends kotlin.r.h.a.c {
    private int a;
    final /* synthetic */ l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.r.d dVar, kotlin.r.f fVar, l lVar) {
        super(dVar, fVar);
        this.b = lVar;
        kotlin.s.c.l.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // kotlin.r.h.a.a
    protected Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.a = 2;
            r.k0(obj);
            return obj;
        }
        this.a = 1;
        r.k0(obj);
        kotlin.s.c.l.d(this.b, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        l lVar = this.b;
        D.c(lVar, 1);
        return lVar.invoke(this);
    }
}
