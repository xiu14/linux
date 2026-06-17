package com.ttnet.org.chromium.base;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes2.dex */
public class BundleUtils {
    static {
        new SimpleArrayMap();
        Collections.synchronizedMap(new ArrayMap());
    }

    public static boolean a(Context context, String str) {
        String[] strArr = context.getApplicationInfo().splitNames;
        return strArr != null && Arrays.asList(strArr).contains(str);
    }

    @Nullable
    @CalledByNative
    public static String getNativeLibraryPath(String str, String str2) {
        return "";
    }

    @CalledByNative
    public static boolean isBundleForNative() {
        return false;
    }
}
