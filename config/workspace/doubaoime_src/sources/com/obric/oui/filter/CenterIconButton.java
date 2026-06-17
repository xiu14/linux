package com.obric.oui.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import e.i.a.b.a;
import e.i.a.b.b;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public class CenterIconButton extends AppCompatButton {
    private Rect a;

    @ColorInt
    protected int b;

    /* renamed from: c, reason: collision with root package name */
    protected int f7730c;

    /* renamed from: d, reason: collision with root package name */
    protected int f7731d;

    /* renamed from: e, reason: collision with root package name */
    protected int f7732e;

    public CenterIconButton(Context context) {
        super(context);
        this.b = 0;
        init(context, null);
    }

    private void a() {
        b(getMeasuredWidth());
    }

    private void b(int i) {
        String str;
        if (i == 0) {
            return;
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        if (compoundDrawables.length != 4) {
            return;
        }
        Drawable drawable = compoundDrawables[0];
        Drawable drawable2 = compoundDrawables[2];
        if (drawable == null && drawable2 == null) {
            return;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (charSequence.isEmpty()) {
            str = "";
        } else {
            ArrayList arrayList = new ArrayList();
            StringTokenizer stringTokenizer = new StringTokenizer(charSequence, "\n", false);
            while (stringTokenizer.hasMoreTokens()) {
                arrayList.add(stringTokenizer.nextToken());
            }
            if (arrayList.size() == 1) {
                str = isAllCaps() ? ((String) arrayList.get(0)).toUpperCase() : (String) arrayList.get(0);
            } else {
                str = (String) arrayList.get(0);
                int i2 = 0;
                while (i2 < arrayList.size() - 1) {
                    int i3 = i2 + 1;
                    if (((String) arrayList.get(i3)).length() > ((String) arrayList.get(i2)).length()) {
                        str = (String) arrayList.get(i3);
                    }
                    i2 = i3;
                }
                if (isAllCaps()) {
                    str = str.toUpperCase();
                }
            }
        }
        Log.d("CenterIconButton", "text:" + str);
        paint.getTextBounds(str, 0, str.length(), this.a);
        Log.d("CenterIconButton", "textHeight" + this.a.height());
        int width = this.a.width();
        int max = Math.max(getCompoundDrawablePadding(), 1);
        int width2 = drawable == null ? 0 : drawable.getBounds().width();
        int width3 = drawable2 == null ? 0 : drawable2.getBounds().width();
        int i4 = (drawable == null || drawable2 == null) ? drawable != null ? (((i - width2) - max) - width) / 2 : (((i - width3) - max) - width) / 2 : ((((i - width2) - width3) - width) - (max * 4)) / 2;
        Log.d("CenterIconButton", "paddingSize:" + i4);
        Log.d("CenterIconButton", "leftPadding:" + this.f7730c);
        Log.d("CenterIconButton", "rightPadding:" + this.f7731d);
        setIncludeFontPadding(false);
        Log.d("CenterIconButton", "paddingLeft:" + Math.max(this.f7730c, i4));
        Log.d("CenterIconButton", "paddingTop:" + getPaddingTop());
        Log.d("CenterIconButton", "paddingRight:" + Math.max(i4, this.f7731d));
        Log.d("CenterIconButton", "paddingBottom:" + getPaddingBottom());
        super.setPadding(Math.max(this.f7730c, i4), getPaddingTop(), Math.max(i4, this.f7731d), getPaddingBottom());
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j);
            this.b = obtainStyledAttributes.getColor(2, 0);
            this.f7732e = obtainStyledAttributes.getDimensionPixelSize(1, a.c(12));
            setCompoundDrawablePadding((int) obtainStyledAttributes.getDimension(0, a.c(4)));
            if (this.b != 0 || this.f7732e != -1) {
                Drawable[] compoundDrawables = getCompoundDrawables();
                if (compoundDrawables.length == 4) {
                    Drawable[] drawableArr = new Drawable[4];
                    for (int i = 0; i < 4; i++) {
                        Drawable drawable = compoundDrawables[i];
                        if (drawable != null) {
                            if (this.b != 0) {
                                drawable = DrawableCompat.wrap(drawable).mutate();
                                DrawableCompat.setTint(drawable, this.b);
                            }
                            if (this.f7732e > 0) {
                                Rect bounds = drawable.getBounds();
                                int i2 = this.f7732e;
                                bounds.set(0, 0, i2, i2);
                            }
                            drawableArr[i] = drawable;
                        }
                    }
                    if (this.f7732e > 0) {
                        setCompoundDrawables(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
                    } else {
                        setCompoundDrawablesWithIntrinsicBounds(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f7730c = getPaddingLeft();
        this.f7731d = getPaddingRight();
    }

    @Override // android.widget.TextView
    public boolean isAllCaps() {
        TransformationMethod transformationMethod = getTransformationMethod();
        if (transformationMethod == null) {
            return false;
        }
        return transformationMethod.getClass().getSimpleName().equals("AllCapsTransformationMethod");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b(i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        a();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        a();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        this.f7730c = i;
        this.f7731d = i3;
        a();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a();
    }

    public CenterIconButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        init(context, attributeSet);
    }

    public CenterIconButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        init(context, attributeSet);
    }
}
