package com.xiaomi.push;

import android.service.notification.StatusBarNotification;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class ej extends eg {
    private final int a;

    /* renamed from: a, reason: collision with other field name */
    private final String f379a;
    private final String b;

    public ej(int i, String str, String str2) {
        this.a = i;
        this.f379a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.push.eg
    public int a() {
        return 4;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m350a() {
        return this.f379a;
    }

    @Override // com.xiaomi.push.eg
    boolean a(StatusBarNotification statusBarNotification) {
        if (this.a < 0 || statusBarNotification == null || TextUtils.isEmpty(this.f379a)) {
            return false;
        }
        return u.b(this.b, this.a) == statusBarNotification.getId() && TextUtils.equals(this.f379a, com.xiaomi.push.service.ao.d(statusBarNotification.getNotification()));
    }
}
