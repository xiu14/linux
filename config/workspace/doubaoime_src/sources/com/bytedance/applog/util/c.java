package com.bytedance.applog.util;

import android.text.TextUtils;
import com.bytedance.bdinstall.G;
import com.bytedance.bdinstall.Z;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c implements G {
    private final com.bytedance.applog.A.a a;

    public c(com.bytedance.applog.c cVar) {
        this.a = cVar.i();
    }

    @Override // com.bytedance.bdinstall.G
    public String a(String str, byte[] bArr, Map<String, String> map) throws Z {
        return this.a.h(1, str, (HashMap) map, bArr);
    }

    @Override // com.bytedance.bdinstall.G
    public byte[] b(String str, byte[] bArr, Map<String, String> map) throws Z {
        return this.a.j(1, str, (HashMap) map, bArr);
    }

    @Override // com.bytedance.bdinstall.G
    public String c(String str, byte[] bArr, String str2) throws Z {
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, str2);
        }
        return this.a.h(1, str, hashMap, bArr);
    }

    @Override // com.bytedance.bdinstall.G
    public String d(String str, Map<String, String> map) throws Z {
        return this.a.h(0, str, (HashMap) map, null);
    }
}
