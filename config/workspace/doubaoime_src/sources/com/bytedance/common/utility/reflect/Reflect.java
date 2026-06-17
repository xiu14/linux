package com.bytedance.common.utility.reflect;

import android.annotation.SuppressLint;
import android.util.Log;
import com.bytedance.common.utility.Logger;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class Reflect {
    public static String TAG = "utility-Reflect";
    private final boolean isClass = true;
    private final Object object;

    class a implements InvocationHandler {
        final /* synthetic */ boolean a;

        a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                return Reflect.on(Reflect.this.object).call(name, Reflect.types(objArr), objArr).get();
            } catch (com.bytedance.common.utility.reflect.b e2) {
                if (this.a) {
                    Map map = (Map) Reflect.this.object;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith(MonitorConstants.CONNECT_TYPE_GET)) {
                        return map.get(Reflect.property(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith("is")) {
                        return map.get(Reflect.property(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(Reflect.property(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e2;
            }
        }
    }

    public static class b {
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    private Field field0(String str, Class<?>... clsArr) throws com.bytedance.common.utility.reflect.b {
        Class<?> type = type();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return type.getField(str);
            } catch (NoSuchFieldException e2) {
                do {
                    try {
                        return (Field) accessible(type.getDeclaredField(str));
                    } catch (NoSuchFieldException e3) {
                        Log.e(TAG, e3.toString());
                        type = type.getSuperclass();
                        if (type == null) {
                            throw new com.bytedance.common.utility.reflect.b(e2);
                        }
                    }
                } while (type == null);
                throw new com.bytedance.common.utility.reflect.b(e2);
            }
        }
        do {
            try {
                for (Field field : type.getDeclaredFields()) {
                    Class<?> type2 = field.getType();
                    if (type2 != null && type2.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                        return (Field) accessible(field);
                    }
                }
            } catch (Exception e4) {
                Log.e(TAG, e4.toString());
            }
            type = type.getSuperclass();
        } while (type != null);
        throw new com.bytedance.common.utility.reflect.b("NoSuchFieldException");
    }

    private static Class<?> forName(String str) throws com.bytedance.common.utility.reflect.b {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && match(method.getParameterTypes(), clsArr);
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != b.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public static Reflect on(String str) throws com.bytedance.common.utility.reflect.b {
        return on(forName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase(Locale.getDefault());
        }
        return str.substring(0, 1).toLowerCase(Locale.getDefault()) + str.substring(1);
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> type = type();
        for (Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : type.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        StringBuilder U = e.a.a.a.a.U("No similar method ", str, " with params ");
        U.append(Arrays.toString(clsArr));
        U.append(" could be found on type ");
        U.append(type());
        U.append(".");
        throw new NoSuchMethodException(U.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class<?>[] types(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? b.class : obj.getClass();
        }
        return clsArr;
    }

    private static Object unwrap(Object obj) {
        return obj instanceof Reflect ? ((Reflect) obj).get() : obj;
    }

    public static Class<?> wrapper(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    public <P> P as(Class<P> cls) {
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(this.object instanceof Map));
    }

    public Reflect call(String str) throws com.bytedance.common.utility.reflect.b {
        return call(str, null, new Object[0]);
    }

    public Reflect create() throws com.bytedance.common.utility.reflect.b {
        return create(new Object[0]);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public Field exactField(String str, Class<?>... clsArr) throws com.bytedance.common.utility.reflect.b {
        return field0(str, clsArr);
    }

    public Method exactMethod(String str, Class<?>[] clsArr, Object... objArr) throws NoSuchMethodException {
        Class<?> type = type();
        try {
            return type.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            Class<?> cls = type;
            do {
                try {
                    return cls.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException e2) {
                    e2.printStackTrace();
                    cls = cls.getSuperclass();
                }
            } while (cls != null);
            Class<?> type2 = type();
            for (Method method : type2.getMethods()) {
                if (str.equals(method.getName())) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (Logger.debug()) {
                        int i = 1;
                        for (Class<?> cls2 : parameterTypes) {
                            Logger.d("Plugin", "Reflect type = " + type2 + " method = " + str + " paramTypes " + i + " = " + cls2.getName());
                            i++;
                        }
                    }
                    if (parameterTypes != null && parameterTypes.length == clsArr.length) {
                        return method;
                    }
                }
            }
            throw new NoSuchMethodException();
        }
    }

    public Reflect field(String str, Class<?>... clsArr) throws com.bytedance.common.utility.reflect.b {
        try {
            return on(field0(str, clsArr).get(this.object));
        } catch (Exception e2) {
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }

    public Map<String, Reflect> fields() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> type = type();
        do {
            for (Field field : type.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    public <T> T get() {
        return (T) this.object;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public Reflect set(String str, Object obj) throws com.bytedance.common.utility.reflect.b {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e2) {
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        return this.isClass ? (Class) this.object : this.object.getClass();
    }

    public static Reflect on(Class<?> cls) {
        return new Reflect(cls);
    }

    public Reflect call(String str, Class<?>[] clsArr, Object... objArr) throws com.bytedance.common.utility.reflect.b {
        try {
            try {
                return on(exactMethod(str, clsArr, objArr), this.object, objArr);
            } catch (NoSuchMethodException unused) {
                return on(similarMethod(str, clsArr), this.object, objArr);
            }
        } catch (NoSuchMethodException e2) {
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }

    public Reflect create(Object... objArr) throws com.bytedance.common.utility.reflect.b {
        Class<?>[] types = types(objArr);
        try {
            return on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e2) {
            for (Constructor<?> constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), types)) {
                    return on(constructor, objArr);
                }
            }
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }

    public <T> T get(String str, Class<?>... clsArr) throws com.bytedance.common.utility.reflect.b {
        return (T) field(str, clsArr).get();
    }

    public static Reflect on(Object obj) {
        return new Reflect(obj);
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    private static Reflect on(Constructor<?> constructor, Object... objArr) throws com.bytedance.common.utility.reflect.b {
        try {
            return on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e2) {
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }

    private static Reflect on(Method method, Object obj, Object... objArr) throws com.bytedance.common.utility.reflect.b {
        try {
            accessible(method);
            if (method.getReturnType() == Void.TYPE) {
                method.invoke(obj, objArr);
                return on(obj);
            }
            return on(method.invoke(obj, objArr));
        } catch (Exception e2) {
            throw new com.bytedance.common.utility.reflect.b(e2);
        }
    }
}
