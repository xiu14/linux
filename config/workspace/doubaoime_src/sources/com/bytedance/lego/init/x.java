package com.bytedance.lego.init;

/* loaded from: classes.dex */
public final class x implements h {
    private static h a;
    public static final x b = new x();

    private x() {
    }

    public <T> T a(Class<T> cls) {
        kotlin.s.c.l.g(cls, "clazz");
        h hVar = a;
        return hVar != null ? (T) ((x) hVar).a(cls) : (T) com.bytedance.news.common.service.manager.c.a(cls);
    }

    public final void b(h hVar) {
        a = hVar;
    }
}
