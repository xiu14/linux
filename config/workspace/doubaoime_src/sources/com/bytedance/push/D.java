package com.bytedance.push;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class D {
    private final Map<String, String> a;
    private final boolean b;

    public D(Map<String, String> map, boolean z) {
        this.a = new HashMap(map);
        this.b = z;
    }

    public Map<String, String> a() {
        return new HashMap(this.a);
    }

    public boolean b() {
        return this.b;
    }
}
