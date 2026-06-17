package e.b.l;

import com.bytedance.rpc.serialize.SerializeType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class n {
    protected long a;
    protected long b;

    /* renamed from: c, reason: collision with root package name */
    protected long f9641c;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f9643e;

    /* renamed from: f, reason: collision with root package name */
    protected SerializeType f9644f;

    /* renamed from: g, reason: collision with root package name */
    protected final String[] f9645g;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f9642d = true;
    protected final Map<Integer, Map<String, String>> h = new HashMap(2);
    protected final Map<Integer, Map<String, String>> i = new HashMap(2);
    protected final Map<Integer, Map<String, String>> j = new HashMap(2);

    n(d dVar) {
        this.f9643e = true;
        String[] strArr = new String[2];
        this.f9645g = strArr;
        c g2 = dVar == null ? null : dVar.g();
        if (g2 != null) {
            this.a = g2.q();
            this.b = g2.t();
            this.f9641c = g2.u();
            this.f9643e = g2.v();
            strArr[0] = g2.p();
        }
    }

    private Map<String, String> a(Map<Integer, Map<String, String>> map, Map<String, String> map2) {
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, String> map3 = map.get(1);
        if (map3 != null && !map3.isEmpty()) {
            map2.putAll(map3);
        }
        Map<String, String> map4 = map.get(0);
        if (map4 != null && !map4.isEmpty()) {
            Iterator<String> it2 = map4.keySet().iterator();
            while (it2.hasNext()) {
                map2.remove(it2.next());
            }
        }
        return map2;
    }

    private void h(Map<Integer, Map<String, String>> map, Map<Integer, Map<String, String>> map2, int i) {
        Map<String, String> map3 = map.get(Integer.valueOf(i));
        if (map3 != null && !map3.isEmpty()) {
            Map<String, String> e2 = e(Integer.valueOf(i), map2);
            e2.clear();
            e2.putAll(map3);
        } else {
            Map<String, String> map4 = map2.get(Integer.valueOf(i));
            if (map4 != null) {
                map4.clear();
            }
        }
    }

    Map<String, String> b(Map<String, String> map) {
        return a(this.j, map);
    }

    Map<String, String> c(Map<String, String> map) {
        return a(this.h, map);
    }

    Map<String, String> d(Map<String, String> map) {
        return a(this.i, map);
    }

    protected Map<String, String> e(Integer num, Map<Integer, Map<String, String>> map) {
        Map<String, String> map2 = map.get(num);
        if (map2 != null) {
            return map2;
        }
        HashMap hashMap = new HashMap(4);
        map.put(num, hashMap);
        return hashMap;
    }

    protected void f(Map<Integer, Map<String, String>> map, String str, String str2) {
        if (e.b.l.q.c.c(str)) {
            Map<String, String> e2 = e(1, map);
            Map<String, String> e3 = e(0, map);
            if (str2 == null) {
                e2.remove(str);
                e3.put(str, "");
            } else {
                e3.remove(str);
                e2.put(str, str2);
            }
        }
    }

    n g(m mVar) {
        n c2 = mVar.i().c();
        this.a = c2.a;
        this.b = c2.b;
        this.f9641c = c2.f9641c;
        String[] strArr = this.f9645g;
        strArr[0] = c2.f9645g[0];
        strArr[1] = mVar.f();
        this.f9642d = mVar.n();
        this.f9644f = mVar.k();
        this.f9643e = mVar.i().e().v();
        h(c2.h, this.h, 0);
        h(c2.h, this.h, 1);
        h(c2.i, this.i, 0);
        h(c2.i, this.i, 1);
        h(c2.j, this.j, 0);
        h(c2.j, this.j, 1);
        return this;
    }

    public void i(String str) {
        this.f9645g[0] = str;
    }

    public void j(String str) {
        this.f9645g[1] = str;
    }
}
