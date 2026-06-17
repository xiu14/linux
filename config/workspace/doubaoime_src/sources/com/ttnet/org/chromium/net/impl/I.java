package com.ttnet.org.chromium.net.impl;

import android.util.Pair;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.l;
import com.ttnet.org.chromium.net.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class I extends l.a {
    private final AbstractC0763c a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final F.b f8709c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f8710d;

    /* renamed from: e, reason: collision with root package name */
    private String f8711e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8713g;
    private com.ttnet.org.chromium.net.D i;
    private Executor j;
    private boolean k;
    private int l;
    private boolean m;
    private int n;
    private u.a o;
    private int q;
    private int r;
    private int s;
    private int t;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<Pair<String, String>> f8712f = new ArrayList<>();
    private int h = 3;
    private long p = -1;

    I(String str, F.b bVar, Executor executor, AbstractC0763c abstractC0763c) {
        Objects.requireNonNull(str, "URL is required.");
        Objects.requireNonNull(bVar, "Callback is required.");
        Objects.requireNonNull(executor, "Executor is required.");
        this.b = str;
        this.f8709c = bVar;
        this.f8710d = executor;
        this.a = abstractC0763c;
    }

    @Override // com.ttnet.org.chromium.net.F.a
    public F.a a(int i) {
        this.t = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.F.a
    public F.a b(int i) {
        this.q = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.F.a
    public F.a c(int i) {
        this.r = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.F.a
    public F.a d(int i) {
        this.s = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a e(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f8712f.add(Pair.create(str, str2));
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public com.ttnet.org.chromium.net.l f() {
        H V = this.a.V(this.b, this.f8709c, this.f8710d, this.h, null, this.f8713g, false, false, this.k, this.l, this.m, this.n, this.o, 0, this.p);
        String str = this.f8711e;
        if (str != null) {
            V.q(str);
        }
        Iterator<Pair<String, String>> it2 = this.f8712f.iterator();
        while (it2.hasNext()) {
            Pair<String, String> next = it2.next();
            V.p((String) next.first, (String) next.second);
        }
        com.ttnet.org.chromium.net.D d2 = this.i;
        if (d2 != null) {
            V.v(d2, this.j);
        }
        V.s(this.q);
        V.t(this.r);
        V.u(this.s);
        V.r(this.t);
        return V;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a g() {
        this.f8713g = true;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a h(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f8711e = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a i(int i) {
        this.h = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a j(u.a aVar) {
        this.o = aVar;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a k(int i) {
        this.k = true;
        this.l = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a l(int i) {
        this.m = true;
        this.n = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.l.a
    public l.a m(com.ttnet.org.chromium.net.D d2, Executor executor) {
        Objects.requireNonNull(d2, "Invalid UploadDataProvider.");
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        if (this.f8711e == null) {
            this.f8711e = "POST";
        }
        this.i = d2;
        this.j = executor;
        return this;
    }
}
