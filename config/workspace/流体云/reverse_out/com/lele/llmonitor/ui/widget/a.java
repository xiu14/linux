package com.lele.llmonitor.ui.widget;
public final synthetic class a implements i11 {
    public final synthetic int d;
    public final synthetic int e;
    public final synthetic com.lele.llmonitor.ui.widget.WidgetThemeColors f;
    public final synthetic int g;
    public final synthetic int h;

    public synthetic a(int p1, com.lele.llmonitor.ui.widget.WidgetThemeColors p2, int p3, int p4, int p5)
    {
        this.d = p5;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        this.h = p4;
        return;
    }

    public final Object invoke(Object p9, Object p10, Object p11)
    {
        switch (this.d) {
            case 0:
                return com.lele.llmonitor.ui.widget.BatteryWidget.h(this.e, this.f, this.g, this.h, ((gy2) p9), ((t10) p10), ((Integer) p11).intValue());
            default:
                return com.lele.llmonitor.ui.widget.BatteryWidget.n(this.e, this.f, this.g, this.h, ((gy2) p9), ((t10) p10), ((Integer) p11).intValue());
        }
    }
}
