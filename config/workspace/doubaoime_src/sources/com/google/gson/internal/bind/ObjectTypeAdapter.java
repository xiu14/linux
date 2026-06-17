package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.v;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ObjectTypeAdapter extends TypeAdapter<Object> {

    /* renamed from: c, reason: collision with root package name */
    private static final t f6792c = new AnonymousClass1(ToNumberPolicy.DOUBLE);
    private final Gson a;
    private final s b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$1, reason: invalid class name */
    class AnonymousClass1 implements t {
        final /* synthetic */ s a;

        AnonymousClass1(s sVar) {
            this.a = sVar;
        }

        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            if (aVar.d() == Object.class) {
                return new ObjectTypeAdapter(gson, this.a, null);
            }
            return null;
        }
    }

    ObjectTypeAdapter(Gson gson, s sVar, AnonymousClass1 anonymousClass1) {
        this.a = gson;
        this.b = sVar;
    }

    public static t d(s sVar) {
        return sVar == ToNumberPolicy.DOUBLE ? f6792c : new AnonymousClass1(sVar);
    }

    private Object e(com.google.gson.stream.a aVar, JsonToken jsonToken) throws IOException {
        int ordinal = jsonToken.ordinal();
        if (ordinal == 5) {
            return aVar.Y();
        }
        if (ordinal == 6) {
            return this.b.readNumber(aVar);
        }
        if (ordinal == 7) {
            return Boolean.valueOf(aVar.H());
        }
        if (ordinal == 8) {
            aVar.S();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private Object f(com.google.gson.stream.a aVar, JsonToken jsonToken) throws IOException {
        int ordinal = jsonToken.ordinal();
        if (ordinal == 0) {
            aVar.a();
            return new ArrayList();
        }
        if (ordinal != 2) {
            return null;
        }
        aVar.d();
        return new v();
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(com.google.gson.stream.a aVar) throws IOException {
        JsonToken c0 = aVar.c0();
        Object f2 = f(aVar, c0);
        if (f2 == null) {
            return e(aVar, c0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.z()) {
                String P = f2 instanceof Map ? aVar.P() : null;
                JsonToken c02 = aVar.c0();
                Object f3 = f(aVar, c02);
                boolean z = f3 != null;
                if (f3 == null) {
                    f3 = e(aVar, c02);
                }
                if (f2 instanceof List) {
                    ((List) f2).add(f3);
                } else {
                    ((Map) f2).put(P, f3);
                }
                if (z) {
                    arrayDeque.addLast(f2);
                    f2 = f3;
                }
            } else {
                if (f2 instanceof List) {
                    aVar.o();
                } else {
                    aVar.p();
                }
                if (arrayDeque.isEmpty()) {
                    return f2;
                }
                f2 = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.D();
            return;
        }
        Gson gson = this.a;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(gson);
        TypeAdapter e2 = gson.e(com.google.gson.u.a.a(cls));
        if (!(e2 instanceof ObjectTypeAdapter)) {
            e2.c(bVar, obj);
        } else {
            bVar.h();
            bVar.p();
        }
    }
}
