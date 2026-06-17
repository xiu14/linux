package androidx.core.graphics;

import android.graphics.Paint;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class PaintKt {
    public static final boolean setBlendMode(Paint paint, BlendModeCompat blendModeCompat) {
        l.f(paint, "<this>");
        return PaintCompat.setBlendMode(paint, blendModeCompat);
    }
}
