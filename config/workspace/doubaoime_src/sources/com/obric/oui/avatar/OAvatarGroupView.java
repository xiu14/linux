package com.obric.oui.avatar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.avatar.OAvatar;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import kotlin.l;
import kotlin.t.a;

/* loaded from: classes2.dex */
public final class OAvatarGroupView extends ConstraintLayout {
    private final OAvatar a;
    private final OAvatar b;

    public OAvatarGroupView(Context context) {
        this(context, null);
    }

    private final void g(OAvatar oAvatar, OAvatar.AvatarSize avatarSize, int i) {
        ViewGroup.LayoutParams layoutParams = oAvatar.getLayoutParams();
        if (layoutParams == null) {
            throw new l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i2 = i * 2;
        float dpValue = avatarSize.getDpValue();
        Resources system = Resources.getSystem();
        kotlin.s.c.l.e(system, "Resources.getSystem()");
        layoutParams.width = a.a(TypedValue.applyDimension(1, dpValue, system.getDisplayMetrics())) + i2;
        float dpValue2 = avatarSize.getDpValue();
        Resources system2 = Resources.getSystem();
        kotlin.s.c.l.e(system2, "Resources.getSystem()");
        layoutParams.height = a.a(TypedValue.applyDimension(1, dpValue2, system2.getDisplayMetrics())) + i2;
        oAvatar.setLayoutParams(layoutParams);
        oAvatar.setAvatarInset(i);
    }

    public final void setAvatarGroupSize(OAvatar.AvatarSize avatarSize) {
        OAvatar.AvatarSize avatarSize2;
        kotlin.s.c.l.f(avatarSize, MonitorConstants.SIZE);
        switch (avatarSize.ordinal()) {
            case 2:
                avatarSize2 = OAvatar.AvatarSize.DP_16;
                break;
            case 3:
                avatarSize2 = OAvatar.AvatarSize.DP_20;
                break;
            case 4:
                avatarSize2 = OAvatar.AvatarSize.DP_24;
                break;
            case 5:
                avatarSize2 = OAvatar.AvatarSize.DP_32;
                break;
            case 6:
                avatarSize2 = OAvatar.AvatarSize.DP_40;
                break;
            case 7:
                avatarSize2 = OAvatar.AvatarSize.DP_40;
                break;
            case 8:
                avatarSize2 = OAvatar.AvatarSize.DP_48;
                break;
            default:
                throw new IllegalArgumentException("disallow the size: " + avatarSize);
        }
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, avatarSize.getDpValue() >= OAvatar.AvatarSize.DP_56.getDpValue() ? 3 : 2);
        g(this.b, avatarSize2, e0);
        g(this.a, avatarSize2, e0);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new l("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = e.a.a.a.a.e0("Resources.getSystem()", 1, avatarSize.getDpValue());
        layoutParams.width = e.a.a.a.a.e0("Resources.getSystem()", 1, avatarSize.getDpValue());
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OAvatarGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_widget_avatar_group, this);
        View findViewById = findViewById(C0838R.id.under_avatar);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.under_avatar)");
        this.a = (OAvatar) findViewById;
        View findViewById2 = findViewById(C0838R.id.top_avatar);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.top_avatar)");
        this.b = (OAvatar) findViewById2;
    }
}
