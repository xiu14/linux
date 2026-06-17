package com.ss.ugc.effectplatform.download;

import bytekn.foundation.io.file.FileType;
import com.ss.ugc.effectplatform.bridge.network.HTTPMethod;
import com.ss.ugc.effectplatform.bridge.network.h;
import com.ss.ugc.effectplatform.download.a;
import java.util.List;
import kotlin.s.c.A;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d {
    private com.ss.ugc.effectplatform.bridge.network.d a;
    private g b;

    /* renamed from: c, reason: collision with root package name */
    private DownloadType f8457c;

    public static final class a {
        private g a;
        private com.ss.ugc.effectplatform.bridge.network.d b;

        /* renamed from: c, reason: collision with root package name */
        private DownloadType f8458c;

        public final d a() {
            com.ss.ugc.effectplatform.bridge.network.d dVar = this.b;
            if (dVar == null) {
                throw new IllegalArgumentException("networkClient is required to setup!");
            }
            g gVar = this.a;
            if (gVar == null) {
                throw new IllegalArgumentException("cacheStrategy is required to setup!");
            }
            if (dVar == null) {
                l.l("networkClient");
                throw null;
            }
            if (gVar != null) {
                return new d(dVar, gVar, null, this.f8458c, null, null);
            }
            l.l("writeDisk");
            throw null;
        }

        public final a b(DownloadType downloadType) {
            this.f8458c = downloadType;
            return this;
        }

        public final a c(com.ss.ugc.effectplatform.bridge.network.d dVar) {
            l.g(dVar, "networkClient");
            this.b = dVar;
            return this;
        }

        public final a d(g gVar) {
            l.g(gVar, "cacheStrategy");
            this.a = gVar;
            return this;
        }
    }

    public d(com.ss.ugc.effectplatform.bridge.network.d dVar, g gVar, f fVar, DownloadType downloadType, String str, kotlin.s.c.g gVar2) {
        this.a = dVar;
        this.b = gVar;
        this.f8457c = downloadType;
    }

    private final boolean a(String str) {
        return !(str.length() == 0);
    }

    private final void d(String str, long j) {
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder sb = new StringBuilder();
        DownloadType downloadType = this.f8457c;
        e.a.a.a.a.M0(sb, downloadType != null ? downloadType.name() : null, "-->", str, " , cost ");
        bVar.a("DownloadManager", e.a.a.a.a.F(sb, j, " mills."));
    }

    public final long b(String str, c cVar) {
        long longValue;
        long longValue2;
        long longValue3;
        l.g(str, "downloadUrl");
        d.a.c.b.b.a("DownloadManager", "downloadUrl=" + str + " start");
        e eVar = new e();
        long currentTimeMillis = System.currentTimeMillis();
        if (!a(str)) {
            eVar.g(System.currentTimeMillis() - currentTimeMillis);
            eVar.f(new com.ss.ugc.effectplatform.f.f("invalid url"));
            d("download failed! url: " + str, eVar.b());
            ((a.C0388a) cVar).b(eVar);
            return -1L;
        }
        h hVar = null;
        try {
            hVar = this.a.a(new com.ss.ugc.effectplatform.bridge.network.f(str, null, HTTPMethod.GET, null, null, null, false, null, 186));
        } catch (Exception e2) {
            eVar.f(new com.ss.ugc.effectplatform.f.c(400, ((kotlin.s.c.e) A.b(e2.getClass())).d() + ':' + e2.getMessage()));
        }
        if (hVar == null || hVar.f() != 200) {
            eVar.g(System.currentTimeMillis() - currentTimeMillis);
            if (hVar != null) {
                int f2 = hVar.f();
                String c2 = hVar.c();
                if (c2 == null) {
                    StringBuilder M = e.a.a.a.a.M("status code is ");
                    M.append(hVar.f());
                    c2 = M.toString();
                }
                eVar.f(new com.ss.ugc.effectplatform.f.c(f2, c2));
            }
            d(e.a.a.a.a.s("fetchFromNetwork failed! url: ", str), eVar.b());
            ((a.C0388a) cVar).b(eVar);
            return -1L;
        }
        eVar.h(System.currentTimeMillis() - currentTimeMillis);
        d("fetchInputStream success! url: " + str, eVar.c());
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            String a2 = this.b.a(new b(hVar.a()), hVar.b(), cVar);
            if (a2 == null) {
                return -1L;
            }
            bytekn.foundation.io.file.c cVar2 = bytekn.foundation.io.file.c.b;
            bytekn.foundation.io.file.d f3 = cVar2.f(a2);
            if (f3.d() == FileType.Directory) {
                List<bytekn.foundation.io.file.d> o = cVar2.o(a2);
                if (o != null) {
                    longValue = 0;
                    for (bytekn.foundation.io.file.d dVar : o) {
                        if (dVar.d() == FileType.Directory) {
                            String b = dVar.a().b();
                            if (b != null) {
                                bytekn.foundation.io.file.c cVar3 = bytekn.foundation.io.file.c.b;
                                bytekn.foundation.io.file.d f4 = cVar3.f(b);
                                if (f4.d() == FileType.Directory) {
                                    List<bytekn.foundation.io.file.d> o2 = cVar3.o(b);
                                    if (o2 != null) {
                                        longValue2 = 0;
                                        for (bytekn.foundation.io.file.d dVar2 : o2) {
                                            if (dVar2.d() == FileType.Directory) {
                                                longValue3 = com.ss.ugc.effectplatform.util.f.a.e(dVar2.a().b());
                                            } else {
                                                Long c3 = dVar2.c();
                                                longValue3 = c3 != null ? c3.longValue() : 0L;
                                            }
                                            longValue2 += longValue3;
                                        }
                                    }
                                } else {
                                    Long c4 = f4.c();
                                    if (c4 != null) {
                                        longValue2 = c4.longValue();
                                    }
                                }
                            }
                            longValue2 = 0;
                        } else {
                            Long c5 = dVar.c();
                            if (c5 != null) {
                                longValue2 = c5.longValue();
                            }
                            longValue2 = 0;
                        }
                        longValue += longValue2;
                    }
                }
                longValue = 0;
            } else {
                Long c6 = f3.c();
                if (c6 != null) {
                    longValue = c6.longValue();
                }
                longValue = 0;
            }
            eVar.i(System.currentTimeMillis() - currentTimeMillis2);
            if (longValue > 0) {
                d(e.a.a.a.a.s("writeToDisk success! url: ", str), eVar.d());
                eVar.g(System.currentTimeMillis() - currentTimeMillis);
                d("unnecessary to unzip, download success", eVar.b());
                ((a.C0388a) cVar).b(eVar);
                return longValue;
            }
            d(e.a.a.a.a.s("writeToDisk failed! url: ", str), eVar.d());
            eVar.g(System.currentTimeMillis() - currentTimeMillis);
            eVar.f(new bytekn.foundation.io.file.g("write file to disk failed!"));
            ((a.C0388a) cVar).b(eVar);
            return longValue;
        } catch (Exception e3) {
            if ((e3 instanceof com.ss.ugc.effectplatform.f.b) || (e3 instanceof com.ss.ugc.effectplatform.f.a) || (e3 instanceof bytekn.foundation.io.file.g)) {
                throw e3;
            }
            throw new bytekn.foundation.io.file.g(((kotlin.s.c.e) A.b(e3.getClass())).d() + ':' + e3.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if ((r11.length() == 0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.ugc.effectplatform.bridge.network.h c(java.lang.String r21, java.lang.String r22, java.util.List<java.lang.String> r23, java.lang.String r24, com.ss.ugc.effectplatform.download.c r25) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.download.d.c(java.lang.String, java.lang.String, java.util.List, java.lang.String, com.ss.ugc.effectplatform.download.c):com.ss.ugc.effectplatform.bridge.network.h");
    }
}
