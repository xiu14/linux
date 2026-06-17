package com.lele.llmonitor.receiver;
public final class PowerStateReceiver extends android.content.BroadcastReceiver {
    public static final int $stable = 8;

    public PowerStateReceiver()
    {
        return;
    }

    public void onReceive(android.content.Context p3, android.content.Intent p4)
    {
        p3.getClass();
        p4.getClass();
        android.content.Intent v2_4 = p4.getAction();
        try {
            if (v2_4 != null) {
                Class v0_2 = v2_4.hashCode();
                if (v0_2 == -1886648615) {
                    if (!v2_4.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    }
                } else {
                    if ((v0_2 != 1019184907) || (!v2_4.equals("android.intent.action.ACTION_POWER_CONNECTED"))) {
                    }
                }
                com.lele.llmonitor.recovery.HealthRecoveryScheduler.INSTANCE.scheduleHealthWork(p3);
                android.content.Intent v2_3 = new android.content.Intent;
                v2_3(p3, com.lele.llmonitor.service.BatteryMonitorService);
                v2_3.setAction(p4.getAction());
                p3.startForegroundService(v2_3);
            }
        } catch (Exception) {
        }
        return;
    }
}
