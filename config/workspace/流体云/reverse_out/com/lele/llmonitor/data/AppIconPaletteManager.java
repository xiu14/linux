package com.lele.llmonitor.data;
public final class AppIconPaletteManager {
    public static final int $stable;
    public static final com.lele.llmonitor.data.AppIconPaletteManager INSTANCE;

    static AppIconPaletteManager()
    {
        com.lele.llmonitor.data.AppIconPaletteManager.INSTANCE = new com.lele.llmonitor.data.AppIconPaletteManager();
        return;
    }

    private AppIconPaletteManager()
    {
        return;
    }

    public static synthetic z53 a(com.lele.llmonitor.data.AppIconPalette p0)
    {
        return com.lele.llmonitor.data.AppIconPaletteManager.resolveCurrentEnabledAlias$lambda$0(p0);
    }

    private static final z53 resolveCurrentEnabledAlias$lambda$0(com.lele.llmonitor.data.AppIconPalette p3)
    {
        p3.getClass();
        return new bu0(wh.R(new String[] {p3.getAliasClassName(), p3.getDarkAliasClassName()})), 0, new yz2(28));
    }

    public static synthetic void sync$default(com.lele.llmonitor.data.AppIconPaletteManager p0, android.content.Context p1, boolean p2, com.lele.llmonitor.ui.theme.ThemePalettePreset p3, boolean p4, int p5, Object p6)
    {
        if ((p5 & 8) != 0) {
            p4 = 1;
        }
        p0.sync(p1, p2, p3, p4);
        return;
    }

    public final boolean isLauncherAliasClassName(String p4)
    {
        this = 0;
        if (p4 != null) {
            java.util.Iterator v0_0 = com.lele.llmonitor.data.AppIconPalette.getEntries();
            if ((v0_0 == null) || (!v0_0.isEmpty())) {
                java.util.Iterator v0_1 = v0_0.iterator();
                while (v0_1.hasNext()) {
                    boolean v1_2 = ((com.lele.llmonitor.data.AppIconPalette) v0_1.next());
                    if ((ni1.o(v1_2.getAliasClassName(), p4)) || (ni1.o(v1_2.getDarkAliasClassName(), p4))) {
                        this = 1;
                        break;
                    }
                }
                return this;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public final String resolveCurrentEnabledAlias(android.content.Context p6)
    {
        p6.getClass();
        this = p6.getPackageManager();
        au0 v0_3 = com.lele.llmonitor.data.AppIconPalette.getEntries();
        v0_3.getClass();
        au0 v0_2 = new au0(new xu0(new yh(1, v0_3), new com.lele.llmonitor.data.a(), d63.d));
        while (v0_2.hasNext()) {
            String v1_1 = v0_2.next();
            if (this.getComponentEnabledSetting(new android.content.ComponentName(p6, ((String) v1_1))) == 1) {
            }
            return ((String) v1_1);
        }
        v1_1 = 0;
        return ((String) v1_1);
    }

    public final String resolveExpectedAlias(int p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2, com.lele.llmonitor.data.FollowSystemAppIconMode p3)
    {
        p2.getClass();
        p3.getClass();
        return com.lele.llmonitor.data.AppIconPaletteManagerKt.access$toAppIconPalette(p2).resolveAliasClassName(com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(p1, p3));
    }

    public final String resolveExpectedAlias(boolean p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2)
    {
        p2.getClass();
        return com.lele.llmonitor.data.AppIconPaletteManagerKt.access$toAppIconPalette(p2).resolveAliasClassName(p1);
    }

    public final int resolveExpectedForegroundIconRes(int p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2, com.lele.llmonitor.data.FollowSystemAppIconMode p3)
    {
        p2.getClass();
        p3.getClass();
        return com.lele.llmonitor.data.AppIconPaletteManagerKt.access$toAppIconPalette(p2).resolveForegroundRes(com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(p1, p3));
    }

    public final void sync(android.content.Context p8, int p9, com.lele.llmonitor.ui.theme.ThemePalettePreset p10, com.lele.llmonitor.data.FollowSystemAppIconMode p11)
    {
        p8.getClass();
        p10.getClass();
        p11.getClass();
        com.lele.llmonitor.data.AppIconPaletteManager.sync$default(this, p8, com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(p9, p11), p10, 0, 8, 0);
        return;
    }

    public final void sync(android.content.Context p8, boolean p9, com.lele.llmonitor.ui.theme.ThemePalettePreset p10, boolean p11)
    {
        p8.getClass();
        p10.getClass();
        com.lele.llmonitor.data.AppIconPaletteManagerKt.applyAppIconPalette$default(p8, com.lele.llmonitor.data.AppIconPaletteManagerKt.access$toAppIconPalette(p10), p9, 0, p11, 8, 0);
        return;
    }

    public final void syncOnAppStart(android.content.Context p8, int p9, com.lele.llmonitor.ui.theme.ThemePalettePreset p10, com.lele.llmonitor.data.FollowSystemAppIconMode p11)
    {
        p8.getClass();
        p10.getClass();
        p11.getClass();
        com.lele.llmonitor.data.AppIconPaletteManagerKt.applyAppIconPalette$default(p8, com.lele.llmonitor.data.AppIconPaletteManagerKt.access$toAppIconPalette(p10), com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(p9, p11), 0, 0, 8, 0);
        return;
    }
}
