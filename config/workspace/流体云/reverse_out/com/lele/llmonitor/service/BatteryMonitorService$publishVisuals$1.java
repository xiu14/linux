package com.lele.llmonitor.service;
final class BatteryMonitorService$publishVisuals$1 extends p60 {
    float F$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    boolean Z$0;
    int label;
    synthetic Object result;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$publishVisuals$1(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p9)
    {
        this.result = p9;
        this.label = (this.label | -2147483648);
        return com.lele.llmonitor.service.BatteryMonitorService.access$publishVisuals(this.this$0, 0, 0, 0, 0, 0, this);
    }
}
