package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;

/* loaded from: classes2.dex */
public class n extends m {
    public n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // com.facebook.drawee.drawable.m, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        e.c.h.m.b.b();
        if (!g()) {
            super.draw(canvas);
            e.c.h.m.b.b();
            return;
        }
        k();
        h();
        canvas.clipPath(this.f6381e);
        super.draw(canvas);
        e.c.h.m.b.b();
    }
}
