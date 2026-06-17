package com.bytedance.android.input.q.C;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.recognition.api.a;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.network.api.IRecommends;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC0796d0;
import kotlinx.coroutines.C0798e0;
import kotlinx.coroutines.InterfaceC0817m0;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k extends g {
    public static final k h = new k();
    private static final boolean i = true;
    private static final AbstractC0796d0 j;
    private static InterfaceC0817m0 k;
    private static final CopyOnWriteArrayList<String> l;
    private static boolean m;
    private static int n;
    private static boolean o;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$assistant$1", f = "ChatRequest.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<IRecommends.Data, kotlin.r.d<? super kotlin.o>, Object> {
        /* synthetic */ Object a;
        final /* synthetic */ kotlin.s.c.v b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f2947c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.s.c.v vVar, long j, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.b = vVar;
            this.f2947c = j;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            a aVar = new a(this.b, this.f2947c, dVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(IRecommends.Data data, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = new a(this.b, this.f2947c, dVar);
            aVar.a = data;
            kotlin.o oVar = kotlin.o.a;
            aVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            IRecommends.Data data = (IRecommends.Data) this.a;
            if (!this.b.a) {
                IAppLog.a aVar = IAppLog.a;
                Objects.requireNonNull(aVar);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ai_chat_first_reply_time", System.currentTimeMillis() - this.f2947c);
                aVar.t("ai_chat_first_reply_report", jSONObject);
                this.b.a = true;
            }
            if (data.e().isEmpty()) {
                data.d();
            } else {
                kotlin.collections.g.C(data.e(), null, null, null, 0, null, null, 63, null);
            }
            if (data.f().ordinal() == 3) {
                IAppLog.a aVar2 = IAppLog.a;
                Objects.requireNonNull(aVar2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("ai_chat_finish_reply_time", System.currentTimeMillis() - this.f2947c);
                aVar2.t("ai_chat_finish_reply_report", jSONObject2);
                Objects.requireNonNull(aVar2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("tabname", "smartreply");
                aVar2.t("AI_tabcontentshow", jSONObject3);
            }
            AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
            boolean a = data.a();
            String d2 = data.d();
            IRecommends.Data.Type f2 = data.f();
            data.c().ordinal();
            aiChatMenuViewModel.g(a, d2, f2);
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Throwable, kotlin.o> {
        final /* synthetic */ com.bytedance.android.input.basic.recognition.api.a a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LifecycleCoroutineScope f2948c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.v f2949d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f2950e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(com.bytedance.android.input.basic.recognition.api.a aVar, String str, LifecycleCoroutineScope lifecycleCoroutineScope, kotlin.s.c.v vVar, long j) {
            super(1);
            this.a = aVar;
            this.b = str;
            this.f2948c = lifecycleCoroutineScope;
            this.f2949d = vVar;
            this.f2950e = j;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Throwable th) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            aVar.t("recommend_chat_load_more", new JSONObject());
            k.k = kotlinx.coroutines.flow.h.l(new kotlinx.coroutines.flow.s(kotlinx.coroutines.flow.h.k(kotlinx.coroutines.flow.h.e(k.h.z(this.a, this.b, true)), k.j), new l(this.f2949d, this.f2950e, null)), this.f2948c);
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$chatAssistantFlow$$inlined$transform$1", f = "ChatRequest.kt", l = {40}, m = "invokeSuspend")
    public static final class c extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super IRecommends.Data>, kotlin.r.d<? super kotlin.o>, Object> {
        int a;
        private /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f f2951c;

        public static final class a<T> implements kotlinx.coroutines.flow.g {
            final /* synthetic */ kotlinx.coroutines.flow.g<IRecommends.Data> a;

            @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$chatAssistantFlow$$inlined$transform$1$1", f = "ChatRequest.kt", l = {225, 229, 234}, m = "emit")
            /* renamed from: com.bytedance.android.input.q.C.k$c$a$a, reason: collision with other inner class name */
            public static final class C0090a extends kotlin.r.h.a.c {
                /* synthetic */ Object a;
                int b;

                public C0090a(kotlin.r.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.r.h.a.a
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.g gVar) {
                this.a = gVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
            @Override // kotlinx.coroutines.flow.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r17, kotlin.r.d<? super kotlin.o> r18) {
                /*
                    r16 = this;
                    r0 = r16
                    r1 = r18
                    boolean r2 = r1 instanceof com.bytedance.android.input.q.C.k.c.a.C0090a
                    if (r2 == 0) goto L17
                    r2 = r1
                    com.bytedance.android.input.q.C.k$c$a$a r2 = (com.bytedance.android.input.q.C.k.c.a.C0090a) r2
                    int r3 = r2.b
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L17
                    int r3 = r3 - r4
                    r2.b = r3
                    goto L1c
                L17:
                    com.bytedance.android.input.q.C.k$c$a$a r2 = new com.bytedance.android.input.q.C.k$c$a$a
                    r2.<init>(r1)
                L1c:
                    java.lang.Object r1 = r2.a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r4 = r2.b
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r4 == 0) goto L42
                    if (r4 == r7) goto L3e
                    if (r4 == r6) goto L3a
                    if (r4 != r5) goto L32
                    com.prolificinteractive.materialcalendarview.r.k0(r1)
                    goto La2
                L32:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L3a:
                    com.prolificinteractive.materialcalendarview.r.k0(r1)
                    goto La2
                L3e:
                    com.prolificinteractive.materialcalendarview.r.k0(r1)
                    goto L6f
                L42:
                    com.prolificinteractive.materialcalendarview.r.k0(r1)
                    kotlinx.coroutines.flow.g<com.bytedance.android.input.network.api.IRecommends$Data> r1 = r0.a
                    r4 = r17
                    com.bytedance.android.input.network.api.IRecommends$Data r4 = (com.bytedance.android.input.network.api.IRecommends.Data) r4
                    if (r4 != 0) goto L94
                    java.util.concurrent.CopyOnWriteArrayList r4 = com.bytedance.android.input.q.C.k.v()
                    boolean r4 = r4.isEmpty()
                    if (r4 == 0) goto L7c
                    com.bytedance.android.input.network.api.IRecommends$Data r4 = new com.bytedance.android.input.network.api.IRecommends$Data
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 62
                    java.lang.String r9 = "Error"
                    r8 = r4
                    r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                    r2.b = r7
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto L6f
                    return r3
                L6f:
                    com.bytedance.android.input.basic.applog.api.IAppLog$a r1 = com.bytedance.android.input.basic.applog.api.IAppLog.a
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.lang.String r3 = "ai_chat_client_error"
                    r1.t(r3, r2)
                    goto La2
                L7c:
                    com.bytedance.android.input.network.api.IRecommends$Data r4 = new com.bytedance.android.input.network.api.IRecommends$Data
                    r9 = 0
                    r10 = 0
                    r11 = 0
                    r12 = 0
                    r13 = 0
                    r14 = 62
                    java.lang.String r8 = "Finish"
                    r7 = r4
                    r7.<init>(r8, r9, r10, r11, r12, r13, r14)
                    r2.b = r6
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto La2
                    return r3
                L94:
                    com.bytedance.android.input.q.C.k r6 = com.bytedance.android.input.q.C.k.h
                    com.bytedance.android.input.q.C.k.s(r6, r4)
                    r2.b = r5
                    java.lang.Object r1 = r1.emit(r4, r2)
                    if (r1 != r3) goto La2
                    return r3
                La2:
                    kotlin.o r1 = kotlin.o.a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.k.c.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.flow.f fVar, kotlin.r.d dVar) {
            super(2, dVar);
            this.f2951c = fVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            c cVar = new c(this.f2951c, dVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, kotlin.r.d<? super kotlin.o> dVar) {
            c cVar = new c(this.f2951c, dVar);
            cVar.b = gVar;
            return cVar.invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                kotlinx.coroutines.flow.g gVar = (kotlinx.coroutines.flow.g) this.b;
                kotlinx.coroutines.flow.f fVar = this.f2951c;
                a aVar = new a(gVar);
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

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$chatAssistantFlow$2", f = "ChatRequest.kt", l = {210}, m = "invokeSuspend")
    static final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super IRecommends.Data>, kotlin.r.d<? super kotlin.o>, Object> {
        int a;
        private /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f2953c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, kotlin.r.d<? super d> dVar) {
            super(2, dVar);
            this.f2953c = str;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            d dVar2 = new d(this.f2953c, dVar);
            dVar2.b = obj;
            return dVar2;
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, kotlin.r.d<? super kotlin.o> dVar) {
            d dVar2 = new d(this.f2953c, dVar);
            dVar2.b = gVar;
            return dVar2.invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                kotlinx.coroutines.flow.g gVar = (kotlinx.coroutines.flow.g) this.b;
                IRecommends.Data data = new IRecommends.Data("Error", this.f2953c, null, false, null, null, 60);
                this.a = 1;
                if (gVar.emit(data, this) == coroutineSingletons) {
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

    static final class e extends kotlin.s.c.m implements kotlin.s.b.l<a.b, Boolean> {
        public static final e a = new e();

        e() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(a.b bVar) {
            kotlin.s.c.l.f(bVar, "it");
            return Boolean.TRUE;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$requestBot$$inlined$transform$1", f = "ChatRequest.kt", l = {40}, m = "invokeSuspend")
    public static final class f extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super IRecommends.Data>, kotlin.r.d<? super kotlin.o>, Object> {
        int a;
        private /* synthetic */ Object b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f f2954c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Source f2955d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.v f2956e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Type f2957f;

        public static final class a<T> implements kotlinx.coroutines.flow.g {
            final /* synthetic */ kotlinx.coroutines.flow.g<IRecommends.Data> a;
            final /* synthetic */ IRecommends.Data.Source b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.s.c.v f2958c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ IRecommends.Data.Type f2959d;

            @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.ChatRequest$requestBot$$inlined$transform$1$1", f = "ChatRequest.kt", l = {227, 255, 272, 279}, m = "emit")
            /* renamed from: com.bytedance.android.input.q.C.k$f$a$a, reason: collision with other inner class name */
            public static final class C0091a extends kotlin.r.h.a.c {
                /* synthetic */ Object a;
                int b;

                /* renamed from: d, reason: collision with root package name */
                Object f2961d;

                /* renamed from: e, reason: collision with root package name */
                Object f2962e;

                /* renamed from: f, reason: collision with root package name */
                Object f2963f;

                /* renamed from: g, reason: collision with root package name */
                Object f2964g;
                int h;

                public C0091a(kotlin.r.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.r.h.a.a
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.g gVar, IRecommends.Data.Source source, kotlin.s.c.v vVar, IRecommends.Data.Type type) {
                this.b = source;
                this.f2958c = vVar;
                this.f2959d = type;
                this.a = gVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0157  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            @Override // kotlinx.coroutines.flow.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r23, kotlin.r.d<? super kotlin.o> r24) {
                /*
                    Method dump skipped, instructions count: 422
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.k.f.a.emit(java.lang.Object, kotlin.r.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlinx.coroutines.flow.f fVar, kotlin.r.d dVar, IRecommends.Data.Source source, kotlin.s.c.v vVar, IRecommends.Data.Type type) {
            super(2, dVar);
            this.f2954c = fVar;
            this.f2955d = source;
            this.f2956e = vVar;
            this.f2957f = type;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            f fVar = new f(this.f2954c, dVar, this.f2955d, this.f2956e, this.f2957f);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.flow.g<? super IRecommends.Data> gVar, kotlin.r.d<? super kotlin.o> dVar) {
            f fVar = new f(this.f2954c, dVar, this.f2955d, this.f2956e, this.f2957f);
            fVar.b = gVar;
            return fVar.invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                kotlinx.coroutines.flow.g gVar = (kotlinx.coroutines.flow.g) this.b;
                kotlinx.coroutines.flow.f fVar = this.f2954c;
                a aVar = new a(gVar, this.f2955d, this.f2956e, this.f2957f);
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

    static {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.q.C.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                k kVar = k.h;
                return new Thread(runnable, k.h.getClass().getName());
            }
        });
        kotlin.s.c.l.e(newSingleThreadExecutor, "newSingleThreadExecutor …ead(it, javaClass.name) }");
        j = new C0798e0(newSingleThreadExecutor);
        l = new CopyOnWriteArrayList<>();
        m = true;
        o = true;
    }

    private k() {
    }

    public static final void s(k kVar, IRecommends.Data data) {
        Objects.requireNonNull(kVar);
        CopyOnWriteArrayList<String> copyOnWriteArrayList = l;
        synchronized (copyOnWriteArrayList) {
            if (data.c() != IRecommends.Data.Source.CHAT) {
                return;
            }
            if (o) {
                if (data.f() == IRecommends.Data.Type.TEXT) {
                    if (!kotlin.text.a.s(data.d())) {
                        copyOnWriteArrayList.add(data.d());
                    }
                    if (data.a()) {
                        copyOnWriteArrayList.add("⚆");
                    }
                } else if (data.f() == IRecommends.Data.Type.STREAM_END || data.f() == IRecommends.Data.Type.FINISH || data.f() == IRecommends.Data.Type.ERROR) {
                    if (n >= 2) {
                        o = false;
                    }
                    copyOnWriteArrayList.add("⚆");
                    n++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.f<com.bytedance.android.input.network.api.IRecommends.Data> z(com.bytedance.android.input.basic.recognition.api.a r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.k.z(com.bytedance.android.input.basic.recognition.api.a, java.lang.String, boolean):kotlinx.coroutines.flow.f");
    }

    public final void A(boolean z) {
        m = z;
    }

    @Override // com.bytedance.android.input.q.C.v
    protected String c() {
        return "os.ime.im_expansion_seed";
    }

    @Override // com.bytedance.android.input.q.C.g, com.bytedance.android.input.q.C.v
    public boolean g() {
        return i;
    }

    @Override // com.bytedance.android.input.q.C.v
    protected String h() {
        return "os.ime.im_polish_seed";
    }

    @Override // com.bytedance.android.input.q.C.g, com.bytedance.android.input.q.C.v
    protected kotlinx.coroutines.flow.f<IRecommends.Data> m(String str, String str2, IRecommends.Data.Source source, IRecommends.Data.Type type) {
        kotlin.s.c.l.f(str, "input");
        kotlin.s.c.l.f(str2, "chain");
        kotlin.s.c.l.f(source, "source");
        return kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.j(new f(super.m(str, str2, source, type), null, source, new kotlin.s.c.v(), type)));
    }

    @Override // com.bytedance.android.input.q.C.v
    public void o() {
        super.o();
        l.clear();
        n = 0;
        o = true;
        if (k != null) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            aVar.t("recommend_chat_stop", new JSONObject());
        }
        InterfaceC0817m0 interfaceC0817m0 = k;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        k = null;
    }

    public void x(com.bytedance.android.input.basic.recognition.api.a aVar, String str) {
        LifecycleCoroutineScope lifecycleScope;
        kotlinx.coroutines.flow.f a2;
        kotlin.s.c.l.f(aVar, "conversation");
        kotlin.s.c.l.f(str, "currentInput");
        com.bytedance.android.input.r.j.i("ChatRequest", "ChatRequest assistant begin");
        InterfaceC0817m0 interfaceC0817m0 = k;
        if (interfaceC0817m0 != null && interfaceC0817m0.a()) {
            com.bytedance.android.input.r.j.j("ChatRequest", "chatAssistantJob isActive, return");
            return;
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(service)) == null) {
            return;
        }
        kotlin.s.c.v vVar = new kotlin.s.c.v();
        long currentTimeMillis = System.currentTimeMillis();
        a2 = kotlinx.coroutines.flow.q.a(new kotlinx.coroutines.flow.i(kotlinx.coroutines.flow.h.k(z(aVar, str, false), j)), 0, 1);
        k = kotlinx.coroutines.flow.h.l(kotlinx.coroutines.flow.h.e(new kotlinx.coroutines.flow.s(kotlinx.coroutines.flow.h.e(a2), new a(vVar, currentTimeMillis, null))), lifecycleScope);
    }

    public final void y(com.bytedance.android.input.basic.recognition.api.a aVar, String str) {
        LifecycleCoroutineScope lifecycleScope;
        kotlin.s.c.l.f(aVar, "conversation");
        kotlin.s.c.l.f(str, "currentInput");
        ImeService service = KeyboardJni.getService();
        if (service == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(service)) == null) {
            return;
        }
        InterfaceC0817m0 interfaceC0817m0 = k;
        if (interfaceC0817m0 != null && interfaceC0817m0.isCancelled()) {
            return;
        }
        kotlin.s.c.v vVar = new kotlin.s.c.v();
        long currentTimeMillis = System.currentTimeMillis();
        if (interfaceC0817m0 != null) {
            interfaceC0817m0.z(new b(aVar, str, lifecycleScope, vVar, currentTimeMillis));
        }
    }
}
