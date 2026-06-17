package e.i.b.f;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import kotlin.w.h;

/* loaded from: classes2.dex */
public final class d {
    @ColorInt
    public static final int a(@ColorInt int i, float f2) {
        if (f2 == 1.0f) {
            return i;
        }
        return Color.argb((int) (Color.alpha(i) * h.e(f2, 0.0f, 1.0f)), Color.red(i), Color.green(i), Color.blue(i));
    }
}
