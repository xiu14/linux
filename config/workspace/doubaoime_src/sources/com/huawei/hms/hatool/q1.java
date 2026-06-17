package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* loaded from: classes2.dex */
public class q1 {

    /* renamed from: c, reason: collision with root package name */
    private static q1 f7389c = new q1();
    private boolean a = false;
    private Context b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return f7389c;
    }

    @TargetApi(24)
    public boolean a() {
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
