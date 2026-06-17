package com.bytedance.rpc.rxjava;

import e.b.l.m;
import e.b.l.q.e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class c extends m {
    c(m mVar) {
        super(mVar);
        Type[] actualTypeArguments;
        Type type = this.f9639f;
        Type type2 = null;
        if ((type instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments()) != null && actualTypeArguments.length != 0) {
            type2 = e.f(actualTypeArguments[0]);
        }
        this.f9640g = type2;
        this.f9639f = type2;
    }
}
