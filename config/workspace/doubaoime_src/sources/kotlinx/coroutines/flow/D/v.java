package kotlinx.coroutines.flow.D;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.N0.z;

/* loaded from: classes2.dex */
final class v<T> implements kotlinx.coroutines.flow.g<T> {
    private final kotlin.r.f a;
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.s.b.p<T, kotlin.r.d<? super kotlin.o>, Object> f10262c;

    @kotlin.r.h.a.e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {212}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<T, kotlin.r.d<? super kotlin.o>, Object> {
        int a;
        /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.g<T> f10263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.f10263c = gVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            a aVar = new a(this.f10263c, dVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(Object obj, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = new a(this.f10263c, dVar);
            aVar.b = obj;
            return aVar.invokeSuspend(kotlin.o.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                Object obj2 = this.b;
                kotlinx.coroutines.flow.g<T> gVar = this.f10263c;
                this.a = 1;
                if (gVar.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.prolificinteractive.materialcalendarview.r.k0(obj);
            }
            return kotlin.o.a;
        }
    }

    public v(kotlinx.coroutines.flow.g<? super T> gVar, kotlin.r.f fVar) {
        this.a = fVar;
        this.b = z.b(fVar);
        this.f10262c = new a(gVar, null);
    }

    @Override // kotlinx.coroutines.flow.g
    public Object emit(T t, kotlin.r.d<? super kotlin.o> dVar) {
        Object a2 = g.a(this.a, t, this.b, this.f10262c, dVar);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : kotlin.o.a;
    }
}
