package com.huawei.hianalytics.f.f;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class f implements g {
    private Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7100c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hianalytics.f.b.a[] f7101d;

    /* renamed from: e, reason: collision with root package name */
    private String f7102e;

    f(Context context, com.huawei.hianalytics.f.b.a[] aVarArr, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.f7100c = str2;
        this.f7101d = (com.huawei.hianalytics.f.b.a[]) aVarArr.clone();
        this.f7102e = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.huawei.hianalytics.f.b.a[] aVarArr = this.f7101d;
        if (aVarArr == null || aVarArr.length <= 0) {
            com.huawei.hianalytics.g.b.b("EventSendResultHandleTask", "No cache info save! reqID:" + this.f7102e);
        } else {
            String str = "_default_config_tag".equals(this.b) ? "_default_config_tag" : this.b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f7100c;
            int m = com.huawei.hianalytics.a.b.m();
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "data send failed, write to cache file...reqID:" + this.f7102e);
            if (com.huawei.hianalytics.f.g.g.a(this.a, "cached_v2_1", m * 1048576)) {
                com.huawei.hianalytics.g.b.c("EventSendResultHandleTask", "THe cacheFile is full,Not writing data! reqID:" + this.f7102e);
                return;
            }
            com.huawei.hianalytics.f.b.c[] cVarArr = com.huawei.hianalytics.f.b.a.a(com.huawei.hianalytics.f.g.g.d(this.a, "cached_v2_1"), this.a, str, false).get(str);
            int length = this.f7101d.length;
            ArrayList arrayList = new ArrayList();
            if (cVarArr != null && cVarArr.length > 0) {
                List<com.huawei.hianalytics.f.b.d> a = m.a(cVarArr);
                ArrayList arrayList2 = (ArrayList) a;
                int size = arrayList2.size() + length;
                if (size > 6000) {
                    a = arrayList2.subList(length, 6000);
                    length = 6000;
                } else {
                    length = size;
                }
                for (int i = 0; i < a.size(); i++) {
                    arrayList.add(a.get(i).a());
                }
            }
            com.huawei.hianalytics.f.b.a[] aVarArr2 = (com.huawei.hianalytics.f.b.a[]) arrayList.toArray(new com.huawei.hianalytics.f.b.a[arrayList.size()]);
            com.huawei.hianalytics.f.b.a[] aVarArr3 = new com.huawei.hianalytics.f.b.a[length];
            com.huawei.hianalytics.f.b.a[] aVarArr4 = this.f7101d;
            System.arraycopy(aVarArr4, 0, aVarArr3, 0, aVarArr4.length);
            if (aVarArr2.length > 0) {
                System.arraycopy(aVarArr2, 0, aVarArr3, this.f7101d.length, aVarArr2.length);
            }
            JSONArray jSONArray = new JSONArray();
            long length2 = com.huawei.hianalytics.f.g.g.c(this.a, "cached_v2_1").length();
            for (int i2 = 0; i2 < length; i2++) {
                com.huawei.hianalytics.f.b.a aVar = aVarArr3[i2];
                com.huawei.hianalytics.f.b.a aVar2 = new com.huawei.hianalytics.f.b.a(this.a);
                aVar.a(aVar2);
                JSONObject a2 = aVar2.a(true);
                length2 += aVar2.i();
                if (length2 > com.huawei.hianalytics.a.b.m() * 1048576) {
                    com.huawei.hianalytics.g.b.c("EventSendResultHandleTask", "failed data length is too big! length: " + length2);
                    break;
                }
                jSONArray.put(a2);
            }
            try {
                com.huawei.hianalytics.f.g.g.a(this.a, jSONArray.toString(), "cached_v2_1", str);
            } catch (OutOfMemoryError unused) {
                com.huawei.hianalytics.g.b.c("EventSendResultHandleTask", "saveEventInfo: jsonArray.toString ->OOM,delete failed data");
            }
        }
        com.huawei.hianalytics.f.g.g.e(this.a, com.huawei.hianalytics.f.g.i.a(this.b, this.f7100c, this.f7102e));
    }
}
