package com.lele.llmonitor.receiver;
public final class BootReceiver extends android.content.BroadcastReceiver {
    public static final int $stable = 0;
    private static final long BOOT_WINDOW_MS = 180000;
    public static final com.lele.llmonitor.receiver.BootReceiver$Companion Companion;

    static BootReceiver()
    {
        com.lele.llmonitor.receiver.BootReceiver.Companion = new com.lele.llmonitor.receiver.BootReceiver$Companion(0);
        com.lele.llmonitor.receiver.BootReceiver.$stable = 8;
        return;
    }

    public BootReceiver()
    {
        return;
    }

    private final boolean isAppForeground(android.content.Context p7)
    {
        int v6_6;
        int v6_3 = p7.getSystemService("activity");
        Object v1_0 = 0;
        if (!(v6_3 instanceof android.app.ActivityManager)) {
            v6_6 = 0;
        } else {
            v6_6 = ((android.app.ActivityManager) v6_3);
        }
        if (v6_6 != 0) {
            int v2 = android.os.Process.myPid();
            int v7_1 = p7.getPackageName();
            int v6_1 = v6_6.getRunningAppProcesses();
            if (v6_1 != 0) {
                int v6_2 = v6_1.iterator();
                while (v6_2.hasNext()) {
                    Object v3_1 = v6_2.next();
                    boolean v4_1 = ((android.app.ActivityManager$RunningAppProcessInfo) v3_1);
                    if ((v4_1.pid == v2) || (ni1.o(v4_1.processName, v7_1))) {
                        v1_0 = v3_1;
                        break;
                    }
                }
                Object v1_1 = ((android.app.ActivityManager$RunningAppProcessInfo) v1_0);
                if (v1_1 != null) {
                    if (v1_1.importance > 100) {
                        return 0;
                    } else {
                        return 1;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void onReceive(android.content.Context p5, android.content.Intent p6)
    {
        p5.getClass();
        p6.getClass();
        Class v0_5 = p6.getAction();
        try {
            if (v0_5 != null) {
                String v1_1 = v0_5.hashCode();
                if (v1_1 == -1787487905) {
                    if (!v0_5.equals("android.intent.action.QUICKBOOT_POWERON")) {
                    }
                } else {
                    if ((v1_1 != 798292259) || (!v0_5.equals("android.intent.action.BOOT_COMPLETED"))) {
                    }
                }
                com.lele.llmonitor.recovery.HealthRecoveryScheduler.INSTANCE.scheduleHealthWork(p5);
                if ((android.os.SystemClock.elapsedRealtime() <= 180000) || (!this.isAppForeground(p5))) {
                    android.content.Intent v4_2 = new android.content.Intent;
                    v4_2(p5, com.lele.llmonitor.service.BatteryMonitorService);
                    v4_2.setAction(p6.getAction());
                    p5.startForegroundService(v4_2);
                }
            }
        } catch (Exception) {
        }
        return;
    }
}
