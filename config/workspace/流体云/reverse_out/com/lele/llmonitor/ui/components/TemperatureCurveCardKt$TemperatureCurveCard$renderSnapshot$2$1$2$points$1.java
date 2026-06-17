package com.lele.llmonitor.ui.components;
final class TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1 extends jj3 implements h11 {
    final synthetic java.util.List $historySnapshot;
    final synthetic long $startTime;
    int label;

    public TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1(java.util.List p1, long p2, n60 p4)
    {
        this.$historySnapshot = p1;
        this.$startTime = p2;
        super(2, p4);
        return;
    }

    public static synthetic com.lele.llmonitor.ui.components.TempPointData a(com.lele.llmonitor.data.local.BatteryEntity p0)
    {
        return com.lele.llmonitor.ui.components.TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1.invokeSuspend$lambda$2(p0);
    }

    public static synthetic boolean b(com.lele.llmonitor.data.local.BatteryEntity p0)
    {
        return com.lele.llmonitor.ui.components.TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1.invokeSuspend$lambda$1(p0);
    }

    public static synthetic boolean h(long p0, com.lele.llmonitor.data.local.BatteryEntity p2)
    {
        return com.lele.llmonitor.ui.components.TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1.invokeSuspend$lambda$0(p0, p2);
    }

    private static final boolean invokeSuspend$lambda$0(long p2, com.lele.llmonitor.data.local.BatteryEntity p4)
    {
        if (p4.getTimestamp() < p2) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final boolean invokeSuspend$lambda$1(com.lele.llmonitor.data.local.BatteryEntity p1)
    {
        if (Math.abs(p1.getTemperature()) > 2139095039) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final com.lele.llmonitor.ui.components.TempPointData invokeSuspend$lambda$2(com.lele.llmonitor.data.local.BatteryEntity p3)
    {
        return new com.lele.llmonitor.ui.components.TempPointData(p3.getTimestamp(), p3.getTemperature());
    }

    public final n60 create(Object p4, n60 p5)
    {
        return new com.lele.llmonitor.ui.components.TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1(this.$historySnapshot, this.$startTime, p5);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.ui.components.TemperatureCurveCardKt$TemperatureCurveCard$renderSnapshot$2$1$2$points$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p4)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p4);
            gs3 v4_6 = this.$historySnapshot;
            v4_6.getClass();
            int v3_2 = new bu0;
            v3_2(new yh(1, v4_6), 1, new com.lele.llmonitor.ui.components.e(this.$startTime, 1));
            bu0 v0_3 = new bu0(v3_2, 1, new com.lele.llmonitor.ui.components.g(1));
            int v3_4 = new com.lele.llmonitor.ui.components.g;
            v3_4(2);
            return b63.e0(new gs3(v0_3, v3_4));
        }
    }
}
