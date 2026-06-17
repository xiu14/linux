package com.bytedance.retrofit2;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class P {
    static final Type[] a = new Type[0];

    class a implements com.bytedance.retrofit2.mime.i {
        final /* synthetic */ okhttp3.A a;

        a(okhttp3.A a) {
            this.a = a;
        }

        @Override // com.bytedance.retrofit2.mime.i
        public String a() {
            return this.a.b() != null ? this.a.b().toString() : "";
        }

        @Override // com.bytedance.retrofit2.mime.i
        public void b(OutputStream outputStream) throws IOException {
            f.x c2 = f.o.c(outputStream);
            kotlin.s.c.l.g(c2, "$receiver");
            f.s sVar = new f.s(c2);
            this.a.e(sVar);
            sVar.flush();
            sVar.close();
        }

        @Override // com.bytedance.retrofit2.mime.i
        public String c() {
            return null;
        }

        @Override // com.bytedance.retrofit2.mime.i
        public String e() {
            return null;
        }

        @Override // com.bytedance.retrofit2.mime.i
        public long length() {
            try {
                return this.a.a();
            } catch (Throwable th) {
                th.printStackTrace();
                return -1L;
            }
        }
    }

    private static final class b implements GenericArrayType {
        private final Type a;

        public b(Type type) {
            this.a = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && P.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return e.a.a.a.a.J(new StringBuilder(), P.q(this.a), "[]");
        }
    }

    static final class c implements ParameterizedType {
        private final Type a;
        private final Type b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f5988c;

        c(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            this.a = type;
            this.b = type2;
            this.f5988c = (Type[]) typeArr.clone();
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                P.a(type3);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && P.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f5988c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.b;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f5988c) ^ this.b.hashCode();
            Type type = this.a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f5988c.length + 1) * 30);
            sb.append(P.q(this.b));
            if (this.f5988c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(P.q(this.f5988c[0]));
            for (int i = 1; i < this.f5988c.length; i++) {
                sb.append(", ");
                sb.append(P.q(this.f5988c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    private static final class d implements WildcardType {
        private final Type a;
        private final Type b;

        d(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                P.a(typeArr[0]);
                this.b = null;
                this.a = typeArr[0];
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            P.a(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.b = typeArr2[0];
            this.a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && P.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : P.a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.a};
        }

        public int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
        }

        public String toString() {
            if (this.b != null) {
                StringBuilder M = e.a.a.a.a.M("? super ");
                M.append(P.q(this.b));
                return M.toString();
            }
            if (this.a == Object.class) {
                return "?";
            }
            StringBuilder M2 = e.a.a.a.a.M("? extends ");
            M2.append(P.q(this.a));
            return M2.toString();
        }
    }

    static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static com.bytedance.retrofit2.mime.i b(okhttp3.A a2) {
        return new a(a2);
    }

    static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static Type d(Type type) {
        if (type instanceof ParameterizedType) {
            return f(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    static Type e(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return e(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static Type f(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder N = e.a.a.a.a.N("Index ", i, " not in range [0,");
        N.append(actualTypeArguments.length);
        N.append(") for ");
        N.append(parameterizedType);
        throw new IllegalArgumentException(N.toString());
    }

    static Class<?> g(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    static Type h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return p(type, cls, e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static boolean i(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (i(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return i(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    static boolean j(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    static RuntimeException k(Method method, String str, Object... objArr) {
        return l(method, null, str, objArr);
    }

    static RuntimeException l(Method method, Throwable th, String str, Object... objArr) {
        StringBuilder S = e.a.a.a.a.S(String.format(str, objArr), "\n    for method ");
        S.append(method.getDeclaringClass().getSimpleName());
        S.append(".");
        S.append(method.getName());
        return new IllegalArgumentException(S.toString(), th);
    }

    static RuntimeException m(Method method, int i, String str, Object... objArr) {
        StringBuilder S = e.a.a.a.a.S(str, " (parameter #");
        S.append(i + 1);
        S.append(")");
        return k(method, S.toString(), objArr);
    }

    static RuntimeException n(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder S = e.a.a.a.a.S(str, " (parameter #");
        S.append(i + 1);
        S.append(")");
        return l(method, th, S.toString(), objArr);
    }

    public static boolean o(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0043 A[LOOP:0: B:1:0x0000->B:9:0x0043, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.reflect.Type p(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.P.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    static String q(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
