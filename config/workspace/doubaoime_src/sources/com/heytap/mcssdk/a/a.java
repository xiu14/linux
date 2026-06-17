package com.heytap.mcssdk.a;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.heytap.mcssdk.R;
import com.heytap.mcssdk.utils.g;
import com.heytap.mcssdk.utils.i;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* loaded from: classes2.dex */
public class a {
    public static final String a = "Heytap PUSH";
    private static final String b = "System Default Channel";

    /* renamed from: c, reason: collision with root package name */
    private static final int f6874c = 3;

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(26)
    public boolean a(Context context, String str, String str2, int i) {
        NotificationManager notificationManager;
        if (context == null || (notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)) == null) {
            return false;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, i));
        return true;
    }

    public void a(final Context context) {
        i.a(new Runnable() { // from class: com.heytap.mcssdk.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (g.f().a()) {
                    return;
                }
                String string = context.getString(R.string.system_default_channel);
                if (TextUtils.isEmpty(string)) {
                    string = a.b;
                }
                g.f().a(a.this.a(context, a.a, string, 3));
            }
        });
    }
}
