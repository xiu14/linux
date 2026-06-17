package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l {
    private final Map<Type, com.google.gson.e<?>> a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final List<ReflectionAccessFilter> f6822c;

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements w<T> {
        final /* synthetic */ com.google.gson.e a;
        final /* synthetic */ Type b;

        a(l lVar, com.google.gson.e eVar, Type type) {
            this.a = eVar;
            this.b = type;
        }

        @Override // com.google.gson.internal.w
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class b<T> implements w<T> {
        final /* synthetic */ com.google.gson.e a;
        final /* synthetic */ Type b;

        b(l lVar, com.google.gson.e eVar, Type type) {
            this.a = eVar;
            this.b = type;
        }

        @Override // com.google.gson.internal.w
        public T a() {
            return (T) this.a.a(this.b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class c<T> implements w<T> {
        final /* synthetic */ String a;

        c(l lVar, String str) {
            this.a = str;
        }

        @Override // com.google.gson.internal.w
        public T a() {
            throw new com.google.gson.j(this.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    class d<T> implements w<T> {
        final /* synthetic */ String a;

        d(l lVar, String str) {
            this.a = str;
        }

        @Override // com.google.gson.internal.w
        public T a() {
            throw new com.google.gson.j(this.a);
        }
    }

    public l(Map<Type, com.google.gson.e<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.a = map;
        this.b = z;
        this.f6822c = list;
    }

    static String a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder M = e.a.a.a.a.M("Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ");
            M.append(cls.getName());
            return M.toString();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        StringBuilder M2 = e.a.a.a.a.M("Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ");
        M2.append(cls.getName());
        return M2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.google.gson.internal.w<T> b(com.google.gson.u.a<T> r9) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.l.b(com.google.gson.u.a):com.google.gson.internal.w");
    }

    public String toString() {
        return this.a.toString();
    }
}
