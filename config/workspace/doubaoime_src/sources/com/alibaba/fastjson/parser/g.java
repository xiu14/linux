package com.alibaba.fastjson.parser;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* loaded from: classes.dex */
class g implements com.alibaba.fastjson.parser.o.f {
    public static final g a = new g();

    g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(b bVar, Type type, Object obj) {
        if (!(type instanceof GenericArrayType)) {
            return (T) bVar.w(obj);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        if (genericComponentType instanceof TypeVariable) {
            genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
        }
        ArrayList arrayList = new ArrayList();
        bVar.x(genericComponentType, arrayList, null);
        if (!(genericComponentType instanceof Class)) {
            return (T) arrayList.toArray();
        }
        T t = (T) ((Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size()));
        arrayList.toArray((Object[]) t);
        return t;
    }
}
