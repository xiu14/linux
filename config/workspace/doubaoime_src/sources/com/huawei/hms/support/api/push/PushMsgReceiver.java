package com.huawei.hms.support.api.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.push.i;
import com.huawei.hms.push.t;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class PushMsgReceiver extends BroadcastReceiver {
    private static void a(Context context, Intent intent) {
        if (intent.hasExtra("selfshow_info")) {
            if (!i.a(context)) {
                HMSLog.i("PushMsgReceiver", context.getPackageName() + " disable display notification.");
                if (!intent.hasExtra("selfshow_event_id")) {
                    return;
                }
            }
            t.a(context, intent);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        StringBuilder M = a.M("push receive broadcast message, Intent:");
        M.append(intent.getAction());
        M.append(" pkgName:");
        M.append(context.getPackageName());
        HMSLog.i("PushMsgReceiver", M.toString());
        try {
            intent.getStringExtra("TestIntent");
            String action = intent.getAction();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            if ("com.huawei.intent.action.PUSH_DELAY_NOTIFY".equals(action) || ("com.huawei.intent.action.PUSH".equals(action) && HwBuildEx.VERSION.EMUI_SDK_INT < 10)) {
                a(context, intent);
            } else {
                HMSLog.i("PushMsgReceiver", "message can't be recognised.");
            }
        } catch (Exception unused) {
            HMSLog.e("PushMsgReceiver", "intent has some error");
        }
    }
}
