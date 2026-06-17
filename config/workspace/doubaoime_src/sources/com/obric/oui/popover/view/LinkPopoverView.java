package com.obric.oui.popover.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import com.obric.oui.popover.PopoverLinearLayout;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public class LinkPopoverView extends PopoverLinearLayout {
    private final ImageView a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f7943c;

    public LinkPopoverView(Context context) {
        this(context, null);
    }

    public final ImageView a() {
        return this.f7943c;
    }

    public final ImageView b() {
        return this.a;
    }

    public void setLeftIcon(@DrawableRes int i) {
        this.a.setImageResource(i);
        b.g(this.a);
    }

    public final void setTips(CharSequence charSequence) {
        l.f(charSequence, "charSequence");
        this.b.setText(charSequence);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPopoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        LinearLayout.inflate(context, C0838R.layout.o_popover_link_view, this);
        setOrientation(0);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int a = a.a(TypedValue.applyDimension(1, 12, system.getDisplayMetrics()));
        setPadding(a, a, a, a);
        setBackground(ContextCompat.getDrawable(context, C0838R.drawable.o_popover_view_bg));
        View findViewById = findViewById(C0838R.id.iv_icon);
        l.e(findViewById, "findViewById(R.id.iv_icon)");
        this.a = (ImageView) findViewById;
        View findViewById2 = findViewById(C0838R.id.tv_tips);
        l.e(findViewById2, "findViewById(R.id.tv_tips)");
        this.b = (TextView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.iv_arrow);
        l.e(findViewById3, "findViewById(R.id.iv_arrow)");
        this.f7943c = (ImageView) findViewById3;
    }

    public void setLeftIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
        b.g(this.a);
    }
}
