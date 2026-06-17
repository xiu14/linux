package com.obric.oui.lisitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OIconButton;
import e.i.a.b.b;
import kotlin.s.c.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public class OListItemCircleImg extends OListItemGeneral {
    private final SettingsTrailingView s;
    private OIconButton t;
    private ImageView u;
    private String v;
    private Drawable w;
    private Drawable x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OListItemCircleImg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.s = new SettingsTrailingView(context, null, 0, 6);
        View findViewById = findViewById(C0838R.id.contentImgCircle);
        l.e(findViewById, "findViewById(R.id.contentImgCircle)");
        this.t = (OIconButton) findViewById;
        View findViewById2 = findViewById(C0838R.id.iv_icon);
        l.e(findViewById2, "findViewById(R.id.iv_icon)");
        this.u = (ImageView) findViewById2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.w);
        setTrailingTextString(obtainStyledAttributes.getString(7));
        obtainStyledAttributes.recycle();
        if (this.w != null) {
            this.t.setVisibility(0);
            m().setVisibility(0);
        } else {
            this.t.setVisibility(8);
            m().setVisibility(8);
        }
    }

    public static /* synthetic */ void setTrailingTextMaxLines$default(OListItemCircleImg oListItemCircleImg, int i, TextUtils.TruncateAt truncateAt, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTrailingTextMaxLines");
        }
        if ((i2 & 2) != 0) {
            truncateAt = TextUtils.TruncateAt.END;
        }
        oListItemCircleImg.setTrailingTextMaxLines(i, truncateAt);
    }

    @Override // com.obric.oui.lisitem.OListItemGeneral
    public int j() {
        return a.a(getResources().getDimension(C0838R.dimen.oui_listitem_content_width_large));
    }

    @Override // com.obric.oui.lisitem.OListItemGeneral
    public void q() {
        LayoutInflater.from(getContext()).inflate(C0838R.layout.o_listitem_circle_img, this);
    }

    public final void setCircleImage(Drawable drawable) {
        this.w = drawable;
        if (drawable != null) {
            this.t.setImageDrawable(drawable);
            this.t.setVisibility(0);
            m().setVisibility(0);
        } else {
            this.t.setVisibility(8);
            m().setVisibility(8);
        }
        r();
    }

    public final void setContentImgCircle(OIconButton oIconButton) {
        l.f(oIconButton, "<set-?>");
        this.t = oIconButton;
    }

    public final void setIconImage(Drawable drawable) {
        this.x = drawable;
        if (drawable != null) {
            this.u.setImageDrawable(drawable);
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
        r();
    }

    public final void setImageView(Drawable drawable) {
        this.s.setTrailingImage(drawable);
    }

    public final void setIvIcon(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.u = imageView;
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

    public final void setTrailingText(String str) {
        l.f(str, "text");
        this.s.setTrailingText(str);
    }

    public final void setTrailingTextMaxLines(int i, TextUtils.TruncateAt truncateAt) {
        l.f(truncateAt, "ellipsize");
        this.s.a().setMaxLines(i);
        this.s.a().setEllipsize(truncateAt);
    }

    public final void setTrailingTextString(String str) {
        this.v = str;
        r();
        String str2 = this.v;
        if (str2 != null) {
            setTrailingText(str2);
        }
        setTrailingView(this.s);
    }
}
