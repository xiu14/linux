package com.heytap.msp.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.c;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.DataMessage;

/* loaded from: classes2.dex */
public class DataMessageCallbackService extends Service implements IDataMessageCallBackService {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        i.a(new Runnable() { // from class: com.heytap.msp.push.service.DataMessageCallbackService.1
            @Override // java.lang.Runnable
            public void run() {
                PushService.getInstance().innerInit(DataMessageCallbackService.this.getApplicationContext());
                c.a(DataMessageCallbackService.this.getApplicationContext(), intent, (IDataMessageCallBackService) DataMessageCallbackService.this);
            }
        });
        return 2;
    }

    @Override // com.heytap.msp.push.callback.IDataMessageCallBackService
    public void processMessage(Context context, DataMessage dataMessage) {
        StringBuilder M = e.a.a.a.a.M("DataMessage received! id = ");
        M.append(dataMessage.getMessageID());
        e.b(M.toString());
    }
}
