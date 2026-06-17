package com.alibaba.fastjson.h;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.e;
import com.alibaba.fastjson.parser.k;
import com.alibaba.fastjson.parser.o.f;
import com.huawei.hms.framework.common.BundleUtil;
import com.vivo.push.PushClient;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public class d {
    private static boolean a = true;
    private static ConcurrentMap<String, Class<?>> b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1477c = 0;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        b = concurrentHashMap;
        concurrentHashMap.put("byte", Byte.TYPE);
        b.put("short", Short.TYPE);
        b.put("int", Integer.TYPE);
        b.put("long", Long.TYPE);
        b.put(TypedValues.Custom.S_FLOAT, Float.TYPE);
        b.put("double", Double.TYPE);
        b.put(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        b.put("char", Character.TYPE);
        b.put("[byte", byte[].class);
        b.put("[short", short[].class);
        b.put("[int", int[].class);
        b.put("[long", long[].class);
        b.put("[float", float[].class);
        b.put("[double", double[].class);
        b.put("[boolean", boolean[].class);
        b.put("[char", char[].class);
        b.put("[B", byte[].class);
        b.put("[S", short[].class);
        b.put("[I", int[].class);
        b.put("[J", long[].class);
        b.put("[F", float[].class);
        b.put("[D", double[].class);
        b.put("[C", char[].class);
        b.put("[Z", boolean[].class);
        b.put(HashMap.class.getName(), HashMap.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T a(Object obj, Class<T> cls, k kVar) {
        Object obj2;
        if (obj == 0) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls == obj.getClass()) {
            return obj;
        }
        if (obj instanceof Map) {
            if (cls == Map.class) {
                return obj;
            }
            Map map = (Map) obj;
            return (cls != Object.class || map.containsKey("@type")) ? (T) k(map, cls, kVar) : obj;
        }
        int i = 0;
        if (cls.isArray()) {
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                T t = (T) Array.newInstance(cls.getComponentType(), collection.size());
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    Array.set(t, i, a(it2.next(), cls.getComponentType(), kVar));
                    i++;
                }
                return t;
            }
            if (cls == byte[].class) {
                if (obj instanceof byte[]) {
                    return (T) ((byte[]) obj);
                }
                if (!(obj instanceof String)) {
                    throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to int, value : ", obj));
                }
                String str = (String) obj;
                return (T) com.alibaba.fastjson.parser.d.h(str, 0, str.length());
            }
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return (T) e(obj);
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return (T) f(obj);
        }
        if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
            String str2 = (String) obj;
            if (str2.length() == 1) {
                return (T) Character.valueOf(str2.charAt(0));
            }
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return (T) m(obj);
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return (T) j(obj);
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return (T) l(obj);
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return (T) i(obj);
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return (T) h(obj);
        }
        if (cls == String.class) {
            return (T) obj.toString();
        }
        if (cls == BigDecimal.class) {
            return (T) c(obj);
        }
        if (cls == BigInteger.class) {
            return (T) d(obj);
        }
        if (cls == Date.class) {
            return (T) g(obj);
        }
        if (cls.isEnum()) {
            try {
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    if (str3.length() == 0) {
                        return null;
                    }
                    return (T) Enum.valueOf(cls, str3);
                }
                if (obj instanceof Number) {
                    int intValue = ((Number) obj).intValue();
                    T[] enumConstants = cls.getEnumConstants();
                    if (intValue < enumConstants.length) {
                        return enumConstants[intValue];
                    }
                }
                StringBuilder M = e.a.a.a.a.M("can not cast to : ");
                M.append(cls.getName());
                throw new com.alibaba.fastjson.d(M.toString());
            } catch (Exception e2) {
                StringBuilder M2 = e.a.a.a.a.M("can not cast to : ");
                M2.append(cls.getName());
                throw new com.alibaba.fastjson.d(M2.toString(), e2);
            }
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            Date g2 = g(obj);
            if (cls == Calendar.class) {
                obj2 = (T) Calendar.getInstance(com.alibaba.fastjson.a.a, com.alibaba.fastjson.a.b);
            } else {
                try {
                    obj2 = (T) ((Calendar) cls.newInstance());
                } catch (Exception e3) {
                    StringBuilder M3 = e.a.a.a.a.M("can not cast to : ");
                    M3.append(cls.getName());
                    throw new com.alibaba.fastjson.d(M3.toString(), e3);
                }
            }
            ((Calendar) obj2).setTime(g2);
            return (T) obj2;
        }
        if (obj instanceof String) {
            String str4 = (String) obj;
            if (str4.length() == 0 || "null".equals(str4)) {
                return null;
            }
            if (cls == Currency.class) {
                return (T) Currency.getInstance(str4);
            }
        }
        StringBuilder M4 = e.a.a.a.a.M("can not cast to : ");
        M4.append(cls.getName());
        throw new com.alibaba.fastjson.d(M4.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.HashMap] */
    public static final <T> T b(Object obj, Type type, k kVar) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) a(obj, (Class) type, kVar);
        }
        if (!(type instanceof ParameterizedType)) {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0 || "null".equals(str)) {
                    return null;
                }
            }
            if (type instanceof TypeVariable) {
                return obj;
            }
            throw new com.alibaba.fastjson.d(e.a.a.a.a.y("can not cast to : ", type));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                ?? r0 = (T) ((rawType == Set.class || rawType == HashSet.class) ? new HashSet() : rawType == TreeSet.class ? new TreeSet() : new ArrayList());
                Iterator<T> it2 = ((Iterable) obj).iterator();
                while (it2.hasNext()) {
                    r0.add(b(it2.next(), type2, kVar));
                }
                return r0;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r02 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r02.put(b(entry.getKey(), type3, kVar), b(entry.getValue(), type4, kVar));
                }
                return r02;
            }
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() == 0 || "null".equals(str2)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) b(obj, rawType, kVar);
        }
        throw new com.alibaba.fastjson.d("can not cast to : " + parameterizedType);
    }

    public static final BigDecimal c(Object obj) {
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return new BigDecimal(obj2);
    }

    public static final BigInteger d(Object obj) {
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return new BigInteger(obj2);
    }

    public static final Boolean e(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || PushClient.DEFAULT_REQUEST_ID.equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to int, value : ", obj));
    }

    public static final Byte f(Object obj) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to byte, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    public static final Date g(Object obj) {
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        long longValue = obj instanceof Number ? ((Number) obj).longValue() : -1L;
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(45) != -1) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str.length() == com.alibaba.fastjson.a.f1465d.length() ? com.alibaba.fastjson.a.f1465d : str.length() == 10 ? "yyyy-MM-dd" : str.length() == 19 ? "yyyy-MM-dd HH:mm:ss" : "yyyy-MM-dd HH:mm:ss.SSS", com.alibaba.fastjson.a.b);
                simpleDateFormat.setTimeZone(com.alibaba.fastjson.a.a);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new com.alibaba.fastjson.d(e.a.a.a.a.s("can not cast to Date, value : ", str));
                }
            }
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            longValue = Long.parseLong(str);
        }
        if (longValue >= 0) {
            return new Date(longValue);
        }
        throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to Date, value : ", obj));
    }

    public static final Double h(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to double, value : ", obj));
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(obj2));
    }

    public static final Float i(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to float, value : ", obj));
        }
        String obj2 = obj.toString();
        if (obj2.length() == 0 || "null".equals(obj2)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(obj2));
    }

    public static final Integer j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to int, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    public static final <T> T k(Map<String, Object> map, Class<T> cls, k kVar) {
        int i = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get(PushClientConstants.TAG_CLASS_NAME);
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    i = number.intValue();
                }
                return (T) new StackTraceElement(str, str2, str3, i);
            }
            Object obj = map.get("@type");
            if (obj instanceof String) {
                String str4 = (String) obj;
                Class<?> x = x(str4, null);
                if (x == null) {
                    throw new ClassNotFoundException(str4 + " not found");
                }
                if (!x.equals(cls)) {
                    return (T) k(map, x, kVar);
                }
            }
            if (cls.isInterface()) {
                e eVar = map instanceof e ? (e) map : new e(map);
                if (kVar == null) {
                    kVar = k.f1505c;
                }
                return kVar.b(cls) != null ? (T) com.alibaba.fastjson.a.c(com.alibaba.fastjson.a.d(eVar), cls) : (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, eVar);
            }
            if (cls == String.class && (map instanceof e)) {
                return (T) map.toString();
            }
            if (kVar == null) {
                kVar = k.f1505c;
            }
            f b2 = kVar.b(cls);
            com.alibaba.fastjson.parser.e eVar2 = b2 instanceof com.alibaba.fastjson.parser.e ? (com.alibaba.fastjson.parser.e) b2 : null;
            if (eVar2 != null) {
                return (T) eVar2.c(map, kVar);
            }
            throw new com.alibaba.fastjson.d("can not get javaBeanDeserializer");
        } catch (Exception e2) {
            throw new com.alibaba.fastjson.d(e2.getMessage(), e2);
        }
    }

    public static final Long l(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                com.alibaba.fastjson.parser.d dVar = new com.alibaba.fastjson.parser.d(str, com.alibaba.fastjson.a.f1464c);
                Calendar calendar = dVar.I(false) ? dVar.n : null;
                dVar.e();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to long, value : ", obj));
    }

    public static final Short m(Object obj) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.q("can not cast to short, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.alibaba.fastjson.h.a> n(java.lang.Class<?> r30, int r31, boolean r32, com.alibaba.fastjson.g.c r33, java.util.Map<java.lang.String, java.lang.String> r34, boolean r35, boolean r36, boolean r37, com.alibaba.fastjson.PropertyNamingStrategy r38) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.h.d.n(java.lang.Class, int, boolean, com.alibaba.fastjson.g.c, java.util.Map, boolean, boolean, boolean, com.alibaba.fastjson.PropertyNamingStrategy):java.util.List");
    }

    public static String o(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static Class<?> p(Type type) {
        return type.getClass() == Class.class ? (Class) type : type instanceof ParameterizedType ? p(((ParameterizedType) type).getRawType()) : type instanceof TypeVariable ? (Class) ((TypeVariable) type).getBounds()[0] : Object.class;
    }

    public static Type q(Type type) {
        Type type2;
        if (type instanceof ParameterizedType) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                if (upperBounds.length == 1) {
                    type2 = upperBounds[0];
                }
            }
        } else {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (!cls.getName().startsWith("java.")) {
                    type2 = q(cls.getGenericSuperclass());
                }
            }
            type2 = null;
        }
        return type2 == null ? Object.class : type2;
    }

    public static Field r(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        Field s = s(cls, str, fieldArr, map);
        if (s == null) {
            s = s(cls, e.a.a.a.a.s(BundleUtil.UNDERLINE_TAG, str), fieldArr, map);
        }
        if (s == null) {
            s = s(cls, e.a.a.a.a.s("m_", str), fieldArr, map);
        }
        if (s != null) {
            return s;
        }
        StringBuilder M = e.a.a.a.a.M("m");
        M.append(str.substring(0, 1).toUpperCase());
        M.append(str.substring(1));
        return s(cls, M.toString(), fieldArr, map);
    }

    private static Field s(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        for (Field field : fieldArr) {
            if (str.equals(field.getName())) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        Field[] fieldArr2 = map != null ? map.get(superclass) : null;
        if (fieldArr2 == null) {
            fieldArr2 = superclass.getDeclaredFields();
            if (map != null) {
                map.put(superclass, fieldArr2);
            }
        }
        return r(superclass, str, fieldArr2, map);
    }

    public static Type t(Type type) {
        return type instanceof Class ? t(((Class) type).getGenericSuperclass()) : type;
    }

    public static com.alibaba.fastjson.g.b u(Class<?> cls, Method method) {
        boolean z;
        com.alibaba.fastjson.g.b bVar;
        boolean z2;
        com.alibaba.fastjson.g.b bVar2;
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method2 : cls2.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length != parameterTypes2.length) {
                        continue;
                    } else {
                        int i = 0;
                        while (true) {
                            if (i >= parameterTypes.length) {
                                z2 = true;
                                break;
                            }
                            if (!parameterTypes[i].equals(parameterTypes2[i])) {
                                z2 = false;
                                break;
                            }
                            i++;
                        }
                        if (z2 && (bVar2 = (com.alibaba.fastjson.g.b) method2.getAnnotation(com.alibaba.fastjson.g.b.class)) != null) {
                            return bVar2;
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= parameterTypes3.length) {
                            z = true;
                            break;
                        }
                        if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (z && (bVar = (com.alibaba.fastjson.g.b) method3.getAnnotation(com.alibaba.fastjson.g.b.class)) != null) {
                        return bVar;
                    }
                }
            }
        }
        return null;
    }

    public static boolean v(Type type) {
        if (type instanceof ParameterizedType) {
            return true;
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Type genericSuperclass = ((Class) type).getGenericSuperclass();
        return genericSuperclass != Object.class && v(genericSuperclass);
    }

    private static boolean w(Class<?> cls, com.alibaba.fastjson.g.c cVar, String str) {
        if (cVar != null && cVar.ignores() != null) {
            for (String str2 : cVar.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !w(superclass, (com.alibaba.fastjson.g.c) superclass.getAnnotation(com.alibaba.fastjson.g.c.class), str)) ? false : true;
    }

    public static Class<?> x(String str, ClassLoader classLoader) {
        Exception e2;
        Class<?> cls;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.s("className too long. ", str));
        }
        Class<?> cls2 = b.get(str);
        if (cls2 != null) {
            return cls2;
        }
        if (str.charAt(0) == '[') {
            return Array.newInstance(x(str.substring(1), classLoader), 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(";")) {
            return x(str.substring(1, str.length() - 1), classLoader);
        }
        if (classLoader != null) {
            try {
                cls2 = classLoader.loadClass(str);
                b.put(str, cls2);
                return cls2;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null && contextClassLoader != classLoader) {
                cls = contextClassLoader.loadClass(str);
                try {
                    b.put(str, cls);
                    return cls;
                } catch (Exception e4) {
                    e2 = e4;
                    e2.printStackTrace();
                    cls2 = cls;
                    cls2 = Class.forName(str);
                    b.put(str, cls2);
                    return cls2;
                }
            }
        } catch (Exception e5) {
            Class<?> cls3 = cls2;
            e2 = e5;
            cls = cls3;
        }
        try {
            cls2 = Class.forName(str);
            b.put(str, cls2);
            return cls2;
        } catch (Exception e6) {
            e6.printStackTrace();
            return cls2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean y(Class<?> cls, Member member, int i) {
        if (member != 0 && a) {
            Class<? super Object> superclass = cls.getSuperclass();
            if ((superclass == null || superclass == Object.class) && (member.getModifiers() & 1) != 0 && (i & 1) != 0) {
                return false;
            }
            try {
                ((AccessibleObject) member).setAccessible(true);
                return true;
            } catch (AccessControlException unused) {
                a = false;
            }
        }
        return false;
    }
}
