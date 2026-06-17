package com.bytedance.push;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.PushExternalService;
import com.bytedance.android.service.manager.push.trace.Constants;
import com.bytedance.android.service.manager.push.trace.PushTraceExternalService;
import com.bytedance.android.service.manager.push.trace.PushTraceSceneType;
import com.bytedance.push.interfaze.IPushService;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.third.PushManager;
import com.ss.android.common.applog.AppLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class A implements IPushService {

    /* renamed from: e, reason: collision with root package name */
    static long f5540e;
    private volatile C0679c a;
    private final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f5541c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.push.c0.c f5542d;

    static void b(A a, C0679c c0679c, boolean z) {
        Objects.requireNonNull(a);
        if (PushServiceManager.get().getIPushStatisticsExternalService().isEnablePushStatistics()) {
            PushServiceManager.get().getIPushStatisticsExternalService().onProcessStart();
            return;
        }
        if (((PushOnlineSettings) com.bytedance.push.settings.h.b(c0679c.a, PushOnlineSettings.class)).u()) {
            com.bytedance.push.c0.c cVar = new com.bytedance.push.c0.c(z ? new com.bytedance.push.c0.d(a.a.a, ((C) C.a()).f(), c0679c.m) : new com.bytedance.push.c0.d(a.a.a, ((C) C.a()).f()), ((C) C.a()).f());
            a.f5542d = cVar;
            cVar.c();
            if (z) {
                return;
            }
            a.f5542d.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0679c c() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = C0679c.a();
                }
            }
        }
        return this.a;
    }

    private boolean e(Map<String, String> map) {
        String str;
        String str2;
        HashMap hashMap;
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (map == null || map.isEmpty()) {
            str = null;
            str2 = null;
        } else {
            str6 = map.get("clientudid");
            str = map.get("device_id");
            str2 = map.get("install_id");
        }
        if (TextUtils.isEmpty(str6) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            try {
                hashMap = new HashMap();
                try {
                    AppLog.getSSIDs(hashMap);
                    str3 = (String) hashMap.get("clientudid");
                    try {
                        str4 = (String) hashMap.get("device_id");
                        try {
                            str5 = (String) hashMap.get("install_id");
                        } catch (Throwable th) {
                            th = th;
                            str6 = str3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str6 = str3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                com.bytedance.push.g0.f.c("BDPush", "getSSIDs from applog again ");
                str6 = str3;
                str2 = str5;
                str = str4;
                map = hashMap;
            } catch (Throwable th5) {
                th = th5;
                str6 = str3;
                str2 = str5;
                str = str4;
                map = hashMap;
                com.bytedance.push.g0.f.f("BDPush", "error when getSSIDs", th);
                return TextUtils.isEmpty(str6) ? false : false;
            }
        }
        if (!TextUtils.isEmpty(str6) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        Objects.requireNonNull(com.ss.android.pushmanager.setting.c.c());
        com.ss.android.pushmanager.setting.a.a().e(map);
        return true;
    }

    public void d(com.bytedance.push.L.a aVar) {
        Objects.requireNonNull((C) C.a());
        C0679c.d(aVar.getConfiguration());
        if (this.b.getAndSet(true)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder M = e.a.a.a.a.M("initOnApplication , cur process is ");
        M.append(c().i);
        com.bytedance.push.g0.f.g("BDPush", M.toString());
        o.d().e();
        f5540e = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder M2 = e.a.a.a.a.M("init time cost:");
        M2.append(f5540e);
        com.bytedance.push.g0.f.c("BDPush", M2.toString());
        Objects.requireNonNull(c());
        boolean equals = TextUtils.equals(c().i, c().a.getPackageName());
        if (!com.ss.android.message.f.a.z(c().a)) {
            com.ss.android.message.e.e().f(new w(this, equals), 0L);
        }
        ((C) C.a()).i().h(f5540e);
    }

    public void f(Map<String, String> map, boolean z) {
        int i = com.bytedance.push.settings.h.f5806d;
        PushTraceExternalService pushTraceExternalService = PushServiceManager.get().getPushTraceExternalService();
        PushTraceSceneType pushTraceSceneType = PushTraceSceneType.ALLIANCE_WAKEUP;
        pushTraceExternalService.getTraceScene(pushTraceSceneType).enterNode(Constants.NODE_PUSH_START, "Push logic is started");
        Application application = c().a;
        boolean e2 = e(map);
        StringBuilder sb = new StringBuilder();
        sb.append("BDPush start ,isDidValid = ");
        sb.append(e2);
        sb.append(" forceUpdate = ");
        sb.append(z);
        sb.append(" cur process is ");
        e.a.a.a.a.J0(sb, c().i, "Start");
        if (e2 && com.ss.android.message.f.a.t(application)) {
            com.bytedance.push.interfaze.u a = C.a();
            if (this.f5541c.compareAndSet(false, true)) {
                com.bytedance.push.monitor.m.a aVar = (com.bytedance.push.monitor.m.a) com.ss.android.ug.bus.b.a(com.bytedance.push.monitor.m.a.class);
                if (aVar != null) {
                    aVar.start();
                }
                com.bytedance.push.J.a.h(c().a).f(((com.bytedance.push.U.a.a) ((C) C.a()).n()).o());
                PushServiceManager.get().getPushTraceExternalService().getTraceScene(pushTraceSceneType).enterNode(Constants.NODE_PUSH_START_ONCE, "startOnce logic is triggered");
                com.bytedance.common.model.c c2 = com.bytedance.common.g.a.c().e().c();
                if (c2.k) {
                    boolean checkThirdPushConfig = PushManager.inst().checkThirdPushConfig("BDPush", c().a);
                    if (checkThirdPushConfig) {
                        com.bytedance.push.g0.f.g("BDPush", "configuration correct");
                    } else {
                        com.bytedance.push.g0.f.e("BDPush", "configuration error!!!");
                    }
                    if (!checkThirdPushConfig) {
                        if (c2.o.enableExceptionInDebugModeWhenFatalError()) {
                            throw new IllegalArgumentException("configuration error，please filter \"BDPush\" in logcat to correct the error");
                        }
                        com.bytedance.push.g0.f.e("BDPush", "configuration error，please filter \"BDPush\" in logcat to correct the error");
                    }
                }
                String n = ((LocalSettings) com.bytedance.push.settings.h.b(com.ss.android.message.a.a(), LocalSettings.class)).n();
                c().F = TextUtils.isEmpty(n);
                StringBuilder M = e.a.a.a.a.M("mIsNewUser：");
                M.append(c().F);
                M.append(" pushChannelsJsonArray：");
                M.append(n);
                com.bytedance.push.g0.f.c("BDPush", M.toString());
                C c3 = (C) a;
                ((com.bytedance.push.notification.l) c3.l()).e(application, c().k);
                com.bytedance.push.g0.f.c("BDPush", "start once,delay 15s to sync notice state");
                com.ss.android.message.e.e().f(new x(this, c3, application), TimeUnit.SECONDS.toMillis(15L));
                com.bytedance.push.g0.f.c("Polling", "ready to register foreground listener");
                l lVar = (l) c3.m();
                Objects.requireNonNull(lVar);
                com.ss.android.message.e.e().f(new RunnableC0683g(lVar, application, c3), 0L);
                ((com.bytedance.push.interfaze.r) com.ss.android.ug.bus.b.a(com.bytedance.push.interfaze.r.class)).onUserActive();
                PushServiceManager.get().getIPushStatisticsExternalService().onPushStart();
                com.bytedance.push.helper.c.f(application).d(com.ss.android.pushmanager.setting.c.c().g().d0().f5843c);
                ((com.bytedance.push.a0.a.a) ((C) C.a()).h()).c();
                ((com.bytedance.push.U.a.a) ((C) C.a()).n()).u(application);
                PushServiceManager.get().getAliveMonitorService().onUserActive();
                o.d().g(application);
                if (((com.bytedance.push.U.a.a) ((C) C.a()).n()).o()) {
                    com.ss.android.message.e.e().f(new y(this, application), 1000L);
                }
                PushServiceManager.get().getIClientAiExternalService().init();
                com.bytedance.push.monitor.l.d a2 = com.bytedance.push.monitor.l.d.a();
                Objects.requireNonNull(a2);
                com.bytedance.push.g0.f.c("PushMultiProcessMonitor", "startReport");
                com.ss.android.message.e.e().a(a2);
                com.ss.android.message.e.e().b().sendEmptyMessage(4171758);
                PushServiceManager.get().getPushExternalService().triggerSignalReport(PushExternalService.SIGNAL_SCENE_APP_LAUNCH);
                PushServiceManager.get().getIAllianceService().onMainProcessStart();
                PushServiceManager.get().getIDepthsI18nExternalService().start();
                PushServiceManager.get().getIPushNotificationService().tryClearSomeNotification();
                com.bytedance.push.g0.f.c("BDPush", "[startOnce]mIsNewUser:" + c().F);
                if (c().F) {
                    if (com.bytedance.push.helper.d.c().d()) {
                        com.bytedance.push.g0.f.c("BDPush", "[startOnce]cur has foreground");
                        PushServiceManager.get().getIPermissionBootExternalService().reportDefaultNotificationStatus();
                    } else {
                        com.bytedance.push.g0.f.c("BDPush", "[startOnce]cur not has background,listen app status change");
                        com.bytedance.push.helper.d.c().addObserver(new z(this));
                    }
                }
                com.bytedance.push.f0.a.d().e(a, c().v);
                com.bytedance.push.c0.c cVar = this.f5542d;
                if (cVar != null) {
                    cVar.d();
                }
                com.bytedance.common.push.d.b(new com.bytedance.push.d0.a(c().f5617J, false));
            } else {
                com.bytedance.push.f0.a.d().c(a, c().v);
            }
            C c4 = (C) a;
            c4.i().j();
            ((E) c4.s()).j(z);
            com.bytedance.push.third.h.h().c(application, map);
        }
    }
}
