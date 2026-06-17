package com.lele.llmonitor.data.local;
public final class AppDatabase_Impl$createOpenDelegate$_openDelegate$1 extends kx2 {
    final synthetic com.lele.llmonitor.data.local.AppDatabase_Impl this$0;

    public AppDatabase_Impl$createOpenDelegate$_openDelegate$1(com.lele.llmonitor.data.local.AppDatabase_Impl p3)
    {
        this.this$0 = p3;
        super(3, "5c1ddbf13994b871c5b6a06bbbc2d6bc", "c111edde2d2dccdb468f9dfde42ffd47");
        return;
    }

    public void createAllTables(my2 p1)
    {
        p1.getClass();
        qc1.r("CREATE TABLE IF NOT EXISTS `battery_history` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `level` INTEGER NOT NULL, `voltage` REAL NOT NULL, `current` REAL NOT NULL, `power` REAL NOT NULL, `temperature` REAL NOT NULL)", p1);
        qc1.r("CREATE INDEX IF NOT EXISTS `index_battery_history_timestamp` ON `battery_history` (`timestamp`)", p1);
        qc1.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", p1);
        qc1.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'5c1ddbf13994b871c5b6a06bbbc2d6bc\')", p1);
        return;
    }

    public void dropAllTables(my2 p1)
    {
        p1.getClass();
        qc1.r("DROP TABLE IF EXISTS `battery_history`", p1);
        return;
    }

    public void onCreate(my2 p1)
    {
        p1.getClass();
        return;
    }

    public void onOpen(my2 p1)
    {
        p1.getClass();
        com.lele.llmonitor.data.local.AppDatabase_Impl.access$internalInitInvalidationTracker(this.this$0, p1);
        return;
    }

    public void onPostMigrate(my2 p1)
    {
        p1.getClass();
        return;
    }

    public void onPreMigrate(my2 p1)
    {
        p1.getClass();
        ni1.z(p1);
        return;
    }

    public jx2 onValidateSchema(my2 p15)
    {
        p15.getClass();
        jx2 v14_0 = new java.util.LinkedHashMap;
        v14_0();
        v14_0.put("id", new rk3("id", "INTEGER", 1, 1, 0, 1));
        v14_0.put("timestamp", new rk3("timestamp", "INTEGER", 1, 0, 0, 1));
        v14_0.put("level", new rk3("level", "INTEGER", 1, 0, 0, 1));
        v14_0.put("voltage", new rk3("voltage", "REAL", 1, 0, 0, 1));
        v14_0.put("current", new rk3("current", "REAL", 1, 0, 0, 1));
        v14_0.put("power", new rk3("power", "REAL", 1, 0, 0, 1));
        v14_0.put("temperature", new rk3("temperature", "REAL", 1, 0, 0, 1));
        StringBuilder v1_10 = new java.util.LinkedHashSet();
        String v2_5 = new java.util.LinkedHashSet();
        v2_5.add(new tk3("index_battery_history_timestamp", 0, r7.L("timestamp"), r7.L("ASC")));
        int v0_6 = new uk3("battery_history", v14_0, v1_10, v2_5);
        jx2 v14_2 = if1.C("battery_history", p15);
        if (v0_6.equals(v14_2)) {
            jx2 v14_3 = new jx2;
            v14_3(0, 1);
            return v14_3;
        } else {
            StringBuilder v1_1 = new StringBuilder("battery_history(com.lele.llmonitor.data.local.BatteryEntity).\n Expected:\n");
            v1_1.append(v0_6);
            v1_1.append("\n Found:\n");
            v1_1.append(v14_2);
            return new jx2(v1_1.toString(), 0);
        }
    }
}
