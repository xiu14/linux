package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class n<T> implements w<T> {
    final /* synthetic */ Type a;

    n(Type type) {
        this.a = type;
    }

    @Override // com.google.gson.internal.w
    public T a() {
        Type type = this.a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder M = e.a.a.a.a.M("Invalid EnumSet type: ");
            M.append(this.a.toString());
            throw new com.google.gson.j(M.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) EnumSet.noneOf((Class) type2);
        }
        StringBuilder M2 = e.a.a.a.a.M("Invalid EnumSet type: ");
        M2.append(this.a.toString());
        throw new com.google.gson.j(M2.toString());
    }
}
