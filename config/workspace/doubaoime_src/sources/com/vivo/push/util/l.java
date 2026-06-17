package com.vivo.push.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class l implements BaseNotifyLayoutAdapter {
    private Resources a;
    private String b;

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getNotificationLayout() {
        return this.a.getIdentifier("push_notify", "layout", this.b);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getSuitIconId() {
        Resources resources;
        String str;
        String str2;
        if (m.f8926d) {
            resources = this.a;
            str = this.b;
            str2 = "notify_icon_rom30";
        } else if (m.f8925c) {
            resources = this.a;
            str = this.b;
            str2 = "notify_icon_rom20";
        } else {
            resources = this.a;
            str = this.b;
            str2 = "notify_icon";
        }
        return resources.getIdentifier(str2, "id", str);
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final int getTitleColor() {
        int i;
        try {
            i = ((Integer) ah.a("com.android.internal.R$color", "vivo_notification_title_text_color")).intValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            i = 0;
        }
        if (i > 0) {
            return this.a.getColor(i);
        }
        boolean z = m.f8926d;
        if (z) {
            return -1;
        }
        if (!m.f8925c) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (z) {
            return Color.parseColor("#ff999999");
        }
        return -1;
    }

    @Override // com.vivo.push.util.BaseNotifyLayoutAdapter
    public final void init(Context context) {
        this.b = context.getPackageName();
        this.a = context.getResources();
    }
}
