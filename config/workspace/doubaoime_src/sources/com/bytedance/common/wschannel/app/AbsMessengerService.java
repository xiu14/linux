package com.bytedance.common.wschannel.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.i;

/* loaded from: classes.dex */
public abstract class AbsMessengerService extends Service implements WeakHandler.IHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4189c = 0;
    private Messenger a;
    protected WeakHandler b;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsMessengerService absMessengerService = AbsMessengerService.this;
            int i = AbsMessengerService.f4189c;
            i.e(absMessengerService.getApplication(), null);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Logger.d("AbsMessengerService", "onBind " + this);
        return this.a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        com.bytedance.common.utility.h.c.b(new a());
        Logger.d("AbsMessengerService", "onCreate " + this);
        this.b = new WeakHandler(this);
        this.a = new Messenger(this.b);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Logger.d("AbsMessengerService", "onUnBind " + this);
        return super.onUnbind(intent);
    }
}
