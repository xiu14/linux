package com.lele.llmonitor.ui.settings;
public final class SettingsScreenKt {
    private static final java.util.List ThemePaletteActiveRingHaloSpecs = None;
    private static final float ThemePaletteActiveRingInnerStrokeWidth = 1067030938;
    private static final float ThemePaletteActiveRingOuterAlpha = 1054280253;
    private static final float ThemePaletteActiveRingOuterStrokeWidth = 1075419546;

    static SettingsScreenKt()
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteActiveRingHaloSpecs = r7.M(new com.lele.llmonitor.ui.settings.HaloLayerSpec[] {new com.lele.llmonitor.ui.settings.HaloLayerSpec(1070218609, 1081291571, 1039516303), new com.lele.llmonitor.ui.settings.HaloLayerSpec(1068205343, 1076258406, 1046562734), new com.lele.llmonitor.ui.settings.HaloLayerSpec(1066695393, 1069547520, 1052266988), new com.lele.llmonitor.ui.settings.HaloLayerSpec(1065688760, 1060320051, 1057635697)}));
        return;
    }

    public static synthetic bw3 A(j72 p0, String p1, d11 p2, l52 p3, l52 p4, l52 p5, l52 p6, d11 p7, android.content.Context p8, l52 p9, l52 p10, l52 p11, l52 p12, h42 p13, l52 p14, l52 p15, jg2 p16, t10 p17, int p18)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18);
    }

    public static synthetic bw3 A0(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$0$3$0(p0, p1);
    }

    public static synthetic bw3 A1(int p0, l52 p1, android.content.Context p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$30$1$0$0(p0, p1, p2);
    }

    public static synthetic bw3 A2(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0$2$0$0(p0, p1);
    }

    private static final void AnimatedThemePaletteActiveRing-YlGCr2M(m22 p19, v93 p20, java.util.List p21, float p22, float p23, float p24, cg3 p25, t10 p26, int p27, int p28)
    {
        d11 v2_0;
        float v3_0;
        ((b20) p26).a0(2073869157);
        m22 v0_17 = (p28 & 1);
        if (v0_17 == null) {
            if ((p27 & 6) != 0) {
                v2_0 = p19;
                v3_0 = p27;
            } else {
                float v3_3;
                v2_0 = p19;
                if (!((b20) p26).f(p19)) {
                    v3_3 = 2;
                } else {
                    v3_3 = 4;
                }
                v3_0 = (v3_3 | p27);
            }
        } else {
            v3_0 = (p27 | 6);
            v2_0 = p19;
        }
        if ((p27 & 48) == 0) {
            float v6_7;
            if (!((b20) p26).f(p20)) {
                v6_7 = 16;
            } else {
                v6_7 = 32;
            }
            v3_0 |= v6_7;
        }
        if ((p27 & 384) == 0) {
            float v6_10;
            if (!((b20) p26).h(p21)) {
                v6_10 = 128;
            } else {
                v6_10 = 256;
            }
            v3_0 |= v6_10;
        }
        float v10_0;
        float v6_11 = (p28 & 8);
        if (v6_11 == 0) {
            if ((p27 & 3072) != 0) {
                v10_0 = p22;
            } else {
                int v11_1;
                v10_0 = p22;
                if (!((b20) p26).c(p22)) {
                    v11_1 = 1024;
                } else {
                    v11_1 = 2048;
                }
                v3_0 |= v11_1;
            }
        } else {
            v3_0 |= 3072;
        }
        float v13_1;
        int v11_2 = (p28 & 16);
        if (v11_2 == 0) {
            if ((p27 & 24576) != 0) {
                v13_1 = p23;
            } else {
                int v14_1;
                v13_1 = p23;
                if (!((b20) p26).c(p23)) {
                    v14_1 = 8192;
                } else {
                    v14_1 = 16384;
                }
                v3_0 |= v14_1;
            }
        } else {
            v3_0 |= 24576;
        }
        float v15;
        int v14_2 = (p28 & 32);
        if (v14_2 == 0) {
            v15 = p24;
            if ((p27 & 196608) == 0) {
                int v16_3;
                if (!((b20) p26).c(p24)) {
                    v16_3 = 65536;
                } else {
                    v16_3 = 131072;
                }
                v3_0 |= v16_3;
            }
        } else {
            v3_0 |= 196608;
            v15 = p24;
        }
        if ((p27 & 1572864) == 0) {
            int v17_1;
            if (!((b20) p26).f(p25)) {
                v17_1 = 524288;
            } else {
                v17_1 = 1048576;
            }
            v3_0 |= v17_1;
        }
        float v5_4;
        int v18 = 1;
        if ((v3_0 & 599187) == 599186) {
            v5_4 = 0;
        } else {
            v5_4 = 1;
        }
        float v4_0;
        int v1_1;
        float v6_0;
        float v5_1;
        if (!((b20) p26).O((v3_0 & 1), v5_4)) {
            ((b20) p26).R();
            v1_1 = v2_0;
            v4_0 = v10_0;
            v5_1 = v13_1;
            v6_0 = v15;
        } else {
            int v9_0;
            if (v0_17 == null) {
                v9_0 = v2_0;
            } else {
                v9_0 = j22.a;
            }
            if (v6_11 != 0) {
                v10_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteActiveRingOuterStrokeWidth;
            }
            float v4_1;
            if (v11_2 == 0) {
                v4_1 = v13_1;
            } else {
                v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteActiveRingInnerStrokeWidth;
            }
            float v5_2;
            if (v14_2 == 0) {
                v5_2 = v15;
            } else {
                v5_2 = 1054280253;
            }
            d11 v2_2;
            m22 v0_4 = ((b20) p26).h(p21);
            if ((v3_0 & 112) != 32) {
                v2_2 = 0;
            } else {
                v2_2 = 1;
            }
            d11 v2_4;
            if ((v3_0 & 7168) != 2048) {
                v2_4 = 0;
            } else {
                v2_4 = 1;
            }
            d11 v2_7;
            if ((57344 & v3_0) != 16384) {
                v2_7 = 0;
            } else {
                v2_7 = 1;
            }
            d11 v2_10;
            if ((458752 & v3_0) != 131072) {
                v2_10 = 0;
            } else {
                v2_10 = 1;
            }
            if ((3670016 & v3_0) != 1048576) {
                v18 = 0;
            }
            float v3_4;
            m22 v0_9 = (((((v0_4 | v2_2) | v2_4) | v2_7) | v2_10) | v18);
            d11 v2_13 = ((b20) p26).L();
            if ((v0_9 == null) && (v2_13 != r10.a)) {
                v3_4 = v10_0;
            } else {
                v3_4 = v10_0;
                m22 v0_12 = new t73(p21, p20, v3_4, v4_1, v5_2, p25);
                ((b20) p26).j0(v0_12);
                v2_13 = v0_12;
            }
            sn.a(n54.u(v9_0, ((d11) v2_13)), ((b20) p26), 0);
            v6_0 = v5_2;
            v1_1 = v9_0;
            v5_1 = v4_1;
            v4_0 = v3_4;
        }
        float v10_1 = ((b20) p26).r();
        if (v10_1 != 0) {
            v10_1.d = new u73(v1_1, p20, p21, v4_0, v5_1, v6_0, p25, p27, p28);
        }
        return;
    }

    private static final float AnimatedThemePaletteActiveRing_YlGCr2M$lambda$0(cg3 p0)
    {
        return ((Number) p0.getValue()).floatValue();
    }

    private static final gl0 AnimatedThemePaletteActiveRing_YlGCr2M$lambda$1$0(java.util.List p16, v93 p17, float p18, float p19, float p20, cg3 p21, rr p22)
    {
        kt2 v1_1;
        p22.getClass();
        if (!p16.isEmpty()) {
            v1_1 = p16;
        } else {
            kt2 v1_9 = fx.c;
            v1_1 = r7.M(new fx[] {new fx(v1_9), new fx(v1_9)}));
        }
        if (!fx.c(((fx) yw.z0(v1_1)).a, ((fx) yw.G0(v1_1)).a)) {
            v1_1 = yw.N0(v1_1, yw.z0(v1_1));
        }
        float v6 = (Float.intBitsToFloat(((int) (p22.d.b() >> 32))) / 1073741824);
        float v7_1 = (Float.intBitsToFloat(((int) (p22.d.b() & 4294967295))) / 1073741824);
        java.util.Iterator v2_16 = new java.util.ArrayList(zw.j0(v1_1, 10));
        kt2 v1_8 = v1_1.iterator();
        while (v1_8.hasNext()) {
            v2_16.add(Integer.valueOf(jn.Q(((fx) v1_8.next()).a)));
        }
        android.graphics.SweepGradient v8_1 = new android.graphics.SweepGradient(v6, v7_1, yw.V0(v2_16), 0);
        kt2 v1_14 = p17.createOutline-Pq9zytI(p22.d.b(), gl0 v0_0.d.getLayoutDirection(), p22);
        da v10 = ga.a();
        if (!(v1_14 instanceof jf2)) {
            if (!(v1_14 instanceof lf2)) {
                if (!(v1_14 instanceof kf2)) {
                    h.b();
                    return 0;
                } else {
                    ui2.a(v10, ((kf2) v1_14).a);
                }
            } else {
                ui2.c(v10, ((lf2) v1_14).a);
            }
        } else {
            v10.d(((jf2) v1_14).a, 0);
        }
        kt2 v1_6 = (p22.a() * p18);
        float v9_1 = (p22.a() * p19);
        wo v11_0 = new wo(v8_1);
        android.graphics.Path v14 = v10.a;
        android.graphics.Matrix v5_1 = new android.graphics.Matrix();
        java.util.Iterator v2_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteActiveRingHaloSpecs;
        java.util.ArrayList v13_1 = new java.util.ArrayList(zw.j0(v2_0, 10));
        java.util.Iterator v2_1 = v2_0.iterator();
        while (v2_1.hasNext()) {
            float v3_3 = ((com.lele.llmonitor.ui.settings.HaloLayerSpec) v2_1.next());
            b83 v4_4 = new android.graphics.Paint(1);
            v4_4.setStyle(android.graphics.Paint$Style.STROKE);
            v4_4.setStrokeJoin(android.graphics.Paint$Join.ROUND);
            v4_4.setStrokeCap(android.graphics.Paint$Cap.ROUND);
            v4_4.setStrokeWidth((v3_3.getStrokeWidthScale() * v1_6));
            kt2 v16_1 = v1_6;
            v4_4.setAlpha(ib1.l(((int) ((1132396544 * p20) * v3_3.getAlphaScale())), 0, 255));
            v4_4.setShader(v8_1);
            v4_4.setMaskFilter(new android.graphics.BlurMaskFilter((v3_3.getBlurRadiusScale() * v16_1), android.graphics.BlurMaskFilter$Blur.NORMAL));
            v13_1.add(v4_4);
            v1_6 = v16_1;
        }
        return p22.c(new b83(v5_1, v6, v7_1, v8_1, v9_1, v10, v11_0, p21, v13_1, v14));
    }

    private static final bw3 AnimatedThemePaletteActiveRing_YlGCr2M$lambda$1$0$3(android.graphics.Matrix p7, float p8, float p9, android.graphics.SweepGradient p10, float p11, ui2 p12, p93 p13, cg3 p14, java.util.List p15, android.graphics.Path p16, g50 p17)
    {
        p17.getClass();
        p7.reset();
        p7.setRotate(com.lele.llmonitor.ui.settings.SettingsScreenKt.AnimatedThemePaletteActiveRing_YlGCr2M$lambda$0(p14), p8, p9);
        p10.setLocalMatrix(p7);
        bw3 v7_1 = ((ep1) p17).d.e.v();
        java.util.Iterator v8_1 = p15.iterator();
        while (v8_1.hasNext()) {
            g6.a(v7_1).drawPath(p16, ((android.graphics.Paint) v8_1.next()));
        }
        hl0.h(p17, p12, p13, 1065353216, new ph3(p11, 0, 0, 0, 0, 30), 48);
        return bw3.a;
    }

    private static final bw3 AnimatedThemePaletteActiveRing_YlGCr2M$lambda$2(m22 p11, v93 p12, java.util.List p13, float p14, float p15, float p16, cg3 p17, int p18, int p19, t10 p20, int p21)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.AnimatedThemePaletteActiveRing-YlGCr2M(p11, p12, p13, p14, p15, p16, p17, p20, vc1.b0((p18 | 1)), p19);
        return bw3.a;
    }

    public static synthetic bw3 B(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$29(p0, p1, p2);
    }

    public static synthetic bw3 B0(s01 p0, cy p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.DataManagementPage$lambda$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 B1(String p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$0$0(p0);
    }

    public static synthetic bw3 B2(int p0, d11 p1, s01 p2, cy p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 C(com.lele.llmonitor.ui.dashboard.BatteryViewModel p0, l52 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$28$0$0(p0, p1);
    }

    public static synthetic bw3 C0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$33$2$0$0(p0);
    }

    public static synthetic bw3 C1(long p0, long p2, java.util.List p4, cg3 p5, boolean p6, m22 p7, int p8, int p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePalettePreviewBlock_1Kfb2uI$lambda$1(p0, p2, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public static synthetic bw3 C2(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$3$0$0(p0, p1);
    }

    public static synthetic bw3 D(float p0, l52 p1, l52 p2, hz1 p3, l52 p4, c42 p5, l52 p6, c42 p7, l52 p8, l52 p9, l52 p10, cy p11, t10 p12, int p13)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public static synthetic bw3 D0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$31$0$0(p0);
    }

    public static synthetic oi0 D1(yt1 p0, android.content.Context p1, l52 p2, pi0 p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$26$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 D2(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$1$0$0(p0);
    }

    private static final void DataManagementPage(s01 p10, t10 p11, int p12)
    {
        at2 v11_3;
        ((b20) p11).a0(254783759);
        if ((p12 & 6) != 0) {
            v11_3 = p12;
        } else {
            at2 v11_2;
            if (!((b20) p11).h(p10)) {
                v11_2 = 2;
            } else {
                v11_2 = 4;
            }
            v11_3 = (v11_2 | p12);
        }
        int v1_0;
        if ((v11_3 & 3) == 2) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        if (!((b20) p11).O((v11_3 & 1), v1_0)) {
            ((b20) p11).R();
        } else {
            com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6570\u636e\u7ba1\u7406"), n54.C(j22.a, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5386\u53f2\u8bb0\u5f55\u7ef4\u62a4"), wb0.y(), 0, 0, n54.K(1882815616, new u(4, p10), ((b20) p11)), ((b20) p11), 1572864, 48);
        }
        at2 v11_10 = ((b20) p11).r();
        if (v11_10 != null) {
            v11_10.d = new q(p12, 6, p10);
        }
        return;
    }

    private static final bw3 DataManagementPage$lambda$0(s01 p9, cy p10, t10 p11, int p12)
    {
        int v10_6;
        p10.getClass();
        if ((p12 & 17) == 16) {
            v10_6 = 0;
        } else {
            v10_6 = 1;
        }
        if (!((b20) p11).O((p12 & 1), v10_6)) {
            ((b20) p11).R();
        } else {
            int v10_3 = ((b20) p11).f(p9);
            s01 v11_1 = ((b20) p11).L();
            if ((v10_3 != 0) || (v11_1 == r10.a)) {
                v11_1 = new eg(4, p9);
                ((b20) p11).j0(v11_1);
            }
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v9_3 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
            bd1.d(v9_3.getLambda$-1798519838$app(), ix2.q(j22.a, ((s01) v11_1)), v9_3.getLambda$-889857665$app(), v9_3.getLambda$-586970274$app(), 0, ad1.p(fx.f, ((b20) p11)), ((b20) p11), 27654, 420);
        }
        return bw3.a;
    }

    private static final bw3 DataManagementPage$lambda$0$0$0(s01 p0)
    {
        p0.invoke();
        return bw3.a;
    }

    private static final bw3 DataManagementPage$lambda$1(s01 p0, int p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.DataManagementPage(p0, p2, vc1.b0((p1 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 E(h42 p0, int p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2$0$0$0$0$0(p0, p1);
    }

    public static synthetic bw3 E0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$29$0$0(p0);
    }

    public static synthetic bw3 E1(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$0$1$0(p0, p1);
    }

    public static synthetic bw3 E2(l52 p0, c42 p1, float p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$5$0(p0, p1, p2);
    }

    private static final void EmptyWallpaperThumbnail(t10 p9, int p10)
    {
        md1 v0_5;
        ((b20) p9).a0(1400069226);
        if (p10 == 0) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (!((b20) p9).O((p10 & 1), v0_5)) {
            ((b20) p9).R();
        } else {
            int v9_1 = sn.d(px2.j, 0);
            int v1_1 = p34.x(((b20) p9));
            m22 v2_0 = ((b20) p9).l();
            md1 v0_2 = jn.K(((b20) p9), ac3.c);
            o10.b.getClass();
            ((b20) p9).c0();
            if (!((b20) p9).S) {
                ((b20) p9).m0();
            } else {
                ((b20) p9).k(n10.b);
            }
            se1.L(((b20) p9), n10.f, v9_1);
            se1.L(((b20) p9), n10.e, v2_0);
            if ((((b20) p9).S) || (!ni1.o(((b20) p9).L(), Integer.valueOf(v1_1)))) {
                ve2.v(v1_1, ((b20) p9), v1_1, n10.g);
            }
            se1.L(((b20) p9), n10.d, v0_2);
            pc1.a(ad1.C(), 0, ac3.i(j22.a, 1103101952), ((mx) ((b20) p9).j(ox.a)).s, ((b20) p9), 432, 0);
            ((b20) p9).p(1);
        }
        int v9_11 = ((b20) p9).r();
        if (v9_11 != 0) {
            v9_11.d = new p(p10, 5);
        }
        return;
    }

    private static final bw3 EmptyWallpaperThumbnail$lambda$1(int p0, t10 p1, int p2)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.EmptyWallpaperThumbnail(p1, vc1.b0((p0 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 F(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$0$0$0(p0, p1);
    }

    public static synthetic bw3 F0(l52 p0, l52 p1, com.lele.llmonitor.data.AppLanguageOption p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0$0$3$0(p0, p1, p2);
    }

    public static synthetic bw3 F1(l52 p0, d11 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$3(p0, p1, p2, p3);
    }

    public static synthetic bw3 F2(j72 p0, ad p1, l62 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$6(p0, p1, p2, p3, p4);
    }

    public static final void FrequencySelectorItem(String p14, long p15, java.util.List p17, d11 p18, t10 p19, int p20)
    {
        oc1 v0_0;
        p14.getClass();
        p17.getClass();
        p18.getClass();
        ((b20) p19).a0(-232581663);
        if ((p20 & 6) != 0) {
            v0_0 = p20;
        } else {
            oc1 v0_2;
            if (!((b20) p19).f(p14)) {
                v0_2 = 2;
            } else {
                v0_2 = 4;
            }
            v0_0 = (v0_2 | p20);
        }
        if ((p20 & 48) == 0) {
            String v1_2;
            if (!((b20) p19).e(p15)) {
                v1_2 = 16;
            } else {
                v1_2 = 32;
            }
            v0_0 |= v1_2;
        }
        if ((p20 & 384) == 0) {
            String v1_5;
            if (!((b20) p19).h(p17)) {
                v1_5 = 128;
            } else {
                v1_5 = 256;
            }
            v0_0 |= v1_5;
        }
        if ((p20 & 3072) == 0) {
            String v1_8;
            if (!((b20) p19).h(p18)) {
                v1_8 = 1024;
            } else {
                v1_8 = 2048;
            }
            v0_0 |= v1_8;
        }
        String v1_10;
        if ((v0_0 & 1171) == 1170) {
            v1_10 = 0;
        } else {
            v1_10 = 1;
        }
        if (!((b20) p19).O((v0_0 & 1), v1_10)) {
            ((b20) p19).R();
        } else {
            oc1 v0_5 = ((b20) p19).L();
            String v1_11 = r10.a;
            if (v0_5 == v1_11) {
                v0_5 = qc1.G(Boolean.FALSE);
                ((b20) p19).j0(v0_5);
            }
            l52 v11_1 = ((l52) v0_5);
            oc1 v0_8 = com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$1(v11_1);
            d11 v5_1 = ((b20) p19).L();
            if (v5_1 == v1_11) {
                v5_1 = new ub(v11_1, 11);
                ((b20) p19).j0(v5_1);
            }
            r7.g(v0_8, ((d11) v5_1), 0, n54.K(180394359, new w83(p15, p14, v11_1, p17, p18), ((b20) p19)), ((b20) p19), 3120);
        }
        w83 v7_3 = ((b20) p19).r();
        if (v7_3 != null) {
            v7_3.d = new oc1(p14, p15, p17, p18, p20);
        }
        return;
    }

    private static final String FrequencySelectorItem$formatDuration(long p5)
    {
        if (p5 >= 1000) {
            if (p5 >= 60000) {
                String v5_10 = (p5 / 60000);
                StringBuilder v0_6 = new StringBuilder();
                v0_6.append(v5_10);
                v0_6.append("\u5206\u949f");
                return com.lele.llmonitor.i18n.TextI18nKt.l10n(v0_6.toString());
            } else {
                String v5_4 = (p5 / 1000);
                StringBuilder v0_2 = new StringBuilder();
                v0_2.append(v5_4);
                v0_2.append("\u79d2");
                return com.lele.llmonitor.i18n.TextI18nKt.l10n(v0_2.toString());
            }
        } else {
            StringBuilder v0_4 = new StringBuilder();
            v0_4.append(p5);
            v0_4.append("ms");
            return v0_4.toString();
        }
    }

    private static final boolean FrequencySelectorItem$lambda$1(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final void FrequencySelectorItem$lambda$2(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final bw3 FrequencySelectorItem$lambda$3$0(l52 p0, boolean p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$2(p0, (com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$1(p0) ^ 1));
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4(long p31, String p33, l52 p34, java.util.List p35, d11 p36, zr0 p37, t10 p38, int p39)
    {
        long v7_1;
        p37.getClass();
        if ((p39 & 6) != 0) {
            v7_1 = p39;
        } else {
            zr0 v0_0;
            if ((p39 & 8) != 0) {
                v0_0 = ((b20) p38).h(p37);
            } else {
                v0_0 = ((b20) p38).f(p37);
            }
            zr0 v0_10;
            if (v0_0 == null) {
                v0_10 = 2;
            } else {
                v0_10 = 4;
            }
            v7_1 = (p39 | v0_10);
        }
        zr0 v0_14;
        if ((v7_1 & 19) == 18) {
            v0_14 = 0;
        } else {
            v0_14 = 1;
        }
        if (!((b20) p38).O((v7_1 & 1), v0_14)) {
            ((b20) p38).R();
        } else {
            zr0 v0_17 = com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$formatDuration(p31);
            s01 v2_9 = yp3.a(((mu3) ((b20) p38).j(ou3.a)).i, 0, 0, hz0.h, 0, 0, 0, 0, 16777211);
            int v4_1 = com.lele.llmonitor.ui.theme.AppShapes.INSTANCE;
            com.lele.llmonitor.ui.theme.AppCorners v28 = com.lele.llmonitor.ui.theme.AppCorners.INSTANCE;
            v93 v22 = v4_1.g2-0680j_4(v28.getMd-D9Ej5fM());
            c00 v15_2 = ox.a;
            yp3 v38_1 = v2_9;
            gn3 v23_1 = bs0.b(((mx) ((b20) p38).j(v15_2)).a, ((mx) ((b20) p38).j(v15_2)).B, ((mx) ((b20) p38).j(v15_2)).a, ((b20) p38));
            c00 v10_7 = p37.b(ac3.c(j22.a, 1065353216));
            boolean v1_15 = ((b20) p38).L();
            s01 v2_11 = r10.a;
            if (v1_15 == v2_11) {
                v1_15 = new p63(1);
                ((b20) p38).j0(v1_15);
            }
            zr0 v0_2 = v15_2;
            df1.b(v0_17, ((d11) v1_15), v10_7, 0, 1, v38_1, n54.K(-1129486831, new u90(p33, 3), ((b20) p38)), n54.K(-1646531154, new wr0(p34, 2), ((b20) p38)), 0, 0, 0, 0, 0, 0, v22, v23_1, ((b20) p38), 806903856, 0, 2096520);
            b20 v11_1 = ((b20) p38);
            boolean v8_3 = com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$1(p34);
            boolean v1_3 = ((b20) p38).L();
            if (v1_3 == v2_11) {
                v1_3 = new wb(p34, 13);
                ((b20) p38).j0(v1_3);
            }
            p37.a(v8_3, ((s01) v1_3), 0, 0, 0, v4_1.g2-0680j_4(v28.getMd-D9Ej5fM()), ((mx) v11_1.j(v0_2)).G, 0, n54.K(2014151605, new s73(p35, p36, p31, p34), v11_1), v11_1, 48, (((v7_1 << 3) & 112) | 6));
        }
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$0$0(String p0)
    {
        p0.getClass();
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$1(String p24, t10 p25, int p26)
    {
        bw3 v0_3;
        if ((p26 & 3) == 2) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_3)) {
            ((b20) p25).R();
        } else {
            bp3.b(p24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$2(l52 p4, t10 p5, int p6)
    {
        int v0_2;
        if ((p6 & 3) == 2) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if (!((b20) p5).O((p6 & 1), v0_2)) {
            ((b20) p5).R();
        } else {
            bs0.a.a(com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$1(p4), 0, ((b20) p5), 0);
        }
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$3$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$2(p1, 0);
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$4(java.util.List p12, d11 p13, long p14, l52 p16, cy p17, t10 p18, int p19)
    {
        int v0_7;
        p17.getClass();
        if ((p19 & 17) == 16) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        if (!((b20) p18).O((p19 & 1), v0_7)) {
            ((b20) p18).R();
        } else {
            bw3 v12_1 = p12.iterator();
            while (v12_1.hasNext()) {
                int v0_5 = ((Number) v12_1.next()).longValue();
                c00 v2_3 = n54.K(2094830752, new o73(v0_5), ((b20) p18));
                s01 v3_2 = (((b20) p18).f(p13) | ((b20) p18).e(v0_5));
                int v4_1 = ((b20) p18).L();
                if ((v3_2 != null) || (v4_1 == r10.a)) {
                    v4_1 = new k83(p13, v0_5, p16);
                    ((b20) p18).j0(v4_1);
                }
                int v0_8;
                s01 v3_5 = ((s01) v4_1);
                if (v0_5 != p14) {
                    v0_8 = 0;
                } else {
                    v0_8 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-851925919$app();
                }
                t9.a(v2_3, v3_5, 0, v0_8, 0, 0, 0, ((b20) p18), 6);
            }
        }
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$4$0$0(long p24, t10 p26, int p27)
    {
        bw3 v0_4;
        if ((p27 & 3) == 2) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        if (!((b20) p26).O((p27 & 1), v0_4)) {
            ((b20) p26).R();
        } else {
            bp3.b(com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$formatDuration(p24), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p26), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$4$4$0$1$0(d11 p0, long p1, l52 p3)
    {
        p0.invoke(Long.valueOf(p1));
        com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$2(p3, 0);
        return bw3.a;
    }

    private static final bw3 FrequencySelectorItem$lambda$5(String p7, long p8, java.util.List p10, d11 p11, int p12, t10 p13, int p14)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(p7, p8, p10, p11, p13, vc1.b0((p12 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 G(s01 p0, cy p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 G0(d11 p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 G1(int p0, d11 p1, s01 p2, s01 p3, int p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$1(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 G2(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$33$2(p0, p1, p2);
    }

    public static synthetic bw3 H(d11 p0, j72 p1, ms1 p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$0$0$0(p0, p1, p2);
    }

    public static synthetic bw3 H0(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0$1$0$0(p0, p1);
    }

    public static synthetic bw3 H1(d11 p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$2(p0, p1, p2, p3);
    }

    public static synthetic bw3 H2(l52 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$3$0(p0, p1);
    }

    private static final void HardwareSettingsPage(s01 p11, t10 p12, int p13)
    {
        at2 v12_3;
        ((b20) p12).a0(1156026033);
        if ((p13 & 6) != 0) {
            v12_3 = p13;
        } else {
            at2 v12_2;
            if (!((b20) p12).h(p11)) {
                v12_2 = 2;
            } else {
                v12_2 = 4;
            }
            v12_3 = (v12_2 | p13);
        }
        m22 v1_1;
        if ((v12_3 & 3) == 2) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        if (!((b20) p12).O((v12_3 & 1), v1_1)) {
            ((b20) p12).R();
        } else {
            com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u786c\u4ef6\u4fee\u6b63"), n54.C(j22.a, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), com.lele.llmonitor.i18n.TextI18nKt.l10n("\u517c\u5bb9\u4e0d\u540c\u8bbe\u5907\u7684\u7535\u6c60\u8bfb\u6570"), ib1.A(), 0, 0, n54.K(-1968422430, new u(2, p11), ((b20) p12)), ((b20) p12), 1572864, 48);
        }
        at2 v12_10 = ((b20) p12).r();
        if (v12_10 != null) {
            v12_10.d = new q(p13, 4, p11);
        }
        return;
    }

    private static final bw3 HardwareSettingsPage$lambda$0(s01 p17, cy p18, t10 p19, int p20)
    {
        a83 v1_3;
        p18.getClass();
        if ((p20 & 17) == 16) {
            v1_3 = 0;
        } else {
            v1_3 = 1;
        }
        if (!((b20) p19).O((p20 & 1), v1_3)) {
            ((b20) p19).R();
        } else {
            a83 v1_1 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
            long v12 = fx.f;
            bd1.d(v1_1.getLambda$-678741820$app(), 0, v1_1.getLambda$667245345$app(), 0, n54.K(-1298741409, new a83(4, p17), ((b20) p19)), ad1.p(v12, ((b20) p19)), ((b20) p19), 199686, 406);
            int v2_3 = j22.a;
            p34.b(n54.F(v2_3, 1098907648, 0, 2), 0, 0, ((b20) p19), 6, 6);
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v18_1 = v1_1;
            bd1.d(v1_1.getLambda$-1995928211$app(), 0, v1_1.getLambda$-1287418742$app(), 0, n54.K(-815079096, new a83(5, p17), ((b20) p19)), ad1.p(v12, ((b20) p19)), ((b20) p19), 199686, 406);
            p34.b(n54.F(v2_3, 1098907648, 0, 2), 0, 0, ((b20) p19), 6, 6);
            b20 v9_4 = ((b20) p19);
            bd1.d(v18_1.getLambda$1436734924$app(), 0, v18_1.getLambda$2145244393$app(), 0, n54.K(-1677383257, new a83(6, p17), v9_4), ad1.p(v12, v9_4), v9_4, 199686, 406);
        }
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$0$0(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isInvertCurrent().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(19, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$0$0$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleInvertCurrent(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$0$1(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isDoubleCell().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(22, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$0$1$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleDoubleCell(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$0$2(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isVirtualVoltageEnabled().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(21, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$0$2$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleVirtualVoltageEnabled(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 HardwareSettingsPage$lambda$1(s01 p0, int p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage(p0, p2, vc1.b0((p1 | 1)));
        return bw3.a;
    }

    private static final void HistoryWallpaperDeleteButton(wn p10, s01 p11, t10 p12, int p13)
    {
        int v12_2;
        ((b20) p12).a0(-94603113);
        if ((p13 & 6) != 0) {
            v12_2 = p13;
        } else {
            int v12_1;
            if (!((b20) p12).f(p10)) {
                v12_1 = 2;
            } else {
                v12_1 = 4;
            }
            v12_2 = (v12_1 | p13);
        }
        if ((p13 & 48) == 0) {
            at2 v0_2;
            if (!((b20) p12).h(p11)) {
                v0_2 = 16;
            } else {
                v0_2 = 32;
            }
            v12_2 |= v0_2;
        }
        at2 v0_4;
        if ((v12_2 & 19) == 18) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        at2 v0_6;
        if (!((b20) p12).O((v12_2 & 1), v0_4)) {
            v0_6 = p11;
            ((b20) p12).R();
        } else {
            at2 v0_9 = n54.D(p10.a(px2.n), 1086324736);
            m22 v1_4 = sn.d(px2.f, 0);
            int v2_1 = p34.x(((b20) p12));
            int v3_0 = ((b20) p12).l();
            at2 v0_10 = jn.K(((b20) p12), v0_9);
            o10.b.getClass();
            ((b20) p12).c0();
            if (!((b20) p12).S) {
                ((b20) p12).m0();
            } else {
                ((b20) p12).k(n10.b);
            }
            se1.L(((b20) p12), n10.f, v1_4);
            se1.L(((b20) p12), n10.e, v3_0);
            if ((((b20) p12).S) || (!ni1.o(((b20) p12).L(), Integer.valueOf(v2_1)))) {
                ve2.v(v2_1, ((b20) p12), v2_1, n10.g);
            }
            se1.L(((b20) p12), n10.d, v0_10);
            v0_6 = p11;
            r7.h(p11, ac3.i(j22.a, 1110441984), 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-347664269$app(), ((b20) p12), (((v12_2 >> 3) & 14) | 1572912), 60);
            ((b20) p12).p(1);
        }
        at2 v11_1 = ((b20) p12).r();
        if (v11_1 != null) {
            v11_1.d = new ie(p13, 12, p10, v0_6);
        }
        return;
    }

    private static final bw3 HistoryWallpaperDeleteButton$lambda$1(wn p0, s01 p1, int p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.HistoryWallpaperDeleteButton(p0, p1, p3, vc1.b0((p2 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 I(boolean p0, s01 p1, j72 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$34$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 I0(java.util.List p0, int p1, d11 p2, kb3 p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 I1(j72 p0, ad p1, l62 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$7(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 I2(android.content.Context p0, j72 p1, h42 p2, ms1 p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2$0$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 J(d11 p0, j72 p1, String p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$0$0$0$0(p0, p1, p2);
    }

    public static synthetic bw3 J0(com.lele.llmonitor.ui.dashboard.BatteryViewModel p0, s01 p1, boolean p2, String p3, d11 p4, d11 p5, int p6, int p7, t10 p8, int p9)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$36(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic bw3 J1(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$3$0(p0);
    }

    public static synthetic bw3 J2(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0$1(p0, p1, p2);
    }

    public static synthetic bw3 K(d11 p0, j72 p1, l52 p2, l52 p3, l52 p4, l52 p5, d11 p6, l52 p7, l52 p8, l52 p9, l52 p10, android.content.Context p11, h42 p12, l52 p13, l52 p14, f72 p15)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15);
    }

    public static synthetic bw3 K0(s01 p0, long p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$7$1$0(p0, p1);
    }

    public static synthetic bw3 K1(j72 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$6$0$0(p0);
    }

    public static synthetic bw3 K2(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$5$0$0(p0);
    }

    public static synthetic bw3 L(int p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.EmptyWallpaperThumbnail$lambda$1(p0, p1, p2);
    }

    public static synthetic bw3 L0(d11 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$4(p0, p1, p2);
    }

    public static synthetic bw3 L1(l52 p0, c42 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$6$0(p0, p1);
    }

    public static synthetic bw3 L2(d11 p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$5(p0, p1, p2, p3);
    }

    public static final void LLClassStyleAppearanceCard(int p57, com.lele.llmonitor.data.FollowSystemAppIconMode p58, com.lele.llmonitor.data.AppLanguageOption p59, com.lele.llmonitor.ui.theme.ThemePalettePreset p60, d11 p61, d11 p62, d11 p63, d11 p64, d11 p65, t10 p66, int p67)
    {
        int v3_2;
        p58.getClass();
        p59.getClass();
        p60.getClass();
        p61.getClass();
        p62.getClass();
        p63.getClass();
        p64.getClass();
        p65.getClass();
        ((b20) p66).a0(-839209504);
        if ((p67 & 6) != 0) {
            v3_2 = p67;
        } else {
            int v3_17;
            if (!((b20) p66).d(p57)) {
                v3_17 = 2;
            } else {
                v3_17 = 4;
            }
            v3_2 = (v3_17 | p67);
        }
        if ((p67 & 48) == 0) {
            l52 v4_8;
            if (!((b20) p66).d(p58.ordinal())) {
                v4_8 = 16;
            } else {
                v4_8 = 32;
            }
            v3_2 |= v4_8;
        }
        if ((p67 & 384) == 0) {
            l52 v4_12;
            if (!((b20) p66).d(p59.ordinal())) {
                v4_12 = 128;
            } else {
                v4_12 = 256;
            }
            v3_2 |= v4_12;
        }
        if ((p67 & 3072) == 0) {
            l52 v4_16;
            if (!((b20) p66).d(p60.ordinal())) {
                v4_16 = 1024;
            } else {
                v4_16 = 2048;
            }
            v3_2 |= v4_16;
        }
        if ((p67 & 24576) == 0) {
            l52 v4_22;
            if (!((b20) p66).h(p61)) {
                v4_22 = 8192;
            } else {
                v4_22 = 16384;
            }
            v3_2 |= v4_22;
        }
        if ((196608 & p67) == 0) {
            l52 v4_26;
            if (!((b20) p66).h(p62)) {
                v4_26 = 65536;
            } else {
                v4_26 = 131072;
            }
            v3_2 |= v4_26;
        }
        if ((1572864 & p67) == 0) {
            xe3 v7_10;
            if (!((b20) p66).h(p63)) {
                v7_10 = 524288;
            } else {
                v7_10 = 1048576;
            }
            v3_2 |= v7_10;
        }
        if ((12582912 & p67) == 0) {
            String v11_43;
            if (!((b20) p66).h(p64)) {
                v11_43 = 4194304;
            } else {
                v11_43 = 8388608;
            }
            v3_2 |= v11_43;
        }
        if ((100663296 & p67) == 0) {
            String v11_1;
            if (!((b20) p66).h(p65)) {
                v11_1 = 33554432;
            } else {
                v11_1 = 67108864;
            }
            v3_2 |= v11_1;
        }
        String v11_5;
        if ((38347923 & v3_2) == 38347922) {
            v11_5 = 0;
        } else {
            v11_5 = 1;
        }
        l52 v18_7;
        if (!((b20) p66).O((v3_2 & 1), v11_5)) {
            v18_7 = ((b20) p66);
            ((b20) p66).R();
        } else {
            int v5_9 = r7.M(new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption[] {new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption(0, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u8ddf\u968f\u7cfb\u7edf"), dd2.u()), new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption(1, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6d45\u8272\u6a21\u5f0f"), df1.A()), new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption(2, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6df1\u8272\u6a21\u5f0f"), wm1.d0())}));
            int v19_10 = v3_2;
            m22 v1_23 = r7.M(new qh2[] {new qh2(com.lele.llmonitor.data.AppLanguageOption.FOLLOW_SYSTEM, "Follow System"), new qh2(com.lele.llmonitor.data.AppLanguageOption.ENGLISH, "English"), new qh2(com.lele.llmonitor.data.AppLanguageOption.CHINESE_SIMPLIFIED_CHINA, "\u7b80\u4f53\u4e2d\u6587\uff08\u4e2d\u56fd\uff09"), new qh2(com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_HONG_KONG, "\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u9999\u6e2f\uff09"), new qh2(com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_TAIWAN, "\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u53f0\u7063\uff09")}));
            int v2_5 = v1_23.iterator();
            while (v2_5.hasNext()) {
                int v3_11 = v2_5.next();
                if (((qh2) v3_11).d == p59) {
                }
                int v2_7;
                int v3_12 = ((qh2) v3_11);
                if (v3_12 == 0) {
                    v2_7 = "English";
                } else {
                    v2_7 = ((String) v3_12.e);
                    if (v2_7 == 0) {
                    }
                }
                String v33;
                int v32;
                boolean v31 = com.lele.llmonitor.ui.theme.ThemeKt.isAppInDarkTheme(((b20) p66), 0);
                md1 v14_15 = com.lele.llmonitor.ui.wallpaper.HomeWallpaperViewportKt.rememberHomeWallpaperViewportSize(((b20) p66), 0);
                int v3_14 = ((b20) p66).e(v14_15);
                m22 v12_10 = ((b20) p66).L();
                String v11_18 = r10.a;
                if ((v3_14 == 0) && (v12_10 != v11_18)) {
                    v32 = v1_23;
                    v33 = v2_7;
                } else {
                    v32 = v1_23;
                    v33 = v2_7;
                    v12_10 = Float.valueOf(ib1.k((Float.intBitsToFloat(((int) (v14_15 >> 32))) / Float.intBitsToFloat(((int) (4294967295 & v14_15)))), 1050253722, 1060320051));
                    ((b20) p66).j0(v12_10);
                }
                String v35_0 = ((Number) v12_10).floatValue();
                m22 v1_30 = com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE;
                int v2_13 = v1_30.isEnabled();
                int v3_18 = v1_30.getWallpaperAlpha();
                m22 v12_12 = v1_30.getWallpaperBlur();
                int v36_0 = v1_30.getWallpaperFile();
                int v39_0 = v1_30.getHistoryFiles();
                m22 v1_32 = com.lele.llmonitor.data.SettingsManager.INSTANCE.getHomeCardOpacity();
                md1 v14_16 = ((b20) p66).L();
                if (v14_16 == v11_18) {
                    v14_16 = new ci2(ib1.k((1065353216 - com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$7(v1_32)), 0, 1065353216));
                    ((b20) p66).j0(v14_16);
                }
                l52 v4_4 = ((c42) v14_16);
                md1 v14_20 = ((b20) p66).L();
                if (v14_20 == v11_18) {
                    v14_20 = qc1.G(Boolean.FALSE);
                    ((b20) p66).j0(v14_20);
                }
                ld1 v34_0;
                md1 v14_22 = ((l52) v14_20);
                int v15_15 = ((b20) p66).L();
                if (v15_15 != v11_18) {
                    v34_0 = v5_9;
                } else {
                    v34_0 = v5_9;
                    int v5_11 = new ci2(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$3(v3_18));
                    ((b20) p66).j0(v5_11);
                    v15_15 = v5_11;
                }
                int v5_13 = ((c42) v15_15);
                int v15_17 = ((b20) p66).L();
                if (v15_17 == v11_18) {
                    v15_17 = qc1.G(Boolean.FALSE);
                    ((b20) p66).j0(v15_17);
                }
                int v15_19 = ((l52) v15_17);
                md1 v6_2 = ((b20) p66).L();
                if (v6_2 == v11_18) {
                    xe3 v7_2 = new ci2(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$4(v12_12));
                    ((b20) p66).j0(v7_2);
                    v6_2 = v7_2;
                }
                md1 v6_4 = ((c42) v6_2);
                xe3 v7_3 = ((b20) p66).L();
                if (v7_3 == v11_18) {
                    v7_3 = qc1.G(Boolean.FALSE);
                    ((b20) p66).j0(v7_3);
                }
                xe3 v7_5 = ((l52) v7_3);
                int v8_1 = ((b20) p66).L();
                if (v8_1 == v11_18) {
                    v8_1 = qc1.G(0);
                    ((b20) p66).j0(v8_1);
                }
                int v2_15;
                int v8_2 = ((l52) v8_1);
                int v10_4 = new u3(0);
                int v43_0 = v2_13;
                if ((v19_10 & 234881024) != 67108864) {
                    v2_15 = 0;
                } else {
                    v2_15 = 1;
                }
                int v13_18 = ((b20) p66).L();
                if ((v2_15 != 0) || (v13_18 == v11_18)) {
                    v13_18 = new ea0(1, p65);
                    ((b20) p66).j0(v13_18);
                }
                int v38_0 = mi1.F(v10_4, ((d11) v13_18), ((b20) p66), 0);
                int v2_19 = Float.valueOf(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$3(v3_18));
                int v10_6 = Boolean.valueOf(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$18(v15_19));
                int v13_21 = ((b20) p66).f(v3_18);
                int v9_5 = ((b20) p66).L();
                if ((v13_21 != 0) || (v9_5 == v11_18)) {
                    v9_5 = new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$1$1(v15_19, v3_18, v5_13, 0);
                    ((b20) p66).j0(v9_5);
                }
                r7.k(v2_19, v10_6, ((h11) v9_5), ((b20) p66));
                int v2_21 = Float.valueOf(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$7(v1_32));
                int v9_9 = Boolean.valueOf(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$12(v14_22));
                int v10_7 = ((b20) p66).f(v1_32);
                int v13_23 = ((b20) p66).L();
                if ((v10_7 != 0) || (v13_23 == v11_18)) {
                    v13_23 = new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$2$1(v14_22, v1_32, v4_4, 0);
                    ((b20) p66).j0(v13_23);
                }
                r7.k(v2_21, v9_9, ((h11) v13_23), ((b20) p66));
                m22 v1_34 = Float.valueOf(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$4(v12_12));
                int v2_23 = Boolean.valueOf(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$24(v7_5));
                int v9_10 = ((b20) p66).f(v12_12);
                int v10_9 = ((b20) p66).L();
                if ((v9_10 != 0) || (v10_9 == v11_18)) {
                    v10_9 = new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$3$1(v7_5, v12_12, v6_4, 0);
                    ((b20) p66).j0(v10_9);
                }
                int v9_20;
                String v0_4;
                String v11_21;
                int v44_0;
                int v10_15;
                int v2_25;
                m22 v1_40;
                r7.k(v1_34, v2_23, ((h11) v10_9), ((b20) p66));
                m22 v1_35 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$27(v8_2);
                if (v1_35 != null) {
                    ((b20) p66).Y(117544503);
                    int v9_12 = ((b20) p66).L();
                    if (v9_12 == v11_18) {
                        v9_12 = new wb(v8_2, 14);
                        ((b20) p66).j0(v9_12);
                    }
                    int v9_18 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
                    v44_0 = v15_19;
                    v1_40 = v14_22;
                    v0_4 = v36_0;
                    v10_15 = 1;
                    v9_20 = 0;
                    v2_25 = 0;
                    l02.a(((s01) v9_12), n54.K(-780655274, new yn(18, v1_35, v8_2), ((b20) p66)), 0, n54.K(960987924, new wr0(v8_2, 3), ((b20) p66)), 0, v9_18.getLambda$-1592336174$app(), v9_18.getLambda$-721514575$app(), 0, 0, 0, 0, 0, 0, ((b20) p66), 1772598, 16276);
                    v11_21 = ((b20) p66);
                    ((b20) p66).p(0);
                } else {
                    ((b20) p66).Y(117544502);
                    ((b20) p66).p(0);
                    v11_21 = ((b20) p66);
                    v9_20 = 0;
                    v1_40 = v14_22;
                    v44_0 = v15_19;
                    v0_4 = v36_0;
                    v2_25 = 0;
                    v10_15 = 1;
                }
                l52 v28_1;
                m22 v12_15 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u663e\u793a\u6a21\u5f0f");
                int v13_28 = se1.a;
                if (v13_28 == 0) {
                    int v15_22 = new ld1("Rounded.InvertColors", 1103101952, 1103101952, 1103101952, 1103101952, 0, 0, 0, 96);
                    v28_1 = v11_21;
                    int v13_30 = new xe3(fx.b);
                    int v10_18 = new xz0(2, v9_20);
                    v10_18.m(1094713344, 1083829125);
                    v10_18.k(1094713344, 1100480512);
                    int v47_0 = v10_18;
                    v47_0.g(-1068247286, 0, -1061158912, -1071099412, -1061158912, -1061431542);
                    v47_0.g(0, -1077432812, 1058977874, -1069421691, 1071644672, -1065059615);
                    int v9_22 = v47_0;
                    v9_22.k(1094713344, 1083829125);
                    v9_22.m(1087058739, 1089596293);
                    v9_22.k(1087058739, 1089596293);
                    v47_0.f(1084017869, 1091557130, 1082130432, 1093622825, 1082130432, 1095898235);
                    v47_0.f(1082130432, 1099683594, 1089638236, 1101529088, 1094713344, 1101529088);
                    v47_0.g(1083011236, 0, 1090519040, -1067366482, 1090519040, -1057237238);
                    v47_0.g(0, -1073028792, -1083808154, -1065059615, -1072273818, -1062060687);
                    v9_22.l(v2_25, v2_25);
                    v9_22.k(1095447347, 1076635894);
                    v47_0.g(-1094210028, -1094545572, -1082046546, -1094545572, -1078774989, 0);
                    v9_22.k(1087058739, 1089596293);
                    v9_22.e();
                    ld1.a(v15_22, v9_22.a, v13_30);
                    v13_28 = v15_22.b();
                    se1.a = v13_28;
                    v2_25 = 0;
                    v10_15 = 1;
                } else {
                    v28_1 = v11_21;
                }
                int v13_35;
                int v2_29 = j22.a;
                int v37_0 = v3_18;
                c42 v24_1 = v4_4;
                int v42_0 = v5_13;
                long v40_0 = v6_4;
                l52 v45 = v7_5;
                l52 v41 = v8_2;
                String v11_26 = v28_1;
                l52 v18_10 = v11_26;
                com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(v12_15, n54.C(v2_29, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(v2_25, v10_15, 0)), 0, v13_28, 0, 0, n54.K(693214863, new v73(p57, v34_0, p61, p58, p62), v11_26), v18_10, 1572864, 52);
                l52 v4_20 = v18_10;
                int v5_15 = com.lele.llmonitor.ui.components.HdrGlowWrapperKt.rememberActiveRingRotationState(v4_20, 0);
                md1 v6_8 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u4e3b\u9898\u914d\u8272");
                xe3 v7_7 = id1.c;
                if (v7_7 == null) {
                    xe3 v7_8 = new ld1("Rounded.Palette", 1103101952, 1103101952, 1103101952, 1103101952, 0, 0, 0, 96);
                    int v13_34 = new xe3(fx.b);
                    md1 v14_29 = new xz0(2, 0);
                    v14_29.m(1094713344, 1073741824);
                    xz0 v46_2 = v14_29;
                    v46_2.f(1087352340, 1073741824, 1073741824, 1087352340, 1073741824, 1094713344);
                    int v9_25 = v46_2;
                    v9_25.o(1083158036, 1092616192, 1092616192, 1092616192);
                    v46_2.g(1068540887, 0, 1075838976, -1081123799, 1075838976, -1071644672);
                    v46_2.g(0, -1088673546, -1100249825, -1080452710, -1088170230, -1076510065);
                    v46_2.g(-1113336054, -1110651699, -1106960712, -1101592003, -1106960712, -1096223293);
                    v46_2.g(0, -1097901015, 1046562734, -1090519040, 1056964608, -1090519040);
                    v9_25.i(1098907648);
                    v46_2.g(1079236362, 0, 1086324736, -1070847754, 1086324736, -1061158912);
                    v46_2.f(1102053376, 1086408622, 1099699323, 1073741824, 1094713344, 1073741824);
                    v9_25.e();
                    v9_25.m(1099694080, 1095761920);
                    v46_2.g(-1084982559, 0, -1077936128, -1087666913, -1077936128, -1077936128);
                    v46_2.g(0, -1084982559, 1059816735, -1077936128, 1069547520, -1077936128);
                    v9_25.o(1069547520, 1059816735, 1069547520, 1069547520);
                    v46_2.f(1100480512, 1095059374, 1100129239, 1095761920, 1099694080, 1095761920);
                    v9_25.e();
                    v9_25.m(1097334784, 1091567616);
                    v46_2.f(1096464466, 1091567616, 1095761920, 1090865070, 1095761920, 1089470464);
                    v46_2.f(1095761920, 1087729828, 1096464466, 1086324736, 1097334784, 1086324736);
                    v9_25.n(1098907648, 1087729828, 1098907648, 1089470464);
                    v46_2.f(1098907648, 1090865070, 1098205102, 1091567616, 1097334784, 1091567616);
                    v9_25.e();
                    v9_25.m(1084227584, 1094189056);
                    v46_2.f(1084227584, 1093318738, 1085632676, 1092616192, 1087373312, 1092616192);
                    v9_25.n(1090519040, 1093318738, 1090519040, 1094189056);
                    v46_2.f(1090519040, 1095059374, 1089113948, 1095761920, 1087373312, 1095761920);
                    v9_25.n(1084227584, 1095059374, 1084227584, 1094189056);
                    v9_25.e();
                    v9_25.m(1093664768, 1089470464);
                    v46_2.f(1093664768, 1090865070, 1092962222, 1091567616, 1092091904, 1091567616);
                    v9_25.n(1090519040, 1090865070, 1090519040, 1089470464);
                    v46_2.f(1090519040, 1087729828, 1091221586, 1086324736, 1092091904, 1086324736);
                    v9_25.n(1093664768, 1087729828, 1093664768, 1089470464);
                    v9_25.e();
                    ld1.a(v7_8, v9_25.a, v13_34);
                    v7_7 = v7_8.b();
                    id1.c = v7_7;
                    v13_35 = 0;
                } else {
                    v13_35 = 0;
                }
                l52 v18_11 = v4_20;
                com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(v6_8, n54.C(v2_29, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, v13_35)), 0, v7_7, 0, 0, n54.K(-723053512, new w73(v31, v5_15, p60, p63, v24_1, v1_40), v4_20), v18_11, 1572864, 52);
                String v11_37 = v18_11;
                com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u4e3b\u754c\u9762\u58c1\u7eb8"), n54.C(v2_29, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), 0, ad1.C(), 0, n54.K(-452838418, new j60(5, v43_0, v0_4), v11_37), n54.K(-1760063913, new x73(v35_0, v0_4, v37_0, v38_0, v39_0, v40_0, v41, v42_0, v43_0, v44_0, v45), v11_37), v18_11, 1769472, 20);
                l52 v4_32 = v18_11;
                String v0_7 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u8bed\u8a00");
                md1 v6_0 = ib1.b;
                if (v6_0 == null) {
                    md1 v6_13 = new ld1("Rounded.Language", 1103101952, 1103101952, 1103101952, 1103101952, 0, 0, 0, 96);
                    xe3 v7_17 = new xe3(fx.b);
                    int v13_41 = new xz0(2, 0);
                    v13_41.m(1094702858, 1073741824);
                    v13_41.f(1087310397, 1073741824, 1073741824, 1087331369, 1073741824, 1094713344);
                    v13_41.o(1083116093, 1092616192, 1092605706, 1092616192);
                    v13_41.f(1099704566, 1102053376, 1102053376, 1099704566, 1102053376, 1094713344);
                    v13_41.n(1099704566, 1073741824, 1094702858, 1073741824);
                    v13_41.e();
                    v13_41.m(1100438569, 1090519040);
                    v13_41.j(-1069757235);
                    v13_41.g(-1096558838, -1080033280, -1085821420, -1071854387, -1078942761, -1067198710);
                    v13_41.g(1072399647, 1059145646, 1079488020, 1072986849, 1082822492, 1080284938);
                    v13_41.e();
                    v13_41.m(1094713344, 1082214318);
                    v13_41.g(1062501089, 1067030938, 1069379748, 1075964805, 1072986849, 1081962660);
                    v13_41.j(-1066108191);
                    v13_41.g(1054615798, -1078523331, 1066024305, -1070554153, 1072986849, -1065520988);
                    v13_41.e();
                    v13_41.m(1082675692, 1096810496);
                    v13_41.f(1082340147, 1096139407, 1082130432, 1095436861, 1082130432, 1094713344);
                    v13_41.o(1036831949, -1079110533, 1048911544, -1073741824);
                    v13_41.j(1079529964);
                    v13_41.g(-1113336054, 1059648963, -1106289623, 1068037571, -1106289623, 1073741824);
                    v13_41.o(1031127695, 1068205343, 1041194025, 1073741824);
                    v13_41.k(1082675692, 1096810496);
                    v13_41.e();
                    v13_41.m(1084395356, 1098907648);
                    v13_41.j(1077726413);
                    v13_41.g(1050924810, 1067450368, 1061662228, 1075629261, 1068540887, 1080284938);
                    v13_41.g(-1075084001, -1088338002, -1067995628, -1074580685, -1064661156, -1067198710);
                    v13_41.e();
                    v13_41.m(1090550497, 1090519040);
                    v13_41.k(1084395356, 1090519040);
                    v13_41.g(1064682127, -1076593951, 1075797033, -1069841121, 1082822492, -1067198710);
                    v13_41.f(1091368387, 1085381018, 1090886042, 1087897600, 1090550497, 1090519040);
                    v13_41.e();
                    v13_41.m(1094713344, 1100983828);
                    v13_41.g(-1084982559, -1080452710, -1078103900, -1071518843, -1074496799, -1065520988);
                    v13_41.j(1081375457);
                    v13_41.g(-1092867850, 1068960317, -1081459343, 1076929495, -1074496799, 1081962660);
                    v13_41.e();
                    v13_41.m(1097167012, 1096810496);
                    v13_41.k(1092259676, 1096810496);
                    v13_41.g(-1111993876, -1087834685, -1104947446, -1079446077, -1104947446, -1073741824);
                    v13_41.o(1032805417, -1079194419, 1042536202, -1073741824);
                    v13_41.j(1083556495);
                    v13_41.g(1035489772, 1059481190, 1042536202, 1068037571, 1042536202, 1073741824);
                    v13_41.o(-1114678231, 1068205343, -1104947446, 1073741824);
                    v13_41.e();
                    v13_41.m(1097429156, 1100774113);
                    v13_41.g(1058642330, -1081207685, 1065856532, -1072441590, 1068540887, -1067198710);
                    v13_41.j(1077726413);
                    v13_41.g(-1082801521, 1070805811, -1071686615, 1077642527, -1064661156, 1080284938);
                    v13_41.e();
                    v13_41.m(1099096392, 1096810496);
                    v13_41.g(1034147594, -1087834685, 1041194025, -1079446077, 1041194025, -1073741824);
                    v13_41.o(-1116355953, -1079278305, -1106289623, -1073741824);
                    v13_41.j(1079529964);
                    v13_41.g(1042536202, 1059313418, 1048911544, 1067953684, 1048911544, 1073741824);
                    v13_41.o(-1110651699, 1068373115, -1098572104, 1073741824);
                    v13_41.j(-1067953684);
                    v13_41.e();
                    ld1.a(v6_13, v13_41.a, v7_17);
                    v6_0 = v6_13.b();
                    ib1.b = v6_0;
                }
                v18_7 = v4_32;
                com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(v0_7, n54.C(v2_29, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), 0, v6_0, 0, 0, n54.K(1497892982, new gr1(p59, v33, v32, p64, 3), v4_32), v18_7, 1572864, 52);
            }
            v3_11 = 0;
        }
        String v11_8 = v18_7.r();
        if (v11_8 != null) {
            v11_8.d = new y73(p57, p58, p59, p60, p61, p62, p63, p64, p65, p67);
        }
        return;
    }

    private static final void LLClassStyleAppearanceCard$lambda$10(c42 p0, float p1)
    {
        ((ci2) p0).h(p1);
        return;
    }

    private static final boolean LLClassStyleAppearanceCard$lambda$12(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final void LLClassStyleAppearanceCard$lambda$13(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final float LLClassStyleAppearanceCard$lambda$15(c42 p0)
    {
        return ((ci2) p0).g();
    }

    private static final void LLClassStyleAppearanceCard$lambda$16(c42 p0, float p1)
    {
        ((ci2) p0).h(p1);
        return;
    }

    private static final boolean LLClassStyleAppearanceCard$lambda$18(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final void LLClassStyleAppearanceCard$lambda$19(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final boolean LLClassStyleAppearanceCard$lambda$2(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final float LLClassStyleAppearanceCard$lambda$21(c42 p0)
    {
        return ((ci2) p0).g();
    }

    private static final void LLClassStyleAppearanceCard$lambda$22(c42 p0, float p1)
    {
        ((ci2) p0).h(p1);
        return;
    }

    private static final boolean LLClassStyleAppearanceCard$lambda$24(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final void LLClassStyleAppearanceCard$lambda$25(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final String LLClassStyleAppearanceCard$lambda$27(l52 p0)
    {
        return ((String) p0.getValue());
    }

    private static final void LLClassStyleAppearanceCard$lambda$28(l52 p0, String p1)
    {
        p0.setValue(p1);
        return;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$29$0(d11 p0, android.net.Uri p1)
    {
        if (p1 != null) {
            p0.invoke(p1);
        }
        return bw3.a;
    }

    private static final float LLClassStyleAppearanceCard$lambda$3(l52 p0)
    {
        return ((Number) p0.getValue()).floatValue();
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$33$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$28(p1, 0);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$33$1(String p13, l52 p14, t10 p15, int p16)
    {
        i41 v0_4;
        if ((p16 & 3) == 2) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        if (!((b20) p15).O((p16 & 1), v0_4)) {
            ((b20) p15).R();
        } else {
            i41 v0_2 = ((b20) p15).f(p13);
            f83 v1_1 = ((b20) p15).L();
            if ((v0_2 != null) || (v1_1 == r10.a)) {
                v1_1 = new f83(1, p13, p14);
                ((b20) p15).j0(v1_1);
            }
            jn.k(((s01) v1_1), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1666880825$app(), ((b20) p15), 805306368, 510);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$33$1$0$0(String p1, l52 p2)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$28(p2, 0);
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.deleteHistoryWallpaper(p1);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$33$2(l52 p11, t10 p12, int p13)
    {
        int v0_1;
        if ((p13 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v0_1)) {
            ((b20) p12).R();
        } else {
            wb v12_2 = ((b20) p12).L();
            if (v12_2 == r10.a) {
                v12_2 = new wb(p11, 25);
                ((b20) p12).j0(v12_2);
            }
            jn.k(((s01) v12_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-886443273$app(), ((b20) p12), 805306374, 510);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$33$2$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$28(p1, 0);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34(int p27, java.util.List p28, d11 p29, com.lele.llmonitor.data.FollowSystemAppIconMode p30, d11 p31, cy p32, t10 p33, int p34)
    {
        int v1_5;
        p32.getClass();
        if ((p34 & 17) == 16) {
            v1_5 = 0;
        } else {
            v1_5 = 1;
        }
        if (!((b20) p33).O((p34 & 1), v1_5)) {
            ((b20) p33).R();
        } else {
            m22 v9_0 = j22.a;
            id1.e(ac3.c(v9_0, 1065353216), 0, n54.K(-1764646172, new d83(p28, p27, p29), ((b20) p33)), ((b20) p33), 390);
            if (p27 != 0) {
                ((b20) p33).Y(1365449395);
                ((b20) p33).p(0);
            } else {
                ((b20) p33).Y(1362820099);
                bw3 v0_5 = ox.a;
                c00 v2_8 = v9_0;
                p34.b(n54.G(v9_0, 0, 1098907648, 0, 1096810496, 5), 0, fx.b(((mx) ((b20) p33).j(v0_5)).B, 1052938076), ((b20) p33), 6, 2);
                bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u542f\u52a8\u56fe\u6807\u6837\u5f0f"), 0, ((mx) ((b20) p33).j(v0_5)).q, 0, hz0.h, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p33).j(ou3.a)).i, ((b20) p33), 1572864, 0, 131002);
                id1.e(n54.G(ac3.c(v2_8, 1065353216), 0, 1094713344, 0, 0, 13), 0, n54.K(1854285439, new j60(p30, p31, 7), ((b20) p33)), ((b20) p33), 390);
                ((b20) p33).p(0);
            }
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34$0(java.util.List p20, int p21, d11 p22, kb3 p23, t10 p24, int p25)
    {
        int v15;
        kb3 v1 = p23;
        p23.getClass();
        if ((p25 & 6) != 0) {
            v15 = p25;
        } else {
            int v2_1;
            if (!((b20) p24).f(p23)) {
                v2_1 = 2;
            } else {
                v2_1 = 4;
            }
            v15 = (p25 | v2_1);
        }
        int v2_4;
        int v4_0 = 1;
        if ((v15 & 19) == 18) {
            v2_4 = 0;
        } else {
            v2_4 = 1;
        }
        if (!((b20) p24).O((v15 & 1), v2_4)) {
            ((b20) p24).R();
        } else {
            java.util.Iterator v17 = p20.iterator();
            int v2_7 = 0;
            while (v17.hasNext()) {
                s01 v3_3 = v17.next();
                int v18 = (v2_7 + 1);
                if (v2_7 < 0) {
                    r7.e0();
                    throw 0;
                } else {
                    m22 v5_1;
                    s01 v3_4 = ((com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption) v3_3);
                    if (p21 != v3_4.getMode()) {
                        v5_1 = 0;
                    } else {
                        v5_1 = v4_0;
                    }
                    int v7_1 = ((lb3) v1).a(j22.a);
                    int v2_8 = b33.a(v2_7, p20.size(), ((b20) p24));
                    int v8_4 = (((b20) p24).f(p22) | ((b20) p24).f(v3_4));
                    int v9_1 = ((b20) p24).L();
                    if ((v8_4 != 0) || (v9_1 == r10.a)) {
                        v9_1 = new f83(2, p22, v3_4);
                        ((b20) p24).j0(v9_1);
                    }
                    int v19 = v4_0;
                    id1.c(v1, v5_1, ((s01) v9_1), v2_8, v7_1, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1638989949$app(), n54.K(-176527541, new p73(v3_4, v4_0), ((b20) p24)), ((b20) p24), (v15 & 14));
                    v1 = p23;
                    v2_7 = v18;
                    v4_0 = v19;
                }
            }
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34$0$0$0$0(d11 p0, com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption p1)
    {
        p0.invoke(Integer.valueOf(p1.getMode()));
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34$0$0$1(com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption p25, t10 p26, int p27)
    {
        m22 v0_5;
        if ((p27 & 3) == 2) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (!((b20) p26).O((p27 & 1), v0_5)) {
            ((b20) p26).R();
        } else {
            j22 v11 = j22.a;
            String v3_1 = ac3.c(v11, 1065353216);
            m22 v0_3 = ey2.a(n54.d, px2.p, ((b20) p26), 54);
            int v1_2 = p34.x(((b20) p26));
            int v4_1 = ((b20) p26).l();
            String v3_2 = jn.K(((b20) p26), v3_1);
            o10.b.getClass();
            ((b20) p26).c0();
            if (!((b20) p26).S) {
                ((b20) p26).m0();
            } else {
                ((b20) p26).k(n10.b);
            }
            se1.L(((b20) p26), n10.f, v0_3);
            se1.L(((b20) p26), n10.e, v4_1);
            if ((((b20) p26).S) || (!ni1.o(((b20) p26).L(), Integer.valueOf(v1_2)))) {
                ve2.v(v1_2, ((b20) p26), v1_2, n10.g);
            }
            se1.L(((b20) p26), n10.d, v3_2);
            pc1.a(p25.getIcon(), 0, ac3.i(v11, 1098907648), 0, ((b20) p26), 432, 8);
            id1.f(((b20) p26), ac3.m(v11, 1082130432));
            bp3.b(p25.getLabel(), 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, ((b20) p26), 0, 24960, 241662);
            ((b20) p26).p(1);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34$1(com.lele.llmonitor.data.FollowSystemAppIconMode p21, d11 p22, kb3 p23, t10 p24, int p25)
    {
        int v15;
        kb3 v1 = p23;
        p23.getClass();
        if ((p25 & 6) != 0) {
            v15 = p25;
        } else {
            int v2_2;
            if (!((b20) p24).f(p23)) {
                v2_2 = 2;
            } else {
                v2_2 = 4;
            }
            v15 = (p25 | v2_2);
        }
        int v2_6;
        int v4_1 = 0;
        int v5_1 = 1;
        if ((v15 & 19) == 18) {
            v2_6 = 0;
        } else {
            v2_6 = 1;
        }
        if (!((b20) p24).O((v15 & 1), v2_6)) {
            ((b20) p24).R();
        } else {
            java.util.Iterator v16 = r7.M(new qh2[] {new qh2(com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT, new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption(1, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6d45\u8272\u56fe\u6807"), df1.A())), new qh2(com.lele.llmonitor.data.FollowSystemAppIconMode.DARK, new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption(2, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6df1\u8272\u56fe\u6807"), wm1.d0()))})).iterator();
            int v2_3 = 0;
            while (v16.hasNext()) {
                s01 v3_10 = v16.next();
                int v17 = (v2_3 + 1);
                if (v2_3 < 0) {
                    r7.e0();
                    throw 0;
                } else {
                    int v8_2;
                    s01 v3_11 = ((qh2) v3_10);
                    int v6_9 = ((com.lele.llmonitor.data.FollowSystemAppIconMode) v3_11.d);
                    s01 v3_13 = ((com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption) v3_11.e);
                    if (p21 != v6_9) {
                        v8_2 = v4_1;
                    } else {
                        v8_2 = v5_1;
                    }
                    int v9_2 = ((lb3) v1).a(j22.a);
                    int v2_15 = b33.a(v2_3, 2, ((b20) p24));
                    h11 v10_4 = (((b20) p24).f(p22) | ((b20) p24).d(v6_9.ordinal()));
                    c00 v11_0 = ((b20) p24).L();
                    if ((v10_4 != null) || (v11_0 == r10.a)) {
                        v11_0 = new n2(29, p22, v6_9);
                        ((b20) p24).j0(v11_0);
                    }
                    int v18 = v4_1;
                    int v19 = v5_1;
                    id1.c(v1, v8_2, ((s01) v11_0), v2_15, v9_2, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1202170572$app(), n54.K(1643784510, new p73(v3_13, v4_1), ((b20) p24)), ((b20) p24), (v15 & 14));
                    v1 = p23;
                    v2_3 = v17;
                    v4_1 = v18;
                    v5_1 = v19;
                }
            }
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34$1$0$0$0(d11 p0, com.lele.llmonitor.data.FollowSystemAppIconMode p1)
    {
        p0.invoke(p1);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$34$1$0$1(com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption p25, t10 p26, int p27)
    {
        m22 v0_5;
        if ((p27 & 3) == 2) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (!((b20) p26).O((p27 & 1), v0_5)) {
            ((b20) p26).R();
        } else {
            j22 v11 = j22.a;
            String v3_1 = ac3.c(v11, 1065353216);
            m22 v0_3 = ey2.a(n54.d, px2.p, ((b20) p26), 54);
            int v1_2 = p34.x(((b20) p26));
            int v4_1 = ((b20) p26).l();
            String v3_2 = jn.K(((b20) p26), v3_1);
            o10.b.getClass();
            ((b20) p26).c0();
            if (!((b20) p26).S) {
                ((b20) p26).m0();
            } else {
                ((b20) p26).k(n10.b);
            }
            se1.L(((b20) p26), n10.f, v0_3);
            se1.L(((b20) p26), n10.e, v4_1);
            if ((((b20) p26).S) || (!ni1.o(((b20) p26).L(), Integer.valueOf(v1_2)))) {
                ve2.v(v1_2, ((b20) p26), v1_2, n10.g);
            }
            se1.L(((b20) p26), n10.d, v3_2);
            pc1.a(p25.getIcon(), 0, ac3.i(v11, 1098907648), 0, ((b20) p26), 432, 8);
            id1.f(((b20) p26), ac3.m(v11, 1082130432));
            bp3.b(p25.getLabel(), 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 0, 0, 0, ((b20) p26), 0, 24960, 241662);
            ((b20) p26).p(1);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$35(boolean p31, cg3 p32, com.lele.llmonitor.ui.theme.ThemePalettePreset p33, d11 p34, c42 p35, l52 p36, cy p37, t10 p38, int p39)
    {
        float v3_0;
        p37.getClass();
        int v5_23 = 1;
        int v6_1 = 0;
        if ((p39 & 17) == 16) {
            v3_0 = 0;
        } else {
            v3_0 = 1;
        }
        if (!((b20) p38).O((p39 & 1), v3_0)) {
            ((b20) p38).R();
        } else {
            int v7_12 = 1094713344;
            boolean v8_11 = 6;
            float v3_12 = xx.a(new hh(1094713344, 1, new dh(0)), px2.r, ((b20) p38), 6);
            h83 v4_17 = p34.x(((b20) p38));
            cg3 v9_10 = ((b20) p38).l();
            int v10_1 = j22.a;
            int v11_4 = jn.K(((b20) p38), v10_1);
            o10.b.getClass();
            ((b20) p38).c0();
            if (!((b20) p38).S) {
                ((b20) p38).m0();
            } else {
                ((b20) p38).k(n10.b);
            }
            se1.L(((b20) p38), n10.f, v3_12);
            se1.L(((b20) p38), n10.e, v9_10);
            if ((((b20) p38).S) || (!ni1.o(((b20) p38).L(), Integer.valueOf(v4_17)))) {
                ve2.v(v4_17, ((b20) p38), v4_17, n10.g);
            }
            se1.L(((b20) p38), n10.d, v11_4);
            ((b20) p38).Y(1337955722);
            float v3_20 = yw.r0(2, com.lele.llmonitor.ui.theme.ThemePalettePreset.Companion.getVisibleEntries());
            h83 v4_20 = v3_20.size();
            cg3 v9_11 = 0;
            while(true) {
                int v11_6 = 1065353216;
                s01 v12_6 = r10.a;
                if (v9_11 >= v4_20) {
                    break;
                }
                int v16_2 = (v9_11 + 1);
                int v17_3 = ((java.util.List) v3_20.get(v9_11));
                cg3 v9_8 = ac3.c(v10_1, 1065353216);
                int v7_20 = ey2.a(new hh(1092616192, v5_23, new dh(v6_1)), px2.o, ((b20) p38), v8_11);
                int v14_6 = p34.x(((b20) p38));
                int v15_3 = ((b20) p38).l();
                cg3 v9_9 = jn.K(((b20) p38), v9_8);
                o10.b.getClass();
                ((b20) p38).c0();
                if (!((b20) p38).S) {
                    ((b20) p38).m0();
                } else {
                    ((b20) p38).k(n10.b);
                }
                se1.L(((b20) p38), n10.f, v7_20);
                se1.L(((b20) p38), n10.e, v15_3);
                if ((((b20) p38).S) || (!ni1.o(((b20) p38).L(), Integer.valueOf(v14_6)))) {
                    ve2.v(v14_6, ((b20) p38), v14_6, n10.g);
                }
                se1.L(((b20) p38), n10.d, v9_9);
                ((b20) p38).Y(1167870782);
                int v5_17 = v17_3.iterator();
                while (v5_17.hasNext()) {
                    int v10_2;
                    int v7_27 = ((com.lele.llmonitor.ui.theme.ThemePalettePreset) v5_17.next());
                    cg3 v9_12 = v10_1;
                    if (v7_27 != p33) {
                        v10_2 = v6_1;
                    } else {
                        v10_2 = 1;
                    }
                    int v14_9 = (((b20) p38).f(p34) | ((b20) p38).d(v7_27.ordinal()));
                    int v15_6 = ((b20) p38).L();
                    if ((v14_9 != 0) || (v15_6 == v12_6)) {
                        v15_6 = new f83(v6_1, p34, v7_27);
                        ((b20) p38).j0(v15_6);
                    }
                    s01 v30_0 = v12_6;
                    int v20 = 1094713344;
                    int v18_3 = v9_12;
                    com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteOptionCard(v7_27, p31, p32, v10_2, ((s01) v15_6), new kq1(v11_6, 1), ((b20) p38), 0, 0);
                    v10_1 = v18_3;
                    v12_6 = v30_0;
                    v6_1 = 0;
                    v11_6 = 1065353216;
                }
                int v7_25 = v6_1;
                int v18_1 = v10_1;
                ((b20) p38).p(v7_25);
                if (v17_3.size() != 1) {
                    ((b20) p38).Y(1844871195);
                    ((b20) p38).p(v7_25);
                } else {
                    ((b20) p38).Y(1844788549);
                    id1.f(((b20) p38), new kq1(1065353216, 1));
                    ((b20) p38).p(v7_25);
                }
                ((b20) p38).p(1);
                v5_23 = 1;
                v6_1 = v7_25;
                v9_11 = v16_2;
                v10_1 = v18_1;
                v8_11 = 6;
                v7_12 = 1094713344;
            }
            int v20_2 = v7_12;
            int v18_4 = v10_1;
            s01 v30_1 = v12_6;
            int v6_3 = v5_23;
            ((b20) p38).p(v6_1);
            ((b20) p38).p(v6_3);
            jc3 v0_5 = ox.a;
            int v7_29 = v18_4;
            int v6_4 = v7_29;
            p34.b(n54.G(v7_29, 0, 1098907648, 0, v20_2, 5), 0, fx.b(((mx) ((b20) p38).j(v0_5)).B, 1052938076), ((b20) p38), 6, 2);
            float v3_1 = ac3.c(v6_4, 1065353216);
            h83 v4_2 = ey2.a(n54.a, px2.p, ((b20) p38), 48);
            int v5_1 = p34.x(((b20) p38));
            int v7_2 = ((b20) p38).l();
            float v3_2 = jn.K(((b20) p38), v3_1);
            o10.b.getClass();
            ((b20) p38).c0();
            if (!((b20) p38).S) {
                ((b20) p38).m0();
            } else {
                ((b20) p38).k(n10.b);
            }
            se1.L(((b20) p38), n10.f, v4_2);
            se1.L(((b20) p38), n10.e, v7_2);
            if ((((b20) p38).S) || (!ni1.o(((b20) p38).L(), Integer.valueOf(v5_1)))) {
                ve2.v(v5_1, ((b20) p38), v5_1, n10.g);
            }
            int v7_16;
            se1.L(((b20) p38), n10.d, v3_2);
            float v3_4 = ou3.a;
            bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u4e3b\u9875\u5361\u7247\u900f\u660e\u5ea6"), new kq1(1065353216, 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) ((b20) p38).j(v3_4)).k, ((b20) p38), 0, 0, 131068);
            jc3 v13_5 = ((b20) p38);
            int v5_5 = l02.F((com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$9(p35) * 1120403456));
            int v7_9 = new StringBuilder();
            v7_9.append(v5_5);
            v7_9.append("%");
            bp3.b(v7_9.toString(), 0, ((mx) v13_5.j(v0_5)).a, 0, hz0.h, 0, 0, 0, 0, 0, 0, 0, 0, ((mu3) v13_5.j(v3_4)).l, ((b20) p38), 1572864, 0, 131002);
            ((b20) p38).p(1);
            float v3_10 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$9(p35);
            int v5_10 = new jw(0, 1065353216);
            jc3 v0_3 = pc3.d(((mx) ((b20) p38).j(v0_5)).a, ((mx) ((b20) p38).j(v0_5)).a, ((mx) ((b20) p38).j(v0_5)).H, ((b20) p38));
            cg3 v9_7 = ac3.c(v6_4, 1065353216);
            h83 v4_12 = ((b20) p38).L();
            int v14_1 = v30_1;
            if (v4_12 != v14_1) {
                v7_16 = 0;
            } else {
                v7_16 = 0;
                v4_12 = new g83(p36, p35, 0);
                ((b20) p38).j0(v4_12);
            }
            boolean v8_10 = ((d11) v4_12);
            h83 v4_15 = ((b20) p38).L();
            if (v4_15 == v14_1) {
                v4_15 = new h83(p36, p35, v7_16);
                ((b20) p38).j0(v4_15);
            }
            zc3.a(v3_10, v8_10, v9_7, 0, v5_10, ((s01) v4_15), v0_3, 0, ((b20) p38), 1573296, 296);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$35$0$0$0$0$0$0(d11 p0, com.lele.llmonitor.ui.theme.ThemePalettePreset p1)
    {
        p0.invoke(p1);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$35$2$0(l52 p1, c42 p2, float p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$13(p1, 1);
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$10(p2, p3);
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setHomeCardOpacity(ib1.k((1065353216 - p3), 0, 1065353216));
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$35$3$0(l52 p2, c42 p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$13(p2, 0);
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setHomeCardOpacity(ib1.k((1065353216 - com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$9(p3)), 0, 1065353216));
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$36(l52 p11, l52 p12, hy2 p13, t10 p14, int p15)
    {
        i41 v13_5;
        p13.getClass();
        if ((p15 & 17) == 16) {
            v13_5 = 0;
        } else {
            v13_5 = 1;
        }
        if (!((b20) p14).O((p15 & 1), v13_5)) {
            ((b20) p14).R();
        } else {
            boolean v3 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$2(p11);
            java.io.File v11_1 = com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE;
            i41 v13_3 = ((b20) p14).h(v11_1);
            dm1 v14_1 = ((b20) p14).L();
            if ((v13_3 != null) || (v14_1 == r10.a)) {
                v14_1 = new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$7$1$1(v11_1);
                ((b20) p14).j0(v14_1);
            }
            int v6;
            if (com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$5(p12) == null) {
                v6 = 0;
            } else {
                v6 = 1;
            }
            uj3.a(v3, ((d11) ((dm1) v14_1)), 0, v6, 0, ((b20) p14), 0, 108);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37(float p39, l52 p40, l52 p41, hz1 p42, l52 p43, c42 p44, l52 p45, c42 p46, l52 p47, l52 p48, l52 p49, cy p50, t10 p51, int p52)
    {
        float v0_25;
        p50.getClass();
        if ((p52 & 17) == 16) {
            v0_25 = 0;
        } else {
            v0_25 = 1;
        }
        if (!((b20) p51).O((p52 & 1), v0_25)) {
            ((b20) p51).R();
        } else {
            l52 v34;
            m22 v15_6 = new hh(1094713344, 1, new dh(0));
            int v14_10 = n54.b(2);
            float v0_22 = ((((((b20) p51).c(p39) | ((b20) p51).f(p40)) | ((b20) p51).f(p41)) | ((b20) p51).h(p42)) | ((b20) p51).f(p43));
            m22 v4_12 = ((b20) p51).L();
            int v7_4 = r10.a;
            if ((v0_22 == 0) && (v4_12 != v7_4)) {
                v34 = v7_4;
            } else {
                v34 = v7_4;
                float v0_24 = new i83(p39, p40, p41, p44, p42, p43, p45);
                ((b20) p51).j0(v0_24);
                v4_12 = v0_24;
            }
            df2.c(0, 0, v14_10, v15_6, 0, 0, 0, 0, ((d11) v4_12), ((b20) p51), 24960);
            jc3 v3_4 = j22.a;
            d11 v5_13 = n54.G(ac3.c(v3_4, 1065353216), 0, 1098907648, 0, 0, 13);
            int v6_6 = px2.p;
            int v7_6 = n54.a;
            int v13_17 = ey2.a(v7_6, v6_6, ((b20) p51), 48);
            int v14_17 = p34.x(((b20) p51));
            m22 v15_11 = ((b20) p51).l();
            d11 v5_14 = jn.K(((b20) p51), v5_13);
            o10.b.getClass();
            float v0_26 = n10.b;
            ((b20) p51).c0();
            if (!((b20) p51).S) {
                ((b20) p51).m0();
            } else {
                ((b20) p51).k(v0_26);
            }
            String v12_0 = n10.f;
            se1.L(((b20) p51), v12_0, v13_17);
            int v13_0 = n10.e;
            se1.L(((b20) p51), v13_0, v15_11);
            m22 v15_0 = n10.g;
            if ((((b20) p51).S) || (!ni1.o(((b20) p51).L(), Integer.valueOf(v14_17)))) {
                ve2.v(v14_17, ((b20) p51), v14_17, v15_0);
            }
            m22 v4_3 = n10.d;
            se1.L(((b20) p51), v4_3, v5_14);
            s01 v11_3 = v15_0;
            d11 v5_4 = v13_0;
            int v2_2 = v12_0;
            bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u900f\u660e\u5ea6"), new kq1(1065353216, 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, vc1.G(((b20) p51)).k, ((b20) p51), 0, 0, 131068);
            String v12_6 = l02.F((com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$15(p46) * 1120403456));
            int v13_4 = new StringBuilder();
            v13_4.append(v12_6);
            v13_4.append("%");
            hz0 v18_1 = hz0.h;
            d11 v40_1 = v2_2;
            bp3.b(v13_4.toString(), 0, vc1.A(((b20) p51)).a, 0, v18_1, 0, 0, 0, 0, 0, 0, 0, 0, vc1.G(((b20) p51)).l, ((b20) p51), 1572864, 0, 131002);
            hz0 v36 = v18_1;
            ((b20) p51).p(1);
            long v19_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$15(p46);
            String v12_11 = new jw(0, 1065353216);
            int v20_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$2(p47);
            jw v43_1 = v12_11;
            String v12_14 = pc3.d(vc1.A(((b20) p51)).a, vc1.A(((b20) p51)).a, vc1.A(((b20) p51)).H, ((b20) p51));
            int v14_9 = ac3.c(v3_4, 1065353216);
            int v2_5 = ((b20) p51).L();
            m22 v15_7 = v34;
            if (v2_5 == v15_7) {
                v2_5 = new g83(p48, p46, 1);
                ((b20) p51).j0(v2_5);
            }
            jc3 v45_1;
            int v2_7 = ((d11) v2_5);
            boolean v10_1 = ((b20) p51).L();
            if (v10_1 != v15_7) {
                v45_1 = v2_7;
            } else {
                v45_1 = v2_7;
                v10_1 = new h83(p48, p46, 1);
                ((b20) p51).j0(v10_1);
            }
            int v2_9 = v15_7;
            zc3.a(v19_1, v45_1, v14_9, v20_0, v43_1, ((s01) v10_1), v12_14, 0, ((b20) p51), 1573296, 288);
            b20 v9_1 = ((b20) p51);
            int v8_1 = n54.G(ac3.c(v3_4, 1065353216), 0, 1086324736, 0, 0, 13);
            int v6_0 = ey2.a(v7_6, v6_6, ((b20) p51), 48);
            int v7_0 = p34.x(((b20) p51));
            boolean v10_4 = ((b20) p51).l();
            int v8_2 = jn.K(((b20) p51), v8_1);
            ((b20) p51).c0();
            if (!((b20) p51).S) {
                ((b20) p51).m0();
            } else {
                ((b20) p51).k(v0_26);
            }
            se1.L(((b20) p51), v40_1, v6_0);
            se1.L(((b20) p51), v5_4, v10_4);
            if ((((b20) p51).S) || (!ni1.o(((b20) p51).L(), Integer.valueOf(v7_0)))) {
                ve2.v(v7_0, ((b20) p51), v7_0, v11_3);
            }
            int v7_2;
            int v8_4;
            int v6_3;
            se1.L(((b20) p51), v4_3, v8_2);
            b20 v30_2 = ((b20) p51);
            bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6a21\u7cca\u5ea6"), new kq1(1065353216, 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, vc1.G(((b20) p51)).k, ((b20) p51), 0, 0, 131068);
            float v0_15 = l02.F((com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$21(p44) * 1120403456));
            m22 v4_5 = new StringBuilder();
            v4_5.append(v0_15);
            v4_5.append("%");
            bp3.b(v4_5.toString(), 0, vc1.A(v30_2).a, 0, v36, 0, 0, 0, 0, 0, 0, 0, 0, vc1.G(((b20) p51)).l, v30_2, 1572864, 0, 131002);
            ((b20) p51).p(1);
            float v0_18 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$21(p44);
            jw v1_7 = new jw(0, 1065353216);
            boolean v10_6 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$2(p47);
            s01 v11_5 = v3_4;
            jc3 v3_3 = pc3.d(vc1.A(v9_1).a, vc1.A(((b20) p51)).a, vc1.A(((b20) p51)).H, v9_1);
            m22 v4_9 = ac3.c(v11_5, 1065353216);
            d11 v5_10 = ((b20) p51).L();
            if (v5_10 != v2_9) {
                v6_3 = p44;
                v7_2 = p49;
                v8_4 = 2;
            } else {
                v6_3 = p44;
                v7_2 = p49;
                v8_4 = 2;
                v5_10 = new g83(p49, p44, 2);
                ((b20) p51).j0(v5_10);
            }
            d11 v5_12 = ((d11) v5_10);
            s01 v11_6 = ((b20) p51).L();
            if (v11_6 == v2_9) {
                v11_6 = new h83(v7_2, v6_3, v8_4);
                ((b20) p51).j0(v11_6);
            }
            zc3.a(v0_18, v5_12, v4_9, v10_6, v1_7, ((s01) v11_6), v3_3, 0, ((b20) p51), 1573296, 288);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$0$0(float p2, l52 p3, l52 p4, c42 p5, hz1 p6, l52 p7, l52 p8, ms1 p9)
    {
        p9.getClass();
        ms1.a(p9, 0, new c00(-1627573740, new p83(p2, p3, p4, p5), 1), 3);
        ms1.a(p9, 0, new c00(-453945731, new q83(p2, p6), 1), 3);
        i9 v3_3 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$6(p7);
        ((es1) p9).b.a(v3_3.size(), new ds1(new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$lambda$37$0$0$$inlined$items$default$2(new p63(8), v3_3), new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$lambda$37$0$0$$inlined$items$default$3(com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$lambda$37$0$0$$inlined$items$default$1.INSTANCE, v3_3), new c00(-632812321, new com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$lambda$37$0$0$$inlined$items$default$4(v3_3, p2, p8), 1)));
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$0$0$0(float p2, l52 p3, l52 p4, c42 p5, pq1 p6, t10 p7, int p8)
    {
        da0 v6_5;
        p6.getClass();
        if ((p8 & 17) == 16) {
            v6_5 = 0;
        } else {
            v6_5 = 1;
        }
        if (!((b20) p7).O((p8 & 1), v6_5)) {
            ((b20) p7).R();
        } else {
            com.lele.llmonitor.ui.settings.SettingsScreenKt.WallpaperThumbnailCard(p2, 0, n54.K(-881390988, new da0(p3, p4, p5), ((b20) p7)), ((b20) p7), 432);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$0$0$0$0(l52 p11, l52 p12, c42 p13, wn p14, t10 p15, int p16)
    {
        int v14_5;
        p14.getClass();
        if ((p16 & 17) == 16) {
            v14_5 = 0;
        } else {
            v14_5 = 1;
        }
        if (!((b20) p15).O((p16 & 1), v14_5)) {
            ((b20) p15).R();
        } else {
            if (com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$5(p11) == null) {
                ((b20) p15).Y(1911617541);
                com.lele.llmonitor.ui.settings.SettingsScreenKt.EmptyWallpaperThumbnail(((b20) p15), 0);
                ((b20) p15).p(0);
            } else {
                ((b20) p15).Y(1911210790);
                int v11_2 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$5(p11);
                if (v11_2 == 0) {
                    h.g("Required value was null.");
                    return 0;
                } else {
                    com.lele.llmonitor.ui.wallpaper.HomeWallpaperImageKt.HomeWallpaperImage(v11_2, com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$3(p12), com.lele.llmonitor.ui.wallpaper.HomeWallpaperBlurModifierKt.homeWallpaperBlur(ac3.c, com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$21(p13), 0, ((b20) p15), 6, 2), v50.a, 0, ((b20) p15), 3072, 16);
                    ((b20) p15).p(0);
                }
            }
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$0$0$1(float p2, hz1 p3, pq1 p4, t10 p5, int p6)
    {
        int v4_7;
        p4.getClass();
        if ((p6 & 17) == 16) {
            v4_7 = 0;
        } else {
            v4_7 = 1;
        }
        if (!((b20) p5).O((p6 & 1), v4_7)) {
            ((b20) p5).R();
        } else {
            int v4_3 = ((b20) p5).h(p3);
            s01 v6_1 = ((b20) p5).L();
            if ((v4_3 != 0) || (v6_1 == r10.a)) {
                v6_1 = new bx2(11, p3);
                ((b20) p5).j0(v6_1);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.WallpaperThumbnailCard(p2, ((s01) v6_1), com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-631859491$app(), ((b20) p5), 384);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$0$0$1$0$0(hz1 p7)
    {
        s3 v0_0 = android.os.Build$VERSION.SDK_INT;
        if ((v0_0 >= 33) || ((v0_0 >= 30) && (f2.b() >= 2))) {
            e2.a();
        }
        if ((v0_0 >= 33) || ((v0_0 >= 30) && (f2.b() >= 2))) {
            e2.a();
        }
        ok2 v5_2 = new ok2();
        v5_2.a = r3.a;
        if ((v0_0 >= 33) || ((v0_0 >= 30) && (f2.b() >= 2))) {
            e2.a();
        }
        v5_2.a = s3.a;
        v5_2.b = tm0.e;
        p7.a(v5_2);
        return bw3.a;
    }

    private static final Object LLClassStyleAppearanceCard$lambda$37$0$0$2(java.io.File p3)
    {
        p3.getClass();
        String v0_0 = p3.getAbsolutePath();
        long v1 = p3.lastModified();
        String v3_3 = new StringBuilder();
        v3_3.append(v0_0);
        v3_3.append(":");
        v3_3.append(v1);
        return v3_3.toString();
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$2$0(l52 p1, c42 p2, float p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$19(p1, 1);
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$16(p2, p3);
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.previewHomeWallpaperAlpha(p3);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$3$0(l52 p1, c42 p2)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$19(p1, 0);
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.setHomeWallpaperAlpha(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$15(p2));
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$5$0(l52 p1, c42 p2, float p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$25(p1, 1);
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$22(p2, p3);
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.previewHomeWallpaperBlur(p3);
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$37$6$0(l52 p1, c42 p2)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$25(p1, 0);
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE.setHomeWallpaperBlur(com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$21(p2));
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$38(com.lele.llmonitor.data.AppLanguageOption p7, String p8, java.util.List p9, d11 p10, cy p11, t10 p12, int p13)
    {
        String v11_4;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_4 = 0;
        } else {
            v11_4 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_4)) {
            ((b20) p12).R();
        } else {
            com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5e94\u7528\u8bed\u8a00"), p7, p8, p9, p10, ((b20) p12), 3072);
        }
        return bw3.a;
    }

    private static final bw3 LLClassStyleAppearanceCard$lambda$39(int p12, com.lele.llmonitor.data.FollowSystemAppIconMode p13, com.lele.llmonitor.data.AppLanguageOption p14, com.lele.llmonitor.ui.theme.ThemePalettePreset p15, d11 p16, d11 p17, d11 p18, d11 p19, d11 p20, int p21, t10 p22, int p23)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard(p12, p13, p14, p15, p16, p17, p18, p19, p20, p22, vc1.b0((p21 | 1)));
        return bw3.a;
    }

    private static final float LLClassStyleAppearanceCard$lambda$4(l52 p0)
    {
        return ((Number) p0.getValue()).floatValue();
    }

    private static final java.io.File LLClassStyleAppearanceCard$lambda$5(l52 p0)
    {
        return ((java.io.File) p0.getValue());
    }

    private static final java.util.List LLClassStyleAppearanceCard$lambda$6(l52 p0)
    {
        return ((java.util.List) p0.getValue());
    }

    private static final float LLClassStyleAppearanceCard$lambda$7(l52 p0)
    {
        return ((Number) p0.getValue()).floatValue();
    }

    private static final float LLClassStyleAppearanceCard$lambda$9(c42 p0)
    {
        return ((ci2) p0).g();
    }

    private static final void LanguageSelectorItem(String p14, com.lele.llmonitor.data.AppLanguageOption p15, String p16, java.util.List p17, d11 p18, t10 p19, int p20)
    {
        fa0 v0_2;
        ((b20) p19).a0(-667489428);
        if ((p20 & 6) != 0) {
            v0_2 = p20;
        } else {
            fa0 v0_1;
            if (!((b20) p19).f(p14)) {
                v0_1 = 2;
            } else {
                v0_1 = 4;
            }
            v0_2 = (v0_1 | p20);
        }
        if ((p20 & 48) == 0) {
            String v1_3;
            if (!((b20) p19).d(p15.ordinal())) {
                v1_3 = 16;
            } else {
                v1_3 = 32;
            }
            v0_2 |= v1_3;
        }
        if ((p20 & 384) == 0) {
            String v1_6;
            if (!((b20) p19).f(p16)) {
                v1_6 = 128;
            } else {
                v1_6 = 256;
            }
            v0_2 |= v1_6;
        }
        if ((p20 & 3072) == 0) {
            String v1_9;
            if (!((b20) p19).h(p17)) {
                v1_9 = 1024;
            } else {
                v1_9 = 2048;
            }
            v0_2 |= v1_9;
        }
        if ((p20 & 24576) == 0) {
            String v1_12;
            if (!((b20) p19).h(p18)) {
                v1_12 = 8192;
            } else {
                v1_12 = 16384;
            }
            v0_2 |= v1_12;
        }
        String v1_14;
        if ((v0_2 & 9363) == 9362) {
            v1_14 = 0;
        } else {
            v1_14 = 1;
        }
        if (!((b20) p19).O((v0_2 & 1), v1_14)) {
            ((b20) p19).R();
        } else {
            fa0 v0_7 = ((b20) p19).L();
            String v1_15 = r10.a;
            if (v0_7 == v1_15) {
                v0_7 = qc1.G(Boolean.FALSE);
                ((b20) p19).j0(v0_7);
            }
            l52 v10_1 = ((l52) v0_7);
            fa0 v0_9 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$1(v10_1);
            com.lele.llmonitor.data.AppLanguageOption v2_1 = ((b20) p19).L();
            if (v2_1 == v1_15) {
                v2_1 = new ub(v10_1, 9);
                ((b20) p19).j0(v2_1);
            }
            r7.g(v0_9, ((d11) v2_1), 0, n54.K(-1040178154, new v83(p16, p14, v10_1, p17, p18, p15), ((b20) p19)), ((b20) p19), 3120);
        }
        v83 v7_2 = ((b20) p19).r();
        if (v7_2 != null) {
            v7_2.d = new fa0(p14, p15, p16, p17, p18, p20);
        }
        return;
    }

    private static final boolean LanguageSelectorItem$lambda$1(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final void LanguageSelectorItem$lambda$2(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final bw3 LanguageSelectorItem$lambda$3$0(l52 p0, boolean p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$2(p0, (com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$1(p0) ^ 1));
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4(String p30, String p31, l52 p32, java.util.List p33, d11 p34, com.lele.llmonitor.data.AppLanguageOption p35, zr0 p36, t10 p37, int p38)
    {
        long v7_1;
        p36.getClass();
        if ((p38 & 6) != 0) {
            v7_1 = p38;
        } else {
            zr0 v0_2;
            if ((p38 & 8) != 0) {
                v0_2 = ((b20) p37).h(p36);
            } else {
                v0_2 = ((b20) p37).f(p36);
            }
            zr0 v0_12;
            if (v0_2 == null) {
                v0_12 = 2;
            } else {
                v0_12 = 4;
            }
            v7_1 = (p38 | v0_12);
        }
        zr0 v0_15;
        if ((v7_1 & 19) == 18) {
            v0_15 = 0;
        } else {
            v0_15 = 1;
        }
        if (!((b20) p37).O((v7_1 & 1), v0_15)) {
            ((b20) p37).R();
        } else {
            zr0 v0_21 = yp3.a(((mu3) ((b20) p37).j(ou3.a)).i, 0, 0, hz0.h, 0, 0, 0, 0, 16777211);
            int v3_3 = com.lele.llmonitor.ui.theme.AppShapes.INSTANCE;
            int v5_2 = com.lele.llmonitor.ui.theme.AppCorners.INSTANCE;
            v93 v22 = v3_3.g2-0680j_4(v5_2.getMd-D9Ej5fM());
            c00 v15_2 = ox.a;
            com.lele.llmonitor.ui.theme.AppShapes v37_1 = v3_3;
            gn3 v23_1 = bs0.b(((mx) ((b20) p37).j(v15_2)).a, ((mx) ((b20) p37).j(v15_2)).B, ((mx) ((b20) p37).j(v15_2)).a, ((b20) p37));
            c00 v10_7 = p36.b(ac3.c(j22.a, 1065353216));
            s01 v2_10 = ((b20) p37).L();
            boolean v8_6 = r10.a;
            if (v2_10 == v8_6) {
                v2_10 = new p63(7);
                ((b20) p37).j0(v2_10);
            }
            zr0 v0_1 = v15_2;
            boolean v1_2 = v8_6;
            df1.b(p30, ((d11) v2_10), v10_7, 0, 1, v0_21, n54.K(1589824828, new u90(p31, 7), ((b20) p37)), n54.K(-920560001, new wr0(p32, 4), ((b20) p37)), 0, 0, 0, 0, 0, 0, v22, v23_1, ((b20) p37), 806903856, 0, 2096520);
            b20 v11_1 = ((b20) p37);
            boolean v8_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$1(p32);
            s01 v2_0 = ((b20) p37).L();
            if (v2_0 == v1_2) {
                v2_0 = new wb(p32, 18);
                ((b20) p37).j0(v2_0);
            }
            p36.a(v8_1, ((s01) v2_0), 0, 0, 0, v37_1.g2-0680j_4(v5_2.getMd-D9Ej5fM()), ((mx) v11_1.j(v0_1)).G, 0, n54.K(-531045096, new gr1(p33, p34, p35, p32, 4), v11_1), v11_1, 48, (((v7_1 << 3) & 112) | 6));
        }
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$0$0(String p0)
    {
        p0.getClass();
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$1(String p24, t10 p25, int p26)
    {
        bw3 v0_3;
        if ((p26 & 3) == 2) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_3)) {
            ((b20) p25).R();
        } else {
            bp3.b(p24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$2(l52 p4, t10 p5, int p6)
    {
        int v0_2;
        if ((p6 & 3) == 2) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if (!((b20) p5).O((p6 & 1), v0_2)) {
            ((b20) p5).R();
        } else {
            bs0.a.a(com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$1(p4), 0, ((b20) p5), 0);
        }
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$3$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$2(p1, 0);
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$4(java.util.List p9, d11 p10, com.lele.llmonitor.data.AppLanguageOption p11, l52 p12, cy p13, t10 p14, int p15)
    {
        int v13_13;
        p13.getClass();
        if ((p15 & 17) == 16) {
            v13_13 = 0;
        } else {
            v13_13 = 1;
        }
        if (!((b20) p14).O((p15 & 1), v13_13)) {
            ((b20) p14).R();
        } else {
            bw3 v9_1 = p9.iterator();
            while (v9_1.hasNext()) {
                int v13_5 = ((qh2) v9_1.next());
                com.lele.llmonitor.data.AppLanguageOption v14_2 = ((com.lele.llmonitor.data.AppLanguageOption) v13_5.d);
                c00 v0_2 = n54.K(2012201135, new u90(((String) v13_5.e), 4), ((b20) p14));
                int v13_10 = (((b20) p14).f(p10) | ((b20) p14).d(v14_2.ordinal()));
                vj v15_5 = ((b20) p14).L();
                if ((v13_10 != 0) || (v15_5 == r10.a)) {
                    v15_5 = new vj(p10, v14_2, p12, 9);
                    ((b20) p14).j0(v15_5);
                }
                int v13_14;
                s01 v1_2 = ((s01) v15_5);
                if (v14_2 != p11) {
                    v13_14 = 0;
                } else {
                    v13_14 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1319497550$app();
                }
                t9.a(v0_2, v1_2, 0, v13_14, 0, 0, 0, ((b20) p14), 6);
            }
        }
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$4$0$0(String p24, t10 p25, int p26)
    {
        bw3 v0_3;
        if ((p26 & 3) == 2) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_3)) {
            ((b20) p25).R();
        } else {
            bp3.b(p24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$4$4$0$1$0(d11 p0, com.lele.llmonitor.data.AppLanguageOption p1, l52 p2)
    {
        p0.invoke(p1);
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$2(p2, 0);
        return bw3.a;
    }

    private static final bw3 LanguageSelectorItem$lambda$5(String p7, com.lele.llmonitor.data.AppLanguageOption p8, String p9, java.util.List p10, d11 p11, int p12, t10 p13, int p14)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem(p7, p8, p9, p10, p11, p13, vc1.b0((p12 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 M(float p0, l52 p1, l52 p2, c42 p3, pq1 p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$0$0$0(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 M0(d11 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$5(p0, p1, p2);
    }

    public static synthetic bw3 M1(d11 p0, com.lele.llmonitor.data.AppLanguageOption p1, l52 p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$4$0$1$0(p0, p1, p2);
    }

    public static synthetic bw3 M2(float p0, s01 p1, i11 p2, int p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.WallpaperThumbnailCard$lambda$1(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 N(String p0, boolean p1, d11 p2, int p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem$lambda$2(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 N0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$3$0$0(p0);
    }

    public static synthetic bw3 N1(wn p0, s01 p1, int p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HistoryWallpaperDeleteButton$lambda$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 N2(android.graphics.Matrix p0, float p1, float p2, android.graphics.SweepGradient p3, float p4, da p5, wo p6, cg3 p7, java.util.ArrayList p8, android.graphics.Path p9, g50 p10)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.AnimatedThemePaletteActiveRing_YlGCr2M$lambda$1$0$3(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    private static final void NotificationContentSettingsCard(s01 p21, t10 p22, int p23)
    {
        at2 v2_2;
        b20 v9_1 = ((b20) p22);
        ((b20) p22).a0(1612444806);
        if ((p23 & 6) != 0) {
            v2_2 = p23;
        } else {
            at2 v2_1;
            if (!((b20) p22).h(p21)) {
                v2_1 = 2;
            } else {
                v2_1 = 4;
            }
            v2_2 = (v2_1 | p23);
        }
        int v4_1;
        if ((v2_2 & 3) == 2) {
            v4_1 = 0;
        } else {
            v4_1 = 1;
        }
        if (!((b20) p22).O((v2_2 & 1), v4_1)) {
            ((b20) p22).R();
        } else {
            at2 v2_7 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u901a\u77e5\u663e\u793a\u6570\u636e");
            int v4_4 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u9009\u62e9\u901a\u77e5\u6b63\u6587\u4e2d\u663e\u793a\u7684\u6570\u636e");
            int v7_0 = ni1.w;
            if (v7_0 == 0) {
                int v10_2 = new ld1("Rounded.Checklist", 1103101952, 1103101952, 1103101952, 1103101952, 0, 0, 0, 96);
                int v7_6 = new xe3(fx.b);
                xz0 v13_2 = new xz0(2, 0);
                v13_2.m(1102053376, 1090519040);
                v13_2.g(0, -1089680179, -1092196762, -1082130432, -1082130432, -1082130432);
                v13_2.j(-1059061760);
                v13_2.g(-1089680179, 0, -1082130432, 1055286886, -1082130432, 1065353216);
                v13_2.o(1055286886, 1065353216, 1065353216, 1065353216);
                v13_2.j(1088421888);
                v13_2.f(1101817446, 1091567616, 1102053376, 1091095757, 1102053376, 1090519040);
                v13_2.e();
                v13_2.m(1095761920, 1098907648);
                v13_2.g(0, 1057803469, 1055286886, 1065353216, 1065353216, 1065353216);
                v13_2.j(1088421888);
                v13_2.g(1057803469, 0, 1065353216, -1092196762, 1065353216, -1082130432);
                v13_2.g(0, -1089680179, -1092196762, -1082130432, -1082130432, -1082130432);
                v13_2.j(-1059061760);
                v13_2.f(1096233779, 1097859072, 1095761920, 1098330931, 1095761920, 1098907648);
                v13_2.e();
                v13_2.m(1093109023, 1083451638);
                v13_2.g(1053273620, 1053273620, 1053273620, 1065520988, 0, 1068792545);
                v13_2.l(-1064870871, 1082654720);
                v13_2.g(-1094210028, 1053273620, -1081962660, 1053273620, -1078607217, 0);
                v13_2.k(1076677837, 1090686812);
                v13_2.g(-1094210028, -1094210028, -1094210028, -1081962660, 0, -1078691103);
                v13_2.g(1053273620, -1094210028, 1065520988, -1094210028, 1068792545, 0);
                v13_2.l(1068876431, 1068876431);
                v13_2.l(1080201052, -1067282596);
                v13_2.f(1092039475, 1082654720, 1092710564, 1082654720, 1093109023, 1083451638);
                v13_2.e();
                v13_2.m(1093119508, 1095384433);
                v13_2.g(1053273620, 1053273620, 1053273620, 1065520988, 0, 1068792545);
                v13_2.l(-1064870871, 1082654720);
                v13_2.g(-1094210028, 1053273620, -1081962660, 1053273620, -1078607217, 0);
                v13_2.k(1076677837, 1098991534);
                v13_2.g(-1094210028, -1094210028, -1094210028, -1081962660, 0, -1078691103);
                v13_2.o(1065520988, -1094210028, 1068792545, 0);
                v13_2.l(1068876431, 1068876431);
                v13_2.l(1080201052, -1067282596);
                v13_2.f(1092039475, 1094975488, 1092710564, 1094975488, 1093119508, 1095384433);
                v13_2.k(1093119508, 1095384433);
                v13_2.e();
                ld1.a(v10_2, v13_2.a, v7_6);
                v7_0 = v10_2.b();
                ni1.w = v7_0;
            }
            com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(v2_7, n54.C(j22.a, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), v4_4, v7_0, 0, 0, n54.K(1199179957, new u(3, p21), v9_1), v9_1, 1572864, 48);
        }
        at2 v2_4 = ((b20) p22).r();
        if (v2_4 != null) {
            v2_4.d = new q(p23, 5, p21);
        }
        return;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$0(s01 p6, cy p7, t10 p8, int p9)
    {
        String v7_9;
        p7.getClass();
        if ((p9 & 17) == 16) {
            v7_9 = 0;
        } else {
            v7_9 = 1;
        }
        if (!((b20) p8).O((p9 & 1), v7_9)) {
            ((b20) p8).R();
        } else {
            String v7_6 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u91cf\u767e\u5206\u6bd4");
            boolean v9_5 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
            int v0_6 = ((Boolean) v9_5.getShowNotificationBatteryLevel().getValue()).booleanValue();
            d11 v3_1 = ((b20) p8).f(p6);
            d11 v4_0 = ((b20) p8).L();
            i41 v5 = r10.a;
            if ((v3_1 != null) || (v4_0 == v5)) {
                v4_0 = new t(14, p6);
                ((b20) p8).j0(v4_0);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem(v7_6, v0_6, ((d11) v4_0), ((b20) p8), 0);
            String v7_8 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u4f9b\u7535\u65b9\u5f0f");
            int v0_10 = ((Boolean) v9_5.getShowNotificationSupply().getValue()).booleanValue();
            d11 v3_3 = ((b20) p8).f(p6);
            d11 v4_3 = ((b20) p8).L();
            if ((v3_3 != null) || (v4_3 == v5)) {
                v4_3 = new t(15, p6);
                ((b20) p8).j0(v4_3);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem(v7_8, v0_10, ((d11) v4_3), ((b20) p8), 0);
            String v7_11 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6c60\u7535\u538b");
            int v0_14 = ((Boolean) v9_5.getShowNotificationVoltage().getValue()).booleanValue();
            d11 v3_5 = ((b20) p8).f(p6);
            d11 v4_6 = ((b20) p8).L();
            if ((v3_5 != null) || (v4_6 == v5)) {
                v4_6 = new t(16, p6);
                ((b20) p8).j0(v4_6);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem(v7_11, v0_14, ((d11) v4_6), ((b20) p8), 0);
            String v7_13 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6c60\u7535\u6d41");
            int v0_18 = ((Boolean) v9_5.getShowNotificationCurrent().getValue()).booleanValue();
            d11 v2_4 = ((b20) p8).f(p6);
            d11 v3_6 = ((b20) p8).L();
            if ((v2_4 != null) || (v3_6 == v5)) {
                v3_6 = new t(17, p6);
                ((b20) p8).j0(v3_6);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem(v7_13, v0_18, ((d11) v3_6), ((b20) p8), 0);
            String v7_3 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6c60\u6e29\u5ea6");
            boolean v9_4 = ((Boolean) v9_5.getShowNotificationTemperature().getValue()).booleanValue();
            int v0_0 = ((b20) p8).f(p6);
            d11 v2_0 = ((b20) p8).L();
            if ((v0_0 != 0) || (v2_0 == v5)) {
                v2_0 = new t(18, p6);
                ((b20) p8).j0(v2_0);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem(v7_3, v9_4, ((d11) v2_0), ((b20) p8), 0);
        }
        return bw3.a;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$0$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationBatteryLevel(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$0$1$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationSupply(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$0$2$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationVoltage(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$0$3$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationCurrent(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$0$4$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationTemperature(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 NotificationContentSettingsCard$lambda$1(s01 p0, int p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard(p0, p2, vc1.b0((p1 | 1)));
        return bw3.a;
    }

    private static final void NotificationContentSwitchItem(String p9, boolean p10, d11 p11, t10 p12, int p13)
    {
        at2 v12_2;
        ((b20) p12).a0(299080622);
        if ((p13 & 6) != 0) {
            v12_2 = p13;
        } else {
            at2 v12_1;
            if (!((b20) p12).f(p9)) {
                v12_1 = 2;
            } else {
                v12_1 = 4;
            }
            v12_2 = (v12_1 | p13);
        }
        if ((p13 & 48) == 0) {
            ab v0_2;
            if (!((b20) p12).g(p10)) {
                v0_2 = 16;
            } else {
                v0_2 = 32;
            }
            v12_2 |= v0_2;
        }
        if ((p13 & 384) == 0) {
            ab v0_5;
            if (!((b20) p12).h(p11)) {
                v0_5 = 128;
            } else {
                v0_5 = 256;
            }
            v12_2 |= v0_5;
        }
        ab v0_7;
        if ((v12_2 & 147) == 146) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        if (!((b20) p12).O((v12_2 & 1), v0_7)) {
            ((b20) p12).R();
        } else {
            bd1.d(n54.K(-140118388, new u90(p9, 6), ((b20) p12)), 0, 0, 0, n54.K(34001297, new a70(p11, p10), ((b20) p12)), ad1.p(fx.f, ((b20) p12)), ((b20) p12), 196614, 414);
        }
        at2 v12_11 = ((b20) p12).r();
        if (v12_11 != null) {
            v12_11.d = new ab(p9, p10, p11, p13);
        }
        return;
    }

    private static final bw3 NotificationContentSwitchItem$lambda$0(String p24, t10 p25, int p26)
    {
        bw3 v0_3;
        if ((p26 & 3) == 2) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_3)) {
            ((b20) p25).R();
        } else {
            bp3.b(p24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 NotificationContentSwitchItem$lambda$1(boolean p9, d11 p10, t10 p11, int p12)
    {
        int v0_1;
        if ((p12 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p11).O((p12 & 1), v0_1)) {
            ((b20) p11).R();
        } else {
            uj3.a(p9, p10, 0, 0, 0, ((b20) p11), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 NotificationContentSwitchItem$lambda$2(String p0, boolean p1, d11 p2, int p3, t10 p4, int p5)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem(p0, p1, p2, p4, vc1.b0((p3 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 O(l52 p0, ad p1, l62 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$5(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 O0(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0$0$0$0(p0, p1);
    }

    public static synthetic bw3 O1(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2$0$0$0$1$0(p0);
    }

    public static synthetic bw3 O2(boolean p0, j72 p1, s01 p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$34$1$0$0(p0, p1, p2);
    }

    public static synthetic bw3 P(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$31$2$0$0(p0);
    }

    public static synthetic bw3 P0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$32$2$0$0(p0);
    }

    public static synthetic bw3 P1(android.content.Context p0, ad p1, l62 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$3(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 P2(j72 p0, String p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$7$0$0(p0, p1);
    }

    public static synthetic bw3 Q(float p0, hz1 p1, pq1 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$0$0$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 Q0(int p0, android.content.Context p1, l52 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$30$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 Q1(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$31$2(p0, p1, p2);
    }

    public static synthetic bw3 Q2(s01 p0, long p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$7$2$0(p0, p1);
    }

    public static synthetic bw3 R(l52 p0, l52 p1, l52 p2, l52 p3, d11 p4, l52 p5, l52 p6, l52 p7, l52 p8, ad p9, l62 p10, t10 p11, int p12)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }

    public static synthetic bw3 R0(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$32$2(p0, p1, p2);
    }

    public static synthetic bw3 R1(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0$2(p0, p1, p2);
    }

    public static synthetic bw3 R2(java.util.List p0, d11 p1, long p2, l52 p4, cy p5, t10 p6, int p7)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$4(p0, p1, p2, p4, p5, p6, p7);
    }

    public static synthetic bw3 S(l52 p0, c42 p1, float p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$2$0(p0, p1, p2);
    }

    public static synthetic bw3 S0(int p0, java.util.List p1, d11 p2, com.lele.llmonitor.data.FollowSystemAppIconMode p3, d11 p4, cy p5, t10 p6, int p7)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public static synthetic bw3 S1(float p0, l52 p1, l52 p2, c42 p3, hz1 p4, l52 p5, l52 p6, ms1 p7)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$0$0(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public static synthetic bw3 S2(String p0, String p1, l52 p2, java.util.List p3, d11 p4, com.lele.llmonitor.data.AppLanguageOption p5, zr0 p6, t10 p7, int p8)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    private static final void SceneSettingsPage(int p20, d11 p21, s01 p22, s01 p23, t10 p24, int p25)
    {
        int v0_0;
        ((b20) p24).a0(-790288979);
        if ((p25 & 6) != 0) {
            v0_0 = p25;
        } else {
            int v0_8;
            if (!((b20) p24).d(p20)) {
                v0_8 = 2;
            } else {
                v0_8 = 4;
            }
            v0_0 = (v0_8 | p25);
        }
        if ((p25 & 48) == 0) {
            int v4_6;
            if (!((b20) p24).h(p21)) {
                v4_6 = 16;
            } else {
                v4_6 = 32;
            }
            v0_0 |= v4_6;
        }
        if ((p25 & 384) == 0) {
            int v4_9;
            if (!((b20) p24).h(p22)) {
                v4_9 = 128;
            } else {
                v4_9 = 256;
            }
            v0_0 |= v4_9;
        }
        int v4_11;
        if ((p25 & 3072) != 0) {
            v4_11 = p23;
        } else {
            String v6_4;
            v4_11 = p23;
            if (!((b20) p24).h(p23)) {
                v6_4 = 1024;
            } else {
                v6_4 = 2048;
            }
            v0_0 |= v6_4;
        }
        String v6_6;
        if ((v0_0 & 1171) == 1170) {
            v6_6 = 0;
        } else {
            v6_6 = 1;
        }
        if (!((b20) p24).O((v0_0 & 1), v6_6)) {
            ((b20) p24).R();
        } else {
            String v6_9 = xx.a(n54.c, px2.r, ((b20) p24), 0);
            m22 v7_6 = p34.x(((b20) p24));
            String v8_2 = ((b20) p24).l();
            int v10_1 = j22.a;
            int v11_0 = jn.K(((b20) p24), v10_1);
            o10.b.getClass();
            ((b20) p24).c0();
            if (!((b20) p24).S) {
                ((b20) p24).m0();
            } else {
                ((b20) p24).k(n10.b);
            }
            se1.L(((b20) p24), n10.f, v6_9);
            se1.L(((b20) p24), n10.e, v8_2);
            if ((((b20) p24).S) || (!ni1.o(((b20) p24).L(), Integer.valueOf(v7_6)))) {
                ve2.v(v7_6, ((b20) p24), v7_6, n10.g);
            }
            se1.L(((b20) p24), n10.d, v11_0);
            j22 v19 = v10_1;
            r v16_1 = v0_0;
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u91cd\u8981\u63d0\u793a"), 0, if1.s(), v4_11, 0, 0, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0), ((b20) p24), (v0_0 & 7168), 50);
            com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u573a\u666f\u8bbe\u7f6e"), n54.C(v19, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5145\u7535/\u672a\u5145\u7535\u901a\u77e5\u4e0e\u5237\u65b0\u9891\u7387"), ib1.D(), 0, 0, n54.K(152286182, new d83(p20, p21, p22), ((b20) p24)), ((b20) p24), 1572864, 48);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard(p22, ((b20) p24), ((v16_1 >> 6) & 14));
            ((b20) p24).p(1);
        }
        String v6_2 = ((b20) p24).r();
        if (v6_2 != null) {
            v6_2.d = new r(p20, p21, p22, p23, p25);
        }
        return;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0(int p35, d11 p36, s01 p37, cy p38, t10 p39, int p40)
    {
        t v1_13;
        int v12_8 = Long.valueOf(600000);
        Long v13_1 = Long.valueOf(2000);
        boolean v14_2 = px2.r;
        int v15_1 = Long.valueOf(300000);
        Long.valueOf(180000);
        int v3_8 = Long.valueOf(1000);
        Long v17_1 = Long.valueOf(60000);
        Long v18_1 = Long.valueOf(30000);
        Long v19 = Long.valueOf(10000);
        int v4_2 = Long.valueOf(5000);
        Long v5_6 = Long.valueOf(3000);
        p38.getClass();
        if ((p40 & 17) == 16) {
            v1_13 = 0;
        } else {
            v1_13 = 1;
        }
        int v9_9 = ((b20) p39);
        if (!((b20) p39).O((p40 & 1), v1_13)) {
            ((b20) p39).R();
        } else {
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v29 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
            Long v40_1 = v3_8;
            Long v32 = v5_6;
            Long v30 = v12_8;
            Long v31 = v15_1;
            int v15_7 = v4_2;
            int v2_33 = fx.f;
            df1.h(p35, 0, v2_33, ((mx) ((b20) p39).j(ox.a)).a, n54.K(-88443522, new z73(p35), ((b20) p39)), v29.getLambda$181515901$app(), n54.K(67905406, new hd2(p35, p36), v9_9), v9_9, 1794432);
            t v1_25 = j22.a;
            id1.f(((b20) p39), ac3.d(v1_25, 1090519040));
            Long v6_7 = r10.a;
            if (p35 != 0) {
                Long v5_20 = v40_1;
                Long v13_2 = v6_7;
                Long v6_0 = v17_1;
                Long v17_0 = v19;
                ((b20) p39).Y(1277052248);
                bd1.d(v29.getLambda$-1802264856$app(), 0, v29.getLambda$-702199253$app(), 0, n54.K(1462833581, new a83(3, p37), ((b20) p39)), ad1.p(v2_33, ((b20) p39)), ((b20) p39), 199686, 406);
                p34.b(n54.F(v1_25, 1098907648, 0, 2), 0, 0, ((b20) p39), 6, 6);
                id1.f(((b20) p39), ac3.d(v1_25, 1092616192));
                int v3_5 = xx.a(new hh(1094713344, 1, new dh(0)), v14_2, ((b20) p39), 6);
                Long v7_3 = p34.x(((b20) p39));
                int v9_1 = ((b20) p39).l();
                t v1_2 = jn.K(((b20) p39), v1_25);
                o10.b.getClass();
                ((b20) p39).c0();
                if (!((b20) p39).S) {
                    ((b20) p39).m0();
                } else {
                    ((b20) p39).k(n10.b);
                }
                se1.L(((b20) p39), n10.f, v3_5);
                se1.L(((b20) p39), n10.e, v9_1);
                if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v7_3)))) {
                    ve2.v(v7_3, ((b20) p39), v7_3, n10.g);
                }
                se1.L(((b20) p39), n10.d, v1_2);
                String v20_2 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5e94\u7528\u754c\u9762\u66f4\u65b0\u7387");
                t v1_4 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
                long v21_2 = ((Number) v1_4.getRefreshRateUiNotCharging().getValue()).longValue();
                Long.valueOf(15000);
                int v9_5 = v6_0;
                Long v5_1 = v17_0;
                Long v7_4 = v9_5;
                java.util.List v23_1 = r7.M(new Long[] {v5_20, v9_5}));
                int v3_16 = ((b20) p39).f(p37);
                Long v8_1 = ((b20) p39).L();
                if ((v3_16 != 0) || (v8_1 == v13_2)) {
                    v8_1 = new t(12, p37);
                    ((b20) p39).j0(v8_1);
                }
                com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(v20_2, v21_2, v23_1, ((d11) v8_1), ((b20) p39), 384);
                String v20_3 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387");
                long v21_3 = ((Number) v1_4.getRefreshRateNotifyNotCharging().getValue()).longValue();
                Long v10_0 = v30;
                java.util.List v23_2 = r7.M(new Long[] {v32, v10_0}));
                int v3_23 = ((b20) p39).f(p37);
                int v4_0 = ((b20) p39).L();
                if ((v3_23 != 0) || (v4_0 == v13_2)) {
                    v4_0 = new t(7, p37);
                    ((b20) p39).j0(v4_0);
                }
                com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(v20_3, v21_3, v23_2, ((d11) v4_0), ((b20) p39), 384);
                String v20_4 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7184\u5c4f\u4e0b\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387");
                long v21_4 = ((Number) v1_4.getRefreshRateNotifyNotChargingScreenOff().getValue()).longValue();
                Long v5 = v7_4;
                Long v8 = v10_0;
                java.util.List v23_3 = r7.M(new Long[] {v5_1, Long.valueOf(900000)}));
                int v0_6 = ((b20) p39).f(p37);
                t v1_9 = ((b20) p39).L();
                if ((v0_6 != 0) || (v1_9 == v13_2)) {
                    v1_9 = new t(8, p37);
                    ((b20) p39).j0(v1_9);
                }
                com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(v20_4, v21_4, v23_3, ((d11) v1_9), ((b20) p39), 384);
                ((b20) p39).p(1);
                ((b20) p39).p(0);
            } else {
                ((b20) p39).Y(1273258468);
                bd1.d(v29.getLambda$-1198070817$app(), 0, v29.getLambda$-596981150$app(), 0, n54.K(1235401060, new a83(0, p37), ((b20) p39)), ad1.p(v2_33, ((b20) p39)), ((b20) p39), 199686, 406);
                if (android.os.Build$VERSION.SDK_INT < 36) {
                    ((b20) p39).Y(1275331004);
                    ((b20) p39).p(0);
                } else {
                    ((b20) p39).Y(1273903919);
                    bd1.d(v29.getLambda$-249915718$app(), 0, v29.getLambda$1389262205$app(), 0, n54.K(-1812919809, new a83(1, p37), ((b20) p39)), ad1.p(v2_33, ((b20) p39)), ((b20) p39), 199686, 406);
                    bd1.d(v29.getLambda$1267717809$app(), 0, v29.getLambda$264704180$app(), 0, n54.K(-1835627338, new a83(2, p37), ((b20) p39)), ad1.p(v2_33, ((b20) p39)), ((b20) p39), 199686, 406);
                    ((b20) p39).p(0);
                }
                p34.b(n54.F(v1_25, 1098907648, 0, 2), 0, 0, ((b20) p39), 6, 6);
                id1.f(((b20) p39), ac3.d(v1_25, 1092616192));
                int v2_9 = xx.a(new hh(1094713344, 1, new dh(0)), v14_2, ((b20) p39), 6);
                int v3_30 = p34.x(((b20) p39));
                Long v5_13 = ((b20) p39).l();
                t v1_14 = jn.K(((b20) p39), v1_25);
                o10.b.getClass();
                ((b20) p39).c0();
                if (!((b20) p39).S) {
                    ((b20) p39).m0();
                } else {
                    ((b20) p39).k(n10.b);
                }
                se1.L(((b20) p39), n10.f, v2_9);
                se1.L(((b20) p39), n10.e, v5_13);
                if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v3_30)))) {
                    ve2.v(v3_30, ((b20) p39), v3_30, n10.g);
                }
                se1.L(((b20) p39), n10.d, v1_14);
                String v20_9 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5e94\u7528\u754c\u9762\u66f4\u65b0\u7387");
                t v1_15 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
                long v21_8 = ((Number) v1_15.getRefreshRateUiCharging().getValue()).longValue();
                int v3_31 = v40_1;
                int v4_3 = v32;
                java.util.List v23_6 = r7.M(new Long[] {Long.valueOf(500), v3_31, v13_1, v4_3, v15_7}));
                int v2_20 = ((b20) p39).f(p37);
                Long v5_17 = ((b20) p39).L();
                if ((v2_20 != 0) || (v5_17 == v6_7)) {
                    v5_17 = new t(9, p37);
                    ((b20) p39).j0(v5_17);
                }
                com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(v20_9, v21_8, v23_6, ((d11) v5_17), ((b20) p39), 384);
                String v20_10 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387");
                long v21_9 = ((Number) v1_15.getRefreshRateNotifyCharging().getValue()).longValue();
                Long v13_0 = v6_7;
                Long v8_10 = v18_1;
                int v3_32 = v4_3;
                v5 = v19;
                Long v6 = v8_10;
                java.util.List v23_7 = r7.M(new Long[] {v3_31, v8_10}));
                int v2_26 = ((b20) p39).f(p37);
                Long v7_11 = ((b20) p39).L();
                if ((v2_26 != 0) || (v7_11 == v13_0)) {
                    v7_11 = new t(10, p37);
                    ((b20) p39).j0(v7_11);
                }
                com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(v20_10, v21_9, v23_7, ((d11) v7_11), ((b20) p39), 384);
                String v20_11 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7184\u5c4f\u4e0b\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387");
                long v21_10 = ((Number) v1_15.getRefreshRateNotifyChargingScreenOff().getValue()).longValue();
                Long v7 = v17_1;
                java.util.List v23_8 = r7.M(new Long[] {v3_32, v31}));
                int v0_12 = ((b20) p39).f(p37);
                t v1_19 = ((b20) p39).L();
                if ((v0_12 != 0) || (v1_19 == v13_0)) {
                    v1_19 = new t(11, p37);
                    ((b20) p39).j0(v1_19);
                }
                com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem(v20_11, v21_10, v23_8, ((d11) v1_19), ((b20) p39), 384);
                ((b20) p39).p(1);
                ((b20) p39).p(0);
            }
        }
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$0(int p8, java.util.List p9, t10 p10, int p11)
    {
        p9.getClass();
        px2.N.k(jn.w(j22.a, new zd0(1, ((mk3) p9.get(p8)))), 0, ((mx) ((b20) p10).j(ox.a)).a, p10, 0, 2);
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$1(int p19, d11 p20, t10 p21, int p22)
    {
        i41 v2_4;
        int v3 = 0;
        if ((p22 & 3) == 2) {
            v2_4 = 0;
        } else {
            v2_4 = 1;
        }
        if (!((b20) p21).O((p22 & 1), v2_4)) {
            ((b20) p21).R();
        } else {
            i41 v2_1;
            if (p19 != 0) {
                v2_1 = 0;
            } else {
                v2_1 = 1;
            }
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v6_0 = ((b20) p21).f(p20);
            s01 v8_0 = ((b20) p21).L();
            int v9_0 = r10.a;
            if ((v6_0 != null) || (v8_0 == v9_0)) {
                v8_0 = new ds0(1, p20);
                ((b20) p21).j0(v8_0);
            }
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v6_1 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
            i41 v2_3 = v9_0;
            lk3.b(v2_1, ((s01) v8_0), 0, 0, v6_1.getLambda$1545005924$app(), 0, 0, ((b20) p21), 24576);
            if (p19 == 1) {
                v3 = 1;
            }
            boolean v0_1 = ((b20) p21).f(p20);
            ds0 v4_1 = ((b20) p21).L();
            if ((v0_1) || (v4_1 == v2_3)) {
                v4_1 = new ds0(2, p20);
                ((b20) p21).j0(v4_1);
            }
            lk3.b(v3, ((s01) v4_1), 0, 0, v6_1.getLambda$-939194405$app(), 0, 0, ((b20) p21), 24576);
        }
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$1$0$0(d11 p1)
    {
        p1.invoke(Integer.valueOf(0));
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$1$1$0(d11 p1)
    {
        p1.invoke(Integer.valueOf(1));
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$2(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isNotificationEnabled().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(13, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$2$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleNotificationEnabled(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$3(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isLiveNotificationEnabled().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(20, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$3$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleLiveNotificationEnabled(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$4(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isLiveCloseActionEnabled().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(5, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$4$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleLiveCloseActionEnabled(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$5$0$0(s01 p1, long p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setRefreshRateUiCharging(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$5$1$0(s01 p1, long p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setRefreshRateNotifyCharging(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$5$2$0(s01 p1, long p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setRefreshRateNotifyChargingScreenOff(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$6(s01 p9, t10 p10, int p11)
    {
        int v0_1;
        if ((p11 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p10).O((p11 & 1), v0_1)) {
            ((b20) p10).R();
        } else {
            boolean v1_1 = ((Boolean) com.lele.llmonitor.data.SettingsManager.INSTANCE.isShowNotificationWhenNotCharging().getValue()).booleanValue();
            int v10_6 = ((b20) p10).f(p9);
            t v11_1 = ((b20) p10).L();
            if ((v10_6 != 0) || (v11_1 == r10.a)) {
                v11_1 = new t(6, p9);
                ((b20) p10).j0(v11_1);
            }
            uj3.a(v1_1, ((d11) v11_1), 0, 0, 0, ((b20) p10), 0, 124);
        }
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$6$0$0(s01 p1, boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.toggleShowNotificationWhenNotCharging(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$7$0$0(s01 p1, long p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setRefreshRateUiNotCharging(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$7$1$0(s01 p1, long p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setRefreshRateNotifyNotCharging(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$0$0$7$2$0(s01 p1, long p2)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setRefreshRateNotifyNotChargingScreenOff(p2);
        p1.invoke();
        return bw3.a;
    }

    private static final bw3 SceneSettingsPage$lambda$1(int p6, d11 p7, s01 p8, s01 p9, int p10, t10 p11, int p12)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage(p6, p7, p8, p9, p11, vc1.b0((p10 | 1)));
        return bw3.a;
    }

    private static final void SettingsHomePage(ms1 p6, d11 p7)
    {
        ms1.a(p6, 0, new c00(1295632718, new e83(2, p7), 1), 3);
        ms1.a(p6, 0, new c00(-622430715, new e83(3, p7), 1), 3);
        ms1.a(p6, 0, new c00(-1141723002, new e83(4, p7), 1), 3);
        ms1.a(p6, 0, new c00(-1661015289, new e83(5, p7), 1), 3);
        ms1.a(p6, 0, new c00(2114659720, new e83(6, p7), 1), 3);
        return;
    }

    private static final bw3 SettingsHomePage$lambda$0(d11 p10, pq1 p11, t10 p12, int p13)
    {
        int v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            String v0_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5916\u89c2\u8bbe\u7f6e");
            md1 v2 = dd2.u();
            int v11_4 = ((b20) p12).f(p10);
            ds0 v12_1 = ((b20) p12).L();
            if ((v11_4 != 0) || (v12_1 == r10.a)) {
                v12_1 = new ds0(8, p10);
                ((b20) p12).j0(v12_1);
            }
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(v0_0, 0, v2, ((s01) v12_1), 0, 0, 0, ((b20) p12), 0, 114);
        }
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$0$0$0(d11 p1)
    {
        p1.invoke("settings/appearance");
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$1(d11 p10, pq1 p11, t10 p12, int p13)
    {
        int v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            String v0_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u573a\u666f\u8bbe\u7f6e");
            md1 v2 = ib1.D();
            int v11_4 = ((b20) p12).f(p10);
            ds0 v12_1 = ((b20) p12).L();
            if ((v11_4 != 0) || (v12_1 == r10.a)) {
                v12_1 = new ds0(4, p10);
                ((b20) p12).j0(v12_1);
            }
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(v0_0, 0, v2, ((s01) v12_1), 0, 0, 0, ((b20) p12), 0, 114);
        }
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$1$0$0(d11 p1)
    {
        p1.invoke("settings/scene");
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$2(d11 p10, pq1 p11, t10 p12, int p13)
    {
        int v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            String v0_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u786c\u4ef6\u4fee\u6b63");
            md1 v2 = ib1.A();
            int v11_4 = ((b20) p12).f(p10);
            ds0 v12_1 = ((b20) p12).L();
            if ((v11_4 != 0) || (v12_1 == r10.a)) {
                v12_1 = new ds0(5, p10);
                ((b20) p12).j0(v12_1);
            }
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(v0_0, 0, v2, ((s01) v12_1), 0, 0, 0, ((b20) p12), 0, 114);
        }
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$2$0$0(d11 p1)
    {
        p1.invoke("settings/hardware");
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$3(d11 p10, pq1 p11, t10 p12, int p13)
    {
        int v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            String v0_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7cfb\u7edf\u4e0e\u8bca\u65ad");
            md1 v2 = ed1.x();
            int v11_4 = ((b20) p12).f(p10);
            ds0 v12_1 = ((b20) p12).L();
            if ((v11_4 != 0) || (v12_1 == r10.a)) {
                v12_1 = new ds0(6, p10);
                ((b20) p12).j0(v12_1);
            }
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(v0_0, 0, v2, ((s01) v12_1), 0, 0, 0, ((b20) p12), 0, 114);
        }
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$3$0$0(d11 p1)
    {
        p1.invoke("settings/system");
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$4(d11 p10, pq1 p11, t10 p12, int p13)
    {
        int v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            String v0_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6570\u636e\u7ba1\u7406");
            md1 v2 = wb0.y();
            int v11_4 = ((b20) p12).f(p10);
            ds0 v12_1 = ((b20) p12).L();
            if ((v11_4 != 0) || (v12_1 == r10.a)) {
                v12_1 = new ds0(7, p10);
                ((b20) p12).j0(v12_1);
            }
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(v0_0, 0, v2, ((s01) v12_1), 0, 0, 0, ((b20) p12), 0, 114);
        }
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$4$0$0(d11 p1)
    {
        p1.invoke("settings/data");
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$5(d11 p10, pq1 p11, t10 p12, int p13)
    {
        int v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            String v0_0 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5173\u4e8e LLMonitor");
            md1 v2 = if1.s();
            int v11_4 = ((b20) p12).f(p10);
            ds0 v12_1 = ((b20) p12).L();
            if ((v11_4 != 0) || (v12_1 == r10.a)) {
                v12_1 = new ds0(3, p10);
                ((b20) p12).j0(v12_1);
            }
            com.lele.llmonitor.ui.settings.SettingsUiKitKt.SettingsEntryCard(v0_0, 0, v2, ((s01) v12_1), 0, 0, 0, ((b20) p12), 0, 114);
        }
        return bw3.a;
    }

    private static final bw3 SettingsHomePage$lambda$5$0$0(d11 p1)
    {
        p1.invoke("settings/about");
        return bw3.a;
    }

    private static final void SettingsRouteContainer(d11 p13, t10 p14, int p15)
    {
        ea0 v14_3;
        ((b20) p14).a0(-1690941617);
        if ((p15 & 6) != 0) {
            v14_3 = p15;
        } else {
            ea0 v14_2;
            if (!((b20) p14).h(p13)) {
                v14_2 = 2;
            } else {
                v14_2 = 4;
            }
            v14_3 = (v14_2 | p15);
        }
        lg2 v2_1;
        if ((v14_3 & 3) == 2) {
            v2_1 = 0;
        } else {
            v2_1 = 1;
        }
        if (!((b20) p14).O((v14_3 & 1), v2_1)) {
            ((b20) p14).R();
        } else {
            lg2 v2_4 = n54.b(1);
            int v5_0 = 0;
            hh v3_2 = new hh(0, 1, new dh(0));
            if ((v14_3 & 14) == 4) {
                v5_0 = 1;
            }
            ea0 v14_7 = ((b20) p14).L();
            if ((v5_0 != 0) || (v14_7 == r10.a)) {
                v14_7 = new ea0(2, p13);
                ((b20) p14).j0(v14_7);
            }
            df2.b(ac3.c, 0, v2_4, v3_2, 0, 0, 0, 0, ((d11) v14_7), ((b20) p14), 24966, 490);
        }
        ea0 v14_9 = ((b20) p14).r();
        if (v14_9 != null) {
            v14_9.d = new hd2(p15, 1, p13);
        }
        return;
    }

    private static final bw3 SettingsRouteContainer$lambda$0$0(d11 p2, ms1 p3)
    {
        p3.getClass();
        p2.invoke(p3);
        ms1.a(p3, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1806913636$app(), 3);
        return bw3.a;
    }

    private static final bw3 SettingsRouteContainer$lambda$1(d11 p0, int p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(p0, p2, vc1.b0((p1 | 1)));
        return bw3.a;
    }

    public static final void SettingsScreen(com.lele.llmonitor.ui.dashboard.BatteryViewModel p45, s01 p46, boolean p47, String p48, d11 p49, d11 p50, t10 p51, int p52, int p53)
    {
        long v0_0;
        p45.getClass();
        p49.getClass();
        int v11_1 = ((b20) p51);
        ((b20) p51).a0(-1718491300);
        if ((p52 & 6) != 0) {
            v0_0 = p52;
        } else {
            long v0_2;
            if ((p52 & 8) != 0) {
                v0_2 = ((b20) p51).h(p45);
            } else {
                v0_2 = ((b20) p51).f(p45);
            }
            long v0_4;
            if (v0_2 == 0) {
                v0_4 = 2;
            } else {
                v0_4 = 4;
            }
            v0_0 = (v0_4 | p52);
        }
        l52 v3_0;
        boolean v2_2 = (p53 & 2);
        if (!v2_2) {
            if ((p52 & 48) != 0) {
                v3_0 = p46;
            } else {
                String v4_2;
                v3_0 = p46;
                if (!((b20) p51).h(p46)) {
                    v4_2 = 16;
                } else {
                    v4_2 = 32;
                }
                v0_0 |= v4_2;
            }
        } else {
            v0_0 |= 48;
        }
        d11 v5_0;
        String v4_3 = (p53 & 4);
        if (v4_3 == null) {
            if ((p52 & 384) != 0) {
                v5_0 = p47;
            } else {
                d11 v6_4;
                v5_0 = p47;
                if (!((b20) p51).g(p47)) {
                    v6_4 = 128;
                } else {
                    v6_4 = 256;
                }
                v0_0 |= v6_4;
            }
        } else {
            v0_0 |= 384;
        }
        s01 v8_31;
        d11 v6_5 = (p53 & 8);
        if (v6_5 == null) {
            if ((p52 & 3072) != 0) {
                v8_31 = p48;
            } else {
                c00 v9_46;
                v8_31 = p48;
                if (!((b20) p51).f(p48)) {
                    v9_46 = 1024;
                } else {
                    v9_46 = 2048;
                }
                v0_0 |= v9_46;
            }
        } else {
            v0_0 |= 3072;
        }
        if ((p52 & 24576) == 0) {
            c00 v9_53;
            if (!((b20) p51).h(p49)) {
                v9_53 = 8192;
            } else {
                v9_53 = 16384;
            }
            v0_0 |= v9_53;
        }
        int v10_39;
        c00 v9_54 = (p53 & 32);
        if (v9_54 == null) {
            if ((196608 & p52) != 0) {
                v10_39 = p50;
            } else {
                int v12_24;
                v10_39 = p50;
                if (!((b20) p51).h(p50)) {
                    v12_24 = 65536;
                } else {
                    v12_24 = 131072;
                }
                v0_0 |= v12_24;
            }
        } else {
            v0_0 |= 196608;
        }
        int v12_27;
        if ((74899 & v0_0) == 74898) {
            v12_27 = 0;
        } else {
            v12_27 = 1;
        }
        String v4_4;
        int v25_9;
        boolean v2_4;
        d11 v6_6;
        if (!((b20) p51).O((v0_0 & 1), v12_27)) {
            v25_9 = ((b20) p51);
            ((b20) p51).R();
            v2_4 = v3_0;
            v4_4 = v8_31;
            v6_6 = v10_39;
        } else {
            if (v2_2) {
                v3_0 = 0;
            }
            if (v4_3 != null) {
                v5_0 = 0;
            }
            boolean v2_0;
            if (v6_5 == null) {
                v2_0 = v8_31;
            } else {
                v2_0 = 0;
            }
            String v4_0;
            if (v9_54 == null) {
                v4_0 = v10_39;
            } else {
                v4_0 = 0;
            }
            d11 v6_2 = ((android.content.Context) ((b20) p51).j(z7.b));
            s01 v8_2 = ((yt1) ((b20) p51).j(rw1.a));
            c00 v9_0 = ((b20) p51).L();
            int v10_0 = r10.a;
            if (v9_0 == v10_0) {
                v9_0 = qc1.G(Boolean.FALSE);
                ((b20) p51).j0(v9_0);
            }
            l52 v28_1 = ((l52) v9_0);
            c00 v9_2 = ((b20) p51).L();
            if (v9_2 == v10_0) {
                v9_2 = new di2(0);
                ((b20) p51).j0(v9_2);
            }
            h42 v29_1 = ((h42) v9_2);
            c00 v9_4 = ((b20) p51).L();
            if (v9_4 == v10_0) {
                v9_4 = qc1.G(Boolean.valueOf((com.lele.llmonitor.data.SettingsManager.INSTANCE.isIgnoringBatteryOptimizations(v6_2) ^ 1)));
                ((b20) p51).j0(v9_4);
            }
            int v12_0;
            int v27_1 = ((l52) v9_4);
            c00 v9_9 = new i82[0];
            c00 v9_10 = se1.H(v9_9, ((b20) p51));
            if (v2_0) {
                v12_0 = v2_0;
            } else {
                if (v5_0 == null) {
                    v12_0 = "settings/home";
                } else {
                    v12_0 = "settings/about";
                }
            }
            s01 v8_8;
            String v46_1 = v2_0;
            boolean v31 = v3_0;
            long v0_3 = v8_2;
            boolean v2_1 = v12_0;
            l52 v3_1 = v10_0;
            j72 v30 = v9_10;
            int v15_0 = v27_1;
            s01 v8_6 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$9(qc1.i(new rr2(v9_10.b.z), 0, 0, ((b20) p51), 48, 2));
            if (v8_6 == null) {
                v8_8 = 0;
            } else {
                s01 v8_7 = v8_6.e;
                if (v8_7 == null) {
                } else {
                    v8_8 = ((String) v8_7.e.e);
                }
            }
            if ((v8_8 == null) || (v8_8.equals(v2_1))) {
                int v32 = 0;
            } else {
                v32 = 1;
            }
            c00 v9_13 = com.lele.llmonitor.data.SettingsManager.INSTANCE;
            l52 v33 = v9_13.getThemeMode();
            l52 v34 = v9_13.getThemePalettePreset();
            l52 v35 = v9_13.getFollowSystemAppIconMode();
            l52 v36 = v9_13.getAppLanguageOption();
            c00 v9_14 = ((b20) p51).L();
            if (v9_14 == v3_1) {
                v9_14 = qc1.G(0);
                ((b20) p51).j0(v9_14);
            }
            long v22_1 = ((l52) v9_14);
            c00 v9_15 = ((b20) p51).L();
            if (v9_15 == v3_1) {
                v9_15 = qc1.G(0);
                ((b20) p51).j0(v9_15);
            }
            l52 v23_1 = ((l52) v9_15);
            c00 v9_16 = ((b20) p51).L();
            if (v9_16 == v3_1) {
                v9_16 = qc1.G(0);
                ((b20) p51).j0(v9_16);
            }
            int v24_1 = ((l52) v9_16);
            c00 v9_17 = ((b20) p51).L();
            if (v9_17 == v3_1) {
                v9_17 = qc1.G(0);
                ((b20) p51).j0(v9_17);
            }
            int v25_1 = ((l52) v9_17);
            c00 v9_19 = (((b20) p51).h(v6_2) | ((b20) p51).h(v0_3));
            int v10_3 = ((b20) p51).L();
            if ((v9_19 != null) || (v10_3 == v3_1)) {
                v10_3 = new o2(v0_3, v6_2, v15_0, 14);
                ((b20) p51).j0(v10_3);
            }
            l52 v38;
            Integer v47_1;
            l52 v42;
            l52 v40;
            long v0_6;
            l52 v39;
            l52 v41;
            r7.e(v0_3, v6_2, ((d11) v10_3), ((b20) p51));
            if (!com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$1(v28_1)) {
                v47_1 = v8_8;
                v38 = v15_0;
                v40 = v22_1;
                v41 = v23_1;
                v42 = v24_1;
                v39 = v25_1;
                v0_6 = 0;
                ((b20) p51).Y(438808166);
                ((b20) p51).p(0);
            } else {
                int v12_2;
                ((b20) p51).Y(437935578);
                long v0_8 = ((b20) p51).L();
                if (v0_8 != v3_1) {
                    v12_2 = v28_1;
                } else {
                    v12_2 = v28_1;
                    v0_8 = new wb(v12_2, 21);
                    ((b20) p51).j0(v0_8);
                }
                c00 v13_7 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
                v28_1 = v12_2;
                l52 v17_1 = v13_7;
                v38 = v15_0;
                v39 = v25_1;
                v40 = v22_1;
                v41 = v23_1;
                v42 = v24_1;
                v47_1 = v8_8;
                v0_6 = 0;
                l02.a(((s01) v0_8), n54.K(454275247, new yn(20, p45, v12_2), ((b20) p51)), 0, n54.K(-914185363, new wr0(v12_2, 6), ((b20) p51)), v13_7.getLambda$-1598415668$app(), v17_1.getLambda$2012321323$app(), v17_1.getLambda$1328091018$app(), 0, 0, 0, 0, 0, 0, ((b20) p51), 1797174, 16260);
                v11_1 = ((b20) p51);
                ((b20) p51).p(0);
            }
            s01 v8_13 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$15(v40);
            if (v8_13 != null) {
                int v12_4;
                v11_1.Y(438864493);
                s01 v8_14 = v8_13.intValue();
                c00 v9_27 = v11_1.L();
                if (v9_27 != v3_1) {
                    v12_4 = v40;
                } else {
                    v12_4 = v40;
                    v9_27 = new wb(v12_4, 22);
                    v11_1.j0(v9_27);
                }
                c00 v14_1 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
                int v25_3 = v11_1;
                v40 = v12_4;
                l02.a(((s01) v9_27), n54.K(1735833694, new ie(v8_14, v12_4, v6_2), v11_1), 0, n54.K(1466668316, new wr0(v12_4, 7), v11_1), 0, v14_1.getLambda$1197502938$app(), v14_1.getLambda$1062920249$app(), 0, 0, 0, 0, 0, 0, v25_3, 1772598, 16276);
                v11_1 = v25_3;
                v11_1.p(v0_6);
            } else {
                v11_1.Y(438864492);
                v11_1.p(v0_6);
            }
            s01 v8_19 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$18(v41);
            if (v8_19 != null) {
                int v12_6;
                v11_1.Y(439944285);
                c00 v9_32 = v11_1.L();
                if (v9_32 != v3_1) {
                    v12_6 = v41;
                } else {
                    v12_6 = v41;
                    v9_32 = new wb(v12_6, 23);
                    v11_1.j0(v9_32);
                }
                c00 v14_3 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
                int v25_4 = v11_1;
                v41 = v12_6;
                l02.a(((s01) v9_32), n54.K(1971668611, new p2(v8_19, v6_2, v12_6, 11), v11_1), 0, n54.K(-419635007, new wr0(v12_6, 8), v11_1), 0, v14_3.getLambda$1484028671$app(), v14_3.getLambda$-1859106786$app(), 0, 0, 0, 0, 0, 0, v25_4, 1772598, 16276);
                v11_1 = v25_4;
                v11_1.p(v0_6);
            } else {
                v11_1.Y(439944284);
                v11_1.p(v0_6);
            }
            c00 v1_1;
            s01 v8_24 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$21(v42);
            if (v8_24 != null) {
                int v12_8;
                v11_1.Y(441064780);
                int v10_26 = v11_1.L();
                if (v10_26 != v3_1) {
                    v12_8 = v42;
                } else {
                    v12_8 = v42;
                    v10_26 = new wb(v12_8, 19);
                    v11_1.j0(v10_26);
                }
                c00 v14_8 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
                int v25_5 = v11_1;
                v42 = v12_8;
                v1_1 = 19;
                l02.a(((s01) v10_26), n54.K(-1776887938, new p2(v8_24, v6_2, v12_8, 10), v11_1), 0, n54.K(1329286784, new wr0(v12_8, 5), v11_1), 0, v14_8.getLambda$140494210$app(), v14_8.getLambda$1693581571$app(), 0, 0, 0, 0, 0, 0, v25_5, 1772598, 16276);
                v11_1 = v25_5;
                v11_1.p(v0_6);
            } else {
                v11_1.Y(441064779);
                v11_1.p(v0_6);
                v1_1 = 19;
            }
            l52 v3_3;
            s01 v8_30 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$24(v39);
            if (v8_30 != null) {
                v11_1.Y(442172007);
                c00 v9_40 = v11_1.d(v8_30.ordinal());
                int v10_30 = v11_1.L();
                if ((v9_40 != null) || (v10_30 == v3_1)) {
                    v10_30 = new g82(17, v8_30);
                    v11_1.j0(v10_30);
                }
                int v10_32 = ((d11) v10_30);
                c00 v9_42 = v11_1.L();
                if (v9_42 != v3_1) {
                    v3_3 = v39;
                } else {
                    v3_3 = v39;
                    v9_42 = new wb(v3_3, 20);
                    v11_1.j0(v9_42);
                }
                int v25_7 = v11_1;
                l02.a(((s01) v9_42), n54.K(-691887338, new dl(v8_30, v6_2, v3_3, v10_32), v11_1), 0, n54.K(932332500, new yn(v1_1, v3_3, v10_32), v11_1), 0, n54.K(-1738414958, new m83(v0_6, v10_32), v11_1), n54.K(1221178609, new m83(1, v10_32), v11_1), 0, 0, 0, 0, 0, 0, v25_7, 1772598, 16276);
                v11_1 = v25_7;
                v11_1.p(v0_6);
            } else {
                v11_1.Y(442172006);
                v11_1.p(v0_6);
                v3_3 = v39;
            }
            long v20_8 = v30;
            int v15_7 = v4_0;
            boolean v2_3 = v15_7;
            v25_9 = v11_1;
            df1.f(0, n54.K(-1844013792, new es0(v47_1, v32, v31, v20_8, 2), v11_1), 0, 0, 0, 0, com.lele.llmonitor.ui.theme.PageSurfaceSupportKt.pageSurfaceColor(v11_1, v0_6), 0, new su0(), n54.K(1682060459, new n83(v20_8, v2_1, v15_7, v33, v35, v36, v34, p49, v6_2, v40, v41, v42, v3_3, v29_1, v38, v28_1), v11_1), v25_9, 805306416, 189);
            v4_4 = v46_1;
            v6_6 = v2_3;
            v2_4 = v31;
        }
        l52 v3_5 = v5_0;
        c00 v9_51 = v25_9.r();
        if (v9_51 != null) {
            v9_51.d = new t51(p45, v2_4, v3_5, v4_4, p49, v6_6, p52, p53);
        }
        return;
    }

    private static final boolean SettingsScreen$lambda$1(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final int SettingsScreen$lambda$10(l52 p0)
    {
        return ((Number) p0.getValue()).intValue();
    }

    private static final com.lele.llmonitor.ui.theme.ThemePalettePreset SettingsScreen$lambda$11(l52 p0)
    {
        return ((com.lele.llmonitor.ui.theme.ThemePalettePreset) p0.getValue());
    }

    private static final com.lele.llmonitor.data.FollowSystemAppIconMode SettingsScreen$lambda$12(l52 p0)
    {
        return ((com.lele.llmonitor.data.FollowSystemAppIconMode) p0.getValue());
    }

    private static final com.lele.llmonitor.data.AppLanguageOption SettingsScreen$lambda$13(l52 p0)
    {
        return ((com.lele.llmonitor.data.AppLanguageOption) p0.getValue());
    }

    private static final Integer SettingsScreen$lambda$15(l52 p0)
    {
        return ((Integer) p0.getValue());
    }

    private static final void SettingsScreen$lambda$16(l52 p0, Integer p1)
    {
        p0.setValue(p1);
        return;
    }

    private static final com.lele.llmonitor.data.FollowSystemAppIconMode SettingsScreen$lambda$18(l52 p0)
    {
        return ((com.lele.llmonitor.data.FollowSystemAppIconMode) p0.getValue());
    }

    private static final void SettingsScreen$lambda$19(l52 p0, com.lele.llmonitor.data.FollowSystemAppIconMode p1)
    {
        p0.setValue(p1);
        return;
    }

    private static final void SettingsScreen$lambda$2(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final com.lele.llmonitor.ui.theme.ThemePalettePreset SettingsScreen$lambda$21(l52 p0)
    {
        return ((com.lele.llmonitor.ui.theme.ThemePalettePreset) p0.getValue());
    }

    private static final void SettingsScreen$lambda$22(l52 p0, com.lele.llmonitor.ui.theme.ThemePalettePreset p1)
    {
        p0.setValue(p1);
        return;
    }

    private static final com.lele.llmonitor.data.AppLanguageOption SettingsScreen$lambda$24(l52 p0)
    {
        return ((com.lele.llmonitor.data.AppLanguageOption) p0.getValue());
    }

    private static final void SettingsScreen$lambda$25(l52 p0, com.lele.llmonitor.data.AppLanguageOption p1)
    {
        p0.setValue(p1);
        return;
    }

    private static final oi0 SettingsScreen$lambda$26$0(yt1 p1, android.content.Context p2, l52 p3, pi0 p4)
    {
        p4.getClass();
        dz v4_2 = new dz(2, p2, p3);
        p1.getLifecycle().a(v4_2);
        return new com.lele.llmonitor.ui.settings.SettingsScreenKt$SettingsScreen$lambda$26$0$$inlined$onDispose$1(p1, v4_2);
    }

    private static final void SettingsScreen$lambda$26$0$0(android.content.Context p0, l52 p1, yt1 p2, mt1 p3)
    {
        p2.getClass();
        p3.getClass();
        if (p3 == mt1.ON_RESUME) {
            com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$8(p1, (com.lele.llmonitor.data.SettingsManager.INSTANCE.isIgnoringBatteryOptimizations(p0) ^ 1));
        }
        return;
    }

    private static final bw3 SettingsScreen$lambda$27$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$2(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$28(com.lele.llmonitor.ui.dashboard.BatteryViewModel p11, l52 p12, t10 p13, int p14)
    {
        int v0_1;
        if ((p14 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p13).O((p14 & 1), v0_1)) {
            ((b20) p13).R();
        } else {
            int v13_2 = ((b20) p13).h(p11);
            f83 v14_1 = ((b20) p13).L();
            if ((v13_2 != 0) || (v14_1 == r10.a)) {
                v14_1 = new f83(3, p11, p12);
                ((b20) p13).j0(v14_1);
            }
            jn.k(((s01) v14_1), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$540246290$app(), ((b20) p13), 805306368, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$28$0$0(com.lele.llmonitor.ui.dashboard.BatteryViewModel p0, l52 p1)
    {
        p0.clearHistory();
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$2(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$29(l52 p11, t10 p12, int p13)
    {
        int v0_1;
        if ((p13 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v0_1)) {
            ((b20) p12).R();
        } else {
            wb v12_2 = ((b20) p12).L();
            if (v12_2 == r10.a) {
                v12_2 = new wb(p11, 27);
                ((b20) p12).j0(v12_2);
            }
            jn.k(((s01) v12_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-828214320$app(), ((b20) p12), 805306374, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$29$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$2(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$30$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$16(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$30$1(int p13, android.content.Context p14, l52 p15, t10 p16, int p17)
    {
        l52 v0_5;
        if ((p17 & 3) == 2) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (!((b20) p16).O((p17 & 1), v0_5)) {
            ((b20) p16).R();
        } else {
            l52 v0_3 = (((b20) p16).d(p13) | ((b20) p16).h(p14));
            bq0 v1_2 = ((b20) p16).L();
            if ((v0_3 != null) || (v1_2 == r10.a)) {
                v1_2 = new bq0(p13, 1, p15, p14);
                ((b20) p16).j0(v1_2);
            }
            jn.k(((s01) v1_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$645343681$app(), ((b20) p16), 805306368, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$30$1$0$0(int p2, l52 p3, android.content.Context p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$16(p3, 0);
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setThemeMode(p2, new s(p4, 4));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$30$1$0$0$0(android.content.Context p0)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.restartAppAfterAppearanceChange(p0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$30$2(l52 p11, t10 p12, int p13)
    {
        int v0_1;
        if ((p13 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v0_1)) {
            ((b20) p12).R();
        } else {
            wb v12_2 = ((b20) p12).L();
            if (v12_2 == r10.a) {
                v12_2 = new wb(p11, 15);
                ((b20) p12).j0(v12_2);
            }
            jn.k(((s01) v12_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$376178303$app(), ((b20) p12), 805306374, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$30$2$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$16(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$31$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$19(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$31$1(com.lele.llmonitor.data.FollowSystemAppIconMode p11, android.content.Context p12, l52 p13, t10 p14, int p15)
    {
        int v0_1;
        if ((p15 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p14).O((p15 & 1), v0_1)) {
            ((b20) p14).R();
        } else {
            int v14_4 = (((b20) p14).d(p11.ordinal()) | ((b20) p14).h(p12));
            vj v15_2 = ((b20) p14).L();
            if ((v14_4 != 0) || (v15_2 == r10.a)) {
                v15_2 = new vj(p11, p13, p12, 11);
                ((b20) p14).j0(v15_2);
            }
            jn.k(((s01) v15_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-1973863514$app(), ((b20) p14), 805306368, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$31$1$0$0(com.lele.llmonitor.data.FollowSystemAppIconMode p2, l52 p3, android.content.Context p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$19(p3, 0);
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setFollowSystemAppIconMode(p2, new s(p4, 3));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$31$1$0$0$0(android.content.Context p0)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.restartAppAfterAppearanceChange(p0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$31$2(l52 p11, t10 p12, int p13)
    {
        int v0_1;
        if ((p13 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v0_1)) {
            ((b20) p12).R();
        } else {
            wb v12_2 = ((b20) p12).L();
            if (v12_2 == r10.a) {
                v12_2 = new wb(p11, 26);
                ((b20) p12).j0(v12_2);
            }
            jn.k(((s01) v12_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-70199836$app(), ((b20) p12), 805306374, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$31$2$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$19(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$32$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$22(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$32$1(com.lele.llmonitor.ui.theme.ThemePalettePreset p11, android.content.Context p12, l52 p13, t10 p14, int p15)
    {
        int v0_1;
        if ((p15 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p14).O((p15 & 1), v0_1)) {
            ((b20) p14).R();
        } else {
            int v14_4 = (((b20) p14).d(p11.ordinal()) | ((b20) p14).h(p12));
            vj v15_2 = ((b20) p14).L();
            if ((v14_4 != 0) || (v15_2 == r10.a)) {
                v15_2 = new vj(p11, p13, p12, 8);
                ((b20) p14).j0(v15_2);
            }
            jn.k(((s01) v15_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$542177403$app(), ((b20) p14), 805306368, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$32$1$0$0(com.lele.llmonitor.ui.theme.ThemePalettePreset p2, l52 p3, android.content.Context p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$22(p3, 0);
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setThemePalettePreset(p2, new s(p4, 8));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$32$1$0$0$0(android.content.Context p0)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.restartAppAfterAppearanceChange(p0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$32$2(l52 p11, t10 p12, int p13)
    {
        int v0_1;
        if ((p13 & 3) == 2) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v0_1)) {
            ((b20) p12).R();
        } else {
            wb v12_2 = ((b20) p12).L();
            if (v12_2 == r10.a) {
                v12_2 = new wb(p11, 16);
                ((b20) p12).j0(v12_2);
            }
            jn.k(((s01) v12_2), 0, 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-646615171$app(), ((b20) p12), 805306374, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$32$2$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$22(p1, 0);
        return bw3.a;
    }

    private static final String SettingsScreen$lambda$33$0$0(com.lele.llmonitor.data.AppLanguageOption p0, String p1)
    {
        p1.getClass();
        return com.lele.llmonitor.i18n.TextI18nKt.l10n(p1, p0);
    }

    private static final bw3 SettingsScreen$lambda$33$1$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$25(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$2(com.lele.llmonitor.data.AppLanguageOption p13, android.content.Context p14, l52 p15, d11 p16, t10 p17, int p18)
    {
        int v0_7;
        if ((p18 & 3) == 2) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        if (!((b20) p17).O((p18 & 1), v0_7)) {
            ((b20) p17).R();
        } else {
            int v0_4 = (((b20) p17).d(p13.ordinal()) | ((b20) p17).h(p14));
            vj v1_2 = ((b20) p17).L();
            if ((v0_4 != 0) || (v1_2 == r10.a)) {
                v1_2 = new vj(p13, p15, p14, 10);
                ((b20) p17).j0(v1_2);
            }
            jn.k(((s01) v1_2), 0, 0, 0, 0, 0, n54.K(-1032720775, new e83(0, p16), b20 v10_1), ((b20) p17), 805306368, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$2$0$0(com.lele.llmonitor.data.AppLanguageOption p2, l52 p3, android.content.Context p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$25(p3, 0);
        com.lele.llmonitor.data.SettingsManager.INSTANCE.setAppLanguageOption(p2, new s(p4, 6));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$2$0$0$0(android.content.Context p0)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.restartAppAfterAppearanceChange(p0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$2$1(d11 p24, hy2 p25, t10 p26, int p27)
    {
        bw3 v0_6;
        p25.getClass();
        if ((p27 & 17) == 16) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        if (!((b20) p26).O((p27 & 1), v0_6)) {
            ((b20) p26).R();
        } else {
            bp3.b(((String) p24.invoke("\u786e\u8ba4\u5e76\u91cd\u542f")), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p26), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$3(l52 p13, d11 p14, t10 p15, int p16)
    {
        int v0_3;
        if ((p16 & 3) == 2) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        if (!((b20) p15).O((p16 & 1), v0_3)) {
            ((b20) p15).R();
        } else {
            wb v15_2 = ((b20) p15).L();
            if (v15_2 == r10.a) {
                v15_2 = new wb(p13, 17);
                ((b20) p15).j0(v15_2);
            }
            jn.k(((s01) v15_2), 0, 0, 0, 0, 0, n54.K(591499063, new e83(1, p14), ((b20) p15)), ((b20) p15), 805306374, 510);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$3$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$25(p1, 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$3$1(d11 p24, hy2 p25, t10 p26, int p27)
    {
        bw3 v0_6;
        p25.getClass();
        if ((p27 & 17) == 16) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        if (!((b20) p26).O((p27 & 1), v0_6)) {
            ((b20) p26).R();
        } else {
            bp3.b(((String) p24.invoke("\u53d6\u6d88")), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p26), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$4(d11 p24, t10 p25, int p26)
    {
        bw3 v0_6;
        if ((p26 & 3) == 2) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_6)) {
            ((b20) p25).R();
        } else {
            bp3.b(((String) p24.invoke("\u786e\u8ba4\u5207\u6362\u8bed\u8a00")), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$33$5(d11 p24, t10 p25, int p26)
    {
        bw3 v0_6;
        if ((p26 & 3) == 2) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_6)) {
            ((b20) p25).R();
        } else {
            bp3.b(((String) p24.invoke("\u5207\u6362\u8bed\u8a00\u540e\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\u4ee5\u5e94\u7528\u65b0\u7684\u754c\u9762\u8bed\u8a00\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f")), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$34(String p14, boolean p15, s01 p16, j72 p17, t10 p18, int p19)
    {
        s01 v0_6;
        if ((p19 & 3) == 2) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        if (!((b20) p18).O((p19 & 1), v0_6)) {
            ((b20) p18).R();
        } else {
            ff.b(n54.K(-1672246820, new u90(p14, 5), ((b20) p18)), 0, n54.K(1750309914, new as0(p15, p17, p16), ((b20) p18)), 0, 0, 0, com.lele.llmonitor.ui.theme.PageSurfaceSupportKt.pageSurfaceTopAppBarColors-Iv8Zu3U(0, ((b20) p18), 0, 1), ((b20) p18), 390, 186);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$34$0(String p24, t10 p25, int p26)
    {
        bw3 v0_4;
        if ((p26 & 3) == 2) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_4)) {
            ((b20) p25).R();
        } else {
            bp3.b(com.lele.llmonitor.ui.settings.SettingsScreenKt.settingsTitleForRoute(p24), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$34$1(boolean p16, s01 p17, j72 p18, t10 p19, int p20)
    {
        i41 v3_7;
        if ((p20 & 3) == 2) {
            v3_7 = 0;
        } else {
            v3_7 = 1;
        }
        if (!((b20) p19).O((p20 & 1), v3_7)) {
            ((b20) p19).R();
        } else {
            if ((!p16) && (p17 == null)) {
                ((b20) p19).Y(-1714573560);
                ((b20) p19).p(0);
            } else {
                ((b20) p19).Y(-1715211664);
                i41 v3_5 = ((((b20) p19).g(p16) | ((b20) p19).h(p18)) | ((b20) p19).f(p17));
                fs0 v4_3 = ((b20) p19).L();
                if ((v3_5 != null) || (v4_3 == r10.a)) {
                    v4_3 = new fs0(p16, p18, p17);
                    ((b20) p19).j0(v4_3);
                }
                r7.h(((s01) v4_3), 0, 0, 0, 0, com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$-1811747583$app(), ((b20) p19), 1572864, 62);
                ((b20) p19).p(0);
            }
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$34$1$0$0(boolean p11, j72 p12, s01 p13)
    {
        if (p11 == null) {
            if (p13 != null) {
                p13.invoke();
            }
        } else {
            tl3 v11_9 = p12.b;
            android.app.Activity v13_1 = p12.d;
            if (p12.a() != 1) {
                p12.d();
            } else {
                int v1_3;
                if (v13_1 == null) {
                    v1_3 = 0;
                } else {
                    int v1_2 = v13_1.getIntent();
                    if (v1_2 == 0) {
                    } else {
                        v1_3 = v1_2.getExtras();
                    }
                }
                int v1_8;
                if (v1_3 == 0) {
                    v1_8 = 0;
                } else {
                    v1_8 = v1_3.getIntArray("android-support-nav:controller:deepLinkIds");
                }
                int v3_4 = 0;
                if (v1_8 == 0) {
                    int v1_9 = v11_9.f();
                    v1_9.getClass();
                    c72 v2_5 = v1_9.e.a;
                    int v1_10 = v1_9.f;
                    while (v1_10 != 0) {
                        java.util.ArrayList v6_3 = v1_10.e;
                        if (v1_10.i.b == v2_5) {
                            v2_5 = v6_3.a;
                            v1_10 = v1_10.f;
                        } else {
                            int v1_11 = new qh2[0];
                            int v1_14 = r7.x(((qh2[]) java.util.Arrays.copyOf(v1_11, 0)));
                            if ((v13_1 != null) && ((v13_1.getIntent() != null) && (v13_1.getIntent().getData() != null))) {
                                c72 v2_12;
                                c72 v2_9 = v13_1.getIntent();
                                v2_9.getClass();
                                v1_14.putParcelable("android-support-nav:controller:deepLinkIntent", v2_9);
                                tl3 v11_10 = v11_9.i();
                                c72 v2_10 = v13_1.getIntent();
                                v2_10.getClass();
                                tl3 v11_11 = v11_10.f(new vv(v2_10.getData(), v2_10.getAction(), v2_10.getType(), 11), v11_10);
                                if (v11_11 == null) {
                                    v2_12 = 0;
                                } else {
                                    v2_12 = v11_11.e;
                                }
                                if (v2_12 != null) {
                                    tl3 v11_13 = v11_11.d.a(v11_11.e);
                                    if (v11_13 != null) {
                                        v1_14.putAll(v11_13);
                                    }
                                }
                            }
                            tl3 v11_15 = new xj(p12);
                            int v12_6 = v6_3.a;
                            c72 v2_15 = ((java.util.ArrayList) v11_15.e);
                            v2_15.clear();
                            v2_15.add(new z62(v12_6, 0));
                            if (((e72) v11_15.d) != null) {
                                v11_15.B();
                            }
                            ((android.content.Intent) v11_15.c).putExtra("android-support-nav:controller:deepLinkExtras", v1_14);
                            v11_15.p().b();
                            if (v13_1 == null) {
                                break;
                            }
                            v13_1.finish();
                            break;
                        }
                    }
                } else {
                    if (p12.e) {
                        v13_1.getClass();
                        int v1_1 = v13_1.getIntent();
                        java.util.ArrayList v6_0 = v1_1.getExtras();
                        v6_0.getClass();
                        c72 v2_0 = v6_0.getIntArray("android-support-nav:controller:deepLinkIds");
                        v2_0.getClass();
                        String v7_1 = new java.util.ArrayList(v2_0.length);
                        z62 v8_1 = v2_0.length;
                        e72 v9_0 = 0;
                        while (v9_0 < v8_1) {
                            v7_1.add(Integer.valueOf(v2_0[v9_0]));
                            v9_0++;
                        }
                        c72 v2_2 = v6_0.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                        if (v7_1.size() >= 2) {
                            z62 v8_5 = ((Number) dx.o0(v7_1)).intValue();
                            if (v2_2 != null) {
                                dx.o0(v2_2);
                            }
                            e72 v9_4 = s62.d(v8_5, v11_9.g(), 0, 0);
                            if ((v9_4 instanceof e72)) {
                                v8_5 = df2.B(((e72) v9_4)).e.a;
                            }
                            tl3 v11_2 = v11_9.f();
                            if ((v11_2 != null) && (v8_5 == v11_2.e.a)) {
                                tl3 v11_6 = new xj(p12);
                                int v12_1 = new qh2[0];
                                int v12_4 = r7.x(((qh2[]) java.util.Arrays.copyOf(v12_1, 0)));
                                v12_4.putParcelable("android-support-nav:controller:deepLinkIntent", v1_1);
                                int v1_4 = v6_0.getBundle("android-support-nav:controller:deepLinkExtras");
                                if (v1_4 != 0) {
                                    v12_4.putAll(v1_4);
                                }
                                ((android.content.Intent) v11_6.c).putExtra("android-support-nav:controller:deepLinkExtras", v12_4);
                                int v12_5 = v7_1.size();
                                int v1_7 = 0;
                                while (v1_7 < v12_5) {
                                    int v4_0 = v7_1.get(v1_7);
                                    v1_7++;
                                    int v5_0 = (v3_4 + 1);
                                    if (v3_4 < 0) {
                                        r7.e0();
                                        throw 0;
                                    } else {
                                        int v3_0;
                                        int v4_2 = ((Number) v4_0).intValue();
                                        if (v2_2 == null) {
                                            v3_0 = 0;
                                        } else {
                                            v3_0 = ((android.os.Bundle) v2_2.get(v3_4));
                                        }
                                        ((java.util.ArrayList) v11_6.e).add(new z62(v4_2, v3_0));
                                        if (((e72) v11_6.d) != null) {
                                            v11_6.B();
                                        }
                                        v3_4 = v5_0;
                                    }
                                }
                                v11_6.p().b();
                                v13_1.finish();
                            }
                        }
                    }
                }
            }
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35(j72 p23, String p24, d11 p25, l52 p26, l52 p27, l52 p28, l52 p29, d11 p30, android.content.Context p31, l52 p32, l52 p33, l52 p34, l52 p35, h42 p36, l52 p37, l52 p38, jg2 p39, t10 p40, int p41)
    {
        d11 v1_2;
        p39.getClass();
        if ((p41 & 6) != 0) {
            v1_2 = p41;
        } else {
            d11 v1_1;
            if (!((b20) p40).f(p39)) {
                v1_1 = 2;
            } else {
                v1_1 = 4;
            }
            v1_2 = (p41 | v1_1);
        }
        int v4_2;
        if ((v1_2 & 19) == 18) {
            v4_2 = 0;
        } else {
            v4_2 = 1;
        }
        if (!((b20) p40).O((v1_2 & 1), v4_2)) {
            ((b20) p40).R();
        } else {
            d11 v0_6 = n54.C(j22.a, p39).f(ac3.c);
            d11 v1_8 = ((b20) p40).L();
            int v4_3 = r10.a;
            if (v1_8 == v4_3) {
                v1_8 = new p63(2);
                ((b20) p40).j0(v1_8);
            }
            d11 v1_10 = ((d11) v1_8);
            d11 v2_1 = ((b20) p40).L();
            if (v2_1 == v4_3) {
                v2_1 = new p63(3);
                ((b20) p40).j0(v2_1);
            }
            d11 v2_3 = ((d11) v2_1);
            d11 v6_2 = ((b20) p40).L();
            if (v6_2 == v4_3) {
                v6_2 = new p63(4);
                ((b20) p40).j0(v6_2);
            }
            d11 v6_4 = ((d11) v6_2);
            d11 v3_1 = ((b20) p40).L();
            if (v3_1 == v4_3) {
                v3_1 = new p63(5);
                ((b20) p40).j0(v3_1);
            }
            d11 v3_3 = ((d11) v3_1);
            int v7_11 = (((((((((b20) p40).f(p25) | ((b20) p40).h(p23)) | ((b20) p40).f(p26)) | ((b20) p40).f(p27)) | ((b20) p40).f(p28)) | ((b20) p40).f(p29)) | ((b20) p40).f(p30)) | ((b20) p40).h(p31));
            bw3 v39_1 = v0_6;
            d11 v0_1 = ((b20) p40).L();
            if ((v7_11 != 0) || (v0_1 == v4_3)) {
                int v7_1 = new c83(p25, p23, p26, p27, p28, p29, p30, p32, p33, p34, p35, p31, p36, p37, p38);
                ((b20) p40).j0(v7_1);
                v0_1 = v7_1;
            }
            if1.b(p23, p24, v39_1, 0, v1_10, v2_3, v6_4, v3_3, ((d11) v0_1), ((b20) p40), 115015680);
        }
        return bw3.a;
    }

    private static final vp0 SettingsScreen$lambda$35$0$0(cd p0)
    {
        p0.getClass();
        return com.lele.llmonitor.ui.motion.AppMotion.INSTANCE.routeEnterTransition();
    }

    private static final rr0 SettingsScreen$lambda$35$1$0(cd p0)
    {
        p0.getClass();
        return com.lele.llmonitor.ui.motion.AppMotion.INSTANCE.routeExitTransition();
    }

    private static final vp0 SettingsScreen$lambda$35$2$0(cd p0)
    {
        p0.getClass();
        return com.lele.llmonitor.ui.motion.AppMotion.INSTANCE.routePopEnterTransition();
    }

    private static final rr0 SettingsScreen$lambda$35$3$0(cd p0)
    {
        p0.getClass();
        return com.lele.llmonitor.ui.motion.AppMotion.INSTANCE.routePopExitTransition();
    }

    private static final bw3 SettingsScreen$lambda$35$4$0(d11 p18, j72 p19, l52 p20, l52 p21, l52 p22, l52 p23, d11 p24, l52 p25, l52 p26, l52 p27, l52 p28, android.content.Context p29, h42 p30, l52 p31, l52 p32, f72 p33)
    {
        p33.getClass();
        int v6 = 1;
        pe1.k(p33, "settings/home", 0, new c00(-365656600, new s83(p18, p19), 1), 254);
        pe1.k(p33, "settings/appearance", 0, new c00(1603736401, new t83(p20, p21, p22, p23, p24, p25, p26, p27, p28), 1), 254);
        int v3_3 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
        pe1.k(p33, "settings/important_notice", 0, v3_3.getLambda$-2032848016$app(), 254);
        pe1.k(p33, "settings/scene", 0, new c00(-1374465137, new u83(p29, p19, p30), 1), 254);
        pe1.k(p33, "settings/hardware", 0, new c00(-716082258, new ba(4, p29), 1), 254);
        pe1.k(p33, "settings/data", 0, new c00(-57699379, new ba(5, p32), 1), 254);
        pe1.k(p33, "settings/about", 0, new c00(600683500, new ez1(p19, v6), v6), 254);
        pe1.k(p33, "open_source_licenses", 0, new c00(1259066379, new ez1(p19, 2), 1), 254);
        j11 v1_13 = new k62();
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$8(v1_13);
        j11 v1_16 = ((xm) v1_13.a.d);
        if (v1_16 == null) {
            v1_16 = w72.d;
        }
        pe1.k(p33, "open_source_license_detail/{groupId}", r7.L(new h62("groupId", new j62(v1_16))), v3_3.getLambda$1917449258$app(), 252);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$0(d11 p0, j72 p1, ad p2, l62 p3, t10 p4, int p5)
    {
        p2.getClass();
        p3.getClass();
        i41 v2_3 = (((b20) p4).f(p0) | ((b20) p4).h(p1));
        d11 v3_2 = ((b20) p4).L();
        if ((v2_3 != null) || (v3_2 == r10.a)) {
            v3_2 = new q73(p0, p1, 0);
            ((b20) p4).j0(v3_2);
        }
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(((d11) v3_2), ((b20) p4), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$0$0$0(d11 p2, j72 p3, ms1 p4)
    {
        p4.getClass();
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage(p4, new q73(p2, p3, 1));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$0$0$0$0(d11 p1, j72 p2, String p3)
    {
        p3.getClass();
        if (p1 == null) {
            p2.b(p3, new p63(9));
        } else {
            p1.invoke(p3);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$0$0$0$0$0(v72 p1)
    {
        p1.getClass();
        p1.b = 1;
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1(l52 p11, l52 p12, l52 p13, l52 p14, d11 p15, l52 p16, l52 p17, l52 p18, l52 p19, ad p20, l62 p21, t10 p22, int p23)
    {
        p20.getClass();
        p21.getClass();
        int v1_2 = ((((((b20) p22).f(p11) | ((b20) p22).f(p12)) | ((b20) p22).f(p13)) | ((b20) p22).f(p14)) | ((b20) p22).f(p15));
        d11 v7_1 = ((b20) p22).L();
        if ((v1_2 != 0) || (v7_1 == r10.a)) {
            int v1_5 = new dt2(p11, p12, p14, p13, p15, p16, p17, p18, p19);
            ((b20) p22).j0(v1_5);
            v7_1 = v1_5;
        }
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(((d11) v7_1), ((b20) p22), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0(l52 p10, l52 p11, l52 p12, l52 p13, d11 p14, l52 p15, l52 p16, l52 p17, l52 p18, ms1 p19)
    {
        p19.getClass();
        ms1.a(p19, 0, new c00(-57204716, new j83(p10, p11, p12, p13, p14, p15, p16, p17, p18), 1), 3);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0$0(l52 p14, l52 p15, l52 p16, l52 p17, d11 p18, l52 p19, l52 p20, l52 p21, l52 p22, pq1 p23, t10 p24, int p25)
    {
        int v4_3;
        p23.getClass();
        if ((p25 & 17) == 16) {
            v4_3 = 0;
        } else {
            v4_3 = 1;
        }
        if (!((b20) p24).O((p25 & 1), v4_3)) {
            ((b20) p24).R();
        } else {
            int v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$10(p14);
            com.lele.llmonitor.data.FollowSystemAppIconMode v5_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$12(p15);
            com.lele.llmonitor.data.AppLanguageOption v8 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$13(p17);
            com.lele.llmonitor.ui.theme.ThemePalettePreset v9 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$11(p16);
            d11 v10_1 = (((b20) p24).f(p14) | ((b20) p24).f(p15));
            d11 v11_1 = ((b20) p24).L();
            i41 v12 = r10.a;
            if ((v10_1 != null) || (v11_1 == v12)) {
                v11_1 = new o2(p14, p15, p19, 13);
                ((b20) p24).j0(v11_1);
            }
            d11 v11_3 = ((d11) v11_1);
            int v14_3 = ((b20) p24).f(p15);
            d11 v10_3 = ((b20) p24).L();
            if ((v14_3 != 0) || (v10_3 == v12)) {
                v10_3 = new vy1(p15, p20, 1);
                ((b20) p24).j0(v10_3);
            }
            d11 v10_5 = ((d11) v10_3);
            int v14_5 = ((b20) p24).f(p16);
            d11 v0_0 = ((b20) p24).L();
            if ((v14_5 != 0) || (v0_0 == v12)) {
                v0_0 = new vy1(p16, p21, 2);
                ((b20) p24).j0(v0_0);
            }
            d11 v0_2 = ((d11) v0_0);
            int v14_7 = ((b20) p24).f(p17);
            d11 v1_1 = ((b20) p24).L();
            if ((v14_7 != 0) || (v1_1 == v12)) {
                v1_1 = new vy1(p17, p22, 3);
                ((b20) p24).j0(v1_1);
            }
            d11 v1_3 = ((d11) v1_1);
            int v14_9 = ((b20) p24).f(p18);
            d11 v2_1 = ((b20) p24).L();
            if ((v14_9 != 0) || (v2_1 == v12)) {
                v2_1 = new ea0(3, p18);
                ((b20) p24).j0(v2_1);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard(v4_1, v5_1, v8, v9, v11_3, v10_5, v0_2, v1_3, ((d11) v2_1), ((b20) p24), 0);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0$0$0$0(l52 p2, l52 p3, l52 p4, int p5)
    {
        bw3 v1 = bw3.a;
        if (p5 != com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$10(p2)) {
            if (!com.lele.llmonitor.data.UiAppearanceSupportKt.shouldCloseTaskAfterThemeModeChange(com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$10(p2), com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$12(p3), p5)) {
                com.lele.llmonitor.data.SettingsManager.setThemeMode$default(com.lele.llmonitor.data.SettingsManager.INSTANCE, p5, 0, 2, 0);
            } else {
                com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$16(p4, Integer.valueOf(p5));
            }
            return v1;
        } else {
            return v1;
        }
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0$0$1$0(l52 p0, l52 p1, com.lele.llmonitor.data.FollowSystemAppIconMode p2)
    {
        p2.getClass();
        if (p2 != com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$12(p0)) {
            com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$19(p1, p2);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0$0$2$0(l52 p0, l52 p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2)
    {
        p2.getClass();
        if (p2 != com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$11(p0)) {
            com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$22(p1, p2);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0$0$3$0(l52 p0, l52 p1, com.lele.llmonitor.data.AppLanguageOption p2)
    {
        p2.getClass();
        if (p2 != com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$13(p0)) {
            com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$25(p1, p2);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$1$0$0$0$4$0(d11 p0, android.net.Uri p1)
    {
        p1.getClass();
        p0.invoke(p1);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2(android.content.Context p0, j72 p1, h42 p2, ad p3, l62 p4, t10 p5, int p6)
    {
        p3.getClass();
        p4.getClass();
        int v3_4 = (((b20) p5).h(p0) | ((b20) p5).h(p1));
        d11 v4_2 = ((b20) p5).L();
        if ((v3_4 != 0) || (v4_2 == r10.a)) {
            v4_2 = new o2(p0, p1, p2, 12);
            ((b20) p5).j0(v4_2);
        }
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(((d11) v4_2), ((b20) p5), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2$0$0(android.content.Context p2, j72 p3, h42 p4, ms1 p5)
    {
        p5.getClass();
        ms1.a(p5, 0, new c00(1259561042, new da0(p2, p3, p4, 3), 1), 3);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2$0$0$0(android.content.Context p8, j72 p9, h42 p10, pq1 p11, t10 p12, int p13)
    {
        s v11_7;
        p11.getClass();
        if ((p13 & 17) == 16) {
            v11_7 = 0;
        } else {
            v11_7 = 1;
        }
        if (!((b20) p12).O((p13 & 1), v11_7)) {
            ((b20) p12).R();
        } else {
            int v2 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$4(p10);
            s v11_3 = ((b20) p12).L();
            i41 v12_1 = r10.a;
            if (v11_3 == v12_1) {
                v11_3 = new x61(p10, 1);
                ((b20) p12).j0(v11_3);
            }
            d11 v3_1 = ((d11) v11_3);
            b71 v10_1 = ((b20) p12).h(p8);
            s v11_5 = ((b20) p12).L();
            if ((v10_1 != null) || (v11_5 == v12_1)) {
                v11_5 = new s(p8, 5);
                ((b20) p12).j0(v11_5);
            }
            s01 v4_1 = ((s01) v11_5);
            int v8_1 = ((b20) p12).h(p9);
            b71 v10_3 = ((b20) p12).L();
            if ((v8_1 != 0) || (v10_3 == v12_1)) {
                v10_3 = new b71(p9, 14);
                ((b20) p12).j0(v10_3);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage(v2, v3_1, v4_1, ((s01) v10_3), ((b20) p12), 48);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2$0$0$0$0$0(h42 p0, int p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$5(p0, p1);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2$0$0$0$1$0(android.content.Context p1)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.sendForceUpdateBroadcast(p1);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2$0$0$0$2$0(j72 p2)
    {
        p2.b("settings/important_notice", new p63(6));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$2$0$0$0$2$0$0(v72 p1)
    {
        p1.getClass();
        p1.b = 1;
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$3(android.content.Context p0, ad p1, l62 p2, t10 p3, int p4)
    {
        p1.getClass();
        p2.getClass();
        int v1_2 = ((b20) p3).h(p0);
        d11 v2_2 = ((b20) p3).L();
        if ((v1_2 != 0) || (v2_2 == r10.a)) {
            v2_2 = new k72(p0, 1);
            ((b20) p3).j0(v2_2);
        }
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(((d11) v2_2), ((b20) p3), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$3$0$0(android.content.Context p4, ms1 p5)
    {
        p5.getClass();
        ms1.a(p5, 0, new c00(1917943921, new o(p4, 3), 1), 3);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$3$0$0$0(android.content.Context p3, pq1 p4, t10 p5, int p6)
    {
        int v4_6;
        p4.getClass();
        if ((p6 & 17) == 16) {
            v4_6 = 0;
        } else {
            v4_6 = 1;
        }
        if (!((b20) p5).O((p6 & 1), v4_6)) {
            ((b20) p5).R();
        } else {
            int v4_3 = ((b20) p5).h(p3);
            s01 v6_1 = ((b20) p5).L();
            if ((v4_3 != 0) || (v6_1 == r10.a)) {
                v6_1 = new s(p3, 7);
                ((b20) p5).j0(v6_1);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage(((s01) v6_1), ((b20) p5), 0);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$3$0$0$0$0$0(android.content.Context p1)
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE.sendForceUpdateBroadcast(p1);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$4(android.content.Context p0, l52 p1, ad p2, l62 p3, t10 p4, int p5)
    {
        p2.getClass();
        p3.getClass();
        i41 v2_1 = ((b20) p4).h(p0);
        d11 v3_2 = ((b20) p4).L();
        if ((v2_1 != null) || (v3_2 == r10.a)) {
            v3_2 = new wg2(p0, p1);
            ((b20) p4).j0(v3_2);
        }
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(((d11) v3_2), ((b20) p4), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$4$0$0(android.content.Context p2, l52 p3, ms1 p4)
    {
        p4.getClass();
        ms1.a(p4, 0, new c00(-1042715024, new j60(6, p2, p3), 1), 3);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$4$0$0$0(android.content.Context p3, l52 p4, pq1 p5, t10 p6, int p7)
    {
        boolean v5_4;
        p5.getClass();
        if ((p7 & 17) == 16) {
            v5_4 = 0;
        } else {
            v5_4 = 1;
        }
        if (!((b20) p6).O((p7 & 1), v5_4)) {
            ((b20) p6).R();
        } else {
            boolean v5_3 = com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$7(p4);
            i41 v7_1 = ((b20) p6).h(p3);
            s01 v0_0 = ((b20) p6).L();
            if ((v7_1 != null) || (v0_0 == r10.a)) {
                v0_0 = new ga0(1, p4, p3);
                ((b20) p6).j0(v0_0);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage(v5_3, ((s01) v0_0), ((b20) p6), 0);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$4$0$0$0$0$0(android.content.Context p3, l52 p4)
    {
        if (com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$7(p4)) {
            android.net.Uri v0_2 = p3.getPackageName();
            String v1_2 = new StringBuilder("package:");
            v1_2.append(v0_2);
            p3.startActivity(new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", android.net.Uri.parse(v1_2.toString())));
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$5(l52 p0, ad p1, l62 p2, t10 p3, int p4)
    {
        p1.getClass();
        p2.getClass();
        d11 v1_2 = ((b20) p3).L();
        if (v1_2 == r10.a) {
            v1_2 = new ub(p0, 10);
            ((b20) p3).j0(v1_2);
        }
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(((d11) v1_2), ((b20) p3), 6);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$5$0$0(l52 p3, ms1 p4)
    {
        p4.getClass();
        ms1.a(p4, 0, new c00(-1718640496, new ys(8, p3), 1), 3);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$5$0$0$0(l52 p2, pq1 p3, t10 p4, int p5)
    {
        s01 v3_6;
        p3.getClass();
        if ((p5 & 17) == 16) {
            v3_6 = 0;
        } else {
            v3_6 = 1;
        }
        if (!((b20) p4).O((p5 & 1), v3_6)) {
            ((b20) p4).R();
        } else {
            s01 v3_3 = ((b20) p4).L();
            if (v3_3 == r10.a) {
                v3_3 = new wb(p2, 24);
                ((b20) p4).j0(v3_3);
            }
            com.lele.llmonitor.ui.settings.SettingsScreenKt.DataManagementPage(((s01) v3_3), ((b20) p4), 6);
        }
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$5$0$0$0$0$0(l52 p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$2(p1, 1);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$6(j72 p0, ad p1, l62 p2, t10 p3, int p4)
    {
        p1.getClass();
        p2.getClass();
        int v1_2 = ((b20) p3).h(p0);
        s01 v2_2 = ((b20) p3).L();
        if ((v1_2 != 0) || (v2_2 == r10.a)) {
            v2_2 = new b71(p0, 13);
            ((b20) p3).j0(v2_2);
        }
        com.lele.llmonitor.ui.settings.AboutScreenPageKt.AboutScreen(((s01) v2_2), ((b20) p3), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$6$0$0(j72 p1)
    {
        j72.c(p1, "open_source_licenses");
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$7(j72 p0, ad p1, l62 p2, t10 p3, int p4)
    {
        p1.getClass();
        p2.getClass();
        int v1_2 = ((b20) p3).h(p0);
        d11 v2_2 = ((b20) p3).L();
        if ((v1_2 != 0) || (v2_2 == r10.a)) {
            v2_2 = new dz1(p0, 2);
            ((b20) p3).j0(v2_2);
        }
        com.lele.llmonitor.ui.settings.OpenSourceLicensesScreenPageKt.OpenSourceLicensesScreen(((d11) v2_2), ((b20) p3), 0);
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$7$0$0(j72 p0, String p1)
    {
        p1.getClass();
        j72.c(p0, com.lele.llmonitor.ui.settings.OpenSourceLicensesScreenPageKt.openSourceLicenseDetailRoute(p1));
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$35$4$0$8(k62 p1)
    {
        p1.getClass();
        p1.a.d = w72.d;
        return bw3.a;
    }

    private static final bw3 SettingsScreen$lambda$36(com.lele.llmonitor.ui.dashboard.BatteryViewModel p10, s01 p11, boolean p12, String p13, d11 p14, d11 p15, int p16, int p17, t10 p18, int p19)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen(p10, p11, p12, p13, p14, p15, p18, vc1.b0((p16 | 1)), p17);
        return bw3.a;
    }

    private static final int SettingsScreen$lambda$4(h42 p0)
    {
        return ((di2) p0).g();
    }

    private static final void SettingsScreen$lambda$5(h42 p0, int p1)
    {
        ((di2) p0).h(p1);
        return;
    }

    private static final boolean SettingsScreen$lambda$7(l52 p0)
    {
        return ((Boolean) p0.getValue()).booleanValue();
    }

    private static final void SettingsScreen$lambda$8(l52 p0, boolean p1)
    {
        p0.setValue(Boolean.valueOf(p1));
        return;
    }

    private static final l62 SettingsScreen$lambda$9(cg3 p0)
    {
        return ((l62) p0.getValue());
    }

    private static final void SystemSettingsPage(boolean p11, s01 p12, t10 p13, int p14)
    {
        at2 v13_2;
        ((b20) p13).a0(-415954578);
        if ((p14 & 6) != 0) {
            v13_2 = p14;
        } else {
            at2 v13_1;
            if (!((b20) p13).g(p11)) {
                v13_1 = 2;
            } else {
                v13_1 = 4;
            }
            v13_2 = (v13_1 | p14);
        }
        if ((p14 & 48) == 0) {
            ek v0_2;
            if (!((b20) p13).h(p12)) {
                v0_2 = 16;
            } else {
                v0_2 = 32;
            }
            v13_2 |= v0_2;
        }
        ek v0_4;
        if ((v13_2 & 19) == 18) {
            v0_4 = 0;
        } else {
            v0_4 = 1;
        }
        if (!((b20) p13).O((v13_2 & 1), v0_4)) {
            ((b20) p13).R();
        } else {
            com.lele.llmonitor.ui.settings.SettingsSectionCardKt.SettingsSectionCard(com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7cfb\u7edf\u4e0e\u8bca\u65ad"), n54.C(j22.a, com.lele.llmonitor.ui.settings.SettingsUiKitKt.settingsCardOuterPadding-0680j_4$default(0, 1, 0)), com.lele.llmonitor.i18n.TextI18nKt.l10n("\u540e\u53f0\u4fdd\u6d3b\u4e0e\u8c03\u8bd5\u9009\u9879"), ed1.x(), 0, 0, n54.K(-445066273, new cb(1, p12, p11), ((b20) p13)), ((b20) p13), 1572864, 48);
        }
        at2 v13_10 = ((b20) p13).r();
        if (v13_10 != null) {
            v13_10.d = new ek(p11, p12, p14, 2);
        }
        return;
    }

    private static final bw3 SystemSettingsPage$lambda$0(s01 p14, boolean p15, cy p16, t10 p17, int p18)
    {
        long v1_6;
        p16.getClass();
        if ((p18 & 17) == 16) {
            v1_6 = 0;
        } else {
            v1_6 = 1;
        }
        b20 v11_0 = ((b20) p17);
        if (!((b20) p17).O((p18 & 1), v1_6)) {
            ((b20) p17).R();
        } else {
            long v1_2 = ((b20) p17).f(p14);
            s01 v2_0 = ((b20) p17).L();
            if ((v1_2 != 0) || (v2_0 == r10.a)) {
                v2_0 = new eg(5, p14);
                ((b20) p17).j0(v2_0);
            }
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v14_1 = j22.a;
            long v1_5 = fx.f;
            bd1.d(n54.K(-2079876799, new r83(0, p15), ((b20) p17)), ix2.q(v14_1, ((s01) v2_0)), n54.K(205767134, new r83(1, p15), ((b20) p17)), n54.K(967648445, new r83(2, p15), ((b20) p17)), n54.K(1729529756, new r83(3, p15), v11_0), ad1.p(v1_5, ((b20) p17)), v11_0, 224262, 388);
            p34.b(n54.F(v14_1, 1098907648, 0, 2), 0, 0, ((b20) p17), 6, 6);
            b20 v11_2 = ((b20) p17);
            com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt v14_2 = com.lele.llmonitor.ui.settings.ComposableSingletons$SettingsScreenKt.INSTANCE;
            bd1.d(v14_2.getLambda$-617411798$app(), 0, v14_2.getLambda$1158119559$app(), 0, v14_2.getLambda$910151365$app(), ad1.p(v1_5, v11_2), v11_2, 199686, 406);
        }
        return bw3.a;
    }

    private static final bw3 SystemSettingsPage$lambda$0$0$0(s01 p0)
    {
        p0.invoke();
        return bw3.a;
    }

    private static final bw3 SystemSettingsPage$lambda$0$1(boolean p24, t10 p25, int p26)
    {
        String v0_5;
        if ((p26 & 3) == 2) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_5)) {
            ((b20) p25).R();
        } else {
            String v0_2;
            if (!p24) {
                v0_2 = "\u7535\u6c60\u4f18\u5316\u5df2\u7981\u7528";
            } else {
                v0_2 = "\u7981\u7528\u7535\u6c60\u4f18\u5316";
            }
            bp3.b(com.lele.llmonitor.i18n.TextI18nKt.l10n(v0_2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SystemSettingsPage$lambda$0$2(boolean p24, t10 p25, int p26)
    {
        bw3 v0_5;
        if ((p26 & 3) == 2) {
            v0_5 = 0;
        } else {
            v0_5 = 1;
        }
        if (!((b20) p25).O((p26 & 1), v0_5)) {
            ((b20) p25).R();
        } else {
            bw3 v0_3;
            if (!p24) {
                v0_3 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u540e\u53f0\u66f4\u65b0\u4e0d\u53d7\u9650\u5236");
            } else {
                v0_3 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u70b9\u51fb\u7981\u7528\uff0c\u786e\u4fdd\u540e\u53f0\u5b9e\u65f6\u66f4\u65b0\u4e0d\u4e2d\u65ad");
            }
            bp3.b(v0_3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((b20) p25), 0, 0, 262142);
        }
        return bw3.a;
    }

    private static final bw3 SystemSettingsPage$lambda$0$3(boolean p21, t10 p22, int p23)
    {
        long v0_6;
        if ((p23 & 3) == 2) {
            v0_6 = 0;
        } else {
            v0_6 = 1;
        }
        if (!((b20) p22).O((p23 & 1), v0_6)) {
            ((b20) p22).R();
        } else {
            long v0_3;
            if (!p21) {
                v0_3 = jn.q;
                if (v0_3 == 0) {
                    int v10_2 = new ld1("Filled.CheckCircle", 1103101952, 1103101952, 1103101952, 1103101952, 0, 0, 0, 96);
                    long v0_5 = new xe3(fx.b);
                    int v11_3 = new xz0(2, 0);
                    v11_3.m(1094713344, 1073741824);
                    v11_3.f(1087331369, 1073741824, 1073741824, 1087331369, 1073741824, 1094713344);
                    v11_3.o(1083137065, 1092616192, 1092616192, 1092616192);
                    v11_3.o(1092616192, -1064346583, 1092616192, -1054867456);
                    v11_3.n(1099704566, 1073741824, 1094713344, 1073741824);
                    v11_3.e();
                    v11_3.m(1092616192, 1099431936);
                    v11_3.l(-1063256064, -1063256064);
                    v11_3.l(1068792545, -1078691103);
                    v11_3.k(1092616192, 1096988754);
                    v11_3.l(1089659208, -1057824440);
                    v11_3.k(1100480512, 1090519040);
                    v11_3.l(-1055916032, 1091567616);
                    v11_3.e();
                    ld1.a(v10_2, v11_3.a, v0_5);
                    v0_3 = v10_2.b();
                    jn.q = v0_3;
                }
            } else {
                v0_3 = ed1.x();
            }
            long v0_12;
            int v4_4 = v0_3;
            String v5_1 = com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7535\u6c60\u4f18\u5316");
            if (!p21) {
                ((b20) p22).Y(-605328940);
                v0_12 = ((mx) ((b20) p22).j(ox.a)).a;
                ((b20) p22).p(0);
            } else {
                ((b20) p22).Y(-605413322);
                v0_12 = ((mx) ((b20) p22).j(ox.a)).w;
                ((b20) p22).p(0);
            }
            pc1.a(v4_4, v5_1, 0, v0_12, ((b20) p22), 0, 4);
        }
        return bw3.a;
    }

    private static final bw3 SystemSettingsPage$lambda$0$4(boolean p21, t10 p22, int p23)
    {
        String v0_7;
        if ((p23 & 3) == 2) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        if (!((b20) p22).O((p23 & 1), v0_7)) {
            ((b20) p22).R();
        } else {
            if (!p21) {
                ((b20) p22).Y(1993461702);
                ((b20) p22).p(0);
            } else {
                ((b20) p22).Y(1993324279);
                String v0_4 = jn.p;
                if (v0_4 == null) {
                    int v10_1 = new ld1("AutoMirrored.Filled.ArrowForward", 1103101952, 1103101952, 1103101952, 1103101952, 0, 0, 1, 96);
                    String v0_6 = new xe3(fx.b);
                    java.util.ArrayList v1_2 = new xz0(2, 0);
                    v1_2.m(1094713344, 1082130432);
                    v1_2.l(-1078691103, 1068792545);
                    v1_2.k(1098996777, 1093664768);
                    v1_2.i(1082130432);
                    v1_2.r(1073741824);
                    v1_2.j(1094891602);
                    v1_2.l(-1062039716, 1085464904);
                    v1_2.k(1094713344, 1101004800);
                    v1_2.l(1090519040, -1056964608);
                    v1_2.e();
                    ld1.a(v10_1, v1_2.a, v0_6);
                    v0_4 = v10_1.b();
                    jn.p = v0_4;
                }
                pc1.a(v0_4, com.lele.llmonitor.i18n.TextI18nKt.l10n("\u524d\u5f80\u8bbe\u7f6e"), 0, 0, ((b20) p22), 0, 12);
                ((b20) p22).p(0);
            }
        }
        return bw3.a;
    }

    private static final bw3 SystemSettingsPage$lambda$1(boolean p0, s01 p1, int p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage(p0, p1, p3, vc1.b0((p2 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 T(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$2(p0, p1, p2);
    }

    public static synthetic bw3 T0(String p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$0$0(p0);
    }

    public static synthetic bw3 T1(boolean p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$0$3(p0, p1, p2);
    }

    public static synthetic bw3 T2(String p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$34$0(p0, p1, p2);
    }

    private static final void ThemePaletteOptionCard(com.lele.llmonitor.ui.theme.ThemePalettePreset p23, boolean p24, cg3 p25, boolean p26, s01 p27, m22 p28, t10 p29, int p30, int p31)
    {
        int v0_0;
        ((b20) p29).a0(-1037076029);
        if ((p30 & 6) != 0) {
            v0_0 = p30;
        } else {
            int v0_15;
            if (!((b20) p29).d(p23.ordinal())) {
                v0_15 = 2;
            } else {
                v0_15 = 4;
            }
            v0_0 = (v0_15 | p30);
        }
        if ((p30 & 48) == 0) {
            long v4_12;
            if (!((b20) p29).g(p24)) {
                v4_12 = 16;
            } else {
                v4_12 = 32;
            }
            v0_0 |= v4_12;
        }
        if ((p30 & 384) == 0) {
            long v4_15;
            if (!((b20) p29).f(p25)) {
                v4_15 = 128;
            } else {
                v4_15 = 256;
            }
            v0_0 |= v4_15;
        }
        if ((p30 & 3072) == 0) {
            long v4_18;
            if (!((b20) p29).g(p26)) {
                v4_18 = 1024;
            } else {
                v4_18 = 2048;
            }
            v0_0 |= v4_18;
        }
        if ((p30 & 24576) == 0) {
            long v4_21;
            if (!((b20) p29).h(p27)) {
                v4_21 = 8192;
            } else {
                v4_21 = 16384;
            }
            v0_0 |= v4_21;
        }
        m22 v6_4;
        long v4_22 = (p31 & 32);
        if (v4_22 == 0) {
            if ((196608 & p30) != 0) {
                v6_4 = p28;
            } else {
                java.util.List v7_4;
                v6_4 = p28;
                if (!((b20) p29).f(p28)) {
                    v7_4 = 65536;
                } else {
                    v7_4 = 131072;
                }
                v0_0 |= v7_4;
            }
        } else {
            v0_0 |= 196608;
        }
        int v14_1 = v0_0;
        int v0_28;
        if ((74899 & v14_1) == 74898) {
            v0_28 = 0;
        } else {
            v0_28 = 1;
        }
        b20 v20;
        if (!((b20) p29).O((v14_1 & 1), v0_28)) {
            v20 = ((b20) p29);
            ((b20) p29).R();
        } else {
            m22 v13_1;
            if (v4_22 == 0) {
                v13_1 = v6_4;
            } else {
                v13_1 = j22.a;
            }
            m22 v6_7;
            int v0_34 = ((android.content.Context) ((b20) p29).j(z7.b));
            long v4_23 = (v14_1 & 14);
            if (v4_23 != 4) {
                v6_7 = 0;
            } else {
                v6_7 = 1;
            }
            kt v16_2;
            java.util.List v7_7 = (v14_1 & 112);
            if (v7_7 != 32) {
                v16_2 = 0;
            } else {
                v16_2 = 1;
            }
            m22 v6_0 = ((v6_7 | v16_2) | ((b20) p29).f(v0_34));
            com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec v8_0 = ((b20) p29).L();
            v93 v15_0 = r10.a;
            if ((v6_0 != null) || (v8_0 == v15_0)) {
                v8_0 = com.lele.llmonitor.ui.theme.ThemeKt.resolveAppColorScheme(v0_34, p24, p23);
                ((b20) p29).j0(v8_0);
            }
            int v0_1;
            com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec v8_1 = ((mx) v8_0);
            if (v4_23 != 4) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            int v2_1;
            int v2_0 = ((b20) p29).f(v8_1);
            if (v7_7 != 32) {
                v2_1 = 0;
            } else {
                v2_1 = 1;
            }
            int v0_3 = ((v0_1 | v2_0) | v2_1);
            int v2_2 = ((b20) p29).L();
            if ((v0_3 != 0) || (v2_2 == v15_0)) {
                v2_2 = com.lele.llmonitor.ui.settings.SettingsScreenKt.resolveThemePalettePreviewSpec(p23, v8_1, p24);
                ((b20) p29).j0(v2_2);
            }
            int v2_3 = ((com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec) v2_2);
            int v0_6 = ((b20) p29).f(v2_3.getAccentBorderColors());
            long v4_0 = ((b20) p29).L();
            if ((v0_6 != 0) || (v4_0 == v15_0)) {
                v4_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.orderForSpectrumPreview(v2_3.getAccentBorderColors());
                ((b20) p29).j0(v4_0);
            }
            long v4_8;
            java.util.List v7_1 = ((java.util.List) v4_0);
            v93 v15_1 = com.lele.llmonitor.ui.theme.AppShapes.INSTANCE.g2-0680j_4(com.lele.llmonitor.ui.theme.AppCorners.INSTANCE.getMd-D9Ej5fM());
            if (!p26) {
                ((b20) p29).Y(-1831194701);
                v4_8 = fx.b(((mx) ((b20) p29).j(ox.a)).B, 1055286886);
                ((b20) p29).p(0);
            } else {
                ((b20) p29).Y(-1831250098);
                v4_8 = ((mx) ((b20) p29).j(ox.a)).a;
                ((b20) p29).p(0);
            }
            int v0_21 = (v14_1 >> 12);
            v20 = ((b20) p29);
            wm1.I(p27, v13_1, 0, v15_1, ni1.q(fx.f, ((b20) p29), 6), ni1.r(0, 62), 0, n54.K(-770520520, new com.lele.llmonitor.ui.settings.d(v15_1, v8_1, p26, v4_8, p23, v7_1, v2_3, p25), ((b20) p29)), ((b20) p29), (((v0_21 & 14) | 100663296) | (v0_21 & 112)), 196);
            v6_4 = v13_1;
        }
        at2 v9_0 = v20.r();
        if (v9_0 != null) {
            v9_0.d = new r73(p23, p24, p25, p26, p27, v6_4, p30, p31);
        }
        return;
    }

    private static final bw3 ThemePaletteOptionCard$lambda$3(v93 p29, mx p30, boolean p31, long p32, com.lele.llmonitor.ui.theme.ThemePalettePreset p34, java.util.List p35, com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec p36, cg3 p37, cy p38, t10 p39, int p40)
    {
        j22 v3_0;
        int v1_0 = r7.f;
        int v2_0 = px2.o;
        p38.getClass();
        if ((p40 & 17) == 16) {
            v3_0 = 0;
        } else {
            v3_0 = 1;
        }
        if (!((b20) p39).O((p40 & 1), v3_0)) {
            ((b20) p39).R();
        } else {
            j22 v3_2 = j22.a;
            long v7_4 = n54.E(ac3.c(v3_2, 1065353216), 1073741824, 1082130432);
            m22 v8_6 = xx.a(new hh(1092616192, 1, new dh(0)), px2.s, ((b20) p39), 54);
            int v10_12 = p34.x(((b20) p39));
            java.util.List v11_5 = ((b20) p39).l();
            long v7_8 = jn.K(((b20) p39), v7_4);
            o10.b.getClass();
            int v13_3 = n10.b;
            ((b20) p39).c0();
            if (!((b20) p39).S) {
                ((b20) p39).m0();
            } else {
                ((b20) p39).k(v13_3);
            }
            kq1 v14_4 = n10.f;
            se1.L(((b20) p39), v14_4, v8_6);
            m22 v8_11 = n10.e;
            se1.L(((b20) p39), v8_11, v11_5);
            java.util.List v11_6 = n10.g;
            if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v10_12)))) {
                ve2.v(v10_12, ((b20) p39), v10_12, v11_6);
            }
            long v9_11;
            float v6_8 = n10.d;
            se1.L(((b20) p39), v6_8, v7_8);
            long v7_12 = wb0.m(ix2.s(r7.u(ac3.c(v3_2, 1065353216), 1067702026), p29), p30.p, v1_0);
            if (!p31) {
                v9_11 = 1065353216;
            } else {
                v9_11 = 1069547520;
            }
            int v4_32 = mi1.a(p32, v9_11);
            int v0_22 = n54.D(tg1.h(v7_12, v4_32.a, v4_32.b, p29), 1092616192);
            int v4_35 = sn.d(px2.f, 0);
            int v5_23 = p34.x(((b20) p39));
            long v7_13 = ((b20) p39).l();
            int v0_23 = jn.K(((b20) p39), v0_22);
            ((b20) p39).c0();
            if (!((b20) p39).S) {
                ((b20) p39).m0();
            } else {
                ((b20) p39).k(v13_3);
            }
            se1.L(((b20) p39), v14_4, v4_35);
            se1.L(((b20) p39), v8_11, v7_13);
            if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v5_23)))) {
                ve2.v(v5_23, ((b20) p39), v5_23, v11_6);
            }
            se1.L(((b20) p39), v6_8, v0_23);
            int v4_6 = xx.a(new hh(1090519040, 1, new dh(0)), px2.r, ((b20) p39), 6);
            int v5_3 = p34.x(((b20) p39));
            int v10_0 = ((b20) p39).l();
            int v0_2 = jn.K(((b20) p39), ac3.c);
            ((b20) p39).c0();
            if (!((b20) p39).S) {
                ((b20) p39).m0();
            } else {
                ((b20) p39).k(v13_3);
            }
            se1.L(((b20) p39), v14_4, v4_6);
            se1.L(((b20) p39), v8_11, v10_0);
            if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v5_3)))) {
                ve2.v(v5_3, ((b20) p39), v5_3, v11_6);
            }
            se1.L(((b20) p39), v6_8, v0_2);
            int v0_5 = ac3.d(ac3.c(v3_2, 1065353216), 1086324736);
            int v4_13 = ey2.a(new hh(1082130432, 1, new dh(0)), v2_0, ((b20) p39), 6);
            int v5_6 = p34.x(((b20) p39));
            int v10_4 = ((b20) p39).l();
            int v0_6 = jn.K(((b20) p39), v0_5);
            ((b20) p39).c0();
            if (!((b20) p39).S) {
                ((b20) p39).m0();
            } else {
                ((b20) p39).k(v13_3);
            }
            se1.L(((b20) p39), v14_4, v4_13);
            se1.L(((b20) p39), v8_11, v10_4);
            if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v5_6)))) {
                ve2.v(v5_6, ((b20) p39), v5_6, v11_6);
            }
            se1.L(((b20) p39), v6_8, v0_6);
            ((b20) p39).Y(-1202159536);
            int v0_8 = p35.iterator();
            while (v0_8.hasNext()) {
                sn.a(wb0.m(ix2.s(new kq1(1065353216, 1).f(ac3.b), com.lele.llmonitor.ui.theme.AppShapes.INSTANCE.g2-0680j_4(com.lele.llmonitor.ui.theme.AppCorners.INSTANCE.getXs-D9Ej5fM())), ((fx) v0_8.next()).a, v1_0), ((b20) p39), 0);
            }
            ((b20) p39).p(0);
            ((b20) p39).p(1);
            int v0_9 = ac3.c(v3_2, 1065353216);
            int v1_3 = ey2.a(new hh(1090519040, 1, new dh(0)), v2_0, ((b20) p39), 6);
            int v2_1 = p34.x(((b20) p39));
            int v4_21 = ((b20) p39).l();
            int v0_10 = jn.K(((b20) p39), v0_9);
            o10.b.getClass();
            ((b20) p39).c0();
            if (!((b20) p39).S) {
                ((b20) p39).m0();
            } else {
                ((b20) p39).k(n10.b);
            }
            se1.L(((b20) p39), n10.f, v1_3);
            se1.L(((b20) p39), n10.e, v4_21);
            if ((((b20) p39).S) || (!ni1.o(((b20) p39).L(), Integer.valueOf(v2_1)))) {
                ve2.v(v2_1, ((b20) p39), v2_1, n10.g);
            }
            se1.L(((b20) p39), n10.d, v0_10);
            ((b20) p39).Y(796050691);
            int v0_14 = yw.S0(3, p36.getCardColors()).iterator();
            int v5_12 = 0;
            while (v0_14.hasNext()) {
                int v2_8 = v0_14.next();
                int v4_25 = (v5_12 + 1);
                if (v5_12 < 0) {
                    r7.e0();
                    throw 0;
                } else {
                    int v13_1;
                    int v2_9 = ((com.lele.llmonitor.ui.settings.ThemePalettePreviewColor) v2_8);
                    long v7_7 = v2_9.getContainer-0d7_KjU();
                    long v9_5 = v2_9.getContent-0d7_KjU();
                    java.util.List v11_3 = p36.getAccentBorderColors();
                    if (v5_12 != 1) {
                        v13_1 = 0;
                    } else {
                        v13_1 = 1;
                    }
                    int v2_11;
                    if (v5_12 != 1) {
                        v2_11 = 1065353216;
                    } else {
                        v2_11 = 1066863165;
                    }
                    if (((double) v2_11) <= 0) {
                        nf1.a("invalid weight; must be greater than zero");
                    }
                    if (v2_11 > 2139095039) {
                        v2_11 = 2139095039;
                    }
                    com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePalettePreviewBlock-1Kfb2uI(v7_7, v9_5, v11_3, p37, v13_1, new kq1(v2_11, 1), ((b20) p39), 0, 0);
                    v5_12 = v4_25;
                }
            }
            ((b20) p39).p(0);
            ((b20) p39).p(1);
            ((b20) p39).p(1);
            ((b20) p39).p(1);
            bp3.b(com.lele.llmonitor.ui.settings.SettingsScreenKt.resolveThemePaletteLabel(p34), ac3.c(v3_2, 1065353216), ((mx) ((b20) p39).j(ox.a)).q, 0, hz0.h, 0, new yl3(3), 0, 2, 0, 1, 0, 0, ((mu3) ((b20) p39).j(ou3.a)).i, ((b20) p39), 1572912, 24960, 109496);
            ((b20) p39).p(1);
        }
        return bw3.a;
    }

    private static final bw3 ThemePaletteOptionCard$lambda$4(com.lele.llmonitor.ui.theme.ThemePalettePreset p10, boolean p11, cg3 p12, boolean p13, s01 p14, m22 p15, int p16, int p17, t10 p18, int p19)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteOptionCard(p10, p11, p12, p13, p14, p15, p18, vc1.b0((p16 | 1)), p17);
        return bw3.a;
    }

    private static final void ThemePalettePreviewBlock-1Kfb2uI(long p21, long p23, java.util.List p25, cg3 p26, boolean p27, m22 p28, t10 p29, int p30, int p31)
    {
        int v5_0;
        ((b20) p29).a0(1258811802);
        if ((p30 & 6) != 0) {
            v5_0 = p30;
        } else {
            int v5_6;
            if (!((b20) p29).e(p21)) {
                v5_6 = 2;
            } else {
                v5_6 = 4;
            }
            v5_0 = (v5_6 | p30);
        }
        if ((p30 & 48) == 0) {
            int v6_10;
            if (!((b20) p29).e(p23)) {
                v6_10 = 16;
            } else {
                v6_10 = 32;
            }
            v5_0 |= v6_10;
        }
        if ((p30 & 384) == 0) {
            int v6_16;
            if (!((b20) p29).h(p25)) {
                v6_16 = 128;
            } else {
                v6_16 = 256;
            }
            v5_0 |= v6_16;
        }
        if ((p30 & 3072) == 0) {
            xc v8_3;
            if (!((b20) p29).f(p26)) {
                v8_3 = 1024;
            } else {
                v8_3 = 2048;
            }
            v5_0 |= v8_3;
        }
        if ((p30 & 24576) == 0) {
            xc v8_6;
            if (!((b20) p29).g(p27)) {
                v8_6 = 8192;
            } else {
                v8_6 = 16384;
            }
            v5_0 |= v8_6;
        }
        m22 v10_13;
        xc v8_7 = (p31 & 32);
        if (v8_7 == null) {
            if ((196608 & p30) != 0) {
                v10_13 = p28;
            } else {
                v93 v11_3;
                v10_13 = p28;
                if (!((b20) p29).f(p28)) {
                    v11_3 = 65536;
                } else {
                    v11_3 = 131072;
                }
                v5_0 |= v11_3;
            }
        } else {
            v5_0 |= 196608;
        }
        v93 v11_6;
        if ((74899 & v5_0) == 74898) {
            v11_6 = 0;
        } else {
            v11_6 = 1;
        }
        long v7_11;
        int v3_19;
        if (!((b20) p29).O((v5_0 & 1), v11_6)) {
            v7_11 = p23;
            v3_19 = ((b20) p29);
            ((b20) p29).R();
        } else {
            xc v8_8;
            v93 v11_8 = j22.a;
            if (v8_7 == null) {
                v8_8 = v10_13;
            } else {
                v8_8 = v11_8;
            }
            m22 v10_17 = com.lele.llmonitor.ui.theme.AppShapes.INSTANCE;
            float v13_5 = com.lele.llmonitor.ui.theme.AppCorners.INSTANCE;
            float v14_2 = v10_17.g2-0680j_4(v13_5.getSm-D9Ej5fM());
            int v15_6 = ac3.d(v8_8, 1113063424);
            int v6_22 = px2.f;
            m22 v28_1 = v8_8;
            xc v8_9 = sn.d(v6_22, 0);
            long v7_14 = p34.x(((b20) p29));
            int v9_0 = ((b20) p29).l();
            int v15_0 = jn.K(((b20) p29), v15_6);
            o10.b.getClass();
            java.util.List v12_0 = n10.b;
            ((b20) p29).c0();
            o83 v17_1 = v13_5;
            if (!((b20) p29).S) {
                ((b20) p29).m0();
            } else {
                ((b20) p29).k(v12_0);
            }
            float v13_1 = n10.f;
            se1.L(((b20) p29), v13_1, v8_9);
            xc v8_0 = n10.e;
            se1.L(((b20) p29), v8_0, v9_0);
            int v9_1 = n10.g;
            int v18_0 = v5_0;
            if ((((b20) p29).S) || (!ni1.o(((b20) p29).L(), Integer.valueOf(v7_14)))) {
                ve2.v(v7_14, ((b20) p29), v7_14, v9_1);
            }
            int v3_3 = n10.d;
            se1.L(((b20) p29), v3_3, v15_0);
            int v4_0 = xn.a;
            int v5_5 = n54.D(v4_0.b(), 1069547520);
            int v15_1 = sn.d(v6_22, 0);
            long v7_2 = p34.x(((b20) p29));
            int v19_0 = v4_0;
            int v4_1 = ((b20) p29).l();
            int v5_7 = jn.K(((b20) p29), v5_5);
            ((b20) p29).c0();
            int v20 = v10_17;
            if (!((b20) p29).S) {
                ((b20) p29).m0();
            } else {
                ((b20) p29).k(v12_0);
            }
            se1.L(((b20) p29), v13_1, v15_1);
            se1.L(((b20) p29), v8_0, v4_1);
            if ((((b20) p29).S) || (!ni1.o(((b20) p29).L(), Integer.valueOf(v7_2)))) {
                ve2.v(v7_2, ((b20) p29), v7_2, v9_1);
            }
            se1.L(((b20) p29), v3_3, v5_7);
            int v5_8 = r7.f;
            int v4_8 = n54.E(wb0.m(ix2.s(v19_0.b(), v14_2), p21, v5_8), 1090519040, 1088421888);
            int v6_1 = sn.d(v6_22, 0);
            long v7_5 = p34.x(((b20) p29));
            int v15_2 = ((b20) p29).l();
            int v4_9 = jn.K(((b20) p29), v4_8);
            ((b20) p29).c0();
            if (!((b20) p29).S) {
                ((b20) p29).m0();
            } else {
                ((b20) p29).k(v12_0);
            }
            se1.L(((b20) p29), v13_1, v6_1);
            se1.L(((b20) p29), v8_0, v15_2);
            if ((((b20) p29).S) || (!ni1.o(((b20) p29).L(), Integer.valueOf(v7_5)))) {
                ve2.v(v7_5, ((b20) p29), v7_5, v9_1);
            }
            se1.L(((b20) p29), v3_3, v4_9);
            int v4_12 = xx.a(new hh(1084227584, 1, new dh(0)), px2.r, ((b20) p29), 6);
            int v6_9 = p34.x(((b20) p29));
            m22 v10_7 = ((b20) p29).l();
            int v15_3 = jn.K(((b20) p29), v11_8);
            ((b20) p29).c0();
            if (!((b20) p29).S) {
                ((b20) p29).m0();
            } else {
                ((b20) p29).k(v12_0);
            }
            se1.L(((b20) p29), v13_1, v4_12);
            se1.L(((b20) p29), v8_0, v10_7);
            if ((((b20) p29).S) || (!ni1.o(((b20) p29).L(), Integer.valueOf(v6_9)))) {
                ve2.v(v6_9, ((b20) p29), v6_9, v9_1);
            }
            m22 v0_0;
            se1.L(((b20) p29), v3_3, v15_3);
            int v6_11 = v20;
            v7_11 = p23;
            sn.a(wb0.m(ix2.s(ac3.d(ac3.c(v11_8, 1061662228), 1090519040), v6_11.g2-0680j_4(v17_1.getXs-D9Ej5fM())), fx.b(p23, 1064011039), v5_8), ((b20) p29), 0);
            sn.a(wb0.m(ix2.s(ac3.d(ac3.c(v11_8, 1057971241), 1084227584), v6_11.g2-0680j_4(v17_1.getXs-D9Ej5fM())), fx.b(p23, 1057300152), v5_8), ((b20) p29), 0);
            sn.a(wb0.m(ix2.s(ac3.d(ac3.c(v11_8, 1054280253), 1084227584), v6_11.g2-0680j_4(v17_1.getXs-D9Ej5fM())), fx.b(p23, 1051595899), v5_8), ((b20) p29), 0);
            ((b20) p29).p(1);
            ((b20) p29).p(1);
            if (!p27) {
                v3_19 = ((b20) p29);
                v0_0 = 1;
                ((b20) p29).Y(-89529668);
                ((b20) p29).p(0);
            } else {
                ((b20) p29).Y(-90051491);
                int v5_10 = v18_0;
                v0_0 = 1;
                com.lele.llmonitor.ui.settings.SettingsScreenKt.AnimatedThemePaletteActiveRing-YlGCr2M(v19_0.b(), v14_2, p25, com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteActiveRingOuterStrokeWidth, com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteActiveRingInnerStrokeWidth, 1054280253, p26, ((b20) p29), (((v5_10 & 896) | 224256) | ((v5_10 << 9) & 3670016)), 0);
                v3_19 = ((b20) p29);
                ((b20) p29).p(0);
            }
            v3_19.p(v0_0);
            v3_19.p(v0_0);
            v10_13 = v28_1;
        }
        v93 v11_1 = v3_19.r();
        if (v11_1 != null) {
            v11_1.d = new o83(p21, v7_11, p25, p26, p27, v10_13, p30, p31);
        }
        return;
    }

    private static final bw3 ThemePalettePreviewBlock_1Kfb2uI$lambda$1(long p12, long p14, java.util.List p16, cg3 p17, boolean p18, m22 p19, int p20, int p21, t10 p22, int p23)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePalettePreviewBlock-1Kfb2uI(p12, p14, p16, p17, p18, p19, p22, vc1.b0((p20 | 1)), p21);
        return bw3.a;
    }

    public static synthetic bw3 U(s01 p0, int p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.DataManagementPage$lambda$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 U0(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$0$4$0(p0, p1);
    }

    public static synthetic bw3 U1(s01 p0, long p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$5$0$0(p0, p1);
    }

    public static synthetic bw3 U2(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$32$0$0(p0);
    }

    public static synthetic bw3 V(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$2$0$0(p0, p1);
    }

    public static synthetic bw3 V0(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$1$1$0(p0);
    }

    public static synthetic String V1(com.lele.llmonitor.data.AppLanguageOption p0, String p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$0$0(p0, p1);
    }

    public static synthetic bw3 V2(com.lele.llmonitor.ui.dashboard.BatteryViewModel p0, l52 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$28(p0, p1, p2, p3);
    }

    public static synthetic bw3 W(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$2$0$0(p0);
    }

    public static synthetic bw3 W0(hz1 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$0$0$1$0$0(p0);
    }

    public static synthetic bw3 W1(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$30$2(p0, p1, p2);
    }

    private static final void WallpaperThumbnailCard(float p17, s01 p18, i11 p19, t10 p20, int p21)
    {
        int v5_0;
        ((b20) p20).a0(-1968434495);
        if ((p21 & 6) != 0) {
            v5_0 = p21;
        } else {
            int v5_2;
            if (!((b20) p20).c(p17)) {
                v5_2 = 2;
            } else {
                v5_2 = 4;
            }
            v5_0 = (v5_2 | p21);
        }
        if ((p21 & 48) == 0) {
            xn v6_6;
            if (!((b20) p20).h(p18)) {
                v6_6 = 16;
            } else {
                v6_6 = 32;
            }
            v5_0 |= v6_6;
        }
        if ((p21 & 384) == 0) {
            xn v6_9;
            if (!((b20) p20).h(p19)) {
                v6_9 = 128;
            } else {
                v6_9 = 256;
            }
            v5_0 |= v6_9;
        }
        xn v6_11;
        if ((v5_0 & 147) == 146) {
            v6_11 = 0;
        } else {
            v6_11 = 1;
        }
        if (!((b20) p20).O((v5_0 & 1), v6_11)) {
            ((b20) p20).R();
        } else {
            xn v6_14 = com.lele.llmonitor.ui.theme.AppShapes.INSTANCE.g2-0680j_4(com.lele.llmonitor.ui.theme.AppCorners.INSTANCE.getLg-D9Ej5fM());
            boolean v10_4 = j22.a;
            xc v7_13 = ac3.m(v10_4, 1124335616);
            xc v11_1 = xx.a(n54.c, px2.s, ((b20) p20), 48);
            x71 v12_2 = p34.x(((b20) p20));
            xc v13_1 = ((b20) p20).l();
            xc v7_14 = jn.K(((b20) p20), v7_13);
            o10.b.getClass();
            q20 v14_1 = n10.b;
            ((b20) p20).c0();
            if (!((b20) p20).S) {
                ((b20) p20).m0();
            } else {
                ((b20) p20).k(v14_1);
            }
            xc v15_1 = n10.f;
            se1.L(((b20) p20), v15_1, v11_1);
            xc v11_2 = n10.e;
            se1.L(((b20) p20), v11_2, v13_1);
            xc v13_2 = n10.g;
            if ((((b20) p20).S) || (!ni1.o(((b20) p20).L(), Integer.valueOf(v12_2)))) {
                ve2.v(v12_2, ((b20) p20), v12_2, v13_2);
            }
            int v8_10 = n10.d;
            se1.L(((b20) p20), v8_10, v7_14);
            boolean v10_5 = ox.a;
            xc v16 = v8_10;
            xn v6_0 = tg1.h(wb0.m(ix2.s(r7.u(ac3.c(v10_4, 1065353216), p17), v6_14), ((mx) ((b20) p20).j(v10_5)).H, r7.f), 1065353216, new xe3(fx.b(((mx) ((b20) p20).j(v10_5)).B, 1060320051)), v6_14);
            if (p18 != null) {
                v6_0 = ix2.q(v6_0, p18);
            }
            xc v7_3 = sn.d(px2.f, 0);
            int v8_6 = p34.x(((b20) p20));
            Integer v9_0 = ((b20) p20).l();
            xn v6_1 = jn.K(((b20) p20), v6_0);
            ((b20) p20).c0();
            if (!((b20) p20).S) {
                ((b20) p20).m0();
            } else {
                ((b20) p20).k(v14_1);
            }
            se1.L(((b20) p20), v15_1, v7_3);
            se1.L(((b20) p20), v11_2, v9_0);
            if ((((b20) p20).S) || (!ni1.o(((b20) p20).L(), Integer.valueOf(v8_6)))) {
                ve2.v(v8_6, ((b20) p20), v8_6, v13_2);
            }
            se1.L(((b20) p20), v16, v6_1);
            p19.invoke(xn.a, ((b20) p20), Integer.valueOf((((v5_0 >> 3) & 112) | 6)));
            ((b20) p20).p(1);
            ((b20) p20).p(1);
        }
        at2 v4_0 = ((b20) p20).r();
        if (v4_0 != null) {
            v4_0.d = new l83(p17, p18, p19, p21);
        }
        return;
    }

    private static final bw3 WallpaperThumbnailCard$lambda$1(float p0, s01 p1, i11 p2, int p3, t10 p4, int p5)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.WallpaperThumbnailCard(p0, p1, p2, p4, vc1.b0((p3 | 1)));
        return bw3.a;
    }

    public static synthetic bw3 X(String p0, com.lele.llmonitor.data.AppLanguageOption p1, String p2, java.util.List p3, d11 p4, int p5, t10 p6, int p7)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$5(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    public static synthetic bw3 X0(boolean p0, cg3 p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2, d11 p3, c42 p4, l52 p5, cy p6, t10 p7, int p8)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$35(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public static synthetic rr0 X1(cd p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$3$0(p0);
    }

    public static synthetic bw3 Y(android.content.Context p0, ms1 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$3$0$0(p0, p1);
    }

    public static synthetic bw3 Y0(String p0, long p1, java.util.List p3, d11 p4, int p5, t10 p6, int p7)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$5(p0, p1, p3, p4, p5, p6, p7);
    }

    public static synthetic bw3 Y1(l52 p0, ms1 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$5$0$0(p0, p1);
    }

    public static synthetic bw3 Z(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$3$0$0(p0);
    }

    public static synthetic bw3 Z0(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$32$1$0$0$0(p0);
    }

    public static synthetic bw3 Z1(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$4$0$0(p0);
    }

    public static synthetic bw3 a(d11 p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$4(p0, p1, p2, p3);
    }

    public static synthetic bw3 a0(v72 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$0$0$0$0$0(p0);
    }

    public static synthetic bw3 a1(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$0$0$0(p0);
    }

    public static synthetic bw3 a2(android.content.Context p0, l52 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$4$0$0$0$0$0(p0, p1);
    }

    public static final synthetic void access$HistoryWallpaperDeleteButton(wn p0, s01 p1, t10 p2, int p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.HistoryWallpaperDeleteButton(p0, p1, p2, p3);
        return;
    }

    public static final synthetic void access$LLClassStyleAppearanceCard$lambda$10(c42 p0, float p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$10(p0, p1);
        return;
    }

    public static final synthetic boolean access$LLClassStyleAppearanceCard$lambda$12(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$12(p0);
    }

    public static final synthetic void access$LLClassStyleAppearanceCard$lambda$16(c42 p0, float p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$16(p0, p1);
        return;
    }

    public static final synthetic boolean access$LLClassStyleAppearanceCard$lambda$18(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$18(p0);
    }

    public static final synthetic void access$LLClassStyleAppearanceCard$lambda$22(c42 p0, float p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$22(p0, p1);
        return;
    }

    public static final synthetic boolean access$LLClassStyleAppearanceCard$lambda$24(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$24(p0);
    }

    public static final synthetic void access$LLClassStyleAppearanceCard$lambda$28(l52 p0, String p1)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$28(p0, p1);
        return;
    }

    public static final synthetic float access$LLClassStyleAppearanceCard$lambda$3(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$3(p0);
    }

    public static final synthetic float access$LLClassStyleAppearanceCard$lambda$4(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$4(p0);
    }

    public static final synthetic float access$LLClassStyleAppearanceCard$lambda$7(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$7(p0);
    }

    public static final synthetic void access$SettingsRouteContainer(d11 p0, t10 p1, int p2)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer(p0, p1, p2);
        return;
    }

    public static final synthetic void access$WallpaperThumbnailCard(float p0, s01 p1, i11 p2, t10 p3, int p4)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.WallpaperThumbnailCard(p0, p1, p2, p3, p4);
        return;
    }

    public static synthetic bw3 b(l52 p0, l52 p1, hy2 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$36(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 b0(j72 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2$0$0$0$2$0(p0);
    }

    public static synthetic bw3 b1(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$27$0(p0);
    }

    public static synthetic bw3 b2(android.content.Context p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$3$0$0$0(p0, p1, p2, p3);
    }

    private static final java.util.List blossomPreviewCardPalette(boolean p16)
    {
        if (!p16) {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963445, 4288889716);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294700788, 4287323512);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294504693, 4286342527);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963185, 4289679207);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294570484, 4287586682);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963444, 4288631407);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294832374, 4288699781);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294570742, 4286408573);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963184, 4289814130);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294636020, 4287850102);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963701, 4288502908);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_0, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294439669, 4285885050)}));
        } else {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282852915, 4294950614);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283051321, 4294032852);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282593338, 4292658386);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283180592, 4294948805);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282790202, 4293248467);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283639864, 4294951121);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282919992, 4293508817);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282396731, 4292331216);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283509556, 4294948799);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282986553, 4292788942);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283050553, 4294950359);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_1, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4282593337, 4292069840)}));
        }
    }

    private static final java.util.List buildDynamicPreviewCardPalette-TkvDFsM(long p4, long p6, long p8, boolean p10, int p11)
    {
        if (!p10) {
            if (p11 < 1) {
                p11 = 1;
            }
            int v4_7 = new fx(p4);
            new fx(jn.H(p4, p6, 1050924810));
            new fx(p6);
            new fx(jn.H(p6, p8, 1051595899));
            new fx(p8);
            int v4_2 = r7.M(new fx[] {v4_7, new fx(jn.H(p4, p8, 1054280253))}));
            java.util.ArrayList v5_2 = new java.util.ArrayList();
            int v4_3 = v4_2.iterator();
            int v6_2 = 0;
            while (v4_3.hasNext()) {
                com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v7_3 = v4_3.next();
                int v8_2 = (v6_2 + 1);
                if (v6_2 < 0) {
                    r7.e0();
                    throw 0;
                } else {
                    int v9_3;
                    long v0_3 = ((fx) v7_3).a;
                    com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v7_5 = (v6_2 % 2);
                    if (v7_5 != null) {
                        v9_3 = 1018444120;
                    } else {
                        v9_3 = -1133133169;
                    }
                    int v6_4;
                    if ((v6_2 % 3) != 0) {
                        v6_4 = 0;
                    } else {
                        v6_4 = -1136354394;
                    }
                    com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v7_6;
                    int v6_5 = com.lele.llmonitor.ui.settings.SettingsScreenKt.buildDynamicPreviewColorFromAnchor-Iv8Zu3U(v0_3, p10, v9_3, v6_4);
                    if (v7_5 != null) {
                        v7_6 = -1131187012;
                    } else {
                        v7_6 = 1023611503;
                    }
                    dx.m0(v5_2, r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v6_5, com.lele.llmonitor.ui.settings.SettingsScreenKt.buildDynamicPreviewColorFromAnchor-Iv8Zu3U(v0_3, p10, v7_6, -1127965786)})));
                    v6_2 = v8_2;
                }
            }
            return yw.S0(p11, v5_2);
        } else {
            return com.lele.llmonitor.ui.settings.SettingsScreenKt.buildLegacyDarkDynamicPreviewCardPalette-DxMtmZc(p4, p11);
        }
    }

    public static synthetic java.util.List buildDynamicPreviewCardPalette-TkvDFsM$default(long p9, long p11, long p13, boolean p15, int p16, int p17, Object p18)
    {
        int v8;
        if ((p17 & 16) == 0) {
            v8 = p16;
        } else {
            v8 = 12;
        }
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.buildDynamicPreviewCardPalette-TkvDFsM(p9, p11, p13, p15, v8);
    }

    private static final com.lele.llmonitor.ui.settings.ThemePalettePreviewColor buildDynamicPreviewColorFromAnchor-Iv8Zu3U(long p7, boolean p9, float p10, float p11)
    {
        float v0_3;
        float v0_1 = new float[3];
        android.graphics.Color.colorToHSV(jn.Q(p7), v0_1);
        float v1 = v0_1[0];
        com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v7_9 = v0_1[1];
        int v8_0 = 1051595899;
        if (p9 == 0) {
            v0_3 = (1048911544 + p11);
        } else {
            v0_3 = 1051595899;
        }
        float v2_0;
        if (p9 == 0) {
            v2_0 = 1028443341;
        } else {
            v2_0 = 1032805417;
        }
        float v3_0;
        if (p9 == 0) {
            v3_0 = 1041194025;
        } else {
            v3_0 = 1043878380;
        }
        float v0_6;
        float v2_1 = ib1.k((v0_3 * v7_9), v2_0, v3_0);
        if (p9 == 0) {
            v0_6 = (1064766013 + p10);
        } else {
            v0_6 = 1049582633;
        }
        float v3_1;
        if (p9 == 0) {
            v3_1 = 1063843267;
        } else {
            v3_1 = 1046562734;
        }
        if (p9 == 0) {
            v8_0 = 1065218998;
        }
        int v8_3;
        float v3_2 = ib1.k(v0_6, v3_1, v8_0);
        if (p9 == 0) {
            v8_3 = (1057971241 + (p11 * 1059481190));
        } else {
            v8_3 = 1058977874;
        }
        int v8_4;
        if (p9 == 0) {
            v8_4 = 1047904911;
        } else {
            v8_4 = 1045220557;
        }
        int v11_2;
        if (p9 == 0) {
            v11_2 = 1055622431;
        } else {
            v11_2 = 1054280253;
        }
        com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v7_6;
        float v5 = ib1.k((v7_9 * v8_3), v8_4, v11_2);
        if (p9 == 0) {
            v7_6 = (1050253722 - (p10 * 1057803469));
        } else {
            v7_6 = 1064346583;
        }
        int v8_5;
        if (p9 == 0) {
            v8_5 = 1045891645;
        } else {
            v8_5 = 1063507722;
        }
        int v9_1;
        if (p9 == 0) {
            v9_1 = 1051931443;
        } else {
            v9_1 = 1065185444;
        }
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.buildPreviewColor(v1, v2_1, v3_2, v1, v5, ib1.k(v7_6, v8_5, v9_1));
    }

    private static final java.util.List buildLegacyDarkDynamicPreviewCardPalette-DxMtmZc(long p10, int p12)
    {
        if (p12 < 1) {
            p12 = 1;
        }
        float v0_4 = new float[3];
        android.graphics.Color.colorToHSV(jn.Q(p10), v0_4);
        int v10_1 = 0;
        float v11 = v0_4[0];
        float v0_2 = (1135869952 / ((float) p12));
        java.util.ArrayList v2_1 = new java.util.ArrayList(p12);
        while (v10_1 < p12) {
            float v4 = (((((float) v10_1) * v0_2) + v11) % 1135869952);
            v2_1.add(com.lele.llmonitor.ui.settings.SettingsScreenKt.buildPreviewColor(v4, 1049582633, 1047904911, v4, 1058977874, 1064011039));
            v10_1++;
        }
        return v2_1;
    }

    private static final com.lele.llmonitor.ui.settings.ThemePalettePreviewColor buildPreviewColor(float p6, float p7, float p8, float p9, float p10, float p11)
    {
        long v1_0 = new float[3];
        v1_0[0] = p6;
        v1_0[1] = p7;
        v1_0[2] = p8;
        int v8_1 = android.graphics.Color.HSVToColor(v1_0);
        com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v0_1 = new float[3];
        v0_1[0] = p9;
        v0_1[1] = p10;
        v0_1[2] = p11;
        return new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor(jn.c(v8_1), jn.c(android.graphics.Color.HSVToColor(v0_1)), 0);
    }

    public static synthetic bw3 c(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$33$0$0(p0);
    }

    public static synthetic bw3 c0(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$2(p0, p1, p2);
    }

    public static synthetic bw3 c1(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$3$0$0$0$0$0(p0);
    }

    public static synthetic bw3 c2(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$2$0$0$0(p0);
    }

    private static final float contrastRatio--OWjLjI(long p0, long p2)
    {
        float v0_3 = (jn.I(p0) + 1028443341);
        float v2_2 = (jn.I(p2) + 1028443341);
        return (Math.max(v0_3, v2_2) / Math.min(v0_3, v2_2));
    }

    public static synthetic bw3 d(d11 p0, ms1 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer$lambda$0$0(p0, p1);
    }

    public static synthetic bw3 d0(l52 p0, c42 p1, float p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$35$2$0(p0, p1, p2);
    }

    public static synthetic bw3 d1(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$30$1$0$0$0(p0);
    }

    public static synthetic bw3 d2(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$31$1$0$0$0(p0);
    }

    public static synthetic bw3 e(String p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$1(p0, p1, p2);
    }

    public static synthetic bw3 e0(l52 p0, l52 p1, c42 p2, wn p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$0$0$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 e1(android.content.Context p0, j72 p1, h42 p2, pq1 p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2$0$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 e2(s01 p0, int p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$1(p0, p1, p2, p3);
    }

    private static final long ensureContainerBackgroundContrast-jxsXWHM(long p19, long p21, boolean p23)
    {
        int v0;
        if (!p23) {
            v0 = 1066863165;
        } else {
            v0 = 1068037571;
        }
        if (com.lele.llmonitor.ui.settings.SettingsScreenKt.contrastRatio--OWjLjI(p19, p21) < v0) {
            int v3_3;
            float[] v2 = new float[3];
            android.graphics.Color.colorToHSV(jn.Q(p19), v2);
            int v5_0 = 1;
            if (jn.I(p21) <= 1056964608) {
                v3_3 = 0;
            } else {
                v3_3 = 1;
            }
            float v6 = v2[1];
            float v8 = v2[2];
            int v12 = 1;
            float v11 = com.lele.llmonitor.ui.settings.SettingsScreenKt.contrastRatio--OWjLjI(p19, p21);
            long v9_1 = p19;
            while(true) {
                int v16_0;
                long v13_1 = (((float) v12) / 1094713344);
                float[] v14_1 = 1036831949;
                if (!p23) {
                    v16_0 = 1052938076;
                } else {
                    v16_0 = 1055286886;
                }
                long v13_2;
                int v16_1 = v5_0;
                int v5_1 = 0;
                int v4_2 = ib1.k(((v13_1 * 1036831949) + v6), 0, v16_0);
                if (v3_3 == 0) {
                    int v5_2;
                    if (!p23) {
                        v5_2 = 1039516303;
                    } else {
                        v5_2 = 1045220557;
                    }
                    v5_1 = ((v5_2 * v13_1) + v8);
                    v13_2 = 1065353216;
                    if (v5_1 > 1065353216) {
                        v5_1 = v13_2;
                    }
                } else {
                    if (!p23) {
                        v14_1 = 1047904911;
                    }
                    v13_2 = (v8 - (v14_1 * v13_1));
                    if (v13_2 >= 0) {
                    }
                }
                float[] v14_5 = new float[3];
                v14_5[0] = v2[0];
                v14_5[v16_1] = v4_2;
                v14_5[2] = v5_1;
                int v4_4 = jn.c(android.graphics.Color.HSVToColor(v14_5));
                float v15_2 = com.lele.llmonitor.ui.settings.SettingsScreenKt.contrastRatio--OWjLjI(v4_4, p21);
                if (v15_2 > v11) {
                    v9_1 = v4_4;
                    v11 = v15_2;
                }
                if (v15_2 < v0) {
                    if (v12 == 12) {
                        break;
                    }
                    v12++;
                    v5_0 = v16_1;
                } else {
                    return v4_4;
                }
            }
            return v9_1;
        } else {
            return p19;
        }
    }

    private static final long ensureContentContrast--OWjLjI(long p11, long p13)
    {
        if (com.lele.llmonitor.ui.settings.SettingsScreenKt.contrastRatio--OWjLjI(p11, p13) < 1083179008) {
            float v0_1;
            int v2_0 = 0;
            if (jn.I(p13) <= 1057300152) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            long v3_1;
            if (v0_1 == 0) {
                v3_1 = jn.d(4294375679);
            } else {
                v3_1 = jn.d(4279246896);
            }
            long v5;
            if (v0_1 == 0) {
                v5 = fx.c;
            } else {
                v5 = fx.b;
            }
            float v0_2 = com.lele.llmonitor.ui.settings.SettingsScreenKt.contrastRatio--OWjLjI(p11, p13);
            while (v2_0 < 9) {
                long v7_3 = jn.H(v3_1, v5, (((float) v2_0) / 1090519040));
                float v9_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.contrastRatio--OWjLjI(v7_3, p13);
                if (v9_0 > v0_2) {
                    p11 = v7_3;
                    v0_2 = v9_0;
                }
                if (v9_0 < 1083179008) {
                    v2_0++;
                } else {
                    return v7_3;
                }
            }
            return p11;
        } else {
            return p11;
        }
    }

    public static synthetic bw3 f(com.lele.llmonitor.data.AppLanguageOption p0, l52 p1, android.content.Context p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$2$0$0(p0, p1, p2);
    }

    public static synthetic bw3 f0(d11 p0, android.net.Uri p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$29$0(p0, p1);
    }

    public static synthetic bw3 f1(android.content.Context p0, l52 p1, pq1 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$4$0$0$0(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 f2(d11 p0, com.lele.llmonitor.data.FollowSystemAppIconMode p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34$1$0$0$0(p0, p1);
    }

    private static final com.lele.llmonitor.ui.settings.ThemePalettePreviewColor fixedPreviewColor(long p6, long p8)
    {
        return new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor(jn.d(p6), jn.d(p8), 0);
    }

    private static final java.util.List forestPreviewCardPalette(boolean p16)
    {
        if (!p16) {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293458161, 4279462474);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293982440, 4283132693);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293393144, 4279069543);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294244585, 4284376092);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293588974, 4280576847);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293981934, 4281885778);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293524210, 4279135315);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294244586, 4284376856);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293261295, 4279921492);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293588721, 4281557069);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293590007, 4279594083);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_0, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294310637, 4284576023)}));
        } else {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279778353, 4288669640);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280107312, 4289782413);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279712314, 4287489490);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280433962, 4290897562);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280038699, 4286898352);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280565302, 4290109890);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279975991, 4287555266);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280631856, 4291880347);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279712563, 4286571192);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280433460, 4289257660);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280238906, 4288014544);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_1, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280829231, 4291423147)}));
        }
    }

    public static synthetic bw3 g(android.content.Context p0, l52 p1, ms1 p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$4$0$0(p0, p1, p2);
    }

    public static synthetic rr0 g0(cd p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$1$0(p0);
    }

    public static synthetic bw3 g1(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0$0(p0, p1, p2);
    }

    public static synthetic bw3 g2(d11 p0, android.net.Uri p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0$0$4$0(p0, p1);
    }

    public static synthetic bw3 h(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$30$2$0$0(p0);
    }

    public static synthetic bw3 h0(s01 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.DataManagementPage$lambda$0$0$0(p0);
    }

    public static synthetic bw3 h1(com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34$1$0$1(p0, p1, p2);
    }

    public static synthetic Object h2(java.io.File p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$0$0$2(p0);
    }

    public static synthetic bw3 i(d11 p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 i0(String p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$1(p0, p1, p2);
    }

    public static synthetic bw3 i1(s01 p0, long p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$7$0$0(p0, p1);
    }

    public static synthetic bw3 i2(s01 p0, cy p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 j(String p0, boolean p1, s01 p2, j72 p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$34(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 j0(d11 p0, com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34$0$0$0$0(p0, p1);
    }

    public static synthetic bw3 j1(l52 p0, l52 p1, com.lele.llmonitor.data.FollowSystemAppIconMode p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0$0$1$0(p0, p1, p2);
    }

    public static synthetic bw3 j2(long p0, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$4$0$0(p0, p2, p3);
    }

    private static final java.util.List jiziPreviewCardPalette(boolean p16)
    {
        if (!p16) {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294439679, 4285223336);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294373631, 4286274491);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294111999, 4283852219);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294504958, 4286927774);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294046975, 4283263663);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294373631, 4285618352);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294243327, 4284375978);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294505215, 4287125929);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294111743, 4285226930);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293981439, 4283396282);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294439423, 4286273450);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_0, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294177535, 4284377004)}));
        } else {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280951864, 4292332543);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4281345866, 4292921343);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280494918, 4291416831);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4281608254, 4292789234);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280692810, 4290959359);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4281279812, 4292332031);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280823883, 4291351295);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4281608260, 4292986615);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4281018439, 4291873791);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280627789, 4290828543);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4281411136, 4292593907);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_1, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280888648, 4291481855)}));
        }
    }

    public static synthetic bw3 k(com.lele.llmonitor.data.FollowSystemAppIconMode p0, d11 p1, kb3 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 k0(String p0, l52 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$33$1$0$0(p0, p1);
    }

    public static synthetic bw3 k1(com.lele.llmonitor.ui.theme.ThemePalettePreset p0, boolean p1, cg3 p2, boolean p3, s01 p4, m22 p5, int p6, int p7, t10 p8, int p9)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteOptionCard$lambda$4(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic bw3 k2(long p0, String p2, l52 p3, java.util.List p4, d11 p5, zr0 p6, t10 p7, int p8)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4(p0, p2, p3, p4, p5, p6, p7, p8);
    }

    public static synthetic bw3 l(int p0, java.util.List p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 l0(boolean p0, d11 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem$lambda$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 l1(v72 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2$0$0$0$2$0$0(p0);
    }

    public static synthetic bw3 l2(l52 p0, pq1 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$5$0$0$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 m(com.lele.llmonitor.ui.theme.ThemePalettePreset p0, android.content.Context p1, l52 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$32$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 m0(com.lele.llmonitor.ui.theme.ThemePalettePreset p0, l52 p1, android.content.Context p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$32$1$0$0(p0, p1, p2);
    }

    public static synthetic bw3 m1(l52 p0, l52 p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0$0$2$0(p0, p1, p2);
    }

    public static synthetic bw3 m2(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$4$0$0(p0, p1);
    }

    public static synthetic bw3 n(d11 p0, hy2 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$2$1(p0, p1, p2, p3);
    }

    public static synthetic void n0()
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.restartAppAfterAppearanceChange$lambda$1$0();
        return;
    }

    public static synthetic void n1()
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.restartAppAfterAppearanceChange$lambda$1();
        return;
    }

    public static synthetic bw3 n2(l52 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$3$0(p0, p1);
    }

    private static final com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec normalizeForBackground-bw27NRU(com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec p3, long p4, boolean p6)
    {
        java.util.Iterator v0_0 = p3.getCardColors();
        java.util.ArrayList v1_1 = new java.util.ArrayList(zw.j0(v0_0, 10));
        java.util.Iterator v0_1 = v0_0.iterator();
        while (v0_1.hasNext()) {
            v1_1.add(com.lele.llmonitor.ui.settings.SettingsScreenKt.normalizePreviewCardColorForBackground-bw27NRU(((com.lele.llmonitor.ui.settings.ThemePalettePreviewColor) v0_1.next()), p4, p6));
        }
        return com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec.copy$default(p3, v1_1, 0, 2, 0);
    }

    private static final com.lele.llmonitor.ui.settings.ThemePalettePreviewColor normalizePreviewCardColorForBackground-bw27NRU(com.lele.llmonitor.ui.settings.ThemePalettePreviewColor p8, long p9, boolean p11)
    {
        long v3 = com.lele.llmonitor.ui.settings.SettingsScreenKt.ensureContainerBackgroundContrast-jxsXWHM(p8.getContainer-0d7_KjU(), p9, p11);
        return new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor(v3, com.lele.llmonitor.ui.settings.SettingsScreenKt.ensureContentContrast--OWjLjI(p8.getContent-0d7_KjU(), v3), 0);
    }

    public static synthetic bw3 o(l52 p0, c42 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$35$3$0(p0, p1);
    }

    public static synthetic bw3 o0(d11 p0, j72 p1, ad p2, l62 p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$0(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 o1(android.content.Context p0, j72 p1, h42 p2, ad p3, l62 p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$2(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 o2(com.lele.llmonitor.data.FollowSystemAppIconMode p0, android.content.Context p1, l52 p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$31$1(p0, p1, p2, p3, p4);
    }

    private static final java.util.List oceanPreviewCardPalette(boolean p16)
    {
        if (!p16) {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293326079, 4279061882);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293393407, 4278218120);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293523455, 4279331725);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293785851, 4281232251);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293458426, 4279591023);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293588727, 4281299588);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293130239, 4278217870);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293720570, 4282151296);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293457663, 4280967054);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293588987, 4281626762);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293393399, 4278217589);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_0, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4293851387, 4283070593)}));
        } else {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279646537, 4288601087);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279517256, 4287031295);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279582282, 4287027455);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279910727, 4289193197);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279711813, 4288407538);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279779657, 4287224040);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279321164, 4286571519);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280107080, 4288994536);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279451211, 4287290104);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279779405, 4288338160);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4279583301, 4287818214);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_1, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4280107850, 4290175465)}));
        }
    }

    private static final java.util.List orderForSpectrumPreview(java.util.List p12)
    {
        int v12_4 = yw.S0(4, p12);
        if (v12_4.size() > 2) {
            java.util.List v0_1 = new java.util.ArrayList(zw.j0(v12_4, 10));
            int v1_5 = v12_4.iterator();
            while(true) {
                int v3_0 = 0;
                if (!v1_5.hasNext()) {
                    break;
                }
                long v4_7 = ((fx) v1_5.next()).a;
                java.util.ArrayList v2_5 = new float[3];
                android.graphics.Color.colorToHSV(jn.Q(v4_7), v2_5);
                v0_1.add(new qh2(new fx(v4_7), Float.valueOf(v2_5[0])));
            }
            int v1_1;
            java.util.List v0_2 = yw.R0(v0_1, new com.lele.llmonitor.ui.settings.SettingsScreenKt$orderForSpectrumPreview$$inlined$sortedBy$1());
            int v1_10 = new fh1(0, (v0_2.size() - 1), 1).iterator();
            java.util.ArrayList v2_12 = ((eh1) v1_10);
            if (v2_12.f) {
                int v1_11 = ((yg1) v1_10);
                int v5_2 = v1_11.next();
                if (v2_12.f) {
                    fx v6_8 = ((Number) v5_2).intValue();
                    fx v6_18 = (((((Number) ((qh2) v0_2.get(((v6_8 + 1) % v0_2.size()))).e).floatValue() - ((Number) ((qh2) v0_2.get(v6_8)).e).floatValue()) + 1135869952) % 1135869952);
                    do {
                        boolean v8_1 = v1_11.next();
                        float v9_2 = ((Number) v8_1).intValue();
                        float v9_12 = (((((Number) ((qh2) v0_2.get(((v9_2 + 1) % v0_2.size()))).e).floatValue() - ((Number) ((qh2) v0_2.get(v9_2)).e).floatValue()) + 1135869952) % 1135869952);
                        if (Float.compare(v6_18, v9_12) < 0) {
                            v5_2 = v8_1;
                            v6_18 = v9_12;
                        }
                    } while(v2_12.f);
                }
                v1_1 = v5_2;
            } else {
                v1_1 = 0;
            }
            int v1_2 = ((Integer) v1_1);
            if (v1_2 != 0) {
                int v12_3 = ((v1_2.intValue() + 1) % v0_2.size());
                int v1_4 = v0_2.size();
                java.util.ArrayList v2_1 = new java.util.ArrayList(v1_4);
                while (v3_0 < v1_4) {
                    v2_1.add(new fx(((fx) ((qh2) v0_2.get(((v12_3 + v3_0) % v0_2.size()))).d).a));
                    v3_0++;
                }
                return v2_1;
            }
        }
        return v12_4;
    }

    public static synthetic bw3 p(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$6(p0, p1, p2);
    }

    public static synthetic bw3 p0(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$4(p0, p1, p2);
    }

    public static synthetic bw3 p1(l52 p0, l52 p1, l52 p2, l52 p3, d11 p4, l52 p5, l52 p6, l52 p7, l52 p8, pq1 p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0$0(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public static synthetic bw3 p2(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$5$0$0$0$0$0(p0);
    }

    public static synthetic bw3 q(com.lele.llmonitor.data.FollowSystemAppIconMode p0, l52 p1, android.content.Context p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$31$1$0$0(p0, p1, p2);
    }

    public static synthetic void q0(android.content.Context p0, l52 p1, yt1 p2, mt1 p3)
    {
        com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$26$0$0(p0, p1, p2, p3);
        return;
    }

    public static synthetic bw3 q1(boolean p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$0$1(p0, p1, p2);
    }

    public static synthetic bw3 q2(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$1$0(p0);
    }

    public static synthetic bw3 r(s01 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$3(p0, p1, p2);
    }

    public static synthetic vp0 r0(cd p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$2$0(p0);
    }

    public static synthetic bw3 r1(l52 p0, l52 p1, l52 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0$0$0$0(p0, p1, p2, p3);
    }

    public static synthetic bw3 r2(l52 p0, l52 p1, l52 p2, l52 p3, d11 p4, l52 p5, l52 p6, l52 p7, l52 p8, ms1 p9)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$4$0$1$0$0(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    private static final String resolveThemePaletteLabel(com.lele.llmonitor.ui.theme.ThemePalettePreset p1)
    {
        switch (com.lele.llmonitor.ui.settings.SettingsScreenKt$WhenMappings.$EnumSwitchMapping$0[p1.ordinal()]) {
            case 1:
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u52a8\u6001\u591a\u5f69");
            case 2:
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6ca7\u84dd");
            case 3:
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u677e\u9752");
            case 4:
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u66db\u6a59");
            case 5:
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6a31\u972d");
            case 6:
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u9701\u7d2b");
            default:
                h.b();
                return 0;
        }
    }

    private static final com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec resolveThemePalettePreviewSpec(com.lele.llmonitor.ui.theme.ThemePalettePreset p12, mx p13, boolean p14)
    {
        long v0_1;
        if (p14 == null) {
            v0_1 = jn.H(p13.p, p13.n, 1055286886);
        } else {
            v0_1 = jn.H(p13.p, p13.n, 1051931443);
        }
        com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec v12_1;
        java.util.List v8;
        switch (com.lele.llmonitor.ui.settings.SettingsScreenKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()]) {
            case 1:
                v8 = p14;
                v12_1 = new com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec(com.lele.llmonitor.ui.settings.SettingsScreenKt.buildDynamicPreviewCardPalette-TkvDFsM$default(p13.a, p13.f, p13.j, p14, 0, 16, 0), r7.M(new fx[] {new fx(jn.d(4282549748)), new fx(jn.d(4293542709)), new fx(jn.d(4294687748)), new fx(jn.d(4281641043))})));
                break;
            case 2:
                java.util.List v2_60;
                java.util.List v13_4 = com.lele.llmonitor.ui.settings.SettingsScreenKt.oceanPreviewCardPalette(p14);
                if (p14 == null) {
                    v2_60 = r7.M(new fx[] {new fx(jn.d(4286442239)), new fx(jn.d(4279815423)), new fx(jn.d(4278220771)), new fx(jn.d(4281490376))}));
                } else {
                    v2_60 = r7.M(new fx[] {new fx(jn.d(4288016895)), new fx(jn.d(4282898431)), new fx(jn.d(4279541503)), new fx(jn.d(4284184048))}));
                }
                v12_1 = new com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec(v13_4, v2_60);
                v8 = p14;
                break;
            case 3:
                java.util.List v2_39;
                java.util.List v13_2 = com.lele.llmonitor.ui.settings.SettingsScreenKt.forestPreviewCardPalette(p14);
                if (p14 == null) {
                    v2_39 = r7.M(new fx[] {new fx(jn.d(4287356576)), new fx(jn.d(4281316202)), new fx(jn.d(4281301566)), new fx(jn.d(4288326201))}));
                } else {
                    v2_39 = r7.M(new fx[] {new fx(jn.d(4289258931)), new fx(jn.d(4284732797)), new fx(jn.d(4282757722)), new fx(jn.d(4290299228))}));
                }
                v12_1 = new com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec(v13_2, v2_39);
                break;
            case 4:
                java.util.List v2_18;
                java.util.List v13_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.sunsetPreviewCardPalette(p14);
                if (p14 == null) {
                    v2_18 = r7.M(new fx[] {new fx(jn.d(4294956682)), new fx(jn.d(4294944585)), new fx(jn.d(4294011195)), new fx(jn.d(4291000611))}));
                } else {
                    v2_18 = r7.M(new fx[] {new fx(jn.d(4294959265)), new fx(jn.d(4294949479)), new fx(jn.d(4294933840)), new fx(jn.d(4291856944))}));
                }
                v12_1 = new com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec(v13_1, v2_18);
                break;
            case 5:
                java.util.List v2_8;
                java.util.List v13_6 = com.lele.llmonitor.ui.settings.SettingsScreenKt.blossomPreviewCardPalette(p14);
                if (p14 == null) {
                    v2_8 = r7.M(new fx[] {new fx(jn.d(4294952152)), new fx(jn.d(4294936503)), new fx(jn.d(4292496774)), new fx(jn.d(4289293751))}));
                } else {
                    v2_8 = r7.M(new fx[] {new fx(jn.d(4294956258)), new fx(jn.d(4294944202)), new fx(jn.d(4293879706)), new fx(jn.d(4290215877))}));
                }
                v12_1 = new com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec(v13_6, v2_8);
                break;
            case 6:
                java.util.List v2_85;
                java.util.List v13_3 = com.lele.llmonitor.ui.settings.SettingsScreenKt.jiziPreviewCardPalette(p14);
                if (p14 == null) {
                    v2_85 = r7.M(new fx[] {new fx(jn.d(4292463615)), new fx(jn.d(4290487295)), new fx(jn.d(4287329023)), new fx(jn.d(4284312025))}));
                } else {
                    v2_85 = r7.M(new fx[] {new fx(jn.d(4293254143)), new fx(jn.d(4291672063)), new fx(jn.d(4288708095)), new fx(jn.d(4285891327))}));
                }
                v12_1 = new com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec(v13_3, v2_85);
                break;
            default:
                h.b();
                return 0;
        }
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.normalizeForBackground-bw27NRU(v12_1, v0_1, v8);
    }

    private static final void restartAppAfterAppearanceChange(android.content.Context p3)
    {
        android.os.Handler v3_1;
        if (!(p3 instanceof android.app.Activity)) {
            v3_1 = 0;
        } else {
            v3_1 = ((android.app.Activity) p3);
        }
        if (v3_1 != null) {
            m6 v0_5 = new android.content.Intent(v3_1, com.lele.llmonitor.ui.settings.AppearanceRestartActivity);
            v0_5.addFlags(268435456);
            v0_5.putExtra("appearance_restart_source_task_id", v3_1.getTaskId());
            v0_5.putExtra("appearance_restart_source_pid", android.os.Process.myPid());
            v3_1.startActivity(v0_5);
            v3_1.finishAndRemoveTask();
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new m6(2));
            return;
        } else {
            return;
        }
    }

    private static final void restartAppAfterAppearanceChange$lambda$1()
    {
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new m6(3), 300);
        return;
    }

    private static final void restartAppAfterAppearanceChange$lambda$1$0()
    {
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    public static synthetic bw3 s(s01 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$0$0$0(p0);
    }

    public static synthetic vp0 s0(cd p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$35$0$0(p0);
    }

    public static synthetic bw3 s1(s01 p0, long p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$5$1$0(p0, p1);
    }

    public static synthetic bw3 s2(d11 p0, long p1, l52 p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$4$0$1$0(p0, p1, p3);
    }

    private static final String settingsTitleForRoute(String p3)
    {
        if ((p3 == null) || (oh3.j0(p3, "open_source_license_detail/", 0) != 1)) {
            if ((p3 == null) || (oh3.j0(p3, "home_wallpaper_crop", 0) != 1)) {
                if (p3 != null) {
                    switch (p3.hashCode()) {
                        case -1837182463:
                            if (p3.equals("settings/important_notice")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u91cd\u8981\u63d0\u793a");
                            }
                        case -921834032:
                            if (p3.equals("settings/appearance")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5916\u89c2\u8bbe\u7f6e");
                            }
                        case -648961514:
                            if (p3.equals("settings/data")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u6570\u636e\u7ba1\u7406");
                            }
                        case -430163557:
                            if (p3.equals("settings/system")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u7cfb\u7edf\u4e0e\u8bca\u65ad");
                            }
                        case 1074553857:
                            if (p3.equals("open_source_licenses")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5f00\u6e90\u8bb8\u53ef");
                            }
                        case 1354284705:
                            if (p3.equals("settings/about")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u5173\u4e8e");
                            }
                        case 1365475924:
                            if (p3.equals("settings/hardware")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u786c\u4ef6\u4fee\u6b63");
                            }
                        case 1370928032:
                            if (p3.equals("settings/scene")) {
                                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u573a\u666f\u8bbe\u7f6e");
                            }
                        default:
                    }
                }
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u8bbe\u7f6e");
            } else {
                return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u88c1\u5207\u58c1\u7eb8");
            }
        } else {
            return com.lele.llmonitor.i18n.TextI18nKt.l10n("\u8bb8\u53ef\u8be6\u60c5");
        }
    }

    private static final java.util.List sunsetPreviewCardPalette(boolean p16)
    {
        if (!p16) {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_0 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963431, 4287250716);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963175, 4288435754);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294964448, 4288371200);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963688, 4288374338);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963940, 4287975698);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294962917, 4289026865);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963434, 4287515439);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294964702, 4287913990);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963689, 4288176965);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963944, 4287383588);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294963175, 4288301092);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_0, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4294964201, 4288965444)}));
        } else {
            com.lele.llmonitor.ui.settings.ThemePalettePreviewColor v4_1 = com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283049756, 4294952868);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283116062, 4294949525);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283247639, 4294954893);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283248420, 4294951070);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283773211, 4294952081);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283115807, 4294947983);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283050784, 4294951081);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283642653, 4294954885);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283314214, 4294949786);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283050522, 4294951840);
            com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283445026, 4294948493);
            return r7.M(new com.lele.llmonitor.ui.settings.ThemePalettePreviewColor[] {v4_1, com.lele.llmonitor.ui.settings.SettingsScreenKt.fixedPreviewColor(4283707687, 4294952358)}));
        }
    }

    public static synthetic gl0 t(java.util.List p0, v93 p1, float p2, float p3, float p4, cg3 p5, rr p6)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.AnimatedThemePaletteActiveRing_YlGCr2M$lambda$1$0(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 t0(v93 p0, mx p1, boolean p2, long p3, com.lele.llmonitor.ui.theme.ThemePalettePreset p5, java.util.List p6, com.lele.llmonitor.ui.settings.ThemePalettePreviewSpec p7, cg3 p8, cy p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.ThemePaletteOptionCard$lambda$3(p0, p1, p2, p3, p5, p6, p7, p8, p9, p10, p11);
    }

    public static synthetic bw3 t1(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSettingsCard$lambda$0$2$0(p0, p1);
    }

    public static synthetic bw3 t2(int p0, d11 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 u(s01 p0, boolean p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$6$0$0(p0, p1);
    }

    public static synthetic bw3 u0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$30$0$0(p0);
    }

    public static synthetic bw3 u1(d11 p0, hy2 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$3$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 u2(s01 p0, boolean p1, cy p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$0(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 v(d11 p0, com.lele.llmonitor.ui.theme.ThemePalettePreset p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$35$0$0$0$0$0$0(p0, p1);
    }

    public static synthetic bw3 v0(s01 p0, int p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.HardwareSettingsPage$lambda$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 v1(s01 p0, long p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SceneSettingsPage$lambda$0$0$5$2$0(p0, p1);
    }

    public static synthetic bw3 v2(com.lele.llmonitor.data.AppLanguageOption p0, android.content.Context p1, l52 p2, d11 p3, t10 p4, int p5)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsScreen$lambda$33$2(p0, p1, p2, p3, p4, p5);
    }

    public static synthetic bw3 w(boolean p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$0$4(p0, p1, p2);
    }

    public static synthetic bw3 w0(m22 p0, v93 p1, java.util.List p2, float p3, float p4, float p5, cg3 p6, int p7, int p8, t10 p9, int p10)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.AnimatedThemePaletteActiveRing_YlGCr2M$lambda$2(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public static synthetic bw3 w1(String p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$4$0$0(p0, p1, p2);
    }

    public static synthetic bw3 w2(java.util.List p0, d11 p1, com.lele.llmonitor.data.AppLanguageOption p2, l52 p3, cy p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$4(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 x(l52 p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LanguageSelectorItem$lambda$4$2(p0, p1, p2);
    }

    public static synthetic bw3 x0(int p0, d11 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsRouteContainer$lambda$1(p1, p0, p2, p3);
    }

    public static synthetic bw3 x1(boolean p0, s01 p1, int p2, t10 p3, int p4)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$1(p0, p1, p2, p3, p4);
    }

    public static synthetic bw3 x2(int p0, com.lele.llmonitor.data.FollowSystemAppIconMode p1, com.lele.llmonitor.data.AppLanguageOption p2, com.lele.llmonitor.ui.theme.ThemePalettePreset p3, d11 p4, d11 p5, d11 p6, d11 p7, d11 p8, int p9, t10 p10, int p11)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$39(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public static synthetic bw3 y(boolean p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SystemSettingsPage$lambda$0$2(p0, p1, p2);
    }

    public static synthetic bw3 y0(com.lele.llmonitor.data.AppLanguageOption p0, String p1, java.util.List p2, d11 p3, cy p4, t10 p5, int p6)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$38(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic bw3 y1(String p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.NotificationContentSwitchItem$lambda$0(p0, p1, p2);
    }

    public static synthetic bw3 y2(d11 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.SettingsHomePage$lambda$1$0$0(p0);
    }

    public static synthetic bw3 z(com.lele.llmonitor.ui.settings.SettingsScreenKt$LLClassStyleAppearanceCard$ThemeOption p0, t10 p1, int p2)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$34$0$0$1(p0, p1, p2);
    }

    public static synthetic bw3 z0(l52 p0)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.FrequencySelectorItem$lambda$4$3$0(p0);
    }

    public static synthetic bw3 z1(String p0, l52 p1, t10 p2, int p3)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$33$1(p0, p1, p2, p3);
    }

    public static synthetic bw3 z2(l52 p0, c42 p1)
    {
        return com.lele.llmonitor.ui.settings.SettingsScreenKt.LLClassStyleAppearanceCard$lambda$37$3$0(p0, p1);
    }
}
