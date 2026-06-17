package com.huawei.hms.common.data;

import e.c.c.d.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        return freezeIterable(arrayList);
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        e eVar = (ArrayList<T>) new ArrayList();
        if (iterable == null) {
            return eVar;
        }
        Iterator<E> it2 = iterable.iterator();
        while (it2.hasNext()) {
            eVar.add(it2.next().freeze());
        }
        return eVar;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        return freezeIterable(Arrays.asList(eArr));
    }
}
