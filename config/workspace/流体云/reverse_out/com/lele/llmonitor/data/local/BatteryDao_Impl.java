package com.lele.llmonitor.data.local;
public final class BatteryDao_Impl implements com.lele.llmonitor.data.local.BatteryDao {
    public static final int $stable;
    public static final com.lele.llmonitor.data.local.BatteryDao_Impl$Companion Companion;
    private final hx2 __db;
    private final xp0 __insertAdapterOfBatteryEntity;

    static BatteryDao_Impl()
    {
        com.lele.llmonitor.data.local.BatteryDao_Impl.Companion = new com.lele.llmonitor.data.local.BatteryDao_Impl$Companion(0);
        com.lele.llmonitor.data.local.BatteryDao_Impl.$stable = 8;
        return;
    }

    public BatteryDao_Impl(hx2 p1)
    {
        p1.getClass();
        this.__db = p1;
        this.__insertAdapterOfBatteryEntity = new com.lele.llmonitor.data.local.BatteryDao_Impl$1();
        return;
    }

    public static synthetic bw3 a(my2 p1)
    {
        return com.lele.llmonitor.data.local.BatteryDao_Impl.deleteAll$lambda$0("DELETE FROM battery_history", p1);
    }

    public static synthetic java.util.List b(long p1, my2 p3)
    {
        return com.lele.llmonitor.data.local.BatteryDao_Impl.getRecentHistory$lambda$0("SELECT * FROM battery_history WHERE timestamp > ? ORDER BY timestamp ASC", p1, p3);
    }

    public static synthetic bw3 c(com.lele.llmonitor.data.local.BatteryDao_Impl p0, com.lele.llmonitor.data.local.BatteryEntity p1, my2 p2)
    {
        return com.lele.llmonitor.data.local.BatteryDao_Impl.insert$lambda$0(p0, p1, p2);
    }

    private static final bw3 clearOldData$lambda$0(String p0, long p1, my2 p3)
    {
        p3.getClass();
        bw3 v0_1 = p3.v0(p0);
        try {
            v0_1.g(p1, 1);
            v0_1.l0();
            v0_1.close();
            bw3 v0_2 = bw3.a;
            return v0_2;
        } catch (Throwable v1_1) {
            v0_2.close();
            throw v1_1;
        }
    }

    public static synthetic bw3 d(long p1, my2 p3)
    {
        return com.lele.llmonitor.data.local.BatteryDao_Impl.clearOldData$lambda$0("DELETE FROM battery_history WHERE id IN (SELECT id FROM battery_history WHERE timestamp < ? LIMIT 100)", p1, p3);
    }

    private static final bw3 deleteAll$lambda$0(String p0, my2 p1)
    {
        p1.getClass();
        bw3 v0_1 = p1.v0(p0);
        try {
            v0_1.l0();
            v0_1.close();
            bw3 v0_2 = bw3.a;
            return v0_2;
        } catch (Throwable v1_1) {
            v0_2.close();
            throw v1_1;
        }
    }

    public static synthetic java.util.List e(long p1, my2 p3)
    {
        return com.lele.llmonitor.data.local.BatteryDao_Impl.getStaticHistory$lambda$0("SELECT * FROM battery_history WHERE timestamp >= ? ORDER BY timestamp ASC", p1, p3);
    }

    private static final java.util.List getRecentHistory$lambda$0(String p20, long p21, my2 p23)
    {
        p23.getClass();
        oy2 v1_1 = p23.v0(p20);
        try {
            v1_1.g(p21, 1);
            Throwable v0_1 = zc1.w(v1_1, "id");
            int v2_1 = zc1.w(v1_1, "timestamp");
            int v3_1 = zc1.w(v1_1, "level");
            int v4_1 = zc1.w(v1_1, "voltage");
            int v5_1 = zc1.w(v1_1, "current");
            int v6_1 = zc1.w(v1_1, "power");
            int v7_1 = zc1.w(v1_1, "temperature");
            java.util.ArrayList v8_1 = new java.util.ArrayList();
        } catch (Throwable v0_2) {
            v1_1.close();
            throw v0_2;
        }
        while (v1_1.l0()) {
            int v20_1 = v2_1;
            int v21_1 = v3_1;
            v8_1.add(new com.lele.llmonitor.data.local.BatteryEntity(v1_1.getLong(v0_1), v1_1.getLong(v2_1), ((int) v1_1.getLong(v3_1)), ((float) v1_1.getDouble(v4_1)), ((float) v1_1.getDouble(v5_1)), ((float) v1_1.getDouble(v6_1)), ((float) v1_1.getDouble(v7_1))));
            v2_1 = v20_1;
            v3_1 = v21_1;
        }
        v1_1.close();
        return v8_1;
    }

    private static final java.util.List getStaticHistory$lambda$0(String p20, long p21, my2 p23)
    {
        p23.getClass();
        oy2 v1_1 = p23.v0(p20);
        try {
            v1_1.g(p21, 1);
            Throwable v0_1 = zc1.w(v1_1, "id");
            int v2_1 = zc1.w(v1_1, "timestamp");
            int v3_1 = zc1.w(v1_1, "level");
            int v4_1 = zc1.w(v1_1, "voltage");
            int v5_1 = zc1.w(v1_1, "current");
            int v6_1 = zc1.w(v1_1, "power");
            int v7_1 = zc1.w(v1_1, "temperature");
            java.util.ArrayList v8_1 = new java.util.ArrayList();
        } catch (Throwable v0_2) {
            v1_1.close();
            throw v0_2;
        }
        while (v1_1.l0()) {
            int v20_1 = v2_1;
            int v21_1 = v3_1;
            v8_1.add(new com.lele.llmonitor.data.local.BatteryEntity(v1_1.getLong(v0_1), v1_1.getLong(v2_1), ((int) v1_1.getLong(v3_1)), ((float) v1_1.getDouble(v4_1)), ((float) v1_1.getDouble(v5_1)), ((float) v1_1.getDouble(v6_1)), ((float) v1_1.getDouble(v7_1))));
            v2_1 = v20_1;
            v3_1 = v21_1;
        }
        v1_1.close();
        return v8_1;
    }

    private static final bw3 insert$lambda$0(com.lele.llmonitor.data.local.BatteryDao_Impl p0, com.lele.llmonitor.data.local.BatteryEntity p1, my2 p2)
    {
        p2.getClass();
        p0.__insertAdapterOfBatteryEntity.insert(p2, p1);
        return bw3.a;
    }

    public Object clearOldData(long p3, n60 p5)
    {
        bw3 v2_2 = ni1.L(p5, this.__db, 0, 1, new h8(p3, 1));
        if (v2_2 != e80.d) {
            return bw3.a;
        } else {
            return v2_2;
        }
    }

    public Object deleteAll(n60 p4)
    {
        bw3 v3_3 = ni1.L(p4, this.__db, 0, 1, new l(13));
        if (v3_3 != e80.d) {
            return bw3.a;
        } else {
            return v3_3;
        }
    }

    public ov0 getRecentHistory(long p4)
    {
        return dd2.p(this.__db, new String[] {"battery_history"}), new h8(p4, 3));
    }

    public Object getStaticHistory(long p3, n60 p5)
    {
        return ni1.L(p5, this.__db, 1, 0, new h8(p3, 2));
    }

    public Object insert(com.lele.llmonitor.data.local.BatteryEntity p4, n60 p5)
    {
        bw3 v3_3 = ni1.L(p5, this.__db, 0, 1, new y(4, this, p4));
        if (v3_3 != e80.d) {
            return bw3.a;
        } else {
            return v3_3;
        }
    }
}
