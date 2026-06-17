package d.a.a;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b<K, V> implements Map<K, V>, Object {
    private final /* synthetic */ Map a;

    public b(boolean z) {
        this.a = z ? new ConcurrentHashMap() : new LinkedHashMap(0, 0.75f, true);
    }

    public /* synthetic */ b(boolean z, int i) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // java.util.Map
    public void clear() {
        this.a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.a.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.a.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.a.keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        return (V) this.a.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        l.g(map, "from");
        this.a.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return (V) this.a.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.a.values();
    }
}
