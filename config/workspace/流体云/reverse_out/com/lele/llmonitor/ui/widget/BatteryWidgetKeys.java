package com.lele.llmonitor.ui.widget;
public final class BatteryWidgetKeys {
    public static final int $stable;
    private static final go2 CAPACITY;
    private static final go2 CURRENT;
    public static final com.lele.llmonitor.ui.widget.BatteryWidgetKeys INSTANCE;
    private static final go2 POWER;
    private static final go2 TEMP;
    private static final go2 TEMP_FRACTION_DIGITS;
    private static final go2 TOTAL_CAPACITY;
    private static final go2 UPDATE_TIME;

    static BatteryWidgetKeys()
    {
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.INSTANCE = new com.lele.llmonitor.ui.widget.BatteryWidgetKeys();
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.POWER = new go2("power");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.CURRENT = new go2("current");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.CAPACITY = new go2("capacity");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.TOTAL_CAPACITY = new go2("total_capacity");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.TEMP = new go2("temp");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.TEMP_FRACTION_DIGITS = new go2("temp_fraction_digits");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.UPDATE_TIME = new go2("update_time");
        com.lele.llmonitor.ui.widget.BatteryWidgetKeys.$stable = 8;
        return;
    }

    private BatteryWidgetKeys()
    {
        return;
    }

    public final go2 getCAPACITY()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.CAPACITY;
    }

    public final go2 getCURRENT()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.CURRENT;
    }

    public final go2 getPOWER()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.POWER;
    }

    public final go2 getTEMP()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.TEMP;
    }

    public final go2 getTEMP_FRACTION_DIGITS()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.TEMP_FRACTION_DIGITS;
    }

    public final go2 getTOTAL_CAPACITY()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.TOTAL_CAPACITY;
    }

    public final go2 getUPDATE_TIME()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeys.UPDATE_TIME;
    }
}
