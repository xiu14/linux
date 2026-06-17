package com.bytedance.push.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.push.notification.h;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b {
    private final com.bytedance.push.Z.a a;
    private Handler b;

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f5762c;

        /* renamed from: com.bytedance.push.notification.b$a$a, reason: collision with other inner class name */
        class RunnableC0305a implements Runnable {
            final /* synthetic */ boolean a;

            RunnableC0305a(boolean z) {
                this.a = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.a) {
                    a aVar = a.this;
                    ((i) aVar.f5762c).a(aVar.b);
                    return;
                }
                i iVar = (i) a.this.f5762c;
                h.d dVar = iVar.f5770d;
                NotificationManager notificationManager = iVar.f5769c;
                NotificationChannel notificationChannel = iVar.a;
                Objects.requireNonNull(dVar);
                try {
                    notificationManager.createNotificationChannel(notificationChannel);
                } catch (Throwable unused) {
                }
            }
        }

        a(String str, String str2, r rVar) {
            this.a = str;
            this.b = str2;
            this.f5762c = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean a = ((com.bytedance.push.Z.b) b.this.a).a(this.a, this.b);
            if (this.f5762c == null) {
                return;
            }
            b.this.b.post(new RunnableC0305a(a));
        }
    }

    public b(com.bytedance.push.Z.a aVar) {
        this.a = aVar;
    }

    public void c(String str, String str2, r rVar) {
        if (this.b == null) {
            this.b = new Handler(Looper.getMainLooper());
        }
        com.bytedance.common.push.d.b(new a(str, str2, rVar));
    }
}
