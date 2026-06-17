package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class f {
    private static final e.a<?> b = new a();
    private final Map<Class<?>, e.a<?>> a = new HashMap();

    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        @NonNull
        public e<Object> b(@NonNull Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e<Object> {
        private final Object a;

        b(@NonNull Object obj) {
            this.a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        @NonNull
        public Object a() {
            return this.a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    @NonNull
    public synchronized <T> e<T> a(@NonNull T t) {
        e.a<?> aVar;
        Objects.requireNonNull(t, "Argument must not be null");
        aVar = this.a.get(t.getClass());
        if (aVar == null) {
            Iterator<e.a<?>> it2 = this.a.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                e.a<?> next = it2.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = b;
        }
        return (e<T>) aVar.b(t);
    }

    public synchronized void b(@NonNull e.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
