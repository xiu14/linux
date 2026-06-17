package com.obric.oui.progress;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewKt;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes2.dex */
public class ODownloadProgressView extends View {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f7944c;

    /* renamed from: d, reason: collision with root package name */
    private int f7945d;

    /* renamed from: e, reason: collision with root package name */
    private int f7946e;

    /* renamed from: f, reason: collision with root package name */
    private int f7947f;

    /* renamed from: g, reason: collision with root package name */
    private int f7948g;
    private int h;
    private final ValueAnimator i;
    private final int j;
    private int k;
    private int l;
    private int m;
    private Drawable n;
    private Drawable o;
    private Drawable p;
    private Drawable q;
    private Drawable r;
    private Drawable s;
    private Drawable t;
    private final Path u;
    private final PorterDuffXfermode v;
    private final ValueAnimator w;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int a;
        int b;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        SavedState(Parcel parcel, a aVar) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }
    }

    class a implements l<View, o> {
        a() {
        }

        @Override // kotlin.s.b.l
        public o invoke(View view) {
            if (ODownloadProgressView.this.a != 0 || !ODownloadProgressView.this.isShown()) {
                ODownloadProgressView.this.e();
                return o.a;
            }
            if (ODownloadProgressView.this.w.isRunning()) {
                return o.a;
            }
            ODownloadProgressView.this.e();
            ODownloadProgressView.this.w.setInterpolator(new LinearInterpolator());
            ODownloadProgressView.this.w.setDuration(ODownloadProgressView.this.l);
            ODownloadProgressView.this.w.setFloatValues(0.0f, 360.0f);
            ODownloadProgressView.this.w.addUpdateListener(new com.obric.oui.progress.a(this));
            ODownloadProgressView.this.w.setRepeatCount(-1);
            ODownloadProgressView.this.w.start();
            return o.a;
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ODownloadProgressView.this.invalidate();
        }
    }

    private static class c {
        private static final SparseArray<Bitmap> a = new SparseArray<>(3);

        public static Bitmap a(Context context, int i) {
            SparseArray<Bitmap> sparseArray = a;
            Bitmap bitmap = sparseArray.get(i);
            if (bitmap != null) {
                return bitmap;
            }
            Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), C0838R.drawable.o_ic_download_progress_gap, null);
            if (drawable == null) {
                return null;
            }
            drawable.setBounds(0, 0, i, i);
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            drawable.draw(new Canvas(createBitmap));
            sparseArray.put(i, createBitmap);
            return createBitmap;
        }
    }

    public ODownloadProgressView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.w.removeAllUpdateListeners();
        this.w.cancel();
    }

    private int f(float f2) {
        return (int) (f2 * Resources.getSystem().getDisplayMetrics().density);
    }

    private Drawable g(int i) {
        if (i == 0) {
            return this.n;
        }
        if (i == 1) {
            return this.p;
        }
        if (i == 2) {
            return this.q;
        }
        if (i == 3) {
            return this.r;
        }
        if (i == 4) {
            return this.s;
        }
        if (i != 5) {
            return null;
        }
        return this.t;
    }

    private boolean h(int i) {
        return i == 0 || i == 4 || i == 5;
    }

    private void i() {
        if (this.a != 0) {
            e();
        } else {
            ViewKt.doOnPreDraw(this, new a());
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.f7945d = 255;
        this.i.removeAllUpdateListeners();
        this.i.cancel();
        e();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7944c == null) {
            this.f7944c = new Paint();
        }
        this.f7944c.reset();
        this.f7944c.setAntiAlias(true);
        int i = this.f7946e;
        int i2 = i / 2;
        int i3 = i / 2;
        Drawable g2 = g(this.b);
        if (g2 != null && this.f7945d != 255) {
            if (h(this.b)) {
                int i4 = this.f7946e;
                g2.setBounds(0, 0, i4, i4);
            } else {
                int min = Math.min(g2.getIntrinsicWidth(), this.f7948g);
                int min2 = Math.min(g2.getIntrinsicHeight(), this.f7948g);
                int i5 = this.f7946e;
                g2.setBounds((i5 - min) / 2, (i5 - min2) / 2, (min + i5) / 2, (i5 + min2) / 2);
            }
            g2.setAlpha(255 - this.f7945d);
            g2.draw(canvas);
        }
        Drawable g3 = g(this.a);
        if (g3 != null) {
            if (h(this.a)) {
                int i6 = this.f7946e;
                g3.setBounds(0, 0, i6, i6);
            } else {
                int i7 = this.f7946e;
                int i8 = this.f7948g;
                g3.setBounds((i7 - i8) / 2, (i7 - i8) / 2, (i7 + i8) / 2, (i7 + i8) / 2);
            }
            if (this.a == 0 && this.w.isRunning() && this.w.getAnimatedValue() != null) {
                canvas.rotate(((Float) this.w.getAnimatedValue()).floatValue(), i2, i3);
            }
            g3.setAlpha(this.f7945d);
            g3.draw(canvas);
            if (h(this.a)) {
                invalidate();
                return;
            }
        }
        float floatValue = (((!this.i.isRunning() || this.i.getAnimatedValue() == null) ? this.h : ((Float) this.i.getAnimatedValue()).floatValue()) * 360.0f) / 100.0f;
        canvas.saveLayer(null, null, 31);
        if (floatValue >= 360.0f) {
            this.o.setColorFilter(this.j, PorterDuff.Mode.SRC_IN);
            this.o.draw(canvas);
        } else {
            this.o.setColorFilter(this.k, PorterDuff.Mode.SRC_IN);
            this.o.draw(canvas);
            this.u.reset();
            this.u.moveTo(getWidth() / 2.0f, getHeight() / 2.0f);
            this.u.arcTo(0.0f, 0.0f, getWidth(), getHeight(), -90.0f, floatValue, false);
            canvas.save();
            canvas.clipPath(this.u);
            this.o.setColorFilter(this.j, PorterDuff.Mode.SRC_IN);
            this.o.draw(canvas);
            canvas.restore();
        }
        Bitmap a2 = c.a(getContext(), this.f7947f);
        if (a2 != null) {
            this.f7944c.setXfermode(this.v);
            this.f7944c.setColor(ViewCompat.MEASURED_STATE_MASK);
            canvas.drawBitmap(a2, 0.0f, 0.0f, this.f7944c);
            if (floatValue < 360.0f) {
                canvas.rotate(floatValue, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas.drawBitmap(a2, 0.0f, 0.0f, this.f7944c);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || size <= 0) {
            this.f7946e = this.f7947f;
        } else {
            this.f7946e = size;
        }
        int i3 = this.f7946e;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentState(savedState.b);
        setProgress(savedState.a);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.h;
        savedState.b = this.a;
        return savedState;
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            i();
        } else {
            e();
        }
    }

    public void setAlphaAnimationDuration(long j) {
    }

    public void setCurrentState(int i) {
        int i2 = this.a;
        if (i2 == i) {
            return;
        }
        this.b = i2;
        this.a = i;
        invalidate();
        i();
    }

    public void setDownloadDrawable(Drawable drawable) {
        this.p = drawable;
    }

    public void setFailedDrawable(Drawable drawable) {
        this.t = drawable;
    }

    public void setPauseDrawable(Drawable drawable) {
        this.q = drawable;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        invalidate();
    }

    public void setProcessingDrawable(Drawable drawable) {
        this.n = drawable;
    }

    public void setProcessingDuration(int i) {
        this.l = i;
    }

    public void setProgress(int i) {
        setProgress(i, false);
    }

    public void setProgressBgDrawable(Drawable drawable) {
        this.o = drawable;
    }

    public void setProgressDuration(int i) {
        this.m = i;
    }

    public void setRetryDrawable(Drawable drawable) {
        this.r = drawable;
    }

    public void setSize(int i) {
        if (i == 0) {
            this.f7947f = f(48.0f);
            f(20.0f);
            f(16.0f);
            this.f7948g = f(24.0f);
        } else if (i != 2) {
            this.f7947f = f(36.0f);
            f(15.0f);
            f(12.0f);
            this.f7948g = f(18.0f);
        } else {
            this.f7947f = f(24.0f);
            f(10.0f);
            f(8.0f);
            this.f7948g = f(12.0f);
        }
        Drawable drawable = this.o;
        int i2 = this.f7947f;
        drawable.setBounds(0, 0, i2, i2);
        invalidate();
    }

    public void setSucceedDrawable(Drawable drawable) {
        this.s = drawable;
    }

    public ODownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setProgress(int i, boolean z) {
        if (this.h == i) {
            return;
        }
        this.i.cancel();
        int i2 = this.h;
        int max = Math.max(Math.min(i, 100), 0);
        this.h = max;
        if (i2 > max || !z) {
            invalidate();
            return;
        }
        this.i.setInterpolator(new LinearInterpolator());
        this.i.setDuration((Math.abs(this.h - i2) * this.m) / 100);
        this.i.setFloatValues(i2, this.h);
        this.i.addUpdateListener(new b());
        this.i.start();
    }

    public ODownloadProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = 0;
        this.b = 0;
        this.f7945d = 255;
        this.i = new ValueAnimator();
        this.l = 1200;
        this.m = 2000;
        this.u = new Path();
        this.v = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.w = new ValueAnimator();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.i.a.b.b.r, i, 0);
        int i2 = obtainStyledAttributes.getInt(5, 1);
        this.h = obtainStyledAttributes.getInt(3, 0);
        this.j = obtainStyledAttributes.getColor(4, ContextCompat.getColor(context, C0838R.color.oui_accent_fg));
        obtainStyledAttributes.getColor(2, ContextCompat.getColor(context, C0838R.color.oui_text_3));
        this.k = obtainStyledAttributes.getColor(0, ContextCompat.getColor(context, C0838R.color.oui_line_3));
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.n = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_progress_processing, null);
        this.o = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_download_progress_bg, null);
        this.p = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_arrow_down_download, null);
        this.q = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_pause_download, null);
        this.r = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_download_retry, null);
        if (color != 0) {
            this.p = this.p.mutate();
            this.q = this.q.mutate();
            this.r = this.r.mutate();
            DrawableCompat.setTint(this.p, color);
            DrawableCompat.setTint(this.q, color);
            DrawableCompat.setTint(this.r, color);
        }
        this.s = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_download_succeed, null);
        this.t = ResourcesCompat.getDrawable(getResources(), C0838R.drawable.o_ic_download_failed, null);
        setSize(i2);
        i();
    }
}
