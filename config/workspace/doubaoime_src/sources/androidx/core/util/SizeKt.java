package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.RequiresApi;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class SizeKt {
    @RequiresApi(21)
    public static final int component1(Size size) {
        l.f(size, "<this>");
        return size.getWidth();
    }

    @RequiresApi(21)
    public static final int component2(Size size) {
        l.f(size, "<this>");
        return size.getHeight();
    }

    @RequiresApi(21)
    public static final float component1(SizeF sizeF) {
        l.f(sizeF, "<this>");
        return sizeF.getWidth();
    }

    @RequiresApi(21)
    public static final float component2(SizeF sizeF) {
        l.f(sizeF, "<this>");
        return sizeF.getHeight();
    }

    public static final float component1(SizeFCompat sizeFCompat) {
        l.f(sizeFCompat, "<this>");
        return sizeFCompat.getWidth();
    }

    public static final float component2(SizeFCompat sizeFCompat) {
        l.f(sizeFCompat, "<this>");
        return sizeFCompat.getHeight();
    }
}
