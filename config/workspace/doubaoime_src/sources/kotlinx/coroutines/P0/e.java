package kotlinx.coroutines.P0;

import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class e extends m implements l<Throwable, o> {
    final /* synthetic */ d a;
    final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, Object obj) {
        super(1);
        this.a = dVar;
        this.b = obj;
    }

    @Override // kotlin.s.b.l
    public o invoke(Throwable th) {
        this.a.c(this.b);
        return o.a;
    }
}
