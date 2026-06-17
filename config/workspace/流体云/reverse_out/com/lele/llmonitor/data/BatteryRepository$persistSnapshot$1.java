package com.lele.llmonitor.data;
final class BatteryRepository$persistSnapshot$1 extends p60 {
    Object L$0;
    int label;
    synthetic Object result;
    final synthetic com.lele.llmonitor.data.BatteryRepository this$0;

    public BatteryRepository$persistSnapshot$1(com.lele.llmonitor.data.BatteryRepository p1, n60 p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p2)
    {
        this.result = p2;
        this.label = (this.label | -2147483648);
        return com.lele.llmonitor.data.BatteryRepository.access$persistSnapshot(this.this$0, this);
    }
}
