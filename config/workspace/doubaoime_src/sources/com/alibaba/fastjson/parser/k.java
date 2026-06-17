package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.serializer.q;
import com.alibaba.fastjson.serializer.s;
import com.alibaba.fastjson.serializer.z;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    public static k f1505c = new k();
    private final com.alibaba.fastjson.h.b<com.alibaba.fastjson.parser.o.f> a;
    public final m b;

    public k() {
        com.alibaba.fastjson.h.b<com.alibaba.fastjson.parser.o.f> bVar = new com.alibaba.fastjson.h.b<>(1024);
        this.a = bVar;
        this.b = new m(16384);
        q qVar = q.a;
        bVar.b(SimpleDateFormat.class, qVar);
        com.alibaba.fastjson.serializer.h hVar = com.alibaba.fastjson.serializer.h.a;
        bVar.b(Date.class, hVar);
        bVar.b(Calendar.class, hVar);
        bVar.b(Map.class, i.a);
        bVar.b(HashMap.class, i.a);
        bVar.b(LinkedHashMap.class, i.a);
        bVar.b(TreeMap.class, i.a);
        bVar.b(ConcurrentMap.class, i.a);
        bVar.b(ConcurrentHashMap.class, i.a);
        com.alibaba.fastjson.serializer.g gVar = com.alibaba.fastjson.serializer.g.a;
        bVar.b(Collection.class, gVar);
        bVar.b(List.class, gVar);
        bVar.b(ArrayList.class, gVar);
        g gVar2 = g.a;
        bVar.b(Object.class, gVar2);
        bVar.b(String.class, z.a);
        bVar.b(Character.TYPE, qVar);
        bVar.b(Character.class, qVar);
        Class cls = Byte.TYPE;
        s sVar = s.a;
        bVar.b(cls, sVar);
        bVar.b(Byte.class, sVar);
        bVar.b(Short.TYPE, sVar);
        bVar.b(Short.class, sVar);
        bVar.b(Integer.TYPE, com.alibaba.fastjson.serializer.k.a);
        bVar.b(Integer.class, com.alibaba.fastjson.serializer.k.a);
        bVar.b(Long.TYPE, com.alibaba.fastjson.serializer.k.a);
        bVar.b(Long.class, com.alibaba.fastjson.serializer.k.a);
        com.alibaba.fastjson.serializer.e eVar = com.alibaba.fastjson.serializer.e.a;
        bVar.b(BigInteger.class, eVar);
        bVar.b(BigDecimal.class, eVar);
        bVar.b(Float.TYPE, sVar);
        bVar.b(Float.class, sVar);
        bVar.b(Double.TYPE, sVar);
        bVar.b(Double.class, sVar);
        Class cls2 = Boolean.TYPE;
        com.alibaba.fastjson.serializer.f fVar = com.alibaba.fastjson.serializer.f.a;
        bVar.b(cls2, fVar);
        bVar.b(Boolean.class, fVar);
        bVar.b(Class.class, qVar);
        com.alibaba.fastjson.serializer.b bVar2 = com.alibaba.fastjson.serializer.b.a;
        bVar.b(char[].class, bVar2);
        bVar.b(Object[].class, bVar2);
        bVar.b(UUID.class, qVar);
        bVar.b(TimeZone.class, qVar);
        bVar.b(Locale.class, qVar);
        bVar.b(Currency.class, qVar);
        bVar.b(URI.class, qVar);
        bVar.b(URL.class, qVar);
        bVar.b(Pattern.class, qVar);
        bVar.b(Charset.class, qVar);
        bVar.b(Number.class, sVar);
        bVar.b(StackTraceElement.class, qVar);
        bVar.b(Serializable.class, gVar2);
        bVar.b(Cloneable.class, gVar2);
        bVar.b(Comparable.class, gVar2);
        bVar.b(Closeable.class, gVar2);
    }

    public com.alibaba.fastjson.parser.o.f a(Class<?> cls, Type type) {
        com.alibaba.fastjson.g.c cVar;
        Class<?> mappingTo;
        com.alibaba.fastjson.parser.o.f a = this.a.a(type);
        if (a != null) {
            return a;
        }
        if (type == null) {
            type = cls;
        }
        com.alibaba.fastjson.parser.o.f a2 = this.a.a(type);
        if (a2 != null) {
            return a2;
        }
        if (!(cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class) && (cVar = (com.alibaba.fastjson.g.c) cls.getAnnotation(com.alibaba.fastjson.g.c.class)) != null && (mappingTo = cVar.mappingTo()) != Void.class) {
            return a(mappingTo, mappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            a2 = this.a.a(cls);
        }
        if (a2 != null) {
            return a2;
        }
        com.alibaba.fastjson.parser.o.f a3 = this.a.a(type);
        if (a3 != null) {
            return a3;
        }
        com.alibaba.fastjson.parser.o.f cVar2 = cls.isEnum() ? new c(cls) : cls.isArray() ? com.alibaba.fastjson.serializer.b.a : (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class) ? com.alibaba.fastjson.serializer.g.a : Collection.class.isAssignableFrom(cls) ? com.alibaba.fastjson.serializer.g.a : Map.class.isAssignableFrom(cls) ? i.a : Throwable.class.isAssignableFrom(cls) ? new n(this, cls) : cls.getName().equals("android.net.Uri") ? q.a : new e(this, cls, type);
        this.a.b(type, cVar2);
        return cVar2;
    }

    public com.alibaba.fastjson.parser.o.f b(Type type) {
        com.alibaba.fastjson.parser.o.f a = this.a.a(type);
        if (a != null) {
            return a;
        }
        if (type instanceof Class) {
            return a((Class) type, type);
        }
        if (!(type instanceof ParameterizedType)) {
            return g.a;
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        return rawType instanceof Class ? a((Class) rawType, type) : b(rawType);
    }
}
