package com.huawei.hianalytics.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    private static i f7172c = new i();
    private boolean a = false;
    private Context b = com.huawei.hianalytics.a.b.n();

    private i() {
    }

    public static i a() {
        return f7172c;
    }

    @TargetApi(24)
    public boolean b() {
        if (!this.a) {
            Context context = this.b;
            if (context == null) {
                return false;
            }
            UserManager userManager = (UserManager) context.getSystemService("user");
            if (userManager != null) {
                this.a = userManager.isUserUnlocked();
            } else {
                this.a = false;
            }
        }
        return this.a;
    }
}
