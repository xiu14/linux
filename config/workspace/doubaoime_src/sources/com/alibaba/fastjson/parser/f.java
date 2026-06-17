package com.alibaba.fastjson.parser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class f {
    final Constructor<?> a;
    final int b;

    /* renamed from: c, reason: collision with root package name */
    final Constructor<?> f1495c;

    /* renamed from: d, reason: collision with root package name */
    final Method f1496d;

    /* renamed from: e, reason: collision with root package name */
    final com.alibaba.fastjson.h.a[] f1497e;

    /* renamed from: f, reason: collision with root package name */
    final com.alibaba.fastjson.h.a[] f1498f;

    /* renamed from: g, reason: collision with root package name */
    final com.alibaba.fastjson.g.c f1499g;
    boolean h;
    final boolean i;
    public final String j;
    public final String k;
    public final int l;

    f(Class<?> cls, Constructor<?> constructor, Constructor<?> constructor2, Method method, com.alibaba.fastjson.h.a[] aVarArr, com.alibaba.fastjson.h.a[] aVarArr2, com.alibaba.fastjson.g.c cVar) {
        int i;
        boolean z;
        String[] orders;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2 = 0;
        this.h = false;
        this.a = constructor;
        this.f1495c = constructor2;
        this.f1496d = method;
        this.f1497e = aVarArr;
        this.f1499g = cVar;
        if (cVar != null) {
            String typeName = cVar.typeName();
            this.j = typeName.length() <= 0 ? cls.getName() : typeName;
            String typeKey = cVar.typeKey();
            this.k = typeKey.length() > 0 ? typeKey : null;
            i = 0;
            for (Feature feature : cVar.parseFeatures()) {
                i |= feature.mask;
            }
        } else {
            this.j = cls.getName();
            this.k = null;
            i = 0;
        }
        this.l = i;
        if (cVar != null) {
            z = false;
            for (Feature feature2 : cVar.parseFeatures()) {
                if (feature2 == Feature.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.i = z;
        com.alibaba.fastjson.g.c cVar2 = this.f1499g;
        if (cVar2 != null && (orders = cVar2.orders()) != null && orders.length != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= orders.length) {
                    z2 = true;
                    break;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= aVarArr2.length) {
                        z5 = false;
                        break;
                    } else {
                        if (aVarArr2[i4].a.equals(orders[i3])) {
                            z5 = true;
                            break;
                        }
                        i4++;
                    }
                }
                if (!z5) {
                    z2 = false;
                    break;
                }
                i3++;
            }
            if (z2) {
                if (orders.length == aVarArr.length) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= orders.length) {
                            z4 = true;
                            break;
                        } else {
                            if (!aVarArr2[i5].a.equals(orders[i5])) {
                                z4 = false;
                                break;
                            }
                            i5++;
                        }
                    }
                    if (!z4) {
                        com.alibaba.fastjson.h.a[] aVarArr3 = new com.alibaba.fastjson.h.a[aVarArr2.length];
                        for (int i6 = 0; i6 < orders.length; i6++) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= aVarArr2.length) {
                                    break;
                                }
                                if (aVarArr2[i7].a.equals(orders[i6])) {
                                    aVarArr3[i6] = aVarArr2[i7];
                                    break;
                                }
                                i7++;
                            }
                        }
                        this.h = true;
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    int length = aVarArr2.length;
                    com.alibaba.fastjson.h.a[] aVarArr4 = new com.alibaba.fastjson.h.a[length];
                    for (int i8 = 0; i8 < orders.length; i8++) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= aVarArr2.length) {
                                break;
                            }
                            if (aVarArr2[i9].a.equals(orders[i8])) {
                                aVarArr4[i8] = aVarArr2[i9];
                                break;
                            }
                            i9++;
                        }
                    }
                    int length2 = orders.length;
                    for (int i10 = 0; i10 < aVarArr2.length; i10++) {
                        for (int i11 = 0; i11 < length && i11 < length2; i11++) {
                            com.alibaba.fastjson.h.a aVar = aVarArr4[i10];
                            com.alibaba.fastjson.h.a aVar2 = aVarArr2[i11];
                            Objects.requireNonNull(aVar);
                            if (aVar2 == aVar || aVar.compareTo(aVar2) == 0) {
                                z3 = true;
                                break;
                            }
                        }
                        z3 = false;
                        if (!z3) {
                            aVarArr4[length2] = aVarArr2[i10];
                            length2++;
                        }
                    }
                    this.h = true;
                }
            }
        }
        this.f1498f = Arrays.equals(aVarArr, aVarArr2) ? aVarArr : aVarArr2;
        if (constructor != null) {
            i2 = constructor.getParameterTypes().length;
        } else if (method != null) {
            i2 = method.getParameterTypes().length;
        }
        this.b = i2;
    }

    static boolean a(List<com.alibaba.fastjson.h.a> list, com.alibaba.fastjson.h.a aVar, boolean z) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                com.alibaba.fastjson.h.a aVar2 = list.get(i);
                if (aVar2.a.equals(aVar.a) && (!aVar2.j || aVar.j)) {
                    return false;
                }
            }
        }
        list.add(aVar);
        return true;
    }
}
