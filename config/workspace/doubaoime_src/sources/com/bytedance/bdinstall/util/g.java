package com.bytedance.bdinstall.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.bdinstall.AbstractC0622b;
import com.bytedance.bdinstall.Q;
import com.huawei.hms.framework.common.BundleUtil;

/* loaded from: classes.dex */
public class g extends a {
    public static final /* synthetic */ int b = 0;

    public static SharedPreferences d(Context context, Q q) {
        return q != null ? q.R() ? a.b(context) : a.a(context, String.valueOf(q.h())) : a.b(context);
    }

    public static String e() {
        return e.a("Y29tLnNzLmFuZHJvaWQuZGV2aWNlcmVnaXN0ZXIudXRpbHMuQ2RpZA==");
    }

    public static String f(AbstractC0622b abstractC0622b) {
        return a.c("ug_install_settings_pref", abstractC0622b);
    }

    public static String g(AbstractC0622b abstractC0622b, String str) {
        return e.a.a.a.a.K(new StringBuilder(), a.c("ug_install_settings_pref", abstractC0622b), BundleUtil.UNDERLINE_TAG, str);
    }
}
