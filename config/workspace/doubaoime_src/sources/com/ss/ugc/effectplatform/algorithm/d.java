package com.ss.ugc.effectplatform.algorithm;

import com.ss.ugc.effectplatform.EffectConfig;
import java.util.Objects;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private static d f8434f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f8435g = new a(null);
    private final com.ss.ugc.effectplatform.e.a a;
    private e b;

    /* renamed from: c, reason: collision with root package name */
    private AlgorithmModelResourceFinder f8436c;

    /* renamed from: d, reason: collision with root package name */
    private final com.ss.ugc.effectplatform.k.a f8437d;

    /* renamed from: e, reason: collision with root package name */
    private final EffectConfig f8438e;

    public static final class a {
        public a(g gVar) {
        }

        public final boolean a() {
            return d.f8434f != null;
        }
    }

    public d(EffectConfig effectConfig, g gVar) {
        com.ss.ugc.effectplatform.k.a aVar;
        com.ss.ugc.effectplatform.k.a aVar2;
        com.ss.ugc.effectplatform.k.a aVar3;
        this.f8438e = effectConfig;
        this.b = new e(effectConfig.b(), null, false);
        com.ss.ugc.effectplatform.e.c cVar = com.ss.ugc.effectplatform.e.c.b;
        com.ss.ugc.effectplatform.e.d a2 = com.ss.ugc.effectplatform.e.c.a(effectConfig.a());
        if (a2 == null || !(a2 instanceof com.ss.ugc.effectplatform.e.a)) {
            com.ss.ugc.effectplatform.e.a aVar4 = new com.ss.ugc.effectplatform.e.a(effectConfig, effectConfig.a(), effectConfig.u(), effectConfig.o().hashCode(), this.b);
            this.a = aVar4;
            com.ss.ugc.effectplatform.e.c.b(effectConfig.a(), aVar4);
        } else {
            this.a = (com.ss.ugc.effectplatform.e.a) a2;
        }
        aVar = com.ss.ugc.effectplatform.k.a.f8492e;
        if (!(aVar != null)) {
            l.g(effectConfig, "effectConfig");
            com.ss.ugc.effectplatform.k.a.f8492e = new com.ss.ugc.effectplatform.k.a(effectConfig, null);
        }
        aVar2 = com.ss.ugc.effectplatform.k.a.f8492e;
        if (aVar2 == null) {
            throw new RuntimeException("Please initialize AlgorithmRepository first!");
        }
        aVar3 = com.ss.ugc.effectplatform.k.a.f8492e;
        if (aVar3 != null) {
            this.f8437d = aVar3;
        } else {
            l.k();
            throw null;
        }
    }

    public final void c(int i, String[] strArr, com.ss.ugc.effectplatform.a aVar, com.ss.ugc.effectplatform.h.b<String[]> bVar) {
        l.g(strArr, "modelNames");
        this.f8437d.c(i, strArr, aVar, bVar);
    }

    public final AlgorithmModelResourceFinder d() {
        AlgorithmModelResourceFinder algorithmModelResourceFinder = this.f8436c;
        if (algorithmModelResourceFinder != null) {
            return algorithmModelResourceFinder;
        }
        com.ss.ugc.effectplatform.e.a aVar = this.a;
        e eVar = this.b;
        Objects.requireNonNull(this.f8438e);
        AlgorithmModelResourceFinder algorithmModelResourceFinder2 = new AlgorithmModelResourceFinder(aVar, eVar, null, this.f8438e);
        this.f8436c = algorithmModelResourceFinder2;
        return algorithmModelResourceFinder2;
    }
}
