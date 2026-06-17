package com.bytedance.ttnet.h;

import android.content.Context;
import com.bytedance.android.input.ttnet.d;
import com.bytedance.ttnet.TTNetInit;

/* loaded from: classes2.dex */
public class a {
    public static boolean a() {
        if (!(TTNetInit.ENV.RELEASE != TTNetInit.getEnv())) {
            return false;
        }
        Context c2 = ((d) TTNetInit.getTTNetDepend()).c();
        return "true".equals(c2 != null ? c2.getSharedPreferences("ttnet_debug_setting", 0).getString("x86_support", null) : null);
    }
}
