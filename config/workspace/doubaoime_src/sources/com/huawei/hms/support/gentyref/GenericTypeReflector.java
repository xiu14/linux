package com.huawei.hms.support.gentyref;

import e.a.a.a.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
public final class GenericTypeReflector {
    private GenericTypeReflector() {
    }

    public static Class<?> getType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            return typeVariable.getBounds().length == 0 ? Object.class : getType(typeVariable.getBounds()[0]);
        }
        StringBuilder M = a.M("not supported: ");
        M.append(type.getClass());
        throw new IllegalArgumentException(M.toString());
    }
}
