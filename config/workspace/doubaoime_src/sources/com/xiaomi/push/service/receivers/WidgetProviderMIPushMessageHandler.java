package com.xiaomi.push.service.receivers;

import android.content.Context;
import com.bytedance.push.C;
import com.bytedance.push.Q.c;
import com.bytedance.push.g0.f;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.util.Objects;

/* loaded from: classes2.dex */
public class WidgetProviderMIPushMessageHandler extends MIPushMessageHandler {
    @Override // com.xiaomi.push.service.receivers.MIPushMessageHandler, com.xiaomi.mipush.sdk.PushMessageReceiver
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        Objects.requireNonNull((c) C.x());
        f.g("MiPush", "onCommandResult on widgetProvider");
        super.onCommandResult(context, miPushCommandMessage);
    }
}
