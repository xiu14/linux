package com.facebook.cache.disk;

import java.util.Map;

/* loaded from: classes2.dex */
public class e implements com.facebook.cache.common.b {
    private final com.facebook.cache.common.b a;
    private final Map<String, String> b;

    public e(com.facebook.cache.common.b bVar, Map<String, String> map) {
        this.a = bVar;
        this.b = map;
    }

    @Override // com.facebook.cache.common.b
    public boolean a() {
        return false;
    }

    @Override // com.facebook.cache.common.b
    public String b() {
        return this.a.b();
    }

    public Map<String, String> c() {
        return this.b;
    }

    @Override // com.facebook.cache.common.b
    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    @Override // com.facebook.cache.common.b
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.facebook.cache.common.b
    public String toString() {
        return this.a.toString();
    }
}
