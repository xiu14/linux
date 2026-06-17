package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* renamed from: com.google.gson.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0746a {
    static final Type[] a = new Type[0];

    /* renamed from: com.google.gson.internal.a$a, reason: collision with other inner class name */
    private static final class C0335a implements GenericArrayType, Serializable {
        private final Type a;

        public C0335a(Type type) {
            Objects.requireNonNull(type);
            this.a = C0746a.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0746a.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return C0746a.l(this.a) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.a$b */
    private static final class b implements ParameterizedType, Serializable {
        private final Type a;
        private final Type b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f6788c;

        public b(Type type, Type type2, Type... typeArr) {
            Objects.requireNonNull(type2);
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.bytedance.feedbackerlib.a.h(z);
            }
            this.a = type == null ? null : C0746a.a(type);
            this.b = C0746a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f6788c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                Objects.requireNonNull(this.f6788c[i]);
                C0746a.b(this.f6788c[i]);
                Type[] typeArr3 = this.f6788c;
                typeArr3[i] = C0746a.a(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0746a.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f6788c.clone();
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
            int hashCode = Arrays.hashCode(this.f6788c) ^ this.b.hashCode();
            Type type = this.a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f6788c.length;
            if (length == 0) {
                return C0746a.l(this.b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C0746a.l(this.b));
            sb.append("<");
            sb.append(C0746a.l(this.f6788c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C0746a.l(this.f6788c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.a$c */
    private static final class c implements WildcardType, Serializable {
        private final Type a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            com.bytedance.feedbackerlib.a.h(typeArr2.length <= 1);
            com.bytedance.feedbackerlib.a.h(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                C0746a.b(typeArr[0]);
                this.b = null;
                this.a = C0746a.a(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            C0746a.b(typeArr2[0]);
            com.bytedance.feedbackerlib.a.h(typeArr[0] == Object.class);
            this.b = C0746a.a(typeArr2[0]);
            this.a = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0746a.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : C0746a.a;
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
                M.append(C0746a.l(this.b));
                return M.toString();
            }
            if (this.a == Object.class) {
                return "?";
            }
            StringBuilder M2 = e.a.a.a.a.M("? extends ");
            M2.append(C0746a.l(this.a));
            return M2.toString();
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0335a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0335a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void b(Type type) {
        com.bytedance.feedbackerlib.a.h(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static boolean c(Type type, Type type2) {
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
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
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

    public static Type d(Type type, Class<?> cls) {
        Type h = h(type, cls, Collection.class);
        return h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments()[0] : Object.class;
    }

    private static Type e(Type type, Class<?> cls, Class<?> cls2) {
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

    public static Type[] f(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type h = h(type, cls, Map.class);
        return h instanceof ParameterizedType ? ((ParameterizedType) h).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            com.bytedance.feedbackerlib.a.h(rawType instanceof Class);
            return (Class) rawType;
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
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    private static Type h(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.bytedance.feedbackerlib.a.h(cls2.isAssignableFrom(cls));
        return j(type, cls, e(type, cls, cls2));
    }

    public static ParameterizedType i(Type type, Type type2, Type... typeArr) {
        return new b(null, type2, typeArr);
    }

    public static Type j(Type type, Class<?> cls, Type type2) {
        return k(type, cls, type2, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.gson.internal.a$c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.gson.internal.a$c] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type k(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C0746a.k(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static String l(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
