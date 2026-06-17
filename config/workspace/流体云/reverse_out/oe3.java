public final synthetic class Loe3 implements i11 {
    public final synthetic int d;
    public final synthetic com.lele.llmonitor.data.soc.SocSnapshot e;
    public final synthetic l52 f;

    public synthetic oe3(com.lele.llmonitor.data.soc.SocSnapshot p1, l52 p2, int p3)
    {
        this.d = p3;
        this.e = p1;
        this.f = p2;
        return;
    }

    public final Object invoke(Object p2, Object p3, Object p4)
    {
        com.lele.llmonitor.data.soc.SocSnapshot v0_0 = this.d;
        int v4_2 = ((Integer) p4).intValue();
        switch (v0_0) {
            case 0:
                return com.lele.llmonitor.ui.soc.SocScreenKt.y(this.e, this.f, ((pq1) p2), ((t10) p3), v4_2);
            case 1:
                return com.lele.llmonitor.ui.soc.SocScreenKt.s(this.e, this.f, ((pq1) p2), ((t10) p3), v4_2);
            default:
                return com.lele.llmonitor.ui.soc.SocScreenKt.A(this.e, this.f, ((pq1) p2), ((t10) p3), v4_2);
        }
    }
}
