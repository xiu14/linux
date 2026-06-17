package com.airbnb.lottie.y;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class h {
    private static final ThreadLocal<PathMeasure> a = new a();
    private static final ThreadLocal<Path> b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f1454c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<float[]> f1455d = new d();

    /* renamed from: e, reason: collision with root package name */
    private static final float f1456e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* renamed from: f, reason: collision with root package name */
    private static float f1457f = -1.0f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1458g = 0;

    class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        protected PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    class b extends ThreadLocal<Path> {
        b() {
        }

        @Override // java.lang.ThreadLocal
        protected Path initialValue() {
            return new Path();
        }
    }

    class c extends ThreadLocal<Path> {
        c() {
        }

        @Override // java.lang.ThreadLocal
        protected Path initialValue() {
            return new Path();
        }
    }

    class d extends ThreadLocal<float[]> {
        d() {
        }

        @Override // java.lang.ThreadLocal
        protected float[] initialValue() {
            return new float[4];
        }
    }

    public static void a(Path path, float f2, float f3, float f4) {
        PathMeasure pathMeasure = a.get();
        Path path2 = b.get();
        Path path3 = f1454c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            com.airbnb.lottie.d.a("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f3 - f2) - 1.0f) < 0.01d) {
            com.airbnb.lottie.d.a("applyTrimPathIfNeeded");
            return;
        }
        float f5 = f2 * length;
        float f6 = f3 * length;
        float f7 = f4 * length;
        float min = Math.min(f5, f6) + f7;
        float max = Math.max(f5, f6) + f7;
        if (min >= length && max >= length) {
            min = g.d(min, length);
            max = g.d(max, length);
        }
        if (min < 0.0f) {
            min = g.d(min, length);
        }
        if (max < 0.0f) {
            max = g.d(max, length);
        }
        if (min == max) {
            path.reset();
            com.airbnb.lottie.d.a("applyTrimPathIfNeeded");
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.d.a("applyTrimPathIfNeeded");
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static float c() {
        if (f1457f == -1.0f) {
            f1457f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f1457f;
    }

    public static float d(Matrix matrix) {
        float[] fArr = f1455d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = f1456e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean e(Matrix matrix) {
        float[] fArr = f1455d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static Bitmap f(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }
}
