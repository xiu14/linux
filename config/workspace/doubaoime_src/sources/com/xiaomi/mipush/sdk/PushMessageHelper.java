package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.xiaomi.push.ih;
import com.xiaomi.push.ix;
import java.util.List;

/* loaded from: classes2.dex */
public class PushMessageHelper {
    public static final String ERROR_MESSAGE = "error_message";
    public static final String ERROR_TYPE = "error_type";
    public static final String ERROR_TYPE_NEED_PERMISSION = "error_lack_of_permission";
    public static final String KEY_COMMAND = "key_command";
    public static final String KEY_MESSAGE = "key_message";
    public static final int MESSAGE_COMMAND = 3;
    public static final int MESSAGE_ERROR = 5;
    public static final int MESSAGE_QUIT = 4;
    public static final int MESSAGE_RAW = 1;
    public static final int MESSAGE_SENDMESSAGE = 2;
    public static final int MESSAGE_THAW_APP = -2000;
    public static final String MESSAGE_TYPE = "message_type";
    public static final int PUSH_MODE_BROADCAST = 2;
    public static final int PUSH_MODE_CALLBACK = 1;
    private static int pushMode;

    public static MiPushCommandMessage generateCommandMessage(String str, List<String> list, long j, String str2, String str3, List<String> list2) {
        MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
        miPushCommandMessage.setCommand(str);
        miPushCommandMessage.setCommandArguments(list);
        miPushCommandMessage.setResultCode(j);
        miPushCommandMessage.setReason(str2);
        miPushCommandMessage.setCategory(str3);
        miPushCommandMessage.setAutoMarkPkgs(list2);
        return miPushCommandMessage;
    }

    public static MiPushMessage generateMessage(ix ixVar, ih ihVar, boolean z) {
        MiPushMessage miPushMessage = new MiPushMessage();
        miPushMessage.setMessageId(ixVar.m597a());
        if (!TextUtils.isEmpty(ixVar.d())) {
            miPushMessage.setMessageType(1);
            miPushMessage.setAlias(ixVar.d());
        } else if (!TextUtils.isEmpty(ixVar.c())) {
            miPushMessage.setMessageType(2);
            miPushMessage.setTopic(ixVar.c());
        } else if (TextUtils.isEmpty(ixVar.f())) {
            miPushMessage.setMessageType(0);
        } else {
            miPushMessage.setMessageType(3);
            miPushMessage.setUserAccount(ixVar.f());
        }
        miPushMessage.setCategory(ixVar.e());
        if (ixVar.a() != null) {
            miPushMessage.setContent(ixVar.a().c());
        }
        if (ihVar != null) {
            if (TextUtils.isEmpty(miPushMessage.getMessageId())) {
                miPushMessage.setMessageId(ihVar.m524a());
            }
            if (TextUtils.isEmpty(miPushMessage.getTopic())) {
                miPushMessage.setTopic(ihVar.m529b());
            }
            miPushMessage.setDescription(ihVar.d());
            miPushMessage.setTitle(ihVar.m532c());
            miPushMessage.setNotifyType(ihVar.a());
            miPushMessage.setNotifyId(ihVar.c());
            miPushMessage.setPassThrough(ihVar.b());
            miPushMessage.setExtra(ihVar.m525a());
        }
        miPushMessage.setNotified(z);
        return miPushMessage;
    }

    public static int getPushMode(Context context) {
        if (pushMode == 0) {
            if (isUseCallbackPushMode(context)) {
                setPushMode(1);
            } else {
                setPushMode(2);
            }
        }
        return pushMode;
    }

    private static boolean isIntentAvailable(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                if (!queryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isUseCallbackPushMode(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setClassName(context.getPackageName(), "com.xiaomi.mipush.sdk.PushServiceReceiver");
        return isIntentAvailable(context, intent);
    }

    public static void sendCommandMessageBroadcast(Context context, MiPushCommandMessage miPushCommandMessage) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 3);
        intent.putExtra(KEY_COMMAND, miPushCommandMessage);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendQuitMessageBroadcast(Context context) {
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("message_type", 4);
        new PushServiceReceiver().onReceive(context, intent);
    }

    public static void sendThawAppBroadcast(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("context|packageName must not be null when send thaw app broadcast");
            return;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(str);
        intent.putExtra("message_type", MESSAGE_THAW_APP);
        context.sendBroadcast(intent, str + ".permission.MIPUSH_RECEIVE");
    }

    private static void setPushMode(int i) {
        pushMode = i;
    }

    public static ih generateMessage(MiPushMessage miPushMessage) {
        ih ihVar = new ih();
        ihVar.a(miPushMessage.getMessageId());
        ihVar.b(miPushMessage.getTopic());
        ihVar.d(miPushMessage.getDescription());
        ihVar.c(miPushMessage.getTitle());
        ihVar.c(miPushMessage.getNotifyId());
        ihVar.a(miPushMessage.getNotifyType());
        ihVar.b(miPushMessage.getPassThrough());
        ihVar.a(miPushMessage.getExtra());
        return ihVar;
    }
}
