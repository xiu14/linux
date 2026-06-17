package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;

@e
@TargetApi(18)
/* loaded from: classes2.dex */
class Api18TraceUtils {
    Api18TraceUtils() {
    }

    public static void a(String str, String str2, String str3) {
        String t = e.a.a.a.a.t(str, str2, str3);
        if (t.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder M = e.a.a.a.a.M(str);
            M.append(str2.substring(0, length));
            M.append(str3);
            t = M.toString();
        }
        Trace.beginSection(t);
    }
}
