package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C0746a;
import com.google.gson.internal.l;
import com.google.gson.internal.w;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements t {
    private final l a;

    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        private final TypeAdapter<E> a;
        private final w<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, w<? extends Collection<E>> wVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = wVar;
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(com.google.gson.stream.a aVar) throws IOException {
            if (aVar.c0() == JsonToken.NULL) {
                aVar.S();
                return null;
            }
            Collection<E> a = this.b.a();
            aVar.a();
            while (aVar.z()) {
                a.add(this.a.b(aVar));
            }
            aVar.o();
            return a;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.D();
                return;
            }
            bVar.d();
            Iterator<E> it2 = collection.iterator();
            while (it2.hasNext()) {
                this.a.c(bVar, it2.next());
            }
            bVar.o();
        }
    }

    public CollectionTypeAdapterFactory(l lVar) {
        this.a = lVar;
    }

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> d2 = aVar.d();
        if (!Collection.class.isAssignableFrom(d2)) {
            return null;
        }
        Type d3 = C0746a.d(e2, d2);
        return new Adapter(gson, d3, gson.e(com.google.gson.u.a.b(d3)), this.a.b(aVar));
    }
}
