package com.lele.llmonitor.ui.soc;
public final class SocScreenKt {
    private static final String UNASSIGNED_POLICY_KEY;
    private static final java.util.Map coreTypographyCache;

    static SocScreenKt()
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.UNASSIGNED_POLICY_KEY = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u672a\u5206\u7c07");
        com.lele.llmonitor.ui.soc.SocScreenKt.coreTypographyCache = new java.util.LinkedHashMap();
        return;
    }

    public static synthetic bw3 A(com.lele.llmonitor.data.soc.SocSnapshot p0, l52 p1, pq1 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 B(String p0, String p1, com.lele.llmonitor.ui.soc.CoreCellTypography p2, boolean p3, Integer p4, Integer p5, Float p6, int p7, t10 p8, int p9)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.DashboardCoreCellContent$lambda$2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic float C(Float p0)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.DashboardCoreCellContent$lambda$1$0$0(p0);
    }

    private static final void ClusterCoreSection(com.lele.llmonitor.ui.soc.PolicyClusterUi p28, boolean p29, t10 p30, int p31)
    {
        int v4_4;
        boolean v3_3 = ((b20) p30);
        ((b20) p30).a0(1448641897);
        if ((p31 & 6) != 0) {
            v4_4 = p31;
        } else {
            int v4_2;
            if (!((b20) p30).h(p28)) {
                v4_2 = 2;
            } else {
                v4_2 = 4;
            }
            v4_4 = (p31 | v4_2);
        }
        if ((p31 & 48) == 0) {
            long v5_9;
            if (!((b20) p30).g(p29)) {
                v5_9 = 16;
            } else {
                v5_9 = 32;
            }
            v4_4 |= v5_9;
        }
        long v5_11;
        if ((v4_4 & 19) == 18) {
            v5_11 = 0;
        } else {
            v5_11 = 1;
        }
        if (!((b20) p30).O((v4_4 & 1), v5_11)) {
            ((b20) p30).R();
        } else {
            int v4_13 = j22.a;
            StringBuilder v6_6 = ac3.c(v4_13, 1065353216);
            int v9_5 = xx.a(new hh(1090519040, 1, new dh(0)), px2.r, ((b20) p30), 6);
            long v10_5 = p34.x(((b20) p30));
            int v11_3 = ((b20) p30).l();
            StringBuilder v6_7 = jn.K(((b20) p30), v6_6);
            o10.b.getClass();
            int v12_3 = n10.b;
            ((b20) p30).c0();
            if (!((b20) p30).S) {
                ((b20) p30).m0();
            } else {
                ((b20) p30).k(v12_3);
            }
            long v13_3 = n10.f;
            se1.L(((b20) p30), v13_3, v9_5);
            int v9_6 = n10.e;
            se1.L(((b20) p30), v9_6, v11_3);
            int v11_4 = n10.g;
            if ((((b20) p30).S) || (!ni1.o(((b20) p30).L(), Integer.valueOf(v10_5)))) {
                ve2.v(v10_5, ((b20) p30), v10_5, v11_4);
            }
            int v2_0;
            int v1_1;
            long v10_6 = n10.d;
            se1.L(((b20) p30), v10_6, v6_7);
            if (!p29) {
                v1_1 = 1;
                v2_0 = 0;
                ((b20) p30).Y(380444931);
                ((b20) p30).p(0);
            } else {
                ((b20) p30).Y(379713610);
                int v4_16 = ac3.c(v4_13, 1065353216);
                long v5_14 = ey2.a(n54.e, px2.p, ((b20) p30), 54);
                StringBuilder v6_10 = p34.x(((b20) p30));
                int v14_5 = ((b20) p30).l();
                int v4_17 = jn.K(((b20) p30), v4_16);
                ((b20) p30).c0();
                if (!((b20) p30).S) {
                    ((b20) p30).m0();
                } else {
                    ((b20) p30).k(v12_3);
                }
                se1.L(((b20) p30), v13_3, v5_14);
                se1.L(((b20) p30), v9_6, v14_5);
                if ((((b20) p30).S) || (!ni1.o(((b20) p30).L(), Integer.valueOf(v6_10)))) {
                    ve2.v(v6_10, ((b20) p30), v6_10, v11_4);
                }
                se1.L(((b20) p30), v10_6, v4_17);
                long v5_3 = ou3.a;
                v2_0 = 0;
                yp3 v0_1 = v5_3;
                v1_1 = 1;
                bp3.b(p28.getTitle(), 0, com.lele.llmonitor.ui.theme.CardStyleSupportKt.llClassSectionTitleColor(0, ((b20) p30), 0, 1), 0, hz0.i, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p30).j(v5_3)).i, ((b20) p30), 1572864, 0, 131002);
                int v4_5 = p28.getOnlineCount();
                long v5_6 = p28.getTotalCount();
                StringBuilder v6_4 = new StringBuilder("\u5728\u7ebf ");
                v6_4.append(v4_5);
                v6_4.append(" / ");
                v6_4.append(v5_6);
                bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n(v6_4.toString()), 0, com.lele.llmonitor.ui.theme.CardStyleSupportKt.llClassSectionMetaColor(0, ((b20) p30), 0, 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p30).j(v0_1)).n, ((b20) p30), 0, 0, 131066);
                v3_3 = ((b20) p30);
                ((b20) p30).p(1);
                ((b20) p30).p(0);
            }
            com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyGrid(p28.getCores(), v3_3, v2_0);
            v3_3.p(v1_1);
        }
        yp3 v0_6 = v3_3.r();
        if (v0_6 != null) {
            v0_6.d = new com.lele.llmonitor.ui.soc.d(p28, p29, p31);
        }
        return;
    }

    private static final bw3 ClusterCoreSection$lambda$1(com.lele.llmonitor.ui.soc.PolicyClusterUi p0, boolean p1, int p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.ClusterCoreSection(p0, p1, p3, vc1.b0((p2 | 1)));
        return bw3.a;
    }

    private static final void CoreCardHeader(String p29, String p30, com.lele.llmonitor.ui.soc.CoreCellTypography p31, boolean p32, t10 p33, int p34)
    {
        long v5_0;
        com.lele.llmonitor.ui.soc.CoreCellTypography v3_1 = ((b20) p33);
        ((b20) p33).a0(-128190871);
        if ((p34 & 6) != 0) {
            v5_0 = p34;
        } else {
            long v5_3;
            if (!((b20) p33).f(p29)) {
                v5_3 = 2;
            } else {
                v5_3 = 4;
            }
            v5_0 = (v5_3 | p34);
        }
        if ((p34 & 48) == 0) {
            int v6_8;
            if (!((b20) p33).f(p30)) {
                v6_8 = 16;
            } else {
                v6_8 = 32;
            }
            v5_0 |= v6_8;
        }
        int v6_10;
        if ((p34 & 384) != 0) {
            v6_10 = p31;
        } else {
            long v7_2;
            v6_10 = p31;
            if (!((b20) p33).f(p31)) {
                v7_2 = 128;
            } else {
                v7_2 = 256;
            }
            v5_0 |= v7_2;
        }
        if ((p34 & 3072) == 0) {
            long v7_5;
            if (!((b20) p33).g(p32)) {
                v7_5 = 1024;
            } else {
                v7_5 = 2048;
            }
            v5_0 |= v7_5;
        }
        long v7_7;
        if ((v5_0 & 1171) == 1170) {
            v7_7 = 0;
        } else {
            v7_7 = 1;
        }
        if (!((b20) p33).O((v5_0 & 1), v7_7)) {
            ((b20) p33).R();
        } else {
            long v7_10 = ac3.c(j22.a, 1065353216);
            int v8_5 = ey2.a(n54.e, px2.p, ((b20) p33), 54);
            int v11_2 = p34.x(((b20) p33));
            int v12_12 = ((b20) p33).l();
            long v7_11 = jn.K(((b20) p33), v7_10);
            o10.b.getClass();
            ((b20) p33).c0();
            if (!((b20) p33).S) {
                ((b20) p33).m0();
            } else {
                ((b20) p33).k(n10.b);
            }
            se1.L(((b20) p33), n10.f, v8_5);
            se1.L(((b20) p33), n10.e, v12_12);
            if ((((b20) p33).S) || (!ni1.o(((b20) p33).L(), Integer.valueOf(v11_2)))) {
                ve2.v(v11_2, ((b20) p33), v11_2, n10.g);
            }
            int v12_4;
            se1.L(((b20) p33), n10.d, v7_11);
            long v7_12 = v6_10.getTitleSize-XSAIIZE();
            if (!p32) {
                ((b20) p33).Y(1855688234);
                v12_4 = ((mx) ((b20) p33).j(ox.a)).w;
            } else {
                ((b20) p33).Y(1855686709);
                v12_4 = ((mx) ((b20) p33).j(ox.a)).s;
            }
            ((b20) p33).p(0);
            int v26 = 0;
            int v25 = v5_0;
            bp3.b(p29, 0, v12_4, v7_12, hz0.i, se1.x(4596373779694328218), 0, 0, 1, 0, 1, 0, 0, 0, ((b20) p33), ((v5_0 & 14) | 102236160), 28032, 233130);
            v3_1 = ((b20) p33);
            if ((p30 != null) && (!hh3.w0(p30))) {
                ((b20) p33).Y(1691971022);
                bp3.b(p30, 0, ((mx) ((b20) p33).j(ox.a)).f, p31.getMetaSize-XSAIIZE(), 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, ((b20) p33), ((v25 >> 3) & 14), 28032, 233450);
                v3_1 = ((b20) p33);
                ((b20) p33).p(0);
            } else {
                ((b20) p33).Y(1692241373);
                ((b20) p33).p(0);
            }
            v3_1.p(1);
        }
        int v6_6 = v3_1.r();
        if (v6_6 != 0) {
            v6_6.d = new com.lele.llmonitor.ui.soc.b(p29, p30, p31, p32, p34);
        }
        return;
    }

    private static final bw3 CoreCardHeader$lambda$1(String p6, String p7, com.lele.llmonitor.ui.soc.CoreCellTypography p8, boolean p9, int p10, t10 p11, int p12)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.CoreCardHeader(p6, p7, p8, p9, p11, vc1.b0((p10 | 1)));
        return bw3.a;
    }

    private static final void CoreFrequencyCell(com.lele.llmonitor.data.soc.CpuCoreFrequencySample p23, com.lele.llmonitor.ui.soc.CoreCellTypography p24, m22 p25, t10 p26, int p27, int p28)
    {
        float v0_6;
        ((b20) p26).a0(2091743638);
        if ((p27 & 6) != 0) {
            v0_6 = p27;
        } else {
            float v0_4;
            if (!((b20) p26).f(p23)) {
                v0_4 = 2;
            } else {
                v0_4 = 4;
            }
            v0_6 = (v0_4 | p27);
        }
        if ((p27 & 48) == 0) {
            Float v1_5;
            if (!((b20) p26).f(p24)) {
                v1_5 = 16;
            } else {
                v1_5 = 32;
            }
            v0_6 |= v1_5;
        }
        int v2_7;
        Float v1_6 = (p28 & 4);
        if (v1_6 == null) {
            if ((p27 & 384) != 0) {
                v2_7 = p25;
            } else {
                m22 v3_2;
                v2_7 = p25;
                if (!((b20) p26).f(p25)) {
                    v3_2 = 128;
                } else {
                    v3_2 = 256;
                }
                v0_6 |= v3_2;
            }
        } else {
            v0_6 |= 384;
        }
        m22 v3_4;
        if ((v0_6 & 147) == 146) {
            v3_4 = 0;
        } else {
            v3_4 = 1;
        }
        m22 v3_0;
        if (!((b20) p26).O((v0_6 & 1), v3_4)) {
            ((b20) p26).R();
            v3_0 = v2_7;
        } else {
            int v16_1;
            if (v1_6 == null) {
                v16_1 = v2_7;
            } else {
                v16_1 = j22.a;
            }
            float v0_17;
            if (!p23.getOnline()) {
                float v0_14 = p23.getCoreId();
                int v2_9 = new StringBuilder("CPU");
                v2_9.append(v0_14);
                v2_9.append(" \u79bb\u7ebf");
                v0_17 = com.lele.llmonitor.i18n.TextI18nKt.l10n(v2_9.toString());
            } else {
                v0_17 = ve2.m("CPU", p23.getCoreId());
            }
            int v12_1 = v0_17;
            String v13 = com.lele.llmonitor.ui.soc.SocScreenKt.policyTag(p23.getPolicy());
            float v0_20 = p23.getCurrentMHz();
            Float v1_0 = 0;
            if (v0_20 != 0) {
                float v0_21 = v0_20.intValue();
                int v2_10 = p23.getMaxMHz();
                if (v2_10 != 0) {
                    if (v2_10.intValue() <= 0) {
                        v2_10 = 0;
                    }
                    if (v2_10 != 0) {
                        v1_0 = Float.valueOf(ib1.k((((float) v0_21) / ((float) v2_10.intValue())), 0, 1065353216));
                    }
                }
            }
            float v0_1 = ((b20) p26).L();
            if (v0_1 == r10.a) {
                v0_1 = new qw1(26);
                ((b20) p26).j0(v0_1);
            }
            float v0_3 = v16_1;
            com.lele.llmonitor.ui.components.HomeCardKt.HomeCard-sW7UJKQ(com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v16_1, 0, 0, 0, ((s01) v0_1), 7, 0), ((mx) ((b20) p26).j(ox.a)).a, 0, n54.K(-91063540, new com.lele.llmonitor.ui.soc.c(v12_1, v13, p24, p23, v1_0), b20 v10_1), ((b20) p26), 3072, 4);
            v3_0 = v0_3;
        }
        long v6_1 = ((b20) p26).r();
        if (v6_1 != 0) {
            v6_1.d = new com.lele.llmonitor.ui.soc.e(p23, p24, v3_0, p27, p28);
        }
        return;
    }

    private static final bw3 CoreFrequencyCell$lambda$1$0()
    {
        return bw3.a;
    }

    private static final bw3 CoreFrequencyCell$lambda$2(String p11, String p12, com.lele.llmonitor.ui.soc.CoreCellTypography p13, com.lele.llmonitor.data.soc.CpuCoreFrequencySample p14, Float p15, wn p16, t10 p17, int p18)
    {
        boolean v0_2;
        p16.getClass();
        if ((p18 & 17) == 16) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if (!((b20) p17).O((p18 & 1), v0_2)) {
            ((b20) p17).R();
        } else {
            com.lele.llmonitor.ui.soc.SocScreenKt.DashboardCoreCellContent(p11, p12, p13, p14.getOnline(), p14.getCurrentMHz(), p14.getMaxMHz(), p15, ((b20) p17), 0);
        }
        return bw3.a;
    }

    private static final bw3 CoreFrequencyCell$lambda$3(com.lele.llmonitor.data.soc.CpuCoreFrequencySample p6, com.lele.llmonitor.ui.soc.CoreCellTypography p7, m22 p8, int p9, int p10, t10 p11, int p12)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyCell(p6, p7, p8, p11, vc1.b0((p9 | 1)), p10);
        return bw3.a;
    }

    private static final void CoreFrequencyGrid(java.util.List p19, t10 p20, int p21)
    {
        at2 v2_2;
        ((b20) p20).a0(-1071417982);
        if ((p21 & 6) != 0) {
            v2_2 = p21;
        } else {
            at2 v2_1;
            if (!((b20) p20).h(p19)) {
                v2_1 = 2;
            } else {
                v2_1 = 4;
            }
            v2_2 = (v2_1 | p21);
        }
        com.lele.llmonitor.ui.soc.CoreCellTypography v3_2;
        int v9_3 = 0;
        if ((v2_2 & 3) == 2) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        if (!((b20) p20).O((v2_2 & 1), v3_2)) {
            ((b20) p20).R();
        } else {
            int v10 = com.lele.llmonitor.ui.soc.SocScreenKt.coreGridColumns(p19.size());
            at2 v2_15 = yw.r0(v10, p19);
            j22 v11_1 = ((android.content.res.Configuration) ((b20) p20).j(z7.a)).screenWidthDp;
            com.lele.llmonitor.ui.soc.CoreCellTypography v3_6 = t20.h;
            int v12_8 = ((ag0) ((b20) p20).j(v3_6));
            int v4_20 = ((hy0) ((b20) p20).j(t20.k));
            com.lele.llmonitor.ui.soc.CoreCellTypography v3_8 = ((ag0) ((b20) p20).j(v3_6));
            kq1 v6_18 = ((lo1) ((b20) p20).j(t20.n));
            int v7_14 = (((((b20) p20).f(v4_20) | ((b20) p20).f(v3_8)) | ((b20) p20).d(v6_18.ordinal())) | ((b20) p20).d(8));
            int v13_8 = ((b20) p20).L();
            int v14_2 = r10.a;
            if ((v7_14 != 0) || (v13_8 == v14_2)) {
                v13_8 = new lp3(v4_20, v3_8, v6_18);
                ((b20) p20).j0(v13_8);
            }
            int v14_1;
            int v13_10 = ((lp3) v13_8);
            com.lele.llmonitor.ui.soc.CoreCellTypography v3_12 = (((b20) p20).c(v12_8.l()) | (((b20) p20).d(v10) | ((b20) p20).d(v11_1)));
            int v4_23 = ((b20) p20).L();
            if ((v3_12 == null) && (v4_23 != v14_2)) {
                v14_1 = 1086324736;
            } else {
                v14_1 = 1086324736;
                v4_23 = com.lele.llmonitor.ui.soc.SocScreenKt.coreTypographyAdaptive-Kr38-dQ(v10, v11_1, v12_8, v13_10, 1086324736, 1090519040);
                ((b20) p20).j0(v4_23);
            }
            com.lele.llmonitor.ui.soc.CoreCellTypography v3_14 = ((com.lele.llmonitor.ui.soc.CoreCellTypography) v4_23);
            j22 v11_0 = j22.a;
            int v12_0 = 1065353216;
            int v4_0 = ac3.c(v11_0, 1065353216);
            kq1 v6_1 = xx.a(n54.c, px2.r, ((b20) p20), 0);
            int v7_1 = p34.x(((b20) p20));
            int v13_0 = ((b20) p20).l();
            int v4_1 = jn.K(((b20) p20), v4_0);
            o10.b.getClass();
            ((b20) p20).c0();
            if (!((b20) p20).S) {
                ((b20) p20).m0();
            } else {
                ((b20) p20).k(n10.b);
            }
            se1.L(((b20) p20), n10.f, v6_1);
            se1.L(((b20) p20), n10.e, v13_0);
            if ((((b20) p20).S) || (!ni1.o(((b20) p20).L(), Integer.valueOf(v7_1)))) {
                ve2.v(v7_1, ((b20) p20), v7_1, n10.g);
            }
            se1.L(((b20) p20), n10.d, v4_1);
            ((b20) p20).Y(-1873968712);
            int v8_5 = v2_15.size();
            int v4_3 = 0;
            int v13_2 = 0;
            while (v4_3 < v8_5) {
                kq1 v6_5 = v2_15.get(v4_3);
                int v15_2 = (v4_3 + 1);
                int v16 = (v13_2 + 1);
                if (v13_2 < 0) {
                    r7.e0();
                    throw 0;
                } else {
                    java.util.List v17_1 = ((java.util.List) v6_5);
                    int v4_7 = ac3.c(v11_0, v12_0);
                    kq1 v6_8 = ey2.a(new hh(v14_1, 1, new dh(v9_3)), px2.o, ((b20) p20), 6);
                    int v7_5 = p34.x(((b20) p20));
                    int v9_4 = ((b20) p20).l();
                    int v4_8 = jn.K(((b20) p20), v4_7);
                    o10.b.getClass();
                    ((b20) p20).c0();
                    if (!((b20) p20).S) {
                        ((b20) p20).m0();
                    } else {
                        ((b20) p20).k(n10.b);
                    }
                    se1.L(((b20) p20), n10.f, v6_8);
                    se1.L(((b20) p20), n10.e, v9_4);
                    if ((((b20) p20).S) || (!ni1.o(((b20) p20).L(), Integer.valueOf(v7_5)))) {
                        ve2.v(v7_5, ((b20) p20), v7_5, n10.g);
                    }
                    se1.L(((b20) p20), n10.d, v4_8);
                    ((b20) p20).Y(-1187384190);
                    int v9_8 = v17_1.iterator();
                    while (v9_8.hasNext()) {
                        int v12_6 = v2_15;
                        com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyCell(((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) v9_8.next()), v3_14, new kq1(1065353216, 1), ((b20) p20), 0, 0);
                        v2_15 = v12_6;
                    }
                    int v12_4 = v2_15;
                    ((b20) p20).p(0);
                    ((b20) p20).Y(-1187376194);
                    at2 v2_8 = (v10 - v17_1.size());
                    int v4_11 = 0;
                    while (v4_11 < v2_8) {
                        id1.f(((b20) p20), new kq1(1065353216, 1));
                        v4_11++;
                    }
                    ((b20) p20).p(0);
                    ((b20) p20).p(1);
                    if (v13_2 == (v12_4.size() - 1)) {
                        v14_1 = 1086324736;
                        ((b20) p20).Y(2000497361);
                        ((b20) p20).p(0);
                    } else {
                        ((b20) p20).Y(2000436818);
                        v14_1 = 1086324736;
                        id1.f(((b20) p20), ac3.d(v11_0, 1086324736));
                        ((b20) p20).p(0);
                    }
                    v9_3 = 0;
                    v2_15 = v12_4;
                    v4_3 = v15_2;
                    v13_2 = v16;
                    v12_0 = 1065353216;
                }
            }
            ((b20) p20).p(v9_3);
            ((b20) p20).p(1);
        }
        at2 v2_3 = ((b20) p20).r();
        if (v2_3 != null) {
            v2_3.d = new fs1(p21, 3, p19);
        }
        return;
    }

    private static final bw3 CoreFrequencyGrid$lambda$2(java.util.List p0, int p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyGrid(p0, p2, vc1.b0((p1 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 D()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyCell$lambda$1$0();
    }

    private static final void DashboardCoreCellContent(String p35, String p36, com.lele.llmonitor.ui.soc.CoreCellTypography p37, boolean p38, Integer p39, Integer p40, Float p41, t10 p42, int p43)
    {
        mx v1_10;
        ((b20) p42).a0(-494372869);
        if ((p43 & 6) != 0) {
            v1_10 = p43;
        } else {
            mx v1_8;
            if (!((b20) p42).f(p35)) {
                v1_8 = 2;
            } else {
                v1_8 = 4;
            }
            v1_10 = (v1_8 | p43);
        }
        if ((p43 & 48) == 0) {
            xc v3_4;
            if (!((b20) p42).f(p36)) {
                v3_4 = 16;
            } else {
                v3_4 = 32;
            }
            v1_10 |= v3_4;
        }
        xc v3_6;
        if ((p43 & 384) != 0) {
            v3_6 = p37;
        } else {
            xc v5_4;
            v3_6 = p37;
            if (!((b20) p42).f(p37)) {
                v5_4 = 128;
            } else {
                v5_4 = 256;
            }
            v1_10 |= v5_4;
        }
        if ((p43 & 3072) == 0) {
            q20 v6_3;
            if (!((b20) p42).g(p38)) {
                v6_3 = 1024;
            } else {
                v6_3 = 2048;
            }
            v1_10 |= v6_3;
        }
        if ((p43 & 24576) == 0) {
            q20 v6_6;
            if (!((b20) p42).f(p39)) {
                v6_6 = 8192;
            } else {
                v6_6 = 16384;
            }
            v1_10 |= v6_6;
        }
        if ((196608 & p43) == 0) {
            int v10_8;
            if (!((b20) p42).f(p40)) {
                v10_8 = 65536;
            } else {
                v10_8 = 131072;
            }
            v1_10 |= v10_8;
        }
        if ((1572864 & p43) == 0) {
            int v10_12;
            if (!((b20) p42).f(p41)) {
                v10_12 = 524288;
            } else {
                v10_12 = 1048576;
            }
            v1_10 |= v10_12;
        }
        mx v1_27;
        int v10_13 = v1_10;
        if ((599187 & v10_13) == 599186) {
            v1_27 = 0;
        } else {
            v1_27 = 1;
        }
        boolean v9_12;
        if (!((b20) p42).O((v10_13 & 1), v1_27)) {
            v9_12 = ((b20) p42);
            ((b20) p42).R();
        } else {
            mx v1_3;
            if (p41 == null) {
                v1_3 = "--";
            } else {
                v1_3 = String.format(java.util.Locale.getDefault(), "%.0f%%", java.util.Arrays.copyOf(new Object[] {Float.valueOf((p41.floatValue() * 1120403456))}), 1));
            }
            String v31 = v1_3;
            hz0 v15_1 = j22.a;
            mx v1_5 = n54.E(v15_1, 1090519040, 1088421888);
            long v11_3 = xx.a(new hh(1077936128, 1, new dh(0)), px2.r, ((b20) p42), 6);
            boolean v12_3 = p34.x(((b20) p42));
            long v14_2 = ((b20) p42).l();
            mx v1_7 = jn.K(((b20) p42), v1_5);
            o10.b.getClass();
            q20 v6_0 = n10.b;
            ((b20) p42).c0();
            if (!((b20) p42).S) {
                ((b20) p42).m0();
            } else {
                ((b20) p42).k(v6_0);
            }
            long v13_1 = n10.f;
            se1.L(((b20) p42), v13_1, v11_3);
            long v11_4 = n10.e;
            se1.L(((b20) p42), v11_4, v14_2);
            long v14_3 = n10.g;
            if ((((b20) p42).S) || (!ni1.o(((b20) p42).L(), Integer.valueOf(v12_3)))) {
                ve2.v(v12_3, ((b20) p42), v12_3, v14_3);
            }
            long v13_2;
            boolean v12_4 = n10.d;
            se1.L(((b20) p42), v12_4, v1_7);
            com.lele.llmonitor.ui.soc.SocScreenKt.CoreCardHeader(p35, p36, v3_6, p38, ((b20) p42), (v10_13 & 8190));
            Integer v2_2 = v13_1;
            int v20_0 = v10_13;
            j22 v32 = v15_1;
            mx v1_12 = v20_0;
            xc v5_1 = v12_4;
            xc v4_2 = v14_3;
            xc v3_2 = v11_4;
            com.lele.llmonitor.ui.soc.SocScreenKt.MainFrequencyLine-ruhFsrE(p39, p37.getValueSize-XSAIIZE(), p37.getUnitSize-XSAIIZE(), vc1.A(((b20) p42)).q, vc1.A(((b20) p42)).a, ((b20) p42), ((v20_0 >> 12) & 14));
            int v21_2 = v1_12;
            com.lele.llmonitor.ui.soc.SocScreenKt.MaxFrequencyLine-ruhFsrE(p40, p37.getMaxValueSize-XSAIIZE(), p37.getUnitSize-XSAIIZE(), vc1.A(int v18_0).q, vc1.A(((b20) p42)).s, ((b20) p42), ((v21_2 >> 15) & 14));
            int v0_9 = ((b20) p42);
            if ((v21_2 & 3670016) != 1048576) {
                v13_2 = 0;
            } else {
                v13_2 = 1;
            }
            mx v1_15 = ((b20) p42).L();
            if ((v13_2 != 0) || (v1_15 == r10.a)) {
                v1_15 = new bx2(15, p41);
                ((b20) p42).j0(v1_15);
            }
            int v0_10 = v32;
            iq2.b(((s01) v1_15), ac3.d(ac3.c(v32, 1065353216), 1084227584), vc1.A(v0_9).a, vc1.A(v0_9).r, 0, 0, 0, ((b20) p42), 48);
            int v0_11 = ac3.c(v0_10, 1065353216);
            mx v1_19 = ey2.a(n54.e, px2.p, ((b20) p42), 54);
            int v10_5 = p34.x(((b20) p42));
            long v11_9 = ((b20) p42).l();
            int v0_12 = jn.K(((b20) p42), v0_11);
            ((b20) p42).c0();
            if (!((b20) p42).S) {
                ((b20) p42).m0();
            } else {
                ((b20) p42).k(v6_0);
            }
            se1.L(((b20) p42), v2_2, v1_19);
            se1.L(((b20) p42), v3_2, v11_9);
            if ((((b20) p42).S) || (!ni1.o(((b20) p42).L(), Integer.valueOf(v10_5)))) {
                ve2.v(v10_5, ((b20) p42), v10_5, v4_2);
            }
            se1.L(((b20) p42), v5_1, v0_12);
            boolean v27 = ((b20) p42);
            bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5360\u6bd4"), 0, vc1.A(((b20) p42)).s, p37.getMetaSize-XSAIIZE(), 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, ((b20) p42), 0, 28032, 233450);
            bp3.b(v31, 0, vc1.A(v27).q, p37.getMetaSize-XSAIIZE(), hz0.h, 0, 0, 0, 1, 0, 1, 0, 0, 0, v27, 1572864, 28032, 233386);
            v9_12 = ((b20) p42);
            ((b20) p42).p(1);
            ((b20) p42).p(1);
        }
        boolean v9_13 = v9_12.r();
        if (v9_13) {
            v9_13.d = new com.lele.llmonitor.ui.soc.f(p35, p36, p37, p38, p39, p40, p41, p43);
        }
        return;
    }

    private static final float DashboardCoreCellContent$lambda$1$0$0(Float p0)
    {
        if (p0 == 0) {
            return 0;
        } else {
            return p0.floatValue();
        }
    }

    private static final bw3 DashboardCoreCellContent$lambda$2(String p10, String p11, com.lele.llmonitor.ui.soc.CoreCellTypography p12, boolean p13, Integer p14, Integer p15, Float p16, int p17, t10 p18, int p19)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.DashboardCoreCellContent(p10, p11, p12, p13, p14, p15, p16, p18, vc1.b0((p17 | 1)));
        return bw3.a;
    }

    private static final void MainFrequencyLine-ruhFsrE(Integer p32, long p33, long p35, long p37, long p39, t10 p41, int p42)
    {
        yl3 v2_6;
        ((b20) p41).a0(-1208452811);
        if ((p42 & 6) != 0) {
            v2_6 = p42;
        } else {
            yl3 v2_2;
            if (!((b20) p41).f(p32)) {
                v2_2 = 2;
            } else {
                v2_2 = 4;
            }
            v2_6 = (v2_2 | p42);
        }
        if ((p42 & 48) == 0) {
            int v3_4;
            if (!((b20) p41).e(p33)) {
                v3_4 = 16;
            } else {
                v3_4 = 32;
            }
            v2_6 |= v3_4;
        }
        if ((p42 & 384) == 0) {
            int v3_7;
            if (!((b20) p41).e(p35)) {
                v3_7 = 128;
            } else {
                v3_7 = 256;
            }
            v2_6 |= v3_7;
        }
        if ((p42 & 3072) == 0) {
            int v3_10;
            if (!((b20) p41).e(p37)) {
                v3_10 = 1024;
            } else {
                v3_10 = 2048;
            }
            v2_6 |= v3_10;
        }
        if ((p42 & 24576) == 0) {
            int v3_13;
            if (!((b20) p41).e(p39)) {
                v3_13 = 8192;
            } else {
                v3_13 = 16384;
            }
            v2_6 |= v3_13;
        }
        int v3_15;
        if ((v2_6 & 9363) == 9362) {
            v3_15 = 0;
        } else {
            v3_15 = 1;
        }
        Throwable v28_1;
        if (!((b20) p41).O((v2_6 & 1), v3_15)) {
            v28_1 = ((b20) p41);
            ((b20) p41).R();
        } else {
            yl3 v2_13;
            if (p32 == null) {
                v2_13 = "--";
            } else {
                v2_13 = String.valueOf(p32.intValue());
                if (v2_13 == null) {
                }
            }
            int v3_17 = new ee();
            long v6_2 = v3_17.e(new hf3(p37, p33, hz0.i, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65528));
            try {
                v3_17.c(v2_13);
                v3_17.d(v6_2);
                v3_17.c(" ");
                yl3 v2_1 = v3_17.e(new hf3(p39, p35, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65532));
                try {
                    v3_17.c("MHz");
                    v3_17.d(v2_1);
                    ge v11_1 = v3_17.f();
                    m22 v12_1 = ac3.c(j22.a, 1065353216);
                    yl3 v2_5 = new yl3(3);
                    v28_1 = ((b20) p41);
                    bp3.c(v11_1, v12_1, 0, 0, 0, v2_5, 0, 0, 1, 0, 0, 0, 0, ((b20) p41), 48);
                } catch (Throwable v0_1) {
                    3.d(v2_5);
                    throw v0_1;
                }
            } catch (Throwable v0_0) {
                v3_17.d(v6_2);
                throw v0_0;
            }
        }
        m22 v12_2 = v28_1.r();
        if (v12_2 != null) {
            v12_2.d = new qe3(p32, p33, p35, p37, p39, p42, 0);
        }
        return;
    }

    private static final bw3 MainFrequencyLine_ruhFsrE$lambda$1(Integer p12, long p13, long p15, long p17, long p19, int p21, t10 p22, int p23)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.MainFrequencyLine-ruhFsrE(p12, p13, p15, p17, p19, p22, vc1.b0((p21 | 1)));
        return bw3.a;
    }

    private static final void MaxFrequencyLine-ruhFsrE(Integer p37, long p38, long p40, long p42, long p44, t10 p46, int p47)
    {
        yl3 v2_2;
        ((b20) p46).a0(227039300);
        if ((p47 & 6) != 0) {
            v2_2 = p47;
        } else {
            yl3 v2_1;
            if (!((b20) p46).f(p37)) {
                v2_1 = 2;
            } else {
                v2_1 = 4;
            }
            v2_2 = (v2_1 | p47);
        }
        if ((p47 & 48) == 0) {
            int v3_3;
            if (!((b20) p46).e(p38)) {
                v3_3 = 16;
            } else {
                v3_3 = 32;
            }
            v2_2 |= v3_3;
        }
        if ((p47 & 384) == 0) {
            int v3_6;
            if (!((b20) p46).e(p40)) {
                v3_6 = 128;
            } else {
                v3_6 = 256;
            }
            v2_2 |= v3_6;
        }
        if ((p47 & 3072) == 0) {
            int v3_9;
            if (!((b20) p46).e(p42)) {
                v3_9 = 1024;
            } else {
                v3_9 = 2048;
            }
            v2_2 |= v3_9;
        }
        if ((p47 & 24576) == 0) {
            int v3_12;
            if (!((b20) p46).e(p44)) {
                v3_12 = 8192;
            } else {
                v3_12 = 16384;
            }
            v2_2 |= v3_12;
        }
        int v3_14;
        if ((v2_2 & 9363) == 9362) {
            v3_14 = 0;
        } else {
            v3_14 = 1;
        }
        Throwable v28_2;
        if (!((b20) p46).O((v2_2 & 1), v3_14)) {
            v28_2 = ((b20) p46);
            ((b20) p46).R();
        } else {
            yl3 v2_13;
            if (p37 == null) {
                v2_13 = "--";
            } else {
                v2_13 = String.valueOf(p37.intValue());
                if (v2_13 == null) {
                }
            }
            int v3_16 = new ee();
            String v8_0 = v3_16.e(new hf3(p44, se1.C(4294967296, (bq3.c(p40) + 1065353216)), hz0.h, 0, 0, 0, 0, se1.x(4599075939470750515), 0, 0, 0, 0, 0, 0, 0, 65400));
            try {
                v3_16.c("MAX");
                v3_16.d(v8_0);
                v3_16.c(" ");
                int v7 = v3_16.e(new hf3(p42, p38, hz0.i, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65528));
                try {
                    v3_16.c(v2_13);
                    v3_16.d(v7);
                    v3_16.c(" ");
                    yl3 v2_3 = v3_16.e(new hf3(p44, p40, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 65532));
                    try {
                        v3_16.c("MHz");
                        v3_16.d(v2_3);
                        ge v11_4 = v3_16.f();
                        m22 v12_2 = ac3.c(j22.a, 1065353216);
                        yl3 v2_6 = new yl3(3);
                        v28_2 = ((b20) p46);
                        bp3.c(v11_4, v12_2, 0, 0, 0, v2_6, 0, 0, 1, 0, 0, 0, 0, ((b20) p46), 48);
                    } catch (Throwable v0_2) {
                        3.d(v2_6);
                        throw v0_2;
                    }
                } catch (Throwable v0_1) {
                    v3_16.d(v7);
                    throw v0_1;
                }
            } catch (Throwable v0_0) {
                v3_16.d(" ");
                throw v0_0;
            }
        }
        m22 v12_3 = v28_2.r();
        if (v12_3 != null) {
            v12_3.d = new qe3(p37, p38, p40, p42, p44, p47, 1);
        }
        return;
    }

    private static final bw3 MaxFrequencyLine_ruhFsrE$lambda$1(Integer p12, long p13, long p15, long p17, long p19, int p21, t10 p22, int p23)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.MaxFrequencyLine-ruhFsrE(p12, p13, p15, p17, p19, p22, vc1.b0((p21 | 1)));
        return bw3.a;
    }

    public static final void SocScreen(com.lele.llmonitor.ui.soc.SocViewModel p30, t10 p31, int p32, int p33)
    {
        pe3 v4_0;
        hh v7_2;
        int v1_0 = p33;
        int v2_0 = px2.s;
        int v3_1 = n54.d;
        b20 v12_1 = ((b20) p31);
        ((b20) p31).a0(-1187777997);
        if ((p32 & 6) != 0) {
            v4_0 = p30;
            v7_2 = p32;
        } else {
            hh v7_5;
            if ((p33 & 1) != 0) {
                v4_0 = p30;
                v7_5 = 2;
            } else {
                v4_0 = p30;
                if (!((b20) p31).h(p30)) {
                } else {
                    v7_5 = 4;
                }
            }
            v7_2 = (p32 | v7_5);
        }
        int v8_1;
        if ((v7_2 & 3) == 2) {
            v8_1 = 0;
        } else {
            v8_1 = 1;
        }
        int v2_1;
        int v0_4;
        if (!((b20) p31).O((v7_2 & 1), v8_1)) {
            v2_1 = p32;
            v0_4 = 2;
            ((b20) p31).R();
            int v3_2 = v12_1.r();
            if (v3_2 != 0) {
                v3_2.d = new pe3(v4_0, v2_1, v1_0, v0_4);
            }
        } else {
            ((b20) p31).T();
            if (((p32 & 1) != 0) && (!((b20) p31).y())) {
                ((b20) p31).R();
            } else {
                if ((p33 & 1) != 0) {
                    pe3 v4_15 = ww1.a(((b20) p31));
                    if (v4_15 == null) {
                        h.m("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    } else {
                        hh v7_20;
                        if (!(v4_15 instanceof p51)) {
                            v7_20 = n80.b;
                        } else {
                            v7_20 = ((p51) v4_15).getDefaultViewModelCreationExtras();
                        }
                        v4_0 = ((com.lele.llmonitor.ui.soc.SocViewModel) qc1.V(vt2.a(com.lele.llmonitor.ui.soc.SocViewModel), v4_15, 0, v7_20, ((b20) p31)));
                    }
                }
            }
            ((b20) p31).q();
            hh v7_23 = v4_0.getUiState();
            int v10_29 = ((yt1) ((b20) p31).j(rw1.a));
            int v11_9 = v7_23.getValue();
            int v10_30 = v10_29.getLifecycle();
            int v13_13 = nt1.g;
            int v14_10 = qo0.d;
            int v9_10 = new Object[] {v7_23, v10_30, v13_13, v14_10});
            int v15_8 = (((((b20) p31).h(v10_30) | ((b20) p31).d(3)) | ((b20) p31).h(v14_10)) | ((b20) p31).h(v7_23));
            int v6_0 = ((b20) p31).L();
            int v8_13 = r10.a;
            if ((v15_8 != 0) || (v6_0 == v8_13)) {
                v6_0 = new n9(v10_30, v13_13, v14_10, v7_23, 0, 5);
                ((b20) p31).j0(v6_0);
            }
            int v6_1 = ((h11) v6_0);
            hh v7_0 = ((b20) p31).L();
            if (v7_0 == v8_13) {
                v7_0 = qc1.G(v11_9);
                ((b20) p31).j0(v7_0);
            }
            hh v7_1 = ((l52) v7_0);
            int v5_0 = java.util.Arrays.copyOf(v9_10, 4);
            int v9_0 = ((b20) p31).h(v6_1);
            int v10_0 = ((b20) p31).L();
            if ((v9_0 != 0) || (v10_0 == v8_13)) {
                v10_0 = new ie3(v6_1, v7_1, 0, 2);
                ((b20) p31).j0(v10_0);
            }
            r7.m(v5_0, ((h11) v10_0), ((b20) p31));
            int v5_2 = com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$0(v7_1).getSnapshot();
            int v6_3 = com.lele.llmonitor.data.SettingsManager.INSTANCE.isDebugModeEnabled();
            int v15_0 = j22.a;
            if ((v5_2 != 0) || (!com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$0(v7_1).isLoading())) {
                ((b20) p31).Y(1141922639);
                ((b20) p31).p(0);
                if ((v5_2 != 0) || (com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$0(v7_1).getError() == null)) {
                    int v0_3;
                    hh v7_3 = v4_0;
                    v2_1 = p32;
                    int v1 = 1;
                    ((b20) p31).Y(1142519823);
                    ((b20) p31).p(0);
                    if (v5_2 == 0) {
                        v0_3 = 0;
                    } else {
                        v0_3 = v5_2.getCoreFrequencies();
                    }
                    int v3_0 = uo0.d;
                    if (v0_3 == 0) {
                        v0_3 = v3_0;
                    }
                    int v9_3 = ((b20) p31).f(v0_3);
                    int v10_6 = ((b20) p31).L();
                    if ((v9_3 != 0) || (v10_6 == v8_13)) {
                        v10_6 = com.lele.llmonitor.ui.soc.SocScreenKt.buildPolicyClusters(v0_3);
                        ((b20) p31).j0(v10_6);
                    }
                    int v9_4;
                    int v15_2 = ((java.util.List) v10_6);
                    if (v5_2 == 0) {
                        v9_4 = 0;
                    } else {
                        v9_4 = v5_2.getThermalZones();
                    }
                    if (v9_4 != 0) {
                        v3_0 = v9_4;
                    }
                    int v9_5 = ac3.c;
                    int v10_8 = sn.d(px2.f, 0);
                    int v13_2 = p34.x(((b20) p31));
                    int v1_1 = ((b20) p31).l();
                    int v11_2 = jn.K(((b20) p31), v9_5);
                    o10.b.getClass();
                    ((b20) p31).c0();
                    if (!((b20) p31).S) {
                        ((b20) p31).m0();
                    } else {
                        ((b20) p31).k(n10.b);
                    }
                    se1.L(((b20) p31), n10.f, v10_8);
                    se1.L(((b20) p31), n10.e, v1_1);
                    if ((((b20) p31).S) || (!ni1.o(((b20) p31).L(), Integer.valueOf(v13_2)))) {
                        ve2.v(v13_2, ((b20) p31), v13_2, n10.g);
                    }
                    se1.L(((b20) p31), n10.d, v11_2);
                    int v9_6 = n54.F(v9_5, 1098907648, 0, 2);
                    pe3 v29_0 = v7_3;
                    hh v7_7 = new hh(1098907648, 1, new dh(0));
                    int v1_9 = ((((((b20) p31).h(v5_2) | ((b20) p31).f(v6_3)) | ((b20) p31).h(v0_3)) | ((b20) p31).h(v15_2)) | ((b20) p31).h(v3_0));
                    int v10_17 = ((b20) p31).L();
                    if ((v1_9 != 0) || (v10_17 == v8_13)) {
                        int v13_6 = new e4(v0_3, v15_2, v3_0, v5_2, v6_3, 5);
                        ((b20) p31).j0(v13_6);
                        v10_17 = v13_6;
                    }
                    v1_0 = p33;
                    v0_4 = 2;
                    df2.b(v9_6, 0, 0, v7_7, 0, 0, 0, 0, ((d11) v10_17), ((b20) p31), 24582, 494);
                    v12_1 = ((b20) p31);
                    ((b20) p31).p(1);
                    v4_0 = v29_0;
                } else {
                    ((b20) p31).Y(1141992234);
                    int v5_8 = n54.F(ac3.c, 1098907648, 0, 2);
                    int v2_2 = xx.a(v3_1, v2_0, ((b20) p31), 54);
                    int v3_3 = p34.x(((b20) p31));
                    int v6_6 = ((b20) p31).l();
                    int v5_9 = jn.K(((b20) p31), v5_8);
                    o10.b.getClass();
                    ((b20) p31).c0();
                    if (!((b20) p31).S) {
                        ((b20) p31).m0();
                    } else {
                        ((b20) p31).k(n10.b);
                    }
                    se1.L(((b20) p31), n10.f, v2_2);
                    se1.L(((b20) p31), n10.e, v6_6);
                    if ((((b20) p31).S) || (!ni1.o(((b20) p31).L(), Integer.valueOf(v3_3)))) {
                        ve2.v(v3_3, ((b20) p31), v3_3, n10.g);
                    }
                    se1.L(((b20) p31), n10.d, v5_9);
                    int v3_4 = ou3.a;
                    int v27 = v7_1;
                    pe3 v29_1 = v4_0;
                    int v0_5 = v15_0;
                    bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("SoC \u91c7\u96c6\u4e0d\u53ef\u7528"), 0, 0, 0, hz0.i, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p31).j(v3_4)).h, ((b20) p31), 1572864, 0, 131006);
                    id1.f(((b20) p31), ac3.d(v0_5, 1090519040));
                    int v0_8 = com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$0(v27).getError();
                    if (v0_8 == 0) {
                        v0_8 = "--";
                    }
                    bp3.b(v0_8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p31).j(v3_4)).k, ((b20) p31), 0, 0, 131070);
                    ((b20) p31).p(1);
                    ((b20) p31).p(0);
                    int v0_13 = ((b20) p31).r();
                    if (v0_13 != 0) {
                        v0_13.d = new pe3(v29_1, p32, p33, 1);
                        return;
                    }
                }
            } else {
                ((b20) p31).Y(1141523824);
                int v2_9 = xx.a(v3_1, v2_0, ((b20) p31), 54);
                int v3_7 = p34.x(((b20) p31));
                int v6_12 = ((b20) p31).l();
                int v5_17 = jn.K(((b20) p31), ac3.c);
                o10.b.getClass();
                ((b20) p31).c0();
                if (!((b20) p31).S) {
                    ((b20) p31).m0();
                } else {
                    ((b20) p31).k(n10.b);
                }
                se1.L(((b20) p31), n10.f, v2_9);
                se1.L(((b20) p31), n10.e, v6_12);
                if ((((b20) p31).S) || (!ni1.o(((b20) p31).L(), Integer.valueOf(v3_7)))) {
                    ve2.v(v3_7, ((b20) p31), v3_7, n10.g);
                }
                se1.L(((b20) p31), n10.d, v5_17);
                int v2_13 = v4_0;
                iq2.a(0, 0, 0, 0, 0, 0, ((b20) p31), 0, 63);
                id1.f(((b20) p31), ac3.d(v15_0, 1094713344));
                bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6b63\u5728\u8bfb\u53d6 SoC \u6307\u6807\u2026"), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p31).j(ou3.a)).k, ((b20) p31), 0, 0, 131070);
                ((b20) p31).p(1);
                ((b20) p31).p(0);
                int v3_9 = ((b20) p31).r();
                if (v3_9 != 0) {
                    v3_9.d = new pe3(v2_13, p32, p33, 0);
                    return;
                }
            }
        }
        return;
    }

    private static final com.lele.llmonitor.ui.soc.SocUiState SocScreen$lambda$0(cg3 p0)
    {
        return ((com.lele.llmonitor.ui.soc.SocUiState) p0.getValue());
    }

    private static final boolean SocScreen$lambda$1(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final bw3 SocScreen$lambda$3(com.lele.llmonitor.ui.soc.SocViewModel p0, int p1, int p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen(p0, p3, vc1.b0((p1 | 1)), p2);
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$5(com.lele.llmonitor.ui.soc.SocViewModel p0, int p1, int p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen(p0, p3, vc1.b0((p1 | 1)), p2);
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0(java.util.List p7, java.util.List p8, java.util.List p9, com.lele.llmonitor.data.soc.SocSnapshot p10, l52 p11, ms1 p12)
    {
        p12.getClass();
        com.lele.llmonitor.ui.soc.ComposableSingletons$SocScreenKt v0 = com.lele.llmonitor.ui.soc.ComposableSingletons$SocScreenKt.INSTANCE;
        ms1.a(p12, "soc_spacer_top", v0.getLambda$1296959374$app(), 2);
        ms1.a(p12, "soc_metrics_row_1", new c00(-1449844283, new oe3(p10, p11, 1), 1), 2);
        ms1.a(p12, "soc_metrics_row_2", new c00(693639878, new oe3(p10, p11, 2), 1), 2);
        ms1.a(p12, "soc_metrics_row_3", new c00(-1457843257, new oe3(p10, p11, 0), 1), 2);
        if (!p7.isEmpty()) {
            ((es1) p12).b.a(p8.size(), new ds1(new com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$2(new com.lele.llmonitor.ui.soc.a(0), p8), new com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$3(com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$1.INSTANCE, p8), new c00(-632812321, new com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$4(p8), 1)));
        } else {
            ms1.a(p12, "soc_core_freq_empty", v0.getLambda$-300724247$app(), 2);
        }
        if (com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$1(p11)) {
            ms1.a(p12, "soc_thermal_zones_title", v0.getLambda$774487904$app(), 2);
            if (!p9.isEmpty()) {
                ((es1) p12).b.a(p9.size(), new ds1(new com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$6(new p63(15), p9), new com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$7(com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$5.INSTANCE, p9), new c00(-632812321, new com.lele.llmonitor.ui.soc.SocScreenKt$SocScreen$lambda$7$0$0$$inlined$items$default$8(p9), 1)));
            } else {
                ms1.a(p12, "soc_thermal_zones_empty", v0.getLambda$1909872443$app(), 2);
            }
        }
        ms1.a(p12, "soc_spacer_bottom", v0.getLambda$685640904$app(), 2);
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$0(com.lele.llmonitor.data.soc.SocSnapshot p22, l52 p23, pq1 p24, t10 p25, int p26)
    {
        int v0_17;
        p24.getClass();
        if ((p26 & 17) == 16) {
            v0_17 = 0;
        } else {
            v0_17 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_17)) {
            ((b20) p25).R();
        } else {
            int v0_14 = ac3.c(j22.a, 1065353216);
            i41 v2_2 = ey2.a(new hh(1098907648, 1, new dh(0)), px2.o, ((b20) p25), 6);
            String v4_3 = p34.x(((b20) p25));
            int v5_6 = ((b20) p25).l();
            int v0_15 = jn.K(((b20) p25), v0_14);
            o10.b.getClass();
            ((b20) p25).c0();
            if (!((b20) p25).S) {
                ((b20) p25).m0();
            } else {
                ((b20) p25).k(n10.b);
            }
            se1.L(((b20) p25), n10.f, v2_2);
            se1.L(((b20) p25), n10.e, v5_6);
            if ((((b20) p25).S) || (!ni1.o(((b20) p25).L(), Integer.valueOf(v4_3)))) {
                ve2.v(v4_3, ((b20) p25), v4_3, n10.g);
            }
            int v0_20;
            se1.L(((b20) p25), n10.d, v0_15);
            String v4_4 = com.lele.llmonitor.i18n.TextI18nKt.l10n("CPU \u5360\u7528");
            if (p22 == null) {
                v0_20 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u53d7\u9650");
            } else {
                int v0_18 = p22.getCpuUsagePercent();
                if (v0_18 == 0) {
                } else {
                    v0_20 = com.lele.llmonitor.ui.soc.SocScreenKt.formatPercent(v0_18.floatValue());
                    if (v0_20 == 0) {
                    }
                }
            }
            int v5_10 = v0_20;
            int v11_3 = new kq1(1065353216, 1);
            int v0_22 = ((b20) p25).L();
            i41 v2_7 = r10.a;
            if (v0_22 == v2_7) {
                v0_22 = new re3(1);
                ((b20) p25).j0(v0_22);
            }
            uo0 v9_0;
            m22 v6_5 = com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v11_3, 0, 0, 0, ((s01) v0_22), 7, 0);
            java.util.List v13_0 = uo0.d;
            java.util.List v14_0 = 0;
            if (!com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$1(p23)) {
                v9_0 = v13_0;
            } else {
                int v0_1;
                if (p22 == null) {
                    v0_1 = 0;
                } else {
                    v0_1 = p22.getCpuUsageSources();
                }
                if (v0_1 == 0) {
                    v0_1 = v13_0;
                }
                v9_0 = com.lele.llmonitor.ui.soc.SocScreenKt.toSourceLines(v0_1);
            }
            int v0_7;
            com.lele.llmonitor.ui.components.InfoCardKt.InfoCard(v4_4, v5_10, v6_5, 0, 0, v9_0, ((b20) p25), 0, 24);
            String v4_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("SoC \u6e29\u5ea6");
            if (p22 == null) {
                v0_7 = "--";
            } else {
                int v0_4 = p22.getSocTemperatureC();
                if (v0_4 == 0) {
                } else {
                    int v5_1;
                    int v0_6 = v0_4.floatValue();
                    int v5_0 = p22.getSocTemperatureFractionDigits();
                    if (v5_0 == 0) {
                        v5_1 = 1;
                    } else {
                        v5_1 = v5_0.intValue();
                    }
                    v0_7 = com.lele.llmonitor.ui.soc.SocScreenKt.formatTemp(v0_6, v5_1);
                    if (v0_7 == 0) {
                    }
                }
            }
            int v5_2 = v0_7;
            kq1 v15_1 = new kq1(1065353216, 1);
            int v0_8 = ((b20) p25).L();
            if (v0_8 == v2_7) {
                v0_8 = new re3(2);
                ((b20) p25).j0(v0_8);
            }
            m22 v6_0 = com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v15_1, 0, 0, 0, ((s01) v0_8), 7, 0);
            if (com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$1(p23)) {
                int v0_12;
                if (p22 == null) {
                    v0_12 = 0;
                } else {
                    v0_12 = p22.getSocTemperatureSource();
                }
                if (p22 != null) {
                    v14_0 = p22.getSocTemperatureSources();
                }
                if (v14_0 != null) {
                    v13_0 = v14_0;
                }
                v13_0 = com.lele.llmonitor.ui.soc.SocScreenKt.tempSourceLines(v0_12, v13_0);
            }
            com.lele.llmonitor.ui.components.InfoCardKt.InfoCard(v4_0, v5_2, v6_0, 0, 0, v13_0, ((b20) p25), 0, 24);
            ((b20) p25).p(1);
        }
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$0$0$1$0()
    {
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$0$0$3$0()
    {
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$1(com.lele.llmonitor.data.soc.SocSnapshot p19, l52 p20, pq1 p21, t10 p22, int p23)
    {
        m22 v0_9;
        p21.getClass();
        if ((p23 & 17) == 16) {
            v0_9 = 0;
        } else {
            v0_9 = 1;
        }
        if (!((b20) p22).O((p23 & 1), v0_9)) {
            ((b20) p22).R();
        } else {
            m22 v0_6 = ac3.c(j22.a, 1065353216);
            String v4_4 = ey2.a(new hh(1098907648, 1, new dh(0)), px2.o, ((b20) p22), 6);
            java.util.List v5_5 = p34.x(((b20) p22));
            m22 v6_6 = ((b20) p22).l();
            m22 v0_7 = jn.K(((b20) p22), v0_6);
            o10.b.getClass();
            ((b20) p22).c0();
            if (!((b20) p22).S) {
                ((b20) p22).m0();
            } else {
                ((b20) p22).k(n10.b);
            }
            se1.L(((b20) p22), n10.f, v4_4);
            se1.L(((b20) p22), n10.e, v6_6);
            if ((((b20) p22).S) || (!ni1.o(((b20) p22).L(), Integer.valueOf(v5_5)))) {
                ve2.v(v5_5, ((b20) p22), v5_5, n10.g);
            }
            m22 v0_10;
            se1.L(((b20) p22), n10.d, v0_7);
            String v4_8 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5728\u7ebfCPU\u6838\u5fc3");
            if (p19 == null) {
                v0_10 = "--";
            } else {
                m22 v0_11 = p19.getOnlineCores();
                java.util.List v5_6 = p19.getTotalCores();
                m22 v6_11 = new StringBuilder();
                v6_11.append(v0_11);
                v6_11.append(" / ");
                v6_11.append(v5_6);
                v0_10 = v6_11.toString();
            }
            java.util.List v5_7 = v0_10;
            int v11_4 = new kq1(1065353216, 1);
            m22 v0_13 = ((b20) p22).L();
            m22 v6_12 = r10.a;
            if (v0_13 == v6_12) {
                v0_13 = new qw1(29);
                ((b20) p22).j0(v0_13);
            }
            m22 v6_1;
            m22 v0_1 = v6_12;
            com.lele.llmonitor.ui.components.InfoCardKt.InfoCard(v4_8, v5_7, com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v11_4, 0, 0, 0, ((s01) v0_13), 7, 0), 0, 0, 0, ((b20) p22), 0, 56);
            String v4_1 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7cfb\u7edf1min\u8d1f\u8f7d");
            java.util.List v5_0 = 0;
            if (p19 == null) {
                v6_1 = 0;
            } else {
                v6_1 = p19.getLoadAvg1();
            }
            m22 v6_2 = com.lele.llmonitor.ui.soc.SocScreenKt.formatNullable(v6_1);
            int v11_1 = new kq1(1065353216, 1);
            boolean v1_0 = ((b20) p22).L();
            if (v1_0 == v0_1) {
                v1_0 = new re3(0);
                ((b20) p22).j0(v1_0);
            }
            m22 v0_3 = com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v11_1, 0, 0, 0, ((s01) v1_0), 7, 0);
            java.util.List v2_0 = uo0.d;
            if (com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$1(p20)) {
                if (p19 != null) {
                    v5_0 = p19.getLoadAvgSources();
                }
                if (v5_0 != null) {
                    v2_0 = v5_0;
                }
                v2_0 = com.lele.llmonitor.ui.soc.SocScreenKt.toSourceLines(v2_0);
            }
            com.lele.llmonitor.ui.components.InfoCardKt.InfoCard(v4_1, v6_2, v0_3, 0, 0, v2_0, ((b20) p22), 0, 24);
            ((b20) p22).p(1);
        }
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$1$0$1$0()
    {
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$1$0$2$0()
    {
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$2(com.lele.llmonitor.data.soc.SocSnapshot p22, l52 p23, pq1 p24, t10 p25, int p26)
    {
        boolean v0_11;
        p24.getClass();
        if ((p26 & 17) == 16) {
            v0_11 = 0;
        } else {
            v0_11 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_11)) {
            ((b20) p25).R();
        } else {
            boolean v0_7 = ac3.c(j22.a, 1065353216);
            java.util.List v2_3 = ey2.a(new hh(1098907648, 1, new dh(0)), px2.o, ((b20) p25), 6);
            String v4_4 = p34.x(((b20) p25));
            String v5_4 = ((b20) p25).l();
            boolean v0_9 = jn.K(((b20) p25), v0_7);
            o10.b.getClass();
            ((b20) p25).c0();
            if (!((b20) p25).S) {
                ((b20) p25).m0();
            } else {
                ((b20) p25).k(n10.b);
            }
            se1.L(((b20) p25), n10.f, v2_3);
            se1.L(((b20) p25), n10.e, v5_4);
            if ((((b20) p25).S) || (!ni1.o(((b20) p25).L(), Integer.valueOf(v4_4)))) {
                ve2.v(v4_4, ((b20) p25), v4_4, n10.g);
            }
            String v4_5;
            se1.L(((b20) p25), n10.d, v0_9);
            boolean v0_12 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5185\u5b58\u5360\u7528");
            java.util.List v2_0 = 0;
            if (p22 == null) {
                v4_5 = 0;
            } else {
                v4_5 = p22.getMemoryTotalBytes();
            }
            String v5_8;
            if (p22 == null) {
                v5_8 = 0;
            } else {
                v5_8 = p22.getMemoryAvailableBytes();
            }
            boolean v0_14;
            String v4_6 = com.lele.llmonitor.ui.soc.SocScreenKt.formatMemoryUsagePercent(v4_5, v5_8);
            String v5_10 = new StringBuilder();
            v5_10.append(v0_12);
            v5_10.append("(GB) ");
            v5_10.append(v4_6);
            String v4_7 = v5_10.toString();
            if (p22 == null) {
                v0_14 = 0;
            } else {
                v0_14 = p22.getMemoryTotalBytes();
            }
            String v5_11;
            if (p22 == null) {
                v5_11 = 0;
            } else {
                v5_11 = p22.getMemoryAvailableBytes();
            }
            String v5_12 = com.lele.llmonitor.ui.soc.SocScreenKt.formatMemoryUsedOverTotal(v0_14, v5_11);
            int v11_3 = new kq1(1065353216, 1);
            boolean v0_15 = ((b20) p25).L();
            m22 v6_6 = r10.a;
            if (v0_15 == v6_6) {
                v0_15 = new qw1(27);
                ((b20) p25).j0(v0_15);
            }
            int v7_0;
            boolean v0_1 = com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v11_3, 0, 0, 0, ((s01) v0_15), 7, 0);
            if (p22 == null) {
                v7_0 = 0;
            } else {
                v7_0 = p22.getMemoryTotalBytes();
            }
            uo0 v9_0;
            int v8_0 = com.lele.llmonitor.ui.soc.SocScreenKt.memoryValueReferenceText(v7_0);
            java.util.List v13_1 = uo0.d;
            if (!com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$1(p23)) {
                v9_0 = v13_1;
            } else {
                int v7_2;
                if (p22 == null) {
                    v7_2 = 0;
                } else {
                    v7_2 = p22.getMemorySources();
                }
                if (v7_2 == 0) {
                    v7_2 = v13_1;
                }
                v9_0 = com.lele.llmonitor.ui.soc.SocScreenKt.toSourceLines(v7_2);
            }
            String v5_0;
            boolean v0_3 = v6_6;
            com.lele.llmonitor.ui.components.InfoCardKt.InfoCard(v4_7, v5_12, v0_1, 1, v8_0, v9_0, ((b20) p25), 3072, 0);
            String v4_1 = com.lele.llmonitor.i18n.TextI18nKt.l10n("CPU \u578b\u53f7");
            if (p22 == null) {
                v5_0 = "--";
            } else {
                v5_0 = p22.getCpuModelName();
                if (v5_0 == null) {
                }
            }
            kq1 v14_2 = new kq1(1065353216, 1);
            qw1 v1_0 = ((b20) p25).L();
            if (v1_0 == v0_3) {
                v1_0 = new qw1(28);
                ((b20) p25).j0(v1_0);
            }
            m22 v6_1 = com.lele.llmonitor.ui.components.SquishyModifierKt.squishyClickable$default(v14_2, 0, 0, 0, ((s01) v1_0), 7, 0);
            if (com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$1(p23)) {
                if (p22 != null) {
                    v2_0 = p22.getCpuModelSources();
                }
                if (v2_0 != null) {
                    v13_1 = v2_0;
                }
                v13_1 = com.lele.llmonitor.ui.soc.SocScreenKt.toSourceLines(v13_1);
            }
            com.lele.llmonitor.ui.components.InfoCardKt.InfoCard(v4_1, v5_0, v6_1, 1, 0, v13_1, ((b20) p25), 3072, 16);
            ((b20) p25).p(1);
        }
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$2$0$0$0()
    {
        return bw3.a;
    }

    private static final bw3 SocScreen$lambda$7$0$0$2$0$1$0()
    {
        return bw3.a;
    }

    private static final Object SocScreen$lambda$7$0$0$3(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        p0.getClass();
        return p0.getKey();
    }

    private static final Object SocScreen$lambda$7$0$0$5(com.lele.llmonitor.data.soc.ThermalZoneReading p2)
    {
        p2.getClass();
        String v0_0 = p2.getZone();
        String v2_2 = p2.getType();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append(v0_0);
        v1_1.append("-");
        v1_1.append(v2_2);
        return v1_1.toString();
    }

    private static final bw3 SocScreen$lambda$8(com.lele.llmonitor.ui.soc.SocViewModel p0, int p1, int p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen(p0, p3, vc1.b0((p1 | 1)), p2);
        return bw3.a;
    }

    private static final void ThermalZoneCard(com.lele.llmonitor.data.soc.ThermalZoneReading p9, t10 p10, int p11)
    {
        at2 v10_3;
        ((b20) p10).a0(1673669575);
        if ((p11 & 6) != 0) {
            v10_3 = p11;
        } else {
            at2 v10_2;
            if (!((b20) p10).f(p9)) {
                v10_2 = 2;
            } else {
                v10_2 = 4;
            }
            v10_3 = (v10_2 | p11);
        }
        fs1 v0_0;
        if ((v10_3 & 3) == 2) {
            v0_0 = 0;
        } else {
            v0_0 = 1;
        }
        if (!((b20) p10).O((v10_3 & 1), v0_0)) {
            ((b20) p10).R();
        } else {
            com.lele.llmonitor.ui.components.HomeCardKt.HomeCard-sW7UJKQ(ac3.c(j22.a, 1065353216), 0, 0, n54.K(435055293, new ys(11, p9), b20 v5_1), ((b20) p10), 3078, 6);
        }
        at2 v10_11 = ((b20) p10).r();
        if (v10_11 != null) {
            v10_11.d = new fs1(p11, 4, p9);
        }
        return;
    }

    private static final bw3 ThermalZoneCard$lambda$0(com.lele.llmonitor.data.soc.ThermalZoneReading p26, wn p27, t10 p28, int p29)
    {
        b20 v0_8;
        p27.getClass();
        if ((p29 & 17) == 16) {
            v0_8 = 0;
        } else {
            v0_8 = 1;
        }
        if (!((b20) p28).O((p29 & 1), v0_8)) {
            ((b20) p28).R();
        } else {
            mx v1_3 = j22.a;
            b20 v0_5 = n54.D(v1_3, 1098907648);
            mg3 v3_0 = xx.a(n54.c, px2.r, ((b20) p28), 0);
            int v5_1 = p34.x(((b20) p28));
            long v6_2 = ((b20) p28).l();
            b20 v0_6 = jn.K(((b20) p28), v0_5);
            o10.b.getClass();
            ((b20) p28).c0();
            if (!((b20) p28).S) {
                ((b20) p28).m0();
            } else {
                ((b20) p28).k(n10.b);
            }
            se1.L(((b20) p28), n10.f, v3_0);
            se1.L(((b20) p28), n10.e, v6_2);
            if ((((b20) p28).S) || (!ni1.o(((b20) p28).L(), Integer.valueOf(v5_1)))) {
                ve2.v(v5_1, ((b20) p28), v5_1, n10.g);
            }
            se1.L(((b20) p28), n10.d, v0_6);
            b20 v0_7 = p26.getZone();
            mg3 v3_5 = p26.getType();
            int v5_3 = new StringBuilder();
            v5_3.append(v0_7);
            v5_3.append(" / ");
            v5_3.append(v3_5);
            mg3 v3_7 = ox.a;
            bp3.b(v5_3.toString(), 0, ((mx) ((b20) p28).j(v3_7)).s, se1.y(12), hz0.h, 0, 0, 0, 1, 0, 1, 0, 0, 0, ((b20) p28), 1597440, 28032, 233386);
            id1.f(((b20) p28), ac3.d(v1_3, 1090519040));
            bp3.b(com.lele.llmonitor.ui.soc.SocScreenKt.formatTemp(p26.getTempC(), p26.getTempFractionDigits()), 0, ((mx) ((b20) p28).j(v3_7)).q, se1.y(22), hz0.i, 0, 0, 0, 1, 0, 1, 0, 0, 0, ((b20) p28), 1597440, 28032, 233386);
            ((b20) p28).p(1);
        }
        return bw3.a;
    }

    private static final bw3 ThermalZoneCard$lambda$1(com.lele.llmonitor.data.soc.ThermalZoneReading p0, int p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.ThermalZoneCard(p0, p2, vc1.b0((p1 | 1)));
        return bw3.a;
    }

    public static synthetic Object a(com.lele.llmonitor.data.soc.ThermalZoneReading p0)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$5(p0);
    }

    public static final synthetic void access$ClusterCoreSection(com.lele.llmonitor.ui.soc.PolicyClusterUi p0, boolean p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.ClusterCoreSection(p0, p1, p2, p3);
        return;
    }

    public static final synthetic void access$ThermalZoneCard(com.lele.llmonitor.data.soc.ThermalZoneReading p0, t10 p1, int p2)
    {
        com.lele.llmonitor.ui.soc.SocScreenKt.ThermalZoneCard(p0, p1, p2);
        return;
    }

    public static synthetic bw3 b(com.lele.llmonitor.data.soc.ThermalZoneReading p0, int p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.ThermalZoneCard$lambda$1(p0, p1, p2, p3);
    }

    private static final java.util.List buildPolicyClusters(java.util.List p10)
    {
        java.util.ArrayList v0_1 = new java.util.LinkedHashMap();
        int v10_4 = p10.iterator();
        while (v10_4.hasNext()) {
            String v1_15 = v10_4.next();
            int v2_4 = com.lele.llmonitor.ui.soc.SocScreenKt.normalizedPolicyKey(((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) v1_15).getPolicy());
            boolean v3_10 = v0_1.get(v2_4);
            if (!v3_10) {
                v3_10 = new java.util.ArrayList();
                v0_1.put(v2_4, v3_10);
            }
            ((java.util.List) v3_10).add(v1_15);
        }
        int v10_10 = ((Iterable) v0_1.entrySet());
        java.util.ArrayList v0_3 = new java.util.ArrayList(zw.j0(v10_10, 10));
        int v10_1 = v10_10.iterator();
        while(true) {
            int v2_0 = 0;
            if (!v10_1.hasNext()) {
                int v10_3 = new com.lele.llmonitor.ui.soc.a(1);
                boolean v3_2 = new com.lele.llmonitor.ui.soc.a(2);
                com.lele.llmonitor.ui.soc.a v5_1 = new com.lele.llmonitor.ui.soc.a(3);
                String v6_1 = new d11[3];
                v6_1[0] = v10_3;
                v6_1[1] = v3_2;
                v6_1[2] = v5_1;
                return yw.R0(v0_3, new ty(0, v6_1));
            } else {
                String v1_5 = ((java.util.Map$Entry) v10_1.next());
                com.lele.llmonitor.ui.soc.a v5_3 = ((String) v1_5.getKey());
                java.util.List v9 = yw.R0(((java.util.List) v1_5.getValue()), new com.lele.llmonitor.ui.soc.SocScreenKt$buildPolicyClusters$lambda$1$$inlined$sortedBy$1());
                if (!v9.isEmpty()) {
                    String v1_10 = v9.iterator();
                    while (v1_10.hasNext()) {
                        if (((com.lele.llmonitor.data.soc.CpuCoreFrequencySample) v1_10.next()).getOnline()) {
                            v2_0++;
                            if (v2_0 < 0) {
                                r7.d0();
                                throw 0;
                            }
                        }
                    }
                }
                int v7 = v2_0;
                String v1_14;
                if (!ni1.o(v5_3, com.lele.llmonitor.ui.soc.SocScreenKt.UNASSIGNED_POLICY_KEY)) {
                    v1_14 = s42.h("CPU ", v5_3);
                } else {
                    v1_14 = "CPU";
                }
                v0_3.add(new com.lele.llmonitor.ui.soc.PolicyClusterUi(v5_3, v1_14, v7, v9.size(), v9));
            }
        }
    }

    private static final Comparable buildPolicyClusters$lambda$2(com.lele.llmonitor.ui.soc.PolicyClusterUi p1)
    {
        Integer v1_4;
        p1.getClass();
        if (!ni1.o(p1.getKey(), com.lele.llmonitor.ui.soc.SocScreenKt.UNASSIGNED_POLICY_KEY)) {
            v1_4 = 0;
        } else {
            v1_4 = 1;
        }
        return Integer.valueOf(v1_4);
    }

    private static final Comparable buildPolicyClusters$lambda$3(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        p0.getClass();
        return Integer.valueOf(com.lele.llmonitor.ui.soc.SocScreenKt.policyNumericOrder(p0.getKey()));
    }

    private static final Comparable buildPolicyClusters$lambda$4(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        p0.getClass();
        return p0.getKey();
    }

    public static synthetic bw3 c()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$2$0$1$0();
    }

    private static final int coreGridColumns(int p3)
    {
        int v0_0 = 1;
        if (p3 != 1) {
            v0_0 = 2;
            if ((p3 != 2) && (p3 != 4)) {
                if (p3 == 6) {
                    return 3;
                } else {
                    switch (p3) {
                        case 8:
                            return 4;
                        case 9:
                            return 3;
                        case 10:
                            return 4;
                        default:
                            if (p3 > 3) {
                                if (p3 > 6) {
                                    if (p3 > 8) {
                                        if (p3 > 12) {
                                            return 5;
                                        } else {
                                            return 4;
                                        }
                                    } else {
                                        return 4;
                                    }
                                } else {
                                    return 3;
                                }
                            } else {
                                return p3;
                            }
                    }
                }
            }
        }
        return v0_0;
    }

    private static final com.lele.llmonitor.ui.soc.CoreCellTypography coreTypographyAdaptive-Kr38-dQ(int p25, int p26, ag0 p27, lp3 p28, float p29, float p30)
    {
        lp3 v3_1 = p28;
        int v4_12 = p27.l();
        int v5_6 = new StringBuilder();
        v5_6.append(p25);
        v5_6.append("_");
        v5_6.append(p26);
        v5_6.append("_");
        v5_6.append(v4_12);
        String v7 = v5_6.toString();
        int v4_8 = ((com.lele.llmonitor.ui.soc.CoreCellTypography) com.lele.llmonitor.ui.soc.SocScreenKt.coreTypographyCache.get(v7));
        if (v4_8 == 0) {
            float v1_14 = p27.y(((float) p26));
            int v4_10 = p27.y(1107296256);
            float vtmp11 = p27.y(p29);
            int v6_2 = (p25 - 1);
            if (v6_2 < 0) {
                v6_2 = 0;
            }
            float v1_17 = (((v1_14 - v4_10) - (vtmp11 * ((float) v6_2))) / ((float) p25));
            int v9_1 = 1065353216;
            if (v1_17 < 1065353216) {
                v1_17 = 1065353216;
            }
            float v10;
            float v1_18 = (v1_17 - (p27.y(p30) * 1073741824));
            if (v1_18 >= 1065353216) {
                v10 = v1_18;
            } else {
                v10 = 1065353216;
            }
            float v11 = p27.y(1073741824);
            float v12 = 1065353216;
            while (v12 >= 1058642330) {
                int v15;
                com.lele.llmonitor.ui.soc.CoreCellTypography v13_0 = new com.lele.llmonitor.ui.soc.CoreCellTypography(se1.C(4294967296, (1094713344 * v12)), se1.C(4294967296, (1103101952 * v12)), se1.C(4294967296, (1093664768 * v12)), se1.C(4294967296, (1096810496 * v12)), se1.C(4294967296, (1090519040 * v12)), 0);
                int v14_0 = 1;
                if (com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI(v3_1, com.lele.llmonitor.i18n.TextI18nKt.l10n("CPU10 \u79bb\u7ebf"), v13_0.getTitleSize-XSAIIZE(), 1) > v10) {
                    v15 = 0;
                } else {
                    v15 = 1;
                }
                int v16_2;
                int v25_1 = v9_1;
                float v29_1 = v10;
                if (((com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI(v3_1, "99999", v13_0.getValueSize-XSAIIZE(), 1) + v11) + com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI$default(p28, "MHz", v13_0.getUnitSize-XSAIIZE(), 0, 8, 0)) > v29_1) {
                    v16_2 = 0;
                } else {
                    v16_2 = 1;
                }
                if (((((com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI(p28, "MAX", se1.C(4294967296, (bq3.c(v13_0.getUnitSize-XSAIIZE()) + v25_1)), 1) + v11) + com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI(p28, "99999", v13_0.getMaxValueSize-XSAIIZE(), 1)) + v11) + com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI$default(p28, "MHz", v13_0.getUnitSize-XSAIIZE(), 0, 8, 0)) > v29_1) {
                    v14_0 = 0;
                }
                if ((v15 == 0) || ((v16_2 == 0) || (v14_0 == 0))) {
                    v12 -= 1022739087;
                    v9_1 = v25_1;
                    v3_1 = p28;
                    v10 = v29_1;
                } else {
                    com.lele.llmonitor.ui.soc.SocScreenKt.coreTypographyCache.put(v7, v13_0);
                    return v13_0;
                }
            }
            com.lele.llmonitor.ui.soc.CoreCellTypography v13_2 = new com.lele.llmonitor.ui.soc.CoreCellTypography(se1.y(8), se1.y(16), se1.y(9), se1.y(10), se1.y(7), 0);
            com.lele.llmonitor.ui.soc.SocScreenKt.coreTypographyCache.put(v7, v13_2);
            return v13_2;
        } else {
            return v4_8;
        }
    }

    public static synthetic bw3 d()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$1$0$1$0();
    }

    public static synthetic Object e(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$3(p0);
    }

    public static synthetic bw3 f(com.lele.llmonitor.ui.soc.SocViewModel p0, int p1, int p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$8(p0, p1, p2, p3, p4);
    }

    private static final String formatMemoryUsagePercent(Long p10, Long p11)
    {
        if (p10 != null) {
            double v2_0 = 0;
            if (p10.longValue() <= 0) {
                p10 = 0;
            }
            if (p10 != null) {
                long v4_0;
                long v8 = p10.longValue();
                if (p11 == null) {
                    v4_0 = 0;
                } else {
                    v4_0 = p11.longValue();
                }
                String v10_3 = (v8 - ib1.m(v4_0, 0, v8));
                if (v10_3 >= 0) {
                    v2_0 = v10_3;
                }
                return String.format(java.util.Locale.getDefault(), "%.0f%%", java.util.Arrays.copyOf(new Object[] {Double.valueOf(ib1.j(((((double) v2_0) / ((double) v8)) * 4636737291354636288), 0, 4636737291354636288))}), 1));
            }
        }
        return "--";
    }

    private static final String formatMemoryUsedOverTotal(Long p10, Long p11)
    {
        if (p10 != null) {
            double v2_0 = 0;
            if (p10.longValue() <= 0) {
                p10 = 0;
            }
            if (p10 != null) {
                long v4;
                long v8 = p10.longValue();
                if (p11 == null) {
                    v4 = 0;
                } else {
                    v4 = p11.longValue();
                }
                String v10_3 = (v8 - ib1.m(v4, 0, v8));
                if (v10_3 >= 0) {
                    v2_0 = v10_3;
                }
                return String.format(java.util.Locale.getDefault(), "%.1f / %.1f", java.util.Arrays.copyOf(new Object[] {Double.valueOf((((double) v2_0) / 4742290407621132288)), Double.valueOf((((double) v8) / 4742290407621132288))}), 2));
            }
        }
        return "--";
    }

    private static final String formatNullable(Float p2)
    {
        if (p2 != null) {
            return String.format(java.util.Locale.getDefault(), "%.2f", java.util.Arrays.copyOf(new Object[] {p2}), 1));
        } else {
            return "--";
        }
    }

    private static final String formatPercent(float p2)
    {
        return String.format(java.util.Locale.getDefault(), "%.1f%%", java.util.Arrays.copyOf(new Object[] {Float.valueOf(p2)}), 1));
    }

    private static final String formatTemp(float p4, int p5)
    {
        return String.format(java.util.Locale.getDefault(), s42.g(ib1.l(p5, 0, 1), "%.", "f \u00b0C"), java.util.Arrays.copyOf(new Object[] {Float.valueOf(p4)}), 1));
    }

    public static synthetic bw3 g(com.lele.llmonitor.ui.soc.SocViewModel p0, int p1, int p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$5(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 h(Integer p0, long p1, long p3, long p5, long p7, int p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.MaxFrequencyLine_ruhFsrE$lambda$1(p0, p1, p3, p5, p7, p9, p10, p11);
    }

    public static synthetic bw3 i(Integer p0, long p1, long p3, long p5, long p7, int p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.MainFrequencyLine_ruhFsrE$lambda$1(p0, p1, p3, p5, p7, p9, p10, p11);
    }

    public static synthetic bw3 j(String p0, String p1, com.lele.llmonitor.ui.soc.CoreCellTypography p2, boolean p3, int p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.CoreCardHeader$lambda$1(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 k()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$0$0$1$0();
    }

    public static synthetic bw3 l(com.lele.llmonitor.data.soc.CpuCoreFrequencySample p0, com.lele.llmonitor.ui.soc.CoreCellTypography p1, m22 p2, int p3, int p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyCell$lambda$3(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic Comparable m(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.buildPolicyClusters$lambda$4(p0);
    }

    private static final float measureWidthPx-xMeaFFI(lp3 p22, String p23, long p24, boolean p26)
    {
        zr v2_19;
        if (!p26) {
            v2_19 = hz0.f;
        } else {
            v2_19 = hz0.i;
        }
        zr v1_9 = new yp3(0, p24, v2_19, 0, 0, 0, 16777209);
        long v10_0 = k40.b(0, 0, 15);
        lo1 v8 = p22.c;
        vv v13 = p22.d;
        zr v2_18 = v1_9;
        zr v1_15 = new ge(p23);
        int v3_7 = uo0.d;
        boolean v9_1 = p22.a;
        hy0 v7_1 = p22.b;
        float v0_6 = new dp3(v1_15, v2_18, v3_7, 2147483647, 1, 1, v7_1, v8, v9_1, v10_0);
        long v5_4 = v3_7;
        ag0 v6_2 = v7_1;
        hy0 v7_2 = v9_1;
        int v3_8 = v1_15;
        zr v1_16 = v2_18;
        zr v2_20 = 0;
        if (v13 != null) {
            ep3 v4_10;
            ep3 v4_7 = new zr(v0_6);
            boolean v9_3 = ((jy1) v13.e);
            if (!v9_3) {
                if (!ni1.o(((zr) v13.f), v4_7)) {
                    ep3 v4_1;
                    if (v2_20 == null) {
                        zr v2_23;
                        xj v15 = new xj;
                        v15(v3_8, pe1.K(v1_16, v8), v5_4, v6_2, v7_2);
                        zr v1_17 = j40.j(v10_0);
                        if (!j40.d(v10_0)) {
                            v2_23 = 2147483647;
                        } else {
                            v2_23 = j40.h(v10_0);
                        }
                        if (v1_17 != v2_23) {
                            v2_23 = ib1.l(((int) ((float) Math.ceil(((double) v15.i())))), v1_17, v2_23);
                        }
                        t32 v14_1 = new t32(v15, wm1.b0(0, v2_23, 0, j40.g(v10_0)), 2147483647, 1);
                        v4_1 = new ep3(v0_6, v14_1, k40.d(v10_0, ((((long) ((int) ((float) Math.ceil(((double) v14_1.e))))) & 4294967295) | (((long) ((int) ((float) Math.ceil(((double) v14_1.d))))) << 32))));
                        if (v13 != null) {
                            zr v1_11 = ((jy1) v13.e);
                            if (v1_11 == null) {
                                v13.f = new zr(v0_6);
                                v13.g = v4_1;
                            } else {
                                v1_11.d(new zr(v0_6), v4_1);
                            }
                        }
                    } else {
                        zr v1_14 = v2_20.b;
                        v4_1 = new ep3(v0_6, v1_14, k40.d(v10_0, ((((long) ((int) ((float) Math.ceil(((double) v1_14.e))))) & 4294967295) | (((long) ((int) ((float) Math.ceil(((double) v1_14.d))))) << 32))));
                    }
                    return ((float) ((int) (v4_1.c >> 32)));
                } else {
                    v4_10 = ((ep3) v13.g);
                }
            } else {
                v4_10 = ((ep3) v9_3.c(v4_7));
            }
            if ((v4_10 != null) && (!v4_10.b.a.d())) {
                v2_20 = v4_10;
            }
        }
    }

    public static synthetic float measureWidthPx-xMeaFFI$default(lp3 p0, String p1, long p2, boolean p4, int p5, Object p6)
    {
        if ((p5 & 8) != 0) {
            p4 = 0;
        }
        return com.lele.llmonitor.ui.soc.SocScreenKt.measureWidthPx-xMeaFFI(p0, p1, p2, p4);
    }

    private static final String memoryValueReferenceText(Long p5)
    {
        if ((p5 == null) || (p5.longValue() <= 0)) {
            p5 = 0;
        }
        Object[] v0_3;
        if (p5 == null) {
            v0_3 = 4636730254480218522;
        } else {
            v0_3 = (((double) p5.longValue()) / 4742290407621132288);
        }
        return String.format(java.util.Locale.getDefault(), "%.1f / %.1f", java.util.Arrays.copyOf(new Object[] {Double.valueOf(v0_3), Double.valueOf(v0_3)}), 2));
    }

    public static synthetic bw3 n(int p0, java.util.List p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyGrid$lambda$2(p1, p0, p2, p3);
    }

    private static final String normalizedPolicyKey(String p4)
    {
        String v4_1;
        if (p4 == null) {
            v4_1 = 0;
        } else {
            v4_1 = hh3.O0(p4).toString();
        }
        if (v4_1 == null) {
            v4_1 = "";
        }
        if (!hh3.w0(v4_1)) {
            int v1 = 0;
            if (oh3.j0(v4_1, "policy", 0)) {
                String v2_1 = hh3.D0(v4_1, "policy");
                if (hh3.w0(v2_1)) {
                    return v4_1;
                }
                while (v1 < v2_1.length()) {
                    if (Character.isDigit(v2_1.charAt(v1))) {
                        v1++;
                    }
                }
                v4_1 = "policy".concat(v2_1);
            }
            return v4_1;
        } else {
            return com.lele.llmonitor.ui.soc.SocScreenKt.UNASSIGNED_POLICY_KEY;
        }
    }

    public static synthetic bw3 o(String p0, String p1, com.lele.llmonitor.ui.soc.CoreCellTypography p2, com.lele.llmonitor.data.soc.CpuCoreFrequencySample p3, Float p4, wn p5, t10 p6, int p7)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.CoreFrequencyCell$lambda$2(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public static synthetic Comparable p(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.buildPolicyClusters$lambda$3(p0);
    }

    private static final int policyNumericOrder(String p2)
    {
        if (oh3.j0(p2, "policy", 0)) {
            int v2_4 = oh3.k0(hh3.D0(p2, "policy"));
            if (v2_4 != 0) {
                return v2_4.intValue();
            }
        }
        return 2147483647;
    }

    private static final String policyTag(String p3)
    {
        String v3_1;
        if (p3 == null) {
            v3_1 = 0;
        } else {
            v3_1 = hh3.O0(p3).toString();
        }
        if (v3_1 == null) {
            v3_1 = "";
        }
        if (!hh3.w0(v3_1)) {
            String v0_2 = hh3.D0(v3_1, "policy");
            if (!hh3.w0(v0_2)) {
                int v1_2 = 0;
                while (v1_2 < v0_2.length()) {
                    if (Character.isDigit(v0_2.charAt(v1_2))) {
                        v1_2++;
                    }
                }
                v3_1 = "P".concat(v0_2);
            }
            return v3_1;
        } else {
            return 0;
        }
    }

    public static synthetic bw3 q(com.lele.llmonitor.ui.soc.PolicyClusterUi p0, boolean p1, int p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.ClusterCoreSection$lambda$1(p0, p1, p2, p3, p4);
    }

    public static synthetic Comparable r(com.lele.llmonitor.ui.soc.PolicyClusterUi p0)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.buildPolicyClusters$lambda$2(p0);
    }

    public static synthetic bw3 s(com.lele.llmonitor.data.soc.SocSnapshot p0, l52 p1, pq1 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$0(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 t()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$1$0$2$0();
    }

    private static final java.util.List tempSourceLines(String p2, java.util.List p3)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        if ((p2 != null) && (!hh3.w0(p2))) {
            v0_1.add(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5f53\u524d\u6765\u6e90: ".concat(p2)));
        }
        dx.m0(v0_1, com.lele.llmonitor.ui.soc.SocScreenKt.toSourceLines(p3));
        return v0_1;
    }

    private static final java.util.List toSourceLines(java.util.List p6)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(zw.j0(p6, 10));
        java.util.Iterator v6_1 = p6.iterator();
        while (v6_1.hasNext()) {
            String v2_1;
            String v1_2 = ((com.lele.llmonitor.data.soc.SourceProbe) v6_1.next());
            if (!v1_2.getSuccess()) {
                v2_1 = "FAIL";
            } else {
                v2_1 = "OK";
            }
            String v3 = v1_2.getSource();
            String v1_3 = v1_2.getValue();
            StringBuilder v4_1 = new StringBuilder("[");
            v4_1.append(v2_1);
            v4_1.append("] ");
            v4_1.append(v3);
            v4_1.append(": ");
            v4_1.append(v1_3);
            v0_1.add(v4_1.toString());
        }
        return v0_1;
    }

    public static synthetic bw3 u(com.lele.llmonitor.data.soc.ThermalZoneReading p0, wn p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.ThermalZoneCard$lambda$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 v(java.util.List p0, java.util.List p1, java.util.List p2, com.lele.llmonitor.data.soc.SocSnapshot p3, l52 p4, ms1 p5)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 w(com.lele.llmonitor.ui.soc.SocViewModel p0, int p1, int p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$3(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 x()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$2$0$0$0();
    }

    public static synthetic bw3 y(com.lele.llmonitor.data.soc.SocSnapshot p0, l52 p1, pq1 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$2(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 z()
    {
        return com.lele.llmonitor.ui.soc.SocScreenKt.SocScreen$lambda$7$0$0$0$0$3$0();
    }
}
