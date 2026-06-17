package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class BitmapDrawableKt {
    public static final BitmapDrawable toDrawable(Bitmap bitmap, Resources resources) {
        l.f(bitmap, "<this>");
        l.f(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
