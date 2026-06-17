package com.bumptech.glide.load.engine.B;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class j implements d {
    private static final Bitmap.Config j = Bitmap.Config.ARGB_8888;
    private final k a;
    private final Set<Bitmap.Config> b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1594c;

    /* renamed from: d, reason: collision with root package name */
    private long f1595d;

    /* renamed from: e, reason: collision with root package name */
    private long f1596e;

    /* renamed from: f, reason: collision with root package name */
    private int f1597f;

    /* renamed from: g, reason: collision with root package name */
    private int f1598g;
    private int h;
    private int i;

    private interface a {
    }

    private static final class b implements a {
        b() {
        }
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f1595d = j2;
        this.a = mVar;
        this.b = unmodifiableSet;
        this.f1594c = new b();
    }

    private void e() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            f();
        }
    }

    private void f() {
        StringBuilder M = e.a.a.a.a.M("Hits=");
        M.append(this.f1597f);
        M.append(", misses=");
        M.append(this.f1598g);
        M.append(", puts=");
        M.append(this.h);
        M.append(", evictions=");
        M.append(this.i);
        M.append(", currentSize=");
        M.append(this.f1596e);
        M.append(", maxSize=");
        M.append(this.f1595d);
        M.append("\nStrategy=");
        M.append(this.a);
        Log.v("LruBitmapPool", M.toString());
    }

    @Nullable
    private synchronized Bitmap g(int i, int i2, @Nullable Bitmap.Config config) {
        Bitmap b2;
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        b2 = ((m) this.a).b(i, i2, config != null ? config : j);
        if (b2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                Objects.requireNonNull((m) this.a);
                sb.append(m.c(com.bumptech.glide.util.j.d(config) * i * i2, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f1598g++;
        } else {
            this.f1597f++;
            long j2 = this.f1596e;
            Objects.requireNonNull((m) this.a);
            this.f1596e = j2 - com.bumptech.glide.util.j.c(b2);
            Objects.requireNonNull((b) this.f1594c);
            b2.setHasAlpha(true);
            b2.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            Objects.requireNonNull((m) this.a);
            sb2.append(m.c(com.bumptech.glide.util.j.d(config) * i * i2, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        e();
        return b2;
    }

    private synchronized void h(long j2) {
        while (this.f1596e > j2) {
            Bitmap g2 = ((m) this.a).g();
            if (g2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    f();
                }
                this.f1596e = 0L;
                return;
            }
            Objects.requireNonNull((b) this.f1594c);
            long j3 = this.f1596e;
            Objects.requireNonNull((m) this.a);
            this.f1596e = j3 - com.bumptech.glide.util.j.c(g2);
            this.i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + ((m) this.a).e(g2));
            }
            e();
            g2.recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.B.d
    public void a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        h(0L);
    }

    @Override // com.bumptech.glide.load.engine.B.d
    @NonNull
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap g2 = g(i, i2, config);
        if (g2 != null) {
            return g2;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.B.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                Objects.requireNonNull((m) this.a);
                if (com.bumptech.glide.util.j.c(bitmap) <= this.f1595d && this.b.contains(bitmap.getConfig())) {
                    Objects.requireNonNull((m) this.a);
                    int c2 = com.bumptech.glide.util.j.c(bitmap);
                    ((m) this.a).f(bitmap);
                    Objects.requireNonNull((b) this.f1594c);
                    this.h++;
                    this.f1596e += c2;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((m) this.a).e(bitmap));
                    }
                    e();
                    h(this.f1595d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((m) this.a).e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.engine.B.d
    @NonNull
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap g2 = g(i, i2, config);
        if (g2 != null) {
            g2.eraseColor(0);
            return g2;
        }
        if (config == null) {
            config = j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.bumptech.glide.load.engine.B.d
    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            e.a.a.a.a.i0("trimMemory, level=", i, "LruBitmapPool");
        }
        if (i >= 40 || i >= 20) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            h(0L);
        } else if (i >= 20 || i == 15) {
            h(this.f1595d / 2);
        }
    }
}
