package com.bumptech.glide.p;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {
    private final List<String> a = new ArrayList();
    private final Map<String, List<a<?, ?>>> b = new HashMap();

    private static class a<T, R> {
        private final Class<T> a;
        final Class<R> b;

        /* renamed from: c, reason: collision with root package name */
        final g<T, R> f1828c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, g<T, R> gVar) {
            this.a = cls;
            this.b = cls2;
            this.f1828c = gVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    @NonNull
    private synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = this.b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.b.put(str, list);
        }
        return list;
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull g<T, R> gVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, gVar));
    }

    @NonNull
    public synchronized <T, R> List<g<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it2 = this.a.iterator();
        while (it2.hasNext()) {
            List<a<?, ?>> list = this.b.get(it2.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f1828c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it2 = this.a.iterator();
        while (it2.hasNext()) {
            List<a<?, ?>> list = this.b.get(it2.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                        arrayList.add(aVar.b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(@NonNull List<String> list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            this.a.add(it2.next());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }
}
