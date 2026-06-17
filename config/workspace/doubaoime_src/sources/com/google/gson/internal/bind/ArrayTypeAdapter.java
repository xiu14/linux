package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C0746a;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    public static final t f6789c = new t() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            Type e2 = aVar.e();
            boolean z = e2 instanceof GenericArrayType;
            if (!z && (!(e2 instanceof Class) || !((Class) e2).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) e2).getGenericComponentType() : ((Class) e2).getComponentType();
            return new ArrayTypeAdapter(gson, gson.e(com.google.gson.u.a.b(genericComponentType)), C0746a.g(genericComponentType));
        }
    };
    private final Class<E> a;
    private final TypeAdapter<E> b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.c0() == JsonToken.NULL) {
            aVar.S();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.z()) {
            arrayList.add(this.b.b(aVar));
        }
        aVar.o();
        int size = arrayList.size();
        if (!this.a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.a, size));
        }
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.D();
            return;
        }
        bVar.d();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(bVar, Array.get(obj, i));
        }
        bVar.o();
    }
}
