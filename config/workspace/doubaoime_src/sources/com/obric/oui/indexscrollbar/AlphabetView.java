package com.obric.oui.indexscrollbar;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes2.dex */
public final class AlphabetView extends TextView {
    public AlphabetView(Context context) {
        this(context, null, 0, 6);
    }

    public AlphabetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ AlphabetView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public AlphabetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setGravity(17);
        setTextSize(0, getResources().getDimension(C0838R.dimen.smartisan_quickbarex_gridview_font_size));
        setTypeface(null, 1);
        setTextColor(Color.parseColor("#80000000"));
    }
}
