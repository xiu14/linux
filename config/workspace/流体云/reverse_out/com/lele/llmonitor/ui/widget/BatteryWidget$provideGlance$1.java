package com.lele.llmonitor.ui.widget;
final class BatteryWidget$provideGlance$1 extends p60 {
    Object L$0;
    Object L$1;
    int label;
    synthetic Object result;
    final synthetic com.lele.llmonitor.ui.widget.BatteryWidget this$0;

    public BatteryWidget$provideGlance$1(com.lele.llmonitor.ui.widget.BatteryWidget p1, n60 p2)
    {
        this.this$0 = p1;
        super(p2);
        return;
    }

    public final Object invokeSuspend(Object p2)
    {
        this.result = p2;
        this.label = (this.label | -2147483648);
        return this.this$0.provideGlance(0, 0, this);
    }
}
