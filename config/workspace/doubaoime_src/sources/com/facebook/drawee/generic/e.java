package com.facebook.drawee.generic;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.drawee.drawable.InterfaceC0716d;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.facebook.drawee.drawable.g;
import com.facebook.drawee.drawable.j;
import com.facebook.drawee.drawable.k;
import com.facebook.drawee.drawable.l;
import com.facebook.drawee.drawable.n;
import com.facebook.drawee.drawable.o;
import com.facebook.drawee.drawable.q;
import com.facebook.drawee.generic.RoundingParams;
import e.c.c.d.h;

/* loaded from: classes2.dex */
public class e {
    private static final Drawable a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            k kVar = new k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(kVar, roundingParams);
            return kVar;
        }
        if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, roundingParams);
            return nVar;
        }
        if (!(drawable instanceof ColorDrawable)) {
            e.c.c.e.a.x("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
        l lVar = new l(((ColorDrawable) drawable).getColor());
        b(lVar, roundingParams);
        return lVar;
    }

    static void b(j jVar, RoundingParams roundingParams) {
        jVar.c(roundingParams.f());
        jVar.m(roundingParams.c());
        jVar.a(roundingParams.a(), roundingParams.b());
        jVar.i(roundingParams.e());
        jVar.f(false);
        jVar.e(false);
    }

    static Drawable c(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        try {
            e.c.h.m.b.b();
            if (drawable != null && roundingParams != null && roundingParams.g() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
                if (!(drawable instanceof g)) {
                    return a(drawable, roundingParams, resources);
                }
                InterfaceC0716d interfaceC0716d = (g) drawable;
                while (true) {
                    Object l = interfaceC0716d.l();
                    if (l == interfaceC0716d || !(l instanceof InterfaceC0716d)) {
                        break;
                    }
                    interfaceC0716d = (InterfaceC0716d) l;
                }
                interfaceC0716d.g(a(interfaceC0716d.g(a), roundingParams, resources));
                return drawable;
            }
            return drawable;
        } finally {
            e.c.h.m.b.b();
        }
    }

    static Drawable d(Drawable drawable, RoundingParams roundingParams) {
        try {
            e.c.h.m.b.b();
            if (drawable != null && roundingParams != null && roundingParams.g() == RoundingParams.RoundingMethod.OVERLAY_COLOR) {
                RoundedCornersDrawable roundedCornersDrawable = new RoundedCornersDrawable(drawable);
                b(roundedCornersDrawable, roundingParams);
                roundedCornersDrawable.p(roundingParams.d());
                return roundedCornersDrawable;
            }
            return drawable;
        } finally {
            e.c.h.m.b.b();
        }
    }

    static Drawable e(Drawable drawable, q qVar, PointF pointF) {
        e.c.h.m.b.b();
        if (drawable == null || qVar == null) {
            e.c.h.m.b.b();
            return drawable;
        }
        o oVar = new o(drawable, qVar);
        if (pointF != null) {
            oVar.t(pointF);
        }
        e.c.h.m.b.b();
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void f(InterfaceC0716d interfaceC0716d, RoundingParams roundingParams, Resources resources) {
        while (true) {
            Object l = interfaceC0716d.l();
            if (l == interfaceC0716d || !(l instanceof InterfaceC0716d)) {
                break;
            } else {
                interfaceC0716d = (InterfaceC0716d) l;
            }
        }
        Drawable l2 = interfaceC0716d.l();
        if (roundingParams != null && roundingParams.g() == RoundingParams.RoundingMethod.BITMAP_ONLY) {
            if (l2 instanceof j) {
                b((j) l2, roundingParams);
                return;
            } else {
                if (l2 != 0) {
                    interfaceC0716d.g(a);
                    interfaceC0716d.g(a(l2, roundingParams, resources));
                    return;
                }
                return;
            }
        }
        if (l2 instanceof j) {
            j jVar = (j) l2;
            jVar.c(false);
            jVar.j(0.0f);
            jVar.a(0, 0.0f);
            jVar.i(0.0f);
            jVar.f(false);
            jVar.e(false);
        }
    }

    static void g(InterfaceC0716d interfaceC0716d, RoundingParams roundingParams) {
        g gVar = (g) interfaceC0716d;
        Drawable l = gVar.l();
        if (roundingParams == null || roundingParams.g() != RoundingParams.RoundingMethod.OVERLAY_COLOR) {
            if (l instanceof RoundedCornersDrawable) {
                Drawable drawable = a;
                gVar.o(((RoundedCornersDrawable) l).o(drawable));
                drawable.setCallback(null);
                return;
            }
            return;
        }
        if (!(l instanceof RoundedCornersDrawable)) {
            gVar.o(d(gVar.o(a), roundingParams));
            return;
        }
        RoundedCornersDrawable roundedCornersDrawable = (RoundedCornersDrawable) l;
        b(roundedCornersDrawable, roundingParams);
        roundedCornersDrawable.p(roundingParams.d());
    }

    static o h(InterfaceC0716d interfaceC0716d, q qVar) {
        Drawable e2 = e(interfaceC0716d.g(a), qVar, null);
        interfaceC0716d.g(e2);
        h.e(e2, "Parent has no child drawable!");
        return (o) e2;
    }
}
