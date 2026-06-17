package com.bytedance.applog.monitor.v3;

import android.os.SystemClock;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class f {
    private static final AtomicLong a;
    private static final AtomicLong b;

    /* renamed from: c, reason: collision with root package name */
    private static final SimpleDateFormat f3835c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

    static {
        long elapsedRealtime = (((SystemClock.elapsedRealtime() / 1000) * 100) + new SecureRandom().nextInt(99)) * 100000;
        a = new AtomicLong(elapsedRealtime);
        b = new AtomicLong(elapsedRealtime);
    }

    public static String a() {
        return f3835c.format(new Date());
    }

    public static long b() {
        return b.incrementAndGet();
    }

    public static long c() {
        return a.incrementAndGet();
    }

    public static String d() {
        return String.valueOf(a.incrementAndGet());
    }
}
