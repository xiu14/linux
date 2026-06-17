package com.obric.oui.slider;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlin.collections.o;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes2.dex */
public class TickMarkSeekBar extends AppCompatSeekBar {
    private final String a;
    private Drawable b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f8028c;

    /* renamed from: d, reason: collision with root package name */
    private d f8029d;

    /* renamed from: e, reason: collision with root package name */
    private int f8030e;

    /* renamed from: f, reason: collision with root package name */
    private int f8031f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8032g;
    private int h;
    private int i;
    private TickMarkStyle j;
    private final e k;
    private a l;

    public enum TickMarkStyle {
        DEFAULT,
        MARGIN16;

        public static final a Companion = new a(null);

        public static final class a {
            public a(g gVar) {
            }
        }
    }

    public interface a {
        void a(SeekBar seekBar, float f2, boolean z);

        void b(int i);

        void onStartTrackingTouch(SeekBar seekBar);

        void onStopTrackingTouch(SeekBar seekBar);
    }

    public static final class b implements Animator.AnimatorListener {
        final /* synthetic */ int b;

        b(int i) {
            this.b = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            l.f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.f(animator, "animation");
            TickMarkSeekBar.this.h = this.b;
            a aVar = TickMarkSeekBar.this.l;
            if (aVar != null) {
                aVar.b(this.b);
            }
            TickMarkSeekBar.this.invalidate();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            l.f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.f(animator, "animation");
        }
    }

    public static final class c implements SeekBar.OnSeekBarChangeListener {
        c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            l.f(seekBar, "seekBar");
            if (TickMarkSeekBar.this.isHapticFeedbackEnabled()) {
                e eVar = TickMarkSeekBar.this.k;
                Context context = TickMarkSeekBar.this.getContext();
                l.e(context, "context");
                eVar.a(context, seekBar, i, z, TickMarkSeekBar.this.f8030e, TickMarkSeekBar.this.f8032g);
            }
            a aVar = TickMarkSeekBar.this.l;
            if (aVar != null) {
                Objects.requireNonNull(TickMarkSeekBar.this);
                String format = String.format(Locale.CHINA, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(i / 100)}, 1));
                l.e(format, "format(locale, this, *args)");
                aVar.a(seekBar, Float.parseFloat(format), z);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            TickMarkSeekBar.this.h = -1;
            a aVar = TickMarkSeekBar.this.l;
            if (aVar != null) {
                aVar.onStartTrackingTouch(seekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            TickMarkSeekBar.this.g();
            a aVar = TickMarkSeekBar.this.l;
            if (aVar != null) {
                aVar.onStopTrackingTouch(TickMarkSeekBar.this);
            }
        }
    }

