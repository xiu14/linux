package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import androidx.annotation.RequiresApi;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class BitmapKt {
    public static final Bitmap applyCanvas(Bitmap bitmap, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(bitmap, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean contains(Bitmap bitmap, Point point) {
        int i;
        kotlin.s.c.l.f(bitmap, "<this>");
        kotlin.s.c.l.f(point, "p");
        int width = bitmap.getWidth();
        int i2 = point.x;
        return (i2 >= 0 && i2 < width) && (i = point.y) >= 0 && i < bitmap.getHeight();
    }

    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        kotlin.s.c.l.f(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        kotlin.s.c.l.e(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        kotlin.s.c.l.f(config, "config");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        kotlin.s.c.l.e(createBitmap, "createBitmap(width, height, config)");
        return createBitmap;
    }

    public static final int get(Bitmap bitmap, int i, int i2) {
        kotlin.s.c.l.f(bitmap, "<this>");
        return bitmap.getPixel(i, i2);
    }

    public static final Bitmap scale(Bitmap bitmap, int i, int i2, boolean z) {
        kotlin.s.c.l.f(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        kotlin.s.c.l.e(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static /* synthetic */ Bitmap scale$default(Bitmap bitmap, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        kotlin.s.c.l.f(bitmap, "<this>");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, z);
        kotlin.s.c.l.e(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return createScaledBitmap;
    }

    public static final void set(Bitmap bitmap, int i, int i2, @ColorInt int i3) {
        kotlin.s.c.l.f(bitmap, "<this>");
        bitmap.setPixel(i, i2, i3);
    }

    public static final boolean contains(Bitmap bitmap, PointF pointF) {
        kotlin.s.c.l.f(bitmap, "<this>");
        kotlin.s.c.l.f(pointF, "p");
        float f2 = pointF.x;
        if (f2 >= 0.0f && f2 < bitmap.getWidth()) {
            float f3 = pointF.y;
            if (f3 >= 0.0f && f3 < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }

    @RequiresApi(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace) {
        kotlin.s.c.l.f(config, "config");
        kotlin.s.c.l.f(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        kotlin.s.c.l.e(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }

    public static /* synthetic */ Bitmap createBitmap$default(int i, int i2, Bitmap.Config config, boolean z, ColorSpace colorSpace, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        if ((i3 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            kotlin.s.c.l.e(colorSpace, "get(ColorSpace.Named.SRGB)");
        }
        kotlin.s.c.l.f(config, "config");
        kotlin.s.c.l.f(colorSpace, "colorSpace");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config, z, colorSpace);
        kotlin.s.c.l.e(createBitmap, "createBitmap(width, heig…ig, hasAlpha, colorSpace)");
        return createBitmap;
    }
}
