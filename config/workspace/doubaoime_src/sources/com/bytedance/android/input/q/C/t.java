package com.bytedance.android.input.q.C;

import com.bytedance.android.input.network.api.IRecommends;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.Request$expansionOrPolishFlow$$inlined$transform$1", f = "Request.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super IRecommends.Data>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f f2971c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IRecommends.Data.Source f2972d;

    public static final class a<T> implements kotlinx.coroutines.flow.g {
        final /* synthetic */ kotlinx.coroutines.flow.g<IRecommends.Data> a;
        final /* synthetic */ IRecommends.Data.Source b;

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.Request$expansionOrPolishFlow$$inlined$transform$1$1", f = "Request.kt", l = {224, 228}, m = "emit")
        /* renamed from: com.bytedance.android.input.q.C.t$a$a, reason: collision with other inner class name */
        public static final class C0092a extends kotlin.r.h.a.c {
            /* synthetic */ Object a;
            int b;

            public C0092a(kotlin.r.d dVar) {
                super(dVar);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(kotlinx.coroutines.flow.g gVar, IRecommends.Data.Source source) {
            this.b = source;
            this.a = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // kotlinx.coroutines.flow.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r14, kotlin.r.d<? super kotlin.o> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.bytedance.android.input.q.C.t.a.C0092a
                if (r0 == 0) goto L13
                r0 = r15
                com.bytedance.android.input.q.C.t$a$a r0 = (com.bytedance.android.input.q.C.t.a.C0092a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                com.bytedance.android.input.q.C.t$a$a r0 = new com.bytedance.android.input.q.C.t$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.a
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.b
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L36
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                com.prolificinteractive.materialcalendarview.r.k0(r15)
                goto L6e
            L2a:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L32:
                com.prolificinteractive.materialcalendarview.r.k0(r15)
                goto L58
            L36:
                com.prolificinteractive.materialcalendarview.r.k0(r15)
                kotlinx.coroutines.flow.g<com.bytedance.android.input.network.api.IRecommends$Data> r15 = r13.a
                com.bytedance.android.input.network.api.IRecommends$Data r14 = (com.bytedance.android.input.network.api.IRecommends.Data) r14
                if (r14 != 0) goto L65
                com.bytedance.android.input.network.api.IRecommends$Data r14 = new com.bytedance.android.input.network.api.IRecommends$Data
                r7 = 0
                r8 = 0
                r9 = 0
                com.bytedance.android.input.network.api.IRecommends$Data$Source r10 = r13.b
                r11 = 0
                r12 = 46
                java.lang.String r6 = "Error"
                r5 = r14
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                r0.b = r4
                java.lang.Object r14 = r15.emit(r14, r0)
                if (r14 != r1) goto L58
                return r1
            L58:
                com.bytedance.android.input.basic.applog.api.IAppLog$a r14 = com.bytedance.android.input.basic.applog.api.IAppLog.a
                org.json.JSONObject r15 = new org.json.JSONObject
                r15.<init>()
                java.lang.String r0 = "ai_polish_client_error"
                r14.t(r0, r15)
                goto L6e
            L65:
                r0.b = r3
                java.lang.Object r14 = r15.emit(r14, r0)
                if (r14 != r1) goto L6e
                return r1
            L6e:
                kotlin.o r14 = kotlin.o.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.t.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kotlinx.coroutines.flow.f fVar, kotlin.r.d dVar, IRecommends.Data.Source source) {
        super(2, dVar);
        this.f2971c = fVar;
        this.f2972d = source;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        t tVar = new t(this.f2971c, dVar, this.f2972d);
        tVar.b = obj;
        return tVar;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, kotlin.r.d<? super kotlin.o> dVar) {
        t tVar = new t(this.f2971c, dVar, this.f2972d);
        tVar.b = gVar;
        return tVar.invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            kotlinx.coroutines.flow.g gVar = (kotlinx.coroutines.flow.g) this.b;
            kotlinx.coroutines.flow.f fVar = this.f2971c;
            a aVar = new a(gVar, this.f2972d);
            this.a = 1;
            if (fVar.a(aVar, this) == coroutineSingletons) {
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
