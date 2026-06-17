package com.bumptech.glide.n;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.n.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e implements a {
    private static final String u = "e";

    @ColorInt
    private int[] a;

    /* renamed from: c, reason: collision with root package name */
    private final a.InterfaceC0042a f1822c;

    /* renamed from: d, reason: collision with root package name */
    private ByteBuffer f1823d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f1824e;

    /* renamed from: f, reason: collision with root package name */
    private short[] f1825f;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f1826g;
    private byte[] h;
    private byte[] i;

    @ColorInt
    private int[] j;
    private int k;
    private c l;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;

    @Nullable
    private Boolean s;

    @ColorInt
    private final int[] b = new int[256];

    @NonNull
    private Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public e(@NonNull a.InterfaceC0042a interfaceC0042a, c cVar, ByteBuffer byteBuffer, int i) {
        this.f1822c = interfaceC0042a;
        this.l = new c();
        synchronized (this) {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int highestOneBit = Integer.highestOneBit(i);
            this.o = 0;
            this.l = cVar;
            this.k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f1823d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f1823d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            Iterator<b> it2 = cVar.f1817e.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().f1814g == 3) {
                    this.n = true;
                    break;
                }
            }
            this.p = highestOneBit;
            int i2 = cVar.f1818f;
            this.r = i2 / highestOneBit;
            int i3 = cVar.f1819g;
            this.q = i3 / highestOneBit;
            this.i = ((com.bumptech.glide.load.resource.gif.b) this.f1822c).b(i2 * i3);
            this.j = ((com.bumptech.glide.load.resource.gif.b) this.f1822c).c(this.r * this.q);
        }
    }

    private Bitmap h() {
        Boolean bool = this.s;
        Bitmap a = ((com.bumptech.glide.load.resource.gif.b) this.f1822c).a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        a.setHasAlpha(true);
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r3.j == r36.h) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Bitmap j(com.bumptech.glide.n.b r36, com.bumptech.glide.n.b r37) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.n.e.j(com.bumptech.glide.n.b, com.bumptech.glide.n.b):android.graphics.Bitmap");
    }

    @Override // com.bumptech.glide.n.a
    public int a() {
        return this.l.f1815c;
    }

    @Override // com.bumptech.glide.n.a
    @Nullable
    public synchronized Bitmap b() {
        if (this.l.f1815c <= 0 || this.k < 0) {
            String str = u;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.l.f1815c + ", framePointer=" + this.k);
            }
            this.o = 1;
        }
        int i = this.o;
        if (i != 1 && i != 2) {
            this.o = 0;
            if (this.f1824e == null) {
                this.f1824e = ((com.bumptech.glide.load.resource.gif.b) this.f1822c).b(255);
            }
            b bVar = this.l.f1817e.get(this.k);
            int i2 = this.k - 1;
            b bVar2 = i2 >= 0 ? this.l.f1817e.get(i2) : null;
            int[] iArr = bVar.k;
            if (iArr == null) {
                iArr = this.l.a;
            }
            this.a = iArr;
            if (iArr == null) {
                String str2 = u;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.k);
                }
                this.o = 1;
                return null;
            }
            if (bVar.f1813f) {
                System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                int[] iArr2 = this.b;
                this.a = iArr2;
                iArr2[bVar.h] = 0;
                if (bVar.f1814g == 2 && this.k == 0) {
                    this.s = Boolean.TRUE;
                }
            }
            return j(bVar, bVar2);
        }
        String str3 = u;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.o);
        }
        return null;
    }

    @Override // com.bumptech.glide.n.a
    public void c() {
        this.k = (this.k + 1) % this.l.f1815c;
    }

    @Override // com.bumptech.glide.n.a
    public void clear() {
        this.l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            ((com.bumptech.glide.load.resource.gif.b) this.f1822c).e(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null) {
            ((com.bumptech.glide.load.resource.gif.b) this.f1822c).f(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            ((com.bumptech.glide.load.resource.gif.b) this.f1822c).d(bitmap);
        }
        this.m = null;
        this.f1823d = null;
        this.s = null;
        byte[] bArr2 = this.f1824e;
        if (bArr2 != null) {
            ((com.bumptech.glide.load.resource.gif.b) this.f1822c).e(bArr2);
        }
    }

    @Override // com.bumptech.glide.n.a
    public int d() {
        int i;
        c cVar = this.l;
        int i2 = cVar.f1815c;
        if (i2 <= 0 || (i = this.k) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return cVar.f1817e.get(i).i;
    }

    @Override // com.bumptech.glide.n.a
    @NonNull
    public ByteBuffer e() {
        return this.f1823d;
    }

    @Override // com.bumptech.glide.n.a
    public int f() {
        return this.k;
    }

    @Override // com.bumptech.glide.n.a
    public int g() {
        return (this.j.length * 4) + this.f1823d.limit() + this.i.length;
    }

    public void i(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }
}
