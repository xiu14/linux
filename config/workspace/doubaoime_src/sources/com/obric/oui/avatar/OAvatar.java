package com.obric.oui.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Space;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.common.util.b;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import e.a.a.a.a;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OAvatar extends ConstraintLayout {
    private final OCircleImageView a;
    private final OCircleImageView b;

    /* renamed from: c, reason: collision with root package name */
    private final Space f7612c;

    /* renamed from: d, reason: collision with root package name */
    private AvatarSize f7613d;

    /* renamed from: e, reason: collision with root package name */
    private IconType f7614e;

    /* renamed from: f, reason: collision with root package name */
    private int f7615f;

    public enum AvatarSize {
        DP_16(16),
        DP_20(20),
        DP_24(24),
        DP_32(32),
        DP_40(40),
        DP_48(48),
        DP_56(56),
        DP_64(64),
        DP_72(72);

        private final int dpValue;

        AvatarSize(int i) {
            this.dpValue = i;
        }

        public final int getDpValue() {
            return this.dpValue;
        }
    }

    public enum IconType {
        ONLINE,
        LOGO
    }

    public OAvatar(Context context) {
        this(context, null);
    }

    private final void g(int i, int i2, int i3, int i4) {
        Space space = this.f7612c;
        ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i2;
        space.setLayoutParams(layoutParams2);
        setAvatarInset(1);
        this.b.setContentPadding(0);
        this.b.setBorderWidth(i3);
        this.b.setBorderColor(this.f7615f);
        OCircleImageView oCircleImageView = this.b;
        ViewGroup.LayoutParams layoutParams3 = oCircleImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        int i5 = (i3 * 2) + i4;
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = i5;
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = i5;
        oCircleImageView.setLayoutParams(layoutParams4);
    }

    private final void h(AvatarSize avatarSize) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = 20.0f;
        float f8 = 16.0f;
        float f9 = 1.0f;
        float f10 = 0.0f;
        switch (avatarSize.ordinal()) {
            case 2:
                float f11 = (2 * 1.0f) + 10.0f;
                float f12 = f11 - 1.0f;
                float f13 = f11 - 3.0f;
                f2 = f12;
                f7 = 10.0f;
                f3 = f13;
                float f14 = f2;
                f10 = f3;
                f6 = f14;
                break;
            case 3:
            case 4:
                float f15 = (2 * 1.5f) + 12.0f;
                f4 = f15 - 1.5f;
                f3 = f15 - 3.5f;
                f8 = 12.0f;
                f2 = f4;
                f7 = f8;
                f9 = 1.5f;
                float f142 = f2;
                f10 = f3;
                f6 = f142;
                break;
            case 5:
                float f16 = (2 * 1.5f) + 16.0f;
                f4 = f16 - 1.5f;
                f3 = f16 - 3.5f;
                f2 = f4;
                f7 = f8;
                f9 = 1.5f;
                float f1422 = f2;
                f10 = f3;
                f6 = f1422;
                break;
            case 6:
                float f17 = (2 * 2.0f) + 16.0f;
                float f18 = f17 - 2.0f;
                f3 = f17 - 4.0f;
                f5 = f18;
                f7 = 16.0f;
                f2 = f5;
                f9 = 2.0f;
                float f14222 = f2;
                f10 = f3;
                f6 = f14222;
                break;
            case 7:
            case 8:
                float f19 = (2 * 2.0f) + 20.0f;
                f5 = f19 - 2.0f;
                f3 = f19 - 4.0f;
                f2 = f5;
                f9 = 2.0f;
                float f142222 = f2;
                f10 = f3;
                f6 = f142222;
                break;
            default:
                f6 = 0.0f;
                f7 = 0.0f;
                f9 = 0.0f;
                break;
        }
        g(a.e0("Resources.getSystem()", 1, f10), a.e0("Resources.getSystem()", 1, f6), a.e0("Resources.getSystem()", 1, f9), a.e0("Resources.getSystem()", 1, f7));
    }

    private final void i(AvatarSize avatarSize) {
        float f2;
        float f3;
        float f4 = 12.0f;
        float f5 = 8.0f;
        float f6 = 1.5f;
        float f7 = 0.0f;
        switch (avatarSize.ordinal()) {
            case 2:
                f5 = 6.0f;
                f7 = ((2 * 1.0f) + 6.0f) - 1;
                f6 = 1.0f;
                break;
            case 3:
                f2 = ((2 * 1.5f) + 8.0f) - 0.5f;
                f7 = f2;
                break;
            case 4:
                f2 = (2 * 1.5f) + 8.0f + 0.5f;
                f7 = f2;
                break;
            case 5:
            case 6:
                f7 = (2 * 2.0f) + 10.0f + 0.5f;
                f4 = 10.0f;
                f5 = f4;
                f6 = 2.0f;
                break;
            case 7:
                f3 = (2 * 2.0f) + 12.0f + 1.0f;
                f7 = f3;
                f5 = f4;
                f6 = 2.0f;
                break;
            case 8:
                f3 = (2 * 2.0f) + 12.0f + 2.0f;
                f7 = f3;
                f5 = f4;
                f6 = 2.0f;
                break;
            default:
                f5 = 0.0f;
                f6 = 0.0f;
                break;
        }
        g(a.e0("Resources.getSystem()", 1, f7), a.e0("Resources.getSystem()", 1, f7), a.e0("Resources.getSystem()", 1, f6), a.e0("Resources.getSystem()", 1, f5));
    }

    public static /* synthetic */ void setIcon$default(OAvatar oAvatar, int i, IconType iconType, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            iconType = IconType.LOGO;
        }
        oAvatar.setIcon(i, iconType);
    }

    public final OCircleImageView j() {
        return this.a;
    }

    public final void setAvatar(Bitmap bitmap) {
        l.f(bitmap, "bitmap");
        this.a.setImageBitmap(bitmap);
    }

    public final void setAvatarInset(int i) {
        OCircleImageView oCircleImageView = this.a;
        ViewGroup.LayoutParams layoutParams = oCircleImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(i, i, i, i);
        oCircleImageView.setLayoutParams(layoutParams2);
    }

    public final void setAvatarSize(AvatarSize avatarSize) {
        l.f(avatarSize, MonitorConstants.SIZE);
        this.f7613d = avatarSize;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new kotlin.l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = a.e0("Resources.getSystem()", 1, avatarSize.getDpValue());
        layoutParams.height = a.e0("Resources.getSystem()", 1, avatarSize.getDpValue());
        setLayoutParams(layoutParams);
        if (!this.b.isShown() || this.b.getDrawable() == null) {
            return;
        }
        IconType iconType = this.f7614e;
        if (iconType == IconType.ONLINE) {
            i(avatarSize);
        } else if (iconType == IconType.LOGO) {
            h(avatarSize);
        }
    }

    public final void setIcon(@DrawableRes int i, IconType iconType) {
        l.f(iconType, "iconType");
        setIcon(ContextCompat.getDrawable(getContext(), i), iconType);
    }

    public final void setIconBorderColor(@ColorInt int i) {
        this.f7615f = i;
    }

    public final void setIconType(IconType iconType) {
        l.f(iconType, "iconType");
        this.f7614e = iconType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAvatar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f7613d = AvatarSize.DP_24;
        this.f7614e = IconType.LOGO;
        this.f7615f = -1;
        ViewGroup.inflate(context, C0838R.layout.o_widget_avatar, this);
        View findViewById = findViewById(C0838R.id.iv_avatar);
        l.e(findViewById, "findViewById(R.id.iv_avatar)");
        OCircleImageView oCircleImageView = (OCircleImageView) findViewById;
        this.a = oCircleImageView;
        View findViewById2 = findViewById(C0838R.id.iv_icon);
        l.e(findViewById2, "findViewById(R.id.iv_icon)");
        this.b = (OCircleImageView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.iv_bg);
        l.e(findViewById3, "findViewById(R.id.iv_bg)");
        View findViewById4 = findViewById(C0838R.id.spacer);
        l.e(findViewById4, "findViewById(R.id.spacer)");
        this.f7612c = (Space) findViewById4;
        setClipChildren(false);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        oCircleImageView.setBorderWidth(kotlin.t.a.a(TypedValue.applyDimension(1, 1, system.getDisplayMetrics())));
        oCircleImageView.setBorderColor(ContextCompat.getColor(context, C0838R.color.LineReverse2));
    }

    public static /* synthetic */ void setIcon$default(OAvatar oAvatar, Drawable drawable, IconType iconType, int i, Object obj) {
        if ((i & 2) != 0) {
            iconType = IconType.LOGO;
        }
        oAvatar.setIcon(drawable, iconType);
    }

    public final void setAvatar(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setIcon(Drawable drawable, IconType iconType) {
        l.f(iconType, "iconType");
        if (drawable == null) {
            b.f(this.b);
            return;
        }
        if (getParent() != null && (getParent() instanceof ViewGroup)) {
            ViewParent parent = getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).setClipChildren(false);
        }
        this.f7614e = iconType;
        this.b.setImageDrawable(drawable);
        b.g(this.b);
        int ordinal = iconType.ordinal();
        if (ordinal == 0) {
            i(this.f7613d);
        } else {
            if (ordinal != 1) {
                return;
            }
            h(this.f7613d);
        }
    }

    public final void setAvatar(int i) {
        this.a.setImageResource(i);
    }
}
