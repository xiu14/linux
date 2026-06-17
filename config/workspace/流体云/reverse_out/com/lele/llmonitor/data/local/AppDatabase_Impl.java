package com.lele.llmonitor.data.local;
public final class AppDatabase_Impl extends com.lele.llmonitor.data.local.AppDatabase {
    public static final int $stable = 8;
    private final mq1 _batteryDao;

    public AppDatabase_Impl()
    {
        this._batteryDao = new vj3(new nb(1, this));
        return;
    }

    private static final com.lele.llmonitor.data.local.BatteryDao_Impl _batteryDao$lambda$0(com.lele.llmonitor.data.local.AppDatabase_Impl p1)
    {
        return new com.lele.llmonitor.data.local.BatteryDao_Impl(p1);
    }

    public static final synthetic void access$internalInitInvalidationTracker(com.lele.llmonitor.data.local.AppDatabase_Impl p0, my2 p1)
    {
        p0.internalInitInvalidationTracker(p1);
        return;
    }

    public static synthetic com.lele.llmonitor.data.local.BatteryDao_Impl b(com.lele.llmonitor.data.local.AppDatabase_Impl p0)
    {
        return com.lele.llmonitor.data.local.AppDatabase_Impl._batteryDao$lambda$0(p0);
    }

    public com.lele.llmonitor.data.local.BatteryDao batteryDao()
    {
        return ((com.lele.llmonitor.data.local.BatteryDao) this._batteryDao.getValue());
    }

    public void clearAllTables()
    {
        this.performClear(0, new String[] {"battery_history"}));
        return;
    }

    public java.util.List createAutoMigrations(java.util.Map p1)
    {
        p1.getClass();
        this = new java.util.ArrayList;
        this();
        return this;
    }

    public ej1 createInvalidationTracker()
    {
        return new ej1(this, new java.util.LinkedHashMap(), new java.util.LinkedHashMap(), new String[] {"battery_history"}));
    }

    public kx2 createOpenDelegate()
    {
        return new com.lele.llmonitor.data.local.AppDatabase_Impl$createOpenDelegate$_openDelegate$1(this);
    }

    public bridge synthetic lx2 createOpenDelegate()
    {
        return this.createOpenDelegate();
    }

    public java.util.Set getRequiredAutoMigrationSpecClasses()
    {
        this = new java.util.LinkedHashSet;
        this();
        return this;
    }

    public java.util.Map getRequiredTypeConverterClasses()
    {
        this = new java.util.LinkedHashMap;
        this();
        this.put(vt2.a(com.lele.llmonitor.data.local.BatteryDao), com.lele.llmonitor.data.local.BatteryDao_Impl.Companion.getRequiredConverters());
        return this;
    }
}
