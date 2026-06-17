package com.google.android.material.bottomappbar;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    private static final int ANGLE_LEFT = 180;
    private static final int ANGLE_UP = 270;
    private static final int ARC_HALF = 180;
    private static final int ARC_QUARTER = 90;
    private static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    private float cradleVerticalOffset;
    private float fabCornerSize = -1.0f;
    private float fabDiameter;
    private float fabMargin;
    private float horizontalOffset;
    private float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f2, float f3, float f4) {
        this.fabMargin = f2;
        this.roundedCornerRadius = f3;
        setCradleVerticalOffset(f4);
        this.horizontalOffset = 0.0f;
    }

    float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f2, float f3, float f4, @NonNull ShapePath shapePath) {
        float f5;
        float f6;
        float f7 = this.fabDiameter;
        if (f7 == 0.0f) {
            shapePath.lineTo(f2, 0.0f);
            return;
        }
        float f8 = ((this.fabMargin * 2.0f) + f7) / 2.0f;
        float f9 = f4 * this.roundedCornerRadius;
        float f10 = f3 + this.horizontalOffset;
        float a = a.a(1.0f, f4, f8, this.cradleVerticalOffset * f4);
        if (a / f8 >= 1.0f) {
            shapePath.lineTo(f2, 0.0f);
            return;
        }
        float f11 = this.fabCornerSize;
        float f12 = f11 * f4;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f7) < 0.1f;
        if (z) {
            f5 = a;
            f6 = 0.0f;
        } else {
            f6 = ROUNDED_CORNER_FAB_OFFSET;
            f5 = 0.0f;
        }
        float f13 = f8 + f9;
        float f14 = f5 + f9;
        float sqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f10 - sqrt;
        float f16 = f10 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f14));
        float f17 = (90.0f - degrees) + f6;
        shapePath.lineTo(f15, 0.0f);
        float f18 = f9 * 2.0f;
        shapePath.addArc(f15 - f9, 0.0f, f15 + f9, f18, 270.0f, degrees);
        if (z) {
            shapePath.addArc(f10 - f8, (-f8) - f5, f10 + f8, f8 - f5, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.fabMargin;
            float f20 = f12 * 2.0f;
            float f21 = f10 - f8;
            shapePath.addArc(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f10 + f8;
            float f23 = this.fabMargin;
            shapePath.lineTo(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.fabMargin;
            shapePath.addArc(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        shapePath.addArc(f16 - f9, 0.0f, f16 + f9, f18, 270.0f - degrees, degrees);
        shapePath.lineTo(f2, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    float getFabCradleMargin() {
        return this.fabMargin;
    }

    float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getFabDiameter() {
        return this.fabDiameter;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    void setCradleVerticalOffset(@FloatRange(from = 0.0d) float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f2;
    }

    public void setFabCornerSize(float f2) {
        this.fabCornerSize = f2;
    }

    void setFabCradleMargin(float f2) {
        this.fabMargin = f2;
    }

    void setFabCradleRoundedCornerRadius(float f2) {
        this.roundedCornerRadius = f2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setFabDiameter(float f2) {
        this.fabDiameter = f2;
    }

    void setHorizontalOffset(float f2) {
        this.horizontalOffset = f2;
    }
}
