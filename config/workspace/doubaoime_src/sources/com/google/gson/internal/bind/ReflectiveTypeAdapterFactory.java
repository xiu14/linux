package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.l;
import com.google.gson.internal.w;
import com.google.gson.internal.x;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements t {
    private final l a;
    private final com.google.gson.c b;

    /* renamed from: c, reason: collision with root package name */
    private final Excluder f6793c;

    /* renamed from: d, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f6794d;

    /* renamed from: e, reason: collision with root package name */
    private final List<ReflectionAccessFilter> f6795e;

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {
        final Map<String, a> a;

        Adapter(Map<String, a> map) {
            this.a = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.c0() == JsonToken.NULL) {
                aVar.S();
                return null;
            }
            A d2 = d();
            try {
                aVar.d();
                while (aVar.z()) {
                    a aVar2 = this.a.get(aVar.P());
                    if (aVar2 != null && aVar2.f6801e) {
                        f(d2, aVar, aVar2);
                    }
                    aVar.p0();
                }
                aVar.p();
                return e(d2);
            } catch (IllegalAccessException e2) {
                com.google.gson.internal.H.a.d(e2);
                throw null;
            } catch (IllegalStateException e3) {
                throw new r(e3);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, T t) throws IOException {
            if (t == null) {
                bVar.D();
                return;
            }
            bVar.h();
            try {
                Iterator<a> it2 = this.a.values().iterator();
                while (it2.hasNext()) {
                    it2.next().c(bVar, t);
                }
                bVar.p();
            } catch (IllegalAccessException e2) {
                com.google.gson.internal.H.a.d(e2);
                throw null;
            }
        }

        abstract A d();

        abstract T e(A a);

        abstract void f(A a, com.google.gson.stream.a aVar, a aVar2) throws IllegalAccessException, IOException;
    }

    private static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        private final w<T> b;

        FieldReflectionAdapter(w<T> wVar, Map<String, a> map) {
            super(map);
            this.b = wVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T d() {
            return this.b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T e(T t) {
            return t;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void f(T t, com.google.gson.stream.a aVar, a aVar2) throws IllegalAccessException, IOException {
            aVar2.b(aVar, t);
        }
    }

    private static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: e, reason: collision with root package name */
        static final Map<Class<?>, Object> f6796e;
        private final Constructor<T> b;

        /* renamed from: c, reason: collision with root package name */
        private final Object[] f6797c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<String, Integer> f6798d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f6796e = hashMap;
        }

        RecordAdapter(Class<T> cls, Map<String, a> map, boolean z) {
            super(map);
            this.f6798d = new HashMap();
            Constructor<T> h = com.google.gson.internal.H.a.h(cls);
            this.b = h;
            if (z) {
                ReflectiveTypeAdapterFactory.b(null, h);
            } else {
                com.google.gson.internal.H.a.k(h);
            }
            String[] i = com.google.gson.internal.H.a.i(cls);
            for (int i2 = 0; i2 < i.length; i2++) {
                this.f6798d.put(i[i2], Integer.valueOf(i2));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.f6797c = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.f6797c[i3] = f6796e.get(parameterTypes[i3]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object[] d() {
            return (Object[]) this.f6797c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        Object e(Object[] objArr) {
            Object[] objArr2 = objArr;
            try {
                return this.b.newInstance(objArr2);
            } catch (IllegalAccessException e2) {
                com.google.gson.internal.H.a.d(e2);
                throw null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                StringBuilder M = e.a.a.a.a.M("Failed to invoke constructor '");
                M.append(com.google.gson.internal.H.a.c(this.b));
                M.append("' with args ");
                M.append(Arrays.toString(objArr2));
                throw new RuntimeException(M.toString(), e);
            } catch (InstantiationException e4) {
                e = e4;
                StringBuilder M2 = e.a.a.a.a.M("Failed to invoke constructor '");
                M2.append(com.google.gson.internal.H.a.c(this.b));
                M2.append("' with args ");
                M2.append(Arrays.toString(objArr2));
                throw new RuntimeException(M2.toString(), e);
            } catch (InvocationTargetException e5) {
                StringBuilder M3 = e.a.a.a.a.M("Failed to invoke constructor '");
                M3.append(com.google.gson.internal.H.a.c(this.b));
                M3.append("' with args ");
                M3.append(Arrays.toString(objArr2));
                throw new RuntimeException(M3.toString(), e5.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void f(Object[] objArr, com.google.gson.stream.a aVar, a aVar2) throws IllegalAccessException, IOException {
            Object[] objArr2 = objArr;
            Integer num = this.f6798d.get(aVar2.f6799c);
            if (num != null) {
                aVar2.a(aVar, num.intValue(), objArr2);
                return;
            }
            StringBuilder M = e.a.a.a.a.M("Could not find the index in the constructor '");
            M.append(com.google.gson.internal.H.a.c(this.b));
            M.append("' for field with name '");
            throw new IllegalStateException(e.a.a.a.a.J(M, aVar2.f6799c, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
    }

    static abstract class a {
        final String a;
        final Field b;

        /* renamed from: c, reason: collision with root package name */
        final String f6799c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f6800d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f6801e;

        protected a(String str, Field field, boolean z, boolean z2) {
            this.a = str;
            this.b = field;
            this.f6799c = field.getName();
            this.f6800d = z;
            this.f6801e = z2;
        }

        abstract void a(com.google.gson.stream.a aVar, int i, Object[] objArr) throws IOException, m;

        abstract void b(com.google.gson.stream.a aVar, Object obj) throws IOException, IllegalAccessException;

        abstract void c(com.google.gson.stream.b bVar, Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(l lVar, com.google.gson.c cVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<ReflectionAccessFilter> list) {
        this.a = lVar;
        this.b = cVar;
        this.f6793c = excluder;
        this.f6794d = jsonAdapterAnnotationTypeAdapterFactory;
        this.f6795e = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!x.a(accessibleObject, obj)) {
            throw new j(e.a.a.a.a.s(com.google.gson.internal.H.a.f(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ea  */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a> c(com.google.gson.Gson r37, com.google.gson.u.a<?> r38, java.lang.Class<?> r39, boolean r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.Gson, com.google.gson.u.a, java.lang.Class, boolean, boolean):java.util.Map");
    }

    private boolean d(Field field, boolean z) {
        return (this.f6793c.b(field.getType(), z) || this.f6793c.e(field, z)) ? false : true;
    }

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
        Class<? super T> d2 = aVar.d();
        if (!Object.class.isAssignableFrom(d2)) {
            return null;
        }
        ReflectionAccessFilter.FilterResult b = x.b(this.f6795e, d2);
        if (b != ReflectionAccessFilter.FilterResult.BLOCK_ALL) {
            boolean z = b == ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE;
            return com.google.gson.internal.H.a.j(d2) ? new RecordAdapter(d2, c(gson, aVar, d2, z, true), z) : new FieldReflectionAdapter(this.a.b(aVar), c(gson, aVar, d2, z, false));
        }
        throw new j("ReflectionAccessFilter does not permit using reflection for " + d2 + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
