package com.bytedance.android.input.speech.view;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class n extends p {
    private boolean a;

    public final void a(boolean z) {
        this.a = z;
    }

    @Override // com.bytedance.android.input.speech.view.p, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        kotlin.s.c.l.f(canvas, "canvas");
        kotlin.s.c.l.f(paint, "paint");
        if (charSequence != null) {
            if (this.a) {
                super.draw(canvas, charSequence, i, i2, f2, i3, i4, i5, paint);
            } else {
                canvas.drawText(charSequence, i, i2, f2, i4, paint);
            }
            float descent = paint.descent() + i4;
            float measureText = f2 + paint.measureText(charSequence, i, i2);
            LinearGradient linearGradient = new LinearGradient(f2, descent, measureText, descent, (int[]) null, (float[]) null, Shader.TileMode.CLAMP);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.FILL);
            paint2.setShader(linearGradient);
            Path path = new Path();
            path.moveTo(f2, descent);
            path.lineTo(measureText, descent);
            throw null;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        kotlin.s.c.l.f(paint, "paint");
        return (int) paint.measureText(charSequence, i, i2);
    }
}
