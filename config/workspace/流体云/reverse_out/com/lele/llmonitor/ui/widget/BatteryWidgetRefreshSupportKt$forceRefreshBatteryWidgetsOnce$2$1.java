package com.lele.llmonitor.ui.widget;
final class BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1 extends jj3 implements h11 {
    final synthetic int $currentCapacity;
    final synthetic float $displayCurrent;
    final synthetic float $displayPower;
    final synthetic float $tempC;
    final synthetic int $tempFractionDigits;
    final synthetic int $totalCapacity;
    final synthetic String $updateTimeStr;
    synthetic Object L$0;
    int label;

    public BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1(float p1, float p2, int p3, int p4, float p5, int p6, String p7, n60 p8)
    {
        this.$displayPower = p1;
        this.$displayCurrent = p2;
        this.$currentCapacity = p3;
        this.$totalCapacity = p4;
        this.$tempC = p5;
        this.$tempFractionDigits = p6;
        this.$updateTimeStr = p7;
        super(2, p8);
        return;
    }

    public final n60 create(Object p10, n60 p11)
    {
        com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1 v0_1 = new com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1(this.$displayPower, this.$displayCurrent, this.$currentCapacity, this.$totalCapacity, this.$tempC, this.$tempFractionDigits, this.$updateTimeStr, p11);
        v0_1.L$0 = p10;
        return v0_1;
    }

    public final Object invoke(a52 p1, n60 p2)
    {
        return ((com.lele.llmonitor.ui.widget.BatteryWidgetRefreshSupportKt$forceRefreshBatteryWidgetsOnce$2$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((a52) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p5)
    {
        a52 v0_1 = ((a52) this.L$0);
        if (this.label != 0) {
            h.m("call to \'resume\' before \'invoke\' with coroutine");
            return 0;
        } else {
            ib1.Q(p5);
            go2 v5_2 = com.lele.llmonitor.ui.widget.BatteryWidgetKeys.INSTANCE;
            v0_1.d(v5_2.getPOWER(), new Float(this.$displayPower));
            v0_1.d(v5_2.getCURRENT(), new Float(this.$displayCurrent));
            v0_1.d(v5_2.getCAPACITY(), new Integer(this.$currentCapacity));
            v0_1.d(v5_2.getTOTAL_CAPACITY(), new Integer(this.$totalCapacity));
            v0_1.d(v5_2.getTEMP(), new Float(this.$tempC));
            v0_1.d(v5_2.getTEMP_FRACTION_DIGITS(), new Integer(this.$tempFractionDigits));
            v0_1.d(v5_2.getUPDATE_TIME(), this.$updateTimeStr);
            return bw3.a;
        }
    }
}
