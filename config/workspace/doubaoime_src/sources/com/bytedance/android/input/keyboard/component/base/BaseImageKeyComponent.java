package com.bytedance.android.input.keyboard.component.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.doubaoime.databinding.LayoutImageKeyBinding;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class BaseImageKeyComponent extends BaseKeyComponent {
    private LayoutImageKeyBinding a;
    private AppCompatImageView b;

    /* renamed from: c, reason: collision with root package name */
    private AppCompatTextView f2693c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseImageKeyComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    protected final AppCompatImageView j() {
        return this.b;
    }

    public final void k(boolean z) {
        if (z) {
            AppCompatImageView appCompatImageView = this.b;
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            AppCompatTextView appCompatTextView = this.f2693c;
            if (appCompatTextView == null) {
                return;
            }
            appCompatTextView.setVisibility(0);
            return;
        }
        AppCompatImageView appCompatImageView2 = this.b;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setVisibility(0);
        }
        AppCompatTextView appCompatTextView2 = this.f2693c;
        if (appCompatTextView2 == null) {
            return;
        }
        appCompatTextView2.setVisibility(8);
    }

    public final void setImageSize(int i, int i2) {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView != null) {
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            appCompatImageView.setLayoutParams(layoutParams);
        }
    }

    public final void setText(String str) {
        l.f(str, "text");
        LayoutImageKeyBinding layoutImageKeyBinding = this.a;
        AppCompatTextView appCompatTextView = layoutImageKeyBinding != null ? layoutImageKeyBinding.f2011c : null;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setText(str);
    }

    public final void setTextColor(@ColorRes int i) {
        AppCompatTextView appCompatTextView;
        LayoutImageKeyBinding layoutImageKeyBinding = this.a;
        if (layoutImageKeyBinding == null || (appCompatTextView = layoutImageKeyBinding.f2011c) == null) {
            return;
        }
        appCompatTextView.setTextColor(getContext().getColor(i));
    }

    public final void setTextSize(float f2) {
        AppCompatTextView appCompatTextView;
        LayoutImageKeyBinding layoutImageKeyBinding = this.a;
        if (layoutImageKeyBinding == null || (appCompatTextView = layoutImageKeyBinding.f2011c) == null) {
            return;
        }
        appCompatTextView.setTextSize(1, f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseImageKeyComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageKeyComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        LayoutImageKeyBinding a = LayoutImageKeyBinding.a(LayoutInflater.from(context), this, true);
        this.a = a;
        this.b = a != null ? a.b : null;
        this.f2693c = a != null ? a.f2011c : null;
    }
}
