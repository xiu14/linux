package com.lele.llmonitor.data;
final enum class AppIconPalette extends java.lang.Enum {
    private static final synthetic dq0 $ENTRIES;
    private static final synthetic com.lele.llmonitor.data.AppIconPalette[] $VALUES;
    public static final enum com.lele.llmonitor.data.AppIconPalette BLOSSOM;
    public static final enum com.lele.llmonitor.data.AppIconPalette DYNAMIC;
    public static final enum com.lele.llmonitor.data.AppIconPalette FOREST;
    public static final enum com.lele.llmonitor.data.AppIconPalette JIZI;
    public static final enum com.lele.llmonitor.data.AppIconPalette OCEAN;
    public static final enum com.lele.llmonitor.data.AppIconPalette SUNSET;
    private final int accentNameRes;
    private final String aliasClassName;
    private final String darkAliasClassName;
    private final int notificationDarkForegroundRes;
    private final int notificationForegroundRes;
    private final String preferenceValue;
    private final int previewAdaptiveIconRes;
    private final long previewBackgroundColor;
    private final long previewDarkBackgroundColor;
    private final int previewDarkForegroundRes;
    private final int previewForegroundRes;
    private final long previewGlyphColor;
    private final long previewRingColor;

    private static final synthetic com.lele.llmonitor.data.AppIconPalette[] $values()
    {
        com.lele.llmonitor.data.AppIconPalette v2 = com.lele.llmonitor.data.AppIconPalette.SUNSET;
        com.lele.llmonitor.data.AppIconPalette v4 = com.lele.llmonitor.data.AppIconPalette.JIZI;
        return new com.lele.llmonitor.data.AppIconPalette[] {com.lele.llmonitor.data.AppIconPalette.OCEAN, com.lele.llmonitor.data.AppIconPalette.DYNAMIC});
    }

    static AppIconPalette()
    {
        com.lele.llmonitor.data.AppIconPalette.OCEAN = new com.lele.llmonitor.data.AppIconPalette("OCEAN", 0, "a", com.lele.llmonitor.R$string.app_icon_palette_ocean, jn.d(4290767359), jn.d(4279190102), jn.d(4279724935), jn.d(4278198058), com.lele.llmonitor.R$drawable.ic_launcher_palette_a_foreground, com.lele.llmonitor.R$drawable.ic_launcher_palette_a_dark_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_a_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_a_dark_foreground, com.lele.llmonitor.R$mipmap.ic_launcher_a, "com.lele.llmonitor.LauncherAliasA", "com.lele.llmonitor.LauncherAliasADark");
        com.lele.llmonitor.data.AppIconPalette.FOREST = new com.lele.llmonitor.data.AppIconPalette("FOREST", 1, "b", com.lele.llmonitor.R$string.app_icon_palette_forest, jn.d(4290376401), jn.d(4279782710), jn.d(4281170517), jn.d(4278198547), com.lele.llmonitor.R$drawable.ic_launcher_palette_b_foreground, com.lele.llmonitor.R$drawable.ic_launcher_palette_b_dark_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_b_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_b_dark_foreground, com.lele.llmonitor.R$mipmap.ic_launcher_b, "com.lele.llmonitor.LauncherAliasB", "com.lele.llmonitor.LauncherAliasBDark");
        com.lele.llmonitor.data.AppIconPalette.SUNSET = new com.lele.llmonitor.data.AppIconPalette("SUNSET", 2, "c", com.lele.llmonitor.R$string.app_icon_palette_sunset, jn.d(4294958276), jn.d(4285543680), jn.d(4288498710), jn.d(4281275392), com.lele.llmonitor.R$drawable.ic_launcher_palette_c_foreground, com.lele.llmonitor.R$drawable.ic_launcher_palette_c_dark_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_c_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_c_dark_foreground, com.lele.llmonitor.R$mipmap.ic_launcher_c, "com.lele.llmonitor.LauncherAliasC", "com.lele.llmonitor.LauncherAliasCDark");
        com.lele.llmonitor.data.AppIconPalette.BLOSSOM = new com.lele.llmonitor.data.AppIconPalette("BLOSSOM", 3, "d", com.lele.llmonitor.R$string.app_icon_palette_blossom, jn.d(4294957543), jn.d(4286195793), jn.d(4288693618), jn.d(4281663518), com.lele.llmonitor.R$drawable.ic_launcher_palette_d_foreground, com.lele.llmonitor.R$drawable.ic_launcher_palette_d_dark_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_d_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_d_dark_foreground, com.lele.llmonitor.R$mipmap.ic_launcher_d, "com.lele.llmonitor.LauncherAliasD", "com.lele.llmonitor.LauncherAliasDDark");
        com.lele.llmonitor.data.AppIconPalette.JIZI = new com.lele.llmonitor.data.AppIconPalette("JIZI", 4, "e", com.lele.llmonitor.R$string.app_icon_palette_jizi, jn.d(4293647871), jn.d(4283185528), jn.d(4285682360), jn.d(4280815693), com.lele.llmonitor.R$drawable.ic_launcher_palette_e_foreground, com.lele.llmonitor.R$drawable.ic_launcher_palette_e_dark_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_e_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_e_dark_foreground, com.lele.llmonitor.R$mipmap.ic_launcher_e, "com.lele.llmonitor.LauncherAliasE", "com.lele.llmonitor.LauncherAliasEDark");
        com.lele.llmonitor.data.AppIconPalette.DYNAMIC = new com.lele.llmonitor.data.AppIconPalette("DYNAMIC", 5, "f", com.lele.llmonitor.R$string.app_icon_palette_dynamic_multicolor, jn.d(4294178555), jn.d(4279705651), jn.d(4282549748), jn.d(4282549748), com.lele.llmonitor.R$drawable.ic_launcher_palette_f_foreground, com.lele.llmonitor.R$drawable.ic_launcher_palette_f_dark_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_f_foreground, com.lele.llmonitor.R$drawable.ic_notification_app_icon_f_dark_foreground, com.lele.llmonitor.R$mipmap.ic_launcher_f, "com.lele.llmonitor.LauncherAliasF", "com.lele.llmonitor.LauncherAliasFDark");
        eq0 v0_8 = com.lele.llmonitor.data.AppIconPalette.$values();
        com.lele.llmonitor.data.AppIconPalette.$VALUES = v0_8;
        com.lele.llmonitor.data.AppIconPalette.$ENTRIES = wm1.Y(v0_8);
        return;
    }

    private AppIconPalette(String p1, int p2, String p3, int p4, long p5, long p7, long p9, long p11, int p13, int p14, int p15, int p16, int p17, String p18, String p19)
    {
        com.lele.llmonitor.data.AppIconPalette v0_1 = super(p1, p2);
        v0_1.preferenceValue = p3;
        v0_1.accentNameRes = p4;
        v0_1.previewBackgroundColor = p5;
        v0_1.previewDarkBackgroundColor = p7;
        v0_1.previewRingColor = p9;
        v0_1.previewGlyphColor = p11;
        v0_1.previewForegroundRes = p13;
        v0_1.previewDarkForegroundRes = p14;
        v0_1.notificationForegroundRes = p15;
        v0_1.notificationDarkForegroundRes = p16;
        v0_1.previewAdaptiveIconRes = p17;
        v0_1.aliasClassName = p18;
        v0_1.darkAliasClassName = p19;
        return;
    }

    public synthetic AppIconPalette(String p22, int p23, String p24, int p25, long p26, long p28, long p30, long p32, int p34, int p35, int p36, int p37, int p38, String p39, String p40, int p41, ic0 p42)
    {
        String v20;
        if ((p41 & 4096) == 0) {
            v20 = p40;
        } else {
            v20 = 0;
        }
        this(p22, p23, p24, p25, p26, p28, p30, p32, p34, p35, p36, p37, p38, p39, v20);
        return;
    }

    public static dq0 getEntries()
    {
        return com.lele.llmonitor.data.AppIconPalette.$ENTRIES;
    }

    public static com.lele.llmonitor.data.AppIconPalette valueOf(String p1)
    {
        return ((com.lele.llmonitor.data.AppIconPalette) Enum.valueOf(com.lele.llmonitor.data.AppIconPalette, p1));
    }

    public static com.lele.llmonitor.data.AppIconPalette[] values()
    {
        return ((com.lele.llmonitor.data.AppIconPalette[]) com.lele.llmonitor.data.AppIconPalette.$VALUES.clone());
    }

    public final int getAccentNameRes()
    {
        return this.accentNameRes;
    }

    public final String getAliasClassName()
    {
        return this.aliasClassName;
    }

    public final String getDarkAliasClassName()
    {
        return this.darkAliasClassName;
    }

    public final int getNotificationDarkForegroundRes()
    {
        return this.notificationDarkForegroundRes;
    }

    public final int getNotificationForegroundRes()
    {
        return this.notificationForegroundRes;
    }

    public final String getPreferenceValue()
    {
        return this.preferenceValue;
    }

    public final int getPreviewAdaptiveIconRes()
    {
        return this.previewAdaptiveIconRes;
    }

    public final long getPreviewBackgroundColor-0d7_KjU()
    {
        return this.previewBackgroundColor;
    }

    public final long getPreviewDarkBackgroundColor-0d7_KjU()
    {
        return this.previewDarkBackgroundColor;
    }

    public final int getPreviewDarkForegroundRes()
    {
        return this.previewDarkForegroundRes;
    }

    public final int getPreviewForegroundRes()
    {
        return this.previewForegroundRes;
    }

    public final long getPreviewGlyphColor-0d7_KjU()
    {
        return this.previewGlyphColor;
    }

    public final long getPreviewRingColor-0d7_KjU()
    {
        return this.previewRingColor;
    }

    public final String resolveAliasClassName(boolean p1)
    {
        if (p1 == null) {
            return this.aliasClassName;
        } else {
            String v1_1 = this.darkAliasClassName;
            if (v1_1 != null) {
                return v1_1;
            } else {
                return this.aliasClassName;
            }
        }
    }

    public final int resolveForegroundRes(boolean p1)
    {
        if (!p1) {
            return this.notificationForegroundRes;
        } else {
            return this.notificationDarkForegroundRes;
        }
    }
}
