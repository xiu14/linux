package e.c.c.d;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: classes2.dex */
public class f<K, V> extends HashMap<K, V> {
    private f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> f<K, V> a(Map<? extends K, ? extends V> map) {
        return new f<>(map);
    }

    public static <K, V> Map<K, V> of(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> of(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }
}
