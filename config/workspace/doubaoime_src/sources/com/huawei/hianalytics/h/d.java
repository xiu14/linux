package com.huawei.hianalytics.h;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {
    private String a;
    private List<g> b = new LinkedList();

    d(String str) {
        this.a = str;
    }

    public c a(byte[] bArr, Map<String, String> map) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            g gVar = this.b.get(i);
            if (gVar.b()) {
                c a = b.a(gVar.a, bArr, map);
                com.huawei.hianalytics.g.b.b("ReportInstance", "response code : " + a.a());
                if (-104 != a.a()) {
                    return a;
                }
                gVar.a();
            } else {
                com.huawei.hianalytics.g.b.b("ReportInstance " + this.a, "No." + i + " address failed more than 5 times. Try with backup address...");
            }
        }
        com.huawei.hianalytics.g.b.b("ReportInstance " + this.a, "All backup address not valid.");
        return new c(-107, "");
    }

    public void a(String[] strArr) {
        for (String str : strArr) {
            this.b.add(new g(str));
        }
    }
}
