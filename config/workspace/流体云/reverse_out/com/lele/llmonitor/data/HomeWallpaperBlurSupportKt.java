package com.lele.llmonitor.data;
public final class HomeWallpaperBlurSupportKt {
    public static final float DEFAULT_HOME_WALLPAPER_ALPHA = 1051931443;
    public static final float DEFAULT_HOME_WALLPAPER_BLUR = 0;
    public static final float HOME_WALLPAPER_MAX_BLUR_DP = 16800;
    private static final int HOME_WALLPAPER_STARTUP_RENDER_SPEC_VERSION = 2;

    public static final float resolveHomeWallpaperBlurRadiusDp(float p2)
    {
        return (ib1.k(p2, 0, 1065353216) * 1101004800);
    }

    public static final float resolveHomeWallpaperBlurRadiusPx(float p2, float p3)
    {
        float v2_1 = com.lele.llmonitor.data.HomeWallpaperBlurSupportKt.resolveHomeWallpaperBlurRadiusDp(p2);
        if (p3 < 0) {
            p3 = 0;
        }
        return (v2_1 * p3);
    }

    public static final String resolveHomeWallpaperStartupPreviewRenderSpec(int p3, float p4, float p5, float p6)
    {
        StringBuilder v0_1 = new StringBuilder("v2:");
        v0_1.append(p3);
        v0_1.append(58);
        v0_1.append(l02.F((ib1.k(p4, 0, 1065353216) * 1148846080)));
        v0_1.append(58);
        v0_1.append(l02.F((com.lele.llmonitor.data.HomeWallpaperBlurSupportKt.resolveHomeWallpaperBlurRadiusPx(p5, p6) * 1120403456)));
        return v0_1.toString();
    }
}
