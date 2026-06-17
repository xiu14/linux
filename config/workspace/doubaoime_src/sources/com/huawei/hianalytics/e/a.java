package com.huawei.hianalytics.e;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    static Map<String, e> f7026e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f7027f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static a f7028g;
    private d a = new d();
    private f b = null;

    /* renamed from: c, reason: collision with root package name */
    private g f7029c = new g();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7030d = false;

    private a() {
    }

    public static a a() {
        if (f7028g == null) {
            synchronized (a.class) {
                if (f7028g == null) {
                    f7028g = new a();
                }
            }
        }
        return f7028g;
    }

    public final e a(String str) {
        return f7026e.get(str);
    }

    public final void a(f fVar) {
        synchronized (f7027f) {
            this.b = fVar;
            this.f7030d = true;
        }
    }

    public final void a(String str, e eVar) {
        f7026e.put(str, eVar);
    }

    public final Set<String> b() {
        return f7026e.keySet();
    }

    public final void c() {
        synchronized (f7027f) {
            this.b = null;
            this.f7030d = false;
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (f7027f) {
            z = this.f7030d;
        }
        return z;
    }

    public final f e() {
        f fVar;
        synchronized (f7027f) {
            fVar = this.b;
        }
        return fVar;
    }

    public final d f() {
        return this.a;
    }

    public final g g() {
        return this.f7029c;
    }
}
