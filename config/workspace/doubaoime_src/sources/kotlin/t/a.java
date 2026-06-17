package kotlin.t;

/* loaded from: classes2.dex */
public final class a extends b {
    public static int a(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }
}
