package com.google.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.u;
import com.google.gson.internal.x;
import com.google.gson.stream.JsonToken;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class Gson {
    static final c j = FieldNamingPolicy.IDENTITY;
    static final s k = ToNumberPolicy.DOUBLE;
    static final s l = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    private final ThreadLocal<Map<com.google.gson.u.a<?>, TypeAdapter<?>>> a;
    private final ConcurrentMap<com.google.gson.u.a<?>, TypeAdapter<?>> b;

    /* renamed from: c, reason: collision with root package name */
    private final JsonAdapterAnnotationTypeAdapterFactory f6766c;
    private final com.google.gson.internal.l constructorConstructor;

    /* renamed from: d, reason: collision with root package name */
    final List<t> f6767d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f6768e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f6769f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f6770g;
    final boolean h;
    final boolean i;

    static class FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
        private TypeAdapter<T> a = null;

        FutureTypeAdapter() {
        }

        private TypeAdapter<T> e() {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                return typeAdapter;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.TypeAdapter
        public T b(com.google.gson.stream.a aVar) throws IOException {
            return e().b(aVar);
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, T t) throws IOException {
            e().c(bVar, t);
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public TypeAdapter<T> d() {
            return e();
        }

        public void f(TypeAdapter<T> typeAdapter) {
            if (this.a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.a = typeAdapter;
        }
    }

    public Gson() {
        this(Excluder.f6778f, j, Collections.emptyMap(), false, false, false, true, false, false, false, true, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), k, l, Collections.emptyList());
    }

    static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> T b(String str, com.google.gson.u.a<T> aVar) throws r {
        T t = null;
        if (str == null) {
            return null;
        }
        com.google.gson.stream.a aVar2 = new com.google.gson.stream.a(new StringReader(str));
        aVar2.j0(this.i);
        boolean A = aVar2.A();
        boolean z = true;
        aVar2.j0(true);
        try {
            try {
                try {
                    aVar2.c0();
                    z = false;
                    t = e(aVar).b(aVar2);
                } catch (EOFException e2) {
                    if (!z) {
                        throw new r(e2);
                    }
                } catch (AssertionError e3) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
                }
                if (t != null) {
                    try {
                        if (aVar2.c0() != JsonToken.END_DOCUMENT) {
                            throw new r("JSON document was not fully consumed.");
                        }
                    } catch (com.google.gson.stream.c e4) {
                        throw new r(e4);
                    } catch (IOException e5) {
                        throw new j(e5);
                    }
                }
                return t;
            } catch (IOException e6) {
                throw new r(e6);
            } catch (IllegalStateException e7) {
                throw new r(e7);
            }
        } finally {
            aVar2.j0(A);
        }
    }

    public <T> T c(String str, Class<T> cls) throws r {
        Object b = b(str, com.google.gson.u.a.a(cls));
        if (cls == Integer.TYPE) {
            cls = (Class<T>) Integer.class;
        } else if (cls == Float.TYPE) {
            cls = (Class<T>) Float.class;
        } else if (cls == Byte.TYPE) {
            cls = (Class<T>) Byte.class;
        } else if (cls == Double.TYPE) {
            cls = (Class<T>) Double.class;
        } else if (cls == Long.TYPE) {
            cls = (Class<T>) Long.class;
        } else if (cls == Character.TYPE) {
            cls = (Class<T>) Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = (Class<T>) Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = (Class<T>) Short.class;
        } else if (cls == Void.TYPE) {
            cls = (Class<T>) Void.class;
        }
        return cls.cast(b);
    }

    public <T> T d(String str, Type type) throws r {
        return (T) b(str, com.google.gson.u.a.b(type));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r3.f(r2);
        r0.put(r7, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.google.gson.TypeAdapter<T> e(com.google.gson.u.a<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<com.google.gson.u.a<?>, com.google.gson.TypeAdapter<?>> r0 = r6.b
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.u.a<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            r1 = 0
            if (r0 != 0) goto L27
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.u.a<?>, com.google.gson.TypeAdapter<?>>> r1 = r6.a
            r1.set(r0)
            r1 = 1
            goto L30
        L27:
            java.lang.Object r2 = r0.get(r7)
            com.google.gson.TypeAdapter r2 = (com.google.gson.TypeAdapter) r2
            if (r2 == 0) goto L30
            return r2
        L30:
            r2 = 0
            com.google.gson.Gson$FutureTypeAdapter r3 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L7f
            r3.<init>()     // Catch: java.lang.Throwable -> L7f
            r0.put(r7, r3)     // Catch: java.lang.Throwable -> L7f
            java.util.List<com.google.gson.t> r4 = r6.f6767d     // Catch: java.lang.Throwable -> L7f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L7f
        L3f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r5 == 0) goto L57
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L7f
            com.google.gson.t r2 = (com.google.gson.t) r2     // Catch: java.lang.Throwable -> L7f
            com.google.gson.TypeAdapter r2 = r2.a(r6, r7)     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L3f
            r3.f(r2)     // Catch: java.lang.Throwable -> L7f
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L7f
        L57:
            if (r1 == 0) goto L5e
            java.lang.ThreadLocal<java.util.Map<com.google.gson.u.a<?>, com.google.gson.TypeAdapter<?>>> r3 = r6.a
            r3.remove()
        L5e:
            if (r2 == 0) goto L68
            if (r1 == 0) goto L67
            java.util.concurrent.ConcurrentMap<com.google.gson.u.a<?>, com.google.gson.TypeAdapter<?>> r7 = r6.b
            r7.putAll(r0)
        L67:
            return r2
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.10.1) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L7f:
            r7 = move-exception
            if (r1 == 0) goto L87
            java.lang.ThreadLocal<java.util.Map<com.google.gson.u.a<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.a
            r0.remove()
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.e(com.google.gson.u.a):com.google.gson.TypeAdapter");
    }

    public <T> TypeAdapter<T> f(t tVar, com.google.gson.u.a<T> aVar) {
        if (!this.f6767d.contains(tVar)) {
            tVar = this.f6766c;
        }
        boolean z = false;
        for (t tVar2 : this.f6767d) {
            if (z) {
                TypeAdapter<T> a = tVar2.a(this, aVar);
                if (a != null) {
                    return a;
                }
            } else if (tVar2 == tVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public com.google.gson.stream.a g(Reader reader) {
        com.google.gson.stream.a aVar = new com.google.gson.stream.a(reader);
        aVar.j0(this.i);
        return aVar;
    }

    public com.google.gson.stream.b h(Writer writer) throws IOException {
        if (this.f6769f) {
            writer.write(")]}'\n");
        }
        com.google.gson.stream.b bVar = new com.google.gson.stream.b(writer);
        if (this.h) {
            bVar.N("  ");
        }
        bVar.M(this.f6770g);
        bVar.P(this.i);
        bVar.Q(this.f6768e);
        return bVar;
    }

    public String i(i iVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            k(iVar, h(x.e(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new j(e2);
        }
    }

    public String j(Object obj) {
        if (obj == null) {
            return i(k.a);
        }
        Class<?> cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            l(obj, cls, h(x.e(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new j(e2);
        }
    }

    public void k(i iVar, com.google.gson.stream.b bVar) throws j {
        boolean w = bVar.w();
        bVar.P(true);
        boolean s = bVar.s();
        bVar.M(this.f6770g);
        boolean r = bVar.r();
        bVar.Q(this.f6768e);
        try {
            try {
                TypeAdapters.V.c(bVar, iVar);
            } catch (IOException e2) {
                throw new j(e2);
            } catch (AssertionError e3) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e3.getMessage(), e3);
            }
        } finally {
            bVar.P(w);
            bVar.M(s);
            bVar.Q(r);
        }
    }

    public void l(Object obj, Type type, com.google.gson.stream.b bVar) throws j {
        TypeAdapter e2 = e(com.google.gson.u.a.b(type));
        boolean w = bVar.w();
        bVar.P(true);
        boolean s = bVar.s();
        bVar.M(this.f6770g);
        boolean r = bVar.r();
        bVar.Q(this.f6768e);
        try {
            try {
                e2.c(bVar, obj);
            } catch (IOException e3) {
                throw new j(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e4.getMessage(), e4);
            }
        } finally {
            bVar.P(w);
            bVar.M(s);
            bVar.Q(r);
        }
    }

    public i m(Object obj) {
        if (obj == null) {
            return k.a;
        }
        Type type = obj.getClass();
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        l(obj, type, bVar);
        return bVar.l0();
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("{serializeNulls:");
        M.append(this.f6768e);
        M.append(",factories:");
        M.append(this.f6767d);
        M.append(",instanceCreators:");
        M.append(this.constructorConstructor);
        M.append("}");
        return M.toString();
    }

    Gson(Excluder excluder, c cVar, Map<Type, e<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<t> list, List<t> list2, List<t> list3, s sVar, s sVar2, List<ReflectionAccessFilter> list4) {
        final TypeAdapter<Number> typeAdapter;
        TypeAdapter<Number> typeAdapter2;
        TypeAdapter<Number> typeAdapter3;
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        com.google.gson.internal.l lVar = new com.google.gson.internal.l(map, z8, list4);
        this.constructorConstructor = lVar;
        this.f6768e = z;
        this.f6769f = z3;
        this.f6770g = z4;
        this.h = z5;
        this.i = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.W);
        arrayList.add(ObjectTypeAdapter.d(sVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.C);
        arrayList.add(TypeAdapters.m);
        arrayList.add(TypeAdapters.f6816g);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.k);
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            typeAdapter = TypeAdapters.t;
        } else {
            typeAdapter = new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
                @Override // com.google.gson.TypeAdapter
                public Number b(com.google.gson.stream.a aVar) throws IOException {
                    if (aVar.c0() != JsonToken.NULL) {
                        return Long.valueOf(aVar.N());
                    }
                    aVar.S();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        bVar.D();
                    } else {
                        bVar.e0(number2.toString());
                    }
                }
            };
        }
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, typeAdapter));
        Class cls = Double.TYPE;
        if (z7) {
            typeAdapter2 = TypeAdapters.v;
        } else {
            typeAdapter2 = new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.1
                @Override // com.google.gson.TypeAdapter
                public Number b(com.google.gson.stream.a aVar) throws IOException {
                    if (aVar.c0() != JsonToken.NULL) {
                        return Double.valueOf(aVar.I());
                    }
                    aVar.S();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        bVar.D();
                        return;
                    }
                    double doubleValue = number2.doubleValue();
                    Gson.a(doubleValue);
                    bVar.U(doubleValue);
                }
            };
        }
        arrayList.add(TypeAdapters.c(cls, Double.class, typeAdapter2));
        Class cls2 = Float.TYPE;
        if (z7) {
            typeAdapter3 = TypeAdapters.u;
        } else {
            typeAdapter3 = new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.2
                @Override // com.google.gson.TypeAdapter
                public Number b(com.google.gson.stream.a aVar) throws IOException {
                    if (aVar.c0() != JsonToken.NULL) {
                        return Float.valueOf((float) aVar.I());
                    }
                    aVar.S();
                    return null;
                }

                @Override // com.google.gson.TypeAdapter
                public void c(com.google.gson.stream.b bVar, Number number) throws IOException {
                    Number number2 = number;
                    if (number2 == null) {
                        bVar.D();
                        return;
                    }
                    float floatValue = number2.floatValue();
                    Gson.a(floatValue);
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(floatValue);
                    }
                    bVar.c0(number2);
                }
            };
        }
        arrayList.add(TypeAdapters.c(cls2, Float.class, typeAdapter3));
        arrayList.add(NumberTypeAdapter.d(sVar2));
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.E);
        arrayList.add(TypeAdapters.G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.b(u.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.I);
        arrayList.add(TypeAdapters.K);
        arrayList.add(TypeAdapters.O);
        arrayList.add(TypeAdapters.Q);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TypeAdapters.M);
        arrayList.add(TypeAdapters.f6813d);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.S);
        if (com.google.gson.internal.sql.a.a) {
            arrayList.add(com.google.gson.internal.sql.a.f6825e);
            arrayList.add(com.google.gson.internal.sql.a.f6824d);
            arrayList.add(com.google.gson.internal.sql.a.f6826f);
        }
        arrayList.add(ArrayTypeAdapter.f6789c);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(lVar));
        arrayList.add(new MapTypeAdapterFactory(lVar, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(lVar);
        this.f6766c = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(lVar, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.f6767d = Collections.unmodifiableList(arrayList);
    }
}
