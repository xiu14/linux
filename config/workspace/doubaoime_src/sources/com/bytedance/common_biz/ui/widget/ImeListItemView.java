package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common_biz.ui.databinding.ImeListItemViewBinding;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class ImeListItemView extends RelativeLayout {
    private final ImeListItemViewBinding a;
    private l<? super Boolean, o> b;

    /* renamed from: c, reason: collision with root package name */
    private l<? super View, o> f4355c;

    /* renamed from: d, reason: collision with root package name */
    private l<? super View, o> f4356d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeListItemView(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    static final void b(ImeListItemView imeListItemView, View view) {
        kotlin.s.c.l.f(imeListItemView, "this$0");
        l<? super View, o> lVar = imeListItemView.f4356d;
        if (lVar != null) {
            kotlin.s.c.l.e(view, "it");
            lVar.invoke(view);
        }
    }

    static final void c(ImeListItemView imeListItemView, View view) {
        kotlin.s.c.l.f(imeListItemView, "this$0");
        l<? super View, o> lVar = imeListItemView.f4355c;
        if (lVar != null) {
            kotlin.s.c.l.e(view, "it");
            lVar.invoke(view);
        }
    }

    public static void d(ImeListItemView imeListItemView, boolean z) {
        kotlin.s.c.l.f(imeListItemView, "this$0");
        int lineCount = imeListItemView.a.f2273d.getLineCount();
        l<? super Boolean, o> lVar = imeListItemView.b;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(lineCount > 1));
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = imeListItemView.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            marginLayoutParams.height = -2;
            int dimensionPixelSize = imeListItemView.getContext().getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_14);
            int dimensionPixelSize2 = imeListItemView.getContext().getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_12);
            if (lineCount == 1) {
                ConstraintLayout constraintLayout = imeListItemView.a.p;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), dimensionPixelSize, imeListItemView.a.p.getPaddingRight(), dimensionPixelSize);
            } else {
                ConstraintLayout constraintLayout2 = imeListItemView.a.p;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), dimensionPixelSize2, imeListItemView.a.p.getPaddingRight(), dimensionPixelSize2);
            }
            imeListItemView.setLayoutParams(marginLayoutParams);
        }
    }

    public static void e(boolean z, int i, ImeListItemView imeListItemView) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.s.c.l.f(imeListItemView, "this$0");
        if (z) {
            if (i == 2) {
                ViewGroup.LayoutParams layoutParams = imeListItemView.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams == null) {
                    return;
                }
                int dimensionPixelSize = imeListItemView.getContext().getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_12);
                marginLayoutParams.height = -2;
                ConstraintLayout constraintLayout = imeListItemView.a.p;
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), dimensionPixelSize, imeListItemView.a.p.getPaddingRight(), dimensionPixelSize);
                imeListItemView.setLayoutParams(marginLayoutParams);
                return;
            }
            if (i != 3) {
                ViewGroup.LayoutParams layoutParams2 = imeListItemView.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams == null) {
                    return;
                }
                int dimensionPixelSize2 = imeListItemView.getContext().getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_19);
                marginLayoutParams.height = -2;
                ConstraintLayout constraintLayout2 = imeListItemView.a.p;
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), dimensionPixelSize2, imeListItemView.a.p.getPaddingRight(), dimensionPixelSize2);
                imeListItemView.setLayoutParams(marginLayoutParams);
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = imeListItemView.getLayoutParams();
            marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            if (marginLayoutParams == null) {
                return;
            }
            int dimensionPixelSize3 = imeListItemView.getContext().getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_18);
            marginLayoutParams.height = -2;
            ConstraintLayout constraintLayout3 = imeListItemView.a.p;
            constraintLayout3.setPadding(constraintLayout3.getPaddingLeft(), dimensionPixelSize3, imeListItemView.a.p.getPaddingRight(), dimensionPixelSize3);
            imeListItemView.setLayoutParams(marginLayoutParams);
        }
    }

    public final SwitchCompat a() {
        SwitchCompat switchCompat = this.a.l;
        kotlin.s.c.l.e(switchCompat, "binding.itemSwitchButton");
        return switchCompat;
    }

    public final void setDescriptionStyle(int i, float f2) {
        this.a.f2273d.setTextColor(i);
        this.a.f2273d.setTextSize(f2);
    }

    public final void setHorizontalClearClickListener(l<? super View, o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.f4356d = lVar;
    }

    public final void setHorizontalDesc(String str) {
        kotlin.s.c.l.f(str, "text");
        this.a.n.setText(str);
        this.a.n.setVisibility(0);
    }

    public final void setOnDescriptionLineCountChangeListener(l<? super Boolean, o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.b = lVar;
    }

    public final void setOverlayClickListener(l<? super View, o> lVar) {
        kotlin.s.c.l.f(lVar, "listener");
        this.f4355c = lVar;
    }

    public final void setOverlayShow(boolean z) {
        this.a.f2274e.setVisibility(z ? 0 : 8);
    }

    public final void setTitleStyle(int i, float f2) {
        this.a.m.setTextColor(i);
        this.a.m.setTextSize(f2);
    }

    public final void setTrailingText(String str) {
        kotlin.s.c.l.f(str, "text");
        this.a.f2272c.setText(str);
    }

    public final void setTrailingTextColor(int i) {
        this.a.f2272c.setTextColor(i);
    }

    public final void setTrailingTextStyle(@StyleRes int i) {
        this.a.f2272c.setTextAppearance(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f2;
        int i2;
        int i3;
        kotlin.s.c.l.f(context, "context");
        ImeListItemViewBinding a = ImeListItemViewBinding.a(LayoutInflater.from(context), this, true);
        kotlin.s.c.l.e(a, "inflate(LayoutInflater.from(context), this, true)");
        this.a = a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.f2458f);
        kotlin.s.c.l.e(obtainStyledAttributes, "context.obtainStyledAttr…tyleable.ImeListItemView)");
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        int color = obtainStyledAttributes.getColor(6, ContextCompat.getColor(context, C0838R.color.white));
        int color2 = obtainStyledAttributes.getColor(16, ContextCompat.getColor(context, C0838R.color.ime_color_black_73));
        final int i4 = obtainStyledAttributes.getInt(0, 0);
        if (dimension > 0.0f) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(color);
            setBackground(gradientDrawable);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(dimension);
            gradientDrawable2.setColor(color2);
            a.f2274e.setBackground(gradientDrawable2);
        } else {
            setBackgroundColor(color);
        }
        boolean z = obtainStyledAttributes.getBoolean(18, false);
        boolean z2 = obtainStyledAttributes.getBoolean(17, false);
        boolean z3 = obtainStyledAttributes.getBoolean(12, false);
        int resourceId = obtainStyledAttributes.getResourceId(11, C0838R.drawable.dot_background);
        int resourceId2 = obtainStyledAttributes.getResourceId(13, C0838R.drawable.ic_ime_del);
        String string = obtainStyledAttributes.getString(14);
        String string2 = obtainStyledAttributes.getString(15);
        String string3 = obtainStyledAttributes.getString(20);
        String string4 = obtainStyledAttributes.getString(8);
        int color3 = obtainStyledAttributes.getColor(21, ContextCompat.getColor(context, C0838R.color.ime_color_common_text_d9_color));
        int color4 = obtainStyledAttributes.getColor(9, ContextCompat.getColor(context, C0838R.color.ime_color_black_73));
        float dimension2 = obtainStyledAttributes.getDimension(22, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, 0.0f);
        float dimension4 = obtainStyledAttributes.getDimension(4, 0.0f);
        int resourceId3 = obtainStyledAttributes.getResourceId(1, C0838R.drawable.ic_arrow_right);
        String string5 = obtainStyledAttributes.getString(2);
        int color5 = obtainStyledAttributes.getColor(3, ContextCompat.getColor(context, C0838R.color.ime_color_common_text_73_color));
        boolean z4 = obtainStyledAttributes.getBoolean(19, false);
        final boolean z5 = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        if (string3 == null || string3.length() == 0) {
            f2 = 0.0f;
        } else {
            a.m.setText(string3);
            a.m.setTextColor(color3);
            f2 = 0.0f;
            if (!(dimension2 == 0.0f)) {
                a.m.setTextSize(dimension2);
            }
        }
        if (!(dimension4 == f2)) {
            a.f2272c.setTextSize(dimension4);
        }
        if (!(dimension3 == f2)) {
            a.f2273d.setTextSize(dimension3);
        }
        if (string4 == null || string4.length() == 0) {
            a.f2273d.setVisibility(8);
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(a.p);
            constraintSet.connect(a.o.getId(), 4, 0, 4);
            constraintSet.applyTo(a.p);
            a.m.post(new Runnable() { // from class: com.bytedance.common_biz.ui.widget.f
                @Override // java.lang.Runnable
                public final void run() {
                    ImeListItemView.e(z5, i4, this);
                }
            });
        } else {
            a.f2273d.setVisibility(0);
            a.f2273d.setText(string4);
            ConstraintSet constraintSet2 = new ConstraintSet();
            constraintSet2.clone(a.p);
            constraintSet2.clear(a.m.getId(), 4);
            constraintSet2.applyTo(a.p);
            a.f2273d.post(new Runnable() { // from class: com.bytedance.common_biz.ui.widget.c
                @Override // java.lang.Runnable
                public final void run() {
                    ImeListItemView.d(ImeListItemView.this, z5);
                }
            });
        }
        if (!(string4 == null || string4.length() == 0)) {
            a.f2273d.setTextColor(color4);
        }
        if (i4 == 0) {
            i2 = 0;
            i3 = 8;
            a.f2275f.setVisibility(8);
        } else if (i4 == 1) {
            i2 = 0;
            i3 = 8;
            a.f2275f.setVisibility(0);
            a.l.setVisibility(8);
            a.f2276g.setVisibility(0);
            a.f2272c.setVisibility(8);
        } else if (i4 != 2) {
            if (i4 == 3) {
                a.f2275f.setVisibility(0);
                a.l.setVisibility(8);
                a.f2276g.setVisibility(0);
                a.f2272c.setVisibility(0);
                a.f2272c.setText(string5);
                a.f2272c.setTextColor(color5);
                a.k.setBackgroundResource(resourceId);
                a.k.setVisibility(z2 ? 0 : 8);
            } else if (i4 == 4) {
                a.f2275f.setVisibility(0);
                a.l.setVisibility(8);
                a.f2276g.setVisibility(8);
                LinearLayout linearLayout = a.i;
                linearLayout.setVisibility(0);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.common_biz.ui.widget.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ImeListItemView.b(ImeListItemView.this, view);
                    }
                });
                if (string2 == null || string2.length() == 0) {
                    a.n.setVisibility(8);
                    i2 = 0;
                } else {
                    a.n.setText(string2);
                    i2 = 0;
                    a.n.setVisibility(0);
                }
                a.j.setText(string);
                a.h.setBackgroundResource(resourceId2);
                i3 = 8;
            }
            i2 = 0;
            i3 = 8;
        } else {
            i2 = 0;
            a.f2275f.setVisibility(0);
            a.l.setVisibility(0);
            i3 = 8;
            a.f2276g.setVisibility(8);
            a.l.setChecked(z4);
        }
        a.b.setBackgroundResource(resourceId3);
        if (!z3) {
            setTitleStyle(C0838R.style.settings_list_item_title_style);
            setDescriptionStyle(C0838R.style.settings_list_item_subtitle_style);
            setTrailingTextStyle(C0838R.style.settings_list_item_trailing_text_style);
        }
        View view = a.f2274e;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.common_biz.ui.widget.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ImeListItemView.c(ImeListItemView.this, view2);
            }
        });
        view.setVisibility(z ? i2 : i3);
    }

    public final void setDescriptionStyle(@StyleRes int i) {
        this.a.f2273d.setTextAppearance(i);
    }

    public final void setTitleStyle(@StyleRes int i) {
        this.a.m.setTextAppearance(i);
    }
}
