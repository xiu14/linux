package com.lele.llmonitor.data;
public final class HomeWallpaperManager {
    public static final int $stable = 0;
    public static final com.lele.llmonitor.data.HomeWallpaperManager INSTANCE = None;
    private static final float LEGACY_MAX_WALLPAPER_BLUR_RADIUS = 66;
    private static final String LEGACY_PREF_WALLPAPER_BLUR_RADIUS = "home_wallpaper_blur_radius";
    private static final String PREF_WALLPAPER_ALPHA = "home_wallpaper_alpha";
    private static final String PREF_WALLPAPER_BLUR = "home_wallpaper_blur";
    private static final String PREF_WALLPAPER_ENABLED = "home_wallpaper_enabled";
    private static android.content.Context appContext;
    private static l52 historyFiles;
    private static long historyRefreshGeneration;
    private static pj1 historyRefreshJob;
    private static long homeWallpaperAlphaGeneration;
    private static pj1 homeWallpaperAlphaPersistJob;
    private static long homeWallpaperBlurGeneration;
    private static pj1 homeWallpaperBlurPersistJob;
    private static l52 isEnabled;
    private static final d80 scope;
    private static l52 wallpaperAlpha;
    private static l52 wallpaperBlur;
    private static l52 wallpaperFile;

    static HomeWallpaperManager()
    {
        com.lele.llmonitor.data.HomeWallpaperManager.INSTANCE = new com.lele.llmonitor.data.HomeWallpaperManager();
        com.lele.llmonitor.data.HomeWallpaperManager.scope = r7.b(ix2.P(id1.g(), zy1.a.i));
        com.lele.llmonitor.data.HomeWallpaperManager.isEnabled = qc1.G(Boolean.FALSE);
        com.lele.llmonitor.data.HomeWallpaperManager.wallpaperAlpha = qc1.G(Float.valueOf(1051931443));
        com.lele.llmonitor.data.HomeWallpaperManager.wallpaperBlur = qc1.G(Float.valueOf(0));
        com.lele.llmonitor.data.HomeWallpaperManager.wallpaperFile = qc1.G(0);
        com.lele.llmonitor.data.HomeWallpaperManager.historyFiles = qc1.G(uo0.d);
        com.lele.llmonitor.data.HomeWallpaperManager.$stable = 8;
        return;
    }

    private HomeWallpaperManager()
    {
        return;
    }

