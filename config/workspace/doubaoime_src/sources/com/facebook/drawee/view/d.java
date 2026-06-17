package com.facebook.drawee.view;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.q;
import e.c.h.e.a;

/* loaded from: classes2.dex */
class d implements a.b {
    final /* synthetic */ SimpleDraweeView a;

    class a implements Runnable {
        final /* synthetic */ Drawable a;

        a(Drawable drawable) {
            this.a = drawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a.j().x(this.a, q.a);
        }
    }

    d(SimpleDraweeView simpleDraweeView) {
        this.a = simpleDraweeView;
    }

    @Override // e.c.h.e.a.b
    public void a(Bitmap bitmap) {
        if (bitmap != null) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            if (this.a.getRootView() != null) {
                this.a.post(new a(bitmapDrawable));
            }
        }
    }
}
