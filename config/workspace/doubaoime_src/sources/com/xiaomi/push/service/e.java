package com.xiaomi.push.service;

import android.app.Notification;
import android.content.Context;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class e {
    private static List<a> a = new CopyOnWriteArrayList();

    private static class a {
        public final int a;

        /* renamed from: a, reason: collision with other field name */
        public final long f1106a;

        /* renamed from: a, reason: collision with other field name */
        public final String f1107a;

        /* renamed from: a, reason: collision with other field name */
        public final Notification.Action[] f1108a;

        a(String str, long j, int i, Notification.Action[] actionArr) {
            this.f1107a = str;
            this.f1106a = j;
            this.a = i;
            this.f1108a = actionArr;
        }
    }

    protected static void a(Context context, StatusBarNotification statusBarNotification, int i) {
        if (!com.xiaomi.push.k.m655a(context) || i <= 0 || statusBarNotification == null) {
            return;
        }
        a(new a(statusBarNotification.getKey(), SystemClock.elapsedRealtime(), i, ao.m756a(statusBarNotification.getNotification())));
    }

    private static void a(a aVar) {
        a.add(aVar);
        a();
    }

    private static void a() {
        for (int size = a.size() - 1; size >= 0; size--) {
            a aVar = a.get(size);
            if (SystemClock.elapsedRealtime() - aVar.f1106a > com.heytap.mcssdk.constant.a.r) {
                a.remove(aVar);
            }
        }
        if (a.size() > 10) {
            a.remove(0);
        }
    }
}
