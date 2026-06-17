package com.lele.llmonitor.service;
final class BatteryMonitorService$onStartCommand$2 extends jj3 implements h11 {
    int label;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$onStartCommand$2(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$2(this.this$0, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        int v0 = this.label;
        if (v0 == 0) {
            ib1.Q(p4);
            e80 v4_1 = this.this$0;
            this.label = 1;
            e80 v4_2 = e80.d;
            if (com.lele.llmonitor.service.BatteryMonitorService.forceImmediateNotificationRefresh$default(v4_1, 0, this, 1, 0) == v4_2) {
                return v4_2;
            }
        } else {
            if (v0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p4);
            }
        }
        return bw3.a;
    }
}
