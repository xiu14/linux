package com.bytedance.push.monitor;

import android.app.servertransaction.ClientTransaction;
import android.app.servertransaction.ClientTransactionItem;
import android.app.servertransaction.LaunchActivityItem;
import android.app.servertransaction.ResumeActivityItem;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.C;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* loaded from: classes2.dex */
public class h extends com.bytedance.push.W.a implements Handler.Callback, Observer {
    private static volatile h h;

    /* renamed from: c, reason: collision with root package name */
    private long f5737c;

    /* renamed from: d, reason: collision with root package name */
    private long f5738d;

    /* renamed from: e, reason: collision with root package name */
    private String f5739e;
    private int a = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5740f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5741g = false;
    private Handler b = com.ss.android.message.e.e().c(this);

    private h() {
    }

    private void b(int i, String str) {
        if (this.f5740f) {
            return;
        }
        this.f5740f = true;
        com.bytedance.push.g0.f.c("ProcessStartMonitor", String.format("[finishedDetect] startType is %s startComponent is %s", Integer.valueOf(i), str));
        this.a = i;
        this.f5739e = str;
        this.f5738d = System.currentTimeMillis();
        this.b.removeMessages(4141031);
        this.b.sendEmptyMessageDelayed(4141032, com.heytap.mcssdk.constant.a.r);
    }

    public static h c() {
        if (h == null) {
            synchronized (h.class) {
                if (h == null) {
                    h = new h();
                }
            }
        }
        return h;
    }

    private String d(Intent intent) {
        ComponentName component = intent.getComponent();
        return component != null ? component.toShortString() : intent.getAction();
    }

    private void f(boolean z, boolean z2, long j, long j2, int i) {
        boolean curProcessIsFirstProcess = PushServiceManager.get().getAliveMonitorService().curProcessIsFirstProcess(com.ss.android.message.a.a());
        StringBuilder M = e.a.a.a.a.M("onLaunchEvent,mHasReportLaunch is ");
        M.append(this.f5741g);
        M.append(" successToForeGround:");
        M.append(z2);
        M.append(" mStartType:");
        M.append(this.a);
        M.append(" mLaunchComponent:");
        M.append(this.f5739e);
        M.append(" curProcessIsFirstProcess:");
        M.append(curProcessIsFirstProcess);
        com.bytedance.push.g0.f.c("ProcessStartMonitor", M.toString());
        if (this.f5741g) {
            return;
        }
        this.f5741g = true;
        ((C) C.a()).r().onLaunchEvent(z, z2, j, j2, i, this.a, this.f5739e);
        ((C) C.a()).r().onProcessStartEvent(z, z2, j, j2, i, this.a, this.f5739e, curProcessIsFirstProcess);
        if (z2 || !curProcessIsFirstProcess) {
            return;
        }
        PushServiceManager.get().getIAllianceService().onBackgroundProcessAlive(this.f5739e);
    }

