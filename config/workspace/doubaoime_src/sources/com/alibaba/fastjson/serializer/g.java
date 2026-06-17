package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class g implements t, com.alibaba.fastjson.parser.o.f {
    public static final g a = new g();

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, com.alibaba.fastjson.b, java.util.Collection] */
    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        Collection collection;
        if (bVar.f1481e.Y() == 8) {
            bVar.f1481e.s(16);
            return null;
        }
        if (type == com.alibaba.fastjson.b.class) {
            ?? r5 = (T) new com.alibaba.fastjson.b();
            bVar.z(r5, null);
            return r5;
        }
        Type type2 = type;
        while (!(type2 instanceof Class)) {
            if (!(type2 instanceof ParameterizedType)) {
                throw new com.alibaba.fastjson.d("TODO");
            }
            type2 = ((ParameterizedType) type2).getRawType();
        }
        Class cls = (Class) type2;
        if (cls == AbstractCollection.class || cls == Collection.class) {
            collection = (T) new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            collection = (T) new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            collection = (T) new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            collection = (T) new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            collection = (T) new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            collection = (T) EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        } else {
            try {
                collection = (T) ((Collection) cls.newInstance());
            } catch (Exception unused) {
                StringBuilder M = e.a.a.a.a.M("create instane error, class ");
                M.append(cls.getName());
                throw new com.alibaba.fastjson.d(M.toString());
            }
        }
        bVar.x(com.alibaba.fastjson.h.d.q(type), collection, obj);
        return (T) collection;
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        if (obj == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
                yVar.write("[]");
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        int i = yVar.f1531c;
        SerializerFeature serializerFeature = SerializerFeature.WriteClassName;
        Type q = (i & serializerFeature.mask) != 0 ? com.alibaba.fastjson.h.d.q(type) : null;
        Collection collection = (Collection) obj;
        w wVar = mVar.m;
        int i2 = 0;
        mVar.e(wVar, obj, obj2, 0);
        if ((yVar.f1531c & serializerFeature.mask) != 0) {
            if (HashSet.class == collection.getClass()) {
                yVar.a("Set");
            } else if (TreeSet.class == collection.getClass()) {
                yVar.a("TreeSet");
            }
        }
        try {
            yVar.write(91);
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    yVar.write(44);
                }
                if (obj3 == null) {
                    yVar.write("null");
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        yVar.p(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        yVar.r(((Long) obj3).longValue());
                        if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0) {
                            yVar.write(76);
                        }
                    } else {
                        mVar.a.a(cls).b(mVar, obj3, Integer.valueOf(i3 - 1), q);
                    }
                }
                i2 = i3;
            }
            yVar.write(93);
        } finally {
            mVar.m = wVar;
        }
    }
}
