package com.ss.ugc.effectplatform.j;

import android.content.Context;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.downloader.BaseDownloader;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.ugc.effectplatform.bridge.network.f;
import com.ss.ugc.effectplatform.bridge.network.h;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.g;
import kotlin.k;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c implements com.ss.ugc.effectplatform.bridge.network.e {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f8487e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static c f8488f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f8489g = null;
    private final Context a;
    private final ConcurrentHashMap<String, k<String, DownloadTask, h>> b;

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<Integer, Object> f8490c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8491d;

    public c(Object obj) {
        l.g(obj, "context");
        this.f8491d = obj;
        this.a = (Context) obj;
        this.b = new ConcurrentHashMap<>();
        this.f8490c = new ConcurrentHashMap<>();
    }

    public static final void g(c cVar, String str) {
        cVar.b.remove(cVar.j(str));
    }

    public static final void i(c cVar, int i) {
        Object obj = cVar.f8490c.get(Integer.valueOf(i));
        if (obj != null) {
            synchronized (obj) {
                try {
                    obj.notifyAll();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(String str) {
        String str2 = (String) g.D(kotlin.text.a.J(str, new String[]{"/"}, false, 0, 6, null));
        return str2.length() == 0 ? str : str2;
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.d
    public h a(f fVar) {
        l.g(fVar, "netRequest");
        return new h(601, new com.ss.ugc.effectplatform.bridge.network.b(), -1L, null, 8);
    }

    @Override // com.ss.ugc.effectplatform.bridge.network.e
    public h b(f fVar, String str, String str2, com.ss.ugc.effectplatform.bridge.network.c cVar) {
        DownloadTask with;
        String substring;
        String substring2;
        h f2;
        l.g(fVar, "netRequest");
        l.g(str, DownloadConstants.PATH_KEY);
        l.g(str2, "tag");
        k<String, DownloadTask, h> kVar = this.b.get(j(fVar.g()));
        DownloadTask e2 = kVar != null ? kVar.e() : null;
        if (e2 == null || e2.getDownloadId() == 0) {
            with = BaseDownloader.with(this.a);
            with.url(fVar.g());
            List<String> a = fVar.a();
            if (a != null) {
                with.backUpUrls(a);
            }
            bytekn.foundation.io.file.c cVar2 = bytekn.foundation.io.file.c.b;
            int w = kotlin.text.a.w(str, cVar2.i(), 0, false, 6, null);
            if (w < 0) {
                substring = null;
            } else {
                substring = str.substring(0, w);
                l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            with.savePath(substring);
            int w2 = kotlin.text.a.w(str, cVar2.i(), 0, false, 6, null);
            if (w2 < 0) {
                substring2 = null;
            } else {
                substring2 = str.substring(w2 + 1, str.length());
                l.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            with.name(substring2);
            Map<String, Object> d2 = fVar.d();
            Object obj = d2 != null ? d2.get("ParamsNetLimit") : null;
            if ((obj instanceof Long) && (!l.a(obj, 0L))) {
                with.throttleNetSpeed(((Number) obj).longValue());
            }
            with.subThreadListener(new b(this, cVar));
            l.b(with, "task");
            kVar = new k<>(str2, with, new h(601, new com.ss.ugc.effectplatform.bridge.network.b(), -1L, null, 8));
            this.b.put(j(fVar.g()), kVar);
            with.download();
            d.a.c.b.b.a("JKL", "[收到下载请求][SDK][" + str2 + ']');
            e2 = with;
        } else {
            d.a.c.b.b.a("JKL", "[恢复下载请求][SDK][" + str2 + ']');
            Downloader.getInstance(this.a).resume(e2.getDownloadId());
        }
        if (this.f8490c.get(Integer.valueOf(e2.getDownloadId())) == null) {
            this.f8490c.put(Integer.valueOf(e2.getDownloadId()), new Object());
        }
        Object obj2 = this.f8490c.get(Integer.valueOf(e2.getDownloadId()));
        if (obj2 != null) {
            synchronized (obj2) {
                try {
                    obj2.wait();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        this.f8490c.remove(Integer.valueOf(e2.getDownloadId()));
        return (kVar == null || (f2 = kVar.f()) == null) ? new h(601, new com.ss.ugc.effectplatform.bridge.network.b(), -1L, null, 8) : f2;
    }
}
