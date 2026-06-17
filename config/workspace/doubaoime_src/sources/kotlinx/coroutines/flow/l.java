package kotlinx.coroutines.flow;

@kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
/* loaded from: classes2.dex */
final class l<T> extends kotlin.r.h.a.c {
    Object a;
    /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    int f10274c;

    l(kotlin.r.d<? super l> dVar) {
        super(dVar);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.f10274c |= Integer.MIN_VALUE;
        return h.b(null, null, null, this);
    }
}
