package com.bytedance.ttnet.j;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a {
    private static a b;
    private Map<String, b> a = new ConcurrentHashMap();

    public static synchronized a c() {
        a aVar;
        synchronized (a.class) {
            if (b == null) {
                b = new a();
            }
            aVar = b;
        }
        return aVar;
    }

    public void a(String str, int i, int i2, int i3, List list, String str2) {
        b bVar = this.a.get(str);
        if (bVar != null) {
            bVar.e(new c(i, i2, i3, list, str2));
            bVar.d();
            this.a.remove(str);
        }
    }

    public c b(String str, int i, Map<String, String> map) throws Exception {
        b bVar = new b(str, i, map);
        this.a.put(bVar.f(), bVar);
        bVar.b();
        bVar.a();
        this.a.remove(bVar.f());
        return bVar.c();
    }
}
