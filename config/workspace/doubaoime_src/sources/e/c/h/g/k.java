package e.c.h.g;

import e.c.h.g.j;
import java.util.Objects;

/* loaded from: classes2.dex */
public class k {
    private final int a;
    private final d b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.c.d.j<Boolean> f9901c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f9902d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9903e;

    /* renamed from: f, reason: collision with root package name */
    private final int f9904f;

    public static class b {
        public e.c.c.d.j<Boolean> a = e.c.c.d.k.a(Boolean.FALSE);
        public boolean b = true;

        /* renamed from: c, reason: collision with root package name */
        public boolean f9905c = true;

        /* renamed from: d, reason: collision with root package name */
        private int f9906d = 20;

        public b(j.a aVar) {
        }
    }

    public static class c implements d {
    }

    public interface d {
    }

    k(b bVar, a aVar) {
        Objects.requireNonNull(bVar);
        this.a = 2048;
        this.b = new c();
        this.f9901c = bVar.a;
        this.f9902d = bVar.b;
        this.f9903e = bVar.f9905c;
        this.f9904f = bVar.f9906d;
    }

    public int a() {
        return this.a;
    }

    public d b() {
        return this.b;
    }

    public e.c.c.d.j<Boolean> c() {
        return this.f9901c;
    }

    public int d() {
        return this.f9904f;
    }

    public boolean e() {
        return this.f9902d;
    }

    public boolean f() {
        return this.f9903e;
    }
}
