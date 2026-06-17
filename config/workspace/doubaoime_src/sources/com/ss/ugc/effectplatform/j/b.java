package com.ss.ugc.effectplatform.j;

import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.ugc.effectplatform.bridge.network.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.k;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class b implements IDownloadListener {
    final /* synthetic */ c a;
    final /* synthetic */ com.ss.ugc.effectplatform.bridge.network.c b;

    public static final class a extends FilterInputStream {
        final /* synthetic */ FileInputStream a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FileInputStream fileInputStream, InputStream inputStream) {
            super(inputStream);
            this.a = fileInputStream;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.a.close();
        }
    }

    b(c cVar, com.ss.ugc.effectplatform.bridge.network.c cVar2) {
        this.a = cVar;
        this.b = cVar2;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onCanceled(DownloadInfo downloadInfo) {
        ConcurrentHashMap concurrentHashMap;
        String j;
        String str;
        ConcurrentHashMap concurrentHashMap2;
        String j2;
        h hVar;
        l.g(downloadInfo, "entity");
        concurrentHashMap = this.a.b;
        c cVar = this.a;
        String url = downloadInfo.getUrl();
        l.b(url, "entity.url");
        j = cVar.j(url);
        k kVar = (k) concurrentHashMap.get(j);
        if (kVar == null || (str = (String) kVar.d()) == null) {
            str = "";
        }
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder U = e.a.a.a.a.U("[取消][SDK][", str, "][网络响应码：");
        U.append(downloadInfo.getHttpStatusCode());
        U.append("][耗时:");
        U.append(downloadInfo.getDownloadTime());
        U.append(']');
        bVar.b("JKL", U.toString(), null);
        concurrentHashMap2 = this.a.b;
        c cVar2 = this.a;
        String url2 = downloadInfo.getUrl();
        l.b(url2, "entity.url");
        j2 = cVar2.j(url2);
        k kVar2 = (k) concurrentHashMap2.get(j2);
        if (kVar2 != null && (hVar = (h) kVar2.f()) != null) {
            hVar.k(600);
            hVar.g(new com.ss.ugc.effectplatform.bridge.network.b());
            hVar.h(-3L);
        }
        c cVar3 = this.a;
        String url3 = downloadInfo.getUrl();
        l.b(url3, "entity.url");
        c.g(cVar3, url3);
        c.i(this.a, downloadInfo.getId());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        ConcurrentHashMap concurrentHashMap;
        String j;
        String str;
        ConcurrentHashMap concurrentHashMap2;
        String j2;
        h hVar;
        l.g(downloadInfo, "entity");
        l.g(baseException, "e");
        concurrentHashMap = this.a.b;
        c cVar = this.a;
        String url = downloadInfo.getUrl();
        l.b(url, "entity.url");
        j = cVar.j(url);
        k kVar = (k) concurrentHashMap.get(j);
        if (kVar == null || (str = (String) kVar.d()) == null) {
            str = "";
        }
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder U = e.a.a.a.a.U("[失败][SDK][", str, "][耗时:");
        U.append(downloadInfo.getDownloadTime());
        U.append(']');
        U.append("[StatusCode:");
        U.append(downloadInfo.getHttpStatusCode());
        U.append("][Size：");
        U.append(downloadInfo.getExpectFileLength());
        U.append("][ErrorMsg:");
        U.append(baseException.getErrorMessage());
        U.append(']');
        bVar.b("JKL", U.toString(), null);
        concurrentHashMap2 = this.a.b;
        c cVar2 = this.a;
        String url2 = downloadInfo.getUrl();
        l.b(url2, "entity.url");
        j2 = cVar2.j(url2);
        k kVar2 = (k) concurrentHashMap2.get(j2);
        if (kVar2 != null && (hVar = (h) kVar2.f()) != null) {
            hVar.k(downloadInfo.getHttpStatusCode() == 200 ? 601 : downloadInfo.getHttpStatusCode());
            hVar.g(new com.ss.ugc.effectplatform.bridge.network.b());
            hVar.h(-1L);
            hVar.i(baseException.getErrorMessage());
        }
        baseException.printStackTrace();
        c cVar3 = this.a;
        String url3 = downloadInfo.getUrl();
        l.b(url3, "entity.url");
        c.g(cVar3, url3);
        c.i(this.a, downloadInfo.getId());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPause(DownloadInfo downloadInfo) {
        ConcurrentHashMap concurrentHashMap;
        String j;
        String str;
        ConcurrentHashMap concurrentHashMap2;
        String j2;
        h hVar;
        l.g(downloadInfo, "entity");
        concurrentHashMap = this.a.b;
        c cVar = this.a;
        String url = downloadInfo.getUrl();
        l.b(url, "entity.url");
        j = cVar.j(url);
        k kVar = (k) concurrentHashMap.get(j);
        if (kVar == null || (str = (String) kVar.d()) == null) {
            str = "";
        }
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder U = e.a.a.a.a.U("[暂停][SDK][", str, "][网络状态码:");
        U.append(downloadInfo.getHttpStatusCode());
        U.append("][进度:");
        U.append(downloadInfo.getDownloadProcess());
        U.append(']');
        bVar.e("JKL", U.toString());
        concurrentHashMap2 = this.a.b;
        c cVar2 = this.a;
        String url2 = downloadInfo.getUrl();
        l.b(url2, "entity.url");
        j2 = cVar2.j(url2);
        k kVar2 = (k) concurrentHashMap2.get(j2);
        if (kVar2 != null && (hVar = (h) kVar2.f()) != null) {
            hVar.k(206);
            hVar.g(new com.ss.ugc.effectplatform.bridge.network.b());
            hVar.h(-2L);
        }
        c.i(this.a, downloadInfo.getId());
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onProgress(DownloadInfo downloadInfo) {
        l.g(downloadInfo, "entity");
        com.ss.ugc.effectplatform.bridge.network.c cVar = this.b;
        if (cVar != null) {
            cVar.a(downloadInfo.getDownloadProcess(), downloadInfo.getTotalBytes());
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        l.g(downloadInfo, "entity");
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder M = e.a.a.a.a.M("[重试][SDK] : ");
        M.append(downloadInfo.getId());
        bVar.b("JKL", M.toString(), null);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onStart(DownloadInfo downloadInfo) {
        ConcurrentHashMap concurrentHashMap;
        String j;
        String str;
        l.g(downloadInfo, "entity");
        concurrentHashMap = this.a.b;
        c cVar = this.a;
        String url = downloadInfo.getUrl();
        l.b(url, "entity.url");
        j = cVar.j(url);
        k kVar = (k) concurrentHashMap.get(j);
        if (kVar == null || (str = (String) kVar.d()) == null) {
            str = "";
        }
        d.a.c.b.b.a("JKL", "[开始][SDK][" + str + ']');
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public void onSuccessed(DownloadInfo downloadInfo) {
        ConcurrentHashMap concurrentHashMap;
        String j;
        String str;
        ConcurrentHashMap concurrentHashMap2;
        String j2;
        h hVar;
        l.g(downloadInfo, "entity");
        concurrentHashMap = this.a.b;
        c cVar = this.a;
        String url = downloadInfo.getUrl();
        l.b(url, "entity.url");
        j = cVar.j(url);
        k kVar = (k) concurrentHashMap.get(j);
        if (kVar == null || (str = (String) kVar.d()) == null) {
            str = "";
        }
        d.a.c.b bVar = d.a.c.b.b;
        StringBuilder U = e.a.a.a.a.U("[成功][SDK][", str, "][状态码:");
        U.append(downloadInfo.getHttpStatusCode());
        U.append("][总大小:");
        U.append(downloadInfo.getTotalBytes());
        U.append(']');
        U.append("[单次耗时:");
        U.append(downloadInfo.getDownloadTime());
        U.append("][总体耗时:");
        U.append(downloadInfo.getRealDownloadTime());
        U.append(']');
        bVar.a("JKL", U.toString());
        FileInputStream fileInputStream = new FileInputStream(new File(downloadInfo.getTargetFilePath()));
        e eVar = new e(new a(fileInputStream, fileInputStream));
        concurrentHashMap2 = this.a.b;
        c cVar2 = this.a;
        String url2 = downloadInfo.getUrl();
        l.b(url2, "entity.url");
        j2 = cVar2.j(url2);
        k kVar2 = (k) concurrentHashMap2.get(j2);
        if (kVar2 != null && (hVar = (h) kVar2.f()) != null) {
            hVar.k(200);
            hVar.g(eVar);
            hVar.h(downloadInfo.getTotalBytes());
            hVar.j(downloadInfo.getSavePath() + File.separator + downloadInfo.getName());
        }
        c cVar3 = this.a;
        String url3 = downloadInfo.getUrl();
        l.b(url3, "entity.url");
        c.g(cVar3, url3);
        c.i(this.a, downloadInfo.getId());
    }
}
