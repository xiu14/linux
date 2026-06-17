public final synthetic class Ldl implements h11 {
    public final synthetic int d;
    public final synthetic Object e;
    public final synthetic Object f;
    public final synthetic Object g;
    public final synthetic Object h;

    public synthetic dl(com.lele.llmonitor.data.AppLanguageOption p2, android.content.Context p3, l52 p4, d11 p5)
    {
        this.d = 3;
        this.e = p2;
        this.g = p3;
        this.f = p4;
        this.h = p5;
        return;
    }

    public synthetic dl(m22 p2, l52 p3, c00 p4, cl p5)
    {
        this.d = 0;
        this.e = p2;
        this.f = p3;
        this.g = p4;
        this.h = p5;
        return;
    }

    public synthetic dl(mx p1, ka3 p2, mu3 p3, h11 p4, int p5)
    {
        this.d = 2;
        this.e = p1;
        this.f = p2;
        this.g = p3;
        this.h = p4;
        return;
    }

    public synthetic dl(s01 p1, m22 p2, sr1 p3, hr1 p4, int p5)
    {
        this.d = 1;
        this.f = p1;
        this.e = p2;
        this.g = p3;
        this.h = p4;
        return;
    }

    public final Object invoke(Object p17, Object p18)
    {
        bw3 v2 = bw3.a;
        ka3 v4_2 = this.h;
        int v5_4 = this.f;
        h11 v6_3 = this.g;
        s01 v0_14 = this.e;
        switch (this.d) {
            case 0:
                i41 v8_4;
                s01 v0_13 = ((m22) v0_14);
                int v5_3 = ((l52) v5_4);
                h11 v6_2 = ((c00) v6_3);
                ka3 v4_3 = ((cl) v4_2);
                xc v7_9 = ((Integer) p18).intValue();
                if ((v7_9 & 3) == 2) {
                    v8_4 = 0;
                } else {
                    v8_4 = 1;
                }
                if (!((b20) ((t10) p17)).O((v7_9 & 1), v8_4)) {
                    ((b20) ((t10) p17)).R();
                } else {
                    xc v7_12 = ((b20) ((t10) p17)).L();
                    i41 v8_5 = r10.a;
                    if (v7_12 == v8_5) {
                        v7_12 = new ub(v5_3, 1);
                        ((b20) ((t10) p17)).j0(v7_12);
                    }
                    s01 v0_15 = wm1.i0(v0_13, ((d11) v7_12));
                    xc v7_16 = sn.d(px2.f, 1);
                    xc v9_6 = Long.hashCode(((b20) ((t10) p17)).T);
                    zj2 v11_5 = ((b20) ((t10) p17)).l();
                    s01 v0_16 = jn.K(((b20) ((t10) p17)), v0_15);
                    o10.b.getClass();
                    ((b20) ((t10) p17)).c0();
                    if (!((b20) ((t10) p17)).S) {
                        ((b20) ((t10) p17)).m0();
                    } else {
                        ((b20) ((t10) p17)).k(n10.b);
                    }
                    se1.L(((b20) ((t10) p17)), n10.f, v7_16);
                    se1.L(((b20) ((t10) p17)), n10.e, v11_5);
                    se1.z(((b20) ((t10) p17)), Integer.valueOf(v9_6), n10.g);
                    se1.G(((b20) ((t10) p17)), n10.h);
                    se1.L(((b20) ((t10) p17)), n10.d, v0_16);
                    v6_2.invoke(((b20) ((t10) p17)), Integer.valueOf(0));
                    s01 v0_2 = ((b20) ((t10) p17)).L();
                    if (v0_2 == v8_5) {
                        v0_2 = new wb(v5_3, 1);
                        ((b20) ((t10) p17)).j0(v0_2);
                    }
                    v4_3.b(((s01) v0_2), ((b20) ((t10) p17)), 6);
                    ((b20) ((t10) p17)).p(1);
                }
                return v2;
            case 1:
                xc v9_4 = ((s01) v5_4);
                m22 v10_3 = ((m22) v0_14);
                zj2 v11_3 = ((sr1) v6_3);
                xc v12_2 = ((hr1) v4_2);
                ((Integer) p18).getClass();
                qc1.b(v9_4, v10_3, v11_3, v12_2, ((t10) p17), vc1.b0(1));
                return v2;
            case 2:
                mx v3_0 = ((mx) v0_14);
                int v5_0 = ((ka3) v5_4);
                h11 v6_0 = ((mu3) v6_3);
                ka3 v4_0 = ((h11) v4_2);
                ((Integer) p18).getClass();
                k02.b(v3_0, v5_0, v6_0, v4_0, ((t10) p17), vc1.b0(385));
                return v2;
            default:
                return com.lele.llmonitor.ui.settings.SettingsScreenKt.v2(((com.lele.llmonitor.data.AppLanguageOption) v0_14), ((android.content.Context) v6_3), ((l52) v5_4), ((d11) v4_2), ((t10) p17), ((Integer) p18).intValue());
        }
    }
}
