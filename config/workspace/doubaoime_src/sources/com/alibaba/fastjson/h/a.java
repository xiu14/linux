package com.alibaba.fastjson.h;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes.dex */
public class a implements Comparable<a> {
    public final String a;
    public final Method b;

    /* renamed from: c, reason: collision with root package name */
    public final Field f1470c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1471d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1472e;

    /* renamed from: f, reason: collision with root package name */
    private int f1473f;

    /* renamed from: g, reason: collision with root package name */
    public final Class<?> f1474g;
    public final Type h;
    public final Class<?> i;
    public final boolean j;
    private final com.alibaba.fastjson.g.b k;
    private final com.alibaba.fastjson.g.b l;
    public final boolean m;
    public final String n;
    public final long o;
    public final String[] p;

    public a(String str, Class cls, Class cls2, Type type, Field field, int i) {
        this.f1473f = 0;
        this.a = str;
        this.i = cls;
        this.f1474g = cls2;
        this.h = type;
        this.b = null;
        this.f1470c = field;
        this.f1473f = i;
        this.m = cls2.isEnum();
        this.k = null;
        this.l = null;
        if (field != null) {
            int modifiers = field.getModifiers();
            int i2 = modifiers & 1;
            this.f1471d = true;
            this.f1472e = Modifier.isTransient(modifiers);
        } else {
            this.f1471d = false;
            this.f1472e = false;
        }
        this.j = false;
        long j = -2128831035;
        for (int i3 = 0; i3 < str.length(); i3++) {
            j = (j ^ str.charAt(i3)) * 16777619;
        }
        this.o = j;
        this.n = null;
        this.p = new String[0];
    }

    private static boolean c(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (c(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new c(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i2 = 0; i2 < typeVariableArr.length; i2++) {
                    if (type.equals(typeVariableArr[i2])) {
                        typeArr[i] = typeArr2[i2];
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static Type d(Class<?> cls, Type type, Type type2) {
        TypeVariable<Class<? super Object>>[] typeVariableArr;
        ParameterizedType parameterizedType;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type d2 = d(cls, type, genericComponentType);
                return genericComponentType != d2 ? Array.newInstance(d.p(d2), 0).getClass() : type2;
            }
            if (!d.v(type)) {
                return type2;
            }
            if (type2 instanceof TypeVariable) {
                ParameterizedType parameterizedType2 = (ParameterizedType) (type instanceof Class ? d.t(((Class) type).getGenericSuperclass()) : type);
                Class<?> p = d.p(parameterizedType2);
                TypeVariable typeVariable = (TypeVariable) type2;
                for (int i = 0; i < p.getTypeParameters().length; i++) {
                    if (p.getTypeParameters()[i].getName().equals(typeVariable.getName())) {
                        return parameterizedType2.getActualTypeArguments()[i];
                    }
                }
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                Type[] typeArr = null;
                if (type instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) type;
                    typeVariableArr = cls.getTypeParameters();
                } else if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                    typeVariableArr = cls.getSuperclass().getTypeParameters();
                } else {
                    typeVariableArr = null;
                    parameterizedType = null;
                }
                boolean z = false;
                for (int i2 = 0; i2 < actualTypeArguments.length && parameterizedType != null; i2++) {
                    Type type3 = actualTypeArguments[i2];
                    if (type3 instanceof TypeVariable) {
                        TypeVariable typeVariable2 = (TypeVariable) type3;
                        for (int i3 = 0; i3 < typeVariableArr.length; i3++) {
                            if (typeVariableArr[i3].getName().equals(typeVariable2.getName())) {
                                if (typeArr == null) {
                                    typeArr = parameterizedType.getActualTypeArguments();
                                }
                                actualTypeArguments[i2] = typeArr[i3];
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    return new c(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                }
            }
        }
        return type2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        int i = this.f1473f;
        int i2 = aVar.f1473f;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.a.compareTo(aVar.a);
    }

    public com.alibaba.fastjson.g.b b() {
        com.alibaba.fastjson.g.b bVar = this.k;
        return bVar != null ? bVar : this.l;
    }

    public String toString() {
        return this.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0134, code lost:
    
        r6 = r15.i.getTypeParameters();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013c, code lost:
    
        if (r10 >= r6.length) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        if (r2.equals(r6[r10]) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0149, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0146, code lost:
    
        r5 = r7[r10];
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r16, java.lang.reflect.Method r17, java.lang.reflect.Field r18, java.lang.Class r19, java.lang.reflect.Type r20, int r21, com.alibaba.fastjson.g.b r22, com.alibaba.fastjson.g.b r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.h.a.<init>(java.lang.String, java.lang.reflect.Method, java.lang.reflect.Field, java.lang.Class, java.lang.reflect.Type, int, com.alibaba.fastjson.g.b, com.alibaba.fastjson.g.b, boolean):void");
    }
}
