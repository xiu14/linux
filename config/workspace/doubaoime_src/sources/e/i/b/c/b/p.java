package e.i.b.c.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.android.SystemUtils;
import com.obric.common.oea.foundation.graphics.smoothcorner.SmoothCornerHelper$Companion$CurveType;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class p {
    private static final com.obric.common.oea.foundation.graphics.smoothcorner.a a = new com.obric.common.oea.foundation.graphics.smoothcorner.a();
    private static final com.obric.common.oea.foundation.graphics.smoothcorner.a b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.obric.common.oea.foundation.graphics.smoothcorner.a f10028c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f10029d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f10030e = null;

    static {
        com.obric.common.oea.foundation.graphics.smoothcorner.a aVar = new com.obric.common.oea.foundation.graphics.smoothcorner.a();
        aVar.e(SmoothCornerHelper$Companion$CurveType.SKETCH);
        b = aVar;
        com.obric.common.oea.foundation.graphics.smoothcorner.a aVar2 = new com.obric.common.oea.foundation.graphics.smoothcorner.a();
        aVar2.e(SmoothCornerHelper$Companion$CurveType.QUADRATIC_CAPSULE);
        f10028c = aVar2;
        f10029d = !TextUtils.equals(SystemUtils.PRODUCT_HUAWEI, Build.BRAND);
    }

    public static final void a(Path path, RectF rectF, float[] fArr, Path.Direction direction) {
        kotlin.s.c.l.f(path, DownloadConstants.PATH_KEY);
        kotlin.s.c.l.f(rectF, "rect");
        kotlin.s.c.l.f(fArr, "radii");
        kotlin.s.c.l.f(direction, "dir");
        boolean z = true;
        if (!(fArr.length == 0)) {
            float f2 = fArr[0];
            int length = fArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                float f3 = fArr[i];
                i++;
                if (f3 != f2) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            path.addPath(c(rectF, fArr[0]));
        } else {
            path.addRoundRect(rectF, fArr, direction);
        }
    }

    public static final Path b(float f2, float f3, float f4, float f5, float f6) {
        float a2 = kotlin.w.h.a(Math.min(f6, h(f2, f3, f4, f5) / 2.0f), 0.0f);
        return d(a2, h(f2, f3, f4, f5)).a(f2, f3, f4, f5, a2);
    }

    public static final Path c(RectF rectF, float f2) {
        kotlin.s.c.l.f(rectF, "rect");
        float e2 = e(f2, rectF);
        com.obric.common.oea.foundation.graphics.smoothcorner.a d2 = d(e2, i(rectF));
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return d2.b(rect, e2);
    }

    private static final com.obric.common.oea.foundation.graphics.smoothcorner.a d(float f2, float f3) {
        com.obric.common.oea.foundation.graphics.smoothcorner.a aVar = a;
        if (aVar.c(f2, f3)) {
            return aVar;
        }
        com.obric.common.oea.foundation.graphics.smoothcorner.a aVar2 = b;
        return aVar2.c(f2, f3) ? aVar2 : f10028c;
    }

    private static final float e(float f2, RectF rectF) {
        if (!rectF.isEmpty()) {
            return kotlin.w.h.a(Math.min(f2, i(rectF) / 2.0f), 0.0f);
        }
        e.i.b.f.e.b.b("SmoothCornerH", "decideValidCornerRadius: rectF is empty");
        return 0.0f;
    }

    public static final void f(Canvas canvas, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        kotlin.s.c.l.f(canvas, "canvas");
        kotlin.s.c.l.f(paint, "paint");
        float a2 = kotlin.w.h.a(Math.min(f6, h(f2, f3, f4, f5) / 2.0f), 0.0f);
        d(a2, h(f2, f3, f4, f5)).d(canvas, paint, f2, f3, f4, f5, a2);
    }

    public static final void g(Canvas canvas, RectF rectF, float f2, Paint paint) {
        kotlin.s.c.l.f(canvas, "canvas");
        kotlin.s.c.l.f(rectF, "rectF");
        kotlin.s.c.l.f(paint, "paint");
        float e2 = e(f2, rectF);
        com.obric.common.oea.foundation.graphics.smoothcorner.a d2 = d(e2, i(rectF));
        Objects.requireNonNull(d2);
        kotlin.s.c.l.f(canvas, "canvas");
        kotlin.s.c.l.f(rectF, "rect");
        kotlin.s.c.l.f(paint, "paint");
        if (!rectF.isEmpty()) {
            d2.d(canvas, paint, rectF.left, rectF.top, rectF.right, rectF.bottom, e2);
            return;
        }
        String str = "empty rect: " + rectF;
        kotlin.s.c.l.f("SmoothCornerHelper", "tag");
        kotlin.s.c.l.f(str, "msg");
        Log.e("SmoothCornerHelper", str, null);
    }

    private static final float h(float f2, float f3, float f4, float f5) {
        return Math.min(Math.abs(f4 - f2), Math.abs(f5 - f3));
    }

    private static final float i(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }
}
