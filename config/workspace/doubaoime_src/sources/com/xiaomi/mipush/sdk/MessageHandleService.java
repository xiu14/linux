package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.heytap.msp.push.callback.INotificationPermissionCallback;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.ah;
import com.xiaomi.push.eo;
import com.xiaomi.push.fs;
import com.xiaomi.push.service.ac;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class MessageHandleService extends BaseService {
    private static ConcurrentLinkedQueue<a> a = new ConcurrentLinkedQueue<>();

    /* renamed from: a, reason: collision with other field name */
    private static ExecutorService f28a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static class a {
        private Intent a;

        /* renamed from: a, reason: collision with other field name */
        private PushMessageReceiver f30a;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f30a = pushMessageReceiver;
            this.a = intent;
        }

        /* renamed from: a, reason: collision with other method in class */
        public PushMessageReceiver m35a() {
            return this.f30a;
        }

        public Intent a() {
            return this.a;
        }
    }

    public static void addJob(Context context, a aVar) {
        if (aVar != null) {
            a.add(aVar);
            b(context);
            startService(context);
        }
    }

    private static void b(final Context context) {
        if (f28a.isShutdown()) {
            return;
        }
        f28a.execute(new Runnable() { // from class: com.xiaomi.mipush.sdk.MessageHandleService.2
            @Override // java.lang.Runnable
            public void run() {
                MessageHandleService.c(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        try {
            a(context, a.poll());
        } catch (RuntimeException e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
        }
    }

    public static void startService(final Context context) {
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        ah.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MessageHandleService.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    context.startService(intent);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.c.m15a(e2.getMessage());
                }
            }
        });
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    protected boolean hasJob() {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    private static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        try {
            if (context == null || miPushCommandMessage == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("service or message is empty when sending register success event");
                return;
            }
            if (miPushCommandMessage.getResultCode() != 0) {
                com.xiaomi.channel.commonutils.logger.c.m15a("do not  send register success event, because result code is not success.");
                return;
            }
            if (!TextUtils.equals(fs.COMMAND_REGISTER.f436a, miPushCommandMessage.getCommand())) {
                com.xiaomi.channel.commonutils.logger.c.m15a("do not  send register success event, because command is not register command.");
                return;
            }
            List<String> commandArguments = miPushCommandMessage.getCommandArguments();
            String str = (commandArguments == null || commandArguments.size() <= 0) ? null : commandArguments.get(0);
            if (TextUtils.isEmpty(str)) {
                com.xiaomi.channel.commonutils.logger.c.m15a("do not  send register success event, because token is empty.");
                return;
            }
            Intent intent = new Intent("com.xiaomi.mipush.MESSAGING_EVENT");
            intent.putExtra("token", str);
            intent.setPackage(context.getPackageName());
            context.startService(intent);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d("error occurred when sending register success event. exception:" + th);
        }
    }

    protected static void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        b(context);
    }

    static void a(Context context, a aVar) {
        String[] stringArrayExtra;
        if (aVar == null) {
            return;
        }
        try {
            PushMessageReceiver m35a = aVar.m35a();
            Intent a2 = aVar.a();
            int intExtra = a2.getIntExtra("message_type", 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && PushMessageHelper.ERROR_TYPE_NEED_PERMISSION.equals(a2.getStringExtra(PushMessageHelper.ERROR_TYPE)) && (stringArrayExtra = a2.getStringArrayExtra(PushMessageHelper.ERROR_MESSAGE)) != null) {
                        com.xiaomi.channel.commonutils.logger.c.e("begin execute onRequirePermissions, lack of necessary permissions");
                        m35a.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) a2.getSerializableExtra(PushMessageHelper.KEY_COMMAND);
                com.xiaomi.channel.commonutils.logger.c.e("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                m35a.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), fs.COMMAND_REGISTER.f436a)) {
                    m35a.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        f.b(context);
                        a(context, miPushCommandMessage);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.a a3 = t.a(context).a(a2);
            int intExtra2 = a2.getIntExtra("eventMessageType", -1);
            if (a3 != null) {
                if (a3 instanceof MiPushMessage) {
                    MiPushMessage miPushMessage = (MiPushMessage) a3;
                    if (!miPushMessage.isArrivedMessage()) {
                        m35a.onReceiveMessage(context, miPushMessage);
                    }
                    if (miPushMessage.getPassThrough() == 1) {
                        if (ac.m731b(miPushMessage.getExtra())) {
                            com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "begin execute onReceiveCallkitMessage from " + miPushMessage.getMessageId());
                            m35a.onCallMessage(new CallMessage(miPushMessage.getMessageId(), miPushMessage.getContent()));
                            return;
                        }
                        eo.a(context.getApplicationContext()).a(context.getPackageName(), a2, INotificationPermissionCallback.CODE_FREQUENT, (String) null);
                        com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                        m35a.onReceivePassThroughMessage(context, miPushMessage);
                        return;
                    }
                    if (miPushMessage.isNotified()) {
                        if (intExtra2 == 1000) {
                            eo.a(context.getApplicationContext()).a(context.getPackageName(), a2, 1007, (String) null);
                        } else {
                            eo.a(context.getApplicationContext()).a(context.getPackageName(), a2, 3007, (String) null);
                        }
                        com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
                        m35a.onNotificationMessageClicked(context, miPushMessage);
                        return;
                    }
                    com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                    m35a.onNotificationMessageArrived(context, miPushMessage);
                    return;
                }
                if (a3 instanceof MiPushCommandMessage) {
                    MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) a3;
                    com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                    m35a.onCommandResult(context, miPushCommandMessage2);
                    if (TextUtils.equals(miPushCommandMessage2.getCommand(), fs.COMMAND_REGISTER.f436a)) {
                        m35a.onReceiveRegisterResult(context, miPushCommandMessage2);
                        PushMessageHandler.a(context, miPushCommandMessage2);
                        if (miPushCommandMessage2.getResultCode() == 0) {
                            f.b(context);
                            a(context, miPushCommandMessage2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "unknown raw message: " + a3);
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.c("MessageHandleService", "no message from raw for receiver");
        } catch (RuntimeException e2) {
            com.xiaomi.channel.commonutils.logger.c.a("MessageHandleService", e2);
        }
    }
}
