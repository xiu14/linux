package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.TimeZone;

/* loaded from: classes2.dex */
class TimezoneUtils {
    private TimezoneUtils() {
    }

    @CalledByNative
    private static String getDefaultTimeZoneId() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String id = TimeZone.getDefault().getID();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return id;
    }
}
