package com.lele.llmonitor.ui.widget;
public final synthetic class d implements i11 {
    public final synthetic int d;
    public final synthetic com.lele.llmonitor.ui.widget.WidgetThemeColors e;
    public final synthetic String f;
    public final synthetic float g;

    public synthetic d(float p2, com.lele.llmonitor.ui.widget.WidgetThemeColors p3, String p4)
    {
        this.d = 0;
        this.g = p2;
        this.e = p3;
        this.f = p4;
        return;
    }

    public synthetic d(com.lele.llmonitor.ui.widget.WidgetThemeColors p2, String p3, float p4)
    {
        this.d = 1;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        return;
    }

    public final Object invoke(Object p8, Object p9, Object p10)
    {
        switch (this.d) {
            case 0:
                return com.lele.llmonitor.ui.widget.BatteryWidget.f(this.g, this.e, this.f, ((gy2) p8), ((t10) p9), ((Integer) p10).intValue());
            default:
                return com.lele.llmonitor.ui.widget.BatteryWidget.k(this.e, this.f, this.g, ((ay) p8), ((t10) p9), ((Integer) p10).intValue());
        }
    }
}
