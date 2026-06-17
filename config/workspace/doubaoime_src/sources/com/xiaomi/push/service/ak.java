package com.xiaomi.push.service;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class ak {
    private static final String a = "ak";

    /* renamed from: a, reason: collision with other field name */
    private static volatile WeakReference<XMPushService> f1027a;

    public static synchronized void a(XMPushService xMPushService) {
        synchronized (ak.class) {
            f1027a = new WeakReference<>(xMPushService);
        }
    }
}
