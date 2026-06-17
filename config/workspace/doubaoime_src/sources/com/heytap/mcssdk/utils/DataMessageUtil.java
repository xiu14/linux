package com.heytap.mcssdk.utils;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.MessageConstant;

/* loaded from: classes2.dex */
public class DataMessageUtil {
    private static final String TYPE = "type";

    public void appArrive(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(PushService.getInstance().getReceiveSdkAction(context));
            intent.setPackage(PushService.getInstance().getMcsPackageName(context));
            intent.putExtra(com.heytap.mcssdk.constant.b.f6897e, context.getPackageName());
            intent.putExtra(com.heytap.mcssdk.constant.b.f6895c, str);
            intent.putExtra("type", MessageConstant.CommandId.COMMAND_SEND_INSTANT_ACK);
            context.startService(intent);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("statisticMessage--Exception");
            M.append(e2.getMessage());
            e.e(M.toString());
        }
    }
}
