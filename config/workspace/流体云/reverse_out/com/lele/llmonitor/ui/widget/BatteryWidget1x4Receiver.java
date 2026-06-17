package com.lele.llmonitor.ui.widget;
public final class BatteryWidget1x4Receiver extends b31 {
    public static final int $stable;
    private final q21 glanceAppWidget;

    static BatteryWidget1x4Receiver()
    {
        com.lele.llmonitor.ui.widget.BatteryWidget1x4Receiver.$stable = (b31.$stable | q21.$stable);
        return;
    }

    public BatteryWidget1x4Receiver()
    {
        this.glanceAppWidget = new com.lele.llmonitor.ui.widget.BatteryWidget();
        return;
    }

    public q21 getGlanceAppWidget()
    {
        return this.glanceAppWidget;
    }
}
