package com.ss.ugc.effectplatform.j;

import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.ugc.effectplatform.bridge.network.f;
import com.ss.ugc.effectplatform.bridge.network.h;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class d implements com.ss.ugc.effectplatform.bridge.network.e {
    private final com.ss.ugc.effectplatform.bridge.network.e a;
    private final com.ss.ugc.effectplatform.bridge.network.d b;

    public d(com.ss.ugc.effectplatform.bridge.network.e eVar, com.ss.ugc.effectplatform.bridge.network.d dVar) {
        l.g(eVar, "ex");
        l.g(dVar, "client");
        this.a = eVar;
        this.b = dVar;
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.d
    public h a(f fVar) {
        l.g(fVar, "netRequest");
        return this.b.a(fVar);
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.e
    public h b(f fVar, String str, String str2, com.ss.ugc.effectplatform.bridge.network.c cVar) {
        l.g(fVar, "netRequest");
        l.g(str, DownloadConstants.PATH_KEY);
        l.g(str2, "tag");
        return this.a.b(fVar, str, str2, cVar);
    }
}
