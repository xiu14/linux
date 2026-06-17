package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.j;
import com.google.gson.m;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class c extends ReflectiveTypeAdapterFactory.a {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f6820f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Method f6821g;
    final /* synthetic */ boolean h;
    final /* synthetic */ TypeAdapter i;
    final /* synthetic */ Gson j;
    final /* synthetic */ com.google.gson.u.a k;
    final /* synthetic */ boolean l;
    final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, TypeAdapter typeAdapter, Gson gson, com.google.gson.u.a aVar, boolean z5, boolean z6) {
        super(str, field, z, z2);
        this.f6820f = z3;
        this.f6821g = method;
        this.h = z4;
        this.i = typeAdapter;
        this.j = gson;
        this.k = aVar;
        this.l = z5;
        this.m = z6;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    void a(com.google.gson.stream.a aVar, int i, Object[] objArr) throws IOException, m {
        Object b = this.i.b(aVar);
        if (b != null || !this.l) {
            objArr[i] = b;
            return;
        }
        StringBuilder M = e.a.a.a.a.M("null is not allowed as value for record component '");
        M.append(this.f6799c);
        M.append("' of primitive type; at path ");
        M.append(aVar.s());
        throw new m(M.toString());
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    void b(com.google.gson.stream.a aVar, Object obj) throws IOException, IllegalAccessException {
        Object b = this.i.b(aVar);
        if (b == null && this.l) {
            return;
        }
        if (this.f6820f) {
            ReflectiveTypeAdapterFactory.b(obj, this.b);
        } else if (this.m) {
            throw new j(e.a.a.a.a.s("Cannot set value of 'static final' ", com.google.gson.internal.H.a.f(this.b, false)));
        }
        this.b.set(obj, b);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    void c(com.google.gson.stream.b bVar, Object obj) throws IOException, IllegalAccessException {
        Object obj2;
        if (this.f6800d) {
            if (this.f6820f) {
                Method method = this.f6821g;
                if (method == null) {
                    ReflectiveTypeAdapterFactory.b(obj, this.b);
                } else {
                    ReflectiveTypeAdapterFactory.b(obj, method);
                }
            }
            Method method2 = this.f6821g;
            if (method2 != null) {
                try {
                    obj2 = method2.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e2) {
                    throw new j(e.a.a.a.a.t("Accessor ", com.google.gson.internal.H.a.f(this.f6821g, false), " threw exception"), e2.getCause());
                }
            } else {
                obj2 = this.b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            bVar.z(this.a);
            (this.h ? this.i : new TypeAdapterRuntimeTypeWrapper(this.j, this.i, this.k.e())).c(bVar, obj2);
        }
    }
}
