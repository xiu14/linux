package com.bytedance.common.wschannel.server;

import android.content.Intent;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.app.AbsMessengerService;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Objects;

/* loaded from: classes.dex */
public class WsChannelService extends AbsMessengerService {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4310d = 0;

    class a implements Runnable {
        final /* synthetic */ Intent a;

        a(Intent intent) {
            this.a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            WsChannelService wsChannelService = WsChannelService.this;
            Intent intent = this.a;
            int i = WsChannelService.f4310d;
            Objects.requireNonNull(wsChannelService);
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (WsConstants.APP_STATE_ACTION.equals(action)) {
                int intExtra = intent.getIntExtra(WsConstants.KEY_APP_STATE, -1);
                Message message = new Message();
                message.what = 2;
                message.arg1 = intExtra;
                wsChannelService.handleMsg(message);
                return;
            }
            if (!WsConstants.NETWORK_STATE_ACTION.equals(action)) {
                if (WsConstants.MEM_TRIM_ACTION.equals(action)) {
                    intent.getIntExtra(WsConstants.KEY_MEM_TRIM, -1);
                    int i2 = com.bytedance.common.wschannel.i.h;
                    return;
                }
                return;
            }
            int intExtra2 = intent.getIntExtra(WsConstants.KEY_NETWORK_STATE, -1);
            Message message2 = new Message();
            message2.what = 3;
            message2.arg1 = intExtra2;
            wsChannelService.handleMsg(message2);
        }
    }

    static int a(IWsApp iWsApp) {
        if (iWsApp == null) {
            return Integer.MIN_VALUE;
        }
        return iWsApp.l();
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        if (Logger.debug()) {
            e.a.a.a.a.D0(e.a.a.a.a.M("handleMsg msg.what = "), message.what, "WsChannelService");
        }
        g.e(this).handleMsg(message);
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service
    public void onCreate() {
        if (Logger.debug()) {
            Logger.d("WsChannelService", "onCreate");
        }
        super.onCreate();
    }

    @Override // com.bytedance.common.wschannel.app.AbsMessengerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (Logger.debug()) {
            Logger.d("WsChannelService", "onStartCommand");
        }
        com.bytedance.common.utility.h.c.b(new a(intent));
        return 2;
    }

    static class b {
        final int a;
        final byte[] b;

        /* renamed from: c, reason: collision with root package name */
        final long f4311c;

        /* renamed from: d, reason: collision with root package name */
        final WsChannelMsg f4312d;

        b(int i, byte[] bArr, long j) {
            this.a = i;
            this.b = bArr;
            this.f4311c = j;
            this.f4312d = null;
        }

        b(int i, WsChannelMsg wsChannelMsg, long j) {
            this.a = i;
            this.f4312d = wsChannelMsg;
            this.f4311c = j;
            this.b = null;
        }
    }
}
