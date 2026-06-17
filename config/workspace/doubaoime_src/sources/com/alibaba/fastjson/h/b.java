package com.alibaba.fastjson.h;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class b<V> {
    private final a<V>[] a;
    private final int b;

    protected static final class a<V> {
        public final Type a;
        public V b;

        /* renamed from: c, reason: collision with root package name */
        public final a<V> f1475c;

        public a(Type type, V v, int i, a<V> aVar) {
            this.a = type;
            this.b = v;
            this.f1475c = aVar;
        }
    }

    public b(int i) {
        this.b = i - 1;
        this.a = new a[i];
    }

    public final V a(Type type) {
        for (a<V> aVar = this.a[System.identityHashCode(type) & this.b]; aVar != null; aVar = aVar.f1475c) {
            if (type == aVar.a) {
                return aVar.b;
            }
        }
        return null;
    }

    public boolean b(Type type, V v) {
        int identityHashCode = System.identityHashCode(type);
        int i = this.b & identityHashCode;
        for (a<V> aVar = this.a[i]; aVar != null; aVar = aVar.f1475c) {
            if (type == aVar.a) {
                aVar.b = v;
                return true;
            }
        }
        a<V>[] aVarArr = this.a;
        aVarArr[i] = new a<>(type, v, identityHashCode, aVarArr[i]);
        return false;
    }
}
