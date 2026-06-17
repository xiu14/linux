package com.alibaba.fastjson.h;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements ParameterizedType {
    private final Type[] a;
    private final Type b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f1476c;

    public c(Type[] typeArr, Type type, Type type2) {
        this.a = typeArr;
        this.b = type;
        this.f1476c = type2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (!Arrays.equals(this.a, cVar.a)) {
            return false;
        }
        Type type = this.b;
        if (type == null ? cVar.b != null : !type.equals(cVar.b)) {
            return false;
        }
        Type type2 = this.f1476c;
        Type type3 = cVar.f1476c;
        return type2 != null ? type2.equals(type3) : type3 == null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f1476c;
    }

    public int hashCode() {
        Type[] typeArr = this.a;
        int hashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.b;
        int hashCode2 = (hashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f1476c;
        return hashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
