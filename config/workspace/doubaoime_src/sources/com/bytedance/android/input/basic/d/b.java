package com.bytedance.android.input.basic.d;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    private static final DateTimeFormatter a;
    public static final /* synthetic */ int b = 0;

    static {
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        a = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSSSS");
        System.currentTimeMillis();
        System.nanoTime();
    }

    public static final String a() {
        String format = LocalDateTime.now().format(a);
        l.e(format, "now().format(DATE_FORMATTER)");
        return format;
    }
}
