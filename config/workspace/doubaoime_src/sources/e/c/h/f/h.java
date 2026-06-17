package e.c.h.f;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class h<K, V> {
    private final y<V> a;
    private final LinkedHashMap<K, V> b = new LinkedHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private int f9869c = 0;

    public h(y<V> yVar) {
        this.a = yVar;
    }

    private int g(V v) {
        if (v == null) {
            return 0;
        }
        return this.a.a(v);
    }

    public synchronized ArrayList<V> a() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>((Collection<? extends V>) this.b.values());
        this.b.clear();
        this.f9869c = 0;
        return arrayList;
    }

    public synchronized boolean b(K k) {
        return this.b.containsKey(k);
    }

    public synchronized V c(K k) {
        return this.b.get(k);
    }

    public synchronized int d() {
        return this.b.size();
    }

    public synchronized K e() {
        return this.b.isEmpty() ? null : this.b.keySet().iterator().next();
    }

    public synchronized int f() {
        return this.f9869c;
    }

    public synchronized V h(K k, V v) {
        V remove;
        remove = this.b.remove(k);
        this.f9869c -= g(remove);
        this.b.put(k, v);
        this.f9869c += g(v);
        return remove;
    }

    public synchronized V i(K k) {
        V remove;
        remove = this.b.remove(k);
        this.f9869c -= g(remove);
        return remove;
    }

    public synchronized ArrayList<V> j(e.c.c.d.i<K> iVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator<Map.Entry<K, V>> it2 = this.b.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (iVar == null || iVar.apply(next.getKey())) {
                arrayList.add(next.getValue());
                this.f9869c -= g(next.getValue());
                it2.remove();
            }
        }
        return arrayList;
    }
}
