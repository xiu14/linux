package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeTitleImageItemView extends FrameLayout {
    private final TextView a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f4374c;

    /* renamed from: d, reason: collision with root package name */
    private final FrameLayout f4375d;

    /* renamed from: e, reason: collision with root package name */
    private final Button f4376e;

    /* renamed from: f, reason: collision with root package name */
    private final SwitchCompat f4377f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f4378g;
    private final ImageView h;
    private final RelativeLayout i;
    private final LinearLayout j;
    private final View k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTitleImageItemView(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public final SwitchCompat a() {
        return this.f4377f;
    }

    public final RelativeLayout b() {
        return this.i;
    }

    public final void setButtonText(String str) {
        l.f(str, "text");
        this.f4376e.setText(str);
    }

    public final void setImageResource(int i) {
        if (i == 0) {
            this.f4378g.setVisibility(8);
        } else {
            this.f4378g.setImageResource(i);
            this.f4378g.setVisibility(0);
        }
    }

    public final void setSubTitleArrowOnClickListener(View.OnClickListener onClickListener) {
        l.f(onClickListener, "listener");
        this.f4374c.setOnClickListener(onClickListener);
    }

    public final void setSubTitleContainerOnClickListener(View.OnClickListener onClickListener) {
        l.f(onClickListener, "listener");
        this.k.setOnClickListener(onClickListener);
    }

    public final void setSubTitleVisibility(boolean z) {
        this.k.setVisibility(z ? 0 : 8);
        if (z) {
            ViewGroup.LayoutParams layoutParams = this.f4375d.getLayoutParams();
            l.d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(10, -1);
            layoutParams2.addRule(15, 0);
            this.f4375d.setLayoutParams(layoutParams2);
            this.f4375d.setPadding(0, getContext().getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_3), 0, 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.f4375d.getLayoutParams();
        l.d(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        layoutParams4.addRule(15, -1);
        layoutParams4.addRule(10, 0);
        this.f4375d.setLayoutParams(layoutParams4);
        this.f4375d.setPadding(0, 0, 0, 0);
    }

    public final void setTitle(String str) {
        l.f(str, "text");
        this.a.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTitleImageItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeTitleImageItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0838R.layout.ime_title_image_item_item_view, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(C0838R.id.item_title);
        l.e(findViewById, "view.findViewById(R.id.item_title)");
        TextView textView = (TextView) findViewById;
        this.a = textView;
        View findViewById2 = inflate.findViewById(C0838R.id.item_sub_title);
        l.e(findViewById2, "view.findViewById(R.id.item_sub_title)");
        TextView textView2 = (TextView) findViewById2;
        this.b = textView2;
        View findViewById3 = inflate.findViewById(C0838R.id.item_sub_title_arrow);
        l.e(findViewById3, "view.findViewById(R.id.item_sub_title_arrow)");
        this.f4374c = (ImageView) findViewById3;
        View findViewById4 = inflate.findViewById(C0838R.id.item_sub_title_container);
        l.e(findViewById4, "view.findViewById(R.id.item_sub_title_container)");
        this.k = findViewById4;
        View findViewById5 = inflate.findViewById(C0838R.id.item_action_container);
        l.e(findViewById5, "view.findViewById(R.id.item_action_container)");
        this.f4375d = (FrameLayout) findViewById5;
        View findViewById6 = inflate.findViewById(C0838R.id.item_button);
        l.e(findViewById6, "view.findViewById(R.id.item_button)");
        Button button = (Button) findViewById6;
        this.f4376e = button;
        View findViewById7 = inflate.findViewById(C0838R.id.item_switch);
        l.e(findViewById7, "view.findViewById(R.id.item_switch)");
        SwitchCompat switchCompat = (SwitchCompat) findViewById7;
        this.f4377f = switchCompat;
        View findViewById8 = inflate.findViewById(C0838R.id.item_image);
        l.e(findViewById8, "view.findViewById(R.id.item_image)");
        ImageView imageView = (ImageView) findViewById8;
        this.f4378g = imageView;
        View findViewById9 = inflate.findViewById(C0838R.id.item_right_image);
        l.e(findViewById9, "view.findViewById(R.id.item_right_image)");
        ImageView imageView2 = (ImageView) findViewById9;
        this.h = imageView2;
        View findViewById10 = inflate.findViewById(C0838R.id.item_top_container);
        l.e(findViewById10, "view.findViewById(R.id.item_top_container)");
        this.i = (RelativeLayout) findViewById10;
        View findViewById11 = inflate.findViewById(C0838R.id.item_image_container);
        l.e(findViewById11, "view.findViewById(R.id.item_image_container)");
        LinearLayout linearLayout = (LinearLayout) findViewById11;
        this.j = linearLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.k);
        l.e(obtainStyledAttributes, "context.obtainStyledAttr…le.ImeTitleImageItemView)");
        textView.setText(obtainStyledAttributes.getString(8));
        textView2.setText(obtainStyledAttributes.getString(4));
        setSubTitleVisibility(obtainStyledAttributes.getBoolean(5, false));
        int i2 = obtainStyledAttributes.getInt(0, 0);
        if (i2 == 1) {
            button.setVisibility(0);
            switchCompat.setVisibility(8);
            button.setText(obtainStyledAttributes.getString(6));
        } else if (i2 != 2) {
            button.setVisibility(8);
            switchCompat.setVisibility(8);
        } else {
            button.setVisibility(8);
            switchCompat.setVisibility(0);
            switchCompat.setChecked(obtainStyledAttributes.getBoolean(7, false));
        }
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            imageView.setBackgroundResource(resourceId);
            imageView.setVisibility(0);
            if (obtainStyledAttributes.getBoolean(1, false)) {
                imageView.setImageDrawable(AppCompatResources.getDrawable(context, resourceId));
                imageView.setAdjustViewBounds(true);
                imageView.setScaleType(ImageView.ScaleType.FIT_START);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                l.d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                layoutParams2.weight = 0.0f;
                imageView.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                l.d(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).height = -2;
                layoutParams4.dimensionRatio = null;
                linearLayout.setLayoutParams(layoutParams4);
            }
        } else {
            imageView.setVisibility(8);
        }
        if (resourceId2 != 0) {
            imageView2.setBackgroundResource(resourceId2);
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
        if (resourceId == 0 && resourceId2 == 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        obtainStyledAttributes.recycle();
    }
}
