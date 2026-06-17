package com.bytedance.push.event.sync.g;

import com.bytedance.push.C;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i extends com.bytedance.push.event.sync.g.a implements com.bytedance.push.event.sync.c {

    /* renamed from: c, reason: collision with root package name */
    private long f5686c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f5687d;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.f5687d) {
                com.bytedance.push.g0.f.c("NotificationClearReporter", "[onNotificationDelete]hasReportCurBatchClearSignal is true so cur notification clear is an all type clear,not report single clear");
            } else {
                com.bytedance.push.g0.f.c("NotificationClearReporter", "[onNotificationDelete]find single type notification clear");
                i.this.t(MonitorConstants.SINGLE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "clear_type", str);
        ((com.bytedance.push.event.sync.f) ((C) C.a()).t().getISignalReporter()).n(this.a, "clear_notification", this.b, jSONObject);
    }

    @Override // com.bytedance.push.event.sync.g.a
    String n() {
        return "clear_notification";
    }

    @Override // com.bytedance.push.event.sync.c
    public void onNotificationDelete(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.f5686c;
        StringBuilder Q = e.a.a.a.a.Q("[onNotificationDelete]notificationId:", j, " currentTimeMillis:");
        Q.append(currentTimeMillis);
        Q.append(" lastNotificationDeleteTime:");
        Q.append(this.f5686c);
        Q.append(" gap:");
        Q.append(j2);
        com.bytedance.push.g0.f.c("NotificationClearReporter", Q.toString());
        if (j2 <= 1000) {
            if (this.f5687d) {
                com.bytedance.push.g0.f.c("NotificationClearReporter", "[onNotificationDelete]do nothing because cur batch clear signal has reported");
            } else {
                com.bytedance.push.g0.f.c("NotificationClearReporter", "[onNotificationDelete]find all type notification clear");
                t("all");
            }
            this.f5687d = true;
        } else {
            com.bytedance.push.g0.f.c("NotificationClearReporter", "[onNotificationDelete]find single notification clear");
            this.f5687d = false;
            com.ss.android.message.e.e().f(new a(), 1000L);
        }
        this.f5686c = currentTimeMillis;
    }

    @Override // com.bytedance.push.event.sync.g.a
    public void p(String str, com.bytedance.push.settings.A.a.b bVar) {
        super.p(str, bVar);
        ((C) C.a()).t().registerNotificationDeleteListener(this);
    }
}
