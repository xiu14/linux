package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {
    private final Map<Class<?>, Object> a;

    static final class a {
        private final Map<Class<?>, Object> a = new HashMap();

        a() {
        }
    }

    f(a aVar) {
        this.a = Collections.unmodifiableMap(new HashMap(aVar.a));
    }

    public boolean a(Class<? extends Object> cls) {
        return this.a.containsKey(cls);
    }
}
