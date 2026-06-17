package com.bumptech.glide;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import com.bumptech.glide.load.engine.C.a;
import com.bumptech.glide.load.engine.C.j;
import com.bumptech.glide.manager.n;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.k f1538c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.B.d f1539d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.B.b f1540e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.C.i f1541f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.D.a f1542g;
    private com.bumptech.glide.load.engine.D.a h;
    private a.InterfaceC0022a i;
    private com.bumptech.glide.load.engine.C.j j;
    private com.bumptech.glide.manager.c k;

    @Nullable
    private n.b n;
    private com.bumptech.glide.load.engine.D.a o;

    @Nullable
    private List<com.bumptech.glide.request.g<Object>> p;
    private final Map<Class<?>, l<?, ?>> a = new ArrayMap();
    private final f.a b = new f.a();
    private int l = 4;
    private c.a m = new a(this);

    class a implements c.a {
        a(d dVar) {
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public com.bumptech.glide.request.h build() {
            return new com.bumptech.glide.request.h();
        }
    }

    class b implements c.a {
        final /* synthetic */ com.bumptech.glide.request.h a;

        b(d dVar, com.bumptech.glide.request.h hVar) {
            this.a = hVar;
        }

        @Override // com.bumptech.glide.c.a
        @NonNull
        public com.bumptech.glide.request.h build() {
            com.bumptech.glide.request.h hVar = this.a;
            return hVar != null ? hVar : new com.bumptech.glide.request.h();
        }
    }

    static final class c {
        c() {
        }
    }

    /* renamed from: com.bumptech.glide.d$d, reason: collision with other inner class name */
    public static final class C0020d {
    }

    @NonNull
    com.bumptech.glide.c a(@NonNull Context context, List<com.bumptech.glide.o.b> list, com.bumptech.glide.o.a aVar) {
        if (this.f1542g == null) {
            this.f1542g = com.bumptech.glide.load.engine.D.a.d();
        }
        if (this.h == null) {
            this.h = com.bumptech.glide.load.engine.D.a.c();
        }
        if (this.o == null) {
            this.o = com.bumptech.glide.load.engine.D.a.b();
        }
        if (this.j == null) {
            this.j = new j.a(context).a();
        }
        if (this.k == null) {
            this.k = new com.bumptech.glide.manager.e();
        }
        if (this.f1539d == null) {
            int b2 = this.j.b();
            if (b2 > 0) {
                this.f1539d = new com.bumptech.glide.load.engine.B.j(b2);
            } else {
                this.f1539d = new com.bumptech.glide.load.engine.B.e();
            }
        }
        if (this.f1540e == null) {
            this.f1540e = new com.bumptech.glide.load.engine.B.i(this.j.a());
        }
        if (this.f1541f == null) {
            this.f1541f = new com.bumptech.glide.load.engine.C.h(this.j.c());
        }
        if (this.i == null) {
            this.i = new com.bumptech.glide.load.engine.C.g(context);
        }
        if (this.f1538c == null) {
            this.f1538c = new com.bumptech.glide.load.engine.k(this.f1541f, this.i, this.h, this.f1542g, com.bumptech.glide.load.engine.D.a.e(), this.o, false);
        }
        List<com.bumptech.glide.request.g<Object>> list2 = this.p;
        if (list2 == null) {
            this.p = Collections.emptyList();
        } else {
            this.p = Collections.unmodifiableList(list2);
        }
        f.a aVar2 = this.b;
        Objects.requireNonNull(aVar2);
        return new com.bumptech.glide.c(context, this.f1538c, this.f1541f, this.f1539d, this.f1540e, new n(this.n), this.k, this.l, this.m, this.a, this.p, list, aVar, new f(aVar2));
    }

    @NonNull
    public d b(@Nullable com.bumptech.glide.request.h hVar) {
        this.m = new b(this, hVar);
        return this;
    }

    @NonNull
    public d c(@Nullable a.InterfaceC0022a interfaceC0022a) {
        this.i = interfaceC0022a;
        return this;
    }

    @NonNull
    public d d(@Nullable com.bumptech.glide.load.engine.C.i iVar) {
        this.f1541f = iVar;
        return this;
    }

    void e(@Nullable n.b bVar) {
        this.n = bVar;
    }
}
