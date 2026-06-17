package com.bytedance.common.wschannel.client;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.b;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class AbsWsClientService extends Service implements WeakHandler.IHandler, b.a {
    private final Handler a = new WeakHandler(this);
    private final com.bytedance.common.wschannel.client.b b = new com.bytedance.common.wschannel.client.b(this);

    /* renamed from: c, reason: collision with root package name */
    private Messenger f4241c;

    class a implements Runnable {
        final /* synthetic */ Intent a;
        final /* synthetic */ long b;

        a(Intent intent, long j) {
            this.a = intent;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsWsClientService.g(AbsWsClientService.this, this.a, this.b);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Intent a;
        final /* synthetic */ long b;

        b(Intent intent, long j) {
            this.a = intent;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsWsClientService.g(AbsWsClientService.this, this.a, this.b);
        }
    }

    static void g(AbsWsClientService absWsClientService, Intent intent, long j) {
        Objects.requireNonNull(absWsClientService);
        if (intent == null) {
            return;
        }
        absWsClientService.b.a(intent, new com.bytedance.common.wschannel.model.a(j));
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void c(WsChannelMsg wsChannelMsg) {
    }

    @Override // com.bytedance.common.wschannel.client.b.a
    public void f(String str, boolean z) {
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        try {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            if (message == null || message.what != 10123) {
                return;
            }
            Intent intent = (Intent) message.getData().getParcelable(WsConstants.DATA_INTENT);
            if (Logger.debug()) {
                Logger.d("AbsWsClientService", "handleMsg = " + intent);
            }
            if (intent != null) {
                com.bytedance.common.wschannel.e.b().c(new b(intent, elapsedRealtimeNanos));
            } else {
                Logger.e("AbsWsClientService", "handleMsg but intent isnull");
            }
        } catch (Exception e2) {
            Logger.e(e2.toString());
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.f4241c.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4241c = new Messenger(this.a);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (Logger.debug()) {
            Logger.d("AbsWsClientService", "onDestroy");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (Logger.debug()) {
            e.a.a.a.a.I0(e.a.a.a.a.M("onStartCommand intent = "), intent != null ? intent.toString() : "null", "AbsWsClientService");
        }
        com.bytedance.common.wschannel.e.b().c(new a(intent, SystemClock.elapsedRealtimeNanos()));
        return 2;
    }
}
