package com.lele.llmonitor.receiver;
public final class ScreenStateReceiver extends android.content.BroadcastReceiver {
    public static final int $stable = 8;

    public ScreenStateReceiver()
    {
        return;
    }

    public void onReceive(android.content.Context p2, android.content.Intent p3)
    {
        p2.getClass();
        p3.getClass();
        com.lele.llmonitor.recovery.HealthRecoveryScheduler v1_3 = p3.getAction();
        if (v1_3 != null) {
            int v3_3 = v1_3.hashCode();
            if (v3_3 == -1454123155) {
                if (!v1_3.equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
            } else {
                if ((v3_3 != 823795052) || (!v1_3.equals("android.intent.action.USER_PRESENT"))) {
                    return;
                }
            }
            com.lele.llmonitor.recovery.HealthRecoveryScheduler.kickMonitorService$default(com.lele.llmonitor.recovery.HealthRecoveryScheduler.INSTANCE, p2, 0, 2, 0);
        }
        return;
    }
}
