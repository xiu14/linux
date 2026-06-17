package com.ttnet.org.chromium.url;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.net.IDN;

/* loaded from: classes2.dex */
public class IDNStringUtil {
    @CalledByNative
    private static String idnToASCII(String str) {
        try {
            return IDN.toASCII(str, 2);
        } catch (Exception unused) {
            return null;
        }
    }
}
