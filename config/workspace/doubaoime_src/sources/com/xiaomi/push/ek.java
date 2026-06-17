package com.xiaomi.push;

import android.app.Notification;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class ek extends eg {
    private String a;
    private String b;

    public ek(String str, String str2) {
        this.b = str;
        this.a = str2;
    }

    @Override // com.xiaomi.push.eg
    public int a() {
        return 3;
    }

    @Override // com.xiaomi.push.eg
    boolean a(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null || TextUtils.isEmpty(String.valueOf(statusBarNotification.getId())) || statusBarNotification.getNotification() == null || TextUtils.isEmpty(this.a) || TextUtils.isEmpty(this.b)) {
            return false;
        }
        Notification notification = statusBarNotification.getNotification();
        return a(com.xiaomi.push.service.ao.a(notification), this.a) && a(com.xiaomi.push.service.ao.b(notification), this.b);
    }

    private boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.contains(str)) ? false : true;
    }
}
