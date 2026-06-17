package com.lele.llmonitor.data;
public final class SettingsManager {
    public static final int $stable = 0;
    public static final String ACTION_FORCE_UPDATE = "com.lele.llmonitor.ACTION_FORCE_UPDATE";
    public static final com.lele.llmonitor.data.SettingsManager INSTANCE = None;
    private static final String PREF_NAME = "llmonitor_settings";
    private static android.content.Context appContext;
    private static l52 appLanguageOption;
    private static final d80 backgroundScope;
    private static l52 followSystemAppIconMode;
    private static l52 homeCardOpacity;
    private static l52 isAppAccessUnlocked;
    private static l52 isBatteryOptimizationDismissed;
    private static l52 isDebugModeEnabled;
    private static l52 isDoubleCell;
    private static l52 isInvertCurrent;
    private static l52 isLiveCloseActionEnabled;
    private static l52 isLiveNotificationEnabled;
    private static l52 isNotificationEnabled;
    private static l52 isNotificationPermissionDismissed;
    private static l52 isShowNotificationWhenNotCharging;
    private static l52 isVirtualVoltageEnabled;
    private static l52 isVirtualVoltageSuggestionDismissed;
    private static l52 launchAppearanceSnapshot;
    private static long launchSnapshotRefreshGeneration;
    private static pj1 launchSnapshotRefreshJob;
    private static android.content.SharedPreferences prefs;
    private static l52 refreshRateNotifyCharging;
    private static l52 refreshRateNotifyChargingScreenOff;
    private static l52 refreshRateNotifyNotCharging;
    private static l52 refreshRateNotifyNotChargingScreenOff;
    private static l52 refreshRateUiCharging;
    private static l52 refreshRateUiNotCharging;
    private static l52 showNotificationBatteryLevel;
    private static l52 showNotificationCurrent;
    private static l52 showNotificationSupply;
    private static l52 showNotificationTemperature;
    private static l52 showNotificationVoltage;
    private static l52 themeMode;
    private static l52 themePalettePreset;

    static SettingsManager()
    {
        com.lele.llmonitor.data.SettingsManager.INSTANCE = new com.lele.llmonitor.data.SettingsManager();
        com.lele.llmonitor.data.SettingsManager.backgroundScope = r7.b(ix2.P(id1.g(), ii0.a));
        int v0_2 = Boolean.FALSE;
        com.lele.llmonitor.data.SettingsManager.isInvertCurrent = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.isDoubleCell = qc1.G(v0_2);
        gi2 v1_10 = Boolean.TRUE;
        com.lele.llmonitor.data.SettingsManager.isNotificationEnabled = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.isShowNotificationWhenNotCharging = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.isLiveNotificationEnabled = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.isLiveCloseActionEnabled = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.showNotificationBatteryLevel = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.showNotificationSupply = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.showNotificationVoltage = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.showNotificationCurrent = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.showNotificationTemperature = qc1.G(v1_10);
        com.lele.llmonitor.data.SettingsManager.isVirtualVoltageEnabled = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.themeMode = qc1.G(Integer.valueOf(2));
        com.lele.llmonitor.data.SettingsManager.themePalettePreset = qc1.G(com.lele.llmonitor.ui.theme.ThemePalettePreset.DYNAMIC);
        com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode = qc1.G(com.lele.llmonitor.data.FollowSystemAppIconMode.Companion.getDefault());
        com.lele.llmonitor.data.SettingsManager.launchAppearanceSnapshot = qc1.G(0);
        com.lele.llmonitor.data.SettingsManager.homeCardOpacity = qc1.G(Float.valueOf(1065353216));
        com.lele.llmonitor.data.SettingsManager.appLanguageOption = qc1.G(com.lele.llmonitor.data.AppLanguageOption.Companion.getDefault());
        com.lele.llmonitor.data.SettingsManager.refreshRateUiCharging = qc1.G(Long.valueOf(1000));
        gi2 v1_34 = Long.valueOf(3000);
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyCharging = qc1.G(v1_34);
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyChargingScreenOff = qc1.G(Long.valueOf(10000));
        com.lele.llmonitor.data.SettingsManager.refreshRateUiNotCharging = qc1.G(v1_34);
        gi2 v1_2 = Long.valueOf(180000);
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotCharging = qc1.G(v1_2);
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotChargingScreenOff = qc1.G(v1_2);
        com.lele.llmonitor.data.SettingsManager.isVirtualVoltageSuggestionDismissed = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.isBatteryOptimizationDismissed = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.isNotificationPermissionDismissed = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.isDebugModeEnabled = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.isAppAccessUnlocked = qc1.G(v0_2);
        com.lele.llmonitor.data.SettingsManager.$stable = 8;
        return;
    }

    private SettingsManager()
    {
        return;
    }

    public static final synthetic long access$getLaunchSnapshotRefreshGeneration$p()
    {
        return com.lele.llmonitor.data.SettingsManager.launchSnapshotRefreshGeneration;
    }

    private final float normalizeHomeCardOpacity(float p3)
    {
        if (Math.abs(p3) > 2139095039) {
            return 1065353216;
        } else {
            if (p3 <= 1065353216) {
                return ib1.k(p3, 0, 1065353216);
            } else {
                return ib1.k((p3 / 1120403456), 0, 1065353216);
            }
        }
    }

