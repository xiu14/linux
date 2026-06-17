package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class TTPatternUtil {
    @CalledByNative
    public static boolean isPatternStringValid(String str) {
        try {
            Pattern.compile(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
