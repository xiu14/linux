package com.xiaomi.push.service.receivers;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.bytedance.push.Q.b;
import com.bytedance.push.Q.c;
import com.bytedance.push.g0.f;
import com.bytedance.push.notification.n;
import com.xiaomi.mipush.sdk.CallMessage;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;
import com.xm.MiPushAdapter;
import com.xm.a;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MIPushMessageHandler extends PushMessageReceiver {
    private static final String TAG = "MiPush";

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCallMessage(CallMessage callMessage) {
        super.onCallMessage(callMessage);
        String msgId = callMessage.getMsgId();
        String message = callMessage.getMessage();
        f.g(TAG, "[processCallkitMessage]messageId:" + msgId + " messageData:" + message);
        try {
            JSONObject jSONObject = new JSONObject(message);
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("android_payload"));
            jSONObject2.put("voip_params", jSONObject.optString("voip_params"));
            jSONObject2.put("push_show_type", jSONObject.optInt("push_show_type"));
            ((n) C.z()).i(jSONObject2, MiPushAdapter.getMiPush(), null, false);
        } catch (JSONException e2) {
            e2.printStackTrace();
            ((n) C.z()).h(message, MiPushAdapter.getMiPush(), null);
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        if (context == null || miPushCommandMessage == null) {
            return;
        }
        try {
            String command = miPushCommandMessage.getCommand();
            List<String> commandArguments = miPushCommandMessage.getCommandArguments();
            String str = null;
            String str2 = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
            String str3 = (commandArguments == null || commandArguments.size() <= 1) ? null : commandArguments.get(1);
            Objects.requireNonNull((c) C.x());
            f.g(TAG, "command:" + command);
            if (MiPushClient.COMMAND_REGISTER.equals(command)) {
                if (miPushCommandMessage.getResultCode() == 0) {
                    Objects.requireNonNull((c) C.x());
                    f.c(TAG, "mRegId = " + str2);
                    if (TextUtils.isEmpty(str2)) {
                        C.y().a(MiPushAdapter.getMiPush(), 102, "0", "token is empty");
                    } else {
                        ((H) C.B()).e(context, MiPushAdapter.getMiPush(), str2);
                    }
                } else {
                    C.y().a(MiPushAdapter.getMiPush(), 104, String.valueOf(miPushCommandMessage.getResultCode()), miPushCommandMessage.getReason());
                    ((H) C.B()).d(MiPushAdapter.getMiPush(), String.valueOf(miPushCommandMessage.getResultCode()), miPushCommandMessage.getReason());
                }
            } else if (MiPushClient.COMMAND_SET_ALIAS.equals(command)) {
                if (miPushCommandMessage.getResultCode() == 0) {
                    Objects.requireNonNull((c) C.x());
                    f.c(TAG, "set alias success, mAlias = " + str2);
                }
            } else if (MiPushClient.COMMAND_UNSET_ALIAS.equals(command)) {
                if (miPushCommandMessage.getResultCode() == 0) {
                    Objects.requireNonNull((c) C.x());
                    f.c(TAG, "unSet alias success, mAlias = " + str2);
                }
            } else if (MiPushClient.COMMAND_SUBSCRIBE_TOPIC.equals(command)) {
                if (miPushCommandMessage.getResultCode() == 0) {
                    Objects.requireNonNull((c) C.x());
                    f.c(TAG, "subscribe topic success, mTopic = " + str2);
                }
            } else if (MiPushClient.COMMAND_UNSUBSCRIBE_TOPIC.equals(command)) {
                if (miPushCommandMessage.getResultCode() == 0) {
                    Objects.requireNonNull((c) C.x());
                    f.c(TAG, "unSubscribe topic success, mTopic = " + str2);
                }
            } else if (MiPushClient.COMMAND_SET_ACCEPT_TIME.equals(command) && miPushCommandMessage.getResultCode() == 0) {
                Objects.requireNonNull((c) C.x());
                f.c(TAG, "mStartTime = " + str2 + " mEndTime = " + str3);
            }
            if (miPushCommandMessage.getResultCode() != 0) {
                if (70000002 == miPushCommandMessage.getResultCode()) {
                    str = "push connection certification failed";
                } else if (70000001 == miPushCommandMessage.getResultCode()) {
                    str = "the push connection failed due to network failure";
                } else if (70000004 == miPushCommandMessage.getResultCode()) {
                    str = "push internal status error, please contact developers if you encounter such errors";
                } else if (70000003 == miPushCommandMessage.getResultCode()) {
                    str = "The message format sent by the client to the push channel is invalid";
                }
                if (TextUtils.equals(command, "Registration")) {
                    C.y().a(MiPushAdapter.getMiPush(), 104, String.valueOf(miPushCommandMessage.getResultCode()), str);
                }
                Objects.requireNonNull((c) C.x());
                f.g(TAG, command + " -> " + str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageArrived(context, miPushMessage);
        Objects.requireNonNull((c) C.x());
        f.g(TAG, "onNotificationMessageArrived");
        Objects.requireNonNull(a.a());
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageClicked(context, miPushMessage);
        b x = C.x();
        StringBuilder M = e.a.a.a.a.M("Get MiPush Message ");
        M.append(miPushMessage != null ? miPushMessage.toString() : String.valueOf((char[]) null));
        String sb = M.toString();
        Objects.requireNonNull((c) x);
        f.c(TAG, sb);
        if (context == null || miPushMessage == null) {
            return;
        }
        try {
            String content = miPushMessage.getContent();
            if (TextUtils.isEmpty(content)) {
                return;
            }
            String a = ((H) C.B()).a(MiPushAdapter.getMiPush(), content.getBytes(), true);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(a);
            jSONObject.put("pass_through", miPushMessage.getPassThrough());
            ((H) C.B()).c(context, jSONObject.toString(), MiPushAdapter.getMiPush(), null);
        } catch (Throwable unused) {
        }
    }

    @Override // com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceivePassThroughMessage(context, miPushMessage);
        b x = C.x();
        StringBuilder M = e.a.a.a.a.M("Get MiPush Message ");
        M.append(miPushMessage != null ? miPushMessage.toString() : String.valueOf((char[]) null));
        String sb = M.toString();
        Objects.requireNonNull((c) x);
        f.c(TAG, sb);
        if (context == null || miPushMessage == null) {
            return;
        }
        try {
            String content = miPushMessage.getContent();
            if (TextUtils.isEmpty(content)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(((H) C.B()).a(MiPushAdapter.getMiPush(), content.getBytes(), true));
            jSONObject.put("pass_through", miPushMessage.getPassThrough());
            ((n) C.z()).h(jSONObject.toString(), MiPushAdapter.getMiPush(), null);
        } catch (Throwable th) {
            f.e("", Log.getStackTraceString(th));
        }
    }
}
