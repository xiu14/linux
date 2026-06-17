package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class o<T> implements w<T> {
    final /* synthetic */ Type a;

    o(Type type) {
        this.a = type;
    }

    @Override // com.google.gson.internal.w
    public T a() {
        Type type = this.a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder M = e.a.a.a.a.M("Invalid EnumMap type: ");
            M.append(this.a.toString());
            throw new com.google.gson.j(M.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return (T) new EnumMap((Class) type2);
        }
        StringBuilder M2 = e.a.a.a.a.M("Invalid EnumMap type: ");
        M2.append(this.a.toString());
        throw new com.google.gson.j(M2.toString());
    }
}
