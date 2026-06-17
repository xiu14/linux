package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

/* loaded from: classes2.dex */
final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float trackLength;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.trackLength = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @FloatRange(from = 0.0d, to = 1.0d) float f2) {
        Rect clipBounds = canvas.getClipBounds();
        this.trackLength = clipBounds.width();
        float f3 = ((LinearProgressIndicatorSpec) this.spec).trackThickness;
        canvas.translate((clipBounds.width() / 2.0f) + clipBounds.left, Math.max(0.0f, (clipBounds.height() - ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f) + (clipBounds.height() / 2.0f) + clipBounds.top);
        if (((LinearProgressIndicatorSpec) this.spec).drawHorizontallyInverse) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.drawable.isShowing() && ((LinearProgressIndicatorSpec) this.spec).showAnimationBehavior == 1) || (this.drawable.isHiding() && ((LinearProgressIndicatorSpec) this.spec).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.drawable.isShowing() || this.drawable.isHiding()) {
            canvas.translate(0.0f, ((f2 - 1.0f) * ((LinearProgressIndicatorSpec) this.spec).trackThickness) / 2.0f);
        }
        float f4 = this.trackLength;
        canvas.clipRect((-f4) / 2.0f, (-f3) / 2.0f, f4 / 2.0f, f3 / 2.0f);
        S s = this.spec;
        this.displayedTrackThickness = ((LinearProgressIndicatorSpec) s).trackThickness * f2;
        this.displayedCornerRadius = ((LinearProgressIndicatorSpec) s).trackCornerRadius * f2;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = 1.0d) float f2, @FloatRange(from = 0.0d, to = 1.0d) float f3, @ColorInt int i) {
        if (f2 == f3) {
            return;
        }
        float f4 = this.trackLength;
        float f5 = this.displayedCornerRadius;
        float f6 = ((f4 - (f5 * 2.0f)) * f2) + ((-f4) / 2.0f);
        float f7 = ((f4 - (f5 * 2.0f)) * f3) + ((-f4) / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f8 = this.displayedTrackThickness;
        RectF rectF = new RectF(f6, (-f8) / 2.0f, (f5 * 2.0f) + f7, f8 / 2.0f);
        float f9 = this.displayedCornerRadius;
        canvas.drawRoundRect(rectF, f9, f9, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.spec).trackColor, this.drawable.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        float f2 = this.trackLength;
        float f3 = this.displayedTrackThickness;
        RectF rectF = new RectF((-f2) / 2.0f, (-f3) / 2.0f, f2 / 2.0f, f3 / 2.0f);
        float f4 = this.displayedCornerRadius;
        canvas.drawRoundRect(rectF, f4, f4, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.spec).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }
}
