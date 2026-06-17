package com.lele.llmonitor.ui.widget;
public final class BatteryWidget extends q21 {
    public static final int $stable;
    public static final com.lele.llmonitor.ui.widget.BatteryWidget$Companion Companion;
    private static final long LARGE_RECT;
    private static final long SMALL_SQUARE;
    private static final long WIDE_STRIP;
    private final bc3 sizeMode;

    static BatteryWidget()
    {
        com.lele.llmonitor.ui.widget.BatteryWidget.Companion = new com.lele.llmonitor.ui.widget.BatteryWidget$Companion(0);
        com.lele.llmonitor.ui.widget.BatteryWidget.$stable = q21.$stable;
        com.lele.llmonitor.ui.widget.BatteryWidget.SMALL_SQUARE = n54.a(1120403456, 1120403456);
        com.lele.llmonitor.ui.widget.BatteryWidget.WIDE_STRIP = n54.a(1132068864, 1116471296);
        com.lele.llmonitor.ui.widget.BatteryWidget.LARGE_RECT = n54.a(1132068864, 1126170624);
        return;
    }

    public BatteryWidget()
    {
        this.sizeMode = bc3.a;
        return;
    }

    private final void LayoutSmallVertical(float p19, String p20, int p21, float p22, int p23, int p24, com.lele.llmonitor.ui.widget.WidgetThemeColors p25, t10 p26, int p27)
    {
        com.lele.llmonitor.ui.widget.f v0_4;
        ((b20) p26).a0(-1243951733);
        if ((p27 & 6) != 0) {
            v0_4 = p27;
        } else {
            com.lele.llmonitor.ui.widget.f v0_3;
            if (!((b20) p26).c(p19)) {
                v0_3 = 2;
            } else {
                v0_3 = 4;
            }
            v0_4 = (v0_3 | p27);
        }
        if ((p27 & 48) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_3;
            if (!((b20) p26).f(p20)) {
                v1_3 = 16;
            } else {
                v1_3 = 32;
            }
            v0_4 |= v1_3;
        }
        if ((p27 & 384) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_6;
            if (!((b20) p26).d(p21)) {
                v1_6 = 128;
            } else {
                v1_6 = 256;
            }
            v0_4 |= v1_6;
        }
        if ((p27 & 3072) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_9;
            if (!((b20) p26).c(p22)) {
                v1_9 = 1024;
            } else {
                v1_9 = 2048;
            }
            v0_4 |= v1_9;
        }
        if ((p27 & 24576) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_12;
            if (!((b20) p26).d(p23)) {
                v1_12 = 8192;
            } else {
                v1_12 = 16384;
            }
            v0_4 |= v1_12;
        }
        if ((196608 & p27) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_16;
            if (!((b20) p26).d(p24)) {
                v1_16 = 65536;
            } else {
                v1_16 = 131072;
            }
            v0_4 |= v1_16;
        }
        if ((1572864 & p27) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_20;
            if (!((b20) p26).h(p25)) {
                v1_20 = 524288;
            } else {
                v1_20 = 1048576;
            }
            v0_4 |= v1_20;
        }
        com.lele.llmonitor.ui.widget.BatteryWidget v1_23;
        if ((599187 & v0_4) == 599186) {
            v1_23 = 0;
        } else {
            v1_23 = 1;
        }
        if (!((b20) p26).O((v0_4 & 1), v1_23)) {
            ((b20) p26).R();
        } else {
            ni1.d(id1.q(e31.a), 0, n54.K(1250883669, new com.lele.llmonitor.ui.widget.e(p22, p25, p20, p19, p21, p23, p24), ((b20) p26)), ((b20) p26), 3072, 6);
        }
        at2 v11_1 = ((b20) p26).r();
        if (v11_1 != null) {
            v11_1.d = new com.lele.llmonitor.ui.widget.f(this, p19, p20, p21, p22, p23, p24, p25, p27, 1);
        }
        return;
    }

