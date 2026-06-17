package com.obric.oui.infopanel.content;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OInfoPanelContentEntranceView extends ConstraintLayout {
    private final TextView a;
    private final ViewGroup b;

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OInfoPanelContentEntranceView oInfoPanelContentEntranceView = OInfoPanelContentEntranceView.this;
            int width = oInfoPanelContentEntranceView.b.getWidth();
            float f2 = 44;
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            b.b(oInfoPanelContentEntranceView, width, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())), true);
            ViewGroup viewGroup = OInfoPanelContentEntranceView.this.b;
            int width2 = OInfoPanelContentEntranceView.this.b.getWidth();
            Resources system2 = Resources.getSystem();
            l.e(system2, "Resources.getSystem()");
            b.b(viewGroup, width2, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics())), true);
        }
    }

    public OInfoPanelContentEntranceView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new a());
    }

    public final void setEntranceText(CharSequence charSequence) {
        l.f(charSequence, "text");
        this.a.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInfoPanelContentEntranceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_info_panel_content_entrance_view, this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 8);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        marginLayoutParams.setMargins(0, e0, 0, kotlin.t.a.a(TypedValue.applyDimension(1, 12, system.getDisplayMetrics())));
        setLayoutParams(marginLayoutParams);
        View findViewById = findViewById(C0838R.id.tv_title);
        l.e(findViewById, "findViewById(R.id.tv_title)");
        this.a = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.iv_arrow);
        l.e(findViewById2, "findViewById(R.id.iv_arrow)");
        View findViewById3 = findViewById(C0838R.id.entrance_container);
        l.e(findViewById3, "findViewById(R.id.entrance_container)");
        this.b = (ViewGroup) findViewById3;
    }
}
