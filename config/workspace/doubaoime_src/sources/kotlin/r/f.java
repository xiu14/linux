package kotlin.r;

import kotlin.r.e;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public interface f {

    public static final class a {

        /* renamed from: kotlin.r.f$a$a, reason: collision with other inner class name */
        static final class C0472a extends m implements p<f, b, f> {
            public static final C0472a a = new C0472a();

            C0472a() {
                super(2);
            }

            @Override // kotlin.s.b.p
            public f invoke(f fVar, b bVar) {
                kotlin.r.c cVar;
                f fVar2 = fVar;
                b bVar2 = bVar;
                l.f(fVar2, "acc");
                l.f(bVar2, "element");
                f minusKey = fVar2.minusKey(bVar2.getKey());
                g gVar = g.a;
                if (minusKey == gVar) {
                    return bVar2;
                }
                e.a aVar = e.F;
                e.a aVar2 = e.a.a;
                e eVar = (e) minusKey.get(aVar2);
                if (eVar == null) {
                    cVar = new kotlin.r.c(minusKey, bVar2);
                } else {
                    f minusKey2 = minusKey.minusKey(aVar2);
                    if (minusKey2 == gVar) {
                        return new kotlin.r.c(bVar2, eVar);
                    }
                    cVar = new kotlin.r.c(new kotlin.r.c(minusKey2, bVar2), eVar);
                }
                return cVar;
            }
        }

        public static f a(f fVar, f fVar2) {
            l.f(fVar2, "context");
            return fVar2 == g.a ? fVar : (f) fVar2.fold(fVar, C0472a.a);
        }
    }

    public interface b extends f {
        @Override // kotlin.r.f
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    f minusKey(c<?> cVar);

    f plus(f fVar);
}
