package com.lele.llmonitor.data.local;
public final class AppDatabase$Companion {

    private AppDatabase$Companion()
    {
        return;
    }

    public synthetic AppDatabase$Companion(ic0 p1)
    {
        return;
    }

    public final com.lele.llmonitor.data.local.AppDatabase getInstance(android.content.Context p3)
    {
        p3.getClass();
        int v0_2 = com.lele.llmonitor.data.local.AppDatabase.access$getINSTANCE$cp();
        if (v0_2 != 0) {
            return v0_2;
        } else {
            try {
                Throwable v3_5 = p3.getApplicationContext();
                v3_5.getClass();
                Throwable v3_1 = bd1.q(v3_5, com.lele.llmonitor.data.local.AppDatabase, "battery_db");
                v3_1.p = 0;
                v3_1.q = 1;
                Throwable v3_3 = ((com.lele.llmonitor.data.local.AppDatabase) v3_1.b());
                com.lele.llmonitor.data.local.AppDatabase.access$setINSTANCE$cp(v3_3);
                return v3_3;
            } catch (Throwable v3_4) {
                throw v3_4;
            }
        }
    }
}
