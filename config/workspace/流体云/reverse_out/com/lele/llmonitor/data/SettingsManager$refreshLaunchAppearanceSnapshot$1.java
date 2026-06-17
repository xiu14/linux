package com.lele.llmonitor.data;
final class SettingsManager$refreshLaunchAppearanceSnapshot$1 extends jj3 implements h11 {
    final synthetic com.lele.llmonitor.data.LaunchAppearanceSnapshot $baseSnapshot;
    final synthetic android.content.Context $context;
    final synthetic long $generation;
    final synthetic com.lele.llmonitor.data.LaunchAppearanceSnapshot $immediateSnapshot;
    final synthetic android.content.SharedPreferences $sharedPrefs;
    final synthetic float $wallpaperAlpha;
    final synthetic float $wallpaperBlur;
    final synthetic long $wallpaperVersion;
    Object L$0;
    boolean Z$0;
    int label;

    public SettingsManager$refreshLaunchAppearanceSnapshot$1(android.content.Context p1, com.lele.llmonitor.data.LaunchAppearanceSnapshot p2, float p3, float p4, long p5, com.lele.llmonitor.data.LaunchAppearanceSnapshot p7, long p8, android.content.SharedPreferences p10, n60 p11)
    {
        this.$context = p1;
        this.$baseSnapshot = p2;
        this.$wallpaperAlpha = p3;
        this.$wallpaperBlur = p4;
        this.$generation = p5;
        this.$immediateSnapshot = p7;
        this.$wallpaperVersion = p8;
        this.$sharedPrefs = p10;
        super(2, p11);
        return;
    }

    public final n60 create(Object p13, n60 p14)
    {
        return new com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1(this.$context, this.$baseSnapshot, this.$wallpaperAlpha, this.$wallpaperBlur, this.$generation, this.$immediateSnapshot, this.$wallpaperVersion, this.$sharedPrefs, p14);
    }

    public final Object invoke(d80 p1, n60 p2)
    {
        return ((com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1) this.create(p1, p2)).invokeSuspend(bw3.a);
    }

    public bridge synthetic Object invoke(Object p1, Object p2)
    {
        return this.invoke(((d80) p1), ((n60) p2));
    }

    public final Object invokeSuspend(Object p25)
    {
        com.lele.llmonitor.data.LaunchAppearanceSnapshot v0_5;
        com.lele.llmonitor.data.LaunchAppearanceSnapshot v0_1;
        com.lele.llmonitor.data.LaunchAppearanceSnapshot v0_0 = this.label;
        bw3 v7 = bw3.a;
        e80 v9 = e80.d;
        if (v0_0 == null) {
            ib1.Q(p25);
            i51 v2_1 = this.$baseSnapshot.getBackgroundArgb();
            com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1$1 v3_2 = this.$wallpaperAlpha;
            long v10_0 = this.$context;
            float v4_1 = this.$wallpaperBlur;
            this.label = 1;
            v0_1 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.refreshStartupPreview(v10_0, v2_1, v3_2, v4_1, this);
            if (v0_1 != v9) {
                com.lele.llmonitor.data.LaunchAppearanceSnapshot v0_3 = ((Boolean) v0_1).booleanValue();
                if (this.$generation == com.lele.llmonitor.data.SettingsManager.access$getLaunchSnapshotRefreshGeneration$p()) {
                    com.lele.llmonitor.data.LaunchAppearanceSnapshot v1_3;
                    if (v0_3 == null) {
                        v1_3 = 0;
                    } else {
                        v1_3 = this.$wallpaperVersion;
                    }
                    com.lele.llmonitor.data.LaunchAppearanceSnapshot v1_5 = com.lele.llmonitor.data.LaunchAppearanceSnapshot.copy$default(this.$immediateSnapshot, 0, 0, 0, 0, 0, 0, 0, v1_3, 0, 383, 0);
                    com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1$1 v3_5 = new com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1$1(this.$generation, v1_5, 0);
                    this.L$0 = v1_5;
                    this.Z$0 = v0_3;
                    this.label = 2;
                    if (xt3.k0(zy1.a.i, v3_5, this) != v9) {
                        v0_5 = v1_5;
                    } else {
                        return v9;
                    }
                } else {
                    return v7;
                }
            }
        } else {
            if (v0_0 == 1) {
                ib1.Q(p25);
                v0_1 = p25;
            } else {
                if (v0_0 != 2) {
                    h.m("call to \'resume\' before \'invoke\' with coroutine");
                    return 0;
                } else {
                    v0_5 = ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) this.L$0);
                    ib1.Q(p25);
                }
            }
        }
        com.lele.llmonitor.data.LaunchAppearanceSnapshotKt.persistLaunchAppearanceSnapshot(this.$sharedPrefs, v0_5);
        return v7;
    }
}
