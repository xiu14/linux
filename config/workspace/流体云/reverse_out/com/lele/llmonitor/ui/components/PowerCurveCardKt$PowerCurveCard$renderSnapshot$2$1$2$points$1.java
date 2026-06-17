package com.lele.llmonitor.ui.components;
final class PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1 extends jj3 implements h11 {
    final synthetic java.util.List $historySnapshot;
    final synthetic boolean $invert;
    final synthetic boolean $isDualCell;
    final synthetic long $startTime;
    int label;

    public PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1(java.util.List p1, long p2, boolean p4, boolean p5, n60 p6)
    {
        this.$historySnapshot = p1;
        this.$startTime = p2;
        this.$invert = p4;
        this.$isDualCell = p5;
        super(2, p6);
        return;
    }

    public static synthetic boolean a(com.lele.llmonitor.ui.components.PointData p0)
    {
        return com.lele.llmonitor.ui.components.PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1.invokeSuspend$lambda$2(p0);
    }

    public static synthetic com.lele.llmonitor.ui.components.PointData b(boolean p0, boolean p1, com.lele.llmonitor.data.local.BatteryEntity p2)
    {
        return com.lele.llmonitor.ui.components.PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1.invokeSuspend$lambda$1(p0, p1, p2);
    }

    public static synthetic boolean h(long p0, com.lele.llmonitor.data.local.BatteryEntity p2)
    {
        return com.lele.llmonitor.ui.components.PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1.invokeSuspend$lambda$0(p0, p2);
    }

    private static final boolean invokeSuspend$lambda$0(long p2, com.lele.llmonitor.data.local.BatteryEntity p4)
    {
        if (p4.getTimestamp() < p2) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final com.lele.llmonitor.ui.components.PointData invokeSuspend$lambda$1(boolean p3, boolean p4, com.lele.llmonitor.data.local.BatteryEntity p5)
    {
        return new com.lele.llmonitor.ui.components.PointData(p5.getTimestamp(), ((com.lele.llmonitor.data.BatteryEngine.INSTANCE.applyCurrentAdjustments(p5.getCurrent(), p3, p4) / 1148846080) * p5.getVoltage()));
    }

    private static final boolean invokeSuspend$lambda$2(com.lele.llmonitor.ui.components.PointData p1)
    {
        if (Math.abs(p1.getPower()) > 2139095039) {
            return 0;
        } else {
            return 1;
        }
    }

    public final n60 create(Object p8, n60 p9)
    {
        return new com.lele.llmonitor.ui.components.PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1(this.$historySnapshot, this.$startTime, this.$invert, this.$isDualCell, p9);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.ui.components.PowerCurveCardKt$PowerCurveCard$renderSnapshot$2$1$2$points$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p6)
    {
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p6);
            com.lele.llmonitor.ui.components.g v6_6 = this.$historySnapshot;
            v6_6.getClass();
            int v5_3 = new gs3;
            v5_3(new bu0(new yh(1, v6_6), 1, new com.lele.llmonitor.ui.components.e(this.$startTime, 0)), new com.lele.llmonitor.ui.components.f(this.$invert, this.$isDualCell));
            return b63.e0(new bu0(v5_3, 1, new com.lele.llmonitor.ui.components.g(0)));
        }
    }
}
