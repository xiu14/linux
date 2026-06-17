package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements t {
    @Override // com.alibaba.fastjson.serializer.t
    public final void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        boolean z;
        y yVar = mVar.b;
        int i = 1;
        boolean z2 = (yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0;
        Type q = z2 ? com.alibaba.fastjson.h.d.q(type) : null;
        if (obj == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullListAsEmpty.mask) != 0) {
                yVar.write("[]");
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            yVar.a("[]");
            return;
        }
        w wVar = mVar.m;
        if ((yVar.f1531c & SerializerFeature.DisableCircularReferenceDetect.mask) == 0) {
            mVar.m = new w(wVar, obj, obj2, 0);
            if (mVar.l == null) {
                mVar.l = new IdentityHashMap<>();
            }
            mVar.l.put(obj, mVar.m);
        }
        try {
            if ((yVar.f1531c & SerializerFeature.PrettyFormat.mask) != 0) {
                yVar.write(91);
                mVar.c();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (i2 != 0) {
                        yVar.write(44);
                    }
                    mVar.d();
                    if (obj3 != null) {
                        IdentityHashMap<Object, w> identityHashMap = mVar.l;
                        if (identityHashMap == null || !identityHashMap.containsKey(obj3)) {
                            t a = mVar.a.a(obj3.getClass());
                            mVar.m = new w(wVar, obj, obj2, 0);
                            a.b(mVar, obj3, Integer.valueOf(i2), q);
                        } else {
                            mVar.h(obj3);
                        }
                    } else {
                        mVar.b.write("null");
                    }
                }
                mVar.a();
                mVar.d();
                yVar.write(93);
                return;
            }
            int i3 = yVar.b + 1;
            if (i3 > yVar.a.length) {
                if (yVar.f1532d == null) {
                    yVar.h(i3);
                } else {
                    yVar.flush();
                    i3 = 1;
                }
            }
            yVar.a[yVar.b] = '[';
            yVar.b = i3;
            for (int i4 = 0; i4 < list.size(); i4++) {
                Object obj4 = list.get(i4);
                if (i4 != 0) {
                    int i5 = yVar.b + 1;
                    if (i5 > yVar.a.length) {
                        if (yVar.f1532d == null) {
                            yVar.h(i5);
                        } else {
                            yVar.flush();
                            i5 = 1;
                        }
                    }
                    yVar.a[yVar.b] = ',';
                    yVar.b = i5;
                }
                if (obj4 == null) {
                    yVar.a("null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        yVar.p(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long longValue = ((Long) obj4).longValue();
                        if (z2) {
                            yVar.r(longValue);
                            yVar.write(76);
                        } else {
                            yVar.r(longValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((yVar.f1531c & SerializerFeature.UseSingleQuotes.mask) != 0) {
                            yVar.z(str);
                        } else {
                            yVar.x(str, (char) 0, true);
                        }
                    } else {
                        if ((yVar.f1531c & SerializerFeature.DisableCircularReferenceDetect.mask) == 0) {
                            z = false;
                            mVar.m = new w(wVar, obj, obj2, 0);
                        } else {
                            z = false;
                        }
                        IdentityHashMap<Object, w> identityHashMap2 = mVar.l;
                        if (identityHashMap2 == null || !identityHashMap2.containsKey(obj4)) {
                            mVar.a.a(obj4.getClass()).b(mVar, obj4, Integer.valueOf(i4), q);
                        } else {
                            mVar.h(obj4);
                        }
                    }
                }
                z = false;
            }
            int i6 = yVar.b + 1;
            if (i6 > yVar.a.length) {
                if (yVar.f1532d != null) {
                    yVar.flush();
                    yVar.a[yVar.b] = ']';
                    yVar.b = i;
                }
                yVar.h(i6);
            }
            i = i6;
            yVar.a[yVar.b] = ']';
            yVar.b = i;
        } finally {
            mVar.m = wVar;
        }
    }
}
