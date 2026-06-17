package com.lele.llmonitor.data;
public final class LaunchAppearanceSnapshotKt {
    private static final String KEY_LAUNCH_BACKGROUND_ARGB = "launch_background_argb";
    private static final String KEY_LAUNCH_STARTUP_PREVIEW_RENDER_SPEC = "launch_startup_preview_render_spec";
    private static final String KEY_LAUNCH_STARTUP_PREVIEW_VERSION = "launch_startup_preview_version";
    private static final String KEY_LAUNCH_THEME_MODE = "launch_theme_mode";
    private static final String KEY_LAUNCH_THEME_PALETTE = "launch_theme_palette";
    private static final String KEY_LAUNCH_WALLPAPER_ALPHA = "launch_wallpaper_alpha";
    private static final String KEY_LAUNCH_WALLPAPER_BLUR = "launch_wallpaper_blur";
    private static final String KEY_LAUNCH_WALLPAPER_ENABLED = "launch_wallpaper_enabled";
    private static final String KEY_LAUNCH_WALLPAPER_VERSION = "launch_wallpaper_version";

    public static final com.lele.llmonitor.data.LaunchAppearanceSnapshot buildLaunchAppearanceSnapshot(android.content.Context p14, int p15, com.lele.llmonitor.ui.theme.ThemePalettePreset p16, boolean p17, float p18, float p19, long p20, long p22, String p24)
    {
        p14.getClass();
        p16.getClass();
        p24.getClass();
        com.lele.llmonitor.data.LaunchAppearanceSnapshot v0_3 = 1;
        if (p15 == 1) {
            v0_3 = 0;
        } else {
            if (p15 != 2) {
                v0_3 = com.lele.llmonitor.data.UiAppearanceSupportKt.isSystemDarkModeEnabled(p14);
            }
        }
        long v9_0;
        int v1_0 = jn.Q(com.lele.llmonitor.ui.theme.ThemeKt.resolveAppColorScheme(p14, v0_3, p16).n);
        float v6_1 = ib1.k(p18, 0, 1065353216);
        float vtmp8 = ib1.k(p19, 0, 1065353216);
        if (p20 >= 0) {
            v9_0 = p20;
        } else {
            v9_0 = 0;
        }
        long v7_2;
        long v9_1;
        if (p22 >= 0) {
            v7_2 = v9_0;
            v9_1 = p22;
        } else {
            v9_1 = 0;
            v7_2 = v9_0;
        }
        return new com.lele.llmonitor.data.LaunchAppearanceSnapshot(v1_0, p15, p16, p17, v6_1, vtmp8, v7_2, v9_1, p24);
    }

    public static synthetic com.lele.llmonitor.data.LaunchAppearanceSnapshot buildLaunchAppearanceSnapshot$default(android.content.Context p2, int p3, com.lele.llmonitor.ui.theme.ThemePalettePreset p4, boolean p5, float p6, float p7, long p8, long p10, String p12, int p13, Object p14)
    {
        if ((p13 & 64) != 0) {
            p8 = 0;
        }
        if ((p13 & 128) != 0) {
            p10 = 0;
        }
        if ((p13 & 256) != 0) {
            p12 = "";
        }
        return com.lele.llmonitor.data.LaunchAppearanceSnapshotKt.buildLaunchAppearanceSnapshot(p2, p3, p4, p5, p6, p7, p8, p10, p12);
    }

    public static final void persistLaunchAppearanceSnapshot(android.content.SharedPreferences p3, com.lele.llmonitor.data.LaunchAppearanceSnapshot p4)
    {
        p3.getClass();
        p4.getClass();
        p3.edit().putInt("launch_background_argb", p4.getBackgroundArgb()).putInt("launch_theme_mode", p4.getThemeMode()).putString("launch_theme_palette", p4.getThemePalettePreset().getPreferenceValue()).putBoolean("launch_wallpaper_enabled", p4.getWallpaperEnabled()).putFloat("launch_wallpaper_alpha", p4.getWallpaperAlpha()).putFloat("launch_wallpaper_blur", p4.getWallpaperBlur()).putLong("launch_wallpaper_version", p4.getWallpaperVersion()).putLong("launch_startup_preview_version", p4.getStartupPreviewVersion()).putString("launch_startup_preview_render_spec", p4.getStartupPreviewRenderSpec()).commit();
        return;
    }

    public static final com.lele.llmonitor.data.LaunchAppearanceSnapshot readLaunchAppearanceSnapshot(android.content.SharedPreferences p17)
    {
        p17.getClass();
        if (p17.contains("launch_background_argb")) {
            com.lele.llmonitor.data.LaunchAppearanceSnapshot v2_1 = new com.lele.llmonitor.data.LaunchAppearanceSnapshot;
            int v1_3 = p17.getInt("launch_background_argb", 0);
            boolean v4_2 = ib1.l(p17.getInt("launch_theme_mode", 2), 0, 2);
            int v5_1 = com.lele.llmonitor.ui.theme.ThemePalettePreset.Companion;
            int v5_2 = v5_1.fromPreferenceValue(p17.getString("launch_theme_palette", v5_1.getDefault().getPreferenceValue()));
            com.lele.llmonitor.ui.theme.ThemePalettePreset v3_0 = p17.getBoolean("launch_wallpaper_enabled", 0);
            float v6_6 = ib1.k(p17.getFloat("launch_wallpaper_alpha", 1051931443), 0, 1065353216);
            float v7_3 = ib1.k(p17.getFloat("launch_wallpaper_blur", 0), 0, 1065353216);
            long v9_2 = 0;
            long v11 = p17.getLong("launch_wallpaper_version", 0);
            if (v11 < 0) {
                v11 = 0;
            }
            String v13_0 = p17.getLong("launch_startup_preview_version", 0);
            if (v13_0 >= 0) {
                v9_2 = v13_0;
            }
            long v8_6;
            com.lele.llmonitor.data.LaunchAppearanceSnapshot v2_2;
            long v10;
            String v12;
            boolean v4_3;
            int v5_3;
            com.lele.llmonitor.ui.theme.ThemePalettePreset v3_1;
            int v1_1;
            String v0_1 = p17.getString("launch_startup_preview_render_spec", "");
            if (v0_1 != null) {
                v10 = v9_2;
                v8_6 = v11;
                v2_2 = v1_3;
                v1_1 = v2_1;
                v5_3 = v3_0;
                v3_1 = v4_2;
                v4_3 = v5_2;
                v12 = v0_1;
            } else {
                v2_2 = v1_3;
                v1_1 = v2_1;
                v5_3 = v3_0;
                v3_1 = v4_2;
                v4_3 = v5_2;
                v10 = v9_2;
                v8_6 = v11;
                v12 = "";
            }
            return v1_1(v2_2, v3_1, v4_3, v5_3, v6_6, v7_3, v8_6, v10, v12);
        } else {
            return 0;
        }
    }
}
