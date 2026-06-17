package e.b.l.q;

import android.util.Log;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e {
    private static Map<String, Class<?>> a = new e.b.l.q.a(8, 16);
    public static final /* synthetic */ int b = 0;

    private static final class a implements ParameterizedType, Serializable {
        private final Type a;
        private final Type b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f9653c;

        public a(Type type, Type type2, Type... typeArr) {
            this.a = type == null ? null : e.f(type);
            this.b = e.f(type2);
            this.f9653c = (Type[]) typeArr.clone();
            int i = 0;
            while (true) {
                Type[] typeArr2 = this.f9653c;
                if (i >= typeArr2.length) {
                    return;
                }
                typeArr2[i] = e.f(typeArr2[i]);
                i++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && e.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f9653c.clone();
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
            return (Arrays.hashCode(this.f9653c) ^ this.b.hashCode()) ^ Objects.hashCode(this.a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((this.f9653c.length + 1) * 30);
            sb.append(e.g(this.b));
            if (this.f9653c.length == 0) {
                return sb.toString();
            }
            sb.append("<");
            sb.append(e.g(this.f9653c[0]));
            for (int i = 1; i < this.f9653c.length; i++) {
                sb.append(", ");
                sb.append(e.g(this.f9653c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static Class<?> a(String str) {
        Class<?> cls;
        Class<?> cls2;
        if (!(!c.b(str))) {
            return null;
        }
        if (a.containsKey(str) && (cls2 = a.get(str)) != null) {
            return cls2;
        }
        synchronized (a) {
            cls = a.get(str);
            Log.i("TypeUtils", cls == null ? "null" : cls.toString());
            if (cls == null && !a.containsKey(str)) {
                try {
                    cls = Class.forName(str);
                } catch (ClassNotFoundException e2) {
                    e2.printStackTrace();
                }
                a.put(str, cls);
            }
        }
        return cls;
    }

    public static boolean b(String str, Class<?> cls) {
        if (cls == null) {
            return false;
        }
        Class<?> a2 = a(str);
        return a2 == null ? !c.b(str) && str.equals(cls.toString()) : a2.isAssignableFrom(cls);
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

    public static Class<?> d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
        } else {
            if (type instanceof GenericArrayType) {
                return Array.newInstance(d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return d(((WildcardType) type).getUpperBounds()[0]);
            }
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Object e(String str) {
        Class<?> a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            return a2.newInstance();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Type f(Type type) {
        if (!(type instanceof ParameterizedType) || (type instanceof a)) {
            return type;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        return new a(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
    }

    public static String g(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
