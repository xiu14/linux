package com.bytedance.android.input.common.asr.sdkImp;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.common.asr.sdkImp.SdkImpl;
import com.bytedance.android.input.environment.api.IEnvironment;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.SAMICoreLogCallback;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.structures.SAMICoreAudioBin;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0798e0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.InterfaceC0822s;
import org.json.JSONObject;

@ServiceImpl
/* loaded from: classes.dex */
public final class SdkImpl implements IAsr {
    public static final /* synthetic */ int w = 0;
    private SAMICore b;

    /* renamed from: d, reason: collision with root package name */
    private SAMICoreAudioBin f2175d;

    /* renamed from: e, reason: collision with root package name */
    private SAMICoreBlock f2176e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2177f;
    private InterfaceC0817m0 s;
    private InterfaceC0817m0 t;

    /* renamed from: c, reason: collision with root package name */
    private List<SAMICore> f2174c = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private AtomicBoolean f2178g = new AtomicBoolean(false);
    private AtomicBoolean h = new AtomicBoolean(false);
    private final kotlin.e i = kotlin.a.c(d.a);
    private final kotlin.e j = kotlin.a.c(f.a);
    private final kotlin.e k = kotlin.a.c(e.a);
    private final String l = "Asr-Flow-SdkImpl-Main";
    private final IAsr.Type m = IAsr.Type.SDK;
    private final String n = "ime";
    private final kotlinx.coroutines.P0.c o = kotlinx.coroutines.P0.f.a(false, 1);
    private final kotlinx.coroutines.P0.c p = kotlinx.coroutines.P0.f.a(false, 1);
    private IAsr.c q = new IAsr.c(null, null, null, false, null, 31);
    private Map<byte[], Integer> r = new LinkedHashMap();
    private final com.bytedance.android.input.common.asr.sdkImpl.i.b u = new com.bytedance.android.input.common.t.a.d.b();
    private final com.bytedance.android.input.common.asr.sdkImpl.i.a v = new com.bytedance.android.input.common.t.a.d.a();

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl$disconnect$1", f = "SdkImpl.kt", l = {178}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements p<G, kotlin.r.d<? super o>, Object> {
        Object a;
        int b;

