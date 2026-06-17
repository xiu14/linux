package com.xiaomi.push;

import android.service.notification.StatusBarNotification;

/* loaded from: classes2.dex */
public class ei extends eg {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private String f378a;

    public ei(int i, String str) {
        this.a = i;
        this.f378a = str;
    }

    @Override // com.xiaomi.push.eg
    public int a() {
        return 1;
    }

    @Override // com.xiaomi.push.eg
    boolean a(StatusBarNotification statusBarNotification) {
        if (this.a < 0 || statusBarNotification == null) {
            return false;
        }
        return u.b(this.f378a, this.a) == statusBarNotification.getId();
    }
}
