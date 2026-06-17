package com.bytedance.crash.util;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class b<K, V> extends ConcurrentHashMap<K, List<V>> {
    public void a(V v, K... kArr) {
        if (v != null && kArr.length > 0) {
            for (K k : kArr) {
                b(k).add(v);
            }
        }
    }

    @NonNull
    public List<V> b(K k) {
        List<V> list = (List) super.get(k);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        put(k, arrayList);
        return arrayList;
    }

    public void c(V v) {
        Iterator<V> it2 = values().iterator();
        while (it2.hasNext()) {
            ((List) it2.next()).remove(v);
        }
    }
}
