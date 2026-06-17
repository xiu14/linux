package com.lele.llmonitor.service;
final class BatteryMonitorService$forceImmediateNotificationRefresh$1 extends p60 {
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    synthetic Object result;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$forceImmediateNotificationRefresh$1(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p2)
    {
        this.result = p2;
        this.label = (this.label | -2147483648);
        return com.lele.llmonitor.service.BatteryMonitorService.access$forceImmediateNotificationRefresh(this.this$0, 0, this);
    }
}
