package com.ss.ugc.effectplatform.e;

import androidx.core.location.LocationRequestCompat;
import com.ss.ugc.effectplatform.EffectConfig;
import com.ss.ugc.effectplatform.e.f.a;
import com.ss.ugc.effectplatform.e.f.f;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.s.c.l;
import kotlin.text.i;

/* loaded from: classes2.dex */
public final class a extends b {
    private static d.a.b.b<List<String>> n = new d.a.b.b<>(null);
    private static final f o = new C0389a();
    private final EffectConfig k;
    private final String l;
    private final com.ss.ugc.effectplatform.algorithm.e m;

    /* renamed from: com.ss.ugc.effectplatform.e.a$a, reason: collision with other inner class name */
    public static final class C0389a implements f {
        C0389a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ss.ugc.effectplatform.e.f.f
        public boolean a(String str) {
            l.g(str, "key");
            if (str.length() == 0) {
                return false;
            }
            List list = (List) a.n.a();
            String str2 = null;
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (new i((String) next).a(str)) {
                        str2 = next;
                        break;
                    }
                }
                str2 = str2;
            }
            if (str2 == null) {
                return false;
            }
            d.a.c.b.b.a("AlgorithmModelCache", e.a.a.a.a.u("cleaneffect: allowlist：customAllowList, key: ", str, " , regex: ", str2));
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EffectConfig effectConfig, String str, String str2, int i, com.ss.ugc.effectplatform.algorithm.e eVar) {
        super(str, i, 0, LocationRequestCompat.PASSIVE_INTERVAL, o, false, effectConfig.k(), effectConfig.l(), 4);
        l.g(effectConfig, "effectConfig");
        l.g(str, "cacheDir");
        l.g(str2, "preloadDir");
        l.g(eVar, "builtInResourceManager");
        this.k = effectConfig;
        this.l = str2;
        this.m = eVar;
    }

    private final void h(Map<String, List<com.ss.ugc.effectplatform.model.d>> map, String str, com.ss.ugc.effectplatform.model.d dVar) {
        List<com.ss.ugc.effectplatform.model.d> list = map.get(str);
        if (list != null) {
            list.add(dVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar);
        map.put(str, arrayList);
    }

    private final String j(ModelInfo modelInfo) {
        String name = modelInfo.getName();
        i(name);
        modelInfo.setName(name);
        com.ss.ugc.effectplatform.util.i iVar = com.ss.ugc.effectplatform.util.i.f8543c;
        return com.ss.ugc.effectplatform.e.f.a.w.d(com.ss.ugc.effectplatform.util.i.a(modelInfo));
    }

    @Override // com.ss.ugc.effectplatform.e.b
    protected void c() {
        super.c();
        com.ss.ugc.effectplatform.algorithm.b.b();
    }

    public final String i(String str) {
        l.g(str, "name");
        Objects.requireNonNull(this.k);
        return str;
    }

    public final String k(FetchModelType fetchModelType, ModelInfo modelInfo) {
        l.g(fetchModelType, "modelType");
        l.g(modelInfo, "modelInfo");
        String j = j(modelInfo);
        int ordinal = fetchModelType.ordinal();
        if (ordinal == 0) {
            return a() + bytekn.foundation.io.file.c.b.i() + j;
        }
        if (ordinal != 1) {
            throw new kotlin.f();
        }
        return a() + bytekn.foundation.io.file.c.b.i() + j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.ugc.effectplatform.e.f.a$d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ugc.effectplatform.model.d l(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.s.c.l.g(r7, r0)
            r6.i(r7)
            com.ss.ugc.effectplatform.algorithm.b r0 = com.ss.ugc.effectplatform.algorithm.b.f8433d
            com.ss.ugc.effectplatform.algorithm.f r0 = r0.c(r7)
            if (r0 == 0) goto L1d
            com.ss.ugc.effectplatform.model.algorithm.ModelInfo r0 = r0.a()
            if (r0 == 0) goto L1d
            java.lang.String r0 = com.prolificinteractive.materialcalendarview.r.Q(r0)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            java.lang.String r0 = "unknown"
        L1f:
            com.ss.ugc.effectplatform.EffectConfig r1 = r6.k
            java.util.Objects.requireNonNull(r1)
            com.ss.ugc.effectplatform.e.f.a$a r1 = com.ss.ugc.effectplatform.e.f.a.w
            java.lang.String r7 = r1.d(r7)
            com.ss.ugc.effectplatform.e.f.a r1 = r6.b()
            r2 = 0
            if (r1 == 0) goto L57
            java.util.Set r1 = r1.s()
            java.util.Iterator r1 = r1.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            com.ss.ugc.effectplatform.util.i r5 = com.ss.ugc.effectplatform.util.i.f8543c
            java.lang.String r4 = com.ss.ugc.effectplatform.util.i.d(r4)
            boolean r4 = kotlin.s.c.l.a(r4, r7)
            if (r4 == 0) goto L39
            goto L54
        L53:
            r3 = r2
        L54:
            java.lang.String r3 = (java.lang.String) r3
            goto L58
        L57:
            r3 = r2
        L58:
            if (r3 == 0) goto Lac
            com.ss.ugc.effectplatform.e.f.a r7 = r6.b()     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            if (r7 == 0) goto L65
            com.ss.ugc.effectplatform.e.f.a$d r7 = r7.r(r3)     // Catch: java.lang.Throwable -> L88 java.lang.Exception -> L8a
            goto L66
        L65:
            r7 = r2
        L66:
            if (r7 != 0) goto L69
            goto Lac
        L69:
            r1 = 0
            bytekn.foundation.io.file.f r1 = r7.a(r1)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> La3
            if (r1 == 0) goto L81
            java.lang.String r1 = r1.b()     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> La3
            if (r1 == 0) goto L81
            java.lang.String r3 = "filePath"
            kotlin.s.c.l.g(r1, r3)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> La3
            com.ss.ugc.effectplatform.model.d r3 = new com.ss.ugc.effectplatform.model.d     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> La3
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L86 java.lang.Throwable -> La3
            goto L82
        L81:
            r3 = r2
        L82:
            r7.close()
            goto Lad
        L86:
            r1 = move-exception
            goto L8d
        L88:
            r7 = move-exception
            goto La6
        L8a:
            r7 = move-exception
            r1 = r7
            r7 = r2
        L8d:
            d.a.c.b r3 = d.a.c.b.b     // Catch: java.lang.Throwable -> La3
            java.lang.String r4 = "DiskLruCache"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto L98
            goto L9a
        L98:
            java.lang.String r1 = ""
        L9a:
            r3.b(r4, r1, r2)     // Catch: java.lang.Throwable -> La3
            if (r7 == 0) goto Lac
            r7.close()
            goto Lac
        La3:
            r0 = move-exception
            r2 = r7
            r7 = r0
        La6:
            if (r2 == 0) goto Lab
            r2.close()
        Lab:
            throw r7
        Lac:
            r3 = r2
        Lad:
            if (r3 == 0) goto Lb4
            java.lang.String r7 = r3.b()
            goto Lb5
        Lb4:
            r7 = r2
        Lb5:
            boolean r7 = kotlin.s.c.l.a(r0, r7)
            if (r7 == 0) goto Lbc
            return r3
        Lbc:
            com.ss.ugc.effectplatform.EffectConfig r7 = r6.k
            java.util.Objects.requireNonNull(r7)
            if (r3 == 0) goto Lc4
            r2 = r3
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.e.a.l(java.lang.String):com.ss.ugc.effectplatform.model.d");
    }

    public final Map<String, List<com.ss.ugc.effectplatform.model.d>> m() {
        bytekn.foundation.io.file.f a;
        String b;
        String str;
        HashMap hashMap = new HashMap();
        Objects.requireNonNull(this.k);
        Objects.requireNonNull(this.k);
        try {
            List<String> g2 = this.m.g("model");
            if (g2 != null) {
                for (String str2 : g2) {
                    List<String> g3 = this.m.g("model/" + str2);
                    if (g3 != null) {
                        for (String str3 : g3) {
                            try {
                                com.ss.ugc.effectplatform.util.i iVar = com.ss.ugc.effectplatform.util.i.f8543c;
                                str = com.ss.ugc.effectplatform.util.i.d(str3);
                            } catch (Exception unused) {
                                str = "";
                            }
                            if (!l.a(str, "")) {
                                com.ss.ugc.effectplatform.util.i iVar2 = com.ss.ugc.effectplatform.util.i.f8543c;
                                String f2 = com.ss.ugc.effectplatform.util.i.f(str3);
                                l.g("", "filePath");
                                com.ss.ugc.effectplatform.model.d dVar = new com.ss.ugc.effectplatform.model.d("", null);
                                dVar.g(str);
                                dVar.i(f2);
                                h(hashMap, str, dVar);
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            d.a.c.b.b.b("AlgorithmModelCache", "getLocalModelInfoList built in error", e2);
        }
        try {
            com.ss.ugc.effectplatform.e.f.a b2 = b();
            Set<String> s = b2 != null ? b2.s() : null;
            if (s != null) {
                for (String str4 : s) {
                    com.ss.ugc.effectplatform.util.i iVar3 = com.ss.ugc.effectplatform.util.i.f8543c;
                    String d2 = com.ss.ugc.effectplatform.util.i.d(str4);
                    com.ss.ugc.effectplatform.e.f.a b3 = b();
                    a.d r = b3 != null ? b3.r(str4) : null;
                    if (r != null && (a = r.a(0)) != null && (b = a.b()) != null) {
                        l.g(b, "filePath");
                        h(hashMap, d2, new com.ss.ugc.effectplatform.model.d(b, null));
                    }
                }
            }
        } catch (Exception e3) {
            d.a.c.b.b.b("AlgorithmModelCache", "error while getLocalModelInfoList", e3);
        }
        return hashMap;
    }

    public void n(String str) {
        Object obj;
        l.g(str, "key");
        com.ss.ugc.effectplatform.e.f.a b = b();
        if (b != null) {
            Iterator<T> it2 = b.s().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                com.ss.ugc.effectplatform.util.i iVar = com.ss.ugc.effectplatform.util.i.f8543c;
                if (l.a(com.ss.ugc.effectplatform.util.i.d((String) obj), com.ss.ugc.effectplatform.e.f.a.w.d(str))) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null) {
                if (l.a(str2, com.ss.ugc.effectplatform.e.f.a.w.d(str2))) {
                    com.ss.ugc.effectplatform.e.f.a b2 = b();
                    if (b2 != null) {
                        b2.y(str2);
                        return;
                    }
                    return;
                }
                d.a.c.b.b.b("AlgorithmModelCache", "markUsed error! Invalid key: " + str2, null);
            }
        }
    }

    public final String o(FetchModelType fetchModelType, ModelInfo modelInfo, bytekn.foundation.io.file.b bVar) {
        String str;
        l.g(fetchModelType, "modelType");
        l.g(modelInfo, "modelInfo");
        l.g(bVar, "modelStream");
        String d2 = com.ss.ugc.effectplatform.e.f.a.w.d(modelInfo.getName());
        com.ss.ugc.effectplatform.e.f.a b = b();
        if (b != null) {
            for (String str2 : b.s()) {
                com.ss.ugc.effectplatform.util.i iVar = com.ss.ugc.effectplatform.util.i.f8543c;
                if (l.a(com.ss.ugc.effectplatform.util.i.d(str2), d2)) {
                    d(str2);
                    Objects.requireNonNull(this.k);
                }
            }
        }
        String j = j(modelInfo);
        int ordinal = fetchModelType.ordinal();
        if (ordinal == 0) {
            ExtendedUrlModel file_url = modelInfo.getFile_url();
            str = (String) b.f(this, j, bVar, file_url != null ? file_url.getUri() : null, 0L, null, 24, null).c();
        } else {
            if (ordinal != 1) {
                throw new kotlin.f();
            }
            ExtendedUrlModel file_url2 = modelInfo.getFile_url();
            str = (String) b.e(this, j, bVar, file_url2 != null ? file_url2.getUri() : null, 0L, null, 24, null).c();
        }
        Objects.requireNonNull(this.k);
        return str;
    }
}
