package com.obric.oui.lisitem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.obric.oui.oswitch.OSwitch;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OListItemCircleImgSwitch extends OListItemCircleImg {
    private final OSwitch y;
    private CompoundButton.OnCheckedChangeListener z;

    static final class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = OListItemCircleImgSwitch.this.z;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OListItemCircleImgSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        OSwitch oSwitch = new OSwitch(context, null, 0, 6);
        oSwitch.setClickable(true);
        oSwitch.setOnCheckedChangeListener(new a());
        this.y = oSwitch;
        setTrailingView(oSwitch);
    }

    public final void setChecked(boolean z) {
        this.y.setChecked(z);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.z = onCheckedChangeListener;
    }
}
