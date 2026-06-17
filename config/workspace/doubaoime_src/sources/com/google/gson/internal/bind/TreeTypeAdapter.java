package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.t;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    private final q<T> a;
    private final h<T> b;

    /* renamed from: c, reason: collision with root package name */
    final Gson f6802c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.gson.u.a<T> f6803d;

    /* renamed from: e, reason: collision with root package name */
    private final t f6804e;

    /* renamed from: f, reason: collision with root package name */
    private final TreeTypeAdapter<T>.b f6805f = new b(this, null);

    /* renamed from: g, reason: collision with root package name */
    private final boolean f6806g;
    private volatile TypeAdapter<T> h;

    private static final class SingleTypeFactory implements t {
        private final com.google.gson.u.a<?> a;
        private final boolean b;

        /* renamed from: c, reason: collision with root package name */
        private final Class<?> f6807c;

        /* renamed from: d, reason: collision with root package name */
        private final q<?> f6808d;

        /* renamed from: e, reason: collision with root package name */
        private final h<?> f6809e;

        SingleTypeFactory(Object obj, com.google.gson.u.a<?> aVar, boolean z, Class<?> cls) {
            q<?> qVar = obj instanceof q ? (q) obj : null;
            this.f6808d = qVar;
            h<?> hVar = obj instanceof h ? (h) obj : null;
            this.f6809e = hVar;
            com.bytedance.feedbackerlib.a.h((qVar == null && hVar == null) ? false : true);
            this.a = aVar;
            this.b = z;
            this.f6807c = null;
        }

        @Override // com.google.gson.t
        public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
            com.google.gson.u.a<?> aVar2 = this.a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.b && this.a.e() == aVar.d()) : this.f6807c.isAssignableFrom(aVar.d())) {
                return new TreeTypeAdapter(this.f6808d, this.f6809e, gson, aVar, this, true);
            }
            return null;
        }
    }

    private final class b implements p, g {
        b(TreeTypeAdapter treeTypeAdapter, a aVar) {
        }
    }

    public TreeTypeAdapter(q<T> qVar, h<T> hVar, Gson gson, com.google.gson.u.a<T> aVar, t tVar, boolean z) {
        this.a = qVar;
        this.b = hVar;
        this.f6802c = gson;
        this.f6803d = aVar;
        this.f6804e = tVar;
        this.f6806g = z;
    }

    private TypeAdapter<T> e() {
        TypeAdapter<T> typeAdapter = this.h;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter<T> f2 = this.f6802c.f(this.f6804e, this.f6803d);
        this.h = f2;
        return f2;
    }

    public static t f(com.google.gson.u.a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.e() == aVar.d(), null);
    }

    @Override // com.google.gson.TypeAdapter
    public T b(com.google.gson.stream.a aVar) throws IOException {
        if (this.b == null) {
            return e().b(aVar);
        }
        i d2 = x.d(aVar);
        if (this.f6806g) {
            Objects.requireNonNull(d2);
            if (d2 instanceof k) {
                return null;
            }
        }
        return this.b.a(d2, this.f6803d.e(), this.f6805f);
    }

    @Override // com.google.gson.TypeAdapter
    public void c(com.google.gson.stream.b bVar, T t) throws IOException {
        q<T> qVar = this.a;
        if (qVar == null) {
            e().c(bVar, t);
        } else if (this.f6806g && t == null) {
            bVar.D();
        } else {
            TypeAdapters.V.c(bVar, qVar.a(t, this.f6803d.e(), this.f6805f));
        }
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public TypeAdapter<T> d() {
        return this.a != null ? this : e();
    }
}
