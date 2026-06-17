package kotlinx.coroutines.channels;

import kotlinx.coroutines.InterfaceC0812k;

/* loaded from: classes2.dex */
final class o extends kotlin.s.c.m implements kotlin.s.b.l<Throwable, kotlin.o> {
    final /* synthetic */ InterfaceC0812k<kotlin.o> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    o(InterfaceC0812k<? super kotlin.o> interfaceC0812k) {
        super(1);
        this.a = interfaceC0812k;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Throwable th) {
        InterfaceC0812k<kotlin.o> interfaceC0812k = this.a;
        kotlin.o oVar = kotlin.o.a;
        interfaceC0812k.resumeWith(oVar);
        return oVar;
    }
}
