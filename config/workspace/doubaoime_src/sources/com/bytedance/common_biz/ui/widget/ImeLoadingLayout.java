package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.bytedance.android.input.common_biz.ui.databinding.ImeLoadingLayoutBinding;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ImeLoadingLayout extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeLoadingLayout(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        ImeLoadingLayoutBinding.a(LayoutInflater.from(context), this, true);
    }
}
