package com.ss.ugc.effectplatform.k;

import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.task.e;
import com.ss.ugc.effectplatform.task.h.d;
import kotlin.o;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f8492e;
    private e a;
    private final com.ss.ugc.effectplatform.e.a b;

    /* renamed from: c, reason: collision with root package name */
    private com.ss.ugc.effectplatform.algorithm.e f8493c;

    /* renamed from: d, reason: collision with root package name */
    private final EffectConfig f8494d;

    /* renamed from: com.ss.ugc.effectplatform.k.a$a, reason: collision with other inner class name */
    public static final class C0393a implements d.a.d.b {
        final /* synthetic */ d a;
        final /* synthetic */ com.ss.ugc.effectplatform.h.b b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f8495c;

        /* renamed from: com.ss.ugc.effectplatform.k.a$a$a, reason: collision with other inner class name */
        static final class C0394a extends m implements kotlin.s.b.a<o> {
            final /* synthetic */ Exception b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0394a(Exception exc) {
                super(0);
                this.b = exc;
            }

            @Override // kotlin.s.b.a
            public o invoke() {
                C0393a c0393a = C0393a.this;
                com.ss.ugc.effectplatform.h.b bVar = c0393a.b;
                if (bVar != null) {
                    bVar.b(c0393a.f8495c, new com.ss.ugc.effectplatform.model.b(this.b));
                }
                return o.a;
            }
        }

        /* renamed from: com.ss.ugc.effectplatform.k.a$a$b */
        static final class b extends m implements kotlin.s.b.a<o> {
            b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public o invoke() {
                C0393a c0393a = C0393a.this;
                com.ss.ugc.effectplatform.h.b bVar = c0393a.b;
                if (bVar != null) {
                    bVar.onSuccess(c0393a.f8495c);
                }
                return o.a;
            }
        }

        C0393a(d dVar, com.ss.ugc.effectplatform.h.b bVar, String[] strArr) {
            this.a = dVar;
            this.b = bVar;
            this.f8495c = strArr;
        }

        @Override // d.a.d.b
        public String a() {
            return "fetchResourcesWithModelNames";
        }

        @Override // d.a.d.b
        public String getId() {
            return "";
        }

        @Override // d.a.d.b
        public void run() {
            try {
                this.a.run();
                b bVar = new b();
                d.a.e.e eVar = d.a.e.e.b;
                d.a.e.e.a(new com.ss.ugc.effectplatform.k.b(bVar));
            } catch (Exception e2) {
                C0394a c0394a = new C0394a(e2);
                d.a.e.e eVar2 = d.a.e.e.b;
                d.a.e.e.a(new com.ss.ugc.effectplatform.k.b(c0394a));
            }
        }
    }

    public a(EffectConfig effectConfig, g gVar) {
        this.f8494d = effectConfig;
        this.f8493c = new com.ss.ugc.effectplatform.algorithm.e(effectConfig.b(), null, false);
        e.a aVar = e.k;
        l.g(effectConfig, "effectConfig");
        if (!(e.j.a() != null)) {
            l.g(effectConfig, "effectConfig");
            e.j.b(new e(effectConfig, null));
        }
        this.a = aVar.a();
        com.ss.ugc.effectplatform.e.c cVar = com.ss.ugc.effectplatform.e.c.b;
        com.ss.ugc.effectplatform.e.d a = com.ss.ugc.effectplatform.e.c.a(effectConfig.a());
        if (a != null && (a instanceof com.ss.ugc.effectplatform.e.a)) {
            this.b = (com.ss.ugc.effectplatform.e.a) a;
            return;
        }
        com.ss.ugc.effectplatform.e.a aVar2 = new com.ss.ugc.effectplatform.e.a(effectConfig, effectConfig.a(), effectConfig.u(), effectConfig.o().hashCode(), this.f8493c);
        this.b = aVar2;
        com.ss.ugc.effectplatform.e.c.b(effectConfig.a(), aVar2);
    }

    public final void c(int i, String[] strArr, com.ss.ugc.effectplatform.a aVar, com.ss.ugc.effectplatform.h.b<String[]> bVar) {
        l.g(strArr, "modelNames");
        d dVar = new d(this.f8494d, this.a, this.f8493c, this.b, strArr, i, null, aVar, null, null, null, 1856);
        com.ss.ugc.effectplatform.task.g x = this.f8494d.x();
        if (x != null) {
            x.b(new C0393a(dVar, bVar, strArr));
        }
    }
}
