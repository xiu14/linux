package com.vivo;

import android.content.Context;
import com.bytedance.push.C;
import com.bytedance.push.Q.b;
import com.bytedance.push.Q.c;
import com.bytedance.push.g0.f;
import e.a.a.a.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public class SmpVivoPushMessageReceiver extends VivoPushMessageReceiver {
    @Override // com.vivo.VivoPushMessageReceiver, com.vivo.push.sdk.OpenClientPushMessageReceiver, com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        b x = C.x();
        String s = a.s("SmpVivoPushMessageReceiver#onReceiveRegId token = ", str);
        Objects.requireNonNull((c) x);
        f.g("VivoPushMessageReceiver", s);
        super.onReceiveRegId(context, str);
    }
}
