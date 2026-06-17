package com.bytedance.push;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.trace.Constants;
import com.bytedance.android.service.manager.push.trace.PushTraceSceneType;
import com.bytedance.push.settings.AliveOnlineSettings;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    private static volatile o f5795c;
    private boolean a = false;
    private final AtomicBoolean b = new AtomicBoolean(false);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f();
        }
    }

    class b implements Runnable {
        b(o oVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            PushServiceManager.get().getIRedBadgeExternalService().startOnWorkerProcess(com.bytedance.push.P.a.a());
        }
    }

    private o() {
    }

    private void c() {
        if (this.b.getAndSet(true)) {
            return;
        }
        PushServiceManager.get().getPushTraceExternalService().getTraceScene(PushTraceSceneType.ALLIANCE_WAKEUP).enterNode(Constants.NODE_DO_ON_WORKER_PROCESS, "The logic of the worker process is executed");
        com.bytedance.push.g0.f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessLifeCycleObserver--> doOnWorkerProcess:start alliance");
        PushServiceManager.get().getIAllianceService().onWorkerApplicationStart();
        com.bytedance.push.g0.f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessLifeCycleObserver--> doOnWorkerProcess:start old red badge");
        com.ss.android.message.e.e().f(new b(this), 0L);
    }

    public static o d() {
        if (f5795c == null) {
            synchronized (o.class) {
                if (f5795c == null) {
                    f5795c = new o();
                }
            }
        }
        return f5795c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.bytedance.push.g0.f.c("ProcessLifeCycleObserver", "[onInitOnProcessIsolationProtectedMode]");
        com.bytedance.push.monitor.l.a a2 = com.bytedance.push.monitor.l.a.a();
        Application application = C0679c.a().a;
        Objects.requireNonNull(a2);
        if (com.ss.android.message.f.a.t(application) || com.ss.android.message.f.a.z(application)) {
            com.bytedance.common.d.a.b.m().q(a2);
        }
        Objects.requireNonNull(C0679c.a());
        com.bytedance.push.g0.f.c("ProcessLifeCycleObserver", "[onInitOnProcessIsolationProtectedMode]");
        com.ss.android.message.e.e().f(new p(this), 0L);
        if (com.bytedance.common.g.a.c().e().f()) {
            ((com.bytedance.push.notification.p) ((C) C.a()).p()).f(C0679c.a().a);
        } else {
            com.ss.android.message.e.e().f(new q(this), 0L);
        }
        if (com.bytedance.common.g.a.c().e().f()) {
            PushServiceManager.get().getIAllianceService().onInitOnProcessIsolationProtectedMode();
        } else {
            com.ss.android.message.e.e().f(new r(this), 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(Context context) {
        com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.MIPushMessageHandler", true);
        com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.SmpMIPushMessageHandler", false);
        com.ss.android.message.f.a.G(context, "com.xiaomi.push.service.receivers.WidgetProviderMIPushMessageHandler", false);
        com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.DataMessageCallbackService", true);
        com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.SmpDataMessageCallbackService", false);
        com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.CompatibleDataMessageCallbackService", true);
        com.ss.android.message.f.a.G(context, "com.heytap.msp.push.service.SmpCompatibleDataMessageCallbackService", false);
    }

    public void e() {
        com.bytedance.push.g0.f.i(C0679c.a().a, C0679c.a().G, C0679c.a().H);
        com.ss.android.message.a.b(C0679c.a().a);
        com.bytedance.push.g0.f.g("ProcessLifeCycleObserver", "[onInit]");
        com.ss.android.message.e.e().f(new s(this), 0L);
        Objects.requireNonNull(C0679c.a());
        com.bytedance.push.T.a aVar = new com.bytedance.push.T.a(C0679c.a());
        ((C) C.a()).w(C0679c.a(), aVar);
        com.bytedance.common.g.a.c().e().d(C0679c.a().b());
        if (com.bytedance.common.g.a.c().e().e()) {
            int i = com.bytedance.push.settings.h.f5806d;
        }
        ((C) C.a()).r().initOnApplication(C0679c.a().a);
        com.bytedance.push.g0.f.j(C0679c.a().f5621f);
        com.bytedance.push.g0.f.k(C0679c.a().f5622g);
        Objects.requireNonNull(C0679c.a());
        if (!TextUtils.isEmpty(C0679c.a().o)) {
            com.ss.android.g.a.b(C0679c.a().o);
        }
        com.ss.android.message.f.a.H(C0679c.a().i);
        com.bytedance.push.P.b.a();
        C.y().init();
        if (com.bytedance.common.g.a.c().e().e() && com.ss.android.message.f.a.t(C0679c.a().a)) {
            if (((com.bytedance.push.U.a.a) ((C) C.a()).n()).q(C0679c.a().a)) {
                this.a = true;
            }
        }
        Objects.requireNonNull(C0679c.a());
        com.bytedance.push.g0.f.g("ProcessLifeCycleObserver", "[onInitDelay]");
        Objects.requireNonNull(C0679c.a());
        if (C0679c.a().w != null) {
            com.ss.android.ug.bus.b.b(com.bytedance.push.monitor.m.a.class, C0679c.a().w);
            C0679c.a().w.i();
        }
        PushServiceManager.get().getPushExternalService().getIMultiProcessMonitor().init(C0679c.a().a);
        PushServiceManager.get().getPushTraceExternalService().getTraceScene(PushTraceSceneType.ALLIANCE_WAKEUP).enterNode(Constants.NODE_PROCESS_START, "process start");
        com.bytedance.push.third.h.h().i(C0679c.a().l);
        com.bytedance.push.third.h.h().g(C0679c.a().a, com.bytedance.push.P.a.a());
        PushServiceManager.get().getIAllianceService().onApplicationInit(String.valueOf(C0679c.a().b), C0679c.a().a);
        if (!com.ss.android.message.f.a.z(C0679c.a().a)) {
            com.ss.android.message.e.e().f(new t(this), 0L);
        }
        com.bytedance.push.K.a.d();
        if (com.ss.android.message.f.a.z(C0679c.a().a)) {
            PushServiceManager.get().getIAllianceService().doAfterProcessIsolationProtected(new a());
        } else {
            f();
        }
        if (!com.ss.android.message.f.a.t(C0679c.a().a)) {
            if (com.ss.android.message.f.a.v(C0679c.a().a)) {
                com.bytedance.push.J.a.h(C0679c.a().a).e();
                return;
            } else {
                if (com.ss.android.message.f.a.y(C0679c.a().a)) {
                    C0679c a2 = C0679c.a();
                    com.bytedance.push.g0.f.c("ProcessLifeCycleObserver", "init of push service process");
                    com.prolificinteractive.materialcalendarview.r.f0(new n(this, a2));
                    return;
                }
                return;
            }
        }
        if (C0679c.a().u) {
            AliveOnlineSettings aliveOnlineSettings = (AliveOnlineSettings) com.bytedance.push.settings.h.b(C0679c.a().a, AliveOnlineSettings.class);
            aliveOnlineSettings.g(false);
            aliveOnlineSettings.a(false);
            aliveOnlineSettings.C(true);
            aliveOnlineSettings.P(false);
        }
        Objects.requireNonNull(C0679c.a());
        if (com.bytedance.common.g.a.c().e().e()) {
            h(C0679c.a().a);
        } else {
            com.ss.android.message.e.e().f(new v(this), 0L);
        }
        com.ss.android.message.e.e().f(new m(this), 0L);
        if (C0679c.a().L) {
            ((com.bytedance.push.X.a) ((C) C.a()).q()).b();
        }
        PushServiceManager.get().getIPermissionBootExternalService().initOnApplication();
        PushServiceManager.get().getIPushNotificationService().initIllegalNotificationMonitor();
        if (com.bytedance.common.g.a.c().e().c().o.optUidChangeByHostInvoke()) {
            if (com.bytedance.common.g.a.c().e().f()) {
                com.bytedance.push.f0.a.d().e(C.a(), C0679c.a().v);
            } else {
                com.ss.android.message.e.e().f(new u(this), 0L);
            }
        }
    }

    public void g(Context context) {
        PushServiceManager.get().getPushTraceExternalService().getTraceScene(PushTraceSceneType.ALLIANCE_WAKEUP).enterNode(Constants.NODE_LIFECYCLE_START, "Start of LifeCycle");
        com.bytedance.push.g0.f.c("ProcessLifeCycleObserver", "on com.bytedance.push.ProcessLifeCycleObserver.start");
        com.bytedance.push.third.h.h().onStart();
        PushServiceManager.get().getPullExternalService().initOnApplication();
        if (!com.ss.android.message.f.a.t(context)) {
            if (com.ss.android.message.f.a.z(context) || !((com.bytedance.push.U.a.a) ((C) C.a()).n()).q(context)) {
                return;
            }
            c();
            return;
        }
        if (!com.bytedance.common.g.a.c().e().e()) {
            this.a = ((com.bytedance.push.U.a.a) ((C) C.a()).n()).q(context);
        }
        if (this.a) {
            c();
        }
    }
}
