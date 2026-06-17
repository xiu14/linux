package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import androidx.core.util.Pools;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class b {
    private static final Pools.SynchronizedPool<ByteBuffer> a = new Pools.SynchronizedPool<>(12);

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.RGBA_F16.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        Pools.SynchronizedPool<ByteBuffer> synchronizedPool = a;
        ByteBuffer acquire = synchronizedPool.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            Pair<Integer, Integer> pair = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (options.outWidth != -1 && options.outHeight != -1) {
                pair = new Pair<>(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            }
            synchronizedPool.release(acquire);
            return pair;
        } catch (Throwable th) {
            a.release(acquire);
            throw th;
        }
    }

    public static d b(InputStream inputStream) {
        Objects.requireNonNull(inputStream);
        Pools.SynchronizedPool<ByteBuffer> synchronizedPool = a;
        ByteBuffer acquire = synchronizedPool.acquire();
        if (acquire == null) {
            acquire = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = acquire.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            d dVar = new d(options.outWidth, options.outHeight, options.outColorSpace);
            synchronizedPool.release(acquire);
            return dVar;
        } catch (Throwable th) {
            a.release(acquire);
            throw th;
        }
    }

    public static int c(Bitmap.Config config) {
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 8;
        }
        throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
    }

    public static int d(int i, int i2, Bitmap.Config config) {
        return c(config) * i * i2;
    }

    @SuppressLint({"NewApi"})
    public static int e(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
