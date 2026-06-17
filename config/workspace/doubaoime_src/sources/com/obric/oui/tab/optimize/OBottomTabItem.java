package com.obric.oui.tab.optimize;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import e.i.b.f.e.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OBottomTabItem extends RelativeLayout {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private int f8087c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f8088d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f8089e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f8090f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f8091g;

    public OBottomTabItem(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void setImageAndTextTintColor$default(OBottomTabItem oBottomTabItem, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = ContextCompat.getColor(oBottomTabItem.getContext(), C0838R.color.oui_accent_fg);
        }
        if ((i4 & 2) != 0) {
            i2 = ContextCompat.getColor(oBottomTabItem.getContext(), C0838R.color.oui_text_3b);
        }
        if ((i4 & 4) != 0) {
            i3 = ContextCompat.getColor(oBottomTabItem.getContext(), C0838R.color.oui_accent_bg_low_contrast);
        }
        oBottomTabItem.setImageAndTextTintColor(i, i2, i3);
    }

    public final void setImageAndTextTintColor() {
        setImageAndTextTintColor$default(this, 0, 0, 0, 7, null);
    }

    public final void setImageAndTextTintColor(int i) {
        setImageAndTextTintColor$default(this, i, 0, 0, 6, null);
    }

    public final void setImageAndTextTintColor(int i, int i2) {
        setImageAndTextTintColor$default(this, i, i2, 0, 4, null);
    }

    public final void setImageAndTextTintColor(int i, int i2, int i3) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[0]}, new int[]{i, i2});
        this.f8087c = i3;
        this.f8088d.setImageTintList(colorStateList);
        this.f8089e.setTextColor(colorStateList);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        Drawable drawable;
        super.setSelected(z);
        Drawable drawable2 = this.f8090f;
        if (drawable2 == null || (drawable = this.f8091g) == null) {
            b.f("optimize.OBottomTabItem", "please set selectedIconDrawable and unselectedIconDrawable");
        } else if (z) {
            this.f8088d.setImageDrawable(drawable2);
        } else {
            this.f8088d.setImageDrawable(drawable);
        }
        if (z) {
            this.f8089e.setTextAppearance(C0838R.style.Label_S_Thick);
        } else {
            this.f8089e.setTextAppearance(C0838R.style.Label_S);
        }
    }

    public final void setSelectedIconDrawable(Drawable drawable) {
        this.f8090f = drawable;
    }

    public final void setUnselectedIconDrawable(Drawable drawable) {
        this.f8091g = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OBottomTabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setClickable(false);
        setFocusable(false);
        LayoutInflater.from(context).inflate(C0838R.layout.o_tab_bottom_item, (ViewGroup) this, true);
        View findViewById = findViewById(C0838R.id.icon_container);
        l.e(findViewById, "findViewById(R.id.icon_container)");
        View findViewById2 = findViewById(C0838R.id.icon);
        l.e(findViewById2, "findViewById(R.id.icon)");
        this.f8088d = (ImageView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.title);
        l.e(findViewById3, "findViewById(R.id.title)");
        this.f8089e = (TextView) findViewById3;
        int color = ContextCompat.getColor(getContext(), C0838R.color.oui_accent_fg);
        this.b = color;
        int color2 = ContextCompat.getColor(getContext(), C0838R.color.oui_text_3b);
        this.a = color2;
        int color3 = ContextCompat.getColor(getContext(), C0838R.color.oui_accent_bg_low_contrast);
        this.f8087c = color3;
        setImageAndTextTintColor(color, color2, color3);
    }
}
