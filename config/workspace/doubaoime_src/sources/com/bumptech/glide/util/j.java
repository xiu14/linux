package com.bumptech.glide.util;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class j {
    private static final char[] a = "0123456789abcdef".toCharArray();
    private static final char[] b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private static volatile Handler f1861c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1862d = 0;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private j() {
    }

    public static void a() {
        if (!i()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @TargetApi(19)
    public static int c(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int d(@Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @NonNull
    public static <T> List<T> e(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private static Handler f() {
        if (f1861c == null) {
            synchronized (j.class) {
                if (f1861c == null) {
                    f1861c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f1861c;
    }

    public static int g(@Nullable Object obj, int i) {
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean h() {
        return !i();
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean j(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    public static void k(Runnable runnable) {
        f().post(runnable);
    }

    public static void l(Runnable runnable) {
        f().removeCallbacks(runnable);
    }

    @NonNull
    public static String m(@NonNull byte[] bArr) {
        String str;
        char[] cArr = b;
        synchronized (cArr) {
            for (int i = 0; i < bArr.length; i++) {
                int i2 = bArr[i] & 255;
                int i3 = i * 2;
                char[] cArr2 = a;
                cArr[i3] = cArr2[i2 >>> 4];
                cArr[i3 + 1] = cArr2[i2 & 15];
            }
            str = new String(cArr);
        }
        return str;
    }
}
