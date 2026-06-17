package com.ss.android.message;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes2.dex */
public class SelfPushMessageHandler extends Service {
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (((com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class)).b()) {
            return 2;
        }
        return onStartCommand;
    }
}
