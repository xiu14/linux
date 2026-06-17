package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    /* renamed from: c, reason: collision with root package name */
    private final Type f6810c;

    TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.a = gson;
        this.b = typeAdapter;
        this.f6810c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public T b(com.google.gson.stream.a aVar) throws IOException {
        return this.b.b(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, T t) throws IOException {
        TypeAdapter<T> d2;
        TypeAdapter<T> typeAdapter = this.b;
        Type type = this.f6810c;
        if (t != null && ((type instanceof Class) || (type instanceof TypeVariable))) {
            type = t.getClass();
        }
        if (type != this.f6810c) {
            typeAdapter = this.a.e(com.google.gson.u.a.b(type));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter2 = this.b;
                while ((typeAdapter2 instanceof SerializationDelegatingTypeAdapter) && (d2 = ((SerializationDelegatingTypeAdapter) typeAdapter2).d()) != typeAdapter2) {
                    typeAdapter2 = d2;
                }
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = this.b;
                }
            }
        }
        typeAdapter.c(bVar, t);
    }
}
