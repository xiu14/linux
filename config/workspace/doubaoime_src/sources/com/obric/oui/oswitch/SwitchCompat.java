package com.obric.oui.oswitch;

import android.R;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.s.c.g;
import kotlin.s.c.l;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes2.dex */
public class SwitchCompat extends CompoundButton {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;

    /* renamed from: J, reason: collision with root package name */
    private final TextPaint f7865J;
    private ColorStateList K;
    private TransformationMethod L;
    private ObjectAnimator M;
    private final Rect N;
    private int O;
    private int P;
    private boolean Q;
    private float R;
    private Drawable a;
    private ColorStateList b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f7866c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7867d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7868e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f7869f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f7870g;
    private PorterDuff.Mode h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private CharSequence o;
    private CharSequence p;
    private int q;
    private final int r;
    private float s;
    private float t;
    private final VelocityTracker u;
    private final int v;
    private float w;
    private int x;
    private int y;
    private int z;
    public static final b U = new b(null);
    private static final Property<SwitchCompat, Float> S = new a(Float.TYPE, "thumbPos");
    private static final int[] T = {R.attr.state_checked};

    public static final class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            SwitchCompat switchCompat2 = switchCompat;
            l.f(switchCompat2, "object");
            return Float.valueOf(switchCompat2.c());
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f2) {
            SwitchCompat switchCompat2 = switchCompat;
            float floatValue = f2.floatValue();
            l.f(switchCompat2, "object");
            switchCompat2.setThumbPosition(floatValue);
        }
    }

    public static final class b {
        public b(g gVar) {
        }
    }

    public SwitchCompat(Context context) {
        this(context, null, androidx.appcompat.R.attr.switchStyle);
    }

    private final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.f7867d || this.f7868e) {
                l.c(drawable);
                Drawable mutate = drawable.mutate();
                this.a = mutate;
                if (this.f7867d) {
                    l.c(mutate);
                    DrawableCompat.setTintList(mutate, this.b);
                }
                if (this.f7868e) {
                    Drawable drawable2 = this.a;
                    l.c(drawable2);
                    PorterDuff.Mode mode = this.f7866c;
                    l.c(mode);
                    DrawableCompat.setTintMode(drawable2, mode);
                }
                Drawable drawable3 = this.a;
                l.c(drawable3);
                if (drawable3.isStateful()) {
                    Drawable drawable4 = this.a;
                    l.c(drawable4);
                    drawable4.setState(getDrawableState());
                }
            }
        }
    }

    private final void b() {
        Drawable drawable = this.f7869f;
        if (drawable != null) {
            if (this.i || this.j) {
                l.c(drawable);
                Drawable mutate = drawable.mutate();
                this.f7869f = mutate;
                if (this.i) {
                    l.c(mutate);
                    DrawableCompat.setTintList(mutate, this.f7870g);
                }
                if (this.j) {
                    Drawable drawable2 = this.f7869f;
                    l.c(drawable2);
                    PorterDuff.Mode mode = this.h;
                    l.c(mode);
                    DrawableCompat.setTintMode(drawable2, mode);
                }
                Drawable drawable3 = this.f7869f;
                l.c(drawable3);
                if (drawable3.isStateful()) {
                    Drawable drawable4 = this.f7869f;
                    l.c(drawable4);
                    drawable4.setState(getDrawableState());
                }
            }
        }
    }

    private final int e() {
        return (int) (((ViewUtils.isLayoutRtl(this) ? 1 - this.w : this.w) * f()) + 0.5f);
    }

    private final int f() {
        Rect rect;
        Drawable drawable = this.f7869f;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.N;
        l.c(drawable);
        drawable.getPadding(rect2);
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            rect = DrawableUtils.getOpticalBounds(drawable2);
            l.e(rect, "DrawableUtils.getOpticalBounds(mThumbDrawable)");
        } else {
            rect = DrawableUtils.INSETS_NONE;
            l.e(rect, "DrawableUtils.INSETS_NONE");
        }
        return ((((((this.x - this.z) - rect2.left) - rect2.right) - rect.left) - rect.right) - this.P) - this.O;
    }

    public final float c() {
        return this.w;
    }

    public final Drawable d() {
        return this.a;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        l.f(canvas, "c");
        Rect rect = this.N;
        int i3 = this.B;
        int i4 = this.C;
        int i5 = this.D;
        int i6 = this.E;
        int e2 = e() + i3;
        Drawable drawable = this.a;
        Rect opticalBounds = drawable != null ? DrawableUtils.getOpticalBounds(drawable) : DrawableUtils.INSETS_NONE;
        Drawable drawable2 = this.f7869f;
        if (drawable2 != null) {
            l.c(drawable2);
            drawable2.getPadding(rect);
            int i7 = rect.left;
            e2 += i7;
            if (opticalBounds != null) {
                int i8 = opticalBounds.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = opticalBounds.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = opticalBounds.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = opticalBounds.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    Drawable drawable3 = this.f7869f;
                    l.c(drawable3);
                    drawable3.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            Drawable drawable32 = this.f7869f;
            l.c(drawable32);
            drawable32.setBounds(i3, i, i5, i2);
        }
        Drawable drawable4 = this.a;
        if (drawable4 != null) {
            l.c(drawable4);
            drawable4.getPadding(rect);
            int i15 = e2 - rect.left;
            int i16 = this.O;
            int i17 = i15 + i16;
            int i18 = e2 + this.z + rect.right + i16;
            int i19 = ((i6 - i4) - this.A) / 2;
            Drawable drawable5 = this.a;
            l.c(drawable5);
            drawable5.setBounds(i17, i19, i18, this.A + i19);
            Drawable background = getBackground();
            if (background != null) {
                DrawableCompat.setHotspotBounds(background, i17, i4, i18, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.a;
        if (drawable != null) {
            l.c(drawable);
            DrawableCompat.setHotspot(drawable, f2, f3);
        }
        Drawable drawable2 = this.f7869f;
        if (drawable2 != null) {
            l.c(drawable2);
            DrawableCompat.setHotspot(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f7869f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final Drawable g() {
        return this.f7869f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.x;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (ViewUtils.isLayoutRtl(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.x;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            l.c(drawable);
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f7869f;
        if (drawable2 != null) {
            l.c(drawable2);
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            l.c(objectAnimator);
            if (objectAnimator.isStarted()) {
                ObjectAnimator objectAnimator2 = this.M;
                l.c(objectAnimator2);
                objectAnimator2.end();
                this.M = null;
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        l.e(onCreateDrawableState, "drawableState");
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.N;
        Drawable drawable = this.f7869f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = rect.top;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable2);
                drawable2.copyBounds(rect);
                rect.left += opticalBounds.left;
                rect.right -= opticalBounds.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        int i2 = (this.R > 0.5f ? 1 : (this.R == 0.5f ? 0 : -1));
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        l.f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        l.f(accessibilityNodeInfo, DBDefinition.SEGMENT_INFO);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.o : this.p;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Rect rect = this.N;
            Drawable drawable = this.f7869f;
            if (drawable != null) {
                l.c(drawable);
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect opticalBounds = DrawableUtils.getOpticalBounds(this.a);
            i5 = Math.max(0, opticalBounds.left - rect.left);
            i10 = Math.max(0, opticalBounds.right - rect.right);
        } else {
            i5 = 0;
        }
        if (ViewUtils.isLayoutRtl(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.x + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.x) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity == 48) {
                i8 = getPaddingTop();
                i9 = this.y;
            } else if (gravity != 80) {
                i8 = getPaddingTop();
                i9 = this.y;
            } else {
                i7 = getHeight() - getPaddingBottom();
                i8 = i7 - this.y;
            }
            i7 = i9 + i8;
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i11 = this.y;
            int i12 = height - (i11 / 2);
            i7 = i11 + i12;
            i8 = i12;
        }
        this.B = i6;
        this.C = i8;
        this.E = i7;
        this.D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Rect rect = this.N;
        Drawable drawable = this.a;
        int i5 = 0;
        if (drawable != null) {
            l.c(drawable);
            drawable.getPadding(rect);
            Drawable drawable2 = this.a;
            l.c(drawable2);
            i3 = (drawable2.getIntrinsicWidth() - rect.left) - rect.right;
            Drawable drawable3 = this.a;
            l.c(drawable3);
            i4 = drawable3.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.z = Math.max(0, i3);
        this.A = i4;
        Drawable drawable4 = this.f7869f;
        if (drawable4 != null) {
            l.c(drawable4);
            drawable4.getPadding(rect);
            Drawable drawable5 = this.f7869f;
            l.c(drawable5);
            i5 = drawable5.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable6 = this.a;
        if (drawable6 != null) {
            Rect opticalBounds = DrawableUtils.getOpticalBounds(drawable6);
            i6 = Math.max(i6, opticalBounds.left);
            i7 = Math.max(i7, opticalBounds.right);
        }
        int max = Math.max(this.l, (this.z * 2) + i6 + i7);
        int max2 = Math.max(i5, i4);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        this.x = max - kotlin.t.a.a(TypedValue.applyDimension(1, 4, system.getDisplayMetrics()));
        this.y = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        l.f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r0 != 3) goto L86;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.oswitch.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        boolean performClick = super.performClick();
        if (isHapticFeedbackEnabled()) {
            if (isChecked()) {
                e.i.b.d.a.a(getContext(), 4);
            } else {
                e.i.b.d.a.a(getContext(), 5);
            }
        }
        return performClick;
    }

    public final void setAutoCheck(boolean z) {
        this.Q = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !ViewCompat.isLaidOut(this)) {
            ObjectAnimator objectAnimator = this.M;
            if (objectAnimator != null) {
                l.c(objectAnimator);
                objectAnimator.cancel();
            }
            setThumbPosition(isChecked ? 1.0f : 0);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, S, isChecked ? 1.0f : 0);
        this.M = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(260);
        }
        ObjectAnimator objectAnimator2 = this.M;
        if (objectAnimator2 != null) {
            objectAnimator2.setAutoCancel(true);
        }
        ObjectAnimator objectAnimator3 = this.M;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new DecelerateInterpolator(2.0f));
        }
        ObjectAnimator objectAnimator4 = this.M;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
    }

    public final void setCheckedNoAnim(boolean z) {
        super.setChecked(z);
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            l.c(objectAnimator);
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked() ? 1.0f : 0);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        l.f(callback, "actionModeCallback");
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    public final void setMPositionAnimator(ObjectAnimator objectAnimator) {
        this.M = objectAnimator;
    }

    public final void setMThumbPosition(float f2) {
        this.w = f2;
    }

    public final void setShowText(boolean z) {
    }

    public final void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public final void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public final void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public final void setSwitchTextAppearance(Context context, int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, androidx.appcompat.R.styleable.TextAppearance);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.TextAppearance_android_textColor);
        if (colorStateList == null) {
            colorStateList = getTextColors();
        }
        this.K = colorStateList;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.TextAppearance_android_textSize, 0);
        if (dimensionPixelSize != 0) {
            float f2 = dimensionPixelSize;
            if (f2 != this.f7865J.getTextSize()) {
                this.f7865J.setTextSize(f2);
                requestLayout();
            }
        }
        int i2 = obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_typeface, -1);
        setSwitchTypeface(i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.TextAppearance_android_textStyle, -1));
        this.L = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.TextAppearance_textAllCaps, false) ? new AllCapsTransformationMethod(getContext()) : null;
        obtainStyledAttributes.recycle();
    }

    public final void setSwitchTypeface(Typeface typeface, int i) {
        if (i <= 0) {
            this.f7865J.setFakeBoldText(false);
            this.f7865J.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            this.f7865J.setFakeBoldText((i2 & 1) != 0);
            this.f7865J.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void setTextOff(CharSequence charSequence) {
        this.p = charSequence;
        requestLayout();
    }

    public final void setTextOn(CharSequence charSequence) {
        this.o = charSequence;
        requestLayout();
    }

    public final void setThumbConstraintLeft(int i) {
        this.O = i;
    }

    public final void setThumbConstraintRight(int i) {
        this.P = i;
    }

    public final void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            l.c(drawable2);
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public final void setThumbPosition(float f2) {
        this.w = f2;
        invalidate();
    }

    public final void setThumbResource(int i) {
        setThumbDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public final void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public final void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f7867d = true;
        a();
    }

    public final void setThumbTintMode(PorterDuff.Mode mode) {
        this.f7866c = mode;
        this.f7868e = true;
        a();
    }

    public final void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f7869f;
        if (drawable2 != null) {
            l.c(drawable2);
            drawable2.setCallback(null);
        }
        this.f7869f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public final void setTrackResource(int i) {
        setTrackDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public final void setTrackTintList(ColorStateList colorStateList) {
        this.f7870g = colorStateList;
        this.i = true;
        b();
    }

    public final void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        if (this.Q) {
            setChecked(!isChecked());
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        l.f(drawable, "who");
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f7869f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = VelocityTracker.obtain();
        this.N = new Rect();
        this.Q = true;
        TextPaint textPaint = new TextPaint(1);
        this.f7865J = textPaint;
        Resources resources = getResources();
        l.e(resources, "res");
        textPaint.density = resources.getDisplayMetrics().density;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, androidx.appcompat.R.styleable.SwitchCompat, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SwitchCompat_android_thumb);
        this.a = drawable;
        if (drawable != null) {
            l.c(drawable);
            drawable.setCallback(this);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.SwitchCompat_track);
        this.f7869f = drawable2;
        if (drawable2 != null) {
            l.c(drawable2);
            drawable2.setCallback(this);
        }
        this.o = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.SwitchCompat_android_textOn);
        this.p = obtainStyledAttributes.getText(androidx.appcompat.R.styleable.SwitchCompat_android_textOff);
        this.k = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_thumbTextPadding, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_switchMinWidth, 0);
        this.m = obtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.SwitchCompat_switchPadding, 0);
        this.n = obtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.SwitchCompat_thumbTint);
        if (colorStateList != null) {
            this.b = colorStateList;
            this.f7867d = true;
        }
        PorterDuff.Mode parseTintMode = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SwitchCompat_thumbTintMode, -1), null);
        if (this.f7866c != parseTintMode) {
            this.f7866c = parseTintMode;
            this.f7868e = true;
        }
        if (this.f7867d || this.f7868e) {
            a();
        }
        ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(androidx.appcompat.R.styleable.SwitchCompat_trackTint);
        if (colorStateList2 != null) {
            this.f7870g = colorStateList2;
            this.i = true;
        }
        PorterDuff.Mode parseTintMode2 = DrawableUtils.parseTintMode(obtainStyledAttributes.getInt(androidx.appcompat.R.styleable.SwitchCompat_trackTintMode, -1), null);
        if (this.h != parseTintMode2) {
            this.h = parseTintMode2;
            this.j = true;
        }
        if (this.i || this.j) {
            b();
        }
        int resourceId = obtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.SwitchCompat_switchTextAppearance, 0);
        if (resourceId != 0) {
            setSwitchTextAppearance(context, resourceId);
        }
        obtainStyledAttributes.recycle();
        if (context != null) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            l.e(viewConfiguration, "config");
            this.r = viewConfiguration.getScaledTouchSlop();
            this.v = viewConfiguration.getScaledMinimumFlingVelocity();
        } else {
            this.r = 0;
            this.v = 0;
        }
        refreshDrawableState();
        setChecked(isChecked());
    }

    public final void setSwitchTypeface(Typeface typeface) {
        if ((this.f7865J.getTypeface() == null || !(!l.a(this.f7865J.getTypeface(), typeface))) && (this.f7865J.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f7865J.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
