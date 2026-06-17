package com.bytedance.android.input.basic.applog.impl;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bdinstall.G;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.util.HashMap;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c implements G {
    private com.bytedance.article.common.network.a a = new com.bytedance.article.common.network.a();

    c() {
    }

    @Override // com.bytedance.bdinstall.G
    public String a(String str, byte[] bArr, Map<String, String> map) {
        boolean z;
        z = b.b;
        if (!z) {
            return "";
        }
        try {
            String d2 = this.a.d(str, bArr, map, null);
            l.e(d2, "{\n                    mC…, null)\n                }");
            return d2;
        } catch (com.bytedance.common.utility.a e2) {
            if (e2.a() != 0) {
                StringBuilder M = e.a.a.a.a.M("post - response code: ");
                M.append(e2.a());
                M.append(" cause: ");
                M.append(e2.getCause());
                Log.e("AppLogInitializer", M.toString());
            }
            String message = e2.getMessage();
            return message == null ? "" : message;
        }
    }

    @Override // com.bytedance.bdinstall.G
    public byte[] b(String str, byte[] bArr, Map<String, String> map) {
        boolean z;
        z = b.b;
        if (!z) {
            return new byte[0];
        }
        try {
            byte[] h = this.a.h(str, bArr, map, null);
            l.e(h, "{\n                    mC…, null)\n                }");
            return h;
        } catch (com.bytedance.common.utility.a e2) {
            StringBuilder M = e.a.a.a.a.M("postStream - response code: ");
            M.append(e2.a());
            M.append(" cause: ");
            M.append(e2.getCause());
            Log.e("AppLogInitializer", M.toString());
            return new byte[0];
        }
    }

    @Override // com.bytedance.bdinstall.G
    public String c(String str, byte[] bArr, String str2) {
        boolean z;
        z = b.b;
        if (!z) {
            return "";
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, str2);
        }
        try {
            String d2 = this.a.d(str, bArr, hashMap, null);
            l.e(d2, "{\n                    mC…, null)\n                }");
            return d2;
        } catch (com.bytedance.common.utility.a e2) {
            if (e2.a() != 0) {
                StringBuilder M = e.a.a.a.a.M("post - response code: ");
                M.append(e2.a());
                M.append(" cause: ");
                M.append(e2.getCause());
                Log.e("AppLogInitializer", M.toString());
            }
            String message = e2.getMessage();
            return message == null ? "" : message;
        }
    }

    @Override // com.bytedance.bdinstall.G
    public String d(String str, Map<String, String> map) {
        try {
            String a = this.a.a(str, map, null);
            l.e(a, "{\n                    mC…, null]\n                }");
            return a;
        } catch (Exception e2) {
            if (e2 instanceof com.bytedance.common.utility.a) {
                StringBuilder M = e.a.a.a.a.M("get - response code: ");
                M.append(((com.bytedance.common.utility.a) e2).a());
                M.append(" cause: ");
                M.append(e2.getCause());
                Log.e("AppLogInitializer", M.toString());
            } else {
                StringBuilder M2 = e.a.a.a.a.M("get - Not common http exception, cause: ");
                M2.append(e2.getCause());
                Log.e("AppLogInitializer", M2.toString());
            }
            String message = e2.getMessage();
            return message == null ? "" : message;
        }
    }
}
