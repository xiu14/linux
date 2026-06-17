package com.lele.llmonitor.data.local;
public abstract class AppDatabase extends hx2 {
    public static final int $stable;
    public static final com.lele.llmonitor.data.local.AppDatabase$Companion Companion;
    private static volatile com.lele.llmonitor.data.local.AppDatabase INSTANCE;

    static AppDatabase()
    {
        com.lele.llmonitor.data.local.AppDatabase.Companion = new com.lele.llmonitor.data.local.AppDatabase$Companion(0);
        com.lele.llmonitor.data.local.AppDatabase.$stable = 8;
        return;
    }

    public AppDatabase()
    {
        return;
    }

    public static final synthetic com.lele.llmonitor.data.local.AppDatabase access$getINSTANCE$cp()
    {
        return com.lele.llmonitor.data.local.AppDatabase.INSTANCE;
    }

    public static final synthetic void access$setINSTANCE$cp(com.lele.llmonitor.data.local.AppDatabase p0)
    {
        com.lele.llmonitor.data.local.AppDatabase.INSTANCE = p0;
        return;
    }

    public abstract com.lele.llmonitor.data.local.BatteryDao batteryDao();
}
