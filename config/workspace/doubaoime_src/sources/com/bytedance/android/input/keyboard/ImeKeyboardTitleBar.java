package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.doubaoime.databinding.LayoutImeKeyboardTitleBarBinding;

/* loaded from: classes.dex */
public final class ImeKeyboardTitleBar extends FrameLayout {
    private LayoutImeKeyboardTitleBarBinding a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeKeyboardTitleBar(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    public final ImeKeyboardTitleBar a(View.OnClickListener onClickListener) {
        AppCompatImageView appCompatImageView;
        kotlin.s.c.l.f(onClickListener, "listener");
        LayoutImeKeyboardTitleBarBinding layoutImeKeyboardTitleBarBinding = this.a;
        if (layoutImeKeyboardTitleBarBinding != null && (appCompatImageView = layoutImeKeyboardTitleBarBinding.b) != null) {
            appCompatImageView.setOnClickListener(onClickListener);
        }
        return this;
    }

    public final ImeKeyboardTitleBar b(String str) {
        kotlin.s.c.l.f(str, "text");
        LayoutImeKeyboardTitleBarBinding layoutImeKeyboardTitleBarBinding = this.a;
        AppCompatTextView appCompatTextView = layoutImeKeyboardTitleBarBinding != null ? layoutImeKeyboardTitleBarBinding.f2012c : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(str);
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeKeyboardTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeKeyboardTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.a = LayoutImeKeyboardTitleBarBinding.a(LayoutInflater.from(context), this, true);
    }
}
