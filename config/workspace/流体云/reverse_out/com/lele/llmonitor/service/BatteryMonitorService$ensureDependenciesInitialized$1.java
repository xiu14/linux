package com.lele.llmonitor.service;
final class BatteryMonitorService$ensureDependenciesInitialized$1 extends p60 {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    synthetic Object result;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$ensureDependenciesInitialized$1(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p2)
    {
        this.result = p2;
        this.label = (this.label | -2147483648);
        return com.lele.llmonitor.service.BatteryMonitorService.access$ensureDependenciesInitialized(this.this$0, this);
    }
}
