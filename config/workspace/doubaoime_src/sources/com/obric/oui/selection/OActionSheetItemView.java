package com.obric.oui.selection;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import com.obric.oui.lisitem.OListItemGeneral;
import kotlin.s.c.l;

@RequiresApi(30)
/* loaded from: classes2.dex */
public final class OActionSheetItemView extends OListItemGeneral {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OActionSheetItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setShowBackground(true);
    }

    public final void setIcon(Drawable drawable) {
        setContentImage(drawable);
    }

    public final void setTitle(String str) {
        l.f(str, "str");
        setTitleString(str);
    }
}
