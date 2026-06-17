package com.ttnet.org.chromium.base;

import android.content.Context;
import android.text.TextUtils;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class JNIUtils {
    private static Boolean a;

    @CalledByNative
    public static ClassLoader getSplitClassLoader(String str) {
        Context b = c.b();
        return (TextUtils.isEmpty(str) || !BundleUtils.a(b, str)) ? JNIUtils.class.getClassLoader() : b.getClassLoader();
    }

    @CalledByNative
    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = Boolean.FALSE;
        }
        return a.booleanValue();
    }
}
