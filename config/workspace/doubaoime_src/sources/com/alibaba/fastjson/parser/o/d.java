package com.alibaba.fastjson.parser.o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {
    public final com.alibaba.fastjson.h.a a;
    protected Enum[] b;

    /* renamed from: c, reason: collision with root package name */
    protected long[] f1511c;

    public d(Class cls, com.alibaba.fastjson.h.a aVar) {
        this.a = aVar;
        if (aVar == null) {
            return;
        }
        Class<?> cls2 = aVar.f1474g;
        if (cls2.isEnum()) {
            Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
            int length = enumArr.length;
            long[] jArr = new long[length];
            this.f1511c = new long[enumArr.length];
            for (int i = 0; i < enumArr.length; i++) {
                long j = -2128831035;
                for (int i2 = 0; i2 < enumArr[i].name().length(); i2++) {
                    j = (j ^ r3.charAt(i2)) * 16777619;
                }
                jArr[i] = j;
                this.f1511c[i] = j;
            }
            Arrays.sort(this.f1511c);
            this.b = new Enum[enumArr.length];
            for (int i3 = 0; i3 < this.f1511c.length; i3++) {
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (this.f1511c[i3] == jArr[i4]) {
                        this.b[i3] = enumArr[i4];
                        break;
                    }
                    i4++;
                }
            }
        }
    }

    public Enum a(long j) {
        int binarySearch;
        if (this.b == null || (binarySearch = Arrays.binarySearch(this.f1511c, j)) == -1) {
            return null;
        }
        return this.b[binarySearch];
    }

    public abstract void b(com.alibaba.fastjson.parser.b bVar, Object obj, Type type, Map<String, Object> map);

    public void c(Object obj, double d2) throws IllegalAccessException {
        this.a.f1470c.setDouble(obj, d2);
    }

    public void d(Object obj, float f2) throws IllegalAccessException {
        this.a.f1470c.setFloat(obj, f2);
    }

    public void e(Object obj, int i) throws IllegalAccessException {
        this.a.f1470c.setInt(obj, i);
    }

    public void f(Object obj, long j) throws IllegalAccessException {
        this.a.f1470c.setLong(obj, j);
    }

    public void g(Object obj, Object obj2) {
        if (obj2 == null && this.a.f1474g.isPrimitive()) {
            return;
        }
        com.alibaba.fastjson.h.a aVar = this.a;
        Field field = aVar.f1470c;
        Method method = aVar.b;
        try {
            if (aVar.f1471d) {
                if (!aVar.j) {
                    field.set(obj, obj2);
                    return;
                }
                if (Map.class.isAssignableFrom(aVar.f1474g)) {
                    Map map = (Map) field.get(obj);
                    if (map != null) {
                        map.putAll((Map) obj2);
                        return;
                    }
                    return;
                }
                Collection collection = (Collection) field.get(obj);
                if (collection != null) {
                    collection.addAll((Collection) obj2);
                    return;
                }
                return;
            }
            if (!aVar.j) {
                method.invoke(obj, obj2);
                return;
            }
            if (Map.class.isAssignableFrom(aVar.f1474g)) {
                Map map2 = (Map) method.invoke(obj, new Object[0]);
                if (map2 != null) {
                    map2.putAll((Map) obj2);
                    return;
                }
                return;
            }
            Collection collection2 = (Collection) method.invoke(obj, new Object[0]);
            if (collection2 != null) {
                collection2.addAll((Collection) obj2);
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("set property error, ");
            M.append(this.a.a);
            throw new com.alibaba.fastjson.d(M.toString(), e2);
        }
    }
}
