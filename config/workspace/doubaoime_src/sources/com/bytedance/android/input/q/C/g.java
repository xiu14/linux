package com.bytedance.android.input.q.C;

import com.bytedance.android.input.network.api.IRecommends;
import java.io.BufferedReader;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends v {

    /* renamed from: f, reason: collision with root package name */
    private final String f2931f = "AIWriting-Request";

    /* renamed from: g, reason: collision with root package name */
    private int f2932g = 1;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.AIWritingRequest$request$1", f = "AIWritingRequest.kt", l = {109, 117}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super BufferedReader>, kotlin.r.d<? super kotlin.o>, Object> {
        Object a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        int f2933c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f2934d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f2936f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f2937g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, JSONObject jSONObject, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.f2936f = str;
            this.f2937g = jSONObject;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            a aVar = g.this.new a(this.f2936f, this.f2937g, dVar);
            aVar.f2934d = obj;
            return aVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.flow.g<? super BufferedReader> gVar, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = g.this.new a(this.f2936f, this.f2937g, dVar);
            aVar.f2934d = gVar;
            return aVar.invokeSuspend(kotlin.o.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(15:17|(4:18|19|20|21)|(6:23|24|25|26|27|(20:29|30|31|32|33|34|35|36|37|38|39|(9:41|42|43|44|(1:46)|47|(1:49)|50|(4:52|53|(4:55|(1:57)|58|(1:60))(1:62)|61)(2:63|64))|67|43|44|(0)|47|(0)|50|(0)(0)))(1:91)|84|38|39|(0)|67|43|44|(0)|47|(0)|50|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00fd, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00eb A[Catch: all -> 0x00fb, Exception -> 0x00fd, TRY_LEAVE, TryCatch #2 {Exception -> 0x00fd, blocks: (B:39:0x00e5, B:41:0x00eb), top: B:38:0x00e5 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0159 A[Catch: all -> 0x01b2, TryCatch #1 {all -> 0x01b2, blocks: (B:44:0x0153, B:46:0x0159, B:47:0x0185, B:49:0x018b, B:50:0x0196, B:52:0x01a1, B:63:0x01a8, B:64:0x01b1, B:79:0x014f), top: B:78:0x014f }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x018b A[Catch: all -> 0x01b2, TryCatch #1 {all -> 0x01b2, blocks: (B:44:0x0153, B:46:0x0159, B:47:0x0185, B:49:0x018b, B:50:0x0196, B:52:0x01a1, B:63:0x01a8, B:64:0x01b1, B:79:0x014f), top: B:78:0x014f }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01a1 A[Catch: all -> 0x01b2, TryCatch #1 {all -> 0x01b2, blocks: (B:44:0x0153, B:46:0x0159, B:47:0x0185, B:49:0x018b, B:50:0x0196, B:52:0x01a1, B:63:0x01a8, B:64:0x01b1, B:79:0x014f), top: B:78:0x014f }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01a8 A[Catch: all -> 0x01b2, TryCatch #1 {all -> 0x01b2, blocks: (B:44:0x0153, B:46:0x0159, B:47:0x0185, B:49:0x018b, B:50:0x0196, B:52:0x01a1, B:63:0x01a8, B:64:0x01b1, B:79:0x014f), top: B:78:0x014f }] */
        @Override // kotlin.r.h.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 571
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.AIWritingRequest$request$2", f = "AIWritingRequest.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.r.h.a.i implements kotlin.s.b.p<BufferedReader, kotlin.r.d<? super kotlinx.coroutines.flow.f<? extends IRecommends.Data>>, Object> {
        /* synthetic */ Object a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Source f2938c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Type f2939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IRecommends.Data.Source source, IRecommends.Data.Type type, kotlin.r.d<? super b> dVar) {
            super(2, dVar);
            this.f2938c = source;
            this.f2939d = type;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            b bVar = g.this.new b(this.f2938c, this.f2939d, dVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(BufferedReader bufferedReader, kotlin.r.d<? super kotlinx.coroutines.flow.f<? extends IRecommends.Data>> dVar) {
            b bVar = g.this.new b(this.f2938c, this.f2939d, dVar);
            bVar.a = bufferedReader;
            kotlin.o oVar = kotlin.o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(oVar);
            return g.q(g.this, (BufferedReader) bVar.a, bVar.f2938c, bVar.f2939d);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            return g.q(g.this, (BufferedReader) this.a, this.f2938c, this.f2939d);
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.AIWritingRequest$requestBot$1", f = "AIWritingRequest.kt", l = {187, 195}, m = "invokeSuspend")
    static final class c extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.flow.g<? super BufferedReader>, kotlin.r.d<? super kotlin.o>, Object> {
        Object a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        int f2940c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f2941d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f2943f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f2944g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, kotlin.r.d<? super c> dVar) {
            super(2, dVar);
            this.f2943f = str;
            this.f2944g = str2;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            c cVar = g.this.new c(this.f2943f, this.f2944g, dVar);
            cVar.f2941d = obj;
            return cVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(kotlinx.coroutines.flow.g<? super BufferedReader> gVar, kotlin.r.d<? super kotlin.o> dVar) {
            c cVar = g.this.new c(this.f2943f, this.f2944g, dVar);
            cVar.f2941d = gVar;
            return cVar.invokeSuspend(kotlin.o.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
        @Override // kotlin.r.h.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 358
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.q.C.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.recommend.request.AIWritingRequest$requestBot$2", f = "AIWritingRequest.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<BufferedReader, kotlin.r.d<? super kotlinx.coroutines.flow.f<? extends IRecommends.Data>>, Object> {
        /* synthetic */ Object a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Source f2945c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ IRecommends.Data.Type f2946d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(IRecommends.Data.Source source, IRecommends.Data.Type type, kotlin.r.d<? super d> dVar) {
            super(2, dVar);
            this.f2945c = source;
            this.f2946d = type;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            d dVar2 = g.this.new d(this.f2945c, this.f2946d, dVar);
            dVar2.a = obj;
            return dVar2;
        }

        @Override // kotlin.s.b.p
        public Object invoke(BufferedReader bufferedReader, kotlin.r.d<? super kotlinx.coroutines.flow.f<? extends IRecommends.Data>> dVar) {
            d dVar2 = g.this.new d(this.f2945c, this.f2946d, dVar);
            dVar2.a = bufferedReader;
            kotlin.o oVar = kotlin.o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(oVar);
            return g.q(g.this, (BufferedReader) dVar2.a, dVar2.f2945c, dVar2.f2946d);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            return g.q(g.this, (BufferedReader) this.a, this.f2945c, this.f2946d);
        }
    }

    public static final kotlinx.coroutines.flow.f q(g gVar, BufferedReader bufferedReader, IRecommends.Data.Source source, IRecommends.Data.Type type) {
        Objects.requireNonNull(gVar);
        return kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.j(new f(bufferedReader, gVar, source, type, null)));
    }

    @Override // com.bytedance.android.input.q.C.v
    public boolean g() {
        return false;
    }

    @Override // com.bytedance.android.input.q.C.v
    protected kotlinx.coroutines.flow.f<IRecommends.Data> k(JSONObject jSONObject, String str, IRecommends.Data.Source source, IRecommends.Data.Type type) {
        kotlin.s.c.l.f(jSONObject, "input");
        kotlin.s.c.l.f(str, "chain");
        kotlin.s.c.l.f(source, "source");
        return kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.h(kotlinx.coroutines.flow.h.j(new a(str, jSONObject, null)), new b(source, type, null)));
    }

    @Override // com.bytedance.android.input.q.C.v
    protected kotlinx.coroutines.flow.f<IRecommends.Data> m(String str, String str2, IRecommends.Data.Source source, IRecommends.Data.Type type) {
        kotlin.s.c.l.f(str, "input");
        kotlin.s.c.l.f(str2, "chain");
        kotlin.s.c.l.f(source, "source");
        return kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.h(kotlinx.coroutines.flow.h.j(new c(str2, str, null)), new d(source, type, null)));
    }

    public int r() {
        return this.f2932g;
    }
}
