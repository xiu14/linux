package com.obric.oui.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OProgressButton extends OButton {
    private boolean l;
    private Integer m;

    public OProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setProgressMode(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (!z) {
                if (this.m != null) {
                    Integer num = this.m;
                    l.c(num);
                    setBackground(new ColorDrawable(num.intValue()));
                }
                ColorStateList valueOf = ColorStateList.valueOf(getResources().getColor(C0838R.color.oui_on_accent_default, null));
                l.e(valueOf, "ColorStateList.valueOf(r…on_accent_default, null))");
                setTextColor(valueOf);
                return;
            }
            setBackgroundResource(C0838R.drawable.o_button_progress_drawable);
            Drawable background = getBackground();
            if (background instanceof LayerDrawable) {
                Drawable findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.progress);
                Objects.requireNonNull(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.ClipDrawable");
                ClipDrawable clipDrawable = (ClipDrawable) findDrawableByLayerId;
                Integer num2 = this.m;
                if (num2 != null) {
                    l.c(num2);
                    clipDrawable.setTint(num2.intValue());
                }
            }
            setTextColor(getResources().getColor(C0838R.color.white, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, null, 24);
        l.f(context, "context");
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            this.m = Integer.valueOf(((ColorDrawable) background).getColor());
        }
    }
}
