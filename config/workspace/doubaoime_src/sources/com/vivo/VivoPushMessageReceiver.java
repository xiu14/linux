package com.vivo;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.bytedance.push.Q.b;
import com.bytedance.push.Q.c;
import com.bytedance.push.g0.f;
import com.bytedance.push.notification.n;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import com.vv.VvPushAdapter;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class VivoPushMessageReceiver extends OpenClientPushMessageReceiver {
    private final Handler a = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;

        a(VivoPushMessageReceiver vivoPushMessageReceiver, String str, Context context) {
            this.a = str;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            b x = C.x();
            StringBuilder M = e.a.a.a.a.M("onReceiveRegId token = ");
            M.append(this.a);
            String sb = M.toString();
            Objects.requireNonNull((c) x);
            f.g("VivoPushMessageReceiver", sb);
            VvPushAdapter.sendToken(this.b, this.a);
        }
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
        if (context == null || uPSNotificationMessage == null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("onNotificationMessageClicked: message = ");
        M.append(uPSNotificationMessage.getSkipContent());
        Logger.i("VivoPushMessageReceiver", M.toString());
        try {
            String skipContent = uPSNotificationMessage.getSkipContent();
            if (TextUtils.isEmpty(skipContent)) {
                return;
            }
            String a2 = ((H) C.B()).a(VvPushAdapter.getVvPush(), skipContent.getBytes(), true);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a2);
            jSONObject.put("pass_through", 0);
            ((H) C.B()).c(context, jSONObject.toString(), VvPushAdapter.getVvPush(), null);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onNotifyGuideDialogResult(int i) {
        super.onNotifyGuideDialogResult(i);
        com.vv.c.b.a(i);
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        this.a.post(new a(this, str, context));
    }

    @Override // com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.BasePushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage) {
        super.onTransmissionMessage(context, unvarnishedMessage);
        f.g("VivoPushMessageReceiver", "onMessageReceived is called");
        String message = unvarnishedMessage.getMessage();
        f.g("VivoPushMessageReceiver", "get message: " + message);
        if (TextUtils.isEmpty(message)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(message);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("android_payload"));
            jSONObject2.put("voip_params", jSONObject.optString("voip_params"));
            jSONObject2.put("push_show_type", jSONObject.optInt("push_show_type"));
            ((n) C.z()).i(jSONObject2, VvPushAdapter.getVvPush(), null, false);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
