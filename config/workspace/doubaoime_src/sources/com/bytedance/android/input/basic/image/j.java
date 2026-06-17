package com.bytedance.android.input.basic.image;

import android.os.SystemClock;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import com.bumptech.glide.load.resource.bitmap.k;
import com.bumptech.glide.load.resource.bitmap.y;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class j {
    private static h a = new c();

    public static final void a(i iVar) {
        l.f(iVar, "request");
        c cVar = (c) a;
        l.f(iVar, "request");
        ImageView d2 = iVar.d();
        int h = iVar.h();
        if (h <= 0) {
            d2.setClipToOutline(false);
            d2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        } else {
            d2.setClipToOutline(true);
            d2.setOutlineProvider(new a(h));
        }
        com.bumptech.glide.request.h g2 = new com.bumptech.glide.request.h().R(iVar.g()).P(GifDrawable.class, new com.bumptech.glide.load.resource.gif.e(new y(iVar.h()))).g(iVar.b());
        l.e(g2, "RequestOptions()\n       …error(request.errorResId)");
        com.bumptech.glide.request.h hVar = g2;
        if (iVar.j() > 0 && iVar.c() > 0) {
            com.bumptech.glide.request.h Q = hVar.Q(iVar.j(), iVar.c());
            l.e(Q, "options.override(request.width, request.height)");
            hVar = Q;
        }
        com.bumptech.glide.c.n(iVar.a()).l().m0(iVar.i()).a(hVar).k0(new b(SystemClock.elapsedRealtime(), iVar, cVar)).j0(iVar.d());
    }

    public static final void b(i iVar) {
        com.bumptech.glide.request.h hVar;
        l.f(iVar, "request");
        c cVar = (c) a;
        l.f(iVar, "request");
        com.bumptech.glide.request.h g2 = new com.bumptech.glide.request.h().R(iVar.g()).g(iVar.b());
        l.e(g2, "RequestOptions()\n       …error(request.errorResId)");
        com.bumptech.glide.request.h hVar2 = g2;
        if (iVar.j() > 0 && iVar.c() > 0) {
            com.bumptech.glide.request.h Q = hVar2.Q(iVar.j(), iVar.c());
            l.e(Q, "options.override(request.width, request.height)");
            hVar2 = Q;
        }
        if (iVar.k()) {
            com.bumptech.glide.request.h Y = hVar2.Y(new k());
            l.e(Y, "{\n            // 圆形\n    …m(CircleCrop())\n        }");
            hVar = Y;
        } else {
            com.bumptech.glide.request.h Y2 = hVar2.Y(new y(iVar.h()));
            l.e(Y2, "{\n            // 圆角\n    …uest.radiusDp))\n        }");
            hVar = Y2;
        }
        com.bumptech.glide.request.h e2 = hVar.e(com.bumptech.glide.load.engine.j.f1647c);
        l.e(e2, "options.diskCacheStrateg…kCacheStrategy.AUTOMATIC)");
        com.bumptech.glide.c.n(iVar.a()).r(iVar.i()).a(e2).k0(new b(SystemClock.elapsedRealtime(), iVar, cVar)).j0(iVar.d());
    }
}
