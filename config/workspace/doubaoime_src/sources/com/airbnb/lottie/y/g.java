package com.airbnb.lottie.y;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.v.b.k;
import java.util.List;

/* loaded from: classes.dex */
public class g {
    private static PointF a = new PointF();
    public static final /* synthetic */ int b = 0;

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f4, f2));
    }

    public static int c(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    static int d(float f2, float f3) {
        int i = (int) f2;
        int i2 = (int) f3;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void e(com.airbnb.lottie.model.content.h hVar, Path path) {
        path.reset();
        PointF b2 = hVar.b();
        path.moveTo(b2.x, b2.y);
        a.set(b2.x, b2.y);
        for (int i = 0; i < hVar.a().size(); i++) {
            com.airbnb.lottie.model.a aVar = hVar.a().get(i);
            PointF a2 = aVar.a();
            PointF b3 = aVar.b();
            PointF c2 = aVar.c();
            if (a2.equals(a) && b3.equals(c2)) {
                path.lineTo(c2.x, c2.y);
            } else {
                path.cubicTo(a2.x, a2.y, b3.x, b3.y, c2.x, c2.y);
            }
            a.set(c2.x, c2.y);
        }
        if (hVar.d()) {
            path.close();
        }
    }

    public static float f(float f2, float f3, @FloatRange(from = 0.0d, to = 1.0d) float f4) {
        return e.a.a.a.a.a(f3, f2, f4, f2);
    }

    public static void g(com.airbnb.lottie.model.d dVar, int i, List<com.airbnb.lottie.model.d> list, com.airbnb.lottie.model.d dVar2, k kVar) {
        if (dVar.c(kVar.getName(), i)) {
            list.add(dVar2.a(kVar.getName()).h(kVar));
        }
    }
}
