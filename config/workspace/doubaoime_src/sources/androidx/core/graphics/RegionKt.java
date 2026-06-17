package androidx.core.graphics;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.util.Iterator;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class RegionKt {
    public static final Region and(Region region, Rect rect) {
        l.f(region, "<this>");
        l.f(rect, DownloadFileUtils.MODE_READ);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    public static final boolean contains(Region region, Point point) {
        l.f(region, "<this>");
        l.f(point, "p");
        return region.contains(point.x, point.y);
    }

    public static final void forEach(Region region, kotlin.s.b.l<? super Rect, o> lVar) {
        l.f(region, "<this>");
        l.f(lVar, "action");
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                lVar.invoke(rect);
            }
        }
    }

    public static final Iterator<Rect> iterator(Region region) {
        l.f(region, "<this>");
        return new RegionKt$iterator$1(region);
    }

    public static final Region minus(Region region, Rect rect) {
        l.f(region, "<this>");
        l.f(rect, DownloadFileUtils.MODE_READ);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region not(Region region) {
        l.f(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region or(Region region, Rect rect) {
        l.f(region, "<this>");
        l.f(rect, DownloadFileUtils.MODE_READ);
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region plus(Region region, Rect rect) {
        l.f(region, "<this>");
        l.f(rect, DownloadFileUtils.MODE_READ);
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    public static final Region unaryMinus(Region region) {
        l.f(region, "<this>");
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    public static final Region xor(Region region, Rect rect) {
        l.f(region, "<this>");
        l.f(rect, DownloadFileUtils.MODE_READ);
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    public static final Region and(Region region, Region region2) {
        l.f(region, "<this>");
        l.f(region2, DownloadFileUtils.MODE_READ);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    public static final Region minus(Region region, Region region2) {
        l.f(region, "<this>");
        l.f(region2, DownloadFileUtils.MODE_READ);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    public static final Region or(Region region, Region region2) {
        l.f(region, "<this>");
        l.f(region2, DownloadFileUtils.MODE_READ);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region plus(Region region, Region region2) {
        l.f(region, "<this>");
        l.f(region2, DownloadFileUtils.MODE_READ);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    public static final Region xor(Region region, Region region2) {
        l.f(region, "<this>");
        l.f(region2, DownloadFileUtils.MODE_READ);
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
