package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public class CheckRadioView extends AppCompatImageView {
    private Drawable a;

    public CheckRadioView(Context context) {
        super(context);
        setChecked(false);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(C0838R.drawable.ic_preview_on_);
        } else {
            setImageResource(C0838R.drawable.ic_preview_off);
            setColor(-5592406);
        }
    }

    public void setColor(int i) {
        if (this.a == null) {
            this.a = getDrawable();
        }
        this.a.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setChecked(false);
    }
}
