package com.ss.ugc.effectplatform.download;

import com.ss.ugc.effectplatform.bridge.network.h;
import com.ss.ugc.effectplatform.download.d;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.FetchModelType;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.l;
import kotlin.s.c.z;

/* loaded from: classes2.dex */
public final class a {
    private ModelInfo a;
    private FetchModelType b;

    /* renamed from: c, reason: collision with root package name */
    private String f8453c;

    /* renamed from: d, reason: collision with root package name */
    private d f8454d;

    /* renamed from: e, reason: collision with root package name */
    private final com.ss.ugc.effectplatform.e.a f8455e;

    /* renamed from: f, reason: collision with root package name */
    private final com.ss.ugc.effectplatform.bridge.network.d f8456f;

    /* renamed from: com.ss.ugc.effectplatform.download.a$a, reason: collision with other inner class name */
    public static final class C0388a implements com.ss.ugc.effectplatform.download.c {
        final /* synthetic */ z a;

        C0388a(z zVar) {
            this.a = zVar;
        }

        @Override // com.ss.ugc.effectplatform.bridge.network.c
        public void a(int i, long j) {
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Exception] */
        public void b(e eVar) {
            l.g(eVar, "result");
            if (eVar.e()) {
                return;
            }
            this.a.a = eVar.a();
        }
    }

    public static final class b implements com.ss.ugc.effectplatform.download.c {
        final /* synthetic */ z a;

        b(z zVar) {
            this.a = zVar;
        }

        @Override // com.ss.ugc.effectplatform.bridge.network.c
        public void a(int i, long j) {
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Exception] */
        public void b(e eVar) {
            l.g(eVar, "result");
            if (eVar.e()) {
                return;
            }
            this.a.a = eVar.a();
        }
    }

    public static final class c implements g {
        c() {
        }

        @Override // com.ss.ugc.effectplatform.download.g
        public String a(bytekn.foundation.io.file.b bVar, long j, com.ss.ugc.effectplatform.download.c cVar) {
            l.g(bVar, "inputStream");
            return a.this.f8455e.o(a.this.f(), a.this.g(), bVar);
        }
    }

    public a(com.ss.ugc.effectplatform.e.a aVar, com.ss.ugc.effectplatform.bridge.network.d dVar) {
        l.g(aVar, "algorithmModelCache");
        l.g(dVar, "netWorker");
        this.f8455e = aVar;
        this.f8456f = dVar;
        this.f8453c = "";
        d.a aVar2 = new d.a();
        aVar2.c(dVar);
        aVar2.d(new c());
        aVar2.b(DownloadType.ALGORITHM);
        this.f8454d = aVar2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FetchModelType f() {
        FetchModelType fetchModelType = this.b;
        if (fetchModelType == null) {
            throw new IllegalArgumentException("fetchModelType is required!");
        }
        if (fetchModelType != null) {
            return fetchModelType;
        }
        l.l("fetchModelType");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModelInfo g() {
        ModelInfo modelInfo = this.a;
        if (modelInfo == null) {
            throw new IllegalArgumentException("modelInfo is required!");
        }
        if (modelInfo != null) {
            return modelInfo;
        }
        l.l("modelInfo");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long d(ModelInfo modelInfo, FetchModelType fetchModelType) {
        List<String> zip_url_list;
        List<String> url_list;
        l.g(modelInfo, "modelInfo");
        l.g(fetchModelType, "fetchModelType");
        this.a = modelInfo;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        this.b = fetchModelType;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null) {
            if (url_list.isEmpty()) {
                this.b = FetchModelType.ZIP;
            }
        }
        if (file_url != null && (zip_url_list = file_url.getZip_url_list()) != null) {
            if (zip_url_list.isEmpty()) {
                this.b = FetchModelType.ORIGIN;
            }
        }
        ExtendedUrlModel file_url2 = modelInfo.getFile_url();
        List<String> url = file_url2 != null ? file_url2.getUrl(fetchModelType) : null;
        if (url == null || url.isEmpty()) {
            StringBuilder M = e.a.a.a.a.M("model ");
            M.append(modelInfo.getName());
            M.append(" download url is empty! type: ");
            M.append(fetchModelType);
            throw new RuntimeException(M.toString());
        }
        z zVar = new z();
        zVar.a = null;
        Iterator<String> it2 = url.iterator();
        while (it2.hasNext()) {
            long b2 = this.f8454d.b(it2.next(), new C0388a(zVar));
            if (b2 > 0) {
                return b2;
            }
        }
        Exception exc = (Exception) zVar.a;
        if (exc == null) {
            return -1L;
        }
        throw exc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(ModelInfo modelInfo, FetchModelType fetchModelType, String str) {
        List<String> zip_url_list;
        List<String> url_list;
        l.g(modelInfo, "modelInfo");
        l.g(fetchModelType, "fetchModelType");
        l.g(str, "tag");
        this.a = modelInfo;
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        this.b = fetchModelType;
        boolean z = true;
        if (file_url != null && (url_list = file_url.getUrl_list()) != null && url_list.isEmpty()) {
            this.b = FetchModelType.ZIP;
        }
        if (file_url != null && (zip_url_list = file_url.getZip_url_list()) != null && zip_url_list.isEmpty()) {
            this.b = FetchModelType.ORIGIN;
        }
        ExtendedUrlModel file_url2 = modelInfo.getFile_url();
        List<String> url = file_url2 != null ? file_url2.getUrl(fetchModelType) : null;
        if (url != null && !url.isEmpty()) {
            z = false;
        }
        if (z) {
            StringBuilder M = e.a.a.a.a.M("model ");
            M.append(modelInfo.getName());
            M.append(" download url is empty! type: ");
            M.append(fetchModelType);
            throw new RuntimeException(M.toString());
        }
        z zVar = new z();
        zVar.a = null;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(url);
        this.f8453c = (String) arrayList.remove(0);
        h c2 = this.f8454d.c(this.f8453c, this.f8455e.k(f(), g()), arrayList, str, new b(zVar));
        if (c2.f() == 200) {
            return c2.b();
        }
        if (c2.f() == 206) {
            return -2L;
        }
        if (c2.f() == 600) {
            return -3L;
        }
        Exception exc = (Exception) zVar.a;
        if (exc == null) {
            return -1L;
        }
        throw exc;
    }
}
