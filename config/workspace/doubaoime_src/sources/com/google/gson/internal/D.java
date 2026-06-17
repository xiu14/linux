package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class D extends G {
    final /* synthetic */ Method b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f6777c;

    D(Method method, int i) {
        this.b = method;
        this.f6777c = i;
    }

    @Override // com.google.gson.internal.G
    public <T> T b(Class<T> cls) throws Exception {
        G.a(cls);
        return (T) this.b.invoke(null, cls, Integer.valueOf(this.f6777c));
    }
}
