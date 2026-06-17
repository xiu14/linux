package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.engine.t;
import com.bumptech.glide.load.engine.v;
import com.bumptech.glide.load.j.o;
import com.bumptech.glide.load.j.p;
import com.bumptech.glide.load.j.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    private final q a;
    private final com.bumptech.glide.p.a b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.p.e f1548c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.p.f f1549d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f1550e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.k.g.f f1551f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.p.b f1552g;
    private final com.bumptech.glide.p.d h = new com.bumptech.glide.p.d();
    private final com.bumptech.glide.p.c i = new com.bumptech.glide.p.c();
    private final Pools.Pool<List<Throwable>> j;

    public static class a extends RuntimeException {
        public a(@NonNull String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@androidx.annotation.NonNull java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = e.a.a.a.a.M(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.c.<init>(java.lang.Object):void");
        }

        public <M> c(@NonNull M m, @NonNull List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }

        public c(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class d extends a {
        public d(@NonNull Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(@NonNull Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public g() {
        Pools.Pool<List<Throwable>> b2 = com.bumptech.glide.util.k.a.b();
        this.j = b2;
        this.a = new q(b2);
        this.b = new com.bumptech.glide.p.a();
        this.f1548c = new com.bumptech.glide.p.e();
        this.f1549d = new com.bumptech.glide.p.f();
        this.f1550e = new com.bumptech.glide.load.data.f();
        this.f1551f = new com.bumptech.glide.load.k.g.f();
        this.f1552g = new com.bumptech.glide.p.b();
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it2 = asList.iterator();
        while (it2.hasNext()) {
            arrayList.add((String) it2.next());
        }
        arrayList.add("legacy_append");
        this.f1548c.e(arrayList);
    }

    @NonNull
    public <Data> g a(@NonNull Class<Data> cls, @NonNull com.bumptech.glide.load.a<Data> aVar) {
        this.b.a(cls, aVar);
        return this;
    }

    @NonNull
    public <TResource> g b(@NonNull Class<TResource> cls, @NonNull com.bumptech.glide.load.h<TResource> hVar) {
        this.f1549d.a(cls, hVar);
        return this;
    }

    @NonNull
    public <Data, TResource> g c(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull com.bumptech.glide.load.g<Data, TResource> gVar) {
        this.f1548c.a("legacy_append", gVar, cls, cls2);
        return this;
    }

    @NonNull
    public <Model, Data> g d(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull p<Model, Data> pVar) {
        this.a.a(cls, cls2, pVar);
        return this;
    }

    @NonNull
    public <Data, TResource> g e(@NonNull String str, @NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull com.bumptech.glide.load.g<Data, TResource> gVar) {
        this.f1548c.a(str, gVar, cls, cls2);
        return this;
    }

    @NonNull
    public List<ImageHeaderParser> f() {
        List<ImageHeaderParser> b2 = this.f1552g.b();
        if (b2.isEmpty()) {
            throw new b();
        }
        return b2;
    }

    @Nullable
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> g(@NonNull Class<Data> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        t<Data, TResource, Transcode> a2 = this.i.a(cls, cls2, cls3);
        if (this.i.b(a2)) {
            return null;
        }
        if (a2 == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) this.f1548c.d(cls, cls2)).iterator();
            while (it2.hasNext()) {
                Class cls4 = (Class) it2.next();
                Iterator it3 = ((ArrayList) this.f1551f.b(cls4, cls3)).iterator();
                while (it3.hasNext()) {
                    Class cls5 = (Class) it3.next();
                    arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f1548c.b(cls, cls4), this.f1551f.a(cls4, cls5), this.j));
                }
            }
            a2 = arrayList.isEmpty() ? null : new t<>(cls, cls2, cls3, arrayList, this.j);
            this.i.c(cls, cls2, cls3, a2);
        }
        return a2;
    }

    @NonNull
    public <Model> List<o<Model, ?>> h(@NonNull Model model) {
        return this.a.c(model);
    }

    @NonNull
    public <Model, TResource, Transcode> List<Class<?>> i(@NonNull Class<Model> cls, @NonNull Class<TResource> cls2, @NonNull Class<Transcode> cls3) {
        List<Class<?>> a2 = this.h.a(cls, cls2, cls3);
        List<Class<?>> list = a2;
        if (a2 == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) this.a.b(cls)).iterator();
            while (it2.hasNext()) {
                Iterator it3 = ((ArrayList) this.f1548c.d((Class) it2.next(), cls2)).iterator();
                while (it3.hasNext()) {
                    Class cls4 = (Class) it3.next();
                    if (!((ArrayList) this.f1551f.b(cls4, cls3)).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list = arrayList;
        }
        return list;
    }

    @NonNull
    public <X> com.bumptech.glide.load.h<X> j(@NonNull v<X> vVar) throws d {
        com.bumptech.glide.load.h<X> b2 = this.f1549d.b(vVar.c());
        if (b2 != null) {
            return b2;
        }
        throw new d(vVar.c());
    }

    @NonNull
    public <X> com.bumptech.glide.load.data.e<X> k(@NonNull X x) {
        return this.f1550e.a(x);
    }

    @NonNull
    public <X> com.bumptech.glide.load.a<X> l(@NonNull X x) throws e {
        com.bumptech.glide.load.a<X> b2 = this.b.b(x.getClass());
        if (b2 != null) {
            return b2;
        }
        throw new e(x.getClass());
    }

    public boolean m(@NonNull v<?> vVar) {
        return this.f1549d.b(vVar.c()) != null;
    }

    @NonNull
    public g n(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f1552g.a(imageHeaderParser);
        return this;
    }

    @NonNull
    public g o(@NonNull e.a<?> aVar) {
        this.f1550e.b(aVar);
        return this;
    }

    @NonNull
    public <TResource, Transcode> g p(@NonNull Class<TResource> cls, @NonNull Class<Transcode> cls2, @NonNull com.bumptech.glide.load.k.g.e<TResource, Transcode> eVar) {
        this.f1551f.c(cls, cls2, eVar);
        return this;
    }
}
