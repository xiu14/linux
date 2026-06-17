package com.ss.ugc.effectplatform.task;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse;
import com.ss.ugc.effectplatform.task.c;
import com.ss.ugc.effectplatform.util.k;
import java.util.Map;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class e {
    private final com.ss.ugc.effectplatform.algorithm.e a;
    private final d.a.a.b<String, Exception> b = new d.a.a.b<>(true);

    /* renamed from: c, reason: collision with root package name */
    private final d.a.a.b<String, com.ss.ugc.effectplatform.task.c> f8510c = new d.a.a.b<>(true);

    /* renamed from: d, reason: collision with root package name */
    private final d.a.a.b<String, Integer> f8511d = new d.a.a.b<>(true);

    /* renamed from: e, reason: collision with root package name */
    private final d.a.a.b<String, com.ss.ugc.effectplatform.task.h.b> f8512e = new d.a.a.b<>(true);

    /* renamed from: f, reason: collision with root package name */
    private final d.a.a.b<String, Boolean> f8513f = new d.a.a.b<>(true);

    /* renamed from: g, reason: collision with root package name */
    private final EffectConfig f8514g;
    public static final a k = new a(null);
    private static final d.a.a.b<String, com.ss.ugc.effectplatform.model.c> h = new d.a.a.b<>(true);
    private static final d.a.a.b<String, ModelInfo> i = new d.a.a.b<>(true);
    private static d.a.b.b<e> j = new d.a.b.b<>(null);

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }

        public final e a() {
            if (e.j.a() == null) {
                throw new RuntimeException("Please initialize AlgorithmRepository first!");
            }
            Object a = e.j.a();
            if (a != null) {
                return (e) a;
            }
            l.k();
            throw null;
        }
    }

    public static final class b implements c.a {
        final /* synthetic */ String b;

        b(int i, String str) {
            this.b = str;
        }

        @Override // com.ss.ugc.effectplatform.task.c.a
        public void a(com.ss.ugc.effectplatform.model.f fVar, int i) {
            l.g(fVar, "result");
            a aVar = e.k;
            e.h.put(this.b, fVar.a());
            e.this.f8510c.remove(this.b);
        }

        @Override // com.ss.ugc.effectplatform.task.c.a
        public void b(Exception exc, int i) {
            l.g(exc, "exception");
            e.this.b.put(this.b, exc);
            d.a.c.b.b.b("FetchModelListTask", "fetch model list error happens!", exc);
            e.this.f8510c.remove(this.b);
            e.this.f8513f.put(this.b, Boolean.FALSE);
        }
    }

    public static final class c implements Runnable {
        final /* synthetic */ com.ss.ugc.effectplatform.model.c a;
        final /* synthetic */ e b;

        c(com.ss.ugc.effectplatform.model.c cVar, e eVar) {
            this.a = cVar;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, ModelInfo> b;
            com.ss.ugc.effectplatform.algorithm.b bVar = com.ss.ugc.effectplatform.algorithm.b.f8433d;
            com.ss.ugc.effectplatform.model.c cVar = this.a;
            com.ss.ugc.effectplatform.e.c cVar2 = com.ss.ugc.effectplatform.e.c.b;
            com.ss.ugc.effectplatform.e.d a = com.ss.ugc.effectplatform.e.c.a(this.b.f8514g.a());
            if (a == null) {
                throw new kotlin.l("null cannot be cast to non-null type com.ss.ugc.effectplatform.cache.AlgorithmModelCache");
            }
            bVar.a(cVar, (com.ss.ugc.effectplatform.e.a) a);
            com.ss.ugc.effectplatform.e.e eVar = com.ss.ugc.effectplatform.e.e.f8466c;
            if (com.ss.ugc.effectplatform.e.e.d(this.b.f8514g.b()) == null || (b = this.a.b()) == null) {
                return;
            }
            ((d.a.a.b) b).values();
        }
    }

    public static final class d extends com.ss.ugc.effectplatform.task.b {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f8516e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f8517f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i, String str, String str2) {
            super(str2, null, 2);
            this.f8516e = i;
            this.f8517f = str;
        }

        @Override // com.ss.ugc.effectplatform.task.b
        protected void b() {
            e.this.i(this.f8516e, this.f8517f);
        }
    }

    public e(EffectConfig effectConfig, kotlin.s.c.g gVar) {
        this.f8514g = effectConfig;
        this.a = new com.ss.ugc.effectplatform.algorithm.e(effectConfig.b(), null, false);
    }

    public static com.ss.ugc.effectplatform.model.c h(e eVar, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            z = true;
        }
        Objects.requireNonNull(eVar);
        com.ss.ugc.effectplatform.model.c cVar = h.get("biz_" + i2);
        if (cVar == null && z) {
            d.a.c.b.b.a("JKL", "[ModelListTask][CreateThread]");
            g x = eVar.f8514g.x();
            if (x != null) {
                com.ss.ugc.effectplatform.task.a aVar = new com.ss.ugc.effectplatform.task.a(null, new f(eVar, i2), 1);
                l.g("ModelListTask", "tag");
                l.g(aVar, "iTask");
                aVar.c("ModelListTask");
                x.b(aVar);
            }
        }
        return cVar;
    }

    public final synchronized com.ss.ugc.effectplatform.model.c g(int i2, boolean z) {
        String str;
        d.a.a.b<String, com.ss.ugc.effectplatform.model.c> bVar;
        str = "biz_" + i2;
        bVar = h;
        if (bVar.get(str) == null) {
            this.f8513f.put(str, Boolean.TRUE);
            d.a.a.b<String, Integer> bVar2 = this.f8511d;
            Integer num = bVar2.get(str);
            if (num == null) {
                num = 0;
                bVar2.put(str, num);
            }
            int intValue = num.intValue();
            if (z || intValue < this.f8514g.p()) {
                d.a.a.b<String, com.ss.ugc.effectplatform.task.c> bVar3 = this.f8510c;
                com.ss.ugc.effectplatform.task.c cVar = bVar3.get(str);
                if (cVar == null) {
                    cVar = new com.ss.ugc.effectplatform.task.c(this.f8514g, this.a, i2, new b(i2, str));
                    bVar3.put(str, cVar);
                }
                this.f8511d.put(str, Integer.valueOf(intValue + 1));
                cVar.f();
                com.ss.ugc.effectplatform.model.c cVar2 = bVar.get(str);
                if (cVar2 != null) {
                    new d.a.b.c.a().execute(new c(cVar2, this));
                }
            }
            if (bVar.get(str) == null) {
                Exception exc = this.b.get(str);
                if (exc != null) {
                    throw exc;
                }
                this.f8513f.put(str, Boolean.FALSE);
                throw new RuntimeException("error happens when requireDecidedConfig");
            }
            this.f8513f.put(str, Boolean.FALSE);
        }
        return bVar.get(str);
    }

    public final synchronized ModelInfo i(int i2, String str) {
        if (str == null) {
            return null;
        }
        d.a.a.b<String, ModelInfo> bVar = i;
        ModelInfo modelInfo = bVar.get(str);
        if (modelInfo == null) {
            String str2 = str + '_' + i2;
            d.a.a.b<String, com.ss.ugc.effectplatform.task.h.b> bVar2 = this.f8512e;
            com.ss.ugc.effectplatform.task.h.b bVar3 = bVar2.get(str2);
            if (bVar3 == null) {
                bVar3 = new com.ss.ugc.effectplatform.task.h.b(this.f8514g, str, i2, null, null);
                bVar2.put(str2, bVar3);
            }
            SingleAlgorithmModelResponse e2 = bVar3.e();
            ModelInfo data = e2 != null ? e2.getData() : null;
            if (data != null) {
                bVar.put(str, data);
            }
            this.f8512e.remove(str2);
            modelInfo = data;
        }
        return modelInfo;
    }

    public final ModelInfo j(int i2, String str, boolean z) {
        g x;
        if (str == null) {
            return null;
        }
        ModelInfo modelInfo = i.get(str);
        if (modelInfo == null && z && (x = this.f8514g.x()) != null) {
            k kVar = k.b;
            x.b(new d(i2, str, k.a()));
        }
        return modelInfo;
    }
}
