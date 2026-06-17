package com.bytedance.retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class t {
    private final Method a;
    private final List<?> b;

    t(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public Method a() {
        return this.a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.a.getDeclaringClass().getName(), this.a.getName(), this.b);
    }
}
