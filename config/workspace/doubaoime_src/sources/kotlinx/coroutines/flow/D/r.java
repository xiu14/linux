package kotlinx.coroutines.flow.D;

import kotlin.s.c.D;

/* loaded from: classes2.dex */
public final class r {
    private static final kotlin.s.b.q<kotlinx.coroutines.flow.g<Object>, Object, kotlin.r.d<? super kotlin.o>, Object> a;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
    /* synthetic */ class a extends kotlin.s.c.k implements kotlin.s.b.q<kotlinx.coroutines.flow.g<? super Object>, Object, kotlin.r.d<? super kotlin.o>, Object> {
        public static final a a = new a();

        a() {
            super(3, kotlinx.coroutines.flow.g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.s.b.q
        public Object d(kotlinx.coroutines.flow.g<? super Object> gVar, Object obj, kotlin.r.d<? super kotlin.o> dVar) {
            return gVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.a;
        D.c(aVar, 3);
        a = aVar;
    }
}
