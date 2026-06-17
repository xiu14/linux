package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

/* loaded from: classes2.dex */
public class z {
    private final B a;
    private final C b;

    /* renamed from: c, reason: collision with root package name */
    private final B f6512c;

    /* renamed from: d, reason: collision with root package name */
    private final com.facebook.common.memory.c f6513d;

    /* renamed from: e, reason: collision with root package name */
    private final B f6514e;

    /* renamed from: f, reason: collision with root package name */
    private final C f6515f;

    /* renamed from: g, reason: collision with root package name */
    private final B f6516g;
    private final C h;
    private final String i;
    private final int j;

    public static class b {
        private com.facebook.common.memory.c a;

        b(a aVar) {
        }

        public z b() {
            return new z(this, null);
        }

        public b c(com.facebook.common.memory.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    z(b bVar, a aVar) {
        e.c.h.m.b.b();
        this.a = k.a();
        this.b = y.h();
        int i = l.a;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        this.f6512c = new B(4194304, i2, sparseIntArray, 131072, 4194304, l.a);
        this.f6513d = bVar.a == null ? com.facebook.common.memory.d.b() : bVar.a;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i4 = min < 16777216 ? 3145728 : min < 33554432 ? 6291456 : 12582912;
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.f6514e = new B(i4, min2 < 16777216 ? min2 / 2 : (min2 / 4) * 3, sparseIntArray2);
        this.f6515f = y.h();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.f6516g = new B(81920, 1048576, sparseIntArray3);
        this.h = y.h();
        this.i = "legacy";
        this.j = 4194304;
        e.c.h.m.b.b();
    }

    public static b k() {
        return new b(null);
    }

    public int a() {
        return this.j;
    }

    public B b() {
        return this.a;
    }

    public C c() {
        return this.b;
    }

    public String d() {
        return this.i;
    }

    public B e() {
        return this.f6512c;
    }

    public B f() {
        return this.f6514e;
    }

    public C g() {
        return this.f6515f;
    }

    public com.facebook.common.memory.c h() {
        return this.f6513d;
    }

    public B i() {
        return this.f6516g;
    }

    public C j() {
        return this.h;
    }
}
