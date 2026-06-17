package com.prolificinteractive.materialcalendarview;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.widget.ImageView;

/* loaded from: classes2.dex */
class j extends ImageView {
    public j(Context context) {
        super(context);
        int identifier = context.getResources().getIdentifier("selectableItemBackgroundBorderless", "attr", context.getPackageName());
        identifier = identifier == 0 ? R.attr.selectableItemBackgroundBorderless : identifier;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.1f);
    }
}
