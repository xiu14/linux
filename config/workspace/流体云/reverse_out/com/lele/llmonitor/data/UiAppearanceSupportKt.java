package com.lele.llmonitor.data;
public final class UiAppearanceSupportKt {
    public static final int DEFAULT_THEME_MODE = 2;
    public static final String FOLLOW_SYSTEM_APP_ICON_MODE_KEY = "follow_system_app_icon_mode";

    public static final void applyAppNightMode(int p2)
    {
        String v2_1 = com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppCompatNightMode(p2);
        if ((v2_1 == -1) || ((v2_1 == null) || ((v2_1 == 1) || ((v2_1 == 2) || (v2_1 == 3))))) {
            if (jf.a == v2_1) {
                return;
            } else {
                jf.a = v2_1;
                ClassCastException v0_2 = jf.c;
                v0_2.getClass();
                ph v1_1 = new ph(v0_2);
                while (v1_1.hasNext()) {
                    if (((ref.WeakReference) v1_1.next()).get() != null) {
                        throw new ClassCastException();
                    } else {
                    }
                }
                return;
            }
        } else {
            android.util.Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
    }

    public static final boolean isSystemDarkModeEnabled(android.content.Context p1)
    {
        p1.getClass();
        if ((p1.getResources().getConfiguration().uiMode & 48) != 32) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final int resolveAppCompatNightMode(int p1)
    {
        int v0 = 1;
        if (p1 != 1) {
            v0 = 2;
            if (p1 != 2) {
                return -1;
            }
        }
        return v0;
    }

    public static final boolean resolveAppIconDarkModeEnabled(int p3, com.lele.llmonitor.data.FollowSystemAppIconMode p4)
    {
        p4.getClass();
        if (p3 == 1) {
            return 0;
        } else {
            if (p3 == 2) {
                return 1;
            } else {
                if (p4 != com.lele.llmonitor.data.FollowSystemAppIconMode.DARK) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }

    public static final com.lele.llmonitor.data.FollowSystemAppIconMode resolveFollowSystemAppIconModeForThemeModeChange(int p0, com.lele.llmonitor.data.FollowSystemAppIconMode p1, int p2)
    {
        p1.getClass();
        if (p2 == 0) {
            if (p0 != 2) {
                if (p0 == 1) {
                    return com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT;
                }
            } else {
                return com.lele.llmonitor.data.FollowSystemAppIconMode.DARK;
            }
        }
        return p1;
    }

    public static final com.lele.llmonitor.data.FollowSystemAppIconMode resolveStoredFollowSystemAppIconMode(android.content.SharedPreferences p2, boolean p3)
    {
        p2.getClass();
        if (!p2.contains("follow_system_app_icon_mode")) {
            if (p3 == null) {
                return com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT;
            } else {
                return com.lele.llmonitor.data.FollowSystemAppIconMode.DARK;
            }
        } else {
            com.lele.llmonitor.data.FollowSystemAppIconMode$Companion v3_1 = com.lele.llmonitor.data.FollowSystemAppIconMode.Companion;
            return v3_1.fromPreferenceValue(Integer.valueOf(p2.getInt("follow_system_app_icon_mode", v3_1.getDefault().getPreferenceValue())));
        }
    }

    public static final boolean shouldCloseTaskAfterThemeModeChange(int p1, com.lele.llmonitor.data.FollowSystemAppIconMode p2, int p3)
    {
        p2.getClass();
        if (com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(p1, p2) == com.lele.llmonitor.data.UiAppearanceSupportKt.resolveAppIconDarkModeEnabled(p3, com.lele.llmonitor.data.UiAppearanceSupportKt.resolveFollowSystemAppIconModeForThemeModeChange(p1, p2, p3))) {
            return 0;
        } else {
            return 1;
        }
    }
}
