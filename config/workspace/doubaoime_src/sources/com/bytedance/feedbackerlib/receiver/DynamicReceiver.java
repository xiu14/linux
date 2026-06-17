package com.bytedance.feedbackerlib.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.a;
import com.bytedance.feedbackerlib.service.FloatWindowService;
import com.bytedance.feedbackerlib.util.g;

/* loaded from: classes.dex */
public class DynamicReceiver extends BroadcastReceiver {
    private static final String a = a.I() + ".permission.dynamicreceiver";
    private static volatile DynamicReceiver b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4962c = 0;

    private DynamicReceiver() {
    }

    public static void a(@NonNull Context context, String str) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        long j = FloatWindowService.j();
        a.k0(str, j != 0 ? System.currentTimeMillis() - j : 0L);
        Intent intent = new Intent("action_lark_sso_bypassed");
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, a);
    }

    public static void b(@NonNull Context context, String str) {
        if (context == null || context.getApplicationContext() == null) {
            return;
        }
        long j = FloatWindowService.j();
        a.k0(str, j != 0 ? System.currentTimeMillis() - j : 0L);
        Intent intent = new Intent("action_lark_sso_success");
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, a);
    }

    public static void c(@NonNull Context context) {
        if (context == null) {
            return;
        }
        if (b == null) {
            synchronized (DynamicReceiver.class) {
                if (b == null) {
                    b = new DynamicReceiver();
                }
            }
        }
        DynamicReceiver dynamicReceiver = b;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_lark_sso_success");
        intentFilter.addAction("action_lark_sso_bypassed");
        intentFilter.addAction("action_lark_sso_failed");
        context.registerReceiver(dynamicReceiver, intentFilter, a, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        switch (action) {
            case "action_lark_sso_failed":
                try {
                    g.c(Feedbacker.class, "notifyLarkSSOFailed", new Object[0]);
                    break;
                } catch (Throwable th) {
                    a.s("DynamicReceiver", "cannot notify larksso bypassed", th);
                }
            case "action_lark_sso_success":
                try {
                    g.c(Feedbacker.class, "notifyLarkSSOSuccess", new Object[0]);
                    break;
                } catch (Throwable th2) {
                    a.s("DynamicReceiver", "cannot notify larksso success", th2);
                    return;
                }
            case "action_lark_sso_bypassed":
                try {
                    g.c(Feedbacker.class, "notifyLarkSSOBypassed", new Object[0]);
                    break;
                } catch (Throwable th3) {
                    a.s("DynamicReceiver", "cannot notify larksso bypassed", th3);
                    return;
                }
        }
    }
}