    public static synthetic void setAppLanguageOption$default(com.lele.llmonitor.data.SettingsManager p0, com.lele.llmonitor.data.AppLanguageOption p1, s01 p2, int p3, Object p4)
    {
        if ((p3 & 2) != 0) {
            p2 = 0;
        }
        p0.setAppLanguageOption(p1, p2);
        return;
    }

    public static synthetic void setFollowSystemAppIconMode$default(com.lele.llmonitor.data.SettingsManager p0, com.lele.llmonitor.data.FollowSystemAppIconMode p1, s01 p2, int p3, Object p4)
    {
        if ((p3 & 2) != 0) {
            p2 = 0;
        }
        p0.setFollowSystemAppIconMode(p1, p2);
        return;
    }

    public static synthetic void setThemeMode$default(com.lele.llmonitor.data.SettingsManager p0, int p1, s01 p2, int p3, Object p4)
    {
        if ((p3 & 2) != 0) {
            p2 = 0;
        }
        p0.setThemeMode(p1, p2);
        return;
    }

    public static synthetic void setThemePalettePreset$default(com.lele.llmonitor.data.SettingsManager p0, com.lele.llmonitor.ui.theme.ThemePalettePreset p1, s01 p2, int p3, Object p4)
    {
        if ((p3 & 2) != 0) {
            p2 = 0;
        }
        p0.setThemePalettePreset(p1, p2);
        return;
    }

    public static synthetic void syncAppIcon$default(com.lele.llmonitor.data.SettingsManager p0, Boolean p1, int p2, Object p3)
    {
        if ((p2 & 1) != 0) {
            p1 = 0;
        }
        p0.syncAppIcon(p1);
        return;
    }

    public final l52 getAppLanguageOption()
    {
        return com.lele.llmonitor.data.SettingsManager.appLanguageOption;
    }

    public final l52 getFollowSystemAppIconMode()
    {
        return com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode;
    }

    public final l52 getHomeCardOpacity()
    {
        return com.lele.llmonitor.data.SettingsManager.homeCardOpacity;
    }

    public final l52 getLaunchAppearanceSnapshot()
    {
        return com.lele.llmonitor.data.SettingsManager.launchAppearanceSnapshot;
    }

    public final l52 getRefreshRateNotifyCharging()
    {
        return com.lele.llmonitor.data.SettingsManager.refreshRateNotifyCharging;
    }

    public final l52 getRefreshRateNotifyChargingScreenOff()
    {
        return com.lele.llmonitor.data.SettingsManager.refreshRateNotifyChargingScreenOff;
    }

    public final l52 getRefreshRateNotifyNotCharging()
    {
        return com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotCharging;
    }

    public final l52 getRefreshRateNotifyNotChargingScreenOff()
    {
        return com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotChargingScreenOff;
    }

    public final l52 getRefreshRateUiCharging()
    {
        return com.lele.llmonitor.data.SettingsManager.refreshRateUiCharging;
    }

    public final l52 getRefreshRateUiNotCharging()
    {
        return com.lele.llmonitor.data.SettingsManager.refreshRateUiNotCharging;
    }

    public final l52 getShowNotificationBatteryLevel()
    {
        return com.lele.llmonitor.data.SettingsManager.showNotificationBatteryLevel;
    }

    public final l52 getShowNotificationCurrent()
    {
        return com.lele.llmonitor.data.SettingsManager.showNotificationCurrent;
    }

    public final l52 getShowNotificationSupply()
    {
        return com.lele.llmonitor.data.SettingsManager.showNotificationSupply;
    }

    public final l52 getShowNotificationTemperature()
    {
        return com.lele.llmonitor.data.SettingsManager.showNotificationTemperature;
    }

    public final l52 getShowNotificationVoltage()
    {
        return com.lele.llmonitor.data.SettingsManager.showNotificationVoltage;
    }

    public final l52 getThemeMode()
    {
        return com.lele.llmonitor.data.SettingsManager.themeMode;
    }

    public final l52 getThemePalettePreset()
    {
        return com.lele.llmonitor.data.SettingsManager.themePalettePreset;
    }

