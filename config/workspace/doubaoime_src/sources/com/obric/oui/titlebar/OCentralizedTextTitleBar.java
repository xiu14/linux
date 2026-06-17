package com.obric.oui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OCentralizedTextTitleBar extends OTitleBar {
    private View b;

    public OCentralizedTextTitleBar(Context context) {
        this(context, null, 0);
    }

    @Override // com.obric.oui.titlebar.OTitleBar
    public void setDividerLineBackground(int i) {
        View view = this.b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public OCentralizedTextTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCentralizedTextTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        FrameLayout.inflate(context, C0838R.layout.o_centralized_title_bar, this);
        this.a = (TextView) findViewById(C0838R.id.tv_content_title);
        this.b = findViewById(C0838R.id.divider_view);
    }
}
