package com.vivo.push.h;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.NotifyAdapterUtil;
import java.security.PublicKey;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class ab extends com.vivo.push.s {
    protected PushMessageCallback b;

    /* renamed from: c, reason: collision with root package name */
    private int f8821c;

    ab(com.vivo.push.v vVar) {
        super(vVar);
        this.f8821c = 0;
    }

    public final void a(PushMessageCallback pushMessageCallback) {
        this.b = pushMessageCallback;
    }

    public final int b() {
        NotificationManager notificationManager = (NotificationManager) this.a.getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
            return 2104;
        }
        if (notificationManager == null) {
            return 0;
        }
        try {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NotifyAdapterUtil.PRIMARY_CHANNEL);
            if (notificationChannel != null) {
                return notificationChannel.getImportance() == 0 ? 2121 : 0;
            }
            return 0;
        } catch (Exception unused) {
            com.vivo.push.util.t.b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
            return 0;
        }
    }

    public final int c() {
        return this.f8821c;
    }

    public final boolean a(PublicKey publicKey, String str, String str2) {
        if (!com.vivo.push.m.a().d()) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        }
        if (publicKey == null) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify id is null");
            return false;
        }
        try {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
            if (com.vivo.push.util.ab.a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify id is success");
                return true;
            }
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(str));
            com.vivo.push.util.t.c(this.a, "vertify fail srcDigest is ".concat(str));
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify exception");
            return false;
        }
    }

    public final int a(NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        if (notifyArriveCallbackByUser == null) {
            com.vivo.push.util.t.b("OnVerifyCallBackCommand", "pkg name : " + this.a.getPackageName() + " 应用到达回调返回值为空，不做处理");
            com.vivo.push.util.t.b(this.a, "应用到达回调返回值异常，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回正确的对象");
            return 2163;
        }
        if (!notifyArriveCallbackByUser.isIntercept()) {
            return 0;
        }
        com.vivo.push.util.t.b("OnVerifyCallBackCommand", "pkg name : " + this.a.getPackageName() + " 应用主动拦截通知");
        com.vivo.push.util.t.b(this.a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
        return 2120;
    }

    public final HashMap<String, String> a(long j) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(com.heytap.mcssdk.constant.b.f6895c, String.valueOf(j));
        String a = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a)) {
            hashMap.put("remoteAppId", a);
        }
        Context context = this.a;
        hashMap.put("clientsdkver", String.valueOf(com.vivo.push.util.ah.c(context, context.getPackageName())));
        return hashMap;
    }

    public final void a(int i) {
        this.f8821c = i;
    }
}
