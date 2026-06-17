package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.input.common_biz.ui.databinding.ImeTipsLayoutBinding;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeTipsLayout extends FrameLayout {
    private ImeTipsLayoutBinding a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTipsLayout(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public final ImeTipsLayout a(@DrawableRes int i) {
        ImageView imageView;
        ImeTipsLayoutBinding imeTipsLayoutBinding = this.a;
        if (imeTipsLayoutBinding != null && (imageView = imeTipsLayoutBinding.b) != null) {
            imageView.setImageResource(i);
        }
        return this;
    }

    public final ImeTipsLayout b(View.OnClickListener onClickListener) {
        ConstraintLayout a;
        ImeTipsLayoutBinding imeTipsLayoutBinding = this.a;
        if (imeTipsLayoutBinding != null && (a = imeTipsLayoutBinding.a()) != null) {
            a.setOnClickListener(onClickListener);
        }
        return this;
    }

    public final ImeTipsLayout c(String str) {
        l.f(str, "text");
        ImeTipsLayoutBinding imeTipsLayoutBinding = this.a;
        TextView textView = imeTipsLayoutBinding != null ? imeTipsLayoutBinding.f2277c : null;
        if (textView != null) {
            textView.setText(str);
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeTipsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeTipsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = ImeTipsLayoutBinding.b(LayoutInflater.from(context), this, true);
    }
}
