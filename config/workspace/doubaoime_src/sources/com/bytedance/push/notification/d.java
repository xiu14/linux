package com.bytedance.push.notification;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d<K, V> extends LinkedHashMap<K, V> {
    private final int a;

    public d(int i) {
        this.a = i;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.a;
    }
}
