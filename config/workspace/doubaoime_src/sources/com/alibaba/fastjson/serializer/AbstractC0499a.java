package com.alibaba.fastjson.serializer;

/* renamed from: com.alibaba.fastjson.serializer.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0499a {
    private static final ThreadLocal<m> a = new ThreadLocal<>();
    private static final ThreadLocal<Character> b = new ThreadLocal<>();

    final char a(m mVar, Object obj, char c2) {
        ThreadLocal<m> threadLocal = a;
        threadLocal.set(mVar);
        ThreadLocal<Character> threadLocal2 = b;
        threadLocal2.set(Character.valueOf(c2));
        b(obj);
        threadLocal.set(null);
        return threadLocal2.get().charValue();
    }

    public abstract void b(Object obj);
}
