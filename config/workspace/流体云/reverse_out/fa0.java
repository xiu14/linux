public final synthetic class Lfa0 implements h11 {
    public final synthetic int d;
    public final synthetic int e;
    public final synthetic Object f;
    public final synthetic Object g;
    public final synthetic Object h;
    public final synthetic Object i;
    public final synthetic Object j;

    public synthetic fa0(Object p1, Object p2, Object p3, Object p4, Object p5, int p6, int p7)
    {
        this.d = p7;
        this.f = p1;
        this.g = p2;
        this.h = p3;
        this.i = p4;
        this.j = p5;
        this.e = p6;
        return;
    }

    public synthetic fa0(String p2, com.lele.llmonitor.data.AppLanguageOption p3, String p4, java.util.List p5, d11 p6, int p7)
    {
        this.d = 3;
        this.f = p2;
        this.h = p3;
        this.g = p4;
        this.i = p5;
        this.j = p6;
        this.e = p7;
        return;
    }

    public synthetic fa0(String p2, String p3, java.util.List p4, String p5, s01 p6, int p7)
    {
        this.d = 0;
        this.f = p2;
        this.g = p3;
        this.i = p4;
        this.h = p5;
        this.j = p6;
        this.e = p7;
        return;
    }

    public final Object invoke(Object p27, Object p28)
    {
        bw3 v2 = bw3.a;
        mx v3_0 = this.e;
        a32 v4_1 = this.i;
        ka3 v5_1 = this.h;
        mu3 v6_2 = this.j;
        h11 v7_2 = this.g;
        t10 v8_3 = this.f;
        switch (this.d) {
            case 0:
                return com.lele.llmonitor.ui.dashboard.DashboardScreenKt.t(((String) this), ((String) this), ((java.util.List) this), ((String) this), ((s01) this), this.e, ((t10) p27), ((Integer) p28).intValue());
            case 1:
                bw3 v0_5 = v3_0;
                m22 v10_1 = ((m22) v8_3);
                gh v11_2 = ((gh) v7_2);
                ih v12_2 = ((ih) v5_1);
                tm0 v13_1 = ((tm0) v4_1);
                c00 v14_3 = ((c00) v6_2);
                ((Integer) p28).getClass();
                l02.f(v10_1, v11_2, v12_2, v13_1, v14_3, ((t10) p27), vc1.b0((v0_5 | 1)));
                return v2;
            case 2:
                h11 v7_0 = ((a32) v7_2);
                ka3 v5_0 = ((ka3) v5_1);
                a32 v4_0 = ((mu3) v4_1);
                mu3 v6_0 = ((h11) v6_2);
                bw3 v0_3 = v3_0;
                mx v3_1 = ((mx) v8_3);
                ((Integer) p28).getClass();
                k02.a(v3_1, v7_0, v5_0, v4_0, v6_0, ((t10) p27), vc1.b0((v0_3 | 1)));
                return v2;
            case 3:
                return com.lele.llmonitor.ui.settings.SettingsScreenKt.X(((String) this), ((com.lele.llmonitor.data.AppLanguageOption) this), ((String) this), ((java.util.List) this), ((d11) this), this.e, ((t10) p27), ((Integer) p28).intValue());
            default:
                int v9_2 = ((ps3) v8_3);
                m22 v10_3 = ((ns3) v7_2);
                tm0 v13_3 = ((fu0) v6_2);
                ((Integer) p28).getClass();
                ts3.a(v9_2, v10_3, this.h, this.i, v13_3, ((t10) p27), vc1.b0((v3_0 | 1)));
                return v2;
        }
    }
}
