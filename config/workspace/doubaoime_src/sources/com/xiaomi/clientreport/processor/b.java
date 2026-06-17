package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.bw;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class b implements IPerfProcessor {
    protected Context a;

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f21a;

    public b(Context context) {
        this.a = context;
    }

    private String c(com.xiaomi.clientreport.data.a aVar) {
        String b = b(aVar);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String j = e.a.a.a.a.j(b, i);
            if (bw.m141a(this.a, j)) {
                return j;
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.c
    public void a() {
        bw.a(this.a, "perf", "perfUploading");
        File[] m142a = bw.m142a(this.a, "perfUploading");
        if (m142a == null || m142a.length <= 0) {
            return;
        }
        for (File file : m142a) {
            if (file != null) {
                List<String> a = e.a(this.a, file.getAbsolutePath());
                file.delete();
                a(a);
            }
        }
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f21a;
        if (hashMap == null) {
            return;
        }
        if (hashMap.size() > 0) {
            Iterator<String> it2 = this.f21a.keySet().iterator();
            while (it2.hasNext()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f21a.get(it2.next());
                if (hashMap2 != null && hashMap2.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[hashMap2.size()];
                    hashMap2.values().toArray(aVarArr);
                    a(aVarArr);
                }
            }
        }
        this.f21a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.IPerfProcessor
    public void setPerfMap(HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap) {
        this.f21a = hashMap;
    }

    public void a(List<String> list) {
        bw.a(this.a, list);
    }

    public void a(com.xiaomi.clientreport.data.a[] aVarArr) {
        String c2 = c(aVarArr[0]);
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        e.a(c2, aVarArr);
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        String str;
        int i = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + "#" + str2;
        }
        File file = new File(this.a.getFilesDir(), "perf");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str).getAbsolutePath();
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* renamed from: a */
    public void mo29a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f21a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String a = a((com.xiaomi.clientreport.data.a) perfClientReport);
            String a2 = e.a(perfClientReport);
            HashMap<String, com.xiaomi.clientreport.data.a> hashMap = this.f21a.get(a);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) hashMap.get(a2);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            hashMap.put(a2, perfClientReport);
            this.f21a.put(a, hashMap);
        }
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }
}
