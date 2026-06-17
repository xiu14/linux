package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import androidx.core.util.Pools;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.memory.e;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

@TargetApi(11)
/* loaded from: classes2.dex */
public abstract class a implements d {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f6522d = {-1, -39};
    private final e a;
    private final PreverificationHelper b = new PreverificationHelper();

    /* renamed from: c, reason: collision with root package name */
    final Pools.SynchronizedPool<ByteBuffer> f6523c;

    public a(e eVar, int i, Pools.SynchronizedPool synchronizedPool) {
        this.a = eVar;
        this.f6523c = synchronizedPool;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6523c.release(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009b A[Catch: all -> 0x00d1, OutOfMemoryError -> 0x00d3, RuntimeException -> 0x00da, IllegalArgumentException -> 0x00e3, TryCatch #9 {OutOfMemoryError -> 0x00d3, blocks: (B:20:0x0068, B:27:0x007f, B:38:0x00a2, B:39:0x00aa, B:42:0x00a7, B:47:0x0094, B:51:0x009b, B:52:0x009e), top: B:19:0x0068, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private e.c.c.g.a<android.graphics.Bitmap> d(java.io.InputStream r11, android.graphics.BitmapFactory.Options r12, android.graphics.Rect r13, android.graphics.ColorSpace r14) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.a.d(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, android.graphics.ColorSpace):e.c.c.g.a");
    }

    private static BitmapFactory.Options f(f fVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = fVar.H();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(fVar.A(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException(e.c.h.j.b.j(fVar));
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // com.facebook.imagepipeline.platform.d
    public e.c.c.g.a<Bitmap> a(f fVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        BitmapFactory.Options f2 = f(fVar, config);
        boolean z = f2.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d(fVar.A(), f2, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return a(fVar, Bitmap.Config.ARGB_8888, rect, colorSpace);
            }
            throw e2;
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public e.c.c.g.a<Bitmap> b(f fVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        boolean S = fVar.S(i);
        BitmapFactory.Options f2 = f(fVar, config);
        InputStream A = fVar.A();
        Objects.requireNonNull(A);
        if (fVar.I() > i) {
            A = new e.c.c.h.a(A, i);
        }
        if (!S) {
            A = new e.c.c.h.b(A, f6522d);
        }
        boolean z = f2.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            return d(A, f2, rect, colorSpace);
        } catch (RuntimeException e2) {
            if (z) {
                return b(fVar, Bitmap.Config.ARGB_8888, rect, i, colorSpace);
            }
            throw e2;
        }
    }

    protected Bitmap c(InputStream inputStream, BitmapFactory.Options options, int i, int i2, Bitmap bitmap) {
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public abstract int e(int i, int i2, BitmapFactory.Options options);
}