    private void g(Message message) {
        Object obj = message.obj;
        try {
            int i = message.what;
            if (i == 100) {
                Field declaredField = obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField.setAccessible(true);
                Intent intent = (Intent) declaredField.get(obj);
                com.bytedance.push.g0.f.c("ProcessStartMonitor", "[processActivity]intent:" + intent);
                b(3, d(intent));
                return;
            }
            if (i == 159 && (obj instanceof ClientTransaction)) {
                Method c2 = com.bytedance.push.g0.c.c(ClientTransaction.class, "getLifecycleStateRequest", new Class[0]);
                if (c2 != null && !c2.isAccessible()) {
                    c2.setAccessible(true);
                }
                if (c2.invoke(obj, new Object[0]) instanceof ResumeActivityItem) {
                    Method declaredMethod = ClientTransaction.class.getDeclaredMethod("getCallbacks", new Class[0]);
                    declaredMethod.setAccessible(true);
                    List list = (List) declaredMethod.invoke(obj, new Object[0]);
                    ClientTransactionItem clientTransactionItem = null;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ClientTransactionItem clientTransactionItem2 = (ClientTransactionItem) it2.next();
                        if (TextUtils.equals(clientTransactionItem2.getClass().getCanonicalName(), LaunchActivityItem.class.getCanonicalName())) {
                            clientTransactionItem = clientTransactionItem2;
                            break;
                        }
                    }
                    if (clientTransactionItem != null) {
                        Field a = com.bytedance.push.g0.c.a(LaunchActivityItem.class, "mIntent");
                        Field a2 = com.bytedance.push.g0.c.a(LaunchActivityItem.class, "mInfo");
                        a.setAccessible(true);
                        a2.setAccessible(true);
                        Intent intent2 = (Intent) a.get(clientTransactionItem);
                        intent2.setExtrasClassLoader(getClass().getClassLoader());
                        com.bytedance.push.g0.f.c("ProcessStartMonitor", "[processActivity]intent:" + intent2);
                        b(3, d(intent2));
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("ProcessStartMonitor", "error when processActivity ", th);
            th.printStackTrace();
        }
    }

    private void h(Message message) {
        Object obj = message.obj;
        try {
            if (message.what == 113) {
                Field declaredField = obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField.setAccessible(true);
                Intent intent = (Intent) declaredField.get(obj);
                com.bytedance.push.g0.f.c("ProcessStartMonitor", "[processReceiver]intent:" + intent);
                b(2, d(intent));
            }
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("ProcessStartMonitor", "error when processReceiver", th);
        }
    }

    private void i(Message message) {
        try {
            Object obj = message.obj;
            int i = message.what;
            if (i == 114) {
                Field declaredField = obj.getClass().getDeclaredField(DBDefinition.SEGMENT_INFO);
                declaredField.setAccessible(true);
                ServiceInfo serviceInfo = (ServiceInfo) declaredField.get(obj);
                com.bytedance.push.g0.f.c("ProcessStartMonitor", "[processService]ServiceInfo:" + serviceInfo);
                b(1, serviceInfo.name);
            } else if (i == 115) {
                Field declaredField2 = obj.getClass().getDeclaredField("args");
                declaredField2.setAccessible(true);
                Intent intent = (Intent) declaredField2.get(obj);
                com.bytedance.push.g0.f.c("ProcessStartMonitor", "[processService]intent:" + intent);
                b(1, d(intent));
            } else if (i == 121) {
                Field declaredField3 = obj.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField3.setAccessible(true);
                Intent intent2 = (Intent) declaredField3.get(obj);
                com.bytedance.push.g0.f.c("ProcessStartMonitor", "[processService]intent:" + intent2);
                b(1, d(intent2));
            }
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("ProcessStartMonitor", "error when processService", th);
        }
    }

    @Override // com.bytedance.push.W.a
    public com.bytedance.push.W.f a(Object obj, Method method, Object[] objArr) throws InvocationTargetException, IllegalAccessException {
        try {
            if (!this.f5740f && TextUtils.equals(method.getName(), "handleMessage")) {
                Message message = (Message) objArr[0];
                int i = message.what;
                if (i == 100) {
                    com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:LAUNCH_ACTIVITY");
                    g(message);
                } else if (i == 121) {
                    com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:BIND_SERVICE");
                    i(message);
                } else if (i != 159) {
                    switch (i) {
                        case 113:
                            com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:RECEIVER");
                            h(message);
                            break;
                        case 114:
                            com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:CREATE_SERVICE");
                            i(message);
                            break;
                        case 115:
                            com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:SERVICE_ARGS");
                            i(message);
                            break;
                        default:
                            com.bytedance.push.g0.f.c("ProcessStartMonitor", String.format("handleMessage:%s", Integer.valueOf(i)));
                            break;
                    }
                } else {
                    com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:EXECUTE_TRANSACTION");
                    try {
                        Method c2 = com.bytedance.push.g0.c.c(ClientTransaction.class, "getLifecycleStateRequest", new Class[0]);
                        c2.setAccessible(true);
                        if (c2.invoke(message.obj, new Object[0]) instanceof ResumeActivityItem) {
                            com.bytedance.push.g0.f.c("ProcessStartMonitor", "handleMessage:EXECUTE_TRANSACTION-->LAUNCH_ACTIVITY");
                            g(message);
                        }
                    } catch (Throwable th) {
                        com.bytedance.push.g0.f.f("ProcessStartMonitor", "handleMessage:error when parse EXECUTE_TRANSACTION", th);
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.push.g0.f.f("ProcessStartMonitor", "error when handleMessage ", th2);
        }
        return new com.bytedance.push.W.f();
    }

    public void e(String str, String str2) {
        if (this.f5740f) {
            return;
        }
        com.bytedance.push.g0.f.c("ProcessStartMonitor", "[onContentProviderLaunch]launchMethod:" + str2 + " providerName:" + str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        b(4, e.a.a.a.a.J(sb, "$", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a1, code lost:
    
        return false;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            int r0 = r12.what
            r1 = 1
            r2 = 0
            r8 = 0
            java.lang.String r4 = "ProcessStartMonitor"
            switch(r0) {
                case 4141031: goto L71;
                case 4141032: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto La1
        Ld:
            java.lang.String r0 = "on MSG_WHAT_TO_FOREGROUND_TIME_OUT"
            com.bytedance.push.g0.f.c(r4, r0)
            com.bytedance.push.K.a r0 = com.bytedance.push.K.a.d()
            long r5 = r0.c()
            com.bytedance.android.service.manager.PushServiceManager r0 = com.bytedance.android.service.manager.PushServiceManager.get()
            com.bytedance.android.service.manager.redbadge.IRedBadgeExternalService r0 = r0.getIRedBadgeExternalService()
            android.app.Application r7 = com.ss.android.message.a.a()
            int r7 = r0.getBadgeNumberWhenAppLaunch(r7)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L61
            long r2 = r11.f5737c
            long r9 = r5 - r2
            long r2 = r11.f5738d
            long r5 = r5 - r2
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r0[r8] = r2
            java.lang.String r2 = r11.f5739e
            r0[r1] = r2
            r1 = 2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r0[r1] = r2
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            r0[r1] = r2
            java.lang.String r1 = "on MSG_WHAT_TO_FOREGROUND_TIME_OUT:app success to foreground,processLaunchToForegroundTimeCost is %s,mLaunchComponent is %s,componentStartToForegroundTimeCost is %s, badgeNumberWhenAppLaunch is %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            com.bytedance.push.g0.f.c(r4, r0)
            r1 = 0
            r2 = 1
            r0 = r11
            r3 = r9
            r0.f(r1, r2, r3, r5, r7)
            goto La1
        L61:
            java.lang.String r0 = "on MSG_WHAT_TO_FOREGROUND_TIME_OUT:app failed to foreground"
            com.bytedance.push.g0.f.c(r4, r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r11
            r0.f(r1, r2, r3, r5, r7)
            goto La1
        L71:
            java.lang.String r0 = "on MSG_WHAT_DETECT_START_COMPONENT_TIME_OUT"
            com.bytedance.push.g0.f.c(r4, r0)
            r4 = 1
            com.bytedance.push.K.a r0 = com.bytedance.push.K.a.d()
            long r5 = r0.c()
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L85
            r2 = r1
            goto L86
        L85:
            r2 = r8
        L86:
            r5 = 0
            r9 = 0
            com.bytedance.android.service.manager.PushServiceManager r0 = com.bytedance.android.service.manager.PushServiceManager.get()
            com.bytedance.android.service.manager.redbadge.IRedBadgeExternalService r0 = r0.getIRedBadgeExternalService()
            android.app.Application r1 = com.ss.android.message.a.a()
            int r7 = r0.getBadgeNumberWhenAppLaunch(r1)
            r0 = r11
            r1 = r4
            r3 = r5
            r5 = r9
            r0.f(r1, r2, r3, r5, r7)
        La1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.monitor.h.handleMessage(android.os.Message):boolean");
    }

    public void j() {
        com.bytedance.push.g0.f.c("ProcessStartMonitor", "[startMonitor]");
        if (this.f5737c == 0) {
            this.f5737c = System.currentTimeMillis();
        }
        this.b.sendEmptyMessageDelayed(4141031, com.heytap.mcssdk.constant.a.q);
        com.bytedance.push.K.a.d().addObserver(this);
        com.bytedance.push.W.d.f().a(this);
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        com.bytedance.push.g0.f.c("ProcessStartMonitor", "[update]isInBackGround:" + booleanValue);
        if (booleanValue) {
            return;
        }
        if (this.a != 0) {
            this.b.sendEmptyMessage(4141032);
        }
        com.bytedance.push.K.a.d().deleteObserver(this);
    }
}
