package com.lele.llmonitor.ui.widget;
public final class BatteryWidgetKeysKt {
    private static final String SETTINGS_PREF_NAME = "llmonitor_settings";
    private static final String THEME_MODE_KEY = "theme_mode";
    private static final String THEME_PALETTE_PRESET_KEY = "theme_palette_preset";
    private static final float WIDGET_CAPACITY_TEXT_OFFSET = 16480;

    public static final synthetic float access$getWIDGET_CAPACITY_TEXT_OFFSET$p()
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeysKt.WIDGET_CAPACITY_TEXT_OFFSET;
    }

    public static final synthetic com.lele.llmonitor.ui.widget.WidgetThemeColors access$resolveWidgetThemeColors(android.content.Context p0)
    {
        return com.lele.llmonitor.ui.widget.BatteryWidgetKeysKt.resolveWidgetThemeColors(p0);
    }

    private static final com.lele.llmonitor.ui.widget.WidgetThemeColors resolveWidgetThemeColors(android.content.Context p10)
    {
        ru0 v1_0;
        com.lele.llmonitor.ui.widget.WidgetThemeColors v0_0 = com.lele.llmonitor.ui.widget.BatteryWidgetKeysKt.resolveWidgetThemeSelection(p10);
        ru0 v3_1 = 0;
        if ((p10.getResources().getConfiguration().uiMode & 48) != 32) {
            v1_0 = 0;
        } else {
            v1_0 = 1;
        }
        ru0 v2_0 = v0_0.getThemeMode();
        if (v2_0 != 1) {
            if (v2_0 == 2) {
                v3_1 = 1;
            } else {
                v3_1 = v1_0;
            }
        }
        mx v10_1 = com.lele.llmonitor.ui.theme.ThemeKt.resolveAppColorScheme(p10, v3_1, v0_0.getPalettePreset());
        return new com.lele.llmonitor.ui.widget.WidgetThemeColors(new ru0(v10_1.I), new ru0(v10_1.a), new ru0(v10_1.f), new ru0(v10_1.q), new ru0(v10_1.s), new ru0(v10_1.A), new ru0(v10_1.r));
    }

    private static final com.lele.llmonitor.ui.widget.WidgetThemeSelection resolveWidgetThemeSelection(android.content.Context p4)
    {
        com.lele.llmonitor.ui.theme.ThemePalettePreset v4_4 = p4.getApplicationContext().getSharedPreferences("llmonitor_settings", 0);
        com.lele.llmonitor.ui.widget.WidgetThemeSelection v1_0 = com.lele.llmonitor.ui.theme.ThemePalettePreset.Companion;
        return new com.lele.llmonitor.ui.widget.WidgetThemeSelection(ib1.l(v4_4.getInt("theme_mode", 0), 0, 2), v1_0.fromPreferenceValue(v4_4.getString("theme_palette_preset", v1_0.getDefault().getPreferenceValue())));
    }
}
