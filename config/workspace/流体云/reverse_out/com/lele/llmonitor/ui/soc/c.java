package com.lele.llmonitor.ui.soc;
public final synthetic class c implements i11 {
    public final synthetic String d;
    public final synthetic String e;
    public final synthetic com.lele.llmonitor.ui.soc.CoreCellTypography f;
    public final synthetic com.lele.llmonitor.data.soc.CpuCoreFrequencySample g;
    public final synthetic Float h;

    public synthetic c(String p1, String p2, com.lele.llmonitor.ui.soc.CoreCellTypography p3, com.lele.llmonitor.data.soc.CpuCoreFrequencySample p4, Float p5)
    {
        this.d = p1;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.h = p5;
        return;
    }

    public final Object invoke(Object p9, Object p10, Object p11)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.o(this.d, this.e, this.f, this.g, this.h, ((wn) p9), ((t10) p10), ((Integer) p11).intValue());
    }
}