    public static synthetic bw3 a(boolean p0)
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.importWallpaper$lambda$0(p0);
    }

    public static final synthetic long access$getHistoryRefreshGeneration$p()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.historyRefreshGeneration;
    }

    public static final synthetic long access$getHomeWallpaperAlphaGeneration$p()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaGeneration;
    }

    public static final synthetic long access$getHomeWallpaperBlurGeneration$p()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurGeneration;
    }

    public static synthetic void importWallpaper$default(com.lele.llmonitor.data.HomeWallpaperManager p0, android.net.Uri p1, boolean p2, d11 p3, int p4, Object p5)
    {
        if ((p4 & 2) != 0) {
            p2 = 0;
        }
        if ((p4 & 4) != 0) {
            p3 = new u70(19);
        }
        p0.importWallpaper(p1, p2, p3);
        return;
    }

    private static final bw3 importWallpaper$lambda$0(boolean p0)
    {
        return bw3.a;
    }

    public final void applyWallpaperFromHistory(String p4)
    {
        p4.getClass();
        int v3_0 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v3_0 != 0) {
            xt3.I(com.lele.llmonitor.data.HomeWallpaperManager.scope, 0, 0, new com.lele.llmonitor.data.HomeWallpaperManager$applyWallpaperFromHistory$1(v3_0, p4, 0), 3);
            return;
        } else {
            return;
        }
    }

    public final void deleteHistoryWallpaper(String p4)
    {
        p4.getClass();
        int v3_0 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v3_0 != 0) {
            xt3.I(com.lele.llmonitor.data.HomeWallpaperManager.scope, 0, 0, new com.lele.llmonitor.data.HomeWallpaperManager$deleteHistoryWallpaper$1(v3_0, p4, 0), 3);
            return;
        } else {
            return;
        }
    }

    public final l52 getHistoryFiles()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.historyFiles;
    }

    public final l52 getWallpaperAlpha()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.wallpaperAlpha;
    }

    public final l52 getWallpaperBlur()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.wallpaperBlur;
    }

    public final l52 getWallpaperFile()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.wallpaperFile;
    }

    public final void importWallpaper(android.net.Uri p7, boolean p8, d11 p9)
    {
        p7.getClass();
        p9.getClass();
        android.content.Context v1 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v1 != null) {
            xt3.I(com.lele.llmonitor.data.HomeWallpaperManager.scope, 0, 0, new com.lele.llmonitor.data.HomeWallpaperManager$importWallpaper$2(v1, p7, p8, p9, 0), 3);
            return;
        } else {
            return;
        }
    }

    public final void init(android.content.Context p9)
    {
        p9.getClass();
        if (com.lele.llmonitor.data.HomeWallpaperManager.appContext == null) {
            com.lele.llmonitor.data.HomeWallpaperManager.appContext = p9.getApplicationContext();
            int v1 = 0;
            l52 v9_2 = p9.getSharedPreferences("llmonitor_settings", 0);
            float v3_1 = 0;
            com.lele.llmonitor.data.HomeWallpaperManager.wallpaperAlpha.setValue(Float.valueOf(ib1.k(v9_2.getFloat("home_wallpaper_alpha", 1051931443), 0, 1065353216)));
            if (!v9_2.contains("home_wallpaper_blur")) {
                if (v9_2.contains("home_wallpaper_blur_radius")) {
                    v3_1 = ib1.k((ib1.k(v9_2.getFloat("home_wallpaper_blur_radius", 0), 0, 1107296256) / 1107296256), 0, 1065353216);
                }
            } else {
                v3_1 = ib1.k(v9_2.getFloat("home_wallpaper_blur", 0), 0, 1065353216);
            }
            Boolean v8_3;
            com.lele.llmonitor.data.HomeWallpaperManager.wallpaperBlur.setValue(Float.valueOf(v3_1));
            v9_2.edit().putFloat("home_wallpaper_blur", ((Number) com.lele.llmonitor.data.HomeWallpaperManager.wallpaperBlur.getValue()).floatValue()).remove("home_wallpaper_blur_radius").apply();
            this.refreshState();
            if (com.lele.llmonitor.data.HomeWallpaperManager.wallpaperFile.getValue() == null) {
                v8_3 = 0;
            } else {
                v8_3 = 1;
            }
            if ((v9_2.getBoolean("home_wallpaper_enabled", v8_3)) && (com.lele.llmonitor.data.HomeWallpaperManager.wallpaperFile.getValue() != null)) {
                v1 = 1;
            }
            com.lele.llmonitor.data.HomeWallpaperManager.isEnabled.setValue(Boolean.valueOf(v1));
            return;
        } else {
            return;
        }
    }

    public final l52 isEnabled()
    {
        return com.lele.llmonitor.data.HomeWallpaperManager.isEnabled;
    }

    public final void previewHomeWallpaperAlpha(float p5)
    {
        l52 v4_0 = com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaPersistJob;
        if (v4_0 != null) {
            v4_0.k(0);
        }
        com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaGeneration = (com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaGeneration + 1);
        com.lele.llmonitor.data.HomeWallpaperManager.wallpaperAlpha.setValue(Float.valueOf(ib1.k(p5, 0, 1065353216)));
        return;
    }

    public final void previewHomeWallpaperBlur(float p5)
    {
        l52 v4_0 = com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurPersistJob;
        if (v4_0 != null) {
            v4_0.k(0);
        }
        com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurGeneration = (com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurGeneration + 1);
        com.lele.llmonitor.data.HomeWallpaperManager.wallpaperBlur.setValue(Float.valueOf(ib1.k(p5, 0, 1065353216)));
        return;
    }

    public final void refreshState()
    {
        android.content.Context v3 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v3 != null) {
            java.io.File v4_1;
            com.lele.llmonitor.data.SettingsManager v9_7 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.resolveWallpaperFile(v3);
            if ((!v9_7.exists()) || (v9_7.length() <= 0)) {
                v4_1 = 0;
            } else {
                v4_1 = v9_7;
            }
            com.lele.llmonitor.data.HomeWallpaperManager.wallpaperFile.setValue(v4_1);
            int v1_0 = (com.lele.llmonitor.data.HomeWallpaperManager.historyRefreshGeneration + 1);
            com.lele.llmonitor.data.HomeWallpaperManager.historyRefreshGeneration = v1_0;
            com.lele.llmonitor.data.SettingsManager v9_2 = com.lele.llmonitor.data.HomeWallpaperManager.historyRefreshJob;
            if (v9_2 != null) {
                v9_2.k(0);
            }
            com.lele.llmonitor.data.HomeWallpaperManager.historyRefreshJob = xt3.I(com.lele.llmonitor.data.HomeWallpaperManager.scope, 0, 0, new com.lele.llmonitor.data.HomeWallpaperManager$refreshState$1(v1_0, v3, v4_1, 0), 3);
            if (v4_1 == null) {
                com.lele.llmonitor.data.HomeWallpaperManager.isEnabled.setValue(Boolean.FALSE);
            }
            com.lele.llmonitor.data.SettingsManager.INSTANCE.refreshLaunchAppearanceSnapshot();
            return;
        } else {
            return;
        }
    }

    public final void setAlpha(float p1)
    {
        this.setHomeWallpaperAlpha(p1);
        return;
    }

    public final void setEnabled(boolean p4)
    {
        com.lele.llmonitor.data.SettingsManager v3_0 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v3_0 != null) {
            if ((p4 == 0) || (com.lele.llmonitor.data.HomeWallpaperManager.wallpaperFile.getValue() == null)) {
                int v4_3 = 0;
            } else {
                v4_3 = 1;
            }
            com.lele.llmonitor.data.HomeWallpaperManager.isEnabled.setValue(Boolean.valueOf(v4_3));
            v3_0.getSharedPreferences("llmonitor_settings", 0).edit().putBoolean("home_wallpaper_enabled", v4_3).apply();
            com.lele.llmonitor.data.SettingsManager.INSTANCE.refreshLaunchAppearanceSnapshot();
            return;
        } else {
            return;
        }
    }

    public final void setHomeWallpaperAlpha(float p7)
    {
        android.content.Context v3 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v3 != null) {
            float v4 = ib1.k(p7, 0, 1065353216);
            com.lele.llmonitor.data.HomeWallpaperManager.wallpaperAlpha.setValue(Float.valueOf(v4));
            int v1_0 = (com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaGeneration + 1);
            com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaGeneration = v1_0;
            tf3 v6_1 = com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaPersistJob;
            if (v6_1 != null) {
                v6_1.k(0);
            }
            com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperAlphaPersistJob = xt3.I(com.lele.llmonitor.data.HomeWallpaperManager.scope, 0, 0, new com.lele.llmonitor.data.HomeWallpaperManager$setHomeWallpaperAlpha$1(v1_0, v3, v4, 0), 3);
            return;
        } else {
            return;
        }
    }

    public final void setHomeWallpaperBlur(float p7)
    {
        android.content.Context v3 = com.lele.llmonitor.data.HomeWallpaperManager.appContext;
        if (v3 != null) {
            float v4 = ib1.k(p7, 0, 1065353216);
            com.lele.llmonitor.data.HomeWallpaperManager.wallpaperBlur.setValue(Float.valueOf(v4));
            int v1_0 = (com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurGeneration + 1);
            com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurGeneration = v1_0;
            tf3 v6_1 = com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurPersistJob;
            if (v6_1 != null) {
                v6_1.k(0);
            }
            com.lele.llmonitor.data.HomeWallpaperManager.homeWallpaperBlurPersistJob = xt3.I(com.lele.llmonitor.data.HomeWallpaperManager.scope, 0, 0, new com.lele.llmonitor.data.HomeWallpaperManager$setHomeWallpaperBlur$1(v1_0, v3, v4, 0), 3);
            return;
        } else {
            return;
        }
    }
}
