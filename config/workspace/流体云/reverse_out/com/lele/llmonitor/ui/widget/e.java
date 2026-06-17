package com.lele.llmonitor.ui.widget;
public final synthetic class e implements i11 {
    public final synthetic int d;
    public final synthetic float e;
    public final synthetic com.lele.llmonitor.ui.widget.WidgetThemeColors f;
    public final synthetic String g;
    public final synthetic float h;
    public final synthetic int i;
    public final synthetic int j;
    public final synthetic int k;

    public synthetic e(float p2, com.lele.llmonitor.ui.widget.WidgetThemeColors p3, float p4, String p5, int p6, int p7, int p8)
    {
        this.d = 0;
        this.e = p2;
        this.f = p3;
        this.h = p4;
        this.g = p5;
        this.i = p6;
        this.j = p7;
        this.k = p8;
        return;
    }

    public synthetic e(float p2, com.lele.llmonitor.ui.widget.WidgetThemeColors p3, String p4, float p5, int p6, int p7, int p8)
    {
        this.d = 1;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.h = p5;
        this.i = p6;
        this.j = p7;
        this.k = p8;
        return;
    }

    public final Object invoke(Object p12, Object p13, Object p14)
    {
        switch (this.d) {
            case 0:
                return com.lele.llmonitor.ui.widget.BatteryWidget.l(this.e, this.f, this.h, this.g, this.i, this.j, this.k, ((ay) p12), ((t10) p13), ((Integer) p14).intValue());
            default:
                return com.lele.llmonitor.ui.widget.BatteryWidget.b(this.e, this.f, this.h, this.g, this.i, this.j, this.k, ((ay) p12), ((t10) p13), ((Integer) p14).intValue());
        }
    }
}
