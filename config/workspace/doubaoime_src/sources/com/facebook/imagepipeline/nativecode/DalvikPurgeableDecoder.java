package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import com.facebook.common.memory.g;
import com.facebook.imagepipeline.image.f;
import com.facebook.imagepipeline.memory.C0720c;
import com.facebook.imagepipeline.platform.d;
import com.facebook.soloader.e;
import e.c.c.d.h;
import java.util.Locale;
import java.util.Objects;

@e.c.c.d.c
/* loaded from: classes2.dex */
public abstract class DalvikPurgeableDecoder implements d {
    protected static final byte[] b;
    private final C0720c a = com.facebook.imagepipeline.memory.d.a();

    @e
    private static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        int i = a.a;
        com.facebook.soloader.r.a.c("imagepipeline");
        b = new byte[]{-1, -39};
    }

    protected DalvikPurgeableDecoder() {
    }

    public static boolean e(e.c.c.g.a<g> aVar, int i) {
        g r = aVar.r();
        return i >= 2 && r.e(i + (-2)) == -1 && r.e(i - 1) == -39;
    }

    @e.c.c.d.c
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.d
    public e.c.c.g.a<Bitmap> a(f fVar, Bitmap.Config config, Rect rect, ColorSpace colorSpace) {
        int H = fVar.H();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = H;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        e.c.c.g.a<g> l = fVar.l();
        Objects.requireNonNull(l);
        try {
            return f(c(l, options));
        } finally {
            l.close();
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public e.c.c.g.a<Bitmap> b(f fVar, Bitmap.Config config, Rect rect, int i, ColorSpace colorSpace) {
        int H = fVar.H();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = H;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        e.c.c.g.a<g> l = fVar.l();
        Objects.requireNonNull(l);
        try {
            return f(d(l, i, options));
        } finally {
            l.close();
        }
    }

    protected abstract Bitmap c(e.c.c.g.a<g> aVar, BitmapFactory.Options options);

    protected abstract Bitmap d(e.c.c.g.a<g> aVar, int i, BitmapFactory.Options options);

    public e.c.c.g.a<Bitmap> f(Bitmap bitmap) {
        Objects.requireNonNull(bitmap);
        try {
            nativePinBitmap(bitmap);
            if (this.a.g(bitmap)) {
                return e.c.c.g.a.D(bitmap, this.a.e());
            }
            int e2 = com.facebook.imageutils.b.e(bitmap);
            bitmap.recycle();
            throw new com.facebook.imagepipeline.common.g(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", Integer.valueOf(e2), Integer.valueOf(this.a.b()), Long.valueOf(this.a.f()), Integer.valueOf(this.a.c()), Integer.valueOf(this.a.d())));
        } catch (Exception e3) {
            bitmap.recycle();
            h.j(e3);
            throw new RuntimeException(e3);
        }
    }
}
