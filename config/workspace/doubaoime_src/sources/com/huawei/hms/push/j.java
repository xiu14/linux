package com.huawei.hms.push;

import android.app.Notification;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class j {
    public static k a(o oVar) {
        k kVar = k.STYLE_DEFAULT;
        if (oVar.v() < 0) {
            return kVar;
        }
        int v = oVar.v();
        k.values();
        return v < 4 ? k.values()[oVar.v()] : kVar;
    }

    public static void a(Notification.Builder builder, String str, o oVar) {
        Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
        if (!TextUtils.isEmpty(oVar.g())) {
            bigTextStyle.setBigContentTitle(oVar.g());
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            bigTextStyle.bigText(str);
        }
        builder.setStyle(bigTextStyle);
    }
}
