package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class A {
    private static final Paint a = new Paint(6);
    private static final Paint b = new Paint(7);

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f1733c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f1734d;

    /* renamed from: e, reason: collision with root package name */
    private static final Lock f1735e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f1736f = 0;

    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f1734d = hashSet;
        f1735e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f1733c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        Lock lock = f1735e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            canvas.setBitmap(null);
            lock.unlock();
        } catch (Throwable th) {
            f1735e.unlock();
            throw th;
        }
    }

    public static Bitmap b(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f2 + 0.5f), (int) (height + 0.5f));
        Bitmap d2 = dVar.d(i, i2, h(bitmap));
        d2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d2, matrix);
        return d2;
    }

    public static Bitmap c(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f2 = min;
        float f3 = f2 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f2 / width, f2 / height);
        float f4 = width * max;
        float f5 = max * height;
        float f6 = (f2 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap e2 = e(dVar, bitmap);
        Bitmap d2 = dVar.d(min, min, f(bitmap));
        d2.setHasAlpha(true);
        Lock lock = f1735e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d2);
            canvas.drawCircle(f3, f3, f3, b);
            canvas.drawBitmap(e2, (Rect) null, rectF, f1733c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!e2.equals(bitmap)) {
                dVar.c(e2);
            }
            return d2;
        } catch (Throwable th) {
            f1735e.unlock();
            throw th;
        }
    }

    public static Bitmap d(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap d2 = dVar.d((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), h(bitmap));
        d2.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + d2.getWidth() + "x" + d2.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d2, matrix);
        return d2;
    }

    private static Bitmap e(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap) {
        Bitmap.Config f2 = f(bitmap);
        if (f2.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap d2 = dVar.d(bitmap.getWidth(), bitmap.getHeight(), f2);
        new Canvas(d2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return d2;
    }

    @NonNull
    private static Bitmap.Config f(@NonNull Bitmap bitmap) {
        return Bitmap.Config.RGBA_F16.equals(bitmap.getConfig()) ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
    }

    public static Lock g() {
        return f1735e;
    }

    @NonNull
    private static Bitmap.Config h(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static Bitmap i(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i) {
        boolean z;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d2 = dVar.d(Math.round(rectF.width()), Math.round(rectF.height()), h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d2, matrix);
        return d2;
    }

    public static Bitmap j(@NonNull com.bumptech.glide.load.engine.B.d dVar, @NonNull Bitmap bitmap, int i) {
        d.a.b.a.a(i > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config f2 = f(bitmap);
        Bitmap e2 = e(dVar, bitmap);
        Bitmap d2 = dVar.d(e2.getWidth(), e2.getHeight(), f2);
        d2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(e2, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, d2.getWidth(), d2.getHeight());
        Lock lock = f1735e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(d2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f3 = i;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            canvas.setBitmap(null);
            lock.unlock();
            if (!e2.equals(bitmap)) {
                dVar.c(e2);
            }
            return d2;
        } catch (Throwable th) {
            f1735e.unlock();
            throw th;
        }
    }
}
