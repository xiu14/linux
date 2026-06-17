package com.lele.llmonitor.data;
public final class LaunchAppearanceSnapshot {
    public static final int $stable;
    private final int backgroundArgb;
    private final String startupPreviewRenderSpec;
    private final long startupPreviewVersion;
    private final int themeMode;
    private final com.lele.llmonitor.ui.theme.ThemePalettePreset themePalettePreset;
    private final float wallpaperAlpha;
    private final float wallpaperBlur;
    private final boolean wallpaperEnabled;
    private final long wallpaperVersion;

    public LaunchAppearanceSnapshot(int p1, int p2, com.lele.llmonitor.ui.theme.ThemePalettePreset p3, boolean p4, float p5, float p6, long p7, long p9, String p11)
    {
        p3.getClass();
        p11.getClass();
        this.backgroundArgb = p1;
        this.themeMode = p2;
        this.themePalettePreset = p3;
        this.wallpaperEnabled = p4;
        this.wallpaperAlpha = p5;
        this.wallpaperBlur = p6;
        this.wallpaperVersion = p7;
        this.startupPreviewVersion = p9;
        this.startupPreviewRenderSpec = p11;
        return;
    }

    public static synthetic com.lele.llmonitor.data.LaunchAppearanceSnapshot copy$default(com.lele.llmonitor.data.LaunchAppearanceSnapshot p0, int p1, int p2, com.lele.llmonitor.ui.theme.ThemePalettePreset p3, boolean p4, float p5, float p6, long p7, long p9, String p11, int p12, Object p13)
    {
        if ((p12 & 1) != 0) {
            p1 = p0.backgroundArgb;
        }
        if ((p12 & 2) != 0) {
            p2 = p0.themeMode;
        }
        if ((p12 & 4) != 0) {
            p3 = p0.themePalettePreset;
        }
        if ((p12 & 8) != 0) {
            p4 = p0.wallpaperEnabled;
        }
        if ((p12 & 16) != 0) {
            p5 = p0.wallpaperAlpha;
        }
        if ((p12 & 32) != 0) {
            p6 = p0.wallpaperBlur;
        }
        if ((p12 & 64) != 0) {
            p7 = p0.wallpaperVersion;
        }
        if ((p12 & 128) != 0) {
            p9 = p0.startupPreviewVersion;
        }
        if ((p12 & 256) != 0) {
            p11 = p0.startupPreviewRenderSpec;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p9, p11);
    }

    public final int component1()
    {
        return this.backgroundArgb;
    }

    public final int component2()
    {
        return this.themeMode;
    }

    public final com.lele.llmonitor.ui.theme.ThemePalettePreset component3()
    {
        return this.themePalettePreset;
    }

    public final boolean component4()
    {
        return this.wallpaperEnabled;
    }

    public final float component5()
    {
        return this.wallpaperAlpha;
    }

    public final float component6()
    {
        return this.wallpaperBlur;
    }

    public final long component7()
    {
        return this.wallpaperVersion;
    }

    public final long component8()
    {
        return this.startupPreviewVersion;
    }

    public final String component9()
    {
        return this.startupPreviewRenderSpec;
    }

    public final com.lele.llmonitor.data.LaunchAppearanceSnapshot copy(int p1, int p2, com.lele.llmonitor.ui.theme.ThemePalettePreset p3, boolean p4, float p5, float p6, long p7, long p9, String p11)
    {
        p3.getClass();
        p11.getClass();
        return new com.lele.llmonitor.data.LaunchAppearanceSnapshot(p1, p2, p3, p4, p5, p6, p7, p9, p11);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.lele.llmonitor.data.LaunchAppearanceSnapshot)) {
                if (this.backgroundArgb == ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).backgroundArgb) {
                    if (this.themeMode == ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).themeMode) {
                        if (this.themePalettePreset == ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).themePalettePreset) {
                            if (this.wallpaperEnabled == ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).wallpaperEnabled) {
                                if (Float.compare(this.wallpaperAlpha, ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).wallpaperAlpha) == 0) {
                                    if (Float.compare(this.wallpaperBlur, ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).wallpaperBlur) == 0) {
                                        if (this.wallpaperVersion == ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).wallpaperVersion) {
                                            if (this.startupPreviewVersion == ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).startupPreviewVersion) {
                                                if (ni1.o(this.startupPreviewRenderSpec, ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) p8).startupPreviewRenderSpec)) {
                                                    return 1;
                                                } else {
                                                    return 0;
                                                }
                                            } else {
                                                return 0;
                                            }
                                        } else {
                                            return 0;
                                        }
                                    } else {
                                        return 0;
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int getBackgroundArgb()
    {
        return this.backgroundArgb;
    }

    public final String getStartupPreviewRenderSpec()
    {
        return this.startupPreviewRenderSpec;
    }

    public final long getStartupPreviewVersion()
    {
        return this.startupPreviewVersion;
    }

    public final int getThemeMode()
    {
        return this.themeMode;
    }

    public final com.lele.llmonitor.ui.theme.ThemePalettePreset getThemePalettePreset()
    {
        return this.themePalettePreset;
    }

    public final float getWallpaperAlpha()
    {
        return this.wallpaperAlpha;
    }

    public final float getWallpaperBlur()
    {
        return this.wallpaperBlur;
    }

    public final boolean getWallpaperEnabled()
    {
        return this.wallpaperEnabled;
    }

    public final long getWallpaperVersion()
    {
        return this.wallpaperVersion;
    }

    public int hashCode()
    {
        int v1 = 31;
        return (this.startupPreviewRenderSpec.hashCode() + s42.a(s42.a(ve2.c(this.wallpaperBlur, ve2.c(this.wallpaperAlpha, s42.c(((this.themePalettePreset.hashCode() + ve2.d(this.themeMode, (Integer.hashCode(this.backgroundArgb) * 31), 31)) * v1), v1, this.wallpaperEnabled), 31), 31), 31, this.wallpaperVersion), 31, this.startupPreviewVersion));
    }

    public String toString()
    {
        String v0_0 = this.backgroundArgb;
        int v1 = this.themeMode;
        com.lele.llmonitor.ui.theme.ThemePalettePreset v2 = this.themePalettePreset;
        boolean v3 = this.wallpaperEnabled;
        float v4 = this.wallpaperAlpha;
        float v5 = this.wallpaperBlur;
        long v6 = this.wallpaperVersion;
        long v8 = this.startupPreviewVersion;
        String v12_2 = this.startupPreviewRenderSpec;
        StringBuilder v10_0 = new StringBuilder("LaunchAppearanceSnapshot(backgroundArgb=");
        v10_0.append(v0_0);
        v10_0.append(", themeMode=");
        v10_0.append(v1);
        v10_0.append(", themePalettePreset=");
        v10_0.append(v2);
        v10_0.append(", wallpaperEnabled=");
        v10_0.append(v3);
        v10_0.append(", wallpaperAlpha=");
        v10_0.append(v4);
        v10_0.append(", wallpaperBlur=");
        v10_0.append(v5);
        v10_0.append(", wallpaperVersion=");
        v10_0.append(v6);
        v10_0.append(", startupPreviewVersion=");
        v10_0.append(v8);
        v10_0.append(", startupPreviewRenderSpec=");
        return ve2.r(v10_0, v12_2, ")");
    }
}
