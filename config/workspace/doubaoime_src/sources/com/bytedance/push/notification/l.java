package com.bytedance.push.notification;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.push.C;
import com.bytedance.push.C0679c;
import com.bytedance.push.interfaze.u;
import com.bytedance.push.notification.h;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l implements com.bytedance.push.interfaze.i {
    private final u a;

    class a implements Runnable {
        final /* synthetic */ C0679c.C0293c a;
        final /* synthetic */ Context b;

        a(l lVar, C0679c.C0293c c0293c, Context context) {
            this.a = c0293c;
            this.b = context;
        }

        @Override // java.lang.Runnable
        @TargetApi(26)
        public void run() {
            C0679c.C0293c c0293c = this.a;
            String string = this.b.getString(C0838R.string.push_notification_channel_name);
            if (c0293c == null) {
                c0293c = new C0679c.C0293c(PullConfiguration.PROCESS_NAME_PUSH, string);
            } else {
                if (!((TextUtils.isEmpty(c0293c.b) || TextUtils.isEmpty(c0293c.a)) ? false : true)) {
                    if (TextUtils.isEmpty(c0293c.b)) {
                        c0293c.b = PullConfiguration.PROCESS_NAME_PUSH;
                    }
                    if (TextUtils.isEmpty(c0293c.a)) {
                        c0293c.a = string;
                    }
                }
            }
            String str = c0293c.b;
            String str2 = c0293c.a;
            NotificationManager notificationManager = (NotificationManager) this.b.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager != null && notificationManager.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
                notificationChannel.setShowBadge(true);
                notificationChannel.enableVibration(true);
                notificationChannel.enableLights(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    public l(u uVar) {
        this.a = uVar;
    }

    static void a(l lVar, Context context, boolean z) {
        Objects.requireNonNull(lVar);
        JSONObject jSONObject = new JSONObject();
        String str = "open";
        try {
            jSONObject.put("in_status", z ? "open" : "close");
            if (1 != com.ss.android.message.f.a.d(context)) {
                str = "close";
            }
            jSONObject.put("out_status", str);
        } catch (Throwable unused) {
        }
        ((C) lVar.a).d().m.onEventV3("ttpush_push_notification_status", jSONObject);
    }

    public static boolean b(Context context, String str) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            if (notificationManager != null && !TextUtils.isEmpty(str)) {
                return notificationManager.getNotificationChannel(str) != null;
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public void c(Context context, List<com.bytedance.push.R.d> list) {
        NotificationManager a2;
        if (com.bytedance.android.input.k.b.a.Z(list)) {
            return;
        }
        for (com.bytedance.push.R.d dVar : list) {
            if (dVar != null) {
                try {
                    if (dVar.i()) {
                        ((h.d) h.a()).b(context, dVar);
                    } else if (!TextUtils.equals(dVar.d(), PullConfiguration.PROCESS_NAME_PUSH) && (a2 = ((h.d) h.a()).a(context)) != null && !TextUtils.isEmpty(dVar.d()) && a2.getNotificationChannel(dVar.d()) != null) {
                        a2.deleteNotificationChannel(dVar.d());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void d(Context context) {
        if (context == null || b(context, PullConfiguration.PROCESS_NAME_PUSH)) {
            return;
        }
        com.bytedance.common.push.d.b(new a(this, null, context));
    }

    public void e(Context context, C0679c.C0293c c0293c) {
        if (context == null) {
            return;
        }
        com.bytedance.common.push.d.b(new a(this, c0293c, context));
    }

    public void f(Context context, boolean z) {
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) com.bytedance.push.settings.h.b(context, LocalFrequencySettings.class);
        if (!NetworkUtils.h(context)) {
            localFrequencySettings.c(false);
            return;
        }
        t tVar = new t(context, this.a, z, null);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.bytedance.common.push.d.b(tVar);
        } else {
            tVar.run();
        }
    }

    public void g(Context context, boolean z, String str) {
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) com.bytedance.push.settings.h.b(context, LocalFrequencySettings.class);
        if (!NetworkUtils.h(context)) {
            localFrequencySettings.e(false);
            return;
        }
        t tVar = new t(context, this.a, z, null, str);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            com.bytedance.common.push.d.b(tVar);
        } else {
            tVar.run();
        }
    }

    public void h(Context context) {
        com.bytedance.push.g0.f.c("NoticeStateSync", "[trySyncNoticeStateOnce]");
        if (com.ss.android.pushmanager.setting.c.c().e().O()) {
            com.bytedance.common.push.d.b(new k(this, context, ""));
        }
    }

    public void i(Context context, String str) {
        com.bytedance.push.g0.f.c("NoticeStateSync", "[trySyncNoticeStateOnce]");
        if (com.ss.android.pushmanager.setting.c.c().e().O()) {
            com.bytedance.common.push.d.b(new k(this, context, str));
        }
    }
}
