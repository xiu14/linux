package com.obric.common.oea.foundation.graphics.smoothcorner.b;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class d {
    private final RectF a = new RectF();

    public static final void a(Path path, e eVar, float f2, float f3, float f4) {
        l.f(path, "$this$arcTo");
        l.f(eVar, "arcCenter");
        path.arcTo(eVar.c() - f2, eVar.d() - f2, eVar.c() + f2, eVar.d() + f2, f3, f4 - f3, false);
    }

    public static void e(d dVar, Canvas canvas, Paint paint, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        boolean z5 = (i & 512) != 0 ? true : z;
        boolean z6 = (i & 1024) != 0 ? true : z2;
        boolean z7 = (i & 2048) != 0 ? true : z3;
        boolean z8 = (i & 4096) == 0 ? z4 : true;
        Objects.requireNonNull(dVar);
        l.f(canvas, "canvas");
        l.f(paint, "paint");
        float f9 = f6 - f4;
        float f10 = f7 - f5;
        dVar.a.set(f4, f5, f6, f7);
        canvas.drawRoundRect(dVar.a, f8, f8, paint);
        if (!z5) {
            float f11 = 2;
            float f12 = f9 / f11;
            float f13 = f10 / f11;
            canvas.drawRect(0.0f, 0.0f, f12, f13, paint);
            Path path = new Path();
            path.moveTo(0.0f, f13);
            path.lineTo(0.0f, 0.0f);
            path.lineTo(f12, 0.0f);
            canvas.drawPath(path, paint);
        }
        if (!z6) {
            float f14 = 2;
            float f15 = f9 / f14;
            float f16 = f10 / f14;
            canvas.drawRect(f15, 0.0f, f9, f16, paint);
            Path path2 = new Path();
            path2.moveTo(f15, 0.0f);
            path2.lineTo(f9, 0.0f);
            path2.lineTo(f9, f16);
            canvas.drawPath(path2, paint);
        }
        if (!z7) {
            float f17 = 2;
            float f18 = f10 / f17;
            float f19 = f9 / f17;
            canvas.drawRect(0.0f, f18, f19, f10, paint);
            Path path3 = new Path();
            path3.moveTo(0.0f, f18);
            path3.lineTo(0.0f, f10);
            path3.lineTo(f19, f10);
            canvas.drawPath(path3, paint);
        }
        if (z8) {
            return;
        }
        float f20 = 2;
        float f21 = f9 / f20;
        float f22 = f10 / f20;
        canvas.drawRect(f21, f22, f9, f10, paint);
        Path path4 = new Path();
        path4.moveTo(f21, f10);
        path4.lineTo(f9, f10);
        path4.lineTo(f9, f22);
        canvas.drawPath(path4, paint);
    }

    public abstract Path b(float f2, float f3, float f4, float f5, float f6);

    public final Path c(float f2, float f3, float f4, float f5, float f6) {
        Path path = new Path();
        path.addRoundRect(f2, f3, f4, f5, f6, f6, Path.Direction.CW);
        path.close();
        return path;
    }

    public boolean d(float f2, float f3) {
        return true;
    }
}
