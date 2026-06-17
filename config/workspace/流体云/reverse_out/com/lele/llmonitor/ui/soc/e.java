package com.lele.llmonitor.ui.soc;
public final synthetic class e implements h11 {
    public final synthetic com.lele.llmonitor.data.soc.CpuCoreFrequencySample d;
    public final synthetic com.lele.llmonitor.ui.soc.CoreCellTypography e;
    public final synthetic m22 f;
    public final synthetic int g;
    public final synthetic int h;

    public synthetic e(com.lele.llmonitor.data.soc.CpuCoreFrequencySample p1, com.lele.llmonitor.ui.soc.CoreCellTypography p2, m22 p3, int p4, int p5)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.h = p5;
        return;
    }

    public final Object invoke(Object p8, Object p9)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.l(this.d, this.e, this.f, this.g, this.h, ((t10) p8), ((Integer) p9).intValue());
    }
}
