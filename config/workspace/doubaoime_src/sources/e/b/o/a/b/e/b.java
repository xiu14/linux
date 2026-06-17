package e.b.o.a.b.e;

import android.content.Context;
import e.b.o.a.a.b;
import e.b.o.a.c.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b extends e.b.o.a.b.b {

    /* renamed from: c, reason: collision with root package name */
    private boolean f9718c;

    /* renamed from: d, reason: collision with root package name */
    private long f9719d;

    /* renamed from: e, reason: collision with root package name */
    private e.b.o.a.c.d f9720e;

    /* renamed from: f, reason: collision with root package name */
    private e f9721f;

    /* renamed from: g, reason: collision with root package name */
    private Map<Long, e.b.o.a.c.d> f9722g;
    private Map<Long, e> h;
    private f i;
    private c j;
    private e.b.o.a.c.c k;
    private d l;
    private Map<Long, Object> m;
    private Map<Long, Object> n;
    private e.b.o.a.c.e o;
    private a p;

    public b(Context context, e.b.o.a.a.b bVar) {
        super(context, bVar);
        this.f9718c = false;
        this.f9719d = 0L;
        this.f9720e = new e.b.o.a.c.d();
        this.f9721f = new e();
        this.f9722g = new HashMap();
        this.h = new HashMap();
        this.i = new f();
        this.j = new c();
        this.k = new e.b.o.a.c.c();
        this.l = new d();
        this.m = new HashMap();
        this.n = new HashMap();
        this.o = new e.b.o.a.c.e();
        this.p = new a();
    }

    public List<List<Integer>> a() {
        Objects.requireNonNull(((e.b.o.a.b.a) this.b).c());
        return null;
    }

    public b.C0445b b() {
        Objects.requireNonNull(((e.b.o.a.b.a) this.b).c());
        return null;
    }

    public void c() {
        if (this.f9718c) {
            long currentTimeMillis = System.currentTimeMillis();
            Objects.requireNonNull(((e.b.o.a.b.a) this.b).c());
            Objects.requireNonNull(((e.b.o.a.b.a) this.b).c());
            this.f9719d = currentTimeMillis;
        }
    }

    public void d() {
        if (this.f9718c) {
            return;
        }
        this.f9718c = true;
        c();
    }
}
