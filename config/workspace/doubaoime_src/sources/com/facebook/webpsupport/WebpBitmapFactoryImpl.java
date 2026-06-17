package com.facebook.webpsupport;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import e.c.c.d.c;
import e.c.c.i.a;
import e.c.c.i.b;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@c
/* loaded from: classes2.dex */
public class WebpBitmapFactoryImpl implements b {
    private static b.a a;
    private static a b;

    private static byte[] b(InputStream inputStream, BitmapFactory.Options options) {
        byte[] bArr;
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
            return bArr;
        } catch (IOException unused) {
            return null;
        }
    }

    private static void c(String str) {
        b.a aVar = a;
        if (aVar != null) {
            aVar.a(str, "decoding_failure");
        }
    }

    @c
    private static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        Bitmap bitmap;
        return (options == null || (bitmap = options.inBitmap) == null || !bitmap.isMutable()) ? b.a(i, i2, Bitmap.Config.ARGB_8888) : options.inBitmap;
    }

    private static void d(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null) {
            int i = options.inDensity;
            if (i != 0) {
                bitmap.setDensity(i);
                int i2 = options.inTargetDensity;
                if (i2 != 0 && i != i2 && i != options.inScreenDensity && options.inScaled) {
                    bitmap.setDensity(i2);
                }
            } else if (options.inBitmap != null) {
                int i3 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i3 != 0) {
                    bitmap.setDensity(i3);
                } else {
                    bitmap.setDensity(160);
                }
            }
        }
        options.outMimeType = "image/webp";
    }

    @c
    private static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    @c
    private static float getScaleFromOptions(BitmapFactory.Options options) {
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        float f2 = i > 1 ? 1.0f / i : 1.0f;
        if (!options.inScaled) {
            return f2;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f2 : i3 / i2;
    }

    @c
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        com.facebook.imagepipeline.nativecode.c.a();
        b bVar = e.c.c.i.c.a;
        Bitmap originalDecodeByteArray = originalDecodeByteArray(bArr, i, i2, options);
        if (originalDecodeByteArray == null) {
            c("webp_direct_decode_array_failed_on_no_webp");
        }
        return originalDecodeByteArray;
    }

    @c
    public static Bitmap hookDecodeFile(String str, BitmapFactory.Options options) {
        Bitmap bitmap = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                bitmap = hookDecodeStream(fileInputStream, null, options);
                fileInputStream.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        return bitmap;
    }

    @c
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        com.facebook.imagepipeline.nativecode.c.a();
        long nativeSeek = nativeSeek(fileDescriptor, 0L, false);
        if (nativeSeek == -1) {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        InputStream fileInputStream = new FileInputStream(fileDescriptor);
        if (!fileInputStream.markSupported()) {
            fileInputStream = new BufferedInputStream(fileInputStream, 20);
        }
        try {
            b(fileInputStream, options);
            b bVar = e.c.c.i.c.a;
            nativeSeek(fileDescriptor, nativeSeek, true);
            Bitmap originalDecodeFileDescriptor = originalDecodeFileDescriptor(fileDescriptor, rect, options);
            if (originalDecodeFileDescriptor == null) {
                c("webp_direct_decode_fd_failed_on_no_webp");
            }
            try {
                return originalDecodeFileDescriptor;
            } catch (Throwable unused) {
                return originalDecodeFileDescriptor;
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (Throwable unused2) {
            }
        }
    }

    @c
    public static Bitmap hookDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        TypedValue typedValue = new TypedValue();
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i, typedValue);
            try {
                bitmap = hookDecodeResourceStream(resources, typedValue, openRawResource, null, options);
                if (openRawResource != null) {
                    openRawResource.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
        if (bitmap != null || options == null || options.inBitmap == null) {
            return bitmap;
        }
        throw new IllegalArgumentException("Problem decoding into existing bitmap");
    }

    @c
    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    @c
    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        Bitmap originalDecodeStream;
        com.facebook.imagepipeline.nativecode.c.a();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        byte[] b2 = b(inputStream, options);
        b bVar = e.c.c.i.c.a;
        if (Build.VERSION.SDK_INT == 28 && e.c.c.i.c.g(b2, 0, 20) && options.inPreferredConfig == Bitmap.Config.ARGB_8888) {
            originalDecodeStream = nativeDecodeStream(inputStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
            if (originalDecodeStream == null) {
                c("webp_direct_decode_stream");
            }
            d(originalDecodeStream, options);
            setPaddingDefaultValues(rect);
        } else {
            originalDecodeStream = originalDecodeStream(inputStream, rect, options);
            if (originalDecodeStream == null) {
                c("webp_direct_decode_stream_failed_on_no_webp");
            }
        }
        return originalDecodeStream;
    }

    @c
    private static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f2, byte[] bArr2);

    @c
    private static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f2, byte[] bArr);

    @c
    private static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    @c
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    @c
    private static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    @c
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    @c
    private static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    @c
    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    @c
    private static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    @c
    private static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    @c
    private static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    @c
    private static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    @c
    @SuppressLint({"NewApi"})
    private static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (options != null) {
            return options.inPremultiplied;
        }
        return true;
    }

    @Override // e.c.c.i.b
    public Bitmap a(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return hookDecodeFileDescriptor(fileDescriptor, null, options);
    }

    @c
    private static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    @c
    private static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    @c
    private static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    @c
    private static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    @c
    private static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    @c
    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    @c
    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    @c
    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    @c
    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    @c
    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }
}
