package com.google.gson.internal.H;

import com.google.gson.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a {
    private static final b a;
    public static final /* synthetic */ int b = 0;

    private static abstract class b {
        b(C0334a c0334a) {
        }

        public abstract Method a(Class<?> cls, Field field);

        abstract <T> Constructor<T> b(Class<T> cls);

        abstract String[] c(Class<?> cls);

        abstract boolean d(Class<?> cls);
    }

    private static class c extends b {
        c(C0334a c0334a) {
            super(null);
        }

        @Override // com.google.gson.internal.H.a.b
        public Method a(Class<?> cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.H.a.b
        <T> Constructor<T> b(Class<T> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.H.a.b
        String[] c(Class<?> cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.H.a.b
        boolean d(Class<?> cls) {
            return false;
        }
    }

    private static class d extends b {
        private final Method a;
        private final Method b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f6786c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f6787d;

        d(C0334a c0334a) throws NoSuchMethodException {
            super(null);
            this.a = Class.class.getMethod("isRecord", new Class[0]);
            Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
            this.b = method;
            Class<?> componentType = method.getReturnType().getComponentType();
            this.f6786c = componentType.getMethod("getName", new Class[0]);
            this.f6787d = componentType.getMethod("getType", new Class[0]);
        }

        @Override // com.google.gson.internal.H.a.b
        public Method a(Class<?> cls, Field field) {
            try {
                return cls.getMethod(field.getName(), new Class[0]);
            } catch (ReflectiveOperationException e2) {
                a.a(e2);
                throw null;
            }
        }

        @Override // com.google.gson.internal.H.a.b
        public <T> Constructor<T> b(Class<T> cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, new Object[0]);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.f6787d.invoke(objArr[i], new Object[0]);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e2) {
                a.a(e2);
                throw null;
            }
        }

        @Override // com.google.gson.internal.H.a.b
        String[] c(Class<?> cls) {
            try {
                Object[] objArr = (Object[]) this.b.invoke(cls, new Object[0]);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.f6786c.invoke(objArr[i], new Object[0]);
                }
                return strArr;
            } catch (ReflectiveOperationException e2) {
                a.a(e2);
                throw null;
            }
        }

        @Override // com.google.gson.internal.H.a.b
        boolean d(Class<?> cls) {
            try {
                return ((Boolean) this.a.invoke(cls, new Object[0])).booleanValue();
            } catch (ReflectiveOperationException e2) {
                a.a(e2);
                throw null;
            }
        }
    }

    static {
        b cVar;
        try {
            cVar = new d(null);
        } catch (NoSuchMethodException unused) {
            cVar = new c(null);
        }
        a = cVar;
    }

    static RuntimeException a(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    private static void b(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String c(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        b(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException d(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String e(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String f(AccessibleObject accessibleObject, boolean z) {
        String sb;
        if (accessibleObject instanceof Field) {
            StringBuilder M = e.a.a.a.a.M("field '");
            M.append(e((Field) accessibleObject));
            M.append("'");
            sb = M.toString();
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            b(method, sb2);
            String sb3 = sb2.toString();
            StringBuilder M2 = e.a.a.a.a.M("method '");
            M2.append(method.getDeclaringClass().getName());
            M2.append("#");
            M2.append(sb3);
            M2.append("'");
            sb = M2.toString();
        } else if (accessibleObject instanceof Constructor) {
            StringBuilder M3 = e.a.a.a.a.M("constructor '");
            M3.append(c((Constructor) accessibleObject));
            M3.append("'");
            sb = M3.toString();
        } else {
            StringBuilder M4 = e.a.a.a.a.M("<unknown AccessibleObject> ");
            M4.append(accessibleObject.toString());
            sb = M4.toString();
        }
        if (!z || !Character.isLowerCase(sb.charAt(0))) {
            return sb;
        }
        return Character.toUpperCase(sb.charAt(0)) + sb.substring(1);
    }

    public static Method g(Class<?> cls, Field field) {
        return a.a(cls, field);
    }

    public static <T> Constructor<T> h(Class<T> cls) {
        return a.b(cls);
    }

    public static String[] i(Class<?> cls) {
        return a.c(cls);
    }

    public static boolean j(Class<?> cls) {
        return a.d(cls);
    }

    public static void k(AccessibleObject accessibleObject) throws j {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            throw new j(e.a.a.a.a.t("Failed making ", f(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e2);
        }
    }
}
