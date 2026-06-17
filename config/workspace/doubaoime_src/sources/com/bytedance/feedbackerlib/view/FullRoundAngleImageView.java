package com.bytedance.feedbackerlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.feedbackerlib.b;

/* loaded from: classes.dex */
public class FullRoundAngleImageView extends AppCompatImageView {
    private Paint a;
    private Paint b;

    /* renamed from: c, reason: collision with root package name */
    private int f4998c;

    /* renamed from: d, reason: collision with root package name */
    private int f4999d;

    public FullRoundAngleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4998c = 20;
        this.f4999d = 20;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b);
            this.f4998c = obtainStyledAttributes.getDimensionPixelSize(1, this.f4998c);
            this.f4999d = obtainStyledAttributes.getDimensionPixelSize(0, this.f4999d);
            obtainStyledAttributes.recycle();
        } else {
            float f2 = context.getResources().getDisplayMetrics().density;
            this.f4998c = (int) (this.f4998c * f2);
            this.f4999d = (int) (this.f4999d * f2);
        }
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setAntiAlias(true);
        this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setXfermode(null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.draw(canvas2);
        Path path = new Path();
        path.moveTo(0.0f, this.f4999d);
        path.lineTo(0.0f, 0.0f);
        path.lineTo(this.f4998c, 0.0f);
        path.arcTo(new RectF(0.0f, 0.0f, this.f4998c * 2, this.f4999d * 2), -90.0f, -90.0f);
        path.close();
        canvas2.drawPath(path, this.a);
        Path path2 = new Path();
        path2.moveTo(0.0f, getHeight() - this.f4999d);
        path2.lineTo(0.0f, getHeight());
        path2.lineTo(this.f4998c, getHeight());
        path2.arcTo(new RectF(0.0f, getHeight() - (this.f4999d * 2), this.f4998c * 2, getHeight()), 90.0f, 90.0f);
        path2.close();
        canvas2.drawPath(path2, this.a);
        Path path3 = new Path();
        path3.moveTo(getWidth(), this.f4999d);
        path3.lineTo(getWidth(), 0.0f);
        path3.lineTo(getWidth() - this.f4998c, 0.0f);
        path3.arcTo(new RectF(getWidth() - (this.f4998c * 2), 0.0f, getWidth(), this.f4999d * 2), -90.0f, 90.0f);
        path3.close();
        canvas2.drawPath(path3, this.a);
        Path path4 = new Path();
        path4.moveTo(getWidth() - this.f4998c, getHeight());
        path4.lineTo(getWidth(), getHeight());
        path4.lineTo(getWidth(), getHeight() - this.f4999d);
        path4.arcTo(new RectF(getWidth() - (this.f4998c * 2), getHeight() - (this.f4999d * 2), getWidth(), getHeight()), 0.0f, 90.0f);
        path4.close();
        canvas2.drawPath(path4, this.a);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.b);
        createBitmap.recycle();
    }

    public FullRoundAngleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4998c = 20;
        this.f4999d = 20;
        init(context, attributeSet);
    }

    public FullRoundAngleImageView(Context context) {
        super(context);
        this.f4998c = 20;
        this.f4999d = 20;
        init(context, null);
    }
}
