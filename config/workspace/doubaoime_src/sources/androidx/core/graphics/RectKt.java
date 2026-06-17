package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class RectKt {
    @SuppressLint({"CheckResult"})
    public static final Rect and(Rect rect, Rect rect2) {
        l.f(rect, "<this>");
        l.f(rect2, DownloadFileUtils.MODE_READ);
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(Rect rect) {
        l.f(rect, "<this>");
        return rect.left;
    }

    public static final int component2(Rect rect) {
        l.f(rect, "<this>");
        return rect.top;
    }

    public static final int component3(Rect rect) {
        l.f(rect, "<this>");
        return rect.right;
    }

    public static final int component4(Rect rect) {
        l.f(rect, "<this>");
        return rect.bottom;
    }

    public static final boolean contains(Rect rect, Point point) {
        l.f(rect, "<this>");
        l.f(point, "p");
        return rect.contains(point.x, point.y);
    }

    public static final Region minus(Rect rect, Rect rect2) {
        l.f(rect, "<this>");
        l.f(rect2, DownloadFileUtils.MODE_READ);
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final Rect or(Rect rect, Rect rect2) {
        l.f(rect, "<this>");
        l.f(rect2, DownloadFileUtils.MODE_READ);
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect plus(Rect rect, Rect rect2) {
        l.f(rect, "<this>");
        l.f(rect2, DownloadFileUtils.MODE_READ);
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    public static final Rect times(Rect rect, int i) {
        l.f(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.top *= i;
        rect2.left *= i;
        rect2.right *= i;
        rect2.bottom *= i;
        return rect2;
    }

    public static final Rect toRect(RectF rectF) {
        l.f(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    public static final RectF toRectF(Rect rect) {
        l.f(rect, "<this>");
        return new RectF(rect);
    }

    public static final Region toRegion(Rect rect) {
        l.f(rect, "<this>");
        return new Region(rect);
    }

    public static final RectF transform(RectF rectF, Matrix matrix) {
        l.f(rectF, "<this>");
        l.f(matrix, "m");
        matrix.mapRect(rectF);
        return rectF;
    }

    public static final Region xor(Rect rect, Rect rect2) {
        l.f(rect, "<this>");
        l.f(rect2, DownloadFileUtils.MODE_READ);
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(RectF rectF) {
        l.f(rectF, "<this>");
        return rectF.left;
    }

    public static final float component2(RectF rectF) {
        l.f(rectF, "<this>");
        return rectF.top;
    }

    public static final float component3(RectF rectF) {
        l.f(rectF, "<this>");
        return rectF.right;
    }

    public static final float component4(RectF rectF) {
        l.f(rectF, "<this>");
        return rectF.bottom;
    }

    public static final boolean contains(RectF rectF, PointF pointF) {
        l.f(rectF, "<this>");
        l.f(pointF, "p");
        return rectF.contains(pointF.x, pointF.y);
    }

    public static final Region toRegion(RectF rectF) {
        l.f(rectF, "<this>");
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @SuppressLint({"CheckResult"})
    public static final RectF and(RectF rectF, RectF rectF2) {
        l.f(rectF, "<this>");
        l.f(rectF2, DownloadFileUtils.MODE_READ);
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    public static final Region minus(RectF rectF, RectF rectF2) {
        l.f(rectF, "<this>");
        l.f(rectF2, DownloadFileUtils.MODE_READ);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    public static final RectF or(RectF rectF, RectF rectF2) {
        l.f(rectF, "<this>");
        l.f(rectF2, DownloadFileUtils.MODE_READ);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final RectF plus(RectF rectF, RectF rectF2) {
        l.f(rectF, "<this>");
        l.f(rectF2, DownloadFileUtils.MODE_READ);
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    public static final Region xor(RectF rectF, RectF rectF2) {
        l.f(rectF, "<this>");
        l.f(rectF2, DownloadFileUtils.MODE_READ);
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final Rect plus(Rect rect, int i) {
        l.f(rect, "<this>");
        Rect rect2 = new Rect(rect);
        rect2.offset(i, i);
        return rect2;
    }

    public static final RectF times(RectF rectF, float f2) {
        l.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f2;
        rectF2.left *= f2;
        rectF2.right *= f2;
        rectF2.bottom *= f2;
        return rectF2;
    }

    public static final RectF plus(RectF rectF, float f2) {
        l.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f2, f2);
        return rectF2;
    }

    public static final Rect plus(Rect rect, Point point) {
        l.f(rect, "<this>");
        l.f(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    public static final Rect minus(Rect rect, int i) {
        l.f(rect, "<this>");
        Rect rect2 = new Rect(rect);
        int i2 = -i;
        rect2.offset(i2, i2);
        return rect2;
    }

    public static final RectF plus(RectF rectF, PointF pointF) {
        l.f(rectF, "<this>");
        l.f(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    public static final RectF times(RectF rectF, int i) {
        l.f(rectF, "<this>");
        float f2 = i;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f2;
        rectF2.left *= f2;
        rectF2.right *= f2;
        rectF2.bottom *= f2;
        return rectF2;
    }

    public static final RectF minus(RectF rectF, float f2) {
        l.f(rectF, "<this>");
        RectF rectF2 = new RectF(rectF);
        float f3 = -f2;
        rectF2.offset(f3, f3);
        return rectF2;
    }

    public static final Rect minus(Rect rect, Point point) {
        l.f(rect, "<this>");
        l.f(point, "xy");
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    public static final RectF minus(RectF rectF, PointF pointF) {
        l.f(rectF, "<this>");
        l.f(pointF, "xy");
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }
}
