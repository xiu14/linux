package com.bytedance.push.event.sync.g;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.push.settings.LocalSettings;
import com.huawei.hms.kit.awareness.Awareness;
import com.huawei.hms.kit.awareness.barrier.AwarenessBarrier;
import com.huawei.hms.kit.awareness.barrier.BarrierUpdateRequest;
import com.huawei.hms.kit.awareness.barrier.ScreenBarrier;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class f extends com.bytedance.push.event.sync.g.a {

    /* renamed from: c, reason: collision with root package name */
    private String f5677c = "screen.status.signal.screen_unlock";

    /* renamed from: d, reason: collision with root package name */
    private String f5678d = "screen.status.signal.screen_on";

    /* renamed from: e, reason: collision with root package name */
    private String f5679e = "screen.status.signal.screen_off";

    class a implements Runnable {
        final /* synthetic */ Intent a;

        a(Intent intent) {
            this.a = intent;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0104, code lost:
        
            if (r3 == 0) goto L19;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 519
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.event.sync.g.f.a.run():void");
        }
    }

    class b implements com.huawei.d.a.d {
        final /* synthetic */ String a;

        b(f fVar, String str) {
            this.a = str;
        }

        @Override // com.huawei.d.a.d
        public void a(Exception exc) {
            StringBuilder M = e.a.a.a.a.M("[addAwarenessBarrier]add barrier failed for ");
            M.append(this.a);
            M.append(" ");
            com.bytedance.push.g0.f.f("HwDeviceScreenStatusReporter", M.toString(), exc);
        }
    }

    class c implements com.huawei.d.a.e<Void> {
        final /* synthetic */ String a;

        c(f fVar, String str) {
            this.a = str;
        }

        @Override // com.huawei.d.a.e
        public void onSuccess(Void r3) {
            e.a.a.a.a.J0(e.a.a.a.a.M("[addAwarenessBarrier]add barrier success for "), this.a, "HwDeviceScreenStatusReporter");
        }
    }

    class d implements com.huawei.d.a.d {
        final /* synthetic */ String a;
        final /* synthetic */ CountDownLatch b;

        d(f fVar, String str, CountDownLatch countDownLatch) {
            this.a = str;
            this.b = countDownLatch;
        }

        @Override // com.huawei.d.a.d
        public void a(Exception exc) {
            StringBuilder M = e.a.a.a.a.M("[deleteBarrier]delete barrier failed for ");
            M.append(this.a);
            M.append(" ");
            com.bytedance.push.g0.f.f("HwDeviceScreenStatusReporter", M.toString(), exc);
            this.b.countDown();
        }
    }

    class e implements com.huawei.d.a.e<Void> {
        final /* synthetic */ String a;
        final /* synthetic */ CountDownLatch b;

        e(f fVar, String str, CountDownLatch countDownLatch) {
            this.a = str;
            this.b = countDownLatch;
        }

        @Override // com.huawei.d.a.e
        public void onSuccess(Void r3) {
            e.a.a.a.a.J0(e.a.a.a.a.M("[deleteBarrier]delete barrier success,barrierLabel:"), this.a, "HwDeviceScreenStatusReporter");
            this.b.countDown();
        }
    }

    @RequiresApi(api = 24)
    private void A(Context context, String str) {
        try {
            com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[deleteBarrier]barrierLabel:" + str);
            BarrierUpdateRequest build = new BarrierUpdateRequest.Builder().deleteBarrier(str).build();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            com.huawei.d.a.f updateBarriers = Awareness.getBarrierClient(context).updateBarriers(build);
            updateBarriers.c(new e(this, str, countDownLatch));
            updateBarriers.b(new d(this, str, countDownLatch));
            countDownLatch.await(com.heytap.mcssdk.constant.a.r, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("HwDeviceScreenStatusReporter", "error when deleteBarrier for " + str + " ,reason ", th);
        }
    }

    private long B(com.bytedance.push.R.b bVar) {
        long currentTimeMillis = System.currentTimeMillis();
        long C = com.ss.android.pushmanager.setting.c.c().e().C();
        long j = currentTimeMillis - C;
        StringBuilder Q = e.a.a.a.a.Q("[allowAddAwarenessBarrier]lastUnlockAwarenessTime:", C, " actualInterval:");
        Q.append(j);
        Q.append(" minSignalIntervalInMill:");
        Q.append(bVar.h);
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", Q.toString());
        return bVar.h - j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.push.settings.A.a.b C() {
        List<com.bytedance.push.settings.A.a.b> a2;
        com.bytedance.push.settings.A.a.f V = com.ss.android.pushmanager.setting.c.c().g().V();
        if (V == null || (a2 = V.a()) == null) {
            return null;
        }
        for (com.bytedance.push.settings.A.a.b bVar : a2) {
            if (TextUtils.equals(bVar.a, "hw_screen_status")) {
                return bVar;
            }
        }
        return null;
    }

    static void t(f fVar, String str, String str2, boolean z) {
        Objects.requireNonNull(fVar);
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[reportScreenStatusSignal]action:" + str + " triggerScene:" + str2);
        com.bytedance.push.settings.A.a.b C = fVar.C();
        if (C == null) {
            com.bytedance.push.g0.f.m("HwDeviceScreenStatusReporter", "[reportScreenStatusSignal]do nothing because signalReportConfig is null");
            fVar.q();
            return;
        }
        com.bytedance.push.R.b bVar = new com.bytedance.push.R.b(C.f5798e);
        Application a2 = com.ss.android.message.a.a();
        boolean c2 = com.bytedance.push.settings.r.b.b().c(a2);
        StringBuilder M = e.a.a.a.a.M("[reportScreenStatusSignal]unregisterForUnRiskSignal:");
        M.append(bVar.j);
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", M.toString());
        boolean z2 = false;
        if (bVar.j) {
            Boolean u = com.ss.android.message.f.a.u(a2);
            if (c2 && (u == null || !u.booleanValue())) {
                z2 = true;
            }
            StringBuilder X = e.a.a.a.a.X("[reportScreenStatusSignal]curIsRiskSignal:", z2, " unregisterForUnRiskSignal:");
            X.append(bVar.k);
            com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", X.toString());
        }
        if (!z2) {
            z2 = bVar.k;
        }
        if (z2) {
            fVar.q();
        }
        long j = c2 ? bVar.f5576c : 0L;
        StringBuilder Q = e.a.a.a.a.Q("[reportScreenStatusSignal]report signal after :", j, " killSelfDelayInMill:");
        Q.append(bVar.f5577d);
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", Q.toString());
        com.ss.android.message.e.e().f(new g(fVar, str, C, str2, z, System.currentTimeMillis(), bVar), j);
    }

    @RequiresApi(api = 24)
    private void y(Context context, String str, AwarenessBarrier awarenessBarrier, Intent intent) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, (int) (System.currentTimeMillis() % 2147483647L), intent, 134217728);
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[addAwarenessBarrier]build BarrierUpdateRequest");
        BarrierUpdateRequest build = new BarrierUpdateRequest.Builder().addBarrier(str, awarenessBarrier, broadcast).build();
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[addAwarenessBarrier]addBarrier for " + str);
        com.huawei.d.a.f updateBarriers = Awareness.getBarrierClient(context).updateBarriers(build);
        updateBarriers.c(new c(this, str));
        updateBarriers.b(new b(this, str));
        com.ss.android.pushmanager.setting.c.c().e().d0(true);
    }

    @RequiresApi(api = 24)
    private boolean z(com.bytedance.push.R.b bVar) {
        com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]");
        Application a2 = com.ss.android.message.a.a();
        try {
            if (!(!com.ss.android.pushmanager.setting.c.c().e().r())) {
                com.bytedance.push.g0.f.m("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]return false because enableAwarenessBarrier is false");
                return false;
            }
            long j = a2.getApplicationContext().getPackageManager().getPackageInfo(a2.getPackageName(), 0).firstInstallTime;
            long currentTimeMillis = System.currentTimeMillis() - j;
            com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]app install time:" + j + " appInstallDuration:" + currentTimeMillis + " minInstallTimeInMill:" + bVar.f5580g);
            if (currentTimeMillis < bVar.f5580g) {
                com.bytedance.push.g0.f.m("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]return false because appInstallTime<minInstallTimeInMill");
                return false;
            }
            if (bVar.f5579f && PushServiceManager.get().getIAllianceService().isRiskDevice(a2, bVar.i)) {
                com.bytedance.push.g0.f.m("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]return false because cur is risk Device");
                return false;
            }
            com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]return true");
            return true;
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]exception ", th);
            com.bytedance.push.g0.f.m("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]backup return false");
            return false;
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "hw_screen_status";
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void o(Intent intent) {
        super.o(intent);
        com.ss.android.message.e.e().f(new a(intent), 0L);
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        try {
            if (com.bytedance.push.g0.j.h()) {
                com.bytedance.push.R.b bVar2 = new com.bytedance.push.R.b(bVar.f5798e);
                if (!((TextUtils.isEmpty(bVar2.a) || bVar2.b == null) ? false : true)) {
                    com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[startSignalReport]hwScreenStatusSignalExtraConfig is invalid,unregister all");
                    q();
                    return;
                }
                String str2 = bVar2.a;
                com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[startSignalReport]callbackIntent:" + str2);
                if (!z(bVar2)) {
                    com.bytedance.push.g0.f.m("HwDeviceScreenStatusReporter", "[startSignalReport]do nothing because allowAddAwarenessBarrier is false");
                    q();
                    return;
                }
                long B = B(bVar2);
                if (B > 0) {
                    q();
                    com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[allowAddAwarenessBarrier]startSignalReportFromSignalCallback because cur hasBeenFrequencyControl,nextRegisterInterval:" + B);
                    String str3 = this.b;
                    com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[startSignalReportFromSignalCallback]triggerScene:" + str3);
                    try {
                        com.ss.android.message.e.e().f(new h(this, str3, bVar), B);
                        return;
                    } catch (Throwable th) {
                        com.bytedance.push.g0.f.f("HwDeviceScreenStatusReporter", "[startSignalReportFromSignalCallback]exception ", th);
                        return;
                    }
                }
                Application a2 = com.ss.android.message.a.a();
                Intent parseUri = Intent.parseUri(str2, 0);
                parseUri.setPackage(a2.getPackageName());
                parseUri.putExtra("signal_name", "hw_screen_status");
                parseUri.putExtra("trigger_scene", this.b);
                for (String str4 : bVar2.b) {
                    if (TextUtils.equals(str4, "screen_on")) {
                        y(a2, this.f5678d, ScreenBarrier.screenOn(), parseUri);
                    }
                    if (TextUtils.equals(str4, "screen_off")) {
                        y(a2, this.f5679e, ScreenBarrier.screenOff(), parseUri);
                    }
                    if (TextUtils.equals(str4, "unlock")) {
                        y(a2, this.f5677c, ScreenBarrier.screenUnlock(), parseUri);
                    }
                }
            }
        } catch (Throwable th2) {
            StringBuilder M = e.a.a.a.a.M("[startSignalReport]error:");
            M.append(th2.getLocalizedMessage());
            com.bytedance.push.g0.f.e("HwDeviceScreenStatusReporter", M.toString());
            th2.printStackTrace();
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void q() {
        super.q();
        if (com.bytedance.push.g0.j.h()) {
            LocalSettings e2 = com.ss.android.pushmanager.setting.c.c().e();
            boolean G = e2.G();
            com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[unregisterBarrier]hasBarrierHwAwarenessSignal:" + G);
            if (G) {
                A(com.ss.android.message.a.a(), this.f5678d);
                A(com.ss.android.message.a.a(), this.f5679e);
                A(com.ss.android.message.a.a(), this.f5677c);
                e2.d0(false);
            }
        }
    }
}
