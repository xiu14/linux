package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;

/* renamed from: com.facebook.imagepipeline.memory.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0720c {
    private int a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6497c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6498d;

    /* renamed from: e, reason: collision with root package name */
    private final e.c.c.g.d<Bitmap> f6499e;

    /* renamed from: com.facebook.imagepipeline.memory.c$a */
    class a implements e.c.c.g.d<Bitmap> {
        a() {
        }

        @Override // e.c.c.g.d
        public void release(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            try {
                C0720c.this.a(bitmap2);
            } finally {
                bitmap2.recycle();
            }
        }
    }

    public C0720c(int i, int i2) {
        e.c.c.d.h.a(i > 0);
        e.c.c.d.h.a(i2 > 0);
        this.f6497c = i;
        this.f6498d = i2;
        this.f6499e = new a();
    }

    public synchronized void a(Bitmap bitmap) {
        int e2 = com.facebook.imageutils.b.e(bitmap);
        e.c.c.d.h.b(this.a > 0, "No bitmaps registered.");
        long j = e2;
        e.c.c.d.h.c(j <= this.b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(e2), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public synchronized int b() {
        return this.a;
    }

    public synchronized int c() {
        return this.f6497c;
    }

    public synchronized int d() {
        return this.f6498d;
    }

    public e.c.c.g.d<Bitmap> e() {
        return this.f6499e;
    }

    public synchronized long f() {
        return this.b;
    }

    public synchronized boolean g(Bitmap bitmap) {
        int e2 = com.facebook.imageutils.b.e(bitmap);
        int i = this.a;
        if (i < this.f6497c) {
            long j = this.b + e2;
            if (j <= this.f6498d) {
                this.a = i + 1;
                this.b = j;
                return true;
            }
        }
        return false;
    }
}
