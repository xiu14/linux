package com.xiaomi.push;

import android.os.SystemClock;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public class ac {
    public static final TimeZone a = TimeZone.getTimeZone("Asia/Shanghai");

    public static final long a() {
        return Calendar.getInstance(a).getTimeInMillis();
    }

    public static final long b() {
        long a2 = (a() + 28800000) % com.heytap.mcssdk.constant.a.f6888f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > a2) {
            return elapsedRealtime - a2;
        }
        return -1L;
    }

    public static long c() {
        if (LocalDateTime.now() == null) {
            return 0L;
        }
        return (r0.getMonthValue() * 100) + (r0.getYear() * com.heytap.mcssdk.constant.a.q) + r0.getDayOfMonth();
    }
}
