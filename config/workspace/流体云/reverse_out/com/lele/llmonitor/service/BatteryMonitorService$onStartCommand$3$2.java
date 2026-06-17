package com.lele.llmonitor.service;
final class BatteryMonitorService$onStartCommand$3$2 extends jj3 implements h11 {
    final synthetic com.lele.llmonitor.data.local.BatteryEntity $entry;
    int label;

    public BatteryMonitorService$onStartCommand$3$2(com.lele.llmonitor.data.local.BatteryEntity p1, n60 p2)
    {
        this.$entry = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3$2(this.$entry, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$onStartCommand$3$2) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p3)
    {
        com.lele.llmonitor.data.local.BatteryEntity v0_0 = this.label;
        if (v0_0 == null) {
            ib1.Q(p3);
            com.lele.llmonitor.data.local.BatteryEntity v0_1 = this.$entry;
            this.label = 1;
            e80 v3_2 = e80.d;
            if (com.lele.llmonitor.data.BatteryRepository.INSTANCE.emitNewEntry(v0_1, this) == v3_2) {
                return v3_2;
            }
        } else {
            if (v0_0 != 1) {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            } else {
                ib1.Q(p3);
            }
        }
        return bw3.a;
    }
}
