package com.bytedance.push.notification;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.C;
import com.bytedance.push.PushBody;
import com.bytedance.push.interfaze.InterfaceC0689d;
import com.bytedance.push.settings.PushOnlineSettings;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class q extends a {

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.push.interfaze.m f5789c;

    /* renamed from: d, reason: collision with root package name */
    private final f f5790d;

    public q(InterfaceC0689d interfaceC0689d, com.bytedance.push.interfaze.m mVar, com.bytedance.push.O.a aVar) {
        super(interfaceC0689d, new AsyncImageDownloadWrapper(aVar));
        this.f5789c = mVar;
        this.f5790d = new f(mVar);
        PushServiceManager.get().getIPushNotificationService().setAsyncImageDownloader(this.b);
    }

    @Override // com.bytedance.push.notification.a
    public Intent a(Context context, int i, PushBody pushBody) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) (((PushOnlineSettings) com.bytedance.push.settings.h.b(context.getApplicationContext(), PushOnlineSettings.class)).t() ? PassThoughActivity.class : PushActivity.class));
        JSONObject jSONObject = pushBody.k;
        intent.putExtra("push_body", jSONObject != null ? jSONObject.toString() : null);
        intent.putExtra("from_notification", true);
        intent.putExtra("message_from", i);
        intent.addFlags(268435456);
        return intent;
    }

    @Override // com.bytedance.push.notification.a
    void b(Context context, int i, PushBody pushBody, boolean z, long j) {
        boolean d2 = this.f5790d.d(context, i, pushBody);
        if (!d2) {
            ((com.bytedance.push.X.a) ((C) C.a()).q()).c(pushBody.x);
            if (PushServiceManager.get().getIPushNotificationService().tryShowPushNotification(context, a(context, i, pushBody), pushBody.a())) {
                return;
            }
        }
        PushServiceManager.get().getPushExternalService().getPushSdkMonitorService().onMessageShow(pushBody.b, j);
        com.bytedance.push.interfaze.m mVar = this.f5789c;
        if (mVar != null && !d2 && !z) {
            d2 = mVar.a(context, i, pushBody);
        }
        if (d2) {
            return;
        }
        super.b(context, i, pushBody, z, j);
    }
}
