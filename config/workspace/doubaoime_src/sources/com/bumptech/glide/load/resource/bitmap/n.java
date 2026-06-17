package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
final class n {
    private static final com.bumptech.glide.load.engine.B.d a = new a();

    class a extends com.bumptech.glide.load.engine.B.e {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.B.e, com.bumptech.glide.load.engine.B.d
        public void c(Bitmap bitmap) {
        }
    }

    @Nullable
    static com.bumptech.glide.load.engine.v<Bitmap> a(com.bumptech.glide.load.engine.B.d dVar, Drawable drawable, int i, int i2) {
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock g2 = A.g();
                    g2.lock();
                    Bitmap d2 = dVar.d(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(d2);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        g2.unlock();
                        bitmap = d2;
                    } catch (Throwable th) {
                        g2.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            z = true;
        }
        if (!z) {
            dVar = a;
        }
        return e.b(bitmap, dVar);
    }
}
