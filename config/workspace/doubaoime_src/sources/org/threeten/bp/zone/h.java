package org.threeten.bp.zone;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class h {
    private static final CopyOnWriteArrayList<h> a = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, h> b = new ConcurrentHashMap(512, 0.75f, 2);

    static {
        g.a();
    }

    protected h() {
    }

    public static e a(String str, boolean z) {
        org.apache.http.conn.ssl.d.k(str, "zoneId");
        ConcurrentMap<String, h> concurrentMap = b;
        h hVar = concurrentMap.get(str);
        if (hVar != null) {
            return hVar.b(str, z);
        }
        if (concurrentMap.isEmpty()) {
            throw new f("No time-zone data files registered");
        }
        throw new f(e.a.a.a.a.s("Unknown time-zone ID: ", str));
    }

    public static void d(h hVar) {
        org.apache.http.conn.ssl.d.k(hVar, "provider");
        for (String str : hVar.c()) {
            org.apache.http.conn.ssl.d.k(str, "zoneId");
            if (b.putIfAbsent(str, hVar) != null) {
                throw new f("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + hVar);
            }
        }
        a.add(hVar);
    }

    protected abstract e b(String str, boolean z);

    protected abstract Set<String> c();
}
