package com.huawei.b.g.e;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
class l implements com.huawei.b.g.c {
    private final Map<String, String> a = new ConcurrentHashMap();
    private final k b;

    l(Context context, String str) {
        this.b = new k(context, str);
    }

    @Override // com.huawei.b.g.c
    public String getString(String str, String str2) {
        String str3 = this.a.get(str);
        if (str3 != null) {
            return str3;
        }
        String a = this.b.a(str, str2);
        if (a == null) {
            return str2;
        }
        this.a.put(str, a);
        return a;
    }

    public String toString() {
        return "SecurityResourcesReader{mKey=, encrypt=true}";
    }
}
