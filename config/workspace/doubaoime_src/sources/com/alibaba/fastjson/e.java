package com.alibaba.fastjson;

import com.alibaba.fastjson.parser.k;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e extends a implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Object> f1469f;

    public e(Map<String, Object> map) {
        this.f1469f = map;
    }

    @Override // java.util.Map
    public void clear() {
        this.f1469f.clear();
    }

    public Object clone() {
        return new e(new LinkedHashMap(this.f1469f));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f1469f.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f1469f.containsValue(obj);
    }

    public Map<String, Object> e() {
        return this.f1469f;
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.f1469f.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.f1469f.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f1469f.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f1469f.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Class<?>[] parameterTypes = method.getParameterTypes();
        String str = null;
        if (parameterTypes.length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() != Void.TYPE) {
                throw new d("illegal setter");
            }
            com.alibaba.fastjson.g.b bVar = (com.alibaba.fastjson.g.b) method.getAnnotation(com.alibaba.fastjson.g.b.class);
            String name = (bVar == null || bVar.name().length() == 0) ? null : bVar.name();
            if (name == null) {
                String name2 = method.getName();
                if (!name2.startsWith("set")) {
                    throw new d("illegal setter");
                }
                String substring = name2.substring(3);
                if (substring.length() == 0) {
                    throw new d("illegal setter");
                }
                name = Character.toLowerCase(substring.charAt(0)) + substring.substring(1);
            }
            this.f1469f.put(name, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == Void.TYPE) {
            throw new d("illegal getter");
        }
        com.alibaba.fastjson.g.b bVar2 = (com.alibaba.fastjson.g.b) method.getAnnotation(com.alibaba.fastjson.g.b.class);
        if (bVar2 != null && bVar2.name().length() != 0) {
            str = bVar2.name();
        }
        if (str == null) {
            String name3 = method.getName();
            if (name3.startsWith(MonitorConstants.CONNECT_TYPE_GET)) {
                String substring2 = name3.substring(3);
                if (substring2.length() == 0) {
                    throw new d("illegal getter");
                }
                str = Character.toLowerCase(substring2.charAt(0)) + substring2.substring(1);
            } else {
                if (!name3.startsWith("is")) {
                    if (name3.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name3.startsWith("toString")) {
                        return b();
                    }
                    throw new d("illegal getter");
                }
                String substring3 = name3.substring(2);
                if (substring3.length() == 0) {
                    throw new d("illegal getter");
                }
                str = Character.toLowerCase(substring3.charAt(0)) + substring3.substring(1);
            }
        }
        return com.alibaba.fastjson.h.d.b(this.f1469f.get(str), method.getGenericReturnType(), k.f1505c);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f1469f.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f1469f.keySet();
    }

    @Override // java.util.Map
    public Object put(String str, Object obj) {
        return this.f1469f.put(str, obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.f1469f.putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f1469f.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f1469f.size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.f1469f.values();
    }

    public e() {
        this.f1469f = new HashMap(16);
    }

    public e(boolean z) {
        if (z) {
            this.f1469f = new LinkedHashMap(16);
        } else {
            this.f1469f = new HashMap(16);
        }
    }
}
