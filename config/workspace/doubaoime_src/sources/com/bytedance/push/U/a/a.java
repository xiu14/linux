package com.bytedance.push.U.a;

import android.content.Context;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.common.push.c;
import com.bytedance.push.A;
import com.bytedance.push.C;
import com.bytedance.push.C0678b;
import com.bytedance.push.E;
import com.bytedance.push.g0.f;
import com.bytedance.push.interfaze.k;
import com.ss.android.message.e;
import java.util.List;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a extends c implements k {
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private ProcessEnum f5593c;

    /* renamed from: f, reason: collision with root package name */
    private int f5596f;

    /* renamed from: g, reason: collision with root package name */
    private com.bytedance.push.settings.p.a.b f5597g;
    private long a = 300000;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5594d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5595e = false;
    private final AtomicBoolean h = new AtomicBoolean(false);

    /* renamed from: com.bytedance.push.U.a.a$a, reason: collision with other inner class name */
    class RunnableC0290a implements Runnable {
        RunnableC0290a(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess because timeout");
            Objects.requireNonNull((A) C0678b.a());
            ((a) ((C) C.a()).n()).v();
        }
    }

    class b implements Observer {
        b() {
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            if (((Boolean) obj).booleanValue()) {
                if (a.this.f5595e) {
                    f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->not startNonMainProcess because mHasStartNonMainProcess");
                } else {
                    f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess because enter background");
                    Objects.requireNonNull((A) C0678b.a());
                    ((a) ((C) C.a()).n()).v();
                }
                com.bytedance.push.K.a.d().deleteObserver(this);
            }
        }
    }

    public a(Context context) {
        this.f5596f = -1;
        this.b = context;
        if (com.bytedance.common.g.a.c().e().e()) {
            s();
        }
        if (com.bytedance.common.g.a.c().e().c().o.disableAutoStartChildProcess()) {
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerServiceset mDelayStartChildProcessMode to DELAY_UNTIL_HOST_START because com.bytedance.common.push.interfaze.IPushCommonConfiguration.disableAutoStartChildProcess is true");
            this.f5596f = 3;
        }
        init();
    }

    private void init() {
        boolean z = this.f5596f == 0;
        this.f5594d = z;
        if (z) {
            this.f5593c = ProcessEnum.PUSH;
        } else {
            this.f5593c = ProcessEnum.MAIN;
        }
        StringBuilder M = e.a.a.a.a.M("ProcessManagerService mAllowStartChildProcess is ");
        M.append(this.f5594d);
        M.append(" because mDelayStartChildProcessMode is ");
        M.append(this.f5596f);
        f.c("NON_MAIN_PROCESS_START_CONTROL", M.toString());
    }

    private void p() {
        if (com.bytedance.common.g.a.c().e().e()) {
            return;
        }
        s();
    }

    private void s() {
        StringBuilder M = e.a.a.a.a.M("[initSettingsInternal]mDelayStartChildProcessSettingsModel:");
        M.append(this.f5597g);
        f.c("ProcessManagerService", M.toString());
        if (this.f5597g == null) {
            this.f5597g = com.ss.android.pushmanager.setting.c.c().g().e();
            boolean depthsInMainProcess = PushServiceManager.get().getIAllianceService().depthsInMainProcess(this.b);
            StringBuilder X = e.a.a.a.a.X("[initSettingsInternal]depthsInMainProcess:", depthsInMainProcess, " mDelayStartChildProcessMode:");
            X.append(this.f5596f);
            f.c("ProcessManagerService", X.toString());
            if (this.f5596f == -1) {
                if (depthsInMainProcess) {
                    this.f5596f = 3;
                } else {
                    this.f5596f = this.f5597g.a;
                }
            }
            this.a = this.f5597g.b;
            init();
        }
    }

    public boolean o() {
        p();
        return this.f5594d;
    }

    public boolean q(Context context) {
        return this.f5593c == com.ss.android.message.f.a.g(context);
    }

    public ProcessEnum r(Context context) {
        return this.f5593c;
    }

    public List<Integer> t() {
        p();
        if (this.f5597g == null) {
            s();
        }
        return this.f5597g.f5818c;
    }

    public void u(Context context) {
        if (com.ss.android.message.f.a.t(context) && this.h.compareAndSet(false, true)) {
            p();
            StringBuilder M = e.a.a.a.a.M("ProcessManagerService onMainProcessStart, mDelayStartChildProcessMode is ");
            M.append(this.f5596f);
            M.append(" cur is isInBackGround:");
            M.append(com.bytedance.push.K.a.i());
            f.c("NON_MAIN_PROCESS_START_CONTROL", M.toString());
            int i = this.f5596f;
            if (i == 2 || i == 1) {
                if (i == 2) {
                    StringBuilder M2 = e.a.a.a.a.M("ProcessManagerService-->startNonMainProcess after background with timeout: ");
                    M2.append(this.a);
                    f.c("NON_MAIN_PROCESS_START_CONTROL", M2.toString());
                    e.e().f(new RunnableC0290a(this), this.a);
                }
                com.bytedance.push.K.a.d().addObserver(new b());
            }
        }
    }

    public synchronized void v() {
        if (this.f5595e) {
            return;
        }
        if (com.ss.android.message.f.a.t(this.b)) {
            this.f5595e = true;
            p();
            if (this.f5594d) {
                return;
            }
            this.f5594d = true;
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess");
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess: enableMessageReceiver");
            com.bytedance.push.J.a.h(this.b).f(true);
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess: start MessageLogClientManager");
            Context context = this.b;
            if (com.ss.android.message.f.a.t(context)) {
                com.ss.android.g.f.a.g(context);
            }
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess: start old redbadge pull strategy");
            f.c("NON_MAIN_PROCESS_START_CONTROL", "ProcessManagerService-->startNonMainProcess: try register mi_push and u_m if needed");
            ((E) ((C) C.a()).s()).g(this.b);
        }
    }
}
