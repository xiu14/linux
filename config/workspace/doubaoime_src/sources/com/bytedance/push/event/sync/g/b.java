package com.bytedance.push.event.sync.g;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.push.C;
import com.bytedance.push.event.sync.DynamicSignalReceiver;
import com.bytedance.push.event.sync.d;
import com.prolificinteractive.materialcalendarview.r;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends com.bytedance.push.event.sync.g.a {

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.push.R.e f5667c;

    /* renamed from: d, reason: collision with root package name */
    private Context f5668d;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: com.bytedance.push.event.sync.g.b$a$a, reason: collision with other inner class name */
        class C0295a implements d.a {
            C0295a() {
            }

            @Override // com.bytedance.push.event.sync.d.a
            public void a(boolean z, String str) {
                StringBuilder M = e.a.a.a.a.M("[reportSignalNow]finished report signal,actionType:");
                M.append(a.this.a);
                M.append(" result :");
                M.append(z);
                M.append(" msg:");
                e.a.a.a.a.J0(M, str, "AndroidScreenReporterAdapter");
            }
        }

        a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!b.this.t()) {
                com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", "[reportSignalNow]do nothing because initScreenStatusExtraConfig failed");
                return;
            }
            StringBuilder M = e.a.a.a.a.M("[reportSignalNow]mScreenStatusExtraConfig.listenTypeList:");
            M.append(b.this.f5667c.a);
            com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", M.toString());
            if (!b.this.f5667c.a.contains(this.a)) {
                e.a.a.a.a.J0(e.a.a.a.a.M("[reportSignalNow]not report because mScreenStatusExtraConfig.listenTypeList not contains "), this.a, "AndroidScreenReporterAdapter");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            b.this.add(jSONObject, "action_type", this.a);
            com.bytedance.push.event.sync.d iSignalReporter = ((C) C.a()).t().getISignalReporter();
            b bVar = b.this;
            com.bytedance.push.settings.A.a.b bVar2 = bVar.a;
            Objects.requireNonNull(bVar);
            ((com.bytedance.push.event.sync.f) iSignalReporter).o(bVar2, "android_screen_status", this.b, jSONObject, new C0295a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        List<com.bytedance.push.settings.A.a.b> a2;
        if (this.a != null && this.f5667c != null) {
            return true;
        }
        com.bytedance.push.settings.A.a.f V = com.ss.android.pushmanager.setting.c.c().g().V();
        if (V == null || (a2 = V.a()) == null) {
            return false;
        }
        for (com.bytedance.push.settings.A.a.b bVar : a2) {
            if (TextUtils.equals(bVar.a, "android_screen_status")) {
                this.a = bVar;
                this.f5667c = new com.bytedance.push.R.e(bVar.f5798e);
                return true;
            }
        }
        return false;
    }

    private void u(String str, String str2) {
        com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", "[reportSignalNow]triggerScene:" + str + " actionType:" + str2);
        com.ss.android.message.e.e().f(new a(str2, str), 0L);
    }

    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "android_screen_status";
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void o(Intent intent) {
        super.o(intent);
        StringBuilder M = e.a.a.a.a.M("[onReceiveSignal]action:");
        M.append(intent.getAction());
        M.append(" ");
        M.append(r.m0(intent.getExtras()));
        com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", M.toString());
        if (!t()) {
            com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", "[onReceiveSignal]do nothing because initScreenStatusExtraConfig failed");
            return;
        }
        if (TextUtils.equals("android.intent.action.SCREEN_ON", intent.getAction())) {
            u(this.b, "screen_on");
        } else if (TextUtils.equals("android.intent.action.SCREEN_OFF", intent.getAction())) {
            u(this.b, "screen_off");
        } else if (TextUtils.equals("android.intent.action.USER_PRESENT", intent.getAction())) {
            u(this.b, "user_present");
        }
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        this.f5668d = com.ss.android.message.a.a();
        DynamicSignalReceiver dynamicSignalReceiver = new DynamicSignalReceiver();
        IntentFilter intentFilter = new IntentFilter();
        com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", "[startSignalReport]listenByAndroidBroadcast");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        com.bytedance.push.g0.f.c("AndroidScreenReporterAdapter", "[startSignalReport]finished register receiver:" + com.bytedance.common.g.a.c().b().registerReceiver(this.f5668d, dynamicSignalReceiver, intentFilter));
    }
}
