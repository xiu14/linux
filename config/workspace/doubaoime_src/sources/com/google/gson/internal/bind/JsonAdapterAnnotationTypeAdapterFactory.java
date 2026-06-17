package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.l;
import com.google.gson.q;
import com.google.gson.t;

/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements t {
    private final l a;

    public JsonAdapterAnnotationTypeAdapterFactory(l lVar) {
        this.a = lVar;
    }

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
        com.google.gson.annotations.a aVar2 = (com.google.gson.annotations.a) aVar.d().getAnnotation(com.google.gson.annotations.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (TypeAdapter<T>) b(this.a, gson, aVar, aVar2);
    }

    TypeAdapter<?> b(l lVar, Gson gson, com.google.gson.u.a<?> aVar, com.google.gson.annotations.a aVar2) {
        TypeAdapter<?> treeTypeAdapter;
        Object a = lVar.b(com.google.gson.u.a.a(aVar2.value())).a();
        boolean nullSafe = aVar2.nullSafe();
        if (a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) a;
        } else if (a instanceof t) {
            treeTypeAdapter = ((t) a).a(gson, aVar);
        } else {
            boolean z = a instanceof q;
            if (!z && !(a instanceof h)) {
                StringBuilder M = e.a.a.a.a.M("Invalid attempt to bind an instance of ");
                M.append(a.getClass().getName());
                M.append(" as a @JsonAdapter for ");
                M.append(aVar.toString());
                M.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(M.toString());
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z ? (q) a : null, a instanceof h ? (h) a : null, gson, aVar, null, nullSafe);
            nullSafe = false;
        }
        return (treeTypeAdapter == null || !nullSafe) ? treeTypeAdapter : treeTypeAdapter.a();
    }
}
