package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class b implements t, com.alibaba.fastjson.parser.o.f {
    public static final b a = new b();

    private b() {
    }

    private <T> T c(com.alibaba.fastjson.parser.b bVar, Class<?> cls, com.alibaba.fastjson.b bVar2) {
        if (bVar2 == null) {
            return null;
        }
        int size = bVar2.size();
        T t = (T) Array.newInstance(cls, size);
        for (int i = 0; i < size; i++) {
            Object obj = bVar2.get(i);
            if (obj == bVar2) {
                Array.set(t, i, t);
            } else {
                if (!cls.isArray()) {
                    obj = com.alibaba.fastjson.h.d.a(obj, cls, bVar.b);
                } else if (!cls.isInstance(obj)) {
                    obj = c(bVar, cls, (com.alibaba.fastjson.b) obj);
                }
                Array.set(t, i, obj);
            }
        }
        bVar2.h(t);
        bVar2.g(cls);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        com.alibaba.fastjson.parser.d dVar = bVar.f1481e;
        int Y = dVar.Y();
        if (Y == 8) {
            dVar.s(16);
            return null;
        }
        if (type != char[].class) {
            if (Y == 4) {
                T t = (T) dVar.a();
                dVar.s(16);
                return t;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            com.alibaba.fastjson.b bVar2 = new com.alibaba.fastjson.b();
            bVar.x(componentType, bVar2, obj);
            return (T) c(bVar, componentType, bVar2);
        }
        if (Y == 4) {
            String V = dVar.V();
            dVar.s(16);
            return (T) V.toCharArray();
        }
        if (Y != 2) {
            return (T) com.alibaba.fastjson.a.d(bVar.s()).toCharArray();
        }
        Number k = dVar.k();
        dVar.s(16);
        return (T) k.toString().toCharArray();
    }

    @Override // com.alibaba.fastjson.serializer.t
    public final void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
                yVar.write("[]");
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            yVar.a("[]");
            return;
        }
        w wVar = mVar.m;
        int i2 = 0;
        mVar.e(wVar, obj, obj2, 0);
        try {
            yVar.write(91);
            if ((yVar.f1531c & SerializerFeature.PrettyFormat.mask) != 0) {
                mVar.c();
                mVar.d();
                while (i2 < length) {
                    if (i2 != 0) {
                        yVar.write(44);
                        mVar.d();
                    }
                    mVar.f(objArr[i2]);
                    i2++;
                }
                mVar.a();
                mVar.d();
                yVar.write(93);
                return;
            }
            Class<?> cls = null;
            t tVar = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    yVar.a("null,");
                } else {
                    IdentityHashMap<Object, w> identityHashMap = mVar.l;
                    if (identityHashMap == null || !identityHashMap.containsKey(obj3)) {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            tVar.b(mVar, obj3, null, null);
                        } else {
                            tVar = mVar.a.a(cls2);
                            tVar.b(mVar, obj3, null, null);
                            cls = cls2;
                        }
                    } else {
                        mVar.h(obj3);
                    }
                    yVar.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                yVar.a("null]");
            } else {
                IdentityHashMap<Object, w> identityHashMap2 = mVar.l;
                if (identityHashMap2 == null || !identityHashMap2.containsKey(obj4)) {
                    try {
                        mVar.a.a(obj4.getClass()).b(mVar, obj4, Integer.valueOf(i), null);
                    } catch (IOException e2) {
                        throw new com.alibaba.fastjson.d(e2.getMessage(), e2);
                    }
                } else {
                    mVar.h(obj4);
                }
                yVar.write(93);
            }
        } finally {
            mVar.m = wVar;
        }
    }
}
