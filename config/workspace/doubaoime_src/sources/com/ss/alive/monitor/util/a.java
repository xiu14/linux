package com.ss.alive.monitor.util;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private static List<String> a;
    public static final /* synthetic */ int b = 0;

    static {
        ArrayList arrayList = new ArrayList();
        a = arrayList;
        arrayList.add("SswoActivity");
    }

    public static int a(Context context) {
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            if (powerManager == null) {
                return 0;
            }
            if (!powerManager.isInteractive()) {
                return 1;
            }
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (keyguardManager == null) {
                return 0;
            }
            return keyguardManager.inKeyguardRestrictedInputMode() ? 2 : 3;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static boolean b(Activity activity) {
        String className = activity.getComponentName().getClassName();
        for (String str : a) {
            if (com.bytedance.android.input.k.b.a.G(className, str) || className.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