    public final void init(android.content.Context p11)
    {
        p11.getClass();
        if (com.lele.llmonitor.data.SettingsManager.prefs == null) {
            com.lele.llmonitor.data.SettingsManager$init$1 v0_4;
            com.lele.llmonitor.data.SettingsManager.appContext = p11.getApplicationContext();
            android.content.SharedPreferences$Editor v1_0 = 0;
            com.lele.llmonitor.data.SettingsManager$init$1 v0_59 = p11.getSharedPreferences("llmonitor_settings", 0);
            com.lele.llmonitor.data.SettingsManager.prefs = v0_59;
            if (v0_59 == null) {
                v0_4 = 0;
            } else {
                v0_4 = v0_59.getBoolean("invert_current", 0);
            }
            String v2_22;
            com.lele.llmonitor.data.SettingsManager.isInvertCurrent.setValue(Boolean.valueOf(v0_4));
            String v2_20 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_20 == null) {
                v2_22 = 0;
            } else {
                v2_22 = v2_20.getBoolean("double_cell", 0);
            }
            String v2_28;
            com.lele.llmonitor.data.SettingsManager.isDoubleCell.setValue(Boolean.valueOf(v2_22));
            String v2_27 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_27 == null) {
                v2_28 = 1;
            } else {
                v2_28 = v2_27.getBoolean("notification_enabled", 1);
            }
            String v2_31;
            com.lele.llmonitor.data.SettingsManager.isNotificationEnabled.setValue(Boolean.valueOf(v2_28));
            String v2_30 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_30 == null) {
                v2_31 = 1;
            } else {
                v2_31 = v2_30.getBoolean("show_notification_not_charging", 1);
            }
            String v2_34;
            com.lele.llmonitor.data.SettingsManager.isShowNotificationWhenNotCharging.setValue(Boolean.valueOf(v2_31));
            String v2_33 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_33 == null) {
                v2_34 = 1;
            } else {
                v2_34 = v2_33.getBoolean("live_notification_enabled", 1);
            }
            String v2_37;
            com.lele.llmonitor.data.SettingsManager.isLiveNotificationEnabled.setValue(Boolean.valueOf(v2_34));
            String v2_36 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_36 == null) {
                v2_37 = 1;
            } else {
                v2_37 = v2_36.getBoolean("live_close_action_enabled", 1);
            }
            String v2_40;
            com.lele.llmonitor.data.SettingsManager.isLiveCloseActionEnabled.setValue(Boolean.valueOf(v2_37));
            String v2_39 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_39 == null) {
                v2_40 = 1;
            } else {
                v2_40 = v2_39.getBoolean("notification_content_battery_level", 1);
            }
            String v2_43;
            com.lele.llmonitor.data.SettingsManager.showNotificationBatteryLevel.setValue(Boolean.valueOf(v2_40));
            String v2_42 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_42 == null) {
                v2_43 = 1;
            } else {
                v2_43 = v2_42.getBoolean("notification_content_supply", 1);
            }
            String v2_46;
            com.lele.llmonitor.data.SettingsManager.showNotificationSupply.setValue(Boolean.valueOf(v2_43));
            String v2_45 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_45 == null) {
                v2_46 = 1;
            } else {
                v2_46 = v2_45.getBoolean("notification_content_voltage", 1);
            }
            String v2_1;
            com.lele.llmonitor.data.SettingsManager.showNotificationVoltage.setValue(Boolean.valueOf(v2_46));
            String v2_0 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_0 == null) {
                v2_1 = 1;
            } else {
                v2_1 = v2_0.getBoolean("notification_content_current", 1);
            }
            String v2_5;
            com.lele.llmonitor.data.SettingsManager.showNotificationCurrent.setValue(Boolean.valueOf(v2_1));
            String v2_4 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_4 == null) {
                v2_5 = 1;
            } else {
                v2_5 = v2_4.getBoolean("notification_content_temperature", 1);
            }
            String v2_8;
            com.lele.llmonitor.data.SettingsManager.showNotificationTemperature.setValue(Boolean.valueOf(v2_5));
            String v2_7 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_7 == null) {
                v2_8 = 0;
            } else {
                v2_8 = v2_7.getBoolean("virtual_voltage_enabled", 0);
            }
            String v2_11;
            com.lele.llmonitor.data.SettingsManager.isVirtualVoltageEnabled.setValue(Boolean.valueOf(v2_8));
            String v2_10 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_10 == null) {
                v2_11 = 2;
            } else {
                v2_11 = v2_10.getInt("theme_mode", 2);
            }
            String v4_5;
            com.lele.llmonitor.data.SettingsManager.themeMode.setValue(Integer.valueOf(ib1.l(v2_11, 0, 2)));
            String v4_4 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v4_4 == null) {
                v4_5 = 0;
            } else {
                v4_5 = v4_4.getString("theme_palette_preset", com.lele.llmonitor.ui.theme.ThemePalettePreset.DYNAMIC.getPreferenceValue());
            }
            com.lele.llmonitor.data.SettingsManager.themePalettePreset.setValue(com.lele.llmonitor.ui.theme.ThemePalettePreset.Companion.fromPreferenceValue(v4_5));
            String v2_16 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v2_16 == null) {
                h.g("Required value was null.");
            } else {
                com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode.setValue(com.lele.llmonitor.data.UiAppearanceSupportKt.resolveStoredFollowSystemAppIconMode(v2_16, com.lele.llmonitor.data.UiAppearanceSupportKt.isSystemDarkModeEnabled(p11)));
                String v2_18 = com.lele.llmonitor.data.SettingsManager.prefs;
                long v6_3 = 1065353216;
                if (v2_18 != null) {
                    v6_3 = v2_18.getFloat("home_card_opacity", 1065353216);
                }
                com.lele.llmonitor.data.SettingsManager.homeCardOpacity.setValue(Float.valueOf(this.normalizeHomeCardOpacity(v6_3)));
                com.lele.llmonitor.data.SettingsManager$init$1 v0_10 = com.lele.llmonitor.data.SettingsManager.prefs;
                if (v0_10 == null) {
                    h.g("Required value was null.");
                    return;
                } else {
                    com.lele.llmonitor.data.SettingsManager.appLanguageOption.setValue(com.lele.llmonitor.data.AppLocaleSupportKt.resolveStoredAppLanguageOption(v0_10));
                    android.content.SharedPreferences$Editor v10_4 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v10_4 != null) {
                        android.content.SharedPreferences$Editor v10_5 = v10_4.edit();
                        if (v10_5 != null) {
                            android.content.SharedPreferences$Editor v10_6 = v10_5.remove("home_card_blur");
                            if (v10_6 != null) {
                                v10_6.apply();
                            }
                        }
                    }
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_15;
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_14 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_14 == null) {
                        v0_15 = 0;
                    } else {
                        v0_15 = v0_14.getBoolean("dismiss_virtual_voltage", 0);
                    }
                    com.lele.llmonitor.data.SettingsManager.isVirtualVoltageSuggestionDismissed.setValue(Boolean.valueOf(v0_15));
                    android.content.SharedPreferences$Editor v10_8 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if ((v10_8 != null) && (v10_8.getLong("dismiss_virtual_voltage_until", -9223372036854775808) == java.time.LocalDate.now().toEpochDay())) {
                        com.lele.llmonitor.data.SettingsManager.isVirtualVoltageSuggestionDismissed.setValue(Boolean.TRUE);
                    }
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_20;
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_19 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_19 == null) {
                        v0_20 = 0;
                    } else {
                        v0_20 = v0_19.getBoolean("dismiss_battery_opt", 0);
                    }
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_23;
                    com.lele.llmonitor.data.SettingsManager.isBatteryOptimizationDismissed.setValue(Boolean.valueOf(v0_20));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_22 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_22 == null) {
                        v0_23 = 0;
                    } else {
                        v0_23 = v0_22.getBoolean("dismiss_notification_perm", 0);
                    }
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_26;
                    com.lele.llmonitor.data.SettingsManager.isNotificationPermissionDismissed.setValue(Boolean.valueOf(v0_23));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_25 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_25 == null) {
                        v0_26 = 0;
                    } else {
                        v0_26 = v0_25.getBoolean("debug_mode_enabled", 0);
                    }
                    com.lele.llmonitor.data.SettingsManager.isDebugModeEnabled.setValue(Boolean.valueOf(v0_26));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_28 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_28 != null) {
                        v1_0 = v0_28.getBoolean("app_access_unlocked", 0);
                    }
                    com.lele.llmonitor.data.SettingsManager.isAppAccessUnlocked.setValue(Boolean.valueOf(v1_0));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_30 = com.lele.llmonitor.data.SettingsManager.prefs;
                    long v6_6 = 1000;
                    if (v0_30 != null) {
                        v6_6 = v0_30.getLong("rate_ui_charging", 1000);
                    }
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_33;
                    com.lele.llmonitor.data.SettingsManager.refreshRateUiCharging.setValue(Long.valueOf(v6_6));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_32 = com.lele.llmonitor.data.SettingsManager.prefs;
                    long v6_7 = 3000;
                    if (v0_32 == null) {
                        v0_33 = 3000;
                    } else {
                        v0_33 = v0_32.getLong("rate_notify_charging", 3000);
                    }
                    com.lele.llmonitor.data.SettingsManager.refreshRateNotifyCharging.setValue(Long.valueOf(v0_33));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_35 = com.lele.llmonitor.data.SettingsManager.prefs;
                    long v8_1 = 10000;
                    if (v0_35 != null) {
                        v8_1 = v0_35.getLong("rate_notify_charging_screen_off", 10000);
                    }
                    com.lele.llmonitor.data.SettingsManager.refreshRateNotifyChargingScreenOff.setValue(Long.valueOf(v8_1));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_37 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_37 != null) {
                        v6_7 = v0_37.getLong("rate_ui_not_charging", 3000);
                    }
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_41;
                    com.lele.llmonitor.data.SettingsManager.refreshRateUiNotCharging.setValue(Long.valueOf(v6_7));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_40 = com.lele.llmonitor.data.SettingsManager.prefs;
                    long v6_8 = 180000;
                    if (v0_40 == null) {
                        v0_41 = 180000;
                    } else {
                        v0_41 = v0_40.getLong("rate_notify_not_charging", 180000);
                    }
                    com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotCharging.setValue(Long.valueOf(v0_41));
                    com.lele.llmonitor.data.SettingsManager$init$1 v0_43 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v0_43 != null) {
                        v6_8 = v0_43.getLong("rate_notify_not_charging_screen_off", 180000);
                    }
                    com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotChargingScreenOff.setValue(Long.valueOf(v6_8));
                    android.content.SharedPreferences$Editor v10_22 = com.lele.llmonitor.data.SettingsManager.prefs;
                    if (v10_22 == null) {
                        h.g("Required value was null.");
                        return;
                    } else {
                        if ((!v10_22.contains("follow_system_app_icon_mode")) && (((Number) com.lele.llmonitor.data.SettingsManager.themeMode.getValue()).intValue() == 0)) {
                            android.content.SharedPreferences$Editor v10_29;
                            if (!com.lele.llmonitor.data.UiAppearanceSupportKt.isSystemDarkModeEnabled(p11)) {
                                v10_29 = com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT;
                            } else {
                                v10_29 = com.lele.llmonitor.data.FollowSystemAppIconMode.DARK;
                            }
                            com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode.setValue(v10_29);
                            android.content.SharedPreferences$Editor v1_8 = com.lele.llmonitor.data.SettingsManager.prefs;
                            if (v1_8 != null) {
                                android.content.SharedPreferences$Editor v1_9 = v1_8.edit();
                                if (v1_9 != null) {
                                    android.content.SharedPreferences$Editor v10_31 = v1_9.putInt("follow_system_app_icon_mode", v10_29.getPreferenceValue());
                                    if (v10_31 != null) {
                                        v10_31.apply();
                                    }
                                }
                            }
                        }
                        com.lele.llmonitor.data.SettingsManager$init$1 v0_46 = com.lele.llmonitor.data.SettingsManager.prefs;
                        if (v0_46 == null) {
                            h.g("Required value was null.");
                            return;
                        } else {
                            com.lele.llmonitor.data.SettingsManager.launchAppearanceSnapshot.setValue(com.lele.llmonitor.data.LaunchAppearanceSnapshotKt.readLaunchAppearanceSnapshot(v0_46));
                            com.lele.llmonitor.data.AppLocaleSupportKt.applySupportedAppLocale(p11, ((com.lele.llmonitor.data.AppLanguageOption) com.lele.llmonitor.data.SettingsManager.appLanguageOption.getValue()));
                            if (com.lele.llmonitor.data.AppLocaleSupportKt.resolveSupportedSystemLanguageOption() != com.lele.llmonitor.data.AppLanguageOption.CHINESE_SIMPLIFIED_CHINA) {
                                com.lele.llmonitor.data.SettingsManager.isAppAccessUnlocked.setValue(Boolean.TRUE);
                                android.content.SharedPreferences$Editor v10_38 = com.lele.llmonitor.data.SettingsManager.prefs;
                                if (v10_38 != null) {
                                    android.content.SharedPreferences$Editor v10_39 = v10_38.edit();
                                    if (v10_39 != null) {
                                        android.content.SharedPreferences$Editor v10_40 = v10_39.putBoolean("app_access_unlocked", 1);
                                        if (v10_40 != null) {
                                            v10_40.apply();
                                        }
                                    }
                                }
                            }
                            com.lele.llmonitor.data.UiAppearanceSupportKt.applyAppNightMode(((Number) com.lele.llmonitor.data.SettingsManager.themeMode.getValue()).intValue());
                            xt3.I(com.lele.llmonitor.data.SettingsManager.backgroundScope, 0, 0, new com.lele.llmonitor.data.SettingsManager$init$1(p11, 0), 3);
                            return;
                        }
                    }
                }
            }
        }
        return;
    }

    public final l52 isAppAccessUnlocked()
    {
        return com.lele.llmonitor.data.SettingsManager.isAppAccessUnlocked;
    }

    public final l52 isBatteryOptimizationDismissed()
    {
        return com.lele.llmonitor.data.SettingsManager.isBatteryOptimizationDismissed;
    }

    public final l52 isDebugModeEnabled()
    {
        return com.lele.llmonitor.data.SettingsManager.isDebugModeEnabled;
    }

    public final l52 isDoubleCell()
    {
        return com.lele.llmonitor.data.SettingsManager.isDoubleCell;
    }

    public final boolean isIgnoringBatteryOptimizations(android.content.Context p1)
    {
        p1.getClass();
        boolean v0_1 = p1.getSystemService("power");
        v0_1.getClass();
        return ((android.os.PowerManager) v0_1).isIgnoringBatteryOptimizations(p1.getPackageName());
    }

    public final l52 isInvertCurrent()
    {
        return com.lele.llmonitor.data.SettingsManager.isInvertCurrent;
    }

    public final l52 isLiveCloseActionEnabled()
    {
        return com.lele.llmonitor.data.SettingsManager.isLiveCloseActionEnabled;
    }

    public final l52 isLiveNotificationEnabled()
    {
        return com.lele.llmonitor.data.SettingsManager.isLiveNotificationEnabled;
    }

    public final l52 isNotificationEnabled()
    {
        return com.lele.llmonitor.data.SettingsManager.isNotificationEnabled;
    }

    public final l52 isNotificationPermissionDismissed()
    {
        return com.lele.llmonitor.data.SettingsManager.isNotificationPermissionDismissed;
    }

    public final l52 isShowNotificationWhenNotCharging()
    {
        return com.lele.llmonitor.data.SettingsManager.isShowNotificationWhenNotCharging;
    }

    public final l52 isVirtualVoltageEnabled()
    {
        return com.lele.llmonitor.data.SettingsManager.isVirtualVoltageEnabled;
    }

    public final l52 isVirtualVoltageSuggestionDismissed()
    {
        return com.lele.llmonitor.data.SettingsManager.isVirtualVoltageSuggestionDismissed;
    }

    public final boolean isVirtualVoltageSuggestionDismissedToday()
    {
        int v4_0 = com.lele.llmonitor.data.SettingsManager.prefs;
        long v0 = -9223372036854775808;
        if (v4_0 != 0) {
            v0 = v4_0.getLong("dismiss_virtual_voltage_until", -9223372036854775808);
        }
        if (v0 != java.time.LocalDate.now().toEpochDay()) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void refreshLaunchAppearanceSnapshot()
    {
        tf3 v0_0 = com.lele.llmonitor.data.SettingsManager.appContext;
        if (v0_0 != null) {
            android.content.SharedPreferences v13 = com.lele.llmonitor.data.SettingsManager.prefs;
            if (v13 != null) {
                int v1_3 = com.lele.llmonitor.data.HomeWallpaperStorage.INSTANCE.resolveWallpaperFile(v0_0);
                if ((!v1_3.exists()) || (v1_3.length() <= 0)) {
                    v1_3 = 0;
                }
                long v6;
                if (v1_3 == 0) {
                    v6 = 0;
                } else {
                    int v1_4 = v1_3.lastModified();
                    if (v1_4 < 0) {
                        v1_4 = 0;
                    }
                    v6 = v1_4;
                }
                int v2_2 = 0;
                if ((v13.getBoolean("home_wallpaper_enabled", 0)) && (v6 > 0)) {
                    v2_2 = 1;
                }
                int v1_13;
                float v3_4 = v2_2;
                float v4_3 = ib1.k(v13.getFloat("home_wallpaper_alpha", 1051931443), 0, 1065353216);
                long v5_7 = ib1.k(v13.getFloat("home_wallpaper_blur", 0), 0, 1065353216);
                bd0 v15_2 = v0_0.getResources().getDisplayMetrics().density;
                int v2_9 = com.lele.llmonitor.data.LaunchAppearanceSnapshotKt.buildLaunchAppearanceSnapshot$default(v0_0, ((Number) com.lele.llmonitor.data.SettingsManager.themeMode.getValue()).intValue(), ((com.lele.llmonitor.ui.theme.ThemePalettePreset) com.lele.llmonitor.data.SettingsManager.themePalettePreset.getValue()), v3_4, v4_3, v5_7, v6, 0, 0, 384, 0);
                if (v3_4 == 0) {
                    v1_13 = "";
                } else {
                    v1_13 = com.lele.llmonitor.data.HomeWallpaperBlurSupportKt.resolveHomeWallpaperStartupPreviewRenderSpec(v2_9.getBackgroundArgb(), v4_3, v5_7, v15_2);
                }
                String v31 = v1_13;
                long v8_6 = (com.lele.llmonitor.data.SettingsManager.launchSnapshotRefreshGeneration + 1);
                com.lele.llmonitor.data.SettingsManager.launchSnapshotRefreshGeneration = v8_6;
                int v1_0 = com.lele.llmonitor.data.LaunchAppearanceSnapshot.copy$default(v2_9, 0, 0, 0, 0, 0, 0, 0, 0, v31, 127, 0);
                com.lele.llmonitor.data.SettingsManager.launchAppearanceSnapshot.setValue(v1_0);
                com.lele.llmonitor.data.LaunchAppearanceSnapshotKt.persistLaunchAppearanceSnapshot(v13, v1_0);
                if ((v3_4 != 0) && (v6 > 0)) {
                    float v3_1 = com.lele.llmonitor.data.SettingsManager.launchSnapshotRefreshJob;
                    if (v3_1 != 0) {
                        v3_1.k(0);
                    }
                    com.lele.llmonitor.data.SettingsManager.launchSnapshotRefreshJob = xt3.I(com.lele.llmonitor.data.SettingsManager.backgroundScope, bd0.f, 0, new com.lele.llmonitor.data.SettingsManager$refreshLaunchAppearanceSnapshot$1(v0_0, v2_9, v4_3, v5_7, v8_6, v1_0, v6, v13, 0), 2);
                }
            }
        }
        return;
    }

    public final void requestIgnoreBatteryOptimizations(android.content.Context p4)
    {
        p4.getClass();
        try {
            android.content.Intent v0_1 = new android.content.Intent();
            v0_1.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            String v1_1 = p4.getPackageName();
            StringBuilder v2_1 = new StringBuilder("package:");
            v2_1.append(v1_1);
            v0_1.setData(android.net.Uri.parse(v2_1.toString()));
            v0_1.addFlags(268435456);
            p4.startActivity(v0_1);
            return;
        } catch (Exception v3_4) {
            v3_4.printStackTrace();
            return;
        }
    }

    public final com.lele.llmonitor.data.LaunchAppearanceSnapshot resolveLaunchAppearanceSnapshot()
    {
        com.lele.llmonitor.data.LaunchAppearanceSnapshot v1_0 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_0 != null) {
            l52 v0_3 = ((com.lele.llmonitor.data.LaunchAppearanceSnapshot) com.lele.llmonitor.data.SettingsManager.launchAppearanceSnapshot.getValue());
            if (v0_3 != null) {
                return v0_3;
            } else {
                com.lele.llmonitor.data.LaunchAppearanceSnapshot v1_2 = com.lele.llmonitor.data.LaunchAppearanceSnapshotKt.readLaunchAppearanceSnapshot(v1_0);
                if (v1_2 != null) {
                    com.lele.llmonitor.data.SettingsManager.launchAppearanceSnapshot.setValue(v1_2);
                    return v1_2;
                }
            }
        }
        return 0;
    }

    public final void sendForceUpdateBroadcast(android.content.Context p2)
    {
        p2.getClass();
        android.content.Intent v1_0 = new android.content.Intent;
        v1_0("com.lele.llmonitor.ACTION_FORCE_UPDATE");
        android.content.Intent v1_1 = v1_0.setPackage(p2.getPackageName());
        v1_1.getClass();
        p2.sendBroadcast(v1_1);
        return;
    }

    public final void setAppAccessUnlocked(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isAppAccessUnlocked.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("app_access_unlocked", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setAppLanguageOption(com.lele.llmonitor.data.AppLanguageOption p3, s01 p4)
    {
        p3.getClass();
        com.lele.llmonitor.data.SettingsManager.appLanguageOption.setValue(p3);
        android.content.SharedPreferences$Editor v2_3 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v2_3 != null) {
            android.content.SharedPreferences$Editor v2_4 = v2_3.edit();
            if (v2_4 != null) {
                android.content.SharedPreferences$Editor v2_1 = v2_4.putString("app_language_option", p3.getPreferenceValue());
                if (v2_1 != null) {
                    v2_1.commit();
                }
            }
        }
        android.content.SharedPreferences$Editor v2_2 = com.lele.llmonitor.data.SettingsManager.appContext;
        if (v2_2 != null) {
            com.lele.llmonitor.data.AppLocaleSupportKt.applySupportedAppLocale(v2_2, p3);
        }
        if (p4 != null) {
            p4.invoke();
        }
        return;
    }

    public final void setBatteryOptimizationDismissed(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isBatteryOptimizationDismissed.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("dismiss_battery_opt", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setFollowSystemAppIconMode(com.lele.llmonitor.data.FollowSystemAppIconMode p4, s01 p5)
    {
        p4.getClass();
        com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode.setValue(p4);
        android.content.SharedPreferences$Editor v0_6 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v0_6 != null) {
            android.content.SharedPreferences$Editor v0_7 = v0_6.edit();
            if (v0_7 != null) {
                android.content.SharedPreferences$Editor v0_1 = v0_7.putInt("follow_system_app_icon_mode", p4.getPreferenceValue());
                if (v0_1 != null) {
                    v0_1.commit();
                }
            }
        }
        this.syncAppIcon(Boolean.valueOf(com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(((Number) com.lele.llmonitor.data.SettingsManager.themeMode.getValue()).intValue(), p4)));
        if (p5 != null) {
            p5.invoke();
        }
        return;
    }

    public final void setHomeCardOpacity(float p2)
    {
        android.content.SharedPreferences$Editor v1_1 = this.normalizeHomeCardOpacity(p2);
        com.lele.llmonitor.data.SettingsManager.homeCardOpacity.setValue(Float.valueOf(v1_1));
        android.content.SharedPreferences$Editor v2_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v2_2 != null) {
            android.content.SharedPreferences$Editor v2_3 = v2_2.edit();
            if (v2_3 != null) {
                android.content.SharedPreferences$Editor v1_2 = v2_3.putFloat("home_card_opacity", v1_1);
                if (v1_2 != null) {
                    v1_2.apply();
                }
            }
        }
        return;
    }

    public final void setNotificationPermissionDismissed(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isNotificationPermissionDismissed.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("dismiss_notification_perm", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setRefreshRateNotifyCharging(long p2)
    {
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyCharging.setValue(Long.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putLong("rate_notify_charging", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setRefreshRateNotifyChargingScreenOff(long p2)
    {
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyChargingScreenOff.setValue(Long.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putLong("rate_notify_charging_screen_off", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setRefreshRateNotifyNotCharging(long p2)
    {
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotCharging.setValue(Long.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putLong("rate_notify_not_charging", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setRefreshRateNotifyNotChargingScreenOff(long p2)
    {
        com.lele.llmonitor.data.SettingsManager.refreshRateNotifyNotChargingScreenOff.setValue(Long.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putLong("rate_notify_not_charging_screen_off", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setRefreshRateUiCharging(long p2)
    {
        com.lele.llmonitor.data.SettingsManager.refreshRateUiCharging.setValue(Long.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putLong("rate_ui_charging", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setRefreshRateUiNotCharging(long p2)
    {
        com.lele.llmonitor.data.SettingsManager.refreshRateUiNotCharging.setValue(Long.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putLong("rate_ui_not_charging", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setThemeMode(int p5, s01 p6)
    {
        Boolean v5_1 = ib1.l(p5, 0, 2);
        com.lele.llmonitor.data.FollowSystemAppIconMode v0_1 = com.lele.llmonitor.data.UiAppearanceSupportKt.resolveFollowSystemAppIconModeForThemeModeChange(((Number) com.lele.llmonitor.data.SettingsManager.themeMode.getValue()).intValue(), ((com.lele.llmonitor.data.FollowSystemAppIconMode) com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode.getValue()), v5_1);
        com.lele.llmonitor.data.SettingsManager.themeMode.setValue(Integer.valueOf(v5_1));
        if (v5_1 == null) {
            com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode.setValue(v0_1);
        }
        android.content.SharedPreferences$Editor v1_6 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_6 != null) {
            android.content.SharedPreferences$Editor v1_7 = v1_6.edit();
            if (v1_7 != null) {
                v1_7.putInt("theme_mode", v5_1);
                if (v5_1 == null) {
                    v1_7.putInt("follow_system_app_icon_mode", v0_1.getPreferenceValue());
                }
                v1_7.commit();
            }
        }
        com.lele.llmonitor.data.UiAppearanceSupportKt.applyAppNightMode(v5_1);
        this.syncAppIcon(Boolean.valueOf(com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(v5_1, v0_1)));
        this.refreshLaunchAppearanceSnapshot();
        if (p6 != null) {
            p6.invoke();
        }
        return;
    }

    public final void setThemePalettePreset(com.lele.llmonitor.ui.theme.ThemePalettePreset p3, s01 p4)
    {
        p3.getClass();
        com.lele.llmonitor.data.SettingsManager.themePalettePreset.setValue(p3);
        int v0_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v0_2 != 0) {
            int v0_3 = v0_2.edit();
            if (v0_3 != 0) {
                android.content.SharedPreferences$Editor v3_2 = v0_3.putString("theme_palette_preset", p3.getPreferenceValue());
                if (v3_2 != null) {
                    v3_2.commit();
                }
            }
        }
        com.lele.llmonitor.data.SettingsManager.syncAppIcon$default(this, 0, 1, 0);
        this.refreshLaunchAppearanceSnapshot();
        if (p4 != null) {
            p4.invoke();
        }
        return;
    }

    public final void setVirtualVoltageSuggestionDismissed(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isVirtualVoltageSuggestionDismissed.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("dismiss_virtual_voltage", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void setVirtualVoltageSuggestionDismissedUntilToday(boolean p3)
    {
        android.content.SharedPreferences$Editor v2_0 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v2_0 != null) {
            android.content.SharedPreferences$Editor v2_2 = v2_0.edit();
            if (v2_2 != null) {
                long v0;
                if (p3 == null) {
                    v0 = -9223372036854775808;
                } else {
                    v0 = java.time.LocalDate.now().toEpochDay();
                }
                android.content.SharedPreferences$Editor v2_1 = v2_2.putLong("dismiss_virtual_voltage_until", v0);
                if (v2_1 != null) {
                    v2_1.apply();
                }
            }
        }
        return;
    }

    public final void syncAppIcon(Boolean p8)
    {
        android.content.Context v1 = com.lele.llmonitor.data.SettingsManager.appContext;
        if (v1 != null) {
            if (p8 == 0) {
                com.lele.llmonitor.data.AppIconPaletteManager.INSTANCE.sync(v1, ((Number) com.lele.llmonitor.data.SettingsManager.themeMode.getValue()).intValue(), ((com.lele.llmonitor.ui.theme.ThemePalettePreset) com.lele.llmonitor.data.SettingsManager.themePalettePreset.getValue()), ((com.lele.llmonitor.data.FollowSystemAppIconMode) com.lele.llmonitor.data.SettingsManager.followSystemAppIconMode.getValue()));
                return;
            } else {
                com.lele.llmonitor.data.AppIconPaletteManager.sync$default(com.lele.llmonitor.data.AppIconPaletteManager.INSTANCE, v1, p8.booleanValue(), ((com.lele.llmonitor.ui.theme.ThemePalettePreset) com.lele.llmonitor.data.SettingsManager.themePalettePreset.getValue()), 0, 8, 0);
                return;
            }
        } else {
            return;
        }
    }

    public final void toggleDebugModeEnabled(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isDebugModeEnabled.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("debug_mode_enabled", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleDoubleCell(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isDoubleCell.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("double_cell", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleInvertCurrent(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isInvertCurrent.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("invert_current", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleLiveCloseActionEnabled(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isLiveCloseActionEnabled.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("live_close_action_enabled", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleLiveNotificationEnabled(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isLiveNotificationEnabled.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("live_notification_enabled", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleNotificationEnabled(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isNotificationEnabled.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("notification_enabled", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleShowNotificationBatteryLevel(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.showNotificationBatteryLevel.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("notification_content_battery_level", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleShowNotificationCurrent(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.showNotificationCurrent.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("notification_content_current", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleShowNotificationSupply(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.showNotificationSupply.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("notification_content_supply", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleShowNotificationTemperature(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.showNotificationTemperature.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("notification_content_temperature", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleShowNotificationVoltage(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.showNotificationVoltage.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("notification_content_voltage", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleShowNotificationWhenNotCharging(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isShowNotificationWhenNotCharging.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("show_notification_not_charging", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }

    public final void toggleVirtualVoltageEnabled(boolean p2)
    {
        com.lele.llmonitor.data.SettingsManager.isVirtualVoltageEnabled.setValue(Boolean.valueOf(p2));
        android.content.SharedPreferences$Editor v1_2 = com.lele.llmonitor.data.SettingsManager.prefs;
        if (v1_2 != null) {
            android.content.SharedPreferences$Editor v1_3 = v1_2.edit();
            if (v1_3 != null) {
                android.content.SharedPreferences$Editor v1_1 = v1_3.putBoolean("virtual_voltage_enabled", p2);
                if (v1_1 != null) {
                    v1_1.apply();
                }
            }
        }
        return;
    }
}
