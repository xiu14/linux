package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.input.common_biz.ui.databinding.ImeEmptyLalyoutBinding;
import com.obric.oui.text.OTextView;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeEmptyLayout extends FrameLayout {
    private ImeEmptyLalyoutBinding a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeEmptyLayout(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public final TextView a() {
        ImeEmptyLalyoutBinding imeEmptyLalyoutBinding = this.a;
        if (imeEmptyLalyoutBinding != null) {
            return imeEmptyLalyoutBinding.f2270c;
        }
        return null;
    }

    public final ImeEmptyLayout b(@DrawableRes int i) {
        AppCompatImageView appCompatImageView;
        ImeEmptyLalyoutBinding imeEmptyLalyoutBinding = this.a;
        if (imeEmptyLalyoutBinding != null && (appCompatImageView = imeEmptyLalyoutBinding.b) != null) {
            appCompatImageView.setImageResource(i);
        }
        return this;
    }

    public final ImeEmptyLayout c(String str) {
        l.f(str, "text");
        ImeEmptyLalyoutBinding imeEmptyLalyoutBinding = this.a;
        OTextView oTextView = imeEmptyLalyoutBinding != null ? imeEmptyLalyoutBinding.f2270c : null;
        if (oTextView != null) {
            oTextView.setText(str);
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeEmptyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeEmptyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = ImeEmptyLalyoutBinding.a(LayoutInflater.from(context), this, true);
    }
}
