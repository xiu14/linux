package com.ss.ugc.effectplatform.j;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    public static final a b = new a();
    private static final ConcurrentHashMap<String, g<d.a.b.d.b, Object>> a = new ConcurrentHashMap<>();

    private a() {
    }

    public final void a(String str, String str2) {
        l.g(str, "md5");
        l.g(str2, "taskFlag");
        ConcurrentHashMap<String, g<d.a.b.d.b, Object>> concurrentHashMap = a;
        g<d.a.b.d.b, Object> gVar = concurrentHashMap.get(str);
        if (gVar != null) {
            synchronized (gVar.d()) {
                try {
                    gVar.d().notify();
                    int b2 = gVar.c().b();
                    if (gVar.c().c() == 0) {
                        d.a.c.b.b.a("LLL", "[结束][" + str2 + "][" + str + "][清空]");
                        concurrentHashMap.remove(str);
                    } else {
                        d.a.c.b.b.b("LLL", "[结束][" + str2 + "][" + str + "][" + b2 + ']', null);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public final void b(String str, String str2) {
        l.g(str, "md5");
        l.g(str2, "taskFlag");
        synchronized (a.class) {
            ConcurrentHashMap<String, g<d.a.b.d.b, Object>> concurrentHashMap = a;
            if (concurrentHashMap.get(str) == null) {
                d.a.c.b.b.a("LLL", "[开始][" + str2 + "][" + str + "][空]");
                concurrentHashMap.put(str, new g<>(new d.a.b.d.b(1), new Object()));
                return;
            }
            d.a.c.b.b.e("LLL", e.a.a.a.a.v("[开始][", str2, "][", str, "][等等]"));
            g<d.a.b.d.b, Object> gVar = concurrentHashMap.get(str);
            if ((gVar != null ? gVar.d() : null) != null) {
                synchronized (gVar.d()) {
                    try {
                        gVar.c().d();
                        gVar.d().wait();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
