package com.bytedance.android.input.basic.d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.input.fragment.settings.RunnableC0539e0;

/* loaded from: classes.dex */
public class h {
    private static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ((RunnableC0539e0) runnable).run();
        } else {
            a.post(runnable);
        }
    }
}
