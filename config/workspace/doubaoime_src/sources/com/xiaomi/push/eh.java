package com.xiaomi.push;

import android.service.notification.StatusBarNotification;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class eh extends eg {
    private String a;

    public eh(String str) {
        this.a = str;
    }

    @Override // com.xiaomi.push.eg
    public int a() {
        return 2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m349a() {
        return this.a;
    }

    @Override // com.xiaomi.push.eg
    boolean a(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null || statusBarNotification.getNotification() == null || TextUtils.isEmpty(this.a)) {
            return false;
        }
        return TextUtils.equals(this.a, com.xiaomi.push.service.ao.d(statusBarNotification.getNotification()));
    }
}
