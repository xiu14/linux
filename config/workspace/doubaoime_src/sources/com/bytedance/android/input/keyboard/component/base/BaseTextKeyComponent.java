package com.bytedance.android.input.keyboard.component.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.databinding.LayoutTextKeyBinding;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class BaseTextKeyComponent extends BaseKeyComponent {
    private LayoutTextKeyBinding a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseTextKeyComponent(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public final String j() {
        AppCompatTextView appCompatTextView;
        CharSequence text;
        String obj;
        LayoutTextKeyBinding layoutTextKeyBinding = this.a;
        return (layoutTextKeyBinding == null || (appCompatTextView = layoutTextKeyBinding.b) == null || (text = appCompatTextView.getText()) == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final void setText(String str) {
        l.f(str, "text");
        LayoutTextKeyBinding layoutTextKeyBinding = this.a;
        AppCompatTextView appCompatTextView = layoutTextKeyBinding != null ? layoutTextKeyBinding.b : null;
        if (appCompatTextView == null) {
            return;
        }
        appCompatTextView.setText(str);
    }

    public final void setTextColor(@ColorRes int i) {
        AppCompatTextView appCompatTextView;
        LayoutTextKeyBinding layoutTextKeyBinding = this.a;
        if (layoutTextKeyBinding == null || (appCompatTextView = layoutTextKeyBinding.b) == null) {
            return;
        }
        appCompatTextView.setTextColor(ContextCompat.getColor(getContext(), i));
    }

    public final void setTextSize(float f2) {
        AppCompatTextView appCompatTextView;
        LayoutTextKeyBinding layoutTextKeyBinding = this.a;
        if (layoutTextKeyBinding == null || (appCompatTextView = layoutTextKeyBinding.b) == null) {
            return;
        }
        appCompatTextView.setTextSize(1, f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseTextKeyComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTextKeyComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = LayoutTextKeyBinding.a(LayoutInflater.from(context), this, true);
    }
}
