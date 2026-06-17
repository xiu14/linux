public final synthetic class Lvl implements h11 {
    public final synthetic int d;
    public final synthetic com.lele.llmonitor.ui.widget.BatteryWidget e;

    public synthetic vl(com.lele.llmonitor.ui.widget.BatteryWidget p1, int p2)
    {
        this.d = p2;
        this.e = p1;
        return;
    }

    public final Object invoke(Object p2, Object p3)
    {
        int v0 = this.d;
        bw3 v1_1 = this.e;
        int v3_2 = ((Integer) p3).intValue();
        switch (v0) {
            case 0:
                return com.lele.llmonitor.ui.widget.BatteryWidget.m(v1_1, ((t10) p2), v3_2);
            default:
                return com.lele.llmonitor.ui.widget.BatteryWidget.e(v1_1, ((t10) p2), v3_2);
        }
    }
}
