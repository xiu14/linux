package com.google.gson;

import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class TypeAdapter<T> {

    /* renamed from: com.google.gson.TypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<T> {
        AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        public T b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.c0() != JsonToken.NULL) {
                return (T) TypeAdapter.this.b(aVar);
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, T t) throws IOException {
            if (t == null) {
                bVar.D();
            } else {
                TypeAdapter.this.c(bVar, t);
            }
        }
    }

    public final TypeAdapter<T> a() {
        return new AnonymousClass1();
    }

    public abstract T b(com.google.gson.stream.a aVar) throws IOException;

    public abstract void c(com.google.gson.stream.b bVar, T t) throws IOException;
}