    public TickMarkSeekBar(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        Integer num;
        if (this.f8032g) {
            int i = this.f8030e;
            Drawable drawable = this.f8028c;
            l.c(drawable);
            float measuredWidth = getMeasuredWidth() - drawable.getIntrinsicWidth();
            float f2 = measuredWidth / (i - 1);
            kotlin.w.d i2 = h.i(0, i);
            ArrayList arrayList = new ArrayList(kotlin.collections.g.e(i2, 10));
            Iterator<Integer> it2 = i2.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(((o) it2).nextInt() * f2));
            }
            float progress = (getProgress() / getMax()) * measuredWidth;
            Iterator<Integer> it3 = kotlin.collections.g.v(arrayList).iterator();
            if (it3.hasNext()) {
                Integer next = it3.next();
                if (it3.hasNext()) {
                    float abs = Math.abs(((Number) arrayList.get(next.intValue())).floatValue() - progress);
                    do {
                        Integer next2 = it3.next();
                        float abs2 = Math.abs(((Number) arrayList.get(next2.intValue())).floatValue() - progress);
                        if (Float.compare(abs, abs2) > 0) {
                            next = next2;
                            abs = abs2;
                        }
                    } while (it3.hasNext());
                }
                num = next;
            } else {
                num = null;
            }
            Integer num2 = num;
            int intValue = num2 != null ? num2.intValue() : 0;
            int a2 = kotlin.t.a.a((((Number) arrayList.get(intValue)).floatValue() / measuredWidth) * getMax());
            int max = getMax();
            if (a2 > max) {
                a2 = max;
            }
            e.i.b.f.e.b.e(this.a, "anchorPoint, closestTickIndex: " + intValue + ", closestProgress: " + a2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "progress", a2);
            ofInt.setDuration(100L);
            ofInt.start();
            ofInt.addListener(new b(intValue));
        }
    }

    private final void h(Canvas canvas) {
        if (this.b != null) {
            int save = canvas.save();
            canvas.translate(m(), getPaddingTop());
            int measuredHeight = getMeasuredHeight() / 2;
            Drawable drawable = this.b;
            l.c(drawable);
            int intrinsicHeight = measuredHeight - (drawable.getIntrinsicHeight() / 2);
            int measuredWidth = getMeasuredWidth() - ((int) (m() * 2));
            int measuredHeight2 = getMeasuredHeight() / 2;
            Drawable drawable2 = this.b;
            l.c(drawable2);
            Rect rect = new Rect(0, intrinsicHeight, measuredWidth, (drawable2.getIntrinsicHeight() / 2) + measuredHeight2);
            Drawable drawable3 = this.b;
            if (drawable3 != null) {
                drawable3.setBounds(rect);
            }
            Drawable drawable4 = this.b;
            if (drawable4 != null) {
                drawable4.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    private final void i(Canvas canvas) {
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            int save = canvas.save();
            canvas.translate(m(), getPaddingTop());
            progressDrawable.setBounds(new Rect(0, (getMeasuredHeight() / 2) - (progressDrawable.getIntrinsicHeight() / 2), getMeasuredWidth() - ((int) (m() * 2)), (progressDrawable.getIntrinsicHeight() / 2) + (getMeasuredHeight() / 2)));
            progressDrawable.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    private final void j(Canvas canvas) {
        Drawable drawable;
        TickMarkSeekBar tickMarkSeekBar = this;
        Drawable drawable2 = tickMarkSeekBar.f8028c;
        if (drawable2 == null || tickMarkSeekBar.f8030e <= 0 || !tickMarkSeekBar.f8032g) {
            return;
        }
        if (tickMarkSeekBar.j == TickMarkStyle.MARGIN16) {
            int save = canvas.save();
            canvas.translate(m(), getPaddingTop());
            int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 13);
            int measuredWidth = ((getMeasuredWidth() - (e0 * 2)) - drawable2.getIntrinsicWidth()) - ((int) (m() * 2));
            int i = tickMarkSeekBar.f8030e - 1;
            int i2 = measuredWidth / i;
            if (i >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = (i2 * i3) + e0;
                    drawable2.setBounds(i4, (getMeasuredHeight() / 2) - (drawable2.getIntrinsicHeight() / 2), drawable2.getIntrinsicWidth() + i4, (drawable2.getIntrinsicHeight() / 2) + (getMeasuredHeight() / 2));
                    drawable2.draw(canvas);
                    if (i3 == i) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            canvas.restoreToCount(save);
            return;
        }
        int save2 = canvas.save();
        canvas.translate(0.0f, getPaddingTop());
        int i5 = tickMarkSeekBar.f8030e;
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        float f2 = 4;
        int e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        int i6 = i5 - 1;
        int measuredWidth2 = (getMeasuredWidth() - drawable2.getIntrinsicWidth()) / i6;
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(C0838R.color.oui_line_2));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        int i7 = 0;
        while (i7 < i5) {
            int i8 = measuredWidth2 * i7;
            int i9 = intrinsicHeight / 2;
            int i10 = i5;
            int i11 = i8 + intrinsicWidth;
            int i12 = intrinsicHeight;
            drawable2.setBounds(i8, (getMeasuredHeight() / 2) - i9, i11, (getMeasuredHeight() / 2) + i9);
            if (tickMarkSeekBar.h != i7) {
                drawable2.draw(canvas);
            }
            if (i7 < i6) {
                int measuredHeight = getMeasuredHeight() / 2;
                Resources system = Resources.getSystem();
                l.e(system, "Resources.getSystem()");
                int a2 = measuredHeight - kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()));
                int measuredHeight2 = getMeasuredHeight() / 2;
                l.e(Resources.getSystem(), "Resources.getSystem()");
                drawable = drawable2;
                canvas.drawRoundRect(new RectF(i11 + e02, a2, ((r4 + measuredWidth2) - intrinsicWidth) - (e02 * 2), kotlin.t.a.a(TypedValue.applyDimension(1, f2, r15.getDisplayMetrics())) + measuredHeight2), e.a.a.a.a.e0("Resources.getSystem()", 1, f2), e.a.a.a.a.e0("Resources.getSystem()", 1, f2), paint);
            } else {
                drawable = drawable2;
            }
            i7++;
            tickMarkSeekBar = this;
            drawable2 = drawable;
            i5 = i10;
            intrinsicHeight = i12;
        }
        canvas.restoreToCount(save2);
    }

    private final LayerDrawable k() {
        if (!this.f8032g) {
            Context context = getContext();
            l.e(context, "context");
            return l(context, C0838R.drawable.o_background_seekbar);
        }
        if (this.f8031f < e.a.a.a.a.e0("Resources.getSystem()", 1, 10)) {
            return null;
        }
        Context context2 = getContext();
        l.e(context2, "context");
        return l(context2, C0838R.drawable.o_background_seekbar_segmented);
    }

    private final float m() {
        l.e(getThumb(), "thumb");
        return r0.getIntrinsicWidth() / 2;
    }

    public static /* synthetic */ void setDefaultBackgroudHeight$default(TickMarkSeekBar tickMarkSeekBar, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setDefaultBackgroudHeight");
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        tickMarkSeekBar.setDefaultBackgroudHeight(i, i2);
    }

    public static /* synthetic */ void setIsSegmented$default(TickMarkSeekBar tickMarkSeekBar, boolean z, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIsSegmented");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        tickMarkSeekBar.setIsSegmented(z, i, i2);
    }

    @Override // android.widget.ProgressBar, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        l.f(drawable, "dr");
        super.invalidateDrawable(drawable);
    }

    public final LayerDrawable l(Context context, int i) {
        l.f(context, "context");
        Drawable drawable = ContextCompat.getDrawable(context, i);
        if (!(drawable instanceof LayerDrawable)) {
            drawable = null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        if (layerDrawable != null) {
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
            if (!(findDrawableByLayerId instanceof GradientDrawable)) {
                findDrawableByLayerId = null;
            }
            GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
            if (gradientDrawable != null) {
                gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), this.f8031f);
                return layerDrawable;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        h(canvas);
        i(canvas);
        j(canvas);
        Drawable thumb = getThumb();
        if (thumb != null) {
            thumb.draw(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f8032g) {
            if (getThumb() != null) {
                Drawable thumb = getThumb();
                l.e(thumb, "thumb");
                i3 = thumb.getIntrinsicHeight();
            } else {
                i3 = 0;
            }
            if (getMeasuredHeight() == 0) {
                setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.makeMeasureSpec(i3, BasicMeasure.EXACTLY));
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
        if (getThumb() != null) {
            Drawable thumb = getThumb();
            l.e(thumb, "thumb");
            i5 = thumb.getIntrinsicHeight();
        } else {
            i5 = 0;
        }
        if (i5 <= paddingTop || getThumb() == null) {
            return;
        }
        int i6 = (paddingTop - i5) / 2;
        Drawable thumb2 = getThumb();
        l.e(thumb2, "thumb");
        Rect bounds = thumb2.getBounds();
        l.e(bounds, "thumb.bounds");
        Rect rect = new Rect(bounds.left, i6, bounds.right, i5 + i6);
        Drawable thumb3 = getThumb();
        l.e(thumb3, "thumb");
        thumb3.setBounds(rect);
    }

    public final void setDefaultBackgroudHeight(int i, int i2) {
        this.f8031f = i;
        this.b = k();
        if (!this.f8032g) {
            Drawable progressDrawable = getProgressDrawable();
            if (!(progressDrawable instanceof LayerDrawable)) {
                progressDrawable = null;
            }
            LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
            if (layerDrawable != null) {
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                if (!(findDrawableByLayerId instanceof ScaleDrawable)) {
                    findDrawableByLayerId = null;
                }
                ScaleDrawable scaleDrawable = (ScaleDrawable) findDrawableByLayerId;
                if (scaleDrawable != null) {
                    Drawable drawable = scaleDrawable.getDrawable();
                    GradientDrawable gradientDrawable = (GradientDrawable) (drawable instanceof GradientDrawable ? drawable : null);
                    if (gradientDrawable != null) {
                        gradientDrawable.setSize(gradientDrawable.getIntrinsicWidth(), this.f8031f);
                    }
                }
            }
            d dVar = this.f8029d;
            if (dVar != null) {
                dVar.c(i);
            }
        }
        Objects.requireNonNull(TickMarkStyle.Companion);
        this.j = i2 != 0 ? i2 != 1 ? TickMarkStyle.DEFAULT : TickMarkStyle.MARGIN16 : TickMarkStyle.DEFAULT;
        invalidate();
    }

    public final void setDefaultMargin(int i) {
        Drawable progressDrawable = getProgressDrawable();
        Objects.requireNonNull(progressDrawable, "null cannot be cast to non-null type com.obric.oui.slider.ProgressDrawable");
        ((d) progressDrawable).d(i);
    }

    public void setDefaultTickMarkCount(int i) {
        this.f8030e = i;
        this.h = -1;
        if (this.j == TickMarkStyle.DEFAULT) {
            Drawable drawable = this.b;
            if (!(drawable instanceof com.obric.oui.slider.a)) {
                drawable = null;
            }
            com.obric.oui.slider.a aVar = (com.obric.oui.slider.a) drawable;
            if (aVar != null) {
                aVar.a(i);
            }
        }
        invalidate();
    }

    public final void setImageIcon(Drawable drawable) {
        l.f(drawable, "imageIcon");
        Drawable progressDrawable = getProgressDrawable();
        Objects.requireNonNull(progressDrawable, "null cannot be cast to non-null type com.obric.oui.slider.ProgressDrawable");
        ((d) progressDrawable).e(drawable);
    }

    public final void setIsAlwaysLight(boolean z) {
        this.b = k();
        invalidate();
    }

    public final void setIsAlwaysNight(boolean z) {
        this.b = k();
        invalidate();
    }

    public final void setIsSegmented(boolean z, int i, int i2) {
        this.f8032g = z;
        if (z) {
            setProgressDrawable(null);
            Drawable thumb = getThumb();
            Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            ((f) thumb).b(kotlin.t.a.a(TypedValue.applyDimension(1, 6, system.getDisplayMetrics())));
            this.h = i2;
            this.f8030e = i;
            int measuredWidth = getMeasuredWidth();
            Drawable thumb2 = getThumb();
            l.e(thumb2, "thumb");
            float intrinsicWidth = measuredWidth - thumb2.getIntrinsicWidth();
            setProgress((int) (((i2 * (intrinsicWidth / (i - 1))) / intrinsicWidth) * getMax()));
        } else {
            this.f8030e = -1;
            this.h = -1;
            setProgressDrawable(this.f8029d);
            Drawable thumb3 = getThumb();
            Objects.requireNonNull(thumb3, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            ((f) thumb3).b(kotlin.t.a.a(TypedValue.applyDimension(1, 4, system2.getDisplayMetrics())));
        }
        g();
        invalidate();
    }

    public final void setOnSeekBarChangeListenerExt(a aVar) {
        this.l = aVar;
        super.setOnSeekBarChangeListener(new c());
    }

    public final void setProcessColor(int i, int i2) {
        d dVar = this.f8029d;
        if (dVar != null) {
            dVar.f(i);
        }
        d dVar2 = this.f8029d;
        if (dVar2 != null) {
            dVar2.b(i2);
        }
        invalidate();
    }

    public final void setProcessImageIconVisibility(boolean z) {
        if (z) {
            Drawable progressDrawable = getProgressDrawable();
            Objects.requireNonNull(progressDrawable, "null cannot be cast to non-null type com.obric.oui.slider.ProgressDrawable");
            ((d) progressDrawable).g();
        } else {
            Drawable progressDrawable2 = getProgressDrawable();
            Objects.requireNonNull(progressDrawable2, "null cannot be cast to non-null type com.obric.oui.slider.ProgressDrawable");
            ((d) progressDrawable2).a();
        }
    }

    public final void setSliderHeight(int i) {
        this.i = i;
        Drawable thumb = getThumb();
        Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
        ((f) thumb).e(i);
    }

    public final void setThumbColor(int i) {
        Drawable thumb = getThumb();
        Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
        ((f) thumb).d(i);
    }

    public final void setThumbDefaultHeight(int i, int i2) {
        Drawable thumb = getThumb();
        Objects.requireNonNull(thumb, "null cannot be cast to non-null type com.obric.oui.slider.ThumbDrawable");
        ((f) thumb).a(i, i2);
    }

    public TickMarkSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickMarkSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = "TickSeekBar";
        this.f8030e = -1;
        float f2 = 8;
        this.f8031f = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        this.h = -1;
        this.i = e.a.a.a.a.e0("Resources.getSystem()", 1, 32);
        this.j = TickMarkStyle.DEFAULT;
        this.k = new e();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.a0, i, 0);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        this.f8031f = obtainStyledAttributes.getDimensionPixelSize(0, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        this.b = k();
        this.f8028c = ContextCompat.getDrawable(context, C0838R.drawable.o_ic_slider_gray_tick);
        setThumb(new f(context, this.i));
        setThumbOffset(0);
        d dVar = new d(context);
        this.f8029d = dVar;
        setProgressDrawable(dVar);
        setOnSeekBarChangeListenerExt(null);
    }
}
