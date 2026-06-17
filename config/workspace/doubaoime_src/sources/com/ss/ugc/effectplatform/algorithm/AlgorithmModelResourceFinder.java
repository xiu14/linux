package com.ss.ugc.effectplatform.algorithm;

import androidx.annotation.Keep;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.ugc.effectplatform.EffectConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class AlgorithmModelResourceFinder extends c {
    private static final String TAG = "ResourceFinder";
    private final com.ss.ugc.effectplatform.e.a algorithmModelCache;
    private final e buildInAssetsManager;
    private final EffectConfig effectConfig;
    private final com.ss.ugc.effectplatform.h.d eventListener;
    public static final a Companion = new a(null);
    private static final ConcurrentHashMap<String, Boolean> modelsNotFoundRecord = new ConcurrentHashMap<>();

    public static final class a {
        public a(g gVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlgorithmModelResourceFinder(com.ss.ugc.effectplatform.e.a aVar, e eVar, com.ss.ugc.effectplatform.h.d dVar, EffectConfig effectConfig) {
        super(aVar, eVar, dVar);
        l.g(aVar, "algorithmModelCache");
        l.g(eVar, "buildInAssetsManager");
        l.g(effectConfig, "effectConfig");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = eVar;
        this.eventListener = dVar;
        this.effectConfig = effectConfig;
    }

    public static final String findResourceUri(String str, String str2) {
        Objects.requireNonNull(Companion);
        l.g(str2, "nameStr");
        if (!(d.f8434f != null)) {
            return c.RESOURCE_MANAGER_NOT_INITIALIZED;
        }
        long currentTimeMillis = System.currentTimeMillis();
        d dVar = d.f8434f;
        if (dVar == null) {
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }
        String realFindResourceUri = dVar.d().realFindResourceUri(0, str, str2);
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder W = e.a.a.a.a.W("findResourceUri name: ", str2, ", result: ", realFindResourceUri, ", time cost: ");
        W.append(System.currentTimeMillis() - currentTimeMillis);
        W.append(" ms");
        bVar.a("checkEffect", W.toString());
        return realFindResourceUri;
    }

    private final void mobModelFound(String str) {
        com.ss.ugc.effectplatform.i.a a2 = this.effectConfig.s().a();
        if (a2 != null) {
            r.b0(a2, true, this.effectConfig, str, "");
        }
    }

    private final void mobModelNotFound(String str, String str2) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap = modelsNotFoundRecord;
        if (concurrentHashMap.contains(str)) {
            return;
        }
        concurrentHashMap.put(str, Boolean.TRUE);
        com.ss.ugc.effectplatform.i.a a2 = this.effectConfig.s().a();
        if (a2 != null) {
            r.b0(a2, false, this.effectConfig, str, str2);
        }
    }

    public static final void modelNotFound(String str) {
        Objects.requireNonNull(Companion);
        l.g(str, "nameStr");
        d.a.c.b.b.b(TAG, "modelNotFound:nameStr=" + str, null);
        d dVar = d.f8434f;
        if (dVar == null) {
            throw new IllegalStateException("AlgorithmManager has not initialized,call AlgorithmManager#initialize first!");
        }
        dVar.d().onModelNotFound(str, c.NOT_FOUND);
    }

    private final native long nativeCreateResourceFinder(long j);

    @Override // com.ss.ugc.effectplatform.algorithm.c
    protected String getBuiltInResourceUrl(String str) {
        l.g(str, "nameStr");
        return this.buildInAssetsManager.f(str);
    }

    public final long getNativeResourceFinder() {
        com.ss.ugc.effectplatform.algorithm.a.b.a();
        return nativeCreateResourceFinder(0L);
    }

    @Override // com.ss.ugc.effectplatform.algorithm.c
    protected boolean isExactBuiltInResource(String str) {
        l.g(str, "nameStr");
        return this.buildInAssetsManager.d(str);
    }

    @Override // com.ss.ugc.effectplatform.algorithm.c
    protected void onModelFound(String str) {
        l.g(str, "modelName");
        mobModelFound(str);
    }

    @Override // com.ss.ugc.effectplatform.algorithm.c
    protected void onModelNotFound(String str, String str2) {
        l.g(str, "modelName");
        l.g(str2, "errorMessage");
        super.onModelNotFound(str, str2);
        mobModelNotFound(str, str2);
    }
}
