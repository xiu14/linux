package com.ss.android.message;

import android.app.Application;
import com.bytedance.push.g0.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a {
    private static volatile Application a;
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public static Application a() {
        return a;
    }

    public static void b(Application application) {
        if (application == null) {
            f.f("AppProvider", "AppProvider.initApp: application is null！！", new Throwable());
        } else {
            if (b.getAndSet(true)) {
                return;
            }
            a = application;
            a.registerActivityLifecycleCallbacks(com.bytedance.common.push.b.e());
        }
    }
}
