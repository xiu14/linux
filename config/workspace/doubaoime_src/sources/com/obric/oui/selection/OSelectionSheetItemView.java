package com.obric.oui.selection;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.res.ResourcesCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.checkbox.OCheckBox;
import com.obric.oui.lisitem.OListItemGeneral;
import e.a.a.a.a;
import e.i.b.f.e.b;
import kotlin.f;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSelectionSheetItemView extends OListItemGeneral {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSelectionSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setCheckStyle(OSelectionSheetItemView$Companion$CheckStyle.NONE);
        setShowDivider(true);
        setShowBackground(false);
        setBackground(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCheckStyle(OSelectionSheetItemView$Companion$CheckStyle oSelectionSheetItemView$Companion$CheckStyle) {
        l.f(oSelectionSheetItemView$Companion$CheckStyle, "style");
        int ordinal = oSelectionSheetItemView$Companion$CheckStyle.ordinal();
        OCheckBox oCheckBox = null;
        if (ordinal != 0) {
            if (ordinal == 1) {
                ImageView imageView = new ImageView(getContext());
                Context context = imageView.getContext();
                l.e(context, "context");
                imageView.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(), C0838R.drawable.o_ic_radio_tick_checked, null));
                oCheckBox = imageView;
            } else {
                if (ordinal != 2) {
                    throw new f();
                }
                Context context2 = getContext();
                l.e(context2, "context");
                oCheckBox = new OCheckBox(context2);
                oCheckBox.setShape(0);
                oCheckBox.setSize(0);
            }
        }
        if (oCheckBox == null) {
            o().setVisibility(8);
            return;
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(a.e0("Resources.getSystem()", 1, 32), a.e0("Resources.getSystem()", 1, 24)));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(oCheckBox, layoutParams);
        setTrailingView(frameLayout);
    }

    public final void setChecked(boolean z) {
        View childAt = o().getChildAt(0);
        if (childAt == null || !(childAt instanceof ViewGroup)) {
            childAt = null;
        }
        ViewGroup viewGroup = (ViewGroup) childAt;
        View childAt2 = viewGroup != null ? viewGroup.getChildAt(0) : null;
        if (childAt2 instanceof OCheckBox) {
            ((OCheckBox) childAt2).setChecked(z);
        } else if (childAt2 instanceof ImageView) {
            ((ImageView) childAt2).setVisibility(z ? 0 : 4);
        } else {
            b.a("OSelectionSheetItemView", "checkMark is not OCheckBox or ImageView");
        }
    }

    public final void setIcon(Drawable drawable) {
        setContentImage(drawable);
    }

    public final void setTitle(String str) {
        l.f(str, "str");
        setTitleString(str);
    }
}
