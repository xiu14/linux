package com.obric.oui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes2.dex */
public abstract class OTitleBar extends FrameLayout {
    protected TextView a;

    public OTitleBar(@NonNull Context context) {
        super(context);
    }

    public abstract void setDividerLineBackground(@ColorInt int i);

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTitleColor(@ColorInt int i) {
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i);
    }

    public void setTitleSize(float f2) {
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setTextSize(f2);
    }

    public void setTitleSizePixel(float f2) {
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, f2);
    }

    public OTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OTitleBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getBackground() == null) {
            setBackgroundColor(ContextCompat.getColor(context, C0838R.color.BGPrimary));
        }
    }

    public void setTitle(@StringRes int i) {
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        textView.setText(i);
    }
}
