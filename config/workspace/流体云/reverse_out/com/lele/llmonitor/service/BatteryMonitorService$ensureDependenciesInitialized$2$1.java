package com.lele.llmonitor.service;
final class BatteryMonitorService$ensureDependenciesInitialized$2$1 extends jj3 implements h11 {
    int label;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$ensureDependenciesInitialized$2$1(com.lele.llmonitor.service.BatteryMonitorService p1, n60 p2)
    {
        this.this$0 = p1;
        super(2, p2);
        return;
    }

    public final n60 create(Object p1, n60 p2)
    {
        return new com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$2$1(this.this$0, p2);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$ensureDependenciesInitialized$2$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p3)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p3);
            if (com.lele.llmonitor.service.BatteryMonitorService.access$getDb$p(this.this$0) == null) {
                int v3_1 = this.this$0;
                android.content.Context v1 = v3_1.getApplicationContext();
                v1.getClass();
                com.lele.llmonitor.service.BatteryMonitorService.access$setDb$p(v3_1, com.lele.llmonitor.data.local.AppDatabase.Companion.getInstance(v1));
            }
            if (com.lele.llmonitor.service.BatteryMonitorService.access$getDesignCapacity$p(this.this$0) <= 0) {
                bw3 v2_2 = this.this$0;
                android.content.Context v0_3 = v2_2.getApplicationContext();
                v0_3.getClass();
                com.lele.llmonitor.service.BatteryMonitorService.access$setDesignCapacity$p(v2_2, com.lele.llmonitor.data.BatteryEngine.INSTANCE.getBatteryDesignCapacity(v0_3));
            }
            return bw3.a;
        }
    }
}
