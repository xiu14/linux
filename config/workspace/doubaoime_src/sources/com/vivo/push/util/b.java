package com.vivo.push.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.security.PublicKey;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class b {
    protected String a;
    protected long b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f8911c;

    /* renamed from: d, reason: collision with root package name */
    protected NotifyArriveCallbackByUser f8912d;

    protected static void a(Intent intent, Context context) {
        try {
            String a = com.vivo.push.g.b.a().a(context).a("com.vivo.pushservice");
            PublicKey a2 = com.vivo.push.g.b.a().a(context).a();
            if (TextUtils.isEmpty(a)) {
                a = "com.vivo.pushservice";
            }
            intent.putExtra("security_avoid_pull_rsa", a);
            intent.putExtra("security_avoid_rsa_public_key", a2 == null ? "com.vivo.pushservice" : ab.a(a2));
        } catch (Exception e2) {
            t.a("BaseNotifyClickIntentParam", "pushNotificationBySystem encrypt ：" + e2.getMessage());
            intent.putExtra("security_avoid_pull_rsa", "com.vivo.pushservice");
            intent.putExtra("security_avoid_rsa_public_key", "com.vivo.pushservice");
        }
    }

    protected abstract int a();

    protected abstract PendingIntent a(Context context, Intent intent);

    protected abstract Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser);

    public final long b() {
        return this.b;
    }

    public final Intent a(Context context, String str, long j, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        this.b = j;
        this.a = str;
        this.f8911c = context;
        this.f8912d = notifyArriveCallbackByUser;
        Intent a = a(context, insideNotificationItem, notifyArriveCallbackByUser);
        int a2 = a();
        if (a2 <= 0) {
            return a;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.heytap.mcssdk.constant.b.f6895c, String.valueOf(this.b));
        String a3 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a3)) {
            hashMap.put("remoteAppId", a3);
        }
        hashMap.put("ap", this.a);
        hashMap.put("clientsdkver", String.valueOf(ah.c(this.f8911c, this.a)));
        f.a(a2, (HashMap<String, String>) hashMap);
        return null;
    }

    public static Intent a(Context context, String str, long j, Intent intent, InsideNotificationItem insideNotificationItem) {
        Intent intent2 = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        intent2.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent2.putExtra("command_type", "reflect_receiver");
        intent2.putExtras(intent.getExtras());
        a(intent2, context);
        com.vivo.push.b.p pVar = new com.vivo.push.b.p(str, j, insideNotificationItem);
        pVar.b(intent.getAction());
        if (intent.getComponent() != null) {
            pVar.c(intent.getComponent().getPackageName());
            pVar.d(intent.getComponent().getClassName());
        }
        if (intent.getData() != null) {
            pVar.a(intent.getData());
        }
        pVar.b(intent2);
        return intent2;
    }
}
