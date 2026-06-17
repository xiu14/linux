package com.lele.llmonitor.ui.widget;
final class WidgetThemeSelection {
    private final com.lele.llmonitor.ui.theme.ThemePalettePreset palettePreset;
    private final int themeMode;

    public WidgetThemeSelection(int p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2)
    {
        p2.getClass();
        this.themeMode = p1;
        this.palettePreset = p2;
        return;
    }

    public static synthetic com.lele.llmonitor.ui.widget.WidgetThemeSelection copy$default(com.lele.llmonitor.ui.widget.WidgetThemeSelection p0, int p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.themeMode;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.palettePreset;
        }
        return p0.copy(p1, p2);
    }

    public final int component1()
    {
        return this.themeMode;
    }

    public final com.lele.llmonitor.ui.theme.ThemePalettePreset component2()
    {
        return this.palettePreset;
    }

    public final com.lele.llmonitor.ui.widget.WidgetThemeSelection copy(int p1, com.lele.llmonitor.ui.theme.ThemePalettePreset p2)
    {
        p2.getClass();
        this = new com.lele.llmonitor.ui.widget.WidgetThemeSelection;
        this(p1, p2);
        return this;
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.lele.llmonitor.ui.widget.WidgetThemeSelection)) {
                if (this.themeMode == ((com.lele.llmonitor.ui.widget.WidgetThemeSelection) p5).themeMode) {
                    if (this.palettePreset == ((com.lele.llmonitor.ui.widget.WidgetThemeSelection) p5).palettePreset) {
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
            return 1;
        }
    }

    public final com.lele.llmonitor.ui.theme.ThemePalettePreset getPalettePreset()
    {
        return this.palettePreset;
    }

    public final int getThemeMode()
    {
        return this.themeMode;
    }

    public int hashCode()
    {
        return (this.palettePreset.hashCode() + (Integer.hashCode(this.themeMode) * 31));
    }

    public String toString()
    {
        String v0_0 = this.themeMode;
        String v3_1 = this.palettePreset;
        StringBuilder v1_1 = new StringBuilder("WidgetThemeSelection(themeMode=");
        v1_1.append(v0_0);
        v1_1.append(", palettePreset=");
        v1_1.append(v3_1);
        v1_1.append(")");
        return v1_1.toString();
    }
}
