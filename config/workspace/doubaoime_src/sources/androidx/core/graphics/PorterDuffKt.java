package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class PorterDuffKt {
    public static final PorterDuffColorFilter toColorFilter(PorterDuff.Mode mode, int i) {
        l.f(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }

    public static final PorterDuffXfermode toXfermode(PorterDuff.Mode mode) {
        l.f(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
