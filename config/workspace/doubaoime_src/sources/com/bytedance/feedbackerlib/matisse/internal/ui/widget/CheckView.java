package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.res.ResourcesCompat;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public class CheckView extends View {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f4891c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f4892d;

    /* renamed from: e, reason: collision with root package name */
    private Paint f4893e;

    /* renamed from: f, reason: collision with root package name */
    private TextPaint f4894f;

    /* renamed from: g, reason: collision with root package name */
    private Paint f4895g;
    private Drawable h;
    private float i;
    private Rect j;
    private boolean k;

    public CheckView(Context context) {
        super(context);
        this.k = true;
        a(context);
    }

    private void a(Context context) {
        this.i = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.f4892d = paint;
        paint.setAntiAlias(true);
        this.f4892d.setStyle(Paint.Style.STROKE);
        this.f4892d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f4892d.setStrokeWidth(this.i * 1.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C0838R.attr.item_checkCircle_borderColor});
        int color = obtainStyledAttributes.getColor(0, ResourcesCompat.getColor(getResources(), C0838R.color.feedbackerlib_item_checkCircle_borderColor, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.f4892d.setColor(color);
        this.h = ResourcesCompat.getDrawable(context.getResources(), C0838R.drawable.ic_check_white_18dp, context.getTheme());
    }

    private void b() {
        if (this.f4893e == null) {
            Paint paint = new Paint();
            this.f4893e = paint;
            paint.setAntiAlias(true);
            this.f4893e.setStyle(Paint.Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{C0838R.attr.item_checkCircle_backgroundColor});
            int color = ResourcesCompat.getColor(getResources(), C0838R.color.feedbackerlib_item_checkCircle_backgroundColor, getContext().getTheme());
            obtainStyledAttributes.getColor(0, color);
            obtainStyledAttributes.recycle();
            this.f4893e.setColor(color);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4895g == null) {
            Paint paint = new Paint();
            this.f4895g = paint;
            paint.setAntiAlias(true);
            float f2 = (float) (12.5f - 1.5d);
            Paint paint2 = this.f4895g;
            float f3 = this.i;
            float f4 = (f3 * 30.0f) / 2.0f;
            paint2.setShader(new RadialGradient(f4, f4, f3 * 12.5f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#1F000000"), Color.parseColor("#1F000000"), Color.parseColor("#00000000")}, new float[]{(f2 - 0.0f) / 12.5f, f2 / 12.5f, 1.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f5 = this.i;
        canvas.drawCircle((f5 * 30.0f) / 2.0f, (f5 * 30.0f) / 2.0f, f5 * 12.5f, this.f4895g);
        if (this.a) {
            if (this.f4891c != Integer.MIN_VALUE) {
                b();
                float f6 = this.i;
                canvas.drawCircle((f6 * 30.0f) / 2.0f, (30.0f * f6) / 2.0f, f6 * 12.0f, this.f4893e);
                if (this.f4894f == null) {
                    TextPaint textPaint = new TextPaint();
                    this.f4894f = textPaint;
                    textPaint.setAntiAlias(true);
                    this.f4894f.setColor(-1);
                    this.f4894f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.f4894f.setTextSize(this.i * 12.0f);
                }
                canvas.drawText(String.valueOf(this.f4891c), ((int) (canvas.getWidth() - this.f4894f.measureText(r2))) / 2, ((int) ((canvas.getHeight() - this.f4894f.descent()) - this.f4894f.ascent())) / 2, this.f4894f);
            } else {
                float f7 = this.i;
                canvas.drawCircle((f7 * 30.0f) / 2.0f, (30.0f * f7) / 2.0f, f7 * 12.0f, this.f4892d);
            }
        } else if (this.b) {
            b();
            float f8 = this.i;
            canvas.drawCircle((f8 * 30.0f) / 2.0f, (f8 * 30.0f) / 2.0f, f8 * 12.0f, this.f4893e);
            Drawable drawable = this.h;
            if (this.j == null) {
                float f9 = this.i;
                int i = (int) (((f9 * 30.0f) / 2.0f) - ((f9 * 16.0f) / 2.0f));
                int i2 = (int) ((this.i * 30.0f) - i);
                this.j = new Rect(i, i, i2, i2);
            }
            drawable.setBounds(this.j);
            this.h.draw(canvas);
        } else {
            float f10 = this.i;
            canvas.drawCircle((f10 * 30.0f) / 2.0f, (30.0f * f10) / 2.0f, f10 * 12.0f, this.f4892d);
        }
        setAlpha(this.k ? 1.0f : 0.5f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.i * 30.0f), BasicMeasure.EXACTLY);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setChecked(boolean z) {
        if (this.a) {
            throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
        }
        this.b = z;
        invalidate();
    }

    public void setCheckedNum(int i) {
        if (!this.a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        }
        if (i != Integer.MIN_VALUE && i <= 0) {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
        this.f4891c = i;
        invalidate();
    }

    public void setCountable(boolean z) {
        this.a = z;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (this.k != z) {
            this.k = z;
            invalidate();
        }
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = true;
        a(context);
    }

    public CheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = true;
        a(context);
    }
}
