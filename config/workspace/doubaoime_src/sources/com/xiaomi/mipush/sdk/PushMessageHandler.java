package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.eo;
import com.xiaomi.push.fs;
import com.xiaomi.push.hy;
import com.xiaomi.push.je;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class PushMessageHandler extends BaseService {
    private static List<MiPushClient.ICallbackResult> a = new ArrayList();
    private static List<MiPushClient.MiPushClientCallback> b = new ArrayList();

    /* renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f43a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    interface a extends Serializable {
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m16a("PushMessageHandler", e2.getMessage());
        }
    }

    protected static void b() {
        synchronized (a) {
            a.clear();
        }
    }

    private static void c(final Context context, final Intent intent) {
        if (intent != null && !f43a.isShutdown()) {
            f43a.execute(new Runnable() { // from class: com.xiaomi.mipush.sdk.PushMessageHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    PushMessageHandler.b(context, intent);
                }
            });
            return;
        }
        Object[] objArr = new Object[1];
        StringBuilder M = e.a.a.a.a.M("-->scheduleJob() fail, case");
        M.append(intent == null ? "0" : PushClient.DEFAULT_REQUEST_ID);
        objArr[0] = M.toString();
        com.xiaomi.channel.commonutils.logger.c.c("PushMessageHandler", objArr);
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    protected boolean hasJob() {
        ThreadPoolExecutor threadPoolExecutor = f43a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f43a.getQueue().size() <= 0) ? false : true;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        c(getApplicationContext(), intent);
    }

    protected static void b(Context context, Intent intent) {
        boolean z;
        ResolveInfo resolveInfo;
        try {
            intent.putExtra("pmh_handle_time", System.currentTimeMillis());
            z = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m16a("PushMessageHandler", "intent unparcel error:" + th);
            z = false;
        }
        try {
            com.xiaomi.channel.commonutils.logger.c.m17a("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
            if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
                hy hyVar = new hy();
                je.a(hyVar, intent.getByteArrayExtra("mipush_payload"));
                com.xiaomi.channel.commonutils.logger.c.m22b("PushMessageHandler", "PushMessageHandler.onHandleIntent " + hyVar.d());
                MiTinyDataClient.upload(context, hyVar);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                if (m40a()) {
                    com.xiaomi.channel.commonutils.logger.c.c("PushMessageHandler", "receive a message before application calling initialize");
                    if (z) {
                        b(context);
                        return;
                    }
                    return;
                }
                a a2 = t.a(context).a(intent);
                if (a2 != null) {
                    a(context, a2);
                }
            } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
                try {
                    Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                    intent2.setPackage(context.getPackageName());
                    intent2.putExtras(intent);
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                    if (queryBroadcastReceivers != null) {
                        Iterator<ResolveInfo> it2 = queryBroadcastReceivers.iterator();
                        while (it2.hasNext()) {
                            resolveInfo = it2.next();
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(com.xiaomi.push.t.a(context, resolveInfo.activityInfo.name))) {
                                break;
                            }
                        }
                    }
                    resolveInfo = null;
                    if (resolveInfo != null) {
                        a(context, intent2, resolveInfo, z);
                    } else {
                        j.a(context, intent, 12, (Throwable) null);
                        com.xiaomi.channel.commonutils.logger.c.c("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                        eo.a(context).a(context.getPackageName(), intent, "11");
                    }
                } catch (Exception e2) {
                    j.a(context, intent, 13, e2);
                    com.xiaomi.channel.commonutils.logger.c.a("PushMessageHandler", e2);
                    eo.a(context).a(context.getPackageName(), intent, "9");
                }
            }
            if (!z) {
            }
        } catch (Throwable th2) {
            try {
                com.xiaomi.channel.commonutils.logger.c.a("PushMessageHandler", th2);
                eo.a(context).a(context.getPackageName(), intent, "10");
            } finally {
                if (z) {
                    b(context);
                }
            }
        }
    }

    public static void a(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.c.m22b("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    protected static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (b) {
            if (!b.contains(miPushClientCallback)) {
                b.add(miPushClientCallback);
            }
        }
    }

    protected static void a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (a) {
            if (!a.contains(iCallbackResult)) {
                a.add(iCallbackResult);
            }
        }
    }

    protected static void a() {
        synchronized (b) {
            b.clear();
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.a aVar = new MessageHandleService.a(intent, (PushMessageReceiver) com.xiaomi.push.t.a(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th) {
            j.a(context, intent, 14, th);
            com.xiaomi.channel.commonutils.logger.c.m18a(th);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m40a() {
        return b.isEmpty();
    }

    public static void a(Context context, a aVar) {
        if (aVar instanceof MiPushMessage) {
            a(context, (MiPushMessage) aVar);
            return;
        }
        if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (fs.COMMAND_REGISTER.f436a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (!fs.COMMAND_SET_ALIAS.f436a.equals(command) && !fs.COMMAND_UNSET_ALIAS.f436a.equals(command) && !fs.COMMAND_SET_ACCEPT_TIME.f436a.equals(command)) {
                if (fs.COMMAND_SUBSCRIBE_TOPIC.f436a.equals(command)) {
                    List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                    if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                        str = commandArguments2.get(0);
                    }
                    a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                    return;
                }
                if (fs.COMMAND_UNSUBSCRIBE_TOPIC.f436a.equals(command)) {
                    List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                    if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                        str = commandArguments3.get(0);
                    }
                    b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                    return;
                }
                return;
            }
            a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, c.a(context));
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m16a("PushMessageHandler", "callback sync error" + e2);
        }
    }

    protected static void b(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                    miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    miPushClientCallback.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    public static void a(long j, String str, String str2) {
        synchronized (b) {
            Iterator<MiPushClient.MiPushClientCallback> it2 = b.iterator();
            while (it2.hasNext()) {
                it2.next().onInitializeResult(j, str, str2);
            }
        }
    }

    protected static void a(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    protected static void a(Context context, String str, String str2, long j, String str3, List<String> list) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onCommandResult(str2, j, str3, list);
                }
            }
        }
    }

    protected static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    protected static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (a) {
            for (MiPushClient.ICallbackResult iCallbackResult : a) {
                if (iCallbackResult instanceof MiPushClient.UPSRegisterCallBack) {
                    MiPushClient.TokenResult tokenResult = new MiPushClient.TokenResult();
                    if (miPushCommandMessage != null && miPushCommandMessage.getCommandArguments() != null && miPushCommandMessage.getCommandArguments().size() > 0) {
                        tokenResult.setResultCode(miPushCommandMessage.getResultCode());
                        tokenResult.setToken(miPushCommandMessage.getCommandArguments().get(0));
                    }
                    iCallbackResult.onResult(tokenResult);
                }
            }
        }
    }
}