    private static final bw3 LayoutSmallVertical$lambda$0(float p9, com.lele.llmonitor.ui.widget.WidgetThemeColors p10, String p11, float p12, int p13, int p14, int p15, ay p16, t10 p17, int p18)
    {
        p16.getClass();
        ni1.d(0, 0, n54.K(-1095618017, new com.lele.llmonitor.ui.widget.d(p10, p11, p12), p17), p17, 3072, 3);
        ed1.c(new i61(kh0.a), p17, 0);
        e31 v8 = e31.a;
        ib1.c(ib1.k(p9, 0, 1065353216), id1.A(id1.r(v8), 1082130432).d(new o70(new jh0(1073741824))), p10.getPrimary(), p10.getProgressTrack(), p17, 0);
        bw3 v0_6 = p17;
        ed1.c(id1.A(v8, 1090519040), p17, 0);
        df1.e(id1.r(v8), 1, n54.K(-1535283343, new com.lele.llmonitor.ui.widget.a(p13, p10, p14, p15, 0), v0_6), v0_6, 3072, 2);
        return bw3.a;
    }

    private static final bw3 LayoutSmallVertical$lambda$0$0(com.lele.llmonitor.ui.widget.WidgetThemeColors p10, String p11, float p12, ay p13, t10 p14, int p15)
    {
        p13.getClass();
        df1.e(0, 2, n54.K(1485738811, new com.lele.llmonitor.ui.widget.c(p12, p10), p14), p14, 3072, 3);
        zc1.e(p11, if1.A(1073741824, 0, 13), new xp3(p10.getSecondary(), new bq3(se1.y(16)), new gz0(500), 120), 0, p14, 0, 8);
        return bw3.a;
    }

