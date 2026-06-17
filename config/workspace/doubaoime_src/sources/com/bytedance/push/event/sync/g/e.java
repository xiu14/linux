package com.bytedance.push.event.sync.g;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.bytedance.push.C;
import com.bytedance.push.event.sync.DynamicSignalReceiver;
import com.bytedance.push.event.sync.d;
import com.huawei.hms.kit.awareness.Awareness;
import com.huawei.hms.kit.awareness.barrier.AwarenessBarrier;
import com.huawei.hms.kit.awareness.barrier.BarrierUpdateRequest;
import com.huawei.hms.kit.awareness.barrier.HeadsetBarrier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends com.bytedance.push.event.sync.g.a {

    /* renamed from: c, reason: collision with root package name */
    private long f5670c;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.push.R.a f5672e;

    /* renamed from: f, reason: collision with root package name */
    private Context f5673f;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, String> f5671d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private volatile int f5674g = 0;

    class a implements com.huawei.d.a.d {
        final /* synthetic */ String a;
        final /* synthetic */ CountDownLatch b;

        a(e eVar, String str, CountDownLatch countDownLatch) {
            this.a = str;
            this.b = countDownLatch;
        }

        @Override // com.huawei.d.a.d
        public void a(Exception exc) {
            StringBuilder M = e.a.a.a.a.M("[deleteBarrier]delete barrier failed for ");
            M.append(this.a);
            M.append(" ");
            com.bytedance.push.g0.f.f("HeadSetReporterAdapter", M.toString(), exc);
            this.b.countDown();
        }
    }

    class b implements com.huawei.d.a.e<Void> {
        final /* synthetic */ String a;
        final /* synthetic */ CountDownLatch b;

        b(e eVar, String str, CountDownLatch countDownLatch) {
            this.a = str;
            this.b = countDownLatch;
        }

        @Override // com.huawei.d.a.e
        public void onSuccess(Void r3) {
            e.a.a.a.a.J0(e.a.a.a.a.M("[deleteBarrier]delete barrier success,barrierLabel:"), this.a, "HeadSetReporterAdapter");
            this.b.countDown();
        }
    }

    class c implements com.huawei.d.a.d {
        final /* synthetic */ String a;

        c(e eVar, String str) {
            this.a = str;
        }

        @Override // com.huawei.d.a.d
        public void a(Exception exc) {
            StringBuilder M = e.a.a.a.a.M("[updateBarriers]add barrier failed，barrierLabel:");
            M.append(this.a);
            M.append(" exception:");
            M.append(exc.getLocalizedMessage());
            com.bytedance.push.g0.f.e("HeadSetReporterAdapter", M.toString());
        }
    }

    class d implements com.huawei.d.a.e<Void> {
        final /* synthetic */ String a;

        d(e eVar, String str) {
            this.a = str;
        }

        @Override // com.huawei.d.a.e
        public void onSuccess(Void r3) {
            e.a.a.a.a.J0(e.a.a.a.a.M("[updateBarriers]add barrier success，barrierLabel:"), this.a, "HeadSetReporterAdapter");
        }
    }

    /* renamed from: com.bytedance.push.event.sync.g.e$e, reason: collision with other inner class name */
    class RunnableC0296e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f5675c;

        /* renamed from: com.bytedance.push.event.sync.g.e$e$a */
        class a implements Runnable {
            final /* synthetic */ AudioManager a;

            /* renamed from: com.bytedance.push.event.sync.g.e$e$a$a, reason: collision with other inner class name */
            class C0297a implements d.a {
                C0297a() {
                }

                @Override // com.bytedance.push.event.sync.d.a
                public void a(boolean z, String str) {
                    StringBuilder M = e.a.a.a.a.M("[reportSignalNow]finished report signal,actionType:");
                    M.append(RunnableC0296e.this.a);
                    M.append(" result :");
                    M.append(z);
                    M.append(" msg:");
                    M.append(str);
                    M.append(" needKillSelfAfterSignalReport:");
                    M.append(RunnableC0296e.this.f5675c);
                    M.append(" reportingSignalCnt:");
                    M.append(e.this.f5674g);
                    com.bytedance.push.g0.f.c("HeadSetReporterAdapter", M.toString());
                    RunnableC0296e runnableC0296e = RunnableC0296e.this;
                    if (runnableC0296e.f5675c) {
                        synchronized (e.this) {
                            e eVar = e.this;
                            eVar.f5674g--;
                            if (e.this.f5674g == 0) {
                                com.ss.android.message.f.a.B();
                            }
                        }
                    }
                }
            }

            a(AudioManager audioManager) {
                this.a = audioManager;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                if (!e.this.y()) {
                    com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[reportSignalNow]do nothing because  initHeadSetStatusExtraConfig failed");
                    return;
                }
                if (!e.this.f5672e.f5574c.contains(RunnableC0296e.this.a)) {
                    e.a.a.a.a.J0(e.a.a.a.a.M("[reportSignalNow]not report because mHeadSetStatusExtraConfig.listenTypeList not contains "), RunnableC0296e.this.a, "HeadSetReporterAdapter");
                    return;
                }
                e eVar = e.this;
                AudioManager audioManager = this.a;
                Objects.requireNonNull(eVar);
                if (audioManager.isWiredHeadsetOn()) {
                    str = "wired";
                } else {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                        int profileConnectionState = defaultAdapter.getProfileConnectionState(2);
                        int profileConnectionState2 = defaultAdapter.getProfileConnectionState(1);
                        int profileConnectionState3 = defaultAdapter.getProfileConnectionState(3);
                        StringBuilder O = e.a.a.a.a.O("[getHeadSetType]a2dp:", profileConnectionState, " headset:", profileConnectionState2, " health:");
                        O.append(profileConnectionState3);
                        com.bytedance.push.g0.f.c("HeadSetReporterAdapter", O.toString());
                        if (profileConnectionState == 2) {
                            str = "wireless_a2dp";
                        } else if (profileConnectionState2 == 2) {
                            str = "wireless_headset";
                        } else if (profileConnectionState3 == 2) {
                            str = "wireless_health";
                        }
                    }
                    str = "unknown";
                }
                JSONObject jSONObject = new JSONObject();
                RunnableC0296e runnableC0296e = RunnableC0296e.this;
                e.this.add(jSONObject, "action_type", runnableC0296e.a);
                e.this.add(jSONObject, "headset_type", str);
                com.bytedance.push.event.sync.d iSignalReporter = ((C) C.a()).t().getISignalReporter();
                e eVar2 = e.this;
                com.bytedance.push.settings.A.a.b bVar = eVar2.a;
                Objects.requireNonNull(eVar2);
                ((com.bytedance.push.event.sync.f) iSignalReporter).o(bVar, "headset_status", RunnableC0296e.this.b, jSONObject, new C0297a());
            }
        }

        RunnableC0296e(String str, String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.f5675c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.ss.android.message.e.e().f(new a((AudioManager) com.ss.android.message.a.a().getSystemService("audio")), 0L);
        }
    }

    private void A(String str, String str2, boolean z) {
        com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[reportSignalNow]triggerScene:" + str + " actionType:" + str2);
        if (z) {
            synchronized (this) {
                this.f5674g++;
            }
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0296e(str2, str, z));
    }

    @RequiresApi(api = 24)
    private void B(AwarenessBarrier awarenessBarrier, PendingIntent pendingIntent, String str) {
        com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[updateBarriers]targetBarrier:" + awarenessBarrier + " barrierLabel:" + str);
        com.huawei.d.a.f updateBarriers = Awareness.getBarrierClient(this.f5673f).updateBarriers(new BarrierUpdateRequest.Builder().addBarrier(str, awarenessBarrier, pendingIntent).build());
        updateBarriers.c(new d(this, str));
        updateBarriers.b(new c(this, str));
    }

    @RequiresApi(api = 24)
    private void v(Context context, String str) {
        try {
            com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[deleteBarrier]barrierLabel:" + str);
            BarrierUpdateRequest build = new BarrierUpdateRequest.Builder().deleteBarrier(str).build();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            com.huawei.d.a.f updateBarriers = Awareness.getBarrierClient(context).updateBarriers(build);
            updateBarriers.c(new b(this, str, countDownLatch));
            updateBarriers.b(new a(this, str, countDownLatch));
            countDownLatch.await(com.heytap.mcssdk.constant.a.r, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.bytedance.push.g0.f.f("HeadSetReporterAdapter", "error when deleteBarrier for " + str + " ,reason ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        List<com.bytedance.push.settings.A.a.b> a2;
        if (this.a != null && this.f5672e != null) {
            return true;
        }
        com.bytedance.push.settings.A.a.f V = com.ss.android.pushmanager.setting.c.c().g().V();
        if (V == null || (a2 = V.a()) == null) {
            return false;
        }
        for (com.bytedance.push.settings.A.a.b bVar : a2) {
            if (TextUtils.equals(bVar.a, "headset_status")) {
                this.a = bVar;
                this.f5672e = new com.bytedance.push.R.a(bVar.f5798e);
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"[ByDesign2.5]AddPermissionForDynamicReceiver", "[ByDesign2.3]PendingIntentMutable"})
    private void z() {
        Intent intent;
        try {
            if (this.f5672e.f5574c.isEmpty()) {
                com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[listenByAwareness]do nothing because listenTypeList is empty");
                return;
            }
            String str = this.f5673f.getPackageName() + ".HEADSET_BARRIER_RECEIVER_ACTION";
            if (TextUtils.isEmpty(this.f5672e.a)) {
                com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[listenByAwareness]use local intent");
                Intent intent2 = new Intent(str);
                com.bytedance.common.g.a.c().b().registerReceiver(this.f5673f, new DynamicSignalReceiver(), new IntentFilter(str));
                intent = intent2;
            } else {
                com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[listenByAwareness]use settings intent:" + this.f5672e.a);
                intent = Intent.parseUri(this.f5672e.a, 0);
                intent.setPackage(this.f5673f.getPackageName());
            }
            intent.putExtra("signal_name", "headset_status");
            intent.putExtra("trigger_scene", this.b);
            if (this.f5672e.f5574c.contains("connecting")) {
                B(HeadsetBarrier.connecting(), PendingIntent.getBroadcast(this.f5673f, (int) (System.currentTimeMillis() % 2147483647L), intent, 134217728), "headset.connecting.barrier");
            }
            if (this.f5672e.f5574c.contains("connected")) {
                B(HeadsetBarrier.keeping(1), PendingIntent.getBroadcast(this.f5673f, (int) (System.currentTimeMillis() % 2147483647L), intent, 134217728), "headset.connected.barrier");
            }
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("[listenByAwareness]add barrier exception:");
            M.append(th.getLocalizedMessage());
            com.bytedance.push.g0.f.e("HeadSetReporterAdapter", M.toString());
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "headset_status";
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0128, code lost:
    
        if (r0 == 0) goto L37;
     */
    @Override // com.bytedance.push.event.sync.g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.event.sync.g.e.o(android.content.Intent):void");
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        this.f5673f = com.ss.android.message.a.a();
        this.f5671d.put(0, "not_connect");
        this.f5671d.put(1, "connecting");
        this.f5671d.put(2, "connected");
        this.f5672e = new com.bytedance.push.R.a(bVar.f5798e);
        DynamicSignalReceiver dynamicSignalReceiver = new DynamicSignalReceiver();
        IntentFilter intentFilter = new IntentFilter();
        if (com.bytedance.push.g0.j.h() && TextUtils.equals(this.f5672e.b, "awareness")) {
            com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[startSignalReport]listenByAwareness");
            z();
        } else {
            com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[startSignalReport]listenByAndroidBroadcast");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            com.bytedance.push.g0.f.c("HeadSetReporterAdapter", "[startSignalReport]finished register receiver:" + com.bytedance.common.g.a.c().b().registerReceiver(this.f5673f, dynamicSignalReceiver, intentFilter));
        }
        this.f5670c = System.currentTimeMillis();
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void q() {
        super.q();
        if (com.bytedance.push.g0.j.h()) {
            v(com.ss.android.message.a.a(), "headset.connecting.barrier");
            v(com.ss.android.message.a.a(), "headset.connected.barrier");
        }
    }
}
