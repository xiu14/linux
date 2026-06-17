package com.lele.llmonitor.service;
public final class BatteryMonitorService$forceUpdateReceiver$1 extends android.content.BroadcastReceiver {
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$forceUpdateReceiver$1(com.lele.llmonitor.service.BatteryMonitorService p1)
    {
        this.this$0 = p1;
        return;
    }

    public void onReceive(android.content.Context p1, android.content.Intent p2)
    {
        bw3 v1_0;
        if (p2 == null) {
            v1_0 = 0;
        } else {
            v1_0 = p2.getAction();
        }
        if (ni1.o(v1_0, "com.lele.llmonitor.ACTION_FORCE_UPDATE")) {
            com.lele.llmonitor.service.BatteryMonitorService.access$getVisualRefreshScheduler$p(this.this$0).onExternalTrigger();
            com.lele.llmonitor.service.BatteryMonitorService.access$getUpdateTrigger$p(this.this$0).l(bw3.a);
        }
        return;
    }
}
