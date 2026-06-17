package e.c.e.b.a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.i;

/* loaded from: classes2.dex */
public class a implements e.c.h.k.a {
    private final Resources a;
    private final e.c.h.k.a b;

    public a(Resources resources, e.c.h.k.a aVar) {
        this.a = resources;
        this.b = aVar;
    }

    @Override // e.c.h.k.a
    public Drawable a(com.facebook.imagepipeline.image.d dVar, Drawable drawable) {
        try {
            e.c.h.m.b.b();
            if (dVar instanceof com.facebook.imagepipeline.image.e) {
                return c(dVar);
            }
            e.c.h.k.a aVar = this.b;
            if (aVar == null || !aVar.b(dVar)) {
                return null;
            }
            return this.b.a(dVar, drawable);
        } finally {
            e.c.h.m.b.b();
        }
    }

    @Override // e.c.h.k.a
    public boolean b(com.facebook.imagepipeline.image.d dVar) {
        return true;
    }

    @Override // e.c.h.k.a
    public Drawable c(com.facebook.imagepipeline.image.d dVar) {
        try {
            e.c.h.m.b.b();
            if (!(dVar instanceof com.facebook.imagepipeline.image.e)) {
                e.c.h.k.a aVar = this.b;
                if (aVar == null || !aVar.b(dVar)) {
                    return null;
                }
                return this.b.c(dVar);
            }
            com.facebook.imagepipeline.image.e eVar = (com.facebook.imagepipeline.image.e) dVar;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, eVar.s());
            if (!((eVar.A() == 0 || eVar.A() == -1) ? false : true)) {
                if (!((eVar.x() == 1 || eVar.x() == 0) ? false : true)) {
                    return bitmapDrawable;
                }
            }
            return new i(bitmapDrawable, eVar.A(), eVar.x());
        } finally {
            e.c.h.m.b.b();
        }
    }
}
