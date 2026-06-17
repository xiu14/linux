package com.bytedance.push.event.sync.g;

import com.bytedance.push.C;
import com.bytedance.push.event.sync.d;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class g implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ com.bytedance.push.settings.A.a.b b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f5680c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f5681d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f5682e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.bytedance.push.R.b f5683f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f5684g;

    class a implements d.a {

        /* renamed from: com.bytedance.push.event.sync.g.g$a$a, reason: collision with other inner class name */
        class RunnableC0298a implements Runnable {
            RunnableC0298a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                f fVar = gVar.f5684g;
                com.bytedance.push.R.b bVar = gVar.f5683f;
                Objects.requireNonNull(fVar);
                com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[killSelfIfNeed]killSelfAfterSignalReport:" + bVar.f5578e);
                if (bVar.f5578e) {
                    com.ss.android.message.f.a.B();
                }
            }
        }

        a() {
        }

        @Override // com.bytedance.push.event.sync.d.a
        public void a(boolean z, String str) {
            com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", "[reportScreenStatusSignal]finished report signal,result :" + z + " msg:" + str + " allowKillSmp:" + g.this.f5681d);
            if (g.this.f5681d) {
                long currentTimeMillis = System.currentTimeMillis();
                g gVar = g.this;
                long j = currentTimeMillis - gVar.f5682e;
                long j2 = gVar.f5683f.f5577d - j;
                StringBuilder Q = e.a.a.a.a.Q("[reportScreenStatusSignal]signal report time cost:", j, " killNeedDelay:");
                Q.append(j2);
                com.bytedance.push.g0.f.c("HwDeviceScreenStatusReporter", Q.toString());
                if (j2 < 0) {
                    j2 = 0;
                }
                com.ss.android.message.e.e().f(new RunnableC0298a(), j2);
            }
        }
    }

    g(f fVar, String str, com.bytedance.push.settings.A.a.b bVar, String str2, boolean z, long j, com.bytedance.push.R.b bVar2) {
        this.f5684g = fVar;
        this.a = str;
        this.b = bVar;
        this.f5680c = str2;
        this.f5681d = z;
        this.f5682e = j;
        this.f5683f = bVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONObject jSONObject = new JSONObject();
        this.f5684g.add(jSONObject, "screen_action", this.a);
        com.bytedance.push.event.sync.d iSignalReporter = ((C) C.a()).t().getISignalReporter();
        com.bytedance.push.settings.A.a.b bVar = this.b;
        Objects.requireNonNull(this.f5684g);
        ((com.bytedance.push.event.sync.f) iSignalReporter).o(bVar, "hw_screen_status", this.f5680c, jSONObject, new a());
    }
}