        a(kotlin.r.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return SdkImpl.this.new a(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return SdkImpl.this.new a(dVar).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            Object J2;
            SdkImpl sdkImpl;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.b;
            try {
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            try {
                if (i == 0) {
                    r.k0(obj);
                    SdkImpl.this.u.d();
                    if (SdkImpl.this.v.isConnected()) {
                        SdkImpl sdkImpl2 = SdkImpl.this;
                        IAppGlobals.a.x(sdkImpl2.l, "disconnect() begin");
                        kotlinx.coroutines.P0.c cVar = sdkImpl2.o;
                        this.a = sdkImpl2;
                        this.b = 1;
                        if (r.Y(cVar, null, this, 1, null) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        sdkImpl = sdkImpl2;
                    }
                    return o.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sdkImpl = (SdkImpl) this.a;
                r.k0(obj);
                IAppGlobals.a aVar = IAppGlobals.a;
                aVar.j(sdkImpl.l, "destroy-start");
                long currentTimeMillis = System.currentTimeMillis();
                SAMICore sAMICore = sdkImpl.b;
                sdkImpl.b = null;
                if (sAMICore != null) {
                    new Integer(sAMICore.SAMICoreDestroyHandle());
                }
                aVar.j(sdkImpl.l, "destroy-end cost " + (System.currentTimeMillis() - currentTimeMillis));
                r.n0(sdkImpl.o, null, 1, null);
                sdkImpl.v.disconnect();
                aVar.x(sdkImpl.l, "disconnect() end");
                J2 = o.a;
                SdkImpl sdkImpl3 = SdkImpl.this;
                Throwable b = kotlin.h.b(J2);
                if (b != null) {
                    IAppGlobals.a.e(sdkImpl3.l, "disconnect() " + b);
                }
                return o.a;
            } catch (Throwable th2) {
                r.n0(sdkImpl.o, null, 1, null);
                throw th2;
            }
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl", f = "SdkImpl.kt", l = {333, 339}, m = "initEngine")
    static final class b extends kotlin.r.h.a.c {
        Object a;
        Object b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2180c;

        /* renamed from: d, reason: collision with root package name */
        long f2181d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f2182e;

        /* renamed from: g, reason: collision with root package name */
        int f2184g;

        b(kotlin.r.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            this.f2182e = obj;
            this.f2184g |= Integer.MIN_VALUE;
            return SdkImpl.p(SdkImpl.this, null, this);
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl$initEngine$2", f = "SdkImpl.kt", l = {344}, m = "invokeSuspend")
    static final class c extends kotlin.r.h.a.i implements p<G, kotlin.r.d<? super o>, Object> {
        int a;

        c(kotlin.r.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return SdkImpl.this.new c(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return SdkImpl.this.new c(dVar).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                r.k0(obj);
                SdkImpl sdkImpl = SdkImpl.this;
                this.a = 1;
                if (SdkImpl.i(sdkImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.k0(obj);
            }
            return o.a;
        }
    }

    static final class d extends m implements kotlin.s.b.a<G> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            InterfaceC0822s a2 = C0795d.a(null, 1);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.common.asr.sdkImp.b
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    SdkImpl.d dVar = SdkImpl.d.a;
                    return new Thread(runnable, "asr-sdk-dispatcher");
                }
            });
            l.e(newSingleThreadExecutor, "newSingleThreadExecutor …sr-sdk-dispatcher\")\n    }");
            return r.b(new C0798e0(newSingleThreadExecutor).plus(a2));
        }
    }

    static final class e extends m implements kotlin.s.b.a<G> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            InterfaceC0822s a2 = C0795d.a(null, 1);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.common.asr.sdkImp.c
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    SdkImpl.e eVar = SdkImpl.e.a;
                    return new Thread(runnable, "asr-sdk-destroy-dispatcher");
                }
            });
            l.e(newSingleThreadExecutor, "newSingleThreadExecutor …oy-dispatcher\")\n        }");
            return r.b(new C0798e0(newSingleThreadExecutor).plus(a2));
        }
    }

    static final class f extends m implements kotlin.s.b.a<G> {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public G invoke() {
            InterfaceC0822s a2 = C0795d.a(null, 1);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.common.asr.sdkImp.d
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    SdkImpl.f fVar = SdkImpl.f.a;
                    return new Thread(runnable, "asr-sdk-finish-dispatcher");
                }
            });
            l.e(newSingleThreadExecutor, "newSingleThreadExecutor …finish-dispatcher\")\n    }");
            return r.b(new C0798e0(newSingleThreadExecutor).plus(a2));
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl$start$1", f = "SdkImpl.kt", l = {109}, m = "invokeSuspend")
    static final class g extends kotlin.r.h.a.i implements p<G, kotlin.r.d<? super o>, Object> {
        int a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ IAsr.a f2185c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ IAsr.c f2186d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(IAsr.a aVar, IAsr.c cVar, kotlin.r.d<? super g> dVar) {
            super(2, dVar);
            this.f2185c = aVar;
            this.f2186d = cVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return SdkImpl.this.new g(this.f2185c, this.f2186d, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return SdkImpl.this.new g(this.f2185c, this.f2186d, dVar).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                r.k0(obj);
                SdkImpl sdkImpl = SdkImpl.this;
                IAsr.a aVar = this.f2185c;
                IAsr.c cVar = this.f2186d;
                this.a = 1;
                if (SdkImpl.q(sdkImpl, aVar, cVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.k0(obj);
            }
            return o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.common.asr.sdkImp.SdkImpl$stop$1", f = "SdkImpl.kt", l = {120}, m = "invokeSuspend")
    static final class h extends kotlin.r.h.a.i implements p<G, kotlin.r.d<? super o>, Object> {
        int a;

        h(kotlin.r.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return SdkImpl.this.new h(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return SdkImpl.this.new h(dVar).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                r.k0(obj);
                SdkImpl sdkImpl = SdkImpl.this;
                this.a = 1;
                if (SdkImpl.u(sdkImpl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.k0(obj);
            }
            return o.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[LOOP:0: B:11:0x0052->B:13:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[LOOP:1: B:16:0x006b->B:18:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(com.bytedance.android.input.common.asr.sdkImp.SdkImpl r5, kotlin.r.d r6) {
        /*
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r6 instanceof com.bytedance.android.input.common.asr.sdkImp.g
            if (r0 == 0) goto L16
            r0 = r6
            com.bytedance.android.input.common.asr.sdkImp.g r0 = (com.bytedance.android.input.common.asr.sdkImp.g) r0
            int r1 = r0.f2188d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2188d = r1
            goto L1b
        L16:
            com.bytedance.android.input.common.asr.sdkImp.g r0 = new com.bytedance.android.input.common.asr.sdkImp.g
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f2188d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r5 = r0.a
            com.bytedance.android.input.common.asr.sdkImp.SdkImpl r5 = (com.bytedance.android.input.common.asr.sdkImp.SdkImpl) r5
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            kotlinx.coroutines.P0.c r6 = r5.p
            r0.a = r5
            r0.f2188d = r4
            java.lang.Object r6 = com.prolificinteractive.materialcalendarview.r.Y(r6, r3, r0, r4, r3)
            if (r6 != r1) goto L47
            goto L7d
        L47:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List<com.mammon.audiosdk.SAMICore> r0 = r5.f2174c
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            com.mammon.audiosdk.SAMICore r1 = (com.mammon.audiosdk.SAMICore) r1
            r6.add(r1)
            goto L52
        L62:
            kotlinx.coroutines.P0.c r5 = r5.p
            com.prolificinteractive.materialcalendarview.r.n0(r5, r3, r4, r3)
            java.util.Iterator r5 = r6.iterator()
        L6b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L7b
            java.lang.Object r6 = r5.next()
            com.mammon.audiosdk.SAMICore r6 = (com.mammon.audiosdk.SAMICore) r6
            r6.SAMICoreDestroyHandle()
            goto L6b
        L7b:
            kotlin.o r1 = kotlin.o.a
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.asr.sdkImp.SdkImpl.i(com.bytedance.android.input.common.asr.sdkImp.SdkImpl, kotlin.r.d):java.lang.Object");
    }

    public static final /* synthetic */ Object p(SdkImpl sdkImpl, com.bytedance.android.input.common.asr.sdkImp.e eVar, kotlin.r.d dVar) {
        return sdkImpl.x(null, dVar);
    }

    public static final Object q(SdkImpl sdkImpl, IAsr.a aVar, IAsr.c cVar, kotlin.r.d dVar) {
        Objects.requireNonNull(sdkImpl);
        sdkImpl.q = IAsr.c.a(cVar, null, null, null, false, null, 31);
        Object x = sdkImpl.x(new com.bytedance.android.input.common.asr.sdkImp.h(sdkImpl, aVar), dVar);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : o.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:11:0x0062, B:13:0x0082, B:14:0x008c, B:16:0x009f, B:20:0x00a8, B:22:0x00ac, B:23:0x00b7, B:25:0x00c1, B:26:0x00d2, B:32:0x00cf, B:33:0x00eb), top: B:10:0x0062, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8 A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:11:0x0062, B:13:0x0082, B:14:0x008c, B:16:0x009f, B:20:0x00a8, B:22:0x00ac, B:23:0x00b7, B:25:0x00c1, B:26:0x00d2, B:32:0x00cf, B:33:0x00eb), top: B:10:0x0062, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[Catch: all -> 0x0103, TRY_LEAVE, TryCatch #0 {all -> 0x0103, blocks: (B:11:0x0062, B:13:0x0082, B:14:0x008c, B:16:0x009f, B:20:0x00a8, B:22:0x00ac, B:23:0x00b7, B:25:0x00c1, B:26:0x00d2, B:32:0x00cf, B:33:0x00eb), top: B:10:0x0062, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(com.bytedance.android.input.common.asr.sdkImp.SdkImpl r7, kotlin.r.d r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.asr.sdkImp.SdkImpl.u(com.bytedance.android.input.common.asr.sdkImp.SdkImpl, kotlin.r.d):java.lang.Object");
    }

    private final G v() {
        return (G) this.i.getValue();
    }

    private final G w() {
        return (G) this.k.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b0 A[Catch: all -> 0x053f, TRY_LEAVE, TryCatch #2 {all -> 0x053f, blocks: (B:101:0x00a3, B:103:0x00b0), top: B:100:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0189 A[Catch: all -> 0x0040, JSONException -> 0x03cc, TryCatch #1 {JSONException -> 0x03cc, blocks: (B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:83:0x0378), top: B:15:0x0176, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0195 A[Catch: all -> 0x0040, JSONException -> 0x03cc, TryCatch #1 {JSONException -> 0x03cc, blocks: (B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:83:0x0378), top: B:15:0x0176, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e3 A[Catch: all -> 0x0040, JSONException -> 0x03cc, TryCatch #1 {JSONException -> 0x03cc, blocks: (B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:83:0x0378), top: B:15:0x0176, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02e4 A[Catch: all -> 0x0040, JSONException -> 0x03cc, LOOP:0: B:34:0x02de->B:36:0x02e4, LOOP_END, TryCatch #1 {JSONException -> 0x03cc, blocks: (B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:83:0x0378), top: B:15:0x0176, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0395 A[Catch: all -> 0x0040, JSONException -> 0x03cc, LOOP:1: B:50:0x038f->B:52:0x0395, LOOP_END, TryCatch #1 {JSONException -> 0x03cc, blocks: (B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:83:0x0378), top: B:15:0x0176, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0469 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:13:0x00c6, B:14:0x00d9, B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:55:0x03d1, B:58:0x0451, B:60:0x0469, B:61:0x0476, B:64:0x04a7, B:66:0x04e6, B:67:0x04ef, B:71:0x0517, B:73:0x052a, B:78:0x051e, B:79:0x0526, B:83:0x0378, B:91:0x03ce), top: B:11:0x003b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04e6 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:13:0x00c6, B:14:0x00d9, B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:55:0x03d1, B:58:0x0451, B:60:0x0469, B:61:0x0476, B:64:0x04a7, B:66:0x04e6, B:67:0x04ef, B:71:0x0517, B:73:0x052a, B:78:0x051e, B:79:0x0526, B:83:0x0378, B:91:0x03ce), top: B:11:0x003b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0526 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003b, B:13:0x00c6, B:14:0x00d9, B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:55:0x03d1, B:58:0x0451, B:60:0x0469, B:61:0x0476, B:64:0x04a7, B:66:0x04e6, B:67:0x04ef, B:71:0x0517, B:73:0x052a, B:78:0x051e, B:79:0x0526, B:83:0x0378, B:91:0x03ce), top: B:11:0x003b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0378 A[Catch: all -> 0x0040, JSONException -> 0x03cc, TryCatch #1 {JSONException -> 0x03cc, blocks: (B:16:0x0176, B:18:0x0189, B:23:0x0195, B:24:0x01a1, B:26:0x01e3, B:27:0x01e8, B:30:0x021d, B:33:0x0227, B:34:0x02de, B:36:0x02e4, B:38:0x02f2, B:41:0x030b, B:44:0x0352, B:48:0x0370, B:49:0x0380, B:50:0x038f, B:52:0x0395, B:54:0x039f, B:83:0x0378), top: B:15:0x0176, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(com.bytedance.android.input.common.asr.sdkImp.e r21, kotlin.r.d<? super kotlin.o> r22) {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.asr.sdkImp.SdkImpl.x(com.bytedance.android.input.common.asr.sdkImp.e, kotlin.r.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(String str) {
        IAppGlobals.a.j(this.l, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(String str) {
        IAppGlobals.a.x(this.l, str);
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public IAsr.Type a() {
        return this.m;
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void b() {
        SAMICore.StartAsrGlobalMetrics();
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void c(IAsr.a aVar, IAsr.c cVar) {
        InterfaceC0817m0 interfaceC0817m0;
        l.f(aVar, "callback");
        l.f(cVar, "startInfo");
        this.r.clear();
        this.f2178g.set(true);
        boolean z = false;
        this.h.set(false);
        InterfaceC0817m0 interfaceC0817m02 = this.s;
        if (interfaceC0817m02 != null && interfaceC0817m02.a()) {
            IAppGlobals.a.x(this.l, "start cancel finish");
            InterfaceC0817m0 interfaceC0817m03 = this.s;
            if (interfaceC0817m03 != null) {
                r.z(interfaceC0817m03, null, 1, null);
            }
            this.s = null;
        }
        InterfaceC0817m0 interfaceC0817m04 = this.t;
        if (interfaceC0817m04 != null && interfaceC0817m04.a()) {
            z = true;
        }
        if (z && (interfaceC0817m0 = this.t) != null) {
            r.z(interfaceC0817m0, null, 1, null);
        }
        this.t = C0795d.l(v(), null, null, new g(aVar, cVar, null), 3, null);
        StringBuilder M = e.a.a.a.a.M("start mStartJob = ");
        InterfaceC0817m0 interfaceC0817m05 = this.t;
        M.append(interfaceC0817m05 != null ? Boolean.valueOf(interfaceC0817m05.a()) : null);
        y(M.toString());
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void d(boolean z) {
        if (this.f2177f) {
            C0795d.l(v(), null, null, new com.bytedance.android.input.common.asr.sdkImp.f(z, this, null), 3, null);
            return;
        }
        this.u.c();
        IAppGlobals.a aVar = IAppGlobals.a;
        String str = this.l;
        StringBuilder M = e.a.a.a.a.M("initAsr start， mAsrModelPath = ");
        M.append(this.u.e());
        M.append(", ");
        M.append(IEnvironment.a.a());
        aVar.j(str, M.toString());
        com.bytedance.android.input.common.t.a.c cVar = com.bytedance.android.input.common.t.a.c.a;
        com.bytedance.android.input.common.t.a.c.a();
        aVar.x(this.l, "initAsr");
        C0795d.l(v(), null, null, new com.bytedance.android.input.common.asr.sdkImp.f(z, this, null), 3, null);
        SAMICore.RegisterLog(new SAMICoreLogCallback() { // from class: com.bytedance.android.input.common.asr.sdkImp.a
            @Override // com.mammon.audiosdk.SAMICoreLogCallback
            public final void onHandle(int i, String str2) {
                int i2 = SdkImpl.w;
                if (i == 3) {
                    IAppGlobals.a aVar2 = IAppGlobals.a;
                    l.e(str2, "msg");
                    aVar2.j("Asr-SdkImpl-Sdk", str2);
                } else if (i == 4) {
                    IAppGlobals.a aVar3 = IAppGlobals.a;
                    l.e(str2, "msg");
                    aVar3.x("Asr-SdkImpl-Sdk", str2);
                } else if (i == 5) {
                    IAppGlobals.a aVar4 = IAppGlobals.a;
                    l.e(str2, "msg");
                    aVar4.L("Asr-SdkImpl-Sdk", str2);
                } else if (i == 6) {
                    IAppGlobals.a aVar5 = IAppGlobals.a;
                    l.e(str2, "msg");
                    aVar5.e("Asr-SdkImpl-Sdk", str2);
                }
                if (i == 1) {
                    IAppGlobals.a aVar6 = IAppGlobals.a;
                    l.e(str2, "msg");
                    aVar6.x("Asr-SdkImpl-Sdk", str2);
                }
            }
        });
        this.f2177f = true;
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void disconnect() {
        C0795d.l(v(), null, null, new a(null), 3, null);
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void e(byte[] bArr, int i, boolean z, boolean z2) {
        l.f(bArr, "buffer");
        if (!this.f2178g.get()) {
            IAppGlobals.a aVar = IAppGlobals.a;
            String str = this.l;
            StringBuilder M = e.a.a.a.a.M("feedAudio mStart.get() = ");
            M.append(this.f2178g.get());
            aVar.e(str, M.toString());
            return;
        }
        if (this.h.get()) {
            if (this.o.a(null)) {
                try {
                    if (this.b != null && this.f2175d != null && this.f2176e != null) {
                        for (Map.Entry<byte[], Integer> entry : this.r.entrySet()) {
                            byte[] key = entry.getKey();
                            int intValue = entry.getValue().intValue();
                            IAppGlobals.a.j(this.l, "feedAudio k = " + key + ", v = " + intValue);
                            SAMICoreAudioBin sAMICoreAudioBin = this.f2175d;
                            if (sAMICoreAudioBin != null) {
                                sAMICoreAudioBin.audioData = kotlin.collections.g.k(key, 0, intValue);
                            }
                            SAMICore sAMICore = this.b;
                            if (sAMICore != null) {
                                sAMICore.SAMICoreProcess(this.f2176e, null);
                            }
                        }
                        this.r.clear();
                        SAMICoreAudioBin sAMICoreAudioBin2 = this.f2175d;
                        if (sAMICoreAudioBin2 != null) {
                            sAMICoreAudioBin2.audioData = kotlin.collections.g.k(bArr, 0, i);
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (z) {
                                jSONObject.put("force_asr_twopass", true);
                            }
                            if (z2) {
                                jSONObject.put("finish_audio", true);
                            }
                            SAMICoreBlock sAMICoreBlock = this.f2176e;
                            l.c(sAMICoreBlock);
                            sAMICoreBlock.extra = jSONObject.toString();
                        } catch (Exception e2) {
                            IAppGlobals.a aVar2 = IAppGlobals.a;
                            String str2 = this.l;
                            StringBuilder sb = new StringBuilder();
                            sb.append("feedAudio ");
                            String message = e2.getMessage();
                            if (message == null) {
                                message = "Exception";
                            }
                            sb.append(message);
                            aVar2.e(str2, sb.toString());
                            SAMICoreBlock sAMICoreBlock2 = this.f2176e;
                            l.c(sAMICoreBlock2);
                            sAMICoreBlock2.extra = "";
                        }
                        if (z || z2) {
                            IAppGlobals.a aVar3 = IAppGlobals.a;
                            String str3 = this.l;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("feedAudio --------------- ");
                            SAMICoreBlock sAMICoreBlock3 = this.f2176e;
                            l.c(sAMICoreBlock3);
                            sb2.append(sAMICoreBlock3.extra);
                            aVar3.j(str3, sb2.toString());
                        }
                        SAMICore sAMICore2 = this.b;
                        if (sAMICore2 != null) {
                            sAMICore2.SAMICoreProcess(this.f2176e, null);
                        }
                        return;
                    }
                    this.r.put(kotlin.collections.g.k(bArr, 0, i), Integer.valueOf(i));
                    return;
                } finally {
                    r.n0(this.o, null, 1, null);
                }
            }
        }
        this.r.put(kotlin.collections.g.k(bArr, 0, i), Integer.valueOf(i));
        IAppGlobals.a aVar4 = IAppGlobals.a;
        String str4 = this.l;
        StringBuilder M2 = e.a.a.a.a.M("feedAudio mBufferCache ");
        M2.append(this.r.size());
        aVar4.j(str4, M2.toString());
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void f(int i) {
        StringBuilder N = e.a.a.a.a.N("notifyAsrInterrupt interruptType = ", i, "---mSamiCore is null ? ");
        N.append(this.b == null);
        y(N.toString());
        SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
        sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_ASR_Online_Interrupt;
        sAMICoreProperty.type = SAMICoreDataType.SAMICoreDataType_Int;
        sAMICoreProperty.dataArrayLen = 1;
        Object[] objArr = new Object[1];
        for (int i2 = 0; i2 < 1; i2++) {
            objArr[i2] = o.a;
        }
        sAMICoreProperty.dataObjectArray = objArr;
        objArr[0] = Integer.valueOf(i);
        SAMICore sAMICore = this.b;
        y("notifyAsrInterrupt ret = " + (sAMICore != null ? Integer.valueOf(sAMICore.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_ASR_Online_Interrupt, sAMICoreProperty)) : null));
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void g(JSONObject jSONObject) {
        l.f(jSONObject, "jsonObject");
        SAMICore.SendAsrGlobalMetrics(jSONObject.toString());
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void h() {
        SAMICore.ResetAsrGlobalMetrics();
    }

    @Override // com.bytedance.android.input.common.asr.api.IAsr
    public void stop() {
        if (this.f2178g.get()) {
            boolean z = false;
            this.f2178g.set(false);
            InterfaceC0817m0 interfaceC0817m0 = this.s;
            if (interfaceC0817m0 != null && interfaceC0817m0.a()) {
                z = true;
            }
            if (z) {
                IAppGlobals.a.x(this.l, "stop cancel finish");
                InterfaceC0817m0 interfaceC0817m02 = this.s;
                if (interfaceC0817m02 != null) {
                    r.z(interfaceC0817m02, null, 1, null);
                }
            }
            this.s = C0795d.l((G) this.j.getValue(), null, null, new h(null), 3, null);
            IAppGlobals.a aVar = IAppGlobals.a;
            String str = this.l;
            StringBuilder M = e.a.a.a.a.M("stop mFinishJob = ");
            InterfaceC0817m0 interfaceC0817m03 = this.s;
            M.append(interfaceC0817m03 != null ? Boolean.valueOf(interfaceC0817m03.a()) : null);
            aVar.j(str, M.toString());
        }
    }
}
