package com.xm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.bytedance.push.g0.a;
import com.bytedance.push.g0.f;
import com.bytedance.push.settings.h;
import com.bytedance.push.third.b;
import com.bytedance.push.third.c;
import com.bytedance.push.third.g;
import com.xiaomi.MiPushSettings;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.api.MiPushSdk;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class MiPushAdapter extends b implements c {
    private static int MI_PUSH = -1;

    @SuppressLint({"ApplySharedPref"})
    private void doUpgradeMiPush(Context context) {
        MiPushSettings miPushSettings = (MiPushSettings) h.b(context, MiPushSettings.class);
        if (miPushSettings.N()) {
            return;
        }
        miPushSettings.r0(true);
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        context.getSharedPreferences("mipush_extra", 0).edit().clear().commit();
        context.getSharedPreferences("mipush", 0).edit().clear().commit();
        context.getSharedPreferences("XMPushServiceConfig", 0).edit().clear().commit();
    }

    public static int getMiPush() {
        if (MI_PUSH == -1) {
            MI_PUSH = g.o(com.ss.android.message.a.a()).d(MiPushAdapter.class.getName());
        }
        return MI_PUSH;
    }

    @Override // com.bytedance.push.third.c
    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        boolean z;
        Pair<String, String> b = ((H) C.B()).b(getMiPush());
        if (b == null || TextUtils.isEmpty((CharSequence) b.first) || TextUtils.isEmpty((CharSequence) b.second)) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.e(str, "Mipush key configuration error, missing key configuration");
            z = false;
        } else {
            z = true;
        }
        boolean b2 = z & com.bytedance.push.g0.g.b(context, str, "MiPush", Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE", e.a.a.a.a.c(context, new StringBuilder(), ".permission.MIPUSH_RECEIVE")));
        a.C0301a c0301a = new a.C0301a("com.xiaomi.push.service.XMPushService");
        c0301a.e(context.getPackageName() + ":pushservice");
        a.C0301a c0301a2 = new a.C0301a("com.xiaomi.push.service.XMJobService");
        c0301a2.e(context.getPackageName() + ":pushservice");
        c0301a2.d("android.permission.BIND_JOB_SERVICE");
        a.C0301a c0301a3 = new a.C0301a("com.xiaomi.mipush.sdk.PushMessageHandler");
        c0301a3.e(context.getPackageName());
        a.C0301a c0301a4 = new a.C0301a("com.xiaomi.mipush.sdk.MessageHandleService");
        c0301a4.e(context.getPackageName());
        boolean d2 = com.bytedance.push.g0.g.d(context, str, "MiPush Error", Arrays.asList(c0301a.b(), c0301a2.b(), c0301a3.b(), c0301a4.b()));
        a.C0301a c0301a5 = new a.C0301a("com.xiaomi.push.service.receivers.PingReceiver");
        c0301a5.e(context.getPackageName() + ":pushservice");
        c0301a5.a(new a.b(Arrays.asList("com.xiaomi.push.PING_TIMER")));
        a.C0301a c0301a6 = new a.C0301a("com.xiaomi.push.service.receivers.MIPushMessageHandler");
        c0301a6.e(context.getPackageName());
        c0301a6.a(new a.b(Arrays.asList("com.xiaomi.mipush.RECEIVE_MESSAGE")));
        c0301a6.a(new a.b(Arrays.asList("com.xiaomi.mipush.MESSAGE_ARRIVED")));
        c0301a6.a(new a.b(Arrays.asList("com.xiaomi.mipush.ERROR")));
        return b2 & (com.bytedance.push.g0.g.c(context, str, "MiPush Error", Arrays.asList(c0301a5.b(), c0301a6.b())) && d2);
    }

    @Override // com.bytedance.push.third.b
    public int getPushType() {
        return MI_PUSH;
    }

    @Override // com.bytedance.push.third.b
    public String isBusinessAlertDialogAvailable(Context context, boolean z) {
        return "not available";
    }

    @Override // com.bytedance.push.third.c
    public boolean isPushAvailable(Context context, int i) {
        return com.ss.android.message.f.a.w();
    }

    @Override // com.bytedance.push.third.b
    public boolean isSupportCallKit() {
        Pair<String, String> b = ((H) C.B()).b(getMiPush());
        MiPushSdk.getInstance().init(com.ss.android.message.a.a(), (String) b.first, (String) b.second);
        boolean isPushSupport = MiPushSdk.getInstance().isPushSupport(524288);
        com.bytedance.push.Q.b x = C.x();
        String A = e.a.a.a.a.A("[isSupportCallKit]pushSupport = ", isPushSupport);
        Objects.requireNonNull((com.bytedance.push.Q.c) x);
        f.g("MiPush", A);
        return isPushSupport;
    }

    @Override // com.bytedance.push.third.c
    public void registerPush(Context context, int i) {
        String str = null;
        if (context == null || i != getMiPush()) {
            if (context == null) {
                str = "context is null";
            } else if (i != getMiPush()) {
                str = "channel register failed";
            }
            C.y().a(i, 101, "0", str);
            return;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g("MiPush", "registerMiPush");
        String h = com.ss.android.message.f.a.h(context);
        if (!TextUtils.isEmpty(h)) {
            boolean z = com.ss.android.message.f.a.f8353g;
            if (h.endsWith(":smp")) {
                com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.MIPushMessageHandler", false);
                com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.WidgetProviderMIPushMessageHandler", false);
                com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.SmpMIPushMessageHandler", true);
            } else if (h.endsWith(":widgetProvider")) {
                com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.MIPushMessageHandler", false);
                com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.SmpMIPushMessageHandler", false);
                com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.WidgetProviderMIPushMessageHandler", true);
            }
        }
        try {
            Pair<String, String> b = ((H) C.B()).b(getMiPush());
            if (b == null) {
                C.y().a(i, 106, "0", "configuration is null");
                return;
            }
            doUpgradeMiPush(context);
            MiPushClient.registerPush(context, (String) b.first, (String) b.second);
            MiPushClient.resumePush(context.getApplicationContext(), null);
            Logger.setLogger(context, new a(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean requestRemoveVoipNotification(Context context, int i) {
        MiPushClient.removeWindow(context);
        return true;
    }

    @Override // com.bytedance.push.third.c
    public void setAlias(Context context, String str, int i) {
        if (context == null || i != getMiPush()) {
            return;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g("MiPush", "setAlias");
        try {
            List<String> allAlias = MiPushClient.getAllAlias(context);
            if (allAlias != null) {
                for (String str2 : allAlias) {
                    if (!TextUtils.isEmpty(str2) && !str2.equals(str)) {
                        MiPushClient.unsetAlias(context, str2, null);
                    }
                }
            }
        } catch (Exception unused) {
        }
        try {
            MiPushClient.setAlias(context, str, null);
        } catch (Exception e2) {
            C.y().a(i, 105, "0", Log.getStackTraceString(e2));
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.third.c
    public void trackPush(Context context, int i, Object obj) {
    }

    @Override // com.bytedance.push.third.c
    public void unregisterPush(Context context, int i) {
        if (context == null || i != getMiPush()) {
            return;
        }
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        f.g("MiPush", "unregisterMiPush");
        try {
            MiPushClient.pausePush(context.getApplicationContext(), null);
            MiPushClient.unregisterPush(context.getApplicationContext());
        } catch (Throwable unused) {
        }
    }

    class a implements LoggerInterface {
        a(MiPushAdapter miPushAdapter) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.h("MiPush", str, th);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
            Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
            f.g("MiPush", str);
        }
    }
}
