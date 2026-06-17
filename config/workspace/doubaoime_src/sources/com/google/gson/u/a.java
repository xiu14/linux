package com.google.gson.u;

import com.google.gson.internal.C0746a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a<T> {
    private final Class<? super T> a;
    private final Type b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6849c;

    protected a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type a = C0746a.a(parameterizedType.getActualTypeArguments()[0]);
                this.b = a;
                this.a = (Class<? super T>) C0746a.g(a);
                this.f6849c = a.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    public static a<?> c(Type type, Type... typeArr) {
        Class cls = (Class) type;
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        int length = typeParameters.length;
        int length2 = typeArr.length;
        if (length2 != length) {
            throw new IllegalArgumentException(cls.getName() + " requires " + length + " type arguments, but got " + length2);
        }
        for (int i = 0; i < length; i++) {
            Type type2 = typeArr[i];
            Class<?> g2 = C0746a.g(type2);
            TypeVariable<Class<T>> typeVariable = typeParameters[i];
            for (Type type3 : typeVariable.getBounds()) {
                if (!C0746a.g(type3).isAssignableFrom(g2)) {
                    throw new IllegalArgumentException("Type argument " + type2 + " does not satisfy bounds for type variable " + typeVariable + " declared by " + type);
                }
            }
        }
        return new a<>(C0746a.i(null, type, typeArr));
    }

    public final Class<? super T> d() {
        return this.a;
    }

    public final Type e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && C0746a.c(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.f6849c;
    }

    public final String toString() {
        return C0746a.l(this.b);
    }

    private a(Type type) {
        Objects.requireNonNull(type);
        Type a = C0746a.a(type);
        this.b = a;
        this.a = (Class<? super T>) C0746a.g(a);
        this.f6849c = a.hashCode();
    }
}
