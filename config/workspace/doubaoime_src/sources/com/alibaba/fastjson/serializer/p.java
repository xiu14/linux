package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class p implements t {
    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        y yVar = mVar.b;
        if (obj == null) {
            yVar.write("null");
            return;
        }
        Map map = (Map) obj;
        Class<?> cls = map.getClass();
        boolean z4 = (cls == com.alibaba.fastjson.e.class || cls == HashMap.class || cls == LinkedHashMap.class) && map.containsKey("@type");
        if ((yVar.f1531c & SerializerFeature.SortField.mask) != 0 && !(map instanceof SortedMap) && !(map instanceof LinkedHashMap)) {
            try {
                map = new TreeMap(map);
            } catch (Exception unused) {
            }
        }
        IdentityHashMap<Object, w> identityHashMap = mVar.l;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            mVar.h(obj);
            return;
        }
        w wVar = mVar.m;
        mVar.e(wVar, obj, obj2, 0);
        try {
            yVar.write(123);
            mVar.c();
            if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) == 0 || z4) {
                z = true;
            } else {
                Objects.requireNonNull(mVar.a);
                yVar.o("@type", false);
                yVar.w(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            t tVar = null;
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                Object key = entry.getKey();
                List<v> list = mVar.h;
                if (list != null) {
                    Object obj3 = key;
                    for (v vVar : list) {
                        if (obj3 != null && !(obj3 instanceof String)) {
                            obj3 = com.alibaba.fastjson.a.d(obj3);
                        }
                        if (!vVar.a(mVar, obj, (String) obj3)) {
                            z2 = false;
                            break;
                        }
                    }
                }
                z2 = true;
                if (z2) {
                    List<u> list2 = mVar.f1518e;
                    if (list2 != null) {
                        Object d2 = (key == null || (key instanceof String)) ? key : com.alibaba.fastjson.a.d(key);
                        Iterator<u> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (!it2.next().a(obj, (String) d2, value)) {
                                z3 = false;
                                break;
                            }
                        }
                    }
                    z3 = true;
                    if (z3) {
                        List<r> list3 = mVar.f1520g;
                        if (list3 != null) {
                            if (key != null && !(key instanceof String)) {
                                key = com.alibaba.fastjson.a.d(key);
                            }
                            Iterator<r> it3 = list3.iterator();
                            while (it3.hasNext()) {
                                key = it3.next().a(obj, (String) key, value);
                            }
                        }
                        List<A> list4 = mVar.f1519f;
                        if (list4 != null) {
                            Object d3 = (key == null || (key instanceof String)) ? key : com.alibaba.fastjson.a.d(key);
                            Iterator<A> it4 = list4.iterator();
                            while (it4.hasNext()) {
                                value = it4.next().a(obj, (String) d3, value);
                            }
                        }
                        if (value != null || (yVar.f1531c & SerializerFeature.WriteMapNullValue.mask) != 0) {
                            if (key instanceof String) {
                                String str = (String) key;
                                if (!z) {
                                    yVar.write(44);
                                }
                                if ((yVar.f1531c & SerializerFeature.PrettyFormat.mask) != 0) {
                                    mVar.d();
                                }
                                yVar.o(str, true);
                            } else {
                                if (!z) {
                                    yVar.write(44);
                                }
                                int i = yVar.f1531c;
                                if ((SerializerFeature.BrowserCompatible.mask & i) == 0 && (i & SerializerFeature.WriteNonStringKeyAsString.mask) == 0) {
                                    mVar.f(key);
                                    yVar.write(58);
                                }
                                mVar.g(com.alibaba.fastjson.a.d(key));
                                yVar.write(58);
                            }
                            if (value == null) {
                                yVar.write("null");
                            } else {
                                Class<?> cls3 = value.getClass();
                                if (cls3 == cls2) {
                                    tVar.b(mVar, value, key, null);
                                } else {
                                    t a = mVar.a.a(cls3);
                                    a.b(mVar, value, key, null);
                                    cls2 = cls3;
                                    tVar = a;
                                }
                            }
                            z = false;
                        }
                    }
                }
            }
            mVar.m = wVar;
            mVar.a();
            if ((yVar.f1531c & SerializerFeature.PrettyFormat.mask) != 0 && map.size() > 0) {
                mVar.d();
            }
            yVar.write(125);
        } catch (Throwable th) {
            mVar.m = wVar;
            throw th;
        }
    }
}
