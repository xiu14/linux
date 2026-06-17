package com.huawei.c.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
final class a extends Handler {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(b bVar, Looper looper) {
        super(looper);
        this.a = bVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            b.a(this.a);
            return;
        }
        if (i != 2) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof com.huawei.devices.utils.b) {
            Objects.requireNonNull(this.a);
            Log.i("HapticsKit", "onEventFunc");
            com.huawei.devices.utils.a.c((com.huawei.devices.utils.b) obj);
        }
    }
}
