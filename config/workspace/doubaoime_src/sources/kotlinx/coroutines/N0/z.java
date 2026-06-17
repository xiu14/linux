package kotlinx.coroutines.N0;

import java.util.Objects;
import kotlin.r.f;
import kotlinx.coroutines.E0;

/* loaded from: classes2.dex */
public final class z {
    public static final x a = new x("NO_THREAD_ELEMENTS");
    private static final kotlin.s.b.p<Object, f.b, Object> b = a.a;

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.s.b.p<E0<?>, f.b, E0<?>> f10178c = b.a;

    /* renamed from: d, reason: collision with root package name */
    private static final kotlin.s.b.p<C, f.b, C> f10179d = c.a;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.p<Object, f.b, Object> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public Object invoke(Object obj, f.b bVar) {
            f.b bVar2 = bVar;
            if (!(bVar2 instanceof E0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar2 : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.p<E0<?>, f.b, E0<?>> {
        public static final b a = new b();

        b() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public E0<?> invoke(E0<?> e0, f.b bVar) {
            E0<?> e02 = e0;
            f.b bVar2 = bVar;
            if (e02 != null) {
                return e02;
            }
            if (bVar2 instanceof E0) {
                return (E0) bVar2;
            }
            return null;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.p<C, f.b, C> {
        public static final c a = new c();

        c() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public C invoke(C c2, f.b bVar) {
            C c3 = c2;
            f.b bVar2 = bVar;
            if (bVar2 instanceof E0) {
                E0<?> e0 = (E0) bVar2;
                c3.a(e0, e0.Q(c3.a));
            }
            return c3;
        }
    }

    public static final void a(kotlin.r.f fVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (obj instanceof C) {
            ((C) obj).b(fVar);
            return;
        }
        Object fold = fVar.fold(null, f10178c);
        Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((E0) fold).H(fVar, obj);
    }

    public static final Object b(kotlin.r.f fVar) {
        Object fold = fVar.fold(0, b);
        kotlin.s.c.l.c(fold);
        return fold;
    }

    public static final Object c(kotlin.r.f fVar, Object obj) {
        if (obj == null) {
            obj = b(fVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? fVar.fold(new C(fVar, ((Number) obj).intValue()), f10179d) : ((E0) obj).Q(fVar);
    }
}
