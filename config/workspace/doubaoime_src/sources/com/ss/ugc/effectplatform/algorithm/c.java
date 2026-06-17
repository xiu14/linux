package com.ss.ugc.effectplatform.algorithm;

import android.net.Uri;
import com.ss.ugc.effectplatform.util.i;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class c {
    public static final a Companion = new a(null);
    public static final String MD5_ERROR = "asset://md5_error";
    public static final String NOT_FOUND = "asset://not_found";
    public static final String RESOURCE_MANAGER_NOT_INITIALIZED = "asset://not_initialized";
    public static final String TAG = "AlgorithmResourceFinder";
    private final com.ss.ugc.effectplatform.e.a algorithmModelCache;
    private final e buildInAssetsManager;
    private final com.ss.ugc.effectplatform.h.d eventListener;

    public static final class a {
        public a(g gVar) {
        }
    }

    public c(com.ss.ugc.effectplatform.e.a aVar, e eVar, com.ss.ugc.effectplatform.h.d dVar) {
        l.g(aVar, "algorithmModelCache");
        l.g(eVar, "buildInAssetsManager");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = eVar;
        this.eventListener = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean checkModelMd5(java.lang.String r9, int r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 0
            if (r11 == 0) goto L84
            boolean r1 = r8.isExactBuiltInResource(r9)
            if (r1 != 0) goto L84
            com.ss.ugc.effectplatform.util.i r1 = com.ss.ugc.effectplatform.util.i.f8543c
            java.lang.String r1 = com.ss.ugc.effectplatform.util.i.d(r9)
            java.lang.String r11 = com.ss.ugc.effectplatform.util.i.b(r11)
            com.ss.ugc.effectplatform.task.e$a r2 = com.ss.ugc.effectplatform.task.e.k
            com.ss.ugc.effectplatform.task.e r2 = r2.a()
            r3 = 2
            com.ss.ugc.effectplatform.model.c r2 = com.ss.ugc.effectplatform.task.e.h(r2, r10, r0, r3)
            com.ss.ugc.effectplatform.e.a r3 = r8.algorithmModelCache
            r3.i(r1)
            r3 = 1
            java.lang.String r4 = "AlgorithmResourceFinder"
            r5 = 0
            if (r2 == 0) goto L47
            com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel r10 = r2.a(r1)     // Catch: java.lang.IllegalArgumentException -> L2e
            goto L48
        L2e:
            r2 = move-exception
            d.a.c.b r6 = d.a.c.b.b
            java.lang.String r7 = "model info not found in model list"
            r6.b(r4, r7, r2)
            com.ss.ugc.effectplatform.task.e$a r2 = com.ss.ugc.effectplatform.task.e.k
            com.ss.ugc.effectplatform.task.e r2 = r2.a()
            com.ss.ugc.effectplatform.model.algorithm.ModelInfo r10 = r2.j(r10, r1, r3)
            if (r10 == 0) goto L47
            com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel r10 = r10.getFile_url()
            goto L48
        L47:
            r10 = r5
        L48:
            if (r10 != 0) goto L61
            d.a.c.b r10 = d.a.c.b.b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "expected model info not found in model list - "
            r11.append(r1)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.b(r4, r9, r5)
            return r0
        L61:
            java.lang.String r10 = r10.getUri()
            boolean r2 = com.ss.ugc.effectplatform.util.l.a(r11, r10)
            if (r2 != 0) goto L84
            java.lang.String r0 = " md5 = "
            java.lang.String r2 = " expectedMd5 = "
            java.lang.String r10 = e.a.a.a.a.v(r9, r0, r11, r2, r10)
            d.a.c.b r11 = d.a.c.b.b
            java.lang.String r0 = "findResourceUri called with nameStr = ["
            java.lang.String r2 = "], asset://md5_error\n"
            java.lang.String r9 = e.a.a.a.a.u(r0, r9, r2, r10)
            r11.a(r4, r9)
            r8.onModelNotFound(r1, r10)
            return r3
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.algorithm.c.checkModelMd5(java.lang.String, int, java.lang.String):boolean");
    }

    public String findResourceUri(String str) {
        l.g(str, "nameStr");
        i iVar = i.f8543c;
        com.ss.ugc.effectplatform.model.d l = this.algorithmModelCache.l(i.d(str));
        if (!(l != null)) {
            if (isExactBuiltInResource(str)) {
                return getBuiltInResourceUrl(str);
            }
            return null;
        }
        StringBuilder M = e.a.a.a.a.M("file://");
        M.append(l != null ? l.a() : null);
        String sb = M.toString();
        l.g(sb, "filePath");
        String uri = Uri.parse(sb).toString();
        l.b(uri, "Uri.parse(filePath).toString()");
        return uri;
    }

    protected String getBuiltInResourceUrl(String str) {
        throw null;
    }

    public long getEffectHandle() {
        return 0L;
    }

    protected boolean isExactBuiltInResource(String str) {
        throw null;
    }

    public final boolean isResourceAvailable(String str) {
        l.g(str, "nameStr");
        String findResourceUri = findResourceUri(str);
        return findResourceUri != null && (l.a(findResourceUri, MD5_ERROR) ^ true) && (l.a(findResourceUri, NOT_FOUND) ^ true);
    }

    public final void markModelUsed(String str) {
        l.g(str, "nameStr");
        com.ss.ugc.effectplatform.e.a aVar = this.algorithmModelCache;
        i iVar = i.f8543c;
        aVar.n(i.d(str));
    }

    protected void onModelFound(String str) {
        throw null;
    }

    protected void onModelNotFound(String str, String str2) {
        l.g(str, "modelName");
        l.g(str2, "errorMessage");
        RuntimeException runtimeException = new RuntimeException(e.a.a.a.a.s("model not found neither in asset nor disk ", str2));
        com.ss.ugc.effectplatform.h.d dVar = this.eventListener;
        if (dVar != null) {
            dVar.a(null, runtimeException);
        }
    }

    public final String readAssetFileAsString(String str) {
        l.g(str, "filePath");
        return this.buildInAssetsManager.j(str);
    }

    public final String realFindResourceUri(int i, String str, String str2) {
        l.g(str2, "nameStr");
        d.a.c.b.b.a(TAG, "findResourceUri() called with nameStr = [" + str2 + ']');
        String findResourceUri = findResourceUri(str2);
        try {
            if (checkModelMd5(str2, i, findResourceUri)) {
                return MD5_ERROR;
            }
        } catch (RuntimeException e2) {
            d.a.c.b.b.b(TAG, e.a.a.a.a.t("findResourceUri called with nameStr = [", str2, "], exception hanppens"), e2);
        }
        if (findResourceUri == null) {
            d.a.c.b.b.b(TAG, e.a.a.a.a.t("findResourceUri called with nameStr = [", str2, "], returned result: [asset://not_found]"), null);
            return NOT_FOUND;
        }
        d.a.c.b.b.a(TAG, "findResourceUri called with nameStr = [" + str2 + "], returned result: [" + findResourceUri + ']');
        onModelFound(str2);
        return findResourceUri;
    }
}