    private static final bw3 LayoutSmallVertical$lambda$0$0$0(float p17, com.lele.llmonitor.ui.widget.WidgetThemeColors p18, gy2 p19, t10 p20, int p21)
    {
        p19.getClass();
        zc1.e(String.format(java.util.Locale.US, "%.1f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(p17)}), 1)), 0, new xp3(p18.getPrimary(), new bq3(se1.y(40)), new gz0(700), 120), 0, p20, 0, 10);
        ed1.c(new u04(new jh0(1073741824)), p20, 0);
        zc1.e("W", if1.A(0, 1082130432, 7), new xp3(p18.getOnSurfaceVariant(), new bq3(se1.y(18)), 0, 124), 0, p20, 6, 8);
        return bw3.a;
    }

    private static final bw3 LayoutSmallVertical$lambda$0$1(int p7, com.lele.llmonitor.ui.widget.WidgetThemeColors p8, int p9, int p10, gy2 p11, t10 p12, int p13)
    {
        p11.getClass();
        t10 v11_4 = new StringBuilder();
        v11_4.append(p7);
        v11_4.append("%");
        zc1.e(v11_4.toString(), 0, new xp3(p8.getOnSurface(), new bq3(se1.y(16)), new gz0(700), 120), 0, p12, 0, 10);
        ed1.c(new u04(kh0.a), p12, 0);
        bw3 v7_5 = new StringBuilder();
        v7_5.append(p9);
        v7_5.append(" / ");
        v7_5.append(p10);
        zc1.e(v7_5.toString(), if1.A(com.lele.llmonitor.ui.widget.BatteryWidgetKeysKt.access$getWIDGET_CAPACITY_TEXT_OFFSET$p(), 0, 13), new xp3(p8.getOutline(), new bq3(se1.x(4623226492472524800)), 0, 124), 0, p12, 0, 8);
        return bw3.a;
    }

    private static final bw3 LayoutSmallVertical$lambda$1(com.lele.llmonitor.ui.widget.BatteryWidget p11, float p12, String p13, int p14, float p15, int p16, int p17, com.lele.llmonitor.ui.widget.WidgetThemeColors p18, int p19, t10 p20, int p21)
    {
        p11.LayoutSmallVertical(p12, p13, p14, p15, p16, p17, p18, p20, vc1.b0((p19 | 1)));
        return bw3.a;
    }

    private final void LayoutWideVerticalCompressed(float p19, String p20, int p21, float p22, int p23, int p24, com.lele.llmonitor.ui.widget.WidgetThemeColors p25, t10 p26, int p27)
    {
        com.lele.llmonitor.ui.widget.f v0_4;
        ((b20) p26).a0(-1634337906);
        if ((p27 & 6) != 0) {
            v0_4 = p27;
        } else {
            com.lele.llmonitor.ui.widget.f v0_3;
            if (!((b20) p26).c(p19)) {
                v0_3 = 2;
            } else {
                v0_3 = 4;
            }
            v0_4 = (v0_3 | p27);
        }
        if ((p27 & 48) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_3;
            if (!((b20) p26).f(p20)) {
                v1_3 = 16;
            } else {
                v1_3 = 32;
            }
            v0_4 |= v1_3;
        }
        if ((p27 & 384) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_6;
            if (!((b20) p26).d(p21)) {
                v1_6 = 128;
            } else {
                v1_6 = 256;
            }
            v0_4 |= v1_6;
        }
        if ((p27 & 3072) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_9;
            if (!((b20) p26).c(p22)) {
                v1_9 = 1024;
            } else {
                v1_9 = 2048;
            }
            v0_4 |= v1_9;
        }
        if ((p27 & 24576) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_12;
            if (!((b20) p26).d(p23)) {
                v1_12 = 8192;
            } else {
                v1_12 = 16384;
            }
            v0_4 |= v1_12;
        }
        if ((196608 & p27) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_16;
            if (!((b20) p26).d(p24)) {
                v1_16 = 65536;
            } else {
                v1_16 = 131072;
            }
            v0_4 |= v1_16;
        }
        if ((1572864 & p27) == 0) {
            com.lele.llmonitor.ui.widget.BatteryWidget v1_20;
            if (!((b20) p26).h(p25)) {
                v1_20 = 524288;
            } else {
                v1_20 = 1048576;
            }
            v0_4 |= v1_20;
        }
        com.lele.llmonitor.ui.widget.BatteryWidget v1_23;
        if ((599187 & v0_4) == 599186) {
            v1_23 = 0;
        } else {
            v1_23 = 1;
        }
        if (!((b20) p26).O((v0_4 & 1), v1_23)) {
            ((b20) p26).R();
        } else {
            ni1.d(id1.q(e31.a), 1, n54.K(-488352764, new com.lele.llmonitor.ui.widget.e(p22, p25, p19, p20, p21, p23, p24), ((b20) p26)), ((b20) p26), 3072, 4);
        }
        at2 v11_1 = ((b20) p26).r();
        if (v11_1 != null) {
            v11_1.d = new com.lele.llmonitor.ui.widget.f(this, p19, p20, p21, p22, p23, p24, p25, p27, 0);
        }
        return;
    }

    private static final bw3 LayoutWideVerticalCompressed$lambda$0(float p10, com.lele.llmonitor.ui.widget.WidgetThemeColors p11, float p12, String p13, int p14, int p15, int p16, ay p17, t10 p18, int p19)
    {
        p17.getClass();
        com.lele.llmonitor.ui.widget.WidgetThemeColors v6_0 = e31.a;
        df1.e(id1.r(v6_0), 2, n54.K(-1336664984, new com.lele.llmonitor.ui.widget.d(p12, p11, p13), p18), p18, 3072, 2);
        ed1.c(id1.A(v6_0, 1077936128), p18, 0);
        ib1.c(ib1.k(p10, 0, 1065353216), id1.A(id1.r(v6_0), 1086324736).d(new o70(new jh0(1077936128))), p11.getPrimary(), p11.getProgressTrack(), p18, 0);
        t10 v3_2 = p18;
        ed1.c(id1.A(v6_0, 1082130432), p18, 0);
        df1.e(id1.r(v6_0), 1, n54.K(839234591, new com.lele.llmonitor.ui.widget.a(p14, p11, p15, p16, 1), v3_2), v3_2, 3072, 2);
        return bw3.a;
    }

    private static final bw3 LayoutWideVerticalCompressed$lambda$0$0(float p12, com.lele.llmonitor.ui.widget.WidgetThemeColors p13, String p14, gy2 p15, t10 p16, int p17)
    {
        p15.getClass();
        zc1.e(String.format(java.util.Locale.US, "%.1f", java.util.Arrays.copyOf(new Object[] {Float.valueOf(p12)}), 1)), 0, new xp3(p13.getPrimary(), new bq3(se1.y(26)), new gz0(700), 120), 0, p16, 0, 10);
        ed1.c(new u04(new jh0(1073741824)), p16, 0);
        zc1.e("W", if1.A(0, 1084227584, 7), new xp3(p13.getOnSurfaceVariant(), new bq3(se1.y(14)), 0, 124), 0, p16, 6, 8);
        ed1.c(new u04(kh0.a), p16, 0);
        zc1.e(p14, if1.A(0, 1082130432, 7), new xp3(p13.getSecondary(), new bq3(se1.y(14)), new gz0(700), 120), 0, p16, 0, 8);
        return bw3.a;
    }

    private static final bw3 LayoutWideVerticalCompressed$lambda$0$1(int p7, com.lele.llmonitor.ui.widget.WidgetThemeColors p8, int p9, int p10, gy2 p11, t10 p12, int p13)
    {
        p11.getClass();
        t10 v11_5 = new StringBuilder(" ");
        v11_5.append(p7);
        v11_5.append("%");
        zc1.e(v11_5.toString(), 0, new xp3(p8.getOnSurface(), new bq3(se1.y(14)), new gz0(700), 120), 0, p12, 0, 10);
        ed1.c(new u04(kh0.a), p12, 0);
        bw3 v7_5 = new StringBuilder();
        v7_5.append(p9);
        v7_5.append(" / ");
        v7_5.append(p10);
        zc1.e(v7_5.toString(), if1.A(com.lele.llmonitor.ui.widget.BatteryWidgetKeysKt.access$getWIDGET_CAPACITY_TEXT_OFFSET$p(), 0, 13), new xp3(p8.getOnSurfaceVariant(), new bq3(se1.x(4622663542519103488)), 0, 124), 0, p12, 0, 8);
        return bw3.a;
    }

    private static final bw3 LayoutWideVerticalCompressed$lambda$1(com.lele.llmonitor.ui.widget.BatteryWidget p11, float p12, String p13, int p14, float p15, int p16, int p17, com.lele.llmonitor.ui.widget.WidgetThemeColors p18, int p19, t10 p20, int p21)
    {
        p11.LayoutWideVerticalCompressed(p12, p13, p14, p15, p16, p17, p18, p20, vc1.b0((p19 | 1)));
        return bw3.a;
    }

    private static final bw3 WidgetContent_qzXmJYc$lambda$1(long p4, com.lele.llmonitor.ui.widget.BatteryWidget p6, float p7, String p8, int p9, float p10, int p11, int p12, com.lele.llmonitor.ui.widget.WidgetThemeColors p13, t10 p14, int p15)
    {
        int v0_2;
        if ((p15 & 3) == 2) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if (!((b20) p14).O((p15 & 1), v0_2)) {
            ((b20) p14).R();
        } else {
            if ((lj0.a(oj0.b(p4), 1127481344) >= 0) || (lj0.a(oj0.a(p4), 1120403456) < 0)) {
                ((b20) p14).Y(-1359454570);
                p6.LayoutWideVerticalCompressed(p7, p8, p9, p10, p11, p12, p13, ((b20) p14), (q21.$stable << 21));
                ((b20) p14).p(0);
            } else {
                ((b20) p14).Y(-1359870063);
                p6.LayoutSmallVertical(p7, p8, p9, p10, p11, p12, p13, ((b20) p14), (q21.$stable << 21));
                ((b20) p14).p(0);
            }
        }
        return bw3.a;
    }

    private static final bw3 WidgetContent_qzXmJYc$lambda$2(com.lele.llmonitor.ui.widget.BatteryWidget p0, long p1, int p3, t10 p4, int p5)
    {
        p0.WidgetContent-qzXmJYc(p1, p4, vc1.b0((p3 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 b(float p1, com.lele.llmonitor.ui.widget.WidgetThemeColors p2, float p3, String p4, int p5, int p6, int p7, ay p8, t10 p9, int p10)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutSmallVertical$lambda$0(p1, p2, p4, p3, p5, p6, p7, p8, p9, p10);
    }

    public static synthetic bw3 c(long p0, com.lele.llmonitor.ui.widget.BatteryWidget p2, float p3, String p4, int p5, float p6, int p7, int p8, com.lele.llmonitor.ui.widget.WidgetThemeColors p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.WidgetContent_qzXmJYc$lambda$1(p0, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public static synthetic bw3 d(float p0, com.lele.llmonitor.ui.widget.WidgetThemeColors p1, gy2 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutSmallVertical$lambda$0$0$0(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 e(com.lele.llmonitor.ui.widget.BatteryWidget p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.provideGlance$lambda$0$0(p0, p1, p2);
    }

    public static synthetic bw3 f(float p0, com.lele.llmonitor.ui.widget.WidgetThemeColors p1, String p2, gy2 p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutWideVerticalCompressed$lambda$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 g(com.lele.llmonitor.ui.widget.BatteryWidget p0, long p1, int p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.WidgetContent_qzXmJYc$lambda$2(p0, p1, p3, p4, p5);
    }

    public static synthetic bw3 h(int p0, com.lele.llmonitor.ui.widget.WidgetThemeColors p1, int p2, int p3, gy2 p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutSmallVertical$lambda$0$1(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 i(com.lele.llmonitor.ui.widget.BatteryWidget p0, float p1, String p2, int p3, float p4, int p5, int p6, com.lele.llmonitor.ui.widget.WidgetThemeColors p7, int p8, t10 p9, int p10)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutWideVerticalCompressed$lambda$1(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public static synthetic bw3 j(com.lele.llmonitor.ui.widget.BatteryWidget p0, float p1, String p2, int p3, float p4, int p5, int p6, com.lele.llmonitor.ui.widget.WidgetThemeColors p7, int p8, t10 p9, int p10)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutSmallVertical$lambda$1(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public static synthetic bw3 k(com.lele.llmonitor.ui.widget.WidgetThemeColors p0, String p1, float p2, ay p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutSmallVertical$lambda$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 l(float p0, com.lele.llmonitor.ui.widget.WidgetThemeColors p1, float p2, String p3, int p4, int p5, int p6, ay p7, t10 p8, int p9)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutWideVerticalCompressed$lambda$0(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic bw3 m(com.lele.llmonitor.ui.widget.BatteryWidget p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.provideGlance$lambda$0(p0, p1, p2);
    }

    public static synthetic bw3 n(int p0, com.lele.llmonitor.ui.widget.WidgetThemeColors p1, int p2, int p3, gy2 p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidget.LayoutWideVerticalCompressed$lambda$0$1(p0, p1, p2, p3, p4, p5, p6);
    }

    private static final bw3 provideGlance$lambda$0(com.lele.llmonitor.ui.widget.BatteryWidget p3, t10 p4, int p5)
    {
        int v0_2;
        if ((p5 & 3) == 2) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if (!((b20) p4).O((p5 & 1), v0_2)) {
            ((b20) p4).R();
        } else {
            l02.g(0, n54.K(1537757156, new vl(p3, 1), ((b20) p4)), ((b20) p4), 48);
        }
        return bw3.a;
    }

    private static final bw3 provideGlance$lambda$0$0(com.lele.llmonitor.ui.widget.BatteryWidget p3, t10 p4, int p5)
    {
        long v0_2;
        if ((p5 & 3) == 2) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if (!((b20) p4).O((p5 & 1), v0_2)) {
            ((b20) p4).R();
        } else {
            p3.WidgetContent-qzXmJYc(((oj0) ((b20) p4).j(r20.a)).a, ((b20) p4), (q21.$stable << 3));
        }
        return bw3.a;
    }

    public final void WidgetContent-qzXmJYc(long p17, t10 p19, int p20)
    {
        c00 v0_7;
        ((b20) p19).a0(65685587);
        if ((p20 & 6) != 0) {
            v0_7 = p20;
        } else {
            c00 v0_6;
            if (!((b20) p19).e(p17)) {
                v0_6 = 2;
            } else {
                v0_6 = 4;
            }
            v0_7 = (v0_6 | p20);
        }
        if ((p20 & 48) == 0) {
            int v4_16;
            if ((p20 & 64) != 0) {
                v4_16 = ((b20) p19).h(this);
            } else {
                v4_16 = ((b20) p19).f(this);
            }
            int v4_17;
            if (v4_16 == 0) {
                v4_17 = 16;
            } else {
                v4_17 = 32;
            }
            v0_7 |= v4_17;
        }
        int v4_19;
        int v6_0 = 1;
        if ((v0_7 & 19) == 18) {
            v4_19 = 0;
        } else {
            v4_19 = 1;
        }
        if (!((b20) p19).O((v0_7 & 1), v4_19)) {
            ((b20) p19).R();
        } else {
            ((b20) p19).Z(-534706435);
            c00 v0_16 = ((b20) p19).j(r20.c);
            if (v0_16 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
            } else {
                int v5_6;
                c00 v0_20 = ((a52) v0_16);
                ((b20) p19).p(0);
                int v4_20 = com.lele.llmonitor.ui.widget.BatteryWidgetKeys.INSTANCE;
                int v5_5 = ((Float) v0_20.c(v4_20.getPOWER()));
                int v8_0 = 0;
                if (v5_5 == 0) {
                    v5_6 = 0;
                } else {
                    v5_6 = v5_5.floatValue();
                }
                if (Math.abs(v5_6) < 1028443341) {
                    v5_6 = 0;
                }
                int v9_6;
                int v9_5 = ((Integer) v0_20.c(v4_20.getCAPACITY()));
                if (v9_5 == 0) {
                    v9_6 = 0;
                } else {
                    v9_6 = v9_5.intValue();
                }
                com.lele.llmonitor.ui.widget.WidgetThemeColors v10_5;
                com.lele.llmonitor.ui.widget.WidgetThemeColors v10_4 = ((Integer) v0_20.c(v4_20.getTOTAL_CAPACITY()));
                if (v10_4 == null) {
                    v10_5 = 5000;
                } else {
                    v10_5 = v10_4.intValue();
                }
                g31 v13_16;
                g31 v13_15 = ((Float) v0_20.c(v4_20.getTEMP()));
                if (v13_15 == null) {
                    v13_16 = 0;
                } else {
                    v13_16 = v13_15.floatValue();
                }
                c00 v0_0 = ((Integer) v0_20.c(v4_20.getTEMP_FRACTION_DIGITS()));
                if (v0_0 != null) {
                    v6_0 = v0_0.intValue();
                }
                c00 v0_2 = com.lele.llmonitor.data.BatteryEngine.INSTANCE.formatTemperatureC(v13_16, v6_0);
                int v4_1 = new StringBuilder();
                v4_1.append(v0_2);
                v4_1.append("\u00b0C");
                c00 v0_5 = v4_1.toString();
                if (v10_5 > null) {
                    v8_0 = (((float) v9_6) / ((float) v10_5));
                }
                int v6_3 = ((int) (v8_0 * 1120403456));
                g31 v13_2 = ((android.content.Context) ((b20) p19).j(r20.b));
                kx v14_0 = ((b20) p19).f(v13_2);
                com.lele.llmonitor.ui.widget.WidgetThemeColors v15_0 = ((b20) p19).L();
                if ((v14_0 != null) || (v15_0 == r10.a)) {
                    v15_0 = com.lele.llmonitor.ui.widget.BatteryWidgetKeysKt.access$resolveWidgetThemeColors(v13_2);
                    ((b20) p19).j0(v15_0);
                }
                float v7_7;
                com.lele.llmonitor.ui.widget.WidgetThemeColors v15_1 = ((com.lele.llmonitor.ui.widget.WidgetThemeColors) v15_0);
                g31 v13_6 = new i3[0];
                g31 vtmp38 = id1.q(e31.a).d(new mk(v15_1.getBackground())).d(hg.a).d(new g3(new vf3(r7.N(((i3[]) java.util.Arrays.copyOf(v13_6, 0))))));
                if (lj0.a(oj0.a(p17), 1120403456) >= 0) {
                    v7_7 = 1098907648;
                } else {
                    v7_7 = 1092616192;
                }
                ni1.c(vtmp38.d(new hg2(if1.F(v7_7), if1.F(v7_7), if1.F(v7_7), if1.F(v7_7))), 0, n54.K(-280167883, new com.lele.llmonitor.ui.widget.b(p17, this, v5_6, v0_5, v6_3, v8_0, v9_6, v10_5, v15_1), ((b20) p19)), ((b20) p19), 384);
            }
        }
        c00 v0_11 = ((b20) p19).r();
        if (v0_11 != null) {
            v0_11.d = new wl(this, p17, p20);
        }
        return;
    }

    public bc3 getSizeMode()
    {
        return this.sizeMode;
    }

    public bridge synthetic dc3 getSizeMode()
    {
        return this.getSizeMode();
    }

    public Object provideGlance(android.content.Context p3, d31 p4, n60 p5)
    {
        com.lele.llmonitor.ui.widget.BatteryWidget$provideGlance$1 v3_2;
        if (!(p5 instanceof com.lele.llmonitor.ui.widget.BatteryWidget$provideGlance$1)) {
            v3_2 = new com.lele.llmonitor.ui.widget.BatteryWidget$provideGlance$1(this, p5);
        } else {
            v3_2 = ((com.lele.llmonitor.ui.widget.BatteryWidget$provideGlance$1) p5);
            vl v4_4 = ((com.lele.llmonitor.ui.widget.BatteryWidget$provideGlance$1) p5).label;
            if ((v4_4 & -2147483648) == 0) {
            } else {
                ((com.lele.llmonitor.ui.widget.BatteryWidget$provideGlance$1) p5).label = (v4_4 - -2147483648);
            }
        }
        vl v4_1 = v3_2.result;
        int v5_1 = v3_2.label;
        if (v5_1 == 0) {
            ib1.Q(v4_1);
            android.content.Context v2_1 = new c00;
            v2_1(1988420461, new vl(this, 0), 1);
            v3_2.L$0 = 0;
            v3_2.L$1 = 0;
            v3_2.label = 1;
            ni1.M(v2_1, v3_2);
            return e80.d;
        } else {
            if (v5_1 == 1) {
                this = ((android.content.Context) v3_2.L$0);
                ib1.Q(v4_1);
                h.l();
                return 0;
            } else {
                h.m("call to \'resume\' before \'invoke\' with coroutine");
                return 0;
            }
        }
    }
}
