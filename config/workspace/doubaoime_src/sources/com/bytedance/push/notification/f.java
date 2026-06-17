package com.bytedance.push.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.bytedance.push.PushBody;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class f {
    private final com.bytedance.push.interfaze.m a;

    class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PushBody f5765c;

        a(Context context, int i, PushBody pushBody) {
            this.a = context;
            this.b = i;
            this.f5765c = pushBody;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2 = f.this.a != null && f.this.a.c(this.a, this.b, this.f5765c);
            f fVar = f.this;
            Context context = this.a;
            PushBody pushBody = this.f5765c;
            Objects.requireNonNull(fVar);
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
                int i = (int) (pushBody.w % 2147483647L);
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                if (activeNotifications != null) {
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (statusBarNotification != null && statusBarNotification.getId() == i) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                notificationManager.cancel("app_notify", i);
            } catch (Throwable th) {
                th.printStackTrace();
                z = false;
            }
            if (z || z2) {
                com.bytedance.push.Y.a aVar = (com.bytedance.push.Y.a) com.ss.android.ug.bus.b.a(com.bytedance.push.Y.a.class);
                PushBody r = aVar.r(this.f5765c.w);
                int t = aVar.t(r);
                if (t == 0) {
                    t = this.b;
                }
                f fVar2 = f.this;
                PushBody pushBody2 = this.f5765c;
                int i2 = this.b;
                Objects.requireNonNull(fVar2);
                com.bytedance.common.push.d.b(new g(fVar2, r, pushBody2, t, i2));
            }
        }
    }

    public f(com.bytedance.push.interfaze.m mVar) {
        this.a = mVar;
    }

    private void b(Context context, PushBody pushBody, List<com.bytedance.push.R.c> list, int i) {
        for (com.bytedance.push.R.c cVar : list) {
            if (cVar != null && cVar.b == pushBody.w) {
                return;
            }
        }
        com.bytedance.push.R.c cVar2 = new com.bytedance.push.R.c();
        cVar2.a = pushBody.b;
        cVar2.b = pushBody.w;
        cVar2.f5582d = i;
        cVar2.f5581c = com.ss.android.message.f.a.f();
        list.add(cVar2);
        ((LocalFrequencySettings) com.bytedance.push.settings.h.b(context, LocalFrequencySettings.class)).w0(list);
    }

    private List<com.bytedance.push.R.c> c(Context context) {
        long millis = TimeUnit.DAYS.toMillis(1L);
        ArrayList arrayList = new ArrayList();
        List<com.bytedance.push.R.c> Y = ((LocalFrequencySettings) com.bytedance.push.settings.h.b(context, LocalFrequencySettings.class)).Y();
        long f2 = com.ss.android.message.f.a.f();
        if (Y != null) {
            for (com.bytedance.push.R.c cVar : Y) {
                if (cVar != null && cVar.f5581c + millis > f2) {
                    arrayList.add(cVar);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean d(Context context, int i, PushBody pushBody) {
        List<com.bytedance.push.R.c> c2 = c(context);
        if (pushBody.w > 0) {
            b(context, pushBody, c2, i);
            new Handler(Looper.getMainLooper()).post(new a(context, i, pushBody));
            return true;
        }
        com.bytedance.push.R.c cVar = null;
        Iterator it2 = ((ArrayList) c2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            com.bytedance.push.R.c cVar2 = (com.bytedance.push.R.c) it2.next();
            if (cVar2 != null && cVar2.b == pushBody.b) {
                cVar = cVar2;
                break;
            }
        }
        if (cVar != null) {
            com.bytedance.common.push.d.b(new g(this, pushBody, null, i, cVar.f5582d));
        }
        return cVar != null;
    }
}
