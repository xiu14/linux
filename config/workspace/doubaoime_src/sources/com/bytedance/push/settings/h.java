package com.bytedance.push.settings;

import android.content.Context;

/* loaded from: classes2.dex */
public class h {
    private static final com.bytedance.push.settings.storage.i a;
    private static final f b;

    /* renamed from: c, reason: collision with root package name */
    private static final g f5805c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5806d = 0;

    static {
        com.bytedance.push.settings.storage.i iVar = new com.bytedance.push.settings.storage.i();
        a = iVar;
        b = new f(iVar);
        f5805c = new g();
    }

    public static i a() {
        return a;
    }

    public static <T> T b(Context context, Class<T> cls) {
        if (ISettings.class.isAssignableFrom(cls)) {
            return (T) f5805c.c(context, cls);
        }
        if (ILocalSettings.class.isAssignableFrom(cls)) {
            return (T) b.b(context, cls);
        }
        throw new IllegalArgumentException("tClass must be child of ISettings or ILocalSettings");
    }
}
