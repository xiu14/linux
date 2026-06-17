package com.ttnet.org.chromium.net;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class C {
    private static final Method a;
    private static final Method b;

    static {
        try {
            a = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            b = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e2) {
            throw new RuntimeException("Unable to get TrafficStats methods", e2);
        }
    }

    public static void a() {
        try {
            b.invoke(null, new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e3);
        }
    }

    public static void b(int i) {
        try {
            a.invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e3);
        }
    }
}
