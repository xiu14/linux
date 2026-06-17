package e.b.l;

import android.app.Application;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {
    private c a;
    private final Application b;

    /* renamed from: c, reason: collision with root package name */
    private final List<e.b.l.p.b> f9596c = new ArrayList(4);

    /* renamed from: d, reason: collision with root package name */
    private final List<com.bytedance.rpc.transport.h> f9597d = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    private final List<com.bytedance.rpc.transport.k> f9598e = new ArrayList(2);

    /* renamed from: f, reason: collision with root package name */
    private final List<e.b.l.p.c> f9599f = new ArrayList(2);

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Object> f9600g = new HashMap(4);
    private final Map<String, Map<String, String>> h = new HashMap(2);
    private final Map<String, Map<String, String>> i = new HashMap(2);

    d(Application application, c cVar) {
        this.b = application;
        this.a = cVar;
    }

    public void a(e.b.l.p.b bVar) {
        synchronized (this.f9596c) {
            if (!this.f9596c.contains(bVar)) {
                this.f9596c.add(bVar);
            }
        }
    }

    public void b(e.b.l.p.c cVar) {
        if (this.f9599f.contains(cVar)) {
            return;
        }
        this.f9599f.add(cVar);
    }

    public void c(com.bytedance.rpc.transport.h hVar) {
        synchronized (this.f9597d) {
            if (!this.f9597d.contains(hVar)) {
                this.f9597d.add(hVar);
            }
        }
    }

    public void d(com.bytedance.rpc.transport.k kVar) {
        synchronized (this.f9598e) {
            if (!this.f9598e.contains(kVar)) {
                this.f9598e.add(kVar);
            }
        }
    }

    boolean e(String str, Map<String, String> map, Map<String, String> map2) {
        Object remove;
        synchronized (this.f9600g) {
            Map<String, String> map3 = this.h.get(str);
            Map<String, String> map4 = this.i.get(str);
            if ((map3 == null || map4 == null) && (remove = this.f9600g.remove(str)) != null) {
                HashMap hashMap = new HashMap(8);
                HashMap hashMap2 = new HashMap(8);
                com.bytedance.rpc.serialize.g.d(remove, hashMap, hashMap2, null);
                this.h.put(str, hashMap);
                this.i.put(str, hashMap2);
                map3 = this.h.get(str);
                map4 = this.i.get(str);
            }
            if (map3 == null || map4 == null) {
                return false;
            }
            map.putAll(map3);
            map2.putAll(map4);
            return true;
        }
    }

    public Application f() {
        return this.b;
    }

    public c g() {
        return this.a;
    }

    List<e.b.l.p.b> h() {
        return this.f9596c;
    }

    List<e.b.l.p.c> i() {
        return this.f9599f;
    }

    List<com.bytedance.rpc.transport.h> j() {
        return this.f9597d;
    }

    List<com.bytedance.rpc.transport.k> k() {
        return this.f9598e;
    }
}
