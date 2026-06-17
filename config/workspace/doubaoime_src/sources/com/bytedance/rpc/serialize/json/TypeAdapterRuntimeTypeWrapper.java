package com.bytedance.rpc.serialize.json;

import com.google.gson.TypeAdapter;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
    @Override // com.google.gson.TypeAdapter
    public T b(com.google.gson.stream.a aVar) throws IOException {
        throw null;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, T t) throws IOException {
        TypeAdapter typeAdapter = null;
        typeAdapter.c(bVar, t);
    }
}
