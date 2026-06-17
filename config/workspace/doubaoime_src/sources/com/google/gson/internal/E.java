package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class E extends G {
    final /* synthetic */ Method b;

    E(Method method) {
        this.b = method;
    }

    @Override // com.google.gson.internal.G
    public <T> T b(Class<T> cls) throws Exception {
        G.a(cls);
        return (T) this.b.invoke(null, cls, Object.class);
    }
}
