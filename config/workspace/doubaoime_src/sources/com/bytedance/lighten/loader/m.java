package com.bytedance.lighten.loader;

import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: classes.dex */
public class m {
    private static com.facebook.drawee.generic.a a(ImageView imageView, com.bytedance.lighten.core.i iVar) {
        RoundingParams roundingParams = new RoundingParams();
        if (iVar.f() != null) {
            roundingParams = k.c(roundingParams, iVar.f());
        }
        com.facebook.drawee.generic.b bVar = new com.facebook.drawee.generic.b(imageView.getResources());
        bVar.u(null);
        bVar.J(roundingParams);
        if (iVar.a() != null) {
            bVar.t(o.a(iVar.a()));
        }
        if (iVar.k() > 0) {
            bVar.B(iVar.k());
        }
        if (iVar.h() > 0) {
            bVar.x(iVar.h());
        }
        if (iVar.g() > 0) {
            bVar.w(iVar.g());
        }
        return bVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void b(ImageView imageView, com.bytedance.lighten.core.i iVar) {
        com.facebook.drawee.view.b<e.c.e.e.b> bVar;
        if (imageView != 0) {
            Object a = com.bytedance.lighten.core.n.a.a(imageView);
            ImageRequest[] imageRequestArr = null;
            com.facebook.drawee.view.b bVar2 = a instanceof com.facebook.drawee.view.b ? (com.facebook.drawee.view.b) a : null;
            d dVar = new d();
            dVar.m(iVar);
            if (bVar2 == null) {
                imageView.getContext();
                bVar2 = new com.facebook.drawee.view.b(null);
                h hVar = new h(bVar2);
                bVar2.n(a(imageView, iVar));
                if (iVar.o() != null && !iVar.o().b()) {
                    imageRequestArr = k.b(iVar);
                } else if (iVar.n() != null) {
                    imageRequestArr = new ImageRequest[]{k.a(iVar, iVar.n())};
                }
                if (imageRequestArr == null || imageRequestArr.length == 0) {
                    return;
                }
                e.c.e.b.a.e d2 = e.c.e.b.a.b.d();
                d2.l(iVar.r());
                d2.n(dVar);
                d2.s(bVar2.d());
                d2.p(imageRequestArr);
                d2.u(false);
                d2.v(false);
                bVar2.m(d2.a());
                if (imageView instanceof i) {
                    ((i) imageView).a(hVar);
                }
                if (imageView.isAttachedToWindow() && (bVar = hVar.a) != null) {
                    bVar.h();
                }
                imageView.addOnAttachStateChangeListener(hVar);
                imageView.setOnTouchListener(hVar);
                com.bytedance.lighten.core.n.a.b(imageView, bVar2);
            } else {
                bVar2.i();
                bVar2.n(a(imageView, iVar));
                if (iVar.o() != null && !iVar.o().b()) {
                    imageRequestArr = k.b(iVar);
                } else if (iVar.n() != null) {
                    imageRequestArr = new ImageRequest[]{k.a(iVar, iVar.n())};
                }
                if (imageRequestArr == null || imageRequestArr.length == 0) {
                    return;
                }
                e.c.e.b.a.e d3 = e.c.e.b.a.b.d();
                d3.l(iVar.r());
                d3.n(dVar);
                d3.p(imageRequestArr);
                d3.s(bVar2.d());
                d3.u(false);
                d3.v(false);
                bVar2.m(d3.a());
                bVar2.h();
            }
            imageView.setImageDrawable(bVar2.f());
        }
    }
}
