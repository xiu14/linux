package com.obric.oui.lisitem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.oswitch.OSwitch;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OListItemSwitch extends OListItemSettings {
    private final OSwitch v;
    private CompoundButton.OnCheckedChangeListener w;

    static final class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = OListItemSwitch.this.w;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OListItemSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setClickable(false);
        OSwitch oSwitch = new OSwitch(context, null, 0, 6);
        oSwitch.setClickable(true);
        oSwitch.setOnCheckedChangeListener(new a());
        this.v = oSwitch;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        float f2 = 4;
        layoutParams.leftMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        layoutParams.rightMargin = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
        setTrailingView(oSwitch, layoutParams);
    }

    @Override // com.obric.oui.layout.OUIFrameLayout
    public boolean i() {
        return false;
    }

    @Override // com.obric.oui.lisitem.OListItemSettings, com.obric.oui.lisitem.OListItemGeneral
    public void q() {
        LayoutInflater.from(getContext()).inflate(C0838R.layout.o_listitem_switch, this);
    }

    public final void setChecked(boolean z) {
        this.v.setChecked(z);
    }

    @Override // com.obric.oui.lisitem.OListItemGeneral, com.obric.oui.layout.OUIFrameLayout, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.v.setAlpha(1.0f);
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.w = onCheckedChangeListener;
    }
}
