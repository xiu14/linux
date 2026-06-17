package com.bytedance.push.J;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public interface b {
    void a(Context context, Handler handler);

    void b(Context context, boolean z);

    boolean c(Context context, String str) throws PackageManager.NameNotFoundException;
}
