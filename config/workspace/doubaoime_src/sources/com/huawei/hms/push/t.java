package com.huawei.hms.push;

import android.content.Context;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import com.huawei.hms.push.utils.PluginUtil;
import com.huawei.hms.support.log.HMSLog;
import com.vivo.push.PushClient;

/* loaded from: classes2.dex */
public class t {
    public static void a(Context context, Intent intent) {
        try {
            if (context == null || intent == null) {
                HMSLog.d("PushSelfShowLog", "enter SelfShowReceiver receiver, context or intent is null");
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.intent.action.PUSH".equals(action) || "com.huawei.push.msg.NOTIFY_MSG".equals(action) || "com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action)) {
                byte[] byteArrayExtra = intent.getByteArrayExtra("selfshow_info");
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("selfshow_token");
                if (byteArrayExtra != null && byteArrayExtra2 != null && byteArrayExtra.length != 0 && byteArrayExtra2.length != 0) {
                    a(context, intent, byteArrayExtra, byteArrayExtra2);
                    return;
                }
                HMSLog.i("PushSelfShowLog", "self show info or token is null.");
            }
        } catch (RuntimeException e2) {
            HMSLog.e("PushSelfShowLog", "onReceive RuntimeException.", e2);
        } catch (Exception unused) {
            HMSLog.d("PushSelfShowLog", "onReceive Exception.");
        }
    }

    private static void a(Context context, Intent intent, byte[] bArr, byte[] bArr2) {
        String stringExtra = intent.getStringExtra("selfshow_event_id");
        int intExtra = intent.getIntExtra("selfshow_notify_id", 0);
        HMSLog.i("PushSelfShowLog", "get notifyId:" + intExtra);
        o oVar = new o(bArr, bArr2);
        if (!oVar.y()) {
            HMSLog.d("PushSelfShowLog", "parseMessage failed");
            return;
        }
        StringBuilder M = e.a.a.a.a.M("onReceive the msg id = ");
        M.append(oVar.o());
        M.append(",and cmd is ");
        M.append(oVar.h());
        M.append(",and the eventId is ");
        M.append(stringExtra);
        HMSLog.i("PushSelfShowLog", M.toString());
        if (stringExtra == null) {
            a(context, intent, oVar);
        } else {
            a(context, intent, stringExtra, oVar, intExtra);
        }
    }

    private static void a(Context context, Intent intent, o oVar) {
        StringBuilder M = e.a.a.a.a.M("receive a selfshow message, the cmd type is ");
        M.append(oVar.h());
        HMSLog.i("PushSelfShowLog", M.toString());
        if (u.a(oVar.h())) {
            new p(context, oVar).start();
        }
    }

    private static void a(Context context, Intent intent, String str, o oVar, int i) {
        HMSLog.d("PushSelfShowLog", "receive a selfshow user handle message eventId = " + str);
        if (PushClient.DEFAULT_REQUEST_ID.equals(str)) {
            new u(context, oVar).c();
            PluginUtil.onNotificationClicked(context, oVar.o(), oVar.b());
        } else if (ExifInterface.GPS_MEASUREMENT_2D.equals(str)) {
            l.a(context, oVar.o(), oVar.b(), ExifInterface.GPS_MEASUREMENT_2D);
        } else {
            HMSLog.d("PushSelfShowLog", "other event");
        }
    }
}
