package com.lele.llmonitor.ui.widget;
public final synthetic class f implements h11 {
    public final synthetic int d;
    public final synthetic com.lele.llmonitor.ui.widget.BatteryWidget e;
    public final synthetic float f;
    public final synthetic String g;
    public final synthetic int h;
    public final synthetic float i;
    public final synthetic int j;
    public final synthetic int k;
    public final synthetic com.lele.llmonitor.ui.widget.WidgetThemeColors l;
    public final synthetic int m;

    public synthetic f(com.lele.llmonitor.ui.widget.BatteryWidget p1, float p2, String p3, int p4, float p5, int p6, int p7, com.lele.llmonitor.ui.widget.WidgetThemeColors p8, int p9, int p10)
    {
        this.d = p10;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        this.h = p4;
        this.i = p5;
        this.j = p6;
        this.k = p7;
        this.l = p8;
        this.m = p9;
        return;
    }

    public final Object invoke(Object p13, Object p14)
    {
        switch (this.d) {
            case 0:
                return com.lele.llmonitor.ui.widget.BatteryWidget.i(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, ((t10) p13), ((Integer) p14).intValue());
            default:
                return com.lele.llmonitor.ui.widget.BatteryWidget.j(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, ((t10) p13), ((Integer) p14).intValue());
        }
    }
}
