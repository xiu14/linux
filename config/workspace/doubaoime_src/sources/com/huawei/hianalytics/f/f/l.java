package com.huawei.hianalytics.f.f;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class l implements j {
    private static l a;

    private l() {
    }

    public static j a() {
        l lVar;
        synchronized (l.class) {
            if (a == null) {
                a = new l();
            }
            lVar = a;
        }
        return lVar;
    }

    @Override // com.huawei.hianalytics.f.f.j
    public final boolean a(byte[] bArr, String str, String str2, String str3) {
        String str4;
        String str5;
        com.huawei.hianalytics.h.c a2;
        String c2 = com.huawei.hianalytics.a.c.c(str2, str);
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", com.huawei.hianalytics.a.b.f());
        hashMap.put("App-Ver", com.huawei.hianalytics.a.b.g());
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "2.1.4.308");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("servicetag", str2);
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "sendData RequestId : %s", str3);
        hashMap.put("Request-Id", str3);
        com.huawei.hianalytics.g.b.b("NetHandler", "send data body size : " + bArr.length);
        if ("preins".equals(str) && com.huawei.hianalytics.a.b.j().length > 0) {
            a2 = com.huawei.hianalytics.h.e.a().a(bArr, hashMap, "preload_url_tag");
        } else {
            if (TextUtils.isEmpty(c2)) {
                com.huawei.hianalytics.g.b.c("NetHandler", "No report address,TAG : %s,TYPE: %s ", str2, str);
                return false;
            }
            if ("oper".equals(str)) {
                str5 = "{url}/common/hmshioperqrt";
            } else if ("maint".equals(str)) {
                str5 = "{url}/common/hmshimaintqrt";
            } else if ("diffprivacy".equals(str)) {
                str5 = "{url}/common/common2";
            } else {
                str4 = "";
                a2 = com.huawei.hianalytics.h.b.a(str4, bArr, hashMap);
            }
            str4 = str5.replace("{url}", c2);
            a2 = com.huawei.hianalytics.h.b.a(str4, bArr, hashMap);
        }
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + str3, str, str2, Integer.valueOf(a2.a()));
        return a2.a() == 200;
    }
}
