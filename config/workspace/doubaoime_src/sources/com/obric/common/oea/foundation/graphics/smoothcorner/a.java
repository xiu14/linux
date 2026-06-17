package com.obric.common.oea.foundation.graphics.smoothcorner;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.Log;
import com.obric.common.oea.foundation.graphics.smoothcorner.b.c;
import com.obric.common.oea.foundation.graphics.smoothcorner.b.d;
import com.obric.common.oea.foundation.graphics.smoothcorner.b.e;
import com.obric.common.oea.foundation.graphics.smoothcorner.b.g;
import java.util.Objects;
import kotlin.f;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes2.dex */
public final class a {
    private d a = new g();

    static {
        kotlin.collections.g.e0(h.h(new kotlin.w.d(8, 48), 2));
    }

    public final Path a(float f2, float f3, float f4, float f5, float f6) {
        return this.a.b(f2, f3, f4, f5, f6);
    }

    public final Path b(Rect rect, float f2) {
        l.f(rect, "rect");
        return this.a.b(rect.left, rect.top, rect.right, rect.bottom, f2);
    }

    public final boolean c(float f2, float f3) {
        return this.a.d(f2, f3);
    }

    public final void d(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        l.f(canvas, "canvas");
        l.f(paint, "paint");
        if (f6 < 0.0f) {
            String str = "invalid radius: " + f6;
            l.f("SmoothCornerHelper", "tag");
            l.f(str, "msg");
            Log.e("SmoothCornerHelper", str, null);
            f7 = 0.0f;
        } else {
            f7 = f6;
        }
        float f8 = f4 - f2;
        float f9 = f5 - f3;
        e eVar = new e(((f2 + f4) / 2.0f) - (f8 / 2.0f), ((f3 + f5) / 2.0f) - (f9 / 2.0f));
        float a = eVar.a();
        float b = eVar.b();
        if (f7 > Math.min(f8, f9) / 2) {
            d.e(this.a, canvas, paint, a, b, f2, f3, f4, f5, f7, false, false, false, false, 7680, null);
            return;
        }
        d dVar = this.a;
        Objects.requireNonNull(dVar);
        l.f(canvas, "canvas");
        l.f(paint, "paint");
        canvas.drawPath(dVar.b(f2, f3, f4, f5, f7), paint);
    }

    public final void e(SmoothCornerHelper$Companion$CurveType smoothCornerHelper$Companion$CurveType) {
        d gVar;
        l.f(smoothCornerHelper$Companion$CurveType, "curveType");
        String str = "setCurveType: " + smoothCornerHelper$Companion$CurveType;
        l.f("SmoothCornerHelper", "tag");
        l.f(str, "msg");
        Log.d("SmoothCornerHelper", str);
        int ordinal = smoothCornerHelper$Companion$CurveType.ordinal();
        if (ordinal == 0) {
            gVar = new g();
        } else if (ordinal == 1) {
            gVar = new com.obric.common.oea.foundation.graphics.smoothcorner.b.h();
        } else if (ordinal == 2) {
            gVar = new c();
        } else if (ordinal == 3) {
            gVar = new com.obric.common.oea.foundation.graphics.smoothcorner.b.a();
        } else {
            if (ordinal != 4) {
                throw new f();
            }
            gVar = new com.obric.common.oea.foundation.graphics.smoothcorner.b.f();
        }
        this.a = gVar;
    }
}
