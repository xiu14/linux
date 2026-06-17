package com.ss.android.message;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.bytedance.push.g0.f;
import com.bytedance.push.third.h;
import java.util.Objects;

/* loaded from: classes2.dex */
public class NotifyService extends Service {
    public static final /* synthetic */ int a = 0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NotifyService notifyService = NotifyService.this;
            int i = NotifyService.a;
            Objects.requireNonNull(notifyService);
            try {
                h.h().d(notifyService.getApplicationContext());
            } catch (Throwable unused) {
            }
            f.c("NotifyService", "do onCreate end");
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        f.c("PushService NotifyService", "onBind");
        e.e().f(new d(this, intent), 0L);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        com.bytedance.push.J.a.h(getApplicationContext()).e();
        e.e().f(new a(), 0L);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        try {
            h.h().f();
        } catch (Exception e2) {
            try {
                e2.printStackTrace();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (f.d()) {
            f.c("PushService NotifyService", "onStartCommand");
        }
        e.e().f(new d(this, intent), 0L);
        com.ss.android.g.e.b bVar = (com.ss.android.g.e.b) com.ss.android.ug.bus.b.a(com.ss.android.g.e.b.class);
        if (bVar == null || bVar.b()) {
            return 2;
        }
        return onStartCommand;
    }
}
