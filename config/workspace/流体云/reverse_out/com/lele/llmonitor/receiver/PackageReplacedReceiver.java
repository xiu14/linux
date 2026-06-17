package com.lele.llmonitor.receiver;
public final class PackageReplacedReceiver extends android.content.BroadcastReceiver {
    public static final int $stable = 8;

    public PackageReplacedReceiver()
    {
        return;
    }

    public void onReceive(android.content.Context p2, android.content.Intent p3)
    {
        p2.getClass();
        p3.getClass();
        if (ni1.o(p3.getAction(), "android.intent.action.MY_PACKAGE_REPLACED")) {
            com.lele.llmonitor.recovery.HealthRecoveryScheduler v1_2 = com.lele.llmonitor.recovery.HealthRecoveryScheduler.INSTANCE;
            v1_2.scheduleHealthWork(p2);
            com.lele.llmonitor.recovery.HealthRecoveryScheduler.kickMonitorService$default(v1_2, p2, 0, 2, 0);
        }
        return;
    }
}
