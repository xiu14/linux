package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.memory.MemoryTrimType;

/* loaded from: classes2.dex */
public class r implements e {
    protected final s<Bitmap> a = new f();
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private int f6508c;

    /* renamed from: d, reason: collision with root package name */
    private final C f6509d;

    /* renamed from: e, reason: collision with root package name */
    private int f6510e;

    public r(int i, int i2, C c2, com.facebook.common.memory.c cVar) {
        this.b = i;
        this.f6508c = i2;
        this.f6509d = c2;
    }

    private synchronized void b(int i) {
        Bitmap c2;
        while (this.f6510e > i && (c2 = this.a.c()) != null) {
            int b = this.a.b(c2);
            this.f6510e -= b;
            this.f6509d.e(b);
        }
    }

    @Override // com.facebook.common.memory.b
    public void a(MemoryTrimType memoryTrimType) {
        b((int) ((1.0d - memoryTrimType.getSuggestedTrimRatio()) * this.b));
    }

    @Override // com.facebook.common.memory.e
    public Bitmap get(int i) {
        Bitmap a;
        synchronized (this) {
            int i2 = this.f6510e;
            int i3 = this.b;
            if (i2 > i3) {
                b(i3);
            }
            a = this.a.a(i);
            if (a != null) {
                int b = this.a.b(a);
                this.f6510e -= b;
                this.f6509d.b(b);
            } else {
                this.f6509d.a(i);
                a = Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
            }
        }
        return a;
    }

    @Override // com.facebook.common.memory.e, e.c.c.g.d
    public void release(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int b = this.a.b(bitmap);
        if (b <= this.f6508c) {
            this.f6509d.g(b);
            this.a.d(bitmap);
            synchronized (this) {
                this.f6510e += b;
            }
        }
    }
}
