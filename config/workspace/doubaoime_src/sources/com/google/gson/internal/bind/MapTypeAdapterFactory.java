package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.C0746a;
import com.google.gson.internal.l;
import com.google.gson.internal.w;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements t {
    private final l a;
    final boolean b;

    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> a;
        private final TypeAdapter<V> b;

        /* renamed from: c, reason: collision with root package name */
        private final w<? extends Map<K, V>> f6790c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, w<? extends Map<K, V>> wVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f6790c = wVar;
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(com.google.gson.stream.a aVar) throws IOException {
            JsonToken c0 = aVar.c0();
            if (c0 == JsonToken.NULL) {
                aVar.S();
                return null;
            }
            Map<K, V> a = this.f6790c.a();
            if (c0 == JsonToken.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.z()) {
                    aVar.a();
                    K b = this.a.b(aVar);
                    if (a.put(b, this.b.b(aVar)) != null) {
                        throw new r(e.a.a.a.a.q("duplicate key: ", b));
                    }
                    aVar.o();
                }
                aVar.o();
            } else {
                aVar.d();
                while (aVar.z()) {
                    com.google.gson.internal.t.a.a(aVar);
                    K b2 = this.a.b(aVar);
                    if (a.put(b2, this.b.b(aVar)) != null) {
                        throw new r(e.a.a.a.a.q("duplicate key: ", b2));
                    }
                }
                aVar.p();
            }
            return a;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                bVar.D();
                return;
            }
            if (!MapTypeAdapterFactory.this.b) {
                bVar.h();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.z(String.valueOf(entry.getKey()));
                    this.b.c(bVar, entry.getValue());
                }
                bVar.p();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                TypeAdapter<K> typeAdapter = this.a;
                K key = entry2.getKey();
                Objects.requireNonNull(typeAdapter);
                try {
                    b bVar2 = new b();
                    typeAdapter.c(bVar2, key);
                    i l0 = bVar2.l0();
                    arrayList.add(l0);
                    arrayList2.add(entry2.getValue());
                    Objects.requireNonNull(l0);
                    z |= (l0 instanceof f) || (l0 instanceof com.google.gson.l);
                } catch (IOException e2) {
                    throw new j(e2);
                }
            }
            if (z) {
                bVar.d();
                int size = arrayList.size();
                while (i < size) {
                    bVar.d();
                    TypeAdapters.V.c(bVar, (i) arrayList.get(i));
                    this.b.c(bVar, arrayList2.get(i));
                    bVar.o();
                    i++;
                }
                bVar.o();
                return;
            }
            bVar.h();
            int size2 = arrayList.size();
            while (i < size2) {
                i iVar = (i) arrayList.get(i);
                Objects.requireNonNull(iVar);
                if (iVar instanceof o) {
                    o b = iVar.b();
                    if (b.k()) {
                        str = String.valueOf(b.h());
                    } else if (b.i()) {
                        str = Boolean.toString(b.d());
                    } else {
                        if (!b.l()) {
                            throw new AssertionError();
                        }
                        str = b.c();
                    }
                } else {
                    if (!(iVar instanceof k)) {
                        throw new AssertionError();
                    }
                    str = "null";
                }
                bVar.z(str);
                this.b.c(bVar, arrayList2.get(i));
                i++;
            }
            bVar.p();
        }
    }

    public MapTypeAdapterFactory(l lVar, boolean z) {
        this.a = lVar;
        this.b = z;
    }

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> d2 = aVar.d();
        if (!Map.class.isAssignableFrom(d2)) {
            return null;
        }
        Type[] f2 = C0746a.f(e2, d2);
        Type type = f2[0];
        return new Adapter(gson, f2[0], (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f6815f : gson.e(com.google.gson.u.a.b(type)), f2[1], gson.e(com.google.gson.u.a.b(f2[1])), this.a.b(aVar));
    }
}
