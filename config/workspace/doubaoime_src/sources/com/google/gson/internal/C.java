package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class C extends G {
    final /* synthetic */ Method b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f6776c;

    C(Method method, Object obj) {
        this.b = method;
        this.f6776c = obj;
    }

    @Override // com.google.gson.internal.G
    public <T> T b(Class<T> cls) throws Exception {
        G.a(cls);
        return (T) this.b.invoke(this.f6776c, cls);
    }
}
