package kotlinx.coroutines.channels;

@kotlin.r.h.a.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {153}, m = "awaitClose")
/* loaded from: classes2.dex */
final class n extends kotlin.r.h.a.c {
    Object a;
    Object b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f10233c;

    /* renamed from: d, reason: collision with root package name */
    int f10234d;

    n(kotlin.r.d<? super n> dVar) {
        super(dVar);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        this.f10233c = obj;
        this.f10234d |= Integer.MIN_VALUE;
        return h.a(null, null, this);
    }
}
