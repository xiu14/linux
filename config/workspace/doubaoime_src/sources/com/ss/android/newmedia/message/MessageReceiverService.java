package com.ss.android.newmedia.message;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.PowerManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.C;
import com.bytedance.push.g0.f;
import com.bytedance.push.notification.n;
import com.ss.android.message.e;
import com.ss.android.pushmanager.setting.c;

/* loaded from: classes2.dex */
public class MessageReceiverService extends IntentService implements WeakHandler.IHandler {
    private WeakHandler a;
    private Messenger b;

    class a implements Runnable {
        final /* synthetic */ Intent a;
        final /* synthetic */ int b;

        a(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MessageReceiverService.this.onHandleIntent(this.a);
                MessageReceiverService.this.stopSelf(this.b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ Intent a;

        b(Intent intent) {
            this.a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            MessageReceiverService.this.onHandleIntent(this.a);
            MessageReceiverService.this.stopSelf();
        }
    }

    public MessageReceiverService() {
        super("MessageReceiverService");
    }

    private void b() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (c.c().g().s()) {
            boolean isInteractive = powerManager.isInteractive();
            f.c("MessageReceiverService", "tryWakeupScreen isScreenOn = " + isInteractive);
            if (isInteractive) {
                return;
            }
            powerManager.newWakeLock(268435462, "MessageReceiverService").acquire(c.c().g().S());
        }
    }

    protected void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (action != null) {
            f.c("MessageReceiverService", "action = " + action);
        }
        if (!c.c().i()) {
            StringBuilder M = e.a.a.a.a.M("notify enable = ");
            M.append(c.c().i());
            f.g("MessageReceiverService", M.toString());
            return;
        }
        try {
            if ("com.ss.android.message".equals(action)) {
                String stringExtra = !"com.ss.android.message".equals(intent.getAction()) ? null : intent.getStringExtra("message_data");
                if (com.bytedance.android.input.k.b.a.Y(stringExtra)) {
                    return;
                }
                f.c("MessageReceiverService", "message received, msg is: " + stringExtra);
                ((n) C.z()).h(stringExtra, 2, null);
                b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // android.app.IntentService, android.app.Service
    public IBinder onBind(Intent intent) {
        f.c("MessageReceiverService", "onBind");
        if (intent != null) {
            e.e().f(new b(intent), 0L);
        }
        if (this.b == null) {
            this.a = new WeakHandler(this);
            this.b = new Messenger(this.a);
        }
        return this.b.getBinder();
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        try {
            a(this, intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0046 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047 A[RETURN] */
    @Override // android.app.IntentService, android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onStartCommand(android.content.Intent r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 2
            int r5 = super.onStartCommand(r5, r6, r7)     // Catch: java.lang.Throwable -> L6 java.lang.NullPointerException -> Lb
            goto L38
        L6:
            r5 = move-exception
            r5.printStackTrace()
            goto L37
        Lb:
            r6 = move-exception
            r6.printStackTrace()
            java.lang.Class<android.app.IntentService> r6 = android.app.IntentService.class
            java.lang.String r1 = "mServiceHandler"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r1)     // Catch: java.lang.Exception -> L22
            r1 = 1
            r6.setAccessible(r1)     // Catch: java.lang.Exception -> L22
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Exception -> L22
            android.os.Handler r6 = (android.os.Handler) r6     // Catch: java.lang.Exception -> L22
            goto L27
        L22:
            r6 = move-exception
            r6.printStackTrace()
            r6 = 0
        L27:
            if (r6 != 0) goto L37
            com.ss.android.message.e r6 = com.ss.android.message.e.e()
            com.ss.android.newmedia.message.MessageReceiverService$a r1 = new com.ss.android.newmedia.message.MessageReceiverService$a
            r1.<init>(r5, r7)
            r2 = 0
            r6.f(r1, r2)
        L37:
            r5 = r0
        L38:
            java.lang.Class<com.ss.android.g.e.b> r6 = com.ss.android.g.e.b.class
            com.ss.android.ug.bus.a r6 = com.ss.android.ug.bus.b.a(r6)
            com.ss.android.g.e.b r6 = (com.ss.android.g.e.b) r6
            boolean r6 = r6.b()
            if (r6 == 0) goto L47
            return r0
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.message.MessageReceiverService.onStartCommand(android.content.Intent, int, int):int");
    }
}
