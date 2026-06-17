package com.lele.llmonitor.ui.widget;
public final class BatteryWidget2x2Receiver extends b31 {
    public static final int $stable;
    private final q21 glanceAppWidget;

    static BatteryWidget2x2Receiver()
    {
        com.lele.llmonitor.ui.widget.BatteryWidget2x2Receiver.$stable = (b31.$stable | q21.$stable);
        return;
    }

    public BatteryWidget2x2Receiver()
    {
        this.glanceAppWidget = new com.lele.llmonitor.ui.widget.BatteryWidget();
        return;
    }

    public q21 getGlanceAppWidget()
    {
        return this.glanceAppWidget;
    }
}
