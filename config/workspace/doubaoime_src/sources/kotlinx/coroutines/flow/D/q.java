package kotlinx.coroutines.flow.D;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.r.f;
import kotlinx.coroutines.C0795d;

/* loaded from: classes2.dex */
public final class q<T> extends kotlin.r.h.a.c implements kotlinx.coroutines.flow.g<T>, kotlin.r.h.a.d {
    public final kotlinx.coroutines.flow.g<T> a;
    public final kotlin.r.f b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10259c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.r.f f10260d;

    /* renamed from: e, reason: collision with root package name */
    private kotlin.r.d<? super kotlin.o> f10261e;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.p<Integer, f.b, Integer> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public Integer invoke(Integer num, f.b bVar) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.f fVar) {
        super(n.a, kotlin.r.g.a);
        this.a = gVar;
        this.b = fVar;
        this.f10259c = ((Number) fVar.fold(0, a.a)).intValue();
    }

    private final Object a(kotlin.r.d<? super kotlin.o> dVar, T t) {
        kotlin.s.b.q qVar;
        kotlin.r.f context = dVar.getContext();
        C0795d.f(context);
        kotlin.r.f fVar = this.f10260d;
        if (fVar != context) {
            if (fVar instanceof l) {
                StringBuilder M = e.a.a.a.a.M("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                M.append(((l) fVar).a);
                M.append(", but then emission attempt of value '");
                M.append(t);
                M.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(kotlin.text.a.W(M.toString()).toString());
            }
            if (((Number) context.fold(0, new s(this))).intValue() != this.f10259c) {
                StringBuilder M2 = e.a.a.a.a.M("Flow invariant is violated:\n\t\tFlow was collected in ");
                M2.append(this.b);
                M2.append(",\n\t\tbut emission happened in ");
                M2.append(context);
                M2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(M2.toString().toString());
            }
            this.f10260d = context;
        }
        this.f10261e = dVar;
        qVar = r.a;
        Object d2 = qVar.d(this.a, t, this);
        if (!kotlin.s.c.l.a(d2, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.f10261e = null;
        }
        return d2;
    }

    @Override // kotlinx.coroutines.flow.g
    public Object emit(T t, kotlin.r.d<? super kotlin.o> dVar) {
        try {
            Object a2 = a(dVar, t);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (a2 == coroutineSingletons) {
                kotlin.s.c.l.f(dVar, TypedValues.AttributesType.S_FRAME);
            }
            return a2 == coroutineSingletons ? a2 : kotlin.o.a;
        } catch (Throwable th) {
            this.f10260d = new l(th, dVar.getContext());
            throw th;
        }
    }

    @Override // kotlin.r.h.a.a, kotlin.r.h.a.d
    public kotlin.r.h.a.d getCallerFrame() {
        kotlin.r.d<? super kotlin.o> dVar = this.f10261e;
        if (dVar instanceof kotlin.r.h.a.d) {
            return (kotlin.r.h.a.d) dVar;
        }
        return null;
    }

    @Override // kotlin.r.h.a.c, kotlin.r.d
    public kotlin.r.f getContext() {
        kotlin.r.f fVar = this.f10260d;
        return fVar == null ? kotlin.r.g.a : fVar;
    }

    @Override // kotlin.r.h.a.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.r.h.a.a
    public Object invokeSuspend(Object obj) {
        Throwable b = kotlin.h.b(obj);
        if (b != null) {
            this.f10260d = new l(b, getContext());
        }
        kotlin.r.d<? super kotlin.o> dVar = this.f10261e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.r.h.a.c, kotlin.r.h.a.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
