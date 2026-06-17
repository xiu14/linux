package com.lele.llmonitor.service;
final class BatteryMonitorService$startHealthWatchdog$1$1 extends jj3 implements h11 {
    final synthetic int $plugged;
    int label;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$startHealthWatchdog$1$1(com.lele.llmonitor.service.BatteryMonitorService p1, int p2, n60 p3)
    {
        this.this$0 = p1;
        this.$plugged = p2;
        super(2, p3);
        return;
    }

    public final n60 create(Object p2, n60 p3)
    {
        return new com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1$1(this.this$0, this.$plugged, p3);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$startHealthWatchdog$1$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        int v0_0 = this.label;
        if (v0_0 == 0) {
            ib1.Q(p4);
            e80 v4_2 = this.this$0;
            int v0_1 = this.$plugged;
            if (v0_1 == 0) {
                v0_1 = 0;
            }
            Integer v2_1 = new Integer(v0_1);
            this.label = 1;
            e80 v4_1 = e80.d;
            if (com.lele.llmonitor.service.BatteryMonitorService.access$forceImmediateNotificationRefresh(v4_2, v2_1, this) == v4_1) {
                return v4_1;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p4);
            }
        }
        return bw3.a;
    }
}
