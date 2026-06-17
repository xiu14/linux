package com.bytedance.bdinstall;

import android.text.TextUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.bytedance.bdinstall.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0637q implements G {
    private final r a = new r();

    @Override // com.bytedance.bdinstall.G
    public String a(String str, byte[] bArr, Map<String, String> map) throws Exception {
        com.bytedance.bdinstall.l0.a b = this.a.b(str, bArr, map);
        return b != null ? b.a() : "";
    }

    @Override // com.bytedance.bdinstall.G
    public byte[] b(String str, byte[] bArr, Map<String, String> map) throws Z {
        return this.a.c(str, bArr, map);
    }

    @Override // com.bytedance.bdinstall.G
    public String c(String str, byte[] bArr, String str2) throws Exception {
        r rVar = this.a;
        Objects.requireNonNull(rVar);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, str2);
        }
        com.bytedance.bdinstall.l0.a b = rVar.b(str, bArr, hashMap);
        return b != null ? b.a() : "";
    }

    @Override // com.bytedance.bdinstall.G
    public String d(String str, Map<String, String> map) throws Exception {
        Objects.requireNonNull(this.a);
        com.bytedance.bdinstall.l0.a a = r.a(0, str, (HashMap) map, null);
        return a != null ? a.a() : "";
    }
}
