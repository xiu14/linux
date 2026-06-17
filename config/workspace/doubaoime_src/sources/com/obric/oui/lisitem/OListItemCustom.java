package com.obric.oui.lisitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.layout.OUIFrameLayout;
import com.obric.oui.text.OTextView;
import e.i.a.b.b;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public class OListItemCustom extends OListItemGeneral {
    public OUIFrameLayout s;
    public OTextView t;
    public ImageView u;
    private String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OListItemCustom(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        View findViewById = findViewById(C0838R.id.title_info);
        l.e(findViewById, "findViewById(R.id.title_info)");
        View findViewById2 = findViewById(C0838R.id.iv_content_img_background);
        l.e(findViewById2, "findViewById(R.id.iv_content_img_background)");
        this.s = (OUIFrameLayout) findViewById2;
        View findViewById3 = findViewById(C0838R.id.trailingText);
        l.e(findViewById3, "findViewById(R.id.trailingText)");
        this.t = (OTextView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.trailingImage);
        l.e(findViewById4, "findViewById(R.id.trailingImage)");
        this.u = (ImageView) findViewById4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.w);
        setTrailingTextString(obtainStyledAttributes.getString(7));
        obtainStyledAttributes.recycle();
        if (k() != null) {
            OUIFrameLayout oUIFrameLayout = this.s;
            if (oUIFrameLayout != null) {
                oUIFrameLayout.setVisibility(0);
            } else {
                l.l("contentImgBackground");
                throw null;
            }
        }
    }

    @Override // com.obric.oui.lisitem.OListItemGeneral
    public int j() {
        return a.a(getResources().getDimension(C0838R.dimen.oui_listitem_content_width_large));
    }

    @Override // com.obric.oui.lisitem.OListItemGeneral
    public void q() {
        LayoutInflater.from(getContext()).inflate(C0838R.layout.o_listitem_custom_trailing, this);
    }

    public final void setContentImgBackground(OUIFrameLayout oUIFrameLayout) {
        l.f(oUIFrameLayout, "<set-?>");
        this.s = oUIFrameLayout;
    }

    public final void setImageView(Drawable drawable) {
        ImageView imageView = this.u;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        } else {
            l.l("trailingImageView");
            throw null;
        }
    }

    public final void setListItemSettingsEnabled(boolean z) {
        setChangeAlphaWhenDisable(false);
        setEnabled(z);
        if (z) {
            n().setAlpha(1.0f);
            l().setAlpha(1.0f);
            m().setAlpha(1.0f);
        } else {
            n().setAlpha(0.3f);
            l().setAlpha(0.3f);
            m().setAlpha(0.3f);
        }
    }

    public final void setMTitleInfo(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
    }

    public final void setTrailingImageView(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.u = imageView;
    }

    public final void setTrailingText(OTextView oTextView) {
        l.f(oTextView, "<set-?>");
        this.t = oTextView;
    }

    public final void setTrailingTextString(String str) {
        this.v = str;
        r();
        String str2 = this.v;
        if (str2 != null) {
            setTrailingText(str2);
        }
    }

    public final void setTrailingText(String str) {
        l.f(str, "text");
        OTextView oTextView = this.t;
        if (oTextView != null) {
            oTextView.setText(str);
        } else {
            l.l("trailingText");
            throw null;
        }
    }
}
