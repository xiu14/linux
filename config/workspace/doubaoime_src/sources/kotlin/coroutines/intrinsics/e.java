package kotlin.coroutines.intrinsics;

import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.b.p;
import kotlin.s.c.D;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class e extends kotlin.r.h.a.c {
    private int a;
    final /* synthetic */ p b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f10104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.r.d dVar, kotlin.r.f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.b = pVar;
        this.f10104c = obj;
        l.d(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
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
        l.d(this.b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        p pVar = this.b;
        D.c(pVar, 2);
        return pVar.invoke(this.f10104c, this);
    }
}
