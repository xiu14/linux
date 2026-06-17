package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;

/* loaded from: classes2.dex */
public class c {
    public static void a(Context context, Intent intent, IDataMessageCallBackService iDataMessageCallBackService) {
        if (a(context, intent, (Object) iDataMessageCallBackService)) {
            return;
        }
        List<BaseMode> a = d.a(context, intent, PushService.getInstance().getParsers());
        if (a == null || a.isEmpty()) {
            e.b("Empty message after parsing intent.");
            return;
        }
        for (BaseMode baseMode : a) {
            if (baseMode != null) {
                for (com.heytap.mcssdk.e.c cVar : PushService.getInstance().getProcessors()) {
                    if (cVar != null) {
                        cVar.a(context, intent, baseMode, iDataMessageCallBackService);
                    }
                }
            }
        }
    }

    private static boolean a(Context context, Intent intent, Object obj) {
        String str;
        if (context == null) {
            str = "context is null , please check param of parseIntent()";
        } else if (intent == null) {
            str = "intent is null , please check param of parseIntent()";
        } else if (obj == null) {
            str = "callback is null , please check param of parseIntent()";
        } else {
            if (Utils.isSupportPushByClient(context)) {
                return false;
            }
            str = "push is null ,please check system has push";
        }
        e.e(str);
        return true;
    }
}
