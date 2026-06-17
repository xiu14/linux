package com.obric.oui.popover.menu;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.a.a.a.a;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class PopoverMenuLinearLayout extends LinearLayout {
    private float a;
    private p<? super Boolean, ? super Integer, o> b;

    /* renamed from: c, reason: collision with root package name */
    private int f7942c;

    public enum Index {
        FIRST,
        LAST,
        OTHER,
        ONLY_ONE
    }

    public PopoverMenuLinearLayout(Context context) {
        this(context, null, 0);
    }

    public final void setForceDark(boolean z) {
        if (z) {
            this.f7942c = Color.parseColor("#FF45474F");
        } else {
            this.f7942c = ContextCompat.getColor(getContext(), C0838R.color.oui_fill_element_3);
        }
    }

    public final void setIndexPos(Index index) {
        l.f(index, "<set-?>");
    }

    public final void setNotifyPressedCallback(p<? super Boolean, ? super Integer, o> pVar) {
        this.b = pVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        p<? super Boolean, ? super Integer, o> pVar = this.b;
        if (pVar != null) {
            pVar.invoke(Boolean.valueOf(z), Integer.valueOf(this.f7942c));
        }
        if (!z) {
            setBackgroundColor(0);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.f7942c);
        float f2 = this.a;
        gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        setBackground(gradientDrawable);
    }

    public final void setPressedCornerRadius(float f2) {
        this.a = f2;
    }

    public PopoverMenuLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopoverMenuLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = a.m("Resources.getSystem()", 1, 12);
        Index index = Index.OTHER;
        this.f7942c = ContextCompat.getColor(context, C0838R.color.oui_fill_element_3);
    }
}
