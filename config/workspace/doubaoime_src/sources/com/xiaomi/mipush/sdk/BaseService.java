package com.xiaomi.mipush.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class BaseService extends Service {
    private a mHandler;

    public static class a extends Handler {
        private WeakReference<BaseService> a;

        public a(WeakReference<BaseService> weakReference) {
            this.a = weakReference;
        }

        public void a() {
            if (hasMessages(1001)) {
                removeMessages(1001);
            }
            sendEmptyMessageDelayed(1001, 1000L);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<BaseService> weakReference;
            BaseService baseService;
            if (message.what != 1001 || (weakReference = this.a) == null || (baseService = weakReference.get()) == null) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("TimeoutHandler ");
            M.append(baseService.toString());
            M.append(" kill self");
            com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            if (!baseService.hasJob()) {
                baseService.stopSelf();
            } else {
                com.xiaomi.channel.commonutils.logger.c.c("TimeoutHandler has job");
                sendEmptyMessageDelayed(1001, 1000L);
            }
        }
    }

    protected abstract boolean hasJob();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        if (this.mHandler == null) {
            this.mHandler = new a(new WeakReference(this));
        }
        this.mHandler.a();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (com.xiaomi.push.k.m655a((Context) this)) {
            return onStartCommand;
        }
        return 2;
    }
}
