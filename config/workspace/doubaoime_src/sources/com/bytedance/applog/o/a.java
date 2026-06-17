package com.bytedance.applog.o;

import android.text.TextUtils;
import com.bytedance.applog.w.j;
import com.bytedance.bdinstall.G;
import com.bytedance.bdinstall.Z;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements G {
    private final com.bytedance.applog.c a;

    public a(com.bytedance.applog.c cVar) {
        this.a = cVar;
    }

    @Override // com.bytedance.bdinstall.G
    public String a(String str, byte[] bArr, Map<String, String> map) throws Exception {
        int i = j.a;
        return this.a.L().a(str, bArr, map);
    }

    @Override // com.bytedance.bdinstall.G
    public byte[] b(String str, byte[] bArr, Map<String, String> map) throws Z {
        int i = j.a;
        byte[] b = this.a.L().b(str, bArr, map);
        if (b != null) {
            new String(b);
        }
        return b;
    }

    @Override // com.bytedance.bdinstall.G
    public String c(String str, byte[] bArr, String str2) throws Exception {
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, str2);
        }
        int i = j.a;
        return this.a.L().c(str, bArr, str2);
    }

    @Override // com.bytedance.bdinstall.G
    public String d(String str, Map<String, String> map) throws Exception {
        int i = j.a;
        return this.a.L().d(str, map);
    }
}
