package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.it;
import com.xiaomi.push.service.as;

/* loaded from: classes2.dex */
public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        it itVar = new it();
        itVar.c(ie.VRUpload.f611a);
        itVar.b(b.m41a(context).m42a());
        itVar.d(context.getPackageName());
        itVar.a(RemoteMessageConst.DATA, str);
        itVar.a(as.a());
        u.a(context).a((u) itVar, hu.Notification, (ih) null);
    }
}
