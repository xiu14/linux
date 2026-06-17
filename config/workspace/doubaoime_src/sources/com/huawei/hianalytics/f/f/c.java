package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {
    private Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private com.huawei.hianalytics.f.b.c[] f7089c;

    /* renamed from: d, reason: collision with root package name */
    private String f7090d;

    /* renamed from: e, reason: collision with root package name */
    private String f7091e;

    c(Context context, String str, com.huawei.hianalytics.f.b.c[] cVarArr, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.f7089c = cVarArr;
        this.f7090d = str2;
        this.f7091e = str3;
    }

    private void b(com.huawei.hianalytics.f.b.c[] cVarArr, String str, String str2) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3 = 2;
        boolean z3 = false;
        boolean z4 = true;
        com.huawei.hianalytics.g.b.a("EventDataHandler", "choiceHandleEvents TAG : %s,TYPE: %s", str2, str);
        ArrayList arrayList = (ArrayList) m.a(cVarArr);
        int size = arrayList.size();
        if (size <= 0) {
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "no events to send,TAG : %s,TYPE: %s", str2, str);
            return;
        }
        while (size > 0) {
            int i4 = size - (size <= 500 ? size : 500);
            List subList = arrayList.subList(i4, size);
            if (subList.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray();
                long currentTimeMillis = System.currentTimeMillis();
                long g2 = com.huawei.hianalytics.a.c.g(str2, str) * com.heytap.mcssdk.constant.a.f6888f;
                long length = com.huawei.hianalytics.f.g.g.c(this.a, "backup_event").length();
                Iterator it2 = subList.iterator();
                long j = length;
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    com.huawei.hianalytics.f.b.d dVar = (com.huawei.hianalytics.f.b.d) it2.next();
                    if (dVar.a(currentTimeMillis, g2)) {
                        it2 = it3;
                    } else {
                        com.huawei.hianalytics.f.b.a a = dVar.a();
                        arrayList2.add(a);
                        long j2 = currentTimeMillis;
                        JSONObject a2 = a.a();
                        j = a.i() + j;
                        jSONArray.put(a2);
                        it2 = it3;
                        currentTimeMillis = j2;
                    }
                }
                if (arrayList2.size() <= 0 || jSONArray.length() <= 0) {
                    i2 = i4;
                    i = 2;
                    z = false;
                    z2 = true;
                    com.huawei.hianalytics.g.b.c("EventDataHandler", "Not have data need to send.TAG : %s,TYPE: %s", str2, str);
                } else {
                    SharedPreferences d2 = com.huawei.hianalytics.f.g.g.d(this.a, "backup_event");
                    String str3 = this.f7091e;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                    }
                    String str4 = str3;
                    if (com.huawei.hianalytics.f.g.g.a(this.a, "backup_event", 5242880) || j >= 5242880) {
                        com.huawei.hianalytics.g.b.b("EventDataHandler", "backup file reach max limited size, discard new event ");
                    } else {
                        String a3 = com.huawei.hianalytics.f.g.i.a(str2, str, str4);
                        com.huawei.hianalytics.g.b.b("EventDataHandler", "Update data cached into backup,spKey: " + a3);
                        try {
                            com.huawei.hianalytics.f.g.g.a(d2, a3, jSONArray.toString());
                        } catch (OutOfMemoryError unused) {
                            com.huawei.hianalytics.g.b.c("EventDataHandler", "the backup data is too big,toString() -> OOM,backupDataLength: " + j);
                        }
                    }
                    i2 = i4;
                    com.huawei.hianalytics.f.g.j.b(new a(this.a, arrayList2, str, str2, this.f7090d, str4));
                    i = 2;
                    z = false;
                    z2 = true;
                }
            } else {
                i = i3;
                z = z3;
                z2 = z4;
                i2 = i4;
                Object[] objArr = new Object[i];
                objArr[z ? 1 : 0] = str2;
                objArr[z2 ? 1 : 0] = str;
                com.huawei.hianalytics.g.b.b("HiAnalytics/event", "empty event data, no need to send,TAG : %s,TYPE: %s", objArr);
            }
            i3 = i;
            z3 = z;
            size = i2;
            z4 = z2;
        }
    }

    public void a() {
        char c2;
        char c3;
        boolean z;
        char c4;
        List list;
        com.huawei.hianalytics.g.b.b("EventDataHandler", "handler event report...");
        Pair<String, String> a = com.huawei.hianalytics.f.g.i.a(this.b);
        if (!"_default_config_tag".equals(a.first)) {
            b(this.f7089c, (String) a.second, (String) a.first);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List[] listArr = {arrayList, arrayList2, arrayList3, arrayList4};
        for (com.huawei.hianalytics.f.b.c cVar : this.f7089c) {
            String g2 = cVar.g();
            if (TextUtils.isEmpty(g2)) {
                c2 = 3;
                c3 = 2;
                z = true;
                c4 = 0;
            } else if ("oper".equals(g2)) {
                c2 = 3;
                c4 = 0;
                c3 = 2;
                z = true;
            } else {
                z = true;
                if ("maint".equals(g2)) {
                    list = listArr[1];
                    c2 = 3;
                    c4 = 0;
                    c3 = 2;
                } else {
                    c3 = 2;
                    if ("preins".equals(g2)) {
                        list = listArr[2];
                        c2 = 3;
                    } else {
                        boolean equals = "diffprivacy".equals(g2);
                        c2 = 3;
                        if (equals) {
                            list = listArr[3];
                        } else {
                            c4 = 0;
                        }
                    }
                    c4 = 0;
                }
                list.add(cVar);
            }
            list = listArr[c4];
            list.add(cVar);
        }
        if (arrayList.size() > 0) {
            b((com.huawei.hianalytics.f.b.c[]) arrayList.toArray(new com.huawei.hianalytics.f.b.c[arrayList.size()]), "oper", "_default_config_tag");
        }
        if (arrayList2.size() > 0) {
            b((com.huawei.hianalytics.f.b.c[]) arrayList2.toArray(new com.huawei.hianalytics.f.b.c[arrayList2.size()]), "maint", "_default_config_tag");
        }
        if (arrayList3.size() > 0) {
            b((com.huawei.hianalytics.f.b.c[]) arrayList3.toArray(new com.huawei.hianalytics.f.b.c[arrayList3.size()]), "preins", "_default_config_tag");
        }
        if (arrayList4.size() > 0) {
            b((com.huawei.hianalytics.f.b.c[]) arrayList4.toArray(new com.huawei.hianalytics.f.b.c[arrayList4.size()]), "diffprivacy", "_default_config_tag");
        }
    }
}
