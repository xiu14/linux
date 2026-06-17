package com.bytedance.push.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.notification.IPushNotification;
import com.bytedance.android.service.manager.push.notification.NotificationBody;
import com.bytedance.push.A;
import com.bytedance.push.C;
import com.bytedance.push.C0678b;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.IPushService;
import com.bytedance.push.interfaze.InterfaceC0689d;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class a {
    protected final InterfaceC0689d a;
    protected final AsyncImageDownloadWrapper b;

    public a(InterfaceC0689d interfaceC0689d, AsyncImageDownloadWrapper asyncImageDownloadWrapper) {
        this.a = interfaceC0689d;
        this.b = asyncImageDownloadWrapper;
    }

    private void c(Context context, Intent intent, int i, PushBody pushBody) {
        Bitmap downloadImage = !TextUtils.isEmpty(pushBody.n) ? this.b.downloadImage(new com.bytedance.push.O.c(Uri.parse(pushBody.n), 0, 0, null)) : null;
        InterfaceC0689d interfaceC0689d = this.a;
        Notification b = interfaceC0689d != null ? interfaceC0689d.b(context, i, pushBody, downloadImage) : null;
        NotificationBody a = pushBody.a();
        IPushNotification buildNotification = PushServiceManager.get().getIPushNotificationService().buildNotification(context, intent, a, b);
        if (buildNotification != null) {
            IPushService a2 = C0678b.a();
            long j = a.id;
            Objects.requireNonNull((A) a2);
            PendingIntent notificationDeleteIntent = PushServiceManager.get().getIPushNotificationService().getNotificationDeleteIntent(j, null);
            if (notificationDeleteIntent != null) {
                buildNotification.getNotification().deleteIntent = notificationDeleteIntent;
            }
            buildNotification.show();
        }
    }

    public abstract Intent a(Context context, int i, PushBody pushBody);

    void b(Context context, int i, PushBody pushBody, boolean z, long j) {
        Objects.requireNonNull((com.bytedance.push.Q.c) C.x());
        com.bytedance.push.g0.f.c("Show", "show message :" + pushBody);
        boolean z2 = pushBody.j;
        Intent a = a(context, i, pushBody);
        try {
            if (z2) {
                c(context, a, i, pushBody);
            } else {
                context.startActivity(a);
            }
        } catch (Exception e2) {
            com.bytedance.push.g0.f.f("AbsPushReceiveHandler", "error when show notification ", e2);
            e2.printStackTrace();
        }
    }
}
