package com.ttnet.org.chromium.net.impl;

import android.util.Log;
import com.ttnet.org.chromium.net.B;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class G extends B.a {
    private static final String p = "G";
    private final AbstractC0763c a;
    private final B.b b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8704c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f8705d;

    /* renamed from: e, reason: collision with root package name */
    private int f8706e;

    /* renamed from: f, reason: collision with root package name */
    private String f8707f;

    /* renamed from: g, reason: collision with root package name */
    private long f8708g;
    private int h;
    private long i;
    private String j;
    private int k;
    private Map<String, String> l;
    private Map<String, String> m;
    private boolean n = true;
    private boolean o = true;

    G(B.b bVar, Executor executor, AbstractC0763c abstractC0763c) {
        Log.e(p, "TTWebsocketConnectionBuilderImpl");
        this.a = abstractC0763c;
        this.b = bVar;
        this.f8704c = executor;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public com.ttnet.org.chromium.net.B a() {
        return this.o ? this.a.W(this.b, this.f8704c, this.f8705d, this.f8706e, this.f8707f, this.f8708g, this.h, this.i, this.j, this.k, null, this.l, this.m, this.n) : this.a.X(this.b, this.f8704c, this.f8705d, this.l, this.m, this.n);
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a b(int i) {
        this.f8706e = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a c(String str) {
        this.f8707f = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a d(int i) {
        this.k = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a e(Map<String, String> map) {
        this.m = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a f(Map<String, String> map) {
        this.l = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a g(long j) {
        this.f8708g = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a h(int i) {
        this.h = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a i(long j) {
        this.i = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a j(String str) {
        this.j = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a k(boolean z) {
        this.n = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a l(List<String> list) {
        this.f8705d = list;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.B.a
    public B.a m(boolean z) {
        this.o = z;
        return this;
    }
}
