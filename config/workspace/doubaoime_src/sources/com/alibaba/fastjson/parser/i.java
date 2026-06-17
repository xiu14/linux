package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.parser.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
class i implements com.alibaba.fastjson.parser.o.f {
    public static i a = new i();

    i() {
    }

    public static Object c(b bVar, Map map, Type type, Type type2) {
        Object obj;
        d dVar = bVar.f1481e;
        int i = dVar.a;
        int i2 = 16;
        if (i != 12 && i != 16) {
            StringBuilder M = e.a.a.a.a.M("syntax error, expect {, actual ");
            M.append(d.a.b.a.k(i));
            throw new com.alibaba.fastjson.d(M.toString());
        }
        com.alibaba.fastjson.parser.o.f b = bVar.b.b(type);
        com.alibaba.fastjson.parser.o.f b2 = bVar.b.b(type2);
        dVar.r();
        j jVar = bVar.f1482f;
        while (true) {
            try {
                int i3 = dVar.a;
                if (i3 == 13) {
                    dVar.s(i2);
                    return map;
                }
                if (i3 == 4 && dVar.f1490g == 4 && dVar.p.startsWith("$ref", dVar.j + 1) && !dVar.m(Feature.DisableSpecialKeyDetect)) {
                    dVar.t(':');
                    if (dVar.a != 4) {
                        throw new com.alibaba.fastjson.d("illegal ref, " + d.a.b.a.k(i3));
                    }
                    String V = dVar.V();
                    if ("..".equals(V)) {
                        obj = jVar.b.a;
                    } else if ("$".equals(V)) {
                        j jVar2 = jVar;
                        while (true) {
                            j jVar3 = jVar2.b;
                            if (jVar3 == null) {
                                break;
                            }
                            jVar2 = jVar3;
                        }
                        obj = jVar2.a;
                    } else {
                        bVar.d(new b.a(jVar, V));
                        bVar.j = 1;
                        obj = null;
                    }
                    dVar.s(13);
                    if (dVar.a != 13) {
                        throw new com.alibaba.fastjson.d("illegal ref");
                    }
                    dVar.s(16);
                    return obj;
                }
                if (map.size() == 0 && i3 == 4 && "@type".equals(dVar.V()) && !dVar.m(Feature.DisableSpecialKeyDetect)) {
                    dVar.t(':');
                    dVar.s(16);
                    if (dVar.a == 13) {
                        dVar.r();
                        return map;
                    }
                    dVar.r();
                }
                Object a2 = b.a(bVar, type, null);
                if (dVar.a != 17) {
                    throw new com.alibaba.fastjson.d("syntax error, expect :, actual " + dVar.a);
                }
                dVar.r();
                Object a3 = b2.a(bVar, type2, a2);
                if (bVar.j == 1) {
                    bVar.l(map, a2);
                }
                map.put(a2, a3);
                if (dVar.a == 16) {
                    dVar.r();
                }
                i2 = 16;
            } finally {
                bVar.N(jVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0128, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map d(com.alibaba.fastjson.parser.b r9, java.util.Map<java.lang.String, java.lang.Object> r10, java.lang.reflect.Type r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.i.d(com.alibaba.fastjson.parser.b, java.util.Map, java.lang.reflect.Type, java.lang.Object):java.util.Map");
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(b bVar, Type type, Object obj) {
        if (type == com.alibaba.fastjson.e.class && bVar.m == null) {
            return (T) ((com.alibaba.fastjson.e) bVar.D((bVar.f1481e.f1486c & Feature.OrderedField.mask) != 0 ? new com.alibaba.fastjson.e(new LinkedHashMap()) : new com.alibaba.fastjson.e(), null));
        }
        d dVar = bVar.f1481e;
        if (dVar.a == 8) {
            dVar.s(16);
            return null;
        }
        Map<?, ?> b = b(type);
        j jVar = bVar.f1482f;
        try {
            bVar.M(jVar, b, obj);
            if (!(type instanceof ParameterizedType)) {
                return (T) bVar.D(b, obj);
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            return String.class == type2 ? (T) d(bVar, b, type3, obj) : (T) c(bVar, b, type2, type3);
        } finally {
            bVar.N(jVar);
        }
    }

    protected Map<?, ?> b(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == com.alibaba.fastjson.e.class) {
            return new com.alibaba.fastjson.e();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : b(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.y("unsupport type ", type));
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e2) {
            throw new com.alibaba.fastjson.d(e.a.a.a.a.y("unsupport type ", type), e2);
        }
    }
}
