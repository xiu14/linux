package com.lele.llmonitor.service;
final class BatteryMonitorService$publishVisuals$widgetUpdated$1 extends jj3 implements h11 {
    final synthetic com.lele.llmonitor.data.local.BatteryEntity $entry;
    final synthetic float $tempC;
    int I$0;
    private synthetic Object L$0;
    Object L$1;
    int label;
    final synthetic com.lele.llmonitor.service.BatteryMonitorService this$0;

    public BatteryMonitorService$publishVisuals$widgetUpdated$1(com.lele.llmonitor.service.BatteryMonitorService p1, com.lele.llmonitor.data.local.BatteryEntity p2, float p3, n60 p4)
    {
        this.this$0 = p1;
        this.$entry = p2;
        this.$tempC = p3;
        super(2, p4);
        return;
    }

    public final n60 create(Object p4, n60 p5)
    {
        com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$widgetUpdated$1 v0_1 = new com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$widgetUpdated$1(this.this$0, this.$entry, this.$tempC, p5);
        v0_1.L$0 = p4;
        return v0_1;
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.service.BatteryMonitorService$publishVisuals$widgetUpdated$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        com.lele.llmonitor.data.local.BatteryEntity v0_1 = this.label;
        try {
            if (v0_1 == null) {
                ib1.Q(p5);
                Throwable v5_5 = this.this$0;
                com.lele.llmonitor.data.local.BatteryEntity v0_2 = this.$entry;
                float v3 = this.$tempC;
                this.L$0 = 0;
                this.L$1 = 0;
                this.I$0 = 0;
                this.label = 1;
                Throwable v5_1 = e80.d;
                if (com.lele.llmonitor.service.BatteryMonitorService.access$updateWidget(v5_5, v0_2, v3, this) != v5_1) {
                    Boolean v4_4 = bw3.a;
                } else {
                    return v5_1;
                }
            } else {
                if (v0_1 != 1) {
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
                } else {
                    ib1.Q(p5);
                }
            }
        } catch (Boolean v4_5) {
            v4_4 = new cw2(v4_5);
        }
        Throwable v5_4 = dw2.a(v4_4);
        if (v5_4 != null) {
            v5_4.printStackTrace();
        }
        return Boolean.valueOf(((v4_4 instanceof cw2) ^ 1));
    }
}
