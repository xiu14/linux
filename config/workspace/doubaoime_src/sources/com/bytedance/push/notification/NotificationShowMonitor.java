package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.notification.INotificationMonitorService;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NotificationShowMonitor extends com.bytedance.common.push.c implements INotificationMonitorService {
    private static NotificationShowMonitor mNotificationShowMonitor;
    private long mLastMonitorNotificationFromOthersAppTimeStamp;
    private final String TAG = "PushMonitorShowService";
    private final String EVENT_NAME_BD_NOTIFICATION_MONITOR_EVENT = "bdpush_notification_event";
    private final String EVENT_NAME_BD_NOTIFICATION_INTERCEPT_EVENT = "bdpush_notification_intercept_event";
    private final int MAX_SIZE_TARGET_PKG_MAP = 10;
    private final Map<Object, String> mTargetPkgMap = new com.bytedance.push.notification.d(10);
    private final AtomicBoolean mInit = new AtomicBoolean(false);
    private List<String> reportedHistory = new CopyOnWriteArrayList();

    class a implements Runnable {

        /* renamed from: com.bytedance.push.notification.NotificationShowMonitor$a$a, reason: collision with other inner class name */
        class C0303a implements Observer {
            final /* synthetic */ com.bytedance.push.settings.w.f a;

            /* renamed from: com.bytedance.push.notification.NotificationShowMonitor$a$a$a, reason: collision with other inner class name */
            class RunnableC0304a implements Runnable {
                RunnableC0304a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    NotificationShowMonitor.this.monitorNotificationFromOthersApp();
                }
            }

            C0303a(com.bytedance.push.settings.w.f fVar) {
                this.a = fVar;
            }

            @Override // java.util.Observer
            public void update(Observable observable, Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                com.bytedance.push.g0.f.c("PushMonitorShowService", "[onAppStatusUpdate]isInBackGround:" + booleanValue);
                if (booleanValue) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis() - NotificationShowMonitor.this.mLastMonitorNotificationFromOthersAppTimeStamp;
                if (currentTimeMillis >= this.a.o) {
                    com.ss.android.message.e.e().f(new RunnableC0304a(), 0L);
                    return;
                }
                StringBuilder Q = e.a.a.a.a.Q("[onAppStatusUpdate]not monitorNotificationFromOthersApp because frequency control,monitorInterval:", currentTimeMillis, " minMonitorInterval:");
                Q.append(this.a.o);
                com.bytedance.push.g0.f.c("PushMonitorShowService", Q.toString());
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.ss.android.message.f.a.t(com.ss.android.message.a.a())) {
                com.bytedance.push.settings.w.f a = com.bytedance.push.settings.w.f.a();
                if (a.a) {
                    NotificationShowMonitor.this.monitorNotificationFromOthersApp();
                    com.bytedance.common.push.b.e().addObserver(new C0303a(a));
                }
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ j a;

        b(NotificationShowMonitor notificationShowMonitor, j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject t = this.a.t();
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onNotificationShow]notificationEvent is " + t);
            PushServiceManager.get().getPushExternalService().getMultiProcessEventSenderService().onEventV3("bdpush_notification_event", t);
        }
    }

    class c implements Runnable {
        final /* synthetic */ j a;
        final /* synthetic */ boolean b;

        c(NotificationShowMonitor notificationShowMonitor, j jVar, boolean z) {
            this.a = jVar;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.p(this.b);
            JSONObject t = this.a.t();
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onForeGroundNotificationShow]notificationEvent is " + t);
            PushServiceManager.get().getPushExternalService().getMultiProcessEventSenderService().onEventV3("bdpush_notification_event", t);
        }
    }

    class d implements Runnable {
        final /* synthetic */ j a;
        final /* synthetic */ String b;

        d(NotificationShowMonitor notificationShowMonitor, j jVar, String str) {
            this.a = jVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject t = this.a.t();
            try {
                t.put("reason", this.b);
            } catch (Throwable th) {
                com.bytedance.push.g0.f.f("PushMonitorShowService", "error when put reason to params ", th);
            }
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onNotificationIntercept]bdpush_notification_intercept_event params is " + t);
            PushServiceManager.get().getPushExternalService().getMultiProcessEventSenderService().onEventV3("bdpush_notification_intercept_event", t);
        }
    }

    private String getNotificationIdStr(String str, int i, Notification notification) {
        try {
            Field a2 = com.bytedance.push.g0.c.a(Notification.class, "creationTime");
            if (a2 != null) {
                return String.format("%s", Long.valueOf(((Long) a2.get(notification)).longValue()));
            }
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushMonitorShowService", "[getNotificationIdStr]error when get creationTime ", th);
        }
        return String.format("%s-%s", str, Integer.valueOf(i));
    }

    private String getStack() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (StackTraceElement stackTraceElement : e.a.a.a.a.U0()) {
            if (TextUtils.equals(stackTraceElement.getClassName(), "android.app.Service") && TextUtils.equals(stackTraceElement.getMethodName(), "startForeground")) {
                sb.append("android.app.Service#startForeground");
            } else if (TextUtils.equals(stackTraceElement.getClassName(), "android.app.NotificationManager") && TextUtils.equals(stackTraceElement.getMethodName(), "notifyAsUser")) {
                sb.append("android.app.NotificationManager#notifyAsUser");
            } else {
                if (z) {
                    sb.append(String.format(" <- %s#%s#%s", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
                }
            }
            z = true;
        }
        return sb.toString();
    }

    public static NotificationShowMonitor inst() {
        if (mNotificationShowMonitor == null) {
            synchronized (NotificationShowMonitor.class) {
                if (mNotificationShowMonitor == null) {
                    mNotificationShowMonitor = new NotificationShowMonitor();
                }
            }
        }
        return mNotificationShowMonitor;
    }

    @RequiresApi(api = 19)
    private boolean isEmptyNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return false;
        }
        return TextUtils.isEmpty(bundle.getString(NotificationCompat.EXTRA_TITLE)) || TextUtils.isEmpty(notification.extras.getString(NotificationCompat.EXTRA_TEXT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(api = 23)
    public synchronized void monitorNotificationFromOthersApp() {
        com.bytedance.push.settings.w.f a2;
        long currentTimeMillis;
        boolean z;
        boolean z2;
        try {
            a2 = com.bytedance.push.settings.w.f.a();
            currentTimeMillis = System.currentTimeMillis() - this.mLastMonitorNotificationFromOthersAppTimeStamp;
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushMonitorShowService", "[monitorNotificationFromOthersApp]exception: ", th);
        }
        if (currentTimeMillis < a2.o) {
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[monitorNotificationFromOthersApp]not monitorNotificationFromOthersApp because frequency control,monitorInterval:" + currentTimeMillis + " minMonitorInterval:" + a2.o);
            return;
        }
        this.mLastMonitorNotificationFromOthersAppTimeStamp = System.currentTimeMillis();
        com.bytedance.push.g0.f.c("PushMonitorShowService", "[monitorNotificationFromOthersApp]monitorNotificationFromOthersApp");
        NotificationManager notificationManager = (NotificationManager) com.ss.android.message.a.a().getSystemService(RemoteMessageConst.NOTIFICATION);
        if (notificationManager == null) {
            return;
        }
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        if (activeNotifications == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = activeNotifications.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            StatusBarNotification statusBarNotification = activeNotifications[i];
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onOthersAppNotification]cur statusBarNotification tag:" + statusBarNotification.getTag() + " id:" + statusBarNotification.getId());
            String tag = statusBarNotification.getTag();
            List<String> list = a2.p;
            if (list != null) {
                Iterator<String> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    }
                    String next = it2.next();
                    if (com.bytedance.feedbackerlib.a.T(tag, next)) {
                        com.bytedance.push.g0.f.c("PushMonitorShowService", "[monitorNotificationFromOthersApp]cur notification is group notification,do nothing curTag:" + tag + " groupTag:" + next);
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    i++;
                }
            }
            Notification notification = statusBarNotification.getNotification();
            String group = notification.getGroup();
            List<String> list2 = a2.q;
            if (list2 != null) {
                Iterator<String> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    String next2 = it3.next();
                    if (com.bytedance.feedbackerlib.a.T(group, next2)) {
                        com.bytedance.push.g0.f.c("PushMonitorShowService", "[monitorNotificationFromOthersApp]cur notification is group notification,do nothing,curGroup:" + group + " groupName:" + next2);
                        break;
                    }
                }
                if (z) {
                    i++;
                }
            }
            String notificationIdStr = getNotificationIdStr(tag, statusBarNotification.getId(), notification);
            arrayList.add(notificationIdStr);
            if (this.reportedHistory.contains(notificationIdStr)) {
                com.bytedance.push.g0.f.c("PushMonitorShowService", "[monitorNotificationFromOthersApp]cur notification has reported,do nothing");
            } else {
                this.reportedHistory.add(notificationIdStr);
                onOthersAppNotification(statusBarNotification);
            }
            i++;
        }
        int size = this.reportedHistory.size();
        if (arrayList.size() == 0) {
            this.reportedHistory.clear();
        } else {
            z = this.reportedHistory.retainAll(arrayList);
        }
        com.bytedance.push.g0.f.c("PushMonitorShowService", "[monitorNotificationFromOthersApp]retainAllResult:" + z + " before retain size:" + size + " after retain size:" + this.reportedHistory.size());
    }

    private void onNotificationIntercept(j jVar, String str) {
        com.ss.android.message.e.e().f(new d(this, jVar, str), 0L);
    }

    @Override // com.bytedance.android.service.manager.push.notification.INotificationMonitorService
    public boolean enableMonitorNotificationShow() {
        return com.bytedance.push.settings.w.f.a().a;
    }

    public String getContentIntentFromPendingIntent(PendingIntent pendingIntent) {
        try {
            return this.mTargetPkgMap.get(com.bytedance.push.g0.c.a(IntentSender.class, "mTarget").get(pendingIntent.getIntentSender()));
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushMonitorShowService", "error when getContentIntentFromPendingIntent ", th);
            return null;
        }
    }

    public void init() {
        if (this.mInit.getAndSet(true)) {
            return;
        }
        com.bytedance.common.push.d.a(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x022b, code lost:
    
        if (r3.toLowerCase().contains("decoratedmediacustomviewstyle") != false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean isValidNotificationStyle(com.bytedance.push.notification.j r14, android.app.Notification r15) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.notification.NotificationShowMonitor.isValidNotificationStyle(com.bytedance.push.notification.j, android.app.Notification):boolean");
    }

    @RequiresApi(api = 19)
    boolean needInterceptNotificationForTargetText(j jVar, Notification notification) {
        if (notification == null) {
            com.bytedance.push.g0.f.e("PushMonitorShowService", "[needInterceptNotificationForTargetText]not target notification because cur notification is null");
            return false;
        }
        List<com.bytedance.push.settings.w.l> list = com.bytedance.push.settings.w.f.a().n;
        if (list == null || list.isEmpty()) {
            com.bytedance.push.g0.f.m("PushMonitorShowService", "[needInterceptNotificationForTargetText]not match target text because  mNotificationMonitorSettingsModel.targetTextRegList is empty");
        } else {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                String string = bundle.getString(NotificationCompat.EXTRA_TITLE);
                String string2 = notification.extras.getString(NotificationCompat.EXTRA_TEXT);
                String string3 = notification.extras.getString(NotificationCompat.EXTRA_BIG_TEXT);
                String string4 = notification.extras.getString("android.tickerText");
                if (com.bytedance.push.g0.f.d()) {
                    StringBuilder W = e.a.a.a.a.W("[needInterceptNotificationForTargetText]title:", string, " text:", string2, " bigText:");
                    W.append(string3);
                    W.append(" tickerText:");
                    W.append(string4);
                    com.bytedance.push.g0.f.c("PushMonitorShowService", W.toString());
                }
                for (com.bytedance.push.settings.w.l lVar : list) {
                    com.bytedance.push.g0.f.c("PushMonitorShowService", "[needInterceptNotificationForTargetText]try match text with targetTextMonitorModel:" + lVar);
                    if (lVar.n(string) || lVar.n(string2) || lVar.n(string3) || lVar.n(string4)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("[needInterceptNotificationForTargetText]cur notification match the targetTextReg,targetTextReg:");
                        sb.append(lVar);
                        sb.append(" title:");
                        sb.append(string);
                        sb.append(" text:");
                        e.a.a.a.a.M0(sb, string2, " bigText:", string3, " tickerText:");
                        e.a.a.a.a.J0(sb, string4, "PushMonitorShowService");
                        jVar.i = lVar.b;
                        jVar.s(lVar.a);
                        jVar.r(true);
                        return lVar.f5868c;
                    }
                }
                com.bytedance.push.g0.f.m("PushMonitorShowService", "[needInterceptNotificationForTargetText]text not match any targetTextReg");
            } else {
                com.bytedance.push.g0.f.m("PushMonitorShowService", "[needInterceptNotificationForTargetText]not match target text because notification.extras is null");
            }
        }
        return false;
    }

    @Override // com.bytedance.android.service.manager.push.notification.INotificationMonitorService
    public boolean onForeGroundNotificationShow(ComponentName componentName, Notification notification) {
        com.bytedance.push.settings.w.f a2 = com.bytedance.push.settings.w.f.a();
        this.reportedHistory.add(getNotificationIdStr("fore_ground", 0, notification));
        j jVar = new j(notification, 2, componentName, a2.m);
        boolean isValidNotificationStyle = isValidNotificationStyle(jVar, notification);
        jVar.q(getStack());
        if (!isValidNotificationStyle || jVar.n() || a2.b) {
            com.bytedance.common.push.d.b(new c(this, jVar, isValidNotificationStyle));
        } else {
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onForeGroundNotificationShow]not report cur notificationEvent because cur notification is valid and mNotificationMonitorSettingsModel.reportValidNotification is false");
        }
        if (a2.f5860d) {
            return isValidNotificationStyle;
        }
        if (isValidNotificationStyle) {
            return true;
        }
        com.bytedance.push.g0.f.m("PushMonitorShowService", "[onForeGroundNotificationShow]cur foreground notification is invalid but  allowInterceptForegroundNotification is false,not intercept");
        return true;
    }

    public boolean onNotificationShow(String str, int i, Notification notification) {
        this.reportedHistory.add(getNotificationIdStr(str, i, notification));
        com.bytedance.push.settings.w.f a2 = com.bytedance.push.settings.w.f.a();
        j jVar = new j(notification, 1, a2.m);
        boolean isValidNotificationStyle = isValidNotificationStyle(jVar, notification);
        jVar.p(isValidNotificationStyle);
        jVar.q(getStack());
        if (!isValidNotificationStyle || jVar.n() || a2.b) {
            com.bytedance.common.push.d.b(new b(this, jVar));
        } else {
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onNotificationShow]not report cur notificationEvent because cur notification is valid and mNotificationMonitorSettingsModel.reportValidNotification is false");
        }
        return isValidNotificationStyle;
    }

    @RequiresApi(api = 19)
    public void onOthersAppNotification(StatusBarNotification statusBarNotification) {
        NotificationManager notificationManager;
        Notification notification = statusBarNotification.getNotification();
        com.bytedance.push.settings.w.f a2 = com.bytedance.push.settings.w.f.a();
        j jVar = new j(notification, 3, a2.m);
        try {
            String str = (String) com.bytedance.push.g0.c.a(StatusBarNotification.class, "opPkg").get(statusBarNotification);
            jVar.j = str;
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onOthersAppNotification]opPkg:" + str);
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushMonitorShowService", "[onOthersAppNotification]error when get opPkg ", th);
        }
        boolean isValidNotificationStyle = isValidNotificationStyle(jVar, notification);
        jVar.p(isValidNotificationStyle);
        if (!isValidNotificationStyle || jVar.n() || a2.b) {
            JSONObject t = jVar.t();
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onOthersAppNotification]notificationEvent is " + t);
            PushServiceManager.get().getPushExternalService().getMultiProcessEventSenderService().onEventV3("bdpush_notification_event", t);
        } else {
            com.bytedance.push.g0.f.c("PushMonitorShowService", "[onOthersAppNotification]not report cur notificationEvent because cur notification is valid and mNotificationMonitorSettingsModel.reportValidNotification is false");
        }
        if (isValidNotificationStyle || (notificationManager = (NotificationManager) com.ss.android.message.a.a().getSystemService(RemoteMessageConst.NOTIFICATION)) == null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("[onOthersAppNotification]auto cancel cur invalid notification,tag:");
        M.append(statusBarNotification.getTag());
        M.append(" id:");
        M.append(statusBarNotification.getId());
        com.bytedance.push.g0.f.c("PushMonitorShowService", M.toString());
        notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
    }

    @Override // com.bytedance.android.service.manager.push.notification.INotificationMonitorService
    public void onPendingIntent(Object obj, Intent intent) {
        ComponentName component;
        if (intent == null || obj == null) {
            return;
        }
        String str = intent.getPackage();
        if (TextUtils.isEmpty(str) && (component = intent.getComponent()) != null) {
            str = component.getPackageName();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mTargetPkgMap.put(obj, str);
    }

    public void removeContentIntent(PendingIntent pendingIntent) {
        try {
            this.mTargetPkgMap.remove(pendingIntent);
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("PushMonitorShowService", "error when removeContentIntent ", th);
        }
    }
}
