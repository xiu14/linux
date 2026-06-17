package e.c.h.d;

import android.graphics.Bitmap;
import e.c.c.g.d;

/* loaded from: classes2.dex */
public class c implements d<Bitmap> {
    private static c a;

    private c() {
    }

    public static c a() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    @Override // e.c.c.g.d
    public void release(Bitmap bitmap) {
        bitmap.recycle();
    }
}
