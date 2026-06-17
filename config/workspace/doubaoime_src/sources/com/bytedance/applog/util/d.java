package com.bytedance.applog.util;

import com.bytedance.applog.compress.CompressManager;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {
    private final com.bytedance.applog.x.b a;
    private final CompressManager b;

    public d(com.bytedance.applog.c cVar, com.bytedance.applog.x.b bVar) {
        this.a = bVar;
        this.b = new CompressManager(cVar.o(), cVar.I());
    }

    public com.bytedance.applog.e a(byte[] bArr) {
        com.bytedance.applog.e eVar = new com.bytedance.applog.e();
        com.bytedance.applog.compress.a aVar = new com.bytedance.applog.compress.a();
        eVar.d(this.b.compress(bArr, this.a.l(), aVar));
        eVar.e(aVar.f3783c);
        HashMap hashMap = new HashMap(4);
        int i = aVar.f3783c;
        if (i == 0) {
            hashMap.put("log-encode-type", DownloadHelper.GZIP);
            hashMap.put(DownloadHelper.CONTENT_ENCODING, DownloadHelper.GZIP);
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=b");
        } else if (i == 1 || i == 2) {
            hashMap.put("log-encode-type", "zstd");
            hashMap.put("log-encode-token", String.valueOf(0));
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/octet-stream;tt-data=b");
        } else if (i == -1) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/json;charset=utf-8");
        }
        eVar.f(hashMap);
        return eVar;
    }
}
