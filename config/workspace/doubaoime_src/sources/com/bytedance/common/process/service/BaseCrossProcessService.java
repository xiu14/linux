package com.bytedance.common.process.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.common.d.a.b;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.push.g0.f;
import com.ss.android.f.a;
import java.util.List;

/* loaded from: classes.dex */
public class BaseCrossProcessService extends Service {
    private Context a = this;
    private final a.AbstractBinderC0372a b = new a();

    class a extends a.AbstractBinderC0372a {
        a() {
        }

        @Override // com.ss.android.f.a
        public String h0(String str, String str2, List list) throws RemoteException {
            f.c("BaseCrossProcessService", com.ss.android.message.f.a.g(BaseCrossProcessService.this.a) + " process method " + str + "is called");
            return b.m().o(ProcessEnum.parseProcess(str2), str, list);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        ProcessEnum g2 = com.ss.android.message.f.a.g(this.a);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("process");
            if (!extras.getBoolean("is_from_on_bind")) {
                f.c("BaseCrossProcessService", g2 + " process service is called by " + string);
                com.ss.android.message.a.b(getApplication());
                b.m().p(string);
            }
        }
        return this.b;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }
}
