package d.a.e;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<K, V> {
    private final d.a.a.b<K, d.a.a.a<V>> a = new d.a.a.b<>(false, 1);

    public final Collection<V> a(K k) {
        d.a.a.a<V> aVar = this.a.get(k);
        return aVar != null ? aVar : new ArrayList();
    }

    public final Set<K> b() {
        return this.a.keySet();
    }

    public final void c(K k, V v) {
        d.a.a.a<V> aVar = this.a.get(k);
        if (aVar != null) {
            aVar.add(v);
            return;
        }
        d.a.a.a<V> aVar2 = new d.a.a.a<>(false, 1);
        aVar2.add(v);
        this.a.put(k, aVar2);
    }

    public final Collection<V> d() {
        Collection<d.a.a.a<V>> values = this.a.values();
        ArrayList arrayList = new ArrayList();
        Iterator<d.a.a.a<V>> it2 = values.iterator();
        while (it2.hasNext()) {
            arrayList.addAll(it2.next());
        }
        return arrayList;
    }
}
