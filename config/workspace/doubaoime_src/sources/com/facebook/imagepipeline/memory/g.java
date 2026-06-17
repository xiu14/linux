package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes2.dex */
class g<V> {
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    final Queue f6501c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6502d;

    /* renamed from: e, reason: collision with root package name */
    private int f6503e;

    public g(int i, int i2, int i3, boolean z) {
        e.c.c.d.h.f(i > 0);
        e.c.c.d.h.f(i2 >= 0);
        e.c.c.d.h.f(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.f6501c = new LinkedList();
        this.f6503e = i3;
        this.f6502d = z;
    }

    void a(V v) {
        this.f6501c.add(v);
    }

    public void b() {
        e.c.c.d.h.f(this.f6503e > 0);
        this.f6503e--;
    }

    @Deprecated
    public V c() {
        V h = h();
        if (h != null) {
            this.f6503e++;
        }
        return h;
    }

    int d() {
        return this.f6501c.size();
    }

    public int e() {
        return this.f6503e;
    }

    public void f() {
        this.f6503e++;
    }

    public boolean g() {
        return this.f6503e + d() > this.b;
    }

    public V h() {
        return (V) this.f6501c.poll();
    }

    public void i(V v) {
        if (this.f6502d) {
            e.c.c.d.h.f(this.f6503e > 0);
            this.f6503e--;
            a(v);
        } else {
            int i = this.f6503e;
            if (i <= 0) {
                e.c.c.e.a.k("BUCKET", "Tried to release value %s from an empty bucket!", v);
            } else {
                this.f6503e = i - 1;
                a(v);
            }
        }
    }
}
