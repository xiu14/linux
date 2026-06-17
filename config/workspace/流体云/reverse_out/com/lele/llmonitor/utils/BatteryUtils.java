package com.lele.llmonitor.utils;
public final class BatteryUtils {
    public static final int $stable;
    public static final com.lele.llmonitor.utils.BatteryUtils INSTANCE;

    static BatteryUtils()
    {
        com.lele.llmonitor.utils.BatteryUtils.INSTANCE = new com.lele.llmonitor.utils.BatteryUtils();
        return;
    }

    private BatteryUtils()
    {
        return;
    }

    public final String formatTimestamp(long p3)
    {
        String v2_0 = new java.text.SimpleDateFormat;
        v2_0("HH:mm", java.util.Locale.getDefault());
        String v2_1 = v2_0.format(new java.util.Date(p3));
        v2_1.getClass();
        return v2_1;
    }
}
