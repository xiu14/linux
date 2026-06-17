package com.bytedance.android.input.basic.b;

import com.ss.android.message.log.PushLog;
import kotlin.reflect.i;
import kotlin.s.c.l;
import kotlin.u.b;

/* loaded from: classes.dex */
public final class a<T> implements b<Object, T> {
    private final T a;
    private T b;

    public a(T t) {
        l.f(t, "defaultValue");
        this.a = t;
    }

    @Override // kotlin.u.b
    public void a(Object obj, i<?> iVar, T t) {
        l.f(iVar, "property");
        l.f(t, PushLog.KEY_VALUE);
        this.b = t;
    }

    public Object b(i iVar) {
        l.f(iVar, "property");
        T t = this.b;
        return t == null ? this.a : t;
    }
}
