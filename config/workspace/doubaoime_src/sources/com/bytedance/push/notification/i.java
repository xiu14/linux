package com.bytedance.push.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.bytedance.push.notification.h;
import java.util.Objects;

/* loaded from: classes2.dex */
class i implements r {
    final /* synthetic */ NotificationChannel a;
    final /* synthetic */ Context b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ NotificationManager f5769c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.d f5770d;

    i(h.d dVar, NotificationChannel notificationChannel, Context context, NotificationManager notificationManager) {
        this.f5770d = dVar;
        this.a = notificationChannel;
        this.b = context;
        this.f5769c = notificationManager;
    }

    @Override // com.bytedance.push.notification.r
    public void a(String str) {
        this.a.setSound(com.bytedance.push.g0.b.g(this.b, str), Notification.AUDIO_ATTRIBUTES_DEFAULT);
        h.d dVar = this.f5770d;
        NotificationManager notificationManager = this.f5769c;
        NotificationChannel notificationChannel = this.a;
        Objects.requireNonNull(dVar);
        try {
            notificationManager.createNotificationChannel(notificationChannel);
        } catch (Throwable unused) {
        }
    }
}
